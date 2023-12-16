package X;

import android.os.HandlerThread;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.6q5  reason: invalid class name and case insensitive filesystem */
public class C138296q5 extends C54732pC {
    public final C151237Ty A00;
    public final C147437Eh A01 = new C147437Eh(this);
    public final WeakHashMap A02 = new WeakHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138296q5(HandlerThread handlerThread, C54842pN r4, Executor executor) {
        super(r4, executor, 2);
        C151237Ty r1 = new C151237Ty(handlerThread);
        this.A00 = r1;
    }

    public void A00(Runnable runnable) {
        WeakHashMap weakHashMap = this.A02;
        synchronized (weakHashMap) {
            weakHashMap.remove(runnable);
        }
    }

    public final boolean A03() {
        int i;
        C151237Ty r1 = this.A00;
        synchronized (r1) {
            i = r1.A00;
        }
        return AnonymousClass001.A1T(i);
    }

    public void A01(Runnable runnable) {
        if (A03()) {
            C151237Ty r3 = this.A00;
            synchronized (r3) {
                if (A03()) {
                    r3.A00(this.A01, 600000);
                }
            }
        }
    }
}
