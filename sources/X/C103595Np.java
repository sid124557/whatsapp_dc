package X;

/* renamed from: X.5Np  reason: invalid class name and case insensitive filesystem */
public final class C103595Np {
    public final C105925Wy A00;
    public final C102285Ig A01;
    public final AnonymousClass5GY A02;
    public final AnonymousClass4FS A03;

    public C103595Np(C105925Wy r2, C102285Ig r3, AnonymousClass5GY r4, AnonymousClass4FS r5) {
        C162457s7.A0J(r5, 1);
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass2A8.A00(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(int r6) {
        /*
            r5 = this;
            java.lang.String r4 = "wa_bwe_pl_classifier_mobile"
            X.5Wy r3 = r5.A00     // Catch:{ 59Y -> 0x0087 }
            java.util.Map r0 = r3.A01     // Catch:{ 59Y -> 0x0087 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ 59Y -> 0x0087 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ 59Y -> 0x0087 }
            r2 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.Object r1 = X.AnonymousClass001.A0i(r0, r6)     // Catch:{ 59Y -> 0x0087 }
            X.5Ro r1 = (X.C104585Ro) r1     // Catch:{ 59Y -> 0x0087 }
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            if (r1 == 0) goto L_0x0078
            java.io.File r3 = r3.A01(r4, r6)     // Catch:{ 59Y -> 0x0087 }
            boolean r0 = r3.exists()     // Catch:{ 59Y -> 0x0087 }
            if (r0 == 0) goto L_0x0068
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x005a, NoSuchAlgorithmException -> 0x0061 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x005a, NoSuchAlgorithmException -> 0x0061 }
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x0044 }
            boolean r0 = X.C105925Wy.A00(r2, r0)     // Catch:{ all -> 0x0044 }
            r2.close()     // Catch:{ IOException -> 0x005a, NoSuchAlgorithmException -> 0x0061 }
            if (r0 == 0) goto L_0x004b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x005a, NoSuchAlgorithmException -> 0x0061 }
            java.lang.String r0 = "MLModelCacheManagerImpl/getModelFilePath/found model file for "
            X.C86604Kt.A1U(r0, r4, r1)     // Catch:{ IOException -> 0x005a, NoSuchAlgorithmException -> 0x0061 }
            X.C18260x0.A1G(r1, r6)     // Catch:{ IOException -> 0x005a, NoSuchAlgorithmException -> 0x0061 }
            java.lang.String r2 = r3.getCanonicalPath()     // Catch:{ IOException -> 0x005a, NoSuchAlgorithmException -> 0x0061 }
            return r2
        L_0x0044:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r2, r0)     // Catch:{ IOException -> 0x005a, NoSuchAlgorithmException -> 0x0061 }
            goto L_0x0059
        L_0x004b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x005a, NoSuchAlgorithmException -> 0x0061 }
            java.lang.String r0 = "MLModelCacheManagerImpl/getModelFilePath/hash verification failed for "
            X.C86604Kt.A1U(r0, r4, r1)     // Catch:{ IOException -> 0x005a, NoSuchAlgorithmException -> 0x0061 }
            X.C18270x1.A1F(r1, r6)     // Catch:{ IOException -> 0x005a, NoSuchAlgorithmException -> 0x0061 }
            X.4vn r1 = X.C96094vn.A00     // Catch:{ IOException -> 0x005a, NoSuchAlgorithmException -> 0x0061 }
        L_0x0059:
            throw r1     // Catch:{ IOException -> 0x005a, NoSuchAlgorithmException -> 0x0061 }
        L_0x005a:
            r0 = move-exception
            X.4vl r1 = new X.4vl     // Catch:{ 59Y -> 0x0087 }
            r1.<init>(r0)     // Catch:{ 59Y -> 0x0087 }
            goto L_0x0067
        L_0x0061:
            r0 = move-exception
            X.4vk r1 = new X.4vk     // Catch:{ 59Y -> 0x0087 }
            r1.<init>(r0)     // Catch:{ 59Y -> 0x0087 }
        L_0x0067:
            throw r1     // Catch:{ 59Y -> 0x0087 }
        L_0x0068:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 59Y -> 0x0087 }
            java.lang.String r0 = "MLModelCacheManagerImpl/getModelFilePath/model file not found for "
            X.C86604Kt.A1U(r0, r4, r1)     // Catch:{ 59Y -> 0x0087 }
            r1.append(r6)     // Catch:{ 59Y -> 0x0087 }
            X.AnonymousClass0x2.A19(r1)     // Catch:{ 59Y -> 0x0087 }
            return r2
        L_0x0078:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 59Y -> 0x0087 }
            java.lang.String r0 = "MLModelCacheManagerImpl/getModelFilePath/model hash not found for "
            X.C86604Kt.A1U(r0, r4, r1)     // Catch:{ 59Y -> 0x0087 }
            X.C18270x1.A1F(r1, r6)     // Catch:{ 59Y -> 0x0087 }
            X.4vm r0 = X.C96084vm.A00     // Catch:{ 59Y -> 0x0087 }
            throw r0     // Catch:{ 59Y -> 0x0087 }
        L_0x0087:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MLModelManager/getModelFilePath/Failed to get model path from cacheManager: "
            X.C18260x0.A1Q(r1, r0, r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C103595Np.A00(int):java.lang.String");
    }
}
