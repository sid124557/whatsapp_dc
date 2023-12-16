package X;

/* renamed from: X.25S  reason: invalid class name */
public class AnonymousClass25S {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0095, code lost:
        if (r6 == 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0207, code lost:
        if (r3.getInt(r5) != 1) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x021d, code lost:
        if (r3.getInt(r5) != 1) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0233, code lost:
        if (r3.getInt(r5) != 1) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02e3, code lost:
        if (r3.getInt(r5) != 1) goto L_0x02e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3ZH A00(android.database.Cursor r21) {
        /*
            java.lang.String r0 = "jid"
            r3 = r21
            int r0 = r3.getColumnIndexOrThrow(r0)
            X.4uZ r0 = X.AnonymousClass0x2.A0K(r3, r0)
            X.3ZH r2 = new X.3ZH
            r2.<init>(r0)
            java.lang.String r0 = "status"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r3, r0)
            r2.A0X = r0
            java.lang.String r0 = "status_timestamp"
            long r0 = X.AnonymousClass0x2.A0C(r3, r0)
            r2.A0D = r0
            long r0 = X.C18270x1.A01(r3)
            r2.A0N(r0)
            java.lang.String r0 = "phone_type"
            int r0 = X.AnonymousClass0x2.A04(r3, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0L = r0
            java.lang.String r0 = "phone_label"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r3, r0)
            r2.A0V = r0
            java.lang.String r0 = "history_sync_initial_phash"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r3, r0)
            r2.A0S = r0
            java.lang.String r0 = "number"
            java.lang.String r8 = X.AnonymousClass0x2.A0Z(r3, r0)
            java.lang.String r0 = "raw_contact_id"
            long r4 = X.AnonymousClass0x2.A0C(r3, r0)
            r9 = -3
            r13 = 0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x006e
            r6 = -2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x006e
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x006e
            r6 = -5
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0082
        L_0x006e:
            if (r8 == 0) goto L_0x0082
            r0 = 5
            int r1 = r8.length()
            if (r0 > r1) goto L_0x0082
            r0 = 20
            if (r1 > r0) goto L_0x0082
            X.2k5 r0 = new X.2k5
            r0.<init>(r4, r8)
            r2.A0F = r0
        L_0x0082:
            X.4uZ r0 = r2.A0H
            boolean r6 = X.C627336j.A0L(r0)
            r1 = 0
            r0 = 1
            if (r6 == 0) goto L_0x009a
            r7 = -4
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0097
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            r4 = 0
            if (r6 != 0) goto L_0x0098
        L_0x0097:
            r4 = 1
        L_0x0098:
            r2.A0o = r4
        L_0x009a:
            java.lang.String r4 = "is_wa_created_contact"
            int r5 = r3.getColumnIndexOrThrow(r4)
            boolean r4 = r3.isNull(r5)
            if (r4 != 0) goto L_0x0386
            int r4 = r3.getInt(r5)
            boolean r4 = X.AnonymousClass000.A1U(r4, r0)
            r2.A0t = r4
        L_0x00b0:
            java.lang.String r4 = "sync_policy"
            int r5 = r3.getColumnIndexOrThrow(r4)
            boolean r4 = r3.isNull(r5)
            r7 = -1
            if (r4 != 0) goto L_0x0382
            int r4 = r3.getInt(r5)
            r2.A07 = r4
        L_0x00c4:
            java.lang.String r4 = "display_name"
            java.lang.String r5 = X.AnonymousClass0x2.A0Z(r3, r4)
            X.2k5 r4 = r2.A0F
            if (r4 != 0) goto L_0x037e
            boolean r4 = r2.A0U()
            if (r4 != 0) goto L_0x037e
            X.4uZ r4 = r2.A0H
            boolean r4 = r4 instanceof X.AnonymousClass1fS
            if (r4 != 0) goto L_0x037e
            boolean r4 = r2.A0o
            if (r4 != 0) goto L_0x037e
            int r4 = r2.A07
            if (r4 == r0) goto L_0x037e
            r2.A0N = r5
        L_0x00e4:
            java.lang.String r4 = "is_whatsapp_user"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A10 = r4
            java.lang.String r4 = "unseen_msg_count"
            int r4 = r3.getColumnIndexOrThrow(r4)
            r3.getInt(r4)
            java.lang.String r4 = "photo_ts"
            int r4 = X.AnonymousClass0x2.A04(r3, r4)
            r2.A05 = r4
            java.lang.String r4 = "thumb_ts"
            int r4 = X.AnonymousClass0x2.A04(r3, r4)
            r2.A06 = r4
            java.lang.String r4 = "photo_id_timestamp"
            long r4 = X.AnonymousClass0x2.A0C(r3, r4)
            r2.A0C = r4
            java.lang.String r4 = "given_name"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r3, r4)
            r2.A0R = r4
            java.lang.String r4 = "family_name"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r3, r4)
            r2.A0Q = r4
            java.lang.String r4 = "wa_name"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r3, r4)
            r2.A0b = r4
            java.lang.String r4 = "sort_name"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r3, r4)
            r2.A0W = r4
            java.lang.String r4 = "nickname"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r3, r4)
            r2.A0U = r4
            java.lang.String r4 = "company"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r3, r4)
            r2.A0O = r4
            java.lang.String r4 = "title"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r3, r4)
            r2.A0Z = r4
            java.lang.String r4 = "status_autodownload_disabled"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A15 = r4
            java.lang.String r4 = "keep_timestamp"
            long r4 = X.AnonymousClass0x2.A0C(r3, r4)
            r2.A0B = r4
            java.lang.String r4 = "is_spam_reported"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A0x = r4
            java.lang.String r4 = "description"
            java.lang.String r19 = X.AnonymousClass0x2.A0Z(r3, r4)
            r10 = 0
            if (r19 != 0) goto L_0x0348
            X.2zN r4 = X.C60912zN.A05
            r2.A0K = r4
        L_0x0173:
            java.lang.String r4 = "restrict_mode"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A14 = r4
            java.lang.String r4 = "announcement_group"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A0e = r4
            java.lang.String r4 = "no_frequently_forwarded"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A12 = r4
            java.lang.String r4 = "ephemeral_duration"
            int r4 = X.AnonymousClass0x2.A04(r3, r4)
            r2.A02 = r4
            java.lang.String r4 = "creator_jid"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r3, r4)
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass32Y.A08(r4)
            r2.A0I = r4
            java.lang.String r4 = "in_app_support"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A0j = r4
            java.lang.String r4 = "is_suspended"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A0s = r4
            java.lang.String r4 = "group_state"
            int r4 = X.AnonymousClass0x2.A04(r3, r4)
            r2.A03 = r4
            java.lang.String r4 = "require_membership_approval"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A13 = r4
            java.lang.String r4 = "member_add_mode"
            int r4 = X.AnonymousClass0x2.A04(r3, r4)
            r2.A04 = r4
            java.lang.String r4 = "incognito"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A0k = r4
            java.lang.String r4 = "is_pending_requests_banner_acknowledged"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A0v = r4
            java.lang.String r4 = "is_pending_suggestions_banner_acknowledged"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A0w = r4
            java.lang.String r4 = "is_name_group_banner_dismissed"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A11 = r4
            java.lang.String r4 = "addressing_mode"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r3, r4)
            java.lang.String r4 = X.C381125t.A00(r4)
            r2.A0M = r4
            java.lang.String r4 = "allow_non_admin_subgroup_creation"
            int r5 = r3.getColumnIndexOrThrow(r4)
            boolean r4 = r3.isNull(r5)
            if (r4 != 0) goto L_0x0209
            int r5 = r3.getInt(r5)
            r4 = 1
            if (r5 == r0) goto L_0x020a
        L_0x0209:
            r4 = 0
        L_0x020a:
            r2.A0d = r4
            java.lang.String r4 = "history_enabled"
            int r5 = r3.getColumnIndexOrThrow(r4)
            boolean r4 = r3.isNull(r5)
            if (r4 != 0) goto L_0x021f
            int r5 = r3.getInt(r5)
            r4 = 1
            if (r5 == r0) goto L_0x0220
        L_0x021f:
            r4 = 0
        L_0x0220:
            r2.A0i = r4
            java.lang.String r4 = "auto_add_disabled"
            int r5 = r3.getColumnIndexOrThrow(r4)
            boolean r4 = r3.isNull(r5)
            if (r4 != 0) goto L_0x0235
            int r5 = r3.getInt(r5)
            r4 = 1
            if (r5 == r0) goto L_0x0236
        L_0x0235:
            r4 = 0
        L_0x0236:
            r2.A0f = r4
            java.lang.String r4 = "verified_level"
            int r4 = X.AnonymousClass0x2.A04(r3, r4)
            r6 = 1
            if (r4 == r0) goto L_0x0249
            r6 = 2
            if (r4 == r6) goto L_0x0249
            r6 = 3
            if (r4 == r6) goto L_0x0249
            r6 = 0
        L_0x0249:
            r2.A08 = r6
            java.lang.String r4 = "verified_name"
            java.lang.String r16 = X.AnonymousClass0x2.A0Z(r3, r4)
            java.lang.String r5 = "identity_unconfirmed_since"
            int r4 = r3.getColumnIndexOrThrow(r5)
            boolean r8 = r3.isNull(r4)
            java.lang.String r4 = "issuer"
            java.lang.String r15 = X.AnonymousClass0x2.A0Z(r3, r4)
            if (r8 != 0) goto L_0x0322
            r2.A08 = r1
        L_0x0266:
            java.lang.String r4 = "serial"
            long r19 = X.AnonymousClass0x2.A0C(r3, r4)
            int r18 = X.AnonymousClass0x2.A04(r3, r5)
            java.lang.String r4 = "host_storage"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r3, r4)
            int r9 = X.C57462tg.A01(r4)
            java.lang.String r4 = "actual_actors"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r3, r4)
            int r8 = X.C57462tg.A00(r4)
            java.lang.String r4 = "privacy_mode_ts"
            long r4 = X.AnonymousClass0x2.A0C(r3, r4)
            X.3ZC r14 = new X.3ZC
            r14.<init>((int) r9, (long) r4, (int) r8)
            boolean r4 = r2 instanceof X.AnonymousClass1RT
            if (r4 == 0) goto L_0x031e
            java.lang.String r4 = "Setting verified name for ServerContact not allowed"
            X.C626936e.A0D(r1, r4)
        L_0x029a:
            r2.A0T = r15
            X.4uZ r4 = r2.A0H
            com.whatsapp.jid.UserJid r13 = X.AnonymousClass32Y.A05(r4)
            boolean r21 = X.C155477ey.A00(r13)
            X.2qS r12 = new X.2qS
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21)
            r2.A0E = r12
            java.lang.String r4 = "is_sidelist_synced"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A0z = r4
            java.lang.String r4 = "is_business_synced"
            boolean r4 = X.C18260x0.A1Z(r3, r4)
            r2.A0u = r4
            java.lang.String r4 = "disappearing_mode_duration"
            int r4 = X.AnonymousClass0x2.A04(r3, r4)
            r2.A01 = r4
            java.lang.String r4 = "disappearing_mode_timestamp"
            int r4 = X.AnonymousClass0x2.A04(r3, r4)
            long r4 = (long) r4
            r2.A09 = r4
            java.lang.String r4 = "is_report_to_admin_enabled"
            int r5 = r3.getColumnIndex(r4)
            if (r5 <= r7) goto L_0x02e5
            boolean r4 = r3.isNull(r5)
            if (r4 != 0) goto L_0x02e5
            int r5 = r3.getInt(r5)
            r4 = 1
            if (r5 == r0) goto L_0x02e6
        L_0x02e5:
            r4 = 0
        L_0x02e6:
            r2.A0q = r4
            java.lang.String r4 = "is_starred"
            int r5 = r3.getColumnIndexOrThrow(r4)
            boolean r4 = r3.isNull(r5)
            if (r4 != 0) goto L_0x031b
            int r4 = r3.getInt(r5)
            boolean r4 = X.AnonymousClass000.A1U(r4, r0)
            r2.A0r = r4
        L_0x02fe:
            java.lang.String r4 = "automated_type"
            int r4 = X.AnonymousClass0x2.A04(r3, r4)
            r2.A00 = r4
            java.lang.String r4 = "status_emoji"
            java.lang.String r4 = X.AnonymousClass0x2.A0Z(r3, r4)
            r2.A0Y = r4
            java.lang.String r4 = "is_contact_synced"
            int r3 = X.AnonymousClass0x2.A04(r3, r4)
            if (r3 != r0) goto L_0x0318
            r1 = 1
        L_0x0318:
            r2.A0l = r1
            return r2
        L_0x031b:
            r2.A0r = r1
            goto L_0x02fe
        L_0x031e:
            r2.A0a = r10
            goto L_0x029a
        L_0x0322:
            if (r16 == 0) goto L_0x0344
            java.lang.String r8 = "expires"
            int r4 = r3.getColumnIndexOrThrow(r8)
            boolean r4 = r3.isNull(r4)
            if (r4 != 0) goto L_0x0344
            long r11 = X.AnonymousClass0x2.A0C(r3, r8)
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0344
            long r8 = X.C18280x3.A07()
            int r4 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0344
            r2.A08 = r1
            goto L_0x0266
        L_0x0344:
            r10 = r16
            goto L_0x0266
        L_0x0348:
            java.lang.String r4 = "description_id_string"
            java.lang.String r18 = X.AnonymousClass0x2.A0Z(r3, r4)
            java.lang.String r4 = "description_setter_jid"
            java.lang.String r8 = X.AnonymousClass0x2.A0Z(r3, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r18)
            if (r4 == 0) goto L_0x035c
            r18 = r10
        L_0x035c:
            java.lang.String r4 = "description_time"
            int r4 = X.AnonymousClass0x2.A04(r3, r4)
            long r4 = (long) r4
            boolean r6 = android.text.TextUtils.isEmpty(r8)
            if (r6 == 0) goto L_0x0379
            r17 = r10
        L_0x036b:
            X.2zN r6 = new X.2zN
            r15 = r6
            r16 = r10
            r20 = r4
            r15.<init>(r16, r17, r18, r19, r20)
            r2.A0K = r6
            goto L_0x0173
        L_0x0379:
            com.whatsapp.jid.UserJid r17 = X.AnonymousClass32Y.A08(r8)
            goto L_0x036b
        L_0x037e:
            r2.A0P = r5
            goto L_0x00e4
        L_0x0382:
            r2.A07 = r7
            goto L_0x00c4
        L_0x0386:
            r2.A0t = r1
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25S.A00(android.database.Cursor):X.3ZH");
    }
}
