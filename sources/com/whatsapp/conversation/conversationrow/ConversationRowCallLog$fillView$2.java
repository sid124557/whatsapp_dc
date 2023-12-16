package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C18300x5;
import X.C22691Pe;
import X.C30401mO;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C623234o;
import X.C64773Ex;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import X.C95814uZ;
import android.content.res.Resources;
import com.whatsapp.TextEmojiLabel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$2", f = "ConversationRowCallLog.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowCallLog$fillView$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C30401mO $fMessage;
    public int label;
    public final /* synthetic */ C22691Pe this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$2$1", f = "ConversationRowCallLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            if (this.label == 0) {
                C57682u2.A01(obj);
                C22691Pe r0 = r3;
                TextEmojiLabel textEmojiLabel = r0.A09;
                C623234o callingMessageUtil = r0.getCallingMessageUtil();
                C30401mO r2 = r2;
                Resources resources = r3.getResources();
                C162457s7.A0D(resources);
                textEmojiLabel.setText(callingMessageUtil.A05(resources, r2, A0P));
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public final C84814Du A0A(Object obj, C84814Du r6) {
            return new AnonymousClass1(r2, r3, A0P, r6);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCallLog$fillView$2(C30401mO r2, C22691Pe r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r3;
        this.$fMessage = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C64773Ex r1 = this.this$0.A0t;
            C95814uZ r0 = this.$fMessage.A1J.A00;
            if (r0 != null) {
                final String A0P = this.this$0.A0v.A0P(r1.A0A(r0), 7);
                C73853gB mainDispatcher = this.this$0.getMainDispatcher();
                final C22691Pe r3 = this.this$0;
                final C30401mO r2 = this.$fMessage;
                AnonymousClass1 r02 = new AnonymousClass1((C84814Du) null);
                this.label = 1;
                if (C616131n.A00(this, mainDispatcher, r02) == r6) {
                    return r6;
                }
            } else {
                throw C18300x5.A0X();
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ConversationRowCallLog$fillView$2(this.$fMessage, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
