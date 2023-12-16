package X;

/* renamed from: X.2z0  reason: invalid class name */
public class AnonymousClass2z0 {
    public final C95814uZ A00;
    public final String A01;
    public final boolean A02;

    public static AnonymousClass2z0 A03(C95814uZ r2, String str) {
        return new AnonymousClass2z0(r2, str, false);
    }

    public static AnonymousClass2z0 A04(C95814uZ r2, String str) {
        return new AnonymousClass2z0(r2, str, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0 != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0038
            r2 = 0
            if (r5 == 0) goto L_0x0020
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x0020
            X.2z0 r5 = (X.AnonymousClass2z0) r5
            boolean r1 = r4.A02
            boolean r0 = r5.A02
            if (r1 != r0) goto L_0x0020
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 != 0) goto L_0x0021
            if (r0 == 0) goto L_0x0028
        L_0x0020:
            return r2
        L_0x0021:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0028
            return r2
        L_0x0028:
            X.4uZ r1 = r4.A00
            X.4uZ r0 = r5.A00
            if (r1 != 0) goto L_0x0031
            if (r0 == 0) goto L_0x0038
            return r2
        L_0x0031:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0038
            return r2
        L_0x0038:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2z0.equals(java.lang.Object):boolean");
    }

    public static C95814uZ A00(C624134x r0) {
        C95814uZ r02 = r0.A1J.A00;
        C626936e.A06(r02);
        return r02;
    }

    public static C95814uZ A01(AnonymousClass2z0 r0) {
        C95814uZ r02 = r0.A00;
        C626936e.A06(r02);
        return r02;
    }

    public static C27991fJ A02(C624134x r0) {
        return AnonymousClass34R.A03(r0.A1J.A00);
    }

    public static AnonymousClass2z0 A05(C95814uZ r1, String str, boolean z) {
        return new AnonymousClass2z0(r1, str, z);
    }

    public static String A06(C624134x r0) {
        String str = r0.A1J.A01;
        C162457s7.A0C(str);
        return str;
    }

    public static String A08(AnonymousClass2z0 r0) {
        if (r0.A02) {
            return "1";
        }
        return "0";
    }

    public static void A09(AnonymousClass2z0 r0, String str, StringBuilder sb) {
        sb.append(r0.A01);
        sb.append(str);
    }

    public static void A0A(AnonymousClass2z0 r0, StringBuilder sb) {
        sb.append(r0.A01);
    }

    public static boolean A0B(C624134x r0) {
        return r0.A1J.A00 instanceof C135166kE;
    }

    public static boolean A0C(C624134x r0) {
        return r0.A1J.A00 instanceof C95804uY;
    }

    public static boolean A0D(C624134x r0) {
        return C627336j.A0K(r0.A1J.A00);
    }

    public static boolean A0E(C624134x r0, Object obj) {
        return obj.equals(r0.A1J.A00);
    }

    public int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return ((((i + 31) * 31) + C18270x1.A00(this.A01)) * 31) + C18310x6.A07(this.A00);
    }

    public AnonymousClass2z0(C95814uZ r1, String str, boolean z) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = r1;
    }

    public static String A07(C624134x r0, String str, StringBuilder sb) {
        sb.append(str);
        return r0.A1J.A01;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Key[id=");
        A0A(this, A0o);
        A0o.append(", from_me=");
        A0o.append(this.A02);
        A0o.append(", remote_jid=");
        return AnonymousClass000.A0S(this.A00, A0o);
    }

    public AnonymousClass2z0(AnonymousClass2z0 r2) {
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
    }
}
