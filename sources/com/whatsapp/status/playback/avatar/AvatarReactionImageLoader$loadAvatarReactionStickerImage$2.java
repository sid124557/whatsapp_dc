package com.whatsapp.status.playback.avatar;

import X.AnonymousClass001;
import X.AnonymousClass10E;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C380725l;
import X.C49932hK;
import X.C56932sn;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableIdSync$1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionImageLoader$loadAvatarReactionStickerImage$2", f = "AvatarReactionImageLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionImageLoader$loadAvatarReactionStickerImage$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $stableId;
    public int label;
    public final /* synthetic */ AnonymousClass10E this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionImageLoader$loadAvatarReactionStickerImage$2(AnonymousClass10E r2, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$stableId = str;
    }

    public final Object A09(Object obj) {
        Object A00;
        if (this.label == 0) {
            C57682u2.A01(obj);
            C56932sn r0 = this.this$0.A00;
            String str = this.$stableId;
            if (str == null || (A00 = r0.A0V.A00(str)) == null) {
                C49932hK r4 = this.this$0.A01;
                String str2 = this.$stableId;
                C162457s7.A0J(str2, 0);
                A00 = C380725l.A00(r4.A04, new AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableIdSync$1(r4, str2, (C84814Du) null));
                if (A00 == null) {
                    return null;
                }
            }
            return A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarReactionImageLoader$loadAvatarReactionStickerImage$2(this.this$0, this.$stableId, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
