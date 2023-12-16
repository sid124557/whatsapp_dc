package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass349;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.C52432lT;
import X.C52462lW;
import X.C57682u2;
import X.C59022wD;
import X.C616231o;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$rollingPrompt$1", f = "SearchFunStickersViewModel.kt", i = {0}, l = {186}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class SearchFunStickersViewModel$rollingPrompt$1 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$rollingPrompt$1(SearchFunStickersViewModel searchFunStickersViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = searchFunStickersViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass4C6 r2;
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            r2 = (AnonymousClass4C6) this.L$0;
            this.L$0 = r2;
            this.label = 1;
            if (C616231o.A00(this, 7000) == r3) {
                return r3;
            }
        } else if (i == 1) {
            r2 = (AnonymousClass4C6) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        if (AnonymousClass349.A04(r2)) {
            SearchFunStickersViewModel searchFunStickersViewModel = this.this$0;
            int i2 = searchFunStickersViewModel.A00;
            List list = searchFunStickersViewModel.A0S;
            int size = (i2 + 1) % list.size();
            searchFunStickersViewModel.A00 = size;
            int i3 = ((C52462lW) list.get(size)).A01;
            SearchFunStickersViewModel searchFunStickersViewModel2 = this.this$0;
            searchFunStickersViewModel2.A07.A0H(new C52432lT(i2, searchFunStickersViewModel2.A00, i3));
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        SearchFunStickersViewModel$rollingPrompt$1 searchFunStickersViewModel$rollingPrompt$1 = new SearchFunStickersViewModel$rollingPrompt$1(this.this$0, r4);
        searchFunStickersViewModel$rollingPrompt$1.L$0 = obj;
        return searchFunStickersViewModel$rollingPrompt$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
