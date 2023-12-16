package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass218;
import X.AnonymousClass39M;
import X.AnonymousClass3ZG;
import X.AnonymousClass4GR;
import X.C18290x4;
import X.C24641Ye;
import X.C54992pc;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C69883Yw;
import X.C71343bx;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.R;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onToggleFavoriteSticker$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {405}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$onToggleFavoriteSticker$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass39M $sticker;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onToggleFavoriteSticker$1$1", f = "SearchFunStickersViewModel.kt", i = {0, 0, 0}, l = {413}, m = "invokeSuspend", n = {"stickerToFavorite", "stickerToastString", "stickerAddToFavorite"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onToggleFavoriteSticker$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        public final Object A09(Object obj) {
            Object obj2;
            AnonymousClass3ZG r5;
            Object obj3;
            Object obj4;
            AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                AnonymousClass39M r3 = r2;
                SearchFunStickersViewModel.A00(searchFunStickersViewModel, r3);
                C69883Yw r2 = new C69883Yw();
                r2.element = R.string.f11nameremoved;
                if (!searchFunStickersViewModel.A0O.A0H(r3)) {
                    C24641Ye r52 = new C24641Ye();
                    r52.A00 = true;
                    r52.A02 = AnonymousClass0x9.A0k(6);
                    C54992pc r0 = searchFunStickersViewModel.A0J;
                    this.L$0 = r3;
                    this.L$1 = r2;
                    this.L$2 = r52;
                    this.label = 1;
                    Object A00 = r0.A00(r3, this);
                    obj3 = r3;
                    obj4 = r2;
                    r5 = r52;
                    if (A00 == r4) {
                        return r4;
                    }
                } else {
                    searchFunStickersViewModel.A0O.A0F(C18290x4.A13(r3));
                    r2.element = R.string.f11nameremoved;
                    obj2 = r2;
                    SearchFunStickersViewModel searchFunStickersViewModel2 = searchFunStickersViewModel;
                    searchFunStickersViewModel2.A0B.A0S(new C71343bx(searchFunStickersViewModel2, 40, obj2));
                    return C59022wD.A00;
                }
            } else if (i == 1) {
                Object obj5 = this.L$1;
                Object obj6 = this.L$0;
                C57682u2.A01(obj);
                r5 = (AnonymousClass3ZG) this.L$2;
                obj4 = obj5;
                obj3 = obj6;
            } else {
                throw AnonymousClass001.A0d();
            }
            searchFunStickersViewModel.A0O.A0G(C18290x4.A13(obj3), true);
            searchFunStickersViewModel.A0H.BhD(r5);
            obj2 = obj4;
            SearchFunStickersViewModel searchFunStickersViewModel22 = searchFunStickersViewModel;
            searchFunStickersViewModel22.A0B.A0S(new C71343bx(searchFunStickersViewModel22, 40, obj2));
            return C59022wD.A00;
        }

        public final C84814Du A0A(Object obj, C84814Du r5) {
            return new AnonymousClass1(searchFunStickersViewModel, r2, r5);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$onToggleFavoriteSticker$1(SearchFunStickersViewModel searchFunStickersViewModel, AnonymousClass39M r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = searchFunStickersViewModel;
        this.$sticker = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final SearchFunStickersViewModel searchFunStickersViewModel = this.this$0;
            C73853gB r3 = searchFunStickersViewModel.A0U;
            final AnonymousClass39M r2 = this.$sticker;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616131n.A00(this, r3, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new SearchFunStickersViewModel$onToggleFavoriteSticker$1(this.this$0, this.$sticker, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
