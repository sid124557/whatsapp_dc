package X;

/* renamed from: X.51b  reason: invalid class name and case insensitive filesystem */
public final class C984851b extends C100705By {
    public final C51042jB A00;
    public final AnonymousClass39M A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C984851b) {
                C984851b r5 = (C984851b) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public C984851b(C51042jB r1, AnonymousClass39M r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarSticker(stableId=");
        A0o.append(this.A00);
        A0o.append(", sticker=");
        return C18260x0.A04(this.A01, A0o);
    }
}
