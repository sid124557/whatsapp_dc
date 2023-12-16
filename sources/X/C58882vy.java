package X;

import android.text.TextUtils;

/* renamed from: X.2vy  reason: invalid class name and case insensitive filesystem */
public class C58882vy {
    public final C43512Sk A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    public static C58882vy A00(C66513Ls r23, C55592qb r24, String str, String str2) {
        String str3;
        C43512Sk r8;
        byte[] bArr;
        C66513Ls r0 = r23;
        String str4 = r0.A0J;
        String str5 = r0.A0G;
        byte[] bArr2 = r0.A0V;
        String str6 = r0.A0D;
        if (r0.A02 == 1) {
            str3 = "video";
        } else {
            str3 = null;
        }
        C55592qb r2 = r24;
        if (r24 == null || TextUtils.isEmpty(r2.A04) || TextUtils.isEmpty(r2.A08) || TextUtils.isEmpty(r2.A05) || (bArr = r2.A0A) == null) {
            r8 = null;
        } else {
            String str7 = r2.A04;
            String str8 = r2.A08;
            String str9 = r2.A05;
            long j = r2.A02;
            int i = r2.A01;
            int i2 = i;
            byte[] bArr3 = bArr;
            String str10 = str9;
            String str11 = str8;
            String str12 = str7;
            r8 = new C43512Sk(str12, str11, str10, bArr3, i2, r2.A00, j);
        }
        return new C58882vy(r8, str, str4, str5, str6, str2, str3, bArr2);
    }

    public C58882vy(C43512Sk r1, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
        this.A06 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A07 = bArr;
        this.A01 = str4;
        this.A03 = str5;
        this.A04 = str6;
        this.A00 = r1;
    }
}
