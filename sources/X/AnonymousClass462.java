package X;

import java.util.concurrent.Future;

/* renamed from: X.462  reason: invalid class name */
public final class AnonymousClass462 extends AnonymousClass467 {
    public final Future A00;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((Throwable) obj);
        return C59022wD.A00;
    }

    public AnonymousClass462(Future future) {
        this.A00 = future;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CancelFutureOnCancel[");
        A0o.append(this.A00);
        return AnonymousClass0x2.A0f(A0o);
    }
}
