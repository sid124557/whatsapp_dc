package X;

/* renamed from: X.6pK  reason: invalid class name and case insensitive filesystem */
public final class C137826pK extends AnonymousClass7V0 {
    public final int A00;
    public final String A01;
    public final String A02;

    public C137826pK(int i, String str, String str2) {
        C162457s7.A0J(str2, 3);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C137826pK) {
                C137826pK r5 = (C137826pK) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A02, AnonymousClass0x2.A07(this.A01, this.A00 * 31));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarStickerHeaderTextItem(index=");
        A0o.append(this.A00);
        A0o.append(", pageId=");
        A0o.append(this.A01);
        A0o.append(", title=");
        return C18260x0.A07(this.A02, A0o);
    }
}
