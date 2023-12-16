package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass1TG;
import X.AnonymousClass1Tb;
import X.AnonymousClass218;
import X.AnonymousClass39M;
import X.AnonymousClass4GR;
import X.C45952aq;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85534Gq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onStickerSelected$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {887}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$onStickerSelected$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $position;
    public final /* synthetic */ AnonymousClass39M $sticker;
    public final /* synthetic */ Integer $stickerSendOrigin;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$onStickerSelected$1(StickerExpressionsViewModel stickerExpressionsViewModel, AnonymousClass39M r3, Integer num, C84814Du r5, int i) {
        super(r5, 2);
        this.this$0 = stickerExpressionsViewModel;
        this.$sticker = r3;
        this.$stickerSendOrigin = num;
        this.$position = i;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C85534Gq r4 = this.this$0.A0e;
            AnonymousClass1TG r0 = new AnonymousClass1TG(this.$sticker, this.$stickerSendOrigin, this.$position);
            this.label = 1;
            if (r4.B2K(r0, this) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        C45952aq r1 = this.this$0.A0F;
        AnonymousClass1Tb r02 = AnonymousClass1Tb.A00;
        r1.A00(r02, r02, 7);
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new StickerExpressionsViewModel$onStickerSelected$1(this.this$0, this.$sticker, this.$stickerSendOrigin, r8, this.$position);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
