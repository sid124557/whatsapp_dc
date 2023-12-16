package X;

/* renamed from: X.2iv  reason: invalid class name and case insensitive filesystem */
public final class C50882iv {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C50882iv) && this.A00 == ((C50882iv) obj).A00);
    }

    public C50882iv(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BizBotMetadata(automatedType=");
        return C18260x0.A09(A0o, this.A00);
    }
}
