package X;

/* renamed from: X.6ep  reason: invalid class name and case insensitive filesystem */
public final class C132176ep extends C146937Ce {
    public final AnonymousClass5TF A00;

    public C132176ep(AnonymousClass5TF r2) {
        super(2);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C132176ep) && C162457s7.A0P(this.A00, ((C132176ep) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PromotionDisplayItem(promotion=");
        return C18260x0.A04(this.A00, A0o);
    }
}
