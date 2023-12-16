package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C18260x0;
import X.C56952sp;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C616231o;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {524}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ List $lastResult;
    public final /* synthetic */ List $localResults;
    public final /* synthetic */ String $searchText;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {526, 527}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                long A06 = C56952sp.A06(StickerExpressionsViewModel.this.A0C.A00, 5423);
                this.label = 1;
                if (C616231o.A00(this, A06) == r5) {
                    return r5;
                }
            } else if (i == 1) {
                C57682u2.A01(obj);
            } else if (i == 2) {
                try {
                    C57682u2.A01(obj);
                } catch (Exception e) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "StickerExpressionsViewModel/fetchMoreGiphyTenorStickers/error = ", e);
                }
                return C59022wD.A00;
            } else {
                throw AnonymousClass001.A0d();
            }
            StickerExpressionsViewModel stickerExpressionsViewModel = StickerExpressionsViewModel.this;
            List list = list;
            String str = str;
            List list2 = list2;
            this.label = 2;
            if (stickerExpressionsViewModel.A0G(str, list, list2, this) == r5) {
                return r5;
            }
            return C59022wD.A00;
        }

        public final C84814Du A0A(Object obj, C84814Du r8) {
            return new AnonymousClass1(str, list, list2, r8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1(StickerExpressionsViewModel stickerExpressionsViewModel, String str, List list, List list2, C84814Du r6) {
        super(r6, 2);
        this.this$0 = stickerExpressionsViewModel;
        this.$localResults = list;
        this.$searchText = str;
        this.$lastResult = list2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            C73853gB r0 = stickerExpressionsViewModel.A0b;
            final List list = this.$localResults;
            final String str = this.$searchText;
            final List list2 = this.$lastResult;
            AnonymousClass1 r3 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616131n.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new StickerExpressionsViewModel$fetchMoreGiphyTenorStickers$1(this.this$0, this.$searchText, this.$localResults, this.$lastResult, r8);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
