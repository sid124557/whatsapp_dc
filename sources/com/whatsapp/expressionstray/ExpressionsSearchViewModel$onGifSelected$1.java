package com.whatsapp.expressionstray;

import X.AnonymousClass001;
import X.AnonymousClass1TE;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C166177yG;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85534Gq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$onGifSelected$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onGifSelected$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C166177yG $result;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onGifSelected$1(ExpressionsSearchViewModel expressionsSearchViewModel, C166177yG r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = expressionsSearchViewModel;
        this.$result = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            ExpressionsSearchViewModel expressionsSearchViewModel = this.this$0;
            expressionsSearchViewModel.A06 = true;
            C85534Gq r2 = expressionsSearchViewModel.A0I;
            AnonymousClass1TE r0 = new AnonymousClass1TE(this.$result);
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
        return new ExpressionsSearchViewModel$onGifSelected$1(this.this$0, this.$result, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
