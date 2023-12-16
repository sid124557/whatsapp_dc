package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass26X;
import X.AnonymousClass3Z6;
import X.AnonymousClass4GR;
import X.C381826a;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85524Gp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$observerSearchProvider$2", f = "StickerExpressionsViewModel.kt", i = {}, l = {206, 208}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$observerSearchProvider$2 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$observerSearchProvider$2(StickerExpressionsViewModel stickerExpressionsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        Object B2K;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass3Z6 r1 = (AnonymousClass3Z6) this.L$0;
            AnonymousClass26X r3 = (AnonymousClass26X) r1.first;
            StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            if (stickerExpressionsViewModel.A08) {
                this.label = 1;
                B2K = stickerExpressionsViewModel.A0F(r3, (String) r1.second, this);
            } else {
                C85524Gp r12 = stickerExpressionsViewModel.A0g;
                C381826a A0D = stickerExpressionsViewModel.A0D(r3);
                this.label = 2;
                B2K = r12.B2K(A0D, this);
            }
            if (B2K == r6) {
                return r6;
            }
        } else if (i == 1 || i == 2) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        StickerExpressionsViewModel$observerSearchProvider$2 stickerExpressionsViewModel$observerSearchProvider$2 = new StickerExpressionsViewModel$observerSearchProvider$2(this.this$0, r4);
        stickerExpressionsViewModel$observerSearchProvider$2.L$0 = obj;
        return stickerExpressionsViewModel$observerSearchProvider$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
