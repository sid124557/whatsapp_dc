package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C59762xR;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2", f = "AvatarStickersRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ C59762xR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2(C59762xR r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            this.this$0.A01.A09("no avatar on backend");
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2(this.this$0, (C84814Du) obj2));
    }
}
