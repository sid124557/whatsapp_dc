package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85444Gg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeAvatarStickers$2", f = "AvatarExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$observeAvatarStickers$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$observeAvatarStickers$2(AvatarExpressionsViewModel avatarExpressionsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = avatarExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C85444Gg r1 = this.this$0.A0C;
            C59022wD r0 = C59022wD.A00;
            r1.AzH(r0);
            return r0;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new AvatarExpressionsViewModel$observeAvatarStickers$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new AvatarExpressionsViewModel$observeAvatarStickers$2(this.this$0, (C84814Du) obj2));
    }
}
