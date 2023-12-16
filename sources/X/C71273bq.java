package X;

/* renamed from: X.3bq  reason: invalid class name and case insensitive filesystem */
public class C71273bq implements Runnable {
    public Object A00;
    public final int A01;

    public C71273bq(C105235Uc r1, int i) {
        this.A01 = i;
        switch (i) {
            case 35:
            case 36:
            case 37:
                this.A00 = r1;
                return;
            default:
                this.A00 = r1;
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0310, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0314, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0317, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0318, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x031b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0450, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0455, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0627, code lost:
        r2.A0H(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x062a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x065f, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
        if (r5.A03 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012f, code lost:
        r1.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0133, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r4 = r18
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x0031;
                case 1: goto L_0x003d;
                case 2: goto L_0x0049;
                case 3: goto L_0x0655;
                case 4: goto L_0x0055;
                case 5: goto L_0x0061;
                case 6: goto L_0x0067;
                case 7: goto L_0x0085;
                case 8: goto L_0x008d;
                case 9: goto L_0x009f;
                case 10: goto L_0x00a7;
                case 11: goto L_0x00e8;
                case 12: goto L_0x0104;
                case 13: goto L_0x0117;
                case 14: goto L_0x011f;
                case 15: goto L_0x0134;
                case 16: goto L_0x0176;
                case 17: goto L_0x017e;
                case 18: goto L_0x01b3;
                case 19: goto L_0x01c0;
                case 20: goto L_0x01e3;
                case 21: goto L_0x0266;
                case 22: goto L_0x0271;
                case 23: goto L_0x0281;
                case 24: goto L_0x031c;
                case 25: goto L_0x0324;
                case 26: goto L_0x0331;
                case 27: goto L_0x0339;
                case 28: goto L_0x034c;
                case 29: goto L_0x0357;
                case 30: goto L_0x035f;
                case 31: goto L_0x03e3;
                case 32: goto L_0x03ed;
                case 33: goto L_0x03f4;
                case 34: goto L_0x0443;
                case 35: goto L_0x044a;
                case 36: goto L_0x0456;
                case 37: goto L_0x04c8;
                case 38: goto L_0x04d4;
                case 39: goto L_0x050c;
                case 40: goto L_0x0535;
                case 41: goto L_0x053d;
                case 42: goto L_0x0580;
                case 43: goto L_0x061d;
                case 44: goto L_0x062b;
                case 45: goto L_0x0637;
                case 46: goto L_0x063f;
                case 47: goto L_0x0663;
                case 48: goto L_0x066d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r4.A00
            X.6EW r2 = (X.AnonymousClass6EW) r2
            android.hardware.Camera r0 = r2.A03
            if (r0 == 0) goto L_0x0662
            android.os.Handler r1 = r2.A04
            java.lang.Runnable r0 = r2.A0N
            if (r1 == 0) goto L_0x0019
            r1.removeCallbacks(r0)
            goto L_0x001c
        L_0x0019:
            r2.removeCallbacks(r0)
        L_0x001c:
            android.hardware.Camera r0 = r2.A03     // Catch:{ RuntimeException -> 0x0029 }
            r0.cancelAutoFocus()     // Catch:{ RuntimeException -> 0x0029 }
            android.hardware.Camera r1 = r2.A03     // Catch:{ RuntimeException -> 0x0029 }
            android.hardware.Camera$AutoFocusCallback r0 = r2.A0H     // Catch:{ RuntimeException -> 0x0029 }
            r1.autoFocus(r0)     // Catch:{ RuntimeException -> 0x0029 }
            return
        L_0x0029:
            r1 = move-exception
            java.lang.String r0 = "qrview/autofocus failed"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0031:
            java.lang.Object r1 = r4.A00
            X.4GQ r1 = (X.AnonymousClass4GQ) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            X.1l4 r0 = X.AnonymousClass1l4.A00
            goto L_0x065f
        L_0x003d:
            java.lang.Object r1 = r4.A00
            X.4GQ r1 = (X.AnonymousClass4GQ) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            X.1l7 r0 = X.AnonymousClass1l7.A00
            goto L_0x065f
        L_0x0049:
            java.lang.Object r1 = r4.A00
            X.4GQ r1 = (X.AnonymousClass4GQ) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            X.1lC r0 = X.C29751lC.A00
            goto L_0x065f
        L_0x0055:
            java.lang.Object r1 = r4.A00
            X.4DP r1 = (X.AnonymousClass4DP) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            r1.onSuccess()
            return
        L_0x0061:
            java.lang.Object r0 = r4.A00
            X.AnonymousClass0x9.A1K(r0)
            return
        L_0x0067:
            java.lang.Object r0 = r4.A00
            X.2p0 r0 = (X.C54612p0) r0
            X.1ig r0 = r0.A01
            r2 = 0
            X.C626936e.A01()
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0075:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0662
            java.lang.Object r0 = r1.next()
            X.4Ff r0 = (X.C85174Ff) r0
            r0.BNA(r2, r2)
            goto L_0x0075
        L_0x0085:
            java.lang.Object r0 = r4.A00
            com.whatsapp.profile.ProfileInfoActivity r0 = (com.whatsapp.profile.ProfileInfoActivity) r0
            X.C71273bq.super.onBackPressed()
            return
        L_0x008d:
            java.lang.Object r2 = r4.A00
            com.whatsapp.profile.ProfileInfoActivity r2 = (com.whatsapp.profile.ProfileInfoActivity) r2
            X.3ZH r1 = r2.A0I
            int r0 = r1.A06
            if (r0 != 0) goto L_0x0662
            int r0 = r1.A05
            if (r0 != 0) goto L_0x0662
            android.view.View r1 = r2.A03
            goto L_0x012f
        L_0x009f:
            java.lang.Object r0 = r4.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finishAfterTransition()
            return
        L_0x00a7:
            java.lang.Object r5 = r4.A00
            X.331 r5 = (X.AnonymousClass331) r5
            X.4uZ r4 = r5.A0G
            r5.A02(r4)
            byte[] r0 = r5.A02
            r3 = 0
            if (r0 != 0) goto L_0x00ba
            byte[] r0 = r5.A03
            r2 = 1
            if (r0 == 0) goto L_0x00bb
        L_0x00ba:
            r2 = 0
        L_0x00bb:
            boolean r0 = X.C627336j.A0K(r4)
            if (r0 == 0) goto L_0x00cf
            X.3Wi r1 = r5.A05
            r0 = 2131889889(0x7f120ee1, float:1.9414454E38)
            if (r2 == 0) goto L_0x00cb
            r0 = 2131889888(0x7f120ee0, float:1.9414452E38)
        L_0x00cb:
            r1.A0H(r0, r3)
            return
        L_0x00cf:
            X.2sr r1 = r5.A06
            X.1RR r0 = X.C56972sr.A01(r1)
            if (r0 == 0) goto L_0x0662
            boolean r0 = r1.A0a(r4)
            if (r0 == 0) goto L_0x0662
            X.3Wi r1 = r5.A05
            r0 = 2131892767(0x7f121a1f, float:1.9420292E38)
            if (r2 == 0) goto L_0x00cb
            r0 = 2131892766(0x7f121a1e, float:1.942029E38)
            goto L_0x00cb
        L_0x00e8:
            java.lang.Object r0 = r4.A00
            X.3fV r0 = (X.C73443fV) r0
            X.331 r1 = r0.A00
            X.4uZ r0 = r1.A0G
            r1.A02(r0)
            X.3Wi r2 = r1.A05
            boolean r0 = X.C627336j.A0K(r0)
            r1 = 2131889331(0x7f120cb3, float:1.9413323E38)
            if (r0 == 0) goto L_0x0101
            r1 = 2131889328(0x7f120cb0, float:1.9413316E38)
        L_0x0101:
            r0 = 0
            goto L_0x0627
        L_0x0104:
            java.lang.Object r1 = r4.A00
            com.whatsapp.profile.ProfilePhotoReminder r1 = (com.whatsapp.profile.ProfilePhotoReminder) r1
            X.5S9 r0 = r1.A0C
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0662
            X.5S9 r1 = r1.A0C
            r0 = 1
            r1.A01(r0)
            return
        L_0x0117:
            java.lang.Object r0 = r4.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x011f:
            java.lang.Object r2 = r4.A00
            com.whatsapp.profile.ProfilePhotoReminder r2 = (com.whatsapp.profile.ProfilePhotoReminder) r2
            X.3ZH r1 = r2.A09
            int r0 = r1.A06
            if (r0 != 0) goto L_0x0662
            int r0 = r1.A05
            if (r0 != 0) goto L_0x0662
            android.view.View r1 = r2.A02
        L_0x012f:
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x0134:
            java.lang.Object r5 = r4.A00
            X.3Qj r5 = (X.C67713Qj) r5
            X.33p r4 = r5.A04
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r4)
            java.lang.String r3 = "pref_wam_advertisement_id_reporting_done"
            boolean r0 = X.C18280x3.A1W(r0, r3)
            if (r0 != 0) goto L_0x0662
            X.3Mh r1 = r5.A00
            X.1Ei r0 = X.C66663Mh.A0t
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0662
            X.2oU r0 = r5.A03     // Catch:{ Exception -> 0x016b, all -> 0x0170 }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x016b, all -> 0x0170 }
            X.2XM r2 = X.C158157jW.A00(r0)     // Catch:{ Exception -> 0x016b, all -> 0x0170 }
            boolean r0 = r2.A01     // Catch:{ Exception -> 0x016b, all -> 0x0170 }
            if (r0 != 0) goto L_0x016b
            X.1Vy r1 = new X.1Vy     // Catch:{ Exception -> 0x016b, all -> 0x0170 }
            r1.<init>()     // Catch:{ Exception -> 0x016b, all -> 0x0170 }
            java.lang.String r0 = r2.A00     // Catch:{ Exception -> 0x016b, all -> 0x0170 }
            r1.A00 = r0     // Catch:{ Exception -> 0x016b, all -> 0x0170 }
            X.4FV r0 = r5.A05     // Catch:{ Exception -> 0x016b, all -> 0x0170 }
            r0.BhA(r1)     // Catch:{ Exception -> 0x016b, all -> 0x0170 }
        L_0x016b:
            r0 = 1
            X.C18270x1.A0v(r4, r3, r0)
            return
        L_0x0170:
            r1 = move-exception
            r0 = 1
            X.C18270x1.A0v(r4, r3, r0)
            throw r1
        L_0x0176:
            java.lang.Object r0 = r4.A00
            X.3Cr r0 = (X.C64233Cr) r0
            r0.A00()
            return
        L_0x017e:
            java.lang.Object r2 = r4.A00
            X.3Qi r2 = (X.C67703Qi) r2
            X.2sL r0 = r2.A02
            java.util.List r0 = r0.A05()
            java.util.Iterator r1 = r0.iterator()
        L_0x018c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ac
            java.lang.Object r4 = r1.next()
            X.4uY r4 = (X.C95804uY) r4
            X.2se r0 = r2.A05
            r5 = 0
            r8 = 0
            X.C162457s7.A0J(r4, r8)
            X.2gy r0 = r0.A07
            r6 = 1
            X.1gy r3 = new X.1gy
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A02(r3)
            goto L_0x018c
        L_0x01ac:
            X.2se r1 = r2.A05
            r0 = 1
            r1.A0C(r0)
            return
        L_0x01b3:
            java.lang.Object r1 = r4.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 9
            android.os.Process.setThreadPriority(r0)
            r1.run()
            return
        L_0x01c0:
            java.lang.Object r1 = r4.A00
            X.1im r1 = (X.C29411im) r1
            java.lang.String r0 = "XmppStateManager/offlineProcessComplete"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 0
            r1.A01 = r0
            X.C626936e.A01()
            java.util.Iterator r1 = X.C61102zi.A03(r1)
        L_0x01d3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0662
            java.lang.Object r0 = r1.next()
            X.4F2 r0 = (X.AnonymousClass4F2) r0
            r0.BUE()
            goto L_0x01d3
        L_0x01e3:
            java.lang.Object r6 = r4.A00
            X.2UP r6 = (X.AnonymousClass2UP) r6
            X.2rn r0 = r6.A0F
            java.util.List r7 = r0.A05()
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x01fc
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r0 == 0) goto L_0x01fc
            r7.remove(r0)
        L_0x01fc:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0662
            X.1VX r10 = r6.A0K
            r9 = 522(0x20a, float:7.31E-43)
            X.2vE r11 = X.C58422vE.A02
            int r0 = r10.A0O(r11, r9)
            if (r0 == 0) goto L_0x0662
            long r2 = java.lang.System.currentTimeMillis()
            X.5Xv r8 = r6.A05
            android.content.SharedPreferences r0 = r8.A03()
            java.lang.String r5 = "zombie_cleanup"
            long r0 = X.AnonymousClass0x2.A0B(r0, r5)
            long r3 = X.C18280x3.A08(r2, r0)
            r0 = 60
            long r3 = r3 / r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "OfflineResumeHandler/shouldCleanupZombieCalls Interval = "
            r1.append(r0)
            int r0 = r10.A0O(r11, r9)
            r1.append(r0)
            java.lang.String r0 = " diff = "
            X.C18260x0.A12(r0, r1, r3)
            long r1 = X.C56952sp.A06(r10, r9)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0662
            java.lang.String r0 = "OfflineResumeHandler/onOfflineComplete Cleaning up zombie calls"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = r8.A03()
            X.C18270x1.A0o(r0, r5, r1)
            r1 = 0
            r0 = 0
            android.os.Message r3 = android.os.Message.obtain(r1, r0, r7)
            X.5jr r2 = r6.A06
            java.lang.String r1 = "check_ongoing_calls"
            X.5Zu r0 = new X.5Zu
            r0.<init>((android.os.Message) r3, (java.lang.String) r1)
            r2.A00(r0)
            return
        L_0x0266:
            java.lang.Object r0 = r4.A00
            X.2UP r0 = (X.AnonymousClass2UP) r0
            X.2rc r1 = r0.A0W
            r0 = 0
            r1.A02(r0)
            return
        L_0x0271:
            java.lang.Object r0 = r4.A00
            X.2UP r0 = (X.AnonymousClass2UP) r0
            X.2p1 r2 = r0.A0a
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            java.lang.Class<com.whatsapp.service.GcmFGService> r0 = com.whatsapp.service.GcmFGService.class
            r2.A01(r1, r0)
            return
        L_0x0281:
            java.lang.Object r0 = r4.A00
            X.2UP r0 = (X.AnonymousClass2UP) r0
            X.2Kg r8 = r0.A0J
            X.8qC r0 = r8.A01
            java.util.Iterator r9 = X.AnonymousClass0x2.A0j(r0)
        L_0x028d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0662
            java.lang.Object r0 = r9.next()
            X.2oP r0 = (X.C54242oP) r0
            java.util.Set r2 = r0.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageOrphanResolverManager/deleteMessageOrphans count = "
            r1.append(r0)
            int r0 = r2.size()
            X.C18260x0.A1G(r1, r0)
            int r0 = r2.size()
            java.lang.String[] r5 = new java.lang.String[r0]
            java.util.Iterator r4 = r2.iterator()
            r3 = 0
        L_0x02b8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02c9
            long r1 = X.C18270x1.A02(r4)
            int r0 = r3 + 1
            X.AnonymousClass0x2.A1S(r5, r3, r1)
            r3 = r0
            goto L_0x02b8
        L_0x02c9:
            X.3dV r0 = r8.A00
            X.4Fq r6 = r0.A04()
            r0 = 100
            X.3ct r7 = new X.3ct     // Catch:{ all -> 0x0315 }
            r7.<init>(r5, r0)     // Catch:{ all -> 0x0315 }
        L_0x02d6:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0315 }
            if (r0 == 0) goto L_0x030a
            java.lang.String[] r5 = X.C71923ct.A01(r7)     // Catch:{ all -> 0x0315 }
            X.3Yo r4 = r6.Axl()     // Catch:{ all -> 0x0315 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x030e }
            java.lang.String r0 = "_id IN "
            r1.append(r0)     // Catch:{ all -> 0x030e }
            int r0 = r5.length     // Catch:{ all -> 0x030e }
            java.lang.String r0 = X.C57212tH.A00(r0)     // Catch:{ all -> 0x030e }
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x030e }
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x030e }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x030e }
            java.lang.String r1 = "message_orphan"
            java.lang.String r0 = "MessageOrphanResolverManager/deleteMessageOrphans"
            r2.A07(r1, r3, r0, r5)     // Catch:{ all -> 0x030e }
            r4.A00()     // Catch:{ all -> 0x030e }
            r4.close()     // Catch:{ all -> 0x0315 }
            goto L_0x02d6
        L_0x030a:
            r6.close()
            goto L_0x028d
        L_0x030e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0310 }
        L_0x0310:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x0315 }
            throw r0     // Catch:{ all -> 0x0315 }
        L_0x0315:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0317 }
        L_0x0317:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)
            throw r0
        L_0x031c:
            java.lang.Object r0 = r4.A00
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            return
        L_0x0324:
            java.lang.Object r1 = r4.A00
            X.5a4 r1 = (X.C106735a4) r1
            X.33i r0 = r1.A0f
            X.AnonymousClass29U.A00(r0)
            r1.A07()
            return
        L_0x0331:
            java.lang.Object r0 = r4.A00
            X.5a4 r0 = (X.C106735a4) r0
            r0.A08()
            return
        L_0x0339:
            java.lang.Object r1 = r4.A00
            X.5a4 r1 = (X.C106735a4) r1
            X.33i r0 = r1.A0f
            X.AnonymousClass29U.A00(r0)
            X.5Kl r0 = r1.A07
            X.5YG r0 = r0.A01
            if (r0 == 0) goto L_0x0662
            r0.A0G()
            return
        L_0x034c:
            java.lang.Object r0 = r4.A00
            X.5a4 r0 = (X.C106735a4) r0
            android.view.View r1 = r0.A0P
            r0 = 0
            r1.setAlpha(r0)
            return
        L_0x0357:
            java.lang.Object r0 = r4.A00
            X.5a4 r0 = (X.C106735a4) r0
            r0.A06()
            return
        L_0x035f:
            java.lang.Object r2 = r4.A00
            X.5a4 r2 = (X.C106735a4) r2
            java.io.File r8 = r2.A08
            android.net.Uri r3 = android.net.Uri.fromFile(r8)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ptvcameraui/showpreview "
            X.C18260x0.A1R(r1, r0, r3)
            X.5Qm r1 = new X.5Qm     // Catch:{ 6pi -> 0x0379 }
            r1.<init>(r8)     // Catch:{ 6pi -> 0x0379 }
            goto L_0x037f
        L_0x0379:
            java.lang.String r0 = "PtvCameraUI/error extracting video meta"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x03a9
        L_0x037f:
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x03dd
            int r0 = r1.A01
            float r13 = (float) r0
            int r0 = r1.A03
        L_0x038a:
            float r14 = (float) r0
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x03da
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x03da
            long r0 = r1.A04
            r4 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x03ad
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "PtvCameraUI/video duration is smaller than minimum duration duration="
            java.lang.String r0 = X.AnonymousClass000.A0Z(r2, r3, r0)
        L_0x03a6:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x03a9:
            X.C627536m.A0O(r8)
            return
        L_0x03ad:
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>(r11, r11, r13, r14)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            X.4v8 r9 = new X.4v8
            r9.<init>()
            r12 = r11
            r9.A0M(r10, r11, r12, r13, r14)
            r0.add(r9)
            r13 = 0
            X.5aV r6 = new X.5aV
            r6.<init>(r10, r10, r0, r13)
            X.5Ul r3 = r2.A0W     // Catch:{ IOException -> 0x03a9 }
            java.util.List r10 = r2.A0y     // Catch:{ IOException -> 0x03a9 }
            r11 = 1
            r4 = 0
            X.34x r7 = r2.A0p     // Catch:{ IOException -> 0x03a9 }
            r9 = r4
            r5 = r4
            r12 = r11
            boolean r0 = r3.A09(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x03a9 }
            if (r0 != 0) goto L_0x0662
            goto L_0x03a9
        L_0x03da:
            java.lang.String r0 = "PtvCameraUI/invalid dimensions"
            goto L_0x03a6
        L_0x03dd:
            int r0 = r1.A03
            float r13 = (float) r0
            int r0 = r1.A01
            goto L_0x038a
        L_0x03e3:
            java.lang.Object r0 = r4.A00
            X.5a4 r0 = (X.C106735a4) r0
            java.io.File r0 = r0.A08
            X.C627536m.A0O(r0)
            return
        L_0x03ed:
            java.lang.Object r0 = r4.A00
            X.5a4 r0 = (X.C106735a4) r0
            android.view.View r1 = r0.A0P
            goto L_0x0450
        L_0x03f4:
            java.lang.Object r0 = r4.A00
            X.68l r0 = (X.C1234468l) r0
            java.lang.Object r4 = r0.A00
            X.5a4 r4 = (X.C106735a4) r4
            boolean r0 = r4.A0D()
            if (r0 != 0) goto L_0x040f
            X.5LH r0 = r4.A05
            com.whatsapp.WaImageView r1 = r0.A07
            boolean r0 = r0.A0B
            int r0 = X.AnonymousClass001.A08(r0)
            r1.setVisibility(r0)
        L_0x040f:
            X.5Jx r3 = r4.A06
            android.view.View r1 = r3.A01
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0436
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            r1 = 34
            X.3bq r0 = new X.3bq
            r0.<init>((java.lang.Object) r3, (int) r1)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r0)
            r0.start()
        L_0x0436:
            X.5eI r1 = r4.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A00 = r0
            r0 = 1
            r4.A0B = r0
            r4.A05()
            return
        L_0x0443:
            java.lang.Object r0 = r4.A00
            X.5Jx r0 = (X.C102695Jx) r0
            android.view.View r1 = r0.A01
            goto L_0x0450
        L_0x044a:
            java.lang.Object r0 = r4.A00
            X.5Uc r0 = (X.C105235Uc) r0
            android.view.ViewGroup r1 = r0.A0K
        L_0x0450:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0456:
            java.lang.Object r8 = r4.A00
            X.5Uc r8 = (X.C105235Uc) r8
            android.animation.AnimatorSet r0 = r8.A03
            if (r0 != 0) goto L_0x04c2
            android.view.View r11 = r8.A0J
            r9 = 2
            float[] r4 = new float[r9]
            int r2 = r11.getWidth()
            X.33j r3 = r8.A0Q
            boolean r1 = X.C620733j.A04(r3)
            r0 = -2
            if (r1 == 0) goto L_0x0471
            r0 = 2
        L_0x0471:
            int r2 = r2 * r0
            float r0 = (float) r2
            r10 = 0
            r4[r10] = r0
            int r2 = r11.getWidth()
            boolean r1 = X.C620733j.A04(r3)
            r7 = -1
            r6 = 1
            r0 = 1
            if (r1 == 0) goto L_0x0484
            r0 = -1
        L_0x0484:
            int r2 = r2 * r0
            float r0 = (float) r2
            r4[r6] = r0
            java.lang.String r0 = "translationX"
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r11, r0, r4)
            r3 = 1600(0x640, double:7.905E-321)
            r5.setDuration(r3)
            r5.setRepeatCount(r7)
            float[] r1 = new float[r9]
            r1 = {1065353216, 0} // fill-array
            java.lang.String r0 = "alpha"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r11, r0, r1)
            r2.setDuration(r3)
            r2.setRepeatCount(r7)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r8.A03 = r1
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            android.animation.AnimatorSet r1 = r8.A03
            android.animation.Animator[] r0 = new android.animation.Animator[r9]
            r0[r10] = r5
            r0[r6] = r2
            r1.playTogether(r0)
        L_0x04c2:
            android.animation.AnimatorSet r0 = r8.A03
            r0.start()
            return
        L_0x04c8:
            java.lang.Object r0 = r4.A00
            X.5Uc r0 = (X.C105235Uc) r0
            android.animation.AnimatorSet r0 = r0.A03
            if (r0 == 0) goto L_0x0662
            r0.end()
            return
        L_0x04d4:
            java.lang.Object r0 = r4.A00
            X.3bq r0 = (X.C71273bq) r0
            java.lang.Object r2 = r0.A00
            X.5Uc r2 = (X.C105235Uc) r2
            X.33p r4 = r2.A0P
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r4)
            java.lang.String r3 = "voice_note_lock_tip_show_count"
            int r1 = X.C18280x3.A02(r0, r3)
            r0 = 4
            if (r1 >= r0) goto L_0x0662
            X.8uq r0 = r2.A04
            if (r0 == 0) goto L_0x04f3
            r0.Bbd()
        L_0x04f3:
            int r2 = r1 + 1
            if (r2 < 0) goto L_0x0505
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "wa-shared-prefs/setVoiceNoteLockTipShowCount "
            X.C18260x0.A0w(r0, r1, r2)
            X.C18260x0.A0L(r4, r3, r2)
            return
        L_0x0505:
            java.lang.String r0 = "Show count must be greater than or equal to 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x050c:
            java.lang.Object r1 = r4.A00
            X.5Uc r1 = (X.C105235Uc) r1
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x051c
            android.os.Handler r2 = r1.A0D
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r4, r0)
            return
        L_0x051c:
            X.8pF r0 = r1.A0R
            boolean r0 = r0.BFX()
            if (r0 == 0) goto L_0x0662
            X.4NZ r3 = r1.A05
            if (r3 == 0) goto L_0x0662
            r0 = 38
            X.3bq r2 = new X.3bq
            r2.<init>((java.lang.Object) r4, (int) r0)
            r0 = 300(0x12c, double:1.48E-321)
            r3.A04(r2, r0)
            return
        L_0x0535:
            java.lang.Object r0 = r4.A00
            com.whatsapp.qrcode.AuthenticationActivity r0 = (com.whatsapp.qrcode.AuthenticationActivity) r0
            r0.A6j()
            return
        L_0x053d:
            java.lang.Object r5 = r4.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r5 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r5
            java.lang.String r0 = "QrScannerActivity/registration timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4E3 r4 = r5.A07
            r3 = 1
            r1 = -3
            r0 = 2
            r4.BK7(r0, r1, r3)
            X.2a5 r0 = r5.A0C
            X.2qg r0 = r0.A00()
            r0.A01()
            X.4FS r2 = r5.A04
            r1 = 44
            X.3bq r0 = new X.3bq
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.BkM(r0)
            boolean r0 = r5.BHW()
            if (r0 != 0) goto L_0x0662
            r0 = 2131889093(0x7f120bc5, float:1.941284E38)
            r5.Bot(r0)
            java.lang.Runnable r1 = r5.A0E
            if (r1 == 0) goto L_0x0579
            android.view.View r0 = r5.A00
            r0.removeCallbacks(r1)
        L_0x0579:
            r5.BjL()
            r0 = 0
            r5.A06 = r0
            return
        L_0x0580:
            java.lang.Object r3 = r4.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r3 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r3
            boolean r1 = r3.A6h()
            r0 = 0
            if (r1 == 0) goto L_0x058e
            r3.A06 = r0
            return
        L_0x058e:
            java.lang.String r0 = r3.A06
            if (r0 == 0) goto L_0x0617
            X.32P r2 = X.AnonymousClass32P.A00(r0)
            if (r2 == 0) goto L_0x0617
            java.lang.String r8 = r2.A04
            byte[] r9 = r2.A05
            X.2e4 r5 = r2.A00
            byte[] r10 = r2.A06
            java.lang.Integer r7 = r2.A02
            X.239 r6 = r2.A01
            X.2S3 r4 = new X.2S3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.4E3 r0 = r3.A07
            r0.BZh(r4)
            X.2a5 r0 = r3.A0C
            X.2qg r11 = r0.A00()
            X.3TC r0 = r11.A01
            if (r0 == 0) goto L_0x05c9
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x05c9
        L_0x05bc:
            java.lang.String r0 = "CompanionDeviceQrHandler/handleQrCode/request already in progress"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.2qk r3 = r11.A02
            X.1iB r0 = r11.A0E
            java.lang.Object r1 = r0.A0P
            monitor-enter(r1)
            goto L_0x05f0
        L_0x05c9:
            X.1iB r0 = r11.A0E
            java.lang.Object r1 = r0.A0P
            monitor-enter(r1)
            X.2fi r0 = r0.A00     // Catch:{ all -> 0x0614 }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            monitor-exit(r1)     // Catch:{ all -> 0x0614 }
            if (r0 != 0) goto L_0x05bc
            r14 = 0
            X.2S3 r4 = new X.2S3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x0605
            r11.A02()
            X.239 r13 = X.AnonymousClass239.E2EE
            r17 = 0
            r16 = r14
            r12 = r4
            r15 = r14
            r11.A05(r12, r13, r14, r15, r16, r17)
            return
        L_0x05f0:
            X.2fi r0 = r0.A00     // Catch:{ all -> 0x0602 }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            monitor-exit(r1)     // Catch:{ all -> 0x0602 }
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "CompanionDeviceQrHandler/request already in progress"
            r3.A0A(r0, r1, r2)
            return
        L_0x0602:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0602 }
            throw r0
        L_0x0605:
            X.2e4 r0 = r4.A00
            if (r0 == 0) goto L_0x0611
            byte[] r0 = r4.A04
            if (r0 == 0) goto L_0x0611
            r11.A03(r4)
            return
        L_0x0611:
            X.4FK r0 = r11.A0G
            goto L_0x0619
        L_0x0614:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0614 }
            throw r0
        L_0x0617:
            X.4FK r0 = r3.A0I
        L_0x0619:
            r0.BUj()
            return
        L_0x061d:
            java.lang.Object r0 = r4.A00
            X.4ea r0 = (X.C89654ea) r0
            X.3Wi r2 = r0.A05
            r1 = 2131893284(0x7f121c24, float:1.942134E38)
            r0 = 1
        L_0x0627:
            r2.A0H(r1, r0)
            return
        L_0x062b:
            java.lang.Object r0 = r4.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r0 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r0
            X.1iB r1 = r0.A09
            java.lang.String r0 = "account_sync_timeout"
            r1.A0J(r0)
            return
        L_0x0637:
            java.lang.Object r0 = r4.A00
            X.1pq r0 = (X.C32241pq) r0
            r0.A74()
            return
        L_0x063f:
            java.lang.Object r0 = r4.A00
            X.6EW r0 = (X.AnonymousClass6EW) r0
            android.hardware.Camera r1 = r0.A03
            if (r1 == 0) goto L_0x0662
            android.hardware.Camera$AutoFocusCallback r0 = r0.A0H     // Catch:{ RuntimeException -> 0x064d }
            r1.autoFocus(r0)     // Catch:{ RuntimeException -> 0x064d }
            return
        L_0x064d:
            r1 = move-exception
            java.lang.String r0 = "qrview/onAutoFocus error:"
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x0655:
            java.lang.Object r1 = r4.A00
            X.4GQ r1 = (X.AnonymousClass4GQ) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            X.1lD r0 = X.C29761lD.A00
        L_0x065f:
            r1.invoke(r0)
        L_0x0662:
            return
        L_0x0663:
            java.lang.Object r0 = r4.A00
            X.6EW r0 = (X.AnonymousClass6EW) r0
            X.4Eb r0 = r0.A09
            r0.BYs()
            return
        L_0x066d:
            java.lang.Object r0 = r4.A00
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71273bq.run():void");
    }

    public C71273bq(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
