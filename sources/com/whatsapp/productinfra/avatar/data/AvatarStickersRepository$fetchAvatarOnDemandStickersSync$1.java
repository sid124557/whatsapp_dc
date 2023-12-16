package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass3Z0;
import X.AnonymousClass3Z9;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C59762xR;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1", f = "AvatarStickersRepository.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ boolean $defaultPack;
    public final /* synthetic */ Set $stableIds;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C59762xR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1(C59762xR r2, Set set, C84814Du r4, boolean z) {
        super(r4, 2);
        this.this$0 = r2;
        this.$stableIds = set;
        this.$defaultPack = z;
    }

    public final Object A09(Object obj) {
        Object obj2;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            if (this.this$0.A00.A01()) {
                C59762xR r5 = this.this$0;
                Set set = this.$stableIds;
                boolean A1S = AnonymousClass000.A1S(this.$defaultPack ? 1 : 0);
                try {
                    this.label = 1;
                    obj = C616131n.A00(this, r5.A08, new AvatarStickersRepository$fetchOnDemandAvatarStickers$2(r5, set, (C84814Du) null, A1S));
                    if (obj == r6) {
                        return r6;
                    }
                } catch (Throwable th) {
                    obj2 = AnonymousClass3Z0.A01(th);
                }
            } else {
                Log.e("AvatarStickersRepository/fetchAvatarOnDemandStickersSync/user has no avatar");
                this.this$0.A01("fetch_on_demand_avatar_aborted_no_avatar_user", (String) null);
                return null;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        obj2 = (List) obj;
        C59762xR r3 = this.this$0;
        Throwable A00 = AnonymousClass3Z9.A00(obj2);
        if (A00 == null) {
            return obj2;
        }
        Log.e("AvatarStickersRepository/fetchAvatarOnDemandStickersSync/", A00);
        r3.A01("fetch_on_demand_avatar_stickers_failed", A00.getMessage());
        return null;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1 avatarStickersRepository$fetchAvatarOnDemandStickersSync$1 = new AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1(this.this$0, this.$stableIds, r6, this.$defaultPack);
        avatarStickersRepository$fetchAvatarOnDemandStickersSync$1.L$0 = obj;
        return avatarStickersRepository$fetchAvatarOnDemandStickersSync$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
