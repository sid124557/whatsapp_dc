package com.whatsapp.expressionstray.gifs;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C159517ly;
import X.C57682u2;
import X.C59022wD;
import X.C72923eW;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel$retry$1", f = "GifExpressionsSearchViewModel.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
public final class GifExpressionsSearchViewModel$retry$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ GifExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifExpressionsSearchViewModel$retry$1(GifExpressionsSearchViewModel gifExpressionsSearchViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = gifExpressionsSearchViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C72923eW r0 = new C72923eW((C85474Gj) null, this.this$0.A05.A01);
            this.label = 1;
            obj = C159517ly.A01(this, r0);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        String str = (String) obj;
        if (str != null) {
            this.this$0.A0D(str);
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new GifExpressionsSearchViewModel$retry$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new GifExpressionsSearchViewModel$retry$1(this.this$0, (C84814Du) obj2));
    }
}
