package com.whatsapp.expressionstray.stickers.funstickers.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass218;
import X.AnonymousClass330;
import X.AnonymousClass33p;
import X.AnonymousClass39M;
import X.AnonymousClass3Z6;
import X.AnonymousClass4GR;
import X.C18270x1;
import X.C18280x3;
import X.C54992pc;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C627536m;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.stickers.WebpUtils;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$shareSticker$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {550}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$shareSticker$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $position;
    public final /* synthetic */ AnonymousClass39M $sticker;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$shareSticker$1$1", f = "SearchFunStickersViewModel.kt", i = {0}, l = {575}, m = "invokeSuspend", n = {"stickerToSend"}, s = {"L$0"})
    /* renamed from: com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$shareSticker$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public Object L$0;
        public int label;

        public final Object A09(Object obj) {
            byte[] bArr;
            Object obj2;
            AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C57682u2.A01(obj);
                SearchFunStickersViewModel searchFunStickersViewModel = SearchFunStickersViewModel.this;
                searchFunStickersViewModel.A05 = true;
                AnonymousClass39M r3 = r3;
                SearchFunStickersViewModel.A00(searchFunStickersViewModel, r3);
                String str = r3.A0D;
                if (str != null) {
                    SearchFunStickersViewModel searchFunStickersViewModel2 = SearchFunStickersViewModel.this;
                    AnonymousClass39M r1 = r3;
                    File A02 = searchFunStickersViewModel2.A0C.A02(str);
                    String str2 = r1.A09;
                    if (!A02.exists() && str2 != null) {
                        C627536m.A0N(searchFunStickersViewModel2.A0I, AnonymousClass002.A0B(str2), A02);
                    }
                    AnonymousClass39M.A01(r3, A02);
                    r3.A01 = 1;
                    WebpUtils webpUtils = searchFunStickersViewModel2.A0P;
                    AnonymousClass330 r0 = r3.A04;
                    if (r0 != null) {
                        bArr = r0.A02();
                    } else {
                        bArr = null;
                    }
                    webpUtils.A03(A02, bArr);
                }
                AnonymousClass33p r2 = SearchFunStickersViewModel.this.A0E;
                if (!C18280x3.A1W(AnonymousClass0x2.A0F(r2), "fun_stickers_upsell_dismissed")) {
                    C18270x1.A0v(r2, "fun_stickers_upsell_dismissed", true);
                }
                C54992pc r02 = SearchFunStickersViewModel.this.A0J;
                this.L$0 = r3;
                this.label = 1;
                Object A00 = r02.A00(r3, this);
                obj2 = r3;
                if (A00 == r4) {
                    return r4;
                }
            } else if (i == 1) {
                Object obj3 = this.L$0;
                C57682u2.A01(obj);
                obj2 = obj3;
            } else {
                throw AnonymousClass001.A0d();
            }
            SearchFunStickersViewModel.this.A0R.A0G(AnonymousClass3Z6.A02(obj2, AnonymousClass0x9.A0k(i2)));
            return C59022wD.A00;
        }

        public final C84814Du A0A(Object obj, C84814Du r6) {
            return new AnonymousClass1(r3, r6, i2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$shareSticker$1(SearchFunStickersViewModel searchFunStickersViewModel, AnonymousClass39M r3, C84814Du r4, int i) {
        super(r4, 2);
        this.this$0 = searchFunStickersViewModel;
        this.$sticker = r3;
        this.$position = i;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r7 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            final SearchFunStickersViewModel searchFunStickersViewModel = this.this$0;
            C73853gB r4 = searchFunStickersViewModel.A0U;
            final AnonymousClass39M r3 = this.$sticker;
            final int i2 = this.$position;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616131n.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new SearchFunStickersViewModel$shareSticker$1(this.this$0, this.$sticker, r6, this.$position);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
