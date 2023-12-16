package com.whatsapp.community.iq;

import X.AnonymousClass31C;

public final class SubgroupSuggestionActionProtocolHelper {
    public final AnonymousClass31C A00;

    /* JADX WARNING: type inference failed for: r2v10, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C27991fJ r15, java.util.List r16, java.util.List r17, java.util.List r18, X.C84814Du r19) {
        /*
            r14 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C74103ga
            if (r0 == 0) goto L_0x0127
            r6 = r3
            X.3ga r6 = (X.C74103ga) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0127
            int r2 = r2 - r1
            r6.label = r2
        L_0x0014:
            java.lang.Object r1 = r6.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 1
            if (r0 == 0) goto L_0x005c
            if (r0 != r7) goto L_0x0202
            java.lang.Object r2 = r6.L$0
            X.1xK r2 = (X.C35721xK) r2
            X.C57682u2.A01(r1)
        L_0x0026:
            X.5BH r1 = (X.AnonymousClass5BH) r1
            boolean r0 = r1 instanceof X.C96044vi
            if (r0 == 0) goto L_0x01f2
            X.4vi r1 = (X.C96044vi) r1
            X.36K r0 = r1.A00
            X.1xU r6 = new X.1xU
            r6.<init>((X.AnonymousClass36K) r0, (X.C35721xK) r2)
            java.lang.Object r0 = r6.A02
            X.6qn r0 = (X.C138666qn) r0
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r0.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x0047:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x012e
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6qs r0 = (X.C138716qs) r0
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x0047
            r3.add(r1)
            goto L_0x0047
        L_0x005c:
            X.C57682u2.A01(r1)
            X.31C r4 = r14.A00
            java.lang.String r3 = r4.A03()
            X.1wm r9 = X.C35381wm.A00(r15, r3)
            r1 = 0
            if (r16 == 0) goto L_0x009d
            java.util.ArrayList r8 = X.C73783g4.A0d(r16)
            java.util.Iterator r12 = r16.iterator()
        L_0x0074:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x009f
            java.lang.Object r0 = r12.next()
            X.2ji r0 = (X.C51372ji) r0
            X.1fJ r10 = r0.A00
            com.whatsapp.jid.UserJid r11 = r0.A01
            r0 = 16
            X.1wm r2 = new X.1wm
            r2.<init>((X.C27991fJ) r10, (int) r0)
            r0 = 15
            X.1wm r10 = new X.1wm
            r10.<init>((com.whatsapp.jid.UserJid) r11, (X.C35381wm) r2, (int) r0)
            r2 = 23
            X.1wZ r0 = new X.1wZ
            r0.<init>((X.C35381wm) r10, (int) r2)
            r8.add(r0)
            goto L_0x0074
        L_0x009d:
            r10 = r1
            goto L_0x00a6
        L_0x009f:
            r0 = 22
            X.1wZ r10 = new X.1wZ
            r10.<init>((java.util.List) r8, (int) r0)
        L_0x00a6:
            if (r17 == 0) goto L_0x00d9
            java.util.ArrayList r8 = X.C73783g4.A0d(r17)
            java.util.Iterator r13 = r17.iterator()
        L_0x00b0:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00db
            java.lang.Object r0 = r13.next()
            X.2ji r0 = (X.C51372ji) r0
            X.1fJ r11 = r0.A00
            com.whatsapp.jid.UserJid r12 = r0.A01
            r0 = 16
            X.1wm r2 = new X.1wm
            r2.<init>((X.C27991fJ) r11, (int) r0)
            r0 = 15
            X.1wm r11 = new X.1wm
            r11.<init>((com.whatsapp.jid.UserJid) r12, (X.C35381wm) r2, (int) r0)
            r2 = 27
            X.1wZ r0 = new X.1wZ
            r0.<init>((X.C35381wm) r11, (int) r2)
            r8.add(r0)
            goto L_0x00b0
        L_0x00d9:
            r11 = r1
            goto L_0x00e2
        L_0x00db:
            r0 = 26
            X.1wZ r11 = new X.1wZ
            r11.<init>((java.util.List) r8, (int) r0)
        L_0x00e2:
            if (r18 == 0) goto L_0x0111
            java.util.ArrayList r8 = X.C73783g4.A0d(r18)
            java.util.Iterator r12 = r18.iterator()
        L_0x00ec:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r1 = r12.next()
            X.1fJ r1 = (X.C27991fJ) r1
            r0 = 16
            X.1wm r2 = new X.1wm
            r2.<init>((X.C27991fJ) r1, (int) r0)
            r1 = 25
            X.1wZ r0 = new X.1wZ
            r0.<init>((X.C35381wm) r2, (int) r1)
            r8.add(r0)
            goto L_0x00ec
        L_0x010a:
            r0 = 24
            X.1wZ r1 = new X.1wZ
            r1.<init>((java.util.List) r8, (int) r0)
        L_0x0111:
            X.1xK r2 = new X.1xK
            r2.<init>((X.C35381wm) r9, (X.C35251wZ) r10, (X.C35251wZ) r11, (X.C35251wZ) r1)
            X.36K r1 = X.C41032Ir.A05(r2)
            r6.L$0 = r2
            r6.label = r7
            r0 = 391(0x187, float:5.48E-43)
            java.lang.Object r1 = X.AnonymousClass31C.A01(r4, r1, r3, r6, r0)
            if (r1 != r5) goto L_0x0026
            return r5
        L_0x0127:
            X.3ga r6 = new X.3ga
            r6.<init>(r14, r3)
            goto L_0x0014
        L_0x012e:
            java.util.ArrayList r5 = X.C73783g4.A0d(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x0136:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x014e
            java.lang.Object r0 = r1.next()
            X.6qs r0 = (X.C138716qs) r0
            java.lang.Object r0 = r0.A02
            X.6qn r0 = (X.C138666qn) r0
            java.lang.Object r0 = r0.A00
            r5.add(r0)
            goto L_0x0136
        L_0x014c:
            X.3d3 r5 = X.C72023d3.A00
        L_0x014e:
            java.lang.Object r0 = r6.A01
            X.6qn r0 = (X.C138666qn) r0
            if (r0 == 0) goto L_0x0197
            java.lang.Object r0 = r0.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x0160:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0175
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6rH r0 = (X.C138956rH) r0
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x0160
            r3.add(r1)
            goto L_0x0160
        L_0x0175:
            java.util.ArrayList r4 = X.C73783g4.A0d(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x017d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r0 = r1.next()
            X.6rH r0 = (X.C138956rH) r0
            java.lang.Object r0 = r0.A01
            X.6rH r0 = (X.C138956rH) r0
            java.lang.Object r0 = r0.A01
            X.6qn r0 = (X.C138666qn) r0
            java.lang.Object r0 = r0.A00
            r4.add(r0)
            goto L_0x017d
        L_0x0197:
            X.3d3 r4 = X.C72023d3.A00
        L_0x0199:
            java.lang.Object r0 = r6.A04
            X.6qn r0 = (X.C138666qn) r0
            if (r0 == 0) goto L_0x01e2
            java.lang.Object r0 = r0.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x01ab:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.6qs r0 = (X.C138716qs) r0
            java.lang.Object r0 = r0.A02
            if (r0 == 0) goto L_0x01ab
            r3.add(r1)
            goto L_0x01ab
        L_0x01c0:
            java.util.ArrayList r2 = X.C73783g4.A0d(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x01c8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r0 = r1.next()
            X.6qs r0 = (X.C138716qs) r0
            java.lang.Object r0 = r0.A01
            X.6rH r0 = (X.C138956rH) r0
            java.lang.Object r0 = r0.A01
            X.6qn r0 = (X.C138666qn) r0
            java.lang.Object r0 = r0.A00
            r2.add(r0)
            goto L_0x01c8
        L_0x01e2:
            X.3d3 r2 = X.C72023d3.A00
        L_0x01e4:
            java.util.List r0 = X.C73723fy.A0K(r4, r5)
            java.util.List r1 = X.C73723fy.A0K(r2, r0)
            X.1O9 r0 = new X.1O9
            r0.<init>(r1)
            return r0
        L_0x01f2:
            boolean r0 = r1 instanceof X.C96034vh
            if (r0 != 0) goto L_0x01ff
            boolean r0 = r1 instanceof X.C96054vj
            if (r0 != 0) goto L_0x01ff
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x01ff:
            X.1OA r0 = X.AnonymousClass1OA.A00
            return r0
        L_0x0202:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.iq.SubgroupSuggestionActionProtocolHelper.A00(X.1fJ, java.util.List, java.util.List, java.util.List, X.4Du):java.lang.Object");
    }

    public SubgroupSuggestionActionProtocolHelper(AnonymousClass31C r1) {
        this.A00 = r1;
    }
}
