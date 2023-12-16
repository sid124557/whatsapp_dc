package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass1U7;
import X.AnonymousClass1U9;
import X.AnonymousClass218;
import X.AnonymousClass349;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C72023d3;
import X.C75003pT;
import X.C84814Du;
import X.C85524Gp;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$publishDynamicStickersUpdate$2", f = "StickerExpressionsViewModel.kt", i = {}, l = {567, 576}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$publishDynamicStickersUpdate$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ List $giphyTenorResult;
    public final /* synthetic */ List $localResults;
    public final /* synthetic */ List $whatsAppStoreResult;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$publishDynamicStickersUpdate$2(StickerExpressionsViewModel stickerExpressionsViewModel, List list, List list2, List list3, C84814Du r6) {
        super(r6, 2);
        this.$whatsAppStoreResult = list;
        this.this$0 = stickerExpressionsViewModel;
        this.$giphyTenorResult = list2;
        this.$localResults = list3;
    }

    public final Object A09(Object obj) {
        C85524Gp r2;
        Object obj2;
        List list;
        List list2;
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C6 r3 = (AnonymousClass4C6) this.L$0;
            List list3 = this.$whatsAppStoreResult;
            if (list3 != null) {
                this.this$0.A04 = list3;
            }
            List list4 = this.$giphyTenorResult;
            if (list4 != null) {
                this.this$0.A02 = list4;
            }
            this.this$0.A03 = this.$localResults;
            if (!AnonymousClass349.A04(r3) || (this.$localResults.isEmpty() && (list = this.this$0.A04) != null && list.isEmpty() && (list2 = this.this$0.A02) != null && list2.isEmpty())) {
                r2 = this.this$0.A0g;
                obj2 = AnonymousClass1U9.A00;
                this.label = 1;
            } else {
                StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
                List list5 = this.$localResults;
                List list6 = stickerExpressionsViewModel.A04;
                if (list6 == null) {
                    list6 = C72023d3.A00;
                }
                List list7 = stickerExpressionsViewModel.A02;
                if (list7 == null) {
                    list7 = C72023d3.A00;
                }
                List A0K = stickerExpressionsViewModel.A0K(list5, list6, list7);
                r2 = this.this$0.A0g;
                obj2 = new AnonymousClass1U7(A0K);
                this.label = 2;
            }
            if (r2.B2K(obj2, this) == r4) {
                return r4;
            }
        } else if (i == 1 || i == 2) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        StickerExpressionsViewModel$publishDynamicStickersUpdate$2 stickerExpressionsViewModel$publishDynamicStickersUpdate$2 = new StickerExpressionsViewModel$publishDynamicStickersUpdate$2(this.this$0, this.$whatsAppStoreResult, this.$giphyTenorResult, this.$localResults, r8);
        stickerExpressionsViewModel$publishDynamicStickersUpdate$2.L$0 = obj;
        return stickerExpressionsViewModel$publishDynamicStickersUpdate$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
