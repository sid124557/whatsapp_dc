package X;

/* renamed from: X.1Tj  reason: invalid class name and case insensitive filesystem */
public final class C23471Tj extends C47712dh {
    public final AnonymousClass2UW A00;
    public final C51662kB A01;
    public final String A02;

    public C23471Tj(AnonymousClass2UW r2, C51662kB r3, String str) {
        C162457s7.A0J(str, 1);
        this.A02 = str;
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23471Tj) {
                C23471Tj r5 = (C23471Tj) obj;
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

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ShapeSticker(id=");
        A0o.append(this.A02);
        A0o.append(", shape=");
        A0o.append(this.A01);
        A0o.append(", section=");
        return C18260x0.A04(this.A00, A0o);
    }
}
