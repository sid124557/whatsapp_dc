package X;

/* renamed from: X.7Qa  reason: invalid class name and case insensitive filesystem */
public class C150287Qa {
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ab, code lost:
        r1 = X.AnonymousClass000.A0l("Scheme contains illegal character ");
        X.AnonymousClass6C7.A1L(r1, r2);
        X.AnonymousClass6C8.A1D(" at code point offset ", r1, r3, 1);
        r0 = X.C18310x6.A0d(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(java.lang.String r15) {
        /*
            r14 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ 6zT -> 0x00f7 }
            if (r0 != 0) goto L_0x00d7
            java.text.BreakIterator r6 = java.text.BreakIterator.getCharacterInstance()     // Catch:{ 6zT -> 0x00f7 }
            r0 = 58
            int r8 = r15.indexOf(r0)     // Catch:{ 6zT -> 0x00f7 }
            int r5 = r15.length()     // Catch:{ 6zT -> 0x00f7 }
            r0 = 3
            int[] r3 = new int[r0]     // Catch:{ 6zT -> 0x00f7 }
            r0 = 47
            r2 = 0
            int r0 = r15.indexOf(r0, r2)     // Catch:{ 6zT -> 0x00f7 }
            r3[r2] = r0     // Catch:{ 6zT -> 0x00f7 }
            r0 = 63
            int r1 = r15.indexOf(r0, r2)     // Catch:{ 6zT -> 0x00f7 }
            r0 = 1
            r3[r0] = r1     // Catch:{ 6zT -> 0x00f7 }
            r0 = 35
            int r1 = r15.indexOf(r0, r2)     // Catch:{ 6zT -> 0x00f7 }
            r0 = 2
            r3[r0] = r1     // Catch:{ 6zT -> 0x00f7 }
            int r0 = X.C160427nc.A00(r3, r5)     // Catch:{ 6zT -> 0x00f7 }
            if (r8 < 0) goto L_0x00c6
            if (r8 > r0) goto L_0x00c6
            java.lang.String r10 = r15.substring(r2, r8)     // Catch:{ 6zT -> 0x00f7 }
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalArgumentException -> 0x00c3 }
            if (r0 != 0) goto L_0x00bc
            r6.setText(r10)     // Catch:{ IllegalArgumentException -> 0x00c3 }
            int r7 = r10.length()     // Catch:{ IllegalArgumentException -> 0x00c3 }
            int r2 = r6.current()     // Catch:{ IllegalArgumentException -> 0x00c3 }
            int r3 = r10.codePointAt(r2)     // Catch:{ IllegalArgumentException -> 0x00c3 }
            r0 = 65
            if (r3 < r0) goto L_0x0065
            r0 = 90
            if (r3 <= r0) goto L_0x0063
            r0 = 97
            if (r3 < r0) goto L_0x0065
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 > r0) goto L_0x0065
        L_0x0063:
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            java.lang.String r9 = "Scheme contains illegal character "
            r4 = 1
            if (r0 != 0) goto L_0x0079
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r9)     // Catch:{ IllegalArgumentException -> 0x00c3 }
            X.AnonymousClass6C7.A1L(r1, r3)     // Catch:{ IllegalArgumentException -> 0x00c3 }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r2)     // Catch:{ IllegalArgumentException -> 0x00c3 }
            goto L_0x00c2
        L_0x0079:
            int r3 = r6.next()     // Catch:{ IllegalArgumentException -> 0x00c3 }
            r0 = -1
            if (r3 == r0) goto L_0x00cc
            if (r3 >= r7) goto L_0x00cc
            int r2 = r10.codePointAt(r3)     // Catch:{ IllegalArgumentException -> 0x00c3 }
            r0 = 65
            if (r2 < r0) goto L_0x008b
            goto L_0x009e
        L_0x008b:
            r1 = 48
            r0 = 57
            if (r2 >= r1) goto L_0x00a8
            r0 = 43
            if (r2 == r0) goto L_0x0079
            r0 = 45
            if (r2 == r0) goto L_0x0079
            r0 = 46
            if (r2 != r0) goto L_0x00ab
            goto L_0x0079
        L_0x009e:
            r0 = 90
            if (r2 <= r0) goto L_0x0079
            r0 = 97
            if (r2 < r0) goto L_0x00ab
            r0 = 122(0x7a, float:1.71E-43)
        L_0x00a8:
            if (r2 > r0) goto L_0x00ab
            goto L_0x0079
        L_0x00ab:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r9)     // Catch:{ IllegalArgumentException -> 0x00c3 }
            X.AnonymousClass6C7.A1L(r1, r2)     // Catch:{ IllegalArgumentException -> 0x00c3 }
            java.lang.String r0 = " at code point offset "
            X.AnonymousClass6C8.A1D(r0, r1, r3, r4)     // Catch:{ IllegalArgumentException -> 0x00c3 }
            java.lang.IllegalArgumentException r0 = X.C18310x6.A0d(r1)     // Catch:{ IllegalArgumentException -> 0x00c3 }
            goto L_0x00c2
        L_0x00bc:
            java.lang.String r0 = "Scheme cannot be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ IllegalArgumentException -> 0x00c3 }
        L_0x00c2:
            throw r0     // Catch:{ IllegalArgumentException -> 0x00c3 }
        L_0x00c3:
            r2 = move-exception
            r9 = 0
            goto L_0x00e7
        L_0x00c6:
            r0 = 0
            X.7nc r0 = X.C160427nc.A01(r15, r0, r6, r2, r5)     // Catch:{ 6zT -> 0x00f7 }
            goto L_0x00d2
        L_0x00cc:
            int r0 = r8 + 1
            X.7nc r0 = X.C160427nc.A01(r15, r10, r6, r0, r5)     // Catch:{ 6zT -> 0x00f7 }
        L_0x00d2:
            java.lang.String r0 = r0.toString()     // Catch:{ 6zT -> 0x00f7 }
            return r0
        L_0x00d7:
            r2 = 0
            X.7nc r1 = new X.7nc     // Catch:{ 6zT -> 0x00f7 }
            r4 = r2
            r5 = r2
            r6 = r2
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ 6zT -> 0x00f7 }
            X.6zT r0 = new X.6zT     // Catch:{ 6zT -> 0x00f7 }
            r0.<init>(r1)     // Catch:{ 6zT -> 0x00f7 }
            goto L_0x00f6
        L_0x00e7:
            X.7nc r8 = new X.7nc     // Catch:{ 6zT -> 0x00f7 }
            r12 = r9
            r13 = r9
            r11 = r9
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ 6zT -> 0x00f7 }
            java.lang.String r1 = "Uri contained an invalid scheme"
            X.6zT r0 = new X.6zT     // Catch:{ 6zT -> 0x00f7 }
            r0.<init>(r8, r1, r2)     // Catch:{ 6zT -> 0x00f7 }
        L_0x00f6:
            throw r0     // Catch:{ 6zT -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            X.7nc r0 = r0.mParsedUri
            java.lang.String r0 = r0.A02()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C150287Qa.A00(java.lang.String):java.lang.String");
    }
}
