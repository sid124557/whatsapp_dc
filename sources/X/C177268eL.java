package X;

/* renamed from: X.8eL  reason: invalid class name and case insensitive filesystem */
public class C177268eL extends AnonymousClass8QG {
    public int A00;
    public byte[] A01;
    public byte[] A02;
    public byte[] A03;
    public final int A04;
    public final C185768uD A05;

    public int Bha(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = this.A04;
        A01(bArr, bArr2, i, i3, i2);
        return i3;
    }

    public int B4g() {
        return this.A04;
    }

    public void BFw(C834748n r7, boolean z) {
        if (r7 instanceof AnonymousClass8QP) {
            AnonymousClass8QP r72 = (AnonymousClass8QP) r7;
            byte[] bArr = r72.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A01;
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
            this.A05.BFw(r7, true);
        }
    }

    public void reset() {
        byte[] bArr = this.A01;
        System.arraycopy(bArr, 0, this.A03, 0, bArr.length);
        this.A00 = 0;
        this.A05.reset();
    }

    public C177268eL(C185768uD r3, int i) {
        super(r3);
        if (i > r3.B4g() * 8 || i < 8 || i % 8 != 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("0FB");
            A0o.append(i);
            throw AnonymousClass000.A0F(" not supported", A0o);
        }
        this.A05 = r3;
        this.A04 = i / 8;
        int B4g = r3.B4g();
        this.A01 = new byte[B4g];
        this.A03 = new byte[B4g];
        this.A02 = new byte[B4g];
    }

    public String B4N() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C9.A1A(A0o, this.A05);
        A0o.append("/OFB");
        return AnonymousClass000.A0h(A0o, this.A04 * 8);
    }
}
