package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass1UD;
import X.AnonymousClass1UH;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C18310x6;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73723fy;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$handleCacheForStartScreen$1$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {286}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$handleCacheForStartScreen$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $jid;
    public Object L$0;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$handleCacheForStartScreen$1$1(SearchFunStickersViewModel searchFunStickersViewModel, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = searchFunStickersViewModel;
        this.$jid = str;
    }

    public final Object A09(Object obj) {
        SearchFunStickersViewModel searchFunStickersViewModel;
        AnonymousClass1UD r1;
        String str;
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            searchFunStickersViewModel = this.this$0;
            String str2 = this.$jid;
            this.L$0 = searchFunStickersViewModel;
            this.label = 1;
            obj = C616131n.A00(this, searchFunStickersViewModel.A0U, new SearchFunStickersViewModel$getCachedData$2(searchFunStickersViewModel, str2, (C84814Du) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            searchFunStickersViewModel = (SearchFunStickersViewModel) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        List list = (List) obj;
        if (list != null && C18310x6.A1X(list)) {
            Object A03 = C73723fy.A03(list);
            if (!(!(A03 instanceof AnonymousClass1UD) || (r1 = (AnonymousClass1UD) A03) == null || (str = r1.A00.A05) == null)) {
                searchFunStickersViewModel.A06.A0H(new AnonymousClass1UH(str, list));
            }
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new SearchFunStickersViewModel$handleCacheForStartScreen$1$1(this.this$0, this.$jid, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
