package com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist;

import X.AnonymousClass113;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesViewModel$fetchReportedMessages$1", f = "ReportToAdminMessagesViewModel.kt", i = {1}, l = {96, 100}, m = "invokeSuspend", n = {"reports"}, s = {"L$0"})
public final class ReportToAdminMessagesViewModel$fetchReportedMessages$1 extends C75003pT implements AnonymousClass4GR {
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass113 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportToAdminMessagesViewModel$fetchReportedMessages$1(AnonymousClass113 r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r13) {
        /*
            r12 = this;
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r12.label
            r1 = 2
            r3 = 1
            if (r0 == 0) goto L_0x001f
            if (r0 == r3) goto L_0x0031
            if (r0 != r1) goto L_0x00b0
            java.lang.Object r4 = r12.L$0
            X.C57682u2.A01(r13)
        L_0x0011:
            X.113 r0 = r12.this$0
            X.08M r1 = r0.A02
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r13, r4)
        L_0x0019:
            r1.A0G(r0)
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x001f:
            X.C57682u2.A01(r13)
            X.113 r0 = r12.this$0
            com.whatsapp.reporttoadmin.xmpp.RtaXmppClient r2 = r0.A07
            X.1fJ r0 = r0.A06
            r12.label = r3
            java.lang.Object r13 = r2.A02(r0, r12)
            if (r13 != r5) goto L_0x0034
            return r5
        L_0x0031:
            X.C57682u2.A01(r13)
        L_0x0034:
            r2 = r13
            X.28p r2 = (X.C386528p) r2
            boolean r0 = r2 instanceof X.C32321qD
            r13 = 0
            if (r0 == 0) goto L_0x00a4
            X.1qD r2 = (X.C32321qD) r2
            java.lang.Object r4 = r2.A00
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            X.113 r3 = r12.this$0
            X.2CP r6 = r3.A03
            java.util.ArrayList r11 = X.C73783g4.A0c(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x004e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r2.next()
            X.6rI r0 = (X.C138966rI) r0
            java.lang.String r0 = r0.A01
            X.C162457s7.A0D(r0)
            r11.add(r0)
            goto L_0x004e
        L_0x0063:
            X.5sx r0 = r6.A00
            X.3Db r2 = r0.A03
            X.2sH r7 = X.C64333Db.A2p(r2)
            X.4C1 r0 = r2.A58
            java.lang.Object r8 = r0.get()
            X.2sm r8 = (X.C56922sm) r8
            X.4C1 r0 = r2.A7g
            java.lang.Object r9 = r0.get()
            X.2ga r9 = (X.C49472ga) r9
            X.4C1 r0 = r2.AMC
            java.lang.Object r10 = r0.get()
            X.3dV r10 = (X.C72303dV) r10
            X.2Rk r6 = new X.2Rk
            r6.<init>(r7, r8, r9, r10, r11)
            r3.A00 = r6
            X.113 r0 = r12.this$0
            X.2Rk r3 = r0.A00
            if (r3 == 0) goto L_0x0011
            X.1fJ r2 = r0.A06
            r12.L$0 = r4
            r12.label = r1
            X.46Q r1 = X.AnonymousClass2C4.A01
            com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2 r0 = new com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2
            r0.<init>(r13, r2, r3, r13)
            java.lang.Object r13 = X.C616131n.A00(r12, r1, r0)
            if (r13 != r5) goto L_0x0011
            return r5
        L_0x00a4:
            X.113 r0 = r12.this$0
            X.08M r1 = r0.A02
            X.3d3 r0 = X.C72023d3.A00
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r13, r0)
            goto L_0x0019
        L_0x00b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesViewModel$fetchReportedMessages$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new ReportToAdminMessagesViewModel$fetchReportedMessages$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new ReportToAdminMessagesViewModel$fetchReportedMessages$1(this.this$0, (C84814Du) obj2));
    }
}
