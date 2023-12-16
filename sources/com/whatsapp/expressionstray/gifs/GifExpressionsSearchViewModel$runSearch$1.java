package com.whatsapp.expressionstray.gifs;

import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass218;
import X.AnonymousClass4AL;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C18310x6;
import X.C49872hE;
import X.C57682u2;
import X.C59022wD;
import X.C616231o;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel$runSearch$1", f = "GifExpressionsSearchViewModel.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
public final class GifExpressionsSearchViewModel$runSearch$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $searchQuery;
    public int label;
    public final /* synthetic */ GifExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifExpressionsSearchViewModel$runSearch$1(GifExpressionsSearchViewModel gifExpressionsSearchViewModel, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = gifExpressionsSearchViewModel;
        this.$searchQuery = str;
    }

    public final Object A09(Object obj) {
        C49872hE A01;
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            this.label = 1;
            if (C616231o.A00(this, 500) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        GifExpressionsSearchViewModel gifExpressionsSearchViewModel = this.this$0;
        String str = this.$searchQuery;
        AnonymousClass08M r3 = gifExpressionsSearchViewModel.A03;
        C49872hE r22 = (C49872hE) r3.A07();
        if (r22 != null) {
            AnonymousClass4AL r1 = gifExpressionsSearchViewModel.A07;
            C162457s7.A0J(r1, 0);
            r22.A03.remove(r1);
        }
        if (str == null || str.length() == 0) {
            A01 = gifExpressionsSearchViewModel.A06.A01();
        } else {
            A01 = gifExpressionsSearchViewModel.A06.A02(str);
        }
        AnonymousClass4AL r12 = gifExpressionsSearchViewModel.A07;
        C162457s7.A0J(r12, 0);
        A01.A03.add(r12);
        if (C18310x6.A1X(A01.A04)) {
            r12.BaV(A01);
        }
        r3.A0H(A01);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new GifExpressionsSearchViewModel$runSearch$1(this.this$0, this.$searchQuery, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
