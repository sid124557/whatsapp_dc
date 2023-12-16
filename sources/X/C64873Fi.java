package X;

/* renamed from: X.3Fi  reason: invalid class name and case insensitive filesystem */
public final class C64873Fi implements AnonymousClass664 {
    public final C48942fj A00;
    public final C48442eu A01;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r1.A00 < r7.A00.A0H()) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQV() {
        /*
            r8 = this;
            X.2eu r0 = r8.A01
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0031
            X.2fj r7 = r8.A00
            monitor-enter(r7)
            X.33p r6 = r7.A01     // Catch:{ all -> 0x002e }
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r6)     // Catch:{ all -> 0x002e }
            java.lang.String r5 = "companion_reg_with_link_code_companion_hello_info_json"
            java.lang.String r0 = X.C18280x3.A0Z(r0, r5)     // Catch:{ all -> 0x002e }
            X.2y7 r1 = X.C60172y7.A00(r0)     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0029
            X.2sH r0 = r7.A00     // Catch:{ all -> 0x002e }
            long r3 = r0.A0H()     // Catch:{ all -> 0x002e }
            long r1 = r1.A00     // Catch:{ all -> 0x002e }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
        L_0x0029:
            X.C18260x0.A0K(r6, r5)     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r7)
            return
        L_0x002e:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64873Fi.BQV():void");
    }

    public C64873Fi(C48942fj r1, C48442eu r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public String BDW() {
        return "CompanionRegWithLinkCodeDailyCron";
    }
}
