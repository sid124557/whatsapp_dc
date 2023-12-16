package X;

/* renamed from: X.24J  reason: invalid class name */
public final class AnonymousClass24J extends Exception {
    public final int errorCode;

    public String getMessage() {
        return String.valueOf(this.errorCode);
    }

    public AnonymousClass24J(int i) {
        this.errorCode = i;
    }
}
