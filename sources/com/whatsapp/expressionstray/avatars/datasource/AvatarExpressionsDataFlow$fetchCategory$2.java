package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2UA;
import X.AnonymousClass3Z9;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C43952Uc;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$fetchCategory$2", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$fetchCategory$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C43952Uc $category;
    public int label;
    public final /* synthetic */ AnonymousClass2UA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$fetchCategory$2(AnonymousClass2UA r2, C43952Uc r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$category = r3;
    }

    public final Object A09(Object obj) {
        Object obj2;
        Object A00;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            List list = this.this$0.A09;
            C43952Uc r3 = this.$category;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (C162457s7.A0P(((AvatarOnDemandStickerCategory) obj2).A00, r3)) {
                    break;
                }
            }
            AvatarOnDemandStickerCategory avatarOnDemandStickerCategory = (AvatarOnDemandStickerCategory) obj2;
            if (avatarOnDemandStickerCategory == null) {
                return null;
            }
            this.label = 1;
            A00 = avatarOnDemandStickerCategory.A00(this);
            if (A00 == r6) {
                return r6;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
            A00 = ((AnonymousClass3Z9) obj).value;
        } else {
            throw AnonymousClass001.A0d();
        }
        return new AnonymousClass3Z9(A00);
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarExpressionsDataFlow$fetchCategory$2(this.this$0, this.$category, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
