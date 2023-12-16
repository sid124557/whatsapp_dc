package com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist;

import X.AnonymousClass001;
import X.AnonymousClass0QU;
import X.AnonymousClass113;
import X.AnonymousClass218;
import X.AnonymousClass2C4;
import X.AnonymousClass2Rk;
import X.AnonymousClass4GR;
import X.C27991fJ;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesViewModel$refreshDb$1", f = "ReportToAdminMessagesViewModel.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
public final class ReportToAdminMessagesViewModel$refreshDb$1 extends C75003pT implements AnonymousClass4GR {
    public Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass113 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportToAdminMessagesViewModel$refreshDb$1(AnonymousClass113 r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass113 r5;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            r5 = this.this$0;
            AnonymousClass2Rk r4 = r5.A00;
            if (r4 != null) {
                C27991fJ r3 = r5.A06;
                this.L$0 = r5;
                this.label = 1;
                obj = C616131n.A00(this, AnonymousClass2C4.A01, new RtaMessagesDbRepo$getMessages$2((AnonymousClass0QU) null, r3, r4, (C84814Du) null));
                if (obj == r6) {
                    return r6;
                }
            }
            return C59022wD.A00;
        } else if (i == 1) {
            r5 = (AnonymousClass113) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        r5.A01.A0G(obj);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new ReportToAdminMessagesViewModel$refreshDb$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new ReportToAdminMessagesViewModel$refreshDb$1(this.this$0, (C84814Du) obj2));
    }
}
