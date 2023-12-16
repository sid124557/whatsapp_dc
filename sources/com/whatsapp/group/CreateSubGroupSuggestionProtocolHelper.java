package com.whatsapp.group;

import X.AnonymousClass31C;
import X.C162457s7;

public final class CreateSubGroupSuggestionProtocolHelper {
    public final AnonymousClass31C A00;

    public CreateSubGroupSuggestionProtocolHelper(AnonymousClass31C r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C27991fJ r26, java.lang.String r27, java.lang.String r28, X.C84814Du r29) {
        /*
            r25 = this;
            r4 = r29
            r11 = r26
            r14 = r27
            r0 = r28
            boolean r1 = r4 instanceof X.C74663hU
            r10 = r25
            if (r1 == 0) goto L_0x0150
            r9 = r4
            X.3hU r9 = (X.C74663hU) r9
            int r3 = r9.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0150
            int r3 = r3 - r2
            r9.label = r3
        L_0x001c:
            java.lang.Object r3 = r9.result
            X.218 r8 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r2 = r9.label
            r1 = 1
            if (r2 == 0) goto L_0x010f
            if (r2 != r1) goto L_0x0167
            java.lang.Object r7 = r9.L$4
            X.2Ir r7 = (X.C41032Ir) r7
            java.lang.Object r0 = r9.L$3
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r14 = r9.L$2
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r11 = r9.L$1
            X.1fJ r11 = (X.C27991fJ) r11
            X.C57682u2.A01(r3)
        L_0x003a:
            X.5BH r3 = (X.AnonymousClass5BH) r3
            boolean r2 = r3 instanceof X.C96044vi
            if (r2 == 0) goto L_0x0157
            X.4vi r3 = (X.C96044vi) r3
            X.36K r2 = r3.A00
            r15 = 0
            X.36K r16 = X.C41032Ir.A02(r2, r7)
            java.lang.String r3 = "type"
            java.lang.String[] r9 = new java.lang.String[]{r3}
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3 = 0
            java.lang.String r8 = "result"
            java.lang.Long r6 = X.AnonymousClass0x2.A0R()
            java.lang.Long r7 = X.AnonymousClass0x2.A0S()
            r10 = r3
            r4 = r2
            X.C626836d.A06(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String[] r23 = X.AnonymousClass0x9.A1b()
            java.lang.Class<X.1fJ> r17 = X.C27991fJ.class
            java.lang.String r4 = "to"
            java.lang.String[] r21 = new java.lang.String[]{r4}
            r18 = r6
            r19 = r7
            r20 = r15
            r22 = r3
            java.lang.Object r22 = X.C626836d.A06(r16, r17, r18, r19, r20, r21, r22)
            r18 = r2
            r19 = r17
            r20 = r6
            r21 = r7
            r24 = r1
            X.C626836d.A06(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r4 = "id"
            java.lang.String[] r23 = new java.lang.String[]{r4}
            java.lang.String[] r9 = new java.lang.String[]{r4}
            r4 = r16
            r8 = r15
            java.lang.Object r22 = X.C626836d.A06(r4, r5, r6, r7, r8, r9, r10)
            r19 = r5
            X.C626836d.A06(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r4 = "jid"
            java.lang.String r1 = "sub_group_suggestion"
            java.lang.String[] r9 = new java.lang.String[]{r1, r4}
            r4 = r2
            r5 = r17
            java.lang.Object r12 = X.C626836d.A06(r4, r5, r6, r7, r8, r9, r10)
            X.1fJ r12 = (X.C27991fJ) r12
            java.lang.String r4 = "creator"
            java.lang.String[] r9 = new java.lang.String[]{r1, r4}
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            r4 = r2
            java.lang.Object r13 = X.C626836d.A06(r4, r5, r6, r7, r8, r9, r10)
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13
            java.lang.String r4 = "creation"
            java.lang.String[] r9 = new java.lang.String[]{r1, r4}
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            java.lang.Long r6 = X.AnonymousClass0x2.A0T()
            r4 = r2
            java.lang.Object r6 = X.C626836d.A06(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Number r6 = (java.lang.Number) r6
            java.lang.String r4 = "description"
            java.lang.String[] r5 = new java.lang.String[]{r1, r4}
            r4 = 31
            java.lang.Object r5 = X.C626836d.A08(r2, r5, r4)
            X.1vq r5 = (X.C34801vq) r5
            java.lang.String[] r4 = new java.lang.String[]{r1}
            r1 = 32
            java.util.List r1 = X.C626836d.A0C(r2, r4, r1)
            r1.get(r3)
            if (r5 == 0) goto L_0x010d
            java.lang.String r1 = r5.A00
            if (r1 == 0) goto L_0x010d
        L_0x00f4:
            X.C162457s7.A0D(r12)
            X.C162457s7.A0D(r13)
            long r16 = X.C18320x8.A03(r6)
            r18 = 0
            X.2nf r10 = new X.2nf
            r20 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r18, r20)
            X.1dl r0 = new X.1dl
            r0.<init>(r10)
            return r0
        L_0x010d:
            r15 = r0
            goto L_0x00f4
        L_0x010f:
            X.C57682u2.A01(r3)
            X.31C r6 = r10.A00
            java.lang.String r5 = r6.A03()
            X.1wm r4 = X.C35381wm.A00(r11, r5)
            if (r28 == 0) goto L_0x014e
            int r2 = r0.length()
            if (r2 == 0) goto L_0x014e
            r2 = 29
            X.1wZ r3 = new X.1wZ
            r3.<init>((java.lang.String) r0, (int) r2)
        L_0x012b:
            X.1wx r2 = new X.1wx
            r2.<init>(r3, r14)
            X.1xK r7 = new X.1xK
            r7.<init>((X.C35381wm) r4, (X.C35491wx) r2)
            X.36K r3 = X.C41032Ir.A05(r7)
            r9.L$0 = r10
            r9.L$1 = r11
            r9.L$2 = r14
            r9.L$3 = r0
            r9.L$4 = r7
            r9.label = r1
            r2 = 391(0x187, float:5.48E-43)
            java.lang.Object r3 = X.AnonymousClass31C.A01(r6, r3, r5, r9, r2)
            if (r3 != r8) goto L_0x003a
            return r8
        L_0x014e:
            r3 = 0
            goto L_0x012b
        L_0x0150:
            X.3hU r9 = new X.3hU
            r9.<init>(r10, r4)
            goto L_0x001c
        L_0x0157:
            boolean r0 = r3 instanceof X.C96034vh
            if (r0 != 0) goto L_0x0164
            boolean r0 = r3 instanceof X.C96054vj
            if (r0 != 0) goto L_0x0164
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x0164:
            X.1dm r0 = X.C27411dm.A00
            return r0
        L_0x0167:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper.A00(X.1fJ, java.lang.String, java.lang.String, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C27991fJ r11, java.util.List r12, X.C84814Du r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C74473hB
            if (r0 == 0) goto L_0x00b2
            r8 = r13
            X.3hB r8 = (X.C74473hB) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b2
            int r2 = r2 - r1
            r8.label = r2
        L_0x0012:
            java.lang.Object r1 = r8.result
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r8.label
            r9 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 != r9) goto L_0x00cf
            java.lang.Object r2 = r8.L$1
            X.2Ir r2 = (X.C41032Ir) r2
            X.C57682u2.A01(r1)
        L_0x0024:
            X.5BH r1 = (X.AnonymousClass5BH) r1
            boolean r0 = r1 instanceof X.C96044vi
            if (r0 == 0) goto L_0x00bf
            X.4vi r1 = (X.C96044vi) r1
            X.36K r3 = r1.A00
            X.36K r1 = X.C41032Ir.A02(r3, r2)
            r0 = 8
            X.C626836d.A0E(r1, r3, r0)
            java.lang.String r1 = "sub_group_suggestion"
            java.lang.String r0 = "group"
            java.lang.String[] r5 = new java.lang.String[]{r1, r0}
            r0 = 30
            X.4Jp r4 = X.C86304Jp.A00(r0)
            r6 = 1
            r8 = 1000(0x3e8, double:4.94E-321)
            java.util.List r0 = X.C626836d.A0B(r3, r4, r5, r6, r8)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x0056:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6rH r0 = (X.C138956rH) r0
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x0056
            r3.add(r1)
            goto L_0x0056
        L_0x006b:
            X.C57682u2.A01(r1)
            X.31C r6 = r10.A00
            java.lang.String r5 = r6.A03()
            X.1wm r4 = X.C35381wm.A00(r11, r5)
            java.util.ArrayList r3 = X.C73783g4.A0c(r12)
            java.util.Iterator r2 = r12.iterator()
        L_0x0080:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r1 = r2.next()
            X.1fJ r1 = (X.C27991fJ) r1
            X.1wZ r0 = new X.1wZ
            r0.<init>((X.C27991fJ) r1)
            r3.add(r0)
            goto L_0x0080
        L_0x0095:
            X.1wx r0 = new X.1wx
            r0.<init>(r3)
            X.1xK r2 = new X.1xK
            r2.<init>((X.C35381wm) r4, (X.C35491wx) r0)
            X.36K r1 = X.C41032Ir.A05(r2)
            r8.L$0 = r10
            r8.L$1 = r2
            r8.label = r9
            r0 = 391(0x187, float:5.48E-43)
            java.lang.Object r1 = X.AnonymousClass31C.A01(r6, r1, r5, r8, r0)
            if (r1 != r7) goto L_0x0024
            return r7
        L_0x00b2:
            X.3hB r8 = new X.3hB
            r8.<init>(r10, r13)
            goto L_0x0012
        L_0x00b9:
            X.1dj r7 = new X.1dj
            r7.<init>(r3)
            return r7
        L_0x00bf:
            boolean r0 = r1 instanceof X.C96034vh
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r1 instanceof X.C96054vj
            if (r0 != 0) goto L_0x00cc
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x00cc:
            X.1dk r7 = X.C27391dk.A00
            return r7
        L_0x00cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper.A01(X.1fJ, java.util.List, X.4Du):java.lang.Object");
    }
}
