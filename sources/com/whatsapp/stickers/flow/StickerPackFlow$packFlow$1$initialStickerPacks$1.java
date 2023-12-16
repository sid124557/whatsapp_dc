package com.whatsapp.stickers.flow;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.AnonymousClass8U9;
import X.C159507lx;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$initialStickerPacks$1", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$packFlow$1$initialStickerPacks$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1$initialStickerPacks$1(StickerPackFlow stickerPackFlow, C84814Du r3) {
        super(r3, 2);
        this.this$0 = stickerPackFlow;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            StickerPackFlow stickerPackFlow = this.this$0;
            AnonymousClass8U9 r2 = new AnonymousClass8U9();
            r2.addAll(stickerPackFlow.A05.A00(1));
            r2.addAll(stickerPackFlow.A0A.A01());
            return C159507lx.A0h(r2);
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new StickerPackFlow$packFlow$1$initialStickerPacks$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new StickerPackFlow$packFlow$1$initialStickerPacks$1(this.this$0, (C84814Du) obj2));
    }
}
