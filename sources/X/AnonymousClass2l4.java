package X;

import java.util.List;

/* renamed from: X.2l4  reason: invalid class name */
public final class AnonymousClass2l4 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public AnonymousClass2l4(String str, List list, boolean z) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
        this.A01 = list;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2l4) {
                AnonymousClass2l4 r5 = (AnonymousClass2l4) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass000.A08(this.A01, C18310x6.A09(this.A00)), this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Section(section=");
        A0o.append(this.A00);
        A0o.append(", bots=");
        A0o.append(this.A01);
        A0o.append(", large=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
