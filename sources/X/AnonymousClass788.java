package X;

/* renamed from: X.788  reason: invalid class name */
public final class AnonymousClass788 {
    public static final AnonymousClass46A A00;

    /* JADX WARNING: type inference failed for: r7v0, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:26|27|28|29) */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x005c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            r1 = 1
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000d }
            if (r0 == 0) goto L_0x000d
            boolean r1 = java.lang.Boolean.parseBoolean(r0)
        L_0x000d:
            java.lang.Class<kotlinx.coroutines.android.AndroidDispatcherFactory> r6 = kotlinx.coroutines.android.AndroidDispatcherFactory.class
            r5 = 0
            if (r1 == 0) goto L_0x0065
            X.7nB r4 = X.C160187nB.A00     // Catch:{ all -> 0x00b1 }
            boolean r0 = X.AnonymousClass787.A00     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0021
            java.lang.ClassLoader r0 = r6.getClassLoader()     // Catch:{ all -> 0x00b1 }
            java.util.List r7 = r4.A01(r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x0079
        L_0x0021:
            r0 = 2
            java.util.ArrayList r7 = X.AnonymousClass002.A0I(r0)     // Catch:{ all -> 0x005c }
            java.lang.String r1 = "kotlinx.coroutines.android.AndroidDispatcherFactory"
            r3 = 0
            r2 = 1
            java.lang.ClassLoader r0 = r6.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0041 }
            java.lang.Class r0 = java.lang.Class.forName(r1, r2, r0)     // Catch:{ ClassNotFoundException -> 0x0041 }
            java.lang.Object r0 = X.AnonymousClass001.A0h(r0)     // Catch:{ ClassNotFoundException -> 0x0041 }
            java.lang.Object r0 = r6.cast(r0)     // Catch:{ ClassNotFoundException -> 0x0041 }
            kotlinx.coroutines.android.AndroidDispatcherFactory r0 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r0     // Catch:{ ClassNotFoundException -> 0x0041 }
            if (r0 == 0) goto L_0x0041
            r7.add(r0)     // Catch:{ all -> 0x005c }
        L_0x0041:
            java.lang.String r1 = "kotlinx.coroutines.test.internal.TestMainDispatcherFactory"
            java.lang.ClassLoader r0 = r6.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0056 }
            java.lang.Class r0 = java.lang.Class.forName(r1, r2, r0)     // Catch:{ ClassNotFoundException -> 0x0056 }
            java.lang.Object r0 = X.AnonymousClass001.A0h(r0)     // Catch:{ ClassNotFoundException -> 0x0056 }
            java.lang.Object r0 = r6.cast(r0)     // Catch:{ ClassNotFoundException -> 0x0056 }
            kotlinx.coroutines.android.AndroidDispatcherFactory r0 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r0     // Catch:{ ClassNotFoundException -> 0x0056 }
            r3 = r0
        L_0x0056:
            if (r3 == 0) goto L_0x0079
            r7.add(r3)     // Catch:{ all -> 0x005c }
            goto L_0x0079
        L_0x005c:
            java.lang.ClassLoader r0 = r6.getClassLoader()     // Catch:{ all -> 0x00b1 }
            java.util.List r7 = r4.A01(r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x0079
        L_0x0065:
            java.lang.ClassLoader r0 = r6.getClassLoader()     // Catch:{ all -> 0x00b1 }
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r6, r0)     // Catch:{ all -> 0x00b1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00b1 }
            X.4C5 r0 = X.C829545o.A06(r0)     // Catch:{ all -> 0x00b1 }
            java.util.List r7 = X.C829345m.A01(r0)     // Catch:{ all -> 0x00b1 }
        L_0x0079:
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x00b1 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x008d
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x00b1 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0092
        L_0x008d:
            kotlinx.coroutines.android.AndroidDispatcherFactory r5 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r5     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x00aa
            goto L_0x009c
        L_0x0092:
            r1.next()     // Catch:{ all -> 0x00b1 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0092
            goto L_0x008d
        L_0x009c:
            X.46A r2 = r5.createDispatcher(r7)     // Catch:{ all -> 0x00a1 }
            goto L_0x00b8
        L_0x00a1:
            r1 = move-exception
            java.lang.String r0 = "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used"
            X.46i r2 = new X.46i     // Catch:{ all -> 0x00b1 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x00b1 }
            goto L_0x00b8
        L_0x00aa:
            r0 = 0
            X.46i r2 = new X.46i     // Catch:{ all -> 0x00b1 }
            r2.<init>(r0, r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x00b8
        L_0x00b1:
            r1 = move-exception
            r0 = 0
            X.46i r2 = new X.46i
            r2.<init>(r0, r1)
        L_0x00b8:
            A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass788.<clinit>():void");
    }
}
