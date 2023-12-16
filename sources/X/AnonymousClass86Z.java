package X;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: X.86Z  reason: invalid class name */
public final class AnonymousClass86Z implements C185328tT {
    public static final int A0D;
    public static final byte[] A0E;
    public static final byte[] A0F;
    public static final int[] A0G = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public C187028wK A06;
    public C184868sg A07;
    public C185598tw A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final byte[] A0C;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0H = iArr;
        Charset charset = AnonymousClass79T.A05;
        A0E = "#!AMR\n".getBytes(charset);
        A0F = "#!AMR-WB\n".getBytes(charset);
        A0D = iArr[8];
    }

    public final boolean A00(C187648xa r6) {
        byte[] bArr = A0E;
        r6.Bjy();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        r6.Bgd(bArr2, 0, length);
        if (Arrays.equals(bArr2, bArr)) {
            this.A0B = false;
        } else {
            bArr = A0F;
            r6.Bjy();
            int length2 = bArr.length;
            byte[] bArr3 = new byte[length2];
            r6.Bgd(bArr3, 0, length2);
            if (!Arrays.equals(bArr3, bArr)) {
                return false;
            }
            this.A0B = true;
        }
        r6.BpP(bArr.length);
        return true;
    }

    public void BFs(C187028wK r3) {
        this.A06 = r3;
        this.A08 = r3.Br0(0, 1);
        r3.B2W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r1 != false) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BiD(X.C187648xa r10, X.AnonymousClass7BG r11) {
        /*
            r9 = this;
            X.8tw r0 = r9.A08
            X.C161487pm.A01(r0)
            long r3 = r10.BBW()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            boolean r0 = r9.A00(r10)
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "Could not find AMR header."
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x001c:
            boolean r0 = r9.A09
            if (r0 != 0) goto L_0x003e
            r4 = 1
            r9.A09 = r4
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "audio/amr-wb"
            r3 = 16000(0x3e80, float:2.2421E-41)
        L_0x002b:
            X.8tw r2 = r9.A08
            X.7he r1 = X.C157057he.A00()
            r1.A0R = r0
            int r0 = A0D
            r1.A08 = r0
            r1.A04 = r4
            r1.A0D = r3
            X.C166527yp.A01(r1, r2)
        L_0x003e:
            int r1 = r9.A00
            r2 = -1
            if (r1 != 0) goto L_0x00bc
            goto L_0x0049
        L_0x0044:
            java.lang.String r0 = "audio/3gpp"
            r3 = 8000(0x1f40, float:1.121E-41)
            goto L_0x002b
        L_0x0049:
            r10.Bjy()     // Catch:{ EOFException -> 0x00a9 }
            byte[] r3 = r9.A0C     // Catch:{ EOFException -> 0x00a9 }
            r1 = 1
            r0 = 0
            r10.Bgd(r3, r0, r1)     // Catch:{ EOFException -> 0x00a9 }
            byte r3 = r3[r0]     // Catch:{ EOFException -> 0x00a9 }
            r0 = r3 & 131(0x83, float:1.84E-43)
            if (r0 > 0) goto L_0x0082
            int r0 = r3 >> 3
            r3 = r0 & 15
            if (r3 < 0) goto L_0x008d
            r0 = 15
            if (r3 > r0) goto L_0x008d
            boolean r1 = r9.A0B     // Catch:{ EOFException -> 0x00a9 }
            if (r1 == 0) goto L_0x006e
            r0 = 10
            if (r3 < r0) goto L_0x0078
            r0 = 13
            goto L_0x0074
        L_0x006e:
            r0 = 12
            if (r3 < r0) goto L_0x007b
            r0 = 14
        L_0x0074:
            if (r3 <= r0) goto L_0x008d
            if (r1 == 0) goto L_0x007b
        L_0x0078:
            int[] r0 = A0H     // Catch:{ EOFException -> 0x00a9 }
            goto L_0x007d
        L_0x007b:
            int[] r0 = A0G     // Catch:{ EOFException -> 0x00a9 }
        L_0x007d:
            r1 = r0[r3]     // Catch:{ EOFException -> 0x00a9 }
            r9.A01 = r1     // Catch:{ EOFException -> 0x00a9 }
            goto L_0x00ab
        L_0x0082:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ EOFException -> 0x00a9 }
            java.lang.String r0 = "Invalid padding bits for frame header "
            X.6u7 r0 = X.AnonymousClass6u7.A02(r0, r1, r3)     // Catch:{ EOFException -> 0x00a9 }
            goto L_0x00a5
        L_0x008d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ EOFException -> 0x00a9 }
            java.lang.String r0 = "Illegal AMR "
            r1.append(r0)     // Catch:{ EOFException -> 0x00a9 }
            boolean r0 = r9.A0B     // Catch:{ EOFException -> 0x00a9 }
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = "WB"
        L_0x009c:
            r1.append(r0)     // Catch:{ EOFException -> 0x00a9 }
            java.lang.String r0 = " frame type "
            X.6u7 r0 = X.AnonymousClass6u7.A02(r0, r1, r3)     // Catch:{ EOFException -> 0x00a9 }
        L_0x00a5:
            throw r0     // Catch:{ EOFException -> 0x00a9 }
        L_0x00a6:
            java.lang.String r0 = "NB"
            goto L_0x009c
        L_0x00a9:
            r6 = -1
            goto L_0x00c7
        L_0x00ab:
            r9.A00 = r1
            int r0 = r9.A02
            if (r0 != r2) goto L_0x00b4
            r0 = r1
            r9.A02 = r1
        L_0x00b4:
            if (r0 != r1) goto L_0x00bc
            int r0 = r9.A03
            int r0 = r0 + 1
            r9.A03 = r0
        L_0x00bc:
            X.8tw r0 = r9.A08
            r4 = 1
            r6 = 0
            int r1 = r0.Bkf(r10, r1, r6, r4)
            if (r1 != r2) goto L_0x00df
            r6 = -1
        L_0x00c7:
            boolean r0 = r9.A0A
            if (r0 != 0) goto L_0x00de
            r2 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.86k r1 = X.C1686986k.A00(r0)
            r9.A07 = r1
            X.8wK r0 = r9.A06
            r0.Bl0(r1)
            r9.A0A = r2
        L_0x00de:
            return r6
        L_0x00df:
            int r0 = r9.A00
            int r0 = r0 - r1
            r9.A00 = r0
            if (r0 > 0) goto L_0x00c7
            X.8tw r2 = r9.A08
            long r7 = r9.A05
            long r0 = r9.A04
            long r7 = r7 + r0
            int r5 = r9.A01
            r3 = 0
            r2.Bkh(r3, r4, r5, r6, r7)
            long r2 = r9.A04
            r0 = 20000(0x4e20, double:9.8813E-320)
            long r2 = r2 + r0
            r9.A04 = r2
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86Z.BiD(X.8xa, X.7BG):int");
    }

    public void Bkz(long j, long j2) {
        this.A04 = 0;
        this.A01 = 0;
        this.A00 = 0;
        if (j != 0) {
            C184868sg r1 = this.A07;
            if (r1 instanceof C1687586q) {
                this.A05 = ((C1687586q) r1).A00(j);
                return;
            }
        }
        this.A05 = 0;
    }

    public AnonymousClass86Z(int i) {
        this.A0C = new byte[1];
        this.A02 = -1;
    }

    public boolean BpS(C187648xa r2) {
        return A00(r2);
    }

    public AnonymousClass86Z() {
        this(0);
    }
}
