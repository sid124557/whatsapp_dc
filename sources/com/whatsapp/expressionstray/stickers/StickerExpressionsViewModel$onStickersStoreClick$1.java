package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass1TM;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C23981Vq;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85534Gq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onStickersStoreClick$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {857}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$onStickersStoreClick$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$onStickersStoreClick$1(StickerExpressionsViewModel stickerExpressionsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            this.this$0.A0M.BhD(new C23981Vq());
            C85534Gq r1 = this.this$0.A0e;
            AnonymousClass1TM r0 = AnonymousClass1TM.A00;
            this.label = 1;
            if (r1.B2K(r0, this) == r3) {
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
        return new StickerExpressionsViewModel$onStickersStoreClick$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new StickerExpressionsViewModel$onStickersStoreClick$1(this.this$0, (C84814Du) obj2));
    }
}
