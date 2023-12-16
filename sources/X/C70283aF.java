package X;

/* renamed from: X.3aF  reason: invalid class name and case insensitive filesystem */
public class C70283aF implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C70283aF(Object obj, Object obj2, int i, long j) {
        this.A03 = i;
        this.A01 = obj;
        this.A00 = j;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d4, code lost:
        if (r12 < 100) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02e7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        X.AnonymousClass2A8.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02ee, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r5 = r22
            int r0 = r5.A03
            switch(r0) {
                case 0: goto L_0x045e;
                case 1: goto L_0x0446;
                case 2: goto L_0x0438;
                case 3: goto L_0x003a;
                case 4: goto L_0x040f;
                case 5: goto L_0x0007;
                case 6: goto L_0x0007;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x03b8;
                case 10: goto L_0x0348;
                case 11: goto L_0x0015;
                case 12: goto L_0x022a;
                case 13: goto L_0x01f4;
                case 14: goto L_0x01e6;
                case 15: goto L_0x0095;
                case 16: goto L_0x0074;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r5.A01
            X.34p r3 = (X.C623334p) r3
            long r1 = r5.A00
            java.lang.Object r0 = r5.A02
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            r3.A0F(r0, r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r0 = r5.A01
            X.3Lx r0 = (X.C66563Lx) r0
            java.lang.Object r2 = r5.A02
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            long r4 = r5.A00
            X.5mT r0 = r0.A03
            X.4Ua r3 = r0.A08
            if (r3 == 0) goto L_0x0014
            if (r2 == 0) goto L_0x002c
            r1 = 0
        L_0x0028:
            r3.A0D(r2, r1)
            return
        L_0x002c:
            r1 = -1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r2 = 0
            r1 = 2
            if (r0 != 0) goto L_0x0028
            r1 = 1
            goto L_0x0028
        L_0x003a:
            java.lang.Object r0 = r5.A01
            X.5O8 r0 = (X.AnonymousClass5O8) r0
            java.lang.Object r8 = r5.A02
            X.34x r8 = (X.C624134x) r8
            long r3 = r5.A00
            X.2p9 r7 = r0.A03
            if (r8 == 0) goto L_0x0014
            boolean r0 = X.C384227m.A00(r8)
            if (r0 == 0) goto L_0x0014
            X.2OM r0 = r7.A03
            java.util.concurrent.ConcurrentHashMap r6 = r0.A02
            X.2z0 r5 = r8.A1J
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r5, r6)
            if (r0 == 0) goto L_0x0062
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
        L_0x0062:
            X.C162457s7.A0C(r5)
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            r6.put(r5, r10)
            r9 = 0
            r11 = 0
            r13 = r11
            r12 = r11
            r7.A02(r8, r9, r10, r11, r12, r13)
            return
        L_0x0074:
            java.lang.Object r1 = r5.A01
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            long r11 = r5.A00
            java.lang.Object r9 = r5.A02
            com.whatsapp.jid.GroupJid r9 = (com.whatsapp.jid.GroupJid) r9
            X.2sH r5 = r1.A06
            X.3Wi r2 = r1.A05
            X.66r r3 = r1.A0z
            X.2sW r6 = r1.A1Y
            X.2qK r8 = r1.A1b
            X.2rn r7 = r1.A1a
            r10 = 1
            X.8qC r0 = r1.A1v
            X.3LB r4 = X.C48062eH.A00(r0)
            X.AnonymousClass36T.A04(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0095:
            java.lang.Object r7 = r5.A01
            X.2T9 r7 = (X.AnonymousClass2T9) r7
            java.lang.Object r6 = r5.A02
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            long r0 = r5.A00
            X.31C r15 = r7.A04
            java.lang.String r4 = r15.A03()
            X.2Zj r3 = r7.A03
            java.lang.String r2 = "UpdateUserStatus"
            java.lang.String r3 = r3.A00(r2)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x018e
            X.7T5 r8 = r7.A02
            r5 = 0
            X.C162457s7.A0J(r6, r5)
            boolean r5 = r6 instanceof com.whatsapp.jid.PhoneUserJid
            if (r5 == 0) goto L_0x018e
            X.1VX r10 = r8.A01
            r5 = 2249(0x8c9, float:3.152E-42)
            X.2vE r9 = X.C58422vE.A02
            boolean r5 = r10.A0Y(r9, r5)
            if (r5 == 0) goto L_0x018e
            r8 = 1
            r5 = 2250(0x8ca, float:3.153E-42)
            int r5 = r10.A0O(r9, r5)
            r5 = r5 & 1
            if (r5 != r8) goto L_0x018e
            r5 = r3
            com.whatsapp.infra.graphql.generated.mex.calls.XWA2UserUpdateVersions r8 = new com.whatsapp.infra.graphql.generated.mex.calls.XWA2UserUpdateVersions
            r8.<init>()
            java.lang.String r1 = r6.user
            java.lang.String r0 = "user_id"
            r8.A06(r0, r1)
            X.6aY r11 = X.C129586aY.of(r8)
            java.lang.String r0 = "STATUS"
            X.6aY r10 = X.C129586aY.of(r0)
            com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusQueryImpl$Builder r9 = new com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusQueryImpl$Builder
            r9.<init>()
            X.2ie r8 = r9.A00
            java.lang.String r1 = "users"
            if (r11 == 0) goto L_0x018b
            X.13M r0 = r8.A00
            r0.A07(r1, r11)
            r0 = 1
        L_0x00fe:
            r9.A02 = r0
            java.lang.String r1 = "updates"
            if (r10 == 0) goto L_0x0189
            X.13M r0 = r8.A00
            r0.A07(r1, r10)
            r0 = 1
        L_0x010b:
            r9.A01 = r0
            boolean r0 = r9.A02
            X.C162187rP.A06(r0)
            boolean r0 = r9.A01
            X.C162187rP.A06(r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl> r1 = com.whatsapp.infra.graphql.generated.mex.UpdateUserStatusResponseImpl.class
            X.7J9 r0 = new X.7J9
            r0.<init>(r8, r1, r2)
            X.2ie r0 = r0.A00
            X.13M r2 = r0.A00
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            X.6L0 r0 = r2.A00
            r2.A04(r0, r1)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r1)
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1G()
            if (r3 != 0) goto L_0x0139
            java.lang.String r5 = ""
        L_0x0139:
            java.lang.String r0 = "queryId"
            r1.put(r0, r5)
            java.lang.String r0 = "variables"
            java.lang.String r2 = X.C18280x3.A0c(r2, r0, r1)
            r0 = 23
            X.1wm r1 = new X.1wm
            r1.<init>((java.lang.String) r4, (int) r0)
            X.1xK r0 = new X.1xK
            r0.<init>((X.C35381wm) r1, (java.lang.String) r3, (java.lang.String) r2)
            X.36K r5 = r0.A00
            X.1pg r3 = new X.1pg
            r3.<init>(r6, r7, r0)
        L_0x0159:
            X.7T5 r8 = r7.A02
            r0 = 14
            X.4Jv r7 = new X.4Jv
            r7.<init>(r3, r0)
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            boolean r0 = r6 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x017b
            X.1VX r2 = r8.A01
            r1 = 2249(0x8c9, float:3.152E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x017b
            X.2sH r0 = r8.A00
            r7.invoke(r0)
        L_0x017b:
            r19 = 41
            r20 = 0
            r17 = r5
            r18 = r4
            r16 = r3
            r15.A0K(r16, r17, r18, r19, r20)
            return
        L_0x0189:
            r0 = 0
            goto L_0x010b
        L_0x018b:
            r0 = 0
            goto L_0x00fe
        L_0x018e:
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            long r13 = X.C18290x4.A0B(r0)
            r11 = 0
            java.lang.String r1 = "jid"
            r8 = 2
            java.lang.String r3 = "user"
            r5 = 1
            r9 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x01d2
            X.39V[] r0 = new X.AnonymousClass39V[r5]
            X.AnonymousClass39V.A02(r6, r1, r0, r9)
            X.36K r0 = X.AnonymousClass36K.A0I(r3, r0)
        L_0x01ad:
            r10.add(r0)
            X.36K[] r1 = X.C18280x3.A1a(r10, r9)
            java.lang.String r3 = "status"
            r0 = 0
            X.36K r2 = X.AnonymousClass36K.A0J(r3, r0, r1)
            X.39V[] r1 = X.AnonymousClass39V.A0H(r4, r9)
            java.lang.String r0 = "xmlns"
            X.AnonymousClass39V.A0C(r0, r3, r1, r5, r8)
            X.6kI r0 = X.C135206kI.A00
            X.36K r5 = X.AnonymousClass36K.A0C(r0, r2, r1)
            X.1pf r3 = new X.1pf
            r3.<init>(r6, r7)
            goto L_0x0159
        L_0x01d2:
            X.39V[] r2 = new X.AnonymousClass39V[r8]
            X.AnonymousClass39V.A02(r6, r1, r2, r9)
            java.lang.String r1 = "t"
            java.lang.String r0 = java.lang.Long.toString(r13)
            X.AnonymousClass39V.A0B(r1, r0, r2, r5)
            X.36K r0 = X.AnonymousClass36K.A0I(r3, r2)
            goto L_0x01ad
        L_0x01e6:
            java.lang.Object r3 = r5.A01
            X.3S8 r3 = (X.AnonymousClass3S8) r3
            java.lang.Object r2 = r5.A02
            X.2yC r2 = (X.C60222yC) r2
            long r0 = r5.A00
            r3.A02(r2, r0)
            return
        L_0x01f4:
            java.lang.Object r0 = r5.A01
            X.2RW r0 = (X.AnonymousClass2RW) r0
            java.lang.Object r1 = r5.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            long r4 = r5.A00
            X.2KT r0 = r0.A01
            X.1RI r0 = r0.A01
            X.4Fq r6 = r0.A0C()
            android.content.ContentValues r3 = X.C18280x3.A09()     // Catch:{ all -> 0x0225 }
            java.lang.String r1 = r1.getRawString()     // Catch:{ all -> 0x0225 }
            java.lang.String r0 = "chat_jid"
            r3.put(r0, r1)     // Catch:{ all -> 0x0225 }
            java.lang.String r0 = "timestamp"
            X.2sg r2 = X.AnonymousClass3H0.A02(r3, r6, r0, r4)     // Catch:{ all -> 0x0225 }
            java.lang.String r1 = "dismissed_chat"
            java.lang.String r0 = "INSERT_DISMISSED_CHAT"
            r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x0225 }
            r6.close()
            return
        L_0x0225:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x03a1 }
            throw r1
        L_0x022a:
            java.lang.Object r4 = r5.A01
            X.2iD r4 = (X.C50462iD) r4
            java.lang.Object r3 = r5.A02
            X.3ST r3 = (X.AnonymousClass3ST) r3
            long r1 = r5.A00
            r6 = 1
            X.2YX r0 = r4.A09     // Catch:{ 24W -> 0x0324 }
            X.34x r2 = r0.A00(r3, r1)     // Catch:{ 24W -> 0x0324 }
            X.2z0 r5 = r2.A1J     // Catch:{ 24W -> 0x0324 }
            X.4uZ r11 = r5.A00     // Catch:{ 24W -> 0x0324 }
            boolean r0 = r11 instanceof X.C95804uY     // Catch:{ 24W -> 0x0324 }
            if (r0 == 0) goto L_0x0314
            X.4uY r11 = (X.C95804uY) r11     // Catch:{ 24W -> 0x0324 }
            if (r11 == 0) goto L_0x0314
            X.2qf r0 = r4.A08     // Catch:{ 24W -> 0x0324 }
            boolean r16 = r0.A03(r11, r2)     // Catch:{ 24W -> 0x0324 }
            X.2i8 r8 = new X.2i8     // Catch:{ 24W -> 0x0324 }
            r8.<init>()     // Catch:{ 24W -> 0x0324 }
            long r0 = r3.A07     // Catch:{ 24W -> 0x0324 }
            r8.A00 = r0     // Catch:{ 24W -> 0x0324 }
            java.lang.String r0 = "message"
            r8.A05 = r0     // Catch:{ 24W -> 0x0324 }
            java.lang.String r0 = r5.A01     // Catch:{ 24W -> 0x0324 }
            r8.A07 = r0     // Catch:{ 24W -> 0x0324 }
            r8.A02 = r11     // Catch:{ 24W -> 0x0324 }
            java.lang.String r0 = r3.A0v     // Catch:{ 24W -> 0x0324 }
            r8.A08 = r0     // Catch:{ 24W -> 0x0324 }
            boolean r0 = r2 instanceof X.C30441mS     // Catch:{ 24W -> 0x0324 }
            if (r0 == 0) goto L_0x026c
            java.lang.String r0 = "8"
            r8.A06 = r0     // Catch:{ 24W -> 0x0324 }
        L_0x026c:
            X.1VX r7 = r4.A03     // Catch:{ 24W -> 0x0324 }
            r1 = 5871(0x16ef, float:8.227E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ 24W -> 0x0324 }
            boolean r0 = r7.A0Y(r0, r1)     // Catch:{ 24W -> 0x0324 }
            if (r0 == 0) goto L_0x02ef
            X.2rc r10 = r4.A07     // Catch:{ 24W -> 0x0324 }
            long r0 = r2.A1M     // Catch:{ 24W -> 0x0324 }
            r14 = 100
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x02ef
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x02ef
            X.2rZ r12 = r10.A08     // Catch:{ 24W -> 0x0324 }
            r5 = 0
            X.3dV r2 = r12.A05     // Catch:{ 24W -> 0x0324 }
            X.4GK r9 = r2.get()     // Catch:{ 24W -> 0x0324 }
            r2 = 2
            java.lang.String[] r13 = new java.lang.String[r2]     // Catch:{ all -> 0x02e8 }
            X.2sm r2 = r12.A01     // Catch:{ all -> 0x02e8 }
            X.C56922sm.A02(r2, r11, r13, r5)     // Catch:{ all -> 0x02e8 }
            X.AnonymousClass0x2.A1S(r13, r6, r0)     // Catch:{ all -> 0x02e8 }
            r2 = r9
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x02e8 }
            X.2sg r12 = r2.A03     // Catch:{ all -> 0x02e8 }
            java.lang.String r5 = "SELECT sort_id  FROM message  WHERE chat_row_id = ? AND sort_id < ?  ORDER BY sort_id DESC LIMIT 1"
            java.lang.String r2 = "GET_MESSAGE_SERVER_ID_BEFORE"
            android.database.Cursor r5 = r12.A0E(r5, r2, r13)     // Catch:{ all -> 0x02e8 }
            boolean r2 = r5.moveToFirst()     // Catch:{ all -> 0x02e1 }
            if (r2 == 0) goto L_0x02cb
            java.lang.String r2 = "sort_id"
            int r12 = r5.getColumnIndex(r2)     // Catch:{ all -> 0x02e1 }
            boolean r2 = r5.isNull(r12)     // Catch:{ all -> 0x02e1 }
            if (r2 != 0) goto L_0x02cb
            long r12 = r5.getLong(r12)     // Catch:{ all -> 0x02e1 }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x02e1 }
            if (r2 == 0) goto L_0x02cb
            r5.close()     // Catch:{ all -> 0x02e8 }
            r9.close()     // Catch:{ 24W -> 0x0324 }
            goto L_0x02d2
        L_0x02cb:
            r5.close()     // Catch:{ all -> 0x02e8 }
            r9.close()     // Catch:{ 24W -> 0x0324 }
            goto L_0x02d6
        L_0x02d2:
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x02d8
        L_0x02d6:
            r12 = 100
        L_0x02d8:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x02ef
            r14 = r0
            r10.A03(r11, r12, r14)     // Catch:{ 24W -> 0x0324 }
            goto L_0x02ef
        L_0x02e1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02e3 }
        L_0x02e3:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x02e8 }
            throw r0     // Catch:{ all -> 0x02e8 }
        L_0x02e8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02ea }
        L_0x02ea:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)     // Catch:{ 24W -> 0x0324 }
            throw r0     // Catch:{ 24W -> 0x0324 }
        L_0x02ef:
            if (r16 != 0) goto L_0x02ff
            java.lang.String r5 = "error"
            r2 = 552(0x228, float:7.74E-43)
            java.util.Map r1 = r8.A09     // Catch:{ 24W -> 0x0324 }
            X.39V r0 = new X.39V     // Catch:{ 24W -> 0x0324 }
            r0.<init>((java.lang.String) r5, (int) r2)     // Catch:{ 24W -> 0x0324 }
            r1.put(r5, r0)     // Catch:{ 24W -> 0x0324 }
        L_0x02ff:
            X.39T r2 = r8.A01()     // Catch:{ 24W -> 0x0324 }
            X.C162457s7.A0H(r2)     // Catch:{ 24W -> 0x0324 }
            X.31C r1 = r4.A04     // Catch:{ 24W -> 0x0324 }
            X.2qk r0 = r4.A00     // Catch:{ 24W -> 0x0324 }
            android.os.Message r0 = X.AnonymousClass36N.A03(r0, r7, r2)     // Catch:{ 24W -> 0x0324 }
            X.C162457s7.A0D(r0)     // Catch:{ 24W -> 0x0324 }
            r1.A0J(r0)     // Catch:{ 24W -> 0x0324 }
        L_0x0314:
            X.36E r1 = r4.A01     // Catch:{ 24W -> 0x0324 }
            java.lang.Integer r0 = r3.A0X     // Catch:{ 24W -> 0x0324 }
            if (r0 != 0) goto L_0x031c
            r0 = 0
            goto L_0x0320
        L_0x031c:
            int r0 = r0.intValue()     // Catch:{ 24W -> 0x0324 }
        L_0x0320:
            r1.A0P(r3, r0, r6)     // Catch:{ 24W -> 0x0324 }
            return
        L_0x0324:
            r1 = move-exception
            java.lang.String r0 = "NewsletterIncomingMessageManager/failed to parse a message"
            com.whatsapp.util.Log.e(r0, r1)
            X.36E r2 = r4.A01
            r1 = 0
            r0 = 5
            r2.A0Q(r3, r1, r0)
            java.lang.String r0 = "491"
            X.39T r3 = r3.BDD(r0)
            X.31C r2 = r4.A04
            X.1VX r1 = r4.A03
            X.2qk r0 = r4.A00
            android.os.Message r0 = X.AnonymousClass36N.A03(r0, r1, r3)
            X.C162457s7.A0D(r0)
            r2.A0J(r0)
            return
        L_0x0348:
            java.lang.Object r6 = r5.A01
            X.1iB r6 = (X.C29041iB) r6
            java.lang.Object r2 = r5.A02
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            long r0 = r5.A00
            X.33G r5 = r6.A0A(r2)
            if (r5 == 0) goto L_0x03a6
            r5.A00 = r0
            X.2s7 r2 = r6.A0K
            com.whatsapp.jid.DeviceJid r7 = r5.A07
            X.2fq r4 = r2.A04
            android.content.ContentValues r9 = X.AnonymousClass0x9.A06()
            java.lang.String r2 = "last_active"
            X.C18270x1.A0c(r9, r2, r0)
            X.1R7 r2 = r4.A02
            X.4Fq r3 = r2.A0C()
            r2 = r3
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x039c }
            X.2sg r8 = r2.A03     // Catch:{ all -> 0x039c }
            java.lang.String r10 = "devices"
            java.lang.String r11 = "device_id = ?"
            java.lang.String[] r13 = X.C18270x1.A1a(r7)     // Catch:{ all -> 0x039c }
            java.lang.String r12 = "setLastActiveTime/UPDATE_DEVICES"
            r8.A05(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x039c }
            monitor-enter(r4)     // Catch:{ all -> 0x039c }
            X.8OQ r2 = r4.A00     // Catch:{ all -> 0x0399 }
            if (r2 == 0) goto L_0x0391
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x0399 }
            X.33G r2 = (X.AnonymousClass33G) r2     // Catch:{ all -> 0x0399 }
            if (r2 == 0) goto L_0x0391
            r2.A00 = r0     // Catch:{ all -> 0x0399 }
        L_0x0391:
            monitor-exit(r4)     // Catch:{ all -> 0x0399 }
            r3.close()
            r6.A0H(r5)
            return
        L_0x0399:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0399 }
            throw r0     // Catch:{ all -> 0x039c }
        L_0x039c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x03a1 }
            throw r1
        L_0x03a1:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x03a6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Device presence: Jid -"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", no device found "
            X.C18260x0.A1J(r1, r0)
            return
        L_0x03b8:
            java.lang.Object r3 = r5.A01
            X.2iN r3 = (X.C50562iN) r3
            java.lang.Object r6 = r5.A02
            X.1mH r6 = (X.C30331mH) r6
            long r1 = r5.A00
            X.33f r0 = r3.A0B
            r0.A0F(r6, r1)
            X.2qz r1 = r3.A0G
            X.2z0 r0 = r6.A1v()
            X.34x r1 = r1.A05(r0)
            boolean r0 = r6 instanceof X.C30571mf
            if (r0 == 0) goto L_0x03fc
            if (r1 == 0) goto L_0x03fc
            X.4FP r0 = r1.A0L
            if (r0 == 0) goto L_0x03fc
            r0.Awm(r6)
        L_0x03de:
            X.2qB r1 = r3.A0A
            X.2z0 r0 = r6.A1J
            java.util.Set r1 = r1.A01(r0)
            X.36E r5 = r3.A02
            r7 = 1
            int r0 = r6.A0C
            int r8 = r0 + 1
            X.2qk r0 = r3.A00
            int r9 = X.C627336j.A00(r0, r1)
            int r10 = r1.size()
            r11 = 0
            r5.A0L(r6, r7, r8, r9, r10, r11)
            return
        L_0x03fc:
            boolean r0 = r6 instanceof X.C30551md
            if (r0 == 0) goto L_0x03de
            boolean r0 = r6.A1V
            if (r0 == 0) goto L_0x03de
            java.util.HashSet r2 = X.C18300x5.A0x(r1)
            X.3Lv r1 = r3.A06
            r0 = 0
            r1.A0k(r2, r0)
            goto L_0x03de
        L_0x040f:
            java.lang.Object r2 = r5.A01
            X.5l7 r2 = (X.C113245l7) r2
            java.lang.Object r3 = r5.A02
            X.4uZ r3 = (X.C95814uZ) r3
            long r7 = r5.A00
            X.676 r0 = r2.A2z
            X.2sj r0 = r0.getGroupParticipantsManager()
            java.util.Set r1 = r0.A04(r3)
            X.676 r0 = r2.A2z
            X.2qk r0 = r0.getCrashLogs()
            int r5 = X.C627336j.A00(r0, r1)
            X.2oJ r2 = r2.A5Q
            r4 = 3
            int r6 = r1.size()
            r2.A01(r3, r4, r5, r6, r7)
            return
        L_0x0438:
            java.lang.Object r3 = r5.A01
            com.whatsapp.calling.service.VoiceServiceEventCallback r3 = (com.whatsapp.calling.service.VoiceServiceEventCallback) r3
            long r1 = r5.A00
            java.lang.Object r0 = r5.A02
            X.2i6 r0 = (X.C50392i6) r0
            r3.lambda$setScheduledCallJoinTimeDiffMs$6(r1, r0)
            return
        L_0x0446:
            java.lang.Object r0 = r5.A01
            X.0yF r0 = (X.C18780yF) r0
            java.lang.Object r3 = r5.A02
            com.whatsapp.voipcalling.CallInfo r3 = (com.whatsapp.voipcalling.CallInfo) r3
            long r1 = r5.A00
            X.5b3 r0 = r0.A01
            X.C107285b3.A03(r0, r3, r1)
            android.os.Handler r3 = r0.A0I
            r2 = 0
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.sendEmptyMessageDelayed(r2, r0)
            return
        L_0x045e:
            java.lang.Object r6 = r5.A01
            X.33m r6 = (X.C621033m) r6
            long r3 = r5.A00
            java.lang.Object r2 = r5.A02
            X.34x r2 = (X.C624134x) r2
            X.2qz r0 = r6.A1o
            X.34x r1 = X.C55122pp.A00(r0, r3)
            java.lang.String r0 = "UserActions/sendEventMessage"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2Wx r0 = r6.A1a
            r0.A00(r2, r1)
            r6.A0O(r2)
            X.3Lv r0 = r6.A0l
            r0.A0V(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70283aF.run():void");
    }
}
