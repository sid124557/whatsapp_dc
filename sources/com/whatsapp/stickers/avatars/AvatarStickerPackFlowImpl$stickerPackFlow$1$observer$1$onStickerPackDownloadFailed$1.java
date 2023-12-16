package com.whatsapp.stickers.avatars;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2TU;
import X.AnonymousClass4GR;
import X.AnonymousClass4Gm;
import X.C30131lu;
import X.C30151lw;
import X.C50612iT;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1", f = "AvatarStickerPackFlowImpl.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4Gm $$this$callbackFlow;
    public int label;
    public final /* synthetic */ AnonymousClass2TU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1(AnonymousClass2TU r2, C84814Du r3, AnonymousClass4Gm r4) {
        super(r3, 2);
        this.this$0 = r2;
        this.$$this$callbackFlow = r4;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass2TU r3 = this.this$0;
            this.label = 1;
            obj = C616131n.A00(this, r3.A04, new AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(r3, (C84814Du) null));
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        C50612iT r6 = (C50612iT) obj;
        if (r6 != null) {
            this.$$this$callbackFlow.BrD(new C30131lu(r6));
        } else {
            this.$$this$callbackFlow.BrD(new C30151lw("onStickerPackDownloadFailed"));
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarStickerPackFlowImpl$stickerPackFlow$1$observer$1$onStickerPackDownloadFailed$1(this.this$0, r5, this.$$this$callbackFlow);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
