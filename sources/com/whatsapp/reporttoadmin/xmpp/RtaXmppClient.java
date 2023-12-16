package com.whatsapp.reporttoadmin.xmpp;

import X.AnonymousClass000;
import X.AnonymousClass24Y;
import X.AnonymousClass31C;
import X.AnonymousClass36K;
import X.AnonymousClass48V;
import X.AnonymousClass4GQ;
import X.AnonymousClass4KT;
import X.AnonymousClass5BH;
import X.C100595Bn;
import X.C100605Bo;
import X.C100615Bp;
import X.C162457s7;
import X.C18260x0;
import X.C18280x3;
import X.C27991fJ;
import X.C32311qC;
import X.C32321qD;
import X.C35251wZ;
import X.C35381wm;
import X.C35721xK;
import X.C386528p;
import X.C41032Ir;
import X.C73153f1;
import X.C825243x;
import X.C96034vh;
import X.C96044vi;
import X.C96054vj;

public final class RtaXmppClient {
    public final AnonymousClass31C A00;
    public final C100595Bn A01;
    public final C100605Bo A02;
    public final C100615Bp A03;

    public RtaXmppClient(AnonymousClass31C r2, C100595Bn r3, C100605Bo r4, C100615Bp r5) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static final C386528p A00(AnonymousClass5BH r4, String str, AnonymousClass4GQ r6) {
        StringBuilder A0m;
        C162457s7.A0J(r4, 0);
        if (r4 instanceof C96044vi) {
            try {
                Object invoke = r6.invoke(((C96044vi) r4).A00);
                C18260x0.A1L(AnonymousClass000.A0m("Rta::", str), "/onSuccess");
                return new C32321qD(invoke);
            } catch (AnonymousClass24Y unused) {
                C18260x0.A1L(AnonymousClass000.A0m("Rta::", str), "/malformedResponse");
                return new C32311qC();
            }
        } else {
            if (r4 instanceof C96034vh) {
                int A002 = AnonymousClass36K.A00(((C96034vh) r4).A00);
                A0m = AnonymousClass000.A0m("Rta::", str);
                A0m.append("/onError: ");
                A0m.append(A002);
            } else if (r4 instanceof C96054vj) {
                A0m = AnonymousClass000.A0m("Rta::", str);
                A0m.append("/onDeliveryFailure: Network Failure");
            } else {
                throw C73153f1.A00();
            }
            C18280x3.A13(A0m);
            return new C32311qC();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C27991fJ r12, com.whatsapp.jid.UserJid r13, java.lang.String r14, X.C84814Du r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C74293gt
            if (r0 == 0) goto L_0x005b
            r6 = r15
            X.3gt r6 = (X.C74293gt) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005b
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r3 = r6.result
            X.218 r1 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r10 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r10) goto L_0x0061
            java.lang.Object r2 = r6.L$0
            X.1xK r2 = (X.C35721xK) r2
            X.C57682u2.A01(r3)
        L_0x0024:
            X.5BH r3 = (X.AnonymousClass5BH) r3
            X.43G r1 = new X.43G
            r1.<init>(r2)
            java.lang.String r0 = "reportMessageToAdmin"
            X.28p r0 = A00(r3, r0, r1)
            return r0
        L_0x0033:
            X.C57682u2.A01(r3)
            X.31C r3 = r11.A00
            java.lang.String r5 = r3.A03()
            X.C18260x0.A0Z(r12, r13, r14, r10)
            X.1wm r0 = X.C35381wm.A00(r12, r5)
            X.1xK r2 = new X.1xK
            r2.<init>((com.whatsapp.jid.UserJid) r13, (X.C35381wm) r0, (java.lang.String) r14)
            X.36K r4 = X.C41032Ir.A05(r2)
            r6.L$0 = r2
            r6.label = r10
            r7 = 385(0x181, float:5.4E-43)
            r8 = 32000(0x7d00, double:1.581E-319)
            java.lang.Object r3 = r3.A02(r4, r5, r6, r7, r8, r10)
            if (r3 != r1) goto L_0x0024
            return r1
        L_0x005b:
            X.3gt r6 = new X.3gt
            r6.<init>(r11, r15)
            goto L_0x0012
        L_0x0061:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reporttoadmin.xmpp.RtaXmppClient.A01(X.1fJ, com.whatsapp.jid.UserJid, java.lang.String, X.4Du):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C27991fJ r13, X.C84814Du r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C74283gs
            if (r0 == 0) goto L_0x0063
            r7 = r14
            X.3gs r7 = (X.C74283gs) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0063
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r4 = r7.result
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r7.label
            r11 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 != r11) goto L_0x0069
            java.lang.Object r2 = r7.L$0
            X.1xK r2 = (X.C35721xK) r2
            X.C57682u2.A01(r4)
        L_0x0024:
            X.5BH r4 = (X.AnonymousClass5BH) r4
            X.43F r1 = new X.43F
            r1.<init>(r2)
            java.lang.String r0 = "getReportedMessages"
            X.28p r0 = A00(r4, r0, r1)
            return r0
        L_0x0032:
            X.C57682u2.A01(r4)
            X.31C r4 = r12.A00
            java.lang.String r6 = r4.A03()
            X.C162457s7.A0J(r13, r11)
            r1 = 7
            X.1wm r0 = new X.1wm
            r0.<init>((java.lang.String) r6, (int) r1)
            X.1ww r1 = new X.1ww
            r1.<init>(r13, r0)
            r0 = 19
            X.1xK r2 = new X.1xK
            r2.<init>((X.C35481ww) r1, (int) r0)
            X.36K r5 = X.C41032Ir.A05(r2)
            r7.L$0 = r2
            r7.label = r11
            r8 = 385(0x181, float:5.4E-43)
            r9 = 32000(0x7d00, double:1.581E-319)
            java.lang.Object r4 = r4.A02(r5, r6, r7, r8, r9, r11)
            if (r4 != r3) goto L_0x0024
            return r3
        L_0x0063:
            X.3gs r7 = new X.3gs
            r7.<init>(r12, r14)
            goto L_0x0012
        L_0x0069:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reporttoadmin.xmpp.RtaXmppClient.A02(X.1fJ, X.4Du):java.lang.Object");
    }

    public final void A03(C27991fJ r20, AnonymousClass48V r21, boolean z) {
        C35721xK r11;
        C27991fJ r2 = r20;
        AnonymousClass48V r6 = r21;
        C18260x0.A0Q(r2, r6);
        AnonymousClass31C r4 = this.A00;
        String A032 = r4.A03();
        C35381wm r8 = new C35381wm(r2, new C35381wm(A032, 8));
        boolean z2 = z;
        if (z) {
            r11 = new C35721xK(r8, new C35251wZ(8), (C35251wZ) null, (C35251wZ) null, (C35251wZ) null, (C35251wZ) null, (C35251wZ) null);
        } else {
            r11 = new C35721xK(r8, (C35251wZ) null, new C35251wZ(16), (C35251wZ) null, (C35251wZ) null, (C35251wZ) null, (C35251wZ) null);
        }
        r4.A0D(new AnonymousClass4KT(r6, 17, new C825243x(r6, z2)), C41032Ir.A05(r11), A032, 384, 32000);
    }
}
