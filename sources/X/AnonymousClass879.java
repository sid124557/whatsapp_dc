package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.879  reason: invalid class name */
public final class AnonymousClass879 implements C185608tx {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public C166527yp A0C;
    public C185598tw A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public final C160807oL A0I;
    public final C161467pi A0J;
    public final String A0K;

    public void Bky() {
        this.A08 = 0;
        this.A0H = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013c, code lost:
        if (r12.A0H == false) goto L_0x01ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AzY(X.C161467pi r13) {
        /*
            r12 = this;
            X.8tw r0 = r12.A0D
            X.C161487pm.A01(r0)
        L_0x0005:
            int r2 = X.C161467pi.A00(r13)
            if (r2 <= 0) goto L_0x0235
            int r0 = r12.A08
            r4 = 86
            r1 = 1
            if (r0 == 0) goto L_0x0207
            r3 = 2
            r9 = 0
            if (r0 == r1) goto L_0x016a
            r4 = 3
            if (r0 == r3) goto L_0x0140
            int r0 = r12.A06
            int r1 = r12.A01
            int r4 = X.AnonymousClass6C9.A0A(r0, r1, r2)
            X.7oL r2 = r12.A0I
            byte[] r0 = r2.A03
            r13.A0V(r0, r1, r4)
            int r1 = r12.A01
            int r1 = r1 + r4
            r12.A01 = r1
            int r0 = r12.A06
            if (r1 != r0) goto L_0x0005
            r2.A08(r9)
            boolean r0 = r2.A0D()
            if (r0 != 0) goto L_0x013a
            r7 = 1
            r12.A0H = r7
            int r6 = r2.A04(r7)
            if (r6 != r7) goto L_0x0137
            int r0 = r2.A04(r7)
        L_0x0047:
            r12.A00 = r0
            if (r0 != 0) goto L_0x021d
            if (r6 != r7) goto L_0x0058
            int r0 = r2.A04(r3)
            int r0 = r0 + 1
            int r0 = r0 * 8
            r2.A04(r0)
        L_0x0058:
            boolean r0 = r2.A0D()
            if (r0 == 0) goto L_0x0217
            r0 = 6
            int r0 = r2.A04(r0)
            r12.A04 = r0
            r0 = 4
            int r1 = r2.A04(r0)
            r0 = 3
            int r0 = r2.A04(r0)
            if (r1 != 0) goto L_0x0211
            if (r0 != 0) goto L_0x0211
            r5 = 8
            if (r6 != 0) goto L_0x010b
            int r0 = r2.A02
            int r3 = r0 * 8
            int r0 = r2.A00
            int r3 = r3 + r0
            int r4 = X.C160807oL.A00(r2)
            X.7JX r1 = X.C159817mV.A00(r2, r7)
            java.lang.String r0 = r1.A02
            r12.A0E = r0
            int r0 = r1.A01
            r12.A05 = r0
            int r0 = r1.A00
            r12.A02 = r0
            int r0 = X.C160807oL.A00(r2)
            int r4 = r4 - r0
            r2.A08(r3)
            int r0 = r4 + 7
            int r0 = r0 / r5
            byte[] r3 = new byte[r0]
            r2.A0B(r3, r4)
            X.7he r1 = X.C157057he.A00()
            java.lang.String r0 = r12.A0F
            r1.A0O = r0
            java.lang.String r0 = "audio/mp4a-latm"
            r1.A0R = r0
            java.lang.String r0 = r12.A0E
            r1.A0M = r0
            int r0 = r12.A02
            r1.A04 = r0
            int r0 = r12.A05
            r1.A0D = r0
            java.util.List r0 = java.util.Collections.singletonList(r3)
            r1.A0S = r0
            java.lang.String r0 = r12.A0K
            r1.A0Q = r0
            X.7yp r8 = X.C166527yp.A00(r1)
            X.7yp r0 = r12.A0C
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00e0
            r12.A0C = r8
            int r0 = r8.A0F
            long r3 = (long) r0
            r0 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r0 = r0 / r3
            r12.A0A = r0
            X.8tw r0 = r12.A0D
            r0.B3T(r8)
        L_0x00e0:
            r0 = 3
            int r3 = r2.A04(r0)
            r12.A03 = r3
            if (r3 == 0) goto L_0x0105
            if (r3 == r7) goto L_0x0102
            r1 = 6
            if (r3 == r0) goto L_0x017d
            r0 = 4
            if (r3 == r0) goto L_0x017d
            r0 = 5
            if (r3 == r0) goto L_0x017d
            if (r3 == r1) goto L_0x00fe
            r0 = 7
            if (r3 == r0) goto L_0x00fe
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        L_0x00fe:
            r2.A09(r7)
            goto L_0x0180
        L_0x0102:
            r0 = 9
            goto L_0x0107
        L_0x0105:
            r0 = 8
        L_0x0107:
            r2.A09(r0)
            goto L_0x0180
        L_0x010b:
            int r0 = r2.A04(r3)
            int r0 = r0 + 1
            int r0 = r0 * 8
            int r0 = r2.A04(r0)
            long r0 = (long) r0
            int r4 = (int) r0
            int r3 = X.C160807oL.A00(r2)
            X.7JX r1 = X.C159817mV.A00(r2, r7)
            java.lang.String r0 = r1.A02
            r12.A0E = r0
            int r0 = r1.A01
            r12.A05 = r0
            int r0 = r1.A00
            r12.A02 = r0
            int r0 = X.C160807oL.A00(r2)
            int r3 = r3 - r0
            int r4 = r4 - r3
            r2.A09(r4)
            goto L_0x00e0
        L_0x0137:
            r0 = 0
            goto L_0x0047
        L_0x013a:
            boolean r0 = r12.A0H
            if (r0 != 0) goto L_0x01a1
            goto L_0x01ea
        L_0x0140:
            int r0 = r12.A07
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r2 = r0 << 8
            int r0 = r13.A0C()
            r2 = r2 | r0
            r12.A06 = r2
            X.7pi r1 = r12.A0J
            byte[] r0 = r1.A02
            int r0 = r0.length
            if (r2 <= r0) goto L_0x0164
            r1.A0Q(r2)
            X.7oL r2 = r12.A0I
            byte[] r1 = r1.A02
            int r0 = r1.length
            r2.A03 = r1
            r2.A02 = r9
            r2.A00 = r9
            r2.A01 = r0
        L_0x0164:
            r12.A01 = r9
            r12.A08 = r4
            goto L_0x0005
        L_0x016a:
            int r2 = r13.A0C()
            r1 = r2 & 224(0xe0, float:3.14E-43)
            r0 = 224(0xe0, float:3.14E-43)
            if (r1 != r0) goto L_0x017a
            r12.A07 = r2
            r12.A08 = r3
            goto L_0x0005
        L_0x017a:
            if (r2 == r4) goto L_0x0005
            goto L_0x01ea
        L_0x017d:
            r2.A09(r1)
        L_0x0180:
            boolean r0 = r2.A0D()
            r12.A0G = r0
            r3 = 0
            r12.A09 = r3
            if (r0 == 0) goto L_0x019e
            if (r6 != r7) goto L_0x01f7
            r0 = 2
            int r0 = r2.A04(r0)
            int r0 = r0 + 1
            int r0 = r0 * 8
            int r0 = r2.A04(r0)
            long r0 = (long) r0
            r12.A09 = r0
        L_0x019e:
            X.C160807oL.A03(r2, r5)
        L_0x01a1:
            int r0 = r12.A00
            if (r0 != 0) goto L_0x022f
            int r0 = r12.A04
            if (r0 != 0) goto L_0x0229
            int r0 = r12.A03
            if (r0 != 0) goto L_0x0223
            r8 = 0
        L_0x01ae:
            r0 = 8
            int r1 = r2.A04(r0)
            int r8 = r8 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L_0x01ae
            int r0 = r2.A02
            int r1 = r0 * 8
            int r0 = r2.A00
            int r1 = r1 + r0
            r0 = r1 & 7
            X.7pi r4 = r12.A0J
            if (r0 != 0) goto L_0x01ee
            int r3 = r1 >> 3
        L_0x01c8:
            r4.A0S(r3)
            X.8tw r0 = r12.A0D
            r0.Bkc(r4, r8)
            X.8tw r5 = r12.A0D
            long r10 = r12.A0B
            r7 = 1
            r6 = 0
            r5.Bkh(r6, r7, r8, r9, r10)
            long r3 = r12.A0B
            long r0 = r12.A0A
            long r3 = r3 + r0
            r12.A0B = r3
            boolean r0 = r12.A0G
            if (r0 == 0) goto L_0x01ea
            long r3 = r12.A09
            int r0 = (int) r3
            r2.A09(r0)
        L_0x01ea:
            r12.A08 = r9
            goto L_0x0005
        L_0x01ee:
            byte[] r1 = r4.A02
            int r0 = r8 * 8
            r3 = 0
            r2.A0B(r1, r0)
            goto L_0x01c8
        L_0x01f7:
            boolean r6 = r2.A0D()
            long r3 = r3 << r5
            int r0 = r2.A04(r5)
            long r0 = (long) r0
            long r3 = r3 + r0
            r12.A09 = r3
            if (r6 != 0) goto L_0x01f7
            goto L_0x019e
        L_0x0207:
            int r0 = r13.A0C()
            if (r0 != r4) goto L_0x0005
            r12.A08 = r1
            goto L_0x0005
        L_0x0211:
            X.6u7 r0 = new X.6u7
            r0.<init>()
            throw r0
        L_0x0217:
            X.6u7 r0 = new X.6u7
            r0.<init>()
            throw r0
        L_0x021d:
            X.6u7 r0 = new X.6u7
            r0.<init>()
            throw r0
        L_0x0223:
            X.6u7 r0 = new X.6u7
            r0.<init>()
            throw r0
        L_0x0229:
            X.6u7 r0 = new X.6u7
            r0.<init>()
            throw r0
        L_0x022f:
            X.6u7 r0 = new X.6u7
            r0.<init>()
            throw r0
        L_0x0235:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass879.AzY(X.7pi):void");
    }

    public void BgP() {
    }

    public AnonymousClass879(String str) {
        this.A0K = str;
        C161467pi A052 = C161467pi.A05(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        this.A0J = A052;
        byte[] bArr = A052.A02;
        this.A0I = new C160807oL(bArr, bArr.length);
    }

    public void B19(C187028wK r2, C151897Ws r3) {
        r3.A02();
        this.A0D = C151897Ws.A00(r2, r3);
        r3.A03();
        this.A0F = r3.A01;
    }

    public void BgQ(long j, int i) {
        this.A0B = j;
    }
}
