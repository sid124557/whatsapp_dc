package X;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* renamed from: X.87I  reason: invalid class name */
public class AnonymousClass87I implements C183868qn {
    public final int A00;
    public final SparseArray A01 = AnonymousClass6CA.A0I();
    public final SparseIntArray A02 = new SparseIntArray();
    public final C160807oL A03 = new C160807oL(new byte[5], 5);
    public final /* synthetic */ AnonymousClass86W A04;

    public AnonymousClass87I(AnonymousClass86W r4, int i) {
        this.A04 = r4;
        this.A00 = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x01a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AzY(X.C161467pi r30) {
        /*
            r29 = this;
            r10 = r30
            int r0 = r10.A0C()
            r9 = 2
            if (r0 != r9) goto L_0x0288
            r5 = r29
            X.86W r4 = r5.A04
            r1 = 0
            r3 = 1
            java.util.List r0 = r4.A0F
            java.lang.Object r26 = r0.get(r1)
            r0 = r26
            X.7ax r0 = (X.C153267ax) r0
            r26 = r0
            int r0 = r10.A0C()
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0288
            r10.A0T(r3)
            int r25 = r10.A0F()
            r11 = 3
            r10.A0T(r11)
            X.7oL r8 = r5.A03
            byte[] r0 = r8.A03
            r6 = 0
            r10.A0V(r0, r1, r9)
            r8.A08(r1)
            r8.A09(r11)
            r2 = 13
            int r0 = r8.A04(r2)
            r4.A01 = r0
            byte[] r0 = r8.A03
            r10.A0V(r0, r1, r9)
            r8.A08(r1)
            r1 = 4
            r8.A09(r1)
            r0 = 12
            int r0 = r8.A04(r0)
            r10.A0T(r0)
            android.util.SparseArray r0 = r5.A01
            r28 = r0
            r28.clear()
            android.util.SparseIntArray r0 = r5.A02
            r27 = r0
            r27.clear()
            int r24 = X.C161467pi.A00(r10)
        L_0x006b:
            if (r24 <= 0) goto L_0x023b
            r13 = 5
            byte[] r0 = r8.A03
            r10.A0V(r0, r6, r13)
            r8.A08(r6)
            r0 = 8
            int r12 = r8.A04(r0)
            int r7 = X.C160807oL.A01(r8, r11, r2)
            r8.A09(r1)
            r0 = 12
            int r23 = r8.A04(r0)
            int r0 = r10.A01
            r22 = r0
            int r2 = r23 + r0
            r15 = -1
            r21 = 0
            r20 = r21
        L_0x0094:
            int r0 = r10.A01
            if (r0 >= r2) goto L_0x0135
            int r14 = r10.A0C()
            int r0 = r10.A0C()
            int r1 = r10.A01
            int r1 = r1 + r0
            if (r1 > r2) goto L_0x0135
            if (r14 != r13) goto L_0x00d0
            long r18 = r10.A0I()
            r16 = 1094921523(0x41432d33, double:5.409631094E-315)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0132
            r16 = 1161904947(0x45414333, double:5.74057318E-315)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x012f
            r16 = 1094921524(0x41432d34, double:5.4096311E-315)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x00e4
            r16 = 1212503619(0x48455643, double:5.990563836E-315)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c9
            r15 = 36
        L_0x00c9:
            int r0 = r10.A01
            int r1 = r1 - r0
            r10.A0T(r1)
            goto L_0x0094
        L_0x00d0:
            r0 = 106(0x6a, float:1.49E-43)
            if (r14 == r0) goto L_0x0132
            r0 = 122(0x7a, float:1.71E-43)
            if (r14 == r0) goto L_0x012f
            r0 = 127(0x7f, float:1.78E-43)
            if (r14 != r0) goto L_0x00e7
            int r0 = r10.A0C()
            r14 = 21
            if (r0 != r14) goto L_0x00c9
        L_0x00e4:
            r15 = 172(0xac, float:2.41E-43)
            goto L_0x00c9
        L_0x00e7:
            r0 = 123(0x7b, float:1.72E-43)
            if (r14 != r0) goto L_0x00ee
            r15 = 138(0x8a, float:1.93E-43)
            goto L_0x00c9
        L_0x00ee:
            r0 = 10
            if (r14 != r0) goto L_0x00fb
            java.lang.String r0 = r10.A0O(r11)
            java.lang.String r21 = r0.trim()
            goto L_0x00c9
        L_0x00fb:
            r0 = 89
            if (r14 != r0) goto L_0x0128
            java.util.ArrayList r20 = X.AnonymousClass001.A0s()
        L_0x0103:
            int r0 = r10.A01
            if (r0 >= r1) goto L_0x0125
            java.lang.String r0 = r10.A0O(r11)
            java.lang.String r16 = r0.trim()
            r10.A0C()
            r0 = 4
            byte[] r15 = new byte[r0]
            r10.A0V(r15, r6, r0)
            X.7G2 r14 = new X.7G2
            r0 = r16
            r14.<init>(r0, r15)
            r0 = r20
            r0.add(r14)
            goto L_0x0103
        L_0x0125:
            r15 = 89
            goto L_0x00c9
        L_0x0128:
            r0 = 111(0x6f, float:1.56E-43)
            if (r14 != r0) goto L_0x00c9
            r15 = 257(0x101, float:3.6E-43)
            goto L_0x00c9
        L_0x012f:
            r15 = 135(0x87, float:1.89E-43)
            goto L_0x00c9
        L_0x0132:
            r15 = 129(0x81, float:1.81E-43)
            goto L_0x00c9
        L_0x0135:
            r10.A0S(r2)
            byte[] r1 = r10.A02
            r0 = r22
            byte[] r2 = java.util.Arrays.copyOfRange(r1, r0, r2)
            X.7M6 r14 = new X.7M6
            r1 = r21
            r0 = r20
            r14.<init>(r1, r0, r2, r15)
            r0 = 6
            if (r12 == r0) goto L_0x014e
            if (r12 != r13) goto L_0x0150
        L_0x014e:
            int r12 = r14.A00
        L_0x0150:
            int r0 = r23 + 5
            int r24 = r24 - r0
            android.util.SparseBooleanArray r0 = r4.A09
            boolean r0 = r0.get(r7)
            if (r0 != 0) goto L_0x01a1
            X.8gz r1 = r4.A0D
            X.87J r1 = (X.AnonymousClass87J) r1
            if (r12 == r9) goto L_0x0217
            if (r12 == r11) goto L_0x020f
            r0 = 4
            if (r12 == r0) goto L_0x020f
            r0 = 21
            if (r12 == r0) goto L_0x01fc
            r2 = 0
            r0 = 27
            if (r12 == r0) goto L_0x01ed
            r0 = 36
            if (r12 == r0) goto L_0x01de
            r0 = 89
            if (r12 == r0) goto L_0x01d6
            r0 = 138(0x8a, float:1.93E-43)
            if (r12 == r0) goto L_0x01ce
            r0 = 172(0xac, float:2.41E-43)
            if (r12 == r0) goto L_0x01c6
            r0 = 257(0x101, float:3.6E-43)
            if (r12 == r0) goto L_0x01b9
            r0 = 129(0x81, float:1.81E-43)
            if (r12 == r0) goto L_0x01b1
            r0 = 130(0x82, float:1.82E-43)
            if (r12 == r0) goto L_0x0197
            r0 = 134(0x86, float:1.88E-43)
            if (r12 == r0) goto L_0x01ae
            r0 = 135(0x87, float:1.89E-43)
            if (r12 == r0) goto L_0x01b1
            switch(r12) {
                case 15: goto L_0x0202;
                case 16: goto L_0x0226;
                case 17: goto L_0x01a6;
                default: goto L_0x0197;
            }
        L_0x0197:
            r0 = r27
            r0.put(r7, r7)
            r0 = r28
            r0.put(r7, r2)
        L_0x01a1:
            r1 = 4
            r2 = 13
            goto L_0x006b
        L_0x01a6:
            java.lang.String r0 = r14.A01
            X.879 r1 = new X.879
            r1.<init>(r0)
            goto L_0x0209
        L_0x01ae:
            java.lang.String r1 = "application/x-scte35"
            goto L_0x01bb
        L_0x01b1:
            java.lang.String r0 = r14.A01
            X.87A r1 = new X.87A
            r1.<init>(r0)
            goto L_0x0234
        L_0x01b9:
            java.lang.String r1 = "application/vnd.dvb.ait"
        L_0x01bb:
            X.87H r0 = new X.87H
            r0.<init>(r1)
            X.87K r2 = new X.87K
            r2.<init>(r0)
            goto L_0x0197
        L_0x01c6:
            java.lang.String r0 = r14.A01
            X.87B r1 = new X.87B
            r1.<init>(r0)
            goto L_0x0234
        L_0x01ce:
            java.lang.String r0 = r14.A01
            X.876 r1 = new X.876
            r1.<init>(r0)
            goto L_0x0234
        L_0x01d6:
            java.util.List r0 = r14.A02
            X.874 r1 = new X.874
            r1.<init>(r0)
            goto L_0x0234
        L_0x01de:
            java.util.List r1 = r1.A00(r14)
            X.7S5 r0 = new X.7S5
            r0.<init>(r1)
            X.878 r1 = new X.878
            r1.<init>(r0)
            goto L_0x0234
        L_0x01ed:
            java.util.List r1 = r1.A00(r14)
            X.7S5 r0 = new X.7S5
            r0.<init>(r1)
            X.877 r1 = new X.877
            r1.<init>(r0)
            goto L_0x0209
        L_0x01fc:
            X.875 r1 = new X.875
            r1.<init>()
            goto L_0x0209
        L_0x0202:
            java.lang.String r0 = r14.A01
            X.87D r1 = new X.87D
            r1.<init>(r6, r0)
        L_0x0209:
            X.87L r2 = new X.87L
            r2.<init>(r1)
            goto L_0x0197
        L_0x020f:
            java.lang.String r0 = r14.A01
            X.87C r1 = new X.87C
            r1.<init>(r0)
            goto L_0x0234
        L_0x0217:
            java.util.List r1 = r1.A00(r14)
            X.7Vb r0 = new X.7Vb
            r0.<init>(r1)
            X.87F r1 = new X.87F
            r1.<init>(r0)
            goto L_0x0234
        L_0x0226:
            java.util.List r1 = r1.A00(r14)
            X.7Vb r0 = new X.7Vb
            r0.<init>(r1)
            X.87E r1 = new X.87E
            r1.<init>(r0)
        L_0x0234:
            X.87L r2 = new X.87L
            r2.<init>(r1)
            goto L_0x0197
        L_0x023b:
            int r10 = r27.size()
            r9 = 0
        L_0x0240:
            if (r9 >= r10) goto L_0x0278
            r0 = r27
            int r12 = r0.keyAt(r9)
            int r11 = r0.valueAt(r9)
            android.util.SparseBooleanArray r0 = r4.A09
            r0.put(r12, r3)
            android.util.SparseBooleanArray r0 = r4.A0A
            r0.put(r11, r3)
            r0 = r28
            java.lang.Object r8 = r0.valueAt(r9)
            X.8sj r8 = (X.C184898sj) r8
            if (r8 == 0) goto L_0x0275
            X.8wK r7 = r4.A03
            r2 = 8192(0x2000, float:1.14794E-41)
            X.7Ws r1 = new X.7Ws
            r0 = r25
            r1.<init>(r0, r12, r2)
            r0 = r26
            r8.BFv(r7, r1, r0)
            android.util.SparseArray r0 = r4.A08
            r0.put(r11, r8)
        L_0x0275:
            int r9 = r9 + 1
            goto L_0x0240
        L_0x0278:
            android.util.SparseArray r1 = r4.A08
            int r0 = r5.A00
            r1.remove(r0)
            r4.A02 = r6
            X.8wK r0 = r4.A03
            r0.B2W()
            r4.A07 = r3
        L_0x0288:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass87I.AzY(X.7pi):void");
    }

    public void BFv(C187028wK r1, C151897Ws r2, C153267ax r3) {
    }
}
