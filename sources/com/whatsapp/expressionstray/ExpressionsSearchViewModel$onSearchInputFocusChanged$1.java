package com.whatsapp.expressionstray;

import X.AnonymousClass001;
import X.AnonymousClass1TP;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C41562Ks;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.expressionstray.search.SearchQueryProvider$setSearchQuery$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$onSearchInputFocusChanged$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onSearchInputFocusChanged$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $currentPrompt;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onSearchInputFocusChanged$1(ExpressionsSearchViewModel expressionsSearchViewModel, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = expressionsSearchViewModel;
        this.$currentPrompt = str;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C41562Ks r4 = this.this$0.A0A;
            String str = this.$currentPrompt;
            this.label = 1;
            if (C616131n.A00(this, r4.A00, new SearchQueryProvider$setSearchQuery$2(r4, str, (C84814Du) null)) == r5 || C59022wD.A00 == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        ExpressionsSearchViewModel expressionsSearchViewModel = this.this$0;
        expressionsSearchViewModel.A07.A0H(new AnonymousClass1TP(expressionsSearchViewModel.A02, expressionsSearchViewModel.A03, this.$currentPrompt));
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ExpressionsSearchViewModel$onSearchInputFocusChanged$1(this.this$0, this.$currentPrompt, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
