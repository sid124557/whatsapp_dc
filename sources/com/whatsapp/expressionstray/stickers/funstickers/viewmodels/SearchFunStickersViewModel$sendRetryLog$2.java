package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C58422vE;
import X.C59022wD;
import X.C616131n;
import X.C618332l;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.funstickers.logging.FunStickersFetchLogger$logRetry$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$sendRetryLog$2", f = "SearchFunStickersViewModel.kt", i = {}, l = {453}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$sendRetryLog$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$sendRetryLog$2(SearchFunStickersViewModel searchFunStickersViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = searchFunStickersViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C618332l r3 = this.this$0.A0M;
            this.label = 1;
            if ((r3.A03 != null && r3.A08.A0Y(C58422vE.A02, 5325) && C616131n.A00(this, r3.A0A, new FunStickersFetchLogger$logRetry$2(r3, (C84814Du) null)) == r4) || C59022wD.A00 == r4) {
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
        return new SearchFunStickersViewModel$sendRetryLog$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new SearchFunStickersViewModel$sendRetryLog$2(this.this$0, (C84814Du) obj2));
    }
}
