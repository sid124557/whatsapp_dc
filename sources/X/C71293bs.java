package X;

import com.whatsapp.status.StatusesFragment;

/* renamed from: X.3bs  reason: invalid class name and case insensitive filesystem */
public class C71293bs implements Runnable {
    public Object A00;
    public final int A01;

    public C71293bs(StatusesFragment statusesFragment, int i) {
        this.A01 = i;
        switch (i) {
            case 34:
            case 35:
            case 36:
                this.A00 = statusesFragment;
                return;
            default:
                this.A00 = statusesFragment;
                return;
        }
    }

    public static void A00(AnonymousClass4FS r1, Object obj, int i) {
        r1.BkM(new C71293bs(obj, i));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:141|142) */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        r1 = X.AnonymousClass001.A0o();
        X.C18270x1.A1H(r1, "DownloadableWallpaperStorage/store : rename failed, from ", r6);
        X.C18260x0.A1O(r1, " to ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0545, code lost:
        X.C69263Wi.A01(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0548, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05c3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05c4, code lost:
        com.whatsapp.util.Log.i("msgstore/unsendreadreceipts/IllegalStateException ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05cc, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r6.A06.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0653, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0654, code lost:
        r6.A05.A08(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0659, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x08e4, code lost:
        r2.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x08e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
        r4 = r4 - r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x0317 */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0653 A[ExcHandler: SQLiteFullException (r1v25 'e' android.database.sqlite.SQLiteFullException A[CUSTOM_DECLARE]), Splitter:B:223:0x0565] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x08f1;
                case 1: goto L_0x08e8;
                case 2: goto L_0x08d3;
                case 3: goto L_0x08c2;
                case 4: goto L_0x08b0;
                case 5: goto L_0x0895;
                case 6: goto L_0x0888;
                case 7: goto L_0x087b;
                case 8: goto L_0x07fa;
                case 9: goto L_0x07f2;
                case 10: goto L_0x0549;
                case 11: goto L_0x052c;
                case 12: goto L_0x050b;
                case 13: goto L_0x07f2;
                case 14: goto L_0x04ff;
                case 15: goto L_0x04ff;
                case 16: goto L_0x04ea;
                case 17: goto L_0x04c8;
                case 18: goto L_0x0462;
                case 19: goto L_0x0462;
                case 20: goto L_0x0387;
                case 21: goto L_0x0366;
                case 22: goto L_0x023f;
                case 23: goto L_0x022d;
                case 24: goto L_0x021c;
                case 25: goto L_0x020f;
                case 26: goto L_0x01fe;
                case 27: goto L_0x01df;
                case 28: goto L_0x01b8;
                case 29: goto L_0x01a5;
                case 30: goto L_0x018e;
                case 31: goto L_0x0182;
                case 32: goto L_0x017a;
                case 33: goto L_0x0129;
                case 34: goto L_0x0121;
                case 35: goto L_0x0117;
                case 36: goto L_0x0104;
                case 37: goto L_0x00f7;
                case 38: goto L_0x00db;
                case 39: goto L_0x0007;
                case 40: goto L_0x00d3;
                case 41: goto L_0x00a2;
                case 42: goto L_0x0007;
                case 43: goto L_0x0007;
                case 44: goto L_0x009a;
                case 45: goto L_0x0087;
                case 46: goto L_0x0079;
                case 47: goto L_0x006c;
                case 48: goto L_0x0064;
                case 49: goto L_0x005c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r1.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r6 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r6
            java.lang.String r8 = "StatusPrivacyActivity/fetchFbUserFullName User error"
            X.2rK r0 = r6.A0I
            if (r0 == 0) goto L_0x0055
            X.21S r7 = X.AnonymousClass21S.A0S
            X.2jK r0 = r0.A00(r7)
            r5 = 0
            if (r0 == 0) goto L_0x07e6
            r4 = 1
            X.5Vp r3 = r6.A0J     // Catch:{ 57H | 57I | 57J | 57K | 57N | 57O -> 0x0041, 57L -> 0x003c, 59i -> 0x07e0 }
            if (r3 == 0) goto L_0x0035
            X.5dj r2 = r0.A00     // Catch:{ 57H | 57I | 57J | 57K | 57N | 57O -> 0x0041, 57L -> 0x003c, 59i -> 0x07e0 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 57H | 57I | 57J | 57K | 57N | 57O -> 0x0041, 57L -> 0x003c, 59i -> 0x07e0 }
            java.lang.String r0 = "FbProfileDataFetcher/fetchFbUserFullName called by "
            X.C18260x0.A1N(r1, r0, r7)     // Catch:{ 57H | 57I | 57J | 57K | 57N | 57O -> 0x0041, 57L -> 0x003c, 59i -> 0x07e0 }
            X.5zK r0 = new X.5zK     // Catch:{ 57H | 57I | 57J | 57K | 57N | 57O -> 0x0041, 57L -> 0x003c, 59i -> 0x07e0 }
            r0.<init>(r2, r3)     // Catch:{ 57H | 57I | 57J | 57K | 57N | 57O -> 0x0041, 57L -> 0x003c, 59i -> 0x07e0 }
            java.lang.Object r5 = X.C617031x.A00(r0)     // Catch:{ 57H | 57I | 57J | 57K | 57N | 57O -> 0x0041, 57L -> 0x003c, 59i -> 0x07e0 }
            goto L_0x07e6
        L_0x0035:
            java.lang.String r0 = "fbProfileDataFetcher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ 57H | 57I | 57J | 57K | 57N | 57O -> 0x0041, 57L -> 0x003c, 59i -> 0x07e0 }
            throw r0     // Catch:{ 57H | 57I | 57J | 57K | 57N | 57O -> 0x0041, 57L -> 0x003c, 59i -> 0x07e0 }
        L_0x003c:
            r1 = move-exception
            java.lang.String r0 = "StatusPrivacyActivity/fetchFbUserFullName Network error"
            goto L_0x07e3
        L_0x0041:
            r0 = move-exception
            X.C106245Ye.A02(r8, r0)
            X.2rK r0 = r6.A0I
            if (r0 == 0) goto L_0x004e
            r0.A03(r7, r4)
            goto L_0x07e6
        L_0x004e:
            java.lang.String r0 = "fbAccountManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0055:
            java.lang.String r0 = "fbAccountManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x005c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.status.playback.StatusReplyActivity r0 = (com.whatsapp.status.playback.StatusReplyActivity) r0
            r0.A7I()
            return
        L_0x0064:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.playback.MyStatusesActivity r1 = (com.whatsapp.status.playback.MyStatusesActivity) r1
            r0 = 0
            r1.A0Q = r0
            return
        L_0x006c:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.playback.MyStatusesActivity r1 = (com.whatsapp.status.playback.MyStatusesActivity) r1
            X.4OU r0 = r1.A0Z
            r0.notifyDataSetChanged()
            r1.A76()
            return
        L_0x0079:
            java.lang.Object r1 = r1.A00
            X.4ea r1 = (X.C89654ea) r1
            r0 = 8
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r0 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A00(r0)
            r1.Boo(r0)
            return
        L_0x0087:
            java.lang.Object r0 = r1.A00
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            X.2n3 r2 = r0.A0b
            X.4uZ r0 = r0.A0p
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A03(r0)
            java.lang.String r0 = "status"
            X.C53412n3.A00(r2, r1, r0)
            return
        L_0x009a:
            java.lang.Object r0 = r1.A00
            java.util.Map r0 = (java.util.Map) r0
            r0.clear()
            return
        L_0x00a2:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r1 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r1
            r3 = 0
            X.33e r0 = r1.A74()
            r2 = 0
            r0.A0E(r2, r3)
            X.3FH r0 = r1.A09
            if (r0 == 0) goto L_0x00cb
            r0.A00()
            X.2gy r1 = r1.A05
            if (r1 == 0) goto L_0x00c3
            com.whatsapp.jobqueue.job.SendStatusPrivacyListJob r0 = new com.whatsapp.jobqueue.job.SendStatusPrivacyListJob
            r0.<init>(r2, r3)
            r1.A02(r0)
            return
        L_0x00c3:
            java.lang.String r0 = "waJobManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00cb:
            java.lang.String r0 = "syncdUpdateHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00d3:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r1 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r1
            r0 = 0
            r1.A0C = r0
            return
        L_0x00db:
            java.lang.Object r4 = r1.A00
            com.whatsapp.status.advertise.CtwaStatusUpsellBottomSheetTriggerViewModel r4 = (com.whatsapp.status.advertise.CtwaStatusUpsellBottomSheetTriggerViewModel) r4
            X.2aP r0 = r4.A06
            java.lang.String r3 = "whatsapp_status_created"
            r2 = 11139(0x2b83, float:1.5609E-41)
            X.2wl r1 = r0.A00
            r0 = 0
            X.48d r1 = r1.A00(r0, r3, r2)
            if (r1 == 0) goto L_0x07f1
            r4.A00 = r1
            X.4UC r0 = r4.A04
            r0.A0G(r1)
            return
        L_0x00f7:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            X.4Oi r0 = r1.A0q
            r0.notifyDataSetChanged()
            r1.A1Q()
            return
        L_0x0104:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            X.5Wh r0 = r1.A10
            java.util.List r0 = r0.A02
            r1.A1T(r0)
            X.5Wh r0 = r1.A10
            java.util.List r0 = r0.A01
            r1.A1T(r0)
            return
        L_0x0117:
            java.lang.Object r0 = r1.A00
            com.whatsapp.status.StatusesFragment r0 = (com.whatsapp.status.StatusesFragment) r0
            X.5X9 r0 = r0.A14
            r0.A00()
            return
        L_0x0121:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.StatusesFragment r1 = (com.whatsapp.status.StatusesFragment) r1
            r0 = 0
            r1.A0m = r0
            return
        L_0x0129:
            java.lang.Object r8 = r1.A00
            com.whatsapp.status.StatusExpirationLifecycleOwner r8 = (com.whatsapp.status.StatusExpirationLifecycleOwner) r8
            X.33e r1 = r8.A02
            X.2sH r0 = r1.A01
            long r6 = X.C56612sH.A01(r0)
            X.2rO r3 = r1.A04
            java.lang.String r0 = "earliest_status_time"
            r1 = 0
            long r4 = r3.A00(r0, r1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07f1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0159
            long r4 = r4 - r6
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0159
            if (r0 <= 0) goto L_0x07f1
            X.3Wi r3 = r8.A00
            java.lang.Runnable r2 = r8.A04
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 + r0
            r3.A0T(r2, r4)
            return
        L_0x0159:
            X.2pt r3 = r8.A01
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.A0N
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0173
            X.2m9 r2 = r3.A05
            r0 = 27
            X.3Zk r1 = X.C69983Zk.A00(r3, r0)
            r0 = 41
            r2.A01(r1, r0)
            return
        L_0x0173:
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses already running; skip"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x017a:
            java.lang.Object r0 = r1.A00
            com.whatsapp.status.StatusExpirationLifecycleOwner r0 = (com.whatsapp.status.StatusExpirationLifecycleOwner) r0
            r0.A00()
            return
        L_0x0182:
            java.lang.Object r0 = r1.A00
            com.whatsapp.spamreport.ReportSpamDialogFragmentOld r0 = (com.whatsapp.spamreport.ReportSpamDialogFragmentOld) r0
            X.65Z r0 = r0.A0H
            if (r0 == 0) goto L_0x07f1
            r0.BZy()
            return
        L_0x018e:
            java.lang.Object r1 = r1.A00
            com.whatsapp.spamreport.ReportSpamDialogFragmentOld r1 = (com.whatsapp.spamreport.ReportSpamDialogFragmentOld) r1
            X.3Wi r0 = r1.A01
            r0.A0D()
            boolean r0 = r1.A0K
            if (r0 != 0) goto L_0x07f1
            X.3Wi r2 = r1.A01
            r1 = 2131888207(0x7f12084f, float:1.9411043E38)
            r0 = 1
            r2.A0H(r1, r0)
            return
        L_0x01a5:
            java.lang.Object r0 = r1.A00
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r0
            r0.A1K()
            X.3Wi r2 = r0.A1W()
            r1 = 2131888207(0x7f12084f, float:1.9411043E38)
            r0 = 1
            r2.A0H(r1, r0)
            return
        L_0x01b8:
            java.lang.Object r2 = r1.A00
            X.10M r2 = (X.AnonymousClass10M) r2
            X.3Ex r1 = r2.A02
            X.1fJ r0 = r2.A03
            X.3ZH r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x01d7
            X.08M r1 = r2.A00
            java.lang.String r0 = r0.A0J()
            r1.A0G(r0)
            X.4FS r1 = r2.A05
            r0 = 27
            A00(r1, r2, r0)
            return
        L_0x01d7:
            X.4UC r1 = r2.A04
            X.2wD r0 = X.C59022wD.A00
            r1.A0G(r0)
            return
        L_0x01df:
            java.lang.Object r2 = r1.A00
            X.10M r2 = (X.AnonymousClass10M) r2
            X.3Ex r1 = r2.A02
            X.1fJ r0 = r2.A03
            X.3ZH r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x01f9
            X.08M r1 = r2.A01
            boolean r0 = r0.A13
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x01f5:
            r1.A0G(r0)
            return
        L_0x01f9:
            X.4UC r1 = r2.A04
            X.2wD r0 = X.C59022wD.A00
            goto L_0x01f5
        L_0x01fe:
            java.lang.Object r3 = r1.A00
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r3 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r3
            X.5hX r2 = r3.A00
            X.1fJ r1 = r3.A0B
            r0 = 5
            android.content.Intent r0 = X.C627736r.A0V(r3, r1, r0)
            r2.A0A(r3, r0)
            return
        L_0x020f:
            java.lang.Object r2 = r1.A00
            X.3Ci r2 = (X.AnonymousClass3Ci) r2
            r1 = 0
            X.1im r0 = r2.A02
            r0.A07(r2)
            r2.A00 = r1
            return
        L_0x021c:
            java.lang.Object r1 = r1.A00
            X.3Ci r1 = (X.AnonymousClass3Ci) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x07f1
            X.1im r0 = r1.A02
            r0.A06(r1)
            r0 = 1
            r1.A00 = r0
            return
        L_0x022d:
            java.lang.Object r2 = r1.A00
            X.1r5 r2 = (X.C32531r5) r2
            X.08M r1 = r2.A00
            r0 = 1
            X.C06270Wx.A04(r1, r0)
            r2.A0K()
            r0 = 2
            X.C06270Wx.A04(r1, r0)
            return
        L_0x023f:
            java.lang.Object r4 = r1.A00
            X.2vq r4 = (X.C58802vq) r4
            X.2qA r7 = r4.A02
            X.7IJ r1 = r7.A00()
            if (r1 == 0) goto L_0x0257
            X.08M r3 = r4.A00
            r0 = 2
            X.7IK r2 = new X.7IK
            r2.<init>(r1, r0)
        L_0x0253:
            r3.A0G(r2)
            return
        L_0x0257:
            X.1ip r0 = r4.A01
            boolean r0 = r0.A0F()
            X.08M r3 = r4.A00
            if (r0 != 0) goto L_0x0269
            r1 = 3
            r0 = 0
            X.7IK r2 = new X.7IK
            r2.<init>(r0, r1)
            goto L_0x0253
        L_0x0269:
            r2 = 1
            r1 = 0
            X.7IK r0 = new X.7IK
            r0.<init>(r1, r2)
            r3.A0G(r0)
            X.2bp r5 = r4.A03     // Catch:{ IOException -> 0x0353 }
            java.util.HashMap r4 = X.AnonymousClass001.A0t()     // Catch:{ IOException -> 0x0353 }
            java.lang.String r1 = "category"
            java.lang.String r0 = "wallpaper"
            r4.put(r1, r0)     // Catch:{ IOException -> 0x0353 }
            X.1VX r2 = r5.A01     // Catch:{ IOException -> 0x0353 }
            X.2hI r1 = r5.A03     // Catch:{ IOException -> 0x0353 }
            java.lang.String r0 = "wa/static/downloadable"
            android.net.Uri$Builder r0 = X.AnonymousClass351.A00(r2, r1, r0)     // Catch:{ IOException -> 0x0353 }
            java.lang.String r2 = X.AnonymousClass351.A01(r0, r4)     // Catch:{ IOException -> 0x0353 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0353 }
            java.lang.String r0 = "WallpaperDownloader/download/Creating connection to download data. Endpoint = "
            X.C18260x0.A0q(r0, r2, r1)     // Catch:{ IOException -> 0x0353 }
            X.33K r0 = r5.A02     // Catch:{ IOException -> 0x0353 }
            X.4GL r4 = r5.A00(r0, r2)     // Catch:{ IOException -> 0x0353 }
            if (r4 != 0) goto L_0x02ad
            r2 = 4
            r1 = 0
            X.7IK r0 = new X.7IK     // Catch:{ all -> 0x0347 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0347 }
            r3.A0G(r0)     // Catch:{ all -> 0x0347 }
            goto L_0x035d
        L_0x02ad:
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Storing files..."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0347 }
            r0 = 0
            X.2s4 r2 = r7.A00     // Catch:{ IOException -> 0x0333 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0333 }
            r0 = 17
            java.io.InputStream r0 = X.C18310x6.A0b(r2, r4, r1, r0)     // Catch:{ IOException -> 0x0333 }
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x0333 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0333 }
            X.2oU r2 = r7.A01     // Catch:{ all -> 0x0329 }
            android.content.Context r0 = r2.A00     // Catch:{ all -> 0x0329 }
            java.io.File r1 = r0.getCacheDir()     // Catch:{ all -> 0x0329 }
            java.lang.String r0 = "downloadable/wallpaper_tmp"
            java.io.File r6 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x0329 }
            boolean r0 = X.C627536m.A0Q(r6)     // Catch:{ all -> 0x0329 }
            if (r0 != 0) goto L_0x02de
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Could not prepare temporary cache subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0329 }
            goto L_0x0325
        L_0x02de:
            X.1bh r0 = new X.1bh     // Catch:{ all -> 0x0329 }
            r0.<init>(r6)     // Catch:{ all -> 0x0329 }
            boolean r0 = r0.A02(r5)     // Catch:{ all -> 0x0329 }
            if (r0 == 0) goto L_0x0325
            android.content.Context r0 = r2.A00     // Catch:{ all -> 0x0329 }
            java.io.File r1 = r0.getFilesDir()     // Catch:{ all -> 0x0329 }
            java.lang.String r0 = "downloadable/wallpaper"
            java.io.File r2 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ all -> 0x0329 }
            boolean r0 = X.C627536m.A0Q(r2)     // Catch:{ all -> 0x0329 }
            if (r0 != 0) goto L_0x0301
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Could not prepare wallpaper subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0329 }
            goto L_0x0325
        L_0x0301:
            X.306 r0 = r7.A02     // Catch:{ IOException -> 0x0317 }
            X.C627536m.A0D(r0, r6, r2)     // Catch:{ IOException -> 0x0317 }
            r5.close()     // Catch:{ IOException -> 0x0333 }
            X.7IJ r1 = r7.A00()     // Catch:{ all -> 0x0347 }
            X.C626936e.A06(r1)     // Catch:{ all -> 0x0347 }
            r0 = 2
            X.7IK r2 = new X.7IK     // Catch:{ all -> 0x0347 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0347 }
            goto L_0x0340
        L_0x0317:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0329 }
            java.lang.String r0 = "DownloadableWallpaperStorage/store : rename failed, from "
            X.C18270x1.A1H(r1, r0, r6)     // Catch:{ all -> 0x0329 }
            java.lang.String r0 = " to "
            X.C18260x0.A1O(r1, r0, r2)     // Catch:{ all -> 0x0329 }
        L_0x0325:
            r5.close()     // Catch:{ IOException -> 0x0333 }
            goto L_0x0339
        L_0x0329:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x032e }
            goto L_0x0332
        L_0x032e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0333 }
        L_0x0332:
            throw r1     // Catch:{ IOException -> 0x0333 }
        L_0x0333:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Failed!"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0347 }
        L_0x0339:
            r1 = 5
            r0 = 0
            X.7IK r2 = new X.7IK     // Catch:{ all -> 0x0347 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0347 }
        L_0x0340:
            r3.A0G(r2)     // Catch:{ all -> 0x0347 }
            r4.close()     // Catch:{ IOException -> 0x0353 }
            goto L_0x035d
        L_0x0347:
            r1 = move-exception
            if (r4 == 0) goto L_0x0352
            r4.close()     // Catch:{ all -> 0x034e }
            goto L_0x0352
        L_0x034e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0353 }
        L_0x0352:
            throw r1     // Catch:{ IOException -> 0x0353 }
        L_0x0353:
            r2 = 4
            r1 = 0
            X.7IK r0 = new X.7IK     // Catch:{ all -> 0x0361 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0361 }
            r3.A0G(r0)     // Catch:{ all -> 0x0361 }
        L_0x035d:
            android.net.TrafficStats.clearThreadStatsTag()
            return
        L_0x0361:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0366:
            java.lang.Object r2 = r1.A00
            X.35T r2 = (X.AnonymousClass35T) r2
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x07f1
            X.1in r1 = r2.A06
            X.2sG r0 = r2.A05
            r1.A06(r0)
            X.1hw r1 = r2.A0G
            X.4FI r0 = r2.A0F
            r1.A06(r0)
            X.1iV r1 = r2.A0I
            X.2qm r0 = r2.A0H
            r1.A06(r0)
            r0 = 1
            r2.A03 = r0
            return
        L_0x0387:
            java.lang.Object r7 = r1.A00
            com.whatsapp.settings.SettingsUserProxyViewModel r7 = (com.whatsapp.settings.SettingsUserProxyViewModel) r7
            boolean r0 = r7.A0H()
            if (r0 == 0) goto L_0x07f1
            java.lang.String r0 = r7.A02
            boolean r0 = X.C106585Zo.A01(r0)
            if (r0 == 0) goto L_0x07f1
            X.3Ci r1 = r7.A0H
            r0 = 1
            X.3XB r1 = r1.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05(r0)
            java.lang.String r1 = r7.A02
            if (r1 != 0) goto L_0x03f0
            X.2zS r0 = new X.2zS
            r0.<init>()
        L_0x03ae:
            X.2Yq r6 = r7.A0G
            java.lang.String r5 = r0.A03
            int r2 = r0.A01
            r3 = 6
            X.4JV r4 = new X.4JV
            r4.<init>(r0, r3, r7)
            java.lang.String r7 = "mmg.whatsapp.net"
            if (r5 == 0) goto L_0x07f1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "https://"
            r1.append(r0)
            r1.append(r5)
            r0 = 58
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "/mms/HEALTHCHECK"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.net.URL r2 = X.C18330xA.A0B(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaHealthChecker/check Sending health check request to "
            r1.append(r0)
            r1.append(r2)
            r0 = 46
            X.C18270x1.A1E(r1, r0)
            r5 = 0
            goto L_0x03f7
        L_0x03f0:
            X.2rm r0 = r7.A0E
            X.2zS r0 = X.C385528d.A00(r0, r1)
            goto L_0x03ae
        L_0x03f7:
            android.net.TrafficStats.setThreadStatsTag(r3)     // Catch:{ all -> 0x0450 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ all -> 0x0450 }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ all -> 0x0450 }
            X.C162457s7.A0D(r2)     // Catch:{ all -> 0x0450 }
            X.2pq r1 = r6.A01     // Catch:{ all -> 0x0450 }
            X.1r8 r0 = r1.A02()     // Catch:{ all -> 0x0450 }
            r2.setSSLSocketFactory(r0)     // Catch:{ all -> 0x0450 }
            r1.A02()     // Catch:{ all -> 0x0450 }
            java.lang.String r0 = "POST"
            r2.setRequestMethod(r0)     // Catch:{ all -> 0x0450 }
            X.C18270x1.A1J(r2)     // Catch:{ all -> 0x0450 }
            r3 = 1
            r2.setDoOutput(r3)     // Catch:{ all -> 0x0450 }
            java.lang.String r0 = "Host"
            r2.setRequestProperty(r0, r7)     // Catch:{ all -> 0x0450 }
            X.C72353da.A00(r7, r2)     // Catch:{ all -> 0x0450 }
            r2.connect()     // Catch:{ all -> 0x0450 }
            int r1 = r2.getResponseCode()     // Catch:{ all -> 0x0450 }
            java.util.Map r2 = r2.getHeaderFields()     // Catch:{ all -> 0x0450 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0441
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0450 }
            r6.A00(r0, r3)     // Catch:{ all -> 0x0450 }
            java.lang.String r0 = "200"
            r4.BaA(r0, r2)     // Catch:{ all -> 0x0450 }
            return
        L_0x0441:
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r1)     // Catch:{ all -> 0x0450 }
            r6.A00(r0, r5)     // Catch:{ all -> 0x0450 }
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0450 }
            r4.BSF(r0)     // Catch:{ all -> 0x0450 }
            return
        L_0x0450:
            r3 = move-exception
            r2 = 0
            r6.A00(r2, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaHealthChecker/check exception occurred: "
            X.C18260x0.A1Q(r1, r0, r3)
            r4.BSF(r2)
            return
        L_0x0462:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.SettingsUserProxyActivity r0 = (com.whatsapp.settings.SettingsUserProxyActivity) r0
            com.whatsapp.settings.SettingsUserProxyViewModel r8 = r0.A09
            r0 = 1
            r8.A03 = r0
            X.3Ci r2 = r8.A0H
            X.3Wi r1 = r2.A01
            r0 = 25
            X.C69263Wi.A01(r1, r2, r0)
            r1 = 0
            r8.A02 = r1
            X.2rm r7 = r8.A0E
            r7.A03(r1)
            X.08M r0 = r8.A05
            r0.A0G(r1)
            X.2yZ r0 = r8.A0F
            X.2rm r6 = r0.A00
            r6.A03(r1)
            r5 = 0
            r6.A02(r5)
            r6.A01(r5)
            r2 = 587(0x24b, float:8.23E-43)
            X.2y5 r4 = r6.A01
            java.lang.String r3 = "user_proxy_setting_pref"
            android.content.SharedPreferences$Editor r1 = X.C60152y5.A00(r4, r3)
            java.lang.String r0 = "proxy_media_port"
            X.C18270x1.A0h(r1, r0, r2)
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C60152y5.A00(r4, r3)
            java.lang.String r0 = "proxy_use_tls"
            X.C18270x1.A0l(r1, r0, r2)
            r6.A04(r5)
            X.2WY r0 = r8.A0D
            r0.A00(r5)
            r8.A0D()
            r8.A01 = r5
            r8.A0G(r5, r5)
            int r0 = r8.A00
            r7.A02(r0)
            int r0 = r8.A01
            r7.A01(r0)
            r8.A04 = r5
            return
        L_0x04c8:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r0 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r0
            X.3Gp r3 = r0.A02
            if (r3 == 0) goto L_0x04e2
            boolean r0 = r0.A05
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r0 = 0
            X.2jq r1 = new X.2jq
            r1.<init>(r2, r0)
            X.21t r0 = X.C373121t.PRIVACY_SETTING_RELAY_ALL_CALLS
            r3.A0I(r1, r0)
            return
        L_0x04e2:
            java.lang.String r0 = "syncManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04ea:
            java.lang.Object r2 = r1.A00
            com.whatsapp.settings.SettingsPrivacyAdvancedActivity r2 = (com.whatsapp.settings.SettingsPrivacyAdvancedActivity) r2
            X.2nM r1 = r2.A03
            if (r1 == 0) goto L_0x04f8
            java.lang.String r0 = "call-relaying"
            r1.A01(r2, r0)
            return
        L_0x04f8:
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04ff:
            java.lang.Object r0 = r1.A00
            X.5YX r0 = (X.AnonymousClass5YX) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.settings.SettingsPrivacy r0 = (com.whatsapp.settings.SettingsPrivacy) r0
            r0.A7A()
            return
        L_0x050b:
            java.lang.Object r0 = r1.A00
            X.681 r0 = (X.AnonymousClass681) r0
            java.lang.Object r2 = r0.A00
            com.whatsapp.settings.SettingsPrivacy r2 = (com.whatsapp.settings.SettingsPrivacy) r2
            r0 = 1
            r2.A12 = r0
            java.util.Set r1 = r2.A11
            r1.clear()
            X.2sq r0 = r2.A0S
            java.util.Set r0 = r0.A06()
            r1.addAll(r0)
            r0 = 0
            r2.A12 = r0
            X.3Wi r1 = r2.A05
            r0 = 13
            goto L_0x0545
        L_0x052c:
            java.lang.Object r2 = r1.A00
            com.whatsapp.settings.SettingsPrivacy r2 = (com.whatsapp.settings.SettingsPrivacy) r2
            r0 = 1
            r2.A12 = r0
            java.util.Set r1 = r2.A11
            X.2sq r0 = r2.A0S
            java.util.Set r0 = r0.A06()
            r1.addAll(r0)
            r0 = 0
            r2.A12 = r0
            X.3Wi r1 = r2.A05
            r0 = 9
        L_0x0545:
            X.C69263Wi.A01(r1, r2, r0)
            return
        L_0x0549:
            java.lang.Object r11 = r1.A00
            com.whatsapp.settings.SettingsPrivacy r11 = (com.whatsapp.settings.SettingsPrivacy) r11
            X.2dC r6 = r11.A0X
            r10 = 0
            X.33M r2 = new X.33M
            r2.<init>((boolean) r10)
            java.lang.String r0 = "msgstore/unsendreadreceipts"
            r2.A0A(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            X.2sm r7 = r6.A02
            java.lang.String r3 = X.C57802uE.A00
            java.lang.String r1 = "UNSENT_MESSAGE_READ_RECEIPTS_SQL"
            X.3dV r0 = r6.A07     // Catch:{ IllegalStateException -> 0x05c3, SQLiteDatabaseCorruptException -> 0x05cb, SQLiteFullException -> 0x0653 }
            X.4GK r13 = r0.get()     // Catch:{ IllegalStateException -> 0x05c3, SQLiteDatabaseCorruptException -> 0x05cb, SQLiteFullException -> 0x0653 }
            r0 = r13
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x05b9 }
            X.2sg r0 = r0.A03     // Catch:{ all -> 0x05b9 }
            android.database.Cursor r12 = X.C56862sg.A01(r0, r3, r1)     // Catch:{ all -> 0x05b9 }
        L_0x0574:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x05ad }
            if (r0 == 0) goto L_0x05a6
            X.4uZ r1 = r7.A0C(r12)     // Catch:{ all -> 0x05ad }
            if (r1 != 0) goto L_0x0587
            java.lang.String r0 = "msgstore/unsendreadreceipts/jid is null!"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x05ad }
            goto L_0x0574
        L_0x0587:
            X.2r4 r0 = r6.A09     // Catch:{ all -> 0x05ad }
            boolean r0 = r0.A02(r1)     // Catch:{ all -> 0x05ad }
            if (r0 == 0) goto L_0x0574
            X.2qz r0 = r6.A0A     // Catch:{ all -> 0x05ad }
            X.34x r5 = r0.A04(r12, r1)     // Catch:{ all -> 0x05ad }
            if (r5 == 0) goto L_0x0574
            long r0 = r5.A0K     // Catch:{ all -> 0x05ad }
            r8 = 1415214000000(0x1498153e780, double:6.992086189136E-312)
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x0574
            r4.add(r5)     // Catch:{ all -> 0x05ad }
            goto L_0x0574
        L_0x05a6:
            r12.close()     // Catch:{ all -> 0x05b9 }
            r13.close()     // Catch:{ IllegalStateException -> 0x05c3, SQLiteDatabaseCorruptException -> 0x05cb, SQLiteFullException -> 0x0653 }
            goto L_0x05d4
        L_0x05ad:
            r1 = move-exception
            if (r12 == 0) goto L_0x05b8
            r12.close()     // Catch:{ all -> 0x05b4 }
            goto L_0x05b8
        L_0x05b4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x05b9 }
        L_0x05b8:
            throw r1     // Catch:{ all -> 0x05b9 }
        L_0x05b9:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x05be }
            goto L_0x05c2
        L_0x05be:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x05c3, SQLiteDatabaseCorruptException -> 0x05cb, SQLiteFullException -> 0x0653 }
        L_0x05c2:
            throw r1     // Catch:{ IllegalStateException -> 0x05c3, SQLiteDatabaseCorruptException -> 0x05cb, SQLiteFullException -> 0x0653 }
        L_0x05c3:
            r1 = move-exception
            java.lang.String r0 = "msgstore/unsendreadreceipts/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x05d4
        L_0x05cb:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r6.A06
            r0.A04()
        L_0x05d4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/unsendreadreceipts "
            X.C18260x0.A19(r0, r1, r4)
            java.lang.String r5 = " | time spent:"
            X.AnonymousClass33M.A05(r2, r5, r1)
            X.33M r3 = new X.33M
            r3.<init>((boolean) r10)
            java.lang.String r0 = "msgstore/unsentstatusreadreceipts"
            r3.A0A(r0)
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.lang.String[] r9 = X.AnonymousClass0x9.A1Y()
            X.6kE r12 = X.C135166kE.A00
            X.C56922sm.A02(r7, r12, r9, r10)
            java.lang.String r8 = X.C39162Ax.A00
            java.lang.String r1 = "UNSENT_STATUS_READ_RECEIPTS_SQL"
            X.3dV r0 = r6.A07     // Catch:{ IllegalStateException -> 0x065a, SQLiteDatabaseCorruptException -> 0x0662, SQLiteFullException -> 0x0653 }
            X.4GK r7 = r0.get()     // Catch:{ IllegalStateException -> 0x065a, SQLiteDatabaseCorruptException -> 0x0662, SQLiteFullException -> 0x0653 }
            android.database.Cursor r9 = X.C56862sg.A03(r7, r8, r1, r9)     // Catch:{ all -> 0x0649 }
        L_0x0609:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x063d }
            if (r0 == 0) goto L_0x0636
            X.2qz r0 = r6.A0A     // Catch:{ all -> 0x063d }
            X.34x r8 = r0.A04(r9, r12)     // Catch:{ all -> 0x063d }
            if (r8 == 0) goto L_0x0609
            long r0 = r8.A0K     // Catch:{ all -> 0x063d }
            r14 = 1415214000000(0x1498153e780, double:6.992086189136E-312)
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x0609
            boolean r0 = r8 instanceof X.C30341mI     // Catch:{ all -> 0x063d }
            if (r0 != 0) goto L_0x0609
            X.2r4 r1 = r6.A09     // Catch:{ all -> 0x063d }
            X.4uZ r0 = r8.A0n()     // Catch:{ all -> 0x063d }
            boolean r0 = r1.A02(r0)     // Catch:{ all -> 0x063d }
            if (r0 == 0) goto L_0x0609
            r2.add(r8)     // Catch:{ all -> 0x063d }
            goto L_0x0609
        L_0x0636:
            r9.close()     // Catch:{ all -> 0x0649 }
            r7.close()     // Catch:{ IllegalStateException -> 0x065a, SQLiteDatabaseCorruptException -> 0x0662, SQLiteFullException -> 0x0653 }
            goto L_0x066b
        L_0x063d:
            r1 = move-exception
            if (r9 == 0) goto L_0x0648
            r9.close()     // Catch:{ all -> 0x0644 }
            goto L_0x0648
        L_0x0644:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0649 }
        L_0x0648:
            throw r1     // Catch:{ all -> 0x0649 }
        L_0x0649:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x064e }
            goto L_0x0652
        L_0x064e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalStateException -> 0x065a, SQLiteDatabaseCorruptException -> 0x0662, SQLiteFullException -> 0x0653 }
        L_0x0652:
            throw r1     // Catch:{ IllegalStateException -> 0x065a, SQLiteDatabaseCorruptException -> 0x0662, SQLiteFullException -> 0x0653 }
        L_0x0653:
            r1 = move-exception
            X.1hj r0 = r6.A05
            r0.A08(r10)
            throw r1
        L_0x065a:
            r1 = move-exception
            java.lang.String r0 = "msgstore/unsentstatusreadreceipts/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x066b
        L_0x0662:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r6.A06
            r0.A04()
        L_0x066b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/unsentstatusreadreceipts "
            X.C18260x0.A19(r0, r1, r2)
            X.AnonymousClass33M.A05(r3, r5, r1)
            r4.addAll(r2)
            X.33Y r0 = r11.A0e
            r0.A0A(r4)
            X.34P r0 = r11.A0d
            X.1VX r2 = r0.A00
            r1 = 361(0x169, float:5.06E-43)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x07f1
            X.2KY r9 = r11.A0V
            java.util.HashSet r14 = X.AnonymousClass002.A0K()
            X.3dV r0 = r9.A01
            X.4GK r16 = r0.get()
            r0 = r16
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07d6 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x07d6 }
            java.lang.String r2 = "SELECT * FROM played_self_receipt ORDER BY message_row_id DESC  LIMIT 4096"
            java.lang.String r1 = "GET_PLAYED_SELF_RECEIPT_SQL"
            r0 = 0
            android.database.Cursor r8 = r3.A0E(r2, r1, r0)     // Catch:{ all -> 0x07d6 }
            java.lang.String r1 = "message_row_id"
            int r7 = r8.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x07ca }
            java.lang.String r1 = "to_jid_row_id"
            int r6 = r8.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x07ca }
            java.lang.String r1 = "participant_jid_row_id"
            int r5 = r8.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x07ca }
            java.lang.String r1 = "message_id"
            int r4 = r8.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x07ca }
        L_0x06c5:
            boolean r1 = r8.moveToNext()     // Catch:{ all -> 0x07ca }
            if (r1 == 0) goto L_0x0705
            X.34p r13 = r9.A00     // Catch:{ all -> 0x07ca }
            java.lang.Class<X.4uZ> r12 = X.C95814uZ.class
            long r1 = r8.getLong(r6)     // Catch:{ all -> 0x07ca }
            com.whatsapp.jid.Jid r3 = r13.A0B(r12, r1)     // Catch:{ all -> 0x07ca }
            X.4uZ r3 = (X.C95814uZ) r3     // Catch:{ all -> 0x07ca }
            boolean r1 = r8.isNull(r5)     // Catch:{ all -> 0x07ca }
            if (r1 != 0) goto L_0x06e9
            long r0 = r8.getLong(r5)     // Catch:{ all -> 0x07ca }
            com.whatsapp.jid.Jid r0 = r13.A0B(r12, r0)     // Catch:{ all -> 0x07ca }
            X.4uZ r0 = (X.C95814uZ) r0     // Catch:{ all -> 0x07ca }
        L_0x06e9:
            long r1 = r8.getLong(r7)     // Catch:{ all -> 0x07ca }
            java.lang.String r15 = r8.getString(r4)     // Catch:{ all -> 0x07ca }
            r13 = 1
            java.lang.Long[] r12 = new java.lang.Long[r13]     // Catch:{ all -> 0x07ca }
            X.AnonymousClass000.A1Q(r12, r10, r1)     // Catch:{ all -> 0x07ca }
            java.lang.String[] r2 = new java.lang.String[r13]     // Catch:{ all -> 0x07ca }
            r2[r10] = r15     // Catch:{ all -> 0x07ca }
            X.2b1 r1 = new X.2b1     // Catch:{ all -> 0x07ca }
            r1.<init>(r3, r0, r12, r2)     // Catch:{ all -> 0x07ca }
            r14.add(r1)     // Catch:{ all -> 0x07ca }
            r0 = 0
            goto L_0x06c5
        L_0x0705:
            r8.close()     // Catch:{ all -> 0x07d6 }
            r16.close()
            java.util.Set r5 = X.AnonymousClass34P.A01(r14)
            X.33S r4 = r11.A0f
            java.util.Set r0 = X.AnonymousClass34P.A01(r5)
            java.util.Iterator r3 = r0.iterator()
        L_0x0719:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0730
            java.lang.Object r2 = r3.next()
            X.2b1 r2 = (X.C46062b1) r2
            X.2gy r1 = r4.A01
            com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2 r0 = new com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2
            r0.<init>(r2, r10)
            r1.A02(r0)
            goto L_0x0719
        L_0x0730:
            X.2KY r7 = r11.A0V
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x07f1
            java.util.HashSet r6 = X.AnonymousClass002.A0K()
            java.util.Iterator r3 = r5.iterator()
        L_0x0740:
            boolean r0 = r3.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x075a
            java.lang.Object r0 = r3.next()
            X.2b1 r0 = (X.C46062b1) r0
            java.lang.Long[] r2 = r0.A02
            int r1 = r2.length
        L_0x0750:
            if (r5 >= r1) goto L_0x0740
            r0 = r2[r5]
            r6.add(r0)
            int r5 = r5 + 1
            goto L_0x0750
        L_0x075a:
            int r0 = r6.size()
            java.lang.String[] r4 = new java.lang.String[r0]
            java.util.Iterator r3 = r6.iterator()
        L_0x0764:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0775
            long r1 = X.C18270x1.A02(r3)
            int r0 = r5 + 1
            X.C18280x3.A1R(r4, r5, r1)
            r5 = r0
            goto L_0x0764
        L_0x0775:
            X.3dV r0 = r7.A01
            X.4Fq r7 = r0.A04()
            X.3Yo r6 = r7.Axl()     // Catch:{ all -> 0x07c5 }
            r0 = 975(0x3cf, float:1.366E-42)
            X.3ct r5 = new X.3ct     // Catch:{ all -> 0x07bb }
            r5.<init>(r4, r0)     // Catch:{ all -> 0x07bb }
        L_0x0786:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x07bb }
            if (r0 == 0) goto L_0x07b1
            java.lang.String[] r4 = X.C71923ct.A01(r5)     // Catch:{ all -> 0x07bb }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x07bb }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x07bb }
            java.lang.String r2 = "played_self_receipt"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x07bb }
            java.lang.String r0 = "message_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x07bb }
            int r0 = r4.length     // Catch:{ all -> 0x07bb }
            java.lang.String r0 = X.C57212tH.A00(r0)     // Catch:{ all -> 0x07bb }
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x07bb }
            java.lang.String r0 = "clearPlayedSelfReceiptTable"
            r3.A07(r2, r1, r0, r4)     // Catch:{ all -> 0x07bb }
            goto L_0x0786
        L_0x07b1:
            r6.A00()     // Catch:{ all -> 0x07bb }
            r6.close()     // Catch:{ all -> 0x07c5 }
            r7.close()
            return
        L_0x07bb:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x07c0 }
            goto L_0x07c4
        L_0x07c0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x07c5 }
        L_0x07c4:
            throw r1     // Catch:{ all -> 0x07c5 }
        L_0x07c5:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x07db }
            throw r1
        L_0x07ca:
            r1 = move-exception
            if (r8 == 0) goto L_0x07d5
            r8.close()     // Catch:{ all -> 0x07d1 }
            goto L_0x07d5
        L_0x07d1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x07d6 }
        L_0x07d5:
            throw r1     // Catch:{ all -> 0x07d6 }
        L_0x07d6:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x07db }
            throw r1
        L_0x07db:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x07e0:
            r1 = move-exception
            java.lang.String r0 = "StatusPrivacyActivity/fetchFbUserFullName Unknown error"
        L_0x07e3:
            X.C106245Ye.A02(r0, r1)
        L_0x07e6:
            X.3Wi r2 = r6.A05
            r1 = 2
            X.3cK r0 = new X.3cK
            r0.<init>(r6, r1, r5)
            r2.BkS(r0)
        L_0x07f1:
            return
        L_0x07f2:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.SettingsPrivacy r0 = (com.whatsapp.settings.SettingsPrivacy) r0
            r0.A79()
            return
        L_0x07fa:
            java.lang.Object r5 = r1.A00
            com.whatsapp.settings.SettingsPrivacy r5 = (com.whatsapp.settings.SettingsPrivacy) r5
            X.33e r0 = r5.A0W
            int r1 = r0.A02()
            if (r1 == 0) goto L_0x0855
            r8 = 0
            r7 = 1
            if (r1 == r7) goto L_0x0859
            r0 = 2
            if (r1 != r0) goto L_0x0873
            X.33e r0 = r5.A0W
            java.util.List r0 = r0.A08()
            int r6 = r0.size()
            if (r6 == 0) goto L_0x0855
            X.33j r4 = r5.A00
            r3 = 2131755327(0x7f10013f, float:1.914153E38)
        L_0x081e:
            long r1 = (long) r6
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.AnonymousClass000.A1P(r0, r6, r8)
            java.lang.String r3 = r4.A0L(r0, r3, r1)
        L_0x0828:
            X.2rK r1 = r5.A0s
            X.21S r0 = X.AnonymousClass21S.A0S
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0848
            X.5Se r0 = r5.A0t
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0848
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)
            r0 = 2131893449(0x7f121cc9, float:1.9421675E38)
            X.AnonymousClass0x2.A0s(r5, r1, r0)
            java.lang.String r3 = r1.toString()
        L_0x0848:
            X.3Wi r2 = r5.A05
            r1 = 9
            X.3c0 r0 = new X.3c0
            r0.<init>(r1, r3, r5)
            r2.A0S(r0)
            return
        L_0x0855:
            r0 = 2131892737(0x7f121a01, float:1.942023E38)
            goto L_0x0868
        L_0x0859:
            X.33e r0 = r5.A0W
            java.util.List r0 = r0.A07()
            int r6 = r0.size()
            if (r6 != 0) goto L_0x086d
            r0 = 2131891190(0x7f1213f6, float:1.9417093E38)
        L_0x0868:
            java.lang.String r3 = r5.getString(r0)
            goto L_0x0828
        L_0x086d:
            X.33j r4 = r5.A00
            r3 = 2131755328(0x7f100140, float:1.9141532E38)
            goto L_0x081e
        L_0x0873:
            java.lang.String r0 = "unknown status distribution mode"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x087b:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            r0 = 1
            X.C621433s.A00(r1, r0)
            return
        L_0x0888:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            r0 = 1
            X.C621433s.A01(r1, r0)
            return
        L_0x0895:
            java.lang.Object r1 = r1.A00
            X.4ea r1 = (X.C89654ea) r1
            r4 = 0
            X.C162457s7.A0J(r1, r4)
            X.2eY r0 = new X.2eY
            r0.<init>(r1)
            r3 = 2131891671(0x7f1215d7, float:1.9418069E38)
            X.4ea r2 = r0.A00
            r1 = 2131891669(0x7f1215d5, float:1.9418065E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r2.Box(r0, r1, r3)
            return
        L_0x08b0:
            java.lang.Object r1 = r1.A00
            X.4ea r1 = (X.C89654ea) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            X.2eY r2 = new X.2eY
            r2.<init>(r1)
            r1 = 0
            r0 = 2131891672(0x7f1215d8, float:1.941807E38)
            goto L_0x08e4
        L_0x08c2:
            java.lang.Object r1 = r1.A00
            X.4ea r1 = (X.C89654ea) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            X.2eY r0 = new X.2eY
            r0.<init>(r1)
            r0.A00()
            return
        L_0x08d3:
            java.lang.Object r1 = r1.A00
            X.4ea r1 = (X.C89654ea) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            X.2eY r2 = new X.2eY
            r2.<init>(r1)
            r1 = 0
            r0 = 2131891668(0x7f1215d4, float:1.9418063E38)
        L_0x08e4:
            r2.A01(r1, r0)
            return
        L_0x08e8:
            java.lang.Object r1 = r1.A00
            com.whatsapp.settings.SettingsNetworkUsage r1 = (com.whatsapp.settings.SettingsNetworkUsage) r1
            r0 = 0
            r1.A75(r0)
            return
        L_0x08f1:
            java.lang.Object r0 = r1.A00
            com.whatsapp.settings.SettingsDataUsageViewModel r0 = (com.whatsapp.settings.SettingsDataUsageViewModel) r0
            com.whatsapp.settings.SettingsDataUsageViewModel.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71293bs.run():void");
    }

    public C71293bs(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
