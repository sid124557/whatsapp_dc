package X;

/* renamed from: X.2nQ  reason: invalid class name and case insensitive filesystem */
public final class C53642nQ {
    public final int A00;
    public final long A01;
    public final AnonymousClass223 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53642nQ) {
                C53642nQ r8 = (C53642nQ) obj;
                if (this.A01 != r8.A01 || !C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A06, r8.A06) || !C162457s7.A0P(this.A05, r8.A05) || !C162457s7.A0P(this.A04, r8.A04) || this.A00 != r8.A00 || this.A02 != r8.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, (((((((((AnonymousClass0x2.A02(this.A01) + C18270x1.A00(this.A03)) * 31) + C18270x1.A00(this.A06)) * 31) + C18270x1.A00(this.A05)) * 31) + AnonymousClass0x7.A07(this.A04)) * 31) + this.A00) * 31);
    }

    public C53642nQ(AnonymousClass223 r1, String str, String str2, String str3, String str4, int i, long j) {
        this.A01 = j;
        this.A03 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A00 = i;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StatusCrosspostingInfo(messageRowId=");
        A0o.append(this.A01);
        A0o.append(", crosspostingSessionId=");
        A0o.append(this.A03);
        A0o.append(", uniqueId=");
        A0o.append(this.A06);
        A0o.append(", mediaFilePath=");
        A0o.append(this.A05);
        A0o.append(", directUrlPath=");
        A0o.append(this.A04);
        A0o.append(", state=");
        A0o.append(this.A00);
        A0o.append(", destination=");
        return C18260x0.A04(this.A02, A0o);
    }
}
