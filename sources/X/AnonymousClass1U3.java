package X;

import java.util.List;

/* renamed from: X.1U3  reason: invalid class name */
public final class AnonymousClass1U3 extends AnonymousClass26X {
    public final C382026d A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public AnonymousClass1U3(C382026d r2, List list, List list2, List list3) {
        C162457s7.A0J(r2, 4);
        this.A01 = list;
        this.A02 = list2;
        this.A03 = list3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1U3) {
                AnonymousClass1U3 r5 = (AnonymousClass1U3) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass000.A08(this.A03, ((AnonymousClass000.A07(this.A01) * 31) + C18310x6.A07(this.A02)) * 31));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Data(recentStickers=");
        A0o.append(this.A01);
        A0o.append(", starredStickers=");
        A0o.append(this.A02);
        A0o.append(", stickerPacks=");
        A0o.append(this.A03);
        A0o.append(", contentStickers=");
        return C18260x0.A04(this.A00, A0o);
    }
}
