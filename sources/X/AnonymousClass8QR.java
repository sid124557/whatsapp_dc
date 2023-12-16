package X;

/* renamed from: X.8QR  reason: invalid class name */
public class AnonymousClass8QR implements C185978uY {
    public final C173438Qe A00;

    public int B24(byte[] bArr, int i) {
        try {
            return this.A00.B24(bArr, i);
        } catch (C177188eD e) {
            throw AnonymousClass001.A0e(e.toString());
        }
    }

    public int B9H() {
        return 16;
    }

    public void BFu(C834748n r7) {
        if (r7 instanceof AnonymousClass8QP) {
            AnonymousClass8QP r72 = (AnonymousClass8QP) r7;
            this.A00.BFw(new AnonymousClass8QK((AnonymousClass8QN) r72.A00, r72.A01, (byte[]) null, 128), true);
            return;
        }
        throw AnonymousClass001.A0c("GMAC requires ParametersWithIV");
    }

    public void BrT(byte b) {
        C173438Qe r4 = this.A00;
        r4.A06();
        byte[] bArr = r4.A0H;
        int i = r4.A00;
        bArr[i] = b;
        int i2 = i + 1;
        r4.A00 = i2;
        if (i2 == 16) {
            byte[] bArr2 = r4.A0F;
            C1454275q.A00(bArr2, bArr);
            r4.A09.A00(bArr2);
            r4.A00 = 0;
            r4.A04 += 16;
        }
    }

    public void reset() {
        this.A00.A08(true);
    }

    public void update(byte[] bArr, int i, int i2) {
        this.A00.BhZ(bArr, i, i2);
    }

    public AnonymousClass8QR(C173438Qe r1) {
        this.A00 = r1;
    }
}
