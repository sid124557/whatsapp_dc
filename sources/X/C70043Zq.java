package X;

/* renamed from: X.3Zq  reason: invalid class name and case insensitive filesystem */
public class C70043Zq implements Runnable {
    public Object A00;
    public final int A01;

    public C70043Zq(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        r1 = X.C61102zi.A03((X.C61102zi) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02be, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02c1, code lost:
        if (r3.A0F != false) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c3, code lost:
        r3.A0F = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02c6, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r10 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02c9, code lost:
        if (r10 != null) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02cb, code lost:
        r10 = new org.whispersystems.curve25519.NativeVOPRFExtension();
        r3.A01 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02d2, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r6 = r3.A05;
        r0 = new byte[X.C18280x3.A02(r6.A00(), "token_length")];
        r4 = r10.A00;
        r4.A00(r0);
        r3.A0I = r0;
        r7 = null;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ef, code lost:
        if (r12 >= 256) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02f1, code lost:
        r7 = new byte[r6.A00().getInt("token_length", 0)];
        r4.A00(r7);
        r7[31] = (byte) (r7[31] & 31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x030b, code lost:
        if (r10.A00(r7) != false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x030d, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0311, code lost:
        if (r12 < 256) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r1.hasNext() == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0314, code lost:
        r0 = r10.A02(r3.A0I, r7, r6.A00().getInt("token_length", 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0322, code lost:
        if (r0 != null) goto L_0x033a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0324, code lost:
        com.whatsapp.util.Log.e("ACSToken/generateCredentialToken failed to blind the token");
        r6.A01(7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x032e, code lost:
        com.whatsapp.util.Log.w("ACSToken/generateCredentialToken cannot generate valid blindingFactor");
        r6.A01(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0336, code lost:
        r3.A02(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x033a, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        r3.A0G = r9;
        r3.A0H = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0341, code lost:
        if (r9 == false) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        ((X.AnonymousClass491) r1.next()).BWp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0343, code lost:
        r6.A04("next_original_token_string", android.util.Base64.encodeToString(r3.A0I, 10));
        r6.A04("blinding_factor_string", android.util.Base64.encodeToString(r7, 10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0359, code lost:
        r6.A04("original_token_string", android.util.Base64.encodeToString(r3.A0I, 10));
        r6.A04("blinding_factor_string", android.util.Base64.encodeToString(r7, 10));
        r6.A04("shared_secret_string", (java.lang.String) null);
        r6.A02("redeem_count", -1);
        r6.A03("base_timestamp", 0);
        r6.A03("time_to_live_in_seconds", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0388, code lost:
        r3.A0B = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0393, code lost:
        if (X.AnonymousClass000.A1U(r3.A03.A04, 2) == false) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0395, code lost:
        r3.A0E = r3.A06.A00(r3.A0H, r3.A0A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03a1, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03a3, code lost:
        r3.A01(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03a7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03ad, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ae, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r1.A09("event");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014e, code lost:
        X.C69263Wi.A00(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0151, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015c, code lost:
        X.C621433s.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x009a;
                case 1: goto L_0x00be;
                case 2: goto L_0x0015;
                case 3: goto L_0x0018;
                case 4: goto L_0x00d0;
                case 5: goto L_0x0053;
                case 6: goto L_0x00d8;
                case 7: goto L_0x00e6;
                case 8: goto L_0x00f0;
                case 9: goto L_0x00f8;
                case 10: goto L_0x0106;
                case 11: goto L_0x0115;
                case 12: goto L_0x0137;
                case 13: goto L_0x0140;
                case 14: goto L_0x0152;
                case 15: goto L_0x0160;
                case 16: goto L_0x0168;
                case 17: goto L_0x0170;
                case 18: goto L_0x0178;
                case 19: goto L_0x006d;
                case 20: goto L_0x0182;
                case 21: goto L_0x0191;
                case 22: goto L_0x01b7;
                case 23: goto L_0x0085;
                case 24: goto L_0x008c;
                case 25: goto L_0x01c4;
                case 26: goto L_0x01e9;
                case 27: goto L_0x01fb;
                case 28: goto L_0x0215;
                case 29: goto L_0x0215;
                case 30: goto L_0x021d;
                case 31: goto L_0x022d;
                case 32: goto L_0x0258;
                case 33: goto L_0x02b3;
                case 34: goto L_0x02b3;
                case 35: goto L_0x02b9;
                case 36: goto L_0x03b2;
                case 37: goto L_0x02b9;
                case 38: goto L_0x03d9;
                case 39: goto L_0x03e2;
                case 40: goto L_0x03ea;
                case 41: goto L_0x03f4;
                case 42: goto L_0x041a;
                case 43: goto L_0x0422;
                case 44: goto L_0x042c;
                case 45: goto L_0x0435;
                case 46: goto L_0x044b;
                case 47: goto L_0x048c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r1.A00
            X.1ig r1 = (X.C29351ig) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
        L_0x000f:
            java.lang.String r0 = "event"
            r1.A09(r0)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r0 = r1.A00
            goto L_0x003d
        L_0x0018:
            java.lang.Object r0 = r1.A00
            X.3Ts r0 = (X.C68583Ts) r0
            X.2o5 r1 = r0.A01
            r0 = 0
            r1.A01 = r0
            java.lang.String r0 = r1.A00
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "mystatus/onError Not notifying observers because mystatus hasn't been initialized (the value is null) #mexmigrationperftracker"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.2qk r3 = r1.A03
            java.lang.String r2 = "fetching MyStatus resulted in an error causing the value to never get initialized. This can lead to looping as other areas of the app indirectly attempt to fetch the missing status because `getMyStatus()` has a side-effect of triggering a network call when myStatus is null."
            r1 = 1
            java.lang.String r0 = "my-status-failed-init"
            r3.A0A(r0, r1, r2)
            return
        L_0x0037:
            X.8qC r0 = r1.A0C
            java.lang.Object r0 = r0.get()
        L_0x003d:
            X.2zi r0 = (X.C61102zi) r0
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0043:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.491 r0 = (X.AnonymousClass491) r0
            r0.BWp()
            goto L_0x0043
        L_0x0053:
            java.lang.Object r0 = r1.A00
            X.2r7 r0 = (X.C55912r7) r0
            java.util.Set r0 = r0.A08
            java.util.Iterator r1 = r0.iterator()
        L_0x005d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.492 r0 = (X.AnonymousClass492) r0
            r0.BbP()
            goto L_0x005d
        L_0x006d:
            java.lang.Object r2 = r1.A00
            com.whatsapp.WaEditText r2 = (com.whatsapp.WaEditText) r2
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0014
            X.33i r0 = r2.A02
            android.view.inputmethod.InputMethodManager r1 = r0.A0Q()
            X.C626936e.A06(r1)
            r0 = 0
            r1.showSoftInput(r2, r0)
            r2.A04 = r0
            return
        L_0x0085:
            java.lang.Object r0 = r1.A00
            X.1hy r0 = (X.C28911hy) r0
            X.1ig r1 = r0.A0j
            goto L_0x000f
        L_0x008c:
            java.lang.Object r1 = r1.A00
            com.whatsapp.account.delete.DeleteAccountFeedback r1 = (com.whatsapp.account.delete.DeleteAccountFeedback) r1
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0014
            X.0Th r0 = r1.A05
            r0.A00()
            return
        L_0x009a:
            java.lang.Object r3 = r1.A00
            X.1i9 r3 = (X.C29021i9) r3
            X.33n r0 = r3.A0E
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x00b2
            X.4FS r2 = r3.A0J
            r1 = 1
            X.3Zq r0 = new X.3Zq
            r0.<init>(r3, r1)
            r2.BkM(r0)
            return
        L_0x00b2:
            X.2fm r2 = r3.A0F
            r1 = 1
            X.3Zq r0 = new X.3Zq
            r0.<init>(r3, r1)
            X.C48972fm.A02(r2, r0)
            return
        L_0x00be:
            java.lang.Object r1 = r1.A00
            X.1i9 r1 = (X.C29021i9) r1
            monitor-enter(r1)
            boolean r0 = r1.A03     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x00cb
            r0 = 0
            r1.A0F(r0)     // Catch:{ all -> 0x00cd }
        L_0x00cb:
            monitor-exit(r1)     // Catch:{ all -> 0x00cd }
            return
        L_0x00cd:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00cd }
            throw r0
        L_0x00d0:
            java.lang.Object r0 = r1.A00
            X.2qR r0 = (X.C55492qR) r0
            r0.A01()
            return
        L_0x00d8:
            java.lang.Object r0 = r1.A00
            X.2r7 r0 = (X.C55912r7) r0
            X.3Wi r2 = r0.A01
            r1 = 2131889321(0x7f120ca9, float:1.9413302E38)
            r0 = 1
            r2.A0H(r1, r0)
            return
        L_0x00e6:
            java.lang.Object r0 = r1.A00
            X.2r7 r0 = (X.C55912r7) r0
            X.3S3 r0 = r0.A05
            r0.A04()
            return
        L_0x00f0:
            java.lang.Object r0 = r1.A00
            X.33b r0 = (X.C619933b) r0
            r0.A07()
            return
        L_0x00f8:
            java.lang.Object r0 = r1.A00
            X.33m r0 = (X.C621033m) r0
            X.3Wi r2 = r0.A02
            r1 = 2131890742(0x7f121236, float:1.9416184E38)
            r0 = 1
            r2.A0F(r1, r0)
            return
        L_0x0106:
            java.lang.Object r2 = r1.A00
            X.1qJ r2 = (X.C32381qJ) r2
            X.0yD r1 = r2.A04
            r0 = 1
            r1.removeMessages(r0)
            android.app.Activity r1 = r2.A01
            r0 = 201(0xc9, float:2.82E-43)
            goto L_0x015c
        L_0x0115:
            java.lang.Object r5 = r1.A00
            X.1qJ r5 = (X.C32381qJ) r5
            X.0yD r0 = r5.A04
            r4 = 1
            r0.removeMessages(r4)
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/restore/success-runnable"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4FS r3 = r5.A05
            boolean r2 = r5.A0F
            boolean r0 = r5.A0E
            X.1qG r1 = new X.1qG
            r1.<init>(r5, r2, r4, r0)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3.BkL(r1, r0)
            return
        L_0x0137:
            java.lang.Object r2 = r1.A00
            X.1qJ r2 = (X.C32381qJ) r2
            X.3Wi r1 = r2.A02
            r0 = 11
            goto L_0x014e
        L_0x0140:
            java.lang.Object r2 = r1.A00
            X.1qJ r2 = (X.C32381qJ) r2
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/preparedb/cannot-start-db-restore-missing-key"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Wi r1 = r2.A02
            r0 = 10
        L_0x014e:
            X.C69263Wi.A00(r1, r2, r0)
            return
        L_0x0152:
            java.lang.Object r0 = r1.A00
            X.1qG r0 = (X.C32351qG) r0
            X.1qJ r0 = r0.A01
            android.app.Activity r1 = r0.A01
            r0 = 108(0x6c, float:1.51E-43)
        L_0x015c:
            X.C621433s.A01(r1, r0)
            return
        L_0x0160:
            java.lang.Object r0 = r1.A00
            X.4el r0 = (X.C89704el) r0
            r0.A65()
            return
        L_0x0168:
            java.lang.Object r0 = r1.A00
            X.4el r0 = (X.C89704el) r0
            r0.A66()
            return
        L_0x0170:
            java.lang.Object r0 = r1.A00
            X.4el r0 = (X.C89704el) r0
            X.C89704el.A58(r0)
            return
        L_0x0178:
            java.lang.Object r0 = r1.A00
            X.5QT r0 = (X.AnonymousClass5QT) r0
            android.widget.ListView r0 = r0.A01
            r0.focusableViewAvailable(r0)
            return
        L_0x0182:
            java.lang.Object r1 = r1.A00
            X.5iJ r1 = (X.C111565iJ) r1
            java.lang.String r0 = "WaJobsAsyncInit/onAsyncInitAnyUserState"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2gy r0 = r1.A00
            r0.A01()
            return
        L_0x0191:
            java.lang.Object r1 = r1.A00
            X.3DP r1 = (X.AnonymousClass3DP) r1
            X.2oU r0 = r1.A0A
            android.content.Context r2 = r0.A00
            X.2qk r4 = r1.A01
            X.2ss r12 = r1.A0D
            X.5UX r6 = r1.A05
            X.3Ex r7 = r1.A06
            X.5ZU r8 = r1.A07
            X.33i r10 = r1.A09
            X.2sq r5 = r1.A04
            X.5rC r3 = r1.A00
            X.5ZR r11 = r1.A0B
            X.30T r14 = r1.A0F
            X.2sj r15 = r1.A0G
            X.30g r9 = r1.A08
            X.3Lo r13 = r1.A0E
            X.C627136h.A0E(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x01b7:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "acceptlink/wait/timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.finish()
            return
        L_0x01c4:
            java.lang.Object r2 = r1.A00
            X.4eZ r2 = (X.C89644eZ) r2
            r0 = 0
            X.C621433s.A00(r2, r0)
            X.5hX r1 = r2.A00
            r3 = 0
            X.33p r0 = r2.A09
            int r5 = r0.A0C()
            r6 = 14
            long r7 = android.os.SystemClock.elapsedRealtime()
            X.2og r0 = r2.A0A
            java.lang.String r4 = r0.A02()
            android.content.Intent r0 = X.C627736r.A13(r2, r3, r4, r5, r6, r7)
            r1.A0A(r2, r0)
            return
        L_0x01e9:
            java.lang.Object r2 = r1.A00
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 0
            java.lang.String r0 = "RemoveAccountActivity/startRemoveAccount/failure"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.C621433s.A00(r2, r1)
            r0 = 2
            X.C621433s.A01(r2, r0)
            return
        L_0x01fb:
            java.lang.Object r3 = r1.A00
            com.whatsapp.account.remove.RemoveAccountActivity r3 = (com.whatsapp.account.remove.RemoveAccountActivity) r3
            X.3Wh r2 = r3.A07
            if (r2 == 0) goto L_0x020e
            r1 = 25
            X.3Zq r0 = new X.3Zq
            r0.<init>(r3, r1)
            X.C69253Wh.A01(r2, r0)
            return
        L_0x020e:
            java.lang.String r0 = "mainThreadHandler"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0215:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x021d:
            java.lang.Object r0 = r1.A00
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r0 = (com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet) r0
            r2 = 0
            X.3Wi r1 = r0.A1Y()
            r0 = 2131890537(0x7f121169, float:1.9415769E38)
            r1.A0G(r2, r0)
            return
        L_0x022d:
            java.lang.Object r0 = r1.A00
            X.5Ts r0 = (X.C105135Ts) r0
            X.30z r0 = r0.A02
            X.8qC r0 = r0.A0G
            java.lang.Object r5 = r0.get()
            X.30k r5 = (X.C613630k) r5
            r4 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingDataRepo/setShownMeTabMenuItemToolTip/"
            X.C18260x0.A1E(r0, r1, r4)
            X.5SO r0 = r5.A02()
            java.util.List r3 = r0.A01
            java.lang.String r2 = r0.A00
            boolean r1 = r0.A02
            X.5SO r0 = new X.5SO
            r0.<init>(r2, r3, r4, r1)
            r5.A09(r0)
            return
        L_0x0258:
            java.lang.Object r1 = r1.A00
            android.content.Context r1 = (android.content.Context) r1
            r6 = 1
            byte[] r2 = X.AnonymousClass36Q.A05(r1, r6)
            if (r2 == 0) goto L_0x029d
            int r0 = r2.length
            if (r0 == 0) goto L_0x029d
            java.lang.String r0 = "AccountTransferBroadcastReceiver/onReceive/exporting"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6Qf r5 = new X.6Qf
            r5.<init>((android.content.Context) r1)
            java.lang.String r4 = "com.whatsapp"
            X.6Ro r1 = new X.6Ro
            r1.<init>(r4, r2)
            X.6Pz r0 = new X.6Pz
            r0.<init>(r1)
            com.google.android.gms.tasks.Task r3 = r5.A02(r0, r6)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0288 }
            r0 = 10
            com.google.android.gms.tasks.Tasks.await(r3, r0, r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0288 }
            goto L_0x02a0
        L_0x0288:
            r2 = move-exception
            r0 = 2
            X.6Rn r1 = new X.6Rn
            r1.<init>(r4, r0)
            X.6Q0 r0 = new X.6Q0
            r0.<init>(r1)
            r5.A02(r0, r6)
            java.lang.String r0 = "AccountTransferBroadcastReceiver/exception during export"
            com.whatsapp.util.Log.e(r0, r2)
            return
        L_0x029d:
            java.lang.String r0 = "AccountTransferReceiver/onReceive/encrypted backup token is not present"
            goto L_0x02af
        L_0x02a0:
            X.6Rn r1 = new X.6Rn
            r1.<init>(r4, r6)
            X.6Q0 r0 = new X.6Q0
            r0.<init>(r1)
            r5.A02(r0, r6)
            java.lang.String r0 = "AccountTransferBroadcastReceiver/onReceive/exported successfully"
        L_0x02af:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x02b3:
            java.lang.Object r3 = r1.A00
            X.2oH r3 = (X.C54162oH) r3
            r9 = 0
            goto L_0x02be
        L_0x02b9:
            java.lang.Object r3 = r1.A00
            X.2oH r3 = (X.C54162oH) r3
            r9 = 1
        L_0x02be:
            monitor-enter(r3)
            boolean r0 = r3.A0F     // Catch:{ all -> 0x03af }
            if (r0 != 0) goto L_0x03ad
            r2 = 1
            r3.A0F = r2     // Catch:{ all -> 0x03af }
            monitor-enter(r3)     // Catch:{ all -> 0x03af }
            org.whispersystems.curve25519.NativeVOPRFExtension r10 = r3.A01     // Catch:{ all -> 0x03aa }
            if (r10 != 0) goto L_0x02d2
            org.whispersystems.curve25519.NativeVOPRFExtension r10 = new org.whispersystems.curve25519.NativeVOPRFExtension     // Catch:{ all -> 0x03aa }
            r10.<init>()     // Catch:{ all -> 0x03aa }
            r3.A01 = r10     // Catch:{ all -> 0x03aa }
        L_0x02d2:
            monitor-exit(r3)     // Catch:{ all -> 0x03aa }
            X.2q2 r6 = r3.A05     // Catch:{ all -> 0x03af }
            android.content.SharedPreferences r0 = r6.A00()     // Catch:{ all -> 0x03af }
            java.lang.String r11 = "token_length"
            int r0 = X.C18280x3.A02(r0, r11)     // Catch:{ all -> 0x03af }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x03af }
            X.2Uj r4 = r10.A00     // Catch:{ all -> 0x03af }
            r4.A00(r0)     // Catch:{ all -> 0x03af }
            r3.A0I = r0     // Catch:{ all -> 0x03af }
            r8 = 0
            r5 = 0
            r7 = r8
            r12 = 0
        L_0x02ed:
            r1 = 256(0x100, float:3.59E-43)
            if (r12 >= r1) goto L_0x0310
            android.content.SharedPreferences r0 = r6.A00()     // Catch:{ all -> 0x03af }
            int r0 = r0.getInt(r11, r5)     // Catch:{ all -> 0x03af }
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x03af }
            r4.A00(r7)     // Catch:{ all -> 0x03af }
            r13 = 31
            byte r0 = r7[r13]     // Catch:{ all -> 0x03af }
            r0 = r0 & 31
            byte r0 = (byte) r0     // Catch:{ all -> 0x03af }
            r7[r13] = r0     // Catch:{ all -> 0x03af }
            boolean r0 = r10.A00(r7)     // Catch:{ all -> 0x03af }
            if (r0 != 0) goto L_0x0310
            int r12 = r12 + 1
            goto L_0x02ed
        L_0x0310:
            r4 = 5
            if (r12 < r1) goto L_0x0314
            goto L_0x032e
        L_0x0314:
            byte[] r1 = r3.A0I     // Catch:{ all -> 0x03af }
            android.content.SharedPreferences r0 = r6.A00()     // Catch:{ all -> 0x03af }
            int r0 = r0.getInt(r11, r5)     // Catch:{ all -> 0x03af }
            byte[] r0 = r10.A02(r1, r7, r0)     // Catch:{ all -> 0x03af }
            if (r0 != 0) goto L_0x033a
            java.lang.String r0 = "ACSToken/generateCredentialToken failed to blind the token"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03af }
            r0 = 7
            r6.A01(r0)     // Catch:{ all -> 0x03af }
            goto L_0x0336
        L_0x032e:
            java.lang.String r0 = "ACSToken/generateCredentialToken cannot generate valid blindingFactor"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x03af }
            r6.A01(r4)     // Catch:{ all -> 0x03af }
        L_0x0336:
            r3.A02(r2)     // Catch:{ all -> 0x03af }
            goto L_0x03ad
        L_0x033a:
            monitor-enter(r3)     // Catch:{ all -> 0x03af }
            r3.A0G = r9     // Catch:{ all -> 0x03a7 }
            r3.A0H = r0     // Catch:{ all -> 0x03a7 }
            r2 = 10
            if (r9 == 0) goto L_0x0359
            byte[] r0 = r3.A0I     // Catch:{ all -> 0x03a7 }
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ all -> 0x03a7 }
            java.lang.String r0 = "next_original_token_string"
            r6.A04(r0, r1)     // Catch:{ all -> 0x03a7 }
            java.lang.String r1 = android.util.Base64.encodeToString(r7, r2)     // Catch:{ all -> 0x03a7 }
            java.lang.String r0 = "blinding_factor_string"
            r6.A04(r0, r1)     // Catch:{ all -> 0x03a7 }
            goto L_0x0388
        L_0x0359:
            byte[] r0 = r3.A0I     // Catch:{ all -> 0x03a7 }
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ all -> 0x03a7 }
            java.lang.String r0 = "original_token_string"
            r6.A04(r0, r1)     // Catch:{ all -> 0x03a7 }
            java.lang.String r1 = android.util.Base64.encodeToString(r7, r2)     // Catch:{ all -> 0x03a7 }
            java.lang.String r0 = "blinding_factor_string"
            r6.A04(r0, r1)     // Catch:{ all -> 0x03a7 }
            java.lang.String r0 = "shared_secret_string"
            r6.A04(r0, r8)     // Catch:{ all -> 0x03a7 }
            r1 = -1
            java.lang.String r0 = "redeem_count"
            r6.A02(r0, r1)     // Catch:{ all -> 0x03a7 }
            r1 = 0
            java.lang.String r0 = "base_timestamp"
            r6.A03(r0, r1)     // Catch:{ all -> 0x03a7 }
            java.lang.String r0 = "time_to_live_in_seconds"
            r6.A03(r0, r1)     // Catch:{ all -> 0x03a7 }
        L_0x0388:
            r3.A0B = r5     // Catch:{ all -> 0x03a7 }
            X.1im r0 = r3.A03     // Catch:{ all -> 0x03a7 }
            int r1 = r0.A04     // Catch:{ all -> 0x03a7 }
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)     // Catch:{ all -> 0x03a7 }
            if (r0 == 0) goto L_0x03a3
            X.3TF r2 = r3.A06     // Catch:{ all -> 0x03a7 }
            byte[] r1 = r3.A0H     // Catch:{ all -> 0x03a7 }
            java.lang.String r0 = r3.A0A     // Catch:{ all -> 0x03a7 }
            java.lang.String r0 = r2.A00(r1, r0)     // Catch:{ all -> 0x03a7 }
            r3.A0E = r0     // Catch:{ all -> 0x03a7 }
        L_0x03a1:
            monitor-exit(r3)     // Catch:{ all -> 0x03a7 }
            goto L_0x03ad
        L_0x03a3:
            r3.A01(r4)     // Catch:{ all -> 0x03a7 }
            goto L_0x03a1
        L_0x03a7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03a7 }
            goto L_0x03ac
        L_0x03aa:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03aa }
        L_0x03ac:
            throw r0     // Catch:{ all -> 0x03af }
        L_0x03ad:
            monitor-exit(r3)
            return
        L_0x03af:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x03b2:
            java.lang.Object r3 = r1.A00
            X.2oH r3 = (X.C54162oH) r3
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A0D = r0
            X.1im r0 = r3.A03
            int r1 = r0.A04
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 == 0) goto L_0x03d4
            X.3TF r2 = r3.A06
            byte[] r1 = r3.A0H
            java.lang.String r0 = r3.A0A
            java.lang.String r0 = r2.A00(r1, r0)
            r3.A0E = r0
            return
        L_0x03d4:
            r0 = 5
            r3.A01(r0)
            return
        L_0x03d9:
            java.lang.Object r1 = r1.A00
            X.1I1 r1 = (X.AnonymousClass1I1) r1
            r0 = 0
            r1.A07(r0)
            return
        L_0x03e2:
            java.lang.Object r0 = r1.A00
            X.1I1 r0 = (X.AnonymousClass1I1) r0
            r0.A05()
            return
        L_0x03ea:
            java.lang.Object r0 = r1.A00
            X.2JL r0 = (X.AnonymousClass2JL) r0
            com.whatsapp.anr.SigquitBasedANRDetector r1 = r0.A01
            r0 = 0
            r1.A09 = r0
            return
        L_0x03f4:
            java.lang.Object r0 = r1.A00
            X.2JL r0 = (X.AnonymousClass2JL) r0
            com.whatsapp.anr.SigquitBasedANRDetector r1 = r0.A01
            java.io.File r2 = r0.A00
            java.lang.String r0 = "SigquitBasedANRDetector/abortANRAndDiscardReport"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "SigquitBasedANRDetector/abortANR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r1.A09 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "anr-helper/discarding anr report: "
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r2, r0, r1)
            X.C18260x0.A1L(r1, r0)
            r2.delete()
            return
        L_0x041a:
            java.lang.Object r0 = r1.A00
            com.whatsapp.authentication.AppAuthenticationActivity r0 = (com.whatsapp.authentication.AppAuthenticationActivity) r0
            r0.A6k()
            return
        L_0x0422:
            java.lang.Object r1 = r1.A00
            com.whatsapp.authentication.FingerprintView r1 = (com.whatsapp.authentication.FingerprintView) r1
            X.0AR r0 = r1.A05
            r1.A01(r0)
            return
        L_0x042c:
            java.lang.Object r1 = r1.A00
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r1 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r1
            r0 = -1
            r1.Bel(r0)
            return
        L_0x0435:
            java.lang.Object r3 = r1.A00
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r3 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r3
            X.3Wi r0 = r3.A04
            r0.A0D()
            X.3Wi r2 = r3.A04
            r1 = 2131894507(0x7f1220eb, float:1.942382E38)
            r0 = 0
            r2.A0H(r1, r0)
            r3.A1W()
            return
        L_0x044b:
            java.lang.Object r4 = r1.A00
            X.0eF r4 = (X.C08310eF) r4
            X.0zH r1 = X.C18320x8.A0H(r4)
            r0 = 2131893763(0x7f121e03, float:1.9422312E38)
            r1.A0T(r0)
            X.043 r3 = r1.create()
            r1 = 2131893762(0x7f121e02, float:1.942231E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r4)
            java.lang.String r2 = r0.getString(r1)
            r0 = 13
            X.90b r1 = new X.90b
            r1.<init>(r4, r0)
            r0 = -1
            r3.A03(r0, r2, r1)
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r4)
            java.lang.String r2 = r0.getString(r1)
            r0 = 1
            X.69A r1 = new X.69A
            r1.<init>(r0)
            r0 = -2
            r3.A03(r0, r2, r1)
            r3.show()
            return
        L_0x048c:
            java.lang.Object r1 = r1.A00
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r1 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r1
            com.whatsapp.CodeInputField r0 = r1.A03
            r0.requestFocus()
            com.whatsapp.CodeInputField r0 = r1.A03
            r0.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70043Zq.run():void");
    }
}
