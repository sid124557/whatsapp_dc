package com.whatsapp.expressionstray.search;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C41562Ks;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85524Gp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.search.SearchQueryProvider$clearSearchQuery$2", f = "SearchQueryProvider.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
public final class SearchQueryProvider$clearSearchQuery$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C41562Ks this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchQueryProvider$clearSearchQuery$2(C41562Ks r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C85524Gp r1 = this.this$0.A01;
            this.label = 1;
            if (r1.B2K((Object) null, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new SearchQueryProvider$clearSearchQuery$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new SearchQueryProvider$clearSearchQuery$2(this.this$0, (C84814Du) obj2));
    }
}
