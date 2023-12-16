package X;

/* renamed from: X.6hG  reason: invalid class name and case insensitive filesystem */
public final class C133386hG extends C147177Dc {
    public final C624134x A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C133386hG) && C162457s7.A0P(this.A00, ((C133386hG) obj).A00));
    }

    public C133386hG(C624134x r2) {
        super(C142126wg.DECRYPTION_FAILURE);
        this.A00 = r2;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DecryptionFailureItem(comment=");
        return C18260x0.A04(this.A00, A0o);
    }
}
