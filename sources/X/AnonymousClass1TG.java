package X;

/* renamed from: X.1TG  reason: invalid class name */
public final class AnonymousClass1TG extends AnonymousClass26S {
    public final int A00;
    public final AnonymousClass39M A01;
    public final Integer A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1TG) {
                AnonymousClass1TG r5 = (AnonymousClass1TG) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A07(this.A01) * 31) + C18310x6.A07(this.A02)) * 31) + this.A00;
    }

    public AnonymousClass1TG(AnonymousClass39M r1, Integer num, int i) {
        this.A01 = r1;
        this.A02 = num;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("OnStickerSelected(sticker=");
        A0o.append(this.A01);
        A0o.append(", stickerSendOrigin=");
        A0o.append(this.A02);
        A0o.append(", position=");
        return C18260x0.A09(A0o, this.A00);
    }
}
