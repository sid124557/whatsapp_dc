package com.whatsapp.stickers.starred;

import X.AnonymousClass001;
import X.AnonymousClass20D;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.AnonymousClass4Gm;
import X.AnonymousClass4HP;
import X.C29361ih;
import X.C57682u2;
import X.C57732u7;
import X.C58912w1;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C81253za;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.starred.StarredStickersFlow$stickerCallbackFlow$1", f = "StarredStickersFlow.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
public final class StarredStickersFlow$stickerCallbackFlow$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C29361ih $stickerObservers;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C58912w1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarredStickersFlow$stickerCallbackFlow$1(C29361ih r2, C58912w1 r3, C84814Du r4) {
        super(r4, 2);
        this.$stickerObservers = r2;
        this.this$0 = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4Gm r3 = (AnonymousClass4Gm) this.L$0;
            AnonymousClass4HP r2 = new AnonymousClass4HP(this.this$0, 5, r3);
            this.$stickerObservers.A06(r2);
            C616131n.A02(this.this$0.A04, new StarredStickersFlow$updateStickerList$1(this.this$0, (C84814Du) null, r3, 1), r3, (AnonymousClass20D) null, 2);
            C81253za r0 = new C81253za(r2, this.$stickerObservers);
            this.label = 1;
            if (C57732u7.A00(this, r0, r3) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        StarredStickersFlow$stickerCallbackFlow$1 starredStickersFlow$stickerCallbackFlow$1 = new StarredStickersFlow$stickerCallbackFlow$1(this.$stickerObservers, this.this$0, r5);
        starredStickersFlow$stickerCallbackFlow$1.L$0 = obj;
        return starredStickersFlow$stickerCallbackFlow$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
