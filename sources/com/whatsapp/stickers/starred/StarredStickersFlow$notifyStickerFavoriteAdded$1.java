package com.whatsapp.stickers.starred;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C32811rf;
import X.C32821rg;
import X.C57682u2;
import X.C58912w1;
import X.C59022wD;
import X.C73723fy;
import X.C75003pT;
import X.C84814Du;
import X.C85534Gq;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.starred.StarredStickersFlow$notifyStickerFavoriteAdded$1", f = "StarredStickersFlow.kt", i = {}, l = {150, 153}, m = "invokeSuspend", n = {}, s = {})
public final class StarredStickersFlow$notifyStickerFavoriteAdded$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ boolean $isAvatarSticker;
    public final /* synthetic */ Collection $starredStickers;
    public int label;
    public final /* synthetic */ C58912w1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarredStickersFlow$notifyStickerFavoriteAdded$1(C58912w1 r2, Collection collection, C84814Du r4, boolean z) {
        super(r4, 2);
        this.$isAvatarSticker = z;
        this.this$0 = r2;
        this.$starredStickers = collection;
    }

    public final Object A09(Object obj) {
        Object r0;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            boolean z = this.$isAvatarSticker;
            C85534Gq r2 = this.this$0.A00;
            List A0F = C73723fy.A0F(this.$starredStickers);
            if (z) {
                r0 = new C32811rf(A0F);
                this.label = 1;
            } else {
                r0 = new C32821rg(A0F);
                this.label = 2;
            }
            if (r2.B2K(r0, this) == r6) {
                return r6;
            }
        } else if (i == 1 || i == 2) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new StarredStickersFlow$notifyStickerFavoriteAdded$1(this.this$0, this.$starredStickers, r6, this.$isAvatarSticker);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
