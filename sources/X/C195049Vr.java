package X;

import android.graphics.Rect;
import android.hardware.Camera;
import java.util.List;

/* renamed from: X.9Vr  reason: invalid class name and case insensitive filesystem */
public abstract class C195049Vr {
    public static final AnonymousClass9Mx A00 = A03(11);
    public static final AnonymousClass9Mx A01 = A03(48);
    public static final AnonymousClass9Mx A02 = A03(55);
    public static final AnonymousClass9Mx A03 = A03(49);
    public static final AnonymousClass9Mx A04 = A03(50);
    public static final AnonymousClass9Mx A05 = A03(51);
    public static final AnonymousClass9Mx A06 = A03(12);
    public static final AnonymousClass9Mx A07 = A03(47);
    public static final AnonymousClass9Mx A08 = A03(13);
    public static final AnonymousClass9Mx A09 = A03(46);
    public static final AnonymousClass9Mx A0A = A03(10);
    public static final AnonymousClass9Mx A0B = A03(37);
    public static final AnonymousClass9Mx A0C = A03(9);
    public static final AnonymousClass9Mx A0D = A03(30);
    public static final AnonymousClass9Mx A0E = A03(32);
    public static final AnonymousClass9Mx A0F = A03(31);
    public static final AnonymousClass9Mx A0G = A03(42);
    public static final AnonymousClass9Mx A0H = A03(27);
    public static final AnonymousClass9Mx A0I = A03(63);
    public static final AnonymousClass9Mx A0J = A03(22);
    public static final AnonymousClass9Mx A0K = A03(6);
    public static final AnonymousClass9Mx A0L = A03(45);
    public static final AnonymousClass9Mx A0M = A03(53);
    public static final AnonymousClass9Mx A0N = A03(0);
    public static final AnonymousClass9Mx A0O = A03(56);
    public static final AnonymousClass9Mx A0P = A03(1);
    public static final AnonymousClass9Mx A0Q = A03(44);
    public static final AnonymousClass9Mx A0R = A03(5);
    public static final AnonymousClass9Mx A0S = A03(57);
    public static final AnonymousClass9Mx A0T = A03(2);
    public static final AnonymousClass9Mx A0U = A03(61);
    public static final AnonymousClass9Mx A0V = A03(4);
    public static final AnonymousClass9Mx A0W = A03(60);
    public static final AnonymousClass9Mx A0X = A03(3);
    public static final AnonymousClass9Mx A0Y = A03(14);
    public static final AnonymousClass9Mx A0Z = A03(15);
    public static final AnonymousClass9Mx A0a = A03(36);
    public static final AnonymousClass9Mx A0b = A03(54);
    public static final AnonymousClass9Mx A0c = A03(38);
    public static final AnonymousClass9Mx A0d = A03(21);
    public static final AnonymousClass9Mx A0e = A03(16);
    public static final AnonymousClass9Mx A0f = A03(17);
    public static final AnonymousClass9Mx A0g = A03(41);
    public static final AnonymousClass9Mx A0h = A03(34);
    public static final AnonymousClass9Mx A0i = A03(52);
    public static final AnonymousClass9Mx A0j = A03(18);
    public static final AnonymousClass9Mx A0k = A03(39);
    public static final AnonymousClass9Mx A0l = A03(19);
    public static final AnonymousClass9Mx A0m = A03(40);
    public static final AnonymousClass9Mx A0n = A03(33);
    public static final AnonymousClass9Mx A0o = A03(8);
    public static final AnonymousClass9Mx A0p = A03(23);
    public static final AnonymousClass9Mx A0q = A03(26);
    public static final AnonymousClass9Mx A0r = A03(62);
    public static final AnonymousClass9Mx A0s = A03(20);
    public static final AnonymousClass9Mx A0t = A03(59);
    public static final AnonymousClass9Mx A0u = A03(35);
    public static final AnonymousClass9Mx A0v = A03(24);
    public static final AnonymousClass9Mx A0w = A03(58);
    public static final AnonymousClass9Mx A0x = A03(25);

    public static AnonymousClass9Mx A03(int i) {
        return new AnonymousClass9Mx(i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (A02(A0p, r2) == 17) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0189, code lost:
        if (A02(A0p, r5) == 17) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x01a1, code lost:
        if (r5.A0I.intValue() != 0) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x01a8, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r2.A0W.intValue() == 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r4 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A08(X.AnonymousClass9Mx r10) {
        /*
            r9 = this;
            boolean r1 = r9 instanceof X.AnonymousClass96t
            if (r1 == 0) goto L_0x0112
            r2 = r9
            X.96t r2 = (X.AnonymousClass96t) r2
            int r6 = r10.A00
            r1 = 0
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            r4 = 1
            r3 = 0
            switch(r6) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0021;
                case 2: goto L_0x0024;
                case 3: goto L_0x002f;
                case 4: goto L_0x0032;
                case 5: goto L_0x0035;
                case 6: goto L_0x0038;
                case 7: goto L_0x003b;
                case 8: goto L_0x004a;
                case 9: goto L_0x004d;
                case 10: goto L_0x0050;
                case 11: goto L_0x0053;
                case 12: goto L_0x0056;
                case 13: goto L_0x0059;
                case 14: goto L_0x005c;
                case 15: goto L_0x005f;
                case 16: goto L_0x0062;
                case 17: goto L_0x0075;
                case 18: goto L_0x0078;
                case 19: goto L_0x007f;
                case 20: goto L_0x0082;
                case 21: goto L_0x0089;
                case 22: goto L_0x008c;
                case 23: goto L_0x008f;
                case 24: goto L_0x0092;
                case 25: goto L_0x0095;
                case 26: goto L_0x0098;
                case 27: goto L_0x009b;
                case 28: goto L_0x0020;
                case 29: goto L_0x0020;
                case 30: goto L_0x009e;
                case 31: goto L_0x00a1;
                case 32: goto L_0x00a4;
                case 33: goto L_0x00a7;
                case 34: goto L_0x00aa;
                case 35: goto L_0x00ad;
                case 36: goto L_0x00b0;
                case 37: goto L_0x00b3;
                case 38: goto L_0x00b6;
                case 39: goto L_0x00b9;
                case 40: goto L_0x00c7;
                case 41: goto L_0x00cf;
                case 42: goto L_0x00d7;
                case 43: goto L_0x00da;
                case 44: goto L_0x00dd;
                case 45: goto L_0x00e0;
                case 46: goto L_0x00e3;
                case 47: goto L_0x00e6;
                case 48: goto L_0x00e9;
                case 49: goto L_0x00ec;
                case 50: goto L_0x00ef;
                case 51: goto L_0x00f2;
                case 52: goto L_0x00f5;
                case 53: goto L_0x00f7;
                case 54: goto L_0x00fa;
                case 55: goto L_0x00fd;
                case 56: goto L_0x0100;
                case 57: goto L_0x0013;
                case 58: goto L_0x0103;
                case 59: goto L_0x0013;
                case 60: goto L_0x0106;
                case 61: goto L_0x0109;
                case 62: goto L_0x010c;
                case 63: goto L_0x010f;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "Invalid Settings key: "
            java.lang.RuntimeException r1 = X.C1899593h.A0Y(r1, r2, r6)
            throw r1
        L_0x001e:
            java.lang.Boolean r5 = r2.A0A
        L_0x0020:
            return r5
        L_0x0021:
            java.lang.Boolean r5 = r2.A0K
            return r5
        L_0x0024:
            X.9Mx r1 = A0p
            int r2 = A02(r1, r2)
            r1 = 17
            if (r2 != r1) goto L_0x0048
            goto L_0x0043
        L_0x002f:
            java.lang.Boolean r5 = r2.A0J
            return r5
        L_0x0032:
            java.lang.Boolean r5 = r2.A0G
            return r5
        L_0x0035:
            java.lang.Boolean r5 = r2.A0D
            return r5
        L_0x0038:
            java.lang.Boolean r5 = r2.A07
            return r5
        L_0x003b:
            java.lang.Integer r1 = r2.A0W
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x0048
        L_0x0043:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L_0x0048:
            r4 = 0
            goto L_0x0043
        L_0x004a:
            java.lang.Boolean r5 = r2.A0I
            return r5
        L_0x004d:
            java.lang.Integer r5 = r2.A0X
            return r5
        L_0x0050:
            java.lang.Integer r5 = r2.A0W
            return r5
        L_0x0053:
            java.lang.Integer r5 = r2.A0R
            return r5
        L_0x0056:
            java.lang.Integer r5 = r2.A0T
            return r5
        L_0x0059:
            java.lang.Integer r5 = r2.A0V
            return r5
        L_0x005c:
            java.lang.Integer r5 = r2.A0Z
            return r5
        L_0x005f:
            java.lang.Integer r5 = r2.A0a
            return r5
        L_0x0062:
            X.9T4 r1 = r2.A03
            if (r1 != 0) goto L_0x006b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            return r5
        L_0x006b:
            int r2 = r1.A02
            int r1 = r1.A01
            int r2 = r2 * r1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            return r5
        L_0x0075:
            java.lang.Integer r5 = r2.A0c
            return r5
        L_0x0078:
            r1 = 35
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            return r5
        L_0x007f:
            java.lang.Integer r5 = r2.A0d
            return r5
        L_0x0082:
            r1 = 30
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            return r5
        L_0x0089:
            java.lang.Integer r5 = r2.A0b
            return r5
        L_0x008c:
            java.lang.Integer r5 = r2.A0Y
            return r5
        L_0x008f:
            java.lang.Integer r5 = r2.A0e
            return r5
        L_0x0092:
            java.lang.Integer r5 = r2.A0f
            return r5
        L_0x0095:
            java.lang.Integer r5 = r2.A0g
            return r5
        L_0x0098:
            java.lang.Float r5 = r2.A0Q
            return r5
        L_0x009b:
            java.lang.Long r5 = r2.A0i
            return r5
        L_0x009e:
            java.lang.Double r5 = r2.A0L
            return r5
        L_0x00a1:
            java.lang.Double r5 = r2.A0N
            return r5
        L_0x00a4:
            java.lang.Double r5 = r2.A0M
            return r5
        L_0x00a7:
            X.9T4 r5 = r2.A04
            return r5
        L_0x00aa:
            X.9T4 r5 = r2.A03
            return r5
        L_0x00ad:
            X.9T4 r5 = r2.A05
            return r5
        L_0x00b0:
            X.9T4 r5 = r2.A02
            return r5
        L_0x00b3:
            java.util.List r5 = r2.A0m
            return r5
        L_0x00b6:
            java.util.List r5 = r2.A0n
            return r5
        L_0x00b9:
            r1 = 2
            int[] r5 = new int[r1]
            int[] r2 = r2.A0r
            r1 = r2[r3]
            r5[r3] = r1
            r1 = r2[r4]
            r5[r4] = r1
            return r5
        L_0x00c7:
            android.graphics.Rect r1 = r2.A01
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r1)
            return r5
        L_0x00cf:
            android.graphics.Rect r1 = r2.A00
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r1)
            return r5
        L_0x00d7:
            java.lang.String r5 = r2.A0k
            return r5
        L_0x00da:
            java.lang.String r5 = ""
            return r5
        L_0x00dd:
            java.lang.Boolean r5 = r2.A0C
            return r5
        L_0x00e0:
            java.lang.Boolean r5 = r2.A08
            return r5
        L_0x00e3:
            java.lang.Long r5 = r2.A0h
            return r5
        L_0x00e6:
            java.lang.Integer r5 = r2.A0U
            return r5
        L_0x00e9:
            java.lang.Float r5 = r2.A0O
            return r5
        L_0x00ec:
            float[] r5 = r2.A0o
            return r5
        L_0x00ef:
            java.lang.Integer r5 = r2.A0S
            return r5
        L_0x00f2:
            int[] r5 = r2.A0p
            return r5
        L_0x00f5:
            r5 = 0
            return r5
        L_0x00f7:
            java.lang.Boolean r5 = r2.A09
            return r5
        L_0x00fa:
            java.lang.Float r5 = r2.A0P
            return r5
        L_0x00fd:
            java.util.HashMap r5 = r2.A0l
            return r5
        L_0x0100:
            java.lang.Boolean r5 = r2.A0B
            return r5
        L_0x0103:
            X.9T4 r5 = r2.A06
            return r5
        L_0x0106:
            java.lang.Boolean r5 = r2.A0H
            return r5
        L_0x0109:
            java.lang.Boolean r5 = r2.A0F
            return r5
        L_0x010c:
            java.lang.Long r5 = r2.A0j
            return r5
        L_0x010f:
            java.lang.Boolean r5 = r2.A0E
            return r5
        L_0x0112:
            r5 = r9
            X.96s r5 = (X.AnonymousClass96s) r5
            int r3 = r10.A00
            r1 = 45
            if (r3 == r1) goto L_0x022e
            r1 = 52
            if (r3 == r1) goto L_0x022c
            r8 = 1
            r4 = 0
            switch(r3) {
                case 2: goto L_0x0181;
                case 3: goto L_0x018c;
                case 4: goto L_0x0229;
                case 5: goto L_0x0229;
                case 6: goto L_0x0229;
                case 7: goto L_0x018f;
                case 8: goto L_0x01aa;
                case 9: goto L_0x01ad;
                case 10: goto L_0x01b0;
                case 11: goto L_0x01b3;
                case 12: goto L_0x01b6;
                case 13: goto L_0x01b9;
                case 14: goto L_0x01bc;
                case 15: goto L_0x01bf;
                case 16: goto L_0x01c2;
                case 17: goto L_0x01d5;
                case 18: goto L_0x01d8;
                case 19: goto L_0x01db;
                case 20: goto L_0x01de;
                case 21: goto L_0x021a;
                case 22: goto L_0x021d;
                case 23: goto L_0x0220;
                case 24: goto L_0x0223;
                case 25: goto L_0x0226;
                default: goto L_0x0124;
            }
        L_0x0124:
            switch(r3) {
                case 27: goto L_0x0139;
                case 28: goto L_0x013c;
                case 29: goto L_0x013f;
                case 30: goto L_0x0142;
                case 31: goto L_0x0145;
                case 32: goto L_0x0148;
                case 33: goto L_0x014b;
                case 34: goto L_0x014e;
                case 35: goto L_0x0151;
                case 36: goto L_0x0154;
                case 37: goto L_0x0157;
                case 38: goto L_0x015a;
                case 39: goto L_0x015d;
                case 40: goto L_0x016b;
                case 41: goto L_0x0173;
                case 42: goto L_0x017b;
                case 43: goto L_0x017e;
                default: goto L_0x0127;
            }
        L_0x0127:
            r0 = 57
            if (r0 == r3) goto L_0x0136
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "Invalid Settings key: "
            java.lang.RuntimeException r1 = X.C1899593h.A0Y(r1, r2, r3)
            throw r1
        L_0x0136:
            java.lang.Boolean r3 = r5.A09
            return r3
        L_0x0139:
            java.lang.Long r3 = r5.A0V
            return r3
        L_0x013c:
            java.lang.Float r3 = r5.A0b
            return r3
        L_0x013f:
            java.lang.Float r3 = r5.A0a
            return r3
        L_0x0142:
            java.lang.Double r3 = r5.A0C
            return r3
        L_0x0145:
            java.lang.Double r3 = r5.A0E
            return r3
        L_0x0148:
            java.lang.Double r3 = r5.A0D
            return r3
        L_0x014b:
            X.9T4 r3 = r5.A04
            return r3
        L_0x014e:
            X.9T4 r3 = r5.A03
            return r3
        L_0x0151:
            X.9T4 r3 = r5.A05
            return r3
        L_0x0154:
            X.9T4 r3 = r5.A02
            return r3
        L_0x0157:
            java.util.List r3 = r5.A0X
            return r3
        L_0x015a:
            java.util.List r3 = r5.A0Y
            return r3
        L_0x015d:
            r1 = 2
            int[] r3 = new int[r1]
            int[] r2 = r5.A0d
            r1 = r2[r4]
            r3[r4] = r1
            r1 = r2[r8]
            r3[r8] = r1
            return r3
        L_0x016b:
            android.graphics.Rect r1 = r5.A01
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r1)
            return r3
        L_0x0173:
            android.graphics.Rect r1 = r5.A00
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r1)
            return r3
        L_0x017b:
            java.lang.String r3 = r5.A0W
            return r3
        L_0x017e:
            java.lang.String r3 = r5.A0c
            return r3
        L_0x0181:
            X.9Mx r1 = A0p
            int r2 = A02(r1, r5)
            r1 = 17
            if (r2 != r1) goto L_0x01a8
            goto L_0x01a3
        L_0x018c:
            java.lang.Boolean r3 = r5.A0A
            return r3
        L_0x018f:
            java.lang.Integer r1 = r5.A0I
            r1.getClass()
            int r2 = r1.intValue()
            r1 = -1
            if (r2 == r1) goto L_0x01a3
            java.lang.Integer r1 = r5.A0I
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x01a8
        L_0x01a3:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            return r3
        L_0x01a8:
            r8 = 0
            goto L_0x01a3
        L_0x01aa:
            java.lang.Boolean r3 = r5.A0B
            return r3
        L_0x01ad:
            java.lang.Integer r3 = r5.A0J
            return r3
        L_0x01b0:
            java.lang.Integer r3 = r5.A0I
            return r3
        L_0x01b3:
            java.lang.Integer r3 = r5.A0F
            return r3
        L_0x01b6:
            java.lang.Integer r3 = r5.A0G
            return r3
        L_0x01b9:
            java.lang.Integer r3 = r5.A0H
            return r3
        L_0x01bc:
            java.lang.Integer r3 = r5.A0L
            return r3
        L_0x01bf:
            java.lang.Integer r3 = r5.A0M
            return r3
        L_0x01c2:
            X.9T4 r1 = r5.A03
            if (r1 != 0) goto L_0x01cb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            return r3
        L_0x01cb:
            int r2 = r1.A02
            int r1 = r1.A01
            int r2 = r2 * r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            return r3
        L_0x01d5:
            java.lang.Integer r3 = r5.A0O
            return r3
        L_0x01d8:
            java.lang.Integer r3 = r5.A0P
            return r3
        L_0x01db:
            java.lang.Integer r3 = r5.A0Q
            return r3
        L_0x01de:
            X.96p r2 = r5.A0Z
            X.9Mw r1 = X.C194899Ux.A0q
            java.util.List r2 = X.C194899Ux.A03(r1, r2)
            java.lang.Integer r1 = r5.A0Q
            r1.getClass()
            int r7 = r1.intValue()
            int[] r1 = r5.A0d
            r6 = 0
            r5 = r1[r4]
            r4 = r1[r8]
            java.util.Iterator r3 = r2.iterator()
        L_0x01fa:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0212
            java.lang.Object r1 = r3.next()
            int r2 = X.AnonymousClass001.A0K(r1)
            int r1 = r2 * 1000
            if (r1 < r5) goto L_0x01fa
            if (r1 > r4) goto L_0x01fa
            if (r1 <= r6) goto L_0x01fa
            r6 = r2
            goto L_0x01fa
        L_0x0212:
            if (r6 == 0) goto L_0x0215
            r7 = r6
        L_0x0215:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            return r3
        L_0x021a:
            java.lang.Integer r3 = r5.A0N
            return r3
        L_0x021d:
            java.lang.Integer r3 = r5.A0K
            return r3
        L_0x0220:
            java.lang.Integer r3 = r5.A0R
            return r3
        L_0x0223:
            java.lang.Integer r3 = r5.A0T
            return r3
        L_0x0226:
            java.lang.Integer r3 = r5.A0U
            return r3
        L_0x0229:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L_0x022c:
            r3 = 0
            return r3
        L_0x022e:
            java.lang.Boolean r3 = r5.A06
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195049Vr.A08(X.9Mx):java.lang.Object");
    }

    public static int A02(AnonymousClass9Mx r0, C195049Vr r1) {
        Object A082 = r1.A08(r0);
        A082.getClass();
        return ((Number) A082).intValue();
    }

    public static Object A04(AnonymousClass9Mx r0, C195049Vr r1) {
        Object A082 = r1.A08(r0);
        A082.getClass();
        return A082;
    }

    public static String A05(List list) {
        if (list.isEmpty()) {
            return "()";
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append('(');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Camera.Area area = (Camera.Area) list.get(i);
            A0o2.append('[');
            Rect rect = area.rect;
            rect.getClass();
            A0o2.append(rect.flattenToString());
            A0o2.append(' ');
            A0o2.append(area.weight);
            A0o2.append("] ");
        }
        return AnonymousClass000.A0c(A0o2);
    }

    public static void A06(AnonymousClass9Mx r0, C195049Vr r1) {
        Object A082 = r1.A08(r0);
        A082.getClass();
        ((Number) A082).intValue();
    }

    public static boolean A07(AnonymousClass9Mx r0, C195049Vr r1) {
        Object A082 = r1.A08(r0);
        A082.getClass();
        return ((Boolean) A082).booleanValue();
    }
}
