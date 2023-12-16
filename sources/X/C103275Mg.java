package X;

/* renamed from: X.5Mg  reason: invalid class name and case insensitive filesystem */
public class C103275Mg {
    public final C56612sH A00;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0090, code lost:
        if (X.C18300x5.A0B(r7).getBoolean("reg_profile_pic_tapped_key", false) != false) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C95114se A00(android.content.Context r9, X.AnonymousClass33p r10, X.AnonymousClass3ZH r11, java.lang.Integer r12, java.lang.Integer r13, java.lang.Integer r14, java.lang.Integer r15, boolean r16, boolean r17) {
        /*
            r8 = this;
            X.4se r4 = new X.4se
            r4.<init>()
            long r5 = java.lang.System.currentTimeMillis()
            X.8qC r7 = r10.A01
            android.content.SharedPreferences r3 = X.C18300x5.A0B(r7)
            java.lang.String r2 = "eula_accepted_time"
            r0 = 0
            long r2 = r3.getLong(r2, r0)
            java.lang.Long r2 = X.C18310x6.A0f(r5, r2)
            r4.A0B = r2
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r6 = X.C18300x5.A0B(r7)
            java.lang.String r5 = "message_store_verified_time"
            long r0 = r6.getLong(r5, r0)
            java.lang.Long r0 = X.C18310x6.A0f(r2, r0)
            r4.A0C = r0
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r7)
            java.lang.String r0 = "registration_attempt_skip_with_no_vertical"
            r2 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A01 = r0
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r7)
            java.lang.String r0 = "registration_retry_fetching_biz_profile"
            boolean r0 = r1.getBoolean(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A05 = r0
            r4.A09 = r12
            r4.A06 = r13
            X.0Tx r0 = new X.0Tx
            r0.<init>(r9)
            boolean r0 = r0.A01()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A00 = r0
            if (r14 != 0) goto L_0x0080
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r7)
            java.lang.String r2 = "reg_backup_status_key"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x011b
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r7)
            r0 = -1
            int r0 = r1.getInt(r2, r0)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
        L_0x0080:
            r4.A07 = r14
            r3 = 0
            if (r16 != 0) goto L_0x0092
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r7)
            java.lang.String r0 = "reg_profile_pic_tapped_key"
            boolean r1 = r1.getBoolean(r0, r3)
            r0 = 0
            if (r1 == 0) goto L_0x0093
        L_0x0092:
            r0 = 1
        L_0x0093:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A04 = r0
            if (r11 == 0) goto L_0x00c0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            r4.A03 = r0
            if (r17 == 0) goto L_0x00c0
            if (r15 != 0) goto L_0x00be
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r7)
            java.lang.String r2 = "reg_profile_pic_source_key"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0119
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r7)
            r0 = -1
            int r0 = r1.getInt(r2, r0)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
        L_0x00be:
            r4.A08 = r15
        L_0x00c0:
            java.lang.String r0 = r10.A0Y()
            byte[] r1 = X.AnonymousClass36l.A0T(r0)
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            r4.A0D = r0
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r10)
            java.lang.String r0 = "pref_wfs_user"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)
            if (r0 == 0) goto L_0x00f5
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r10)
            java.lang.String r0 = "pref_wfs_pw"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)
            if (r0 == 0) goto L_0x00f5
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r7)
            java.lang.String r0 = "pref_wfs_id_sign"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)
            if (r0 == 0) goto L_0x00f5
            r3 = 1
        L_0x00f5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r4.A02 = r0
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r7)
            java.lang.String r2 = "pref_wfs_source"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0117
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r7)
            r0 = -1
            int r0 = r1.getInt(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0114:
            r4.A0A = r0
            return r4
        L_0x0117:
            r0 = 0
            goto L_0x0114
        L_0x0119:
            r15 = 0
            goto L_0x00be
        L_0x011b:
            r14 = 0
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C103275Mg.A00(android.content.Context, X.33p, X.3ZH, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, boolean):X.4se");
    }

    public C103275Mg(C56612sH r1) {
        this.A00 = r1;
    }
}
