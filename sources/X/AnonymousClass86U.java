package X;

import android.util.Log;

/* renamed from: X.86U  reason: invalid class name */
public final class AnonymousClass86U implements C185328tT {
    public int A00 = -1;
    public long A01 = -1;
    public C187028wK A02;
    public C185598tw A03;
    public C184908sk A04;

    public void BFs(C187028wK r3) {
        this.A02 = r3;
        this.A03 = r3.Br0(0, 1);
        r3.B2W();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
        if (r2 != 65534) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b3, code lost:
        if (r7 != 0) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BiD(X.C187648xa r13, X.AnonymousClass7BG r14) {
        /*
            r12 = this;
            X.8tw r0 = r12.A03
            X.C161487pm.A01(r0)
            X.8sk r0 = r12.A04
            if (r0 != 0) goto L_0x0020
            X.7OS r5 = A00(r13)
            if (r5 == 0) goto L_0x012f
            int r2 = r5.A02
            r0 = 17
            if (r2 != r0) goto L_0x0077
            X.8wK r1 = r12.A02
            X.8tw r0 = r12.A03
            X.87N r2 = new X.87N
            r2.<init>(r1, r0, r5)
        L_0x001e:
            r12.A04 = r2
        L_0x0020:
            int r5 = r12.A00
            r6 = -1
            if (r5 != r6) goto L_0x00bc
            r13.getClass()
            r13.Bjy()
            r10 = 8
            X.7pi r8 = X.C161467pi.A05(r10)
        L_0x0031:
            byte[] r1 = r8.A02
            r0 = 0
            r13.Bgd(r1, r0, r10)
            int r7 = X.C161467pi.A04(r8, r0)
            long r2 = r8.A0G()
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r9 = "WavHeaderReader"
            if (r7 == r0) goto L_0x00ca
            r4 = 1380533830(0x52494646, float:2.16116855E11)
            if (r7 == r4) goto L_0x0070
            r0 = 1718449184(0x666d7420, float:2.8033575E23)
            if (r7 == r0) goto L_0x0059
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Ignoring unknown WAV chunk: "
            X.AnonymousClass6C7.A1I(r0, r9, r1, r7)
        L_0x0059:
            r0 = 8
            long r2 = r2 + r0
            if (r7 == r4) goto L_0x0070
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0072
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Chunk is too large (~2GB+) to skip; id: "
            X.6u7 r0 = X.AnonymousClass6u7.A02(r0, r1, r7)
            throw r0
        L_0x0070:
            r2 = 12
        L_0x0072:
            int r0 = (int) r2
            r13.BpP(r0)
            goto L_0x0031
        L_0x0077:
            r0 = 6
            if (r2 != r0) goto L_0x0087
            X.8wK r3 = r12.A02
            X.8tw r4 = r12.A03
            java.lang.String r6 = "audio/g711-alaw"
        L_0x0080:
            r7 = -1
        L_0x0081:
            X.87M r2 = new X.87M
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x001e
        L_0x0087:
            r0 = 7
            if (r2 != r0) goto L_0x0091
            X.8wK r3 = r12.A02
            X.8tw r4 = r12.A03
            java.lang.String r6 = "audio/g711-mlaw"
            goto L_0x0080
        L_0x0091:
            int r1 = r5.A00
            r0 = 1
            if (r2 == r0) goto L_0x00af
            r0 = 3
            if (r2 == r0) goto L_0x00a9
            r0 = 65534(0xfffe, float:9.1833E-41)
            if (r2 == r0) goto L_0x00af
        L_0x009e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unsupported WAV format type: "
            X.6u7 r0 = X.AnonymousClass6u7.A02(r0, r1, r2)
            throw r0
        L_0x00a9:
            r0 = 32
            if (r1 != r0) goto L_0x009e
            r7 = 4
            goto L_0x00b5
        L_0x00af:
            int r7 = X.C162387ry.A01(r1)
            if (r7 == 0) goto L_0x009e
        L_0x00b5:
            X.8wK r3 = r12.A02
            X.8tw r4 = r12.A03
            java.lang.String r6 = "audio/raw"
            goto L_0x0081
        L_0x00bc:
            long r3 = r13.BBW()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0113
            r13.BpP(r5)
            goto L_0x0113
        L_0x00ca:
            r13.BpP(r10)
            long r10 = r13.BBW()
            long r2 = r2 + r10
            long r0 = r13.getLength()
            r7 = -1
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x00f6
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x00f6
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "Data exceeds input length: "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = ", "
            java.lang.String r2 = X.AnonymousClass000.A0Z(r2, r5, r0)
            android.util.Log.w(r9, r2)
            r2 = r0
        L_0x00f6:
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            int r3 = X.C18280x3.A03(r0)
            r12.A00 = r3
            long r1 = X.AnonymousClass6C8.A0R(r0)
            r12.A01 = r1
            X.8sk r0 = r12.A04
            r0.BFp(r3, r1)
        L_0x0113:
            long r2 = r12.A01
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            X.C161487pm.A04(r0)
            long r0 = r13.BBW()
            long r2 = r2 - r0
            X.8sk r0 = r12.A04
            boolean r0 = r0.Bke(r13, r2)
            if (r0 != 0) goto L_0x012e
            r6 = 0
        L_0x012e:
            return r6
        L_0x012f:
            java.lang.String r0 = "Unsupported or unrecognized wav header."
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86U.BiD(X.8xa, X.7BG):int");
    }

    public void Bkz(long j, long j2) {
        C184908sk r0 = this.A04;
        if (r0 != null) {
            r0.Bju(j2);
        }
    }

    public static AnonymousClass7OS A00(C187648xa r13) {
        long A0G;
        byte[] bArr;
        r13.getClass();
        C161467pi A05 = C161467pi.A05(16);
        r13.Bgd(A05.A02, 0, 8);
        int A042 = C161467pi.A04(A05, 0);
        A05.A0G();
        if (A042 == 1380533830) {
            r13.Bgd(A05.A02, 0, 4);
            int A043 = C161467pi.A04(A05, 0);
            if (A043 != 1463899717) {
                Log.e("WavHeaderReader", AnonymousClass000.A0Y("Unsupported RIFF format: ", AnonymousClass001.A0o(), A043));
            } else {
                while (true) {
                    C161467pi.A06(r13, A05, 8);
                    int A044 = C161467pi.A04(A05, 0);
                    A0G = A05.A0G();
                    if (A044 == 1718449184) {
                        break;
                    }
                    r13.Awu((int) A0G);
                }
                C161487pm.A04(AnonymousClass001.A1U((A0G > 16 ? 1 : (A0G == 16 ? 0 : -1))));
                C161467pi.A06(r13, A05, 16);
                A05.A0S(0);
                int A0A = A05.A0A();
                int A0A2 = A05.A0A();
                int A09 = A05.A09();
                A05.A09();
                int A0A3 = A05.A0A();
                int A0A4 = A05.A0A();
                int i = ((int) A0G) - 16;
                if (i > 0) {
                    bArr = new byte[i];
                    r13.Bgd(bArr, 0, i);
                } else {
                    bArr = C162387ry.A0A;
                }
                return new AnonymousClass7OS(bArr, A0A, A0A2, A09, A0A3, A0A4);
            }
        }
        return null;
    }

    public boolean BpS(C187648xa r2) {
        return AnonymousClass000.A1W(A00(r2));
    }
}
