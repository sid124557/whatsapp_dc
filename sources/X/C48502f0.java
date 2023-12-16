package X;

/* renamed from: X.2f0  reason: invalid class name and case insensitive filesystem */
public class C48502f0 {
    public final AnonymousClass0XM A00;
    public final C44402Vx A01;

    public AnonymousClass2ZX A01(C04260Nl r4) {
        return (AnonymousClass2ZX) this.A01.A00.get(new C48572f7(r4.A00, r4.A04));
    }

    public C48502f0(AnonymousClass0XM r1, C44402Vx r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        com.whatsapp.util.Log.e("backupcipher/db/get/error ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1 = X.AnonymousClass001.A0o();
        X.AnonymousClass000.A10(r7, "backupcipher/db/get/can't find ", r1);
        X.C18280x3.A1C(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        com.whatsapp.util.Log.w("backupcipher/header-mismatch", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e5, code lost:
        if (r6 != null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ea, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ec, code lost:
        com.whatsapp.util.Log.e("backupcipher/db/get/ioerror ", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ef, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(java.lang.Runnable r16, java.util.List r17) {
        /*
            r15 = this;
            java.util.HashSet r2 = X.AnonymousClass002.A0K()
            r3 = r17
            java.util.Iterator r8 = r3.iterator()
        L_0x000a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00f0
            java.io.File r7 = X.AnonymousClass0x9.A0f(r8)
            r7.getPath()
            java.lang.String r0 = r7.getName()
            X.22O r1 = X.C57202tG.A00(r0)
            X.22O r0 = X.AnonymousClass22O.CRYPT12
            if (r1 != r0) goto L_0x0069
            java.lang.String r5 = "backupcipher/db/get/ioerror "
            boolean r0 = r7.exists()
            r6 = 0
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "backupkey/db/getparams/does-not-exist"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0031:
            java.lang.String r0 = "backupencryption/getkeysforbackups/no-cipher/skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x000a
        L_0x0037:
            java.io.FileInputStream r6 = X.AnonymousClass0x9.A0g(r7)     // Catch:{ 23v -> 0x0058, FileNotFoundException -> 0x004a, IOException -> 0x0043, all -> 0x00e2 }
            X.0Nl r9 = X.C06550Ye.A04(r6)     // Catch:{ 23v -> 0x0058, FileNotFoundException -> 0x004a, IOException -> 0x0043 }
            r6.close()     // Catch:{ Exception -> 0x00b2 }
            goto L_0x00b6
        L_0x0043:
            r1 = move-exception
            java.lang.String r0 = "backupcipher/db/get/error "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00e4 }
            goto L_0x005e
        L_0x004a:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "backupcipher/db/get/can't find "
            X.AnonymousClass000.A10(r7, r0, r1)     // Catch:{ all -> 0x00e4 }
            X.C18280x3.A1C(r1, r4)     // Catch:{ all -> 0x00e4 }
            goto L_0x005e
        L_0x0058:
            r1 = move-exception
            java.lang.String r0 = "backupcipher/header-mismatch"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00e4 }
        L_0x005e:
            if (r6 == 0) goto L_0x0031
            r6.close()     // Catch:{ Exception -> 0x0064 }
            goto L_0x0031
        L_0x0064:
            r0 = move-exception
            com.whatsapp.util.Log.e(r5, r0)
            goto L_0x0031
        L_0x0069:
            X.22O r0 = X.AnonymousClass22O.CRYPT14
            if (r1 != r0) goto L_0x0031
            java.io.FileInputStream r5 = X.AnonymousClass0x9.A0g(r7)     // Catch:{ IOException -> 0x00d9 }
            X.6cU r4 = X.C130756cU.A00(r5)     // Catch:{ all -> 0x00cf }
            if (r4 == 0) goto L_0x00ad
            X.6yF r1 = r4.A0N()     // Catch:{ all -> 0x00cf }
            X.6yF r0 = X.C143046yF.WA_PROVIDED     // Catch:{ all -> 0x00cf }
            if (r1 != r0) goto L_0x00ad
            X.6cR r1 = r4.A0P()     // Catch:{ all -> 0x00cf }
            X.8Lq r0 = r1.A0M()     // Catch:{ all -> 0x00cf }
            byte[] r11 = r0.A07()     // Catch:{ all -> 0x00cf }
            java.lang.String r10 = r1.A0Q()     // Catch:{ all -> 0x00cf }
            X.8Lq r0 = r1.A0P()     // Catch:{ all -> 0x00cf }
            byte[] r12 = r0.A07()     // Catch:{ all -> 0x00cf }
            X.8Lq r0 = r1.A0O()     // Catch:{ all -> 0x00cf }
            byte[] r13 = r0.A07()     // Catch:{ all -> 0x00cf }
            X.8Lq r0 = r1.A0N()     // Catch:{ all -> 0x00cf }
            byte[] r14 = r0.A07()     // Catch:{ all -> 0x00cf }
            X.0Nl r9 = new X.0Nl     // Catch:{ all -> 0x00cf }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00cf }
            goto L_0x00ae
        L_0x00ad:
            r9 = 0
        L_0x00ae:
            r5.close()     // Catch:{ IOException -> 0x00d9 }
            goto L_0x00b6
        L_0x00b2:
            r0 = move-exception
            com.whatsapp.util.Log.e(r5, r0)
        L_0x00b6:
            if (r9 == 0) goto L_0x0031
            byte[] r0 = r9.A02
            byte[] r5 = X.C06550Ye.A0T(r0)
            java.lang.String r4 = r9.A00
            byte[] r1 = r9.A04
            X.2fn r0 = new X.2fn
            r0.<init>(r4, r1, r5)
            r2.contains(r0)
            r2.add(r0)
            goto L_0x000a
        L_0x00cf:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00d4 }
            goto L_0x00d8
        L_0x00d4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00d9 }
        L_0x00d8:
            throw r1     // Catch:{ IOException -> 0x00d9 }
        L_0x00d9:
            r1 = move-exception
            java.lang.String r0 = "readProtobufBackupCipher/failed"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0031
        L_0x00e2:
            r1 = move-exception
            throw r1
        L_0x00e4:
            r1 = move-exception
            if (r6 == 0) goto L_0x00ef
            r6.close()     // Catch:{ Exception -> 0x00eb }
            throw r1
        L_0x00eb:
            r0 = move-exception
            com.whatsapp.util.Log.e(r5, r0)
        L_0x00ef:
            throw r1
        L_0x00f0:
            int r7 = r2.size()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "backupencryption/getkeys/size "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " (backups="
            X.AnonymousClass000.A1H(r0, r1, r3)
            java.lang.String r0 = ")"
            X.C18260x0.A1L(r1, r0)
            X.2Vx r0 = r15.A01
            java.util.HashMap r0 = r0.A00
            r0.clear()
            java.util.Iterator r6 = r2.iterator()
        L_0x0115:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0148
            java.lang.Object r2 = r6.next()
            X.2fn r2 = (X.C48982fn) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "backupencryption/getkeysforencryptedbackups/v="
            r1.append(r0)
            java.lang.String r5 = r2.A00
            X.C18260x0.A1L(r1, r5)
            byte[] r4 = r2.A02
            java.util.Arrays.toString(r4)
            byte[] r3 = r2.A01
            java.util.Arrays.toString(r3)
            X.0XM r2 = r15.A00
            r1 = 36
            X.3ca r0 = new X.3ca
            r8 = r16
            r0.<init>((java.lang.Object) r8, (java.lang.Object) r15, (int) r7, (int) r1)
            r2.A04(r0, r5, r4, r3)
            goto L_0x0115
        L_0x0148:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48502f0.A00(java.lang.Runnable, java.util.List):int");
    }
}
