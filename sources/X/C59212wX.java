package X;

import java.util.HashMap;

/* renamed from: X.2wX  reason: invalid class name and case insensitive filesystem */
public class C59212wX {
    public static final int[][] A01;
    public static final int[][] A02;
    public static final int[][] A03;
    public static final int[][] A04;
    public HashMap A00;

    public final void A00(int[][] iArr, int i) {
        int i2;
        for (int[] r0 : iArr) {
            C106655Zv r2 = new C106655Zv(r0);
            HashMap hashMap = this.A00;
            if (hashMap.containsKey(r2)) {
                i2 = AnonymousClass001.A0K(hashMap.get(r2));
            } else {
                i2 = 0;
            }
            AnonymousClass0x2.A1I(r2, hashMap, i2 | i);
        }
    }

    static {
        int[][] iArr = new int[31][];
        int[] A1U = AnonymousClass0x9.A1U(AnonymousClass0x9.A1T(new int[1], iArr, 10084, 0, 1), iArr, 128525, 0, 1);
        A1U[0] = 128536;
        iArr[2] = A1U;
        iArr[3] = new int[]{128149};
        iArr[4] = new int[]{128571};
        iArr[5] = new int[]{128145};
        iArr[6] = new int[]{128105, 8205, 10084, 8205, 128105};
        iArr[7] = new int[]{128104, 8205, 10084, 8205, 128104};
        iArr[8] = new int[]{128143};
        iArr[9] = new int[]{128105, 8205, 10084, 8205, 128139, 8205, 128105};
        iArr[10] = new int[]{128104, 8205, 10084, 8205, 128139, 8205, 128104};
        iArr[11] = new int[]{10084};
        iArr[12] = new int[]{129505};
        iArr[13] = new int[]{128155};
        iArr[14] = new int[]{128154};
        iArr[15] = new int[]{128153};
        iArr[16] = new int[]{128156};
        iArr[17] = new int[]{128420};
        iArr[18] = new int[]{128148};
        iArr[19] = new int[]{10083};
        iArr[20] = new int[]{128149};
        iArr[21] = new int[]{128158};
        iArr[22] = new int[]{128147};
        iArr[23] = new int[]{128151};
        iArr[24] = new int[]{128150};
        iArr[25] = new int[]{128152};
        iArr[26] = new int[]{128157};
        iArr[27] = new int[]{128159};
        iArr[28] = new int[]{9829};
        iArr[29] = new int[]{128140};
        iArr[30] = new int[]{128139};
        A02 = iArr;
        int[][] iArr2 = new int[13][];
        int[] A1U2 = AnonymousClass0x9.A1U(AnonymousClass0x9.A1T(new int[1], iArr2, 128559, 0, 1), iArr2, 128550, 0, 1);
        A1U2[0] = 128551;
        iArr2[2] = A1U2;
        iArr2[3] = new int[]{128558};
        iArr2[4] = new int[]{128562};
        iArr2[5] = new int[]{128576};
        iArr2[6] = new int[]{128561};
        iArr2[7] = new int[]{129327};
        iArr2[8] = new int[]{128563};
        iArr2[9] = new int[]{128576};
        iArr2[10] = new int[]{10071};
        iArr2[11] = new int[]{10069};
        iArr2[12] = new int[]{129325};
        A04 = iArr2;
        int[][] iArr3 = new int[21][];
        int[] A1U3 = AnonymousClass0x9.A1U(AnonymousClass0x9.A1T(new int[1], iArr3, 9785, 0, 1), iArr3, 128547, 0, 1);
        A1U3[0] = 128534;
        iArr3[2] = A1U3;
        iArr3[3] = new int[]{128555};
        iArr3[4] = new int[]{128553};
        iArr3[5] = new int[]{128546};
        iArr3[6] = new int[]{128557};
        iArr3[7] = new int[]{128542};
        iArr3[8] = new int[]{128532};
        iArr3[9] = new int[]{128543};
        iArr3[10] = new int[]{128533};
        iArr3[11] = new int[]{128548};
        iArr3[12] = new int[]{128544};
        iArr3[13] = new int[]{128549};
        iArr3[14] = new int[]{128560};
        iArr3[15] = new int[]{128552};
        iArr3[16] = new int[]{128575};
        iArr3[17] = new int[]{128574};
        iArr3[18] = new int[]{128531};
        iArr3[19] = new int[]{128589, 8205, 9794};
        iArr3[20] = new int[]{128589, 8205, 9792};
        A03 = iArr3;
        int[][] iArr4 = new int[18][];
        iArr4[4] = AnonymousClass0x7.A1Z(iArr4);
        iArr4[5] = new int[]{128517};
        iArr4[6] = new int[]{128514};
        iArr4[7] = new int[]{129315};
        iArr4[8] = new int[]{128578};
        iArr4[9] = new int[]{128539};
        iArr4[10] = new int[]{128541};
        iArr4[11] = new int[]{128540};
        iArr4[12] = new int[]{129322};
        iArr4[13] = new int[]{129303};
        iArr4[14] = new int[]{128570};
        iArr4[15] = new int[]{128568};
        iArr4[16] = new int[]{128569};
        iArr4[17] = new int[]{9786};
        A01 = iArr4;
    }

    public C59212wX() {
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            this.A00 = AnonymousClass001.A0t();
        } else {
            hashMap.clear();
        }
        A00(A01, 1);
        A00(A04, 8);
        A00(A03, 4);
        A00(A02, 2);
    }
}
