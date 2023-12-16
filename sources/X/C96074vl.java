package X;

import java.io.IOException;

/* renamed from: X.4vl  reason: invalid class name and case insensitive filesystem */
public final class C96074vl extends AnonymousClass59Y {
    public final IOException throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C96074vl) && C162457s7.A0P(this.throwable, ((C96074vl) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public C96074vl(IOException iOException) {
        this.throwable = iOException;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ModelIOError(throwable=");
        return C18260x0.A04(this.throwable, A0o);
    }
}
