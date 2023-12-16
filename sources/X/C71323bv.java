package X;

import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;

/* renamed from: X.3bv  reason: invalid class name and case insensitive filesystem */
public class C71323bv implements Runnable {
    public Object A00;
    public String A01;
    public final int A02;

    public C71323bv(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: X.2ZL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: X.2la} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: X.2ZL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: X.2ZL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: X.2ZL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: X.2ZL} */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0617, code lost:
        X.C113245l7.A0O(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x061a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0638, code lost:
        X.C57772uB.A00(r3, r4, r5, r6, r7, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x063b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0700, code lost:
        r2.A05(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0703, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0206, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0207, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.A02
            switch(r0) {
                case 0: goto L_0x0845;
                case 1: goto L_0x00b3;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00d0;
                case 4: goto L_0x0136;
                case 5: goto L_0x0143;
                case 6: goto L_0x015b;
                case 7: goto L_0x0177;
                case 8: goto L_0x0183;
                case 9: goto L_0x020b;
                case 10: goto L_0x0217;
                case 11: goto L_0x022a;
                case 12: goto L_0x0236;
                case 13: goto L_0x0243;
                case 14: goto L_0x0272;
                case 15: goto L_0x02a9;
                case 16: goto L_0x02c8;
                case 17: goto L_0x02db;
                case 18: goto L_0x02e5;
                case 19: goto L_0x02ef;
                case 20: goto L_0x0303;
                case 21: goto L_0x0322;
                case 22: goto L_0x032e;
                case 23: goto L_0x0338;
                case 24: goto L_0x0497;
                case 25: goto L_0x04a5;
                case 26: goto L_0x0526;
                case 27: goto L_0x0542;
                case 28: goto L_0x054c;
                case 29: goto L_0x0591;
                case 30: goto L_0x05b0;
                case 31: goto L_0x05c8;
                case 32: goto L_0x05f6;
                case 33: goto L_0x0604;
                case 34: goto L_0x060e;
                case 35: goto L_0x061b;
                case 36: goto L_0x063c;
                case 37: goto L_0x0646;
                case 38: goto L_0x06af;
                case 39: goto L_0x06d6;
                case 40: goto L_0x0007;
                case 41: goto L_0x0007;
                case 42: goto L_0x06e9;
                case 43: goto L_0x06f5;
                case 44: goto L_0x0704;
                case 45: goto L_0x074b;
                case 46: goto L_0x07af;
                case 47: goto L_0x0857;
                case 48: goto L_0x0861;
                case 49: goto L_0x086b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r7 = r1.A00
            X.2la r7 = (X.C52502la) r7
            java.lang.String r5 = r1.A01
            monitor-enter(r7)
            java.util.Map r3 = r7.A02     // Catch:{ all -> 0x00b0 }
            java.lang.Object r6 = r3.get(r5)     // Catch:{ all -> 0x00b0 }
            X.2Zh r6 = (X.C45252Zh) r6     // Catch:{ all -> 0x00b0 }
            if (r6 == 0) goto L_0x0206
            int r0 = r6.A00     // Catch:{ all -> 0x00b0 }
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r2 = 39
            if (r0 == 0) goto L_0x009c
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "ThrottlingCrashLogs; throttling period completed for '"
            r8.append(r0)     // Catch:{ all -> 0x00b0 }
            r8.append(r5)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "': name='"
            r8.append(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = r6.A01     // Catch:{ all -> 0x00b0 }
            r8.append(r4)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "', debug='"
            r8.append(r0)     // Catch:{ all -> 0x00b0 }
            java.util.List r3 = r6.A02     // Catch:{ all -> 0x00b0 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0047
            r0 = 0
            goto L_0x005c
        L_0x0047:
            java.lang.Object r0 = X.C73723fy.A03(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = ", throttled="
            r1.append(r0)     // Catch:{ all -> 0x00b0 }
            int r0 = r6.A00     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x00b0 }
        L_0x005c:
            r8.append(r0)     // Catch:{ all -> 0x00b0 }
            X.C18270x1.A1E(r8, r2)     // Catch:{ all -> 0x00b0 }
            X.2qk r2 = r7.A00     // Catch:{ all -> 0x00b0 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x006c
            r1 = 0
            goto L_0x0081
        L_0x006c:
            java.lang.Object r0 = X.C73723fy.A03(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = ", throttled="
            r1.append(r0)     // Catch:{ all -> 0x00b0 }
            int r0 = r6.A00     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x00b0 }
        L_0x0081:
            r0 = 0
            r2.A0A(r4, r0, r1)     // Catch:{ all -> 0x00b0 }
            r3.clear()     // Catch:{ all -> 0x00b0 }
            r6.A00 = r0     // Catch:{ all -> 0x00b0 }
            X.3Wh r4 = r7.A01     // Catch:{ all -> 0x00b0 }
            r0 = 41
            X.3bv r3 = new X.3bv     // Catch:{ all -> 0x00b0 }
            r3.<init>(r0, r5, r7)     // Catch:{ all -> 0x00b0 }
            r1 = 30000(0x7530, double:1.4822E-319)
            android.os.Handler r0 = r4.A00     // Catch:{ all -> 0x00b0 }
            r0.postDelayed(r3, r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x0206
        L_0x009c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "ThrottlingCrashLogs; throttling stopped for '"
            r1.append(r0)     // Catch:{ all -> 0x00b0 }
            r1.append(r5)     // Catch:{ all -> 0x00b0 }
            X.C18270x1.A1E(r1, r2)     // Catch:{ all -> 0x00b0 }
            r3.remove(r5)     // Catch:{ all -> 0x00b0 }
            goto L_0x0206
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x00b3:
            java.lang.Object r0 = r1.A00
            X.7GH r0 = (X.AnonymousClass7GH) r0
            java.lang.String r1 = r1.A01
            X.8uz r0 = r0.A01
            r0.BfI(r1)
            return
        L_0x00bf:
            java.lang.Object r3 = r1.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            java.lang.String r2 = r1.A01
            r1 = 2000(0x7d0, float:2.803E-42)
            r0 = 0
            X.5fd r0 = r3.A7P(r2, r1, r0)
            r0.A01()
            return
        L_0x00d0:
            java.lang.Object r6 = r1.A00
            X.5ZE r6 = (X.AnonymousClass5ZE) r6
            java.lang.String r4 = r1.A01
            com.google.android.material.button.MaterialButton r5 = r6.A07
            if (r5 == 0) goto L_0x0850
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x0850
            android.view.ViewParent r3 = r5.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            X.0A8 r2 = new X.0A8
            r2.<init>()
            r2.A09(r5)
            r0 = 300(0x12c, double:1.48E-321)
            r2.A07(r0)
            X.AnonymousClass0XC.A02(r3, r2)
            r5.setText(r4)
            android.content.res.Resources r4 = X.C18290x4.A0G(r5)
            X.33j r0 = r6.A0A
            boolean r0 = X.C620733j.A04(r0)
            if (r0 == 0) goto L_0x0126
            int r3 = r5.getPaddingLeft()
            int r2 = r5.getPaddingTop()
            r0 = 2131168276(0x7f070c14, float:1.795085E38)
            int r1 = r4.getDimensionPixelSize(r0)
        L_0x0114:
            int r0 = r5.getPaddingBottom()
            r5.setPadding(r3, r2, r1, r0)
            r0 = 2131168275(0x7f070c13, float:1.7950847E38)
            int r0 = r4.getDimensionPixelSize(r0)
            r5.setIconPadding(r0)
            return
        L_0x0126:
            r0 = 2131168276(0x7f070c14, float:1.795085E38)
            int r3 = r4.getDimensionPixelSize(r0)
            int r2 = r5.getPaddingTop()
            int r1 = r5.getPaddingRight()
            goto L_0x0114
        L_0x0136:
            java.lang.Object r0 = r1.A00
            X.3Ts r0 = (X.C68583Ts) r0
            java.lang.String r2 = r1.A01
            X.2o5 r1 = r0.A01
            r0 = 0
            r1.A02(r2, r0)
            return
        L_0x0143:
            java.lang.Object r3 = r1.A00
            X.2aX r3 = (X.C45762aX) r3
            java.lang.String r2 = r1.A01
            java.lang.ref.WeakReference r0 = r3.A02
            java.lang.Object r1 = r0.get()
            X.66T r1 = (X.AnonymousClass66T) r1
            if (r1 == 0) goto L_0x0157
            r0 = 3
            r1.BeB(r0)
        L_0x0157:
            r3.A00(r2)
            return
        L_0x015b:
            java.lang.Object r4 = r1.A00
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r4 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r4
            java.lang.String r1 = r1.A01
            X.30e r0 = r4.A06
            java.lang.String r0 = r0.A01()
            boolean r3 = r0.equals(r1)
            X.3Wi r2 = r4.A04
            r1 = 6
            X.3cX r0 = new X.3cX
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.A0S(r0)
            return
        L_0x0177:
            java.lang.Object r0 = r1.A00
            X.2dT r0 = (X.C47572dT) r0
            java.lang.String r1 = r1.A01
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r0 = r0.A0C
            r0.A03(r1)
            return
        L_0x0183:
            java.lang.Object r8 = r1.A00
            X.2PT r8 = (X.AnonymousClass2PT) r8
            java.lang.String r6 = r1.A01
            X.2ZL r7 = r8.A02
            monitor-enter(r7)
            X.C626936e.A00()     // Catch:{ all -> 0x0208 }
            X.66R r5 = r7.A02     // Catch:{ all -> 0x0208 }
            java.util.Map r0 = X.AnonymousClass0x7.A10(r5)     // Catch:{ all -> 0x0208 }
            java.lang.Object r9 = r0.get(r6)     // Catch:{ all -> 0x0208 }
            if (r9 != 0) goto L_0x01a3
            java.util.ArrayDeque r9 = new java.util.ArrayDeque     // Catch:{ all -> 0x0208 }
            r9.<init>()     // Catch:{ all -> 0x0208 }
            r0.put(r6, r9)     // Catch:{ all -> 0x0208 }
        L_0x01a3:
            java.util.Queue r9 = (java.util.Queue) r9     // Catch:{ all -> 0x0208 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0208 }
        L_0x01a9:
            boolean r0 = X.C18310x6.A1X(r9)     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r2 = r9.peek()     // Catch:{ all -> 0x0208 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0208 }
            if (r2 == 0) goto L_0x01c8
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r3 = r10 - r0
            long r1 = r2.longValue()     // Catch:{ all -> 0x0208 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x01c8
            r9.poll()     // Catch:{ all -> 0x0208 }
            goto L_0x01a9
        L_0x01c8:
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0208 }
            r9.add(r0)     // Catch:{ all -> 0x0208 }
            java.util.Map r0 = X.AnonymousClass0x7.A10(r5)     // Catch:{ all -> 0x0208 }
            r0.put(r6, r9)     // Catch:{ all -> 0x0208 }
            r7.A00()     // Catch:{ all -> 0x0208 }
            int r2 = r9.size()     // Catch:{ all -> 0x0208 }
            monitor-exit(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExcessiveWakeupLogger/logWakeup action: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " woke up in the last hour: "
            X.C18260x0.A0w(r0, r1, r2)
            r0 = 10
            if (r2 < r0) goto L_0x0850
            X.2qk r2 = r8.A00
            java.lang.String r1 = "excessive-wakeup"
            r0 = 0
            r2.A0A(r1, r0, r6)
            monitor-enter(r7)
            java.util.Map r0 = X.AnonymousClass0x7.A10(r5)     // Catch:{ all -> 0x0208 }
            r0.remove(r6)     // Catch:{ all -> 0x0208 }
            r7.A00()     // Catch:{ all -> 0x0208 }
        L_0x0206:
            monitor-exit(r7)
            return
        L_0x0208:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x020b:
            java.lang.Object r0 = r1.A00
            X.3TS r0 = (X.AnonymousClass3TS) r0
            X.4CM r0 = r0.A00
            if (r0 == 0) goto L_0x0850
            r0.BU1()
            return
        L_0x0217:
            java.lang.Object r3 = r1.A00
            com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel r3 = (com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel) r3
            java.lang.String r2 = r1.A01
            X.5Y9 r0 = r3.A04
            X.5il r1 = new X.5il
            r1.<init>(r3, r2)
            java.util.List r0 = r0.A0P
            r0.add(r1)
            return
        L_0x022a:
            java.lang.Object r0 = r1.A00
            X.3Dr r0 = (X.C64483Dr) r0
            java.lang.String r1 = r1.A01
            X.1iT r0 = r0.A0F
            r0.A08(r1)
            return
        L_0x0236:
            java.lang.Object r0 = r1.A00
            X.5Oh r0 = (X.C103755Oh) r0
            java.lang.String r2 = r1.A01
            X.3Wi r1 = r0.A00
            r0 = 1
            r1.A0P(r2, r0)
            return
        L_0x0243:
            java.lang.Object r0 = r1.A00
            X.4U1 r0 = (X.AnonymousClass4U1) r0
            java.lang.String r5 = r1.A01
            X.5Oi r4 = r0.A0B
            X.5MC r1 = r0.A08
            r0 = 741481818(0x2c321d5a, float:2.5311615E-12)
            X.5ZI r3 = r1.A00(r0)
            X.4tf r0 = r4.A03
            boolean r0 = r0 instanceof X.C96174vv
            if (r0 == 0) goto L_0x025d
            r4.A00()
        L_0x025d:
            X.4Am r2 = r4.A07
            X.5GG r0 = r4.A06
            X.2xN r1 = r0.A00
            X.5mz r0 = new X.5mz
            r0.<init>(r4, r5)
            X.4vu r0 = r2.B0C(r0, r1, r3, r5)
            r0.A08()
            r4.A03 = r0
            return
        L_0x0272:
            java.lang.Object r3 = r1.A00
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r3 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r3
            java.lang.String r2 = r1.A01
            X.33j r0 = r3.A0E
            java.util.Locale r0 = X.C620733j.A02(r0)
            android.location.Geocoder r1 = new android.location.Geocoder
            r1.<init>(r3, r0)
            r0 = 1
            java.util.List r1 = r1.getFromLocationName(r2, r0)     // Catch:{ Exception -> 0x0297 }
            if (r1 == 0) goto L_0x029d
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0297 }
            if (r0 != 0) goto L_0x029d
            java.lang.Object r2 = X.C18290x4.A0k(r1)     // Catch:{ Exception -> 0x0297 }
            android.location.Address r2 = (android.location.Address) r2     // Catch:{ Exception -> 0x0297 }
            goto L_0x029e
        L_0x0297:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationUtil/geoLocateAddressFromLocationName/failed"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x029d:
            r2 = 0
        L_0x029e:
            r1 = 41
            X.5rV r0 = new X.5rV
            r0.<init>(r3, r1, r2)
            r3.runOnUiThread(r0)
            return
        L_0x02a9:
            java.lang.Object r2 = r1.A00
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r2 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r2
            java.lang.String r6 = r1.A01
            int r8 = r2.A04
            X.5ZO r5 = r2.A0E()
            int r9 = r2.A0D(r6)
            r3 = 0
            X.5Ur r0 = r2.A0Y
            X.7Sx r4 = r0.A01()
            X.5jW r0 = r2.A0W
            java.lang.String r7 = r0.A0P
            r2.A0Q(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x02c8:
            java.lang.Object r2 = r1.A00
            X.3XG r2 = (X.AnonymousClass3XG) r2
            java.lang.String r1 = r1.A01
            if (r1 != 0) goto L_0x02d4
            r0 = 0
        L_0x02d1:
            r2.A00 = r0
            return
        L_0x02d4:
            X.2bR r0 = r2.A01
            java.lang.String r0 = r0.A00(r1)
            goto L_0x02d1
        L_0x02db:
            java.lang.Object r2 = r1.A00
            X.30y r2 = (X.C614830y) r2
            java.lang.String r0 = r1.A01
            r2.A04(r0)
            return
        L_0x02e5:
            java.lang.Object r2 = r1.A00
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            java.lang.String r0 = r1.A01
            com.whatsapp.voipcalling.Voip.resendOfferOnDecryptionFailure(r2, r0)
            return
        L_0x02ef:
            java.lang.Object r0 = r1.A00
            X.5b3 r0 = (X.C107285b3) r0
            java.lang.String r1 = r1.A01
            X.2sr r0 = r0.A1e
            if (r0 == 0) goto L_0x0850
            X.1RR r0 = X.C56972sr.A01(r0)
            if (r0 == 0) goto L_0x0850
            com.whatsapp.voipcalling.Voip.timeoutPendingCall(r1)
            return
        L_0x0303:
            java.lang.Object r0 = r1.A00
            X.68l r0 = (X.C1234468l) r0
            java.lang.String r4 = r1.A01
            java.lang.Object r1 = r0.A00
            X.5ZS r1 = (X.AnonymousClass5ZS) r1
            X.33I r2 = r1.A0u
            r5 = 1
            r7 = 0
            r3 = 0
            r6 = r5
            boolean r0 = r2.A02(r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x0850
            X.3Wi r1 = r1.A0b
            r0 = 2131888195(0x7f120843, float:1.9411018E38)
            r1.A0H(r0, r5)
            return
        L_0x0322:
            java.lang.Object r0 = r1.A00
            X.5Tu r0 = (X.C105155Tu) r0
            java.lang.String r1 = r1.A01
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r0 = r0.A07
            r0.setContactChatStatus(r1)
            return
        L_0x032e:
            java.lang.Object r2 = r1.A00
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r0 = r1.A01
            r2.setText(r0)
            return
        L_0x0338:
            java.lang.Object r2 = r1.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r2 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r2
            java.lang.String r0 = r1.A01
            r19 = r0
            X.1hv r2 = r2.A06
            monitor-enter(r2)
            X.2fj r0 = r2.A03     // Catch:{ all -> 0x0494 }
            X.2y7 r5 = r0.A00()     // Catch:{ all -> 0x0494 }
            X.2Xh r4 = r2.A02     // Catch:{ all -> 0x0494 }
            r3 = 0
            if (r5 == 0) goto L_0x0357
            java.lang.String r0 = r5.A02     // Catch:{ all -> 0x0494 }
            java.lang.String r3 = r5.A01     // Catch:{ all -> 0x0494 }
        L_0x0352:
            r1 = 3
            r4.A00(r1, r0, r3)     // Catch:{ all -> 0x0494 }
            goto L_0x0359
        L_0x0357:
            r0 = r3
            goto L_0x0352
        L_0x0359:
            if (r5 != 0) goto L_0x0365
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/handleInputLinkCode companion hello is null or expired"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0494 }
            r2.A08()     // Catch:{ all -> 0x0494 }
            goto L_0x0492
        L_0x0365:
            byte[] r10 = r5.A04     // Catch:{ all -> 0x0494 }
            byte[] r0 = r5.A03     // Catch:{ all -> 0x0494 }
            r18 = r0
            java.lang.String r4 = r5.A02     // Catch:{ all -> 0x0494 }
            java.lang.String r5 = r5.A01     // Catch:{ all -> 0x0494 }
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/processCompanionHello start"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0494 }
            r9 = 0
            r3 = 1
            int r6 = r10.length     // Catch:{ IllegalArgumentException -> 0x047d }
            r0 = 48
            if (r6 < r0) goto L_0x0476
            r8 = 32
            byte[] r7 = java.util.Arrays.copyOfRange(r10, r9, r8)     // Catch:{ IllegalArgumentException -> 0x047d }
            byte[] r12 = java.util.Arrays.copyOfRange(r10, r8, r0)     // Catch:{ IllegalArgumentException -> 0x047d }
            byte[] r10 = java.util.Arrays.copyOfRange(r10, r0, r6)     // Catch:{ IllegalArgumentException -> 0x047d }
            char[] r0 = r19.toCharArray()     // Catch:{ all -> 0x0494 }
            r15 = 131072(0x20000, float:1.83671E-40)
            r11 = 256(0x100, float:3.59E-43)
            java.lang.String r6 = "PBKDF2WithHmacSHA256"
            javax.crypto.SecretKey r7 = X.C627236i.A08(r6, r7, r0, r15, r11)     // Catch:{ all -> 0x0494 }
            java.lang.String r17 = "AES/CTR/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r17)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x046a }
            X.C18290x4.A1S(r7, r0, r12)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x046a }
            byte[] r16 = r0.doFinal(r10)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x046a }
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/processCompanionHello companion hello payload process done"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0494 }
            r14 = 5
            r7 = 2
            X.2KI r13 = X.AnonymousClass36G.A00()     // Catch:{ all -> 0x0494 }
            byte[] r10 = X.AnonymousClass29O.A01(r8)     // Catch:{ all -> 0x0494 }
            r0 = 16
            byte[] r8 = X.AnonymousClass29O.A01(r0)     // Catch:{ all -> 0x0494 }
            X.2jv r0 = r13.A01     // Catch:{ all -> 0x0494 }
            byte[] r12 = r0.A01     // Catch:{ all -> 0x0494 }
            char[] r0 = r19.toCharArray()     // Catch:{ all -> 0x0494 }
            javax.crypto.SecretKey r11 = X.C627236i.A08(r6, r10, r0, r15, r11)     // Catch:{ all -> 0x0494 }
            X.2jv r6 = new X.2jv     // Catch:{ all -> 0x0494 }
            r0 = r16
            r6.<init>(r0, r14)     // Catch:{ all -> 0x0494 }
            X.2ew r0 = r13.A00     // Catch:{ all -> 0x0494 }
            byte[] r14 = X.AnonymousClass36G.A08(r0, r6)     // Catch:{ all -> 0x0494 }
            java.util.Map r13 = r2.A00     // Catch:{ all -> 0x0494 }
            X.2NJ r6 = new X.2NJ     // Catch:{ all -> 0x0494 }
            r0 = r18
            r6.<init>(r5, r14, r0)     // Catch:{ all -> 0x0494 }
            r13.put(r4, r6)     // Catch:{ all -> 0x0494 }
            javax.crypto.Cipher r6 = javax.crypto.Cipher.getInstance(r17)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0489 }
            javax.crypto.spec.IvParameterSpec r0 = X.C18330xA.A0D(r8)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0489 }
            byte[] r6 = X.C18310x6.A1Y(r11, r0, r6, r12, r3)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0489 }
            byte[][] r0 = new byte[r1][]     // Catch:{ all -> 0x0494 }
            r0[r9] = r10     // Catch:{ all -> 0x0494 }
            byte[] r8 = X.AnonymousClass36A.A03(r8, r6, r0, r3, r7)     // Catch:{ all -> 0x0494 }
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/processCompanionHello data process done"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0494 }
            X.33n r0 = r2.A06     // Catch:{ all -> 0x0494 }
            X.35n r0 = r0.A00     // Catch:{ all -> 0x0494 }
            X.2KK r0 = r0.A04()     // Catch:{ all -> 0x0494 }
            X.2e4 r0 = r0.A01     // Catch:{ all -> 0x0494 }
            X.2jv r0 = r0.A00     // Catch:{ all -> 0x0494 }
            byte[] r0 = r0.A01     // Catch:{ all -> 0x0494 }
            X.31C r10 = r2.A07     // Catch:{ all -> 0x0494 }
            X.2NI r6 = new X.2NI     // Catch:{ all -> 0x0494 }
            r6.<init>(r2, r4, r5)     // Catch:{ all -> 0x0494 }
            X.3Sb r13 = new X.3Sb     // Catch:{ all -> 0x0494 }
            r13.<init>(r6, r10)     // Catch:{ all -> 0x0494 }
            java.lang.String r5 = "LinkCodePrimaryHelloProtocolHelper/sendPrimaryHelloIq start"
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ all -> 0x0494 }
            X.31C r12 = r13.A01     // Catch:{ all -> 0x0494 }
            java.lang.String r15 = r12.A03()     // Catch:{ all -> 0x0494 }
            r16 = 361(0x169, float:5.06E-43)
            X.39V[] r6 = X.AnonymousClass0x9.A1W()     // Catch:{ all -> 0x0494 }
            java.lang.String r10 = "id"
            X.39V r5 = new X.39V     // Catch:{ all -> 0x0494 }
            r5.<init>((java.lang.String) r10, (java.lang.String) r15)     // Catch:{ all -> 0x0494 }
            r10 = 0
            r6[r9] = r5     // Catch:{ all -> 0x0494 }
            java.lang.String r9 = "xmlns"
            java.lang.String r5 = "md"
            X.AnonymousClass39V.A0D(r9, r5, r6, r3, r7)     // Catch:{ all -> 0x0494 }
            X.AnonymousClass39V.A0E(r6, r1)     // Catch:{ all -> 0x0494 }
            X.39V[] r5 = new X.AnonymousClass39V[r3]     // Catch:{ all -> 0x0494 }
            java.lang.String r11 = "stage"
            java.lang.String r9 = "primary_hello"
            X.AnonymousClass39V.A0B(r11, r9, r5, r10)     // Catch:{ all -> 0x0494 }
            X.36K[] r1 = new X.AnonymousClass36K[r1]     // Catch:{ all -> 0x0494 }
            java.lang.String r11 = "link_code_pairing_wrapped_primary_ephemeral_pub"
            r9 = 0
            X.AnonymousClass36K.A0T(r11, r8, r1, r10)     // Catch:{ all -> 0x0494 }
            java.lang.String r8 = "primary_identity_pub"
            X.AnonymousClass36K.A0T(r8, r0, r1, r3)     // Catch:{ all -> 0x0494 }
            java.lang.String r3 = "link_code_pairing_ref"
            X.36K r0 = new X.36K     // Catch:{ all -> 0x0494 }
            r0.<init>((java.lang.String) r3, (java.lang.String) r4, (X.AnonymousClass39V[]) r9)     // Catch:{ all -> 0x0494 }
            r1[r7] = r0     // Catch:{ all -> 0x0494 }
            java.lang.String r0 = "link_code_companion_reg"
            X.36K r0 = X.AnonymousClass36K.A0J(r0, r5, r1)     // Catch:{ all -> 0x0494 }
            X.36K r14 = X.AnonymousClass36K.A0G(r0, r6)     // Catch:{ all -> 0x0494 }
            r17 = 120000(0x1d4c0, double:5.9288E-319)
            r12.A0D(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0494 }
            goto L_0x0492
        L_0x046a:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/processCompanionHello/decryption fail"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0494 }
            X.2Vl r0 = r2.A01     // Catch:{ all -> 0x0494 }
            r0.A00(r3, r4, r5)     // Catch:{ all -> 0x0494 }
            goto L_0x048f
        L_0x0476:
            java.lang.String r0 = "WrappedCompanionEphemeralPubData input byte array length too small"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ IllegalArgumentException -> 0x047d }
            throw r0     // Catch:{ IllegalArgumentException -> 0x047d }
        L_0x047d:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/processCompanionHello exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0494 }
            X.2Vl r0 = r2.A01     // Catch:{ all -> 0x0494 }
            r0.A00(r3, r4, r5)     // Catch:{ all -> 0x0494 }
            goto L_0x048f
        L_0x0489:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/processCompanionHello/encrypt fail"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0494 }
        L_0x048f:
            r2.A09(r4, r5)     // Catch:{ all -> 0x0494 }
        L_0x0492:
            monitor-exit(r2)
            return
        L_0x0494:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0497:
            java.lang.Object r0 = r1.A00
            X.2ut r0 = (X.C58212ut) r0
            java.lang.String r1 = r1.A01
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r0 = r0.A00
            X.2fj r0 = r0.A05
            r0.A01(r1)
            return
        L_0x04a5:
            java.lang.Object r6 = r1.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r6 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r6
            java.lang.String r7 = r1.A01
            X.3Gp r5 = r6.A0B
            X.3XA r4 = new X.3XA
            r4.<init>()
            boolean r0 = r5.A0Q()
            if (r0 != 0) goto L_0x04d2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.A05(r0)
        L_0x04bd:
            r0 = 0
            X.4Jn r3 = new X.4Jn
            r3.<init>(r0, r7, r6)
            X.4FS r2 = r6.A0Y
            java.util.Objects.requireNonNull(r2)
            r1 = 1
            X.4Ip r0 = new X.4Ip
            r0.<init>(r2, r1)
            r4.A04(r3, r0)
            return
        L_0x04d2:
            java.lang.String r0 = "sync-manager/doPreCompanionLogoutTask start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            X.4K3 r8 = new X.4K3
            r8.<init>(r4, r0, r5)
            X.1i6 r0 = r5.A09
            r0.A06(r8)
            X.4FS r9 = r5.A0h
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            X.3Mh r1 = r5.A07
            X.1Ek r0 = X.C66663Mh.A1U
            int r0 = r1.A03(r0)
            long r0 = (long) r0
            long r2 = r2.toMillis(r0)
            X.1sg r1 = new X.1sg
            r1.<init>((X.AnonymousClass3XA) r4, (X.C65203Gp) r5)
            java.lang.String r0 = "SyncManager/pre-companion-logout"
            java.lang.Runnable r1 = r9.Bkn(r1, r0, r2)
            r2 = 1
            X.4Jh r0 = new X.4Jh
            r0.<init>(r1, r5, r8, r2)
            r4.A03(r0)
            X.2j3 r1 = r5.A0c
            java.lang.String r0 = "sentinel"
            X.2sc r1 = r1.A00(r0)
            X.1Oj r1 = (X.C22521Oj) r1
            if (r1 == 0) goto L_0x04bd
            boolean r0 = r5.A0Q()
            if (r0 == 0) goto L_0x04bd
            java.util.List r0 = r1.A0D(r2)
            r5.A0K(r0)
            r5.A0F()
            goto L_0x04bd
        L_0x0526:
            java.lang.Object r3 = r1.A00
            X.2zi r3 = (X.C61102zi) r3
            java.lang.String r2 = r1.A01
            java.lang.String r0 = "companion/registration/qr/updated"
            java.util.Iterator r1 = X.C61102zi.A04(r3, r0)
        L_0x0532:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0850
            java.lang.Object r0 = r1.next()
            X.2rf r0 = (X.C56242rf) r0
            r0.A04(r2)
            goto L_0x0532
        L_0x0542:
            java.lang.Object r2 = r1.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r2 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r2
            java.lang.String r0 = r1.A01
            r2.A74(r0)
            return
        L_0x054c:
            java.lang.Object r4 = r1.A00
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            java.lang.String r1 = r1.A01
            X.5TD r0 = r4.A2d     // Catch:{ 6zK -> 0x0583 }
            X.5Iq r3 = r0.A00(r1)     // Catch:{ 6zK -> 0x0583 }
            java.util.ArrayList r2 = r3.A01
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto L_0x056d
            r4.A30 = r2
            java.util.HashSet r1 = r4.A3k
            r0 = 14
        L_0x0567:
            X.C18270x1.A1K(r1, r0)
            r4.A00 = r0
            return
        L_0x056d:
            int r0 = r2.size()
            if (r0 != r1) goto L_0x0850
            java.lang.Object r0 = X.AnonymousClass0x9.A0t(r2)
            java.lang.String r0 = (java.lang.String) r0
            r4.A2v = r0
            java.lang.String r0 = r3.A00
            r4.A2w = r0
            java.util.HashSet r1 = r4.A3k
            r0 = 4
            goto L_0x0567
        L_0x0583:
            r3 = move-exception
            X.3Wi r2 = r4.A0a
            r1 = 22
            X.3a7 r0 = new X.3a7
            r0.<init>(r4, r1, r3)
            r2.BkS(r0)
            return
        L_0x0591:
            java.lang.Object r2 = r1.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r2 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r2
            java.lang.String r9 = r1.A01
            X.3Wi r3 = r2.A08
            X.4FS r8 = r2.A0M
            X.33j r5 = r2.A01
            X.3QA r7 = new X.3QA
            r7.<init>(r2)
            X.5Zz r1 = r2.A0E
            X.2s4 r0 = r2.A04
            X.3Ls r4 = new X.3Ls
            r4.<init>(r0, r1, r9)
            X.1VX r6 = r2.A02
            r10 = 0
            goto L_0x0638
        L_0x05b0:
            java.lang.Object r0 = r1.A00
            X.1tN r0 = (X.C33591tN) r0
            java.lang.String r1 = r1.A01
            java.lang.ref.WeakReference r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.2hS r0 = (X.C49992hS) r0
            if (r0 == 0) goto L_0x0850
            r0.A01 = r1
            X.49c r0 = r0.A03
            r0.BU7()
            return
        L_0x05c8:
            java.lang.Object r4 = r1.A00
            X.4mN r4 = (X.C92274mN) r4
            java.lang.String r3 = r1.A01
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r2 == 0) goto L_0x05e6
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x05e6
            java.lang.String r0 = r2.callId
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0850
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0850
        L_0x05e6:
            X.2bw r2 = r4.A0B
            java.lang.StringBuilder r1 = X.C18270x1.A0X(r3)
            java.lang.String r0 = "VoiceChatAcceptPingManager/onOpenGroupConversation: callId = "
            X.C18260x0.A0q(r0, r3, r1)
            r0 = 2
            r2.A00(r3, r0)
            return
        L_0x05f6:
            java.lang.Object r0 = r1.A00
            X.5l7 r0 = (X.C113245l7) r0
            java.lang.String r2 = r1.A01
            X.5aS r1 = r0.A3N
            java.lang.String r0 = "Resume"
            r1.A03(r2, r0)
            return
        L_0x0604:
            java.lang.Object r0 = r1.A00
            X.2Fh r0 = (X.C40302Fh) r0
            java.lang.String r2 = r1.A01
            X.5l7 r1 = r0.A00
            r0 = 0
            goto L_0x0617
        L_0x060e:
            java.lang.Object r0 = r1.A00
            X.2Fh r0 = (X.C40302Fh) r0
            java.lang.String r2 = r1.A01
            X.5l7 r1 = r0.A00
            r0 = 1
        L_0x0617:
            X.C113245l7.A0O(r1, r2, r0)
            return
        L_0x061b:
            java.lang.Object r0 = r1.A00
            X.5o4 r0 = (X.C115075o4) r0
            java.lang.String r9 = r1.A01
            X.4UA r2 = r0.A00
            X.3Wi r3 = r2.A0I
            X.4FS r8 = r2.A0d
            X.33j r5 = r2.A0T
            X.4Ab r7 = r2.A04
            boolean r10 = r2.A0B
            X.5Zz r1 = r2.A0W
            X.2s4 r0 = r2.A0J
            X.3Ls r4 = new X.3Ls
            r4.<init>(r0, r1, r9)
            X.1VX r6 = r2.A0V
        L_0x0638:
            X.C57772uB.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x063c:
            java.lang.Object r2 = r1.A00
            X.5aS r2 = (X.C106965aS) r2
            java.lang.String r0 = r1.A01
            X.C106965aS.A01(r2, r0)
            return
        L_0x0646:
            java.lang.Object r3 = r1.A00
            X.4A0 r3 = (X.AnonymousClass4A0) r3
            java.lang.String r1 = r1.A01
            boolean r0 = X.C107575bX.A0F(r1)
            if (r0 == 0) goto L_0x068b
            r1 = 0
        L_0x0653:
            com.whatsapp.deeplink.DeepLinkActivity r3 = (com.whatsapp.deeplink.DeepLinkActivity) r3
            android.os.Handler r0 = r3.A00
            r4 = 1
            r0.removeMessages(r4)
            r3.BjL()
            if (r1 != 0) goto L_0x0690
            X.0zH r2 = X.AnonymousClass5V0.A00(r3)
            r0 = 2131889479(0x7f120d47, float:1.9413623E38)
            r2.A0T(r0)
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 57
            X.C19340zH.A07(r2, r3, r0, r1)
            r1 = 2131894654(0x7f12217e, float:1.9424119E38)
            r0 = 58
            X.C19340zH.A08(r2, r3, r0, r1)
            X.043 r2 = r2.create()
            r1 = 0
            X.4IY r0 = new X.4IY
            r0.<init>(r3, r1)
            r2.setOnDismissListener(r0)
            r2.show()
            return
        L_0x068b:
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L_0x0653
        L_0x0690:
            android.content.Intent r2 = X.C18310x6.A0D(r1)
            java.lang.String r1 = "com.android.browser.application_id"
            java.lang.String r0 = r3.getPackageName()
            r2.putExtra(r1, r0)
            java.lang.String r0 = "create_new_tab"
            r2.putExtra(r0, r4)
            X.5hX r0 = r3.A00
            r0.A0A(r3, r2)
            r3.finish()
            r0 = 0
            r3.overridePendingTransition(r0, r0)
            return
        L_0x06af:
            java.lang.String r0 = r1.A01
            java.lang.Object r3 = r1.A00
            X.4GQ r3 = (X.AnonymousClass4GQ) r3
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch:{ IllegalArgumentException -> 0x06c3 }
            int r0 = r1.length     // Catch:{ IllegalArgumentException -> 0x06c3 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r0)     // Catch:{ IllegalArgumentException -> 0x06c3 }
            r3.invoke(r0)     // Catch:{ IllegalArgumentException -> 0x06c3 }
            return
        L_0x06c3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ExtensionsLogger/WaGalaxyImageViewModel/setupTopNavBar/Error while loading base64 image"
            r1.append(r0)
            java.lang.String r0 = ""
            X.C18260x0.A1K(r1, r0)
            r0 = 0
            r3.invoke(r0)
            return
        L_0x06d6:
            java.lang.Object r0 = r1.A00
            X.2dW r0 = (X.C47602dW) r0
            java.lang.String r1 = r1.A01
            android.content.Context r0 = r0.A03
            X.0zH r0 = X.C19340zH.A00(r0, r1)
            X.C19340zH.A06(r0)
            r0.A0S()
            return
        L_0x06e9:
            java.lang.Object r2 = r1.A00
            X.3XA r2 = (X.AnonymousClass3XA) r2
            java.lang.String r0 = r1.A01
            X.6jx r1 = new X.6jx
            r1.<init>(r0)
            goto L_0x0700
        L_0x06f5:
            java.lang.Object r2 = r1.A00
            X.3XA r2 = (X.AnonymousClass3XA) r2
            java.lang.String r0 = r1.A01
            X.6jy r1 = new X.6jy
            r1.<init>(r0)
        L_0x0700:
            r2.A05(r1)
            return
        L_0x0704:
            java.lang.Object r2 = r1.A00
            X.2OG r2 = (X.AnonymousClass2OG) r2
            java.lang.String r9 = r1.A01
            java.lang.String r0 = "ChatSupportTicketManager/contactSupport/onSuccess uploading logs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2aw r0 = r2.A01
            X.2hM r8 = r0.A02
            monitor-enter(r8)
            X.34j r7 = r8.A04     // Catch:{ all -> 0x0748 }
            r7.A07()     // Catch:{ all -> 0x0748 }
            X.1VX r2 = r8.A03     // Catch:{ all -> 0x0748 }
            r1 = 5553(0x15b1, float:7.781E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x0748 }
            int r1 = r2.A0O(r0, r1)     // Catch:{ all -> 0x0748 }
            r0 = 0
            com.whatsapp.util.Log.rotate()     // Catch:{ all -> 0x0748 }
            com.whatsapp.util.Log.compress()     // Catch:{ all -> 0x0748 }
            r8.A00()     // Catch:{ all -> 0x0748 }
            r6 = 1
            java.io.File r5 = r7.A03(r0, r1, r6, r6)     // Catch:{ all -> 0x0748 }
            if (r5 == 0) goto L_0x0743
            long r3 = r5.length()     // Catch:{ all -> 0x0748 }
            r1 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0743
            r7.A05(r5, r9, r6)     // Catch:{ all -> 0x0748 }
            goto L_0x0746
        L_0x0743:
            r7.A06(r9)     // Catch:{ all -> 0x0748 }
        L_0x0746:
            monitor-exit(r8)
            return
        L_0x0748:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x074b:
            java.lang.Object r4 = r1.A00
            X.3Qb r4 = (X.C67633Qb) r4
            java.lang.String r3 = r1.A01
            java.net.URL r2 = X.C18330xA.A0B(r3)     // Catch:{ IOException -> 0x07a3 }
            java.lang.String r1 = r2.getHost()     // Catch:{ IOException -> 0x07a3 }
            java.lang.String r0 = ".whatsapp.net"
            boolean r0 = r1.endsWith(r0)     // Catch:{ IOException -> 0x07a3 }
            if (r0 == 0) goto L_0x0798
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x07a3 }
            boolean r0 = r2 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x07a3 }
            if (r0 == 0) goto L_0x078d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x07a3 }
            java.lang.String r0 = "sonar connection success; url="
            X.C18260x0.A0s(r0, r3, r1)     // Catch:{ IOException -> 0x07a3 }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ IOException -> 0x07a3 }
            X.2pq r0 = r4.A00
            X.1r8 r0 = r0.A02()
            r2.setSSLSocketFactory(r0)
            int r2 = r2.getResponseCode()     // Catch:{ IOException -> 0x07a7 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x07a7 }
            java.lang.String r0 = "sonar response code: "
            X.C18260x0.A0y(r0, r1, r2)     // Catch:{ IOException -> 0x07a7 }
            return
        L_0x078d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x07a3 }
            java.lang.String r0 = "sonar pingback failed to open https url connection; url="
            X.C18260x0.A0t(r0, r3, r1)     // Catch:{ IOException -> 0x07a3 }
            return
        L_0x0798:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x07a3 }
            java.lang.String r0 = "sonar pingback url did not end with *.whatsapp.net actual; url="
            X.C18260x0.A0t(r0, r3, r1)     // Catch:{ IOException -> 0x07a3 }
            return
        L_0x07a3:
            r1 = move-exception
            java.lang.String r0 = "IOException on sonar pingback"
            goto L_0x07ab
        L_0x07a7:
            r1 = move-exception
            java.lang.String r0 = "sonar IOException"
        L_0x07ab:
            com.whatsapp.util.Log.i(r0, r1)
            return
        L_0x07af:
            java.lang.Object r0 = r1.A00
            X.3R6 r0 = (X.AnonymousClass3R6) r0
            java.lang.String r6 = r1.A01
            X.2zX r3 = r0.A01
            java.util.concurrent.CountDownLatch r4 = r0.A00
            X.1gd r0 = r3.A01
            if (r0 != 0) goto L_0x07c3
            java.lang.String r0 = "fpm/DonorConnectionHandler/WifiDirect is not initialized, we shouldn't be here."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x07c3:
            android.net.wifi.p2p.WifiP2pManager r5 = r0.A01
            if (r5 == 0) goto L_0x07d3
            android.net.wifi.p2p.WifiP2pManager$Channel r2 = r0.A00
            java.lang.String r1 = "clearServiceRequests"
            X.37S r0 = new X.37S
            r0.<init>(r1)
            r5.clearServiceRequests(r2, r0)
        L_0x07d3:
            java.lang.Runnable r1 = r3.A02
            if (r1 == 0) goto L_0x07dc
            X.4FS r0 = r3.A06
            r0.BjN(r1)
        L_0x07dc:
            r5 = 0
        L_0x07dd:
            X.1gd r9 = r3.A01     // Catch:{ InterruptedException -> 0x0851 }
            android.net.wifi.p2p.WifiP2pConfig r8 = new android.net.wifi.p2p.WifiP2pConfig     // Catch:{ InterruptedException -> 0x0851 }
            r8.<init>()     // Catch:{ InterruptedException -> 0x0851 }
            r8.deviceAddress = r6     // Catch:{ InterruptedException -> 0x0851 }
            android.net.wifi.WpsInfo r1 = r8.wps     // Catch:{ InterruptedException -> 0x0851 }
            r0 = 0
            r1.setup = r0     // Catch:{ InterruptedException -> 0x0851 }
            android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceRequest r7 = r9.A00     // Catch:{ InterruptedException -> 0x0851 }
            if (r7 == 0) goto L_0x07fb
            android.net.wifi.p2p.WifiP2pManager r2 = r9.A01     // Catch:{ InterruptedException -> 0x0851 }
            r1 = 0
            if (r2 == 0) goto L_0x07f9
            android.net.wifi.p2p.WifiP2pManager$Channel r0 = r9.A00     // Catch:{ InterruptedException -> 0x0851 }
            r2.removeServiceRequest(r0, r7, r1)     // Catch:{ InterruptedException -> 0x0851 }
        L_0x07f9:
            r9.A00 = r1     // Catch:{ InterruptedException -> 0x0851 }
        L_0x07fb:
            android.net.wifi.p2p.WifiP2pManager r0 = r9.A01     // Catch:{ InterruptedException -> 0x0851 }
            if (r0 == 0) goto L_0x0826
            java.lang.String r0 = "connect"
            X.37S r2 = new X.37S     // Catch:{ InterruptedException -> 0x0851 }
            r2.<init>(r0)     // Catch:{ InterruptedException -> 0x0851 }
            android.net.wifi.p2p.WifiP2pManager r1 = r9.A01     // Catch:{ InterruptedException -> 0x0851 }
            android.net.wifi.p2p.WifiP2pManager$Channel r0 = r9.A00     // Catch:{ InterruptedException -> 0x0851 }
            r1.connect(r0, r8, r2)     // Catch:{ InterruptedException -> 0x0851 }
            boolean r0 = r2.A00()     // Catch:{ InterruptedException -> 0x0851 }
            if (r0 == 0) goto L_0x0826
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0851 }
            r0 = 30
            boolean r0 = r4.await(r0, r2)     // Catch:{ InterruptedException -> 0x0851 }
            if (r0 != 0) goto L_0x0850
            java.lang.String r0 = "fpm/DonorConnectionHandler/Connect successful but network not connected"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0851 }
            r3.A00()     // Catch:{ InterruptedException -> 0x0851 }
            goto L_0x0844
        L_0x0826:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException -> 0x0851 }
            java.lang.String r0 = "fpm/DonorConnectionHandler/Unable to connect, attempt #"
            r1.append(r0)     // Catch:{ InterruptedException -> 0x0851 }
            int r5 = r5 + 1
            r1.append(r5)     // Catch:{ InterruptedException -> 0x0851 }
            X.AnonymousClass0x2.A19(r1)     // Catch:{ InterruptedException -> 0x0851 }
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0851 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0851 }
            r0 = 3
            if (r5 < r0) goto L_0x07dd
            r3.A00()
            return
        L_0x0844:
            return
        L_0x0845:
            java.lang.Object r0 = r1.A00
            X.7VZ r0 = (X.AnonymousClass7VZ) r0
            java.lang.String r1 = r1.A01
            X.8uy r0 = r0.A01
            r0.BMn(r1)
        L_0x0850:
            return
        L_0x0851:
            java.lang.String r0 = "fpm/DonorConnectionHandler/interrupted while connecting to service"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0857:
            java.lang.Object r2 = r1.A00
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r2 = (com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel) r2
            java.lang.String r0 = r1.A01
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel.A00(r2, r0)
            return
        L_0x0861:
            java.lang.Object r2 = r1.A00
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel r2 = (com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel) r2
            java.lang.String r0 = r1.A01
            com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel.A01(r2, r0)
            return
        L_0x086b:
            java.lang.Object r0 = r1.A00
            X.1gJ r0 = (X.AnonymousClass1gJ) r0
            java.lang.String r1 = r1.A01
            X.1ig r0 = r0.A04
            r0.A08(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71323bv.run():void");
    }

    public C71323bv(LinkedDevicesSharedViewModel linkedDevicesSharedViewModel, String str) {
        this.A02 = 25;
        this.A00 = linkedDevicesSharedViewModel;
        this.A01 = str;
    }
}
