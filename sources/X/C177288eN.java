package X;

/* renamed from: X.8eN  reason: invalid class name and case insensitive filesystem */
public class C177288eN extends AnonymousClass8QG {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03 = true;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public final int A07;
    public final C185768uD A08;

    public void BFw(C834748n r7, boolean z) {
        this.A03 = true;
        this.A00 = 0;
        this.A01 = 0;
        if (r7 instanceof AnonymousClass8QP) {
            AnonymousClass8QP r72 = (AnonymousClass8QP) r7;
            byte[] bArr = r72.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A04;
            int length2 = bArr2.length;
            if (length < length2) {
                int i = length2 - length;
                System.arraycopy(bArr, 0, bArr2, i, length);
                for (int i2 = 0; i2 < i; i2++) {
                    bArr2[i2] = 0;
                }
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
            reset();
            r7 = r72.A00;
        } else {
            reset();
        }
        if (r7 != null) {
            this.A08.BFw(r7, true);
        }
    }

    public int Bha(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = this.A07;
        A01(bArr, bArr2, i, i3, i2);
        return i3;
    }

    public void reset() {
        this.A03 = true;
        this.A00 = 0;
        this.A01 = 0;
        byte[] bArr = this.A04;
        System.arraycopy(bArr, 0, this.A06, 0, bArr.length);
        this.A02 = 0;
        this.A08.reset();
    }

    public int B4g() {
        return this.A07;
    }

    public C177288eN(C185768uD r3) {
        super(r3);
        this.A08 = r3;
        int B4g = r3.B4g();
        this.A07 = B4g;
        if (B4g == 8) {
            int B4g2 = r3.B4g();
            this.A04 = new byte[B4g2];
            this.A06 = new byte[B4g2];
            this.A05 = new byte[B4g2];
            return;
        }
        throw AnonymousClass001.A0c("GCTR only for 64 bit block ciphers");
    }

    public String B4N() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C9.A1A(A0o, this.A08);
        return AnonymousClass000.A0X("/GCTR", A0o);
    }
}
