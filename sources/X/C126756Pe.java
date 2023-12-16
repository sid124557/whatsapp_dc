package X;

import java.util.List;

/* renamed from: X.6Pe  reason: invalid class name and case insensitive filesystem */
public final class C126756Pe extends AnonymousClass88O {
    public int A00;
    public int A01 = -1;
    public C160597nw A02;
    public AnonymousClass7M8 A03;
    public List A04;
    public List A05;
    public final int A06;
    public final C160807oL A07 = new C160807oL();
    public final C161467pi A08 = new C161467pi();
    public final C160597nw[] A09;

    public static int A00(C160807oL r4) {
        return C160597nw.A00(r4.A04(2), r4.A04(2), r4.A04(2), r4.A04(2));
    }

    public final void A05() {
        int i = 0;
        do {
            this.A09[i].A02();
            i++;
        } while (i < 8);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02a5, code lost:
        if (r2.A0D() == false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02a7, code lost:
        r1 = r3.A09[8 - r7];
        r1.A0J = !r1.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02b3, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02be, code lost:
        if (r2.A0D() == false) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02c0, code lost:
        r3.A09[8 - r7].A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02c9, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02d2, code lost:
        if (r2.A0D() == false) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02d4, code lost:
        r3.A09[8 - r7].A0J = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02dd, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02e6, code lost:
        if (r2.A0D() == false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02e8, code lost:
        r1 = r3.A09[8 - r7];
        r1.A0L.clear();
        r1.A0K.clear();
        r1.A06 = -1;
        r1.A0C = -1;
        r1.A04 = -1;
        r1.A02 = -1;
        r1.A0A = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0304, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03dc, code lost:
        r2.A09(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x047f, code lost:
        if (r3.A00 == r8) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0481, code lost:
        r3.A00 = r8;
        r3.A02 = r3.A09[r8];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0491, code lost:
        X.AnonymousClass6C7.A1I(r0, "Cea708Decoder", r1, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r17 = this;
            r3 = r17
            X.7M8 r6 = r3.A03
            if (r6 == 0) goto L_0x0083
            int r5 = r6.A00
            int r0 = r6.A01
            r7 = 2
            int r2 = r0 * 2
            r0 = 1
            int r2 = r2 - r0
            java.lang.String r4 = "Cea708Decoder"
            if (r5 == r2) goto L_0x003a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DtvCcPacket ended prematurely; size is "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", but current index is "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " (sequence number "
            r1.append(r0)
            int r0 = r6.A02
            r1.append(r0)
            java.lang.String r0 = ");"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.util.Log.d(r4, r0)
        L_0x003a:
            X.7oL r2 = r3.A07
            X.7M8 r1 = r3.A03
            byte[] r0 = r1.A03
            int r1 = r1.A00
            r2.A03 = r0
            r0 = 0
            r2.A02 = r0
            r2.A00 = r0
            r2.A01 = r1
            r0 = 3
            int r6 = r2.A04(r0)
            r0 = 5
            int r5 = r2.A04(r0)
            r1 = 7
            if (r6 != r1) goto L_0x006b
            r2.A09(r7)
            r0 = 6
            int r6 = r2.A04(r0)
            if (r6 >= r1) goto L_0x006b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid extended service number: "
            X.AnonymousClass6C7.A1I(r0, r4, r1, r6)
        L_0x006b:
            if (r5 != 0) goto L_0x0084
            if (r6 == 0) goto L_0x0080
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "serviceNumber is non-zero ("
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ") when blockSize is 0"
            X.AnonymousClass000.A1F(r0, r4, r1)
        L_0x0080:
            r0 = 0
            r3.A03 = r0
        L_0x0083:
            return
        L_0x0084:
            int r0 = r3.A06
            if (r6 != r0) goto L_0x0080
            r10 = 0
        L_0x0089:
            int r0 = X.C160807oL.A00(r2)
            if (r0 <= 0) goto L_0x0496
            r6 = 8
            int r5 = r2.A04(r6)
            r9 = 16
            r8 = 255(0xff, float:3.57E-43)
            r7 = 159(0x9f, float:2.23E-43)
            r1 = 127(0x7f, float:1.78E-43)
            r0 = 31
            if (r5 == r9) goto L_0x00f7
            if (r5 > r0) goto L_0x0219
            if (r5 == 0) goto L_0x0089
            r0 = 3
            if (r5 == r0) goto L_0x00f0
            r7 = 8
            if (r5 == r6) goto L_0x00e0
            switch(r5) {
                case 12: goto L_0x00dc;
                case 13: goto L_0x00d4;
                case 14: goto L_0x0089;
                default: goto L_0x00af;
            }
        L_0x00af:
            r0 = 17
            if (r5 < r0) goto L_0x00cc
            r0 = 23
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r5 > r0) goto L_0x00c4
            java.lang.String r0 = "Currently unsupported COMMAND_EXT1 Command: "
            X.AnonymousClass6C7.A1I(r0, r4, r1, r5)
        L_0x00c0:
            r2.A09(r7)
            goto L_0x0089
        L_0x00c4:
            java.lang.String r0 = "Currently unsupported COMMAND_P16 Command: "
            X.AnonymousClass6C7.A1I(r0, r4, r1, r5)
            r7 = 16
            goto L_0x00c0
        L_0x00cc:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid C0 command: "
            goto L_0x020e
        L_0x00d4:
            X.7nw r1 = r3.A02
            r0 = 10
            r1.A03(r0)
            goto L_0x0089
        L_0x00dc:
            r3.A05()
            goto L_0x0089
        L_0x00e0:
            X.7nw r0 = r3.A02
            android.text.SpannableStringBuilder r5 = r0.A0K
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x0089
            int r0 = r1 + -1
            r5.delete(r0, r1)
            goto L_0x0089
        L_0x00f0:
            java.util.List r0 = r3.A03()
            r3.A04 = r0
            goto L_0x0089
        L_0x00f7:
            int r5 = r2.A04(r6)
            if (r5 > r0) goto L_0x0111
            r0 = 7
            if (r5 <= r0) goto L_0x0089
            r0 = 15
            if (r5 <= r0) goto L_0x010c
            r0 = 23
            r6 = 24
            if (r5 > r0) goto L_0x010c
            r6 = 16
        L_0x010c:
            r2.A09(r6)
            goto L_0x0089
        L_0x0111:
            if (r5 > r1) goto L_0x0149
            r1 = 32
            if (r5 == r1) goto L_0x01db
            r0 = 33
            if (r5 == r0) goto L_0x01d6
            r0 = 37
            if (r5 == r0) goto L_0x01d1
            r0 = 42
            if (r5 == r0) goto L_0x01cc
            r0 = 44
            if (r5 == r0) goto L_0x01c7
            r0 = 63
            if (r5 == r0) goto L_0x01c2
            r0 = 57
            if (r5 == r0) goto L_0x01bd
            r0 = 58
            if (r5 == r0) goto L_0x01b8
            r0 = 60
            if (r5 == r0) goto L_0x01b3
            r0 = 61
            if (r5 == r0) goto L_0x01ae
            switch(r5) {
                case 48: goto L_0x01a9;
                case 49: goto L_0x01a4;
                case 50: goto L_0x019f;
                case 51: goto L_0x019a;
                case 52: goto L_0x0195;
                case 53: goto L_0x0190;
                default: goto L_0x013e;
            }
        L_0x013e:
            switch(r5) {
                case 118: goto L_0x01de;
                case 119: goto L_0x018b;
                case 120: goto L_0x0186;
                case 121: goto L_0x0181;
                case 122: goto L_0x017c;
                case 123: goto L_0x0177;
                case 124: goto L_0x0172;
                case 125: goto L_0x016d;
                case 126: goto L_0x0168;
                case 127: goto L_0x0163;
                default: goto L_0x0141;
            }
        L_0x0141:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid G2 character: "
            goto L_0x0491
        L_0x0149:
            if (r5 > r7) goto L_0x01e6
            r0 = 135(0x87, float:1.89E-43)
            r6 = 32
            if (r5 <= r0) goto L_0x010c
            r0 = 143(0x8f, float:2.0E-43)
            r6 = 40
            if (r5 <= r0) goto L_0x010c
            r0 = 2
            r2.A09(r0)
            r0 = 6
            int r0 = r2.A04(r0)
            int r6 = r0 * 8
            goto L_0x010c
        L_0x0163:
            X.7nw r0 = r3.A02
            r1 = 9484(0x250c, float:1.329E-41)
            goto L_0x01e2
        L_0x0168:
            X.7nw r0 = r3.A02
            r1 = 9496(0x2518, float:1.3307E-41)
            goto L_0x01e2
        L_0x016d:
            X.7nw r0 = r3.A02
            r1 = 9472(0x2500, float:1.3273E-41)
            goto L_0x01e2
        L_0x0172:
            X.7nw r0 = r3.A02
            r1 = 9492(0x2514, float:1.3301E-41)
            goto L_0x01e2
        L_0x0177:
            X.7nw r0 = r3.A02
            r1 = 9488(0x2510, float:1.3296E-41)
            goto L_0x01e2
        L_0x017c:
            X.7nw r0 = r3.A02
            r1 = 9474(0x2502, float:1.3276E-41)
            goto L_0x01e2
        L_0x0181:
            X.7nw r0 = r3.A02
            r1 = 8542(0x215e, float:1.197E-41)
            goto L_0x01e2
        L_0x0186:
            X.7nw r0 = r3.A02
            r1 = 8541(0x215d, float:1.1968E-41)
            goto L_0x01e2
        L_0x018b:
            X.7nw r0 = r3.A02
            r1 = 8540(0x215c, float:1.1967E-41)
            goto L_0x01e2
        L_0x0190:
            X.7nw r0 = r3.A02
            r1 = 8226(0x2022, float:1.1527E-41)
            goto L_0x01e2
        L_0x0195:
            X.7nw r0 = r3.A02
            r1 = 8221(0x201d, float:1.152E-41)
            goto L_0x01e2
        L_0x019a:
            X.7nw r0 = r3.A02
            r1 = 8220(0x201c, float:1.1519E-41)
            goto L_0x01e2
        L_0x019f:
            X.7nw r0 = r3.A02
            r1 = 8217(0x2019, float:1.1514E-41)
            goto L_0x01e2
        L_0x01a4:
            X.7nw r0 = r3.A02
            r1 = 8216(0x2018, float:1.1513E-41)
            goto L_0x01e2
        L_0x01a9:
            X.7nw r0 = r3.A02
            r1 = 9608(0x2588, float:1.3464E-41)
            goto L_0x01e2
        L_0x01ae:
            X.7nw r0 = r3.A02
            r1 = 8480(0x2120, float:1.1883E-41)
            goto L_0x01e2
        L_0x01b3:
            X.7nw r0 = r3.A02
            r1 = 339(0x153, float:4.75E-43)
            goto L_0x01e2
        L_0x01b8:
            X.7nw r0 = r3.A02
            r1 = 353(0x161, float:4.95E-43)
            goto L_0x01e2
        L_0x01bd:
            X.7nw r0 = r3.A02
            r1 = 8482(0x2122, float:1.1886E-41)
            goto L_0x01e2
        L_0x01c2:
            X.7nw r0 = r3.A02
            r1 = 376(0x178, float:5.27E-43)
            goto L_0x01e2
        L_0x01c7:
            X.7nw r0 = r3.A02
            r1 = 338(0x152, float:4.74E-43)
            goto L_0x01e2
        L_0x01cc:
            X.7nw r0 = r3.A02
            r1 = 352(0x160, float:4.93E-43)
            goto L_0x01e2
        L_0x01d1:
            X.7nw r0 = r3.A02
            r1 = 8230(0x2026, float:1.1533E-41)
            goto L_0x01e2
        L_0x01d6:
            X.7nw r0 = r3.A02
            r1 = 160(0xa0, float:2.24E-43)
            goto L_0x01e2
        L_0x01db:
            X.7nw r0 = r3.A02
            goto L_0x01e2
        L_0x01de:
            X.7nw r0 = r3.A02
            r1 = 8539(0x215b, float:1.1966E-41)
        L_0x01e2:
            r0.A03(r1)
            goto L_0x0224
        L_0x01e6:
            if (r5 > r8) goto L_0x01ff
            r0 = 160(0xa0, float:2.24E-43)
            if (r5 != r0) goto L_0x01f1
            X.7nw r1 = r3.A02
            r0 = 13252(0x33c4, float:1.857E-41)
            goto L_0x0221
        L_0x01f1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid G3 character: "
            X.AnonymousClass6C7.A1I(r0, r4, r1, r5)
            X.7nw r1 = r3.A02
            r0 = 95
            goto L_0x0221
        L_0x01ff:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid extended command: "
            goto L_0x020e
        L_0x0206:
            if (r5 <= r8) goto L_0x0213
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid base command: "
        L_0x020e:
            X.AnonymousClass6C7.A1I(r0, r4, r1, r5)
            goto L_0x0089
        L_0x0213:
            X.7nw r1 = r3.A02
            r0 = r5 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            goto L_0x0221
        L_0x0219:
            if (r5 > r1) goto L_0x0227
            if (r5 != r1) goto L_0x0213
            X.7nw r1 = r3.A02
            r0 = 9835(0x266b, float:1.3782E-41)
        L_0x0221:
            r1.A03(r0)
        L_0x0224:
            r10 = 1
            goto L_0x0089
        L_0x0227:
            if (r5 > r7) goto L_0x0206
            r1 = 16
            r7 = 1
            switch(r5) {
                case 128: goto L_0x0422;
                case 129: goto L_0x0422;
                case 130: goto L_0x0422;
                case 131: goto L_0x0422;
                case 132: goto L_0x0422;
                case 133: goto L_0x0422;
                case 134: goto L_0x0422;
                case 135: goto L_0x0422;
                case 136: goto L_0x02e2;
                case 137: goto L_0x040e;
                case 138: goto L_0x02ce;
                case 139: goto L_0x02a1;
                case 140: goto L_0x02ba;
                case 141: goto L_0x0409;
                case 142: goto L_0x0224;
                case 143: goto L_0x0404;
                case 144: goto L_0x0367;
                case 145: goto L_0x03d4;
                case 146: goto L_0x0344;
                case 147: goto L_0x048b;
                case 148: goto L_0x048b;
                case 149: goto L_0x048b;
                case 150: goto L_0x048b;
                case 151: goto L_0x0307;
                default: goto L_0x022f;
            }
        L_0x022f:
            int r8 = r5 + -152
            X.7nw[] r0 = r3.A09
            r9 = r0[r8]
            r12 = 2
            r2.A09(r12)
            boolean r15 = r2.A0D()
            boolean r14 = r2.A0D()
            r2.A06()
            r13 = 3
            int r11 = r2.A04(r13)
            boolean r10 = r2.A0D()
            r0 = 7
            int r5 = r2.A04(r0)
            int r6 = r2.A04(r6)
            r0 = 4
            int r1 = r2.A04(r0)
            int r16 = r2.A04(r0)
            r2.A09(r12)
            r0 = 6
            r2.A04(r0)
            int r0 = X.C160807oL.A01(r2, r12, r13)
            int r13 = r2.A04(r13)
            r9.A0G = r7
            r9.A0J = r15
            r9.A0I = r14
            r9.A09 = r11
            r9.A0H = r10
            r9.A0D = r5
            r9.A05 = r6
            r9.A00 = r1
            int r5 = r9.A0B
            int r1 = r16 + 1
            if (r5 == r1) goto L_0x0425
            r9.A0B = r1
        L_0x0286:
            if (r14 == 0) goto L_0x0292
            java.util.List r6 = r9.A0L
            int r5 = r6.size()
            int r1 = r9.A0B
            if (r5 >= r1) goto L_0x029c
        L_0x0292:
            java.util.List r6 = r9.A0L
            int r5 = r6.size()
            r1 = 15
            if (r5 < r1) goto L_0x0425
        L_0x029c:
            r1 = 0
            r6.remove(r1)
            goto L_0x0286
        L_0x02a1:
            boolean r0 = r2.A0D()
            if (r0 == 0) goto L_0x02b3
            X.7nw[] r1 = r3.A09
            int r0 = 8 - r7
            r1 = r1[r0]
            boolean r0 = r1.A0J
            r0 = r0 ^ 1
            r1.A0J = r0
        L_0x02b3:
            int r7 = r7 + 1
            if (r7 > r6) goto L_0x0224
            goto L_0x02a1
        L_0x02b8:
            if (r7 > r6) goto L_0x0224
        L_0x02ba:
            boolean r0 = r2.A0D()
            if (r0 == 0) goto L_0x02c9
            X.7nw[] r1 = r3.A09
            int r0 = 8 - r7
            r0 = r1[r0]
            r0.A02()
        L_0x02c9:
            int r7 = r7 + 1
            goto L_0x02b8
        L_0x02cc:
            if (r7 > r6) goto L_0x0224
        L_0x02ce:
            boolean r0 = r2.A0D()
            if (r0 == 0) goto L_0x02dd
            X.7nw[] r1 = r3.A09
            int r0 = 8 - r7
            r1 = r1[r0]
            r0 = 0
            r1.A0J = r0
        L_0x02dd:
            int r7 = r7 + 1
            goto L_0x02cc
        L_0x02e0:
            if (r7 > r6) goto L_0x0224
        L_0x02e2:
            boolean r0 = r2.A0D()
            if (r0 == 0) goto L_0x0304
            X.7nw[] r1 = r3.A09
            int r0 = 8 - r7
            r1 = r1[r0]
            java.util.List r0 = r1.A0L
            r0.clear()
            android.text.SpannableStringBuilder r0 = r1.A0K
            r0.clear()
            r0 = -1
            r1.A06 = r0
            r1.A0C = r0
            r1.A04 = r0
            r1.A02 = r0
            r0 = 0
            r1.A0A = r0
        L_0x0304:
            int r7 = r7 + 1
            goto L_0x02e0
        L_0x0307:
            X.7nw r0 = r3.A02
            boolean r0 = r0.A0G
            if (r0 != 0) goto L_0x0311
            r1 = 32
            goto L_0x03dc
        L_0x0311:
            r9 = 2
            int r8 = A00(r2)
            r2.A04(r9)
            int r7 = r2.A04(r9)
            int r5 = r2.A04(r9)
            int r1 = r2.A04(r9)
            r0 = 0
            X.C160597nw.A00(r7, r5, r1, r0)
            r2.A06()
            r2.A06()
            r2.A04(r9)
            r2.A04(r9)
            int r1 = r2.A04(r9)
            r2.A09(r6)
            X.7nw r0 = r3.A02
            r0.A0E = r8
            r0.A07 = r1
            goto L_0x0224
        L_0x0344:
            X.7nw r5 = r3.A02
            boolean r0 = r5.A0G
            if (r0 == 0) goto L_0x03dc
            r0 = 4
            r2.A09(r0)
            int r1 = r2.A04(r0)
            r0 = 2
            r2.A09(r0)
            r0 = 6
            r2.A04(r0)
            int r0 = r5.A0A
            if (r0 == r1) goto L_0x0363
            r0 = 10
            r5.A03(r0)
        L_0x0363:
            r5.A0A = r1
            goto L_0x0224
        L_0x0367:
            X.7nw r7 = r3.A02
            boolean r0 = r7.A0G
            if (r0 == 0) goto L_0x03dc
            r0 = 4
            r2.A04(r0)
            r0 = 2
            r2.A04(r0)
            r2.A04(r0)
            boolean r1 = r2.A0D()
            boolean r10 = r2.A0D()
            r0 = 3
            r2.A04(r0)
            r2.A04(r0)
            int r0 = r7.A06
            r9 = 33
            r8 = -1
            if (r0 == r8) goto L_0x03bd
            if (r1 != 0) goto L_0x03a3
            android.text.SpannableStringBuilder r6 = r7.A0K
            r0 = 2
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r0)
            int r1 = r7.A06
            int r0 = r6.length()
            r6.setSpan(r5, r1, r0, r9)
            r7.A06 = r8
        L_0x03a3:
            int r0 = r7.A0C
            if (r0 == r8) goto L_0x03c8
            if (r10 != 0) goto L_0x0224
            android.text.SpannableStringBuilder r6 = r7.A0K
            android.text.style.UnderlineSpan r5 = new android.text.style.UnderlineSpan
            r5.<init>()
            int r1 = r7.A0C
            int r0 = r6.length()
            r6.setSpan(r5, r1, r0, r9)
            r7.A0C = r8
            goto L_0x0224
        L_0x03bd:
            if (r1 == 0) goto L_0x03a3
            android.text.SpannableStringBuilder r0 = r7.A0K
            int r0 = r0.length()
            r7.A06 = r0
            goto L_0x03a3
        L_0x03c8:
            if (r10 == 0) goto L_0x0224
            android.text.SpannableStringBuilder r0 = r7.A0K
            int r0 = r0.length()
            r7.A0C = r0
            goto L_0x0224
        L_0x03d4:
            X.7nw r0 = r3.A02
            boolean r0 = r0.A0G
            if (r0 != 0) goto L_0x03e1
            r1 = 24
        L_0x03dc:
            r2.A09(r1)
            goto L_0x0224
        L_0x03e1:
            r0 = 2
            int r8 = A00(r2)
            int r7 = A00(r2)
            r2.A09(r0)
            int r6 = r2.A04(r0)
            int r5 = r2.A04(r0)
            int r1 = r2.A04(r0)
            r0 = 0
            X.C160597nw.A00(r6, r5, r1, r0)
            X.7nw r0 = r3.A02
            r0.A04(r8, r7)
            goto L_0x0224
        L_0x0404:
            r3.A05()
            goto L_0x0224
        L_0x0409:
            r2.A09(r6)
            goto L_0x0224
        L_0x040e:
            r5 = 1
        L_0x040f:
            boolean r0 = r2.A0D()
            if (r0 == 0) goto L_0x041d
            X.7nw[] r1 = r3.A09
            int r0 = 8 - r5
            r0 = r1[r0]
            r0.A0J = r7
        L_0x041d:
            int r5 = r5 + 1
            if (r5 > r6) goto L_0x0224
            goto L_0x040f
        L_0x0422:
            int r8 = r5 + -128
            goto L_0x047d
        L_0x0425:
            if (r0 == 0) goto L_0x043b
            int r1 = r9.A0F
            if (r1 == r0) goto L_0x043b
            r9.A0F = r0
            int r5 = r0 + -1
            int[] r0 = X.C160597nw.A0P
            r1 = r0[r5]
            int[] r0 = X.C160597nw.A0Q
            r0 = r0[r5]
            r9.A0E = r1
            r9.A07 = r0
        L_0x043b:
            if (r13 == 0) goto L_0x047d
            int r0 = r9.A08
            if (r0 == r13) goto L_0x047d
            r9.A08 = r13
            int r11 = r13 + -1
            int r0 = r9.A06
            r10 = 33
            r7 = -1
            if (r0 == r7) goto L_0x045e
            android.text.SpannableStringBuilder r6 = r9.A0K
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r12)
            int r1 = r9.A06
            int r0 = r6.length()
            r6.setSpan(r5, r1, r0, r10)
            r9.A06 = r7
        L_0x045e:
            int r0 = r9.A0C
            if (r0 == r7) goto L_0x0474
            android.text.SpannableStringBuilder r6 = r9.A0K
            android.text.style.UnderlineSpan r5 = new android.text.style.UnderlineSpan
            r5.<init>()
            int r1 = r9.A0C
            int r0 = r6.length()
            r6.setSpan(r5, r1, r0, r10)
            r9.A0C = r7
        L_0x0474:
            int r1 = X.C160597nw.A0N
            int[] r0 = X.C160597nw.A0O
            r0 = r0[r11]
            r9.A04(r1, r0)
        L_0x047d:
            int r0 = r3.A00
            if (r0 == r8) goto L_0x0224
            r3.A00 = r8
            X.7nw[] r0 = r3.A09
            r0 = r0[r8]
            r3.A02 = r0
            goto L_0x0224
        L_0x048b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid C1 command: "
        L_0x0491:
            X.AnonymousClass6C7.A1I(r0, r4, r1, r5)
            goto L_0x0224
        L_0x0496:
            if (r10 == 0) goto L_0x0080
            java.util.List r0 = r3.A03()
            r3.A04 = r0
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126756Pe.A04():void");
    }

    public C126756Pe(List list, int i) {
        this.A06 = i == -1 ? 1 : i;
        if (list != null && list.size() == 1 && AnonymousClass6C9.A1V(list, 0).length == 1) {
            list.get(0);
        }
        this.A09 = new C160597nw[8];
        int i2 = 0;
        do {
            this.A09[i2] = new C160597nw();
            i2++;
        } while (i2 < 8);
        this.A02 = this.A09[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A03() {
        /*
            r17 = this;
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r2 = 0
            r1 = 0
        L_0x0006:
            r0 = r17
            X.7nw[] r5 = r0.A09
            r4 = r5[r1]
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0020
            java.util.List r0 = r4.A0L
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0043
            android.text.SpannableStringBuilder r0 = r4.A0K
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0043
        L_0x0020:
            int r1 = r1 + 1
            r0 = 8
            if (r1 < r0) goto L_0x0006
            java.util.Comparator r0 = X.C156207gE.A02
            java.util.Collections.sort(r3, r0)
            java.util.ArrayList r1 = X.C18290x4.A0y(r3)
        L_0x002f:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x00f3
            java.lang.Object r0 = r3.get(r2)
            X.7gE r0 = (X.C156207gE) r0
            X.7hc r0 = r0.A01
            r1.add(r0)
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0043:
            r0 = r5[r1]
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x0020
            r4 = r5[r1]
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0020
            java.util.List r6 = r4.A0L
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0060
            android.text.SpannableStringBuilder r0 = r4.A0K
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0060
            goto L_0x0020
        L_0x0060:
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>()
            r16 = 0
            r5 = 0
        L_0x0068:
            int r0 = r6.size()
            if (r5 >= r0) goto L_0x007f
            java.lang.Object r0 = r6.get(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            r0 = 10
            r9.append(r0)
            int r5 = r5 + 1
            goto L_0x0068
        L_0x007f:
            android.text.SpannableString r0 = r4.A01()
            r9.append(r0)
            int r7 = r4.A07
            r0 = 2
            r6 = 3
            r5 = 1
            if (r7 == 0) goto L_0x00a1
            if (r7 == r5) goto L_0x009e
            if (r7 == r0) goto L_0x00a4
            if (r7 == r6) goto L_0x00a1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected justification value: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r7)
            throw r0
        L_0x009e:
            android.text.Layout$Alignment r8 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x00a6
        L_0x00a1:
            android.text.Layout$Alignment r8 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x00a6
        L_0x00a4:
            android.text.Layout$Alignment r8 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x00a6:
            boolean r7 = r4.A0H
            int r0 = r4.A05
            float r11 = (float) r0
            if (r7 == 0) goto L_0x00e9
            r7 = 1120272384(0x42c60000, float:99.0)
            float r11 = r11 / r7
            int r0 = r4.A0D
            float r10 = (float) r0
            float r10 = r10 / r7
        L_0x00b4:
            r7 = 1063675494(0x3f666666, float:0.9)
            float r11 = r11 * r7
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            float r11 = r11 + r0
            float r10 = r10 * r7
            float r10 = r10 + r0
            int r7 = r4.A00
            int r0 = r7 / 3
            if (r0 != 0) goto L_0x00e4
            r12 = 0
        L_0x00c5:
            int r0 = r7 % 3
            if (r0 != 0) goto L_0x00de
            r13 = 0
        L_0x00ca:
            int r14 = r4.A0E
            int r0 = X.C160597nw.A0M
            if (r14 == r0) goto L_0x00d2
            r16 = 1
        L_0x00d2:
            int r15 = r4.A09
            X.7gE r7 = new X.7gE
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.add(r7)
            goto L_0x0020
        L_0x00de:
            int r7 = r7 % r6
            r13 = 2
            if (r7 != r5) goto L_0x00ca
            r13 = 1
            goto L_0x00ca
        L_0x00e4:
            r12 = 2
            if (r0 != r5) goto L_0x00c5
            r12 = 1
            goto L_0x00c5
        L_0x00e9:
            r0 = 1129381888(0x43510000, float:209.0)
            float r11 = r11 / r0
            int r0 = r4.A0D
            float r10 = (float) r0
            r0 = 1116995584(0x42940000, float:74.0)
            float r10 = r10 / r0
            goto L_0x00b4
        L_0x00f3:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C126756Pe.A03():java.util.List");
    }

    public void flush() {
        super.flush();
        this.A04 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A02 = this.A09[0];
        A05();
        this.A03 = null;
    }
}
