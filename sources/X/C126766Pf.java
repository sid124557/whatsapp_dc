package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.6Pf  reason: invalid class name and case insensitive filesystem */
public final class C126766Pf extends AnonymousClass88O {
    public static final int[] A0I = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, C627136h.A03, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] A0J = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A0K = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A0L = {174, MediaCodecVideoEncoder.MIN_ENCODER_WIDTH, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] A0M = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] A0N = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final int[] A0O = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final boolean[] A0P = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public int A04 = 0;
    public long A05;
    public C153057ab A06 = new C153057ab(0, 4);
    public List A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final long A0F = 16000000;
    public final C161467pi A0G = new C161467pi();
    public final ArrayList A0H = AnonymousClass001.A0s();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0215, code lost:
        if (r0 != 3) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0281, code lost:
        r10.A03 = r1;
        r10.A06.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r1[r2] == false) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0013 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C126476Oa r11) {
        /*
            r10 = this;
            java.nio.ByteBuffer r0 = r11.A01
            r0.getClass()
            X.7pi r3 = r10.A0G
            byte[] r1 = r0.array()
            int r0 = r0.limit()
            r3.A0U(r1, r0)
            r9 = 0
        L_0x0013:
            int r2 = X.C161467pi.A00(r3)
            int r1 = r10.A0C
            r0 = 1
            if (r2 < r1) goto L_0x029a
            r0 = 2
            if (r1 != r0) goto L_0x0293
            r8 = -4
        L_0x0020:
            int r6 = r3.A0C()
            int r2 = r3.A0C()
            r0 = r8 & 2
            if (r0 != 0) goto L_0x0013
            r1 = r8 & 1
            int r0 = r10.A0E
            if (r1 != r0) goto L_0x0013
            r0 = r6 & 127(0x7f, float:1.78E-43)
            byte r4 = (byte) r0
            r0 = r2 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r0
            if (r4 != 0) goto L_0x003d
            if (r5 != 0) goto L_0x003d
            goto L_0x0013
        L_0x003d:
            boolean r7 = r10.A09
            r1 = r8 & 4
            r0 = 4
            if (r1 != r0) goto L_0x004f
            boolean[] r1 = A0P
            boolean r0 = r1[r6]
            if (r0 == 0) goto L_0x004f
            boolean r0 = r1[r2]
            r6 = 1
            if (r0 != 0) goto L_0x0050
        L_0x004f:
            r6 = 0
        L_0x0050:
            r10.A09 = r6
            r2 = 0
            if (r6 == 0) goto L_0x006b
            r1 = r4 & 240(0xf0, float:3.36E-43)
            r0 = 16
            if (r1 != r0) goto L_0x006b
            boolean r0 = r10.A0B
            r1 = 1
            if (r0 == 0) goto L_0x0076
            byte r0 = r10.A00
            if (r0 != r4) goto L_0x0076
            byte r0 = r10.A01
            if (r0 != r5) goto L_0x0076
            r10.A0B = r2
            goto L_0x0013
        L_0x006b:
            r10.A0B = r2
            if (r6 != 0) goto L_0x007c
            if (r7 == 0) goto L_0x0013
        L_0x0071:
            r10.A04()
        L_0x0074:
            r9 = 1
            goto L_0x0013
        L_0x0076:
            r10.A0B = r1
            r10.A00 = r4
            r10.A01 = r5
        L_0x007c:
            r0 = 1
            if (r0 > r4) goto L_0x0104
            r0 = 15
            if (r4 > r0) goto L_0x0104
        L_0x0083:
            r10.A0A = r2
        L_0x0085:
            boolean r0 = r10.A0A
            if (r0 == 0) goto L_0x0013
            r2 = r4 & 224(0xe0, float:3.14E-43)
            if (r2 != 0) goto L_0x0093
            int r0 = r4 >> 3
            r0 = r0 & 1
            r10.A04 = r0
        L_0x0093:
            int r1 = r10.A04
            int r0 = r10.A0D
            if (r1 != r0) goto L_0x0013
            if (r2 != 0) goto L_0x00e0
            r6 = r4 & 247(0xf7, float:3.46E-43)
            r0 = 17
            if (r6 != r0) goto L_0x00be
            r1 = r5 & 240(0xf0, float:3.36E-43)
            r0 = 48
            if (r1 != r0) goto L_0x00be
            X.7ab r7 = r10.A06
            r1 = r5 & 15
            int[] r0 = A0L
            r0 = r0[r1]
            char r4 = (char) r0
        L_0x00b0:
            java.lang.StringBuilder r2 = r7.A05
            int r1 = r2.length()
            r0 = 32
            if (r1 >= r0) goto L_0x0074
            r2.append(r4)
            goto L_0x0074
        L_0x00be:
            r2 = r4 & 246(0xf6, float:3.45E-43)
            r0 = 18
            if (r2 != r0) goto L_0x011f
            r1 = r5 & 224(0xe0, float:3.14E-43)
            r0 = 32
            if (r1 != r0) goto L_0x011f
            X.7ab r0 = r10.A06
            r0.A02()
            X.7ab r7 = r10.A06
            r0 = r4 & 1
            r1 = r5 & 31
            if (r0 != 0) goto L_0x00dd
            int[] r0 = A0M
        L_0x00d9:
            r0 = r0[r1]
            char r4 = (char) r0
            goto L_0x00b0
        L_0x00dd:
            int[] r0 = A0N
            goto L_0x00d9
        L_0x00e0:
            X.7ab r7 = r10.A06
            r0 = r4 & 127(0x7f, float:1.78E-43)
            int r0 = r0 + -32
            int[] r6 = A0I
            r0 = r6[r0]
            char r4 = (char) r0
            java.lang.StringBuilder r2 = r7.A05
            int r1 = r2.length()
            r0 = 32
            if (r1 >= r0) goto L_0x00f8
            r2.append(r4)
        L_0x00f8:
            r0 = r5 & 224(0xe0, float:3.14E-43)
            if (r0 == 0) goto L_0x0074
            r0 = r5 & 127(0x7f, float:1.78E-43)
            int r0 = r0 + -32
            r0 = r6[r0]
            char r4 = (char) r0
            goto L_0x00b0
        L_0x0104:
            r1 = r4 & 247(0xf7, float:3.46E-43)
            r0 = 20
            if (r1 != r0) goto L_0x0085
            r0 = 32
            if (r5 == r0) goto L_0x011a
            r0 = 47
            if (r5 == r0) goto L_0x011a
            switch(r5) {
                case 37: goto L_0x011a;
                case 38: goto L_0x011a;
                case 39: goto L_0x011a;
                default: goto L_0x0115;
            }
        L_0x0115:
            switch(r5) {
                case 41: goto L_0x011a;
                case 42: goto L_0x0083;
                case 43: goto L_0x0083;
                default: goto L_0x0118;
            }
        L_0x0118:
            goto L_0x0085
        L_0x011a:
            r0 = 1
            r10.A0A = r0
            goto L_0x0085
        L_0x011f:
            r0 = 17
            if (r6 != r0) goto L_0x0152
            r1 = r5 & 240(0xf0, float:3.36E-43)
            r0 = 32
            if (r1 != r0) goto L_0x0152
            X.7ab r2 = r10.A06
            r1 = 32
            java.lang.StringBuilder r7 = r2.A05
            int r0 = r7.length()
            if (r0 >= r1) goto L_0x0138
            r7.append(r1)
        L_0x0138:
            r1 = r5 & 1
            r0 = 1
            boolean r6 = X.AnonymousClass000.A1U(r1, r0)
            int r5 = r5 >> r0
            r4 = r5 & 7
            java.util.List r2 = r2.A06
            int r1 = r7.length()
            X.7Je r0 = new X.7Je
            r0.<init>(r4, r1, r6)
            r2.add(r0)
            goto L_0x0074
        L_0x0152:
            r1 = r4 & 240(0xf0, float:3.36E-43)
            r0 = 16
            if (r1 != r0) goto L_0x01d4
            r1 = r5 & 192(0xc0, float:2.69E-43)
            r0 = 64
            if (r1 != r0) goto L_0x01d4
            int[] r1 = A0K
            r0 = r4 & 7
            r6 = r1[r0]
            r0 = r5 & 32
            r7 = 0
            r4 = 1
            if (r0 == 0) goto L_0x016c
            int r6 = r6 + 1
        L_0x016c:
            X.7ab r8 = r10.A06
            int r0 = r8.A03
            if (r6 == r0) goto L_0x0192
            int r0 = r10.A02
            if (r0 == r4) goto L_0x018e
            java.util.List r0 = r8.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01c3
            java.util.List r0 = r8.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01c3
            java.lang.StringBuilder r0 = r8.A05
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01c3
        L_0x018e:
            X.7ab r8 = r10.A06
            r8.A03 = r6
        L_0x0192:
            r1 = r5 & 16
            r0 = 16
            boolean r6 = X.AnonymousClass000.A1U(r1, r0)
            r0 = r5 & 1
            if (r0 != r4) goto L_0x019f
            r7 = 1
        L_0x019f:
            int r5 = r5 >> r4
            r5 = r5 & 7
            r4 = r5
            if (r6 == 0) goto L_0x01a7
            r4 = 8
        L_0x01a7:
            java.util.List r2 = r8.A06
            java.lang.StringBuilder r0 = r8.A05
            int r1 = r0.length()
            X.7Je r0 = new X.7Je
            r0.<init>(r4, r1, r7)
            r2.add(r0)
            if (r6 == 0) goto L_0x0074
            X.7ab r1 = r10.A06
            int[] r0 = A0J
            r0 = r0[r5]
            r1.A02 = r0
            goto L_0x0074
        L_0x01c3:
            int r2 = r10.A02
            int r0 = r10.A03
            X.7ab r1 = new X.7ab
            r1.<init>(r2, r0)
            r10.A06 = r1
            java.util.ArrayList r0 = r10.A0H
            r0.add(r1)
            goto L_0x018e
        L_0x01d4:
            r0 = 23
            if (r6 != r0) goto L_0x01e8
            r0 = 33
            if (r5 < r0) goto L_0x01e8
            r0 = 35
            if (r5 > r0) goto L_0x01e8
            X.7ab r1 = r10.A06
            int r0 = r5 + -32
            r1.A04 = r0
            goto L_0x0074
        L_0x01e8:
            r0 = 20
            if (r2 != r0) goto L_0x0074
            r1 = r5 & 240(0xf0, float:3.36E-43)
            r0 = 32
            if (r1 != r0) goto L_0x0074
            r1 = 2
            if (r5 == r0) goto L_0x028e
            r0 = 41
            r4 = 3
            if (r5 == r0) goto L_0x0289
            r2 = 1
            switch(r5) {
                case 37: goto L_0x026e;
                case 38: goto L_0x0272;
                case 39: goto L_0x027d;
                default: goto L_0x01fe;
            }
        L_0x01fe:
            int r1 = r10.A02
            if (r1 == 0) goto L_0x0074
            r0 = 33
            if (r5 == r0) goto L_0x0267
            switch(r5) {
                case 44: goto L_0x020b;
                case 45: goto L_0x0219;
                case 46: goto L_0x0071;
                case 47: goto L_0x025f;
                default: goto L_0x0209;
            }
        L_0x0209:
            goto L_0x0074
        L_0x020b:
            java.util.List r0 = java.util.Collections.emptyList()
            r10.A07 = r0
            int r0 = r10.A02
            if (r0 == r2) goto L_0x0071
            if (r0 != r4) goto L_0x0074
            goto L_0x0071
        L_0x0219:
            if (r1 != r2) goto L_0x0074
            X.7ab r1 = r10.A06
            java.util.List r0 = r1.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0237
            java.util.List r0 = r1.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0237
            java.lang.StringBuilder r0 = r1.A05
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0237
            goto L_0x0074
        L_0x0237:
            X.7ab r5 = r10.A06
            java.util.List r4 = r5.A07
            android.text.SpannableString r0 = r5.A00()
            r4.add(r0)
            java.lang.StringBuilder r0 = r5.A05
            r2 = 0
            r0.setLength(r2)
            java.util.List r0 = r5.A06
            r0.clear()
            int r1 = r5.A01
            int r0 = r5.A03
            int r1 = java.lang.Math.min(r1, r0)
        L_0x0255:
            int r0 = r4.size()
            if (r0 < r1) goto L_0x0074
            r4.remove(r2)
            goto L_0x0255
        L_0x025f:
            java.util.List r0 = r10.A03()
            r10.A07 = r0
            goto L_0x0071
        L_0x0267:
            X.7ab r0 = r10.A06
            r0.A02()
            goto L_0x0074
        L_0x026e:
            r10.A05(r2)
            goto L_0x0281
        L_0x0272:
            r10.A05(r2)
            r10.A03 = r4
            X.7ab r0 = r10.A06
            r0.A01 = r4
            goto L_0x0074
        L_0x027d:
            r10.A05(r2)
            r1 = 4
        L_0x0281:
            r10.A03 = r1
            X.7ab r0 = r10.A06
            r0.A01 = r1
            goto L_0x0074
        L_0x0289:
            r10.A05(r4)
            goto L_0x0074
        L_0x028e:
            r10.A05(r1)
            goto L_0x0074
        L_0x0293:
            int r0 = r3.A0C()
            byte r8 = (byte) r0
            goto L_0x0020
        L_0x029a:
            if (r9 == 0) goto L_0x02ad
            int r1 = r10.A02
            if (r1 == r0) goto L_0x02a3
            r0 = 3
            if (r1 != r0) goto L_0x02ad
        L_0x02a3:
            java.util.List r0 = r10.A03()
            r10.A07 = r0
            long r0 = r10.A00
            r10.A05 = r0
        L_0x02ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126766Pf.A02(X.6Oa):void");
    }

    public final List A03() {
        ArrayList arrayList = this.A0H;
        int size = arrayList.size();
        ArrayList A0I2 = AnonymousClass002.A0I(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C157037hc A012 = ((C153057ab) arrayList.get(i2)).A01(Integer.MIN_VALUE);
            A0I2.add(A012);
            if (A012 != null) {
                i = Math.min(i, A012.A08);
            }
        }
        ArrayList A0I3 = AnonymousClass002.A0I(size);
        for (int i3 = 0; i3 < size; i3++) {
            C157037hc r1 = (C157037hc) A0I2.get(i3);
            if (r1 != null) {
                if (r1.A08 != i) {
                    r1 = ((C153057ab) arrayList.get(i3)).A01(i);
                    r1.getClass();
                }
                A0I3.add(r1);
            }
        }
        return A0I3;
    }

    public final void A04() {
        C153057ab r2 = this.A06;
        r2.A00 = this.A02;
        r2.A06.clear();
        r2.A07.clear();
        r2.A05.setLength(0);
        r2.A03 = 15;
        r2.A02 = 0;
        r2.A04 = 0;
        ArrayList arrayList = this.A0H;
        arrayList.clear();
        arrayList.add(this.A06);
    }

    public final void A05(int i) {
        int i2 = this.A02;
        if (i2 != i) {
            this.A02 = i;
            if (i == 3) {
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.A0H;
                    if (i3 < arrayList.size()) {
                        ((C153057ab) arrayList.get(i3)).A00 = 3;
                        i3++;
                    } else {
                        return;
                    }
                }
            } else {
                A04();
                if (i2 == 3 || i == 1 || i == 0) {
                    this.A07 = Collections.emptyList();
                }
            }
        }
    }

    public C126766Pf(String str, int i) {
        this.A0C = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.A0D = 0;
                } else if (i != 4) {
                    Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                } else {
                    this.A0D = 1;
                }
                this.A0E = 1;
                A05(0);
                A04();
                this.A0A = true;
                this.A05 = -9223372036854775807L;
            }
            this.A0D = 1;
            this.A0E = 0;
            A05(0);
            A04();
            this.A0A = true;
            this.A05 = -9223372036854775807L;
        }
        this.A0D = 0;
        this.A0E = 0;
        A05(0);
        A04();
        this.A0A = true;
        this.A05 = -9223372036854775807L;
    }

    public C126506Oe A01() {
        C126506Oe A012 = super.B1V();
        if (A012 == null) {
            long j = this.A0F;
            if (j == -9223372036854775807L) {
                return null;
            }
            long j2 = this.A05;
            if (j2 == -9223372036854775807L || this.A00 - j2 < j || (A012 = (C126506Oe) this.A04.pollFirst()) == null) {
                return null;
            }
            List emptyList = Collections.emptyList();
            this.A07 = emptyList;
            this.A05 = -9223372036854775807L;
            this.A08 = emptyList;
            emptyList.getClass();
            AnonymousClass88F r2 = new AnonymousClass88F(emptyList);
            long j3 = this.A00;
            A012.timeUs = j3;
            A012.A01 = r2;
            A012.A00 = j3;
        }
        return A012;
    }

    public void flush() {
        super.flush();
        this.A07 = null;
        this.A08 = null;
        A05(0);
        this.A03 = 4;
        this.A06.A01 = 4;
        A04();
        this.A09 = false;
        this.A0B = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A04 = 0;
        this.A0A = true;
        this.A05 = -9223372036854775807L;
    }
}
