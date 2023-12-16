package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass34A;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopRollingPrompt$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$stopRollingPrompt$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$stopRollingPrompt$1(SearchFunStickersViewModel searchFunStickersViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = searchFunStickersViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C85474Gj r0 = this.this$0.A04;
            if (r0 != null) {
                this.label = 1;
                if (AnonymousClass34A.A00(this, r0) == r2) {
                    return r2;
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new SearchFunStickersViewModel$stopRollingPrompt$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new SearchFunStickersViewModel$stopRollingPrompt$1(this.this$0, (C84814Du) obj2));
    }
}
