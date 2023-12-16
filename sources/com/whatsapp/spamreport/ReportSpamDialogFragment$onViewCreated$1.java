package com.whatsapp.spamreport;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$onViewCreated$1", f = "ReportSpamDialogFragment.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 3}, l = {164, 165, 166, 167}, m = "invokeSuspend", n = {"selectedMessageKey", "senderJid", "selectedMessageKey", "contact", "contact", "senderContact", "contact", "senderContact", "selectedMessage"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
public final class ReportSpamDialogFragment$onViewCreated$1 extends C75003pT implements AnonymousClass4GR {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$onViewCreated$1(ReportSpamDialogFragment reportSpamDialogFragment, C84814Du r3) {
        super(r3, 2);
        this.this$0 = reportSpamDialogFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0089, code lost:
        if (r10 == r5) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00db A[PHI: r2 
      PHI: (r2v2 java.lang.Object) = (r2v1 java.lang.Object), (r2v3 java.lang.Object) binds: [B:21:0x00cb, B:23:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r10) {
        /*
            r9 = this;
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r9.label
            r6 = 4
            r8 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 == r3) goto L_0x008c
            if (r0 == r2) goto L_0x00b5
            if (r0 == r8) goto L_0x00de
            if (r0 != r6) goto L_0x00ff
            java.lang.Object r5 = r9.L$2
            X.34x r5 = (X.C624134x) r5
            java.lang.Object r3 = r9.L$1
            X.3ZH r3 = (X.AnonymousClass3ZH) r3
            java.lang.Object r4 = r9.L$0
            X.3ZH r4 = (X.AnonymousClass3ZH) r4
            X.C57682u2.A01(r10)
        L_0x0021:
            boolean r2 = X.AnonymousClass001.A1Z(r10)
            com.whatsapp.spamreport.ReportSpamDialogFragment r1 = r9.this$0
            r0 = 0
            r1.A1b(r0)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r9.this$0
            com.whatsapp.spamreport.ReportSpamDialogFragment.A00(r4, r3, r5, r0, r2)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r9.this$0
            X.2p7 r3 = r0.A1Y()
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r9.this$0
            X.66R r0 = r0.A0M
            java.lang.String r2 = X.AnonymousClass0x9.A13(r0)
            X.C162457s7.A0D(r2)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r9.this$0
            X.66R r0 = r0.A0L
            java.lang.Object r1 = r0.getValue()
            X.4uZ r1 = (X.C95814uZ) r1
            boolean r0 = X.C18290x4.A1W(r1)
            r3.A01(r1, r2, r0)
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0055:
            X.C57682u2.A01(r10)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r9.this$0
            r0.A1b(r3)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r9.this$0
            android.os.Bundle r4 = r0.A0H()
            java.lang.String r0 = ""
            X.2z0 r7 = X.C107395bF.A03(r4, r0)
            X.32Y r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = "senderJid"
            java.lang.String r0 = r4.getString(r0)
            com.whatsapp.jid.UserJid r4 = r1.A0E(r0)
            com.whatsapp.spamreport.ReportSpamDialogFragment r1 = r9.this$0
            X.66R r0 = r1.A0L
            java.lang.Object r0 = r0.getValue()
            X.4uZ r0 = (X.C95814uZ) r0
            r9.L$0 = r7
            r9.L$1 = r4
            r9.label = r3
            java.lang.Object r10 = r1.A1a(r0, r9)
            if (r10 != r5) goto L_0x0097
        L_0x008b:
            return r5
        L_0x008c:
            java.lang.Object r4 = r9.L$1
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r7 = r9.L$0
            X.2z0 r7 = (X.AnonymousClass2z0) r7
            X.C57682u2.A01(r10)
        L_0x0097:
            X.3ZH r10 = (X.AnonymousClass3ZH) r10
            com.whatsapp.spamreport.ReportSpamDialogFragment r3 = r9.this$0
            r9.L$0 = r7
            r9.L$1 = r10
            r9.label = r2
            r2 = 0
            if (r4 == 0) goto L_0x00b2
            X.46Q r1 = X.AnonymousClass2C4.A01
            com.whatsapp.spamreport.ReportSpamDialogFragment$getSenderContact$2 r0 = new com.whatsapp.spamreport.ReportSpamDialogFragment$getSenderContact$2
            r0.<init>(r4, r3, r2)
            java.lang.Object r2 = X.C616131n.A00(r9, r1, r0)
            if (r2 != r5) goto L_0x00b2
            return r5
        L_0x00b2:
            r4 = r10
            r10 = r2
            goto L_0x00c0
        L_0x00b5:
            java.lang.Object r4 = r9.L$1
            X.3ZH r4 = (X.AnonymousClass3ZH) r4
            java.lang.Object r7 = r9.L$0
            X.2z0 r7 = (X.AnonymousClass2z0) r7
            X.C57682u2.A01(r10)
        L_0x00c0:
            X.3ZH r10 = (X.AnonymousClass3ZH) r10
            com.whatsapp.spamreport.ReportSpamDialogFragment r3 = r9.this$0
            r9.L$0 = r4
            r9.L$1 = r10
            r9.label = r8
            r2 = 0
            if (r7 == 0) goto L_0x00db
            X.46Q r1 = X.AnonymousClass2C4.A01
            com.whatsapp.spamreport.ReportSpamDialogFragment$getSelectedMessage$2 r0 = new com.whatsapp.spamreport.ReportSpamDialogFragment$getSelectedMessage$2
            r0.<init>(r7, r3, r2)
            java.lang.Object r2 = X.C616131n.A00(r9, r1, r0)
            if (r2 != r5) goto L_0x00db
            return r5
        L_0x00db:
            r3 = r10
            r10 = r2
            goto L_0x00e9
        L_0x00de:
            java.lang.Object r3 = r9.L$1
            X.3ZH r3 = (X.AnonymousClass3ZH) r3
            java.lang.Object r4 = r9.L$0
            X.3ZH r4 = (X.AnonymousClass3ZH) r4
            X.C57682u2.A01(r10)
        L_0x00e9:
            X.34x r10 = (X.C624134x) r10
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r9.this$0
            r9.L$0 = r4
            r9.L$1 = r3
            r9.L$2 = r10
            r9.label = r6
            java.lang.Object r0 = r0.A1Z(r4, r9)
            if (r0 == r5) goto L_0x008b
            r5 = r10
            r10 = r0
            goto L_0x0021
        L_0x00ff:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogFragment$onViewCreated$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new ReportSpamDialogFragment$onViewCreated$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new ReportSpamDialogFragment$onViewCreated$1(this.this$0, (C84814Du) obj2));
    }
}
