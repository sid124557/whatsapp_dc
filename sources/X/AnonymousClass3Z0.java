package X;

import java.io.Serializable;

/* renamed from: X.3Z0  reason: invalid class name */
public final class AnonymousClass3Z0 implements Serializable {
    public final Throwable exception;

    public static Throwable A00(Throwable th) {
        return AnonymousClass3Z9.A00(new AnonymousClass3Z0(th));
    }

    public static AnonymousClass3Z0 A01(Throwable th) {
        return new AnonymousClass3Z0(th);
    }

    public static void A02(Throwable th, C84814Du r2) {
        r2.BkD(new AnonymousClass3Z0(th));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3Z0) || !C162457s7.A0P(this.exception, ((AnonymousClass3Z0) obj).exception)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.exception.hashCode();
    }

    public AnonymousClass3Z0(Throwable th) {
        this.exception = th;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Failure(");
        return C18260x0.A04(this.exception, A0o);
    }
}
