package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2UA;
import X.AnonymousClass4C9;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$3", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$all$3 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass2UA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$all$3(AnonymousClass2UA r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            List list = this.this$0.A0A;
            this.label = 1;
            if (((AnonymousClass4C9) this.L$0).B2K(list, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        AvatarExpressionsDataFlow$all$3 avatarExpressionsDataFlow$all$3 = new AvatarExpressionsDataFlow$all$3(this.this$0, r4);
        avatarExpressionsDataFlow$all$3.L$0 = obj;
        return avatarExpressionsDataFlow$all$3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
