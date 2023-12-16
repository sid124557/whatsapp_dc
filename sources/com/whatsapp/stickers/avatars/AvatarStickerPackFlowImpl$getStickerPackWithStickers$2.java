package com.whatsapp.stickers.avatars;

import X.AnonymousClass001;
import X.AnonymousClass2TU;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C50612iT;
import X.C55732qp;
import X.C57682u2;
import X.C59022wD;
import X.C73723fy;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerPackFlowImpl$getStickerPackWithStickers$2", f = "AvatarStickerPackFlowImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerPackFlowImpl$getStickerPackWithStickers$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass2TU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(AnonymousClass2TU r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C50612iT r3 = (C50612iT) C73723fy.A04(this.this$0.A02.A00(2));
            if (r3 == null) {
                return null;
            }
            AnonymousClass2TU r2 = this.this$0;
            List A02 = r2.A03.A02(r3.A0G);
            C55732qp r0 = r2.A00;
            C162457s7.A0H(A02);
            r0.A05(A02);
            r3.A05 = A02;
            return r3;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(this.this$0, (C84814Du) obj2));
    }
}
