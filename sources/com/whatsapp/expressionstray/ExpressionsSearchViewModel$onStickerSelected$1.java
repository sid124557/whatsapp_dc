package com.whatsapp.expressionstray;

import X.AnonymousClass39M;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$onStickerSelected$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {257, 259}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onStickerSelected$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $position;
    public final /* synthetic */ AnonymousClass39M $sticker;
    public final /* synthetic */ Integer $stickerSendOrigin;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onStickerSelected$1(ExpressionsSearchViewModel expressionsSearchViewModel, AnonymousClass39M r3, Integer num, C84814Du r5, int i) {
        super(r5, 2);
        this.this$0 = expressionsSearchViewModel;
        this.$position = i;
        this.$sticker = r3;
        this.$stickerSendOrigin = num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r9) {
        /*
            r8 = this;
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r7) goto L_0x003d
            if (r0 != r6) goto L_0x004f
            X.C57682u2.A01(r9)
        L_0x000f:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0012:
            X.C57682u2.A01(r9)
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r1 = r8.this$0
            r1.A06 = r7
            int r0 = r8.$position
            r1.A01 = r0
            X.2hK r1 = r1.A0F
            X.39M r0 = r8.$sticker
            X.39M r4 = r1.A00(r0)
            if (r4 == 0) goto L_0x000f
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r0 = r8.this$0
            X.4Gq r3 = r0.A0I
            java.lang.Integer r2 = r8.$stickerSendOrigin
            int r1 = r8.$position
            X.1TG r0 = new X.1TG
            r0.<init>(r4, r2, r1)
            r8.label = r7
            java.lang.Object r0 = r3.B2K(r0, r8)
            if (r0 != r5) goto L_0x0040
            return r5
        L_0x003d:
            X.C57682u2.A01(r9)
        L_0x0040:
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r0 = r8.this$0
            X.4Gq r1 = r0.A0I
            X.1TH r0 = X.AnonymousClass1TH.A00
            r8.label = r6
            java.lang.Object r0 = r1.B2K(r0, r8)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x004f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.ExpressionsSearchViewModel$onStickerSelected$1.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        return new ExpressionsSearchViewModel$onStickerSelected$1(this.this$0, this.$sticker, this.$stickerSendOrigin, r8, this.$position);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
