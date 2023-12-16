package com.whatsapp.productinfra.avatar.ui.stickers.upsell;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C86614Ku;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3", f = "AvatarStickerUpsellViewController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ boolean $hasAvatarConfig;
    public int label;
    public final /* synthetic */ AvatarStickerUpsellViewController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3(AvatarStickerUpsellViewController avatarStickerUpsellViewController, C84814Du r3, boolean z) {
        super(r3, 2);
        this.this$0 = avatarStickerUpsellViewController;
        this.$hasAvatarConfig = z;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            this.this$0.A01.setVisibility(C86614Ku.A01(this.$hasAvatarConfig ? 1 : 0));
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3(this.this$0, r5, this.$hasAvatarConfig);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
