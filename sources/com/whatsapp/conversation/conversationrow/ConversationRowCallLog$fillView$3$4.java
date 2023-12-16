package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass218;
import X.AnonymousClass3ZF;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.C22691Pe;
import X.C30401mO;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$3$4", f = "ConversationRowCallLog.kt", i = {}, l = {281}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowCallLog$fillView$3$4 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass3ZF $callLog;
    public final /* synthetic */ int $dialogShowLimit;
    public final /* synthetic */ C30401mO $fMessage;
    public final /* synthetic */ int $shownTime;
    public int label;
    public final /* synthetic */ C22691Pe this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$3$4$1", f = "ConversationRowCallLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$3$4$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            if (this.label == 0) {
                C57682u2.A01(obj);
                int i = i2;
                if (i < 0 || (i != 0 && i3 >= i)) {
                    return AnonymousClass0x9.A0k(r4.getCallsManager().Bpk(r4.getContext(), A0A, A00, r6.A0L));
                }
                CallConfirmationFragment.A01(r4.A0X, A0A, AnonymousClass0x9.A0k(A00), A0P, i2, r6.A0L);
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public final C84814Du A0A(Object obj, C84814Du r11) {
            int i = i2;
            int i2 = i3;
            return new AnonymousClass1(r4, A0A, r6, A0P, r11, i, i2, A00);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowCallLog$fillView$3$4(C30401mO r2, C22691Pe r3, AnonymousClass3ZF r4, C84814Du r5, int i, int i2) {
        super(r5, 2);
        this.this$0 = r3;
        this.$callLog = r4;
        this.$fMessage = r2;
        this.$dialogShowLimit = i;
        this.$shownTime = i2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final AnonymousClass3ZH A0A = this.this$0.A0t.A0A(this.$callLog.A0E.A01);
            final int A00 = C22691Pe.A00(this.$fMessage);
            final String A0P = this.this$0.A0v.A0P(A0A, 7);
            C73853gB mainDispatcher = this.this$0.getMainDispatcher();
            final int i2 = this.$dialogShowLimit;
            final int i3 = this.$shownTime;
            final C22691Pe r4 = this.this$0;
            final AnonymousClass3ZF r6 = this.$callLog;
            AnonymousClass1 r3 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            obj = C616131n.A00(this, mainDispatcher, r3);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        return new ConversationRowCallLog$fillView$3$4(this.$fMessage, this.this$0, this.$callLog, r9, this.$dialogShowLimit, this.$shownTime);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
