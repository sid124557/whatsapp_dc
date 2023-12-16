package X;

import java.util.Locale;

/* renamed from: X.0W6  reason: invalid class name */
public final class AnonymousClass0W6 {
    public static final C04130Mx A07 = new C04130Mx();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public AnonymousClass0W6(String str, String str2, String str3, int i, int i2, boolean z) {
        C162457s7.A0J(str, 1);
        C162457s7.A0J(str2, 2);
        this.A04 = str;
        this.A05 = str2;
        this.A06 = z;
        this.A02 = i;
        this.A03 = str3;
        this.A01 = i2;
        this.A00 = A00(str2);
    }

    public static final int A00(String str) {
        Locale locale = Locale.US;
        C162457s7.A0F(locale);
        String upperCase = str.toUpperCase(locale);
        C162457s7.A0D(upperCase);
        if (C175728Zm.A0S(upperCase, "INT", false)) {
            return 3;
        }
        if (C175728Zm.A0S(upperCase, "CHAR", false) || C175728Zm.A0S(upperCase, "CLOB", false) || C175728Zm.A0S(upperCase, "TEXT", false)) {
            return 2;
        }
        if (C175728Zm.A0S(upperCase, "BLOB", false)) {
            return 5;
        }
        if (C175728Zm.A0S(upperCase, "REAL", false) || C175728Zm.A0S(upperCase, "FLOA", false) || C175728Zm.A0S(upperCase, "DOUB", false)) {
            return 4;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r1.A00(r2, r0) == false) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r4 = 1
            if (r7 == r8) goto L_0x0060
            boolean r0 = r8 instanceof X.AnonymousClass0W6
            r6 = 0
            if (r0 == 0) goto L_0x0037
            int r1 = r7.A02
            X.0W6 r8 = (X.AnonymousClass0W6) r8
            int r0 = r8.A02
            if (r1 != r0) goto L_0x0037
            java.lang.String r1 = r7.A04
            java.lang.String r0 = r8.A04
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0037
            boolean r1 = r7.A06
            boolean r0 = r8.A06
            if (r1 != r0) goto L_0x0037
            int r5 = r7.A01
            r0 = 2
            int r3 = r8.A01
            if (r5 != r4) goto L_0x0038
            if (r3 != r0) goto L_0x0043
            java.lang.String r2 = r7.A03
            if (r2 == 0) goto L_0x0059
            X.0Mx r1 = A07
            java.lang.String r0 = r8.A03
        L_0x0031:
            boolean r0 = r1.A00(r2, r0)
            if (r0 != 0) goto L_0x0043
        L_0x0037:
            return r6
        L_0x0038:
            if (r3 != r4) goto L_0x0043
            java.lang.String r2 = r8.A03
            if (r2 == 0) goto L_0x0043
            X.0Mx r1 = A07
            java.lang.String r0 = r7.A03
            goto L_0x0031
        L_0x0043:
            if (r5 != r3) goto L_0x0059
            java.lang.String r2 = r7.A03
            if (r2 == 0) goto L_0x0054
            X.0Mx r1 = A07
            java.lang.String r0 = r8.A03
            boolean r0 = r1.A00(r2, r0)
            if (r0 != 0) goto L_0x0059
            return r6
        L_0x0054:
            java.lang.String r0 = r8.A03
            if (r0 == 0) goto L_0x0059
            return r6
        L_0x0059:
            int r1 = r7.A00
            int r0 = r8.A00
            if (r1 == r0) goto L_0x0060
            r4 = 0
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0W6.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = ((this.A04.hashCode() * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        return ((hashCode + i) * 31) + this.A02;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Column{name='");
        A0o.append(this.A04);
        A0o.append("', type='");
        A0o.append(this.A05);
        A0o.append("', affinity='");
        A0o.append(this.A00);
        A0o.append("', notNull=");
        A0o.append(this.A06);
        A0o.append(", primaryKeyPosition=");
        A0o.append(this.A02);
        A0o.append(", defaultValue='");
        String str = this.A03;
        if (str == null) {
            str = "undefined";
        }
        A0o.append(str);
        return AnonymousClass000.A0X("'}", A0o);
    }
}
