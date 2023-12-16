package X;

import java.util.Map;

/* renamed from: X.3Dr  reason: invalid class name and case insensitive filesystem */
public class C64483Dr implements AnonymousClass4CM, AnonymousClass4DA {
    public final C116985rC A00;
    public final C116985rC A01;
    public final C116985rC A02;
    public final C116985rC A03;
    public final C116985rC A04;
    public final C116985rC A05;
    public final C116985rC A06;
    public final C116985rC A07;
    public final C116985rC A08;
    public final C55682qk A09;
    public final C69263Wi A0A;
    public final C56972sr A0B;
    public final C620433g A0C;
    public final C29291ia A0D;
    public final C46592bt A0E;
    public final C29221iT A0F;
    public final C105405Uu A0G;
    public final C56422rx A0H;
    public final C64223Cq A0I;
    public final C56612sH A0J;
    public final C54292oU A0K;
    public final AnonymousClass33p A0L;
    public final C66543Lv A0M;
    public final AnonymousClass1VX A0N;
    public final AnonymousClass4FV A0O;
    public final AnonymousClass33S A0P;
    public final C55892r5 A0Q;
    public final AnonymousClass5JS A0R;
    public final C59952xl A0S;
    public final AnonymousClass4FS A0T;
    public final Map A0U = AnonymousClass001.A0t();

    public final void A00(String str) {
        ((C64333Db) AnonymousClass29x.A00(C64333Db.class, this.A0K.A00)).AcK.A00.A1a.get();
        C55682qk r2 = this.A09;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("notificationType = ");
        A0o.append(str);
        A0o.append("; isSMB = ");
        A0o.append(false);
        r2.A0A("BusinessNotificationHandler/isSmbNotificationAllowed Trying to show a NUX Upsell notification to a not eligible user", false, AnonymousClass000.A0b("; DirectoryEnabled = ", A0o, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0164, code lost:
        if (r2 == null) goto L_0x0166;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BFA(android.os.Message r25, int r26) {
        /*
            r24 = this;
            r0 = 202(0xca, float:2.83E-43)
            r3 = 0
            r1 = r26
            if (r1 != r0) goto L_0x0104
            r0 = r25
            java.lang.Object r12 = r0.obj
            X.36K r12 = (X.AnonymousClass36K) r12
            android.os.Bundle r1 = r0.getData()
            java.lang.String r0 = "stanzaKey"
            android.os.Parcelable r4 = r1.getParcelable(r0)
            X.39T r4 = (X.AnonymousClass39T) r4
            r0 = r24
            X.2r5 r1 = r0.A0Q
            X.1gR r2 = X.C55892r5.A00(r1, r4)
            if (r2 == 0) goto L_0x0032
            X.36K r1 = r12.A0k(r3)
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = r1.A00
            r2.A00 = r1
        L_0x002e:
            r1 = 3
            r2.A03(r1)
        L_0x0032:
            java.lang.String r1 = "verified_name"
            X.36K r8 = r12.A0l(r1)
            java.lang.String r1 = "profile"
            X.36K r15 = r12.A0l(r1)
            java.lang.String r1 = "remove"
            X.36K r13 = r12.A0l(r1)
            java.lang.String r1 = "product_catalog"
            X.36K r9 = r12.A0l(r1)
            java.lang.String r1 = "linked_accounts"
            X.36K r19 = r12.A0l(r1)
            java.lang.String r1 = "suggestion"
            X.36K r7 = r12.A0l(r1)
            java.lang.String r1 = "directory"
            X.36K r11 = r12.A0l(r1)
            java.lang.String r1 = "report"
            X.36K r6 = r12.A0l(r1)
            java.lang.String r1 = "ctwa_suggestion"
            r12.A0l(r1)
            java.lang.String r1 = "biz_integrity_warning_notification"
            r12.A0l(r1)
            java.lang.String r1 = "subscriptions"
            X.36K r18 = r12.A0l(r1)
            java.lang.String r1 = "wa_ad_account_nonce"
            r12.A0l(r1)
            java.lang.String r1 = "privacy"
            X.36K r10 = r12.A0l(r1)
            java.lang.String r1 = "campaign"
            X.36K r17 = r12.A0l(r1)
            X.2xW r16 = X.C59812xW.A0F
            java.lang.String r5 = "hash"
            java.lang.String r14 = "jid"
            r1 = 0
            r3 = 1
            if (r8 == 0) goto L_0x010a
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.UserJid r13 = X.AnonymousClass36K.A0A(r8, r6, r14)
            java.lang.String r6 = "verified_level"
            r7 = 0
            java.lang.String r12 = r8.A0r(r6, r7)
            java.lang.String r6 = "serial"
            long r17 = r8.A0e(r6, r1)
            java.lang.String r1 = "v"
            java.lang.String r9 = r8.A0r(r1, r7)
            java.lang.String r1 = "host_storage"
            java.lang.String r10 = r8.A0r(r1, r7)
            java.lang.String r1 = "actual_actors"
            java.lang.String r6 = r8.A0r(r1, r7)
            java.lang.String r1 = "privacy_mode_ts"
            java.lang.String r2 = r8.A0r(r1, r7)
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "handleXmppMessage hostStorage: "
            r11.append(r1)
            r11.append(r10)
            java.lang.String r1 = ". actualActors:"
            r11.append(r1)
            r11.append(r6)
            java.lang.String r1 = ". privacy_mode_ts: "
            X.C18260x0.A0q(r1, r2, r11)
            X.3ZC r14 = new X.3ZC
            r14.<init>((java.lang.String) r10, (java.lang.String) r6, (java.lang.String) r2)
            if (r13 == 0) goto L_0x0105
            java.lang.String r1 = "1"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00ff
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L_0x00ff
            byte[] r15 = r8.A01
            int r16 = X.AnonymousClass28W.A00(r12)
            X.2bt r12 = r0.A0E
            r12.A00(r13, r14, r15, r16, r17)
        L_0x00ff:
            X.33S r0 = r0.A0P
            r0.A01(r4)
        L_0x0104:
            return r3
        L_0x0105:
            java.lang.String r5 = r8.A0r(r5, r7)
            goto L_0x0166
        L_0x010a:
            if (r15 == 0) goto L_0x0186
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass36K.A0A(r15, r1, r14)
            java.lang.String r5 = X.AnonymousClass36K.A0L(r15, r5)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L_0x015e
            if (r2 == 0) goto L_0x015e
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "businessnotificationhandler/get-biz-profile jid="
            X.C18260x0.A1R(r5, r1, r2)
            java.util.Map r9 = r0.A0U
            java.lang.String r1 = r2.getRawString()
            boolean r1 = r9.containsKey(r1)
            if (r1 == 0) goto L_0x03ae
            java.lang.String r1 = r2.getRawString()
            java.lang.Object r1 = X.C18320x8.A0Z(r9, r1)
            long r5 = X.C18310x6.A0B(r1)
            X.2sH r1 = r0.A0J
            long r7 = X.C56612sH.A03(r1, r5)
            r5 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x03ae
            X.33g r1 = r0.A0C
            X.5dt r11 = r1.A02(r2)
            X.3Wi r5 = r0.A0A
            r1 = 11
        L_0x0155:
            X.5rV r2 = new X.5rV
            r2.<init>(r0, r1, r11)
        L_0x015a:
            r5.A0S(r2)
            goto L_0x00ff
        L_0x015e:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x00ff
            if (r2 != 0) goto L_0x00ff
        L_0x0166:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            r2 = 0
            if (r1 != 0) goto L_0x00ff
            byte[] r1 = r5.getBytes()
            byte[] r5 = android.util.Base64.decode(r1, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "businessnotificationhandler/notifySidelistUpdate"
            r2.append(r1)
            java.lang.String r1 = java.util.Arrays.toString(r5)
            X.C18260x0.A1J(r2, r1)
            goto L_0x01a8
        L_0x0186:
            if (r13 == 0) goto L_0x01be
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r6 = r13.A0g(r1, r14)
            java.lang.String r2 = X.AnonymousClass36K.A0L(r13, r5)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x03c3
            if (r6 != 0) goto L_0x03c3
            byte[] r2 = r2.getBytes()
            r1 = 0
            byte[] r5 = android.util.Base64.decode(r2, r1)
            java.lang.String r1 = "businessnotificationhandler//biz-removed-jidhash"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x01a8:
            X.227 r1 = X.AnonymousClass227.A0J
            X.2zU r2 = new X.2zU
            r2.<init>(r1)
            r2.A02 = r3
            r1 = r16
            X.2zz r2 = X.C60982zU.A00(r2, r1, r5)
            X.3Cq r1 = r0.A0I
            r1.A03(r2, r3)
            goto L_0x00ff
        L_0x01be:
            if (r9 == 0) goto L_0x0247
            java.lang.String r1 = "product"
            X.36K r5 = r9.A0l(r1)
            if (r5 == 0) goto L_0x03dd
            java.lang.String r1 = "businessnotificationhandler/product-changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r1 = "id"
            X.36K r2 = r5.A0l(r1)
            java.lang.String r1 = "status_info"
            X.36K r8 = r5.A0l(r1)
            r7 = 0
            if (r8 != 0) goto L_0x023f
            r1 = r7
        L_0x01df:
            if (r2 != 0) goto L_0x023a
            r6 = r7
        L_0x01e2:
            if (r1 != 0) goto L_0x0235
            r5 = r7
        L_0x01e5:
            if (r8 != 0) goto L_0x0221
            r1 = r7
        L_0x01e8:
            r8 = r7
        L_0x01e9:
            if (r1 == 0) goto L_0x01ef
            java.lang.String r7 = r1.A0n()
        L_0x01ef:
            boolean r1 = X.C107575bX.A0F(r6)
            if (r1 != 0) goto L_0x00ff
            boolean r1 = X.C107575bX.A0F(r5)
            if (r1 != 0) goto L_0x00ff
            X.5Uu r2 = r0.A0G
            r1 = 0
            X.5dw r1 = r2.A08(r1, r6)
            if (r1 == 0) goto L_0x00ff
            int r5 = X.AnonymousClass255.A00(r5)
            X.38u r2 = r1.A01
            if (r2 == 0) goto L_0x00ff
            int r1 = r2.A00
            if (r1 == r5) goto L_0x00ff
            r2.A00 = r5
            r2.A02 = r8
            r2.A01 = r7
            X.3Wi r5 = r0.A0A
            r1 = 11
            X.3bv r2 = new X.3bv
            r2.<init>(r1, r6, r0)
            goto L_0x015a
        L_0x0221:
            java.lang.String r1 = "reject_reason"
            X.36K r2 = r8.A0l(r1)
            java.lang.String r1 = "commerce_url"
            X.36K r1 = r8.A0l(r1)
            if (r2 == 0) goto L_0x01e8
            java.lang.String r8 = r2.A0n()
            goto L_0x01e9
        L_0x0235:
            java.lang.String r5 = r1.A0n()
            goto L_0x01e5
        L_0x023a:
            java.lang.String r6 = r2.A0n()
            goto L_0x01e2
        L_0x023f:
            java.lang.String r1 = "status"
            X.36K r1 = r8.A0l(r1)
            goto L_0x01df
        L_0x0247:
            if (r19 != 0) goto L_0x00ff
            java.lang.String r5 = "notif_sub_type"
            r13 = 1000(0x3e8, double:4.94E-321)
            if (r7 == 0) goto L_0x02dd
            r9 = 0
            r7.A0r(r5, r9)
            java.lang.String r8 = "cross_sell_smb_app"
            java.lang.String r5 = r7.A0r(r5, r9)
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x02dd
            java.lang.String r1 = "t"
            java.lang.String r5 = r12.A0r(r1, r9)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 / r13
            long r5 = X.C615531h.A04(r5, r1)
            java.lang.String r1 = "config"
            X.36K r10 = r7.A0m(r1)
            java.lang.String r1 = "revoke"
            java.lang.String r1 = r10.A0r(r1, r9)
            boolean r8 = java.lang.Boolean.parseBoolean(r1)
            X.4FV r2 = r0.A0O
            X.33p r1 = r0.A0L
            X.2XU r7 = new X.2XU
            r7.<init>(r1, r2)
            if (r8 == 0) goto L_0x0426
            r8 = 0
            X.33p r6 = r7.A00
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r6)
            java.lang.String r1 = "biz_app_cross_sell_banner_click_count"
            X.C18270x1.A0h(r2, r1, r8)
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r6)
            java.lang.String r1 = "biz_app_cross_sell_banner_dismiss_count"
            X.C18270x1.A0h(r2, r1, r8)
            r1 = 4
            r7.A00(r1)
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r6)
            java.lang.String r1 = "biz_app_cross_sell_banner_expiry_days"
            X.C18270x1.A0h(r2, r1, r8)
            java.lang.String r5 = "biz_app_cross_sell_banner_notif_time"
            r1 = 0
            X.C18260x0.A0M(r6, r5, r1)
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r6)
            java.lang.String r1 = "biz_app_cross_sell_banner_total_days"
            X.C18270x1.A0h(r2, r1, r8)
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r6)
            java.lang.String r1 = "biz_app_cross_sell_banner_consecutive_days"
            X.C18270x1.A0h(r2, r1, r8)
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r6)
            java.lang.String r1 = "biz_app_cross_sell_banner_cool_off_days"
            X.C18270x1.A0h(r2, r1, r8)
            r1 = 5
            r7.A00(r1)
            java.lang.String r5 = "biz_app_upsell_banner_timestamp"
            r1 = -1
            X.C18260x0.A0M(r6, r5, r1)
            goto L_0x00ff
        L_0x02dd:
            if (r11 == 0) goto L_0x032b
            java.lang.String r1 = "type"
            java.lang.String r6 = X.AnonymousClass36K.A0L(r11, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x0328
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r5 = r6.toUpperCase(r1)
            int r1 = r5.hashCode()
            switch(r1) {
                case -1786066693: goto L_0x031b;
                case -1344839652: goto L_0x0318;
                case -257068618: goto L_0x030b;
                case 1260847406: goto L_0x0308;
                default: goto L_0x02f9;
            }
        L_0x02f9:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "BusinessNotificationHandler/handleDirectoryNotification notification not supported: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r1, r6, r2)
        L_0x0303:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x00ff
        L_0x0308:
            java.lang.String r1 = "PREPARE_FOR_CONSUMER_LAUNCH"
            goto L_0x031d
        L_0x030b:
            java.lang.String r2 = "STATUS_UPDATE"
            boolean r1 = r5.equals(r2)
            if (r1 == 0) goto L_0x02f9
            r0.A00(r2)
            goto L_0x00ff
        L_0x0318:
            java.lang.String r1 = "CONSUMER_LAUNCH"
            goto L_0x031d
        L_0x031b:
            java.lang.String r1 = "NUX_UPSELL"
        L_0x031d:
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x02f9
            r0.A00(r6)
            goto L_0x00ff
        L_0x0328:
            java.lang.String r1 = "BusinessNotificationHandler/handleDirectoryNotification notification type is null"
            goto L_0x0303
        L_0x032b:
            if (r6 == 0) goto L_0x0448
            java.lang.String r5 = "creation"
            long r20 = r6.A0e(r5, r1)
            long r20 = r20 * r13
            X.2sH r5 = r0.A0J
            long r22 = X.C56612sH.A05(r5, r6)
            java.lang.String r5 = "url"
            X.36K r12 = r6.A0l(r5)
            java.lang.String r5 = "direct_path"
            X.36K r11 = r6.A0l(r5)
            java.lang.String r5 = "file_name"
            X.36K r10 = r6.A0l(r5)
            java.lang.String r5 = "file_length"
            X.36K r9 = r6.A0l(r5)
            java.lang.String r5 = "media_key"
            X.36K r8 = r6.A0l(r5)
            java.lang.String r5 = "file_sha256"
            X.36K r7 = r6.A0l(r5)
            java.lang.String r5 = "file_enc_sha256"
            X.36K r6 = r6.A0l(r5)
            if (r12 == 0) goto L_0x050a
            if (r10 == 0) goto L_0x050a
            if (r9 == 0) goto L_0x050a
            if (r7 == 0) goto L_0x050a
            if (r6 == 0) goto L_0x050a
            if (r8 == 0) goto L_0x050a
            if (r11 == 0) goto L_0x050a
            java.lang.String r5 = r9.A0n()
            long r18 = X.C615531h.A04(r5, r1)
            java.lang.String r12 = r12.A0n()
            java.lang.String r13 = r11.A0n()
            X.C626936e.A06(r13)
            java.lang.String r14 = r10.A0n()
            X.C626936e.A06(r14)
            java.lang.String r15 = r8.A0n()
            X.C626936e.A06(r15)
            java.lang.String r16 = r7.A0n()
            X.C626936e.A06(r16)
            java.lang.String r17 = r6.A0n()
            X.C626936e.A06(r17)
            X.7xn r11 = new X.7xn
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r20, r22)
            X.3Wi r5 = r0.A0A
            r1 = 12
            goto L_0x0155
        L_0x03ae:
            java.lang.String r7 = r2.getRawString()
            X.2sH r1 = r0.A0J
            long r5 = r1.A0H()
            X.AnonymousClass0x2.A1K(r7, r9, r5)
            X.33g r5 = r0.A0C
            r1 = 0
            r5.A08(r0, r2, r1)
            goto L_0x00ff
        L_0x03c3:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x00ff
            if (r6 == 0) goto L_0x00ff
            java.lang.String r1 = "businessnotificationhandler/biz-removed-jid"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.4FS r5 = r0.A0T
            r2 = 44
            X.8Mj r1 = new X.8Mj
            r1.<init>(r0, r6, r4, r2)
            r5.BkM(r1)
            return r3
        L_0x03dd:
            X.1VX r5 = r0.A0N
            r2 = 451(0x1c3, float:6.32E-43)
            X.2vE r1 = X.C58422vE.A02
            boolean r1 = r5.A0Y(r1, r2)
            if (r1 == 0) goto L_0x00ff
            java.lang.String r1 = "collection"
            X.36K r2 = r9.A0l(r1)
            if (r2 == 0) goto L_0x00ff
            java.lang.String r1 = "businessnotificationhandler/collection-changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2sr r1 = r0.A0B
            com.whatsapp.jid.PhoneUserJid r11 = X.C56972sr.A04(r1)
            if (r11 == 0) goto L_0x0104
            java.lang.String r1 = "id"
            java.lang.String r6 = X.AnonymousClass36K.A0L(r2, r1)
            java.lang.String r1 = "status_info"
            X.36K r2 = r2.A0l(r1)
            boolean r1 = X.C107575bX.A0F(r6)
            if (r1 != 0) goto L_0x00ff
            if (r2 == 0) goto L_0x00ff
            X.2gP r1 = X.C59082wK.A00(r2)
            X.5Uu r5 = r0.A0G
            X.2gz r7 = r5.A06(r11, r6)
            if (r7 == 0) goto L_0x04fd
            r7.A00 = r1
            X.C162457s7.A0J(r6, r3)
            monitor-enter(r5)
            goto L_0x0496
        L_0x0426:
            java.lang.String r1 = "expires_in"
            java.lang.String r2 = r10.A0r(r1, r9)
            r1 = 30
            int r8 = X.C615531h.A01(r2, r1)
            r1 = 4
            r7.A00(r1)
            X.33p r7 = r7.A00
            android.content.SharedPreferences$Editor r2 = X.C18270x1.A03(r7)
            java.lang.String r1 = "biz_app_cross_sell_banner_expiry_days"
            X.C18270x1.A0h(r2, r1, r8)
            java.lang.String r1 = "biz_app_cross_sell_banner_notif_time"
            X.C18260x0.A0M(r7, r1, r5)
            goto L_0x00ff
        L_0x0448:
            if (r18 == 0) goto L_0x045c
            X.5rC r2 = r0.A08
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x00ff
            r2.A04()
            java.lang.String r0 = "handleSubscriptionNotification"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x045c:
            if (r10 == 0) goto L_0x0481
            java.lang.String r1 = "smb_data_sharing_with_meta_consent"
            X.36K r5 = r10.A0l(r1)
            if (r5 == 0) goto L_0x00ff
            X.5rC r2 = r0.A04
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x00ff
            r2.A04()
            java.lang.String r1 = "value"
            r0 = 0
            r5.A0r(r1, r0)
            java.lang.String r0 = "setLocalSmbDataSharingSetting"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0481:
            if (r17 == 0) goto L_0x00ff
            X.5rC r2 = r0.A01
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x00ff
            r2.A04()
            java.lang.String r0 = "shouldHandlerNotification"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0496:
            X.7OX r10 = r5.A02(r11)     // Catch:{ all -> 0x04f9 }
            X.7OX r1 = r5.A02(r11)     // Catch:{ all -> 0x04f7 }
            java.util.Map r1 = r1.A05     // Catch:{ all -> 0x04f7 }
            java.lang.Object r9 = r1.get(r6)     // Catch:{ all -> 0x04f7 }
            X.7Gt r9 = (X.C148057Gt) r9     // Catch:{ all -> 0x04f7 }
            if (r9 == 0) goto L_0x04db
            r9.A01 = r7     // Catch:{ all -> 0x04f9 }
            java.util.List r1 = r7.A04     // Catch:{ all -> 0x04f9 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x04f9 }
        L_0x04b0:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x04f9 }
            if (r1 == 0) goto L_0x04d1
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x04f9 }
            X.5dw r4 = (X.C109015dw) r4     // Catch:{ all -> 0x04f9 }
            java.util.Map r3 = r5.A02     // Catch:{ all -> 0x04f9 }
            java.lang.String r2 = r4.A0F     // Catch:{ all -> 0x04f9 }
            X.2eo r1 = new X.2eo     // Catch:{ all -> 0x04f9 }
            r1.<init>(r11, r2)     // Catch:{ all -> 0x04f9 }
            r3.put(r1, r4)     // Catch:{ all -> 0x04f9 }
            java.util.Map r1 = r5.A03     // Catch:{ all -> 0x04f9 }
            X.C162457s7.A0C(r2)     // Catch:{ all -> 0x04f9 }
            r1.put(r2, r11)     // Catch:{ all -> 0x04f9 }
            goto L_0x04b0
        L_0x04d1:
            java.util.Map r2 = r10.A05     // Catch:{ all -> 0x04f9 }
            r2.remove(r6)     // Catch:{ all -> 0x04f9 }
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x04f9 }
            r2.put(r1, r9)     // Catch:{ all -> 0x04f9 }
        L_0x04db:
            java.util.List r4 = r10.A04     // Catch:{ all -> 0x04f9 }
            int r3 = r4.size()     // Catch:{ all -> 0x04f9 }
            r2 = 0
        L_0x04e2:
            if (r2 >= r3) goto L_0x04fc
            java.lang.Object r1 = r4.get(r2)     // Catch:{ all -> 0x04f9 }
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x04f9 }
            if (r1 == 0) goto L_0x04f4
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x04f9 }
            r4.set(r2, r1)     // Catch:{ all -> 0x04f9 }
            goto L_0x04fc
        L_0x04f4:
            int r2 = r2 + 1
            goto L_0x04e2
        L_0x04f7:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x04f9 }
        L_0x04f9:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x04fc:
            monitor-exit(r5)
        L_0x04fd:
            X.5rC r0 = r0.A02
            r0.A04()
            java.lang.String r0 = "updateBizCollection"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x050a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64483Dr.BFA(android.os.Message, int):boolean");
    }

    public C64483Dr(C116985rC r2, C116985rC r3, C116985rC r4, C116985rC r5, C116985rC r6, C116985rC r7, C116985rC r8, C116985rC r9, C116985rC r10, C55682qk r11, C69263Wi r12, C56972sr r13, C620433g r14, C29291ia r15, C46592bt r16, C29221iT r17, C105405Uu r18, C56422rx r19, C64223Cq r20, C56612sH r21, C54292oU r22, AnonymousClass33p r23, C66543Lv r24, AnonymousClass1VX r25, AnonymousClass4FV r26, AnonymousClass33S r27, C55892r5 r28, AnonymousClass5JS r29, C59952xl r30, AnonymousClass4FS r31) {
        this.A0J = r21;
        this.A0N = r25;
        this.A0A = r12;
        this.A09 = r11;
        this.A0T = r31;
        this.A0B = r13;
        this.A0K = r22;
        this.A0O = r26;
        this.A0P = r27;
        this.A0M = r24;
        this.A0F = r17;
        this.A05 = r2;
        this.A0E = r16;
        this.A0I = r20;
        this.A0G = r18;
        this.A0Q = r28;
        this.A08 = r3;
        this.A0H = r19;
        this.A0L = r23;
        this.A0C = r14;
        this.A03 = r4;
        this.A0D = r15;
        this.A0S = r30;
        this.A02 = r5;
        this.A0R = r29;
        this.A00 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r9;
        this.A01 = r10;
    }

    public int[] B81() {
        int[] A0E2 = C18330xA.A0E();
        A0E2[0] = 202;
        return A0E2;
    }

    public void BU1() {
    }

    public void BU2() {
    }
}
