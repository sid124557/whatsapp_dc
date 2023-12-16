package X;

import java.util.Locale;

/* renamed from: X.2qb  reason: invalid class name and case insensitive filesystem */
public class C55592qb {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public byte[] A0A;
    public byte[] A0B;
    public transient boolean A0C;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C55592qb)) {
            return false;
        }
        C55592qb r7 = (C55592qb) obj;
        return AnonymousClass75J.A00(r7.A04, this.A04) && AnonymousClass75J.A00(r7.A0A, this.A0A) && AnonymousClass75J.A00(r7.A05, this.A05) && AnonymousClass75J.A00(r7.A08, this.A08) && AnonymousClass75J.A00(r7.A0B, this.A0B) && AnonymousClass75J.A00(r7.A07, this.A07) && AnonymousClass75J.A00(r7.A06, this.A06) && r7.A02 == this.A02 && r7.A01 == this.A01 && r7.A00 == this.A00;
    }

    public C55592qb A00() {
        C55592qb r2 = new C55592qb();
        r2.A04 = this.A04;
        r2.A0A = this.A0A;
        r2.A02 = this.A02;
        r2.A05 = this.A05;
        r2.A08 = this.A08;
        r2.A09 = false;
        r2.A01 = this.A01;
        r2.A00 = this.A00;
        r2.A0B = this.A0B;
        r2.A03 = this.A03;
        r2.A07 = this.A07;
        r2.A06 = this.A06;
        return r2;
    }

    public boolean A01() {
        if (this.A0A == null || this.A04 == null || this.A08 == null || this.A05 == null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[10];
        objArr[0] = this.A04;
        objArr[1] = this.A0A;
        objArr[2] = this.A05;
        objArr[3] = this.A08;
        objArr[4] = this.A0B;
        C18320x8.A1R(objArr, this.A02);
        C18290x4.A1U(objArr, this.A01);
        C18310x6.A1V(objArr, this.A00);
        objArr[8] = this.A07;
        return C18310x6.A08(this.A06, objArr, 9);
    }

    public String toString() {
        int i;
        Locale locale = Locale.US;
        Object[] objArr = new Object[12];
        int i2 = 0;
        objArr[0] = this.A04;
        byte[] bArr = this.A0A;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        AnonymousClass000.A1M(objArr, i);
        AnonymousClass0x2.A1U(objArr, this.A02);
        objArr[3] = this.A05;
        objArr[4] = this.A08;
        C18310x6.A1U(objArr, this.A01);
        C18290x4.A1U(objArr, this.A00);
        objArr[7] = Boolean.valueOf(this.A09);
        byte[] bArr2 = this.A0B;
        if (bArr2 != null) {
            i2 = bArr2.length;
        }
        objArr[8] = Integer.valueOf(i2);
        objArr[9] = Boolean.valueOf(this.A0C);
        objArr[10] = this.A07;
        objArr[11] = this.A06;
        return String.format(locale, "MmsThumbnailMetadata{directPath=%s, mediaKey.length=%d, mediaKeyTimestampMs=%d, encThumbHash=%s, thumbHash=%s, thumbWidth=%d, thumbHeight=%d, transferred=%b, microThumbnail.length=%d, shouldSendOriginalThumbnail=%b, localFileName=%s, handle=%s}", objArr);
    }
}
