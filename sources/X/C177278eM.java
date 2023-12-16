package X;

import java.util.Arrays;

/* renamed from: X.8eM  reason: invalid class name and case insensitive filesystem */
public class C177278eM extends AnonymousClass8QG {
    public int A00;
    public int A01;
    public C185768uD A02;
    public boolean A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;

    public int Bha(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = this.A00;
        A01(bArr, bArr2, i, i3, i2);
        return i3;
    }

    public int B4g() {
        return this.A00;
    }

    public void BFw(C834748n r7, boolean z) {
        this.A03 = z;
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
            this.A02.BFw(r7, true);
        }
    }

    public void reset() {
        byte[] bArr = this.A04;
        System.arraycopy(bArr, 0, this.A06, 0, bArr.length);
        Arrays.fill(this.A07, (byte) 0);
        this.A01 = 0;
        this.A02.reset();
    }

    public C177278eM(C185768uD r3, int i) {
        super(r3);
        if (i > r3.B4g() * 8 || i < 8 || i % 8 != 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CFB");
            A0o.append(i);
            throw AnonymousClass000.A0F(" not supported", A0o);
        }
        this.A02 = r3;
        int i2 = i / 8;
        this.A00 = i2;
        int B4g = r3.B4g();
        this.A04 = new byte[B4g];
        this.A06 = new byte[B4g];
        this.A05 = new byte[B4g];
        this.A07 = new byte[i2];
    }

    public String B4N() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C9.A1A(A0o, this.A02);
        A0o.append("/CFB");
        return AnonymousClass000.A0h(A0o, this.A00 * 8);
    }
}
