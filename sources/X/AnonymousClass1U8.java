package X;

import java.util.List;

/* renamed from: X.1U8  reason: invalid class name */
public final class AnonymousClass1U8 extends C381826a {
    public final String A00;
    public final List A01;
    public final List A02;

    public AnonymousClass1U8(String str, List list, List list2) {
        C162457s7.A0J(list2, 2);
        this.A02 = list;
        this.A01 = list2;
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1U8) {
                AnonymousClass1U8 r5 = (AnonymousClass1U8) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A01, C18300x5.A04(this.A02)) + C18270x1.A00(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StickerPacks(stickerPacks=");
        A0o.append(this.A02);
        A0o.append(", stickerGridItems=");
        A0o.append(this.A01);
        A0o.append(", moveToSelectedSectionId=");
        return C18260x0.A07(this.A00, A0o);
    }
}
