package com.whatsapp.community.iq;

import X.AnonymousClass31C;
import java.util.concurrent.TimeUnit;

public final class GetSuggestedGroupsProtocolHelper {
    public final AnonymousClass31C A00;

    static {
        TimeUnit.SECONDS.toMillis(30);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bc, code lost:
        if (r0 != r3) goto L_0x020d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass7SH r23, X.C27991fJ r24, X.C27991fJ r25, X.C84814Du r26) {
        /*
            r22 = this;
            r5 = r26
            r12 = r24
            r1 = r23
            boolean r0 = r5 instanceof X.AnonymousClass8UZ
            r11 = r22
            if (r0 == 0) goto L_0x0037
            r0 = r5
            X.8UZ r0 = (X.AnonymousClass8UZ) r0
            int r4 = r0.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0037
            int r4 = r4 - r3
            r0.label = r4
        L_0x001a:
            java.lang.Object r10 = r0.result
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r8 = r0.label
            r6 = 5
            r4 = 4
            r9 = 3
            r5 = 2
            r7 = 1
            r2 = 0
            if (r8 == 0) goto L_0x0049
            if (r8 == r7) goto L_0x0088
            if (r8 == r5) goto L_0x020a
            if (r8 == r9) goto L_0x003d
            if (r8 == r4) goto L_0x020a
            if (r8 == r6) goto L_0x020a
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0037:
            X.8UZ r0 = new X.8UZ
            r0.<init>(r11, r5)
            goto L_0x001a
        L_0x003d:
            java.lang.Object r1 = r0.L$0
            X.7SH r1 = (X.AnonymousClass7SH) r1
            X.C57682u2.A01(r10)     // Catch:{ 24Y -> 0x0046 }
            goto L_0x020d
        L_0x0046:
            r4 = move-exception
            goto L_0x0131
        L_0x0049:
            X.C57682u2.A01(r10)
            X.31C r10 = r11.A00
            java.lang.String r4 = r10.A03()
            X.1wn r11 = new X.1wn
            r2 = r25
            r11.<init>(r2, r7)
            r2 = 7
            X.1wm r8 = new X.1wm
            r8.<init>((java.lang.String) r4, (int) r2)
            X.1ww r2 = new X.1ww
            r2.<init>(r12, r8)
            X.1xK r8 = new X.1xK
            r8.<init>((X.C35481ww) r2, (X.C35391wn) r11)
            X.36K r2 = r8.A00
            X.C162457s7.A0D(r2)
            r0.L$0 = r12
            r0.L$1 = r1
            r0.L$2 = r8
            r0.label = r7
            r17 = 403(0x193, float:5.65E-43)
            r18 = 32000(0x7d00, double:1.581E-319)
            r20 = 0
            r13 = r10
            r14 = r2
            r15 = r4
            r16 = r0
            java.lang.Object r10 = r13.A02(r14, r15, r16, r17, r18, r20)
            if (r10 != r3) goto L_0x0097
            return r3
        L_0x0088:
            java.lang.Object r8 = r0.L$2
            X.1xK r8 = (X.C35721xK) r8
            java.lang.Object r1 = r0.L$1
            X.7SH r1 = (X.AnonymousClass7SH) r1
            java.lang.Object r12 = r0.L$0
            X.1fJ r12 = (X.C27991fJ) r12
            X.C57682u2.A01(r10)
        L_0x0097:
            X.5BH r10 = (X.AnonymousClass5BH) r10
            X.4vj r2 = X.C96054vj.A00
            boolean r4 = X.C162457s7.A0P(r10, r2)
            r2 = 0
            if (r4 == 0) goto L_0x00bf
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r5
        L_0x00aa:
            r4 = 0
            java.lang.String r2 = "MemberSuggestedGroupsManager/fetchSuggestedGroups error"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r2 = r1.A00
            X.1fJ r1 = r1.A01
            java.lang.Object r0 = r2.A02(r1, r0, r4)
        L_0x00b8:
            if (r0 == r3) goto L_0x00be
            X.2wD r0 = X.C59022wD.A00
        L_0x00bc:
            if (r0 != r3) goto L_0x020d
        L_0x00be:
            return r3
        L_0x00bf:
            boolean r4 = r10 instanceof X.C96034vh
            if (r4 == 0) goto L_0x013f
            X.4vh r10 = (X.C96034vh) r10     // Catch:{ 24Y -> 0x0130 }
            X.36K r6 = r10.A00     // Catch:{ 24Y -> 0x0130 }
            r4 = 7
            X.6sb r5 = new X.6sb     // Catch:{ 24Y -> 0x0130 }
            r5.<init>((X.AnonymousClass36K) r6, (X.C35721xK) r8, (int) r4)     // Catch:{ 24Y -> 0x0130 }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x0130 }
            java.lang.String r4 = "Fetching subgroup suggestions failed: "
            r6.append(r4)     // Catch:{ 24Y -> 0x0130 }
            java.lang.Object r8 = r5.A00     // Catch:{ 24Y -> 0x0130 }
            X.8q3 r8 = (X.C183448q3) r8     // Catch:{ 24Y -> 0x0130 }
            java.lang.Long r4 = r8.B5b()     // Catch:{ 24Y -> 0x0130 }
            long r4 = r4.longValue()     // Catch:{ 24Y -> 0x0130 }
            X.C18260x0.A1I(r6, r4)     // Catch:{ 24Y -> 0x0130 }
            r0.L$0 = r1     // Catch:{ 24Y -> 0x0130 }
            r0.L$1 = r2     // Catch:{ 24Y -> 0x0130 }
            r0.L$2 = r2     // Catch:{ 24Y -> 0x0130 }
            r0.label = r9     // Catch:{ 24Y -> 0x0130 }
            r6 = 0
            boolean r5 = r8 instanceof X.C139266rm     // Catch:{ 24Y -> 0x0130 }
            if (r5 == 0) goto L_0x0110
            r4 = r8
            X.6rm r4 = (X.C139266rm) r4     // Catch:{ 24Y -> 0x0130 }
            int r4 = r4.A00     // Catch:{ 24Y -> 0x0130 }
            if (r4 != r6) goto L_0x0110
        L_0x00f9:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r7 = r1.A00     // Catch:{ 24Y -> 0x0130 }
            X.1fJ r5 = r1.A01     // Catch:{ 24Y -> 0x0130 }
            X.3d3 r4 = X.C72023d3.A00     // Catch:{ 24Y -> 0x0130 }
            r7.A06(r5, r4)     // Catch:{ 24Y -> 0x0130 }
        L_0x0102:
            java.lang.String r4 = "MemberSuggestedGroupsManager/fetchSuggestedGroups error"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ 24Y -> 0x0130 }
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r5 = r1.A00     // Catch:{ 24Y -> 0x0130 }
            X.1fJ r4 = r1.A01     // Catch:{ 24Y -> 0x0130 }
            java.lang.Object r4 = r5.A02(r4, r0, r6)     // Catch:{ 24Y -> 0x0130 }
            goto L_0x012b
        L_0x0110:
            boolean r4 = r8 instanceof X.C139366rw     // Catch:{ 24Y -> 0x0130 }
            if (r4 != 0) goto L_0x00f9
            boolean r4 = r8 instanceof X.C139356rv     // Catch:{ 24Y -> 0x0130 }
            if (r4 != 0) goto L_0x00f9
            boolean r4 = r8 instanceof X.C139376rx     // Catch:{ 24Y -> 0x0130 }
            if (r4 != 0) goto L_0x00f9
            if (r5 == 0) goto L_0x0125
            X.6rm r8 = (X.C139266rm) r8     // Catch:{ 24Y -> 0x0130 }
            int r4 = r8.A00     // Catch:{ 24Y -> 0x0130 }
            if (r4 != r7) goto L_0x0125
            goto L_0x0102
        L_0x0125:
            java.lang.String r4 = "MemberSuggestedGroupsManager/fetchSuggestedGroups/unknown error"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ 24Y -> 0x0130 }
            goto L_0x0102
        L_0x012b:
            if (r4 == r3) goto L_0x00be
            X.2wD r0 = X.C59022wD.A00     // Catch:{ 24Y -> 0x0130 }
            goto L_0x00bc
        L_0x0130:
            r4 = move-exception
        L_0x0131:
            com.whatsapp.util.Log.e((java.lang.Throwable) r4)
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r2 = 4
            r0.label = r2
            goto L_0x00aa
        L_0x013f:
            boolean r4 = r10 instanceof X.C96044vi
            if (r4 == 0) goto L_0x020d
            X.4vi r10 = (X.C96044vi) r10
            X.36K r13 = r10.A00
            X.36K r8 = X.C41032Ir.A02(r13, r8)
            r4 = 152(0x98, float:2.13E-43)
            X.92a r5 = X.C1896292a.A00(r4)
            java.lang.String r4 = "sub_group_suggestions"
            java.lang.Object r7 = X.AnonymousClass6C8.A0b(r13, r5, r4)
            X.6r4 r7 = (X.C138826r4) r7
            r5 = 26
            boolean r5 = X.AnonymousClass92Z.A03(r8, r13, r5)
            java.lang.String r8 = "sub_group_suggestion"
            java.lang.String[] r15 = new java.lang.String[]{r4, r8}
            r8 = 153(0x99, float:2.14E-43)
            X.92a r14 = X.C1896292a.A00(r8)
            r16 = 0
            r18 = 1000(0x3e8, double:4.94E-321)
            java.util.List r9 = X.C626836d.A0B(r13, r14, r15, r16, r18)
            java.lang.String[] r8 = new java.lang.String[]{r4}
            r4 = 154(0x9a, float:2.16E-43)
            java.util.List r4 = X.C1896292a.A0N(r13, r8, r4)
            r4.get(r5)
            java.lang.String r5 = r7.A00
            X.C162457s7.A0D(r5)
            java.util.ArrayList r4 = X.C73783g4.A0c(r9)
            java.util.Iterator r10 = r9.iterator()
        L_0x018d:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x01ed
            java.lang.Object r8 = r10.next()
            X.6qx r8 = (X.C138766qx) r8
            X.6qj r7 = r8.A01
            if (r7 == 0) goto L_0x01ea
            java.lang.Object r7 = r7.A00
            java.lang.Number r7 = (java.lang.Number) r7
            if (r7 == 0) goto L_0x01ea
            long r19 = r7.longValue()
        L_0x01a7:
            X.6r5 r7 = r8.A03
            if (r7 == 0) goto L_0x01e8
            java.lang.String r9 = r7.A00
        L_0x01ad:
            java.lang.String r7 = "true"
            boolean r21 = X.C162457s7.A0P(r9, r7)
            X.6rH r9 = r8.A02
            java.lang.Object r7 = r9.A01
            X.6qn r7 = (X.C138666qn) r7
            java.lang.Object r13 = r7.A00
            X.1fJ r13 = (X.C27991fJ) r13
            X.C162457s7.A0D(r13)
            java.lang.String r15 = r8.A05
            X.6qj r7 = r8.A00
            if (r7 == 0) goto L_0x01e6
            java.lang.Object r7 = r7.A00
            X.1vq r7 = (X.C34801vq) r7
            if (r7 == 0) goto L_0x01e6
            java.lang.String r7 = r7.A00
        L_0x01ce:
            java.lang.Object r14 = r9.A00
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14
            X.C162457s7.A0D(r14)
            java.lang.Long r8 = r8.A04
            long r17 = X.C18320x8.A03(r8)
            X.2nf r11 = new X.2nf
            r16 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r19, r21)
            r4.add(r11)
            goto L_0x018d
        L_0x01e6:
            r7 = r2
            goto L_0x01ce
        L_0x01e8:
            r9 = r2
            goto L_0x01ad
        L_0x01ea:
            r19 = 0
            goto L_0x01a7
        L_0x01ed:
            X.7YC r7 = new X.7YC
            r7.<init>(r5, r4)
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r6
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r4 = r1.A00
            X.1fJ r2 = r1.A01
            java.util.List r1 = r7.A01
            r4.A06(r2, r1)
            r1 = 0
            java.lang.Object r0 = r4.A02(r2, r0, r1)
            goto L_0x00b8
        L_0x020a:
            X.C57682u2.A01(r10)
        L_0x020d:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.iq.GetSuggestedGroupsProtocolHelper.A00(X.7SH, X.1fJ, X.1fJ, X.4Du):java.lang.Object");
    }

    public GetSuggestedGroupsProtocolHelper(AnonymousClass31C r1) {
        this.A00 = r1;
    }
}
