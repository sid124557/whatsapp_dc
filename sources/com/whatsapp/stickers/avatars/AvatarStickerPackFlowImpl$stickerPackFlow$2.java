package com.whatsapp.stickers.avatars;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2TU;
import X.AnonymousClass4C9;
import X.AnonymousClass4GR;
import X.C30131lu;
import X.C30151lw;
import X.C50612iT;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerPackFlowImpl$stickerPackFlow$2", f = "AvatarStickerPackFlowImpl.kt", i = {0}, l = {101, 103, 105}, m = "invokeSuspend", n = {"$this$onSubscription"}, s = {"L$0"})
public final class AvatarStickerPackFlowImpl$stickerPackFlow$2 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass2TU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackFlowImpl$stickerPackFlow$2(AnonymousClass2TU r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass4C9 r4;
        Object r1;
        AnonymousClass218 r7 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            r4 = (AnonymousClass4C9) this.L$0;
            AnonymousClass2TU r3 = this.this$0;
            this.L$0 = r4;
            this.label = 1;
            obj = C616131n.A00(this, r3.A04, new AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(r3, (C84814Du) null));
            if (obj == r7) {
                return r7;
            }
        } else if (i == 1) {
            r4 = (AnonymousClass4C9) this.L$0;
            C57682u2.A01(obj);
        } else if (i == 2 || i == 3) {
            C57682u2.A01(obj);
            return C59022wD.A00;
        } else {
            throw AnonymousClass001.A0d();
        }
        C50612iT r9 = (C50612iT) obj;
        if (r9 != null) {
            r1 = new C30131lu(r9);
            this.L$0 = null;
            this.label = 2;
        } else {
            r1 = new C30151lw("onSubscription pack was null");
            this.L$0 = null;
            this.label = 3;
        }
        if (r4.B2K(r1, this) == r7) {
            return r7;
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        AvatarStickerPackFlowImpl$stickerPackFlow$2 avatarStickerPackFlowImpl$stickerPackFlow$2 = new AvatarStickerPackFlowImpl$stickerPackFlow$2(this.this$0, r4);
        avatarStickerPackFlowImpl$stickerPackFlow$2.L$0 = obj;
        return avatarStickerPackFlowImpl$stickerPackFlow$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
