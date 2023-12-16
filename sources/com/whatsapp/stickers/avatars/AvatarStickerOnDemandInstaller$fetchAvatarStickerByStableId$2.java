package com.whatsapp.stickers.avatars;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C18290x4;
import X.C380725l;
import X.C49932hK;
import X.C51042jB;
import X.C57682u2;
import X.C59022wD;
import X.C59762xR;
import X.C73723fy;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1;
import com.whatsapp.util.Log;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2", f = "AvatarStickerOnDemandInstaller.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $stableId;
    public int label;
    public final /* synthetic */ C49932hK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2(C49932hK r2, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$stableId = str;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C59762xR r5 = this.this$0.A00;
            List list = (List) C380725l.A00(r5.A08, new AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1(r5, C18290x4.A13(new C51042jB(this.$stableId)), (C84814Du) null, false));
            if (list == null || list.isEmpty()) {
                Log.w("AvatarStickerOnDemandInstaller/couldn't find ondemand sticker matching given stableId");
                if (list == null) {
                    return null;
                }
            }
            return C73723fy.A04(list);
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2(this.this$0, this.$stableId, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
