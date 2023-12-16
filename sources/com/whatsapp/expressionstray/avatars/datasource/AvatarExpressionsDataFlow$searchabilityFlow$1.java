package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2UA;
import X.AnonymousClass410;
import X.AnonymousClass4GR;
import X.AnonymousClass4Gm;
import X.C27811eh;
import X.C381425w;
import X.C57682u2;
import X.C57732u7;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$searchabilityFlow$1", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$searchabilityFlow$1 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass2UA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$searchabilityFlow$1(AnonymousClass2UA r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4Gm r3 = (AnonymousClass4Gm) this.L$0;
            C27811eh r2 = this.this$0.A05;
            r2.A00 = new C381425w(r3, 0);
            r2.A01((Integer) null);
            this.label = 1;
            if (C57732u7.A00(this, AnonymousClass410.A00, r3) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        AvatarExpressionsDataFlow$searchabilityFlow$1 avatarExpressionsDataFlow$searchabilityFlow$1 = new AvatarExpressionsDataFlow$searchabilityFlow$1(this.this$0, r4);
        avatarExpressionsDataFlow$searchabilityFlow$1.L$0 = obj;
        return avatarExpressionsDataFlow$searchabilityFlow$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
