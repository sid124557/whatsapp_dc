package X;

import java.util.concurrent.Future;

/* renamed from: X.3e9  reason: invalid class name and case insensitive filesystem */
public final class C72703e9 implements AnonymousClass4C7 {
    public final Future A00;

    public void dispose() {
        this.A00.cancel(false);
    }

    public C72703e9(Future future) {
        this.A00 = future;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DisposableFutureHandle[");
        A0o.append(this.A00);
        return AnonymousClass0x2.A0f(A0o);
    }
}
