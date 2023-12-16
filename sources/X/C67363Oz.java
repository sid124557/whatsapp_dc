package X;

/* renamed from: X.3Oz  reason: invalid class name and case insensitive filesystem */
public class C67363Oz implements C85314Ft {
    public final C69263Wi A00;
    public final C66543Lv A01;
    public final C56892sj A02;
    public final C72303dV A03;
    public final C61152zn A04;
    public final C54572ow A05;
    public final C50932j0 A06;
    public final AnonymousClass33S A07;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (((X.C31891p1) r8).A00 == 1) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r1 == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        if (r1 == 13) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BEz(X.C624134x r8, int r9) {
        /*
            r7 = this;
            r3 = 1
            if (r9 == r3) goto L_0x0109
            r0 = 2
            if (r9 == r0) goto L_0x00f1
            r0 = 4
            if (r9 == r0) goto L_0x00ee
            r0 = 7
            if (r9 == r0) goto L_0x0068
            r0 = 8
            if (r9 == r0) goto L_0x0064
            r0 = 3018(0xbca, float:4.229E-42)
            if (r9 == r0) goto L_0x0060
            r0 = 3019(0xbcb, float:4.23E-42)
            if (r9 == r0) goto L_0x005c
            switch(r9) {
                case 3009: goto L_0x00f4;
                case 3010: goto L_0x0042;
                case 3011: goto L_0x003e;
                case 3012: goto L_0x00fe;
                case 3013: goto L_0x003a;
                case 3014: goto L_0x010e;
                case 3015: goto L_0x0036;
                case 3016: goto L_0x002a;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unhandled action "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r9)
            java.lang.RuntimeException r1 = X.AnonymousClass002.A0E(r0)
            throw r1
        L_0x002a:
            java.lang.String r0 = "groupactionhandler/handle community description updated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Lv r0 = r7.A01
            r0.A0Y(r8)
            goto L_0x00fe
        L_0x0036:
            java.lang.String r0 = "groupactionhandler/handle community description change"
            goto L_0x00f6
        L_0x003a:
            java.lang.String r0 = "groupactionhandler/handle_group_linked_with_membership_approval_mode"
            goto L_0x00f6
        L_0x003e:
            java.lang.String r0 = "groupactionhandler/sibling_link"
            goto L_0x00f6
        L_0x0042:
            java.lang.String r0 = "groupactionhandler/community_link_change"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r2 = r8 instanceof X.C31631ob
            boolean r1 = r8 instanceof X.C31661oe
            if (r1 == 0) goto L_0x0056
            r0 = r8
            X.1p1 r0 = (X.C31891p1) r0
            int r0 = r0.A00
            if (r0 != r3) goto L_0x0056
            goto L_0x00f9
        L_0x0056:
            if (r2 != 0) goto L_0x00fe
            if (r1 != 0) goto L_0x00fe
            goto L_0x00f9
        L_0x005c:
            java.lang.String r0 = "groupactionhandler/handle history setting update"
            goto L_0x00f6
        L_0x0060:
            java.lang.String r0 = "groupactionhandler/handle subgroup suggestion created"
            goto L_0x00f6
        L_0x0064:
            java.lang.String r0 = "groupactionhandler/handle_growth_lock_change"
            goto L_0x00f6
        L_0x0068:
            java.lang.String r0 = "groupactionhandler/handle_user_remove"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6 = r8
            X.1p1 r6 = (X.C31891p1) r6
            X.2z0 r0 = r6.A1J
            X.4uZ r0 = r0.A00
            com.whatsapp.jid.GroupJid r5 = X.AnonymousClass32V.A00(r0)
            X.C626936e.A06(r5)
            int r1 = r6.A00
            r0 = 5
            if (r1 == r0) goto L_0x0085
            r0 = 13
            r3 = 0
            if (r1 != r0) goto L_0x0086
        L_0x0085:
            r3 = 1
        L_0x0086:
            X.2zn r0 = r7.A04
            X.1VX r2 = r0.A02
            r0 = 1613(0x64d, float:2.26E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 1527(0x5f7, float:2.14E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x00e8
            if (r3 == 0) goto L_0x00e8
            X.2sj r4 = r7.A02
            boolean r0 = r4.A0D(r5)
            if (r0 != 0) goto L_0x00e8
            java.lang.String r0 = "groupactionhandler/handle_user_remove/silent exit"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.3dV r0 = r7.A03
            X.4Fq r3 = r0.A04()
            X.3Yo r2 = r3.Axl()     // Catch:{ all -> 0x00de }
            r4.A0A(r6)     // Catch:{ all -> 0x00d4 }
            X.2ow r1 = r7.A05     // Catch:{ all -> 0x00d4 }
            boolean r0 = r4.A0C(r5)     // Catch:{ all -> 0x00d4 }
            r1.A00(r3, r5, r0)     // Catch:{ all -> 0x00d4 }
            r2.A00()     // Catch:{ all -> 0x00d4 }
            r2.close()     // Catch:{ all -> 0x00de }
            r3.close()
            X.39T r1 = r6.A04
            if (r1 == 0) goto L_0x00fe
            X.33S r0 = r7.A07
            r0.A01(r1)
            goto L_0x00fe
        L_0x00d4:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00d9 }
            goto L_0x00dd
        L_0x00d9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00de }
        L_0x00dd:
            throw r1     // Catch:{ all -> 0x00de }
        L_0x00de:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00e3 }
            throw r1
        L_0x00e3:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00e8:
            java.lang.String r0 = "groupactionhandler/handle_user_remove/remove with system message"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            goto L_0x00f9
        L_0x00ee:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle_groupchat_subject_change"
            goto L_0x00f6
        L_0x00f1:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle_add_groupchat_msg"
            goto L_0x00f6
        L_0x00f4:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle groupchat announcements only change"
        L_0x00f6:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00f9:
            X.3Lv r0 = r7.A01
            r0.A0V(r8)
        L_0x00fe:
            X.2z0 r0 = r8.A1J
            X.4uZ r2 = r0.A00
            X.3Wi r1 = r7.A00
            r0 = 2
            X.C69263Wi.A04(r1, r7, r2, r0)
            return
        L_0x0109:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle-init-group-chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x010e:
            X.3Lv r0 = r7.A01
            r0.A0V(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67363Oz.BEz(X.34x, int):void");
    }

    public C67363Oz(C69263Wi r1, C66543Lv r2, C56892sj r3, C72303dV r4, C61152zn r5, C54572ow r6, C50932j0 r7, AnonymousClass33S r8) {
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
    }
}
