package com.whatsapp.stickers.flow;

import X.AnonymousClass001;
import X.AnonymousClass2X2;
import X.AnonymousClass4GR;
import X.AnonymousClass4Gm;
import X.C32671rQ;
import X.C48272ed;
import X.C50612iT;
import X.C57682u2;
import X.C59022wD;
import X.C73783g4;
import X.C75003pT;
import X.C84814Du;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4Gm $$this$callbackFlow;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1(StickerPackFlow stickerPackFlow, C84814Du r3, AnonymousClass4Gm r4) {
        super(r3, 2);
        this.this$0 = stickerPackFlow;
        this.$$this$callbackFlow = r4;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            StickerPackFlow stickerPackFlow = this.this$0;
            List<C48272ed> list = stickerPackFlow.A00.A00;
            ArrayList A0c = C73783g4.A0c(list);
            for (C48272ed r3 : list) {
                C50612iT A00 = r3.A00();
                AnonymousClass2X2.A00(A00, stickerPackFlow.A07, A00.A0G);
                A0c.add(r3);
            }
            StickerPackFlow.A00(new C32671rQ(A0c), this.this$0, this.$$this$callbackFlow);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1(this.this$0, r5, this.$$this$callbackFlow);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
