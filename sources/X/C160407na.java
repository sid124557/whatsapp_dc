package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.7na  reason: invalid class name and case insensitive filesystem */
public class C160407na {
    public C160407na A00;
    public byte[] A01;
    public final String A02;

    public final int A02(C153727bq r4) {
        int i = 0;
        for (C160407na r1 = this; r1 != null; r1 = r1.A00) {
            r4.A02(r1.A02);
            i += r1.A01.length + 6;
        }
        return i;
    }

    public final void A03(C159077l4 r5, C153727bq r6) {
        for (C160407na r3 = this; r3 != null; r3 = r3.A00) {
            byte[] bArr = r3.A01;
            int length = bArr.length;
            C153727bq.A01(r3.A02, r5, r6);
            r5.A03(length);
            r5.A0A(bArr, 0, length);
        }
    }

    public static int A00(C153727bq r2, int i, int i2) {
        int i3;
        if ((i & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0 || r2.A03 >= 49) {
            i3 = 0;
        } else {
            r2.A02("Synthetic");
            i3 = 6;
        }
        if (i2 != 0) {
            r2.A02("Signature");
            i3 += 8;
        }
        if ((i & AnonymousClass35S.A0F) == 0) {
            return i3;
        }
        r2.A02("Deprecated");
        return i3 + 6;
    }

    public static void A01(C159077l4 r3, C153727bq r4, int i, int i2) {
        if ((i & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0 && r4.A03 < 49) {
            C153727bq.A01("Synthetic", r3, r4);
            r3.A03(0);
        }
        if (i2 != 0) {
            C153727bq.A01("Signature", r3, r4);
            r3.A03(2);
            r3.A04(i2);
        }
        if ((i & AnonymousClass35S.A0F) != 0) {
            C153727bq.A01("Deprecated", r3, r4);
            r3.A03(0);
        }
    }

    public C160407na(String str) {
        this.A02 = str;
    }
}
