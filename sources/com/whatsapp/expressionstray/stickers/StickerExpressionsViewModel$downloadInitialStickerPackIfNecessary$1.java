package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass4GR;
import X.C18280x3;
import X.C57682u2;
import X.C59022wD;
import X.C69993Zl;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$downloadInitialStickerPackIfNecessary$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$downloadInitialStickerPackIfNecessary$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$downloadInitialStickerPackIfNecessary$1(StickerExpressionsViewModel stickerExpressionsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            if (!C18280x3.A1W(AnonymousClass0x2.A0F(this.this$0.A0A), "sticker_picker_initial_download")) {
                StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
                stickerExpressionsViewModel.A0Q.A00(new C69993Zl(stickerExpressionsViewModel, 16));
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new StickerExpressionsViewModel$downloadInitialStickerPackIfNecessary$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new StickerExpressionsViewModel$downloadInitialStickerPackIfNecessary$1(this.this$0, (C84814Du) obj2));
    }
}
