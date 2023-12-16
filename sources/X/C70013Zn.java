package X;

import android.os.Handler;

/* renamed from: X.3Zn  reason: invalid class name and case insensitive filesystem */
public class C70013Zn implements Runnable {
    public Object A00;
    public final int A01;

    public C70013Zn(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Handler handler, Object obj, int i) {
        handler.post(new C70013Zn(obj, i));
    }

    public static void A01(AnonymousClass4FS r1, Object obj, int i) {
        r1.BkM(new C70013Zn(obj, i));
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x026d, code lost:
        if (java.lang.Boolean.valueOf(r1) == null) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02ca, code lost:
        if (r0 <= 0) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f4, code lost:
        if (java.lang.Boolean.valueOf(r4) == null) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03ab, code lost:
        if (r0 <= 0) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0470, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        X.AnonymousClass2A8.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0474, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0477, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x047b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x04ff, code lost:
        r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0502, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0544, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0546;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05ca, code lost:
        if (X.C18300x5.A0B(r9).getInt("account_sync_blocklist_num_retries", 0) > 0) goto L_0x05cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x0c9a, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x0c9d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e0, code lost:
        com.whatsapp.util.Log.d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f8, code lost:
        r0.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01fb, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r33 = this;
            r1 = r33
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x03d0;
                case 1: goto L_0x0c93;
                case 2: goto L_0x0c8b;
                case 3: goto L_0x0c04;
                case 4: goto L_0x0bcd;
                case 5: goto L_0x0223;
                case 6: goto L_0x01fc;
                case 7: goto L_0x0bc5;
                case 8: goto L_0x01e4;
                case 9: goto L_0x0bad;
                case 10: goto L_0x01b2;
                case 11: goto L_0x01a0;
                case 12: goto L_0x0192;
                case 13: goto L_0x017c;
                case 14: goto L_0x0ba5;
                case 15: goto L_0x0b9b;
                case 16: goto L_0x0b93;
                case 17: goto L_0x016a;
                case 18: goto L_0x001d;
                case 19: goto L_0x0aa7;
                case 20: goto L_0x0a9f;
                case 21: goto L_0x0017;
                case 22: goto L_0x0a7c;
                case 23: goto L_0x0a58;
                case 24: goto L_0x0a50;
                case 25: goto L_0x0a48;
                case 26: goto L_0x0152;
                case 27: goto L_0x06fc;
                case 28: goto L_0x06ef;
                case 29: goto L_0x0606;
                case 30: goto L_0x05f8;
                case 31: goto L_0x05f0;
                case 32: goto L_0x05df;
                case 33: goto L_0x00e9;
                case 34: goto L_0x051b;
                case 35: goto L_0x050b;
                case 36: goto L_0x0072;
                case 37: goto L_0x004f;
                case 38: goto L_0x0503;
                case 39: goto L_0x04fa;
                case 40: goto L_0x04f4;
                case 41: goto L_0x04ec;
                case 42: goto L_0x04c4;
                case 43: goto L_0x04b3;
                case 44: goto L_0x04ab;
                case 45: goto L_0x03e3;
                case 46: goto L_0x04ab;
                case 47: goto L_0x0007;
                case 48: goto L_0x0007;
                case 49: goto L_0x002e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r1.A00
            X.3Qh r1 = (X.C67693Qh) r1
            X.1i9 r0 = r1.A00
            r0.A08()
            X.33p r1 = r1.A02
            r0 = 0
            r1.A1z(r0)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r0 = r1.A00
            X.0R6 r0 = (X.AnonymousClass0R6) r0
            goto L_0x01f8
        L_0x001d:
            java.lang.Object r5 = r1.A00
            X.3CN r5 = (X.AnonymousClass3CN) r5
            java.lang.String r3 = "MemoryLeakReporter. Running leak detection"
            com.whatsapp.util.Log.d((java.lang.String) r3)
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0aaf
            java.lang.String r0 = "MemoryLeakReporter. Canceled leak detection"
            goto L_0x01e0
        L_0x002e:
            java.lang.Object r8 = r1.A00
            X.1gQ r8 = (X.AnonymousClass1gQ) r8
            java.util.Map r7 = r8.A02
            int r0 = r7.size()
            if (r0 == 0) goto L_0x0016
            java.util.Iterator r6 = X.AnonymousClass001.A0v(r7)
            r4 = 0
        L_0x0040:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0c9e
            long r2 = X.C18270x1.A02(r6)
            r0 = 1
            long r2 = r2 - r0
            long r4 = r4 + r2
            goto L_0x0040
        L_0x004f:
            java.lang.Object r1 = r1.A00
            X.30H r1 = (X.AnonymousClass30H) r1
            X.3dV r0 = r1.A0R
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0016
            X.3FK r2 = r1.A0B
            java.lang.String r0 = "app/sendunsent"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.1sh r0 = r2.A00
            X.C18290x4.A1L(r0)
            X.1sh r1 = new X.1sh
            r1.<init>(r2)
            r2.A00 = r1
            X.4FS r0 = r2.A0C
            X.C18270x1.A0w(r1, r0)
            return
        L_0x0072:
            java.lang.Object r5 = r1.A00
            X.3H2 r5 = (X.AnonymousClass3H2) r5
            boolean r0 = r5.A03()
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "DeviceKeyIndexListUpdateHandler/onChatDConnectedForKeyIndexListUpdate"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2sH r0 = r5.A05
            long r12 = r0.A0H()
            X.33p r0 = r5.A06
            X.8qC r9 = r0.A01
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r9)
            java.lang.String r0 = "adv_key_index_list_require_update"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = "DeviceKeyIndexListUpdateHandler/updatingKeyIndexList;delivery failure"
        L_0x0099:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r5.A00()
            return
        L_0x00a0:
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r9)
            java.lang.String r0 = "adv_key_index_list_last_failure_time"
            long r10 = X.AnonymousClass0x2.A0B(r1, r0)
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r9)
            java.lang.String r0 = "adv_key_index_list_update_retry_count"
            int r8 = X.C18280x3.A02(r1, r0)
            long[] r1 = X.AnonymousClass3H2.A0A
            int r0 = r1.length
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r8 > r0) goto L_0x00e5
            if (r8 <= 0) goto L_0x00e5
            int r0 = r8 + -1
            r3 = r1[r0]
        L_0x00c2:
            long r1 = r12 - r10
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0016
            if (r8 > 0) goto L_0x00e2
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r9)
            java.lang.String r0 = "adv_key_index_list_last_update_time"
            long r0 = X.AnonymousClass0x2.A0B(r1, r0)
            long r12 = r12 - r0
            X.1VX r1 = r5.A08
            r0 = 477(0x1dd, float:6.68E-43)
            long r1 = X.C56952sp.A06(r1, r0)
            long r1 = r1 * r6
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0016
        L_0x00e2:
            java.lang.String r0 = "DeviceKeyIndexListUpdateHandler/updatingKeyIndexList;failures or stale key-index-list"
            goto L_0x0099
        L_0x00e5:
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x00c2
        L_0x00e9:
            java.lang.Object r7 = r1.A00
            X.30H r7 = (X.AnonymousClass30H) r7
            X.2sr r0 = r7.A07
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r0)
            java.lang.String r0 = r0.user
            java.lang.String r6 = X.C386028i.A00(r0)
            X.1VX r2 = r7.A0V
            r1 = 693(0x2b5, float:9.71E-43)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0125
            X.33p r0 = r7.A0N
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "pref_deprecate_rc"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x0016
            X.33S r1 = r7.A0e
            byte[] r2 = X.C627236i.A0H()
            r0 = 0
        L_0x011b:
            X.31C r1 = r1.A04
            android.os.Message r0 = X.AnonymousClass36N.A05(r6, r2, r0)
            r1.A0J(r0)
            return
        L_0x0125:
            X.2oU r0 = r7.A0M
            android.content.Context r5 = r0.A00
            java.io.File r1 = r5.getFilesDir()
            java.lang.String r0 = "rc2"
            java.io.File r1 = X.AnonymousClass002.A0A(r1, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x014a
            long r3 = r1.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x014a
            byte[] r0 = X.C627236i.A0J(r5, r6)
            if (r0 != 0) goto L_0x0016
        L_0x014a:
            X.33S r1 = r7.A0e
            byte[] r2 = X.C627236i.A0H()
            r0 = 1
            goto L_0x011b
        L_0x0152:
            java.lang.Object r0 = r1.A00
            X.2zi r0 = (X.C61102zi) r0
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x015a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.2Ub r0 = (X.C43942Ub) r0
            r0.A00()
            goto L_0x015a
        L_0x016a:
            java.lang.Object r2 = r1.A00
            com.whatsapp.mediaview.PhotoView r2 = (com.whatsapp.mediaview.PhotoView) r2
            android.view.View$OnClickListener r0 = r2.A0M
            if (r0 == 0) goto L_0x0016
            android.graphics.PointF r0 = r2.A0E
            float r1 = r0.x
            float r0 = r0.y
            r2.A04(r1, r0)
            return
        L_0x017c:
            java.lang.Object r1 = r1.A00
            com.whatsapp.mediaview.MediaViewFragment r1 = (com.whatsapp.mediaview.MediaViewFragment) r1
            X.03q r0 = r1.A0Q()
            if (r0 == 0) goto L_0x0016
            r0.invalidateOptionsMenu()
            X.2Vu r0 = r1.A0e
            X.316 r1 = r0.A00
            r0 = 2
            r1.A0E(r0)
            return
        L_0x0192:
            java.lang.Object r0 = r1.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r0 = r0.A0Q()
            if (r0 == 0) goto L_0x0016
            r0.invalidateOptionsMenu()
            return
        L_0x01a0:
            java.lang.Object r0 = r1.A00
            com.whatsapp.mediaview.MediaViewFragment r0 = (com.whatsapp.mediaview.MediaViewFragment) r0
            X.5YG r1 = r0.A1n
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1.A0e()
            if (r0 != 0) goto L_0x0016
            r1.A0F()
            return
        L_0x01b2:
            java.lang.Object r0 = r1.A00
            X.8zK r0 = (X.C188688zK) r0
            java.lang.Object r1 = r0.A00
            X.8He r1 = (X.C171468He) r1
            X.4Lb r0 = r1.A02
            if (r0 == 0) goto L_0x0016
            X.4Lb r0 = r1.A03
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "MediaMessagesNavigator/navigator/on-change-posted-start"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4Lb r0 = r1.A02
            int r0 = r0.getCount()
            r1.A00 = r0
            X.4Lb r0 = r1.A03
            int r0 = r0.getCount()
            r1.A01 = r0
            java.lang.Runnable r0 = r1.A07
            if (r0 == 0) goto L_0x01de
            r0.run()
        L_0x01de:
            java.lang.String r0 = "MediaMessagesNavigator/navigator/on-change-posted-end"
        L_0x01e0:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x01e4:
            java.lang.Object r1 = r1.A00
            X.5Y7 r1 = (X.AnonymousClass5Y7) r1
            android.graphics.Bitmap r0 = r1.A04
            r1.A03 = r0
            r0 = 0
            r1.A01 = r0
            X.5eH r0 = r1.A0U
            r0.A00()
            X.4Wu r0 = r1.A08
            if (r0 == 0) goto L_0x0016
        L_0x01f8:
            r0.A05()
            return
        L_0x01fc:
            java.lang.Object r3 = r1.A00
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r3 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r3
            com.whatsapp.WaTextView r1 = r3.A0B
            if (r1 != 0) goto L_0x020b
            java.lang.String r0 = "mediaQualityToolTip"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x020b:
            r0 = 4
            r1.setVisibility(r0)
            android.widget.ImageView r0 = r3.A05
            if (r0 == 0) goto L_0x0016
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            if (r2 == 0) goto L_0x0016
            r1 = 2
            X.4JP r0 = new X.4JP
            r0.<init>(r3, r1)
            r2.addOnGlobalLayoutListener(r0)
            return
        L_0x0223:
            java.lang.Object r3 = r1.A00
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r3 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r3
            X.2QH r8 = r3.getMediaQualityTooltipUtil()
            X.33p r7 = r8.A01
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r7)
            java.lang.String r6 = "registration_initialized_time"
            long r4 = X.AnonymousClass0x2.A0B(r0, r6)
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0253
            long r4 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r7)
            long r0 = X.AnonymousClass0x2.A0B(r0, r6)
            long r4 = r4 - r0
            r1 = 1209600000(0x48190800, double:5.97621805E-315)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0253
            return
        L_0x0253:
            X.8qC r9 = r7.A01
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r9)
            java.lang.String r6 = "media_quality_has_send_media"
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x026f
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r9)
            boolean r1 = X.C18280x3.A1W(r0, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x02d0
        L_0x026f:
            X.319 r0 = r8.A02
            X.4GK r10 = X.AnonymousClass319.A00(r0)     // Catch:{ Exception -> 0x02be }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x02b4 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x02b4 }
            java.lang.String r2 = "SELECT count(1) as count FROM available_message_view WHERE from_me = 1 AND message_type IN ('3', '1')"
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x02b4 }
            java.lang.String r0 = "SELECT_MY_PHOTO_AND_VIDEO_MESSAGES_COUNT"
            android.database.Cursor r5 = r4.A0E(r2, r0, r1)     // Catch:{ all -> 0x02b4 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x02a8 }
            if (r0 == 0) goto L_0x02a1
            java.lang.String r0 = "count"
            long r0 = X.AnonymousClass0x2.A0C(r5, r0)     // Catch:{ all -> 0x02a8 }
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x02a8 }
            java.lang.String r2 = "MediaMessageStore/getMediaSendFromMeCount/count/"
            X.C18260x0.A10(r2, r4, r0)     // Catch:{ all -> 0x02a8 }
            r5.close()     // Catch:{ all -> 0x02b4 }
            r10.close()     // Catch:{ Exception -> 0x02be }
            goto L_0x02c5
        L_0x02a1:
            r5.close()     // Catch:{ all -> 0x02b4 }
            r10.close()     // Catch:{ Exception -> 0x02be }
            goto L_0x02cc
        L_0x02a8:
            r1 = move-exception
            if (r5 == 0) goto L_0x02b3
            r5.close()     // Catch:{ all -> 0x02af }
            goto L_0x02b3
        L_0x02af:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02b4 }
        L_0x02b3:
            throw r1     // Catch:{ all -> 0x02b4 }
        L_0x02b4:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x02b9 }
            goto L_0x02bd
        L_0x02b9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x02be }
        L_0x02bd:
            throw r1     // Catch:{ Exception -> 0x02be }
        L_0x02be:
            r1 = move-exception
            java.lang.String r0 = "MediaMessageStore/getMediaSendFromMeCount/sql failed"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x02cc
        L_0x02c5:
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r1 = 1
            if (r2 > 0) goto L_0x02cd
        L_0x02cc:
            r1 = 0
        L_0x02cd:
            X.C18270x1.A0v(r7, r6, r1)
        L_0x02d0:
            if (r1 == 0) goto L_0x0016
            long r0 = java.lang.System.currentTimeMillis()
            r4 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r0 = r0 - r4
            android.content.SharedPreferences r2 = X.C18300x5.A0B(r9)
            java.lang.String r6 = "media_quality_has_send_hd_media"
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L_0x02f6
            android.content.SharedPreferences r2 = X.C18300x5.A0B(r9)
            boolean r4 = X.C18280x3.A1W(r2, r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            if (r2 != 0) goto L_0x03b1
        L_0x02f6:
            X.319 r9 = r8.A02
            X.1VX r5 = r9.A0C
            r2 = 3068(0xbfc, float:4.299E-42)
            X.2vE r4 = X.C58422vE.A02
            int r2 = r5.A0O(r4, r2)
            java.lang.String r12 = java.lang.String.valueOf(r2)
            r2 = 4171(0x104b, float:5.845E-42)
            int r2 = r5.A0O(r4, r2)
            java.lang.String r11 = java.lang.String.valueOf(r2)
            r2 = 4172(0x104c, float:5.846E-42)
            int r2 = r5.A0O(r4, r2)
            java.lang.String r13 = java.lang.String.valueOf(r2)
            r2 = 4175(0x104f, float:5.85E-42)
            int r2 = r5.A0O(r4, r2)
            java.lang.String r10 = java.lang.String.valueOf(r2)
            r2 = 9
            java.lang.String[] r4 = new java.lang.String[r2]
            X.C18270x1.A1S(r4, r0)
            r0 = 1
            r4[r0] = r12
            X.AnonymousClass001.A1H(r12, r11, r4)
            r0 = 4
            r4[r0] = r11
            r0 = 5
            r4[r0] = r13
            r0 = 6
            r4[r0] = r10
            r0 = 7
            r4[r0] = r10
            r0 = 8
            r4[r0] = r13
            X.4GK r9 = X.AnonymousClass319.A00(r9)     // Catch:{ Exception -> 0x039f }
            boolean r0 = X.C56952sp.A0H(r5)     // Catch:{ all -> 0x0395 }
            if (r0 == 0) goto L_0x0359
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0395 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0395 }
            java.lang.String r1 = "SELECT count(1) as count FROM message_media  JOIN available_message_view  WHERE available_message_view.from_me = 1 AND message_media.message_row_id = available_message_view._id AND available_message_view.timestamp >= ? AND (((message_media.width >= ? OR message_media.height >= ?) AND available_message_view.message_type = '1') OR (available_message_view.message_type = '3' AND (message_media.width >= ? OR message_media.height >= ? OR message_media.width >= ? AND message_media.height >= ? OR message_media.width >= ? AND message_media.height >= ?)))"
            java.lang.String r0 = "SELECT_MY_PHOTO_AND_VIDEO_MESSAGES_COUNT_BASED_ON_SIZE_A14"
            android.database.Cursor r2 = r2.A0E(r1, r0, r4)     // Catch:{ all -> 0x0395 }
            goto L_0x0366
        L_0x0359:
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0395 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0395 }
            java.lang.String r1 = "SELECT count(1) as count FROM message_media  JOIN available_message_view ON message_media.message_row_id = available_message_view._id  WHERE available_message_view.from_me = 1 AND available_message_view.timestamp >= ? AND (((message_media.width >= ? OR message_media.height >= ?) AND available_message_view.message_type = '1') OR (available_message_view.message_type = '3' AND (message_media.width >= ? OR message_media.height >= ? OR message_media.width >= ? AND message_media.height >= ? OR message_media.width >= ? AND message_media.height >= ?)))"
            java.lang.String r0 = "SELECT_MY_PHOTO_AND_VIDEO_MESSAGES_COUNT_BASED_ON_SIZE"
            android.database.Cursor r2 = r2.A0E(r1, r0, r4)     // Catch:{ all -> 0x0395 }
        L_0x0366:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0389 }
            if (r0 == 0) goto L_0x0382
            java.lang.String r0 = "count"
            long r4 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x0389 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = "MediaMessageStore/getHdMediaSendFromMeCount/count/"
            X.C18260x0.A10(r0, r1, r4)     // Catch:{ all -> 0x0389 }
            r2.close()     // Catch:{ all -> 0x0395 }
            r9.close()     // Catch:{ Exception -> 0x039f }
            goto L_0x03a6
        L_0x0382:
            r2.close()     // Catch:{ all -> 0x0395 }
            r9.close()     // Catch:{ Exception -> 0x039f }
            goto L_0x03ad
        L_0x0389:
            r1 = move-exception
            if (r2 == 0) goto L_0x0394
            r2.close()     // Catch:{ all -> 0x0390 }
            goto L_0x0394
        L_0x0390:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0395 }
        L_0x0394:
            throw r1     // Catch:{ all -> 0x0395 }
        L_0x0395:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x039a }
            goto L_0x039e
        L_0x039a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x039f }
        L_0x039e:
            throw r1     // Catch:{ Exception -> 0x039f }
        L_0x039f:
            r1 = move-exception
            java.lang.String r0 = "MediaMessageStore/getHdMediaSendFromMeCount/sql failed"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x03ad
        L_0x03a6:
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r4 = 1
            if (r0 > 0) goto L_0x03ae
        L_0x03ad:
            r4 = 0
        L_0x03ae:
            X.C18270x1.A0v(r7, r6, r4)
        L_0x03b1:
            if (r4 != 0) goto L_0x0016
            X.1VX r2 = r8.A03
            r1 = 6286(0x188e, float:8.809E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0016
            X.3Wi r2 = r3.getGlobalUI()
            r1 = 6
            X.3Zn r0 = new X.3Zn
            r0.<init>(r3, r1)
            r2.A0S(r0)
            r0 = 1
            r3.A0V = r0
            return
        L_0x03d0:
            java.lang.Object r1 = r1.A00
            X.5Kk r1 = (X.C102825Kk) r1
            r0 = 0
            r1.A00 = r0
            android.widget.PopupWindow r1 = r1.A03
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x0016
            r1.dismiss()
            return
        L_0x03e3:
            java.lang.Object r4 = r1.A00
            X.3Cl r4 = (X.C64173Cl) r4
            java.lang.String r0 = "PreacksQueue/loadDataFromDb"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2bh r5 = r4.A02
            java.lang.String r0 = "PreacksStore/loadAll"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r5.A00()     // Catch:{ Exception -> 0x047c }
            if (r0 == 0) goto L_0x03fd
            X.3d3 r7 = X.C72023d3.A00     // Catch:{ Exception -> 0x047c }
            goto L_0x048d
        L_0x03fd:
            X.8qC r0 = r5.A04     // Catch:{ Exception -> 0x047c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x047c }
            X.1RJ r0 = (X.AnonymousClass1RJ) r0     // Catch:{ Exception -> 0x047c }
            X.4GK r6 = r0.get()     // Catch:{ Exception -> 0x047c }
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0475 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0475 }
            java.lang.String r2 = "\n      SELECT _id, ptn \n      FROM preacks\n      ORDER BY _id\n    "
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0475 }
            java.lang.String r0 = "PreacksStore/LOAD_ALL"
            android.database.Cursor r9 = X.C56862sg.A02(r3, r2, r0, r1)     // Catch:{ all -> 0x0475 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x046e }
            int r11 = X.AnonymousClass0x7.A02(r9)     // Catch:{ all -> 0x046e }
            java.lang.String r0 = "ptn"
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x046e }
        L_0x0428:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x046e }
            if (r0 == 0) goto L_0x0467
            byte[] r12 = r9.getBlob(r10)     // Catch:{ all -> 0x046e }
            r8 = 0
            X.1VX r3 = r5.A02     // Catch:{ all -> 0x0446 }
            X.2Ua r2 = r5.A03     // Catch:{ all -> 0x0446 }
            r0 = 0
            X.3Tl r1 = new X.3Tl     // Catch:{ all -> 0x0446 }
            r1.<init>(r0, r3, r2, r0)     // Catch:{ all -> 0x0446 }
            java.io.ByteArrayInputStream r0 = X.AnonymousClass0x9.A0d(r12)     // Catch:{ all -> 0x0446 }
            X.36K r1 = r1.A03(r0)     // Catch:{ all -> 0x0446 }
            goto L_0x044b
        L_0x0446:
            r0 = move-exception
            X.3Z0 r1 = X.AnonymousClass3Z0.A01(r0)     // Catch:{ all -> 0x046e }
        L_0x044b:
            boolean r0 = r1 instanceof X.AnonymousClass3Z0     // Catch:{ all -> 0x046e }
            if (r0 != 0) goto L_0x0450
            r8 = r1
        L_0x0450:
            X.36K r8 = (X.AnonymousClass36K) r8     // Catch:{ all -> 0x046e }
            if (r8 == 0) goto L_0x0428
            long r0 = r9.getLong(r11)     // Catch:{ all -> 0x046e }
            r2 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x046e }
            X.2lg r0 = new X.2lg     // Catch:{ all -> 0x046e }
            r0.<init>(r8, r1, r2)     // Catch:{ all -> 0x046e }
            r7.add(r0)     // Catch:{ all -> 0x046e }
            goto L_0x0428
        L_0x0467:
            r9.close()     // Catch:{ all -> 0x0475 }
            r6.close()     // Catch:{ Exception -> 0x047c }
            goto L_0x048d
        L_0x046e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0470 }
        L_0x0470:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)     // Catch:{ all -> 0x0475 }
            throw r0     // Catch:{ all -> 0x0475 }
        L_0x0475:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0477 }
        L_0x0477:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ Exception -> 0x047c }
            throw r0     // Catch:{ Exception -> 0x047c }
        L_0x047c:
            r3 = move-exception
            java.lang.String r0 = "PreacksStore/startLoadingAsync/failed_to_load_pre_acks"
            X.C626936e.A08(r0, r3)
            X.2qk r2 = r5.A00
            java.lang.String r1 = "failed_to_load_pre_acks"
            java.lang.String r0 = "exception"
            r2.A09(r1, r0, r3)
            X.3d3 r7 = X.C72023d3.A00
        L_0x048d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PreacksQueue/loadDataFromDb loaded "
            X.AnonymousClass000.A1H(r0, r1, r7)
            java.lang.String r0 = " pre-acks"
            X.C18260x0.A1L(r1, r0)
            monitor-enter(r4)
            X.3fv r0 = r4.A09     // Catch:{ all -> 0x04a8 }
            r0.addAll(r7)     // Catch:{ all -> 0x04a8 }
            monitor-exit(r4)
            java.util.concurrent.CountDownLatch r0 = r4.A03
            r0.countDown()
            return
        L_0x04a8:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x04ab:
            java.lang.Object r0 = r1.A00
            X.3Cl r0 = (X.C64173Cl) r0
            r0.A05()
            return
        L_0x04b3:
            java.lang.Object r2 = r1.A00
            X.3Cl r2 = (X.C64173Cl) r2
            r2.A05()
            X.66R r0 = r2.A07
            long r0 = X.C18290x4.A0D(r0)
            r2.A06(r0)
            return
        L_0x04c4:
            java.lang.Object r4 = r1.A00
            X.2c8 r4 = (X.C46742c8) r4
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            X.3Cl r0 = r4.A02
            X.2lg r1 = r0.A00()
            if (r1 != 0) goto L_0x04d8
            r4.A00()
            return
        L_0x04d8:
            java.lang.String r0 = "PreacksPingManager/sendPingAndClearPreacks/sending ping to clear preacks"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2sT r3 = r4.A01
            r0 = 8
            X.4KT r2 = new X.4KT
            r2.<init>(r4, r0, r1)
            r0 = 32000(0x7d00, double:1.581E-319)
            r3.A08(r2, r0)
            return
        L_0x04ec:
            java.lang.Object r0 = r1.A00
            X.3Gp r0 = (X.C65203Gp) r0
            r0.A0G()
            return
        L_0x04f4:
            java.lang.Object r1 = r1.A00
            X.3Qp r1 = (X.C67773Qp) r1
            r0 = 0
            goto L_0x04ff
        L_0x04fa:
            java.lang.Object r1 = r1.A00
            X.3Qp r1 = (X.C67773Qp) r1
            r0 = 1
        L_0x04ff:
            r1.A00(r0)
            return
        L_0x0503:
            java.lang.Object r0 = r1.A00
            X.3Qq r0 = (X.C67783Qq) r0
            X.C67783Qq.A00(r0)
            return
        L_0x050b:
            java.lang.Object r0 = r1.A00
            X.3Wa r0 = (X.C69183Wa) r0
            r3 = 0
            X.4FS r2 = r0.A0B
            java.lang.String r1 = "ToSGatingRepository/requestRefresh"
            java.lang.Runnable r0 = r0.A0C
            r2.Bkn(r0, r1, r3)
            return
        L_0x051b:
            java.lang.Object r5 = r1.A00
            X.30H r5 = (X.AnonymousClass30H) r5
            X.3dV r0 = r5.A0R
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x056f
            X.2oU r0 = r5.A0M
            android.content.Context r2 = r0.A00
            java.io.File r1 = r2.getFilesDir()
            java.lang.String r0 = "key"
            boolean r0 = X.C18300x5.A1V(r1, r0)
            if (r0 == 0) goto L_0x0546
            r1 = 0
            X.0NX r0 = X.C06550Ye.A05(r2)     // Catch:{ 23v | InvalidParameterException -> 0x0540 }
            if (r0 == 0) goto L_0x0540
            X.0Nl r0 = r0.A00     // Catch:{ 23v | InvalidParameterException -> 0x0540 }
            java.lang.String r1 = r0.A00     // Catch:{ 23v | InvalidParameterException -> 0x0540 }
        L_0x0540:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x056f
        L_0x0546:
            X.2sr r0 = r5.A07
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x056f
            r0 = 16
            byte[] r4 = X.AnonymousClass29O.A01(r0)
            byte[] r3 = X.C06550Ye.A0T(r4)
            if (r3 == 0) goto L_0x05d8
            X.2qk r0 = r5.A04
            X.C06550Ye.A0G(r0, r3)
            X.C06550Ye.A0H(r0, r4)
            X.0XM r2 = r5.A0D
            r1 = 1
            r0 = 0
            r2.A05(r0, r3, r4, r1)
            java.util.Arrays.toString(r4)
            java.util.Arrays.toString(r3)
        L_0x056f:
            X.2iK r8 = r5.A0m
            X.2TQ r7 = new X.2TQ
            r7.<init>()
            r6 = 1
            r7.A00 = r6
            X.33p r0 = r5.A0N
            X.8qC r9 = r0.A01
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r9)
            java.lang.String r0 = "account_sync_status_num_retries"
            r2 = 0
            int r0 = r1.getInt(r0, r2)
            r5 = 0
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r7.A06 = r0
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r9)
            java.lang.String r0 = "account_sync_picture_num_retries"
            int r0 = r1.getInt(r0, r2)
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r7.A04 = r0
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r9)
            java.lang.String r0 = "account_sync_privacy_num_retries"
            int r0 = r1.getInt(r0, r2)
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r7.A05 = r0
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r9)
            java.lang.String r0 = "block_list_receive_time"
            r3 = 0
            long r1 = r1.getLong(r0, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x05cc
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r9)
            java.lang.String r0 = "account_sync_blocklist_num_retries"
            int r1 = r1.getInt(r0, r5)
            r0 = 0
            if (r1 <= 0) goto L_0x05cd
        L_0x05cc:
            r0 = 1
        L_0x05cd:
            r7.A01 = r0
            X.2TR r0 = new X.2TR
            r0.<init>(r7)
            r8.A00(r0, r5, r6, r6)
            return
        L_0x05d8:
            java.lang.String r0 = "xmpp/connection/writer/needcipherkey/skip"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x056f
        L_0x05df:
            java.lang.Object r0 = r1.A00
            X.30H r0 = (X.AnonymousClass30H) r0
            X.3Lv r1 = r0.A0Q
            r0 = 0
            r1.A0O(r0, r0)
            r1.A0H()
            r1.A0I()
            return
        L_0x05f0:
            java.lang.Object r0 = r1.A00
            X.33n r0 = (X.C621133n) r0
            r0.A0I()
            return
        L_0x05f8:
            java.lang.Object r0 = r1.A00
            X.30H r0 = (X.AnonymousClass30H) r0
            X.3Wi r2 = r0.A05
            r1 = 0
            r0 = 2131890559(0x7f12117f, float:1.9415813E38)
            r2.A0G(r1, r0)
            return
        L_0x0606:
            java.lang.Object r3 = r1.A00
            X.30H r3 = (X.AnonymousClass30H) r3
            X.3dV r0 = r3.A0R
            boolean r0 = X.C72303dV.A00(r0)
            if (r0 == 0) goto L_0x06e1
            X.36F r6 = r3.A0S
            X.9Tx r5 = r3.A0l
            X.3dV r1 = r6.A04
            boolean r0 = X.C72303dV.A00(r1)
            if (r0 != 0) goto L_0x065f
            X.7oG r1 = r6.A09
            java.lang.String r0 = "processFutureTransactions: msg store not ready"
            r1.A05(r0)
        L_0x0626:
            X.33p r6 = r3.A0N
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r6)
            java.lang.String r5 = "verification_level_consolidation_notification"
            boolean r0 = X.C18280x3.A1W(r0, r5)
            if (r0 != 0) goto L_0x06e1
            X.314 r0 = r3.A0I
            java.util.ArrayList r0 = r0.A04()
            java.util.Iterator r4 = r0.iterator()
        L_0x063f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x06dd
            com.whatsapp.jid.UserJid r2 = X.C18310x6.A0T(r4)
            X.2rx r0 = r3.A0H
            X.2qS r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x063f
            X.3Lv r1 = r3.A0Q
            X.35K r0 = X.AnonymousClass35K.A00(r0)
            X.2i3 r0 = r0.A02()
            r1.A0P(r2, r0)
            goto L_0x063f
        L_0x065f:
            java.lang.String[] r14 = X.AnonymousClass0x9.A1Y()
            r0 = 5
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r4 = 0
            r14[r4] = r0
            java.lang.String r18 = "processFutureTransactions/QUERY_PAY_TRANSACTION"
            X.4GK r9 = r1.get()
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x06d3 }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x06d3 }
            java.lang.String r11 = "pay_transaction"
            java.lang.String[] r12 = X.AnonymousClass36F.A0A     // Catch:{ all -> 0x06d3 }
            java.lang.String r13 = "( type=? )"
            r15 = 0
            java.lang.String r16 = "init_timestamp DESC"
            r17 = r15
            android.database.Cursor r7 = r10.A0F(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x06d3 }
            if (r7 == 0) goto L_0x06c4
            r8 = 0
        L_0x068a:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x06c9 }
            if (r0 == 0) goto L_0x06a9
            X.34w r0 = r6.A0E(r7)     // Catch:{ 24P -> 0x069f }
            boolean r0 = r5.A09(r0)     // Catch:{ 24P -> 0x069f }
            if (r0 == 0) goto L_0x069c
            int r4 = r4 + 1
        L_0x069c:
            int r8 = r8 + 1
            goto L_0x068a
        L_0x069f:
            r2 = move-exception
            X.7oG r1 = r6.A09     // Catch:{ all -> 0x06c9 }
            java.lang.String r0 = "processFutureTransactions/InvalidJidException - Skipped future transaction with invalid JID"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x06c9 }
            goto L_0x068a
        L_0x06a9:
            X.7oG r2 = r6.A09     // Catch:{ all -> 0x06c9 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x06c9 }
            java.lang.String r0 = "processFutureTransactions processed: "
            r1.append(r0)     // Catch:{ all -> 0x06c9 }
            r1.append(r4)     // Catch:{ all -> 0x06c9 }
            java.lang.String r0 = " / "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r8)     // Catch:{ all -> 0x06c9 }
            r2.A07(r0)     // Catch:{ all -> 0x06c9 }
            r7.close()     // Catch:{ all -> 0x06d3 }
        L_0x06c4:
            r9.close()
            goto L_0x0626
        L_0x06c9:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x06ce }
            goto L_0x06d2
        L_0x06ce:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x06d3 }
        L_0x06d2:
            throw r1     // Catch:{ all -> 0x06d3 }
        L_0x06d3:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x06d8 }
            throw r1
        L_0x06d8:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x06dd:
            r0 = 1
            X.C18270x1.A0v(r6, r5, r0)
        L_0x06e1:
            X.2og r0 = r3.A0O
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C54412og.A00(r0)
            java.lang.String r0 = "run_on_connect_tasks_for_version_change"
            X.C18270x1.A0l(r1, r0, r2)
            return
        L_0x06ef:
            java.lang.Object r0 = r1.A00
            X.30H r0 = (X.AnonymousClass30H) r0
            X.2dy r3 = r0.A0G
            r2 = 0
            r1 = 1
            r0 = 0
            r3.A01(r2, r0, r1)
            return
        L_0x06fc:
            java.lang.Object r9 = r1.A00
            X.2UH r9 = (X.AnonymousClass2UH) r9
            X.2Nj r8 = r9.A06
            X.1VX r0 = r9.A09
            r25 = r0
            X.2qk r0 = r9.A00
            r16 = r0
            X.2sr r0 = r9.A01
            r17 = r0
            X.2ss r0 = r9.A03
            r20 = r0
            X.4FV r15 = r9.A0A
            X.27h r14 = r9.A0C
            X.3Lv r13 = r9.A04
            X.2qz r12 = r9.A0G
            X.33f r11 = r9.A08
            X.3dV r10 = r9.A07
            X.2qj r6 = r9.A05
            X.8qC r0 = r9.A0I
            java.lang.Object r5 = r0.get()
            X.30C r5 = (X.AnonymousClass30C) r5
            X.4F4 r4 = r9.A02
            X.2xe r3 = r9.A0F
            X.3Le r2 = r9.A0B
            X.4rH r1 = r9.A0E
            X.2pS r0 = r9.A0D
            X.2UE r7 = new X.2UE
            r18 = r4
            r19 = r5
            r21 = r13
            r22 = r6
            r23 = r10
            r24 = r11
            r26 = r15
            r27 = r2
            r28 = r14
            r29 = r0
            r30 = r1
            r31 = r3
            r32 = r12
            r15 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r6 = 0
            X.3dV r0 = r8.A01     // Catch:{ SQLiteException -> 0x0a29 }
            X.4GK r16 = r0.get()     // Catch:{ SQLiteException -> 0x0a29 }
            r0 = r16
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0a1f }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0a1f }
            java.lang.String r1 = X.C58162uo.A0H     // Catch:{ all -> 0x0a1f }
            java.lang.String r0 = "GET_UNPROCESSED_FUTURE_MESSAGES_SQL"
            android.database.Cursor r15 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x0a1f }
        L_0x0767:
            boolean r0 = r15.moveToNext()     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 == 0) goto L_0x0a04
            X.2qz r0 = r8.A02     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            X.34x r5 = r0.A03(r15)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            boolean r0 = r5 instanceof X.C30351mJ     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 == 0) goto L_0x078f
            X.2sr r0 = r7.A01     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            boolean r0 = r0.A0Y()     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 != 0) goto L_0x078f
            r4 = r5
            X.1mJ r4 = (X.C30351mJ) r4     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            byte[] r3 = r4.A1u()     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            int r0 = r4.A01     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r3 == 0) goto L_0x078f
            r2 = 2
            if (r0 == 0) goto L_0x0792
            if (r0 == r2) goto L_0x0792
        L_0x078f:
            int r6 = r6 + 1
            goto L_0x0767
        L_0x0792:
            byte[] r1 = r4.A02     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r1 == 0) goto L_0x0877
            r19 = 0
            X.1B1 r0 = X.AnonymousClass1B1.DEFAULT_INSTANCE     // Catch:{ 24P | 6u5 -> 0x086f }
            X.6cX r1 = X.C130786cX.A05(r0, r1)     // Catch:{ 24P | 6u5 -> 0x086f }
            X.1B1 r1 = (X.AnonymousClass1B1) r1     // Catch:{ 24P | 6u5 -> 0x086f }
            int r0 = r1.bitField0_     // Catch:{ 24P | 6u5 -> 0x086f }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0868
            X.1D1 r1 = r1.botInfo_     // Catch:{ 24P | 6u5 -> 0x086f }
            if (r1 != 0) goto L_0x07ac
            X.1D1 r1 = X.AnonymousClass1D1.DEFAULT_INSTANCE     // Catch:{ 24P | 6u5 -> 0x086f }
        L_0x07ac:
            int r0 = r1.bitField0_     // Catch:{ 24P | 6u5 -> 0x086f }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x07ef
            java.lang.String r0 = r1.targetSenderJid_     // Catch:{ 24P | 6u5 -> 0x086f }
            com.whatsapp.jid.UserJid r22 = X.AnonymousClass32Y.A09(r0)     // Catch:{ 24P | 6u5 -> 0x086f }
        L_0x07b8:
            int r0 = r1.bitField0_     // Catch:{ 24P | 6u5 -> 0x086f }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x07ec
            java.lang.String r0 = r1.targetChatJid_     // Catch:{ 24P | 6u5 -> 0x086f }
            X.4uZ r21 = X.C106405Yw.A04(r0)     // Catch:{ 24P | 6u5 -> 0x086f }
        L_0x07c4:
            java.lang.String r10 = r1.targetId_     // Catch:{ 24P | 6u5 -> 0x086f }
            java.lang.String r0 = r1.editTargetId_     // Catch:{ 24P | 6u5 -> 0x086f }
            r26 = 0
            X.2n5 r1 = new X.2n5     // Catch:{ 24P | 6u5 -> 0x086f }
            r20 = r1
            r23 = r10
            r24 = r0
            r25 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ 24P | 6u5 -> 0x086f }
            X.2pS r0 = r7.A0D     // Catch:{ 24P | 6u5 -> 0x086f }
            r21 = r0
            X.2z0 r14 = r4.A1J     // Catch:{ 24P | 6u5 -> 0x086f }
            X.4uZ r0 = r14.A00     // Catch:{ 24P | 6u5 -> 0x086f }
            r18 = r0
            r17 = r0
            X.4uZ r0 = r1.A01     // Catch:{ 24P | 6u5 -> 0x086f }
            X.4uZ r0 = X.C627336j.A02(r0)     // Catch:{ 24P | 6u5 -> 0x086f }
            if (r0 == 0) goto L_0x07f4
            goto L_0x07f2
        L_0x07ec:
            r21 = r19
            goto L_0x07c4
        L_0x07ef:
            r22 = r19
            goto L_0x07b8
        L_0x07f2:
            r17 = r0
        L_0x07f4:
            java.lang.String r13 = r1.A05     // Catch:{ 24P | 6u5 -> 0x086f }
            r0 = r17
            X.2z0 r12 = X.AnonymousClass2z0.A04(r0, r13)     // Catch:{ 24P | 6u5 -> 0x086f }
            java.util.Map r11 = r7.A0H     // Catch:{ 24P | 6u5 -> 0x086f }
            java.lang.Object r10 = r11.get(r12)     // Catch:{ 24P | 6u5 -> 0x086f }
            X.34x r10 = (X.C624134x) r10     // Catch:{ 24P | 6u5 -> 0x086f }
            if (r10 != 0) goto L_0x0825
            X.2qz r0 = r7.A0G     // Catch:{ 24P | 6u5 -> 0x086f }
            X.34x r10 = r0.A05(r12)     // Catch:{ 24P | 6u5 -> 0x086f }
            if (r10 != 0) goto L_0x0825
            java.lang.String r10 = "DecryptionCallbackMessageSecret/findTargetMsg not found from me"
            com.whatsapp.util.Log.d((java.lang.String) r10)     // Catch:{ 24P | 6u5 -> 0x086f }
            r10 = r17
            X.2z0 r12 = X.AnonymousClass2z0.A03(r10, r13)     // Catch:{ 24P | 6u5 -> 0x086f }
            java.lang.Object r10 = r11.get(r12)     // Catch:{ 24P | 6u5 -> 0x086f }
            X.34x r10 = (X.C624134x) r10     // Catch:{ 24P | 6u5 -> 0x086f }
            if (r10 != 0) goto L_0x0825
            X.34x r10 = r0.A05(r12)     // Catch:{ 24P | 6u5 -> 0x086f }
        L_0x0825:
            r0 = r21
            X.1VX r12 = r0.A02     // Catch:{ 24P | 6u5 -> 0x086f }
            r11 = 4165(0x1045, float:5.836E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ 24P | 6u5 -> 0x086f }
            boolean r0 = r12.A0Y(r0, r11)     // Catch:{ 24P | 6u5 -> 0x086f }
            if (r0 != 0) goto L_0x083a
            java.lang.String r0 = "MessageSecretMessageDecryptionManager/processBotMessageSecretFuture/receive not enabled"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ 24P | 6u5 -> 0x086f }
            goto L_0x078f
        L_0x083a:
            java.lang.String r11 = r1.A04     // Catch:{ 24P | 6u5 -> 0x086f }
            boolean r0 = X.C107575bX.A0F(r11)     // Catch:{ 24P | 6u5 -> 0x086f }
            if (r0 == 0) goto L_0x0844
            java.lang.String r11 = r14.A01     // Catch:{ 24P | 6u5 -> 0x086f }
        L_0x0844:
            com.whatsapp.jid.UserJid r0 = r4.A0o()     // Catch:{ 24P | 6u5 -> 0x086f }
            if (r0 == 0) goto L_0x085f
            com.whatsapp.jid.UserJid r20 = r4.A0o()     // Catch:{ 24P | 6u5 -> 0x086f }
        L_0x084e:
            r17 = r21
            r18 = r1
            r21 = r10
            r22 = r11
            r23 = r19
            r24 = r3
            byte[] r3 = r17.A02(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ 24P | 6u5 -> 0x086f }
            goto L_0x0864
        L_0x085f:
            com.whatsapp.jid.UserJid r20 = X.AnonymousClass32Y.A03(r18)     // Catch:{ 24P | 6u5 -> 0x086f }
            goto L_0x084e
        L_0x0864:
            if (r3 != 0) goto L_0x0877
            goto L_0x078f
        L_0x0868:
            java.lang.String r0 = "FutureProofMessageProcessor/process/missing BotInfo"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 24P | 6u5 -> 0x086f }
            goto L_0x078f
        L_0x086f:
            r1 = move-exception
            java.lang.String r0 = "FutureProofMessageProcessor/process/unexpected error while processing BotMetadata"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            goto L_0x078f
        L_0x0877:
            X.1EU r0 = X.AnonymousClass1EU.A00(r3)     // Catch:{ 6u5 -> 0x09e8 }
            X.1EU r12 = X.C615231c.A00(r0)     // Catch:{ 6u5 -> 0x09e8 }
            X.1VX r1 = r7.A09     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            X.30C r11 = r7.A03     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            X.2ss r10 = r7.A04     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            X.2z0 r0 = r5.A1J     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            X.4uZ r0 = r0.A00     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            boolean r0 = X.C624835f.A04(r11, r10, r1, r0, r12)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 != 0) goto L_0x078f
            java.util.List r10 = X.C624835f.A01(r12)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            X.2qk r0 = r7.A00     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            boolean r0 = X.C624835f.A03(r0, r1, r12, r10)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 != 0) goto L_0x08a6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            java.lang.String r0 = "future-proof-message-handler/futureproof/invalidmessage:messageTypes="
            X.C18260x0.A1S(r1, r0, r10)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            goto L_0x078f
        L_0x08a6:
            X.2z0 r0 = r4.A1J     // Catch:{ 24W -> 0x09e0 }
            X.2z0 r10 = new X.2z0     // Catch:{ 24W -> 0x09e0 }
            r10.<init>(r0)     // Catch:{ 24W -> 0x09e0 }
            long r0 = r4.A0K     // Catch:{ 24W -> 0x09e0 }
            X.C18260x0.A0O(r12, r10)     // Catch:{ 24W -> 0x09e0 }
            X.2dX r11 = new X.2dX     // Catch:{ 24W -> 0x09e0 }
            r19 = r12
            r17 = r11
            r18 = r12
            r20 = r10
            r21 = r0
            r17.<init>(r18, r19, r20, r21)     // Catch:{ 24W -> 0x09e0 }
            X.4uZ r0 = r4.A0n()     // Catch:{ 24W -> 0x09e0 }
            r11.A04 = r0     // Catch:{ 24W -> 0x09e0 }
            r12 = 1
            r11.A0F = r12     // Catch:{ 24W -> 0x09e0 }
            r1 = 65536(0x10000, float:9.18355E-41)
            int r0 = r5.A0A     // Catch:{ 24W -> 0x09e0 }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ 24W -> 0x09e0 }
            r10 = 0
            if (r0 != 0) goto L_0x08e2
            r1 = 16384(0x4000, float:2.2959E-41)
            int r0 = r5.A0A     // Catch:{ 24W -> 0x09e0 }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)     // Catch:{ 24W -> 0x09e0 }
            if (r0 != 0) goto L_0x08e2
            r12 = 0
        L_0x08e2:
            r11.A0G = r12     // Catch:{ 24W -> 0x09e0 }
            int r1 = r4.A00     // Catch:{ 24W -> 0x09e0 }
            r0 = 79
            if (r1 != r0) goto L_0x08ec
            r11.A01 = r2     // Catch:{ 24W -> 0x09e0 }
        L_0x08ec:
            X.3Le r1 = r7.A0B     // Catch:{ 24W -> 0x09e0 }
            X.2rC r0 = r11.A01()     // Catch:{ 24W -> 0x09e0 }
            X.34x r2 = r1.A00(r0)     // Catch:{ 24W -> 0x09e0 }
            X.2z0 r1 = r2.A1J     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            X.4uZ r0 = r1.A00     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            boolean r0 = r0 instanceof X.C95804uY     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 == 0) goto L_0x0908
            X.4rH r0 = r7.A0E     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            boolean r0 = r0.A07(r2)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 != 0) goto L_0x0908
            goto L_0x078f
        L_0x0908:
            boolean r0 = r2 instanceof X.C30311mF     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 != 0) goto L_0x0938
            boolean r0 = X.C624134x.A0g(r2)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 == 0) goto L_0x0943
            X.4F4 r0 = r7.A02     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            r0.Bh1(r2, r3)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            X.2pu r3 = r2.A0t()     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            boolean r0 = X.C624134x.A0g(r2)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 == 0) goto L_0x0943
            if (r3 == 0) goto L_0x0943
            java.lang.Long r0 = r3.A03()     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 == 0) goto L_0x0933
            long r13 = r0.longValue()     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0943
        L_0x0933:
            java.lang.String r0 = "future-proof-message-handler/the message was inserted as orphan"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
        L_0x0938:
            X.3Lv r1 = r7.A05     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            java.util.List r0 = java.util.Collections.singletonList(r5)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            r1.A0k(r0, r10)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            goto L_0x078f
        L_0x0943:
            boolean r0 = r5.A1n()     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            r11 = 12
            if (r0 == 0) goto L_0x0950
            byte[] r0 = r5.A1a     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            r2.A1a = r0     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            goto L_0x095d
        L_0x0950:
            boolean r0 = X.C57632tx.A00(r5)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 == 0) goto L_0x095d
            X.4FV r3 = r7.A0A     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            java.lang.String r0 = "future-proof-message-handler/process"
            X.C59882xe.A00(r3, r0, r11)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
        L_0x095d:
            X.2xe r0 = r7.A0F     // Catch:{ 24W -> 0x096b }
            java.lang.Integer r3 = r0.A01(r2, r11)     // Catch:{ 24W -> 0x096b }
            if (r3 == 0) goto L_0x0971
            X.24W r0 = new X.24W     // Catch:{ 24W -> 0x096b }
            r0.<init>(r3)     // Catch:{ 24W -> 0x096b }
            throw r0     // Catch:{ 24W -> 0x096b }
        L_0x096b:
            r3 = move-exception
            java.lang.String r0 = "future-proof-message-handler/futureproof/invalidMessageSecret:"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
        L_0x0971:
            r2.A1Q(r5)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            boolean r0 = r2 instanceof X.C30331mH     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 == 0) goto L_0x09b4
            X.3dV r0 = r7.A07     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            X.4Fq r4 = r0.A04()     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            X.3Yo r3 = r4.Axl()     // Catch:{ all -> 0x09fa }
            r0 = 17
            r2.A1G(r0)     // Catch:{ all -> 0x09f0 }
            X.33f r0 = r7.A08     // Catch:{ all -> 0x09f0 }
            X.1mH r2 = (X.C30331mH) r2     // Catch:{ all -> 0x09f0 }
            int r1 = r0.A03(r2, r10)     // Catch:{ all -> 0x09f0 }
            boolean r0 = X.AnonymousClass31T.A00(r1)     // Catch:{ all -> 0x09f0 }
            if (r0 != 0) goto L_0x099b
            r0 = 5
            if (r1 == r0) goto L_0x099b
            r0 = 7
            if (r1 != r0) goto L_0x09a9
        L_0x099b:
            X.3Lv r1 = r7.A05     // Catch:{ all -> 0x09f0 }
            java.util.List r0 = java.util.Collections.singletonList(r5)     // Catch:{ all -> 0x09f0 }
            r1.A0k(r0, r10)     // Catch:{ all -> 0x09f0 }
            java.lang.String r0 = "future-proof-message-handler/futureproof successfully processed FMessageAddOn"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x09f0 }
        L_0x09a9:
            r3.A00()     // Catch:{ all -> 0x09f0 }
            r3.close()     // Catch:{ all -> 0x09fa }
            r4.close()     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            goto L_0x078f
        L_0x09b4:
            boolean r0 = X.C624134x.A0d(r2)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 == 0) goto L_0x09d3
            byte[] r0 = r4.A02     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            if (r0 != 0) goto L_0x09d3
            X.3Lv r1 = r7.A05     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            java.util.List r0 = java.util.Collections.singletonList(r5)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            r1.A0k(r0, r10)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            X.2qj r0 = r7.A06     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            r0.A03(r2)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            java.lang.String r0 = "future-proof-message-handler/futureproof successfully processed edited message"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            goto L_0x078f
        L_0x09d3:
            java.util.Map r0 = r7.A0H     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            r0.put(r1, r2)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            X.3Lv r1 = r7.A05     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            r0 = 6
            r1.A0b(r2, r0)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            goto L_0x078f
        L_0x09e0:
            r1 = move-exception
            java.lang.String r0 = "future-proof-message-handler/futureproof/badMessage:"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            goto L_0x078f
        L_0x09e8:
            r1 = move-exception
            java.lang.String r0 = "future-proof-message-handler/futureproof/invalidproto/"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
            goto L_0x078f
        L_0x09f0:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x09f5 }
            goto L_0x09f9
        L_0x09f5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09fa }
        L_0x09f9:
            throw r1     // Catch:{ all -> 0x09fa }
        L_0x09fa:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x09ff }
            goto L_0x0a03
        L_0x09ff:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
        L_0x0a03:
            throw r1     // Catch:{ SQLiteDiskIOException -> 0x0a0b }
        L_0x0a04:
            r15.close()     // Catch:{ all -> 0x0a1f }
            r16.close()     // Catch:{ SQLiteException -> 0x0a29 }
            goto L_0x0a2f
        L_0x0a0b:
            r2 = move-exception
            X.1hj r1 = r8.A00     // Catch:{ all -> 0x0a13 }
            r0 = 1
            r1.A08(r0)     // Catch:{ all -> 0x0a13 }
            throw r2     // Catch:{ all -> 0x0a13 }
        L_0x0a13:
            r1 = move-exception
            if (r15 == 0) goto L_0x0a1e
            r15.close()     // Catch:{ all -> 0x0a1a }
            goto L_0x0a1e
        L_0x0a1a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0a1f }
        L_0x0a1e:
            throw r1     // Catch:{ all -> 0x0a1f }
        L_0x0a1f:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0a24 }
            goto L_0x0a28
        L_0x0a24:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x0a29 }
        L_0x0a28:
            throw r1     // Catch:{ SQLiteException -> 0x0a29 }
        L_0x0a29:
            r1 = move-exception
            java.lang.String r0 = "futuremsgstore/future/db/unavailable"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0a2f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "futuremsgstore/future/size:"
            X.C18260x0.A0y(r0, r1, r6)
            java.lang.String r0 = "future-proof-handler/futureproof done checking for processable messages"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.8qC r0 = r9.A0J
            X.33p r1 = X.C18320x8.A0J(r0)
            r0 = 0
            r1.A1o(r0)
            return
        L_0x0a48:
            java.lang.Object r0 = r1.A00
            X.2sT r0 = (X.C56732sT) r0
            r0.A05()
            return
        L_0x0a50:
            java.lang.Object r0 = r1.A00
            X.2sT r0 = (X.C56732sT) r0
            r0.A03()
            return
        L_0x0a58:
            java.lang.Object r1 = r1.A00
            X.2sT r1 = (X.C56732sT) r1
            android.os.Handler r0 = r1.A07
            X.C626936e.A02(r0)
            X.4EW r1 = r1.A03
            if (r1 != 0) goto L_0x0a6b
            java.lang.String r0 = "ClientPingManager/handlePingRequestTimeout: connection thread is not ready"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0a6b:
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.String r0 = "ConnectionThread/MessageServiceHandler/sendPingTimeout"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 8
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.sendToTarget()
            return
        L_0x0a7c:
            java.lang.Object r2 = r1.A00
            X.2sT r2 = (X.C56732sT) r2
            java.lang.String r0 = "ClientPingManager/ping-response"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r0 = r2.A07
            X.C626936e.A02(r0)
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0a94
            java.lang.String r0 = "ClientPingManager/ping-response; ping already timed out, ping response is ignored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0a94:
            r0 = 0
            r2.A0G = r0
            r2.A02()
            r2.A06()
            return
        L_0x0a9f:
            java.lang.Object r0 = r1.A00
            com.whatsapp.mentions.MentionPickerView r0 = (com.whatsapp.mentions.MentionPickerView) r0
            com.whatsapp.mentions.MentionPickerView.A01(r0)
            return
        L_0x0aa7:
            java.lang.Object r0 = r1.A00
            X.3CN r0 = (X.AnonymousClass3CN) r0
            r0.A00()
            return
        L_0x0aaf:
            java.lang.String r0 = "MemoryLeakReporter. Forcing GC"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            r0 = 100
            android.os.SystemClock.sleep(r0)
            java.lang.String r0 = "MemoryLeakReporter. Forcing finalization"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.runFinalization()
            r5.A00()
            X.3dY r9 = r5.A03
            java.lang.Object r2 = r9.get()
            X.2H5 r2 = (X.AnonymousClass2H5) r2
            monitor-enter(r2)
            java.util.List r0 = r2.A00     // Catch:{ all -> 0x0b90 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0b90 }
        L_0x0ade:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0b90 }
            if (r0 == 0) goto L_0x0af4
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0b90 }
            X.3fF r0 = (X.C73283fF) r0     // Catch:{ all -> 0x0b90 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0b90 }
            if (r0 != 0) goto L_0x0ade
            r1.remove()     // Catch:{ all -> 0x0b90 }
            goto L_0x0ade
        L_0x0af4:
            monitor-exit(r2)
            com.whatsapp.util.Log.d((java.lang.String) r3)
            long r13 = android.os.SystemClock.elapsedRealtime()
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.concurrent.ConcurrentHashMap r7 = r5.A05
            java.util.Iterator r12 = X.AnonymousClass001.A0u(r7)
        L_0x0b06:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0b5e
            java.lang.Object r6 = X.AnonymousClass0x2.A0W(r12)
            X.3fF r6 = (X.C73283fF) r6
            java.lang.Object r10 = r6.get()
            java.lang.ref.WeakReference r0 = r6.A03
            java.lang.Object r11 = r0.get()
            long r0 = r6.A01
            long r3 = r13 - r0
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0b06
            if (r10 == 0) goto L_0x0b06
            if (r11 != 0) goto L_0x0b06
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MemoryLeakReporter. Found LEAK "
            r1.append(r0)
            java.lang.String r4 = r6.A02
            X.C18260x0.A1J(r1, r4)
            r8.add(r10)
            java.lang.Object r3 = r9.get()
            X.2H5 r3 = (X.AnonymousClass2H5) r3
            monitor-enter(r3)
            java.lang.Object r0 = X.AnonymousClass002.A0D()     // Catch:{ all -> 0x0b5b }
            r6.A00 = r0     // Catch:{ all -> 0x0b5b }
            java.util.List r2 = r3.A00     // Catch:{ all -> 0x0b5b }
            int r1 = r2.size()     // Catch:{ all -> 0x0b5b }
            r0 = 100
            if (r1 >= r0) goto L_0x0b56
            r2.add(r6)     // Catch:{ all -> 0x0b5b }
        L_0x0b56:
            monitor-exit(r3)
            r7.remove(r4)
            goto L_0x0b06
        L_0x0b5b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0b5e:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0b87
            java.util.Iterator r4 = r8.iterator()
        L_0x0b68:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0b8c
            java.lang.Object r1 = r4.next()
            X.5ZC r0 = r5.A01
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0b68
            X.2qk r3 = r5.A00
            java.lang.String r2 = X.AnonymousClass000.A0O(r1)
            r1 = 0
            java.lang.String r0 = "leak-detected-v3"
            r3.A0A(r0, r1, r2)
            goto L_0x0b68
        L_0x0b87:
            java.lang.String r0 = "MemoryLeakReporter. No leaks detected"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0b8c:
            r0 = 0
            r5.A06 = r0
            return
        L_0x0b90:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0b93:
            java.lang.Object r0 = r1.A00
            android.view.View r0 = (android.view.View) r0
            X.C04910Rd.A01(r0, (android.graphics.Rect) null)
            return
        L_0x0b9b:
            java.lang.Object r1 = r1.A00
            com.whatsapp.mediaview.MediaViewFragment r1 = (com.whatsapp.mediaview.MediaViewFragment) r1
            int r0 = r1.A04
            r1.A1h(r0)
            return
        L_0x0ba5:
            java.lang.Object r0 = r1.A00
            com.whatsapp.mediaview.MediaViewBaseFragment r0 = (com.whatsapp.mediaview.MediaViewBaseFragment) r0
            r0.A1P()
            return
        L_0x0bad:
            java.lang.Object r0 = r1.A00
            X.8GQ r0 = (X.AnonymousClass8GQ) r0
            X.4Wu r4 = r0.A00
            r3 = 0
            r4.A00 = r3
            r2 = 0
        L_0x0bb7:
            boolean[] r1 = r4.A02
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0bc1
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x0bb7
        L_0x0bc1:
            r4.A05()
            return
        L_0x0bc5:
            java.lang.Object r0 = r1.A00
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.setTooltipInPosition$lambda$14(r0)
            return
        L_0x0bcd:
            java.lang.Object r4 = r1.A00
            com.whatsapp.mediacomposer.doodle.DoodleView r4 = (com.whatsapp.mediacomposer.doodle.DoodleView) r4
            X.5US r2 = r4.A0I
            java.util.List r0 = r2.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x0bd9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0bf0
            java.lang.Object r0 = r1.next()
            X.5Uw r0 = (X.C105425Uw) r0
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x0bd9
            X.5Xo r0 = r4.A0F
            r0.A01()
        L_0x0bf0:
            boolean r0 = r2.A06()
            android.os.Handler r3 = r4.A0E
            java.lang.Runnable r2 = r4.A0J
            if (r0 == 0) goto L_0x0c00
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x0c00:
            r3.removeCallbacks(r2)
            return
        L_0x0c04:
            java.lang.Object r6 = r1.A00
            com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment r6 = (com.whatsapp.mediacomposer.bottomsheet.ImageQualitySettingsBottomSheetFragment) r6
            X.2OS r5 = r6.A01
            if (r5 == 0) goto L_0x0c84
            X.5YF r0 = r6.A02
            android.net.Uri r11 = r0.A0G
            X.C162457s7.A0D(r11)
            r7 = 2
            int[] r4 = new int[r7]
            r4 = {3, 0} // fill-array
            r10 = 0
            r9 = 1
            java.util.HashMap r3 = X.AnonymousClass001.A0t()
            r2 = 0
        L_0x0c20:
            r8 = r4[r2]
            X.2r1 r1 = r5.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            X.7Td r18 = r1.A00(r0, r9, r10)
            if (r18 == 0) goto L_0x0c6f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r1 = "temp_file"
            java.lang.String r0 = ".jpeg"
            java.io.File r19 = java.io.File.createTempFile(r1, r0)
            X.3QM r14 = new X.3QM
            r14.<init>()
            java.lang.String r20 = r11.toString()
            X.4FV r0 = r5.A00
            X.7kZ r13 = new X.7kZ
            r13.<init>(r0)
            X.3QP r16 = new X.3QP
            r16.<init>()
            r15 = 0
            X.3QQ r17 = new X.3QQ
            r17.<init>()
            X.6kg r12 = new X.6kg
            r22 = r10
            r21 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.2dY r0 = r5.A02
            X.8Mn r0 = r0.A00(r12)
            r0.run()
            long r0 = r19.length()
            X.AnonymousClass0x2.A1J(r8, r3, r0)
        L_0x0c6f:
            int r2 = r2 + 1
            if (r2 < r7) goto L_0x0c20
            X.3Wi r1 = r6.A02
            if (r1 == 0) goto L_0x0c7d
            r0 = 35
            X.C69263Wi.A0A(r1, r6, r3, r0)
            return
        L_0x0c7d:
            java.lang.String r0 = "globalUi"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0c84:
            java.lang.String r0 = "imageTranscoderHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0c8b:
            java.lang.Object r0 = r1.A00
            X.5nZ r0 = (X.C114765nZ) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A06
            r0 = 0
            goto L_0x0c9a
        L_0x0c93:
            java.lang.Object r0 = r1.A00
            X.5nZ r0 = (X.C114765nZ) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A06
            r0 = 4
        L_0x0c9a:
            r1.setVisibility(r0)
            return
        L_0x0c9e:
            X.3Ek r2 = r8.A01
            X.1WW r1 = new X.1WW
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r1.A00 = r0
            X.C64663Ek.A05(r2, r1)
            r7.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70013Zn.run():void");
    }
}
