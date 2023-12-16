package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass001;
import X.AnonymousClass1TF;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C105425Uw;
import X.C162457s7;
import X.C51662kB;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85534Gq;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onShapeSelected$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {847}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$onShapeSelected$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C51662kB $shape;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$onShapeSelected$1(Context context, StickerExpressionsViewModel stickerExpressionsViewModel, C51662kB r4, C84814Du r5) {
        super(r5, 2);
        this.$shape = r4;
        this.$context = context;
        this.this$0 = stickerExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C105425Uw B13 = this.$shape.A00.B13(this.$context, this.this$0.A0B, false);
            C85534Gq r1 = this.this$0.A0e;
            C162457s7.A0H(B13);
            AnonymousClass1TF r0 = new AnonymousClass1TF(B13);
            this.label = 1;
            if (r1.B2K(r0, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new StickerExpressionsViewModel$onShapeSelected$1(this.$context, this.this$0, this.$shape, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
