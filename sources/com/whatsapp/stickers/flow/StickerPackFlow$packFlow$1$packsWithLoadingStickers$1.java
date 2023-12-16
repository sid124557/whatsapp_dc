package com.whatsapp.stickers.flow;

import X.AnonymousClass001;
import X.AnonymousClass2X2;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C32701rT;
import X.C50612iT;
import X.C54972pa;
import X.C57682u2;
import X.C59022wD;
import X.C73783g4;
import X.C75003pT;
import X.C84814Du;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$packsWithLoadingStickers$1", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$packFlow$1$packsWithLoadingStickers$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ List $initialStickerPacks;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1$packsWithLoadingStickers$1(StickerPackFlow stickerPackFlow, List list, C84814Du r4) {
        super(r4, 2);
        this.this$0 = stickerPackFlow;
        this.$initialStickerPacks = list;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            Set A00 = this.this$0.A06.A00();
            List<C50612iT> list = this.$initialStickerPacks;
            StickerPackFlow stickerPackFlow = this.this$0;
            ArrayList A0c = C73783g4.A0c(list);
            for (C50612iT r2 : list) {
                C54972pa r0 = stickerPackFlow.A07;
                String str = r2.A0G;
                AnonymousClass2X2.A00(r2, r0, str);
                r2.A07 = A00.contains(str);
                C162457s7.A0D(str);
                A0c.add(new C32701rT(r2, str));
            }
            return A0c;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new StickerPackFlow$packFlow$1$packsWithLoadingStickers$1(this.this$0, this.$initialStickerPacks, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
