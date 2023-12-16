package X;

import java.util.Arrays;

/* renamed from: X.7UY  reason: invalid class name */
public class AnonymousClass7UY {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;
    public final byte[] A08;
    public final byte[] A09;

    public AnonymousClass7UY(String str, String str2, String str3, String str4, String str5, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A08 = bArr;
        this.A07 = bArr2;
        this.A09 = bArr3;
        this.A02 = str4;
        this.A04 = str5;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamsysMMSDownloadRequest{mediaType=");
        A0o.append(this.A01);
        A0o.append(", downloadMode=");
        A0o.append(this.A00);
        A0o.append(", transferOption=");
        A0o.append(7);
        A0o.append(", temporaryFilePath='");
        char A012 = C18300x5.A01(this.A06, A0o);
        A0o.append(", outputFilePath='");
        A0o.append(this.A05);
        A0o.append(A012);
        A0o.append(", directPath='");
        A0o.append(this.A03);
        A0o.append(A012);
        A0o.append(", hashIdentifier=");
        A0o.append(Arrays.toString(this.A07));
        A0o.append(", plaintextHashIdentifier=");
        A0o.append(Arrays.toString(this.A09));
        A0o.append(", connBlockJSONStr='");
        A0o.append(this.A02);
        A0o.append(A012);
        A0o.append(", loggingIdentifier='");
        A0o.append(this.A04);
        A0o.append(A012);
        return AnonymousClass000.A0d(A0o);
    }
}
