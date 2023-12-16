package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2UA;
import X.AnonymousClass2UW;
import X.AnonymousClass4GR;
import X.C23551Tr;
import X.C43952Uc;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$fetchCategory$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$updateItemsByStickerSection$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$updateItemsByStickerSection$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass2UW $section;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$updateItemsByStickerSection$1(AvatarExpressionsViewModel avatarExpressionsViewModel, AnonymousClass2UW r3, C84814Du r4) {
        super(r4, 2);
        this.$section = r3;
        this.this$0 = avatarExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass2UW r1 = this.$section;
            if (r1 instanceof C23551Tr) {
                AnonymousClass2UA r4 = this.this$0.A02;
                C43952Uc r3 = ((C23551Tr) r1).A00;
                this.label = 1;
                if (C616131n.A00(this, r4.A0B, new AvatarExpressionsDataFlow$fetchCategory$2(r4, r3, (C84814Du) null)) == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarExpressionsViewModel$updateItemsByStickerSection$1(this.this$0, this.$section, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
