package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass001;
import X.AnonymousClass1Tb;
import X.AnonymousClass1UR;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85534Gq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$onMoveToStickerPage$1", f = "ExpressionsKeyboardViewModel.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardViewModel$onMoveToStickerPage$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $stickerPage;
    public int label;
    public final /* synthetic */ ExpressionsKeyboardViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardViewModel$onMoveToStickerPage$1(ExpressionsKeyboardViewModel expressionsKeyboardViewModel, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = expressionsKeyboardViewModel;
        this.$stickerPage = str;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            this.this$0.A0E(AnonymousClass1Tb.A00);
            C85534Gq r2 = this.this$0.A0G;
            AnonymousClass1UR r0 = new AnonymousClass1UR(this.$stickerPage);
            this.label = 1;
            if (r2.B2K(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ExpressionsKeyboardViewModel$onMoveToStickerPage$1(this.this$0, this.$stickerPage, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
