package X;

import java.util.List;

/* renamed from: X.2n1  reason: invalid class name and case insensitive filesystem */
public final class C53392n1 {
    public final C53772ne A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53392n1) {
                C53392n1 r5 = (C53392n1) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A05, AnonymousClass0x2.A07(this.A02, AnonymousClass000.A08(this.A00, AnonymousClass0x2.A07(this.A04, AnonymousClass0x2.A07(this.A03, C18310x6.A09(this.A01)))))) + 1231;
    }

    public C53392n1(C53772ne r1, String str, String str2, String str3, String str4, List list) {
        this.A01 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = r1;
        this.A02 = str4;
        this.A05 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NativeMask(identifier=");
        A0o.append("");
        A0o.append(", name=");
        A0o.append(this.A03);
        A0o.append(", requiredSdkVersion=");
        A0o.append(this.A04);
        A0o.append(", packagedFile=");
        A0o.append(this.A00);
        A0o.append(", manifestJson=");
        A0o.append(this.A02);
        A0o.append(", capabilitiesMinVersionModels=");
        A0o.append(this.A05);
        A0o.append(", isPersonalizedAvatar=");
        return C18260x0.A0A(A0o, true);
    }
}
