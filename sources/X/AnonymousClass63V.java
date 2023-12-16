package X;

/* renamed from: X.63V  reason: invalid class name */
public final class AnonymousClass63V extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ String $name = "wa_bwe_pl_classifier_mobile";
    public final /* synthetic */ AnonymousClass4GQ $onError;
    public final /* synthetic */ AnonymousClass4GQ $onSuccess;
    public final /* synthetic */ int $version;
    public final /* synthetic */ C103595Np this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63V(C103595Np r2, AnonymousClass4GQ r3, AnonymousClass4GQ r4, int i) {
        super(1);
        this.$version = i;
        this.this$0 = r2;
        this.$onSuccess = r3;
        this.$onError = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2.close();
        r1 = X.AnonymousClass001.A0o();
        X.C86604Kt.A1U("MLModelCacheManagerImpl/updateModel/verifying model file hash for ", r6, r1);
        X.C18260x0.A1F(r1, r4);
        r2 = new java.io.FileInputStream(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r0 = X.C105925Wy.A00(r2, r11.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f5, code lost:
        if (r0 == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f7, code lost:
        r1 = X.AnonymousClass001.A0o();
        X.C86604Kt.A1U("MLModelCacheManagerImpl/updateModel/found model file for ", r6, r1);
        X.C18260x0.A1G(r1, r4);
        r10 = r10.getCanonicalPath();
        X.C162457s7.A0D(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010b, code lost:
        r1 = X.AnonymousClass001.A0o();
        X.C86604Kt.A1U("MLModelCacheManagerImpl/updateModel/hash verification failed for ", r6, r1);
        X.C18270x1.A1F(r1, r4);
        r1 = X.C96094vn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011c, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0120, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        X.AnonymousClass2A8.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0124, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0127, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        X.AnonymousClass2A8.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012c, code lost:
        X.AnonymousClass2A8.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0185, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0186, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0189, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            X.3Z9 r15 = (X.AnonymousClass3Z9) r15
            java.lang.Object r5 = r15.value
            java.lang.String r6 = r14.$name
            int r4 = r14.$version
            X.5Np r10 = r14.this$0
            X.4GQ r9 = r14.$onSuccess
            X.4GQ r3 = r14.$onError
            boolean r0 = r5 instanceof X.AnonymousClass3Z0
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01a6
            r2 = r5
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MLModelManager/fetchModel/found ml model url for "
            X.C86604Kt.A1U(r0, r6, r1)
            X.C18260x0.A1G(r1, r4)
            X.5Ig r8 = r10.A01     // Catch:{ all -> 0x0044 }
            r0 = 0
            X.C162457s7.A0J(r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "MLModelDownloaderImpl/downloadModel/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0044 }
            X.33K r1 = r8.A01     // Catch:{ all -> 0x0044 }
            X.2pq r0 = r8.A02     // Catch:{ all -> 0x0044 }
            r7 = 0
            X.4GL r2 = r1.A00(r0, r2, r7)     // Catch:{ all -> 0x0044 }
            X.2s4 r1 = r8.A00     // Catch:{ all -> 0x0044 }
            r0 = 36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0044 }
            java.io.InputStream r8 = r2.B47(r1, r7, r0)     // Catch:{ all -> 0x0044 }
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            X.3Z0 r8 = new X.3Z0
            r8.<init>(r0)
        L_0x004a:
            boolean r0 = r8 instanceof X.AnonymousClass3Z0
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x018f
            r7 = r8
            java.io.InputStream r7 = (java.io.InputStream) r7
            X.5Wy r2 = r10.A00     // Catch:{ all -> 0x014d }
            X.C18260x0.A0P(r6, r7)     // Catch:{ all -> 0x014d }
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x014d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x014d }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x013e
            java.lang.Object r11 = X.AnonymousClass001.A0i(r0, r4)     // Catch:{ all -> 0x014d }
            X.5Ro r11 = (X.C104585Ro) r11     // Catch:{ all -> 0x014d }
            if (r11 == 0) goto L_0x013e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/deleting model file for "
            X.C86604Kt.A1U(r0, r6, r1)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            X.C18260x0.A1F(r1, r4)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            java.io.File r10 = r2.A01(r6, r4)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            boolean r0 = r10.exists()     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            if (r0 == 0) goto L_0x00ae
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            java.lang.String r0 = "MLModelCacheManagerImpl/removeModel/deleting model file for "
            X.C86604Kt.A1U(r0, r6, r1)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            X.C18260x0.A1G(r1, r4)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            r10.delete()     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
        L_0x008f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/writing model file for "
            X.C86604Kt.A1U(r0, r6, r1)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            X.C18260x0.A1F(r1, r4)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            java.io.File r10 = r2.A01(r6, r4)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            java.io.File r0 = r10.getParentFile()     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            r0.mkdirs()     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            boolean r0 = r7 instanceof java.io.BufferedInputStream     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            if (r0 == 0) goto L_0x00bb
            r2 = r7
            java.io.BufferedInputStream r2 = (java.io.BufferedInputStream) r2     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            goto L_0x00c2
        L_0x00ae:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            java.lang.String r0 = "MLModelCacheManagerImpl/removeModel/model file not found for "
            X.C86604Kt.A1U(r0, r6, r1)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            X.C18260x0.A1G(r1, r4)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            goto L_0x008f
        L_0x00bb:
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            r2.<init>(r7, r0)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
        L_0x00c2:
            java.io.FileOutputStream r12 = X.AnonymousClass0x9.A0h(r10)     // Catch:{ all -> 0x0125 }
        L_0x00c6:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r13 = new byte[r0]     // Catch:{ all -> 0x011e }
            int r1 = r2.read(r13)     // Catch:{ all -> 0x011e }
            if (r1 < 0) goto L_0x00d5
            r0 = 0
            r12.write(r13, r0, r1)     // Catch:{ all -> 0x011e }
            goto L_0x00c6
        L_0x00d5:
            r12.close()     // Catch:{ all -> 0x0125 }
            r2.close()     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/verifying model file hash for "
            X.C86604Kt.A1U(r0, r6, r1)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            X.C18260x0.A1F(r1, r4)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            r2.<init>(r10)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x011a }
            boolean r0 = X.C105925Wy.A00(r2, r0)     // Catch:{ all -> 0x011a }
            r2.close()     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            if (r0 == 0) goto L_0x010b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/found model file for "
            X.C86604Kt.A1U(r0, r6, r1)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            X.C18260x0.A1G(r1, r4)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            java.lang.String r10 = r10.getCanonicalPath()     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            X.C162457s7.A0D(r10)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            goto L_0x0153
        L_0x010b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            java.lang.String r0 = "MLModelCacheManagerImpl/updateModel/hash verification failed for "
            X.C86604Kt.A1U(r0, r6, r1)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            X.C18270x1.A1F(r1, r4)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            X.4vn r1 = X.C96094vn.A00     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            goto L_0x012f
        L_0x011a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x011c }
        L_0x011c:
            r1 = move-exception
            goto L_0x012c
        L_0x011e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0120 }
        L_0x0120:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r12, r1)     // Catch:{ all -> 0x0125 }
            throw r0     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0127 }
        L_0x0127:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r2, r0)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
            goto L_0x012f
        L_0x012c:
            X.AnonymousClass2A8.A00(r2, r0)     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
        L_0x012f:
            throw r1     // Catch:{ IOException -> 0x0137, NoSuchAlgorithmException -> 0x0130 }
        L_0x0130:
            r0 = move-exception
            X.4vk r1 = new X.4vk     // Catch:{ all -> 0x014d }
            r1.<init>(r0)     // Catch:{ all -> 0x014d }
            goto L_0x013d
        L_0x0137:
            r0 = move-exception
            X.4vl r1 = new X.4vl     // Catch:{ all -> 0x014d }
            r1.<init>(r0)     // Catch:{ all -> 0x014d }
        L_0x013d:
            throw r1     // Catch:{ all -> 0x014d }
        L_0x013e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "MLModelCacheManagerImpl/verifyModelHashExists/model hash not found for "
            X.C86604Kt.A1U(r0, r6, r1)     // Catch:{ all -> 0x014d }
            X.C18270x1.A1F(r1, r4)     // Catch:{ all -> 0x014d }
            X.4vm r0 = X.C96084vm.A00     // Catch:{ all -> 0x014d }
            throw r0     // Catch:{ all -> 0x014d }
        L_0x014d:
            r0 = move-exception
            X.3Z0 r10 = new X.3Z0     // Catch:{ all -> 0x0183 }
            r10.<init>(r0)     // Catch:{ all -> 0x0183 }
        L_0x0153:
            boolean r0 = r10 instanceof X.AnonymousClass3Z0     // Catch:{ all -> 0x0183 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x016b
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0183 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "MLModelManager/fetchModel/updated ml model file into cache for "
            X.C86604Kt.A1U(r0, r6, r1)     // Catch:{ all -> 0x0183 }
            X.C18260x0.A1G(r1, r4)     // Catch:{ all -> 0x0183 }
            r9.invoke(r2)     // Catch:{ all -> 0x0183 }
        L_0x016b:
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r10)     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x018a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "MLModelManager/fetchModel/updated ml model file into cache failed for "
            X.C86604Kt.A1U(r0, r6, r1)     // Catch:{ all -> 0x0183 }
            X.C18270x1.A1F(r1, r4)     // Catch:{ all -> 0x0183 }
            X.4vo r0 = X.C96104vo.A00     // Catch:{ all -> 0x0183 }
            r3.invoke(r0)     // Catch:{ all -> 0x0183 }
            goto L_0x018a
        L_0x0183:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0185 }
        L_0x0185:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)
            throw r0
        L_0x018a:
            if (r7 == 0) goto L_0x018f
            r7.close()
        L_0x018f:
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r8)
            if (r0 == 0) goto L_0x01a6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MLModelManager/fetchModel/downloading ml model file failed for "
            X.C86604Kt.A1U(r0, r6, r1)
            X.C18270x1.A1F(r1, r4)
            X.4vp r0 = X.C96114vp.A00
            r3.invoke(r0)
        L_0x01a6:
            java.lang.String r4 = r14.$name
            int r3 = r14.$version
            X.4GQ r2 = r14.$onError
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r5)
            if (r0 == 0) goto L_0x01c3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MLModelManager/fetchModel/ml model url not found for "
            X.C86604Kt.A1U(r0, r4, r1)
            X.C18270x1.A1F(r1, r3)
            X.4vq r0 = X.C96124vq.A00
            r2.invoke(r0)
        L_0x01c3:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass63V.invoke(java.lang.Object):java.lang.Object");
    }
}
