package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85524Gp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeEverything$3", f = "AvatarExpressionsViewModel.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$observeEverything$3 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$observeEverything$3(AvatarExpressionsViewModel avatarExpressionsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = avatarExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            Object obj2 = this.L$0;
            C85524Gp r0 = this.this$0.A0G;
            this.label = 1;
            if (r0.B2K(obj2, this) == r3) {
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
        AvatarExpressionsViewModel$observeEverything$3 avatarExpressionsViewModel$observeEverything$3 = new AvatarExpressionsViewModel$observeEverything$3(this.this$0, r4);
        avatarExpressionsViewModel$observeEverything$3.L$0 = obj;
        return avatarExpressionsViewModel$observeEverything$3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
