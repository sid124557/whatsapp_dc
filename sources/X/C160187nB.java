package X;

/* renamed from: X.7nB  reason: invalid class name and case insensitive filesystem */
public final class C160187nB {
    public static final C160187nB A00 = new C160187nB();

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.C154507dH.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ab, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fc, code lost:
        X.AnonymousClass2A8.A00(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(java.lang.ClassLoader r9) {
        /*
            r8 = this;
            java.lang.Class<kotlinx.coroutines.android.AndroidDispatcherFactory> r5 = kotlinx.coroutines.android.AndroidDispatcherFactory.class
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = "META-INF/services/"
            r1.append(r0)     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0100 }
            java.util.Enumeration r0 = r9.getResources(r0)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ all -> 0x0100 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0100 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0100 }
        L_0x0026:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0100 }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x0100 }
            java.net.URL r1 = (java.net.URL) r1     // Catch:{ all -> 0x0100 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = "jar"
            r6 = 0
            boolean r0 = X.C175738Zn.A0Y(r3, r0, r6)     // Catch:{ all -> 0x0100 }
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = "jar:file:"
            java.lang.String r2 = X.C175728Zm.A0L(r3, r0, r3)     // Catch:{ all -> 0x0100 }
            r0 = 33
            int r1 = X.C175728Zm.A0C(r2, r0, r6)     // Catch:{ all -> 0x0100 }
            r0 = -1
            if (r1 == r0) goto L_0x0055
            java.lang.String r2 = r2.substring(r6, r1)     // Catch:{ all -> 0x0100 }
            X.C162457s7.A0D(r2)     // Catch:{ all -> 0x0100 }
        L_0x0055:
            java.lang.String r0 = "!/"
            java.lang.String r1 = X.C175728Zm.A0L(r3, r0, r3)     // Catch:{ all -> 0x0100 }
            java.util.jar.JarFile r3 = new java.util.jar.JarFile     // Catch:{ all -> 0x0100 }
            r3.<init>(r2, r6)     // Catch:{ all -> 0x0100 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x00a0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a0 }
            java.io.InputStream r2 = r3.getInputStream(r0)     // Catch:{ all -> 0x00a0 }
            java.lang.String r1 = "UTF-8"
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x00a0 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00a0 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x00a0 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a0 }
            java.util.List r0 = A00(r2)     // Catch:{ all -> 0x0099 }
            r2.close()     // Catch:{ all -> 0x00a0 }
            r3.close()     // Catch:{ all -> 0x0100 }
            goto L_0x0095
        L_0x0080:
            java.io.InputStream r1 = r1.openStream()     // Catch:{ all -> 0x0100 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0100 }
            r0.<init>(r1)     // Catch:{ all -> 0x0100 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0100 }
            r2.<init>(r0)     // Catch:{ all -> 0x0100 }
            java.util.List r0 = A00(r2)     // Catch:{ all -> 0x00ac }
            r2.close()     // Catch:{ all -> 0x0100 }
        L_0x0095:
            X.C73743g0.A0W(r0, r4)     // Catch:{ all -> 0x0100 }
            goto L_0x0026
        L_0x0099:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009b }
        L_0x009b:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x00a0 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00a7 }
            goto L_0x00ff
        L_0x00a7:
            r0 = move-exception
            X.C154507dH.A00(r2, r0)     // Catch:{ all -> 0x0100 }
            throw r2     // Catch:{ all -> 0x0100 }
        L_0x00ac:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x00ae:
            java.util.Set r1 = X.C73723fy.A0P(r4)     // Catch:{ all -> 0x0100 }
            boolean r0 = X.C18310x6.A1X(r1)     // Catch:{ all -> 0x0100 }
            if (r0 == 0) goto L_0x00f4
            java.util.ArrayList r4 = X.C73783g4.A0c(r1)     // Catch:{ all -> 0x0100 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x0100 }
        L_0x00c0:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0100 }
            if (r0 == 0) goto L_0x0108
            java.lang.String r1 = X.AnonymousClass001.A0m(r3)     // Catch:{ all -> 0x0100 }
            r0 = 0
            java.lang.Class r2 = java.lang.Class.forName(r1, r0, r9)     // Catch:{ all -> 0x0100 }
            boolean r0 = r5.isAssignableFrom(r2)     // Catch:{ all -> 0x0100 }
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = X.AnonymousClass001.A0h(r2)     // Catch:{ all -> 0x0100 }
            java.lang.Object r0 = r5.cast(r0)     // Catch:{ all -> 0x0100 }
            r4.add(r0)     // Catch:{ all -> 0x0100 }
            goto L_0x00c0
        L_0x00e1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = "Expected service of class "
            r1.append(r0)     // Catch:{ all -> 0x0100 }
            r1.append(r5)     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = ", but found "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0E(r2, r0, r1)     // Catch:{ all -> 0x0100 }
            goto L_0x00ff
        L_0x00f4:
            java.lang.String r0 = "No providers were loaded with FastServiceLoader"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x0100 }
            goto L_0x00ff
        L_0x00fb:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r2, r0)     // Catch:{ all -> 0x0100 }
        L_0x00ff:
            throw r1     // Catch:{ all -> 0x0100 }
        L_0x0100:
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r5, r9)
            java.util.List r4 = X.C73723fy.A0F(r0)
        L_0x0108:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160187nB.A01(java.lang.ClassLoader):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r0 <= 0) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r4.add(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(java.io.BufferedReader r5) {
        /*
            java.util.LinkedHashSet r4 = X.AnonymousClass0x9.A17()
        L_0x0004:
            java.lang.String r2 = r5.readLine()
            if (r2 != 0) goto L_0x000f
            java.util.List r0 = X.C73723fy.A0F(r4)
            return r0
        L_0x000f:
            java.lang.String r0 = "#"
            r3 = 0
            int r1 = X.C175728Zm.A0G(r2, r0, r3, r3)
            r0 = -1
            if (r1 == r0) goto L_0x0020
            java.lang.String r2 = r2.substring(r3, r1)
            X.C162457s7.A0D(r2)
        L_0x0020:
            java.lang.String r2 = X.AnonymousClass2AB.A00(r2)
        L_0x0024:
            int r0 = r2.length()
            if (r3 >= r0) goto L_0x0049
            char r1 = r2.charAt(r3)
            r0 = 46
            if (r1 == r0) goto L_0x0046
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r1)
            if (r0 != 0) goto L_0x0046
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Illegal service provider class name: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r2, r1)
            throw r0
        L_0x0046:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0049:
            if (r0 <= 0) goto L_0x0004
            r4.add(r2)
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160187nB.A00(java.io.BufferedReader):java.util.List");
    }
}
