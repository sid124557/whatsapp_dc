package X;

/* renamed from: X.3Zp  reason: invalid class name and case insensitive filesystem */
public class C70033Zp implements Runnable {
    public Object A00;
    public final int A01;

    public C70033Zp(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x039b, code lost:
        if (r8 != null) goto L_0x039d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        r1.A0H(6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x043a, code lost:
        if (r8 != null) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0514, code lost:
        r3.BkM(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0517, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x069b, code lost:
        if (r7 == 2) goto L_0x069d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x076b, code lost:
        if (r7 != 3) goto L_0x076d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x07ec, code lost:
        if (r2.contains(r1) != false) goto L_0x07ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x08a1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x08a2, code lost:
        r5.A02.A05.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x08a9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r4 = r5.A02;
        r3 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014f, code lost:
        if (r3.tryAcquire() == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0151, code lost:
        r2 = r4.A01(".gz");
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0159, code lost:
        if (r1 >= r2.length) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015b, code lost:
        r4.A00(r2[r1]);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0163, code lost:
        r3.release();
        r1 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x016c, code lost:
        if (r1.A03() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016e, code lost:
        r4 = r1.A00;
        r3 = X.C58422vE.A02;
        r8 = java.util.concurrent.TimeUnit.MINUTES.toMillis((long) r4.A0O(r3, 215));
        r7 = r5.A03.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x019c, code lost:
        if (X.AnonymousClass001.A1V((r8 > java.lang.Math.abs(X.AnonymousClass0x9.A05(X.AnonymousClass0x2.A0A(X.C18270x1.A05(r7), "qpl_last_upload_ts"))) ? 1 : (r8 == java.lang.Math.abs(X.AnonymousClass0x9.A05(X.AnonymousClass0x2.A0A(X.C18270x1.A05(r7), "qpl_last_upload_ts"))) ? 0 : -1))) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019e, code lost:
        if (r10 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a6, code lost:
        if (r4.A0O(r3, 3950) < 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c9, code lost:
        if (X.AnonymousClass001.A1V((java.util.concurrent.TimeUnit.MINUTES.toMillis((long) r4.A0O(r3, 3950)) > java.lang.Math.abs(X.AnonymousClass0x9.A05(X.AnonymousClass0x2.A0A(X.C18270x1.A05(r7), "qpl_last_upload_ts"))) ? 1 : (java.util.concurrent.TimeUnit.MINUTES.toMillis((long) r4.A0O(r3, 3950)) == java.lang.Math.abs(X.AnonymousClass0x9.A05(X.AnonymousClass0x2.A0A(X.C18270x1.A05(r7), "qpl_last_upload_ts"))) ? 0 : -1))) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01cb, code lost:
        com.whatsapp.util.Log.d("QPL scheduling upload");
        r4 = new X.AnonymousClass0Aw(com.whatsapp.quicklog.QplUploadScheduler$QPLUploadWorker.class);
        r4.A04(X.C18270x1.A07());
        r3 = java.util.concurrent.TimeUnit.MINUTES;
        r4.A02(5, r3);
        r4.A03(X.AnonymousClass0FN.EXPONENTIAL, r3, 15);
        X.C72333dY.A01(r5.A04).A07(X.C02320Fs.KEEP, X.AnonymousClass0x9.A0I(r4), "name.whatsapp.qpl.upload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01fe, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0774  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x07c1  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x07f7  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0815  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x082e  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0832  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0864  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x025b;
                case 1: goto L_0x0659;
                case 2: goto L_0x0248;
                case 3: goto L_0x023a;
                case 4: goto L_0x064b;
                case 5: goto L_0x062e;
                case 6: goto L_0x0623;
                case 7: goto L_0x060e;
                case 8: goto L_0x05d4;
                case 9: goto L_0x05cc;
                case 10: goto L_0x05c3;
                case 11: goto L_0x05b0;
                case 12: goto L_0x01ff;
                case 13: goto L_0x059d;
                case 14: goto L_0x0588;
                case 15: goto L_0x0580;
                case 16: goto L_0x0142;
                case 17: goto L_0x013a;
                case 18: goto L_0x0574;
                case 19: goto L_0x0565;
                case 20: goto L_0x0552;
                case 21: goto L_0x053b;
                case 22: goto L_0x0526;
                case 23: goto L_0x0518;
                case 24: goto L_0x04ff;
                case 25: goto L_0x04ea;
                case 26: goto L_0x04d1;
                case 27: goto L_0x047f;
                case 28: goto L_0x00b7;
                case 29: goto L_0x0090;
                case 30: goto L_0x045f;
                case 31: goto L_0x0361;
                case 32: goto L_0x007d;
                case 33: goto L_0x0353;
                case 34: goto L_0x032c;
                case 35: goto L_0x0062;
                case 36: goto L_0x031b;
                case 37: goto L_0x030e;
                case 38: goto L_0x0300;
                case 39: goto L_0x02ec;
                case 40: goto L_0x02dd;
                case 41: goto L_0x0054;
                case 42: goto L_0x02cb;
                case 43: goto L_0x02aa;
                case 44: goto L_0x02a0;
                case 45: goto L_0x002f;
                case 46: goto L_0x0017;
                case 47: goto L_0x0010;
                case 48: goto L_0x0297;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.VerifyPhoneNumber r1 = (com.whatsapp.registration.VerifyPhoneNumber) r1
            r0 = 1
            r1.A87(r0)
        L_0x000f:
            return
        L_0x0010:
            java.lang.Object r0 = r1.A00
            X.317 r0 = (X.AnonymousClass317) r0
            X.3Gp r1 = r0.A0S
            goto L_0x004f
        L_0x0017:
            java.lang.Object r3 = r1.A00
            X.317 r3 = (X.AnonymousClass317) r3
            X.3Wi r0 = r3.A0H
            X.4FU r2 = r0.A00
            if (r2 == 0) goto L_0x002b
            X.1VX r1 = r3.A0m
            X.30z r0 = r3.A0P
            boolean r0 = X.C621533t.A01(r2, r0, r1)
            if (r0 != 0) goto L_0x000f
        L_0x002b:
            r3.A0A()
            return
        L_0x002f:
            java.lang.Object r3 = r1.A00
            X.317 r3 = (X.AnonymousClass317) r3
            X.1iB r2 = r3.A0j
            X.3Mg r0 = r2.A0M
            boolean r0 = X.C66653Mg.A00(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "companion-device-manager/removeAllDevicesFromDatabase"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3dI r1 = r2.A0N
            r0 = 30
            X.3Zk r0 = X.C69983Zk.A00(r2, r0)
            r1.execute(r0)
            X.3Gp r1 = r3.A0S
        L_0x004f:
            r0 = 6
            r1.A0H(r0)
            return
        L_0x0054:
            java.lang.Object r1 = r1.A00
            X.07r r1 = (X.C009707r) r1
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x000f
            r1.invalidateOptionsMenu()
            return
        L_0x0062:
            java.lang.Object r2 = r1.A00
            com.whatsapp.registration.RegisterName r2 = (com.whatsapp.registration.RegisterName) r2
            X.2xS r1 = r2.A1K
            r0 = 1
            r1.A01(r0)
            java.lang.String r4 = "status_crossposting"
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x000f
            X.3dV r0 = r2.A0j
            X.4Fq r3 = r0.A04()
            goto L_0x0874
        L_0x007d:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.RegisterName r1 = (com.whatsapp.registration.RegisterName) r1
            X.5S9 r0 = r1.A0s
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x000f
            X.5S9 r1 = r1.A0s
            r0 = 1
            r1.A01(r0)
            return
        L_0x0090:
            java.lang.Object r2 = r1.A00
            X.2iS r2 = (X.C50602iS) r2
            X.2W1 r0 = r2.A0C
            X.3dV r0 = r0.A00
            r0.A05()
            java.io.File r0 = r0.A05
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x000f
            X.33e r0 = r2.A0F
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x000f
            X.2gy r1 = r2.A01
            X.5rC r0 = r2.A00
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r0 = com.whatsapp.jobqueue.job.GetStatusPrivacyJob.A00(r0)
            r1.A02(r0)
            return
        L_0x00b7:
            java.lang.Object r3 = r1.A00
            X.2iS r3 = (X.C50602iS) r3
            X.5UP r0 = r3.A0M
            boolean r0 = X.C18300x5.A1S(r0)
            if (r0 == 0) goto L_0x00d3
            X.2Hl r1 = r3.A0O
            X.1VX r0 = r3.A0H
            X.5oH r2 = new X.5oH
            r2.<init>(r0)
            java.util.concurrent.ConcurrentHashMap r1 = r1.A00
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.put(r2, r0)
        L_0x00d3:
            X.2rB r8 = r3.A0P
            X.2lk r6 = r8.A08
            r3 = 0
            r6.A01(r3, r3)
            X.1VX r2 = r8.A03
            r1 = 4679(0x1247, float:6.557E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x000f
            X.2Hl r0 = r8.A04
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.util.Set r1 = r0.keySet()
            X.C162457s7.A0D(r1)
            X.65T[] r0 = new X.AnonymousClass65T[r3]
            java.lang.Object[] r7 = r1.toArray(r0)
            X.65T[] r7 = (X.AnonymousClass65T[]) r7
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            r4 = 0
        L_0x00ff:
            int r0 = r7.length
            if (r4 >= r0) goto L_0x011e
            r0 = r7[r4]
            X.34e[] r3 = r0.Bij()
            r8.A04(r3)
            int r2 = r3.length
            if (r2 <= 0) goto L_0x011b
            r1 = 0
        L_0x010f:
            r0 = r3[r1]
            int r0 = r0.A01
            X.C18270x1.A1K(r5, r0)
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x011b
            goto L_0x010f
        L_0x011b:
            int r4 = r4 + 1
            goto L_0x00ff
        L_0x011e:
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x000f
            int r0 = r5.size()
            int[] r2 = new int[r0]
            r1 = 0
        L_0x012b:
            int r0 = r5.size()
            if (r1 >= r0) goto L_0x089d
            int r0 = X.AnonymousClass000.A09(r5, r1)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x012b
        L_0x013a:
            java.lang.Object r0 = r1.A00
            X.3UD r0 = (X.AnonymousClass3UD) r0
            X.3DI r5 = r0.A08
            r10 = 1
            goto L_0x0147
        L_0x0142:
            java.lang.Object r5 = r1.A00
            X.3DI r5 = (X.AnonymousClass3DI) r5
            r10 = 0
        L_0x0147:
            X.2yF r4 = r5.A02     // Catch:{ all -> 0x08a1 }
            java.util.concurrent.Semaphore r3 = r4.A05     // Catch:{ all -> 0x08a1 }
            boolean r0 = r3.tryAcquire()     // Catch:{ all -> 0x08a1 }
            if (r0 == 0) goto L_0x0163
            java.lang.String r0 = ".gz"
            java.io.File[] r2 = r4.A01(r0)     // Catch:{ all -> 0x08a1 }
            r1 = 0
        L_0x0158:
            int r0 = r2.length     // Catch:{ all -> 0x08a1 }
            if (r1 >= r0) goto L_0x0163
            r0 = r2[r1]     // Catch:{ all -> 0x08a1 }
            r4.A00(r0)     // Catch:{ all -> 0x08a1 }
            int r1 = r1 + 1
            goto L_0x0158
        L_0x0163:
            r3.release()
            X.337 r1 = r5.A01
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x000f
            X.1VX r4 = r1.A00
            r0 = 215(0xd7, float:3.01E-43)
            X.2vE r3 = X.C58422vE.A02
            int r0 = r4.A0O(r3, r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            long r0 = (long) r0
            long r8 = r2.toMillis(r0)
            X.2a6 r0 = r5.A03
            X.8qC r7 = r0.A01
            android.content.SharedPreferences r0 = X.C18270x1.A05(r7)
            java.lang.String r6 = "qpl_last_upload_ts"
            long r0 = X.AnonymousClass0x2.A0A(r0, r6)
            long r0 = X.AnonymousClass0x9.A05(r0)
            long r1 = java.lang.Math.abs(r0)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)
            if (r0 != 0) goto L_0x01cb
            if (r10 == 0) goto L_0x000f
            r1 = 3950(0xf6e, float:5.535E-42)
            int r0 = r4.A0O(r3, r1)
            if (r0 < 0) goto L_0x000f
            int r0 = r4.A0O(r3, r1)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            long r0 = (long) r0
            long r3 = r2.toMillis(r0)
            android.content.SharedPreferences r0 = X.C18270x1.A05(r7)
            long r0 = X.AnonymousClass0x2.A0A(r0, r6)
            long r0 = X.AnonymousClass0x9.A05(r0)
            long r1 = java.lang.Math.abs(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)
            if (r0 == 0) goto L_0x000f
        L_0x01cb:
            java.lang.String r0 = "QPL scheduling upload"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.Class<com.whatsapp.quicklog.QplUploadScheduler$QPLUploadWorker> r0 = com.whatsapp.quicklog.QplUploadScheduler$QPLUploadWorker.class
            X.0Aw r4 = new X.0Aw
            r4.<init>(r0)
            X.0XS r0 = X.C18270x1.A07()
            r4.A04(r0)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 5
            r4.A02(r0, r3)
            X.0FN r2 = X.AnonymousClass0FN.EXPONENTIAL
            r0 = 15
            r4.A03(r2, r3, r0)
            X.0Ay r3 = X.AnonymousClass0x9.A0I(r4)
            X.1uL r0 = r5.A04
            X.0Xb r2 = X.C72333dY.A01(r0)
            java.lang.String r1 = "name.whatsapp.qpl.upload"
            X.0Fs r0 = X.C02320Fs.KEEP
            r2.A07(r0, r3, r1)
            return
        L_0x01ff:
            java.lang.Object r4 = r1.A00
            com.whatsapp.quickcontact.QuickContactActivity r4 = (com.whatsapp.quickcontact.QuickContactActivity) r4
            com.whatsapp.util.FloatingChildLayout r3 = r4.A0t
            int r0 = r3.A02
            if (r0 != 0) goto L_0x0225
            r0 = 1
            r3.A02 = r0
            android.view.View r0 = r3.A09
            r0.invalidate()
            r0 = 26
            X.5rN r2 = new X.5rN
            r2.<init>(r3, r0)
            r0 = 4
            X.6AN r1 = new X.6AN
            r1.<init>(r3, r0, r2)
            android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
            r0.addOnPreDrawListener(r1)
        L_0x0225:
            com.whatsapp.util.FloatingChildLayout r2 = r4.A0t
            r0 = 9
            X.3Zp r1 = new X.3Zp
            r1.<init>(r4, r0)
            int r0 = r2.A03
            if (r0 != 0) goto L_0x000f
            r0 = 1
            r2.A03 = r0
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x023a:
            java.lang.Object r0 = r1.A00
            X.6EW r0 = (X.AnonymousClass6EW) r0
            android.hardware.Camera r1 = r0.A03
            if (r1 == 0) goto L_0x000f
            android.hardware.Camera$PreviewCallback r0 = r0.A0I
            r1.setOneShotPreviewCallback(r0)
            return
        L_0x0248:
            java.lang.Object r2 = r1.A00
            X.6EW r2 = (X.AnonymousClass6EW) r2
            java.lang.String r0 = "qrview/stopcamera"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.BqA()
            android.hardware.Camera r0 = r2.A03
            if (r0 == 0) goto L_0x000f
            goto L_0x08aa
        L_0x025b:
            java.lang.Object r3 = r1.A00
            X.6EW r3 = (X.AnonymousClass6EW) r3
            android.hardware.Camera r0 = r3.A03
            if (r0 != 0) goto L_0x08df
            r4 = 0
            android.hardware.Camera r2 = android.hardware.Camera.open()     // Catch:{ Exception -> 0x027d }
            r3.A03 = r2     // Catch:{ Exception -> 0x027d }
            if (r2 != 0) goto L_0x0273
            r0 = 0
            android.hardware.Camera r2 = android.hardware.Camera.open(r0)     // Catch:{ Exception -> 0x027d }
            r3.A03 = r2     // Catch:{ Exception -> 0x027d }
        L_0x0273:
            r1 = 1
            X.91c r0 = new X.91c     // Catch:{ Exception -> 0x027d }
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x027d }
            r2.setErrorCallback(r0)     // Catch:{ Exception -> 0x027d }
            goto L_0x0291
        L_0x027d:
            r1 = move-exception
            android.hardware.Camera r0 = r3.A03
            if (r0 == 0) goto L_0x0285
            r0.release()
        L_0x0285:
            r3.A03 = r4
            java.lang.String r0 = "qrview/startcamera error opening camera"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 1
            r3.A00(r0)
        L_0x0291:
            android.hardware.Camera r1 = r3.A03
            if (r1 == 0) goto L_0x000f
            goto L_0x08b9
        L_0x0297:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.VerifyPhoneNumber r1 = (com.whatsapp.registration.VerifyPhoneNumber) r1
            r0 = 1
            r1.A89(r0)
            return
        L_0x02a0:
            java.lang.Object r0 = r1.A00
            X.5ol r0 = (X.C115495ol) r0
            com.whatsapp.registration.RegisterPhone r0 = r0.A00
            r0.BFd()
            return
        L_0x02aa:
            java.lang.Object r2 = r1.A00
            com.whatsapp.registration.RegisterPhone r2 = (com.whatsapp.registration.RegisterPhone) r2
            java.lang.String r0 = "RegisterPhone/whats-my-number/link-clicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5OP r1 = r2.A0m
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r1.A00 = r0
            X.5ZR r0 = r2.A0A
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x02c7
            com.whatsapp.RequestPermissionActivity.A0a(r2)
            return
        L_0x02c7:
            r2.A7H()
            return
        L_0x02cb:
            java.lang.Object r0 = r1.A00
            X.4ea r0 = (X.C89654ea) r0
            android.content.Context r2 = r0.getApplicationContext()
            X.33p r1 = r0.A09
            java.lang.String r0 = r1.A0b()
            X.AnonymousClass36Q.A02(r2, r1, r0)
            return
        L_0x02dd:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.RegisterPhone r0 = (com.whatsapp.registration.RegisterPhone) r0
            X.4FS r2 = r0.A04
            X.55h r1 = r0.A0U
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r2.BkO(r1, r0)
            return
        L_0x02ec:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.RegisterPhone r0 = (com.whatsapp.registration.RegisterPhone) r0
            X.33p r1 = r0.A09
            X.8qC r0 = r0.A0V
            java.util.List r0 = X.C613630k.A00(r0)
            int r0 = r0.size()
            r1.A1A(r0)
            return
        L_0x0300:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.RegisterPhone r0 = (com.whatsapp.registration.RegisterPhone) r0
            X.7kf r2 = r0.A0J
            r1 = 0
            java.lang.String r0 = "register_phone"
            r2.A02(r1, r0)
            return
        L_0x030e:
            java.lang.Object r1 = r1.A00
            X.4ea r1 = (X.C89654ea) r1
            X.2eY r0 = new X.2eY
            r0.<init>(r1)
            r0.A00()
            return
        L_0x031b:
            java.lang.Object r0 = r1.A00
            X.4ea r0 = (X.C89654ea) r0
            X.2eY r2 = new X.2eY
            r2.<init>(r0)
            r1 = 0
            r0 = 2131891668(0x7f1215d4, float:1.9418063E38)
            r2.A01(r1, r0)
            return
        L_0x032c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.RegisterName r0 = (com.whatsapp.registration.RegisterName) r0
            X.8qC r0 = r0.A1W
            java.lang.Object r0 = r0.get()
            X.2ea r0 = (X.C48242ea) r0
            X.2eH r1 = r0.A00
            java.lang.Class<X.3LT> r0 = X.AnonymousClass3LT.class
            X.485 r1 = r1.A02(r0)
            X.3LT r1 = (X.AnonymousClass3LT) r1
            java.lang.String r0 = "ConsumerBridge/onSyncExportMigrationFeatureState"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.8qC r0 = r1.A02
            java.lang.Object r0 = r0.get()
            X.2sE r0 = (X.C56582sE) r0
            r0.A04()
            return
        L_0x0353:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "RegisterName/dialog/initprogress/removedialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            X.C621433s.A00(r1, r0)
            return
        L_0x0361:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.RegisterName r4 = (com.whatsapp.registration.RegisterName) r4
            X.5rC r1 = r4.A0E
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0377
            r1.A04()
            java.lang.String r0 = "getUnsignedBizVNameCertVerifiedName"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0377:
            android.content.SharedPreferences r0 = X.AnonymousClass1Hf.A27(r4)
            java.lang.String r1 = "pref_wfs_name"
            r3 = 0
            java.lang.String r0 = r0.getString(r1, r3)
            if (r0 == 0) goto L_0x03a9
            android.content.SharedPreferences r0 = X.AnonymousClass1Hf.A27(r4)
            java.lang.String r0 = r0.getString(r1, r3)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x03a9
            android.content.SharedPreferences r0 = X.AnonymousClass1Hf.A27(r4)
            java.lang.String r8 = r0.getString(r1, r3)
        L_0x039b:
            if (r8 == 0) goto L_0x03d1
        L_0x039d:
            X.3Wi r2 = r4.A05
            r1 = 4
            X.3c0 r0 = new X.3c0
            r0.<init>(r1, r8, r4)
            r2.A0S(r0)
            return
        L_0x03a9:
            X.5GE r0 = r4.A0l
            java.lang.String r1 = "user_push_name"
            X.3dV r0 = r0.A00     // Catch:{ SQLException -> 0x03cb }
            X.4GK r2 = r0.get()     // Catch:{ SQLException -> 0x03cb }
            r0 = r2
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x03c1 }
            X.2sg r0 = r0.A03     // Catch:{ all -> 0x03c1 }
            java.lang.String r8 = X.C622033z.A00(r0, r1, r3)     // Catch:{ all -> 0x03c1 }
            r2.close()     // Catch:{ SQLException -> 0x03cb }
            goto L_0x039b
        L_0x03c1:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x03c6 }
            goto L_0x03ca
        L_0x03c6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLException -> 0x03cb }
        L_0x03ca:
            throw r1     // Catch:{ SQLException -> 0x03cb }
        L_0x03cb:
            r1 = move-exception
            java.lang.String r0 = "UserSettingsStore/getPushName/Error reading push name"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x03d1:
            java.lang.String r3 = "display_name"
            java.lang.String r1 = "samsung"
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r1.equalsIgnoreCase(r0)
            r8 = 0
            if (r0 != 0) goto L_0x039d
            X.33i r0 = r4.A08     // Catch:{ Exception -> 0x040f }
            X.5UR r5 = r0.A0R()     // Catch:{ Exception -> 0x040f }
            android.net.Uri r6 = android.provider.ContactsContract.Profile.CONTENT_URI     // Catch:{ Exception -> 0x040f }
            java.lang.String[] r7 = new java.lang.String[]{r3}     // Catch:{ Exception -> 0x040f }
            r10 = r8
            r9 = r8
            android.database.Cursor r2 = r5.A03(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x040f }
            if (r2 == 0) goto L_0x0415
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0405 }
            if (r0 == 0) goto L_0x0401
            int r0 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0405 }
            java.lang.String r8 = r2.getString(r0)     // Catch:{ all -> 0x0405 }
        L_0x0401:
            r2.close()     // Catch:{ Exception -> 0x040f }
            goto L_0x0415
        L_0x0405:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x040a }
            goto L_0x040e
        L_0x040a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x040f }
        L_0x040e:
            throw r1     // Catch:{ Exception -> 0x040f }
        L_0x040f:
            r1 = move-exception
            java.lang.String r0 = "RegisterName/getmename "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0415:
            r7 = 0
            if (r8 != 0) goto L_0x043c
            android.content.Context r0 = r4.getApplicationContext()
            android.accounts.AccountManager r0 = android.accounts.AccountManager.get(r0)
            if (r0 == 0) goto L_0x039d
            android.accounts.Account[] r6 = r0.getAccounts()
            if (r6 == 0) goto L_0x039d
            int r5 = r6.length
            r3 = 0
        L_0x042a:
            if (r3 >= r5) goto L_0x039d
            r2 = r6[r3]
            java.lang.String r1 = r2.type
            java.lang.String r0 = "com.google"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0456
            java.lang.String r8 = r2.name
            if (r8 == 0) goto L_0x039d
        L_0x043c:
            java.lang.String r3 = "@"
            boolean r0 = r8.contains(r3)
            r2 = 32
            r1 = 46
            if (r0 == 0) goto L_0x0459
            int r0 = r8.indexOf(r3)
            java.lang.String r0 = r8.substring(r7, r0)
            java.lang.String r8 = r0.replace(r1, r2)
            goto L_0x039d
        L_0x0456:
            int r3 = r3 + 1
            goto L_0x042a
        L_0x0459:
            java.lang.String r8 = r8.replace(r1, r2)
            goto L_0x039d
        L_0x045f:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.RegisterName r0 = (com.whatsapp.registration.RegisterName) r0
            X.2b8 r1 = r0.A1B
            com.whatsapp.WaEditText r0 = r0.A0L
            android.text.Editable r0 = r0.getText()
            X.C626936e.A06(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r1.A00(r0)
            X.3bl r0 = com.whatsapp.registration.RegisterName.A1m
            r0.run()
            return
        L_0x047f:
            java.lang.Object r3 = r1.A00
            X.4eZ r3 = (X.C89644eZ) r3
            X.2sr r0 = r3.A01
            com.whatsapp.Me r0 = r0.A0E()
            if (r0 == 0) goto L_0x04a1
            java.lang.String r0 = "EnterPhoneNumber/saveBackupToken/delete old phone number's token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Context r2 = r3.getApplicationContext()
            X.33p r1 = r3.A09
            X.2sr r0 = r3.A01
            com.whatsapp.Me r0 = r0.A0E()
            java.lang.String r0 = r0.number
            X.AnonymousClass36Q.A02(r2, r1, r0)
        L_0x04a1:
            java.lang.String r0 = "EnterPhoneNumber/saveBackupToken/encrypt and save (new) phone number's token"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x04ca }
            X.2sH r5 = r3.A06     // Catch:{ IOException -> 0x04ca }
            android.content.Context r4 = r3.getApplicationContext()     // Catch:{ IOException -> 0x04ca }
            X.33p r6 = r3.A09     // Catch:{ IOException -> 0x04ca }
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r6)     // Catch:{ IOException -> 0x04ca }
            java.lang.String r0 = "token_used_during_reg"
            java.lang.String r1 = X.AnonymousClass0x9.A0v(r1, r0)     // Catch:{ IOException -> 0x04ca }
            r0 = 3
            byte[] r9 = android.util.Base64.decode(r1, r0)     // Catch:{ IOException -> 0x04ca }
            X.33p r0 = r3.A09     // Catch:{ IOException -> 0x04ca }
            java.lang.String r8 = r0.A0b()     // Catch:{ IOException -> 0x04ca }
            r10 = 1
            r7 = 0
            X.AnonymousClass36Q.A01(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x04ca }
            return
        L_0x04ca:
            r1 = move-exception
            java.lang.String r0 = "EnterPhoneNumber/saveBackupToken/failed with IOException:"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x04d1:
            java.lang.Object r0 = r1.A00
            X.4z3 r0 = (X.C97674z3) r0
            com.whatsapp.registration.report.BanReportViewModel r3 = r0.A0R
            X.08M r1 = r3.A02
            r0 = 3
            X.C06270Wx.A03(r1, r0)
            X.4FS r2 = r3.A08
            r1 = 49
            X.3cH r0 = new X.3cH
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.BkM(r0)
            return
        L_0x04ea:
            java.lang.Object r1 = r1.A00
            X.4z3 r1 = (X.C97674z3) r1
            r0 = 127(0x7f, float:1.78E-43)
            X.C621433s.A01(r1, r0)
            com.whatsapp.registration.report.BanReportViewModel r1 = r1.A0R
            X.4FS r3 = r1.A08
            r0 = 48
            X.3cH r2 = new X.3cH
            r2.<init>((java.lang.Object) r1, (int) r0)
            goto L_0x0514
        L_0x04ff:
            java.lang.Object r1 = r1.A00
            X.4z3 r1 = (X.C97674z3) r1
            r0 = 127(0x7f, float:1.78E-43)
            X.C621433s.A01(r1, r0)
            com.whatsapp.registration.report.BanReportViewModel r4 = r1.A0R
            r1 = 0
            X.4FS r3 = r4.A08
            r0 = 10
            X.3cJ r2 = new X.3cJ
            r2.<init>((java.lang.Object) r4, (int) r1, (int) r0)
        L_0x0514:
            r3.BkM(r2)
            return
        L_0x0518:
            java.lang.Object r0 = r1.A00
            X.4ea r0 = (X.C89654ea) r0
            X.3Wi r2 = r0.A05
            r1 = 2131894034(0x7f121f12, float:1.9422861E38)
            r0 = 0
            r2.A0H(r1, r0)
            return
        L_0x0526:
            java.lang.Object r0 = r1.A00
            X.4ea r0 = (X.C89654ea) r0
            X.33p r0 = r0.A09
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "is_latam_tos_shown_during_reg"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.commit()
            return
        L_0x053b:
            java.lang.Object r0 = r1.A00
            X.4MQ r0 = (X.AnonymousClass4MQ) r0
            com.whatsapp.registration.ChangeNumber r2 = r0.A00
            X.3Lv r1 = r2.A0A
            r0 = 0
            r1.A0O(r0, r0)
            X.3Lv r0 = r2.A0A
            r0.A0H()
            X.3Lv r0 = r2.A0A
            r0.A0I()
            return
        L_0x0552:
            java.lang.Object r0 = r1.A00
            X.4eZ r0 = (X.C89644eZ) r0
            X.2sr r2 = r0.A01
            com.whatsapp.Me r1 = X.C56972sr.A00(r2)
            r2.A0P()
            java.lang.String r0 = "me_old"
            r2.A0Z(r1, r0)
            return
        L_0x0565:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "AccountDefenceSecondCodeViewPresenter/learn-more tapped"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 604(0x25c, float:8.46E-43)
            X.C621433s.A01(r1, r0)
            return
        L_0x0574:
            java.lang.Object r0 = r1.A00
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r0 = (com.whatsapp.reactions.ReactionsBottomSheetDialogFragment) r0
            com.whatsapp.WaTabLayout r1 = r0.A05
            X.8y0 r0 = r0.A00
            r1.A0D(r0)
            return
        L_0x0580:
            java.lang.Object r0 = r1.A00
            X.8vZ r0 = (X.C186568vZ) r0
            r0.Bsf()
            return
        L_0x0588:
            java.lang.Object r0 = r1.A00
            X.3CK r0 = (X.AnonymousClass3CK) r0
            X.8vZ r2 = r0.A00
            r1 = 630(0x276, float:8.83E-43)
            r0 = 1
            r2.endAllMarkers(r1, r0)
            r1 = 113(0x71, float:1.58E-43)
            r0 = 300000(0x493e0, float:4.2039E-40)
            r2.B2S(r0, r1)
            return
        L_0x059d:
            java.lang.Object r2 = r1.A00
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.Window r1 = r2.getWindow()
            r0 = 0
            r1.setStatusBarColor(r0)
            r2.finish()
            r2.overridePendingTransition(r0, r0)
            return
        L_0x05b0:
            java.lang.Object r1 = r1.A00
            android.os.Handler r3 = X.AnonymousClass000.A0A()
            r0 = 13
            X.3Zp r2 = new X.3Zp
            r2.<init>(r1, r0)
            r0 = 60
            r3.postDelayed(r2, r0)
            return
        L_0x05c3:
            java.lang.Object r1 = r1.A00
            com.whatsapp.quickcontact.QuickContactActivity r1 = (com.whatsapp.quickcontact.QuickContactActivity) r1
            r0 = 0
            r1.A76(r0)
            return
        L_0x05cc:
            java.lang.Object r1 = r1.A00
            com.whatsapp.quickcontact.QuickContactActivity r1 = (com.whatsapp.quickcontact.QuickContactActivity) r1
            r0 = 0
            r1.A10 = r0
            return
        L_0x05d4:
            java.lang.Object r4 = r1.A00
            com.whatsapp.quickcontact.QuickContactActivity r4 = (com.whatsapp.quickcontact.QuickContactActivity) r4
            com.whatsapp.util.FloatingChildLayout r0 = r4.A0t
            r0.invalidate()
            android.view.Window r3 = r4.getWindow()
            android.content.Intent r2 = r4.getIntent()
            int r0 = X.AnonymousClass34K.A00(r4)
            int r1 = X.AnonymousClass0Y8.A04(r4, r0)
            java.lang.String r0 = "status_bar_color"
            int r0 = r2.getIntExtra(r0, r1)
            r3.setStatusBarColor(r0)
            com.whatsapp.util.FloatingChildLayout r3 = r4.A0t
            r0 = 11
            X.3Zp r2 = new X.3Zp
            r2.<init>(r4, r0)
            r0 = 4
            X.6AN r1 = new X.6AN
            r1.<init>(r3, r0, r2)
            android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
            r0.addOnPreDrawListener(r1)
            return
        L_0x060e:
            java.lang.Object r0 = r1.A00
            com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment r0 = (com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment) r0
            X.2dz r4 = r0.A06
            com.whatsapp.jid.UserJid r3 = r0.A0G
            java.lang.String r2 = r0.A0M
            java.lang.String r1 = r0.A0O
            X.2vg r0 = new X.2vg
            r0.<init>(r3, r2, r1)
            r4.A01(r0)
            return
        L_0x0623:
            java.lang.Object r1 = r1.A00
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r1 = (com.whatsapp.qrcode.contactqr.QrScanCodeFragment) r1
            r0 = 0
            r1.A0B = r0
            r1.A1L()
            return
        L_0x062e:
            java.lang.Object r2 = r1.A00
            com.whatsapp.qrcode.contactqr.QrScanCodeFragment r2 = (com.whatsapp.qrcode.contactqr.QrScanCodeFragment) r2
            boolean r0 = r2.A19()
            if (r0 == 0) goto L_0x0647
            X.0df r1 = r2.A0T()
            com.whatsapp.qrcode.QrEducationDialogFragment r0 = new com.whatsapp.qrcode.QrEducationDialogFragment
            r0.<init>()
            X.AnonymousClass344.A01(r0, r1)
            r0 = 1
            r2.A08 = r0
        L_0x0647:
            r0 = 1
            r2.A0A = r0
            return
        L_0x064b:
            java.lang.Object r0 = r1.A00
            X.68l r0 = (X.C1234468l) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.qrcode.QrScannerViewV2 r0 = (com.whatsapp.qrcode.QrScannerViewV2) r0
            X.4Eb r0 = r0.A05
            r0.BYs()
            return
        L_0x0659:
            java.lang.Object r11 = r1.A00
            X.6EW r11 = (X.AnonymousClass6EW) r11
            int r10 = r11.getWidth()
            int r9 = r11.getHeight()
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r14 = "qrview/startpreview "
            r0.append(r14)
            r0.append(r10)
            java.lang.String r8 = "x"
            X.C18260x0.A0w(r8, r0, r9)
            android.hardware.Camera r0 = r11.A03
            if (r0 != 0) goto L_0x0687
            java.lang.String r0 = "qrview/startpreview camera is null"
        L_0x067f:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0682:
            r0 = 1
            r11.A00(r0)
            return
        L_0x0687:
            android.content.Context r0 = r11.getContext()
            android.view.WindowManager r0 = X.C620633i.A01(r0)
            android.view.Display r0 = r0.getDefaultDisplay()
            int r7 = r0.getRotation()
            r0 = 2
            if (r7 == 0) goto L_0x069d
            r5 = 0
            if (r7 != r0) goto L_0x069e
        L_0x069d:
            r5 = 1
        L_0x069e:
            android.hardware.Camera r0 = r11.A03     // Catch:{ RuntimeException -> 0x084d }
            android.hardware.Camera$Parameters r6 = r0.getParameters()     // Catch:{ RuntimeException -> 0x084d }
            java.util.List r0 = r6.getSupportedPreviewSizes()
            r11.A0B = r0
            if (r0 != 0) goto L_0x06c9
            java.lang.String r0 = "qrview/fallbacksupportedpreviewsizes"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            r11.A0B = r4
            android.hardware.Camera r3 = r11.A03
            java.util.Objects.requireNonNull(r3)
            r2 = 640(0x280, float:8.97E-43)
            r1 = 480(0x1e0, float:6.73E-43)
            android.hardware.Camera$Size r0 = new android.hardware.Camera$Size
            r0.<init>(r3, r2, r1)
            r4.add(r0)
        L_0x06c9:
            java.util.List r2 = r11.A0B
            r1 = r10
            r0 = r9
            if (r5 == 0) goto L_0x06d1
            r1 = r9
            r0 = r10
        L_0x06d1:
            android.hardware.Camera$Size r12 = X.C132906gD.A01(r2, r1, r0)
            r11.A02 = r12
            if (r12 != 0) goto L_0x06dd
            java.lang.String r0 = "qrview/startpreview preview size is null"
            goto L_0x067f
        L_0x06dd:
            double r4 = (double) r10
            double r2 = (double) r9
            double r17 = r4 / r2
            int r13 = r12.width
            double r0 = (double) r13
            int r12 = r12.height
            double r15 = (double) r12
            double r0 = r0 / r15
            double r17 = r17 - r0
            double r15 = java.lang.Math.abs(r17)
            double r2 = r2 / r4
            double r2 = r2 - r0
            double r2 = java.lang.Math.abs(r2)
            r0 = r15
            double r0 = java.lang.Math.min(r0, r2)
            r3 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0737
            int r2 = r11.A01
            if (r10 != r2) goto L_0x070a
            int r2 = r11.A00
            if (r9 == r2) goto L_0x0737
        L_0x070a:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "qrview/startpreview request layout to match preview size:"
            X.C18270x1.A19(r2, r8, r3, r13)
            r3.append(r12)
            java.lang.String r2 = " (view is "
            X.C18270x1.A19(r2, r8, r3, r10)
            r3.append(r9)
            java.lang.String r2 = ") aspect diff is "
            r3.append(r2)
            r3.append(r0)
            X.C18280x3.A14(r3)
            android.os.Handler r2 = r11.A0J
            r1 = 48
            X.3bq r0 = new X.3bq
            r0.<init>((java.lang.Object) r11, (int) r1)
            r2.post(r0)
            return
        L_0x0737:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "qrview/startpreview optimal preview size:"
            r1.append(r0)
            r1.append(r13)
            X.C18260x0.A0y(r8, r1, r12)
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            r0 = 0
            android.hardware.Camera.getCameraInfo(r0, r2)     // Catch:{ RuntimeException -> 0x0751 }
            goto L_0x0758
        L_0x0751:
            r1 = move-exception
            java.lang.String r0 = "qrview/startpreview/getCameraInfo "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0758:
            int r1 = r2.facing
            r0 = 1
            boolean r4 = X.AnonymousClass000.A1U(r1, r0)
            int r5 = r2.orientation
            if (r7 == 0) goto L_0x076d
            if (r7 == r0) goto L_0x07a2
            r0 = 2
            if (r7 == r0) goto L_0x079f
            r0 = 3
            r3 = 270(0x10e, float:3.78E-43)
            if (r7 == r0) goto L_0x076e
        L_0x076d:
            r3 = 0
        L_0x076e:
            int r0 = r5 - r3
            int r0 = r0 + 360
            if (r4 == 0) goto L_0x077a
            int r0 = r5 + r3
            int r0 = r0 % 360
            int r0 = 360 - r0
        L_0x077a:
            int r2 = r0 % 360
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "qrview/startpreview display:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " camera:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " preview:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " front:"
            X.C18260x0.A1E(r0, r1, r4)
            goto L_0x07a5
        L_0x079f:
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x076e
        L_0x07a2:
            r3 = 90
            goto L_0x076e
        L_0x07a5:
            android.hardware.Camera r0 = r11.A03     // Catch:{ RuntimeException -> 0x07ab }
            r0.setDisplayOrientation(r2)     // Catch:{ RuntimeException -> 0x07ab }
            goto L_0x07b2
        L_0x07ab:
            r1 = move-exception
            java.lang.String r0 = "qrview/startpreview/setdisplayorientation "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x07b2:
            android.hardware.Camera$Size r0 = r11.A02
            int r1 = r0.width
            int r0 = r0.height
            r6.setPreviewSize(r1, r0)
            java.util.List r2 = r6.getSupportedFocusModes()
            if (r2 == 0) goto L_0x0832
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "qrview/startpreview supported focus:"
            r1.append(r0)
            java.lang.Object[] r0 = r2.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            X.C18260x0.A1L(r1, r0)
            java.lang.String r1 = "auto"
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L_0x07ee
            java.lang.String r1 = "macro"
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L_0x07ee
            java.lang.String r1 = "edof"
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x07f1
        L_0x07ee:
            r6.setFocusMode(r1)
        L_0x07f1:
            java.util.List r2 = r6.getSupportedFlashModes()
            if (r2 == 0) goto L_0x082e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "qrview/startpreview supported flash:"
            r1.append(r0)
            java.lang.Object[] r0 = r2.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
        L_0x080d:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r11.A0F = r0
            if (r2 == 0) goto L_0x0839
            java.lang.String r1 = "off"
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0821
            r6.setFlashMode(r1)
        L_0x0821:
            java.lang.String r0 = "torch"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0839
            r0 = 1
            r11.A0F = r0
            goto L_0x0839
        L_0x082e:
            java.lang.String r0 = "qrview/startpreview supported flash:null"
            goto L_0x080d
        L_0x0832:
            java.lang.String r0 = "qrview/startpreview supported focus:null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x07f1
        L_0x0839:
            android.hardware.Camera r0 = r11.A03     // Catch:{ RuntimeException -> 0x084b }
            r0.setParameters(r6)     // Catch:{ RuntimeException -> 0x084b }
            android.hardware.Camera r0 = r11.A03     // Catch:{ RuntimeException -> 0x084b }
            r0.startPreview()     // Catch:{ RuntimeException -> 0x084b }
            android.hardware.Camera r1 = r11.A03     // Catch:{ RuntimeException -> 0x084b }
            android.hardware.Camera$AutoFocusCallback r0 = r11.A0H     // Catch:{ RuntimeException -> 0x084b }
            r1.autoFocus(r0)     // Catch:{ RuntimeException -> 0x084b }
            goto L_0x0860
        L_0x084b:
            r0 = move-exception
            goto L_0x0851
        L_0x084d:
            r0 = move-exception
            java.lang.String r14 = "qrview/startpreview/getParameters "
        L_0x0851:
            com.whatsapp.util.Log.e(r14, r0)
            android.hardware.Camera r0 = r11.A03
            if (r0 == 0) goto L_0x085b
            r0.release()
        L_0x085b:
            r0 = 0
            r11.A03 = r0
            goto L_0x0682
        L_0x0860:
            X.4Eb r0 = r11.A09
            if (r0 == 0) goto L_0x0870
            android.os.Handler r2 = r11.A0J
            r1 = 47
            X.3bq r0 = new X.3bq
            r0.<init>((java.lang.Object) r11, (int) r1)
            r2.post(r0)
        L_0x0870:
            r11.Bjp()
            return
        L_0x0874:
            X.3dV r0 = r2.A0j     // Catch:{ all -> 0x0893 }
            r0.A05()     // Catch:{ all -> 0x0893 }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0893 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0893 }
            X.C626936e.A06(r2)     // Catch:{ all -> 0x0893 }
            boolean r0 = X.C626235v.A04(r2, r4)     // Catch:{ all -> 0x0893 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x088f
            java.lang.String r1 = "DELETE_ALL_RECORDS"
            r0 = 0
            r2.A07(r4, r0, r1, r0)     // Catch:{ all -> 0x0893 }
        L_0x088f:
            r3.close()
            return
        L_0x0893:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0898 }
            throw r1
        L_0x0898:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x089d:
            r6.A02(r2)
            return
        L_0x08a1:
            r1 = move-exception
            X.2yF r0 = r5.A02
            java.util.concurrent.Semaphore r0 = r0.A05
            r0.release()
            throw r1
        L_0x08aa:
            r0.release()     // Catch:{ Exception -> 0x08ae }
            goto L_0x08b5
        L_0x08ae:
            r1 = move-exception
            java.lang.String r0 = "qrview/stopcamera error releaseing camera"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x08b5:
            r0 = 0
            r2.A03 = r0
            return
        L_0x08b9:
            android.view.SurfaceHolder r0 = r3.A0L     // Catch:{ RuntimeException -> 0x08ca, IOException -> 0x08cc }
            r1.setPreviewDisplay(r0)     // Catch:{ RuntimeException -> 0x08ca, IOException -> 0x08cc }
            android.os.Handler r2 = r3.A04     // Catch:{ RuntimeException -> 0x08ca, IOException -> 0x08cc }
            r1 = 1
            X.3Zp r0 = new X.3Zp     // Catch:{ RuntimeException -> 0x08ca, IOException -> 0x08cc }
            r0.<init>(r3, r1)     // Catch:{ RuntimeException -> 0x08ca, IOException -> 0x08cc }
            r2.post(r0)     // Catch:{ RuntimeException -> 0x08ca, IOException -> 0x08cc }
            return
        L_0x08ca:
            r1 = move-exception
            goto L_0x08cd
        L_0x08cc:
            r1 = move-exception
        L_0x08cd:
            android.hardware.Camera r0 = r3.A03
            r0.release()
            r3.A03 = r4
            java.lang.String r0 = "qrview/startcamera "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 1
            r3.A00(r0)
            return
        L_0x08df:
            r0.reconnect()     // Catch:{ IOException -> 0x08e3 }
            goto L_0x08f7
        L_0x08e3:
            r1 = move-exception
            android.hardware.Camera r0 = r3.A03
            r0.release()
            r0 = 0
            r3.A03 = r0
            java.lang.String r0 = "qrview/startcamera error reconnecting camera"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 1
            r3.A00(r0)
            return
        L_0x08f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70033Zp.run():void");
    }
}
