package X;

/* renamed from: X.2ub  reason: invalid class name and case insensitive filesystem */
public final class C58032ub {
    public static String A00;
    public static boolean A01;

    /* JADX WARNING: Removed duplicated region for block: B:38:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0PJ A00(android.content.Context r7) {
        /*
            r6 = 0
            java.io.File r1 = r7.getFilesDir()
            java.lang.String r0 = "debug_chat_host"
            java.io.File r1 = X.AnonymousClass002.A0A(r1, r0)
            java.lang.Class<X.2ub> r5 = X.C58032ub.class
            monitor-enter(r5)
            boolean r0 = A01     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x0015
            java.lang.String r4 = A00     // Catch:{ all -> 0x00b6 }
            goto L_0x004b
        L_0x0015:
            java.io.FileInputStream r3 = X.AnonymousClass0x9.A0g(r1)     // Catch:{ FileNotFoundException -> 0x0048, IOException | ClassCastException | ClassNotFoundException -> 0x0044 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ all -> 0x003a }
            r2.<init>(r3)     // Catch:{ all -> 0x003a }
            java.lang.Object r4 = r2.readObject()     // Catch:{ all -> 0x0030 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0030 }
            A00 = r4     // Catch:{ all -> 0x0030 }
            r0 = 1
            A01 = r0     // Catch:{ all -> 0x0030 }
            r2.close()     // Catch:{ all -> 0x003a }
            r3.close()     // Catch:{ FileNotFoundException -> 0x0048, IOException | ClassCastException | ClassNotFoundException -> 0x0044 }
            goto L_0x004b
        L_0x0030:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x003a }
        L_0x0039:
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0048, IOException | ClassCastException | ClassNotFoundException -> 0x0044 }
        L_0x0043:
            throw r1     // Catch:{ FileNotFoundException -> 0x0048, IOException | ClassCastException | ClassNotFoundException -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x00b6 }
        L_0x0048:
            monitor-exit(r5)
            r4 = r6
            goto L_0x004c
        L_0x004b:
            monitor-exit(r5)
        L_0x004c:
            if (r4 != 0) goto L_0x004f
            return r6
        L_0x004f:
            r1 = 58
            int r0 = r4.indexOf(r1)
            r2 = -1
            r5 = 5222(0x1466, float:7.318E-42)
            if (r0 == r2) goto L_0x00ad
            java.lang.String r0 = "["
            boolean r0 = r4.startsWith(r0)
            r3 = 1
            if (r0 == 0) goto L_0x008b
            int r1 = r4.lastIndexOf(r1)
            r0 = 93
            int r0 = r4.lastIndexOf(r0)
            if (r0 == r2) goto L_0x00a7
            java.lang.String r4 = r4.substring(r3, r0)
            if (r1 == r2) goto L_0x00ad
            int r0 = r0 + 1
            if (r1 != r0) goto L_0x00ad
            int r0 = r4.length()
            int r0 = r0 - r3
            if (r1 >= r0) goto L_0x00ad
            int r0 = r1 + 1
            java.lang.String r0 = r4.substring(r0)     // Catch:{ NumberFormatException -> 0x00a2 }
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00a2 }
            goto L_0x00ad
        L_0x008b:
            java.lang.String r0 = ":"
            java.lang.String[] r2 = r4.split(r0, r2)
            int r1 = r2.length
            r0 = 2
            if (r1 == r0) goto L_0x0098
            java.lang.String r0 = "debug hostname was set to an unknown format containing colons"
            goto L_0x00aa
        L_0x0098:
            r0 = 0
            r4 = r2[r0]
            r0 = r2[r3]     // Catch:{ NumberFormatException -> 0x00a2 }
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00a2 }
            goto L_0x00ad
        L_0x00a2:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)
            return r6
        L_0x00a7:
            java.lang.String r0 = "unrecognized debug hostname format starting with open square bracket"
        L_0x00aa:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00ad:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r4, r0)
            return r0
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58032ub.A00(android.content.Context):X.0PJ");
    }
}
