package X;

/* renamed from: X.7qr  reason: invalid class name and case insensitive filesystem */
public final class C161937qr {
    public static final int A00(C141476vd r4, C142316x0 r5) {
        boolean A1Y = AnonymousClass0x2.A1Y(r5, r4);
        int ordinal = r4.ordinal();
        if (ordinal == 0 || ordinal == A1Y) {
            return 22;
        }
        return 16;
    }

    public static final int A01(C142316x0 r4, C141486ve r5) {
        boolean A1Y = AnonymousClass0x2.A1Y(r4, r5);
        int ordinal = r5.ordinal();
        if (ordinal == 0 || ordinal == A1Y) {
            return 44;
        }
        return 32;
    }

    public static final int A02(C142316x0 r4, C141746w4 r5) {
        boolean A1Y = AnonymousClass0x2.A1Y(r4, r5);
        int ordinal = r5.ordinal();
        if (ordinal == 0 || ordinal == A1Y) {
            return 20;
        }
        if (ordinal != 2) {
            return 14;
        }
        return 16;
    }

    public static final C153477bO A03(C141336vP r4, C142316x0 r5) {
        boolean A1Y = AnonymousClass0x2.A1Y(r5, r4);
        if (r4.ordinal() != 0) {
            return new C153477bO(new C166217yK(-3419431, -12166551), A1Y ? 1 : 0);
        }
        return new C153477bO(new C166217yK(-14931149, -14931149), 0);
    }

    public static final void A06(C142316x0 r2, C141206vC r3) {
        C162457s7.A0J(r2, 0);
        if (r3.ordinal() != 0) {
            throw C73153f1.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        return new X.C166217yK(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        return new X.C166217yK(r1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        return new X.C166217yK(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C166217yK A04(X.C142186wm r3, X.C142316x0 r4) {
        /*
            X.C18260x0.A0O(r4, r3)
            int r0 = r3.ordinal()
            r4 = -15787746(0xffffffffff0f191e, float:-1.9021002E38)
            r3 = -16751392(0xffffffffff0064e0, float:-1.7066496E38)
            r2 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            r1 = -1
            switch(r0) {
                case 0: goto L_0x003e;
                case 1: goto L_0x0014;
                case 2: goto L_0x0014;
                case 3: goto L_0x0014;
                case 4: goto L_0x001a;
                case 5: goto L_0x0038;
                case 6: goto L_0x0040;
                case 7: goto L_0x0027;
                case 8: goto L_0x0014;
                case 9: goto L_0x002f;
                case 10: goto L_0x002b;
                case 11: goto L_0x0021;
                default: goto L_0x0014;
            }
        L_0x0014:
            X.7yK r0 = new X.7yK
            r0.<init>(r2, r1)
            return r0
        L_0x001a:
            r2 = -12166551(0xffffffffff465a69, float:-2.6365658E38)
            r1 = -3419431(0xffffffffffcbd2d9, float:NaN)
            goto L_0x0014
        L_0x0021:
            X.7yK r0 = new X.7yK
            r0.<init>(r1, r4)
            return r0
        L_0x0027:
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            goto L_0x0040
        L_0x002b:
            r3 = -920329(0xfffffffffff1f4f7, float:NaN)
            goto L_0x0032
        L_0x002f:
            r4 = -12081670(0xffffffffff47a5fa, float:-2.6537817E38)
        L_0x0032:
            X.7yK r0 = new X.7yK
            r0.<init>(r3, r4)
            return r0
        L_0x0038:
            X.7yK r0 = new X.7yK
            r0.<init>(r3, r3)
            return r0
        L_0x003e:
            r1 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
        L_0x0040:
            X.7yK r0 = new X.7yK
            r0.<init>(r1, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161937qr.A04(X.6wm, X.6x0):X.7yK");
    }

    public static final C153647bi A05(C142316x0 r4, C142166wk r5) {
        String str;
        String str2;
        float f;
        int i;
        float f2;
        C18260x0.A0O(r4, r5);
        switch (r5.ordinal()) {
            case 0:
            case 1:
                str = "Text";
                str2 = "Optimistic Text App Medium";
                f = 0.3f;
                i = 16;
                f2 = 1.05f;
                break;
            case 4:
                str = "Header";
                str2 = "Optimistic Display App Bold";
                f = 0.06f;
                i = 17;
                f2 = 1.001f;
                break;
            case 5:
                str = "Text";
                str2 = "Optimistic Text App Regular";
                f = -0.02f;
                i = 15;
                f2 = 1.04f;
                break;
            default:
                str = "Header";
                str2 = "Optimistic Display App";
                f = 0.12f;
                i = 24;
                f2 = 0.96f;
                break;
        }
        return new C153647bi(str, str2, f, f2, i);
    }
}
