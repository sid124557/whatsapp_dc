package X;

import android.os.Handler;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.0UA  reason: invalid class name */
public class AnonymousClass0UA {
    public static Executor A04 = Executors.newCachedThreadPool();
    public final Handler A00 = AnonymousClass000.A0A();
    public final Set A01 = new LinkedHashSet(1);
    public final Set A02 = new LinkedHashSet(1);
    public volatile C05510Tu A03 = null;

    public synchronized void A00(C16200sd r2) {
        if (!(this.A03 == null || this.A03.A01 == null)) {
            r2.onResult(this.A03.A01);
        }
        this.A01.add(r2);
    }

    public synchronized void A01(C16200sd r2) {
        if (!(this.A03 == null || this.A03.A00 == null)) {
            r2.onResult(this.A03.A00);
        }
        this.A02.add(r2);
    }

    public final void A02(C05510Tu r3) {
        if (this.A03 == null) {
            this.A03 = r3;
            this.A00.post(new C11180jE(this));
            return;
        }
        throw AnonymousClass001.A0e("A task may only be set once.");
    }

    public AnonymousClass0UA(Callable callable, boolean z) {
        if (z) {
            try {
                A02((C05510Tu) callable.call());
            } catch (Throwable th) {
                A02(new C05510Tu(th));
            }
        } else {
            A04.execute(new C13980o3(this, callable));
        }
    }
}
