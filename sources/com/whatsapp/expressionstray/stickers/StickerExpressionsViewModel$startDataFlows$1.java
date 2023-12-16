package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass0IV;
import X.AnonymousClass20D;
import X.AnonymousClass28P;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import X.C85494Gl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$startDataFlows$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$startDataFlows$1 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$startDataFlows$1(StickerExpressionsViewModel stickerExpressionsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            C616131n.A02((C85494Gl) null, new StickerExpressionsViewModel$handleAvatarEvent$1(stickerExpressionsViewModel, (AnonymousClass28P) this.L$0, (C84814Du) null), AnonymousClass0IV.A00(stickerExpressionsViewModel), (AnonymousClass20D) null, 3);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        StickerExpressionsViewModel$startDataFlows$1 stickerExpressionsViewModel$startDataFlows$1 = new StickerExpressionsViewModel$startDataFlows$1(this.this$0, r4);
        stickerExpressionsViewModel$startDataFlows$1.L$0 = obj;
        return stickerExpressionsViewModel$startDataFlows$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
