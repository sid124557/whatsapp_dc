package X;

import java.util.Arrays;

/* renamed from: X.2no  reason: invalid class name and case insensitive filesystem */
public final class C53872no {
    public byte[] A00 = null;
    public byte[] A01 = null;
    public final String A02;
    public final String A03;
    public final byte[] A04;
    public final byte[] A05;
    public final byte[] A06;
    public final byte[] A07;

    public C53872no(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        C18260x0.A0f(bArr, bArr2, str, str2, bArr3);
        C162457s7.A0J(bArr4, 6);
        this.A06 = bArr;
        this.A07 = bArr2;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = bArr3;
        this.A05 = bArr4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53872no) {
                C53872no r5 = (C53872no) obj;
                if (!C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A07, r5.A07) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A05, r5.A05) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int A072 = (((AnonymousClass0x2.A07(this.A02, AnonymousClass0x2.A07(this.A03, ((Arrays.hashCode(this.A06) * 31) + Arrays.hashCode(this.A07)) * 31)) + Arrays.hashCode(this.A04)) * 31) + Arrays.hashCode(this.A05)) * 31;
        byte[] bArr = this.A00;
        int i = 0;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        int i2 = (A072 + hashCode) * 31;
        byte[] bArr2 = this.A01;
        if (bArr2 != null) {
            i = Arrays.hashCode(bArr2);
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostPurposeEncryptionParams(serverPublicEK=");
        C18280x3.A1J(A0o, this.A06);
        A0o.append(", serverPublicIK=");
        C18280x3.A1J(A0o, this.A07);
        A0o.append(", serverPublicIKSignature=");
        A0o.append(this.A03);
        A0o.append(", serverPublicIKCertificate=");
        A0o.append(this.A02);
        A0o.append(", dummyCiphertext=");
        C18280x3.A1J(A0o, this.A04);
        A0o.append(", dummyNonce=");
        C18280x3.A1J(A0o, this.A05);
        A0o.append(", clientPrivateKey=");
        C18280x3.A1J(A0o, this.A00);
        A0o.append(", clientPublicKey=");
        return C18260x0.A07(Arrays.toString(this.A01), A0o);
    }
}
