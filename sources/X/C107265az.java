package X;

/* renamed from: X.5az  reason: invalid class name and case insensitive filesystem */
public class C107265az implements C1225064q {
    public Object A00;
    public final int A01;

    public C107265az(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009e, code lost:
        r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a1, code lost:
        r5.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a5, code lost:
        r5 = (X.AnonymousClass5XG) r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ab, code lost:
        if (r2 != X.AnonymousClass58T.ERROR_AUTH_NOT_SETUP) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ad, code lost:
        r2 = r5.A08;
        r1 = X.C111095hX.A02(r5.A03);
        X.C162457s7.A0K(r1, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
        r2.A0C((X.C89644eZ) r1, r5.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c1, code lost:
        r2 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c3, code lost:
        if (r2 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c5, code lost:
        r0 = r5.A08;
        r2.setChecked(r0.A03.A0P(r5.A0B));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BaI(X.AnonymousClass5S5 r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x002f;
                case 1: goto L_0x007b;
                case 2: goto L_0x0056;
                case 3: goto L_0x00d3;
                case 4: goto L_0x0109;
                case 5: goto L_0x01a5;
                case 6: goto L_0x0208;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r8.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.58T r1 = r9.A02
            X.58T r0 = X.AnonymousClass58T.SUCCESS
            if (r1 != r0) goto L_0x002e
            r1 = 1
            r3.A2E = r1
            X.5aW r0 = r3.A0F
            r0.A01 = r1
            X.5UK r2 = r3.A0G
            r1 = 4
            r0 = 0
            r2.A01(r1, r0)
            X.3ZH r0 = r3.A1A
            X.2sj r2 = r3.A0O
            X.1fJ r1 = r3.A1h
            X.4uZ r0 = r0.A0H
            X.08M r1 = r2.A03(r0, r1)
            r0 = 244(0xf4, float:3.42E-43)
            X.AnonymousClass6C6.A01(r3, r1, r0)
        L_0x002e:
            return
        L_0x002f:
            java.lang.Object r3 = r8.A00
            com.whatsapp.calling.callhistory.CallLogActivity r3 = (com.whatsapp.calling.callhistory.CallLogActivity) r3
            X.58T r1 = r9.A02
            X.58T r0 = X.AnonymousClass58T.SUCCESS
            if (r1 == r0) goto L_0x0273
            X.58T r0 = X.AnonymousClass58T.ERROR_AUTH_NOT_SETUP
            if (r1 != r0) goto L_0x002e
            X.5aW r1 = r3.A0G
            r0 = 0
            X.663 r0 = r1.A05(r0)
            r0.Aya()
            X.5aW r2 = r3.A0G
            X.3ZH r0 = r3.A0V
            X.4uZ r1 = r0.A0H
            X.5k1 r0 = new X.5k1
            r0.<init>(r3)
            r2.A0B(r3, r9, r0, r1)
            return
        L_0x0056:
            r6 = 0
            X.58T r2 = r9.A02
            X.58T r0 = X.AnonymousClass58T.SUCCESS
            if (r2 != r0) goto L_0x00a5
            java.lang.Object r5 = r8.A00
            X.5XG r5 = (X.AnonymousClass5XG) r5
            X.5aW r1 = r5.A08
            r0 = 1
            r1.A01 = r0
            X.4uZ r4 = r5.A0B
            r1.A0D(r4, r0)
            X.5UK r3 = r5.A09
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1 = 0
            r0 = 5
            r3.A04(r4, r2, r1, r0)
            X.5Ps r1 = r3.A00
            java.lang.String r0 = "new_add_chat_count"
            goto L_0x009e
        L_0x007b:
            r1 = 0
            X.58T r2 = r9.A02
            int r0 = r2.ordinal()
            if (r0 != r1) goto L_0x00a5
            java.lang.Object r5 = r8.A00
            X.5XG r5 = (X.AnonymousClass5XG) r5
            X.5aW r0 = r5.A08
            X.4uZ r4 = r5.A0B
            r0.A0D(r4, r1)
            X.5UK r3 = r5.A09
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 0
            r0 = 6
            r3.A04(r4, r2, r1, r0)
            X.5Ps r1 = r3.A00
            java.lang.String r0 = "new_remove_chat_count"
        L_0x009e:
            r1.A00(r0)
        L_0x00a1:
            r5.A00()
            return
        L_0x00a5:
            java.lang.Object r5 = r8.A00
            X.5XG r5 = (X.AnonymousClass5XG) r5
            X.58T r0 = X.AnonymousClass58T.ERROR_AUTH_NOT_SETUP
            if (r2 != r0) goto L_0x00c1
            X.5aW r2 = r5.A08
            android.content.Context r0 = r5.A03
            android.app.Activity r1 = X.C111095hX.A02(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaBaseActivity"
            X.C162457s7.A0K(r1, r0)
            X.4eZ r1 = (X.C89644eZ) r1
            X.4uZ r0 = r5.A0B
            r2.A0C(r1, r0)
        L_0x00c1:
            androidx.appcompat.widget.SwitchCompat r2 = r5.A02
            if (r2 == 0) goto L_0x00a1
            X.5aW r0 = r5.A08
            X.4uZ r1 = r5.A0B
            X.2ss r0 = r0.A03
            boolean r0 = r0.A0P(r1)
            r2.setChecked(r0)
            goto L_0x00a1
        L_0x00d3:
            r2 = 0
            X.58T r1 = r9.A02
            X.58T r0 = X.AnonymousClass58T.SUCCESS
            if (r1 == r0) goto L_0x00e7
            java.lang.Object r0 = r8.A00
            com.whatsapp.chatlock.ChatLockAuthActivity r0 = (com.whatsapp.chatlock.ChatLockAuthActivity) r0
            com.whatsapp.chatlock.ChatLockAuthViewModel r1 = X.AnonymousClass4SG.A2g(r0)
            r0 = 1
            r1.A0D(r0)
            return
        L_0x00e7:
            java.lang.Object r1 = r8.A00
            com.whatsapp.chatlock.ChatLockAuthActivity r1 = (com.whatsapp.chatlock.ChatLockAuthActivity) r1
            com.whatsapp.chatlock.ChatLockAuthViewModel r0 = X.AnonymousClass4SG.A2g(r1)
            r0.A0D(r2)
            r0 = 6
            r1.A76(r0)
            X.5UK r0 = r1.A03
            if (r0 == 0) goto L_0x0102
            X.5Ps r1 = r0.A00
            java.lang.String r0 = "new_remove_chat_count"
            r1.A00(r0)
            return
        L_0x0102:
            java.lang.String r0 = "chatLockLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0109:
            r2 = 0
            X.58T r0 = r9.A02
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x0166
            r0 = 4
            if (r1 == r0) goto L_0x015a
            r0 = 3
            if (r1 == r0) goto L_0x015a
            r0 = 2
            java.lang.Object r3 = r8.A00
            com.whatsapp.chatlock.ChatLockAuthActivity r3 = (com.whatsapp.chatlock.ChatLockAuthActivity) r3
            if (r1 == r0) goto L_0x012f
            com.whatsapp.chatlock.ChatLockAuthViewModel r0 = X.AnonymousClass4SG.A2g(r3)
            r0.A0D(r2)
            X.3Wi r1 = r3.A05
            r0 = 2131893926(0x7f121ea6, float:1.9422642E38)
            r1.A0H(r0, r2)
            return
        L_0x012f:
            X.66R r2 = r3.A0A
            java.lang.Object r1 = r2.getValue()
            com.whatsapp.chatlock.ChatLockAuthViewModel r1 = (com.whatsapp.chatlock.ChatLockAuthViewModel) r1
            r0 = 0
            r1.A0D(r0)
            X.5aW r1 = r3.A02
            if (r1 == 0) goto L_0x0153
            java.lang.Object r0 = r2.getValue()
            com.whatsapp.chatlock.ChatLockAuthViewModel r0 = (com.whatsapp.chatlock.ChatLockAuthViewModel) r0
            X.31A r0 = r0.A00
            if (r0 == 0) goto L_0x0151
            X.4uZ r0 = r0.A05()
        L_0x014d:
            r1.A0C(r3, r0)
            return
        L_0x0151:
            r0 = 0
            goto L_0x014d
        L_0x0153:
            java.lang.String r0 = "chatLockManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x015a:
            java.lang.Object r0 = r8.A00
            com.whatsapp.chatlock.ChatLockAuthActivity r0 = (com.whatsapp.chatlock.ChatLockAuthActivity) r0
            com.whatsapp.chatlock.ChatLockAuthViewModel r0 = X.AnonymousClass4SG.A2g(r0)
            r0.A0D(r2)
            return
        L_0x0166:
            java.lang.Object r3 = r8.A00
            com.whatsapp.chatlock.ChatLockAuthActivity r3 = (com.whatsapp.chatlock.ChatLockAuthActivity) r3
            X.5aW r0 = r3.A02
            if (r0 == 0) goto L_0x019e
            X.2ss r0 = r0.A03
            java.util.HashSet r0 = r0.A03
            boolean r0 = X.AnonymousClass0x7.A1S(r0)
            if (r0 != 0) goto L_0x0191
            X.0df r2 = r3.getSupportFragmentManager()
            r0 = 3
            X.5bK r1 = new X.5bK
            r1.<init>(r3, r0)
            java.lang.String r0 = "ChatNowLockedDialogFragment_request_key"
            r2.A0j(r1, r3, r0)
            com.whatsapp.chatlock.ChatNowLockedDialogFragment r1 = new com.whatsapp.chatlock.ChatNowLockedDialogFragment
            r1.<init>()
            r0 = 0
            r3.Bon(r1, r0)
            return
        L_0x0191:
            com.whatsapp.chatlock.ChatLockAuthViewModel r1 = X.AnonymousClass4SG.A2g(r3)
            r0 = 1
            r1.A0D(r0)
            r0 = 5
            r3.A76(r0)
            return
        L_0x019e:
            java.lang.String r0 = "chatLockManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01a5:
            java.lang.Object r6 = r8.A00
            com.whatsapp.conversationslist.ConversationsFragment r6 = (com.whatsapp.conversationslist.ConversationsFragment) r6
            X.58T r1 = r9.A02
            X.58T r0 = X.AnonymousClass58T.SUCCESS
            r7 = 0
            if (r1 == r0) goto L_0x01d0
            X.58T r0 = X.AnonymousClass58T.ERROR_AUTH_NOT_SETUP
            if (r1 != r0) goto L_0x01c5
            X.5aW r2 = X.C86624Kv.A0O(r6)
            X.03q r1 = r6.A0Q()
            X.4eZ r1 = (X.C89644eZ) r1
            X.4uZ r0 = r6.A1O()
            r2.A0C(r1, r0)
        L_0x01c5:
            X.5aW r0 = X.C86624Kv.A0O(r6)
            r0.A00 = r7
            r0 = 2
            r6.A1b(r0)
            return
        L_0x01d0:
            java.util.LinkedHashSet r0 = r6.A33
            java.util.Iterator r5 = r0.iterator()
        L_0x01d6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01c5
            X.4uZ r4 = X.C18300x5.A0P(r5)
            X.5aW r0 = X.C86624Kv.A0O(r6)
            r0.A0D(r4, r7)
            X.8qC r0 = r6.A30
            java.lang.Object r3 = r0.get()
            X.5UK r3 = (X.AnonymousClass5UK) r3
            java.lang.Integer r2 = X.AnonymousClass001.A0f()
            r1 = 0
            r0 = 6
            r3.A04(r4, r2, r1, r0)
            X.8qC r0 = r6.A30
            java.lang.Object r0 = r0.get()
            X.5UK r0 = (X.AnonymousClass5UK) r0
            X.5Ps r1 = r0.A00
            java.lang.String r0 = "new_remove_chat_count"
            r1.A00(r0)
            goto L_0x01d6
        L_0x0208:
            java.lang.Object r3 = r8.A00
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.58T r1 = r9.A02
            X.58T r0 = X.AnonymousClass58T.SUCCESS
            r4 = 1
            if (r1 != r0) goto L_0x024b
            java.util.LinkedHashSet r0 = r3.A33
            java.util.Iterator r7 = r0.iterator()
        L_0x0219:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0260
            X.4uZ r6 = X.C18300x5.A0P(r7)
            X.5aW r0 = X.C86624Kv.A0O(r3)
            r0.A0D(r6, r4)
            X.8qC r0 = r3.A30
            java.lang.Object r5 = r0.get()
            X.5UK r5 = (X.AnonymousClass5UK) r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1 = 0
            r0 = 5
            r5.A04(r6, r2, r1, r0)
            X.8qC r0 = r3.A30
            java.lang.Object r0 = r0.get()
            X.5UK r0 = (X.AnonymousClass5UK) r0
            X.5Ps r1 = r0.A00
            java.lang.String r0 = "new_add_chat_count"
            r1.A00(r0)
            goto L_0x0219
        L_0x024b:
            X.58T r0 = X.AnonymousClass58T.ERROR_AUTH_NOT_SETUP
            if (r1 != r0) goto L_0x0260
            X.5aW r2 = X.C86624Kv.A0O(r3)
            X.03q r1 = r3.A0Q()
            X.4eZ r1 = (X.C89644eZ) r1
            X.4uZ r0 = r3.A1O()
            r2.A0C(r1, r0)
        L_0x0260:
            boolean r0 = r3.A3D
            r1 = 0
            if (r0 != 0) goto L_0x0268
            r3.A1m(r1, r4)
        L_0x0268:
            X.5aW r0 = X.C86624Kv.A0O(r3)
            r0.A00 = r1
            r0 = 2
            r3.A1b(r0)
            return
        L_0x0273:
            X.5aW r0 = r3.A0G
            r2 = 1
            r0.A01 = r2
            r3.A0g = r2
            X.5UK r1 = r3.A0H
            r0 = 4
            r1.A01(r0, r2)
            r3.A74()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107265az.BaI(X.5S5):void");
    }
}
