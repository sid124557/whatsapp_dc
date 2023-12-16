package X;

/* renamed from: X.32z  reason: invalid class name and case insensitive filesystem */
public class C619732z {
    public static final String[] A0A = {"com.google", "com.microsoft.office.outlook.USER_ACCOUNT"};
    public static final String[] A0B = {"com.google.android.apps.tachyon"};
    public final C56882si A00;
    public final C44822Xp A01;
    public final C44832Xq A02;
    public final C44842Xr A03;
    public final C620633i A04;
    public final C54292oU A05;
    public final AnonymousClass5ZR A06;
    public final AnonymousClass33p A07;
    public final AnonymousClass1VX A08;
    public final C183538qC A09;

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e7, code lost:
        if (android.text.TextUtils.equals(r6.A0V, r5.A04) == false) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C43142Qy r4, X.C622134a r5, X.AnonymousClass3ZH r6, boolean r7) {
        /*
            long r0 = r5.A01
            java.lang.String r3 = r5.A05
            X.2k5 r2 = new X.2k5
            r2.<init>(r0, r3)
            X.2k5 r0 = r6.A0F
            r3 = 1
            if (r0 == 0) goto L_0x00ec
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00ec
            r2 = 0
        L_0x0015:
            java.lang.String r1 = r5.A03
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r6.A0J()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x002a
            r6.A0P = r1
            r2 = 1
        L_0x002a:
            java.lang.String r1 = r5.A06
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = r6.A0W
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x003d
            r6.A0W = r1
            r2 = 1
        L_0x003d:
            if (r4 == 0) goto L_0x006d
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0056
            java.lang.String r1 = r6.A0R
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = r4.A02
            r6.A0R = r0
            r2 = 1
        L_0x0056:
            java.lang.String r0 = r4.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006d
            java.lang.String r1 = r6.A0Q
            java.lang.String r0 = r4.A01
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = r4.A01
            r6.A0Q = r0
            r2 = 1
        L_0x006d:
            java.lang.Integer r0 = r6.A0L
            int r0 = r0.intValue()
            int r1 = r5.A00
            if (r0 == r1) goto L_0x00dd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A0L = r0
            if (r1 == 0) goto L_0x00e9
            r0 = 0
        L_0x0080:
            r6.A0V = r0
            r2 = 1
        L_0x0083:
            if (r4 == 0) goto L_0x00ca
            java.lang.String r0 = r4.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009c
            java.lang.String r1 = r6.A0U
            java.lang.String r0 = r4.A03
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = r4.A03
            r6.A0U = r0
            r2 = 1
        L_0x009c:
            java.lang.String r0 = r4.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b3
            java.lang.String r1 = r6.A0O
            java.lang.String r0 = r4.A00
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = r4.A00
            r6.A0O = r0
            r2 = 1
        L_0x00b3:
            java.lang.String r0 = r4.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r1 = r6.A0Z
            java.lang.String r0 = r4.A04
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = r4.A04
            r6.A0Z = r0
            r2 = 1
        L_0x00ca:
            boolean r1 = r6.A0r
            boolean r0 = r5.A07
            if (r1 == r0) goto L_0x00d3
            r6.A0r = r0
            r2 = 1
        L_0x00d3:
            if (r7 == 0) goto L_0x00f1
            int r0 = r6.A07
            if (r0 == 0) goto L_0x00f1
            r0 = 0
            r6.A07 = r0
            return r3
        L_0x00dd:
            if (r0 != 0) goto L_0x0083
            java.lang.String r1 = r6.A0V
            java.lang.String r0 = r5.A04
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0083
        L_0x00e9:
            java.lang.String r0 = r5.A04
            goto L_0x0080
        L_0x00ec:
            r6.A0F = r2
            r2 = 1
            goto L_0x0015
        L_0x00f1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C619732z.A00(X.2Qy, X.34a, X.3ZH, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0481, code lost:
        if (r5 != null) goto L_0x053d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C43552So A01(java.lang.String r37, java.util.List r38, java.util.List r39) {
        /*
            r36 = this;
            r0 = r36
            X.2oU r11 = r0.A05
            X.33i r12 = r0.A04
            X.5ZR r2 = r0.A06
            X.33p r8 = r0.A07
            X.2si r1 = r0.A00
            android.content.SharedPreferences r3 = r1.A02()
            java.lang.String r1 = "last_contact_full_sync"
            long r14 = X.AnonymousClass0x2.A0A(r3, r1)
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            java.lang.String r1 = "android.permission.READ_CONTACTS"
            int r4 = r2.A02(r1)
            if (r4 == 0) goto L_0x010e
            java.lang.String r4 = "phonebook/getPhones/permission_denied"
            com.whatsapp.util.Log.i((java.lang.String) r4)
        L_0x0028:
            java.util.HashSet r4 = X.AnonymousClass002.A0K()
            java.lang.String r6 = android.os.Build.MANUFACTURER
            java.lang.String r5 = "lge"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0048
            java.lang.String r5 = "phonebook/get_sim_card_phones/lge"
            com.whatsapp.util.Log.i((java.lang.String) r5)
            X.5UR r13 = r12.A0R()
            if (r13 != 0) goto L_0x007e
            java.lang.String r5 = "phonebook/get-sim-card-phones cr=null"
            com.whatsapp.util.Log.e((java.lang.String) r5)
        L_0x0048:
            r3.addAll(r4)
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.util.Iterator r7 = r3.iterator()
        L_0x0053:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x01af
            java.lang.Object r6 = r7.next()
            X.34a r6 = (X.C622134a) r6
            java.lang.String r5 = r6.A05
            java.lang.String r3 = r6.A03
            X.0PJ r5 = X.AnonymousClass0x9.A0G(r5, r3)
            boolean r3 = r4.containsKey(r5)
            if (r3 != 0) goto L_0x0074
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r4.put(r5, r3)
        L_0x0074:
            java.lang.Object r3 = r4.get(r5)
            java.util.List r3 = (java.util.List) r3
            r3.add(r6)
            goto L_0x0053
        L_0x007e:
            java.lang.String r5 = "content://icc/adn"
            android.net.Uri r14 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x0106 }
            r15 = 0
            r16 = r15
            r17 = r15
            r18 = r15
            android.database.Cursor r7 = r13.A03(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0106 }
            if (r7 != 0) goto L_0x0098
            java.lang.String r5 = "phonebook/get-sim-card-phones null cursor returned from sim card phones query"
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ all -> 0x00fa }
            goto L_0x0048
        L_0x0098:
            java.lang.String r5 = "name"
            int r6 = r7.getColumnIndex(r5)     // Catch:{ all -> 0x00fa }
            java.lang.String r5 = "number"
            int r5 = r7.getColumnIndex(r5)     // Catch:{ all -> 0x00fa }
        L_0x00a6:
            boolean r9 = r7.moveToNext()     // Catch:{ all -> 0x00fa }
            if (r9 == 0) goto L_0x00f5
            java.lang.String r14 = r7.getString(r6)     // Catch:{ all -> 0x00fa }
            java.lang.String r13 = r7.getString(r5)     // Catch:{ all -> 0x00fa }
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00fa }
            java.lang.String r9 = "phonebook/get_sim_card_phones/lge name="
            r10.append(r9)     // Catch:{ all -> 0x00fa }
            r10.append(r14)     // Catch:{ all -> 0x00fa }
            java.lang.String r9 = " number="
            X.C18260x0.A0q(r9, r13, r10)     // Catch:{ all -> 0x00fa }
            if (r13 == 0) goto L_0x00a6
            java.lang.String r15 = android.telephony.PhoneNumberUtils.stripSeparators(r13)     // Catch:{ all -> 0x00fa }
            boolean r9 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r15)     // Catch:{ all -> 0x00fa }
            if (r9 != 0) goto L_0x00dd
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00fa }
            java.lang.String r9 = "phone/sim/not_global/"
            X.C18260x0.A0q(r9, r15, r10)     // Catch:{ all -> 0x00fa }
            goto L_0x00a6
        L_0x00dd:
            r20 = -2
            r19 = 0
            android.content.Context r10 = r11.A00     // Catch:{ all -> 0x00fa }
            r9 = 2131888209(0x7f120851, float:1.9411047E38)
            java.lang.String r16 = r10.getString(r9)     // Catch:{ all -> 0x00fa }
            X.34a r13 = new X.34a     // Catch:{ all -> 0x00fa }
            r22 = r19
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r22)     // Catch:{ all -> 0x00fa }
            r4.add(r13)     // Catch:{ all -> 0x00fa }
            goto L_0x00a6
        L_0x00f5:
            r7.close()     // Catch:{ Exception -> 0x0106 }
            goto L_0x0048
        L_0x00fa:
            r6 = move-exception
            if (r7 == 0) goto L_0x0105
            r7.close()     // Catch:{ all -> 0x0101 }
            goto L_0x0105
        L_0x0101:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch:{ Exception -> 0x0106 }
        L_0x0105:
            throw r6     // Catch:{ Exception -> 0x0106 }
        L_0x0106:
            r6 = move-exception
            java.lang.String r5 = "exception while retrieving sim card contacts, will continue without them "
            com.whatsapp.util.Log.w(r5, r6)
            goto L_0x0048
        L_0x010e:
            java.lang.String r4 = "phonebook/get_phones/"
            android.database.Cursor r5 = X.C622134a.A00(r12, r4)     // Catch:{ Exception -> 0x01a7 }
            r4 = 0
            if (r5 != 0) goto L_0x0137
            java.lang.String r6 = "phonebook/Cursor is null"
            com.whatsapp.util.Log.e((java.lang.String) r6)     // Catch:{ all -> 0x019b }
            android.content.SharedPreferences r6 = X.AnonymousClass0x2.A0F(r8)     // Catch:{ all -> 0x019b }
            java.lang.String r13 = "phonebook_null_cursor_count"
            int r7 = r6.getInt(r13, r4)     // Catch:{ all -> 0x019b }
            r9 = 0
            int r6 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x0130
            r4 = 1
        L_0x0130:
            r6 = 10
            if (r7 >= r6) goto L_0x0028
            if (r4 != 0) goto L_0x0028
            goto L_0x0195
        L_0x0137:
            boolean r6 = r5.moveToNext()     // Catch:{ all -> 0x019b }
            if (r6 == 0) goto L_0x0186
            r6 = 2
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x019b }
            java.lang.String r15 = android.telephony.PhoneNumberUtils.stripSeparators(r6)     // Catch:{ all -> 0x019b }
            boolean r6 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r15)     // Catch:{ all -> 0x019b }
            if (r6 != 0) goto L_0x0157
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x019b }
            java.lang.String r6 = "phone/cursor/not_global/"
            X.C18260x0.A0q(r6, r15, r7)     // Catch:{ all -> 0x019b }
            goto L_0x0137
        L_0x0157:
            long r20 = r5.getLong(r4)     // Catch:{ all -> 0x019b }
            r7 = 1
            java.lang.String r14 = r5.getString(r7)     // Catch:{ all -> 0x019b }
            r6 = 3
            int r19 = r5.getInt(r6)     // Catch:{ all -> 0x019b }
            r6 = 4
            java.lang.String r16 = r5.getString(r6)     // Catch:{ all -> 0x019b }
            r6 = 5
            java.lang.String r17 = r5.getString(r6)     // Catch:{ all -> 0x019b }
            r6 = 6
            java.lang.String r18 = r5.getString(r6)     // Catch:{ all -> 0x019b }
            r6 = 7
            int r6 = r5.getInt(r6)     // Catch:{ all -> 0x019b }
            boolean r22 = X.AnonymousClass000.A1U(r6, r7)
            X.34a r13 = new X.34a     // Catch:{ all -> 0x019b }
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r22)     // Catch:{ all -> 0x019b }
            r3.add(r13)     // Catch:{ all -> 0x019b }
            goto L_0x0137
        L_0x0186:
            r5.close()     // Catch:{ Exception -> 0x01a7 }
            android.content.SharedPreferences$Editor r6 = X.C18270x1.A03(r8)
            java.lang.String r5 = "phonebook_null_cursor_count"
            X.C18270x1.A0h(r6, r5, r4)
            goto L_0x0028
        L_0x0195:
            int r3 = r7 + 1
            X.C18260x0.A0L(r8, r13, r3)     // Catch:{ all -> 0x019b }
            goto L_0x01ae
        L_0x019b:
            r4 = move-exception
            if (r5 == 0) goto L_0x01a6
            r5.close()     // Catch:{ all -> 0x01a2 }
            goto L_0x01a6
        L_0x01a2:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ Exception -> 0x01a7 }
        L_0x01a6:
            throw r4     // Catch:{ Exception -> 0x01a7 }
        L_0x01a7:
            r4 = move-exception
            java.lang.String r3 = "phonebook/error in retrieving phone numbers"
            com.whatsapp.util.Log.e(r3, r4)
        L_0x01ae:
            r4 = 0
        L_0x01af:
            r24 = 0
            if (r4 != 0) goto L_0x01b4
            return r24
        L_0x01b4:
            X.1VX r3 = r0.A08
            r34 = r3
            r6 = 5868(0x16ec, float:8.223E-42)
            X.2vE r23 = X.C58422vE.A02
            r5 = r3
            r3 = r23
            boolean r3 = r5.A0Y(r3, r6)
            if (r3 == 0) goto L_0x0209
            int r6 = r2.A02(r1)
            r5 = -1
            if (r6 != r5) goto L_0x0209
            X.8qC r3 = r8.A01
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r3)
            java.lang.String r2 = "contact_sync_policy_reset"
            r0 = 1
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 == 0) goto L_0x0203
            r1 = 0
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass0x2.A0E(r3)
            X.C18270x1.A0l(r0, r2, r1)
            X.2So r3 = new X.2So
            r3.<init>()
            java.util.Iterator r2 = r38.iterator()
        L_0x01ec:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0208
            X.3ZH r1 = X.C18310x6.A0R(r2)
            int r0 = r1.A07
            if (r0 != 0) goto L_0x01ec
            r0 = 1
            r1.A07 = r0
            java.util.List r0 = r3.A06
            r0.add(r1)
            goto L_0x01ec
        L_0x0203:
            X.2So r3 = new X.2So
            r3.<init>()
        L_0x0208:
            return r3
        L_0x0209:
            r7 = 1
            android.content.SharedPreferences$Editor r6 = X.C18270x1.A03(r8)
            java.lang.String r5 = "contact_sync_policy_reset"
            X.C18270x1.A0l(r6, r5, r7)
            java.util.HashMap r22 = X.AnonymousClass001.A0t()
            java.util.HashMap r21 = X.AnonymousClass001.A0t()
            java.util.Iterator r9 = r38.iterator()
        L_0x021f:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x024b
            X.3ZH r8 = X.C18310x6.A0R(r9)
            X.4uZ r5 = r8.A0H
            boolean r5 = X.C627336j.A0L(r5)
            if (r5 != 0) goto L_0x021f
            X.2k5 r5 = r8.A0F
            X.C626936e.A06(r5)
            java.lang.String r7 = r5.A01
            java.lang.String r5 = r8.A0J()
            X.0PJ r6 = X.AnonymousClass0x9.A0G(r7, r5)
            r5 = r22
            r5.put(r6, r8)
            r5 = r21
            r5.put(r7, r8)
            goto L_0x021f
        L_0x024b:
            java.lang.String r7 = "data1"
            java.util.HashMap r20 = X.AnonymousClass001.A0t()
            int r1 = r2.A02(r1)
            if (r1 == 0) goto L_0x0272
            java.lang.String r1 = "returning empty name map because contact permissions are denied"
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x025d:
            X.2So r10 = new X.2So
            r10.<init>()
            X.2Xp r1 = r0.A01
            java.util.HashSet r9 = r1.A00()
            r35 = r39
            boolean r1 = r35.isEmpty()
            if (r1 != 0) goto L_0x03bc
            goto L_0x03af
        L_0x0272:
            java.lang.String r9 = "raw_contact_id"
            java.lang.String r8 = "mimetype"
            java.lang.String r5 = "data2"
            java.lang.String r2 = "data3"
            java.lang.String r1 = "data4"
            r13 = r9
            r14 = r8
            r15 = r7
            r16 = r5
            r17 = r2
            r18 = r1
            java.lang.String[] r27 = new java.lang.String[]{r13, r14, r15, r16, r17, r18}
            java.lang.String r17 = "vnd.android.cursor.item/name"
            java.lang.String r16 = "vnd.android.cursor.item/nickname"
            java.lang.String r6 = "vnd.android.cursor.item/organization"
            r11 = r17
            r10 = r16
            java.lang.String[] r29 = new java.lang.String[]{r11, r10, r6}
            X.5UR r25 = r12.A0R()
            android.net.Uri r26 = android.provider.ContactsContract.Data.CONTENT_URI
            java.lang.String r28 = "mimetype IN (?,?,?)"
            r30 = r24
            android.database.Cursor r10 = r25.A03(r26, r27, r28, r29, r30)
            if (r10 != 0) goto L_0x02b4
            java.lang.String r1 = "null cursor returned from structured name query"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x075d }
            goto L_0x025d
        L_0x02b4:
            int r9 = r10.getColumnIndex(r9)     // Catch:{ all -> 0x075d }
            r12 = -1
            if (r9 != r12) goto L_0x02c2
            java.lang.String r1 = "invalid column index for the raw contact id"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x075d }
            goto L_0x03aa
        L_0x02c2:
            int r8 = r10.getColumnIndex(r8)     // Catch:{ all -> 0x075d }
            if (r8 != r12) goto L_0x02cf
            java.lang.String r1 = "invalid column index for the mimetype"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x075d }
            goto L_0x03aa
        L_0x02cf:
            int r11 = r10.getColumnIndex(r5)     // Catch:{ all -> 0x075d }
            if (r11 != r12) goto L_0x02dc
            java.lang.String r1 = "invalid column index for the given name"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x075d }
            goto L_0x03aa
        L_0x02dc:
            int r5 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x075d }
            if (r5 != r12) goto L_0x02e9
            java.lang.String r1 = "invalid column index for the family name"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x075d }
            goto L_0x03aa
        L_0x02e9:
            int r2 = r10.getColumnIndex(r7)     // Catch:{ all -> 0x075d }
            if (r2 != r12) goto L_0x02f6
            java.lang.String r1 = "invalid column index for the nickname"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x075d }
            goto L_0x03aa
        L_0x02f6:
            int r7 = r10.getColumnIndex(r7)     // Catch:{ all -> 0x075d }
            if (r7 != r12) goto L_0x0303
            java.lang.String r1 = "invalid column index for the company"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x075d }
            goto L_0x03aa
        L_0x0303:
            int r13 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x075d }
            if (r13 != r12) goto L_0x0310
            java.lang.String r1 = "invalid column index for the title"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x075d }
            goto L_0x03aa
        L_0x0310:
            boolean r1 = r10.moveToNext()     // Catch:{ all -> 0x075d }
            if (r1 == 0) goto L_0x03aa
            boolean r1 = r10.isNull(r9)     // Catch:{ all -> 0x075d }
            if (r1 == 0) goto L_0x0323
            java.lang.String r1 = "null raw contact id for record; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x075d }
            goto L_0x0310
        L_0x0323:
            boolean r1 = r10.isNull(r8)     // Catch:{ all -> 0x075d }
            if (r1 == 0) goto L_0x0330
            java.lang.String r1 = "null mimetype for record; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x075d }
            goto L_0x0310
        L_0x0330:
            java.lang.Long r14 = X.C18280x3.A0T(r10, r9)     // Catch:{ all -> 0x075d }
            r1 = r20
            java.lang.Object r12 = r1.get(r14)     // Catch:{ all -> 0x075d }
            X.2Qy r12 = (X.C43142Qy) r12     // Catch:{ all -> 0x075d }
            if (r12 != 0) goto L_0x0346
            X.2Qy r12 = new X.2Qy     // Catch:{ all -> 0x075d }
            r12.<init>()     // Catch:{ all -> 0x075d }
            r1.put(r14, r12)     // Catch:{ all -> 0x075d }
        L_0x0346:
            java.lang.String r14 = r10.getString(r8)     // Catch:{ all -> 0x075d }
            if (r14 != 0) goto L_0x0353
            java.lang.String r1 = "mimetype was returned as null even though cursor said it wasn't null; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x075d }
            goto L_0x0310
        L_0x0353:
            int r15 = r14.hashCode()     // Catch:{ all -> 0x075d }
            r1 = -1079224304(0xffffffffbfac5810, float:-1.3464375)
            if (r15 == r1) goto L_0x0388
            r1 = 689862072(0x291e75b8, float:3.5185152E-14)
            if (r15 == r1) goto L_0x0375
            r1 = 2034973555(0x794b3b73, float:6.5952627E34)
            if (r15 != r1) goto L_0x039e
            r1 = r16
            boolean r1 = r14.equals(r1)     // Catch:{ all -> 0x075d }
            if (r1 == 0) goto L_0x039e
            java.lang.String r1 = r10.getString(r2)     // Catch:{ all -> 0x075d }
            r12.A03 = r1     // Catch:{ all -> 0x075d }
            goto L_0x0310
        L_0x0375:
            boolean r1 = r14.equals(r6)     // Catch:{ all -> 0x075d }
            if (r1 == 0) goto L_0x039e
            java.lang.String r1 = r10.getString(r7)     // Catch:{ all -> 0x075d }
            r12.A00 = r1     // Catch:{ all -> 0x075d }
            java.lang.String r1 = r10.getString(r13)     // Catch:{ all -> 0x075d }
            r12.A04 = r1     // Catch:{ all -> 0x075d }
            goto L_0x0310
        L_0x0388:
            r1 = r17
            boolean r1 = r14.equals(r1)     // Catch:{ all -> 0x075d }
            if (r1 == 0) goto L_0x039e
            java.lang.String r1 = r10.getString(r11)     // Catch:{ all -> 0x075d }
            r12.A02 = r1     // Catch:{ all -> 0x075d }
            java.lang.String r1 = r10.getString(r5)     // Catch:{ all -> 0x075d }
            r12.A01 = r1     // Catch:{ all -> 0x075d }
            goto L_0x0310
        L_0x039e:
            java.lang.StringBuilder r12 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x075d }
            java.lang.String r1 = "unrecognized mimetype; skipping; mimetype="
            X.C18260x0.A0r(r1, r14, r12)     // Catch:{ all -> 0x075d }
            goto L_0x0310
        L_0x03aa:
            r10.close()
            goto L_0x025d
        L_0x03af:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r24 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x03b6 }
            goto L_0x03bc
        L_0x03b6:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x03bc:
            java.util.HashSet r8 = X.AnonymousClass002.A0K()
            java.util.HashSet r7 = X.AnonymousClass002.A0K()
            java.util.Iterator r19 = X.AnonymousClass001.A0u(r4)
        L_0x03c8:
            boolean r1 = r19.hasNext()
            if (r1 == 0) goto L_0x0582
            java.util.Map$Entry r18 = X.AnonymousClass001.A0w(r19)
            java.lang.Object r13 = r18.getValue()
            java.util.List r13 = (java.util.List) r13
            r14 = 0
            java.lang.Object r6 = r13.get(r14)
            X.34a r6 = (X.C622134a) r6
            java.lang.String[] r12 = A0A
            int r11 = r12.length
            java.util.Iterator r17 = r13.iterator()
            r16 = 0
        L_0x03e8:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0409
            java.lang.Object r5 = r17.next()
            X.34a r5 = (X.C622134a) r5
            r2 = 0
        L_0x03f5:
            if (r2 >= r11) goto L_0x03e8
            r15 = r12[r2]
            java.lang.String r1 = r5.A02
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x0406
            r6 = r5
            r11 = r2
            r16 = 1
            goto L_0x03e8
        L_0x0406:
            int r2 = r2 + 1
            goto L_0x03f5
        L_0x0409:
            if (r16 != 0) goto L_0x0435
            java.lang.Object r6 = r13.get(r14)
            X.34a r6 = (X.C622134a) r6
            java.util.Iterator r12 = r13.iterator()
        L_0x0415:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0435
            java.lang.Object r11 = r12.next()
            X.34a r11 = (X.C622134a) r11
            r5 = 0
        L_0x0422:
            java.lang.String[] r2 = A0B
            int r1 = r2.length
            if (r5 >= r1) goto L_0x0434
            r2 = r2[r5]
            java.lang.String r1 = r11.A02
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0415
            int r5 = r5 + 1
            goto L_0x0422
        L_0x0434:
            r6 = r11
        L_0x0435:
            java.lang.Object r2 = r18.getKey()
            r1 = r22
            java.lang.Object r5 = r1.get(r2)
            X.3ZH r5 = (X.AnonymousClass3ZH) r5
            if (r3 == 0) goto L_0x0481
            if (r5 != 0) goto L_0x053d
            java.lang.String r12 = r6.A05
            java.lang.String r11 = r6.A03
            java.util.Iterator r15 = r38.iterator()
        L_0x044d:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0485
            X.3ZH r5 = X.C18310x6.A0R(r15)
            int r2 = r5.A07
            if (r2 == 0) goto L_0x044d
            r1 = 2
            if (r2 == r1) goto L_0x044d
            X.4uZ r1 = r5.A0H
            java.lang.String r2 = X.AnonymousClass36P.A04(r1)
            X.8qC r1 = r0.A09     // Catch:{ 6zC -> 0x0476 }
            java.lang.Object r13 = r1.get()     // Catch:{ 6zC -> 0x0476 }
            X.7rN r13 = (X.C162167rN) r13     // Catch:{ 6zC -> 0x0476 }
            java.lang.String r1 = ""
            X.8LC r1 = r13.A0F(r2, r1)     // Catch:{ 6zC -> 0x0476 }
            if (r11 == 0) goto L_0x044d
            goto L_0x0527
        L_0x0476:
            r5 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "Couldn't parse the contact number: "
            X.C18260x0.A16(r1, r2, r5)
            goto L_0x044d
        L_0x0481:
            if (r5 == 0) goto L_0x0485
            goto L_0x053d
        L_0x0485:
            java.lang.Object r1 = r18.getKey()
            X.0PJ r1 = (X.AnonymousClass0PJ) r1
            java.lang.Object r2 = r1.A00
            r1 = r21
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0502
            r5 = 1880(0x758, float:2.634E-42)
            r2 = r34
            r1 = r23
            boolean r1 = r2.A0Y(r1, r5)
            if (r1 == 0) goto L_0x0502
            java.lang.Object r1 = r18.getKey()
            X.0PJ r1 = (X.AnonymousClass0PJ) r1
            java.lang.Object r2 = r1.A00
            r1 = r21
            java.lang.Object r1 = r1.get(r2)
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            if (r1 == 0) goto L_0x0502
            X.3ZH r16 = r1.A0G()
            if (r16 == 0) goto L_0x0504
            r5 = r16
        L_0x04bb:
            r1 = -1
            r5.A0N(r1)
            java.lang.String r1 = r6.A06
            r5.A0W = r1
            java.lang.Object r1 = r18.getKey()
            X.0PJ r1 = (X.AnonymousClass0PJ) r1
            java.lang.Object r1 = r1.A00
            boolean r1 = r9.contains(r1)
            if (r1 != 0) goto L_0x0524
            boolean r1 = r0.A02()
            if (r1 == 0) goto L_0x03c8
            long r1 = r6.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            r1 = r20
            java.lang.Object r1 = r1.get(r2)
            X.2Qy r1 = (X.C43142Qy) r1
            A00(r1, r6, r5, r3)
            java.util.List r1 = r10.A00
            r1.add(r5)
            if (r16 != 0) goto L_0x0575
            java.util.List r1 = r10.A01
            r1.add(r5)
            java.lang.Object r1 = r18.getKey()
            X.0PJ r1 = (X.AnonymousClass0PJ) r1
            java.lang.Object r1 = r1.A00
            r7.add(r1)
            goto L_0x03c8
        L_0x0502:
            r16 = 0
        L_0x0504:
            r26 = 0
            java.lang.String r15 = r6.A05
            long r1 = r6.A01
            java.lang.String r13 = r6.A03
            int r12 = r6.A00
            java.lang.String r11 = r6.A04
            X.3ZH r5 = new X.3ZH
            r25 = r5
            r27 = r15
            r28 = r13
            r29 = r11
            r30 = r12
            r31 = r1
            r33 = r14
            r25.<init>(r26, r27, r28, r29, r30, r31, r33)
            goto L_0x04bb
        L_0x0524:
            java.util.List r1 = r10.A05
            goto L_0x0553
        L_0x0527:
            int r1 = r1.countryCode_
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r1 = X.C107195ar.A04(r12, r2, r1)
            if (r1 == 0) goto L_0x044d
            java.lang.String r1 = r5.A0J()
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x044d
        L_0x053d:
            boolean r1 = r35.isEmpty()
            if (r1 != 0) goto L_0x0558
            boolean r1 = r5.A10
            if (r1 != 0) goto L_0x0558
            r2 = r24
            r1 = r35
            boolean r1 = X.C621733w.A01(r5, r2, r1)
            if (r1 == 0) goto L_0x0558
            java.util.List r1 = r10.A02
        L_0x0553:
            r1.add(r5)
            goto L_0x03c8
        L_0x0558:
            boolean r1 = r0.A02()
            if (r1 == 0) goto L_0x0524
            long r1 = r6.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            r1 = r20
            java.lang.Object r1 = r1.get(r2)
            X.2Qy r1 = (X.C43142Qy) r1
            boolean r1 = A00(r1, r6, r5, r3)
            if (r1 == 0) goto L_0x0524
            java.util.List r1 = r10.A06
            goto L_0x0553
        L_0x0575:
            java.lang.Object r1 = r18.getKey()
            X.0PJ r1 = (X.AnonymousClass0PJ) r1
            java.lang.Object r1 = r1.A00
            r8.add(r1)
            goto L_0x03c8
        L_0x0582:
            java.util.HashSet r9 = X.AnonymousClass002.A0K()
            java.util.Iterator r6 = X.AnonymousClass001.A0u(r22)
        L_0x058a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x05d3
            java.util.Map$Entry r5 = X.AnonymousClass001.A0w(r6)
            if (r3 == 0) goto L_0x05a1
            java.lang.Object r1 = r5.getValue()
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            int r1 = r1.A07
            if (r1 == 0) goto L_0x05a1
            goto L_0x058a
        L_0x05a1:
            boolean r1 = r0.A02()
            if (r1 == 0) goto L_0x058a
            java.lang.Object r1 = r5.getKey()
            boolean r1 = r4.containsKey(r1)
            if (r1 != 0) goto L_0x058a
            java.lang.Object r2 = r5.getValue()
            java.util.List r1 = r10.A03
            r1.add(r2)
            java.lang.Object r2 = r5.getValue()
            java.util.List r1 = r10.A04
            r1.add(r2)
            java.lang.Object r1 = r5.getValue()
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A03(r1)
            if (r1 == 0) goto L_0x058a
            r9.add(r1)
            goto L_0x058a
        L_0x05d3:
            java.util.Iterator r5 = X.AnonymousClass001.A0u(r22)
        L_0x05d7:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0650
            java.util.Map$Entry r4 = X.AnonymousClass001.A0w(r5)
            java.lang.Object r1 = r4.getKey()
            X.0PJ r1 = (X.AnonymousClass0PJ) r1
            java.lang.Object r1 = r1.A00
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x062f
            java.util.List r2 = r10.A03
            java.lang.Object r1 = r4.getValue()
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x062f
            java.lang.Object r2 = r4.getValue()
            java.util.List r1 = r10.A00
            r1.add(r2)
            java.lang.Object r2 = r4.getValue()
            java.util.List r1 = r10.A01
        L_0x060a:
            r1.add(r2)
        L_0x060d:
            java.lang.Object r1 = r4.getValue()
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            com.whatsapp.jid.Jid r3 = X.AnonymousClass3ZH.A03(r1)
            if (r3 == 0) goto L_0x05d7
            boolean r1 = r9.contains(r3)
            if (r1 == 0) goto L_0x05d7
            java.util.List r2 = r10.A04
            java.lang.Object r1 = r4.getValue()
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x05d7
            r9.remove(r3)
            goto L_0x05d7
        L_0x062f:
            java.lang.Object r1 = r4.getKey()
            X.0PJ r1 = (X.AnonymousClass0PJ) r1
            java.lang.Object r1 = r1.A00
            boolean r1 = r8.contains(r1)
            if (r1 == 0) goto L_0x060d
            java.util.List r2 = r10.A03
            java.lang.Object r1 = r4.getValue()
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x060d
            java.lang.Object r2 = r4.getValue()
            java.util.List r1 = r10.A00
            goto L_0x060a
        L_0x0650:
            java.util.List r4 = r10.A04
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0683
            java.util.HashSet r6 = X.AnonymousClass002.A0K()
            java.util.Iterator r5 = r4.iterator()
        L_0x0660:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0680
            X.3ZH r3 = X.C18310x6.A0R(r5)
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r3.A0I(r2)
            if (r1 == 0) goto L_0x0660
            com.whatsapp.jid.Jid r1 = r3.A0I(r2)
            boolean r1 = r9.contains(r1)
            if (r1 != 0) goto L_0x0660
            r6.add(r3)
            goto L_0x0660
        L_0x0680:
            r4.removeAll(r6)
        L_0x0683:
            X.2Xq r1 = r0.A02
            X.2yu r5 = r1.A00()
            java.util.List r1 = r5.A00
            java.util.Iterator r3 = r1.iterator()
        L_0x068f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x06a4
            java.lang.Object r2 = r3.next()
            java.util.List r1 = r10.A00
            r1.add(r2)
            java.util.List r1 = r10.A01
            r1.add(r2)
            goto L_0x068f
        L_0x06a4:
            java.util.List r1 = r5.A01
            java.util.Iterator r3 = r1.iterator()
        L_0x06aa:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x06bd
            java.lang.Object r2 = r3.next()
            java.util.List r1 = r10.A03
            r1.add(r2)
            r4.add(r2)
            goto L_0x06aa
        L_0x06bd:
            X.2Xr r0 = r0.A03
            X.2yv r3 = r0.A00()
            java.util.List r0 = r3.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x06c9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06de
            java.lang.Object r1 = r2.next()
            java.util.List r0 = r10.A00
            r0.add(r1)
            java.util.List r0 = r10.A01
            r0.add(r1)
            goto L_0x06c9
        L_0x06de:
            java.util.List r0 = r3.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x06e4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06f7
            java.lang.Object r1 = r2.next()
            java.util.List r0 = r10.A03
            r0.add(r1)
            r4.add(r1)
            goto L_0x06e4
        L_0x06f7:
            java.util.List r0 = r3.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x06fd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x070d
            java.lang.Object r1 = r2.next()
            java.util.List r0 = r10.A05
            r0.add(r1)
            goto L_0x06fd
        L_0x070d:
            java.util.List r2 = r10.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r37)
            java.lang.String r0 = "add"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C64773Ex.A02(r0, r2)
            java.util.List r2 = r10.A06
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r37)
            java.lang.String r0 = "update"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C64773Ex.A02(r0, r2)
            java.util.List r2 = r10.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r37)
            java.lang.String r0 = "remove"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C64773Ex.A02(r0, r2)
            java.util.List r2 = r10.A05
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r37)
            java.lang.String r0 = "unchanged"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C64773Ex.A02(r0, r2)
            java.util.List r2 = r10.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r37)
            java.lang.String r0 = "updateContactsMatchingJidHash"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.C64773Ex.A02(r0, r2)
            return r10
        L_0x075d:
            r1 = move-exception
            if (r10 == 0) goto L_0x0768
            r10.close()     // Catch:{ all -> 0x0764 }
            throw r1
        L_0x0764:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0768:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C619732z.A01(java.lang.String, java.util.List, java.util.List):X.2So");
    }

    public final boolean A02() {
        if (!this.A08.A0Y(C58422vE.A02, 5868) || this.A06.A02("android.permission.READ_CONTACTS") == 0) {
            return true;
        }
        return false;
    }

    public C619732z(C56882si r1, C44822Xp r2, C44832Xq r3, C44842Xr r4, C620633i r5, C54292oU r6, AnonymousClass5ZR r7, AnonymousClass33p r8, AnonymousClass1VX r9, C183538qC r10) {
        this.A08 = r9;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
        this.A07 = r8;
        this.A00 = r1;
        this.A09 = r10;
    }
}
