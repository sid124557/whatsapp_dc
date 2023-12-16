package X;

/* renamed from: X.92Z  reason: invalid class name */
public class AnonymousClass92Z implements AnonymousClass4B7 {
    public Object A00;
    public final int A01;

    public static void A01(AnonymousClass36K r2, AnonymousClass36K r3, int i) {
        C626836d.A04(r3, new AnonymousClass92Z(r2, i), new String[0]);
    }

    public AnonymousClass92Z(AnonymousClass36K r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public static Object A00(AnonymousClass36K r2, AnonymousClass36K r3, int i) {
        return C626836d.A04(r3, new AnonymousClass92Z(r2, i), new String[0]);
    }

    public static void A02(AnonymousClass36K r2, AnonymousClass36K r3, int i) {
        C626836d.A04(r3, new AnonymousClass92Z(r2, i), new String[0]);
    }

    public static boolean A03(AnonymousClass36K r3, AnonymousClass36K r4, int i) {
        C626836d.A04(r4, new AnonymousClass92Z(r3, i), new String[0]);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        return new X.AnonymousClass56S(r4, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        return new X.C139456s5(r4, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        return new X.C139446s4(r4, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0115, code lost:
        return new X.C138956rH(r4, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return new X.C34981w8(r4, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0146, code lost:
        return new X.C138966rI(r4, r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Ax7(X.AnonymousClass36K r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x013c;
                case 1: goto L_0x0136;
                case 2: goto L_0x013c;
                case 3: goto L_0x013c;
                case 4: goto L_0x0136;
                case 5: goto L_0x013c;
                case 6: goto L_0x0130;
                case 7: goto L_0x0130;
                case 8: goto L_0x012a;
                case 9: goto L_0x012a;
                case 10: goto L_0x012a;
                case 11: goto L_0x0124;
                case 12: goto L_0x011d;
                case 13: goto L_0x0116;
                case 14: goto L_0x011d;
                case 15: goto L_0x010b;
                case 16: goto L_0x0104;
                case 17: goto L_0x00fd;
                case 18: goto L_0x00f6;
                case 19: goto L_0x00f6;
                case 20: goto L_0x00f0;
                case 21: goto L_0x00f6;
                case 22: goto L_0x00e9;
                case 23: goto L_0x00f6;
                case 24: goto L_0x00e9;
                case 25: goto L_0x00f6;
                case 26: goto L_0x00e9;
                case 27: goto L_0x00f6;
                case 28: goto L_0x00e9;
                case 29: goto L_0x00f6;
                case 30: goto L_0x00f0;
                case 31: goto L_0x00e2;
                case 32: goto L_0x00db;
                case 33: goto L_0x00d4;
                case 34: goto L_0x00cd;
                case 35: goto L_0x00c6;
                case 36: goto L_0x00c6;
                case 37: goto L_0x00bf;
                case 38: goto L_0x00b4;
                case 39: goto L_0x00a9;
                case 40: goto L_0x00a3;
                case 41: goto L_0x009d;
                case 42: goto L_0x0097;
                case 43: goto L_0x0090;
                case 44: goto L_0x0088;
                case 45: goto L_0x00b4;
                case 46: goto L_0x00a9;
                case 47: goto L_0x00a3;
                case 48: goto L_0x009d;
                case 49: goto L_0x0097;
                case 50: goto L_0x007e;
                case 51: goto L_0x00bf;
                case 52: goto L_0x00bf;
                case 53: goto L_0x00b4;
                case 54: goto L_0x0074;
                case 55: goto L_0x00a3;
                case 56: goto L_0x0097;
                case 57: goto L_0x0090;
                case 58: goto L_0x0088;
                case 59: goto L_0x00bf;
                case 60: goto L_0x00bf;
                case 61: goto L_0x00b4;
                case 62: goto L_0x00a9;
                case 63: goto L_0x00a3;
                case 64: goto L_0x009d;
                case 65: goto L_0x0097;
                case 66: goto L_0x0090;
                case 67: goto L_0x0088;
                case 68: goto L_0x00bf;
                case 69: goto L_0x00bf;
                case 70: goto L_0x00bf;
                case 71: goto L_0x006c;
                case 72: goto L_0x0064;
                case 73: goto L_0x0059;
                case 74: goto L_0x0052;
                case 75: goto L_0x0039;
                case 76: goto L_0x0047;
                case 77: goto L_0x0039;
                case 78: goto L_0x0039;
                case 79: goto L_0x0047;
                case 80: goto L_0x0047;
                case 81: goto L_0x0039;
                case 82: goto L_0x0033;
                case 83: goto L_0x002d;
                case 84: goto L_0x0033;
                case 85: goto L_0x0033;
                case 86: goto L_0x002d;
                case 87: goto L_0x0026;
                case 88: goto L_0x001f;
                case 89: goto L_0x0026;
                case 90: goto L_0x0026;
                case 91: goto L_0x0026;
                case 92: goto L_0x001f;
                case 93: goto L_0x0005;
                case 94: goto L_0x0005;
                case 95: goto L_0x0005;
                case 96: goto L_0x0005;
                case 97: goto L_0x0005;
                case 98: goto L_0x0005;
                case 99: goto L_0x0005;
                case 100: goto L_0x0005;
                case 101: goto L_0x0018;
                case 102: goto L_0x003f;
                case 103: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 10
        L_0x000b:
            X.1w8 r2 = new X.1w8
            r2.<init>(r4, r1, r0)
            return r2
        L_0x0011:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 13
            goto L_0x000b
        L_0x0018:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 12
            goto L_0x000b
        L_0x001f:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 9
            goto L_0x000b
        L_0x0026:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 8
            goto L_0x000b
        L_0x002d:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 7
            goto L_0x000b
        L_0x0033:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 6
            goto L_0x000b
        L_0x0039:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 5
            goto L_0x000b
        L_0x003f:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 28
            goto L_0x0110
        L_0x0047:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 2
            X.6rM r2 = new X.6rM
            r2.<init>(r4, r1, r0)
            return r2
        L_0x0052:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 8
            goto L_0x005e
        L_0x0059:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 7
        L_0x005e:
            X.56S r2 = new X.56S
            r2.<init>(r4, r1, r0)
            return r2
        L_0x0064:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 27
            goto L_0x0141
        L_0x006c:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 24
            goto L_0x0110
        L_0x0074:
            java.lang.Object r0 = r3.A00
            X.36K r0 = (X.AnonymousClass36K) r0
            X.6s7 r2 = new X.6s7
            r2.<init>(r4, r0)
            return r2
        L_0x007e:
            java.lang.Object r0 = r3.A00
            X.36K r0 = (X.AnonymousClass36K) r0
            X.6s6 r2 = new X.6s6
            r2.<init>(r4, r0)
            return r2
        L_0x0088:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 24
            goto L_0x0141
        L_0x0090:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 16
            goto L_0x0110
        L_0x0097:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 2
            goto L_0x00b9
        L_0x009d:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 0
            goto L_0x00ae
        L_0x00a3:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 1
            goto L_0x00b9
        L_0x00a9:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 1
        L_0x00ae:
            X.6s5 r2 = new X.6s5
            r2.<init>(r4, r1, r0)
            return r2
        L_0x00b4:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 0
        L_0x00b9:
            X.6s4 r2 = new X.6s4
            r2.<init>(r4, r1, r0)
            return r2
        L_0x00bf:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 23
            goto L_0x0141
        L_0x00c6:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 21
            goto L_0x0141
        L_0x00cd:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 20
            goto L_0x0141
        L_0x00d4:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 14
            goto L_0x0110
        L_0x00db:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 19
            goto L_0x0141
        L_0x00e2:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 18
            goto L_0x0141
        L_0x00e9:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 16
            goto L_0x0141
        L_0x00f0:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 3
            goto L_0x0110
        L_0x00f6:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 15
            goto L_0x0141
        L_0x00fd:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 13
            goto L_0x0141
        L_0x0104:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 12
            goto L_0x0141
        L_0x010b:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 2
        L_0x0110:
            X.6rH r2 = new X.6rH
            r2.<init>(r4, r1, r0)
            return r2
        L_0x0116:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 11
            goto L_0x0141
        L_0x011d:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 10
            goto L_0x0141
        L_0x0124:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 7
            goto L_0x0141
        L_0x012a:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 3
            goto L_0x0141
        L_0x0130:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 2
            goto L_0x0141
        L_0x0136:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 0
            goto L_0x0141
        L_0x013c:
            java.lang.Object r1 = r3.A00
            X.36K r1 = (X.AnonymousClass36K) r1
            r0 = 1
        L_0x0141:
            X.6rI r2 = new X.6rI
            r2.<init>(r4, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass92Z.Ax7(X.36K):java.lang.Object");
    }
}
