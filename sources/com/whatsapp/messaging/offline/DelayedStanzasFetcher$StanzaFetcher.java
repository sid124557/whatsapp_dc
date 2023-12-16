package com.whatsapp.messaging.offline;

import X.AnonymousClass31C;
import X.AnonymousClass4GQ;
import X.C162457s7;
import X.C18280x3;
import java.util.concurrent.atomic.AtomicBoolean;

public final class DelayedStanzasFetcher$StanzaFetcher {
    public final AnonymousClass31C A00;
    public final AtomicBoolean A01 = C18280x3.A0l();
    public final AnonymousClass4GQ A02;

    public DelayedStanzasFetcher$StanzaFetcher(AnonymousClass31C r2, AnonymousClass4GQ r3) {
        C162457s7.A0J(r2, 3);
        this.A00 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C84814Du r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C74223gm
            if (r0 == 0) goto L_0x00a5
            r6 = r10
            X.3gm r6 = (X.C74223gm) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a5
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r2 = r6.result
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r8 = 1
            java.lang.String r5 = "DelayedStanzasManager/sendPullRequest/"
            if (r0 == 0) goto L_0x0069
            if (r0 != r8) goto L_0x00ac
            X.C57682u2.A01(r2)
        L_0x0022:
            X.5BH r2 = (X.AnonymousClass5BH) r2
            boolean r0 = r2 instanceof X.C96044vi
            if (r0 == 0) goto L_0x003a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = "notification"
            r1.append(r0)
            java.lang.String r0 = " success, done"
            X.C18260x0.A1J(r1, r0)
        L_0x0037:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x003a:
            boolean r0 = r2 instanceof X.C96034vh
            if (r0 == 0) goto L_0x0055
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = "notification"
            r1.append(r0)
            java.lang.String r0 = " error "
            r1.append(r0)
            X.4vh r2 = (X.C96034vh) r2
            X.36K r0 = r2.A00
            X.C18270x1.A17(r0, r1)
            goto L_0x0037
        L_0x0055:
            boolean r0 = r2 instanceof X.C96054vj
            if (r0 == 0) goto L_0x0037
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = "notification"
            r1.append(r0)
            java.lang.String r0 = " delivery failure"
            X.C18260x0.A1L(r1, r0)
            goto L_0x0037
        L_0x0069:
            X.C57682u2.A01(r2)
            java.util.concurrent.atomic.AtomicBoolean r1 = r9.A01
            r0 = 0
            boolean r0 = r1.getAndSet(r0)
            if (r0 == 0) goto L_0x0037
            X.31C r4 = r9.A00
            java.lang.String r3 = r4.A03()
            X.4GQ r0 = r9.A02
            X.454 r0 = (X.AnonymousClass454) r0
            java.lang.Object r0 = r0.invoke(r3)
            X.2Ir r0 = (X.C41032Ir) r0
            X.36K r2 = X.C41032Ir.A05(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = "notification"
            r1.append(r0)
            java.lang.String r0 = " sending an iq "
            X.C18260x0.A0s(r0, r3, r1)
            r6.L$0 = r9
            r6.label = r8
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.Object r2 = X.AnonymousClass31C.A01(r4, r2, r3, r6, r0)
            if (r2 != r7) goto L_0x0022
            return r7
        L_0x00a5:
            X.3gm r6 = new X.3gm
            r6.<init>(r9, r10)
            goto L_0x0012
        L_0x00ac:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher.A00(X.4Du):java.lang.Object");
    }
}
