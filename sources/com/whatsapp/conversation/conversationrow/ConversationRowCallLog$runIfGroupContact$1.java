package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass36T;
import X.AnonymousClass3ZF;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C22691Pe;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.jid.GroupJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runIfGroupContact$1", f = "ConversationRowCallLog.kt", i = {}, l = {310}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowCallLog$runIfGroupContact$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GQ $block;
    public final /* synthetic */ AnonymousClass3ZF $callLog;
    public int label;
    public final /* synthetic */ C22691Pe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCallLog$runIfGroupContact$1(C22691Pe r2, AnonymousClass3ZF r3, C84814Du r4, AnonymousClass4GQ r5) {
        super(r4, 2);
        this.$callLog = r3;
        this.this$0 = r2;
        this.$block = r5;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            boolean A1U = AnonymousClass000.A1U(this.$callLog.A0H, 2);
            GroupJid groupJid = this.$callLog.A05;
            C22691Pe r0 = this.this$0;
            AnonymousClass3ZH A01 = AnonymousClass36T.A01(r0.A0t, r0.A1V, groupJid, r0.A1y, A1U);
            obj = null;
            if (A01 != null) {
                C22691Pe r02 = this.this$0;
                AnonymousClass4GQ r2 = this.$block;
                C73853gB mainDispatcher = r02.getMainDispatcher();
                ConversationRowCallLog$runIfGroupContact$1$1$1 conversationRowCallLog$runIfGroupContact$1$1$1 = new ConversationRowCallLog$runIfGroupContact$1$1$1(A01, (C84814Du) null, r2);
                this.label = 1;
                obj = C616131n.A00(this, mainDispatcher, conversationRowCallLog$runIfGroupContact$1$1$1);
                if (obj == r6) {
                    return r6;
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new ConversationRowCallLog$runIfGroupContact$1(this.this$0, this.$callLog, r6, this.$block);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
