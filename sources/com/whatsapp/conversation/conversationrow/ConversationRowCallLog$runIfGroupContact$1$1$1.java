package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runIfGroupContact$1$1$1", f = "ConversationRowCallLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowCallLog$runIfGroupContact$1$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GQ $block;
    public final /* synthetic */ AnonymousClass3ZH $it;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCallLog$runIfGroupContact$1$1$1(AnonymousClass3ZH r2, C84814Du r3, AnonymousClass4GQ r4) {
        super(r3, 2);
        this.$block = r4;
        this.$it = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            return this.$block.invoke(this.$it);
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ConversationRowCallLog$runIfGroupContact$1$1$1(this.$it, r5, this.$block);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
