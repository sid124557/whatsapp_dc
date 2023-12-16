package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass001;
import X.AnonymousClass3Z0;
import X.AnonymousClass3Z9;
import X.AnonymousClass4GR;
import X.C18260x0;
import X.C55862r2;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory$fetch$2", f = "AvatarOnDemandStickerCategory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarOnDemandStickerCategory$fetch$2 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickerCategory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickerCategory$fetch$2(AvatarOnDemandStickerCategory avatarOnDemandStickerCategory, C84814Du r3) {
        super(r3, 2);
        this.this$0 = avatarOnDemandStickerCategory;
    }

    public final Object A09(Object obj) {
        Object obj2;
        if (this.label == 0) {
            C57682u2.A01(obj);
            try {
                obj2 = Boolean.valueOf(this.this$0.A03.AzH(C59022wD.A00));
            } catch (Throwable th) {
                obj2 = AnonymousClass3Z0.A01(th);
            }
            AvatarOnDemandStickerCategory avatarOnDemandStickerCategory = this.this$0;
            Throwable A00 = AnonymousClass3Z9.A00(obj2);
            if (A00 != null && !(A00 instanceof CancellationException)) {
                C55862r2 r3 = avatarOnDemandStickerCategory.A02;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("unable to send rendez-vous signal for category (");
                r3.A02(3, "category_fetch_failed", C18260x0.A07(A00.getMessage(), A0o));
            }
            return new AnonymousClass3Z9(obj2);
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        AvatarOnDemandStickerCategory$fetch$2 avatarOnDemandStickerCategory$fetch$2 = new AvatarOnDemandStickerCategory$fetch$2(this.this$0, r4);
        avatarOnDemandStickerCategory$fetch$2.L$0 = obj;
        return avatarOnDemandStickerCategory$fetch$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
