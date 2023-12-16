package X;

import android.os.ConditionVariable;

/* renamed from: X.3cM  reason: invalid class name and case insensitive filesystem */
public class C71593cM implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C71593cM(C613530j r1, C54052o6 r2, C53832nk r3, AnonymousClass4DQ r4, int i) {
        this.A04 = i;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static void A00(C107285b3 r3, C95814uZ r4, AnonymousClass3ZF r5) {
        C623234o r32 = (C623234o) r3.A39.get();
        C162457s7.A0J(r4, 1);
        if (r5.A0I == null && r32.A08.A0Y(C58422vE.A02, 4896)) {
            r32.A07(r4, r5, Boolean.TRUE, false);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:62:0x01ba=Splitter:B:62:0x01ba, B:68:0x01ea=Splitter:B:68:0x01ea} */
    public void run() {
        /*
            r45 = this;
            r2 = r45
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L_0x03df;
                case 1: goto L_0x03f7;
                case 2: goto L_0x016c;
                case 3: goto L_0x040f;
                case 4: goto L_0x01c3;
                case 5: goto L_0x042c;
                case 6: goto L_0x0444;
                case 7: goto L_0x045c;
                case 8: goto L_0x0474;
                case 9: goto L_0x048e;
                case 10: goto L_0x04a5;
                case 11: goto L_0x04bf;
                case 12: goto L_0x04f4;
                case 13: goto L_0x0527;
                case 14: goto L_0x0562;
                case 15: goto L_0x05a0;
                case 16: goto L_0x05be;
                case 17: goto L_0x064b;
                case 18: goto L_0x06e3;
                case 19: goto L_0x0045;
                case 20: goto L_0x0716;
                case 21: goto L_0x0067;
                case 22: goto L_0x0201;
                case 23: goto L_0x0242;
                case 24: goto L_0x0267;
                case 25: goto L_0x0738;
                case 26: goto L_0x0a28;
                case 27: goto L_0x0a7a;
                case 28: goto L_0x0aa2;
                case 29: goto L_0x0ad7;
                case 30: goto L_0x12db;
                case 31: goto L_0x00a4;
                case 32: goto L_0x1326;
                case 33: goto L_0x134c;
                case 34: goto L_0x1364;
                case 35: goto L_0x029a;
                case 36: goto L_0x1378;
                case 37: goto L_0x138c;
                case 38: goto L_0x13a4;
                case 39: goto L_0x13b8;
                case 40: goto L_0x17ac;
                case 41: goto L_0x038a;
                case 42: goto L_0x17d4;
                case 43: goto L_0x17fb;
                case 44: goto L_0x1855;
                case 45: goto L_0x0007;
                case 46: goto L_0x0007;
                case 47: goto L_0x03b4;
                case 48: goto L_0x18cb;
                case 49: goto L_0x1967;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r2.A00
            X.1iB r6 = (X.C29041iB) r6
            java.lang.Object r0 = r2.A01
            X.33G r0 = (X.AnonymousClass33G) r0
            java.lang.Object r1 = r2.A02
            X.2fi r1 = (X.C48932fi) r1
            java.lang.Object r5 = r2.A03
            X.2Ke r5 = (X.C41422Ke) r5
            com.whatsapp.jid.DeviceJid r0 = r0.A07
            X.2e4 r4 = r1.A01
            X.2ov r3 = X.AnonymousClass36G.A02(r0)
            X.33n r2 = r6.A0H
            com.whatsapp.jid.DeviceJid r1 = X.AnonymousClass36G.A04(r3)
            X.2sr r0 = r2.A03
            boolean r0 = r0.A0b(r1)
            X.C626936e.A0B(r0)
            r2.A0N(r4, r3)
            r0 = 0
            r6.A03 = r0
            X.1iB r4 = r5.A01
            X.2fi r3 = r5.A00
            X.3dI r2 = r4.A0N
            r1 = 16
            X.3bx r0 = new X.3bx
            r0.<init>(r4, r1, r3)
            r2.execute(r0)
        L_0x0044:
            return
        L_0x0045:
            java.lang.Object r4 = r2.A00
            X.2kf r4 = (X.C51962kf) r4
            java.lang.Object r5 = r2.A01
            X.3Gr r5 = (X.C65223Gr) r5
            java.lang.Object r3 = r2.A02
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r6 = r2.A03
            X.21Q r0 = X.AnonymousClass21Q.TIMED_OUT
            r4.A00 = r0
            X.2jU r2 = r5.A03
            long r0 = r3.A1L
            r2.A01(r4, r0)
            java.lang.String r0 = "BotMessageManager/processBotMessageForTimeout/removed from cache and db"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.3Wi r2 = r5.A01
            r0 = 2
            goto L_0x009d
        L_0x0067:
            java.lang.Object r5 = r2.A00
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r5 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r5
            java.lang.Object r6 = r2.A01
            java.lang.Number r6 = (java.lang.Number) r6
            java.lang.Object r4 = r2.A02
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r3 = r2.A03
            android.content.Context r1 = r5.getApplicationContext()
            X.33j r0 = r5.A0E
            double r7 = r6.doubleValue()
            double r9 = r4.doubleValue()
            java.util.Locale r0 = X.C620733j.A02(r0)
            android.location.Geocoder r6 = new android.location.Geocoder
            r6.<init>(r1, r0)
            r11 = 1
            java.util.List r6 = r6.getFromLocation(r7, r9, r11)     // Catch:{ Exception -> 0x0092 }
            goto L_0x0099
        L_0x0092:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationUtil/geoLocateAddress"
            com.whatsapp.util.Log.w(r0, r1)
            r6 = 0
        L_0x0099:
            X.3Wi r2 = r5.A05
            r0 = 9
        L_0x009d:
            X.3aJ r1 = new X.3aJ
            r1.<init>(r5, r6, r3, r0)
            goto L_0x023e
        L_0x00a4:
            java.lang.Object r3 = r2.A00
            X.2xQ r3 = (X.C59752xQ) r3
            java.lang.Object r5 = r2.A01
            X.3ZH r5 = (X.AnonymousClass3ZH) r5
            java.lang.Object r4 = r2.A02
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r2 = r2.A03
            X.3Ex r6 = r3.A02
            X.1vC r7 = r6.A05
            X.4Fq r10 = X.C18630y0.A07(r7)     // Catch:{ IllegalArgumentException -> 0x013d }
            X.3Yo r14 = r10.Axl()     // Catch:{ all -> 0x0133 }
            r0 = 10
            android.content.ContentValues r12 = X.AnonymousClass0x9.A07(r0)     // Catch:{ all -> 0x0129 }
            X.AnonymousClass3ZH.A0B(r12, r5)     // Catch:{ all -> 0x0129 }
            X.AnonymousClass3ZH.A0A(r12, r5)     // Catch:{ all -> 0x0129 }
            java.lang.String r1 = "is_whatsapp_user"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0129 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r1 = "wa_name"
            java.lang.String r0 = r5.A0b     // Catch:{ all -> 0x0129 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r1 = "is_wa_created_contact"
            boolean r0 = r5.A0t     // Catch:{ all -> 0x0129 }
            X.AnonymousClass0x2.A0o(r12, r1, r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r1 = "sync_policy"
            int r0 = r5.A07     // Catch:{ all -> 0x0129 }
            X.C18270x1.A0b(r12, r1, r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r8 = "raw_contact_id"
            X.2k5 r0 = r5.A0F     // Catch:{ all -> 0x0129 }
            if (r0 != 0) goto L_0x00f2
            r0 = 0
            goto L_0x00f4
        L_0x00f2:
            long r0 = r0.A00     // Catch:{ all -> 0x0129 }
        L_0x00f4:
            X.C18270x1.A0c(r12, r8, r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r1 = "number"
            X.2k5 r0 = r5.A0F     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0129 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r8 = "is_contact_synced"
            boolean r0 = r5.A0l     // Catch:{ all -> 0x0129 }
            r1 = 1
            r13 = 0
            boolean r0 = X.AnonymousClass000.A1S(r0)
            X.C18270x1.A0b(r12, r8, r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r11 = "wa_contacts"
            java.lang.String r9 = "_id = ?"
            java.lang.String[] r8 = new java.lang.String[r1]     // Catch:{ all -> 0x0129 }
            long r0 = r5.A0F()     // Catch:{ all -> 0x0129 }
            X.AnonymousClass0x2.A1S(r8, r13, r0)     // Catch:{ all -> 0x0129 }
            X.AnonymousClass361.A07(r12, r10, r11, r9, r8)     // Catch:{ all -> 0x0129 }
            r14.A00()     // Catch:{ all -> 0x0129 }
            r14.close()     // Catch:{ all -> 0x0133 }
            r10.close()     // Catch:{ IllegalArgumentException -> 0x013d }
            goto L_0x0143
        L_0x0129:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x012e }
            goto L_0x0132
        L_0x012e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0133 }
        L_0x0132:
            throw r1     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0138 }
            goto L_0x013c
        L_0x0138:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x013d }
        L_0x013c:
            throw r1     // Catch:{ IllegalArgumentException -> 0x013d }
        L_0x013d:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to update contact"
            X.C626936e.A08(r0, r1)
        L_0x0143:
            java.lang.StringBuilder r1 = X.C28831hq.A00(r7, r5)
            java.lang.String r0 = "contact-mgr-db/updated contact jid="
            r1.append(r0)
            X.4uZ r0 = r5.A0H
            X.C18260x0.A0m(r0, r1)
            android.os.Handler r1 = r6.A01
            r0 = 47
            X.C70193a6.A00(r1, r6, r5, r0)
            X.3Gp r1 = r3.A01
            java.util.List r0 = X.C18290x4.A12(r2)
            r1.A0L(r4, r0)
            X.3Wi r2 = r3.A00
            r0 = 10
            X.3Zj r1 = new X.3Zj
            r1.<init>(r3, r0)
            goto L_0x023e
        L_0x016c:
            java.lang.Object r4 = r2.A00
            X.851 r4 = (X.AnonymousClass851) r4
            java.lang.Object r5 = r2.A01
            X.7i2 r5 = (X.C157277i2) r5
            java.lang.Object r6 = r2.A03
            X.6Nl r6 = (X.C126336Nl) r6
            java.lang.Object r3 = r2.A02
            java.io.File r3 = (java.io.File) r3
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x0044 }
            X.6Nj r0 = r6.A01     // Catch:{ JSONException -> 0x0044 }
            if (r0 == 0) goto L_0x018e
            java.lang.String r1 = "size_config"
            org.json.JSONObject r0 = r0.Bqp()     // Catch:{ JSONException -> 0x0044 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0044 }
        L_0x018e:
            X.6Nh r0 = r6.A02     // Catch:{ JSONException -> 0x0044 }
            if (r0 == 0) goto L_0x019c
            java.lang.String r1 = "staleness_config"
            org.json.JSONObject r0 = r0.Bqp()     // Catch:{ JSONException -> 0x0044 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0044 }
        L_0x019c:
            java.lang.String r1 = "eviction_type"
            java.lang.String r0 = r6.A03     // Catch:{ JSONException -> 0x0044 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r1 = r6.A00     // Catch:{ JSONException -> 0x0044 }
            if (r1 == 0) goto L_0x01ac
            java.lang.String r0 = "cache_name"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0044 }
        L_0x01ac:
            java.lang.String r1 = "feature_name"
            java.lang.String r0 = r5.A00     // Catch:{ JSONException -> 0x0044 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0044 }
            X.2oc r1 = r4.A02     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r0 = r3.getCanonicalPath()     // Catch:{ IOException -> 0x01ba }
            goto L_0x01be
        L_0x01ba:
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ JSONException -> 0x0044 }
        L_0x01be:
            r1.A03(r0, r2)     // Catch:{ JSONException -> 0x0044 }
            goto L_0x19a5
        L_0x01c3:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Object r8 = r2.A02
            java.io.File r8 = (java.io.File) r8
            r8.setLastModified(r5)
            java.lang.Object r7 = r2.A00
            X.84z r7 = (X.C1683284z) r7
            java.lang.Object r0 = r2.A01
            X.7i2 r0 = (X.C157277i2) r0
            java.lang.String r4 = r0.A00
            java.lang.Object r3 = r2.A03
            X.6Nh r3 = (X.C126296Nh) r3
            long r1 = X.C18290x4.A0B(r5)
            X.15S r0 = new X.15S
            r0.<init>(r3, r4, r1)
            java.lang.String r4 = r8.getCanonicalPath()     // Catch:{ IOException -> 0x01ea }
            goto L_0x01ee
        L_0x01ea:
            java.lang.String r4 = r8.getAbsolutePath()     // Catch:{ JSONException -> 0x0044 }
        L_0x01ee:
            org.json.JSONObject r3 = r0.Bqp()     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r2 = "usage_timestamp_s"
            long r0 = r0.A00     // Catch:{ JSONException -> 0x0044 }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x0044 }
            X.2oc r0 = r7.A00     // Catch:{ JSONException -> 0x0044 }
            r0.A03(r4, r3)     // Catch:{ JSONException -> 0x0044 }
            goto L_0x19a6
        L_0x0201:
            java.lang.Object r0 = r2.A00
            X.2Vg r0 = (X.C44252Vg) r0
            java.lang.Object r8 = r2.A01
            X.1mO r8 = (X.C30401mO) r8
            java.lang.Object r7 = r2.A02
            X.2ND r7 = (X.AnonymousClass2ND) r7
            java.lang.Object r6 = r2.A03
            long r2 = r0.A00(r8)
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0044
            X.8qC r1 = r7.A02
            java.lang.Object r0 = r1.get()
            X.2sW r0 = (X.C56762sW) r0
            X.3ZF r0 = r0.A00(r2)
            if (r0 != 0) goto L_0x0233
            java.lang.Object r0 = r1.get()
            X.2sW r0 = (X.C56762sW) r0
            X.3ZF r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x0044
        L_0x0233:
            r8.A01 = r0
            X.3Wi r2 = r7.A00
            r0 = 17
            X.5sL r1 = new X.5sL
            r1.<init>((java.lang.Object) r6, (int) r0)
        L_0x023e:
            r2.A0S(r1)
            return
        L_0x0242:
            java.lang.Object r7 = r2.A00
            X.5b3 r7 = (X.C107285b3) r7
            java.lang.Object r6 = r2.A01
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r5 = r2.A02
            com.whatsapp.voipcalling.CallInfo r5 = (com.whatsapp.voipcalling.CallInfo) r5
            java.lang.Object r4 = r2.A03
            X.4uZ r4 = (X.C95814uZ) r4
            X.30y r3 = r7.A21
            boolean r2 = r5.isCaller
            java.lang.String r1 = r5.callId
            int r0 = r5.initialGroupTransactionId
            X.3ZF r0 = r3.A03(r6, r1, r0, r2)
            if (r0 == 0) goto L_0x0044
            X.C614830y.A00(r5, r0)
            A00(r7, r4, r0)
            return
        L_0x0267:
            java.lang.Object r7 = r2.A00
            X.5b3 r7 = (X.C107285b3) r7
            java.lang.Object r6 = r2.A01
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r5 = r2.A02
            com.whatsapp.voipcalling.CallInfo r5 = (com.whatsapp.voipcalling.CallInfo) r5
            java.lang.Object r4 = r2.A03
            java.util.List r4 = (java.util.List) r4
            X.30y r3 = r7.A21
            boolean r2 = r5.isCaller
            java.lang.String r1 = r5.callId
            int r0 = r5.initialGroupTransactionId
            X.3ZF r2 = r3.A03(r6, r1, r0, r2)
            if (r2 == 0) goto L_0x0044
            X.C614830y.A00(r5, r2)
            java.util.Iterator r1 = r4.iterator()
        L_0x028c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0044
            X.4uZ r0 = X.C18300x5.A0P(r1)
            A00(r7, r0, r2)
            goto L_0x028c
        L_0x029a:
            java.lang.Object r0 = r2.A00
            X.549 r0 = (X.AnonymousClass549) r0
            java.lang.Object r4 = r2.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r2.A02
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r6 = r2.A03
            X.34x r6 = (X.C624134x) r6
            java.lang.Object r5 = r0.A00
            X.4oJ r5 = (X.C93314oJ) r5
            boolean r0 = r6 instanceof X.C30941nT
            if (r0 == 0) goto L_0x02e5
            X.2z0 r0 = r6.A1J
            X.4uZ r3 = r0.A00
            if (r3 == 0) goto L_0x02d1
            X.1nT r6 = (X.C30941nT) r6
            java.lang.String r2 = r6.A01
            java.lang.String r0 = r3.getRawString()
            X.1fJ r1 = X.AnonymousClass34R.A04(r0)
            if (r2 == 0) goto L_0x02d1
            if (r1 == 0) goto L_0x02d1
            X.2sj r0 = r5.A1L
            boolean r0 = r0.A0C(r1)
            if (r0 != 0) goto L_0x02d1
            return
        L_0x02d1:
            X.3Ex r0 = r5.A0t
            X.3ZH r0 = r0.A09(r3)
            if (r0 == 0) goto L_0x0044
            X.5hX r2 = r5.A0V
            android.content.Intent r1 = X.C627736r.A0O(r4, r3)
            java.lang.String r0 = "ConversationRow"
            r2.A0C(r4, r1, r0)
            return
        L_0x02e5:
            X.2qz r0 = r5.A1x
            X.2z0 r8 = r6.A1J
            X.34x r7 = r0.A05(r8)
            if (r7 != 0) goto L_0x0306
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0300
            X.2qz r7 = r5.A1x
            X.6kE r2 = X.C135166kE.A00
            r1 = 1
            java.lang.String r0 = r8.A01
            X.34x r7 = X.C55832qz.A01(r2, r7, r0, r1)
            if (r7 != 0) goto L_0x0306
        L_0x0300:
            X.2qj r0 = r5.A1J
            X.34x r7 = r0.A01(r8)
        L_0x0306:
            boolean r0 = r6 instanceof X.C30771mz
            if (r0 == 0) goto L_0x0321
            java.lang.String r1 = r8.A01
            java.lang.String r0 = "product_inquiry"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0321
            X.3Wi r2 = r5.A0X
            r0 = 7
            X.3bw r1 = new X.3bw
            r1.<init>(r5, r0, r6)
        L_0x031d:
            r2.A0S(r1)
            return
        L_0x0321:
            if (r7 == 0) goto L_0x0044
            X.2z0 r6 = r7.A1J
            X.4uZ r1 = r6.A00
            boolean r0 = r1 instanceof X.C135166kE
            if (r0 == 0) goto L_0x034c
            X.33e r0 = r5.A1O
            boolean r0 = r0.A0G(r7)
            if (r0 != 0) goto L_0x0044
            com.whatsapp.jid.UserJid r1 = r7.A0o()
            r0 = 0
            android.content.Intent r3 = X.C627736r.A0S(r4, r1, r0, r0, r0)
            X.C107395bF.A00(r3, r6)
            X.3Wi r2 = r5.A0X
            r0 = 8
            X.3bw r1 = new X.3bw
            r1.<init>(r4, r0, r3)
        L_0x0348:
            r2.A0S(r1)
            return
        L_0x034c:
            X.C626936e.A06(r1)
            boolean r0 = X.AnonymousClass2z0.A0E(r3, r1)
            if (r0 != 0) goto L_0x0380
            android.content.Intent r3 = X.C627736r.A0O(r4, r1)
            java.lang.String r2 = "row_id"
            long r0 = r7.A1L
            r3.putExtra(r2, r0)
            java.lang.String r2 = "sort_id"
            long r0 = r7.A1M
            r3.putExtra(r2, r0)
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = "start_t"
            r3.putExtra(r0, r1)
            X.C107395bF.A00(r3, r6)
            X.3Wi r2 = r5.A0X
            r0 = 15
            X.3aK r1 = new X.3aK
            r1.<init>(r5, r4, r3, r0)
            goto L_0x0348
        L_0x0380:
            X.3Wi r2 = r5.A0X
            r0 = 16
            X.3aK r1 = new X.3aK
            r1.<init>(r5, r4, r7, r0)
            goto L_0x031d
        L_0x038a:
            java.lang.Object r4 = r2.A00
            X.2Sp r4 = (X.C43562Sp) r4
            java.lang.Object r5 = r2.A01
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            java.lang.Object r3 = r2.A02
            java.lang.Object r6 = r2.A03
            X.1R1 r0 = r4.A05
            X.2sa r0 = X.AnonymousClass1R1.A00(r5, r0)
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x0044
            X.3Wi r0 = r4.A02
            r7 = 40
            X.3cM r2 = new X.3cM
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (int) r7)
            r0.A0S(r2)
            X.2Wf r1 = r4.A04
            r0 = 4
            r1.A00(r0)
            return
        L_0x03b4:
            java.lang.Object r5 = r2.A01
            X.2U4 r5 = (X.AnonymousClass2U4) r5
            X.2rO r12 = r5.A08
            X.2sH r7 = r5.A03
            long r3 = r7.A0H()
            r0 = 0
            java.lang.String r6 = "db_migration_attempt_timestamp"
            long r8 = r12.A00(r6, r0)
            long r0 = r3 - r8
            long r10 = java.lang.Math.abs(r0)
            r8 = 43200000(0x2932e00, double:2.1343636E-316)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0044
            r12.A04(r6, r3)
            java.lang.String r0 = "DatabaseMigrationAsyncTask/run/execute async task"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x19a7
        L_0x03df:
            java.lang.Object r5 = r2.A01
            X.4FL r5 = (X.AnonymousClass4FL) r5
            java.lang.Object r0 = r2.A00
            X.7oH r0 = (X.C160767oH) r0
            int r4 = r0.A00
            X.7Z2 r3 = r0.A01
            java.lang.Object r1 = r2.A02
            X.7A4 r1 = (X.AnonymousClass7A4) r1
            java.lang.Object r0 = r2.A03
            X.7Ot r0 = (X.C150007Ot) r0
            r5.BVZ(r3, r1, r0, r4)
            return
        L_0x03f7:
            java.lang.Object r5 = r2.A01
            X.4FL r5 = (X.AnonymousClass4FL) r5
            java.lang.Object r0 = r2.A00
            X.7oH r0 = (X.C160767oH) r0
            int r4 = r0.A00
            X.7Z2 r3 = r0.A01
            java.lang.Object r1 = r2.A02
            X.7A4 r1 = (X.AnonymousClass7A4) r1
            java.lang.Object r0 = r2.A03
            X.7Ot r0 = (X.C150007Ot) r0
            r5.BVI(r3, r1, r0, r4)
            return
        L_0x040f:
            java.lang.Object r4 = r2.A00
            X.852 r4 = (X.AnonymousClass852) r4
            java.lang.Object r3 = r2.A02
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r2.A01
            X.7i2 r0 = (X.C157277i2) r0
            java.lang.String r1 = r0.A00
            java.lang.Object r0 = r2.A03
            X.7Qb r0 = (X.C150297Qb) r0
            X.6Ng r2 = new X.6Ng
            r2.<init>(r0, r1)
            r0 = -1
            r4.A00(r2, r3, r0)
            return
        L_0x042c:
            java.lang.Object r0 = r2.A00
            X.7kx r0 = (X.C159017kx) r0
            java.lang.Object r4 = r2.A01
            X.4F1 r4 = (X.AnonymousClass4F1) r4
            java.lang.Object r3 = r2.A02
            X.7gm r3 = (X.C156527gm) r3
            java.lang.Object r2 = r2.A03
            X.7P1 r2 = (X.AnonymousClass7P1) r2
            int r1 = r0.A00
            X.6PS r0 = r0.A01
            r4.BVa(r3, r2, r0, r1)
            return
        L_0x0444:
            java.lang.Object r0 = r2.A00
            X.7kx r0 = (X.C159017kx) r0
            java.lang.Object r4 = r2.A01
            X.4F1 r4 = (X.AnonymousClass4F1) r4
            java.lang.Object r3 = r2.A02
            X.7gm r3 = (X.C156527gm) r3
            java.lang.Object r2 = r2.A03
            X.7P1 r2 = (X.AnonymousClass7P1) r2
            int r1 = r0.A00
            X.6PS r0 = r0.A01
            r4.BVN(r3, r2, r0, r1)
            return
        L_0x045c:
            java.lang.Object r0 = r2.A00
            X.7kx r0 = (X.C159017kx) r0
            java.lang.Object r4 = r2.A01
            X.4F1 r4 = (X.AnonymousClass4F1) r4
            java.lang.Object r3 = r2.A02
            X.7gm r3 = (X.C156527gm) r3
            java.lang.Object r2 = r2.A03
            X.7P1 r2 = (X.AnonymousClass7P1) r2
            int r1 = r0.A00
            X.6PS r0 = r0.A01
            r4.BVJ(r3, r2, r0, r1)
            return
        L_0x0474:
            java.lang.Object r5 = r2.A00
            X.4Mn r5 = (X.C86954Mn) r5
            java.lang.Object r4 = r2.A01
            X.4CF[] r4 = (X.AnonymousClass4CF[]) r4
            java.lang.Object r3 = r2.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r2.A03
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            r1 = 0
            r0 = 1
            r5.A00 = r0
            r0 = r4[r1]
            r0.BVw(r2, r3)
            return
        L_0x048e:
            java.lang.Object r4 = r2.A00
            com.whatsapp.Main r4 = (com.whatsapp.Main) r4
            java.lang.Object r3 = r2.A01
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r1 = r2.A02
            android.view.ViewTreeObserver$OnPreDrawListener r1 = (android.view.ViewTreeObserver.OnPreDrawListener) r1
            java.lang.Object r0 = r2.A03
            com.whatsapp.Me r0 = (com.whatsapp.Me) r0
            X.AnonymousClass0x7.A16(r3, r1)
            r4.A7B(r0)
            return
        L_0x04a5:
            java.lang.Object r3 = r2.A00
            com.whatsapp.Main r3 = (com.whatsapp.Main) r3
            java.lang.Object r4 = r2.A01
            java.lang.Object r5 = r2.A02
            java.lang.Object r6 = r2.A03
            X.3dV r0 = r3.A05
            r0.A05()
            java.lang.String r0 = "Main/keepSplashscreen/message-store-ready now redirect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Wi r0 = r3.A05
            r7 = 9
            goto L_0x1344
        L_0x04bf:
            java.lang.Object r4 = r2.A00
            X.4Ia r4 = (X.C85894Ia) r4
            java.lang.Object r0 = r2.A01
            X.1mV r0 = (X.C30471mV) r0
            java.lang.Object r1 = r2.A02
            X.2sk r1 = (X.C56902sk) r1
            java.lang.Object r3 = r2.A03
            X.34x r3 = (X.C624134x) r3
            X.33C r0 = r0.A01
            java.io.File r2 = r1.A03()
            if (r0 == 0) goto L_0x04eb
            if (r2 == 0) goto L_0x04ee
            r0.A0F = r2
            java.lang.Object r1 = r4.A00
            X.3Go r1 = (X.C65193Go) r1
            X.3Lv r0 = r1.A0R
            r0.A0Z(r3)
            X.2rq r1 = r1.A08
            r0 = 1
            r1.A04(r2, r0, r0)
            return
        L_0x04eb:
            java.lang.String r0 = "MainMessageObserver/downloadQuotedMessageForSticker null mediaDataV2"
            goto L_0x04f0
        L_0x04ee:
            java.lang.String r0 = "MainMessageObserver/downloadQuotedMessageForSticker null download onComplete"
        L_0x04f0:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x04f4:
            java.lang.Object r4 = r2.A00
            X.36E r4 = (X.AnonymousClass36E) r4
            java.lang.Object r0 = r2.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r3 = r2.A02
            X.4uZ r3 = (X.C95814uZ) r3
            java.lang.Object r2 = r2.A03
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.1Yb r1 = new X.1Yb
            r1.<init>()
            r1.A00 = r0
            X.2sj r0 = r4.A0A
            java.util.Set r0 = r0.A04(r3)
            int r0 = r0.size()
            int r0 = X.AnonymousClass36M.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            r1.A02 = r2
            X.4FV r0 = r4.A0G
            r0.BhD(r1)
            return
        L_0x0527:
            java.lang.Object r4 = r2.A00
            X.5Ul r4 = (X.AnonymousClass5Ul) r4
            java.lang.Object r5 = r2.A01
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r3 = r2.A02
            X.4FU r3 = (X.AnonymousClass4FU) r3
            java.lang.Object r2 = r2.A03
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = r5.getMessage()
            if (r0 == 0) goto L_0x0558
            java.lang.String r1 = r5.getMessage()
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0558
            X.3Wi r1 = r4.A01
            r0 = 2131889102(0x7f120bce, float:1.9412858E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A0O(r3, r0)
        L_0x0555:
            java.lang.String r0 = "SendMedia/sendAudioResult/e "
            goto L_0x0592
        L_0x0558:
            X.3Wi r2 = r4.A01
            r1 = 2131893800(0x7f121e28, float:1.9422387E38)
            r0 = 0
            r2.A0H(r1, r0)
            goto L_0x0555
        L_0x0562:
            java.lang.Object r4 = r2.A00
            X.5Ul r4 = (X.AnonymousClass5Ul) r4
            java.lang.Object r5 = r2.A01
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r3 = r2.A02
            X.4FU r3 = (X.AnonymousClass4FU) r3
            java.lang.Object r2 = r2.A03
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = r5.getMessage()
            if (r0 == 0) goto L_0x0596
            java.lang.String r1 = r5.getMessage()
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0596
            X.3Wi r1 = r4.A01
            r0 = 2131889102(0x7f120bce, float:1.9412858E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A0O(r3, r0)
        L_0x0590:
            java.lang.String r0 = "SendMedia/sendAnimatedGifResult/e"
        L_0x0592:
            com.whatsapp.util.Log.e(r0, r5)
            return
        L_0x0596:
            X.3Wi r2 = r4.A01
            r1 = 2131893800(0x7f121e28, float:1.9422387E38)
            r0 = 0
            r2.A0H(r1, r0)
            goto L_0x0590
        L_0x05a0:
            java.lang.Object r4 = r2.A00
            X.33m r4 = (X.C621033m) r4
            java.lang.Object r0 = r2.A01
            X.4UA r0 = (X.AnonymousClass4UA) r0
            java.lang.Object r3 = r2.A02
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r1 = r2.A03
            X.4Ey r1 = (X.C85104Ey) r1
            X.2qb r0 = r0.A05
            if (r0 == 0) goto L_0x05b7
            r3.A1W(r0)
        L_0x05b7:
            r1.BWa(r3)
            r4.A0P(r3)
            return
        L_0x05be:
            java.lang.Object r6 = r2.A00
            X.33m r6 = (X.C621033m) r6
            java.lang.Object r1 = r2.A01
            X.34x r1 = (X.C624134x) r1
            java.lang.Object r5 = r2.A02
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r7 = r2.A03
            X.2IK r7 = (X.AnonymousClass2IK) r7
            boolean r0 = r1 instanceof X.C30471mV
            if (r0 == 0) goto L_0x061b
            X.1mV r1 = (X.C30471mV) r1
            X.33C r0 = X.C30471mV.A00(r1)
            java.lang.String r8 = r0.A0G
            X.2sH r0 = r6.A0V
            long r3 = r0.A0H()
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0600
            android.net.Uri r0 = android.net.Uri.parse(r8)
            android.net.Uri$Builder r2 = r0.buildUpon()
            long r0 = X.C18290x4.A0B(r3)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "_nc_hot"
            android.net.Uri$Builder r0 = X.AnonymousClass3UP.A00(r2, r0, r1)
            java.lang.String r8 = X.C18300x5.A0f(r0)
        L_0x0600:
            java.util.Iterator r2 = r5.iterator()
        L_0x0604:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x061b
            X.34x r1 = X.C18300x5.A0T(r2)
            boolean r0 = r1 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0604
            X.1mV r1 = (X.C30471mV) r1
            X.33C r0 = X.C30471mV.A00(r1)
            r0.A0G = r8
            goto L_0x0604
        L_0x061b:
            java.util.Iterator r4 = r5.iterator()
        L_0x061f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0645
            X.34x r3 = X.C18300x5.A0T(r4)
            boolean r0 = X.AnonymousClass2z0.A0C(r3)
            if (r0 == 0) goto L_0x063f
            X.8qC r0 = r6.A1z
            java.lang.Object r2 = r0.get()
            X.2iH r2 = (X.C50502iH) r2
            X.4FS r1 = r2.A0B
            r0 = 48
            X.C70113Zy.A01(r1, r2, r3, r0)
            goto L_0x061f
        L_0x063f:
            X.3Lv r0 = r6.A0l
            r0.A0V(r3)
            goto L_0x061f
        L_0x0645:
            X.3XA r0 = r7.A00
            r0.A05(r5)
            return
        L_0x064b:
            java.lang.Object r1 = r2.A00
            X.33m r1 = (X.C621033m) r1
            java.lang.Object r0 = r2.A01
            X.34x r0 = (X.C624134x) r0
            java.lang.Object r3 = r2.A02
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r2.A03
            X.2IK r2 = (X.AnonymousClass2IK) r2
            X.1mV r0 = (X.C30471mV) r0
            java.lang.String r4 = r0.A03
            X.C626936e.A06(r4)
            X.2iJ r5 = new X.2iJ
            r5.<init>()
            X.2H2 r4 = r1.A1J
            r5.A01 = r4
            java.lang.String r4 = r0.A03
            r5.A08 = r4
            X.38t r4 = X.AnonymousClass36O.A02(r0)
            java.lang.String r4 = r4.A02
            r5.A07 = r4
            r4 = 0
            r5.A0A = r4
            X.1qP r11 = r5.A01()
            X.1i8 r5 = r1.A1h
            r5.A0D()
            X.38t r4 = X.AnonymousClass36O.A02(r0)
            java.lang.String r6 = r4.A02
            r13 = 0
            r9 = 0
            r8 = r13
            r7 = r13
            r10 = r9
            X.2YO r10 = r5.A09(r6, r7, r8, r9, r10)
            X.2RO r4 = r1.A1O
            java.lang.String r12 = r0.A03
            X.2zJ r5 = r4.A00
            X.2WV r9 = r4.A04
            X.2p6 r8 = r4.A03
            X.2cX r6 = r4.A01
            X.2pd r7 = r4.A02
            X.2dD r4 = new X.2dD
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.2nD r4 = r4.A00()
            X.580 r5 = r4.A02
            X.580 r4 = X.AnonymousClass580.COMPLETE
            if (r5 != r4) goto L_0x06cf
            X.2IK r4 = new X.2IK
            r4.<init>()
            r10 = 16
            X.3cM r5 = new X.3cM
            r6 = r1
            r7 = r0
            r8 = r3
            r9 = r4
            r5.<init>((java.lang.Object) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (int) r10)
            r1.A0T(r0, r5, r3, r13)
            r0 = 24
            X.4Ji r1 = new X.4Ji
            r1.<init>(r2, r0)
            X.3XA r0 = r4.A00
            r0.A03(r1)
            return
        L_0x06cf:
            X.3Wi r4 = r1.A02
            r3 = 9
            X.C69263Wi.A00(r4, r1, r3)
            X.33S r1 = r1.A1R
            r1.A02(r0)
            X.3d3 r1 = X.C72023d3.A00
            X.3XA r0 = r2.A00
            r0.A05(r1)
            return
        L_0x06e3:
            java.lang.Object r6 = r2.A00
            X.2Tn r6 = (X.C43802Tn) r6
            java.lang.Object r5 = r2.A01
            X.2sq r5 = (X.C56962sq) r5
            java.lang.Object r4 = r2.A02
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r3 = r2.A03
            X.49C r3 = (X.AnonymousClass49C) r3
            r2 = 1
            r0 = 300(0x12c, double:1.48E-321)
            android.os.SystemClock.sleep(r0)
            java.util.List r0 = r6.A01
            if (r0 != 0) goto L_0x0712
            boolean r1 = r6.A0A
            X.3ZH r0 = r6.A03
            boolean r0 = r5.A0O(r0, r1)
            if (r0 == 0) goto L_0x0712
            com.whatsapp.jid.UserJid r0 = r6.A04
            X.C162457s7.A0D(r0)
            java.util.List r0 = r5.A03(r0)
            r6.A01 = r0
        L_0x0712:
            r5.A0C(r4, r3, r6, r2)
            return
        L_0x0716:
            java.lang.Object r4 = r2.A00
            X.2xL r4 = (X.C59702xL) r4
            java.lang.Object r3 = r2.A01
            X.21j r3 = (X.C372121j) r3
            java.lang.Object r1 = r2.A02
            X.0sA r1 = (X.C15910sA) r1
            java.lang.Object r0 = r2.A03
            X.4CU r0 = (X.AnonymousClass4CU) r0
            X.C59702xL.A00(r3, r4)
            X.0ni r3 = X.AnonymousClass0IT.A00(r1)
            r2 = 0
            com.whatsapp.bonsai.waitlist.BonsaiWaitlistSyncManager$sendAddToWaitlist$1$onSuccess$1$1 r1 = new com.whatsapp.bonsai.waitlist.BonsaiWaitlistSyncManager$sendAddToWaitlist$1$onSuccess$1$1
            r1.<init>(r0, r2)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            return
        L_0x0738:
            java.lang.Object r6 = r2.A00
            X.364 r6 = (X.AnonymousClass364) r6
            java.lang.Object r5 = r2.A01
            java.io.File r5 = (java.io.File) r5
            java.lang.Object r10 = r2.A02
            com.whatsapp.fieldstats.events.WamCall r10 = (com.whatsapp.fieldstats.events.WamCall) r10
            java.lang.Object r4 = r2.A03
            X.1Y7 r4 = (X.AnonymousClass1Y7) r4
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0a22
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L_0x0a22
            java.lang.String r7 = "call_result"
            if (r10 != 0) goto L_0x0771
            java.lang.String r0 = "app/VoipTimeSeriesLogger: injectAdditionalDataToLogs received null fieldStat, skipping injection"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x075d:
            X.2oU r0 = r6.A03
            android.content.Context r0 = r0.A00
            java.io.File r2 = X.C627436k.A04(r0)
            java.lang.StringBuilder r1 = X.C18320x8.A0l(r5)
            java.lang.String r0 = ".zip"
            java.io.File r9 = X.C18270x1.A0A(r2, r0, r1)
            goto L_0x0930
        L_0x0771:
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0929
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L_0x0929
            java.io.File[] r11 = r5.listFiles()
            if (r11 == 0) goto L_0x075d
            r1 = 2
            X.4IU r0 = new X.4IU
            r0.<init>(r1)
            java.util.Arrays.sort(r11, r0)
            int r9 = r11.length
            r8 = 0
        L_0x078e:
            java.lang.String r2 = "app/VoipTimeSeriesLogger: injectAdditionalDataToLogs could not inject into time series file"
            r1 = 1
            if (r8 >= r9) goto L_0x07b7
            r0 = r11[r8]
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x07b0 }
            r3.<init>(r0, r1)     // Catch:{ IOException -> 0x07b0 }
            java.lang.String r1 = "user_rating"
            java.lang.Long r0 = r10.userRating     // Catch:{ all -> 0x07a6 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x07a6 }
            r3.close()     // Catch:{ IOException -> 0x07b0 }
            goto L_0x07b4
        L_0x07a6:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x07ab }
            goto L_0x07af
        L_0x07ab:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x07b0 }
        L_0x07af:
            throw r1     // Catch:{ IOException -> 0x07b0 }
        L_0x07b0:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
        L_0x07b4:
            int r8 = r8 + 1
            goto L_0x078e
        L_0x07b7:
            int r9 = r9 - r1
            r0 = r11[r9]
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0923 }
            r3.<init>(r0, r1)     // Catch:{ IOException -> 0x0923 }
            java.lang.String r1 = "call_t"
            java.lang.Long r0 = r10.callT     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.Integer r0 = r10.callResult     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A03(r3, r0, r7)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "freeze_t"
            java.lang.Long r0 = r10.videoRenderFreezeT     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "freeze_8x"
            java.lang.Long r0 = r10.videoRenderFreeze8xT     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "num_freezes"
            java.lang.Long r0 = r10.videoRenderNumFreezes     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "jb_lost"
            java.lang.Double r0 = r10.jbLost     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A02(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "jb_empties"
            java.lang.Double r0 = r10.jbEmpties     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A02(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "jb_gets"
            java.lang.Double r0 = r10.jbGets     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A02(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "rtt"
            java.lang.Long r0 = r10.callAvgRtt     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "jb_delay"
            java.lang.Double r0 = r10.jbAvgDelay     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A02(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "max_participants"
            java.lang.Long r0 = r10.maxConnectedParticipants     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "num_participants"
            java.lang.Long r0 = r10.numConnectedParticipants     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "vid_rx_bps"
            java.lang.Double r0 = r10.videoRxBitrate     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A02(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "freeze_high_bwe_t"
            java.lang.Long r0 = r10.renderFreezeHighPeerBweT     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "high_bwe_t"
            java.lang.Long r0 = r10.highPeerBweT     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "freeze_mid_bwe_t"
            java.lang.Long r0 = r10.renderFreezeLowToHighPeerBweT     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "mid_bwe_t"
            java.lang.Long r0 = r10.lowToHighPeerBweT     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "freeze_low_bwe_t"
            java.lang.Long r0 = r10.renderFreezeLowPeerBweT     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "low_bwe_t"
            java.lang.Long r0 = r10.lowPeerBweT     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "jb_lostempty_pct_low_bwe"
            java.lang.Double r0 = r10.jbLostEmptyLowPeerBwePerSec     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A02(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "jb_lostempty_pct_mid_bwe"
            java.lang.Double r0 = r10.jbLostEmptyLowToHighPeerBwePerSec     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A02(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "jb_lostempty_pct_high_bwe"
            java.lang.Double r0 = r10.jbLostEmptyHighPeerBwePerSec     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A02(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "new_end_call_survey_version"
            java.lang.Long r0 = r10.newEndCallSurveyVersion     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "user_problems"
            java.lang.Long r0 = r10.userProblems     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "user_description"
            java.lang.String r0 = r10.userDescription     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A05(r3, r1, r0)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_end_reconnecting"
            java.lang.Boolean r0 = r10.callEndReconnecting     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A01(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_end_reconnecting_signaling_accessible"
            java.lang.Boolean r0 = r10.callEndReconnectingSignalingAccessible     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A01(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_end_reconnecting_relay_pingable"
            java.lang.Boolean r0 = r10.callEndReconnectingRelayPingable     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A01(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_reconnecting_probe_state"
            java.lang.Long r0 = r10.callReconnectingProbeState     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_initial_rtt"
            java.lang.Long r0 = r10.callInitialRtt     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_average_rtt"
            java.lang.Long r0 = r10.callAvgRtt     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_last_rtt"
            java.lang.Long r0 = r10.callLastRtt     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_relay_bind_status"
            java.lang.Integer r0 = r10.callRelayBindStatus     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A03(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.Integer r0 = r10.callResult     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A03(r3, r0, r7)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_transport_relay_to_relay_fallback_count"
            java.lang.Long r0 = r10.callTransportRelayToRelayFallbackCount     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_transport_p2p_to_relay_fallback_count"
            java.lang.Long r0 = r10.callTransportP2pToRelayFallbackCount     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_reconnecting_state_count"
            java.lang.Long r0 = r10.callReconnectingStateCount     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_setup_t"
            java.lang.Long r0 = r10.callSetupT     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_test_bucket"
            java.lang.String r0 = r10.callTestBucket     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A05(r3, r1, r0)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_end_reconnecting_expected_bitmap"
            java.lang.Long r0 = r10.callEndReconnectingExpectedBitmap     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_relay_error_code"
            java.lang.Long r0 = r10.callRelayErrorCode     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_transport"
            java.lang.Integer r0 = r10.callTransport     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A03(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_side"
            java.lang.Integer r0 = r10.callSide     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A03(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_network"
            java.lang.Integer r0 = r10.callNetwork     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A03(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "xpop_call_peer_relay_ip"
            java.lang.String r0 = r10.xpopCallPeerRelayIp     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A05(r3, r1, r0)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "max_unbound_relay_count"
            java.lang.Long r0 = r10.maxUnboundRelayCount     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_setup_error_type"
            java.lang.Integer r0 = r10.callSetupErrorType     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A03(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            java.lang.String r1 = "call_transition_count"
            java.lang.Long r0 = r10.callTransitionCount     // Catch:{ all -> 0x0919 }
            X.AnonymousClass364.A04(r3, r0, r1)     // Catch:{ all -> 0x0919 }
            r3.close()     // Catch:{ IOException -> 0x0923 }
            goto L_0x075d
        L_0x0919:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x091e }
            goto L_0x0922
        L_0x091e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0923 }
        L_0x0922:
            throw r1     // Catch:{ IOException -> 0x0923 }
        L_0x0923:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            goto L_0x075d
        L_0x0929:
            java.lang.String r0 = "app/VoipTimeSeriesLogger: injectAdditionalDataToLogs received bad directory path, skipping injection."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x075d
        L_0x0930:
            java.io.FileOutputStream r2 = X.AnonymousClass0x9.A0h(r9)     // Catch:{ IOException -> 0x0998 }
            java.util.zip.ZipOutputStream r7 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x098e }
            r7.<init>(r2)     // Catch:{ all -> 0x098e }
            java.io.File[] r12 = r5.listFiles()     // Catch:{ all -> 0x0984 }
            if (r12 == 0) goto L_0x097d
            int r11 = r12.length     // Catch:{ all -> 0x0984 }
            r8 = 0
        L_0x0941:
            if (r8 >= r11) goto L_0x097d
            r13 = r12[r8]     // Catch:{ all -> 0x0984 }
            java.io.FileInputStream r3 = X.AnonymousClass0x9.A0g(r13)     // Catch:{ all -> 0x0984 }
            java.lang.String r1 = r13.getName()     // Catch:{ all -> 0x0973 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0973 }
            r0.<init>(r1)     // Catch:{ all -> 0x0973 }
            r7.putNextEntry(r0)     // Catch:{ all -> 0x0973 }
            X.C627536m.A0I(r3, r7)     // Catch:{ all -> 0x0973 }
            r7.closeEntry()     // Catch:{ all -> 0x0973 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0973 }
            java.lang.String r0 = "app/VoipTimeSeriesLogger: compressed file "
            X.C18270x1.A0y(r13, r0, r1)     // Catch:{ all -> 0x0973 }
            java.lang.String r0 = " with init size "
            java.lang.String r0 = X.AnonymousClass000.A0N(r13, r0, r1)     // Catch:{ all -> 0x0973 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0973 }
            r3.close()     // Catch:{ all -> 0x0984 }
            int r8 = r8 + 1
            goto L_0x0941
        L_0x0973:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0978 }
            goto L_0x097c
        L_0x0978:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0984 }
        L_0x097c:
            throw r1     // Catch:{ all -> 0x0984 }
        L_0x097d:
            r7.close()     // Catch:{ all -> 0x098e }
            r2.close()     // Catch:{ IOException -> 0x0998 }
            goto L_0x09a2
        L_0x0984:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0989 }
            goto L_0x098d
        L_0x0989:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x098e }
        L_0x098d:
            throw r1     // Catch:{ all -> 0x098e }
        L_0x098e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0993 }
            goto L_0x0997
        L_0x0993:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0998 }
        L_0x0997:
            throw r1     // Catch:{ IOException -> 0x0998 }
        L_0x0998:
            r1 = move-exception
            java.lang.String r0 = "app/VoipTimeSeriesLogger: could not create compressed time series file"
            com.whatsapp.util.Log.w(r0, r1)
            r9.delete()
            goto L_0x09d4
        L_0x09a2:
            r0 = 0
            long r7 = X.C627536m.A00(r0, r5)
            long r11 = r9.length()
            long r0 = r7 - r11
            double r2 = (double) r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r0
            double r0 = (double) r7
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r4.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r4.A02 = r0
            long r7 = r9.length()
            int r0 = r6.A00
            long r0 = (long) r0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x09ee
            boolean r0 = r6.A07(r10, r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A00 = r0
        L_0x09d4:
            boolean r0 = X.C627536m.A0P(r5)
            if (r0 != 0) goto L_0x09e8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/VoipTimeSeriesLogger: time series data directory "
            X.AnonymousClass000.A10(r5, r0, r1)
            java.lang.String r0 = " could not be deleted"
            X.C18260x0.A1M(r1, r0)
        L_0x09e8:
            X.4FV r0 = r6.A04
            r0.BhD(r4)
            return
        L_0x09ee:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/VoipTimeSeriesLogger: aborting upload because file "
            X.C18270x1.A0y(r9, r0, r1)
            java.lang.String r0 = " has size "
            X.C18280x3.A11(r9, r0, r1)
            java.lang.String r0 = " which exceeds the threshold "
            r1.append(r0)
            int r0 = r6.A00
            r1.append(r0)
            X.AnonymousClass0x2.A19(r1)
            X.2qk r3 = r6.A01
            long r0 = r9.length()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "voip-time-series-upload-aborted"
            r3.A0A(r0, r1, r2)
            r9.delete()
            goto L_0x09d4
        L_0x0a22:
            java.lang.String r0 = "app/VoipTimeSeriesLogger: uploadTimeSeries received bad directory path, skipping upload."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0a28:
            java.lang.Object r1 = r2.A00
            X.2cQ r1 = (X.C46922cQ) r1
            java.lang.Object r0 = r2.A01
            X.7n8 r0 = (X.C160157n8) r0
            java.lang.Object r6 = r2.A02
            X.4GQ r6 = (X.AnonymousClass4GQ) r6
            java.lang.Object r5 = r2.A03
            X.3Dv r5 = (X.C64523Dv) r5
            X.7HN r4 = r1.A04
            com.whatsapp.jid.UserJid r3 = r0.A07
            X.C162457s7.A0C(r3)
            X.2Ng r1 = r0.A00
            if (r1 == 0) goto L_0x0a77
            X.66R r0 = r4.A01
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            java.lang.Object r2 = r0.get()
            java.lang.String r1 = r1.A02
            X.2jd r0 = new X.2jd
            r0.<init>(r3, r1)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0a77
            X.7Gs r0 = r5.A01
            X.C162457s7.A0C(r0)
            r4.A00 = r0
            java.util.List r0 = r5.A02
            boolean r0 = X.C18310x6.A1X(r0)
            if (r0 == 0) goto L_0x0a74
            X.6ge r0 = new X.6ge
            r0.<init>(r5)
        L_0x0a70:
            r6.invoke(r0)
            return
        L_0x0a74:
            X.6gi r0 = X.C133116gi.A00
            goto L_0x0a70
        L_0x0a77:
            X.6gj r0 = X.C133126gj.A00
            goto L_0x0a70
        L_0x0a7a:
            java.lang.Object r4 = r2.A00
            X.4k3 r4 = (X.C91474k3) r4
            java.lang.Object r6 = r2.A01
            X.4uZ r6 = (X.C95814uZ) r6
            java.lang.Object r3 = r2.A02
            java.lang.Object r7 = r2.A03
            X.C18260x0.A0O(r4, r6)
            r0 = 3
            X.C162457s7.A0J(r7, r0)
            X.3Ex r0 = r4.getContactManager$community_consumerBeta()
            X.3ZH r5 = r0.A0A(r6)
            X.3Wi r0 = r4.getGlobalUI$community_consumerBeta()
            r8 = 4
            X.3c8 r1 = new X.3c8
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x17a8
        L_0x0aa2:
            java.lang.Object r1 = r2.A00
            X.1hf r1 = (X.C28721hf) r1
            java.lang.Object r4 = r2.A01
            X.3XA r4 = (X.AnonymousClass3XA) r4
            java.lang.Object r3 = r2.A02
            X.3XA r3 = (X.AnonymousClass3XA) r3
            java.lang.Object r2 = r2.A03
            X.3XA r2 = (X.AnonymousClass3XA) r2
            java.lang.String r0 = "CompanionBootstrapManager/startCriticalBootstrap timed out"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2q4 r0 = r1.A07
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "companion_syncd_critical_bootstrap_state"
            int r1 = X.C18280x3.A02(r1, r0)
            r0 = 2
            if (r1 < r0) goto L_0x0ad4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x0ac8:
            r4.A05(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.A05(r0)
            r2.A05(r0)
            return
        L_0x0ad4:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0ac8
        L_0x0ad7:
            java.lang.Object r6 = r2.A00
            X.3Et r6 = (X.C64743Et) r6
            java.lang.Object r3 = r2.A01
            X.33G r3 = (X.AnonymousClass33G) r3
            java.lang.Object r0 = r2.A02
            r18 = r0
            r0 = r18
            X.2jp r0 = (X.C51442jp) r0
            r18 = r0
            java.lang.Object r8 = r2.A03
            java.util.List r8 = (java.util.List) r8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "history-sync-manager/startMessageHistorySync for "
            X.C18260x0.A1R(r1, r0, r3)
            com.whatsapp.jid.DeviceJid r0 = r3.A07
            r44 = r0
            boolean r0 = r3.A0A
            r22 = r0
            r14 = 2
            if (r0 == 0) goto L_0x0b02
            r14 = 3
        L_0x0b02:
            X.3Ek r2 = r6.A04
            if (r18 == 0) goto L_0x0b0c
            r1 = 2
            r0 = r18
            r2.A09(r0, r1)
        L_0x0b0c:
            X.2xO r1 = r3.A06
            if (r1 == 0) goto L_0x0b22
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0b22
            X.1VX r3 = r6.A0F
            r2 = 3626(0xe2a, float:5.081E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r2)
            r43 = 1
            if (r0 != 0) goto L_0x0b24
        L_0x0b22:
            r43 = 0
        L_0x0b24:
            X.30s r0 = r6.A0I
            X.1A0 r15 = X.AnonymousClass0x7.A0Z()     // Catch:{ Exception -> 0x107f }
            X.23J r2 = X.AnonymousClass23J.INITIAL_BOOTSTRAP     // Catch:{ Exception -> 0x107f }
            r15.A0D(r2)     // Catch:{ Exception -> 0x107f }
            X.2sK r2 = r0.A08     // Catch:{ Exception -> 0x107f }
            java.util.Map r23 = r2.A06()     // Catch:{ Exception -> 0x107f }
            java.util.Map r21 = r2.A07()     // Catch:{ Exception -> 0x107f }
            java.util.HashSet r3 = X.AnonymousClass002.A0K()     // Catch:{ Exception -> 0x107f }
            java.util.Iterator r4 = r8.iterator()     // Catch:{ Exception -> 0x107f }
        L_0x0b41:
            boolean r2 = r4.hasNext()     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0b55
            java.lang.Object r2 = r4.next()     // Catch:{ Exception -> 0x107f }
            X.2NQ r2 = (X.AnonymousClass2NQ) r2     // Catch:{ Exception -> 0x107f }
            X.1mq r2 = r2.A00     // Catch:{ Exception -> 0x107f }
            X.4uZ r2 = r2.A06     // Catch:{ Exception -> 0x107f }
            r3.add(r2)     // Catch:{ Exception -> 0x107f }
            goto L_0x0b41
        L_0x0b55:
            java.util.HashMap r20 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x107f }
            java.util.HashMap r7 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x107f }
            java.util.Iterator r9 = r3.iterator()     // Catch:{ Exception -> 0x107f }
        L_0x0b61:
            boolean r2 = r9.hasNext()     // Catch:{ Exception -> 0x107f }
            r5 = 0
            if (r2 == 0) goto L_0x0b88
            com.whatsapp.jid.Jid r4 = X.AnonymousClass0x7.A0S(r9)     // Catch:{ Exception -> 0x107f }
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A03(r4)     // Catch:{ Exception -> 0x107f }
            if (r3 == 0) goto L_0x0b82
            X.2sr r2 = r0.A02     // Catch:{ Exception -> 0x107f }
            boolean r2 = r2.A0a(r3)     // Catch:{ Exception -> 0x107f }
            if (r2 != 0) goto L_0x0b82
            X.2ov r2 = X.AnonymousClass36G.A03(r3)     // Catch:{ Exception -> 0x107f }
            r7.put(r2, r4)     // Catch:{ Exception -> 0x107f }
            goto L_0x0b61
        L_0x0b82:
            r2 = r20
            r2.put(r4, r5)     // Catch:{ Exception -> 0x107f }
            goto L_0x0b61
        L_0x0b88:
            X.33n r3 = r0.A0A     // Catch:{ Exception -> 0x107f }
            java.util.Set r2 = r7.keySet()     // Catch:{ Exception -> 0x107f }
            java.util.Map r2 = r3.A0G(r2)     // Catch:{ Exception -> 0x107f }
            java.util.Iterator r9 = X.AnonymousClass000.A0q(r2)     // Catch:{ Exception -> 0x107f }
        L_0x0b96:
            boolean r2 = r9.hasNext()     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0bbc
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r9)     // Catch:{ Exception -> 0x107f }
            java.lang.Object r3 = r2.getKey()     // Catch:{ Exception -> 0x107f }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x107f }
            X.2e4 r2 = (X.C47932e4) r2     // Catch:{ Exception -> 0x107f }
            java.lang.Object r3 = X.C18290x4.A0i(r3, r7)     // Catch:{ Exception -> 0x107f }
            if (r2 != 0) goto L_0x0bb2
            r2 = r5
            goto L_0x0bb6
        L_0x0bb2:
            X.2jv r2 = r2.A00     // Catch:{ Exception -> 0x107f }
            byte[] r2 = r2.A01     // Catch:{ Exception -> 0x107f }
        L_0x0bb6:
            r4 = r20
            r4.put(r3, r2)     // Catch:{ Exception -> 0x107f }
            goto L_0x0b96
        L_0x0bbc:
            java.util.Iterator r19 = r8.iterator()     // Catch:{ Exception -> 0x107f }
            r16 = 0
            r37 = 0
        L_0x0bc4:
            boolean r2 = r19.hasNext()     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x100d
            java.lang.Object r5 = r19.next()     // Catch:{ Exception -> 0x107f }
            X.2NQ r5 = (X.AnonymousClass2NQ) r5     // Catch:{ Exception -> 0x107f }
            X.1mq r9 = r5.A00     // Catch:{ Exception -> 0x107f }
            X.4uZ r8 = r9.A06     // Catch:{ Exception -> 0x107f }
            int r2 = r9.A00     // Catch:{ Exception -> 0x107f }
            if (r2 <= 0) goto L_0x0bfa
            X.1VX r4 = r0.A0S     // Catch:{ Exception -> 0x107f }
            r3 = 624(0x270, float:8.74E-43)
            X.2vE r2 = X.C58422vE.A02     // Catch:{ Exception -> 0x107f }
            boolean r2 = r4.A0Y(r2, r3)     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0bfa
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x107f }
            java.lang.String r2 = "history-sync-send-methods/send-initial-bootstrap: jid="
            r3.append(r2)     // Catch:{ Exception -> 0x107f }
            r3.append(r8)     // Catch:{ Exception -> 0x107f }
            java.lang.String r2 = "; unreadCount="
            r3.append(r2)     // Catch:{ Exception -> 0x107f }
            int r2 = r9.A00     // Catch:{ Exception -> 0x107f }
            X.C18260x0.A1F(r3, r2)     // Catch:{ Exception -> 0x107f }
        L_0x0bfa:
            X.1EG r2 = X.AnonymousClass1EG.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x107f }
            X.6c9 r4 = r2.A0G()     // Catch:{ Exception -> 0x107f }
            X.19z r4 = (X.C209619z) r4     // Catch:{ Exception -> 0x107f }
            java.lang.String r7 = X.C18300x5.A0i(r8)     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18280x3.A0N(r4, r7)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 1
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.id_ = r7     // Catch:{ Exception -> 0x107f }
            long r2 = r9.A04     // Catch:{ Exception -> 0x107f }
            long r10 = X.C18290x4.A0B(r2)     // Catch:{ Exception -> 0x107f }
            r2 = r16
            long r2 = java.lang.Math.max(r10, r2)     // Catch:{ Exception -> 0x107f }
            X.1EG r10 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r7 = r10.bitField0_     // Catch:{ Exception -> 0x107f }
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r10.bitField0_ = r7     // Catch:{ Exception -> 0x107f }
            r10.conversationTimestamp_ = r2     // Catch:{ Exception -> 0x107f }
            int r2 = r9.A00     // Catch:{ Exception -> 0x107f }
            r7 = 0
            int r10 = java.lang.Math.max(r2, r7)     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 16
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.unreadCount_ = r10     // Catch:{ Exception -> 0x107f }
            boolean r10 = r9.A0G     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 32
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.readOnly_ = r10     // Catch:{ Exception -> 0x107f }
            boolean r10 = r9.A0F     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.notSpam_ = r10     // Catch:{ Exception -> 0x107f }
            int r10 = r9.A00     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r11 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r11
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.unreadMentionCount_ = r10     // Catch:{ Exception -> 0x107f }
            r2 = r20
            java.lang.Object r2 = r2.get(r8)     // Catch:{ Exception -> 0x107f }
            byte[] r2 = (byte[]) r2     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0c83
            X.8Lq r10 = X.C18280x3.A0H(r4, r2)     // Catch:{ Exception -> 0x107f }
            X.6cX r3 = r4.A00     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = (X.AnonymousClass1EG) r3     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r11 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 | r11
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.contactPrimaryIdentityKey_ = r10     // Catch:{ Exception -> 0x107f }
        L_0x0c83:
            int r10 = r9.A01     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 128(0x80, float:1.794E-43)
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.ephemeralExpiration_ = r10     // Catch:{ Exception -> 0x107f }
            boolean r10 = r9.A0E     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.archived_ = r10     // Catch:{ Exception -> 0x107f }
            long r2 = r9.A02     // Catch:{ Exception -> 0x107f }
            int r10 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x0cb1
            X.1EG r11 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r10 = r11.bitField0_     // Catch:{ Exception -> 0x107f }
            r10 = r10 | 256(0x100, float:3.59E-43)
            r11.bitField0_ = r10     // Catch:{ Exception -> 0x107f }
            r11.ephemeralSettingTimestamp_ = r2     // Catch:{ Exception -> 0x107f }
        L_0x0cb1:
            com.whatsapp.jid.UserJid r2 = r9.A07     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0cc5
            java.lang.String r10 = r2.getRawString()     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18280x3.A0N(r4, r10)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 2
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.newJid_ = r10     // Catch:{ Exception -> 0x107f }
        L_0x0cc5:
            com.whatsapp.jid.UserJid r2 = r9.A08     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0cd9
            java.lang.String r10 = r2.getRawString()     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18280x3.A0N(r4, r10)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 4
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.oldJid_ = r10     // Catch:{ Exception -> 0x107f }
        L_0x0cd9:
            boolean r2 = X.C627336j.A0K(r8)     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0de8
            java.lang.String r2 = r9.A0B     // Catch:{ Exception -> 0x107f }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x107f }
            if (r2 != 0) goto L_0x0cf5
            java.lang.String r10 = r9.A0B     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18280x3.A0N(r4, r10)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.name_ = r10     // Catch:{ Exception -> 0x107f }
        L_0x0cf5:
            com.whatsapp.jid.GroupJid r10 = X.AnonymousClass32V.A01(r8)     // Catch:{ Exception -> 0x107f }
            if (r10 == 0) goto L_0x0de8
            boolean r2 = r9.A0G     // Catch:{ Exception -> 0x107f }
            if (r2 != 0) goto L_0x0d15
            X.2sj r2 = r0.A0E     // Catch:{ Exception -> 0x107f }
            X.33k r2 = X.C56892sj.A01(r2, r10)     // Catch:{ Exception -> 0x107f }
            java.lang.String r9 = r2.A0C()     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18280x3.A0N(r4, r9)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.pHash_ = r9     // Catch:{ Exception -> 0x107f }
        L_0x0d15:
            X.3Ex r12 = r0.A07     // Catch:{ Exception -> 0x107f }
            X.3ZH r9 = r12.A0A(r10)     // Catch:{ Exception -> 0x107f }
            boolean r11 = r9.A0s     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r13 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 | r13
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.suspended_ = r11     // Catch:{ Exception -> 0x107f }
            X.2ss r13 = r0.A0C     // Catch:{ Exception -> 0x107f }
            boolean r11 = r13.A0N(r10)     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField1_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 4
            r3.bitField1_ = r2     // Catch:{ Exception -> 0x107f }
            r3.isDefaultSubgroup_ = r11     // Catch:{ Exception -> 0x107f }
            X.2sj r2 = r0.A0E     // Catch:{ Exception -> 0x107f }
            boolean r2 = r2.A0C(r10)     // Catch:{ Exception -> 0x107f }
            if (r2 != 0) goto L_0x0de8
            X.2zN r2 = r9.A0K     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0d60
            java.lang.String r3 = r2.A03     // Catch:{ Exception -> 0x107f }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x107f }
            if (r3 != 0) goto L_0x0d60
            java.lang.String r11 = r2.A03     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18280x3.A0N(r4, r11)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r24 = 1073741824(0x40000000, float:2.0)
            r2 = r2 | r24
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.description_ = r11     // Catch:{ Exception -> 0x107f }
        L_0x0d60:
            com.whatsapp.jid.UserJid r2 = r12.A0D(r10)     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0d77
            java.lang.String r11 = r2.getRawString()     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18280x3.A0N(r4, r11)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 | r12
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.createdBy_ = r11     // Catch:{ Exception -> 0x107f }
        L_0x0d77:
            java.lang.String r2 = r9.A0V     // Catch:{ Exception -> 0x107f }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x107f }
            if (r2 != 0) goto L_0x0d95
            java.lang.String r11 = r9.A0V     // Catch:{ Exception -> 0x107f }
            r2 = -9223372036854775808
            long r2 = X.C615531h.A04(r11, r2)     // Catch:{ Exception -> 0x107f }
            X.1EG r12 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r11 = r12.bitField0_     // Catch:{ Exception -> 0x107f }
            r24 = 268435456(0x10000000, float:2.5243549E-29)
            r11 = r11 | r24
            r12.bitField0_ = r11     // Catch:{ Exception -> 0x107f }
            r12.createdAt_ = r2     // Catch:{ Exception -> 0x107f }
        L_0x0d95:
            int r2 = r13.A06(r10)     // Catch:{ Exception -> 0x107f }
            r12 = 0
            r11 = 1
            boolean r13 = X.AnonymousClass000.A1U(r2, r11)
            X.1EG r3 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField1_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 1
            r3.bitField1_ = r2     // Catch:{ Exception -> 0x107f }
            r3.isParentGroup_ = r13     // Catch:{ Exception -> 0x107f }
            X.2zv r2 = r0.A0X     // Catch:{ Exception -> 0x107f }
            r2.A02(r10, r4)     // Catch:{ Exception -> 0x107f }
            X.1fJ r3 = X.AnonymousClass34R.A03(r10)     // Catch:{ Exception -> 0x107f }
            if (r3 == 0) goto L_0x0dce
            X.2zh r2 = r0.A0K     // Catch:{ Exception -> 0x107f }
            X.1fJ r2 = r2.A02(r3)     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0dce
            java.lang.String r10 = r2.getRawString()     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18280x3.A0N(r4, r10)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField1_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 2
            r3.bitField1_ = r2     // Catch:{ Exception -> 0x107f }
            r3.parentGroupId_ = r10     // Catch:{ Exception -> 0x107f }
        L_0x0dce:
            X.2lX r2 = r0.A0W     // Catch:{ Exception -> 0x107f }
            boolean r2 = r2.A00(r9)     // Catch:{ Exception -> 0x107f }
            if (r2 != 0) goto L_0x0dda
            int r2 = r9.A03     // Catch:{ Exception -> 0x107f }
            if (r2 != r11) goto L_0x0ddb
        L_0x0dda:
            r12 = 1
        L_0x0ddb:
            X.1EG r3 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r9 = 134217728(0x8000000, float:3.85186E-34)
            r2 = r2 | r9
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.terminated_ = r12     // Catch:{ Exception -> 0x107f }
        L_0x0de8:
            boolean r2 = r8 instanceof com.whatsapp.jid.UserJid     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0f40
            boolean r2 = r8 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0e73
            r3 = r8
            com.whatsapp.jid.PhoneUserJid r3 = (com.whatsapp.jid.PhoneUserJid) r3     // Catch:{ Exception -> 0x107f }
            X.2sM r2 = r0.A0M     // Catch:{ Exception -> 0x107f }
            X.1fH r2 = r2.A01(r3)     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0e0b
            java.lang.String r9 = r2.getRawString()     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18280x3.A0N(r4, r9)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField1_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 128(0x80, float:1.794E-43)
            r3.bitField1_ = r2     // Catch:{ Exception -> 0x107f }
            r3.lidJid_ = r9     // Catch:{ Exception -> 0x107f }
        L_0x0e0b:
            X.2ss r2 = r0.A0C     // Catch:{ Exception -> 0x107f }
            X.31A r9 = r2.A0A(r8, r7)     // Catch:{ Exception -> 0x107f }
            if (r9 == 0) goto L_0x0f40
            r2 = r23
            java.lang.Object r11 = r2.get(r8)     // Catch:{ Exception -> 0x107f }
            X.2K8 r11 = (X.AnonymousClass2K8) r11     // Catch:{ Exception -> 0x107f }
            if (r11 == 0) goto L_0x0e43
            byte[] r2 = r11.A01     // Catch:{ Exception -> 0x107f }
            X.8Lq r10 = X.C18280x3.A0H(r4, r2)     // Catch:{ Exception -> 0x107f }
            X.6cX r3 = r4.A00     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = (X.AnonymousClass1EG) r3     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r12 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r12
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.tcToken_ = r10     // Catch:{ Exception -> 0x107f }
            java.lang.Long r2 = r11.A00     // Catch:{ Exception -> 0x107f }
            long r2 = r2.longValue()     // Catch:{ Exception -> 0x107f }
            X.1EG r11 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r10 = r11.bitField0_     // Catch:{ Exception -> 0x107f }
            r12 = 524288(0x80000, float:7.34684E-40)
            r10 = r10 | r12
            r11.bitField0_ = r10     // Catch:{ Exception -> 0x107f }
            r11.tcTokenTimestamp_ = r2     // Catch:{ Exception -> 0x107f }
        L_0x0e43:
            r2 = r21
            java.lang.Object r2 = r2.get(r8)     // Catch:{ Exception -> 0x107f }
            X.2K9 r2 = (X.AnonymousClass2K9) r2     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0e62
            java.lang.Long r2 = r2.A01     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0e62
            long r2 = r2.longValue()     // Catch:{ Exception -> 0x107f }
            X.1EG r10 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r8 = r10.bitField0_     // Catch:{ Exception -> 0x107f }
            r11 = 33554432(0x2000000, float:9.403955E-38)
            r8 = r8 | r11
            r10.bitField0_ = r8     // Catch:{ Exception -> 0x107f }
            r10.tcTokenSenderTimestamp_ = r2     // Catch:{ Exception -> 0x107f }
        L_0x0e62:
            X.1EP r2 = X.AnonymousClass1EP.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x107f }
            X.6c9 r8 = r2.A0G()     // Catch:{ Exception -> 0x107f }
            X.19t r8 = (X.C209019t) r8     // Catch:{ Exception -> 0x107f }
            X.3Z2 r2 = r9.A0b     // Catch:{ Exception -> 0x107f }
            int r3 = r2.disappearingMessagesInitiator     // Catch:{ Exception -> 0x107f }
            r2 = 1
            if (r3 == r2) goto L_0x0f04
            goto L_0x0efe
        L_0x0e73:
            boolean r2 = X.C627336j.A0L(r8)     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0e0b
            r11 = r8
            X.1fH r11 = (X.C27981fH) r11     // Catch:{ Exception -> 0x107f }
            X.2q8 r10 = r0.A0L     // Catch:{ Exception -> 0x107f }
            java.lang.String r9 = r10.A00(r11)     // Catch:{ Exception -> 0x107f }
            if (r9 == 0) goto L_0x0e90
            X.1EG r3 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField1_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 8
            r3.bitField1_ = r2     // Catch:{ Exception -> 0x107f }
            r3.displayName_ = r9     // Catch:{ Exception -> 0x107f }
        L_0x0e90:
            java.lang.String r9 = r10.A01(r11)     // Catch:{ Exception -> 0x107f }
            if (r9 == 0) goto L_0x0ea2
            X.1EG r3 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField1_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 256(0x100, float:3.59E-43)
            r3.bitField1_ = r2     // Catch:{ Exception -> 0x107f }
            r3.username_ = r9     // Catch:{ Exception -> 0x107f }
        L_0x0ea2:
            X.2sM r2 = r0.A0M     // Catch:{ Exception -> 0x107f }
            com.whatsapp.jid.PhoneUserJid r2 = r2.A02(r11)     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0eba
            java.lang.String r9 = r2.getRawString()     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18280x3.A0N(r4, r9)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField1_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 16
            r3.bitField1_ = r2     // Catch:{ Exception -> 0x107f }
            r3.pnJid_ = r9     // Catch:{ Exception -> 0x107f }
        L_0x0eba:
            X.311 r10 = r0.A0N     // Catch:{ Exception -> 0x107f }
            java.lang.Boolean r2 = r10.A01(r11)     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0ed2
            boolean r9 = r2.booleanValue()     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField1_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 32
            r3.bitField1_ = r2     // Catch:{ Exception -> 0x107f }
            r3.shareOwnPn_ = r9     // Catch:{ Exception -> 0x107f }
        L_0x0ed2:
            boolean r9 = r10.A0A(r11)     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField1_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 64
            r3.bitField1_ = r2     // Catch:{ Exception -> 0x107f }
            r3.pnhDuplicateLidThread_ = r9     // Catch:{ Exception -> 0x107f }
            X.2ss r2 = r0.A0C     // Catch:{ Exception -> 0x107f }
            X.31A r2 = r2.A0A(r11, r7)     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0e0b
            X.21b r2 = r2.A0Z     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0e0b
            java.lang.String r9 = r2.origin     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18280x3.A0N(r4, r9)     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField1_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 512(0x200, float:7.175E-43)
            r3.bitField1_ = r2     // Catch:{ Exception -> 0x107f }
            r3.lidOriginType_ = r9     // Catch:{ Exception -> 0x107f }
            goto L_0x0e0b
        L_0x0efe:
            r2 = 2
            if (r3 == r2) goto L_0x0f07
            X.22v r2 = X.C374922v.CHANGED_IN_CHAT     // Catch:{ Exception -> 0x107f }
            goto L_0x0f09
        L_0x0f04:
            X.22v r2 = X.C374922v.INITIATED_BY_ME     // Catch:{ Exception -> 0x107f }
            goto L_0x0f09
        L_0x0f07:
            X.22v r2 = X.C374922v.INITIATED_BY_OTHER     // Catch:{ Exception -> 0x107f }
        L_0x0f09:
            r8.A09(r2)     // Catch:{ Exception -> 0x107f }
            X.2kh r3 = r9.A0a     // Catch:{ Exception -> 0x107f }
            if (r3 == 0) goto L_0x0f2c
            X.1VX r2 = r0.A0S     // Catch:{ Exception -> 0x107f }
            boolean r2 = X.C56952sp.A0G(r2)     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0f2c
            int r2 = r3.A00     // Catch:{ Exception -> 0x107f }
            X.22w r2 = X.C57472th.A00(r2)     // Catch:{ Exception -> 0x107f }
            r8.A0A(r2)     // Catch:{ Exception -> 0x107f }
            java.lang.Boolean r2 = r3.A01     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0f2c
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x107f }
            r8.A0B(r2)     // Catch:{ Exception -> 0x107f }
        L_0x0f2c:
            X.6cX r2 = r8.A06()     // Catch:{ Exception -> 0x107f }
            X.1EP r2 = (X.AnonymousClass1EP) r2     // Catch:{ Exception -> 0x107f }
            X.1EG r3 = X.C18280x3.A0N(r4, r2)     // Catch:{ Exception -> 0x107f }
            r3.disappearingMode_ = r2     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r8 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r8
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
        L_0x0f40:
            X.1EG r8 = X.C18290x4.A0U(r4)     // Catch:{ Exception -> 0x107f }
            r3 = 1000000(0xf4240, float:1.401298E-39)
            int r2 = r8.bitField1_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r8.bitField1_ = r2     // Catch:{ Exception -> 0x107f }
            r8.commentsCount_ = r3     // Catch:{ Exception -> 0x107f }
            java.util.List r8 = r5.A02     // Catch:{ Exception -> 0x107f }
            int r2 = r8.size()     // Catch:{ Exception -> 0x107f }
            long r2 = (long) r2     // Catch:{ Exception -> 0x107f }
            long r37 = r37 + r2
            boolean r2 = r8.isEmpty()     // Catch:{ Exception -> 0x107f }
            if (r2 != 0) goto L_0x0f9f
            X.1iB r3 = r0.A0O     // Catch:{ Exception -> 0x107f }
            int r2 = r44.getDevice()     // Catch:{ Exception -> 0x107f }
            X.33G r2 = r3.A09(r2)     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0f73
            X.2xO r2 = r2.A06     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0f73
            boolean r2 = r2.A06     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0f73
            r7 = 1
        L_0x0f73:
            X.20z r3 = X.C371120z.FOR_COMPANION_SYNC     // Catch:{ Exception -> 0x107f }
            r2 = 0
            X.C162457s7.A0J(r3, r2)     // Catch:{ Exception -> 0x107f }
            X.2av r2 = new X.2av     // Catch:{ Exception -> 0x107f }
            r2.<init>(r3)     // Catch:{ Exception -> 0x107f }
            r2.A03 = r7     // Catch:{ Exception -> 0x107f }
            X.2mJ r3 = r2.A00()     // Catch:{ Exception -> 0x107f }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x107f }
        L_0x0f88:
            boolean r2 = r8.hasNext()     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x0f9f
            X.34x r7 = X.C18300x5.A0T(r8)     // Catch:{ Exception -> 0x107f }
            X.2zv r2 = r0.A0X     // Catch:{ Exception -> 0x0f98 }
            r2.A03(r3, r4, r7)     // Catch:{ Exception -> 0x0f98 }
            goto L_0x0f88
        L_0x0f98:
            r7 = move-exception
            java.lang.String r2 = "history-sync-send-methods/send-initial-bootstrap addMessage exception"
            com.whatsapp.util.Log.e(r2, r7)     // Catch:{ Exception -> 0x107f }
            goto L_0x0f88
        L_0x0f9f:
            java.lang.Long r7 = r5.A01     // Catch:{ Exception -> 0x107f }
            java.lang.String r2 = "history-sync-send-methods/setEndOfHistoryStatusForInitialSync"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x107f }
            if (r7 != 0) goto L_0x0fab
            X.22o r2 = X.C374222o.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY     // Catch:{ Exception -> 0x107f }
            goto L_0x0fcc
        L_0x0fab:
            X.2Xj r5 = r0.A04     // Catch:{ Exception -> 0x107f }
            r3 = 2
            if (r22 == 0) goto L_0x0fb1
            r3 = 3
        L_0x0fb1:
            r2 = r22
            long r11 = r5.A00(r1, r3, r2)     // Catch:{ Exception -> 0x107f }
            long r9 = r7.longValue()     // Catch:{ Exception -> 0x107f }
            X.2sH r2 = r0.A09     // Catch:{ Exception -> 0x107f }
            long r7 = r2.A0H()     // Catch:{ Exception -> 0x107f }
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r11 * r2
            long r7 = r7 - r11
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x0fcf
            X.22o r2 = X.C374222o.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY     // Catch:{ Exception -> 0x107f }
        L_0x0fcc:
            r4.A09(r2)     // Catch:{ Exception -> 0x107f }
        L_0x0fcf:
            X.6cX r2 = r4.A06()     // Catch:{ Exception -> 0x107f }
            X.1EG r2 = (X.AnonymousClass1EG) r2     // Catch:{ Exception -> 0x107f }
            r15.A0C(r2)     // Catch:{ Exception -> 0x107f }
            X.30N r7 = r0.A0U     // Catch:{ Exception -> 0x107f }
            java.util.Random r5 = r0.A0d     // Catch:{ Exception -> 0x107f }
            long r8 = r7.A03(r5)     // Catch:{ Exception -> 0x107f }
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 % r2
            long r2 = X.C18290x4.A0B(r8)     // Catch:{ Exception -> 0x107f }
            int r4 = (int) r2     // Catch:{ Exception -> 0x107f }
            X.6cX r3 = X.C18320x8.A0C(r15)     // Catch:{ Exception -> 0x107f }
            X.1E2 r3 = (X.AnonymousClass1E2) r3     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 32
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.threadDsTimeframeOffset_ = r4     // Catch:{ Exception -> 0x107f }
            byte[] r2 = r7.A06(r5)     // Catch:{ Exception -> 0x107f }
            X.8Lq r4 = X.C18270x1.A09(r15, r2)     // Catch:{ Exception -> 0x107f }
            X.6cX r3 = r15.A00     // Catch:{ Exception -> 0x107f }
            X.1E2 r3 = (X.AnonymousClass1E2) r3     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 16
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
            r3.threadIdUserSecret_ = r4     // Catch:{ Exception -> 0x107f }
            goto L_0x0bc4
        L_0x100d:
            X.5rC r2 = r0.A00     // Catch:{ Exception -> 0x107f }
            java.lang.Object r4 = r2.A05()     // Catch:{ Exception -> 0x107f }
            X.2sS r4 = (X.C56722sS) r4     // Catch:{ Exception -> 0x107f }
            if (r4 == 0) goto L_0x105b
            X.2m4 r5 = r4.A01     // Catch:{ Exception -> 0x107f }
            X.1VX r7 = r5.A03     // Catch:{ Exception -> 0x107f }
            r3 = 5459(0x1553, float:7.65E-42)
            X.2vE r2 = X.C58422vE.A02     // Catch:{ Exception -> 0x107f }
            boolean r2 = r7.A0Y(r2, r3)     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x105b
            boolean r2 = r5.A01()     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x105b
            X.2qG r2 = r4.A04     // Catch:{ Exception -> 0x107f }
            X.21j r2 = r2.A00()     // Catch:{ Exception -> 0x107f }
            if (r2 == 0) goto L_0x105b
            int r4 = r2.ordinal()     // Catch:{ Exception -> 0x107f }
            r3 = 0
            r2 = 0
            if (r4 == r3) goto L_0x104b
            r2 = 1
            if (r4 == r2) goto L_0x1049
            r2 = 2
            if (r4 != r2) goto L_0x1044
            X.22Z r2 = X.AnonymousClass22Z.AI_AVAILABLE     // Catch:{ Exception -> 0x107f }
            goto L_0x104b
        L_0x1044:
            X.3f1 r2 = X.C73153f1.A00()     // Catch:{ Exception -> 0x107f }
            throw r2     // Catch:{ Exception -> 0x107f }
        L_0x1049:
            X.22Z r2 = X.AnonymousClass22Z.IN_WAITLIST     // Catch:{ Exception -> 0x107f }
        L_0x104b:
            X.6cX r3 = X.C18320x8.A0C(r15)     // Catch:{ Exception -> 0x107f }
            X.1E2 r3 = (X.AnonymousClass1E2) r3     // Catch:{ Exception -> 0x107f }
            int r2 = r2.value     // Catch:{ Exception -> 0x107f }
            r3.aiWaitListState_ = r2     // Catch:{ Exception -> 0x107f }
            int r2 = r3.bitField0_     // Catch:{ Exception -> 0x107f }
            r2 = r2 | 64
            r3.bitField0_ = r2     // Catch:{ Exception -> 0x107f }
        L_0x105b:
            r23 = 0
            r25 = 0
            r27 = 100
            r31 = -1
            r28 = r25
            r35 = r31
            r39 = r16
            r41 = r31
            r19 = r0
            r20 = r18
            r21 = r44
            r22 = r15
            r24 = r23
            r26 = r25
            r29 = r16
            r33 = r31
            r19.A01(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r37, r39, r41, r43)     // Catch:{ Exception -> 0x107f }
            goto L_0x108d
        L_0x107f:
            r5 = move-exception
            X.2qk r4 = r0.A01
            java.lang.String r3 = "history-sync-send-methods/send-initial-bootstrap/exception"
            r2 = 0
            r4.A09(r3, r2, r5)
            java.lang.String r2 = "history-sync-send-methods/send-initial-bootstrap: recent msgs error"
            com.whatsapp.util.Log.e(r2, r5)
        L_0x108d:
            r2 = r44
            boolean r2 = r6.A02(r2)
            if (r2 != 0) goto L_0x1170
            java.lang.String r2 = "history-sync-manager/ sendStatusV3 messages"
            com.whatsapp.util.Log.d((java.lang.String) r2)
            X.2pt r3 = r0.A0I     // Catch:{ Exception -> 0x116a }
            r2 = 0
            java.util.List r7 = r3.A01(r2)     // Catch:{ Exception -> 0x116a }
            java.util.Collections.reverse(r7)     // Catch:{ Exception -> 0x116a }
            X.1A0 r4 = X.AnonymousClass0x7.A0Z()     // Catch:{ Exception -> 0x116a }
            X.23J r2 = X.AnonymousClass23J.INITIAL_STATUS_V3     // Catch:{ Exception -> 0x116a }
            r4.A0D(r2)     // Catch:{ Exception -> 0x116a }
            X.1VX r5 = r0.A0S     // Catch:{ Exception -> 0x116a }
            r3 = 1182(0x49e, float:1.656E-42)
            X.2vE r2 = X.C58422vE.A02     // Catch:{ Exception -> 0x116a }
            int r9 = r5.A0O(r2, r3)     // Catch:{ Exception -> 0x116a }
            java.util.Iterator r11 = r7.iterator()     // Catch:{ Exception -> 0x116a }
            r7 = 0
        L_0x10bc:
            boolean r2 = r11.hasNext()     // Catch:{ Exception -> 0x116a }
            if (r2 == 0) goto L_0x1139
            X.34x r3 = X.C18300x5.A0T(r11)     // Catch:{ Exception -> 0x116a }
            X.20z r5 = X.C371120z.FOR_COMPANION_SYNC     // Catch:{ 24A -> 0x1129 }
            r2 = 0
            X.C162457s7.A0J(r5, r2)     // Catch:{ 24A -> 0x1129 }
            X.2av r2 = new X.2av     // Catch:{ 24A -> 0x1129 }
            r2.<init>(r5)     // Catch:{ 24A -> 0x1129 }
            X.2mJ r5 = r2.A00()     // Catch:{ 24A -> 0x1129 }
            X.8qC r2 = r0.A0b     // Catch:{ 24A -> 0x1129 }
            java.lang.Object r2 = r2.get()     // Catch:{ 24A -> 0x1129 }
            X.33H r2 = (X.AnonymousClass33H) r2     // Catch:{ 24A -> 0x1129 }
            X.1A3 r10 = r2.A02(r5, r3)     // Catch:{ 24A -> 0x1129 }
            if (r10 == 0) goto L_0x10bc
            X.2z0 r2 = r3.A1J     // Catch:{ Exception -> 0x116a }
            boolean r2 = r2.A02     // Catch:{ Exception -> 0x116a }
            if (r2 != 0) goto L_0x1101
            X.33e r2 = r0.A0J     // Catch:{ Exception -> 0x116a }
            boolean r2 = r2.A0H(r3)     // Catch:{ Exception -> 0x116a }
            if (r2 != 0) goto L_0x1101
            X.1ES r5 = X.C18280x3.A0O(r10)     // Catch:{ Exception -> 0x116a }
            r3 = 1
            int r2 = r5.bitField0_     // Catch:{ Exception -> 0x116a }
            r2 = r2 | 64
            r5.bitField0_ = r2     // Catch:{ Exception -> 0x116a }
            r5.ignore_ = r3     // Catch:{ Exception -> 0x116a }
            r10.A06()     // Catch:{ Exception -> 0x116a }
        L_0x1101:
            int r7 = r7 + 1
            X.6cX r8 = X.C18320x8.A0C(r4)     // Catch:{ Exception -> 0x116a }
            X.1E2 r8 = (X.AnonymousClass1E2) r8     // Catch:{ Exception -> 0x116a }
            X.6cX r5 = r10.A06()     // Catch:{ Exception -> 0x116a }
            X.1ES r5 = (X.AnonymousClass1ES) r5     // Catch:{ Exception -> 0x116a }
            r5.getClass()     // Catch:{ Exception -> 0x116a }
            X.8ya r3 = r8.statusV3Messages_     // Catch:{ Exception -> 0x116a }
            r2 = r3
            X.8T6 r2 = (X.AnonymousClass8T6) r2     // Catch:{ Exception -> 0x116a }
            boolean r2 = r2.A00     // Catch:{ Exception -> 0x116a }
            if (r2 != 0) goto L_0x1121
            X.8ya r3 = X.C130786cX.A07(r3)     // Catch:{ Exception -> 0x116a }
            r8.statusV3Messages_ = r3     // Catch:{ Exception -> 0x116a }
        L_0x1121:
            r3.add(r5)     // Catch:{ Exception -> 0x116a }
            if (r9 <= 0) goto L_0x10bc
            if (r7 < r9) goto L_0x10bc
            goto L_0x1130
        L_0x1129:
            r3 = move-exception
            java.lang.String r2 = "HistorySyncSendMethods/sendStatusV3Messages/invalid message"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ Exception -> 0x116a }
            goto L_0x10bc
        L_0x1130:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x116a }
            java.lang.String r2 = "history-sync-send-methods/sendStatusV3Messages reach max status msg, count="
            X.C18260x0.A0y(r2, r3, r7)     // Catch:{ Exception -> 0x116a }
        L_0x1139:
            r23 = 0
            r29 = 0
            r25 = 0
            r26 = 1
            r27 = 100
            r31 = -1
            X.6cX r2 = r4.A00     // Catch:{ Exception -> 0x116a }
            X.1E2 r2 = (X.AnonymousClass1E2) r2     // Catch:{ Exception -> 0x116a }
            X.8ya r2 = r2.statusV3Messages_     // Catch:{ Exception -> 0x116a }
            int r2 = r2.size()     // Catch:{ Exception -> 0x116a }
            long r2 = (long) r2     // Catch:{ Exception -> 0x116a }
            r35 = r31
            r41 = r31
            r19 = r0
            r20 = r18
            r21 = r44
            r22 = r4
            r24 = r23
            r28 = r25
            r33 = r31
            r37 = r2
            r39 = r29
            r19.A01(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r37, r39, r41, r43)     // Catch:{ Exception -> 0x116a }
            goto L_0x1170
        L_0x116a:
            r3 = move-exception
            java.lang.String r2 = "history-sync-send-methods/send-status-v3: error"
            com.whatsapp.util.Log.e(r2, r3)
        L_0x1170:
            r23 = 0
            r25 = 0
            r11 = 0
            r17 = r0
            r19 = r44
            r20 = r23
            r21 = r11
            r22 = r43
            r17.A04(r18, r19, r20, r21, r22)
            X.2RU r7 = new X.2RU
            r2 = r44
            r7.<init>(r2)
            r2 = r18
            r7.A00 = r2
            X.1VX r5 = r6.A0F
            r3 = 1829(0x725, float:2.563E-42)
            X.2vE r2 = X.C58422vE.A02
            int r4 = r5.A0O(r2, r3)
            r3 = 3
            if (r4 < r3) goto L_0x119d
            r3 = 1
            r7.A03 = r3
        L_0x119d:
            X.2zn r3 = r6.A0A
            X.1VX r4 = r3.A02
            r3 = 1613(0x64d, float:2.26E-42)
            boolean r3 = r4.A0Y(r2, r3)
            if (r3 == 0) goto L_0x11b4
            r3 = 1598(0x63e, float:2.239E-42)
            boolean r3 = r4.A0Y(r2, r3)
            if (r3 == 0) goto L_0x11b4
            r3 = 1
            r7.A02 = r3
        L_0x11b4:
            if (r1 == 0) goto L_0x11cf
            boolean r3 = r1.A07
            if (r3 == 0) goto L_0x11cf
            r3 = 5417(0x1529, float:7.591E-42)
            int r4 = r5.A0O(r2, r3)
            r3 = 2
            if (r4 >= r3) goto L_0x11cc
            r3 = 6646(0x19f6, float:9.313E-42)
            int r4 = r5.A0O(r2, r3)
            r3 = 2
            if (r4 < r3) goto L_0x11cf
        L_0x11cc:
            r3 = 1
            r7.A01 = r3
        L_0x11cf:
            com.whatsapp.jid.DeviceJid r5 = r7.A04
            X.2jp r4 = r7.A00
            boolean r10 = r7.A03
            boolean r9 = r7.A02
            boolean r8 = r7.A01
            X.2sr r3 = r0.A02
            boolean r3 = r3.A0Y()
            if (r3 == 0) goto L_0x128c
            java.lang.String r0 = "history-sync-send-methods/sendNonBlockingDataMessages no support for companionMode"
        L_0x11e3:
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x11e6:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "history-sync-manager/addMessageHistorySync "
            r0 = r44
            X.C18270x1.A1H(r4, r3, r0)
            java.lang.String r0 = " sync type "
            X.C18260x0.A0w(r0, r4, r14)
            r8 = 1
            r9 = 3
            boolean r0 = X.AnonymousClass000.A1U(r14, r9)
            long r25 = r6.A00(r1, r14, r0)
            X.2Xj r7 = r6.A02
            if (r14 != r9) goto L_0x1205
            r11 = 1
        L_0x1205:
            r0 = 2
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r4 = -1
            if (r14 == r0) goto L_0x126a
            if (r1 == 0) goto L_0x1261
            java.lang.Integer r0 = r1.A01
            if (r0 == 0) goto L_0x1261
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x1261
        L_0x1219:
            long r4 = (long) r0
            long r4 = r4 * r12
        L_0x121b:
            X.2rt r0 = r6.A0B
            long r2 = r0.A01()
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "history-sync-manager/addMessageHistorySync lastMessageId = "
            X.C18260x0.A10(r0, r10, r2)
            r10 = 1
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x1231
            long r2 = r2 + r10
        L_0x1231:
            if (r14 != r9) goto L_0x125e
            r0 = 2
            long r23 = r6.A00(r1, r0, r8)
            X.1VX r7 = r7.A01
            r1 = 2645(0xa55, float:3.706E-42)
            r7.A0N(r1)
            r27 = -1
            r17 = r6
            r19 = r44
            r20 = r0
            r21 = r2
            r17.A01(r18, r19, r20, r21, r23, r25, r27)
        L_0x124c:
            r15 = r25
            r7 = r6
            r8 = r18
            r9 = r44
            r10 = r14
            r11 = r23
            r13 = r25
            r17 = r4
            r7.A01(r8, r9, r10, r11, r13, r15, r17)
            return
        L_0x125e:
            r23 = r2
            goto L_0x124c
        L_0x1261:
            X.3Mh r2 = r7.A00
            X.1Ek r0 = X.C66663Mh.A1J
            int r0 = r2.A03(r0)
            goto L_0x1219
        L_0x126a:
            X.1VX r3 = r7.A01
            r0 = 2645(0xa55, float:3.706E-42)
            int r10 = r3.A0O(r2, r0)
            if (r11 != 0) goto L_0x121b
            if (r1 == 0) goto L_0x121b
            java.lang.Integer r11 = r1.A03
            if (r11 == 0) goto L_0x121b
            r0 = -1
            if (r10 == r0) goto L_0x121b
            int r0 = r11.intValue()
            if (r0 <= r10) goto L_0x121b
            r0 = 2706(0xa92, float:3.792E-42)
            int r0 = r3.A0O(r2, r0)
            if (r0 <= 0) goto L_0x121b
            goto L_0x1219
        L_0x128c:
            if (r10 != 0) goto L_0x1296
            if (r9 != 0) goto L_0x1296
            if (r8 != 0) goto L_0x1296
            java.lang.String r0 = "history-sync-send-methods/sendNonBlockingDataMessages nothing to send"
            goto L_0x11e3
        L_0x1296:
            X.1A0 r3 = X.AnonymousClass0x7.A0Z()     // Catch:{ Exception -> 0x12d3 }
            X.23J r7 = X.AnonymousClass23J.NON_BLOCKING_DATA     // Catch:{ Exception -> 0x12d3 }
            r3.A0D(r7)     // Catch:{ Exception -> 0x12d3 }
            if (r10 == 0) goto L_0x12a4
            r0.A09(r3)     // Catch:{ Exception -> 0x12d3 }
        L_0x12a4:
            if (r9 == 0) goto L_0x12a9
            r0.A07(r3)     // Catch:{ Exception -> 0x12d3 }
        L_0x12a9:
            if (r8 == 0) goto L_0x12ae
            r0.A08(r3)     // Catch:{ Exception -> 0x12d3 }
        L_0x12ae:
            r29 = 0
            r26 = 5
            r27 = 100
            r31 = -1
            r35 = r31
            r39 = r29
            r41 = r31
            r43 = r11
            r19 = r0
            r20 = r4
            r21 = r5
            r22 = r3
            r24 = r23
            r28 = r11
            r33 = r31
            r37 = r29
            r19.A01(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r37, r39, r41, r43)     // Catch:{ Exception -> 0x12d3 }
            goto L_0x11e6
        L_0x12d3:
            r3 = move-exception
            java.lang.String r0 = "history-sync-send-methods/sendNonBlockingDataMessages: error"
            com.whatsapp.util.Log.e(r0, r3)
            goto L_0x11e6
        L_0x12db:
            java.lang.Object r1 = r2.A00
            X.4Ia r1 = (X.C85894Ia) r1
            java.lang.Object r0 = r2.A01
            X.2sk r0 = (X.C56902sk) r0
            java.lang.Object r10 = r2.A02
            X.2w2 r10 = (X.C58922w2) r10
            java.lang.Object r9 = r2.A03
            X.2NP r9 = (X.AnonymousClass2NP) r9
            java.io.File r8 = r0.A03()
            X.C626936e.A06(r8)
            java.lang.Object r7 = r1.A00
            X.301 r7 = (X.AnonymousClass301) r7
            X.2xv r0 = r7.A0N
            java.lang.String r6 = r10.A08
            java.lang.String r5 = r8.getAbsolutePath()
            X.C626936e.A00()
            X.1RE r0 = r0.A01
            X.4Fq r4 = r0.A0C()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x1321 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x1321 }
            java.lang.String r2 = "UPDATE history_sync_companion SET local_path = ? WHERE message_id = ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x1321 }
            X.AnonymousClass000.A16(r5, r6, r1)     // Catch:{ all -> 0x1321 }
            java.lang.String r0 = "HistorySyncCompanionStore.UPDATE_CHUNK_WITH_LOCAL_PATH"
            r3.A0I(r2, r0, r1)     // Catch:{ all -> 0x1321 }
            r4.close()
            r7.A02(r9, r10, r8)
            return
        L_0x1321:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x18c6 }
            throw r1
        L_0x1326:
            java.lang.Object r4 = r2.A00
            X.3Yy r4 = (X.C69903Yy) r4
            java.lang.Object r3 = r2.A01
            X.4eX r3 = (X.C89634eX) r3
            java.lang.Object r5 = r2.A02
            X.3ZH r5 = (X.AnonymousClass3ZH) r5
            java.lang.Object r6 = r2.A03
            X.5ZU r1 = r3.A0D
            r0 = 7
            X.7HU r0 = r1.A0B(r5, r0)
            X.C162457s7.A0D(r0)
            r4.element = r0
            X.3Wi r0 = r3.A05
            r7 = 33
        L_0x1344:
            X.3cM r1 = new X.3cM
            r2 = r1
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (int) r7)
            goto L_0x17a8
        L_0x134c:
            java.lang.Object r4 = r2.A00
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r4 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r4
            java.lang.Object r0 = r2.A01
            X.3Yy r0 = (X.C69903Yy) r0
            java.lang.Object r3 = r2.A02
            X.3ZH r3 = (X.AnonymousClass3ZH) r3
            java.lang.Object r1 = r2.A03
            X.5QN r1 = (X.AnonymousClass5QN) r1
            java.lang.Object r0 = r0.element
            X.7HU r0 = (X.AnonymousClass7HU) r0
            r4.A7d(r1, r0, r3)
            return
        L_0x1364:
            java.lang.Object r4 = r2.A00
            X.4mK r4 = (X.C92244mK) r4
            java.lang.Object r3 = r2.A01
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r1 = r2.A02
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r2.A03
            X.3ZF r0 = (X.AnonymousClass3ZF) r0
            X.C92244mK.A00(r1, r4, r0, r3)
            return
        L_0x1378:
            java.lang.Object r4 = r2.A00
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r4 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r4
            java.lang.Object r3 = r2.A01
            X.4uZ r3 = (X.C95814uZ) r3
            java.lang.Object r1 = r2.A02
            X.34x r1 = (X.C624134x) r1
            java.lang.Object r0 = r2.A03
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            r4.A78(r0, r3, r1)
            return
        L_0x138c:
            java.lang.Object r5 = r2.A00
            X.30j r5 = (X.C613530j) r5
            java.lang.Object r4 = r2.A01
            X.2o6 r4 = (X.C54052o6) r4
            java.lang.Object r3 = r2.A02
            X.2nk r3 = (X.C53832nk) r3
            java.lang.Object r1 = r2.A03
            X.4DQ r1 = (X.AnonymousClass4DQ) r1
            r0 = 2
            X.C162457s7.A0J(r3, r0)
            r5.A03(r4, r3, r1)
            return
        L_0x13a4:
            java.lang.Object r4 = r2.A00
            X.30j r4 = (X.C613530j) r4
            java.lang.Object r3 = r2.A01
            X.2o6 r3 = (X.C54052o6) r3
            java.lang.Object r1 = r2.A02
            X.2nk r1 = (X.C53832nk) r1
            java.lang.Object r0 = r2.A03
            X.4DQ r0 = (X.AnonymousClass4DQ) r0
            r4.A03(r3, r1, r0)
            return
        L_0x13b8:
            java.lang.Object r4 = r2.A00
            X.5l7 r4 = (X.C113245l7) r4
            java.lang.Object r1 = r2.A01
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r2.A02
            r30 = r0
            java.lang.Object r0 = r2.A03
            r29 = r0
            X.8qC r0 = r4.A61
            java.lang.Object r0 = r0.get()
            X.5LO r0 = (X.AnonymousClass5LO) r0
            X.8qC r0 = r0.A0C
            java.lang.Object r7 = r0.get()
            X.5Yy r7 = (X.C106425Yy) r7
            java.util.LinkedList r21 = X.AnonymousClass0x9.A18()
            java.util.LinkedList r20 = X.AnonymousClass0x9.A18()
            X.5Xq r19 = new X.5Xq
            r19.<init>()
            java.util.HashMap r18 = X.AnonymousClass001.A0t()
            java.util.Iterator r17 = r1.iterator()
        L_0x13ed:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x1793
            X.34x r6 = X.C18300x5.A0T(r17)
            X.2z0 r0 = r6.A1J
            X.4uZ r9 = r0.A00
            boolean r0 = r9 instanceof X.C95804uY
            if (r0 == 0) goto L_0x13ed
            r8 = r9
            X.4uY r8 = (X.C95804uY) r8
            if (r8 == 0) goto L_0x13ed
            long r0 = r6.A1M
            int r3 = (int) r0
            X.676 r0 = r4.A2z
            X.5ZU r2 = r0.getWAContactNames()
            X.3ZH r1 = r4.A3n
            r0 = -1
            X.7HU r0 = r2.A0B(r1, r0)
            java.lang.String r1 = r0.A01
            if (r1 != 0) goto L_0x141a
            java.lang.String r1 = ""
        L_0x141a:
            X.21p r0 = X.C372721p.UPDATE_CARD
            X.2mS r5 = new X.2mS
            r5.<init>(r8, r0, r1, r3)
            X.676 r0 = r4.A2z
            X.4eZ r1 = r0.getActivity()
            X.3ZH r11 = r4.A3n
            r3 = 0
            X.C162457s7.A0J(r1, r3)
            r0 = 3
            X.C162457s7.A0J(r11, r0)
            X.00m r16 = X.C107405bG.A01(r1)
            X.1h8 r2 = new X.1h8
            r0 = r16
            r2.<init>(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131167629(0x7f07098d, float:1.7949537E38)
            int r13 = r1.getDimensionPixelSize(r0)
            float r12 = (float) r13
            r0 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r0
            X.30g r1 = r2.getContactPhotosBitmapManager()
            android.content.Context r0 = r2.getContext()
            android.graphics.Bitmap r1 = r1.A01(r0, r11, r12, r13)
            r14 = r1
            boolean r10 = r6 instanceof X.AnonymousClass1n2
            r8 = 0
            if (r10 == 0) goto L_0x178a
            r0 = r6
            X.1mV r0 = (X.C30471mV) r0
            X.33C r0 = r0.A01
            if (r0 == 0) goto L_0x1790
            java.io.File r0 = r0.A0F
            if (r0 == 0) goto L_0x1790
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L_0x1790
            android.graphics.Bitmap r14 = android.graphics.BitmapFactory.decodeFile(r0)
        L_0x1472:
            android.graphics.drawable.Drawable r0 = r2.A00(r14)
            r2.setBackground(r0)
            android.widget.ImageView r14 = r2.A09
            if (r1 != 0) goto L_0x1494
            X.5UX r0 = r2.getContactAvatars()
            int r8 = r0.A00(r11)
            X.5UX r1 = r2.getContactAvatars()
            android.content.Context r0 = r2.getContext()
            android.graphics.Bitmap r1 = r1.A02(r0, r12, r8, r13)
            X.C162457s7.A0D(r1)
        L_0x1494:
            r14.setImageBitmap(r1)
            X.5YB r0 = r2.A0J
            r0.A08(r11)
            X.2ss r0 = r2.getChatsCache()
            X.31A r1 = r0.A0A(r9, r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo"
            X.C162457s7.A0K(r1, r0)
            X.1RL r1 = (X.AnonymousClass1RL) r1
            long r0 = r1.A05
            int r8 = (int) r0
            X.5QQ r0 = r2.getNewsletterNumberFormatter()
            int r12 = r0.A00(r8)
            java.lang.String r11 = r0.A01(r12)
            r0 = 1
            X.C162457s7.A0J(r11, r0)
            android.widget.TextView r9 = r2.A0B
            android.content.res.Resources r8 = r2.getResources()
            r1 = 2131755230(0x7f1000de, float:1.9141333E38)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r11
            java.lang.String r0 = r8.getQuantityString(r1, r12, r0)
            r9.setText(r0)
            r12 = 0
            if (r10 == 0) goto L_0x1787
            r0 = r6
            X.1mV r0 = (X.C30471mV) r0
            X.33C r0 = r0.A01
            if (r0 == 0) goto L_0x1787
            java.io.File r0 = r0.A0F
            if (r0 == 0) goto L_0x1787
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L_0x1787
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeFile(r0)
        L_0x14eb:
            r1 = 288(0x120, float:4.04E-43)
            r0 = 1090519040(0x41000000, float:8.0)
            android.graphics.Bitmap r1 = X.C107655bf.A0H(r8, r0, r1)
            boolean r0 = r6 instanceof X.C30471mV
            if (r0 == 0) goto L_0x1777
            r0 = r6
            X.1mV r0 = (X.C30471mV) r0
            java.lang.String r13 = r0.A02
        L_0x14fc:
            X.4FP r10 = r6.A0L
            if (r10 == 0) goto L_0x1772
            X.1VX r9 = r2.getAbProps()
            r8 = 2378(0x94a, float:3.332E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r8 = r9.A0Y(r0, r8)
            r0 = 3
            if (r8 == 0) goto L_0x1510
            r0 = 4
        L_0x1510:
            java.util.List r11 = X.C107165ao.A04(r10, r0, r3)
            int r10 = r10.BBt()
        L_0x1518:
            r9 = 8
            com.whatsapp.components.button.ThumbnailButton r14 = r2.A0K
            if (r1 == 0) goto L_0x176d
            r14.setImageBitmap(r1)
        L_0x1521:
            boolean r0 = r6 instanceof X.C30481mW
            if (r0 == 0) goto L_0x1572
            r15 = r6
            X.1mW r15 = (X.C30481mW) r15
            java.lang.String r8 = r15.A07
            if (r8 == 0) goto L_0x1763
            r0 = 1065353216(0x3f800000, float:1.0)
            r14.A02 = r0
            r0 = 1
            X.924 r1 = new X.924
            r1.<init>(r2, r0)
            r14.A06 = r1
            X.2tL r1 = new X.2tL
            r1.<init>(r2, r0)
            X.1sV r0 = r2.getMessageThumbCache()
            r0.A09(r14, r15, r1)
            android.view.View r0 = r2.A07
            r0.setVisibility(r3)
            android.widget.TextView r1 = r2.A0G
            java.lang.String r0 = r15.A06
            r1.setText(r0)
            android.widget.TextView r1 = r2.A0E
            java.lang.String r0 = r15.A04
            r1.setText(r0)
            X.5Zz r0 = r2.getLinkifyWeb()
            java.lang.String r15 = X.C57132t9.A00(r0, r8)
            if (r15 == 0) goto L_0x1572
            android.widget.TextView r8 = r2.A0F
            r1 = 150(0x96, float:2.1E-43)
            int r0 = r15.length()
            if (r0 <= r1) goto L_0x156f
            java.lang.String r15 = r15.substring(r3, r1)
        L_0x156f:
            r8.setText(r15)
        L_0x1572:
            if (r13 == 0) goto L_0x157b
            boolean r1 = X.C175738Zn.A0V(r13)
            r0 = 0
            if (r1 == 0) goto L_0x157c
        L_0x157b:
            r0 = 1
        L_0x157c:
            java.lang.String r8 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            if (r0 == 0) goto L_0x1706
            android.widget.TextView r1 = r2.A0D
            r1.setVisibility(r9)
        L_0x1586:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x169f
            android.widget.LinearLayout r8 = r2.A0A
        L_0x158e:
            r8.setVisibility(r9)
        L_0x1591:
            android.content.res.Resources r8 = r2.getResources()
            r0 = 2131167631(0x7f07098f, float:1.7949541E38)
            int r9 = r8.getDimensionPixelSize(r0)
            android.content.res.Resources r8 = r2.getResources()
            r0 = 2131167627(0x7f07098b, float:1.7949533E38)
            int r8 = r8.getDimensionPixelSize(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            r2.measure(r13, r12)
            int r8 = r2.getMeasuredWidth()
            int r0 = r2.getMeasuredHeight()
            r2.layout(r3, r3, r8, r0)
            java.lang.CharSequence r15 = r1.getText()
            int r11 = r15.length()
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "... "
            r9.append(r0)
            android.content.Context r8 = r2.getContext()
            r0 = 2131892851(0x7f121a73, float:1.9420462E38)
            X.AnonymousClass0x2.A0s(r8, r9, r0)
            java.lang.String r14 = r9.toString()
            X.3vr r10 = new X.3vr
            r10.<init>(r2)
        L_0x15e3:
            android.view.View r0 = r2.A06
            r22 = r0
            int r8 = r22.getHeight()
            android.view.ViewGroup$LayoutParams r9 = r22.getLayoutParams()
            boolean r0 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x169c
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            if (r9 == 0) goto L_0x169c
            int r0 = r9.topMargin
        L_0x15f9:
            int r8 = r8 + r0
            android.view.ViewGroup$LayoutParams r9 = r22.getLayoutParams()
            boolean r0 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x1699
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            if (r9 == 0) goto L_0x1699
            int r0 = r9.bottomMargin
        L_0x1608:
            int r8 = r8 + r0
            com.whatsapp.settings.chat.wallpaper.WallPaperView r0 = r2.A0L
            int r0 = r0.getHeight()
            if (r8 <= r0) goto L_0x165c
            int r8 = r1.getLineCount()
            r0 = 2
            if (r8 <= r0) goto L_0x1657
            if (r11 <= r0) goto L_0x1657
            int r11 = r11 + -1
            java.lang.CharSequence r0 = r15.subSequence(r3, r11)
            android.text.SpannableStringBuilder r0 = X.C18330xA.A00(r0)
            android.text.SpannableStringBuilder r9 = r0.append(r14)
            byte r0 = r6.A1I
            r26 = r0
            java.lang.String r25 = r15.toString()
            android.content.Context r22 = r2.getContext()
            r8 = 6
            X.35t r0 = new X.35t
            r0.<init>(r10, r8)
            r23 = r9
            r24 = r0
            r27 = r11
            X.C107315b6.A09(r22, r23, r24, r25, r26, r27)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r1.setText(r9, r0)
            r2.measure(r13, r12)
            int r8 = r2.getMeasuredWidth()
            int r0 = r2.getMeasuredHeight()
            r2.layout(r3, r3, r8, r0)
            goto L_0x15e3
        L_0x1657:
            java.lang.String r0 = "Error measuring view"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x165c:
            r0 = r16
            java.io.File r1 = r7.A02(r0, r2)
            if (r1 == 0) goto L_0x13ed
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            X.5YF r6 = new X.5YF
            r6.<init>(r0)
            r6.A0E(r1)
            androidx.cardview.widget.CardView r0 = r2.A0H
            X.4vH r0 = X.C106425Yy.A00(r0, r5, r3)
            java.util.List r0 = X.C18290x4.A12(r0)
            X.C106425Yy.A01(r2, r6, r0)
            android.net.Uri r2 = r6.A0G
            r0 = r21
            r0.add(r2)
            java.io.File r1 = r6.A07()
            r0 = r20
            r0.add(r1)
            r0 = r19
            r0.A04(r6)
            r0 = r18
            r0.put(r2, r5)
            goto L_0x13ed
        L_0x1699:
            r0 = 0
            goto L_0x1608
        L_0x169c:
            r0 = 0
            goto L_0x15f9
        L_0x169f:
            android.view.ViewGroup r0 = r2.A08
            android.view.ViewGroup$LayoutParams r13 = r0.getLayoutParams()
            X.C162457s7.A0K(r13, r8)
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            android.content.res.Resources r8 = r2.getResources()
            r0 = 2131167622(0x7f070986, float:1.7949523E38)
            int r0 = r8.getDimensionPixelSize(r0)
            r13.bottomMargin = r0
            android.content.res.Resources r8 = r2.getResources()
            r0 = 2131167623(0x7f070987, float:1.7949525E38)
            int r0 = r8.getDimensionPixelSize(r0)
            float r15 = (float) r0
            int r14 = r11.size()
            r13 = 0
        L_0x16c8:
            if (r13 >= r14) goto L_0x16f4
            android.content.Context r8 = r2.getContext()
            r0 = 2131625872(0x7f0e0790, float:1.8878964E38)
            android.view.View r8 = android.view.View.inflate(r8, r0, r12)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel"
            X.C162457s7.A0K(r8, r0)
            com.whatsapp.TextEmojiLabel r8 = (com.whatsapp.TextEmojiLabel) r8
            r8.setSingleLine(r3)
            r8.setTextSize(r3, r15)
            java.lang.Object r0 = r11.get(r13)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.A0I(r0)
            android.widget.LinearLayout r0 = r2.A0A
            r0.addView(r8, r13)
            int r13 = r13 + 1
            goto L_0x16c8
        L_0x16f4:
            r0 = 1
            android.widget.TextView r8 = r2.A0C
            if (r10 <= r0) goto L_0x158e
            X.5QQ r0 = r2.getNewsletterNumberFormatter()
            java.lang.String r0 = r0.A01(r10)
            r8.setText(r0)
            goto L_0x1591
        L_0x1706:
            int r0 = r14.getVisibility()
            if (r0 != 0) goto L_0x1724
            android.widget.TextView r0 = r2.A0D
            android.view.ViewGroup$LayoutParams r14 = r0.getLayoutParams()
            X.C162457s7.A0K(r14, r8)
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131167617(0x7f070981, float:1.7949513E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.topMargin = r0
        L_0x1724:
            android.text.SpannableStringBuilder r0 = X.C18330xA.A00(r13)
            android.content.Context r13 = r2.getContext()
            r1 = 2131102273(0x7f060a41, float:1.781698E38)
            int r26 = X.AnonymousClass0Y8.A04(r13, r1)
            android.content.Context r13 = r2.getContext()
            r1 = 2131101287(0x7f060667, float:1.781498E38)
            int r27 = X.AnonymousClass0Y8.A04(r13, r1)
            X.33i r23 = r2.getSystemServices()
            X.2y5 r24 = r2.getSharedPreferencesFactory()
            android.widget.TextView r1 = r2.A0D
            android.text.TextPaint r22 = r1.getPaint()
            r25 = r0
            r28 = r3
            X.C107635bd.A04(r22, r23, r24, r25, r26, r27, r28)
            X.5a2 r14 = r2.getLinkifier()
            android.content.Context r13 = r2.getContext()
            r14.A07(r13, r0)
            r1.setText(r0)
            goto L_0x1586
        L_0x1763:
            r14.setVisibility(r9)
            android.view.View r0 = r2.A07
            r0.setVisibility(r9)
            goto L_0x1572
        L_0x176d:
            r14.setVisibility(r9)
            goto L_0x1521
        L_0x1772:
            X.3d3 r11 = X.C72023d3.A00
            r10 = 0
            goto L_0x1518
        L_0x1777:
            boolean r0 = r6 instanceof X.C30481mW
            if (r0 == 0) goto L_0x1784
            r0 = r6
            X.1mW r0 = (X.C30481mW) r0
            java.lang.String r13 = r0.A1w()
            goto L_0x14fc
        L_0x1784:
            r13 = r12
            goto L_0x14fc
        L_0x1787:
            r8 = r12
            goto L_0x14eb
        L_0x178a:
            boolean r0 = r6 instanceof X.C30481mW
            if (r0 == 0) goto L_0x1790
            goto L_0x1472
        L_0x1790:
            r14 = r8
            goto L_0x1472
        L_0x1793:
            X.3Wi r0 = r4.A1Z
            r9 = 1
            X.3cV r1 = new X.3cV
            r2 = r4
            r3 = r30
            r4 = r18
            r5 = r20
            r6 = r29
            r7 = r21
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x17a8:
            r0.A0S(r1)
            return
        L_0x17ac:
            java.lang.Object r5 = r2.A00
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r0 = r2.A01
            X.2Sp r0 = (X.C43562Sp) r0
            java.lang.Object r4 = r2.A02
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.Object r3 = r2.A03
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 0
            X.4PG r1 = new X.4PG
            r1.<init>(r5)
            r0.A00 = r1
            X.C162457s7.A0J(r4, r2)
            X.5Og r0 = r1.getViewModel()
            r0.A00 = r4
            r3.setVisibility(r2)
            r3.addView(r1)
            return
        L_0x17d4:
            java.lang.Object r5 = r2.A00
            X.5XH r5 = (X.AnonymousClass5XH) r5
            java.lang.Object r6 = r2.A01
            java.lang.Object r7 = r2.A02
            java.lang.Object r8 = r2.A03
            X.49f r3 = r5.A04
            android.content.Context r2 = r5.A00
            r0 = 2131888248(0x7f120878, float:1.9411126E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131894586(0x7f12213a, float:1.942398E38)
            java.lang.String r0 = r2.getString(r0)
            r9 = 8
            X.5ep r4 = new X.5ep
            r4.<init>(r5, r6, r7, r8, r9)
            r3.AwA(r1, r0, r4)
            return
        L_0x17fb:
            java.lang.Object r8 = r2.A00
            X.2c1 r8 = (X.C46672c1) r8
            java.lang.Object r0 = r2.A01
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r7 = r2.A02
            X.1fJ r7 = (X.C27991fJ) r7
            java.lang.Object r6 = r2.A03
            X.39T r6 = (X.AnonymousClass39T) r6
            java.util.Iterator r11 = X.AnonymousClass000.A0q(r0)
        L_0x180f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x184f
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r11)
            com.whatsapp.jid.UserJid r1 = X.C18320x8.A0P(r0)
            java.lang.Object r0 = r0.getValue()
            X.C626936e.A06(r0)
            long r4 = X.C18310x6.A0B(r0)
            X.2qs r0 = r8.A02
            long r1 = r0.A01(r7, r1)
            r9 = -1
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x180f
            X.2qz r0 = r8.A04
            X.34x r3 = X.C55122pp.A00(r0, r1)
            X.1mN r3 = (X.C30391mN) r3
            if (r3 == 0) goto L_0x180f
            long r1 = r3.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x180f
            r0 = 1
            r3.A07 = r0
            r3.A01 = r4
            X.3Lv r0 = r8.A01
            r0.A0Y(r3)
            goto L_0x180f
        L_0x184f:
            X.33S r0 = r8.A03
            r0.A01(r6)
            return
        L_0x1855:
            java.lang.Object r6 = r2.A00
            X.33h r6 = (X.C620533h) r6
            java.lang.Object r5 = r2.A01
            X.1fL r5 = (X.C28011fL) r5
            java.lang.Object r7 = r2.A02
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r4 = r2.A03
            java.util.List r4 = (java.util.List) r4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "participant-user-store/updateGroupParticipants/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " participants:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " removeParticipants:"
            X.C18260x0.A1R(r1, r0, r4)
            X.4Fq r3 = X.C620533h.A02(r6)
            X.3Yo r2 = r3.Axl()     // Catch:{ all -> 0x18c1 }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x18b7 }
        L_0x188b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x18b7 }
            if (r0 == 0) goto L_0x189b
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x18b7 }
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0     // Catch:{ all -> 0x18b7 }
            r6.A0O(r5, r0)     // Catch:{ all -> 0x18b7 }
            goto L_0x188b
        L_0x189b:
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x18b7 }
        L_0x189f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x18b7 }
            if (r0 == 0) goto L_0x18ad
            X.2zG r0 = X.C18320x8.A0G(r1)     // Catch:{ all -> 0x18b7 }
            r6.A0E(r0, r5)     // Catch:{ all -> 0x18b7 }
            goto L_0x189f
        L_0x18ad:
            r2.A00()     // Catch:{ all -> 0x18b7 }
            r2.close()     // Catch:{ all -> 0x18c1 }
            r3.close()
            return
        L_0x18b7:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x18bc }
            goto L_0x18c0
        L_0x18bc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x18c1 }
        L_0x18c0:
            throw r1     // Catch:{ all -> 0x18c1 }
        L_0x18c1:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x18c6 }
            throw r1
        L_0x18c6:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x18cb:
            java.lang.Object r3 = r2.A00
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            java.lang.Object r6 = r2.A01
            X.2SC r6 = (X.AnonymousClass2SC) r6
            java.lang.Object r5 = r2.A02
            java.lang.Object r4 = r2.A03
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x1907 }
            r0 = 30
            r3.get(r0, r2)     // Catch:{ Exception -> 0x1907 }
            java.util.Map r3 = r6.A04
            monitor-enter(r3)
            X.1hp r0 = r6.A01     // Catch:{ all -> 0x1964 }
            r0.A07(r5)     // Catch:{ all -> 0x1964 }
            X.1ia r0 = r6.A02     // Catch:{ all -> 0x1964 }
            r0.A07(r5)     // Catch:{ all -> 0x1964 }
            java.lang.Object r0 = r3.remove(r4)     // Catch:{ all -> 0x1964 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x1964 }
            if (r0 == 0) goto L_0x1936
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x1964 }
        L_0x18f7:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x1964 }
            if (r0 == 0) goto L_0x1936
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x1964 }
            X.49z r0 = (X.C838449z) r0     // Catch:{ all -> 0x1964 }
            r0.BTN()     // Catch:{ all -> 0x1964 }
            goto L_0x18f7
        L_0x1907:
            r1 = move-exception
            java.lang.String r0 = "Cannot fetch the identity for business!"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x1938 }
            java.util.Map r3 = r6.A04
            monitor-enter(r3)
            X.1hp r0 = r6.A01     // Catch:{ all -> 0x1964 }
            r0.A07(r5)     // Catch:{ all -> 0x1964 }
            X.1ia r0 = r6.A02     // Catch:{ all -> 0x1964 }
            r0.A07(r5)     // Catch:{ all -> 0x1964 }
            java.lang.Object r0 = r3.remove(r4)     // Catch:{ all -> 0x1964 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x1964 }
            if (r0 == 0) goto L_0x1936
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x1964 }
        L_0x1926:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x1964 }
            if (r0 == 0) goto L_0x1936
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x1964 }
            X.49z r0 = (X.C838449z) r0     // Catch:{ all -> 0x1964 }
            r0.BTN()     // Catch:{ all -> 0x1964 }
            goto L_0x1926
        L_0x1936:
            monitor-exit(r3)
            return
        L_0x1938:
            r2 = move-exception
            java.util.Map r3 = r6.A04
            monitor-enter(r3)
            X.1hp r0 = r6.A01     // Catch:{ all -> 0x1964 }
            r0.A07(r5)     // Catch:{ all -> 0x1964 }
            X.1ia r0 = r6.A02     // Catch:{ all -> 0x1964 }
            r0.A07(r5)     // Catch:{ all -> 0x1964 }
            java.lang.Object r0 = r3.remove(r4)     // Catch:{ all -> 0x1964 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x1964 }
            if (r0 == 0) goto L_0x1962
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x1964 }
        L_0x1952:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x1964 }
            if (r0 == 0) goto L_0x1962
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x1964 }
            X.49z r0 = (X.C838449z) r0     // Catch:{ all -> 0x1964 }
            r0.BTN()     // Catch:{ all -> 0x1964 }
            goto L_0x1952
        L_0x1962:
            monitor-exit(r3)
            throw r2
        L_0x1964:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x1967:
            java.lang.Object r0 = r2.A00
            X.33m r0 = (X.C621033m) r0
            java.lang.Object r7 = r2.A01
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r6 = r2.A02
            X.3Wi r6 = (X.C69263Wi) r6
            java.lang.Object r2 = r2.A03
            android.content.Context r2 = (android.content.Context) r2
            r5 = 0
            r0.A0Y(r7, r5, r5)
            int r1 = r7.size()
            r0 = 1
            if (r1 != r0) goto L_0x1989
            r0 = 2131890735(0x7f12122f, float:1.941617E38)
            r6.A0I(r0, r5)
            return
        L_0x1989:
            android.content.res.Resources r4 = r2.getResources()
            r3 = 2131755192(0x7f1000b8, float:1.9141256E38)
            int r2 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r0 = r7.size()
            X.AnonymousClass000.A1P(r1, r0, r5)
            java.lang.String r0 = r4.getQuantityString(r3, r2, r1)
            r6.A0Q(r0, r5)
            return
        L_0x19a5:
            return
        L_0x19a6:
            return
        L_0x19a7:
            X.2an r6 = r5.A0A     // Catch:{ all -> 0x1a92 }
            X.1VX r8 = r6.A01     // Catch:{ all -> 0x1a92 }
            r0 = 200(0xc8, float:2.8E-43)
            long r9 = X.C56952sp.A06(r8, r0)     // Catch:{ all -> 0x1a92 }
            r3 = 0
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x19fe
            boolean r0 = r6.A00()     // Catch:{ all -> 0x1a92 }
            if (r0 != 0) goto L_0x1a00
            X.2YT r3 = r6.A03     // Catch:{ all -> 0x1a92 }
            r1 = 1
            X.1im r0 = r3.A00     // Catch:{ all -> 0x1a92 }
            boolean r0 = r0.A06     // Catch:{ all -> 0x1a92 }
            if (r0 == 0) goto L_0x19d7
            java.lang.String r0 = "sendmethods/sendGetABProps"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1a92 }
            X.4C1 r0 = r3.A01     // Catch:{ all -> 0x1a92 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x1a92 }
            X.2bo r0 = (X.C46542bo) r0     // Catch:{ all -> 0x1a92 }
            r0.A00(r1)     // Catch:{ all -> 0x1a92 }
        L_0x19d7:
            r0 = 10000(0x2710, double:4.9407E-320)
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x1a92 }
            long r9 = r9 + r0
        L_0x19de:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x1a92 }
            boolean r0 = r0.isInterrupted()     // Catch:{ all -> 0x1a92 }
            if (r0 != 0) goto L_0x19fc
            boolean r0 = r6.A00()     // Catch:{ all -> 0x1a92 }
            if (r0 != 0) goto L_0x1a00
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x1a92 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x19fc
            r0 = 100
            android.os.SystemClock.sleep(r0)     // Catch:{ all -> 0x1a92 }
            goto L_0x19de
        L_0x19fc:
            r0 = 0
            goto L_0x1a0c
        L_0x19fe:
            r0 = 0
            goto L_0x1a08
        L_0x1a00:
            r1 = 201(0xc9, float:2.82E-43)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x1a92 }
            boolean r0 = r8.A0Y(r0, r1)     // Catch:{ all -> 0x1a92 }
        L_0x1a08:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x1a92 }
        L_0x1a0c:
            X.2WB r1 = new X.2WB     // Catch:{ all -> 0x1a92 }
            r1.<init>(r0)     // Catch:{ all -> 0x1a92 }
            java.lang.Boolean r0 = r1.A00     // Catch:{ all -> 0x1a92 }
            if (r0 == 0) goto L_0x1a62
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x1a92 }
            if (r0 != 0) goto L_0x1a62
            java.lang.Object r6 = r2.A03     // Catch:{ all -> 0x1a92 }
            X.30D r6 = (X.AnonymousClass30D) r6     // Catch:{ all -> 0x1a92 }
            r0 = 1
            X.4Cg[] r4 = new X.C84414Cg[r0]     // Catch:{ all -> 0x1a92 }
            X.1il r1 = r5.A02     // Catch:{ all -> 0x1a92 }
            X.3Ep r0 = new X.3Ep     // Catch:{ all -> 0x1a92 }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x1a92 }
            r5 = 0
            r4[r5] = r0     // Catch:{ all -> 0x1a92 }
            X.2Vr r3 = new X.2Vr     // Catch:{ all -> 0x1a92 }
            r3.<init>(r4)     // Catch:{ all -> 0x1a92 }
            X.2fA r0 = r6.A0B     // Catch:{ all -> 0x1a92 }
            X.8OQ r0 = r0.A01()     // Catch:{ all -> 0x1a92 }
            X.6aS r1 = r0.keySet()     // Catch:{ all -> 0x1a92 }
            r0 = 7
            r6.A06(r3, r1, r0, r5)     // Catch:{ all -> 0x1a92 }
            X.33p r1 = r6.A05     // Catch:{ all -> 0x1a92 }
            X.2sH r0 = r6.A04     // Catch:{ all -> 0x1a92 }
            long r3 = r0.A0H()     // Catch:{ all -> 0x1a92 }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)     // Catch:{ all -> 0x1a92 }
            java.lang.String r0 = "db_last_all_migrations_attempt_timestamp"
            X.C18270x1.A0i(r1, r0, r3)     // Catch:{ all -> 0x1a92 }
            java.lang.Object r3 = r2.A00     // Catch:{ all -> 0x1a92 }
            X.1VX r3 = (X.AnonymousClass1VX) r3     // Catch:{ all -> 0x1a92 }
            r1 = 424(0x1a8, float:5.94E-43)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x1a92 }
            boolean r0 = r3.A0Y(r0, r1)     // Catch:{ all -> 0x1a92 }
            if (r0 == 0) goto L_0x1a8a
            r6.A04(r5)     // Catch:{ all -> 0x1a92 }
            goto L_0x1a8a
        L_0x1a62:
            X.1Wy r6 = new X.1Wy     // Catch:{ all -> 0x1a92 }
            r6.<init>()     // Catch:{ all -> 0x1a92 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x1a92 }
            r6.A01 = r0     // Catch:{ all -> 0x1a92 }
            r0 = 200(0xc8, float:2.8E-43)
            long r3 = X.C56952sp.A05(r8, r0)     // Catch:{ all -> 0x1a92 }
            r0 = 900000(0xdbba0, double:4.44659E-318)
            long r0 = java.lang.Math.max(r3, r0)     // Catch:{ all -> 0x1a92 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1a92 }
            r6.A00 = r0     // Catch:{ all -> 0x1a92 }
            X.4FV r0 = r5.A0E     // Catch:{ all -> 0x1a92 }
            r0.BhD(r6)     // Catch:{ all -> 0x1a92 }
            java.lang.String r0 = "DatabaseMigrationAsyncTask/run; migration skipped due to kill switch."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1a92 }
        L_0x1a8a:
            java.lang.Object r0 = r2.A02
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0
            r0.open()
            return
        L_0x1a92:
            r1 = move-exception
            java.lang.Object r0 = r2.A02
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0
            r0.open()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71593cM.run():void");
    }

    public C71593cM(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    public C71593cM(ConditionVariable conditionVariable, AnonymousClass2U4 r3, AnonymousClass30D r4, AnonymousClass1VX r5) {
        this.A04 = 47;
        this.A00 = r5;
        this.A03 = r4;
        this.A01 = r3;
        this.A02 = conditionVariable;
    }
}
