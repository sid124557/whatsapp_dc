package X;

/* renamed from: X.1lh  reason: invalid class name and case insensitive filesystem */
public final class C30001lh extends AnonymousClass28N {
    public final AnonymousClass39M A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C30001lh) {
                C30001lh r5 = (C30001lh) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, C18310x6.A09(this.A01));
    }

    public C30001lh(AnonymousClass39M r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Remote(stableId=");
        A0o.append(this.A01);
        A0o.append(", sticker=");
        return C18260x0.A04(this.A00, A0o);
    }
}
