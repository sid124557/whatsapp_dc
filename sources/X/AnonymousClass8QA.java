package X;

import java.util.Arrays;

/* renamed from: X.8QA  reason: invalid class name */
public class AnonymousClass8QA implements C185768uD {
    public int A00;
    public C185768uD A01;
    public boolean A02;
    public byte[] A03;
    public byte[] A04;
    public byte[] A05;

    public int B4g() {
        return this.A01.B4g();
    }

    public void BFw(C834748n r7, boolean z) {
        boolean z2 = this.A02;
        this.A02 = z;
        if (r7 instanceof AnonymousClass8QP) {
            AnonymousClass8QP r72 = (AnonymousClass8QP) r7;
            byte[] bArr = r72.A01;
            int length = bArr.length;
            if (length == this.A00) {
                System.arraycopy(bArr, 0, this.A03, 0, length);
                reset();
                r7 = r72.A00;
                if (r7 == null) {
                    if (z2 != z) {
                        throw AnonymousClass001.A0c("cannot change encrypting state without providing key.");
                    }
                    return;
                }
            } else {
                throw AnonymousClass001.A0c("initialisation vector must be the same length as block size");
            }
        } else {
            reset();
            if (r7 == null) {
                if (z2 != z) {
                    throw AnonymousClass001.A0c("cannot change encrypting state without providing key.");
                }
                return;
            }
        }
        this.A01.BFw(r7, z);
    }

    public int Bha(byte[] bArr, byte[] bArr2, int i, int i2) {
        boolean z = this.A02;
        int i3 = this.A00;
        if (z) {
            if (i3 + i <= bArr.length) {
                for (int i4 = 0; i4 < i3; i4++) {
                    byte[] bArr3 = this.A05;
                    AnonymousClass6C7.A1T(bArr, bArr3, i + i4, bArr3[i4], i4);
                }
                int Bha = this.A01.Bha(this.A05, bArr2, 0, i2);
                byte[] bArr4 = this.A05;
                System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
                return Bha;
            }
            throw C177248eJ.A01();
        } else if (i + i3 <= bArr.length) {
            System.arraycopy(bArr, i, this.A04, 0, i3);
            int Bha2 = this.A01.Bha(bArr, bArr2, i, i2);
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = i2 + i5;
                AnonymousClass6C7.A1T(this.A05, bArr2, i5, bArr2[i6], i6);
            }
            byte[] bArr5 = this.A05;
            this.A05 = this.A04;
            this.A04 = bArr5;
            return Bha2;
        } else {
            throw C177248eJ.A01();
        }
    }

    public void reset() {
        byte[] bArr = this.A03;
        System.arraycopy(bArr, 0, this.A05, 0, bArr.length);
        Arrays.fill(this.A04, (byte) 0);
        this.A01.reset();
    }

    public AnonymousClass8QA(C185768uD r3) {
        this.A01 = r3;
        int B4g = r3.B4g();
        this.A00 = B4g;
        this.A03 = new byte[B4g];
        this.A05 = new byte[B4g];
        this.A04 = new byte[B4g];
    }

    public String B4N() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C9.A1A(A0o, this.A01);
        return AnonymousClass000.A0X("/CBC", A0o);
    }
}
