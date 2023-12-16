package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass001;
import X.AnonymousClass2UA;
import X.AnonymousClass4C8;
import X.AnonymousClass4GR;
import X.AnonymousClass4J6;
import X.C29931la;
import X.C57682u2;
import X.C59022wD;
import X.C73723fy;
import X.C73783g4;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$2", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$all$2 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ AnonymousClass2UA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$all$2(AnonymousClass2UA r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            List<AvatarOnDemandStickerCategory> list = this.this$0.A09;
            ArrayList A0c = C73783g4.A0c(list);
            for (AvatarOnDemandStickerCategory avatarOnDemandStickerCategory : list) {
                A0c.add(avatarOnDemandStickerCategory.A01.A02(new C29931la(avatarOnDemandStickerCategory.A00), avatarOnDemandStickerCategory.A03));
            }
            return new AnonymousClass4J6((Object) this.this$0, 2, (Object) C73723fy.A0F(A0c).toArray(new AnonymousClass4C8[0]));
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        AvatarExpressionsDataFlow$all$2 avatarExpressionsDataFlow$all$2 = new AvatarExpressionsDataFlow$all$2(this.this$0, r4);
        avatarExpressionsDataFlow$all$2.Z$0 = AnonymousClass001.A1Z(obj);
        return avatarExpressionsDataFlow$all$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
