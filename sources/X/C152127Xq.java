package X;

/* renamed from: X.7Xq  reason: invalid class name and case insensitive filesystem */
public class C152127Xq {
    public final byte[] A00;

    public byte[] A01(byte[] bArr, byte[] bArr2, int i, long j) {
        try {
            C173438Qe A002 = A00(j, true);
            A002.BhZ(bArr, 0, bArr.length);
            int BAJ = A002.BAJ(i);
            byte[] bArr3 = new byte[BAJ];
            int Bhb = A002.Bhb(bArr2, 0, i, bArr3, 0);
            int B24 = Bhb + A002.B24(bArr3, Bhb);
            if (B24 >= BAJ) {
                return bArr3;
            }
            byte[] bArr4 = new byte[B24];
            System.arraycopy(bArr3, 0, bArr4, 0, B24);
            return bArr4;
        } catch (C177188eD e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public byte[] A02(byte[] bArr, byte[] bArr2, long j) {
        try {
            C173438Qe A002 = A00(j, false);
            A002.BhZ(bArr, 0, bArr.length);
            int length = bArr2.length;
            int BAJ = A002.BAJ(length);
            byte[] bArr3 = new byte[BAJ];
            int Bhb = A002.Bhb(bArr2, 0, length, bArr3, 0);
            int B24 = Bhb + A002.B24(bArr3, Bhb);
            if (B24 >= BAJ) {
                return bArr3;
            }
            byte[] bArr4 = new byte[B24];
            System.arraycopy(bArr3, 0, bArr4, 0, B24);
            return bArr4;
        } catch (C177188eD e) {
            throw new AnonymousClass24D(e, this);
        }
    }

    public final C173438Qe A00(long j, boolean z) {
        C173438Qe r3 = new C173438Qe(new AnonymousClass8QE());
        byte[] bArr = new byte[12];
        bArr[11] = (byte) ((int) j);
        AnonymousClass6C7.A0x(j, bArr, 8, 10);
        AnonymousClass6C7.A0x(j, bArr, 16, 9);
        AnonymousClass6C7.A0x(j, bArr, 24, 8);
        AnonymousClass6C7.A0x(j, bArr, 32, 7);
        AnonymousClass6C7.A0x(j, bArr, 40, 6);
        AnonymousClass6C7.A0x(j, bArr, 48, 5);
        AnonymousClass6C7.A0x(j, bArr, 56, 4);
        r3.BFw(new AnonymousClass8QP(new AnonymousClass8QN(this.A00), bArr), z);
        return r3;
    }

    public C152127Xq(byte[] bArr) {
        this.A00 = bArr;
    }
}
