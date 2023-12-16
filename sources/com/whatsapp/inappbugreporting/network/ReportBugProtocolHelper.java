package com.whatsapp.inappbugreporting.network;

import X.AnonymousClass31C;
import X.C162457s7;

public final class ReportBugProtocolHelper {
    public final AnonymousClass31C A00;

    public ReportBugProtocolHelper(AnonymousClass31C r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        if (r2.length() == 0) goto L_0x00b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.util.List r33, X.C84814Du r34) {
        /*
            r27 = this;
            r5 = r34
            boolean r0 = r5 instanceof X.AnonymousClass8UL
            r3 = r27
            if (r0 == 0) goto L_0x023a
            r4 = r5
            X.8UL r4 = (X.AnonymousClass8UL) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x023a
            int r2 = r2 - r1
            r4.label = r2
        L_0x0016:
            java.lang.Object r2 = r4.result
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r5 = 1
            if (r0 == 0) goto L_0x008c
            if (r0 != r5) goto L_0x0246
            X.C57682u2.A01(r2)
        L_0x0024:
            X.5BH r2 = (X.AnonymousClass5BH) r2
            boolean r0 = r2 instanceof X.C96044vi
            if (r0 == 0) goto L_0x005d
            X.4vi r2 = (X.C96044vi) r2
            X.36K r1 = r2.A00
            java.lang.String r0 = "task_id"
            X.36K r0 = r1.A0l(r0)
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "ReportBugProtocolHelper/onSuccess called with empty taskIdNode"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "onSuccess called with empty taskIdNode"
        L_0x003d:
            X.6k0 r0 = new X.6k0
            r0.<init>(r1)
            return r0
        L_0x0043:
            java.lang.String r1 = r0.A0n()
            if (r1 == 0) goto L_0x0055
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0055
            X.6k1 r0 = new X.6k1
            r0.<init>(r1)
            return r0
        L_0x0055:
            java.lang.String r0 = "ReportBugProtocolHelper/onSuccess called with null task id"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "onSuccess called with null task id"
            goto L_0x003d
        L_0x005d:
            boolean r0 = r2 instanceof X.C96034vh
            if (r0 == 0) goto L_0x0080
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ReportBugProtocolHelper/onError: "
            r1.append(r0)
            X.4vh r2 = (X.C96034vh) r2
            X.36K r0 = r2.A00
            X.C18260x0.A0n(r0, r1)
            android.util.Pair r2 = X.C57492tj.A02(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "OnError: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)
            goto L_0x003d
        L_0x0080:
            boolean r0 = r2 instanceof X.C96054vj
            if (r0 == 0) goto L_0x0241
            java.lang.String r0 = "ReportBugProtocolHelper/onDeliveryFailure: Network Failure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "onDeliveryFailure: Network Failure"
            goto L_0x003d
        L_0x008c:
            X.C57682u2.A01(r2)
            X.31C r0 = r3.A00
            r26 = r0
            java.lang.String r15 = r26.A03()
            r1 = r31
            if (r31 != 0) goto L_0x01e8
            r12 = 0
        L_0x009c:
            r1 = r28
            if (r28 == 0) goto L_0x01e5
            int r0 = r1.length()
            if (r0 == 0) goto L_0x01e5
            X.1wZ r11 = new X.1wZ
            r11.<init>((java.lang.String) r1, (int) r5)
        L_0x00ab:
            r2 = r32
            if (r32 == 0) goto L_0x00b6
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x00b7
        L_0x00b6:
            r0 = 1
        L_0x00b7:
            r10 = 0
            if (r0 != 0) goto L_0x00ca
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -2113777672: goto L_0x01d6;
                case -1440008444: goto L_0x01d3;
                case -1146830912: goto L_0x01d0;
                case -744327095: goto L_0x01cd;
                case -314498168: goto L_0x01ca;
                case -123573497: goto L_0x01c7;
                case 100348368: goto L_0x01c4;
                case 106069776: goto L_0x01c1;
                case 146900954: goto L_0x01be;
                case 361719548: goto L_0x01bb;
                case 492830541: goto L_0x01b8;
                case 548640964: goto L_0x01b5;
                case 594331785: goto L_0x01b2;
                case 631882908: goto L_0x01af;
                case 814298977: goto L_0x01ac;
                case 815160638: goto L_0x01a9;
                case 1432626128: goto L_0x01a6;
                case 1716507379: goto L_0x01a3;
                case 1777117080: goto L_0x01a0;
                case 2054222044: goto L_0x019d;
                default: goto L_0x00c5;
            }
        L_0x00c5:
            java.lang.String r0 = "ReportBugProtocolHelper/getRequestBugCategory unsupported category type"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x00ca:
            boolean r0 = r33.isEmpty()
            if (r0 == 0) goto L_0x015c
            X.3d3 r9 = X.C72023d3.A00
        L_0x00d2:
            java.lang.String r1 = "iq"
            X.2rL r7 = new X.2rL
            r7.<init>(r1)
            java.lang.String r2 = "type"
            java.lang.String r0 = "set"
            X.C56052rL.A0D(r7, r2, r0)
            r2 = 0
            r23 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r19 = 0
            r20 = r15
            r21 = r2
            r25 = r19
            boolean r0 = X.C626836d.A0M(r20, r21, r23, r25)
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = "id"
            X.C56052rL.A0D(r7, r0, r15)
        L_0x00fa:
            X.36K r14 = r7.A0F()
            X.2rL r13 = new X.2rL
            r13.<init>(r1)
            java.lang.String r8 = "to"
            X.6kI r7 = X.C135206kI.A00
            X.39V r0 = new X.39V
            r0.<init>((com.whatsapp.jid.Jid) r7, (java.lang.String) r8)
            r13.A0G(r0)
            r13.A0I(r14)
            X.36K r8 = r13.A0F()
            X.2rL r7 = new X.2rL
            r7.<init>(r1)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "fb:thrift_iq"
            X.C56052rL.A0D(r7, r1, r0)
            java.lang.String r13 = "smax_id"
            r0 = 105(0x69, double:5.2E-322)
            X.C56052rL.A0C(r7, r13, r0)
            if (r12 == 0) goto L_0x0130
            X.36K r0 = r12.A00
            r7.A0H(r0)
        L_0x0130:
            if (r11 == 0) goto L_0x0137
            X.36K r0 = r11.A00
            r7.A0H(r0)
        L_0x0137:
            if (r10 == 0) goto L_0x013e
            X.36K r0 = r10.A00
            r7.A0H(r0)
        L_0x013e:
            r0 = 10
            boolean r0 = X.C626836d.A0O(r9, r2, r0)
            if (r0 == 0) goto L_0x01f0
            java.util.Iterator r1 = r9.iterator()
        L_0x014a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01f0
            java.lang.Object r0 = r1.next()
            X.2Ir r0 = (X.C41032Ir) r0
            X.36K r0 = r0.A00
            r7.A0H(r0)
            goto L_0x014a
        L_0x015c:
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.Iterator r8 = r33.iterator()
        L_0x0164:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r0 = r8.next()
            X.7Zc r0 = (X.C152497Zc) r0
            java.lang.String r7 = r0.A04
            if (r7 == 0) goto L_0x0164
            java.lang.String r3 = r0.A03
            if (r3 == 0) goto L_0x0164
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x0164
            java.lang.Integer r0 = r0.A01
            r1 = 0
            if (r0 == 0) goto L_0x018e
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x019a
            if (r0 == r5) goto L_0x0197
            java.lang.String r0 = "ReportBugProtocolHelper/getRequestMediaType unsupported media type"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x018e:
            X.1wV r0 = new X.1wV
            r0.<init>(r3, r2, r7, r1)
            r9.add(r0)
            goto L_0x0164
        L_0x0197:
            java.lang.String r1 = "video"
            goto L_0x018e
        L_0x019a:
            java.lang.String r1 = "image"
            goto L_0x018e
        L_0x019d:
            java.lang.String r1 = "sharing"
            goto L_0x01d8
        L_0x01a0:
            java.lang.String r1 = "whatsapp_ai_agents"
            goto L_0x01d8
        L_0x01a3:
            java.lang.String r1 = "platforms_delivery"
            goto L_0x01d8
        L_0x01a6:
            java.lang.String r1 = "channels"
            goto L_0x01d8
        L_0x01a9:
            java.lang.String r1 = "new_devices"
            goto L_0x01d8
        L_0x01ac:
            java.lang.String r1 = "rich_messaging"
            goto L_0x01d8
        L_0x01af:
            java.lang.String r1 = "cross_app_integrations"
            goto L_0x01d8
        L_0x01b2:
            java.lang.String r1 = "whatsapp_vr"
            goto L_0x01d8
        L_0x01b5:
            java.lang.String r1 = "calling"
            goto L_0x01d8
        L_0x01b8:
            java.lang.String r1 = "integrity"
            goto L_0x01d8
        L_0x01bb:
            java.lang.String r1 = "ui_redesign"
            goto L_0x01d8
        L_0x01be:
            java.lang.String r1 = "support_experience"
            goto L_0x01d8
        L_0x01c1:
            java.lang.String r1 = "other"
            goto L_0x01d8
        L_0x01c4:
            java.lang.String r1 = "infra"
            goto L_0x01d8
        L_0x01c7:
            java.lang.String r1 = "business_search"
            goto L_0x01d8
        L_0x01ca:
            java.lang.String r1 = "privacy"
            goto L_0x01d8
        L_0x01cd:
            java.lang.String r1 = "growth_broadcast"
            goto L_0x01d8
        L_0x01d0:
            java.lang.String r1 = "business"
            goto L_0x01d8
        L_0x01d3:
            java.lang.String r1 = "messaging"
            goto L_0x01d8
        L_0x01d6:
            java.lang.String r1 = "data_management"
        L_0x01d8:
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x00c5
            X.6sO r10 = new X.6sO
            r10.<init>(r1)
            goto L_0x00ca
        L_0x01e5:
            r11 = 0
            goto L_0x00ab
        L_0x01e8:
            r0 = 0
            X.1wZ r12 = new X.1wZ
            r12.<init>((java.lang.String) r1, (int) r0)
            goto L_0x009c
        L_0x01f0:
            java.lang.String r0 = "description"
            X.2rL r1 = new X.2rL
            r1.<init>(r0)
            r10 = 1
            r12 = 10000(0x2710, double:4.9407E-320)
            r2 = r29
            r9 = r2
            r14 = r19
            boolean r0 = X.C626836d.A0M(r9, r10, r12, r14)
            if (r0 == 0) goto L_0x0209
            r1.A0J(r2)
        L_0x0209:
            X.C56052rL.A07(r1, r7)
            java.lang.String r0 = "debug_information_json"
            X.2rL r1 = new X.2rL
            r1.<init>(r0)
            r2 = r30
            r9 = r2
            boolean r0 = X.C626836d.A0M(r9, r10, r12, r14)
            if (r0 == 0) goto L_0x021f
            r1.A0J(r2)
        L_0x021f:
            X.C56052rL.A07(r1, r7)
            r7.A0I(r8)
            X.36K r13 = r7.A0F()
            r4.label = r5
            r16 = 350(0x15e, float:4.9E-43)
            r17 = 32000(0x7d00, double:1.581E-319)
            r14 = r15
            r15 = r4
            r12 = r26
            java.lang.Object r2 = r12.A02(r13, r14, r15, r16, r17, r19)
            if (r2 != r6) goto L_0x0024
            return r6
        L_0x023a:
            X.8UL r4 = new X.8UL
            r4.<init>(r3, r5)
            goto L_0x0016
        L_0x0241:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x0246:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappbugreporting.network.ReportBugProtocolHelper.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.4Du):java.lang.Object");
    }
}
