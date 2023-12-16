package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$launchAfterDataLoad$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {923, 924}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$launchAfterDataLoad$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GQ $block;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$launchAfterDataLoad$1(StickerExpressionsViewModel stickerExpressionsViewModel, C84814Du r3, AnonymousClass4GQ r4) {
        super(r3, 2);
        this.this$0 = stickerExpressionsViewModel;
        this.$block = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r5) {
        /*
            r4 = this;
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r1) goto L_0x0022
            if (r0 != r2) goto L_0x0030
            X.C57682u2.A01(r5)
        L_0x000f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0012:
            X.C57682u2.A01(r5)
            com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r0 = r4.this$0
            X.4Gg r0 = r0.A0a
            r4.label = r1
            java.lang.Object r0 = r0.Axa(r4)
            if (r0 != r3) goto L_0x0025
            return r3
        L_0x0022:
            X.C57682u2.A01(r5)
        L_0x0025:
            X.4GQ r0 = r4.$block
            r4.label = r2
            java.lang.Object r0 = r0.invoke(r4)
            if (r0 != r3) goto L_0x000f
            return r3
        L_0x0030:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$launchAfterDataLoad$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new StickerExpressionsViewModel$launchAfterDataLoad$1(this.this$0, r5, this.$block);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
