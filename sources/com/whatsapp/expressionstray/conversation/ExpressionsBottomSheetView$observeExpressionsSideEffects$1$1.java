package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass001;
import X.AnonymousClass0GC;
import X.AnonymousClass0IQ;
import X.AnonymousClass0O9;
import X.AnonymousClass218;
import X.AnonymousClass4C8;
import X.AnonymousClass4GR;
import X.C15910sA;
import X.C162457s7;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85534Gq;
import X.C86054Iq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView$observeExpressionsSideEffects$1$1", f = "ExpressionsBottomSheetView.kt", i = {}, l = {272}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsBottomSheetView$observeExpressionsSideEffects$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C15910sA $it;
    public int label;
    public final /* synthetic */ ExpressionsBottomSheetView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsBottomSheetView$observeExpressionsSideEffects$1$1(C15910sA r2, ExpressionsBottomSheetView expressionsBottomSheetView, C84814Du r4) {
        super(r4, 2);
        this.this$0 = expressionsBottomSheetView;
        this.$it = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C85534Gq r2 = this.this$0.getExpressionsViewModel().A0F;
            AnonymousClass0O9 lifecycle = this.$it.getLifecycle();
            C162457s7.A0D(lifecycle);
            AnonymousClass4C8 A00 = AnonymousClass0IQ.A00(AnonymousClass0GC.STARTED, lifecycle, r2);
            C86054Iq r0 = new C86054Iq(this.this$0, 18);
            this.label = 1;
            if (A00.Az8(this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ExpressionsBottomSheetView$observeExpressionsSideEffects$1$1(this.$it, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
