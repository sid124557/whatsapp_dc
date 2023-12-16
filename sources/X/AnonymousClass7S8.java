package X;

/* renamed from: X.7S8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7S8 {
    public final /* synthetic */ AnonymousClass8A4 A00;
    public final /* synthetic */ String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        r2 = r7.query(X.C155687fJ.A02, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r3}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        if (r2 == null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        if (r2.moveToFirst() != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r4 != X.C155687fJ.A00) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        X.C155687fJ.A01.put(r3, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r1 = r2.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        if (r1 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        if (r1.equals((java.lang.Object) null) == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009e, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009f, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a2, code lost:
        if (r4 != X.C155687fJ.A00) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        X.C155687fJ.A01.put(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a9, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        if (r1 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b0, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b5, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b9, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00() {
        /*
            r13 = this;
            X.8A4 r0 = r13.A00
            java.lang.String r3 = r13.A01
            android.content.Context r0 = r0.A00
            android.content.ContentResolver r7 = r0.getContentResolver()
            r9 = 0
            java.lang.Class<X.7fJ> r6 = X.C155687fJ.class
            monitor-enter(r6)
            java.util.HashMap r0 = X.C155687fJ.A01     // Catch:{ all -> 0x00ba }
            r1 = 1
            r2 = 0
            r5 = 0
            if (r0 != 0) goto L_0x0041
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C155687fJ.A08     // Catch:{ all -> 0x00ba }
            r0.set(r2)     // Catch:{ all -> 0x00ba }
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x00ba }
            X.C155687fJ.A01 = r0     // Catch:{ all -> 0x00ba }
            java.lang.Object r0 = X.AnonymousClass002.A0D()     // Catch:{ all -> 0x00ba }
            X.C155687fJ.A00 = r0     // Catch:{ all -> 0x00ba }
            android.net.Uri r4 = X.C155687fJ.A02     // Catch:{ all -> 0x00ba }
            X.6Ch r0 = new X.6Ch     // Catch:{ all -> 0x00ba }
            r0.<init>()     // Catch:{ all -> 0x00ba }
            r7.registerContentObserver(r4, r1, r0)     // Catch:{ all -> 0x00ba }
        L_0x0030:
            java.lang.Object r4 = X.C155687fJ.A00     // Catch:{ all -> 0x00ba }
            java.util.HashMap r0 = X.C155687fJ.A01     // Catch:{ all -> 0x00ba }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x006e
            java.util.HashMap r0 = X.C155687fJ.A01     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = X.C18320x8.A0e(r3, r0)     // Catch:{ all -> 0x00ba }
            goto L_0x0069
        L_0x0041:
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C155687fJ.A08     // Catch:{ all -> 0x00ba }
            boolean r0 = r0.getAndSet(r2)     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0030
            java.util.HashMap r0 = X.C155687fJ.A01     // Catch:{ all -> 0x00ba }
            r0.clear()     // Catch:{ all -> 0x00ba }
            java.util.HashMap r0 = X.C155687fJ.A04     // Catch:{ all -> 0x00ba }
            r0.clear()     // Catch:{ all -> 0x00ba }
            java.util.HashMap r0 = X.C155687fJ.A05     // Catch:{ all -> 0x00ba }
            r0.clear()     // Catch:{ all -> 0x00ba }
            java.util.HashMap r0 = X.C155687fJ.A06     // Catch:{ all -> 0x00ba }
            r0.clear()     // Catch:{ all -> 0x00ba }
            java.util.HashMap r0 = X.C155687fJ.A07     // Catch:{ all -> 0x00ba }
            r0.clear()     // Catch:{ all -> 0x00ba }
            java.lang.Object r0 = X.AnonymousClass002.A0D()     // Catch:{ all -> 0x00ba }
            X.C155687fJ.A00 = r0     // Catch:{ all -> 0x00ba }
            goto L_0x0030
        L_0x0069:
            if (r0 == 0) goto L_0x006c
            r5 = r0
        L_0x006c:
            monitor-exit(r6)     // Catch:{ all -> 0x00ba }
            return r5
        L_0x006e:
            monitor-exit(r6)     // Catch:{ all -> 0x00ba }
            android.net.Uri r8 = X.C155687fJ.A02
            java.lang.String[] r11 = new java.lang.String[r1]
            r11[r2] = r3
            r12 = r9
            r10 = r9
            android.database.Cursor r2 = r7.query(r8, r9, r10, r11, r12)
            if (r2 == 0) goto L_0x00b9
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x0092
            monitor-enter(r6)     // Catch:{ all -> 0x00b4 }
            java.lang.Object r0 = X.C155687fJ.A00     // Catch:{ all -> 0x008f }
            if (r4 != r0) goto L_0x008d
            java.util.HashMap r0 = X.C155687fJ.A01     // Catch:{ all -> 0x008f }
            r0.put(r3, r9)     // Catch:{ all -> 0x008f }
        L_0x008d:
            monitor-exit(r6)     // Catch:{ all -> 0x008f }
            goto L_0x00ad
        L_0x008f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x008f }
            goto L_0x00b3
        L_0x0092:
            java.lang.String r1 = r2.getString(r1)     // Catch:{ all -> 0x00b4 }
            if (r1 == 0) goto L_0x009f
            boolean r0 = r1.equals(r9)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x009f
            r1 = r9
        L_0x009f:
            monitor-enter(r6)     // Catch:{ all -> 0x00b4 }
            java.lang.Object r0 = X.C155687fJ.A00     // Catch:{ all -> 0x00b1 }
            if (r4 != r0) goto L_0x00a9
            java.util.HashMap r0 = X.C155687fJ.A01     // Catch:{ all -> 0x00b1 }
            r0.put(r3, r1)     // Catch:{ all -> 0x00b1 }
        L_0x00a9:
            monitor-exit(r6)     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x00ad
            r5 = r1
        L_0x00ad:
            r2.close()
            return r5
        L_0x00b1:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00b1 }
        L_0x00b3:
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            r2.close()
            throw r0
        L_0x00b9:
            return r5
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00ba }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S8.A00():java.lang.Object");
    }

    public /* synthetic */ AnonymousClass7S8(AnonymousClass8A4 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
