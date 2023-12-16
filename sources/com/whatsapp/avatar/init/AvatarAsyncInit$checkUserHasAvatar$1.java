package com.whatsapp.avatar.init;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass3DK;
import X.AnonymousClass4GR;
import X.C18260x0;
import X.C49652gs;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.init.AvatarAsyncInit$checkUserHasAvatar$1", f = "AvatarAsyncInit.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarAsyncInit$checkUserHasAvatar$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AnonymousClass3DK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarAsyncInit$checkUserHasAvatar$1(AnonymousClass3DK r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            this.label = 1;
            obj = ((C49652gs) this.this$0.A03.get()).A00(this, true);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        if (AnonymousClass001.A1Z(obj)) {
            return true;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarAsyncInit");
        C18260x0.A1J(A0o, "/shouldDownloadAvatarStickerPack: user has no Avatar");
        return null;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new AvatarAsyncInit$checkUserHasAvatar$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new AvatarAsyncInit$checkUserHasAvatar$1(this.this$0, (C84814Du) obj2));
    }
}
