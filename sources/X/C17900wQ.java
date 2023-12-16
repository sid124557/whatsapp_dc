package X;

import android.os.Binder;
import android.os.Process;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: X.0wQ  reason: invalid class name and case insensitive filesystem */
public class C17900wQ implements Callable {
    public Object A00;
    public final int A01;

    public C17900wQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public Object call() {
        switch (this.A01) {
            case 0:
                C13330n0 r4 = (C13330n0) this.A00;
                r4.A04.set(true);
                Object obj = null;
                try {
                    Process.setThreadPriority(10);
                    obj = r4.A06.A06();
                } catch (C13860nr e) {
                    if (!r4.A03.get()) {
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        r4.A03.set(true);
                        throw th;
                    } catch (Throwable th2) {
                        r4.A00(obj);
                        throw th2;
                    }
                }
                Binder.flushPendingCommands();
                r4.A00(obj);
                return obj;
            case 1:
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator A0v = AnonymousClass001.A0v(((ShortcutInfoCompatSaverImpl) this.A00).A04);
                while (A0v.hasNext()) {
                    A0s.add(new C05920Vm(((C03740Lj) A0v.next()).A00).A00());
                }
                return A0s;
            case 2:
                return Integer.valueOf(AnonymousClass0J2.A00(((AnonymousClass0OB) this.A00).A00, "next_alarm_manager_id"));
            default:
                return new C05510Tu(this.A00);
        }
    }
}
