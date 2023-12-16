package com.whatsapp.expressionstray;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C41562Ks;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.expressionstray.search.SearchQueryProvider$clearSearchQuery$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$onCleared$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onCleared$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onCleared$1(ExpressionsSearchViewModel expressionsSearchViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = expressionsSearchViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C41562Ks r3 = this.this$0.A0A;
            this.label = 1;
            if (C616131n.A00(this, r3.A00, new SearchQueryProvider$clearSearchQuery$2(r3, (C84814Du) null)) == r4 || C59022wD.A00 == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new ExpressionsSearchViewModel$onCleared$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new ExpressionsSearchViewModel$onCleared$1(this.this$0, (C84814Du) obj2));
    }
}
