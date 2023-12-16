package X;

import java.util.Set;

/* renamed from: X.5nM  reason: invalid class name and case insensitive filesystem */
public class C114635nM implements AnonymousClass67B {
    public final C56972sr A00;
    public final C620733j A01;
    public final C183538qC A02;

    public Set BBH(C95814uZ r3, C624134x r4, String str) {
        if (str == null || r4.A1J.A02) {
            return null;
        }
        return A00(r3, str);
    }

    public C114635nM(C56972sr r1, C620733j r2, C183538qC r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0091 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A00(X.C95814uZ r14, java.lang.String r15) {
        /*
            r13 = this;
            android.net.Uri r0 = android.net.Uri.parse(r15)
            java.lang.String r4 = r0.getHost()
            if (r4 != 0) goto L_0x000c
            r8 = 0
        L_0x000b:
            return r8
        L_0x000c:
            boolean r0 = X.C627336j.A0L(r14)
            java.lang.String r7 = "ZZ"
            if (r0 != 0) goto L_0x003a
            r6 = r7
            if (r14 == 0) goto L_0x003a
            X.8qC r3 = r13.A02     // Catch:{ 6zC -> 0x003b }
            java.lang.Object r2 = r3.get()     // Catch:{ 6zC -> 0x003b }
            X.7rN r2 = (X.C162167rN) r2     // Catch:{ 6zC -> 0x003b }
            java.lang.String r1 = X.AnonymousClass36P.A06(r14)     // Catch:{ 6zC -> 0x003b }
            r0 = 0
            X.8LC r2 = r2.A0F(r1, r0)     // Catch:{ 6zC -> 0x003b }
            int r0 = r2.countryCode_     // Catch:{ 6zC -> 0x003b }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ 6zC -> 0x003b }
            r3.get()     // Catch:{ 6zC -> 0x003b }
            java.lang.String r0 = X.C162167rN.A01(r2)     // Catch:{ 6zC -> 0x003b }
            java.lang.String r6 = X.C106675Zy.A01(r1, r0)     // Catch:{ 6zC -> 0x003b }
            goto L_0x003b
        L_0x003a:
            r6 = r7
        L_0x003b:
            X.2sr r0 = r13.A00
            r0.A0P()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0048
            java.lang.String r7 = X.AnonymousClass0x9.A0w(r0)
        L_0x0048:
            java.util.HashSet r9 = X.AnonymousClass002.A0K()
            X.33j r0 = r13.A01
            java.util.Locale r3 = X.C620733j.A02(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x006d
            android.os.LocaleList r2 = android.os.LocaleList.getDefault()
            r1 = 0
        L_0x005d:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x006d
            java.util.Locale r0 = r2.get(r1)
            r9.add(r0)
            int r1 = r1 + 1
            goto L_0x005d
        L_0x006d:
            r9.add(r3)
            java.lang.String r0 = "\\."
            java.lang.String[] r10 = r4.split(r0)
            int r3 = r10.length
            r8 = 0
            r5 = 0
            r4 = r8
            r2 = 0
            r0 = 0
        L_0x007c:
            r12 = 1
            if (r2 >= r3) goto L_0x0091
            r1 = r10[r2]
            java.util.regex.Pattern r0 = X.C155657fG.A00
            boolean r0 = X.C18280x3.A1X(r1, r0)
            r12 = r12 ^ r0
            if (r12 == 0) goto L_0x008d
            if (r4 != 0) goto L_0x000b
            r4 = r1
        L_0x008d:
            int r2 = r2 + 1
            r0 = r12
            goto L_0x007c
        L_0x0091:
            if (r4 == 0) goto L_0x000b
            if (r0 != 0) goto L_0x000b
            int r3 = r4.length()
            r10 = 2
            java.util.ArrayList r1 = X.AnonymousClass002.A0I(r10)
            r2 = 0
        L_0x009f:
            if (r2 >= r3) goto L_0x00c8
            int r11 = r4.codePointAt(r2)
            if (r12 == 0) goto L_0x00b0
            java.util.HashSet r0 = X.C155657fG.A03
            boolean r0 = X.C86624Kv.A1a(r0, r11)
            r12 = 1
            if (r0 != 0) goto L_0x00c2
        L_0x00b0:
            r12 = 0
            android.util.SparseArray r0 = X.C155657fG.A01
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L_0x00c2
            int r0 = r1.size()
            if (r0 >= r10) goto L_0x000b
            X.C18270x1.A1K(r1, r11)
        L_0x00c2:
            int r0 = java.lang.Character.charCount(r11)
            int r2 = r2 + r0
            goto L_0x009f
        L_0x00c8:
            if (r12 == 0) goto L_0x0109
            java.util.HashSet r1 = X.C155657fG.A04
            boolean r0 = r1.contains(r7)
            if (r0 != 0) goto L_0x000b
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L_0x000b
            java.util.Iterator r2 = r9.iterator()
        L_0x00dc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r2.next()
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.String r1 = r0.getLanguage()
            java.util.HashSet r0 = X.C155657fG.A05
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00dc
            return r8
        L_0x00f5:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>(r3)
        L_0x00fa:
            if (r5 >= r3) goto L_0x000b
            int r0 = r4.codePointAt(r5)
            X.C18270x1.A1K(r8, r0)
            int r0 = java.lang.Character.charCount(r0)
            int r5 = r5 + r0
            goto L_0x00fa
        L_0x0109:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000b
            int r0 = r1.size()
            X.0nO r5 = new X.0nO
            r5.<init>(r0)
            java.util.Iterator r10 = r1.iterator()
        L_0x011c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0163
            java.lang.Object r4 = r10.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r1 = r4.intValue()
            android.util.SparseArray r0 = X.C155657fG.A01
            java.lang.Object r3 = r0.get(r1)
            X.5HZ r3 = (X.AnonymousClass5HZ) r3
            java.util.Collection r1 = r3.A01
            boolean r0 = r1.contains(r7)
            if (r0 != 0) goto L_0x011c
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L_0x011c
            java.util.Iterator r2 = r9.iterator()
        L_0x0146:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x015f
            java.lang.Object r0 = r2.next()
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.String r1 = r0.getLanguage()
            java.util.Collection r0 = r3.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0146
            goto L_0x011c
        L_0x015f:
            r5.add(r4)
            goto L_0x011c
        L_0x0163:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x000b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114635nM.A00(X.4uZ, java.lang.String):java.util.Set");
    }
}
