package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.5tc  reason: invalid class name and case insensitive filesystem */
public final class C118485tc extends CancellationException {
    public final CancellationException original;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C118485tc) && C162457s7.A0P(this.original, ((C118485tc) obj).original));
    }

    public int hashCode() {
        return this.original.hashCode();
    }

    public C118485tc(CancellationException cancellationException) {
        this.original = cancellationException;
        initCause(cancellationException);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("InitializationCancellationFailedException(original=");
        return C18260x0.A04(this.original, A0o);
    }
}
