package X;

/* renamed from: X.45w  reason: invalid class name and case insensitive filesystem */
public class C830345w extends AnonymousClass2AB {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A08(java.lang.String r17) {
        /*
            r6 = 0
            r4 = r17
            X.C162457s7.A0J(r4, r6)
            java.lang.String r12 = ""
            java.util.List r11 = X.C175728Zm.A0M(r4)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r11.iterator()
        L_0x0014:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.C175738Zn.A0V(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0014
            r3.add(r1)
            goto L_0x0014
        L_0x002d:
            java.util.ArrayList r8 = X.C73783g4.A0c(r3)
            java.util.Iterator r7 = r3.iterator()
        L_0x0035:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.String r5 = X.AnonymousClass001.A0m(r7)
            int r3 = r5.length()
            r2 = 0
        L_0x0044:
            r1 = -1
            if (r2 >= r3) goto L_0x0055
            char r0 = r5.charAt(r2)
            boolean r0 = X.C154557dM.A01(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005a
            if (r2 != r1) goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            X.C18270x1.A1K(r8, r2)
            goto L_0x0035
        L_0x005a:
            int r2 = r2 + 1
            goto L_0x0044
        L_0x005d:
            java.util.Iterator r3 = r8.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x00d3
            r2 = 0
        L_0x0068:
            java.lang.Number r2 = (java.lang.Number) r2
            r10 = 0
            int r7 = X.C18310x6.A06(r2)
            int r8 = r4.length()
            int r1 = r12.length()
            int r0 = r11.size()
            int r0 = r0 * r1
            int r8 = r8 + r0
            if (r1 != 0) goto L_0x00cd
            X.45H r9 = X.AnonymousClass45H.A00
        L_0x0081:
            int r5 = X.AnonymousClass002.A03(r11)
            java.util.ArrayList r15 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r11.iterator()
        L_0x008d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r3 = r4.next()
            int r2 = r10 + 1
            if (r10 >= 0) goto L_0x00a0
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x00a0:
            java.lang.String r3 = (java.lang.String) r3
            if (r10 == 0) goto L_0x00a6
            if (r10 != r5) goto L_0x00ae
        L_0x00a6:
            boolean r0 = X.C175738Zn.A0V(r3)
            if (r0 == 0) goto L_0x00ae
        L_0x00ac:
            r10 = r2
            goto L_0x008d
        L_0x00ae:
            r1 = r7
            X.C162457s7.A0J(r3, r6)
            if (r7 < 0) goto L_0x00ed
            int r0 = r3.length()
            if (r7 <= r0) goto L_0x00bb
            r1 = r0
        L_0x00bb:
            java.lang.String r0 = r3.substring(r1)
            X.C162457s7.A0D(r0)
            java.lang.Object r0 = r9.invoke(r0)
            if (r0 == 0) goto L_0x00c9
            r3 = r0
        L_0x00c9:
            r15.add(r3)
            goto L_0x00ac
        L_0x00cd:
            X.43T r9 = new X.43T
            r9.<init>()
            goto L_0x0081
        L_0x00d3:
            java.lang.Object r2 = r3.next()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        L_0x00d9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r0 = r2.compareTo(r1)
            if (r0 <= 0) goto L_0x00d9
            r2 = r1
            goto L_0x00d9
        L_0x00ed:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Requested character count "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " is less than zero."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)
            throw r0
        L_0x0100:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r8)
            java.lang.String r11 = "\n"
            r16 = 0
            r17 = -1
            java.lang.String r14 = "..."
            r13 = r12
            X.C73723fy.A0S(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r0 = X.C18290x4.A0o(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C830345w.A08(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A09(java.lang.String r16) {
        /*
            java.lang.String r7 = "|"
            r0 = 0
            r1 = r16
            X.C162457s7.A0J(r1, r0)
            java.lang.String r11 = ""
            boolean r0 = X.C175738Zn.A0V(r7)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00a8
            java.util.List r2 = X.C175728Zm.A0M(r1)
            int r6 = r1.length()
            int r1 = r11.length()
            int r0 = r2.size()
            int r0 = r0 * r1
            int r6 = r6 + r0
            if (r1 != 0) goto L_0x008d
            X.45H r5 = X.AnonymousClass45H.A00
        L_0x0029:
            int r4 = X.AnonymousClass002.A03(r2)
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()
            java.util.Iterator r10 = r2.iterator()
            r1 = 0
        L_0x0036:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r3 = r10.next()
            int r9 = r1 + 1
            if (r1 >= 0) goto L_0x0049
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x0049:
            java.lang.String r3 = (java.lang.String) r3
            if (r1 == 0) goto L_0x004f
            if (r1 != r4) goto L_0x0057
        L_0x004f:
            boolean r0 = X.C175738Zn.A0V(r3)
            if (r0 == 0) goto L_0x0057
        L_0x0055:
            r1 = r9
            goto L_0x0036
        L_0x0057:
            int r8 = r3.length()
            r2 = 0
        L_0x005c:
            r1 = -1
            if (r2 >= r8) goto L_0x0086
            char r0 = r3.charAt(r2)
            boolean r0 = X.C154557dM.A01(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008a
            if (r2 == r1) goto L_0x0086
            boolean r0 = r3.startsWith(r7, r2)
            if (r0 == 0) goto L_0x0086
            int r0 = r7.length()
            int r2 = r2 + r0
            java.lang.String r0 = r3.substring(r2)
            X.C162457s7.A0D(r0)
            java.lang.Object r0 = r5.invoke(r0)
            if (r0 == 0) goto L_0x0086
            r3 = r0
        L_0x0086:
            r14.add(r3)
            goto L_0x0055
        L_0x008a:
            int r2 = r2 + 1
            goto L_0x005c
        L_0x008d:
            X.43T r5 = new X.43T
            r5.<init>()
            goto L_0x0029
        L_0x0093:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            java.lang.String r10 = "\n"
            r15 = 0
            r16 = -1
            java.lang.String r13 = "..."
            r12 = r11
            X.C73723fy.A0S(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = X.C18290x4.A0o(r9)
            return r0
        L_0x00a8:
            java.lang.String r0 = "marginPrefix must be non-blank string."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C830345w.A09(java.lang.String):java.lang.String");
    }
}
