package X;

import java.util.AbstractMap;

/* renamed from: X.3bz  reason: invalid class name and case insensitive filesystem */
public class C71363bz implements Runnable {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C71363bz(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    /* JADX WARNING: type inference failed for: r1v274, types: [java.util.AbstractCollection] */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04c4, code lost:
        if (r7 == null) goto L_0x04c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x08c5, code lost:
        if (r1 != null) goto L_0x08c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x08cb, code lost:
        if (r1.length() == 0) goto L_0x08cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x08cd, code lost:
        if (r7 == null) goto L_0x0924;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x08cf, code lost:
        r1 = r6.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x08e8, code lost:
        if (r6.A0E.A0q(r7, r1.A0G().B9W(), r1.A0G().B66(), 1) == false) goto L_0x0924;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x091e, code lost:
        if (r1.length() != 0) goto L_0x08c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0924, code lost:
        r7 = X.AnonymousClass213.ACTIVE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0db2, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0db3, code lost:
        if (r2 != null) goto L_0x0db5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0db9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:255:0x06ab, B:574:0x0d81] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r35 = this;
            r5 = r35
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x0802;
                case 1: goto L_0x0cd6;
                case 2: goto L_0x0cc2;
                case 3: goto L_0x07f4;
                case 4: goto L_0x01c8;
                case 5: goto L_0x0c92;
                case 6: goto L_0x0c81;
                case 7: goto L_0x0c38;
                case 8: goto L_0x0125;
                case 9: goto L_0x0ba3;
                case 10: goto L_0x0a42;
                case 11: goto L_0x09e8;
                case 12: goto L_0x0103;
                case 13: goto L_0x097f;
                case 14: goto L_0x0975;
                case 15: goto L_0x0019;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r1 = r5.A01
            java.lang.Object r0 = r5.A00
            X.5Q7 r0 = (X.AnonymousClass5Q7) r0
            if (r1 != 0) goto L_0x0018
            X.3Wi r2 = r0.A00
            r1 = 0
            r0 = 2131896485(0x7f1228a5, float:1.9427833E38)
            r2.A0H(r0, r1)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r4 = r5.A00
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity r4 = (com.whatsapp.twofactor.SettingsTwoFactorAuthActivity) r4
            boolean r3 = r5.A01
            boolean r0 = r4.BHW()
            if (r0 != 0) goto L_0x0018
            r0 = 2131434290(0x7f0b1b32, float:1.849039E38)
            android.view.View r9 = r4.findViewById(r0)
            r0 = 2131429768(0x7f0b0988, float:1.8481218E38)
            android.widget.TextView r8 = X.C18310x6.A0L(r4, r0)
            r0 = 2131430948(0x7f0b0e24, float:1.8483611E38)
            android.view.View r7 = r4.findViewById(r0)
            r0 = 2131434460(0x7f0b1bdc, float:1.8490735E38)
            android.view.View r6 = r4.findViewById(r0)
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            r5 = 0
            r1 = 8
            if (r3 != 0) goto L_0x00d2
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x00d2
            r9.setVisibility(r5)
            r7.setVisibility(r5)
            r6.setVisibility(r5)
            r0 = 2131893765(0x7f121e05, float:1.9422316E38)
            r8.setText(r0)
            r0 = -1
            r2.width = r0
            r0 = 41
            X.C18280x3.A0o(r7, r4, r0)
        L_0x0065:
            android.widget.ImageView r2 = r4.A04
            if (r3 == 0) goto L_0x00ce
            X.33j r0 = r4.A00
            X.5Ki r0 = r0.A05()
            boolean r1 = r0.A06
            r0 = 2131233603(0x7f080b43, float:1.8083348E38)
            if (r1 == 0) goto L_0x0079
            r0 = 2131233604(0x7f080b44, float:1.808335E38)
        L_0x0079:
            X.C18290x4.A1A(r4, r2, r0)
            android.view.View r1 = r4.A03
            r0 = 0
            if (r3 == 0) goto L_0x0083
            r0 = 8
        L_0x0083:
            r1.setVisibility(r0)
            android.view.View r1 = r4.A02
            int r0 = X.AnonymousClass001.A08(r3)
            r1.setVisibility(r0)
            android.view.View r0 = r4.A01
            if (r3 != 0) goto L_0x0095
            r5 = 8
        L_0x0095:
            r0.setVisibility(r5)
            android.widget.TextView r2 = r4.A08
            boolean r1 = r4.A0C
            if (r3 == 0) goto L_0x00c5
            r0 = 2131893768(0x7f121e08, float:1.9422322E38)
            if (r1 == 0) goto L_0x00a6
            r0 = 2131893769(0x7f121e09, float:1.9422324E38)
        L_0x00a6:
            r2.setText(r0)
            android.widget.TextView r3 = r4.A07
            X.30e r0 = r4.A0A
            android.content.SharedPreferences r1 = r0.A00()
            java.lang.String r0 = "two_factor_auth_email_set"
            int r2 = X.C18280x3.A02(r1, r0)
            r1 = 1
            r0 = 2131893759(0x7f121dff, float:1.9422304E38)
            if (r2 != r1) goto L_0x00c1
            r0 = 2131893761(0x7f121e01, float:1.9422308E38)
        L_0x00c1:
            r3.setText(r0)
            return
        L_0x00c5:
            r0 = 2131893766(0x7f121e06, float:1.9422318E38)
            if (r1 == 0) goto L_0x00a6
            r0 = 2131893767(0x7f121e07, float:1.942232E38)
            goto L_0x00a6
        L_0x00ce:
            r0 = 2131233602(0x7f080b42, float:1.8083346E38)
            goto L_0x0079
        L_0x00d2:
            r9.setVisibility(r1)
            r7.setVisibility(r1)
            r6.setVisibility(r1)
            r0 = 2131893764(0x7f121e04, float:1.9422314E38)
            r8.setText(r0)
            r0 = -2
            r2.width = r0
            r1 = 2131168133(0x7f070b85, float:1.795056E38)
            if (r3 == 0) goto L_0x00ec
            r1 = 2131168135(0x7f070b87, float:1.7950563E38)
        L_0x00ec:
            android.widget.ImageView r0 = r4.A04
            android.view.ViewGroup$LayoutParams r7 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            int r6 = r7.leftMargin
            int r2 = X.C18320x8.A00(r4, r1)
            int r1 = r7.rightMargin
            int r0 = r7.bottomMargin
            r7.setMargins(r6, r2, r1, r0)
            goto L_0x0065
        L_0x0103:
            java.lang.Object r0 = r5.A00
            X.4Mf r0 = (X.C86884Mf) r0
            boolean r1 = r5.A01
            java.lang.ref.WeakReference r0 = r0.A0E
            java.lang.Object r3 = r0.get()
            X.51g r3 = (X.C985351g) r3
            if (r3 == 0) goto L_0x0018
            if (r1 == 0) goto L_0x0ce0
            r0 = 1
            r3.A03 = r0
            X.5Pj r0 = r3.A05
            r0.A01()
            X.5U7 r0 = r3.A0B
            boolean r0 = r0.A05
            r3.A0B(r0)
            return
        L_0x0125:
            java.lang.Object r7 = r5.A00
            X.2oM r7 = (X.C54212oM) r7
            boolean r3 = r5.A01
            r12 = 0
            java.util.List r6 = r7.A00(r12)
            r0 = 1
            java.util.List r4 = r7.A00(r0)
            int r5 = r6.size()
            int r2 = r4.size()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "# of reply eligible 1on1chats = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " , # of eligible group chats = "
            X.C18260x0.A0w(r0, r1, r2)
            if (r5 != 0) goto L_0x0153
            if (r2 != 0) goto L_0x0153
            return
        L_0x0153:
            int r5 = r5 + r2
            java.util.Map r0 = r7.A0K
            java.util.Collection r0 = r0.values()
            X.C162457s7.A0J(r0, r12)
            java.util.Iterator r1 = r0.iterator()
            r11 = 0
        L_0x0162:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x016e
            int r0 = X.C18280x3.A05(r1)
            int r11 = r11 + r0
            goto L_0x0162
        L_0x016e:
            if (r3 == 0) goto L_0x019b
            java.util.Iterator r2 = r4.iterator()
        L_0x0174:
            boolean r0 = r2.hasNext()
            java.lang.String r3 = "replyreminder"
            if (r0 == 0) goto L_0x0187
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.33T r0 = r7.A0A
            r0.A09(r1, r3)
            goto L_0x0174
        L_0x0187:
            java.util.Iterator r2 = r6.iterator()
        L_0x018b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x019b
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.33T r0 = r7.A0A
            r0.A09(r1, r3)
            goto L_0x018b
        L_0x019b:
            r1 = 1
            if (r5 > r1) goto L_0x0cf1
            if (r11 > r1) goto L_0x0cf1
            java.util.Iterator r2 = r6.iterator()
        L_0x01a4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01b4
            X.4uZ r1 = X.C18300x5.A0P(r2)
            java.lang.String r0 = ""
            r7.A02(r1, r1, r0)
            goto L_0x01a4
        L_0x01b4:
            java.util.Iterator r2 = r4.iterator()
        L_0x01b8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0018
            X.4uZ r1 = X.C18300x5.A0P(r2)
            java.lang.String r0 = ""
            r7.A02(r1, r1, r0)
            goto L_0x01b8
        L_0x01c8:
            java.lang.Object r0 = r5.A00
            X.2UP r0 = (X.AnonymousClass2UP) r0
            boolean r1 = r5.A01
            r20 = r1
            X.2hU r1 = r0.A0E
            android.os.Handler r2 = r1.A00
            r1 = 7
            android.os.Message r1 = android.os.Message.obtain(r2, r1)
            r1.sendToTarget()
            X.2qj r11 = r0.A0D
            java.lang.String r1 = "EditMessageManager/resolveOrphanedEdits"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            X.30G r10 = r11.A0C
            java.lang.Object r13 = r10.A0j
            monitor-enter(r13)
            java.util.ArrayList r21 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0e03 }
            X.3dV r1 = r10.A0N     // Catch:{ all -> 0x0e03 }
            X.4Fq r19 = r1.A04()     // Catch:{ all -> 0x0e03 }
            r1 = r19
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0df9 }
            X.2sg r12 = r1.A03     // Catch:{ all -> 0x0df9 }
            java.lang.String r9 = "SELECT _id, key_id, from_me, chat_row_id, sender_jid_row_id, timestamp, message_type, revoked_key_id, retry_count, admin_jid_row_id, orphan_message_data  FROM message_orphaned_edit"
            java.lang.String r8 = "GET_ORPHANED_EDITS_SQL"
            android.database.Cursor r7 = X.C56862sg.A01(r12, r9, r8)     // Catch:{ all -> 0x0df9 }
            if (r7 != 0) goto L_0x020e
            java.lang.String r1 = "msgstore/resolve-orphaned-edits/cursor-null"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0ded }
            java.util.List r21 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0ded }
            goto L_0x02e6
        L_0x020e:
            X.33e r1 = r10.A0R     // Catch:{ all -> 0x0ded }
            java.util.Map r18 = r1.A09()     // Catch:{ all -> 0x0ded }
            X.2sH r1 = r10.A03     // Catch:{ all -> 0x0ded }
            long r16 = r1.A0H()     // Catch:{ all -> 0x0ded }
            r6 = 0
            r5 = 0
            r3 = 0
        L_0x021d:
            boolean r1 = r7.moveToNext()     // Catch:{ all -> 0x0ded }
            if (r1 == 0) goto L_0x02aa
            X.2TJ r4 = r10.A01(r7)     // Catch:{ all -> 0x0ded }
            if (r4 == 0) goto L_0x029e
            int r2 = r4.A01     // Catch:{ all -> 0x0ded }
            if (r2 != 0) goto L_0x026f
            java.lang.String r1 = r4.A06     // Catch:{ all -> 0x0ded }
            r22 = r1
            boolean r1 = android.text.TextUtils.isEmpty(r22)     // Catch:{ all -> 0x0ded }
            if (r1 != 0) goto L_0x02a7
            com.whatsapp.jid.UserJid r15 = r4.A04     // Catch:{ all -> 0x0ded }
            if (r15 != 0) goto L_0x025e
            X.2z0 r14 = r4.A05     // Catch:{ all -> 0x0ded }
            long r1 = r4.A02     // Catch:{ all -> 0x0ded }
            X.1nU r3 = new X.1nU     // Catch:{ all -> 0x0ded }
            r3.<init>(r14, r1)     // Catch:{ all -> 0x0ded }
        L_0x0244:
            r1 = r22
            r3.A01 = r1     // Catch:{ all -> 0x0ded }
            X.4uZ r1 = r4.A03     // Catch:{ all -> 0x0ded }
            r3.A1J(r1)     // Catch:{ all -> 0x0ded }
            int r1 = r4.A00     // Catch:{ all -> 0x0ded }
            r3.A0C = r1     // Catch:{ all -> 0x0ded }
            boolean r1 = r14.A02     // Catch:{ all -> 0x0ded }
            if (r1 == 0) goto L_0x0258
            r1 = 1
            r3.A1W = r1     // Catch:{ all -> 0x0ded }
        L_0x0258:
            r2 = 1
            r1 = 0
            r10.A04(r3, r1, r1, r2)     // Catch:{ all -> 0x0ded }
            goto L_0x02a5
        L_0x025e:
            X.2z0 r14 = r4.A05     // Catch:{ all -> 0x0ded }
            long r1 = r4.A02     // Catch:{ all -> 0x0ded }
            X.1nV r3 = new X.1nV     // Catch:{ all -> 0x0ded }
            r3.<init>(r14, r1)     // Catch:{ all -> 0x0ded }
            X.2qk r1 = r10.A01     // Catch:{ all -> 0x0ded }
            r3.A01 = r1     // Catch:{ all -> 0x0ded }
            r3.A1v(r15)     // Catch:{ all -> 0x0ded }
            goto L_0x0244
        L_0x026f:
            r1 = 1
            if (r2 != r1) goto L_0x028e
            long r1 = r4.A02     // Catch:{ all -> 0x0ded }
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = r1 + r14
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x028e
            X.4uZ r2 = r4.A03     // Catch:{ all -> 0x0ded }
            r1 = r18
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0ded }
            if (r1 == 0) goto L_0x028e
            r1 = r21
            r1.add(r4)     // Catch:{ all -> 0x0ded }
            int r5 = r5 + 1
            goto L_0x02a7
        L_0x028e:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ded }
            java.lang.String r1 = "msgstore/edit/resolve-orphaned-edits ignoring orphaned message:"
            r2.append(r1)     // Catch:{ all -> 0x0ded }
            X.2z0 r1 = r4.A05     // Catch:{ all -> 0x0ded }
            X.C18260x0.A0m(r1, r2)     // Catch:{ all -> 0x0ded }
            goto L_0x02a7
        L_0x029e:
            java.lang.String r1 = "msgstore/edit/resolve-orphaned-edits error reading orphaned message"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0ded }
            goto L_0x02a7
        L_0x02a5:
            int r6 = r6 + 1
        L_0x02a7:
            r3 = 1
            goto L_0x021d
        L_0x02aa:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ded }
            java.lang.String r1 = "msgstore/edit/resolve-orphaned-edits orphaned="
            r2.append(r1)     // Catch:{ all -> 0x0ded }
            r2.append(r6)     // Catch:{ all -> 0x0ded }
            java.lang.String r1 = " delayed="
            r2.append(r1)     // Catch:{ all -> 0x0ded }
            r2.append(r5)     // Catch:{ all -> 0x0ded }
            java.lang.String r1 = " deleteNeeded="
            X.C18260x0.A1E(r1, r2, r3)     // Catch:{ all -> 0x0ded }
            if (r3 == 0) goto L_0x02e3
            java.lang.String r5 = "message_orphaned_edit"
            java.lang.String r4 = "message_type IN ( ?, ? )"
            java.lang.String[] r3 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x0ded }
            r2 = 0
            java.lang.String r1 = java.lang.Integer.toString(r2)     // Catch:{ all -> 0x0ded }
            r3[r2] = r1     // Catch:{ all -> 0x0ded }
            r2 = 1
            java.lang.String r1 = java.lang.Integer.toString(r2)     // Catch:{ all -> 0x0ded }
            r3[r2] = r1     // Catch:{ all -> 0x0ded }
            java.lang.String r1 = "EditMessageStore/DELETE_ORPHANED_EDITS_SQL"
            r12.A07(r5, r4, r1, r3)     // Catch:{ all -> 0x0ded }
        L_0x02e3:
            r7.close()     // Catch:{ all -> 0x0df9 }
        L_0x02e6:
            r19.close()     // Catch:{ all -> 0x0e03 }
            monitor-exit(r13)     // Catch:{ all -> 0x0e03 }
            X.1VX r3 = r11.A0U
            r2 = 2189(0x88d, float:3.067E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r1 = r3.A0Y(r1, r2)
            if (r1 == 0) goto L_0x0398
            X.3dV r1 = r11.A0M
            X.4Fq r12 = r1.A04()
            r1 = r12
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0dbe }
            X.2sg r1 = r1.A03     // Catch:{ all -> 0x0dbe }
            android.database.Cursor r3 = X.C56862sg.A01(r1, r9, r8)     // Catch:{ all -> 0x0dbe }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0d7e }
            java.lang.String r1 = "EditMessageManager/resolveOrphanedEdits/cursor count:"
            int r1 = X.AnonymousClass0x9.A02(r3, r1, r2)     // Catch:{ all -> 0x0d7e }
            X.C18260x0.A1F(r2, r1)     // Catch:{ all -> 0x0d7e }
        L_0x0312:
            boolean r1 = r3.moveToNext()     // Catch:{ all -> 0x0d7e }
            if (r1 == 0) goto L_0x0392
            X.2TJ r4 = r10.A01(r3)     // Catch:{ all -> 0x0d7e }
            if (r4 == 0) goto L_0x0312
            int r2 = r4.A01     // Catch:{ all -> 0x0d7e }
            r1 = 2
            if (r2 != r1) goto L_0x0312
            X.3Le r7 = r11.A0V     // Catch:{ all -> 0x0d7e }
            r5 = 0
            byte[] r1 = r4.A07     // Catch:{ 6u5 -> 0x038b, 24W -> 0x035a }
            X.1EU r14 = X.AnonymousClass1EU.A00(r1)     // Catch:{ 6u5 -> 0x038b, 24W -> 0x035a }
            int r1 = r14.bitField1_     // Catch:{ 6u5 -> 0x038b, 24W -> 0x035a }
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0354
            X.2z0 r6 = r4.A05     // Catch:{ 6u5 -> 0x038b, 24W -> 0x035a }
            long r1 = r4.A02     // Catch:{ 6u5 -> 0x038b, 24W -> 0x035a }
            X.C18260x0.A0O(r14, r6)     // Catch:{ 6u5 -> 0x038b, 24W -> 0x035a }
            X.2dX r13 = new X.2dX     // Catch:{ 6u5 -> 0x038b, 24W -> 0x035a }
            r15 = r14
            r16 = r6
            r17 = r1
            r13.<init>(r14, r15, r16, r17)     // Catch:{ 6u5 -> 0x038b, 24W -> 0x035a }
            r1 = 1
            r13.A01 = r1     // Catch:{ 6u5 -> 0x038b, 24W -> 0x035a }
            X.2rC r1 = r13.A01()     // Catch:{ 6u5 -> 0x038b, 24W -> 0x035a }
            X.34x r5 = r7.A00(r1)     // Catch:{ 6u5 -> 0x038b, 24W -> 0x035a }
            X.4uZ r1 = r4.A03     // Catch:{ 6u5 -> 0x038b, 24W -> 0x035a }
            r5.A1J(r1)     // Catch:{ 6u5 -> 0x038b, 24W -> 0x035a }
            goto L_0x0362
        L_0x0354:
            java.lang.String r1 = "EditedMessageManager/getMessageAddOnFromOrphan/Invalid edited orphan message"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 6u5 -> 0x038b, 24W -> 0x035a }
            goto L_0x0312
        L_0x035a:
            r2 = move-exception
            java.lang.String r1 = "EditedMessageManager/buildFMessageFromOrphanEdit/Bad e2e message found "
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0d7e }
            if (r5 == 0) goto L_0x0312
        L_0x0362:
            r2 = 0
            r1 = 1
            X.34x r1 = r11.A00(r5, r2, r1)     // Catch:{ all -> 0x0d7e }
            if (r1 == 0) goto L_0x037c
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0d7e }
            java.lang.String r1 = "EditMessageManager/resolveOrphanedEdits/parent found: "
            r2.append(r1)     // Catch:{ all -> 0x0d7e }
            X.2z0 r1 = r4.A05     // Catch:{ all -> 0x0d7e }
            X.C18260x0.A0m(r1, r2)     // Catch:{ all -> 0x0d7e }
            r11.A02(r5)     // Catch:{ all -> 0x0d7e }
            goto L_0x0312
        L_0x037c:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0d7e }
            java.lang.String r1 = "EditMessageManager/resolveOrphanedEdits/parent not found: "
            r2.append(r1)     // Catch:{ all -> 0x0d7e }
            X.2z0 r1 = r4.A05     // Catch:{ all -> 0x0d7e }
            X.C18260x0.A0m(r1, r2)     // Catch:{ all -> 0x0d7e }
            goto L_0x0312
        L_0x038b:
            r2 = move-exception
            java.lang.String r1 = "EditedMessageManager/getMessageAddOnFromOrphan/Failed to parse orphan message "
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0d7e }
            goto L_0x0312
        L_0x0392:
            r3.close()     // Catch:{ all -> 0x0dbe }
            r12.close()
        L_0x0398:
            java.util.Iterator r5 = r21.iterator()
        L_0x039c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x03fc
            java.lang.Object r3 = r5.next()
            X.2TJ r3 = (X.AnonymousClass2TJ) r3
            X.2bg r12 = r0.A0S
            X.2gy r8 = r0.A02
            X.1i9 r7 = r0.A01
            X.33n r9 = r0.A0B
            X.2m9 r10 = r0.A0C
            X.2dP r11 = r0.A0Q
            r14 = 0
            X.2cl r4 = new X.2cl
            r4.<init>()
            X.2z0 r2 = r3.A05
            X.4uZ r1 = X.AnonymousClass2z0.A01(r2)
            r4.A02 = r1
            java.lang.String r1 = r2.A01
            r4.A07 = r1
            long r1 = r3.A02
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.A05 = r1
            java.lang.Boolean r1 = X.C18320x8.A0U()
            r4.A04 = r1
            X.3ST r13 = r4.A00()
            X.4uZ r1 = r3.A03
            X.C626936e.A06(r1)
            r13.A0E = r1
            r1 = 7
            r13.A01 = r1
            int r1 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.A0Y = r1
            r18 = 1
            X.2dH r6 = new X.2dH
            r16 = r14
            r17 = r14
            r15 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = 13
            r6.A00(r1)
            goto L_0x039c
        L_0x03fc:
            X.33f r5 = r0.A0I
            java.lang.String r1 = "MessageAddOnManager/resolveOrphanedMessageAddOns"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.HashSet r28 = X.AnonymousClass002.A0K()
            java.util.HashSet r27 = X.AnonymousClass002.A0K()
            X.3dV r1 = r5.A0G
            X.4GK r26 = r1.get()
            X.2SB r6 = r5.A0K     // Catch:{ all -> 0x0de3 }
            r1 = r26
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0de3 }
            X.2sg r4 = r1.A03     // Catch:{ all -> 0x0de3 }
            java.lang.String r3 = X.C625035h.A03     // Catch:{ all -> 0x0de3 }
            r2 = 0
            java.lang.String r1 = "MessageAddOnOrphanStore/getMessageAddOnOrphansCursor"
            android.database.Cursor r4 = r4.A0E(r3, r1, r2)     // Catch:{ all -> 0x0de3 }
            java.util.HashMap r3 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0dd7 }
            java.lang.String[] r1 = X.C66153Kg.A00     // Catch:{ all -> 0x0dd7 }
            X.C626135u.A02(r4, r3, r1)     // Catch:{ all -> 0x0dd7 }
            java.lang.String r1 = "_id"
            int r25 = A00(r1, r3)     // Catch:{ all -> 0x0dd7 }
            java.lang.String r1 = "parent_from_me"
            int r24 = A00(r1, r3)     // Catch:{ all -> 0x0dd7 }
            java.lang.String r1 = "parent_key_id"
            int r23 = A00(r1, r3)     // Catch:{ all -> 0x0dd7 }
            java.lang.String r1 = "parent_chat_row_id"
            int r22 = A00(r1, r3)     // Catch:{ all -> 0x0dd7 }
            java.lang.String r1 = "parent_sender_jid_row_id"
            int r21 = A00(r1, r3)     // Catch:{ all -> 0x0dd7 }
        L_0x044d:
            boolean r1 = r4.moveToNext()     // Catch:{ all -> 0x0dd7 }
            if (r1 == 0) goto L_0x05bf
            r1 = r25
            long r10 = r4.getLong(r1)     // Catch:{ all -> 0x0dd7 }
            r1 = r22
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x0dd7 }
            X.2sm r7 = r5.A07     // Catch:{ all -> 0x0dd7 }
            long r1 = (long) r1     // Catch:{ all -> 0x0dd7 }
            X.4uZ r7 = r7.A0B(r1)     // Catch:{ all -> 0x0dd7 }
            r1 = r24
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x0dd7 }
            boolean r8 = X.AnonymousClass001.A1T(r1)
            r1 = r23
            java.lang.String r13 = r4.getString(r1)     // Catch:{ all -> 0x0dd7 }
            r1 = r21
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x0dd7 }
            X.34p r9 = r5.A0C     // Catch:{ all -> 0x0dd7 }
            java.lang.Class<X.4uZ> r12 = X.C95814uZ.class
            long r1 = (long) r1     // Catch:{ all -> 0x0dd7 }
            com.whatsapp.jid.Jid r9 = r9.A0B(r12, r1)     // Catch:{ all -> 0x0dd7 }
            X.4uZ r9 = (X.C95814uZ) r9     // Catch:{ all -> 0x0dd7 }
            if (r7 != 0) goto L_0x049b
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0dd7 }
            java.lang.String r1 = "MessageAddOnManager/resolveOrphanedMessageAddOns ignoring orphanId="
            r2.append(r1)     // Catch:{ all -> 0x0dd7 }
            r2.append(r10)     // Catch:{ all -> 0x0dd7 }
            java.lang.String r1 = " id="
            X.C18260x0.A0t(r1, r13, r2)     // Catch:{ all -> 0x0dd7 }
            goto L_0x044d
        L_0x049b:
            X.2z0 r8 = X.AnonymousClass2z0.A05(r7, r13, r8)     // Catch:{ all -> 0x0dd7 }
            r1 = r28
            boolean r1 = r1.contains(r8)     // Catch:{ all -> 0x0dd7 }
            if (r1 != 0) goto L_0x044d
            X.2qz r13 = r5.A0X     // Catch:{ all -> 0x0dd7 }
            X.34x r7 = r13.A05(r8)     // Catch:{ all -> 0x0dd7 }
            if (r7 != 0) goto L_0x04cc
            X.2jy r1 = r5.A0E     // Catch:{ all -> 0x0dd7 }
            android.database.Cursor r2 = r1.A00(r8)     // Catch:{ all -> 0x0dd7 }
            if (r2 == 0) goto L_0x04c6
            boolean r1 = r2.moveToNext()     // Catch:{ all -> 0x0d85 }
            if (r1 == 0) goto L_0x04c1
            X.34x r7 = r13.A03(r2)     // Catch:{ all -> 0x0d85 }
        L_0x04c1:
            r2.close()     // Catch:{ all -> 0x0dd7 }
            if (r7 != 0) goto L_0x04cc
        L_0x04c6:
            r1 = r28
            r1.add(r8)     // Catch:{ all -> 0x0dd7 }
            goto L_0x044d
        L_0x04cc:
            X.2eA r13 = r5.A0F     // Catch:{ all -> 0x0dd7 }
            long r1 = r7.A1L     // Catch:{ all -> 0x0dd7 }
            byte[] r19 = r13.A01(r1)     // Catch:{ all -> 0x0dd7 }
            java.lang.String r1 = "chat_row_id"
            java.lang.Object r1 = X.C18290x4.A0i(r1, r3)     // Catch:{ all -> 0x0dd7 }
            int r2 = X.AnonymousClass0x7.A05(r1)     // Catch:{ all -> 0x0dd7 }
            java.lang.String r1 = "from_me"
            java.lang.Object r1 = X.C18290x4.A0i(r1, r3)     // Catch:{ all -> 0x0dd7 }
            int r15 = X.AnonymousClass0x7.A05(r1)     // Catch:{ all -> 0x0dd7 }
            java.lang.String r1 = "key_id"
            java.lang.Object r1 = X.C18290x4.A0i(r1, r3)     // Catch:{ all -> 0x0dd7 }
            int r13 = X.AnonymousClass0x7.A05(r1)     // Catch:{ all -> 0x0dd7 }
            java.lang.String r1 = "sender_jid_row_id"
            java.lang.Object r1 = X.C18290x4.A0i(r1, r3)     // Catch:{ all -> 0x0dd7 }
            int r18 = X.AnonymousClass0x7.A05(r1)     // Catch:{ all -> 0x0dd7 }
            java.lang.String r1 = "timestamp"
            java.lang.Object r1 = X.C18290x4.A0i(r1, r3)     // Catch:{ all -> 0x0dd7 }
            int r17 = X.AnonymousClass0x7.A05(r1)     // Catch:{ all -> 0x0dd7 }
            java.lang.String r1 = "orphan_message_data"
            java.lang.Object r1 = X.C18290x4.A0i(r1, r3)     // Catch:{ all -> 0x0dd7 }
            int r16 = X.AnonymousClass0x7.A05(r1)     // Catch:{ all -> 0x0dd7 }
            int r1 = r4.getInt(r2)     // Catch:{ all -> 0x0dd7 }
            X.2sm r14 = r6.A01     // Catch:{ all -> 0x0dd7 }
            long r1 = (long) r1     // Catch:{ all -> 0x0dd7 }
            X.4uZ r14 = r14.A0B(r1)     // Catch:{ all -> 0x0dd7 }
            int r1 = r4.getInt(r15)     // Catch:{ all -> 0x0dd7 }
            boolean r2 = X.AnonymousClass001.A1T(r1)
            java.lang.String r1 = r4.getString(r13)     // Catch:{ all -> 0x0dd7 }
            X.2z0 r32 = X.AnonymousClass2z0.A05(r14, r1, r2)     // Catch:{ all -> 0x0dd7 }
            r1 = r18
            int r2 = r4.getInt(r1)     // Catch:{ all -> 0x0dd7 }
            r1 = -1
            if (r2 == r1) goto L_0x054d
            X.34p r13 = r6.A02     // Catch:{ all -> 0x0dd7 }
            long r1 = (long) r2     // Catch:{ all -> 0x0dd7 }
            com.whatsapp.jid.Jid r2 = r13.A0B(r12, r1)     // Catch:{ all -> 0x0dd7 }
            X.4uZ r2 = (X.C95814uZ) r2     // Catch:{ all -> 0x0dd7 }
        L_0x0540:
            r1 = r17
            long r33 = r4.getLong(r1)     // Catch:{ all -> 0x0dd7 }
            r1 = r16
            byte[] r1 = r4.getBlob(r1)     // Catch:{ all -> 0x0dd7 }
            goto L_0x054f
        L_0x054d:
            r2 = 0
            goto L_0x0540
        L_0x054f:
            X.1EU r12 = X.AnonymousClass1EU.A00(r1)     // Catch:{ 6u5 -> 0x05b7 }
            r1 = 0
            X.C162457s7.A0J(r12, r1)     // Catch:{ all -> 0x0dd7 }
            X.2dX r29 = new X.2dX     // Catch:{ all -> 0x0dd7 }
            r31 = r12
            r30 = r12
            r29.<init>(r30, r31, r32, r33)     // Catch:{ all -> 0x0dd7 }
            X.2rC r13 = r29.A01()     // Catch:{ all -> 0x0dd7 }
            X.3Le r12 = r6.A05     // Catch:{ 24W -> 0x044d }
            X.34x r12 = r12.A00(r13)     // Catch:{ 24W -> 0x044d }
            boolean r13 = r12 instanceof X.C30331mH     // Catch:{ 24W -> 0x044d }
            if (r13 == 0) goto L_0x044d
            X.1mH r12 = (X.C30331mH) r12     // Catch:{ 24W -> 0x044d }
            r12.A1J(r2)     // Catch:{ all -> 0x0dd7 }
            X.C30331mH.A03(r9, r12, r8)     // Catch:{ all -> 0x0dd7 }
            if (r19 == 0) goto L_0x057c
            r2 = r19
            r12.A1a = r2     // Catch:{ all -> 0x0dd7 }
        L_0x057c:
            boolean r2 = r7 instanceof X.C30351mJ     // Catch:{ all -> 0x0dd7 }
            if (r2 == 0) goto L_0x0586
            boolean r2 = r12 instanceof X.C30591mh     // Catch:{ all -> 0x0dd7 }
            if (r2 == 0) goto L_0x0586
            goto L_0x044d
        L_0x0586:
            boolean r2 = r7 instanceof X.C30531mb     // Catch:{ all -> 0x0dd7 }
            if (r2 == 0) goto L_0x0590
            X.2kn r2 = X.C52042kn.A00(r7)     // Catch:{ all -> 0x0dd7 }
            r12.A05 = r2     // Catch:{ all -> 0x0dd7 }
        L_0x0590:
            int r2 = r5.A03(r12, r1)     // Catch:{ all -> 0x0dd7 }
            boolean r1 = X.AnonymousClass31T.A00(r2)     // Catch:{ all -> 0x0dd7 }
            if (r1 != 0) goto L_0x059d
            r1 = 5
            if (r2 != r1) goto L_0x05a2
        L_0x059d:
            r1 = r27
            X.AnonymousClass0x2.A1Q(r1, r10)     // Catch:{ all -> 0x0dd7 }
        L_0x05a2:
            r1 = 8
            if (r2 == r1) goto L_0x05aa
            r1 = 9
            if (r2 != r1) goto L_0x044d
        L_0x05aa:
            boolean r1 = r12 instanceof X.C30561me     // Catch:{ all -> 0x0dd7 }
            if (r1 == 0) goto L_0x044d
            X.2pk r1 = r5.A0L     // Catch:{ all -> 0x0dd7 }
            X.1me r12 = (X.C30561me) r12     // Catch:{ all -> 0x0dd7 }
            r1.A03(r12)     // Catch:{ all -> 0x0dd7 }
            goto L_0x044d
        L_0x05b7:
            r2 = move-exception
            java.lang.String r1 = "MessageAddOnOrphanStore/getMessageAddOnFromOrphan failed to parse orphan message"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0dd7 }
            goto L_0x044d
        L_0x05bf:
            boolean r1 = r27.isEmpty()     // Catch:{ all -> 0x0dd7 }
            if (r1 != 0) goto L_0x0633
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0dd7 }
            java.lang.String r2 = "MessageAddOnManager/deleteMessageAddOnOrphans count = "
            r1 = r27
            X.C18260x0.A1B(r2, r3, r1)     // Catch:{ all -> 0x0dd7 }
            int r1 = r27.size()     // Catch:{ all -> 0x0dd7 }
            java.lang.String[] r11 = new java.lang.String[r1]     // Catch:{ all -> 0x0dd7 }
            java.util.Iterator r8 = r27.iterator()     // Catch:{ all -> 0x0dd7 }
            r7 = 0
        L_0x05db:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x0dd7 }
            if (r1 == 0) goto L_0x05f0
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x0dd7 }
            long r1 = X.C18320x8.A05(r1)     // Catch:{ all -> 0x0dd7 }
            int r3 = r7 + 1
            X.C18280x3.A1R(r11, r7, r1)     // Catch:{ all -> 0x0dd7 }
            r7 = r3
            goto L_0x05db
        L_0x05f0:
            X.3dV r1 = r6.A03     // Catch:{ all -> 0x0dd7 }
            X.4Fq r10 = r1.A04()     // Catch:{ all -> 0x0dd7 }
            X.3Yo r9 = r10.Axl()     // Catch:{ all -> 0x0d99 }
            r1 = 975(0x3cf, float:1.366E-42)
            X.3ct r8 = new X.3ct     // Catch:{ all -> 0x0d8f }
            r8.<init>(r11, r1)     // Catch:{ all -> 0x0d8f }
        L_0x0601:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x0d8f }
            if (r1 == 0) goto L_0x062a
            java.lang.String[] r7 = X.C71923ct.A01(r8)     // Catch:{ all -> 0x0d8f }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0d8f }
            java.lang.String r1 = "_id IN "
            r2.append(r1)     // Catch:{ all -> 0x0d8f }
            int r1 = r7.length     // Catch:{ all -> 0x0d8f }
            java.lang.String r1 = X.C57212tH.A00(r1)     // Catch:{ all -> 0x0d8f }
            java.lang.String r6 = X.AnonymousClass000.A0X(r1, r2)     // Catch:{ all -> 0x0d8f }
            r1 = r10
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0d8f }
            X.2sg r3 = r1.A03     // Catch:{ all -> 0x0d8f }
            java.lang.String r2 = "message_add_on_orphan"
            java.lang.String r1 = "MessageAddOnOrphanStore/deleteMessageAddOnOrphans"
            r3.A07(r2, r6, r1, r7)     // Catch:{ all -> 0x0d8f }
            goto L_0x0601
        L_0x062a:
            r9.A00()     // Catch:{ all -> 0x0d8f }
            r9.close()     // Catch:{ all -> 0x0d99 }
            r10.close()     // Catch:{ all -> 0x0dd7 }
        L_0x0633:
            r4.close()     // Catch:{ all -> 0x0de3 }
            r26.close()
            X.2eV r1 = r5.A0V
            boolean r1 = r1.A01()
            if (r1 == 0) goto L_0x06fb
            X.2pk r6 = r5.A0L
            X.3Ll r3 = r6.A06
            X.2eV r1 = r6.A08
            int r9 = r1.A00()
            java.lang.String[] r8 = X.AnonymousClass0x9.A1Y()
            X.2sH r1 = r3.A00
            long r1 = r1.A0H()
            X.C18260x0.A1X(r8, r1)
            X.3dV r1 = r3.A03
            X.4GK r12 = r1.get()
            r1 = r12
            X.3H0 r1 = (X.AnonymousClass3H0) r1     // Catch:{ all -> 0x0dbe }
            X.2sg r7 = r1.A03     // Catch:{ all -> 0x0dbe }
            java.lang.StringBuilder r3 = X.AnonymousClass0x2.A0h()     // Catch:{ all -> 0x0dbe }
            java.lang.String r5 = "chat_row_id"
            java.lang.String r2 = "message_add_on"
            java.lang.String[] r1 = X.C18270x1.A1b(r5)     // Catch:{ all -> 0x0dbe }
            java.lang.String r1 = X.C57212tH.A01(r2, r1)     // Catch:{ all -> 0x0dbe }
            X.AnonymousClass0x2.A1O(r3, r1)     // Catch:{ all -> 0x0dbe }
            r3.append(r2)     // Catch:{ all -> 0x0dbe }
            java.lang.String r1 = " JOIN "
            r3.append(r1)     // Catch:{ all -> 0x0dbe }
            java.lang.String r1 = "message_add_on_pin_in_chat"
            X.C18300x5.A1P(r3, r1)     // Catch:{ all -> 0x0dbe }
            java.lang.String r1 = "message_add_on._id = message_add_on_pin_in_chat.message_add_on_row_id"
            X.AnonymousClass0x2.A1N(r3, r1)     // Catch:{ all -> 0x0dbe }
            java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x0dbe }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0dbe }
            java.lang.String r1 = " HAVING COUNT(*) > "
            java.lang.String r3 = X.AnonymousClass000.A0Y(r1, r2, r9)     // Catch:{ all -> 0x0dbe }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r4)     // Catch:{ all -> 0x0dbe }
            java.lang.String r1 = " WHERE message_add_on.message_add_on_type = 79 AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0) AND message_add_on_pin_in_chat.pin_in_chat_state = 1"
            r2.append(r1)     // Catch:{ all -> 0x0dbe }
            java.lang.String r1 = " GROUP BY chat_row_id"
            java.lang.String r2 = X.AnonymousClass000.A0V(r1, r3, r2)     // Catch:{ all -> 0x0dbe }
            java.lang.String r1 = "MessageAddOnStore/getChatRowIdsWithOverLimitPins"
            android.database.Cursor r2 = r7.A0E(r2, r1, r8)     // Catch:{ all -> 0x0dbe }
            java.util.ArrayList r3 = X.AnonymousClass000.A0o(r2)     // Catch:{ all -> 0x0db2 }
        L_0x06af:
            boolean r1 = r2.moveToNext()     // Catch:{ all -> 0x0db2 }
            if (r1 == 0) goto L_0x06bd
            int r1 = r2.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0db2 }
            X.C18260x0.A0H(r2, r3, r1)     // Catch:{ all -> 0x0db2 }
            goto L_0x06af
        L_0x06bd:
            r2.close()     // Catch:{ all -> 0x0dbe }
            r12.close()
            int r1 = r3.size()
            if (r1 <= 0) goto L_0x06d2
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "MessageAddOnPinInChatManager/enforceLimitForEligibleChats/chatRowIds size:"
            X.C18260x0.A1B(r1, r2, r3)
        L_0x06d2:
            X.3dV r1 = r6.A04
            X.4Fq r5 = r1.A04()
            X.3Yo r4 = r5.Axl()     // Catch:{ all -> 0x0dad }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0da3 }
        L_0x06e0:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x0da3 }
            if (r1 == 0) goto L_0x06f2
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0da3 }
            long r1 = X.C18320x8.A05(r1)     // Catch:{ all -> 0x0da3 }
            r6.A01(r4, r5, r1)     // Catch:{ all -> 0x0da3 }
            goto L_0x06e0
        L_0x06f2:
            r4.A00()     // Catch:{ all -> 0x0da3 }
            r4.close()     // Catch:{ all -> 0x0dad }
            r5.close()
        L_0x06fb:
            X.4FS r3 = r0.A0b
            r1 = 23
            X.3bq r2 = new X.3bq
            r2.<init>((java.lang.Object) r0, (int) r1)
            java.lang.String r1 = "OfflineResumeHandler/onOfflineComplete orphaned messages"
            r3.BkN(r2, r1)
            X.1VX r5 = r0.A0K
            X.2vE r4 = X.C58422vE.A01
            r1 = 3702(0xe76, float:5.188E-42)
            boolean r1 = r5.A0Y(r4, r1)
            if (r1 == 0) goto L_0x077c
            X.2NU r8 = r0.A08
            java.lang.String r1 = "PresortingChatsManager/resetConversationTimestamps"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.314 r2 = r8.A00
            java.lang.String r1 = "ConversationsManager/resetThreadMetadata"
            com.whatsapp.util.Log.d((java.lang.String) r1)
            X.3ZV r7 = r2.A01
            monitor-enter(r7)
            boolean r2 = r7.A00     // Catch:{ all -> 0x0dc3 }
            r1 = 0
            if (r2 == 0) goto L_0x0773
            r7.A00 = r1     // Catch:{ all -> 0x0dc3 }
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0dc3 }
            java.util.HashMap r11 = r7.A03     // Catch:{ all -> 0x0dc3 }
            java.util.Iterator r10 = X.AnonymousClass001.A0u(r11)     // Catch:{ all -> 0x0dc3 }
        L_0x0737:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x0dc3 }
            if (r1 == 0) goto L_0x0756
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r10)     // Catch:{ all -> 0x0dc3 }
            X.4uZ r6 = X.C18320x8.A0N(r1)     // Catch:{ all -> 0x0dc3 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0dc3 }
            long r2 = X.C18320x8.A05(r1)     // Catch:{ all -> 0x0dc3 }
            X.2jt r1 = new X.2jt     // Catch:{ all -> 0x0dc3 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0dc3 }
            r9.add(r1)     // Catch:{ all -> 0x0dc3 }
            goto L_0x0737
        L_0x0756:
            r11.clear()     // Catch:{ all -> 0x0dc3 }
            java.util.Comparator r1 = r7.A02     // Catch:{ all -> 0x0dc3 }
            java.util.Collections.sort(r9, r1)     // Catch:{ all -> 0x0dc3 }
            java.util.ArrayList r2 = r7.A01     // Catch:{ all -> 0x0dc3 }
            boolean r1 = r2.equals(r9)     // Catch:{ all -> 0x0dc3 }
            if (r1 != 0) goto L_0x0773
            java.lang.String r1 = "SortedConversationsList/resetThreadMetadata restoring the real timestamps"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0dc3 }
            r2.clear()     // Catch:{ all -> 0x0dc3 }
            r2.addAll(r9)     // Catch:{ all -> 0x0dc3 }
            r1 = 1
            goto L_0x0774
        L_0x0773:
            r1 = 0
        L_0x0774:
            monitor-exit(r7)     // Catch:{ all -> 0x0dc3 }
            if (r1 == 0) goto L_0x077c
            X.1hw r1 = r8.A01
            r1.A08()
        L_0x077c:
            X.3Cl r1 = r0.A0U
            X.2lg r3 = r1.A00()
            if (r3 != 0) goto L_0x078c
            X.2qD r1 = r0.A0T
            boolean r1 = r1.A04()
            if (r1 == 0) goto L_0x0797
        L_0x078c:
            X.2sT r2 = r0.A0P
            r1 = 28
            X.3a0 r1 = X.C70133a0.A00(r0, r3, r1)
            r2.A09(r1)
        L_0x0797:
            X.3Qu r1 = r0.A0c
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.A0H
            r1 = 0
            r2.set(r1)
            java.lang.String r1 = "XmppConnectionMetrics/onOfflineResumeComplete"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = 6524(0x197c, float:9.142E-42)
            boolean r1 = r5.A0Y(r4, r1)
            if (r1 == 0) goto L_0x07bd
            X.3Wi r4 = r0.A00
            X.1im r3 = r0.A03
            java.util.Objects.requireNonNull(r3)
            r2 = 19
            X.3bq r1 = new X.3bq
            r1.<init>((java.lang.Object) r3, (int) r2)
            r4.A0S(r1)
        L_0x07bd:
            X.3CL r5 = r0.A0V
            X.66R r1 = r5.A00
            java.lang.Object r1 = r1.getValue()
            com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher r1 = (com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher) r1
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A01
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x07ec
            r4 = 3
            X.3bz r3 = new X.3bz
            r1 = r20
            r3.<init>(r4, r0, r1)
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0dc6
            X.66R r0 = r5.A01
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x0dc6
            java.lang.String r0 = "DelayedStanzasManager/pullDelayedNotifications ignoring, instead will be pulling when app goes to fg"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.run()
            return
        L_0x07ec:
            if (r20 == 0) goto L_0x0018
            r1 = 2000(0x7d0, double:9.88E-321)
            X.AnonymousClass2UP.A00(r0, r1)
            return
        L_0x07f4:
            java.lang.Object r2 = r5.A00
            X.2UP r2 = (X.AnonymousClass2UP) r2
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0018
            r0 = 1000(0x3e8, double:4.94E-321)
            X.AnonymousClass2UP.A00(r2, r0)
            return
        L_0x0802:
            r13 = 0
            java.lang.Object r6 = r5.A00
            X.11I r6 = (X.AnonymousClass11I) r6
            boolean r4 = r5.A01
            X.2z0 r1 = r6.A0F
            if (r1 == 0) goto L_0x093e
            X.2cC r0 = r6.A0C
            X.2qz r0 = r0.A05
            X.34x r8 = r0.A05(r1)
            X.1n7 r8 = (X.C30791n7) r8
        L_0x0817:
            r11 = 0
            if (r8 == 0) goto L_0x093a
            X.39W r0 = r8.A00
            if (r0 == 0) goto L_0x093a
            X.39S r0 = r0.A01
            if (r0 == 0) goto L_0x093a
            java.lang.String r2 = r0.A04
            if (r2 == 0) goto L_0x093b
            X.2cC r0 = r6.A0C
            X.36F r0 = r0.A02
            X.34w r7 = r0.A0G(r2)
            if (r7 != 0) goto L_0x0835
            java.lang.String r0 = "Pay: PaymentCheckoutOrderViewModel/loadData the paymentTransactionInfo fetched from PaymentTransactionStore is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0835:
            r6.A0G(r7, r8)
            if (r8 == 0) goto L_0x0935
            X.39W r0 = r8.A00
            if (r0 == 0) goto L_0x0935
            X.39S r5 = r0.A01
            if (r5 == 0) goto L_0x0936
            X.39G r0 = r5.A09
            X.C162457s7.A0H(r0)
            X.39L r14 = r5.A03(r0)
            X.39Q r0 = r14.A02
        L_0x084d:
            X.C162457s7.A0H(r0)
            java.math.BigDecimal r3 = r0.A00
            X.C162457s7.A0D(r3)
            X.1VX r12 = r6.A08
            r0 = 1826(0x722, float:2.559E-42)
            long r0 = X.C56952sp.A06(r12, r0)
            X.39W r9 = r8.A00
            if (r9 == 0) goto L_0x0867
            X.39S r9 = r9.A01
            if (r9 == 0) goto L_0x0867
            X.4Fi r13 = r9.A06
        L_0x0867:
            X.2xu r9 = new X.2xu
            r9.<init>()
            r10 = 1000(0x3e8, float:1.401E-42)
            r9.A00 = r10
            r9.A01 = r0
            r9.A02 = r13
            X.39L r9 = r9.A01()
            r0 = 1712(0x6b0, float:2.399E-42)
            long r0 = X.C56952sp.A06(r12, r0)
            X.39W r8 = r8.A00
            if (r8 == 0) goto L_0x0888
            X.39S r8 = r8.A01
            if (r8 == 0) goto L_0x0888
            X.4Fi r11 = r8.A06
        L_0x0888:
            X.2xu r8 = new X.2xu
            r8.<init>()
            r8.A00 = r10
            r8.A01 = r0
            r8.A02 = r11
            X.39L r8 = r8.A01()
            java.lang.String r17 = r5.A04()
            float r1 = r3.floatValue()
            X.39Q r0 = r9.A02
            java.math.BigDecimal r0 = r0.A00
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0921
            float r1 = r3.floatValue()
            X.39Q r0 = r8.A02
            java.math.BigDecimal r0 = r0.A00
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0921
            java.lang.String r1 = r5.A02
            if (r2 == 0) goto L_0x0918
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0918
            if (r1 == 0) goto L_0x08cd
        L_0x08c7:
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0921
        L_0x08cd:
            if (r7 == 0) goto L_0x0924
            X.9U4 r1 = r6.A0B
            X.9oC r0 = r1.A0G()
            X.9nv r3 = r0.B66()
            X.9oC r0 = r1.A0G()
            X.9Vt r2 = r0.B9W()
            X.9Wq r1 = r6.A0E
            r0 = 1
            boolean r0 = r1.A0q(r7, r2, r3, r0)
            if (r0 == 0) goto L_0x0924
        L_0x08ea:
            X.390 r0 = r5.A08
            if (r4 == 0) goto L_0x0921
            if (r0 == 0) goto L_0x0916
            int r0 = r0.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x08f6:
            boolean r0 = r6 instanceof X.C29551jr
            if (r0 == 0) goto L_0x0941
            X.213 r1 = X.AnonymousClass213.INACTIVE
            r3 = 0
            X.38p r0 = new X.38p
            r0.<init>(r3, r1, r3)
            X.08M r1 = r6.A03
            X.34W r2 = r6.A0D
            X.213 r6 = r0.A01
            java.util.List r9 = r0.A02
            r5 = r3
            r7 = r3
            r8 = r3
            r4 = r3
            X.9WE r0 = r2.A00(r3, r4, r5, r6, r7, r8, r9)
        L_0x0912:
            r1.A0G(r0)
            return
        L_0x0916:
            r5 = 0
            goto L_0x08f6
        L_0x0918:
            if (r1 == 0) goto L_0x08ea
            int r0 = r1.length()
            if (r0 != 0) goto L_0x08c7
            goto L_0x08ea
        L_0x0921:
            X.213 r7 = X.AnonymousClass213.INACTIVE
            goto L_0x0926
        L_0x0924:
            X.213 r7 = X.AnonymousClass213.ACTIVE
        L_0x0926:
            X.08M r1 = r6.A03
            X.34W r3 = r6.A0D
            r4 = 0
            r6 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r5 = r4
            X.9WE r0 = r3.A00(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0912
        L_0x0935:
            r5 = r13
        L_0x0936:
            r14 = r13
            r0 = r13
            goto L_0x084d
        L_0x093a:
            r2 = r13
        L_0x093b:
            r7 = r13
            goto L_0x0835
        L_0x093e:
            r8 = 0
            goto L_0x0817
        L_0x0941:
            com.whatsapp.jid.UserJid r15 = r6.A09
            if (r15 == 0) goto L_0x0018
            X.2cC r4 = r6.A0C
            X.3Rd r3 = new X.3Rd
            r3.<init>(r6)
            r19 = 0
            X.1VX r2 = r4.A03
            r1 = 4443(0x115b, float:6.226E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0971
            if (r5 == 0) goto L_0x0971
            int r1 = r5.intValue()
            r0 = 1
            if (r1 <= r0) goto L_0x0971
            X.2hG r13 = r4.A04
            r19 = 1
        L_0x0967:
            r20 = 0
            r16 = r3
            r18 = r1
            r13.A01(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x0971:
            X.2hG r13 = r4.A04
            r1 = 1
            goto L_0x0967
        L_0x0975:
            java.lang.Object r1 = r5.A00
            X.4Me r1 = (X.C86874Me) r1
            boolean r0 = r5.A01
            r1.A01(r0)
            return
        L_0x097f:
            java.lang.Object r2 = r5.A00
            com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment r2 = (com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment) r2
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0994
            X.8qC r0 = r2.A04
            X.1el r5 = X.AnonymousClass0x9.A0a(r0)
            X.39M r4 = r2.A01
            r3 = 0
        L_0x0990:
            r5.A0G(r3, r4)
            return
        L_0x0994:
            X.8qC r0 = r2.A05
            X.1el r1 = X.AnonymousClass0x9.A0a(r0)
            X.39M r0 = r2.A01
            java.lang.String r0 = r0.A0D
            android.util.Pair r0 = r1.A0B(r0)
            if (r0 == 0) goto L_0x09e5
            java.lang.Object r0 = r0.second
            long r10 = X.C18310x6.A0B(r0)
        L_0x09aa:
            X.39M r0 = r2.A01
            java.lang.String r7 = r0.A0D
            if (r7 == 0) goto L_0x09e0
            X.3Gp r3 = r2.A00
            X.2j3 r1 = r3.A0c
            java.lang.String r0 = "removeRecentSticker"
            X.2sc r0 = r1.A00(r0)
            X.1Om r0 = (X.AnonymousClass1Om) r0
            if (r0 == 0) goto L_0x09e0
            X.2sH r0 = r0.A02
            long r8 = r0.A0H()
            r5 = 0
            r12 = 0
            X.1SO r4 = new X.1SO
            r6 = r5
            r4.<init>(r5, r6, r7, r8, r10, r12)
            java.util.Set r1 = X.C65203Gp.A00(r3, r4)
        L_0x09d1:
            X.8qC r0 = r2.A05
            X.1el r5 = X.AnonymousClass0x9.A0a(r0)
            X.39M r4 = r2.A01
            r0 = 4
            X.4IK r3 = new X.4IK
            r3.<init>(r2, r0, r1)
            goto L_0x0990
        L_0x09e0:
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L_0x09d1
        L_0x09e5:
            r10 = 0
            goto L_0x09aa
        L_0x09e8:
            java.lang.Object r0 = r5.A00
            com.whatsapp.settings.SettingsUserProxyActivity r0 = (com.whatsapp.settings.SettingsUserProxyActivity) r0
            boolean r4 = r5.A01
            com.whatsapp.settings.SettingsUserProxyViewModel r3 = r0.A09
            monitor-enter(r3)
            X.2rm r5 = r3.A0E     // Catch:{ all -> 0x0a3f }
            r5.A04(r4)     // Catch:{ all -> 0x0a3f }
            r2 = 0
            if (r4 == 0) goto L_0x0a13
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x0a3f }
            if (r0 == 0) goto L_0x0a36
            X.2yZ r0 = r3.A0F     // Catch:{ all -> 0x0a3f }
            X.2rm r0 = r0.A00     // Catch:{ all -> 0x0a3f }
            java.lang.String r0 = r0.A00()     // Catch:{ all -> 0x0a3f }
            if (r0 != 0) goto L_0x0a0e
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x0a3f }
            if (r0 == 0) goto L_0x0a0e
            r3.A0I(r0)     // Catch:{ all -> 0x0a3f }
        L_0x0a0e:
            r0 = 1
            r3.A0G(r0, r2)     // Catch:{ all -> 0x0a3f }
            goto L_0x0a33
        L_0x0a13:
            boolean r0 = r3.A03     // Catch:{ all -> 0x0a3f }
            if (r0 != 0) goto L_0x0a36
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x0a3f }
            if (r0 != 0) goto L_0x0a1d
            r1 = 0
            goto L_0x0a27
        L_0x0a1d:
            X.2oe r0 = r3.A09     // Catch:{ all -> 0x0a3f }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0a3f }
            r1 = 5
            if (r0 == 0) goto L_0x0a27
            r1 = 4
        L_0x0a27:
            r3.A0G(r1, r2)     // Catch:{ all -> 0x0a3f }
            r0 = 0
            r5.A03(r0)     // Catch:{ all -> 0x0a3f }
            X.2WY r0 = r3.A0D     // Catch:{ all -> 0x0a3f }
            r0.A00(r2)     // Catch:{ all -> 0x0a3f }
        L_0x0a33:
            r3.A0D()     // Catch:{ all -> 0x0a3f }
        L_0x0a36:
            X.08M r0 = r3.A07     // Catch:{ all -> 0x0a3f }
            X.C06270Wx.A05(r0, r4)     // Catch:{ all -> 0x0a3f }
            r3.A03 = r2     // Catch:{ all -> 0x0a3f }
            monitor-exit(r3)
            return
        L_0x0a3f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0a42:
            java.lang.Object r0 = r5.A00
            X.69a r0 = (X.C1235969a) r0
            boolean r3 = r5.A01
            java.lang.Object r4 = r0.A00
            com.whatsapp.settings.SettingsChatHistoryFragment r4 = (com.whatsapp.settings.SettingsChatHistoryFragment) r4
            X.33m r5 = r4.A03
            X.314 r0 = r5.A0R
            java.util.List r0 = r0.A05()
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.HashSet r6 = X.AnonymousClass002.A0K()
            java.util.Iterator r8 = r0.iterator()
        L_0x0a60:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0aa5
            X.4uZ r7 = X.C18300x5.A0P(r8)
            X.2ss r0 = r5.A0i
            int r0 = r0.A03(r7)
            if (r0 <= 0) goto L_0x0a7f
            X.33b r1 = r5.A1T
            r0 = 0
            r1.A09(r7, r0)
            X.3Wi r1 = r5.A02
            r0 = 35
            X.C69263Wi.A0B(r1, r7, r5, r0)
        L_0x0a7f:
            X.3Lo r0 = r5.A0j
            X.3ZH r1 = r0.A01(r7)
            boolean r0 = r1.A0U()
            if (r0 != 0) goto L_0x0a92
            X.2k5 r0 = r1.A0F
            if (r0 != 0) goto L_0x0a92
            r2.add(r1)
        L_0x0a92:
            boolean r0 = r1.A0U()
            if (r0 != 0) goto L_0x0a9b
            r5.A0E(r7)
        L_0x0a9b:
            X.3Gp r0 = r5.A0L
            java.util.Set r0 = r0.A07(r7, r3)
            r6.addAll(r0)
            goto L_0x0a60
        L_0x0aa5:
            X.3Ex r0 = r5.A0M
            r0.A0g(r2)
            X.3Lv r2 = r5.A0l
            java.lang.String r0 = "CoreMessageStore/deleteallmsgs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "msgstore/deleteallmsgs"
            X.33M r8 = X.AnonymousClass33M.A01(r0)
            java.util.Map r0 = r2.A2O
            r0.clear()
            X.3dV r0 = r2.A18
            X.4Fq r11 = r0.A04()
            X.3Yo r10 = r11.Axl()     // Catch:{ all -> 0x0b9e }
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0b94 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x0b94 }
            java.lang.String r1 = "DELETE FROM chat WHERE _id IN  (SELECT c._id FROM chat AS c LEFT JOIN jid AS j ON c.jid_row_id=j._id WHERE j.type != 1)"
            java.lang.String r0 = "DELETE_CHAT_SQL"
            r7.A0H(r1, r0)     // Catch:{ all -> 0x0b94 }
            r2.A0i(r8)     // Catch:{ all -> 0x0b94 }
            X.2ss r1 = r2.A0X     // Catch:{ all -> 0x0b94 }
            monitor-enter(r1)     // Catch:{ all -> 0x0b94 }
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0G()     // Catch:{ all -> 0x0b91 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0b91 }
            monitor-exit(r1)     // Catch:{ all -> 0x0b94 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0b94 }
        L_0x0ae6:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0b94 }
            if (r0 == 0) goto L_0x0b0b
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r9)     // Catch:{ all -> 0x0b94 }
            X.4uZ r7 = X.C18320x8.A0N(r0)     // Catch:{ all -> 0x0b94 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0b94 }
            X.31A r1 = (X.AnonymousClass31A) r1     // Catch:{ all -> 0x0b94 }
            r1.A09()     // Catch:{ all -> 0x0b94 }
            boolean r0 = r7 instanceof X.C27991fJ     // Catch:{ all -> 0x0b94 }
            if (r0 == 0) goto L_0x0ae6
            int r1 = r1.A00     // Catch:{ all -> 0x0b94 }
            r0 = 1
            if (r1 != r0) goto L_0x0ae6
            r0 = 0
            r2.A0r(r7, r0)     // Catch:{ all -> 0x0b94 }
            goto L_0x0ae6
        L_0x0b0b:
            r10.A00()     // Catch:{ all -> 0x0b94 }
            r10.close()     // Catch:{ all -> 0x0b9e }
            java.lang.StringBuilder r1 = X.C18280x3.A0f(r11)
            java.lang.String r0 = "CoreMessageStore/deleteallmsgs time spent:"
            X.AnonymousClass33M.A05(r8, r0, r1)
            X.3Dh r1 = r2.A07
            X.2UN r0 = r1.A08()
            java.io.File r0 = r0.A0P
            X.C627536m.A0P(r0)
            X.2UN r0 = r1.A08()
            java.io.File r0 = r0.A0H
            X.C627536m.A0P(r0)
            if (r3 == 0) goto L_0x0b33
            r2.A0G()
        L_0x0b33:
            X.2hU r0 = r2.A0q
            android.os.Handler r1 = r0.A01
            r0 = 9
            android.os.Message r0 = android.os.Message.obtain(r1, r0)
            r0.sendToTarget()
            X.2sK r3 = r5.A0O
            X.1vB r0 = r3.A03
            X.4Fq r2 = X.C18630y0.A07(r0)
            java.lang.String r0 = "wa_trusted_contacts"
            r1 = 0
            X.AnonymousClass361.A08(r2, r0, r1, r1)     // Catch:{ all -> 0x0b8c }
            java.lang.String r0 = "wa_trusted_contacts_send"
            X.AnonymousClass361.A08(r2, r0, r1, r1)     // Catch:{ all -> 0x0b8c }
            r2.close()
            java.util.Map r0 = r3.A09()
            r0.clear()
            java.util.Map r0 = r3.A08()
            r0.clear()
            X.3Gp r0 = r5.A0L
            r0.A0O(r6)
            X.33o r0 = r5.A1G
            r0.A0E()
            X.3Wi r2 = r5.A02
            X.33b r1 = r5.A1T
            java.util.Objects.requireNonNull(r1)
            r0 = 8
            X.C69263Wi.A00(r2, r1, r0)
            X.2i9 r0 = r5.A0C
            r0.A01()
            X.3Wi r2 = r4.A00
            r0 = 46
            X.3br r1 = new X.3br
            r1.<init>((java.lang.Object) r4, (int) r0)
            goto L_0x0c34
        L_0x0b8c:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0de8 }
            throw r1
        L_0x0b91:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0b94 }
            throw r0     // Catch:{ all -> 0x0b94 }
        L_0x0b94:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0b99 }
            goto L_0x0b9d
        L_0x0b99:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0b9e }
        L_0x0b9d:
            throw r1     // Catch:{ all -> 0x0b9e }
        L_0x0b9e:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0de8 }
            throw r1
        L_0x0ba3:
            java.lang.Object r6 = r5.A00
            com.whatsapp.settings.SettingsChatHistoryFragment r6 = (com.whatsapp.settings.SettingsChatHistoryFragment) r6
            boolean r5 = r5.A01
            X.33m r7 = r6.A03
            X.2sA r4 = r7.A0h
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/archiveall "
            X.C18260x0.A1E(r0, r1, r5)
            r4.A07(r5)
            X.2ss r0 = r4.A00
            java.util.Collection r3 = r0.A0E()
            java.util.Iterator r1 = r3.iterator()
        L_0x0bc4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0bd3
            java.lang.Object r0 = r1.next()
            X.31A r0 = (X.AnonymousClass31A) r0
            r0.A0i = r5
            goto L_0x0bc4
        L_0x0bd3:
            X.8qC r1 = r4.A02
            X.2UO r0 = X.C18310x6.A0Q(r1)
            X.1hu r0 = r0.A0B
            r0.A08()
            X.2UO r0 = X.C18310x6.A0Q(r1)
            X.2m9 r2 = r0.A09
            r0 = 22
            X.5sI r1 = new X.5sI
            r1.<init>(r4, r3, r0, r5)
            r0 = 4
            r2.A01(r1, r0)
            X.3Wi r2 = r7.A02
            X.33b r1 = r7.A1T
            java.util.Objects.requireNonNull(r1)
            r0 = 8
            X.C69263Wi.A00(r2, r1, r0)
            X.1R1 r5 = r7.A1i
            java.util.Set r0 = r5.A0R()
            java.util.HashSet r4 = X.AnonymousClass002.A0K()
            java.util.Iterator r3 = r0.iterator()
        L_0x0c09:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0c21
            X.4uZ r2 = X.C18300x5.A0P(r3)
            X.3Gp r1 = r7.A0L
            r0 = 0
            java.util.Set r0 = r1.A06(r2, r0)
            r4.addAll(r0)
            r5.A0N(r2)
            goto L_0x0c09
        L_0x0c21:
            X.3Gp r0 = r7.A0L
            r0.A0O(r4)
            r0 = 300(0x12c, double:1.48E-321)
            android.os.SystemClock.sleep(r0)
            X.3Wi r2 = r6.A00
            r0 = 45
            X.3br r1 = new X.3br
            r1.<init>((java.lang.Object) r6, (int) r0)
        L_0x0c34:
            r2.A0S(r1)
            return
        L_0x0c38:
            java.lang.Object r4 = r5.A00
            com.whatsapp.registration.ChangeNumberOverview r4 = (com.whatsapp.registration.ChangeNumberOverview) r4
            boolean r3 = r5.A01
            X.9U4 r0 = r4.A06
            if (r0 == 0) goto L_0x0c79
            X.36F r0 = r0.A0A()
            r2 = 1
            java.util.List r0 = r0.A0N(r2)
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0c52
            r2 = 0
        L_0x0c52:
            X.5rC r1 = r4.A03
            if (r1 == 0) goto L_0x0c71
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0c66
            r1.A04()
            java.lang.String r0 = "isMetaVerifiedSubscriptionActive"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0c66:
            X.3Wi r1 = r4.A05
            X.3c2 r0 = new X.3c2
            r0.<init>(r4, r3, r2)
            r1.BkS(r0)
            return
        L_0x0c71:
            java.lang.String r0 = "subscriptionManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0c79:
            java.lang.String r0 = "paymentsManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0c81:
            java.lang.Object r0 = r5.A00
            X.68l r0 = (X.C1234468l) r0
            boolean r2 = r5.A01
            java.lang.Object r0 = r0.A00
            X.5a4 r0 = (X.C106735a4) r0
            X.5OK r1 = r0.A04
            r0 = 0
            r1.A00(r2, r0)
            return
        L_0x0c92:
            java.lang.Object r3 = r5.A00
            X.5a4 r3 = (X.C106735a4) r3
            boolean r1 = r5.A01
            java.io.File r0 = r3.A08
            if (r0 == 0) goto L_0x0cbb
            X.4FS r2 = r3.A0v
            if (r1 == 0) goto L_0x0cb0
            r1 = 30
            X.3bq r0 = new X.3bq
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.BkM(r0)
            X.8sw r0 = r3.A0Y
            r0.BbC()
            return
        L_0x0cb0:
            r1 = 31
            X.3bq r0 = new X.3bq
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.BkM(r0)
            return
        L_0x0cbb:
            java.lang.String r0 = "ptvcameraui/video file doesn't exist"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0cc2:
            java.lang.Object r4 = r5.A00
            X.2UP r4 = (X.AnonymousClass2UP) r4
            boolean r3 = r5.A01
            X.2m9 r2 = r4.A0C
            r0 = 4
            X.3bz r1 = new X.3bz
            r1.<init>(r0, r4, r3)
            r0 = 14
            r2.A02(r1, r0)
            return
        L_0x0cd6:
            java.lang.Object r1 = r5.A00
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel r1 = (com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel) r1
            boolean r0 = r5.A01
            com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel.A03(r1, r0)
            return
        L_0x0ce0:
            X.3Wi r2 = r3.A01
            r0 = 2131889501(0x7f120d5d, float:1.9413667E38)
            r1 = 0
            r2.A0H(r0, r1)
            X.5U7 r0 = r3.A0B
            r0.A02(r3)
            r3.A02 = r1
            return
        L_0x0cf1:
            java.util.ArrayList r3 = X.C18320x8.A0o(r6)
            r3.addAll(r4)
            int r0 = r3.size()
            if (r0 <= r1) goto L_0x0d77
            r0 = 0
        L_0x0cff:
            java.lang.Object r10 = r3.get(r12)
            X.4uZ r10 = (X.C95814uZ) r10
            int r1 = r3.size()
            r9 = 1
            r13 = 2
            if (r1 < r13) goto L_0x0d4c
            X.3Ex r2 = r7.A04
            java.lang.Object r1 = r3.get(r12)
            X.4uZ r1 = (X.C95814uZ) r1
            X.3ZH r14 = r2.A09(r1)
            java.lang.Object r1 = r3.get(r9)
            X.4uZ r1 = (X.C95814uZ) r1
            X.3ZH r8 = r2.A09(r1)
            if (r14 == 0) goto L_0x0d75
            if (r8 == 0) goto L_0x0d75
            int r1 = r3.size()
            r3 = 3
            X.33j r6 = r7.A0C
            r5 = 2131755379(0x7f100173, float:1.9141636E38)
            if (r1 != r13) goto L_0x0d36
            r5 = 2131755381(0x7f100175, float:1.914164E38)
        L_0x0d36:
            long r1 = (long) r11
            java.lang.Object[] r4 = new java.lang.Object[r3]
            X.AnonymousClass000.A1P(r4, r11, r12)
            X.5ZU r3 = r7.A05
            X.C18300x5.A1E(r3, r14, r4, r9)
            X.C18300x5.A1E(r3, r8, r4, r13)
            java.lang.String r1 = r6.A0L(r4, r5, r1)
        L_0x0d48:
            r7.A02(r0, r10, r1)
            return
        L_0x0d4c:
            int r1 = r3.size()
            if (r1 != r9) goto L_0x0d75
            X.3Ex r2 = r7.A04
            java.lang.Object r1 = r3.get(r12)
            X.4uZ r1 = (X.C95814uZ) r1
            X.3ZH r8 = r2.A09(r1)
            if (r8 == 0) goto L_0x0d75
            X.33j r6 = r7.A0C
            r5 = 2131755380(0x7f100174, float:1.9141638E38)
            long r3 = (long) r11
            java.lang.Object[] r2 = new java.lang.Object[r13]
            X.AnonymousClass000.A1P(r2, r11, r12)
            X.5ZU r1 = r7.A05
            X.C18300x5.A1E(r1, r8, r2, r9)
            java.lang.String r1 = r6.A0L(r2, r5, r3)
            goto L_0x0d48
        L_0x0d75:
            r1 = 0
            goto L_0x0d48
        L_0x0d77:
            java.lang.Object r0 = r3.get(r12)
            X.4uZ r0 = (X.C95814uZ) r0
            goto L_0x0cff
        L_0x0d7e:
            r1 = move-exception
            if (r3 == 0) goto L_0x0dbd
            r3.close()     // Catch:{ all -> 0x0db9 }
            goto L_0x0dbd
        L_0x0d85:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0d8a }
            goto L_0x0da2
        L_0x0d8a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0dd7 }
            goto L_0x0da2
        L_0x0d8f:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0d94 }
            goto L_0x0d98
        L_0x0d94:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0d99 }
        L_0x0d98:
            throw r1     // Catch:{ all -> 0x0d99 }
        L_0x0d99:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0d9e }
            goto L_0x0da2
        L_0x0d9e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0dd7 }
        L_0x0da2:
            throw r1     // Catch:{ all -> 0x0dd7 }
        L_0x0da3:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0da8 }
            goto L_0x0dac
        L_0x0da8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0dad }
        L_0x0dac:
            throw r1     // Catch:{ all -> 0x0dad }
        L_0x0dad:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0de8 }
            throw r1
        L_0x0db2:
            r1 = move-exception
            if (r2 == 0) goto L_0x0dbd
            r2.close()     // Catch:{ all -> 0x0db9 }
            goto L_0x0dbd
        L_0x0db9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0dbe }
        L_0x0dbd:
            throw r1     // Catch:{ all -> 0x0dbe }
        L_0x0dbe:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0de8 }
            throw r1
        L_0x0dc3:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0dc3 }
            throw r0
        L_0x0dc6:
            java.lang.String r0 = "DelayedStanzasManager/pullDelayedNotifications pulling now"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4C6 r2 = r5.A02
            r1 = 0
            com.whatsapp.messaging.offline.DelayedStanzasFetcher$pullDelayedNotifications$1 r0 = new com.whatsapp.messaging.offline.DelayedStanzasFetcher$pullDelayedNotifications$1
            r0.<init>(r5, r3, r1)
            X.C616131n.A02(r1, r0, r2, r1, r4)
            return
        L_0x0dd7:
            r1 = move-exception
            if (r4 == 0) goto L_0x0de2
            r4.close()     // Catch:{ all -> 0x0dde }
            goto L_0x0de2
        L_0x0dde:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0de3 }
        L_0x0de2:
            throw r1     // Catch:{ all -> 0x0de3 }
        L_0x0de3:
            r1 = move-exception
            r26.close()     // Catch:{ all -> 0x0de8 }
            throw r1
        L_0x0de8:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0ded:
            r1 = move-exception
            if (r7 == 0) goto L_0x0df8
            r7.close()     // Catch:{ all -> 0x0df4 }
            goto L_0x0df8
        L_0x0df4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0df9 }
        L_0x0df8:
            throw r1     // Catch:{ all -> 0x0df9 }
        L_0x0df9:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0dfe }
            goto L_0x0e02
        L_0x0dfe:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0e03 }
        L_0x0e02:
            throw r1     // Catch:{ all -> 0x0e03 }
        L_0x0e03:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0e03 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71363bz.run():void");
    }

    public static int A00(Object obj, AbstractMap abstractMap) {
        Integer num = (Integer) abstractMap.get(obj);
        C626936e.A06(num);
        return num.intValue();
    }

    public C71363bz(AnonymousClass11I r2, boolean z) {
        this.A02 = 0;
        this.A00 = r2;
        this.A01 = z;
    }
}
