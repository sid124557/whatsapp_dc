package X;

import java.util.List;

/* renamed from: X.5Si  reason: invalid class name and case insensitive filesystem */
public final class C104785Si {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C104785Si(String str, String str2, String str3, List list, long j) {
        C162457s7.A0J(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
        this.A04 = list;
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104785Si) {
                C104785Si r8 = (C104785Si) obj;
                if (!C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A01, r8.A01) || this.A00 != r8.A00 || !C162457s7.A0P(this.A04, r8.A04) || !C162457s7.A0P(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A04, AnonymousClass000.A00((C18310x6.A09(this.A02) + C18270x1.A00(this.A01)) * 31, this.A00)) + AnonymousClass0x7.A07(this.A03);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Post(id=");
        A0o.append(this.A02);
        A0o.append(", caption=");
        A0o.append(this.A01);
        A0o.append(", creationTime=");
        A0o.append(this.A00);
        A0o.append(", images=");
        A0o.append(this.A04);
        A0o.append(", postUrl=");
        return C18260x0.A07(this.A03, A0o);
    }
}
