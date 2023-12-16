package com.whatsapp.avatar.init;

import X.AnonymousClass001;
import X.AnonymousClass3DK;
import X.AnonymousClass4GR;
import X.C18260x0;
import X.C43222Rg;
import X.C54612p0;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.init.AvatarAsyncInit$checkHasAvatarUser$1", f = "AvatarAsyncInit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarAsyncInit$checkHasAvatarUser$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass3DK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarAsyncInit$checkHasAvatarUser$1(AnonymousClass3DK r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            if (((C54612p0) ((C43222Rg) this.this$0.A05.get()).A04.get()).A00() != null) {
                return true;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("AvatarAsyncInit");
            C18260x0.A1J(A0o, "/shouldDownloadAvatarStickerPack: user has no Avatar user");
            return null;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new AvatarAsyncInit$checkHasAvatarUser$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new AvatarAsyncInit$checkHasAvatarUser$1(this.this$0, (C84814Du) obj2));
    }
}
