package X;

import java.util.List;

/* renamed from: X.2l5  reason: invalid class name */
public final class AnonymousClass2l5 {
    public final String A00;
    public final String A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2l5) {
                AnonymousClass2l5 r5 = (AnonymousClass2l5) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass0x2.A07(this.A01, C18310x6.A09(this.A00)));
    }

    public AnonymousClass2l5(String str, String str2, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Section(name=");
        A0o.append(this.A00);
        A0o.append(", type=");
        A0o.append(this.A01);
        A0o.append(", bots=");
        return C18260x0.A04(this.A02, A0o);
    }
}
