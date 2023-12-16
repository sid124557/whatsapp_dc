package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.0fk  reason: invalid class name and case insensitive filesystem */
public class C09160fk implements C16180sb {
    public final Handler A00 = AnonymousClass000.A0A();
    public final C13700nb A01;
    public final Executor A02 = new C13680nZ(this);

    public /* synthetic */ void B2t(Runnable runnable) {
        this.A01.execute(runnable);
    }

    public C09160fk(Executor executor) {
        this.A01 = new C13700nb(executor);
    }
}
