package X;

/* renamed from: X.1vN  reason: invalid class name and case insensitive filesystem */
public final class C34571vN extends C34621vS {
    public final int errorCode;
    public final String errorMessage = null;

    public C34571vN(int i) {
        this.errorCode = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C34571vN) {
                C34571vN r5 = (C34571vN) obj;
                if (this.errorCode != r5.errorCode || !C162457s7.A0P(this.errorMessage, r5.errorMessage)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.errorCode * 31) + C18270x1.A00(this.errorMessage);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EligibilityGenericError(errorCode=");
        A0o.append(this.errorCode);
        A0o.append(", errorMessage=");
        return C18260x0.A07(this.errorMessage, A0o);
    }
}
