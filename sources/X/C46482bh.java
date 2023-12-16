package X;

/* renamed from: X.2bh  reason: invalid class name and case insensitive filesystem */
public final class C46482bh {
    public final C55682qk A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass1VX A02;
    public final C43932Ua A03 = new C43932Ua();
    public final C183538qC A04;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00() {
        /*
            r5 = this;
            r4 = r5
            monitor-enter(r4)
            X.33p r3 = r5.A01     // Catch:{ all -> 0x0041 }
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r3)     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "wa_dictionary_version"
            int r1 = X.C18280x3.A02(r0, r2)     // Catch:{ all -> 0x0041 }
            r0 = 3
            if (r1 == r0) goto L_0x0015
            X.C18260x0.A0L(r3, r2, r0)     // Catch:{ all -> 0x0041 }
        L_0x0015:
            monitor-exit(r4)
            if (r1 == 0) goto L_0x003f
            if (r1 == r0) goto L_0x003f
            java.lang.String r0 = "PreacksStore/deleteAll preacks"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8qC r0 = r5.A04
            X.4Fq r4 = X.C18630y0.A08(r0)
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0038 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "preacks"
            java.lang.String r1 = "PreacksStore/DELETE_ALL"
            r0 = 0
            r3.A07(r2, r0, r1, r0)     // Catch:{ all -> 0x0038 }
            r4.close()
            r0 = 1
            return r0
        L_0x0038:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x003f:
            r0 = 0
            return r0
        L_0x0041:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46482bh.A00():boolean");
    }

    public C46482bh(C55682qk r2, AnonymousClass33p r3, AnonymousClass1VX r4, C183538qC r5) {
        C18260x0.A0c(r4, r2, r5, r3);
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = r5;
        this.A01 = r3;
    }
}
