package X;

/* renamed from: X.86N  reason: invalid class name */
public final class AnonymousClass86N implements C183858qm {
    public final int A00;
    public final AnonymousClass7BF A01 = new AnonymousClass7BF();
    public final C161727qK A02;

    public final long A00(C187648xa r18) {
        C187648xa r8;
        long length;
        long j;
        int BgZ;
        while (true) {
            r8 = r18;
            long BBF = r8.BBF();
            length = r8.getLength();
            j = length - 6;
            if (BBF >= j) {
                break;
            }
            C161727qK r11 = this.A02;
            int i = this.A00;
            AnonymousClass7BF r9 = this.A01;
            byte[] bArr = new byte[2];
            r8.Bgd(bArr, 0, 2);
            if (AnonymousClass6CA.A0C(bArr, 1, AnonymousClass6C9.A0F(bArr, 0)) == i) {
                C161467pi A05 = C161467pi.A05(16);
                System.arraycopy(bArr, 0, A05.A02, 0, 2);
                byte[] bArr2 = A05.A02;
                int i2 = 0;
                do {
                    BgZ = r8.BgZ(bArr2, i2 + 2, 14 - i2);
                    if (BgZ == -1 || (i2 = i2 + BgZ) >= 14) {
                        A05.A0R(i2);
                        r8.Bjy();
                        r8.Awu((int) (BBF - r8.BBW()));
                    }
                    BgZ = r8.BgZ(bArr2, i2 + 2, 14 - i2);
                    break;
                } while ((i2 = i2 + BgZ) >= 14);
                A05.A0R(i2);
                r8.Bjy();
                r8.Awu((int) (BBF - r8.BBW()));
                if (C153997cP.A01(r9, r11, A05, i)) {
                    break;
                }
            } else {
                r8.Bjy();
                r8.Awu((int) (BBF - r8.BBW()));
            }
            r8.Awu(1);
        }
        long BBF2 = r8.BBF();
        if (BBF2 < j) {
            return this.A01.A00;
        }
        r8.Awu((int) (length - BBF2));
        return this.A02.A09;
    }

    public /* synthetic */ void Bb3() {
    }

    public AnonymousClass86N(C161727qK r2, int i) {
        this.A02 = r2;
        this.A00 = i;
    }

    public C156517gl Bkt(C187648xa r15, long j) {
        long BBW = r15.BBW();
        long A002 = A00(r15);
        long BBF = r15.BBF();
        r15.Awu(Math.max(6, this.A02.A06));
        long A003 = A00(r15);
        long BBF2 = r15.BBF();
        if (A002 <= j && A003 > j) {
            return new C156517gl(0, -9223372036854775807L, BBF);
        }
        if (A003 <= j) {
            return new C156517gl(-2, A003, BBF2);
        }
        return new C156517gl(-1, A002, BBW);
    }
}
