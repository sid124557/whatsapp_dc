package X;

import android.os.Handler;

/* renamed from: X.3a6  reason: invalid class name and case insensitive filesystem */
public class C70193a6 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C70193a6(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(Handler handler, Object obj, Object obj2, int i) {
        handler.post(new C70193a6(obj, i, obj2));
    }

    public static void A01(AnonymousClass4FS r1, Object obj, Object obj2, int i) {
        r1.BkM(new C70193a6(obj, i, obj2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02b4, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x09c8, code lost:
        r2.A0S(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x09cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0a9f, code lost:
        r3.BjL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0aa6, code lost:
        if (r3.BHW() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0aa8, code lost:
        com.whatsapp.util.Log.i("NewCommunityActivity/finishAndNavigateToCommunity");
        r2 = r3.A01;
        r2.A01.A0A(r3, X.C627736r.A0Z(r3, r1, true));
        X.C18290x4.A18(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0abc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0ace, code lost:
        r2.execute(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0ad1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0b93, code lost:
        if (r2 != r0.booleanValue()) goto L_0x0b95;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0c82, code lost:
        r1.A0D(java.util.Collections.singletonList(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0b08  */
    /* JADX WARNING: Removed duplicated region for block: B:607:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r2 = r17
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x0c34;
                case 1: goto L_0x0c24;
                case 2: goto L_0x0bb9;
                case 3: goto L_0x0b7c;
                case 4: goto L_0x0b5a;
                case 5: goto L_0x0ad2;
                case 6: goto L_0x0abd;
                case 7: goto L_0x0a7e;
                case 8: goto L_0x0a93;
                case 9: goto L_0x0a57;
                case 10: goto L_0x0a3f;
                case 11: goto L_0x0a11;
                case 12: goto L_0x09e4;
                case 13: goto L_0x0007;
                case 14: goto L_0x0007;
                case 15: goto L_0x0007;
                case 16: goto L_0x09cc;
                case 17: goto L_0x09b0;
                case 18: goto L_0x089a;
                case 19: goto L_0x0745;
                case 20: goto L_0x0734;
                case 21: goto L_0x069c;
                case 22: goto L_0x067d;
                case 23: goto L_0x0658;
                case 24: goto L_0x0642;
                case 25: goto L_0x05f2;
                case 26: goto L_0x05cc;
                case 27: goto L_0x05a1;
                case 28: goto L_0x057b;
                case 29: goto L_0x0310;
                case 30: goto L_0x0302;
                case 31: goto L_0x02f2;
                case 32: goto L_0x02a1;
                case 33: goto L_0x025e;
                case 34: goto L_0x01f2;
                case 35: goto L_0x018b;
                case 36: goto L_0x016a;
                case 37: goto L_0x0118;
                case 38: goto L_0x00f7;
                case 39: goto L_0x00db;
                case 40: goto L_0x0c7a;
                case 41: goto L_0x0c7a;
                case 42: goto L_0x00bd;
                case 43: goto L_0x009f;
                case 44: goto L_0x0091;
                case 45: goto L_0x007f;
                case 46: goto L_0x0071;
                case 47: goto L_0x0025;
                case 48: goto L_0x0053;
                case 49: goto L_0x0033;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r0
            java.lang.Object r2 = r2.A01
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.1ie r0 = r0.A08
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0015:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c89
            java.lang.Object r0 = r1.next()
            X.2rg r0 = (X.C56252rg) r0
            r0.A01(r2)
            goto L_0x0015
        L_0x0025:
            java.lang.Object r1 = r2.A00
            X.3Ex r1 = (X.C64773Ex) r1
            java.lang.Object r0 = r2.A01
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            X.1in r1 = r1.A06
            X.4uZ r0 = r0.A0H
            goto L_0x0c82
        L_0x0033:
            java.lang.Object r0 = r2.A00
            X.3Ex r0 = (X.C64773Ex) r0
            java.lang.Object r1 = r2.A01
            X.1in r0 = r0.A06
            java.util.Set r2 = java.util.Collections.singleton(r1)
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0043:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c89
            java.lang.Object r0 = r1.next()
            X.2sG r0 = (X.C56602sG) r0
            r0.A0C(r2)
            goto L_0x0043
        L_0x0053:
            java.lang.Object r0 = r2.A00
            X.3Ex r0 = (X.C64773Ex) r0
            java.lang.Object r2 = r2.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.1in r0 = r0.A06
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0061:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c89
            java.lang.Object r0 = r1.next()
            X.2sG r0 = (X.C56602sG) r0
            r0.A07(r2)
            goto L_0x0061
        L_0x0071:
            java.lang.Object r0 = r2.A00
            X.3Ex r0 = (X.C64773Ex) r0
            java.lang.Object r1 = r2.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1in r0 = r0.A06
            r0.A0A(r1)
            return
        L_0x007f:
            java.lang.Object r1 = r2.A00
            X.3Ex r1 = (X.C64773Ex) r1
            java.lang.Object r0 = r2.A01
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            X.1in r1 = r1.A06
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3ZH.A07(r0)
            r1.A0A(r0)
            return
        L_0x0091:
            java.lang.Object r0 = r2.A00
            X.3Ex r0 = (X.C64773Ex) r0
            java.lang.Object r1 = r2.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1in r0 = r0.A06
            r0.A0B(r1)
            return
        L_0x009f:
            java.lang.Object r0 = r2.A00
            X.3Ex r0 = (X.C64773Ex) r0
            java.lang.Object r2 = r2.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.1in r0 = r0.A06
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x00ad:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c89
            java.lang.Object r0 = r1.next()
            X.2sG r0 = (X.C56602sG) r0
            r0.A09(r2)
            goto L_0x00ad
        L_0x00bd:
            java.lang.Object r0 = r2.A00
            X.3Ex r0 = (X.C64773Ex) r0
            java.lang.Object r2 = r2.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.1in r0 = r0.A06
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x00cb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c89
            java.lang.Object r0 = r1.next()
            X.2sG r0 = (X.C56602sG) r0
            r0.A0B(r2)
            goto L_0x00cb
        L_0x00db:
            java.lang.Object r0 = r2.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity r0 = (com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity) r0
            java.lang.Object r2 = r2.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.2dy r0 = r0.A01
            if (r0 == 0) goto L_0x00f0
            r1 = 0
            X.1iA r0 = r0.A00()
            r0.A0F(r2, r1)
            return
        L_0x00f0:
            java.lang.String r0 = "companionRegistrationManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00f7:
            java.lang.Object r0 = r2.A00
            X.1Ow r0 = (X.C22611Ow) r0
            java.lang.Object r1 = r2.A01
            X.1ih r0 = r0.A05
            java.util.Set r3 = java.util.Collections.singleton(r1)
            r2 = 1
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0108:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c89
            java.lang.Object r0 = r1.next()
            X.2sh r0 = (X.C56872sh) r0
            r0.A0G(r3, r2)
            goto L_0x0108
        L_0x0118:
            java.lang.Object r5 = r2.A00
            X.1Ow r5 = (X.C22611Ow) r5
            java.lang.Object r4 = r2.A01
            X.1SP r4 = (X.AnonymousClass1SP) r4
            X.39M r2 = r5.A0D(r4)
            if (r2 == 0) goto L_0x012f
            long r0 = r4.A04
            r5.A0E(r2, r0)
            r5.A06(r4)
            return
        L_0x012f:
            int r3 = r4.A00
            if (r3 < 0) goto L_0x015e
            X.2sr r1 = r5.A01
            int r0 = r1.A0D()
            if (r0 == r3) goto L_0x015e
            X.2cT r2 = r5.A03     // Catch:{ 24P -> 0x0153 }
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A04(r1)     // Catch:{ 24P -> 0x0153 }
            X.32r r0 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 24P -> 0x0153 }
            com.whatsapp.jid.DeviceJid r1 = r0.A01(r1, r3)     // Catch:{ 24P -> 0x0153 }
            X.2cr r0 = r4.A01     // Catch:{ 24P -> 0x0153 }
            java.lang.String r0 = r0.A07     // Catch:{ 24P -> 0x0153 }
            java.util.Set r0 = java.util.Collections.singleton(r0)     // Catch:{ 24P -> 0x0153 }
            r2.A00(r1, r0)     // Catch:{ 24P -> 0x0153 }
            return
        L_0x0153:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FavoriteStickerHandler/sendRmrRequest invalid setter ex="
            X.C18260x0.A1Q(r1, r0, r2)
            return
        L_0x015e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FavoriteStickerHandler/sendRmrRequest invalid setter id="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)
            goto L_0x02b4
        L_0x016a:
            java.lang.Object r0 = r2.A00
            X.1Ow r0 = (X.C22611Ow) r0
            java.lang.Object r1 = r2.A01
            X.1ih r0 = r0.A05
            java.util.Set r3 = java.util.Collections.singleton(r1)
            r2 = 1
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x017b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c89
            java.lang.Object r0 = r1.next()
            X.2sh r0 = (X.C56872sh) r0
            r0.A0F(r3, r2)
            goto L_0x017b
        L_0x018b:
            java.lang.Object r0 = r2.A00
            X.3FH r0 = (X.AnonymousClass3FH) r0
            java.lang.Object r4 = r2.A01
            X.1Ol r4 = (X.AnonymousClass1Ol) r4
            X.3Gp r2 = r0.A01
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0c89
            java.lang.String r0 = "time_format"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r1 = X.AnonymousClass33W.A01(r0)
            X.34v r0 = r4.A00
            X.33W r3 = r0.A06(r1)
            if (r3 != 0) goto L_0x01b4
            X.33W r3 = r0.A07(r1)
            if (r3 == 0) goto L_0x01cd
        L_0x01b4:
            X.33j r0 = r4.A02
            X.5Ki r0 = r0.A05()
            boolean r1 = r0.A00
            X.1EO r0 = r3.A07()
            X.C626936e.A06(r0)
            X.1As r0 = r0.timeFormatAction_
            if (r0 != 0) goto L_0x01c9
            X.1As r0 = X.C21151As.DEFAULT_INSTANCE
        L_0x01c9:
            boolean r0 = r0.isTwentyFourHourFormatEnabled_
            if (r1 == r0) goto L_0x0c89
        L_0x01cd:
            X.2sr r0 = r4.A00
            X.C56972sr.A07(r0)
            X.33j r0 = r4.A02
            X.5Ki r0 = r0.A05()
            boolean r8 = r0.A00
            X.2sH r0 = r4.A01
            long r6 = r0.A0H()
            r4 = 0
            X.1SI r3 = new X.1SI
            r5 = r4
            r3.<init>(r4, r5, r6, r8)
            java.util.Set r0 = java.util.Collections.singleton(r3)
            r2.A0K(r0)
            r2.A0F()
            return
        L_0x01f2:
            java.lang.Object r5 = r2.A00
            X.3Gp r5 = (X.C65203Gp) r5
            java.lang.Object r4 = r2.A01
            X.39M r4 = (X.AnonymousClass39M) r4
            X.2sn r6 = r5.A0f
            java.lang.String r2 = r4.A0D
            X.C626936e.A06(r2)
            X.2rq r0 = r6.A05
            java.io.File r1 = r0.A02(r2)
            r3 = 0
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0247
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerRepository/downloadStickerFromRmrResponse exist in internal file, fileHash="
            X.C18260x0.A0q(r0, r2, r1)
            r3 = 1
        L_0x0218:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SyncManager/onReceiveRmrFavoriteResponse handle response fileHash="
            r1.append(r0)
            java.lang.String r0 = r4.A0D
            r1.append(r0)
            java.lang.String r0 = "; success="
            X.C18260x0.A1D(r0, r1, r3)
            if (r3 == 0) goto L_0x0c89
            X.2qH r3 = r5.A0N
            java.lang.String r2 = r4.A0D
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "[\"favoriteSticker\",\""
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "\"]"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r3.A03(r0)
            return
        L_0x0247:
            java.io.File r2 = r6.A04(r4, r1)
            if (r2 == 0) goto L_0x0254
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0254
            r3 = 1
        L_0x0254:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerRepository/downloadStickerFromRmrResponse success="
            X.C18260x0.A1P(r1, r0, r2)
            goto L_0x0218
        L_0x025e:
            java.lang.Object r3 = r2.A00
            X.3Gp r3 = (X.C65203Gp) r3
            java.lang.Object r1 = r2.A01
            X.34x r1 = (X.C624134x) r1
            boolean r0 = r3.A0Q()
            if (r0 == 0) goto L_0x0c89
            X.2qH r5 = r3.A0N
            X.2z0 r0 = r1.A1J
            X.4uZ r1 = r0.A00
            monitor-enter(r5)
            X.34v r4 = r5.A02     // Catch:{ all -> 0x029e }
            r0 = 0
            X.4JH r3 = new X.4JH     // Catch:{ all -> 0x029e }
            r3.<init>(r0)     // Catch:{ all -> 0x029e }
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x029e }
            X.C18280x3.A0w(r1, r2, r0)     // Catch:{ all -> 0x029e }
            java.lang.String r1 = "SyncdMutationsTable.SELECT_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES"
            java.lang.String r0 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE chat_jid == ? AND are_dependencies_missing = 1 ORDER BY _id ASC"
            java.util.List r0 = r4.A08(r3, r0, r1, r2)     // Catch:{ all -> 0x029e }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x029e }
        L_0x028e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x029e }
            if (r0 == 0) goto L_0x029c
            X.33W r0 = X.C18320x8.A0K(r1)     // Catch:{ all -> 0x029e }
            r5.A02(r0)     // Catch:{ all -> 0x029e }
            goto L_0x028e
        L_0x029c:
            monitor-exit(r5)     // Catch:{ all -> 0x029e }
            return
        L_0x029e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x029e }
            throw r0
        L_0x02a1:
            java.lang.Object r7 = r2.A00
            X.2Sm r7 = (X.C43532Sm) r7
            java.lang.Object r6 = r2.A01
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            X.2sr r0 = r7.A00
            com.whatsapp.jid.PhoneUserJid r2 = X.C56972sr.A04(r0)
            if (r2 != 0) goto L_0x02b8
            java.lang.String r0 = "security-notification-setting-manager/my user id is null (unregistered?)."
        L_0x02b4:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x02b8:
            X.33p r0 = r7.A03
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "security_notifications"
            boolean r3 = X.C18280x3.A1W(r1, r0)
            X.35J r0 = r7.A05
            X.2z0 r2 = X.AnonymousClass35J.A01(r2, r0)
            X.2sH r0 = r7.A02
            long r0 = r0.A0H()
            X.1nM r5 = new X.1nM
            r5.<init>(r2, r0)
            r5.A00 = r6
            r5.A00 = r3
            X.2rl r0 = r7.A04
            long r3 = r0.A00(r5)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02ec
            java.lang.String r0 = "security-notification-setting-manager/failed to add peer message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x02ec:
            X.2gy r0 = r7.A01
            X.C49712gy.A00(r0, r6, r5)
            return
        L_0x02f2:
            java.lang.Object r0 = r2.A00
            com.whatsapp.companiondevice.sync.HistorySyncWorker r0 = (com.whatsapp.companiondevice.sync.HistorySyncWorker) r0
            java.lang.Object r1 = r2.A01
            X.6bL r1 = (X.C130076bL) r1
            X.0PW r0 = r0.A0B()
            r1.A05(r0)
            return
        L_0x0302:
            java.lang.Object r0 = r2.A00
            X.3TQ r0 = (X.AnonymousClass3TQ) r0
            java.lang.Object r1 = r2.A01
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            X.30i r0 = r0.A02
            r0.A05(r1)
            return
        L_0x0310:
            java.lang.Object r8 = r2.A00
            X.3TQ r8 = (X.AnonymousClass3TQ) r8
            java.lang.Object r6 = r2.A01
            X.34Y r6 = (X.AnonymousClass34Y) r6
            X.2h2 r5 = r8.A00()
            X.3Ek r9 = r8.A04
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.Map r4 = r5.A04
            java.util.Iterator r1 = X.AnonymousClass001.A0v(r4)
        L_0x0328:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0338
            java.lang.Object r0 = r1.next()
            java.util.Collection r0 = (java.util.Collection) r0
            r2.addAll(r0)
            goto L_0x0328
        L_0x0338:
            java.util.Iterator r7 = r2.iterator()
        L_0x033c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x036c
            X.33W r1 = X.C18320x8.A0K(r7)
            boolean r0 = r1 instanceof X.C837749s
            if (r0 == 0) goto L_0x033c
            X.49s r1 = (X.C837749s) r1
            X.1WV r3 = new X.1WV
            r3.<init>()
            X.35N r2 = r1.B9b()
            java.util.Set r0 = r2.A02
            int r1 = r0.size()
            java.util.Set r0 = r2.A03
            int r0 = r0.size()
            int r1 = r1 + r0
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r1)
            r3.A00 = r0
            X.C64663Ek.A05(r9, r3)
            goto L_0x033c
        L_0x036c:
            X.30i r3 = r8.A02
            java.util.List r0 = r6.A01     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
        L_0x0374:
            boolean r0 = r11.hasNext()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            if (r0 == 0) goto L_0x03f3
            java.lang.Object r9 = r11.next()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.2ae r9 = (X.C45832ae) r9     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.String r0 = "SyncResponseHandler/handleErrors "
            X.C18260x0.A1S(r1, r0, r9)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            int r7 = r9.A00     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r0 = 400(0x190, float:5.6E-43)
            if (r7 == r0) goto L_0x03e9
            r0 = 404(0x194, float:5.66E-43)
            if (r7 == r0) goto L_0x03df
            r0 = 409(0x199, float:5.73E-43)
            r2 = 1
            if (r7 == r0) goto L_0x0399
            goto L_0x03b7
        L_0x0399:
            X.3Ek r0 = r3.A06     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.30l r10 = r0.A01     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.String r8 = "upload_conflict_counter"
            r0 = 1
            r10.A06(r8, r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.2Ph r1 = r9.A01     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.util.List r0 = r1.A02     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            boolean r0 = r0.isEmpty()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            if (r0 != 0) goto L_0x0529
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r3.A06(r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            goto L_0x0374
        L_0x03b7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.String r0 = "SyncResponseHandler/handleErrors error code: "
            X.C18260x0.A0z(r0, r1, r7)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.String r0 = "Retriable error with "
            r1.append(r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.String r0 = r9.A03     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            if (r0 != 0) goto L_0x03cf
            java.lang.String r0 = ""
        L_0x03cf:
            r1.append(r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.String r0 = " "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r7)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.1Se r1 = new X.1Se     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r1.<init>(r2, r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            goto L_0x0538
        L_0x03df:
            r1 = 63
            java.lang.String r0 = r9.A02     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.1Sf r1 = X.C23341Sf.A00(r0, r1)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            goto L_0x0538
        L_0x03e9:
            r1 = 62
            java.lang.String r0 = r9.A02     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.1Sf r1 = X.C23341Sf.A00(r0, r1)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            goto L_0x0538
        L_0x03f3:
            java.util.List r2 = r6.A00     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.String r0 = "SyncResponseHandler/handleAlreadySyncedCollections: "
            X.C18260x0.A1R(r1, r0, r2)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
        L_0x0402:
            boolean r0 = r2.hasNext()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            if (r0 == 0) goto L_0x0412
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.2ri r0 = r3.A0G     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r0.A02(r1)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            goto L_0x0402
        L_0x0412:
            java.util.List r0 = r6.A03     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
        L_0x0418:
            boolean r0 = r16.hasNext()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            if (r0 == 0) goto L_0x0539
            java.lang.Object r8 = r16.next()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.2K2 r8 = (X.AnonymousClass2K2) r8     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.String r0 = "SyncResponseHandler/handleNewCollectionVersions: "
            r1.append(r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.String r2 = r8.A01     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.C18260x0.A1L(r1, r2)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.util.List r7 = X.C18320x8.A0s(r2, r4)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            if (r7 == 0) goto L_0x04fa
            java.util.Iterator r10 = r7.iterator()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r1 = 0
            r12 = 0
        L_0x043e:
            boolean r0 = r10.hasNext()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            if (r0 == 0) goto L_0x045e
            X.33W r9 = X.C18320x8.A0K(r10)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            boolean r0 = r9 instanceof X.C837849t     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            if (r0 == 0) goto L_0x0457
            r0 = r9
            X.49t r0 = (X.C837849t) r0     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            boolean r0 = r0.BJD()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            if (r0 == 0) goto L_0x0457
            int r1 = r1 + 1
        L_0x0457:
            boolean r0 = r9 instanceof X.AnonymousClass1SL     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            if (r0 == 0) goto L_0x043e
            int r12 = r12 + 1
            goto L_0x043e
        L_0x045e:
            X.3Ek r11 = r3.A06     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            if (r1 <= 0) goto L_0x046b
            X.30l r10 = r11.A01     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.String r9 = "unset_action_mutation_counter"
            long r0 = (long) r1     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r10.A06(r9, r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
        L_0x046b:
            if (r12 <= 0) goto L_0x0475
            X.30l r10 = r11.A01     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.String r9 = "key_rotation_remove_counter"
            long r0 = (long) r12     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r10.A06(r9, r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
        L_0x0475:
            java.util.Map r0 = r5.A03     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.Object r9 = r0.get(r2)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            byte[] r9 = (byte[]) r9     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.1RE r0 = r3.A0E     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.4Fq r15 = r0.A0C()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.3Yo r14 = r15.Axl()     // Catch:{ all -> 0x051f }
            X.34v r1 = r3.A0H     // Catch:{ all -> 0x0515 }
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x0515 }
            if (r0 != 0) goto L_0x04cd
            X.1RE r0 = r1.A01     // Catch:{ all -> 0x0515 }
            X.4Fq r13 = r0.A0C()     // Catch:{ all -> 0x0515 }
            X.3Yo r12 = r13.Axl()     // Catch:{ all -> 0x050b }
            r0 = r13
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0501 }
            X.2sg r11 = r0.A03     // Catch:{ all -> 0x0501 }
            r1.A0E(r11, r7)     // Catch:{ all -> 0x0501 }
            java.util.LinkedHashSet r10 = X.AnonymousClass0x9.A17()     // Catch:{ all -> 0x0501 }
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x0501 }
        L_0x04a9:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0501 }
            if (r0 == 0) goto L_0x04b9
            X.33W r0 = X.C18320x8.A0K(r1)     // Catch:{ all -> 0x0501 }
            java.lang.String r0 = r0.A07     // Catch:{ all -> 0x0501 }
            r10.add(r0)     // Catch:{ all -> 0x0501 }
            goto L_0x04a9
        L_0x04b9:
            java.lang.String[] r0 = X.AnonymousClass34E.A00     // Catch:{ all -> 0x0501 }
            java.lang.Object[] r0 = r10.toArray(r0)     // Catch:{ all -> 0x0501 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0501 }
            X.C623934v.A01(r11, r0)     // Catch:{ all -> 0x0501 }
            r12.A00()     // Catch:{ all -> 0x0501 }
            r12.close()     // Catch:{ all -> 0x050b }
            r13.close()     // Catch:{ all -> 0x0515 }
        L_0x04cd:
            X.2ri r10 = r3.A0G     // Catch:{ all -> 0x0515 }
            long r0 = r8.A00     // Catch:{ all -> 0x0515 }
            r10.A05(r2, r9, r0)     // Catch:{ all -> 0x0515 }
            r14.A00()     // Catch:{ all -> 0x0515 }
            r14.close()     // Catch:{ all -> 0x051f }
            r15.close()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
        L_0x04e1:
            boolean r0 = r7.hasNext()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            if (r0 == 0) goto L_0x04fa
            X.33W r1 = X.C18320x8.A0K(r7)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            boolean r0 = r1.A0B()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            if (r0 == 0) goto L_0x04e1
            X.2qH r0 = r3.A0A     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r0.A01(r1)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r0.A02(r1)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            goto L_0x04e1
        L_0x04fa:
            X.2ri r0 = r3.A0G     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r0.A02(r2)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            goto L_0x0418
        L_0x0501:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0506 }
            goto L_0x050a
        L_0x0506:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x050b }
        L_0x050a:
            throw r1     // Catch:{ all -> 0x050b }
        L_0x050b:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0510 }
            goto L_0x0514
        L_0x0510:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0515 }
        L_0x0514:
            throw r1     // Catch:{ all -> 0x0515 }
        L_0x0515:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x051a }
            goto L_0x051e
        L_0x051a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x051f }
        L_0x051e:
            throw r1     // Catch:{ all -> 0x051f }
        L_0x051f:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0524 }
            goto L_0x0538
        L_0x0524:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            goto L_0x0538
        L_0x0529:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.String r0 = "Received a collection conflict with no patches, code "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r7)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.1Se r1 = new X.1Se     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r1.<init>(r2, r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
        L_0x0538:
            throw r1     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
        L_0x0539:
            java.util.List r0 = r6.A02     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r3.A06(r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.2FT r1 = r3.A05     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.String r0 = "sync-manager/onSuccessHandled"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.3Gp r2 = r1.A00     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.1i6 r0 = r2.A09     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.util.Iterator r1 = X.C61102zi.A03(r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
        L_0x054e:
            boolean r0 = r1.hasNext()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            if (r0 == 0) goto L_0x055e
            java.lang.Object r0 = r1.next()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.4Cf r0 = (X.C84404Cf) r0     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r0.Bdt()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            goto L_0x054e
        L_0x055e:
            r0 = 1
            X.C65203Gp.A01(r2, r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r2.A0P()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.30l r0 = r3.A07     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            android.content.SharedPreferences$Editor r1 = X.C613730l.A00(r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            java.lang.String r0 = "first_transient_server_failure_timestamp"
            X.C18270x1.A0g(r1, r0)     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            X.2zM r0 = r3.A0J     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            r0.A02()     // Catch:{ 1Sd | 1Se | 1Sf | SQLiteFullException -> 0x0576 }
            return
        L_0x0576:
            r0 = move-exception
            r3.A05(r0)
            return
        L_0x057b:
            java.lang.Object r0 = r2.A00
            X.2ut r0 = (X.C58212ut) r0
            java.lang.Object r2 = r2.A01
            X.2S3 r2 = (X.AnonymousClass2S3) r2
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r1 = r0.A00
            boolean r0 = r1.BHW()
            if (r0 != 0) goto L_0x0c89
            X.4E3 r0 = r1.A09
            r0.BZh(r2)
            X.2Xi r0 = r1.A07
            X.C626936e.A01()
            X.2a5 r0 = r0.A01
            if (r0 == 0) goto L_0x0c89
            X.2qg r0 = r0.A00()
            r0.A03(r2)
            return
        L_0x05a1:
            java.lang.Object r0 = r2.A00
            X.4Id r0 = (X.C85924Id) r0
            java.lang.Object r1 = r2.A01
            java.lang.Object r2 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r2 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r2
            boolean r0 = r2.BHW()
            if (r0 != 0) goto L_0x0c89
            X.2Xi r0 = r2.A07
            X.2fi r0 = r0.A00()
            if (r0 == 0) goto L_0x0c89
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0c89
            X.C626936e.A01()
            java.lang.Runnable r1 = r2.A0H
            if (r1 == 0) goto L_0x0c89
            android.view.View r0 = r2.A00
            r0.removeCallbacks(r1)
            return
        L_0x05cc:
            java.lang.Object r0 = r2.A00
            X.4Id r0 = (X.C85924Id) r0
            java.lang.Object r2 = r2.A01
            java.lang.Object r1 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r1 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r1
            boolean r0 = r1.BHW()
            if (r0 != 0) goto L_0x0c89
            X.2Xi r0 = r1.A07
            X.2fi r0 = r0.A00()
            if (r0 == 0) goto L_0x0c89
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0c89
            r1.A74()
            r0 = 0
            r1.A75(r0)
            return
        L_0x05f2:
            java.lang.Object r4 = r2.A00
            X.4Id r4 = (X.C85924Id) r4
            java.lang.Object r3 = r2.A01
            X.2fi r3 = (X.C48932fi) r3
            java.lang.Object r2 = r4.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r2 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r2
            boolean r0 = r2.BHW()
            if (r0 != 0) goto L_0x0c89
            X.2Xi r0 = r2.A07
            X.2fi r0 = r0.A00()
            if (r0 == 0) goto L_0x0c89
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0c89
            X.4FS r1 = r2.A04
            r0 = 24
            A01(r1, r4, r3, r0)
            r2.A74()
            X.33i r0 = r2.A08
            X.C620633i.A05(r0)
            r2.finish()
            X.2Xh r4 = r2.A04
            X.2S3 r0 = r3.A00
            java.lang.String r3 = r0.A03
            java.lang.Integer r2 = r0.A02
            r0 = 6
            X.1Xv r1 = new X.1Xv
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            r1.A02 = r3
            r1.A01 = r2
            X.4FV r0 = r4.A01
            r0.BhD(r1)
            return
        L_0x0642:
            java.lang.Object r0 = r2.A00
            X.4Id r0 = (X.C85924Id) r0
            java.lang.Object r2 = r2.A01
            X.2fi r2 = (X.C48932fi) r2
            java.lang.Object r0 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r0 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r0
            X.2fj r1 = r0.A05
            X.2S3 r0 = r2.A00
            java.lang.String r0 = r0.A03
            r1.A01(r0)
            return
        L_0x0658:
            java.lang.Object r0 = r2.A00
            X.4Id r0 = (X.C85924Id) r0
            java.lang.Object r2 = r2.A01
            java.lang.Object r1 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r1 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r1
            boolean r0 = r1.BHW()
            if (r0 != 0) goto L_0x0c89
            X.2Xi r0 = r1.A07
            X.2fi r0 = r0.A00()
            if (r0 == 0) goto L_0x0c89
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0c89
            X.4E3 r1 = r1.A09
            r0 = 2
            r1.BKN(r0)
            return
        L_0x067d:
            java.lang.Object r3 = r2.A00
            com.whatsapp.companiondevice.LinkedDeviceEditDeviceViewModel r3 = (com.whatsapp.companiondevice.LinkedDeviceEditDeviceViewModel) r3
            java.lang.Object r0 = r2.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            X.1iB r1 = r3.A01
            java.lang.String r0 = r0.getRawString()
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.getNullable(r0)
            X.C626936e.A06(r0)
            X.33G r1 = r1.A0A(r0)
            X.08M r0 = r3.A00
            r0.A0G(r1)
            return
        L_0x069c:
            java.lang.Object r1 = r2.A00
            X.3TC r1 = (X.AnonymousClass3TC) r1
            java.lang.Object r8 = r2.A01
            X.33G r8 = (X.AnonymousClass33G) r8
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0c89
            if (r8 == 0) goto L_0x072a
            X.2S3 r7 = r1.A00
            if (r7 == 0) goto L_0x072a
            X.2e4 r4 = r7.A00
            if (r4 == 0) goto L_0x072a
            X.2Vm r5 = r1.A07
            X.1DS r0 = r1.A02
            if (r0 == 0) goto L_0x0727
            long r1 = r0.timestamp_
        L_0x06ba:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "companion-device-qr-handler/on-success: "
            r3.append(r0)
            com.whatsapp.jid.DeviceJid r0 = r8.A07
            X.C18260x0.A0m(r0, r3)
            X.2qg r6 = r5.A00
            X.C55642qg.A00(r6)
            X.2fi r0 = new X.2fi
            r0.<init>(r7, r4, r8)
            r6.A00 = r0
            X.4FK r3 = r6.A0G
            X.26p r3 = (X.C382626p) r3
            int r0 = r3.A01
            if (r0 == 0) goto L_0x0704
            java.lang.Object r3 = r3.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r3 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r3
            X.2a5 r0 = r3.A0C
            X.2qg r0 = r0.A00()
            X.2fi r0 = r0.A00
            if (r0 != 0) goto L_0x06ed
            r3.A78()
        L_0x06ed:
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x06f8
            X.2r3 r0 = r6.A04
            r0.A04(r1)
        L_0x06f8:
            X.2IN r0 = r6.A0H
            X.3dI r2 = r0.A00
            r0 = 34
            X.3bu r0 = X.C71313bu.A00(r5, r0)
            goto L_0x0ace
        L_0x0704:
            java.lang.String r0 = "LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r3 = r3.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r3 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r3
            boolean r0 = r3.BHW()
            if (r0 != 0) goto L_0x06ed
            X.2Xi r0 = r3.A07
            X.2fi r0 = r0.A00()
            if (r0 != 0) goto L_0x06ed
            r3.A74()
            X.33i r0 = r3.A08
            X.C620633i.A05(r0)
            r3.finish()
            goto L_0x06ed
        L_0x0727:
            r1 = -1
            goto L_0x06ba
        L_0x072a:
            X.2Vm r2 = r1.A07
            X.2S3 r1 = r1.A00
            r0 = 500(0x1f4, float:7.0E-43)
            r2.A00(r1, r0)
            return
        L_0x0734:
            java.lang.Object r0 = r2.A00
            X.3Em r0 = (X.C64683Em) r0
            java.lang.Object r1 = r2.A01
            X.2S3 r1 = (X.AnonymousClass2S3) r1
            X.2qg r0 = r0.A01
            X.C55642qg.A00(r0)
            r0.A03(r1)
            return
        L_0x0745:
            java.lang.Object r9 = r2.A00
            X.2qg r9 = (X.C55642qg) r9
            java.lang.Object r10 = r2.A01
            X.2S3 r10 = (X.AnonymousClass2S3) r10
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CompanionDeviceQrHandler/startPairDevice start pairing "
            r1.append(r0)
            X.239 r0 = r10.A01
            r1.append(r0)
            java.lang.String r0 = " on "
            r1.append(r0)
            r0 = 0
            r1.append(r0)
            java.lang.String r0 = ";JID: "
            r1.append(r0)
            X.33D r0 = X.AnonymousClass33D.A01
            X.C162457s7.A0H(r0)
            X.C18260x0.A0m(r0, r1)
            X.239 r11 = X.AnonymousClass239.E2EE
            X.3Gp r4 = r9.A0A
            X.3Tb r5 = r4.A0A
            X.2sH r0 = r5.A06
            long r7 = r0.A0H()
            X.30l r6 = r5.A05
            android.content.SharedPreferences r1 = r6.A02()
            java.lang.String r0 = "syncd_last_device_reg_time"
            long r0 = X.AnonymousClass0x2.A0B(r1, r0)
            long r7 = r7 - r0
            r1 = 600000(0x927c0, double:2.964394E-318)
            r3 = 1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass001.A1V(r0)
            boolean r0 = r6.A08()
            if (r0 != 0) goto L_0x07b7
            if (r1 == 0) goto L_0x07b9
            boolean r0 = r5.A03()
            if (r0 == 0) goto L_0x07b9
            X.1iB r0 = r5.A07
            boolean r0 = X.C29041iB.A00(r0)
            if (r0 != 0) goto L_0x07b9
            X.1VX r2 = r5.A08
            r1 = 1991(0x7c7, float:2.79E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x07b9
        L_0x07b7:
            monitor-enter(r4)
            goto L_0x07bb
        L_0x07b9:
            r3 = 0
            goto L_0x07b7
        L_0x07bb:
            boolean r0 = r4.A04     // Catch:{ all -> 0x0897 }
            if (r0 == 0) goto L_0x07c7
            java.lang.String r0 = "sync-manager/shouldCleanUpSyncdOnPairing isSyncing = true"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0897 }
            monitor-exit(r4)     // Catch:{ all -> 0x0897 }
            goto L_0x0817
        L_0x07c7:
            monitor-exit(r4)     // Catch:{ all -> 0x0897 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sync-manager/shouldCleanUpSyncdOnPairing shouldCleanUpSyncdOnPairing = "
            X.C18260x0.A1E(r0, r1, r3)
            if (r3 == 0) goto L_0x0817
            java.lang.String r0 = "CompanionDeviceQrHandler/handleSyncdDirty clean syncD before companion dereg"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2sH r0 = r9.A0C
            long r2 = r0.A0H()
            X.1i1 r1 = r9.A09
            X.3Em r0 = new X.3Em
            r0.<init>(r9, r10, r2)
            r1.A06(r0)
            X.3Tb r4 = r9.A08
            X.30l r2 = r4.A05
            boolean r1 = r2.A08()
            r0 = 10
            if (r1 == 0) goto L_0x07f6
            r0 = 1
        L_0x07f6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = r0.intValue()
            android.content.SharedPreferences r2 = r2.A02()
            java.lang.String r1 = "syncd_dirty"
            r0 = -1
            int r1 = r2.getInt(r1, r0)
            if (r1 == r0) goto L_0x080f
            r0 = 4
            if (r1 < r0) goto L_0x0c89
        L_0x080f:
            r4.A01(r3)
            r0 = 1
            r4.A02(r0)
            return
        L_0x0817:
            X.2r3 r2 = r9.A04
            monitor-enter(r2)
            X.33p r4 = r2.A02     // Catch:{ all -> 0x0894 }
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r4)     // Catch:{ all -> 0x0894 }
            java.lang.String r5 = "adv_raw_id"
            int r7 = X.C18310x6.A03(r0, r5)     // Catch:{ all -> 0x0894 }
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r4)     // Catch:{ all -> 0x0894 }
            java.lang.String r3 = "adv_current_key_index"
            int r6 = X.C18310x6.A03(r0, r3)     // Catch:{ all -> 0x0894 }
            if (r7 <= 0) goto L_0x0864
            if (r6 <= 0) goto L_0x0864
            X.1iB r0 = r2.A05     // Catch:{ all -> 0x0894 }
            java.util.List r0 = r0.A0D()     // Catch:{ all -> 0x0894 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0894 }
            r1 = 1
            if (r0 != 0) goto L_0x0850
            int r0 = r6 + 1
            if (r0 > 0) goto L_0x084e
            java.lang.String r0 = "CompanionDeviceAdvUtil/incrementCurrentKeyIndex index overflow"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0894 }
            r2.A03()     // Catch:{ all -> 0x0894 }
            goto L_0x0850
        L_0x084e:
            r1 = r0
            goto L_0x0855
        L_0x0850:
            int r7 = r7 + 1
            if (r7 > 0) goto L_0x0855
            r7 = 1
        L_0x0855:
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r4)     // Catch:{ all -> 0x0894 }
            X.C18270x1.A0h(r0, r5, r7)     // Catch:{ all -> 0x0894 }
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r4)     // Catch:{ all -> 0x0894 }
            X.C18270x1.A0h(r0, r3, r1)     // Catch:{ all -> 0x0894 }
            goto L_0x088a
        L_0x0864:
            java.lang.String r0 = "CompanionDeviceAdvUtil/incrementCurrentKeyIndex empty id and index"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0894 }
            r2.A03()     // Catch:{ all -> 0x0894 }
            java.util.Random r0 = X.AnonymousClass0x9.A1C()     // Catch:{ all -> 0x0894 }
            int r0 = r0.nextInt()     // Catch:{ all -> 0x0894 }
            int r1 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0894 }
            if (r1 != 0) goto L_0x087b
            r1 = 1
        L_0x087b:
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r4)     // Catch:{ all -> 0x0894 }
            X.C18270x1.A0h(r0, r5, r1)     // Catch:{ all -> 0x0894 }
            r1 = 1
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r4)     // Catch:{ all -> 0x0894 }
            X.C18270x1.A0h(r0, r3, r1)     // Catch:{ all -> 0x0894 }
        L_0x088a:
            monitor-exit(r2)
            long r12 = r2.A00()
            r14 = 0
            r9.A04(r10, r11, r12, r14)
            return
        L_0x0894:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0897:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0897 }
            throw r0
        L_0x089a:
            java.lang.Object r0 = r2.A00
            X.4Rg r0 = (X.AnonymousClass4Rg) r0
            java.lang.Object r2 = r2.A01
            java.util.List r2 = (java.util.List) r2
            X.4X5 r4 = r0.A0B
            if (r4 != 0) goto L_0x08ad
            java.lang.String r0 = "communityMembersAdapter"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x08ad:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            X.5QZ r0 = r4.A00
            r5 = 0
            if (r0 == 0) goto L_0x090d
            int r1 = r0.A01
            r0 = 1
            if (r1 == r0) goto L_0x08c2
            r0 = 2
            if (r1 != r0) goto L_0x090d
        L_0x08c2:
            r9 = 1
        L_0x08c3:
            com.whatsapp.jid.GroupJid r8 = r4.A0L
            if (r8 == 0) goto L_0x094f
            int r1 = r2.size()
            X.33h r0 = r4.A0J
            int r0 = r0.A03(r8)
            if (r9 == 0) goto L_0x094f
            if (r1 <= r0) goto L_0x094f
            X.2Vj r0 = r4.A05
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x094f
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r9 = r2.iterator()
        L_0x08e9:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x090f
            java.lang.Object r7 = r9.next()
            X.5QZ r7 = (X.AnonymousClass5QZ) r7
            X.2sj r0 = r4.A0I
            com.whatsapp.jid.UserJid r1 = r7.A04
            X.33k r0 = X.C56892sj.A01(r0, r8)
            X.2zG r0 = r0.A05(r1)
            if (r0 == 0) goto L_0x08e9
            r1 = 2
            X.5PX r0 = new X.5PX
            r0.<init>(r1, r7)
            r6.add(r0)
            goto L_0x08e9
        L_0x090d:
            r9 = 0
            goto L_0x08c3
        L_0x090f:
            int r1 = r6.size()
            r0 = 11
            if (r1 <= r0) goto L_0x093f
            r1 = 10
            java.util.List r0 = r6.subList(r5, r1)
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)
            r3.addAll(r0)
            int r0 = X.AnonymousClass0x9.A03(r6, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 3
            X.5PX r0 = new X.5PX
            r0.<init>(r1, r2)
        L_0x0932:
            r3.add(r0)
        L_0x0935:
            X.5PX r0 = r4.A07
            r3.add(r5, r0)
            X.3Wi r2 = r4.A01
            r0 = 35
            goto L_0x09a2
        L_0x093f:
            r3.addAll(r6)
            int r1 = r6.size()
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0935
            X.5PX r0 = r4.A0B
            goto L_0x0932
        L_0x094f:
            X.2Vj r0 = r4.A05
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0960
            if (r8 == 0) goto L_0x0960
            if (r9 == 0) goto L_0x0960
            X.5PX r0 = r4.A07
            r3.add(r0)
        L_0x0960:
            java.util.Iterator r6 = r2.iterator()
        L_0x0964:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0978
            java.lang.Object r2 = r6.next()
            r1 = 2
            X.5PX r0 = new X.5PX
            r0.<init>(r1, r2)
            r7.add(r0)
            goto L_0x0964
        L_0x0978:
            int r1 = r7.size()
            r0 = 11
            if (r1 <= r0) goto L_0x09a8
            r1 = 10
            java.util.List r0 = r7.subList(r5, r1)
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)
            r3.addAll(r0)
            int r0 = X.AnonymousClass0x9.A03(r7, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 3
            X.5PX r0 = new X.5PX
            r0.<init>(r1, r2)
        L_0x099b:
            r3.add(r0)
        L_0x099e:
            X.3Wi r2 = r4.A01
            r0 = 36
        L_0x09a2:
            X.3cS r1 = new X.3cS
            r1.<init>(r4, r0, r3)
            goto L_0x09c8
        L_0x09a8:
            r3.addAll(r7)
            if (r9 != 0) goto L_0x099e
            X.5PX r0 = r4.A09
            goto L_0x099b
        L_0x09b0:
            java.lang.Object r3 = r2.A00
            X.0yy r3 = (X.C19200yy) r3
            java.lang.Object r1 = r2.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.3Ex r0 = r3.A02
            X.3ZH r0 = r0.A0A(r1)
            r3.A04 = r0
            X.3Wi r2 = r3.A00
            r0 = 31
            X.3bu r1 = X.C71313bu.A00(r3, r0)
        L_0x09c8:
            r2.A0S(r1)
            return
        L_0x09cc:
            java.lang.Object r3 = r2.A00
            X.0R6 r3 = (X.AnonymousClass0R6) r3
            java.lang.Object r0 = r2.A01
            java.util.Iterator r1 = X.C18320x8.A0q(r0)
        L_0x09d6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c89
            int r0 = X.C18280x3.A05(r1)
            r3.A06(r0)
            goto L_0x09d6
        L_0x09e4:
            java.lang.Object r5 = r2.A00
            X.8JI r5 = (X.AnonymousClass8JI) r5
            java.lang.Object r0 = r2.A01
            java.util.Iterator r4 = X.C18320x8.A0q(r0)
        L_0x09ee:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0c89
            java.lang.Object r3 = r4.next()
            X.1fJ r3 = (X.C27991fJ) r3
            X.5Jk r2 = r5.A03
            X.3Ex r1 = r2.A03
            X.3ZH r0 = r1.A09(r3)
            if (r0 == 0) goto L_0x0a0b
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.A0g(r0)
        L_0x0a0b:
            X.2so r0 = r2.A02
            r0.A0A(r3)
            goto L_0x09ee
        L_0x0a11:
            java.lang.Object r4 = r2.A00
            com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r4 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r4
            java.lang.Object r2 = r2.A01
            X.4uZ r2 = (X.C95814uZ) r2
            X.2j0 r1 = r4.A0D
            X.4AQ r0 = r4.A0C
            r1.A00(r0)
            X.107 r3 = r4.A0F
            X.3Ex r0 = r4.A0A
            X.3ZH r0 = r0.A07(r2)
            if (r0 == 0) goto L_0x0a3c
            boolean r1 = r0.A0d
            r0 = 1
            if (r1 != r0) goto L_0x0a3c
            X.20R r2 = X.AnonymousClass20R.EVERYONE
        L_0x0a31:
            X.21C r1 = X.AnonymousClass21C.IDLE
            X.2jh r0 = new X.2jh
            r0.<init>(r2, r1)
            r3.A0G(r0)
            return
        L_0x0a3c:
            X.20R r2 = X.AnonymousClass20R.ADMINS
            goto L_0x0a31
        L_0x0a3f:
            java.lang.Object r3 = r2.A00
            com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r3 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r3
            java.lang.Object r1 = r2.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.3Ex r0 = r3.A0A
            X.3ZH r0 = r0.A0A(r1)
            X.08J r1 = r3.A04
            boolean r0 = X.AnonymousClass31Y.A02(r0)
            X.C06270Wx.A05(r1, r0)
            return
        L_0x0a57:
            java.lang.Object r3 = r2.A00
            com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r3 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r3
            java.lang.Object r2 = r2.A01
            X.1fJ r2 = (X.C27991fJ) r2
            r1 = 1
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r0 = r3.A08
            java.util.SortedSet r0 = r0.A03(r2)
            int r0 = r0.size()
            r3.A00 = r0
            if (r0 <= 0) goto L_0x0a7a
            X.107 r2 = r3.A0G
            r1 = 0
            X.2lB r0 = new X.2lB
            r0.<init>(r1, r1, r1)
            r2.A0G(r0)
            return
        L_0x0a7a:
            r3.A0D(r1)
            return
        L_0x0a7e:
            java.lang.Object r0 = r2.A00
            X.4IC r0 = (X.AnonymousClass4IC) r0
            java.lang.Object r1 = r2.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            java.lang.Object r3 = r0.A00
            com.whatsapp.community.NewCommunityActivity r3 = (com.whatsapp.community.NewCommunityActivity) r3
            X.2ss r0 = r3.A07
            boolean r0 = r0.A0L(r1)
            if (r0 != 0) goto L_0x0a9f
            return
        L_0x0a93:
            java.lang.Object r0 = r2.A00
            X.4IO r0 = (X.AnonymousClass4IO) r0
            java.lang.Object r1 = r2.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            java.lang.Object r3 = r0.A00
            com.whatsapp.community.NewCommunityActivity r3 = (com.whatsapp.community.NewCommunityActivity) r3
        L_0x0a9f:
            r3.BjL()
            boolean r0 = r3.BHW()
            if (r0 != 0) goto L_0x0c89
            java.lang.String r0 = "NewCommunityActivity/finishAndNavigateToCommunity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Ej r2 = r3.A01
            r0 = 1
            android.content.Intent r1 = X.C627736r.A0Z(r3, r1, r0)
            X.5hX r0 = r2.A01
            r0.A0A(r3, r1)
            X.C18290x4.A18(r3)
            return
        L_0x0abd:
            java.lang.Object r0 = r2.A00
            com.whatsapp.community.ManageGroupsInCommunityActivity r0 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r0
            java.lang.Object r4 = r2.A01
            X.11H r3 = r0.A0B
            X.3dI r2 = r3.A12
            r1 = 43
            X.3cS r0 = new X.3cS
            r0.<init>(r3, r1, r4)
        L_0x0ace:
            r2.execute(r0)
            return
        L_0x0ad2:
            java.lang.Object r3 = r2.A00
            com.whatsapp.community.JoinGroupBottomSheetFragment r3 = (com.whatsapp.community.JoinGroupBottomSheetFragment) r3
            java.lang.Object r5 = r2.A01
            X.5L8 r5 = (X.AnonymousClass5L8) r5
            android.widget.TextView r4 = r3.A0I
            X.4VR r6 = r3.A0Q
            X.2sH r2 = r6.A0D
            long r0 = r5.A04
            long r12 = r2.A0I(r0)
            X.2sr r0 = r6.A05
            com.whatsapp.jid.UserJid r5 = r5.A06
            boolean r0 = r0.A0a(r5)
            r14 = 0
            if (r0 == 0) goto L_0x0b17
            X.33j r7 = r6.A0F
            r9 = 2131889827(0x7f120ea3, float:1.9414329E38)
            r10 = 2131889828(0x7f120ea4, float:1.941433E38)
            r11 = 2131889829(0x7f120ea5, float:1.9414333E38)
        L_0x0afc:
            java.lang.Object[] r8 = new java.lang.Object[r14]
        L_0x0afe:
            java.lang.String r5 = X.C107565bW.A0H(r7, r8, r9, r10, r11, r12, r14)
            X.03q r0 = r3.A0Q()
            if (r0 == 0) goto L_0x0c89
            X.03q r2 = r3.A0R()
            r1 = 22
            X.3bv r0 = new X.3bv
            r0.<init>(r1, r5, r4)
            r2.runOnUiThread(r0)
            return
        L_0x0b17:
            if (r5 == 0) goto L_0x0b4e
            X.3Ex r0 = r6.A0A
            X.3ZH r0 = r0.A07(r5)
            if (r0 == 0) goto L_0x0b4e
            X.3Ex r0 = r6.A0A
            X.3ZH r0 = r0.A07(r5)
            boolean r0 = X.AnonymousClass3ZH.A0E(r0)
            if (r0 != 0) goto L_0x0b4e
            X.33j r7 = r6.A0F
            r9 = 2131889821(0x7f120e9d, float:1.9414316E38)
            r10 = 2131889822(0x7f120e9e, float:1.9414318E38)
            r11 = 2131889823(0x7f120e9f, float:1.941432E38)
            r2 = 1
            java.lang.Object[] r8 = new java.lang.Object[r2]
            X.5ZU r1 = r6.A0B
            X.3Ex r0 = r6.A0A
            X.3ZH r0 = r0.A07(r5)
            X.C626936e.A06(r0)
            java.lang.String r0 = r1.A0R(r0, r2, r14)
            X.C620733j.A03(r7, r0, r8, r14)
            goto L_0x0afe
        L_0x0b4e:
            X.33j r7 = r6.A0F
            r9 = 2131889802(0x7f120e8a, float:1.9414278E38)
            r10 = 2131889803(0x7f120e8b, float:1.941428E38)
            r11 = 2131889804(0x7f120e8c, float:1.9414282E38)
            goto L_0x0afc
        L_0x0b5a:
            java.lang.Object r3 = r2.A00
            com.whatsapp.community.ConversationCommunityViewModel r3 = (com.whatsapp.community.ConversationCommunityViewModel) r3
            java.lang.Object r1 = r2.A01
            X.4uZ r1 = (X.C95814uZ) r1
            android.util.Pair r0 = r3.A00
            if (r0 == 0) goto L_0x0b6f
            java.lang.Object r0 = r0.first
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0b6f
            return
        L_0x0b6f:
            X.3Lq r0 = r3.A06
            int r0 = X.AnonymousClass0x7.A03(r0, r1)
            android.util.Pair r0 = X.C18300x5.A0E(r1, r0)
            r3.A00 = r0
            return
        L_0x0b7c:
            java.lang.Object r4 = r2.A00
            com.whatsapp.community.ConversationCommunityViewModel r4 = (com.whatsapp.community.ConversationCommunityViewModel) r4
            java.lang.Object r3 = r2.A01
            X.1fJ r3 = (X.C27991fJ) r3
            X.2sj r0 = r4.A05
            boolean r2 = r0.A0D(r3)
            java.lang.Boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0b95
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r2 == r0) goto L_0x0b96
        L_0x0b95:
            r1 = 1
        L_0x0b96:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.A01 = r0
            if (r1 == 0) goto L_0x0bab
            X.2so r0 = r4.A04
            boolean r0 = r0.A0G(r3)
            if (r0 == 0) goto L_0x0bab
            X.08M r0 = r4.A03
            r0.A0G(r3)
        L_0x0bab:
            X.2so r0 = r4.A04
            boolean r0 = r0.A0D(r3)
            if (r0 == 0) goto L_0x0c89
            X.08M r0 = r4.A02
            r0.A0G(r3)
            return
        L_0x0bb9:
            java.lang.Object r5 = r2.A00
            X.4H9 r5 = (X.AnonymousClass4H9) r5
            java.lang.Object r0 = r2.A01
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r8 = r0.iterator()
            r1 = 0
        L_0x0bc6:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0c1c
            X.3ZH r0 = X.C18310x6.A0R(r8)
            com.whatsapp.jid.Jid r7 = X.AnonymousClass3ZH.A04(r0)
            com.whatsapp.jid.GroupJid r7 = (com.whatsapp.jid.GroupJid) r7
            if (r7 == 0) goto L_0x0c89
            java.lang.Object r6 = r5.A00
            X.11B r6 = (X.AnonymousClass11B) r6
            X.2ss r1 = r6.A09
            int r0 = r1.A06(r7)
            r4 = 1
            if (r0 != r4) goto L_0x0c89
            X.31A r3 = X.C56982ss.A00(r1, r7)
            X.2lX r2 = r6.A0K
            if (r3 == 0) goto L_0x0c89
            int r1 = r3.A02
            r0 = 3
            if (r1 == r0) goto L_0x0bf4
            if (r1 != r4) goto L_0x0c89
        L_0x0bf4:
            X.3Ex r1 = r2.A00
            X.4uZ r0 = r3.A05()
            X.3ZH r0 = r1.A0A(r0)
            boolean r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x0c89
            X.2xM r0 = r6.A04
            java.util.Set r0 = r0.A01
            r0.add(r7)
            java.util.Map r1 = r6.A0S
            java.lang.Object r0 = r1.get(r3)
            if (r0 != 0) goto L_0x0c1a
            java.util.List r0 = java.util.Collections.emptyList()
            r1.put(r3, r0)
        L_0x0c1a:
            r1 = 1
            goto L_0x0bc6
        L_0x0c1c:
            java.lang.Object r0 = r5.A00
            X.11B r0 = (X.AnonymousClass11B) r0
            r0.A0F(r1)
            return
        L_0x0c24:
            java.lang.Object r0 = r2.A00
            X.4Jb r0 = (X.C86164Jb) r0
            java.lang.Object r1 = r2.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            java.lang.Object r0 = r0.A00
            X.11B r0 = (X.AnonymousClass11B) r0
            X.AnonymousClass11B.A00(r0, r1)
            return
        L_0x0c34:
            java.lang.Object r0 = r2.A00
            X.4HI r0 = (X.AnonymousClass4HI) r0
            java.lang.Object r2 = r2.A01
            X.4uZ r2 = (X.C95814uZ) r2
            java.lang.Object r4 = r0.A00
            X.11B r4 = (X.AnonymousClass11B) r4
            X.2ss r0 = r4.A09
            X.31A r1 = X.C56982ss.A00(r0, r2)
            if (r1 == 0) goto L_0x0c89
            java.util.Map r0 = r4.A0T
            java.lang.Object r3 = r0.remove(r2)
            X.31A r3 = (X.AnonymousClass31A) r3
            if (r3 == 0) goto L_0x0c89
            java.util.Map r0 = r4.A0S
            java.util.List r2 = X.C18320x8.A0s(r3, r0)
            if (r2 == 0) goto L_0x0c89
            boolean r0 = r2.remove(r1)
            if (r0 == 0) goto L_0x0c89
            X.2xM r0 = r4.A04
            java.util.Set r1 = r0.A01
            X.4uZ r0 = r3.A05()
            X.1fJ r0 = X.AnonymousClass34R.A01(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0c89
            boolean r0 = r2.isEmpty()
            r4.A0F(r0)
            return
        L_0x0c7a:
            java.lang.Object r1 = r2.A00
            X.3Ex r1 = (X.C64773Ex) r1
            java.lang.Object r0 = r2.A01
            X.1in r1 = r1.A06
        L_0x0c82:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.A0D(r0)
        L_0x0c89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70193a6.run():void");
    }
}
