package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass28Q;
import X.AnonymousClass4GR;
import X.C30131lu;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$handleAvatarStickerPackEvent$1", f = "ExpressionsKeyboardViewModel.kt", i = {}, l = {406}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardViewModel$handleAvatarStickerPackEvent$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass28Q $event;
    public int label;
    public final /* synthetic */ ExpressionsKeyboardViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardViewModel$handleAvatarStickerPackEvent$1(ExpressionsKeyboardViewModel expressionsKeyboardViewModel, AnonymousClass28Q r3, C84814Du r4) {
        super(r4, 2);
        this.$event = r3;
        this.this$0 = expressionsKeyboardViewModel;
    }

    public final Object A09(Object obj) {
        Object obj2;
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            if (this.$event instanceof C30131lu) {
                ExpressionsKeyboardViewModel expressionsKeyboardViewModel = this.this$0;
                this.label = 1;
                if (expressionsKeyboardViewModel.A0A.A01()) {
                    obj2 = C616131n.A00(this, expressionsKeyboardViewModel.A0D, new ExpressionsKeyboardViewModel$fetchAvatarDynamicIcon$2(expressionsKeyboardViewModel, (C84814Du) null));
                } else {
                    obj2 = C59022wD.A00;
                }
                if (obj2 == r4) {
                    return r4;
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ExpressionsKeyboardViewModel$handleAvatarStickerPackEvent$1(this.this$0, this.$event, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
