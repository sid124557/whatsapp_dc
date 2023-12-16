package com.whatsapp.expressionstray.gifs;

import X.AnonymousClass001;
import X.AnonymousClass1TE;
import X.AnonymousClass1Ta;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C166177yG;
import X.C45952aq;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85534Gq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel$onGifSelected$1", f = "GifExpressionsSearchViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
public final class GifExpressionsSearchViewModel$onGifSelected$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C166177yG $result;
    public int label;
    public final /* synthetic */ GifExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifExpressionsSearchViewModel$onGifSelected$1(GifExpressionsSearchViewModel gifExpressionsSearchViewModel, C166177yG r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = gifExpressionsSearchViewModel;
        this.$result = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C85534Gq r2 = this.this$0.A08;
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
        C45952aq r1 = this.this$0.A04;
        AnonymousClass1Ta r02 = AnonymousClass1Ta.A00;
        r1.A00(r02, r02, 7);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new GifExpressionsSearchViewModel$onGifSelected$1(this.this$0, this.$result, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
