package X;

import com.whatsapp.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3XA  reason: invalid class name */
public class AnonymousClass3XA implements C84134Bd {
    public final AnonymousClass3XB A00 = AnonymousClass3XB.A00();
    public final AnonymousClass3XB A01 = AnonymousClass3XB.A00();
    public final AtomicBoolean A02 = C18280x3.A0l();

    public static void A01(AnonymousClass3XA r1, Object obj, int i) {
        r1.A03(new C86234Ji(obj, i));
    }

    public void A02() {
        this.A01.A02();
        this.A00.A02();
        if (!this.A02.get()) {
            Log.w("asyncfuture/unsubscribe called before completion, possibly not intended", new Throwable());
        }
    }

    public final void A03(C84134Bd r3) {
        this.A01.A04(r3, (Executor) null);
    }

    public final void A04(C84134Bd r2, Executor executor) {
        this.A01.A04(r2, executor);
    }

    public final void A05(Object obj) {
        if (this.A02.compareAndSet(false, true)) {
            this.A01.A05(obj);
        }
    }

    public final void A06(Throwable th) {
        if (this.A02.compareAndSet(false, true)) {
            this.A00.A05(th);
        }
    }

    public final void AwB(Object obj) {
        A05(obj);
    }
}
