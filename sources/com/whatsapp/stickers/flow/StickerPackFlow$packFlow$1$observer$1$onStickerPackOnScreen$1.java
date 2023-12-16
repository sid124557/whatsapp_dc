package com.whatsapp.stickers.flow;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass4Gm;
import X.C162457s7;
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

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onStickerPackOnScreen$1", f = "StickerPackFlow.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$packFlow$1$observer$1$onStickerPackOnScreen$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4Gm $$this$callbackFlow;
    public final /* synthetic */ C50612iT $stickerPack;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1$observer$1$onStickerPackOnScreen$1(C50612iT r2, StickerPackFlow stickerPackFlow, C84814Du r4, AnonymousClass4Gm r5) {
        super(r4, 2);
        this.this$0 = stickerPackFlow;
        this.$stickerPack = r2;
        this.$$this$callbackFlow = r5;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            StickerPackFlow stickerPackFlow = this.this$0;
            C50612iT r0 = this.$stickerPack;
            this.label = 1;
            obj = stickerPackFlow.A01(r0, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        List<C48272ed> list = this.this$0.A00.A00;
        C50612iT r5 = this.$stickerPack;
        ArrayList A0c = C73783g4.A0c(list);
        for (C48272ed r2 : list) {
            A0c.add(C162457s7.A0P(r2.A01(), r5.A0G) ? obj : r2);
        }
        StickerPackFlow.A00(new C32671rQ(A0c), this.this$0, this.$$this$callbackFlow);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new StickerPackFlow$packFlow$1$observer$1$onStickerPackOnScreen$1(this.$stickerPack, this.this$0, r6, this.$$this$callbackFlow);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
