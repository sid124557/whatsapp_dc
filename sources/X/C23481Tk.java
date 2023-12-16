package X;

/* renamed from: X.1Tk  reason: invalid class name and case insensitive filesystem */
public final class C23481Tk extends C47712dh {
    public final AnonymousClass2UW A00;
    public final AnonymousClass39M A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23481Tk) {
                C23481Tk r5 = (C23481Tk) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass000.A08(this.A01, C18310x6.A09(this.A02)));
    }

    public C23481Tk(AnonymousClass2UW r1, AnonymousClass39M r2, String str) {
        C18260x0.A0R(str, r1);
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StickerLocal(id=");
        A0o.append(this.A02);
        A0o.append(", sticker=");
        A0o.append(this.A01);
        A0o.append(", section=");
        return C18260x0.A04(this.A00, A0o);
    }
}
