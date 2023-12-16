package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runOnCoroutineScope$1$1", f = "ConversationRowCallLog.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowCallLog$runOnCoroutineScope$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GR $block;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCallLog$runOnCoroutineScope$1$1(C84814Du r2, AnonymousClass4GR r3) {
        super(r2, 2);
        this.$block = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            Object obj2 = this.L$0;
            AnonymousClass4GR r0 = this.$block;
            this.label = 1;
            if (r0.invoke(obj2, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        ConversationRowCallLog$runOnCoroutineScope$1$1 conversationRowCallLog$runOnCoroutineScope$1$1 = new ConversationRowCallLog$runOnCoroutineScope$1$1(r4, this.$block);
        conversationRowCallLog$runOnCoroutineScope$1$1.L$0 = obj;
        return conversationRowCallLog$runOnCoroutineScope$1$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
