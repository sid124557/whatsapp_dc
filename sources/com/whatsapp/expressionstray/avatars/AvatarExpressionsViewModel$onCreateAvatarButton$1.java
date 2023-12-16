package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass001;
import X.AnonymousClass1TN;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85534Gq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$onCreateAvatarButton$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$onCreateAvatarButton$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$onCreateAvatarButton$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = avatarExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            this.this$0.A06.A03((Boolean) null, 2);
            C85534Gq r2 = this.this$0.A0F;
            AnonymousClass1TN r0 = new AnonymousClass1TN("expressions_sheet");
            this.label = 1;
            if (r2.B2K(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new AvatarExpressionsViewModel$onCreateAvatarButton$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new AvatarExpressionsViewModel$onCreateAvatarButton$1(this.this$0, (C84814Du) obj2));
    }
}
