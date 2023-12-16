package X;

/* renamed from: X.1vL  reason: invalid class name and case insensitive filesystem */
public final class C34551vL extends C73263fC {
    public final int errorCode;
    public final String errorMessage;

    public C34551vL(int i) {
        this.errorCode = i;
        this.errorMessage = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C34551vL) {
                C34551vL r5 = (C34551vL) obj;
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
        A0o.append("CrosspostGenericError(errorCode=");
        A0o.append(this.errorCode);
        A0o.append(", errorMessage=");
        return C18260x0.A07(this.errorMessage, A0o);
    }

    public C34551vL() {
        this(-1);
    }
}
