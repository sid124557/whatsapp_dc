package com.whatsapp.stickers.avatars;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass39M;
import X.AnonymousClass4GR;
import X.C49932hK;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableId$2", f = "AvatarStickerOnDemandInstaller.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableId$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $stableId;
    public int label;
    public final /* synthetic */ C49932hK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableId$2(C49932hK r2, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$stableId = str;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C49932hK r4 = this.this$0;
            String str = this.$stableId;
            this.label = 1;
            obj = C616131n.A00(this, r4.A04, new AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2(r4, str, (C84814Du) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass39M r7 = (AnonymousClass39M) obj;
        if (r7 != null) {
            this.this$0.A02.A01(r7);
        }
        return r7;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableId$2(this.this$0, this.$stableId, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
