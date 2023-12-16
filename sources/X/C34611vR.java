package X;

/* renamed from: X.1vR  reason: invalid class name and case insensitive filesystem */
public final class C34611vR extends C34621vS {
    public final String errorMessage;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C34611vR) && C162457s7.A0P(this.errorMessage, ((C34611vR) obj).errorMessage));
    }

    public int hashCode() {
        return C18270x1.A00(this.errorMessage);
    }

    public C34611vR(String str) {
        this.errorMessage = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EligibilitySessionDataValidationError(errorMessage=");
        return C18260x0.A07(this.errorMessage, A0o);
    }

    public C34611vR() {
        this((String) null);
    }
}
