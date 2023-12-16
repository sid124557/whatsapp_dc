package X;

import java.util.Arrays;

/* renamed from: X.2pg  reason: invalid class name and case insensitive filesystem */
public final class C55032pg {
    public final AnonymousClass1A4 A00;
    public final AnonymousClass3Z2 A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final byte[] A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C55032pg) {
                C55032pg r5 = (C55032pg) obj;
                if (!(C162457s7.A0P(this.A00, r5.A00) && this.A05 == r5.A05 && this.A04 == r5.A04 && this.A03 == r5.A03 && C162457s7.A0P(this.A01, r5.A01) && C162457s7.A0P(this.A09, r5.A09) && this.A07 == r5.A07 && this.A02 == r5.A02 && this.A06 == r5.A06 && this.A08 == r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass1EF A00(C59542x5 r1, C55032pg r2, AnonymousClass3Z2 r3, C624134x r4, byte[] bArr) {
        return r1.A02(r3, r4, bArr, r2.A03);
    }

    public static void A01(C55032pg r4, AnonymousClass3OJ r5, C207119a r6, C624134x r7) {
        AnonymousClass3Z2 r3 = r4.A01;
        byte[] bArr = r4.A09;
        if (C59542x5.A01(r3, r7, bArr)) {
            r6.A09(r5.A02.A02(r3, r7, bArr, r4.A03));
        }
    }

    public final boolean A02() {
        if (this.A04 || this.A05) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int A012 = (AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(C18300x5.A04(this.A00), this.A05), this.A04), this.A03) + AnonymousClass000.A07(this.A01)) * 31;
        byte[] bArr = this.A09;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01((A012 + i) * 31, this.A07), this.A02), this.A06), this.A08);
    }

    public C55032pg(AnonymousClass1A4 r1, AnonymousClass3Z2 r2, byte[] bArr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A00 = r1;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A01 = r2;
        this.A09 = bArr;
        this.A07 = z4;
        this.A02 = z5;
        this.A06 = z6;
        this.A08 = z7;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BuildE2EMessageParams(e2eMessageBuilder=");
        A0o.append(this.A00);
        A0o.append(", isQuoted=");
        A0o.append(this.A05);
        A0o.append(", isHistorySync=");
        A0o.append(this.A04);
        A0o.append(", ignoreThumbnail=");
        A0o.append(this.A03);
        A0o.append(", ephemeralInfo=");
        A0o.append(this.A01);
        A0o.append(", ephemeralSharedSecret=");
        C18280x3.A1J(A0o, this.A09);
        A0o.append(", isSpamReport=");
        A0o.append(this.A07);
        A0o.append(", abortOnError=");
        A0o.append(this.A02);
        A0o.append(", isRegularLidGroup=");
        A0o.append(this.A06);
        A0o.append(", skipCommentFlagProcessing=");
        return C18260x0.A0A(A0o, this.A08);
    }
}
