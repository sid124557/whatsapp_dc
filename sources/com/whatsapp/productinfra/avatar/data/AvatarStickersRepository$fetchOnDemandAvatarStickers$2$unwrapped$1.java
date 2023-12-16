package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass001;
import X.AnonymousClass1kq;
import X.AnonymousClass28J;
import X.AnonymousClass4GR;
import X.C29801lH;
import X.C57682u2;
import X.C59022wD;
import X.C59762xR;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1", f = "AvatarStickersRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass28J $error;
    public int label;
    public final /* synthetic */ C59762xR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1(C59762xR r2, AnonymousClass28J r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$error = r3;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            this.this$0.A01.A08(((C29801lH) ((AnonymousClass1kq) this.$error).A00).newRevision);
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$1(this.this$0, this.$error, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
