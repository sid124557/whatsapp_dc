package com.whatsapp.expressionstray.gifs;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel$startDataLoad$1", f = "GifExpressionsSearchViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GifExpressionsSearchViewModel$startDataLoad$1 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ GifExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifExpressionsSearchViewModel$startDataLoad$1(GifExpressionsSearchViewModel gifExpressionsSearchViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = gifExpressionsSearchViewModel;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            this.this$0.A0D((String) this.L$0);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        GifExpressionsSearchViewModel$startDataLoad$1 gifExpressionsSearchViewModel$startDataLoad$1 = new GifExpressionsSearchViewModel$startDataLoad$1(this.this$0, r4);
        gifExpressionsSearchViewModel$startDataLoad$1.L$0 = obj;
        return gifExpressionsSearchViewModel$startDataLoad$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
