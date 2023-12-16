package X;

/* renamed from: X.6NX  reason: invalid class name */
public final class AnonymousClass6NX extends AnonymousClass8KW {
    public final AnonymousClass6NT[] A00;
    public final /* synthetic */ AnonymousClass6NZ A01;

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
        r5.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6NX(X.AnonymousClass6NZ r16, X.AnonymousClass6NP r17) {
        /*
            r15 = this;
            r0 = r16
            r15.A01 = r0
            r15.<init>()
            android.content.Context r2 = r0.A03
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "/data/local/tmp/exopackage/"
            r1.append(r0)
            java.lang.String r0 = r2.getPackageName()
            r1.append(r0)
            java.lang.String r0 = "/native-libs/"
            java.io.File r12 = X.AnonymousClass6C7.A0S(r0, r1)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.LinkedHashSet r10 = X.AnonymousClass0x9.A17()
            java.lang.String[] r11 = X.C159237lU.A02()
            int r9 = r11.length
            r8 = 0
        L_0x002d:
            if (r8 >= r9) goto L_0x00cb
            r1 = r11[r8]
            java.io.File r6 = X.AnonymousClass002.A0A(r12, r1)
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L_0x00a2
            r10.add(r1)
            java.lang.String r0 = "metadata.txt"
            java.io.File r1 = X.AnonymousClass002.A0A(r6, r0)
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L_0x00a2
            java.io.FileReader r5 = new java.io.FileReader
            r5.<init>(r1)
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x00c1 }
            r4.<init>(r5)     // Catch:{ all -> 0x00c1 }
        L_0x0054:
            java.lang.String r2 = r4.readLine()     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x009c
            int r0 = r2.length()     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x0054
            r0 = 32
            int r14 = r2.indexOf(r0)     // Catch:{ all -> 0x00b7 }
            r0 = -1
            if (r14 == r0) goto L_0x00a5
            java.lang.StringBuilder r1 = X.AnonymousClass6C7.A0p(r14, r2)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = ".so"
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x00b7 }
            int r13 = r7.size()     // Catch:{ all -> 0x00b7 }
            r1 = 0
        L_0x0078:
            if (r1 >= r13) goto L_0x008b
            java.lang.Object r0 = r7.get(r1)     // Catch:{ all -> 0x00b7 }
            X.6NT r0 = (X.AnonymousClass6NT) r0     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x00b7 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x0054
            int r1 = r1 + 1
            goto L_0x0078
        L_0x008b:
            java.lang.String r2 = X.AnonymousClass6C9.A0c(r14, r2)     // Catch:{ all -> 0x00b7 }
            java.io.File r1 = X.AnonymousClass002.A0A(r6, r2)     // Catch:{ all -> 0x00b7 }
            X.6NT r0 = new X.6NT     // Catch:{ all -> 0x00b7 }
            r0.<init>(r1, r3, r2)     // Catch:{ all -> 0x00b7 }
            r7.add(r0)     // Catch:{ all -> 0x00b7 }
            goto L_0x0054
        L_0x009c:
            r4.close()     // Catch:{ all -> 0x00c1 }
            r5.close()
        L_0x00a2:
            int r8 = r8 + 1
            goto L_0x002d
        L_0x00a5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "illegal line in exopackage metadata: ["
            r1.append(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = X.AnonymousClass000.A0W(r2, r1)     // Catch:{ all -> 0x00b7 }
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)     // Catch:{ all -> 0x00b7 }
            throw r0     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00bc }
            goto L_0x00c0
        L_0x00bc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00c1 }
        L_0x00c0:
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00c6 }
            throw r1
        L_0x00c6:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00cb:
            int r0 = r10.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r10.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1 = r17
            r1.A02 = r0
            int r0 = r7.size()
            X.6NT[] r0 = new X.AnonymousClass6NT[r0]
            java.lang.Object[] r0 = r7.toArray(r0)
            X.6NT[] r0 = (X.AnonymousClass6NT[]) r0
            r15.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NX.<init>(X.6NZ, X.6NP):void");
    }
}
