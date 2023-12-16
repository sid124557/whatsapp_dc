package X;

import java.util.Arrays;

/* renamed from: X.8eP  reason: invalid class name and case insensitive filesystem */
public class C177308eP extends AnonymousClass8QG implements C180088kT {
    public int A00 = 0;
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
        return this.A05.B4g();
    }

    public void BFw(C834748n r6, boolean z) {
        if (r6 instanceof AnonymousClass8QP) {
            AnonymousClass8QP r62 = (AnonymousClass8QP) r6;
            byte[] A022 = C161007oo.A02(r62.A01);
            this.A01 = A022;
            int i = this.A04;
            int length = A022.length;
            if (i >= length) {
                int i2 = i / 2;
                int i3 = 8;
                if (8 > i2) {
                    i3 = i2;
                }
                if (i - length <= i3) {
                    C834748n r2 = r62.A00;
                    if (r2 != null) {
                        this.A05.BFw(r2, true);
                    }
                    reset();
                    return;
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass6C8.A1D("CTR/SIC mode requires IV of at least: ", A0o, i, i3);
                throw AnonymousClass000.A0F(" bytes.", A0o);
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("CTR/SIC mode requires IV no greater than: ");
            A0o2.append(i);
            throw AnonymousClass000.A0F(" bytes.", A0o2);
        }
        throw AnonymousClass001.A0c("CTR/SIC mode requires ParametersWithIV");
    }

    public void reset() {
        byte[] bArr = this.A02;
        Arrays.fill(bArr, (byte) 0);
        byte[] bArr2 = this.A01;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.A05.reset();
        this.A00 = 0;
    }

    public C177308eP(C185768uD r3) {
        super(r3);
        this.A05 = r3;
        int B4g = r3.B4g();
        this.A04 = B4g;
        this.A01 = new byte[B4g];
        this.A02 = new byte[B4g];
        this.A03 = new byte[B4g];
    }

    public String B4N() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C9.A1A(A0o, this.A05);
        return AnonymousClass000.A0X("/SIC", A0o);
    }
}
