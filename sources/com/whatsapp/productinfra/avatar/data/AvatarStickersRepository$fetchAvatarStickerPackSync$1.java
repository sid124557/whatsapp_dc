package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C59762xR;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.util.Log;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarStickerPackSync$1", f = "AvatarStickersRepository.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickersRepository$fetchAvatarStickerPackSync$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ boolean $defaultPack;
    public final /* synthetic */ Integer $qplInstanceKey;
    public final /* synthetic */ Set $stableIds;
    public final /* synthetic */ Integer $stickerPackDownloadOrigin;
    public int label;
    public final /* synthetic */ C59762xR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchAvatarStickerPackSync$1(C59762xR r2, Integer num, Integer num2, Set set, C84814Du r6, boolean z) {
        super(r6, 2);
        this.this$0 = r2;
        this.$qplInstanceKey = num;
        this.$stableIds = set;
        this.$defaultPack = z;
        this.$stickerPackDownloadOrigin = num2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            if (this.this$0.A00.A01()) {
                C59762xR r4 = this.this$0;
                Integer num = this.$qplInstanceKey;
                Set set = this.$stableIds;
                boolean z = this.$defaultPack;
                Integer num2 = this.$stickerPackDownloadOrigin;
                this.label = 1;
                obj = C616131n.A00(this, r4.A08, new AvatarStickersRepository$fetchAvatarStickerPackAwait$2(r4, num, num2, set, (C84814Du) null, z));
                if (obj == r2) {
                    return r2;
                }
            } else {
                Log.e("AvatarStickersRepository/fetchAvatarStickerPackSync/user has no avatar");
                this.this$0.A01("fetch_avatar_sticker_pack_failed_no_avatar_user", (String) null);
                return null;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        return new AvatarStickersRepository$fetchAvatarStickerPackSync$1(this.this$0, this.$qplInstanceKey, this.$stickerPackDownloadOrigin, this.$stableIds, r9, this.$defaultPack);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
