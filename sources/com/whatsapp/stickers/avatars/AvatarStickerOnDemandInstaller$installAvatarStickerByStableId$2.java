package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass39M;
import X.AnonymousClass4GR;
import X.C49932hK;
import X.C55862r2;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2", f = "AvatarStickerOnDemandInstaller.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $stableId;
    public int label;
    public final /* synthetic */ C49932hK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2(C49932hK r2, String str, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$stableId = str;
    }

    public final Object A09(Object obj) {
        String str;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C49932hK r4 = this.this$0;
            String str2 = this.$stableId;
            this.label = 1;
            obj = C616131n.A00(this, r4.A04, new AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2(r4, str2, (C84814Du) null));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass39M r8 = (AnonymousClass39M) obj;
        if (r8 == null) {
            return null;
        }
        String str3 = r8.A0G;
        C49932hK r1 = this.this$0;
        if (str3 == null) {
            str = "fetch_on_demand_avatar_returned_with_empty_url";
        } else {
            r1.A02.A01(r8);
            if (r8.A09 == null) {
                Log.w("AvatarStickerOnDemandInstaller/couldn't download ondemand sticker image");
            } else {
                r1.A01(r8);
                if (r8.A09 != null) {
                    return r8;
                }
            }
            r1 = this.this$0;
            str = "fetch_on_demand_avatar_returned_with_empty_filepath";
        }
        C55862r2 r2 = r1.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("stableId=");
        r2.A02(1, str, AnonymousClass000.A0X(r8.A05, A0o));
        return null;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2(this.this$0, this.$stableId, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
