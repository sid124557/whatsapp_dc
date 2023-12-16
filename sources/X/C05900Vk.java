package X;

/* renamed from: X.0Vk  reason: invalid class name and case insensitive filesystem */
public final class C05900Vk {
    public static final C05900Vk A00 = new C05900Vk();

    public static final boolean A00(String str, String str2) {
        if (!C175728Zm.A0S(str2, "*", false)) {
            return false;
        }
        if (str2.equals("*")) {
            return true;
        }
        if (C175728Zm.A0G(str2, "*", 0, false) != C175728Zm.A0F(str2, "*", str2.length() - 1) || !C162457s7.A0J("*", 1)) {
            throw AnonymousClass001.A0c("Name pattern with a wildcard must only contain a single wildcard in the end");
        }
        String substring = str2.substring(0, str2.length() - 1);
        C162457s7.A0D(substring);
        return C175738Zn.A0Y(str, substring, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (A00(r1, r0) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        if (r0 != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(android.content.ComponentName r5, android.content.ComponentName r6) {
        /*
            r4 = this;
            java.lang.String r1 = "*"
            r3 = 1
            if (r5 != 0) goto L_0x001a
            java.lang.String r0 = r6.getPackageName()
            boolean r0 = X.C162457s7.A0P(r0, r1)
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r6.getClassName()
            boolean r1 = X.C162457s7.A0P(r0, r1)
        L_0x0017:
            if (r1 == 0) goto L_0x0074
            return r3
        L_0x001a:
            java.lang.String r0 = r5.toString()
            X.C162457s7.A0D(r0)
            boolean r0 = X.C175728Zm.A0S(r0, r1, false)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0076
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = r6.getPackageName()
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x004c
            java.lang.String r1 = r5.getPackageName()
            X.C162457s7.A0D(r1)
            java.lang.String r0 = r6.getPackageName()
            X.C162457s7.A0D(r0)
            boolean r0 = A00(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x004d
        L_0x004c:
            r2 = 1
        L_0x004d:
            java.lang.String r1 = r5.getClassName()
            java.lang.String r0 = r6.getClassName()
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x0070
            java.lang.String r1 = r5.getClassName()
            X.C162457s7.A0D(r1)
            java.lang.String r0 = r6.getClassName()
            X.C162457s7.A0D(r0)
            boolean r0 = A00(r1, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0071
        L_0x0070:
            r1 = 1
        L_0x0071:
            if (r2 == 0) goto L_0x0074
            goto L_0x0017
        L_0x0074:
            r3 = 0
            return r3
        L_0x0076:
            java.lang.String r0 = "Wildcard can only be part of the rule."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05900Vk.A01(android.content.ComponentName, android.content.ComponentName):boolean");
    }
}
