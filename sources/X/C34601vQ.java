package X;

/* renamed from: X.1vQ  reason: invalid class name and case insensitive filesystem */
public final class C34601vQ extends C34621vS {
    public final String errorMessage;

    public C34601vQ(String str) {
        this.errorMessage = null;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C34601vQ) && C162457s7.A0P(this.errorMessage, ((C34601vQ) obj).errorMessage));
    }

    public int hashCode() {
        return C18270x1.A00(this.errorMessage);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EligibilityPurposeEncryptionValidationError(errorMessage=");
        return C18260x0.A07(this.errorMessage, A0o);
    }

    public C34601vQ() {
        this((String) null);
    }
}
