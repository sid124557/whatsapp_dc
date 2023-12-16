package X;

/* renamed from: X.9KN  reason: invalid class name */
public class AnonymousClass9KN extends Exception {
    public final Exception innerException;

    public String toString() {
        return this.innerException.toString();
    }

    public AnonymousClass9KN(Exception exc) {
        this.innerException = exc;
    }
}
