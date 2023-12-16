package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass218;
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

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$searchabilityFlow$1", f = "AvatarOnDemandStickers.kt", i = {}, l = {369}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarOnDemandStickers$searchabilityFlow$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $qplInstanceKey;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$searchabilityFlow$1(AvatarOnDemandStickers avatarOnDemandStickers, C84814Du r3, int i) {
        super(r3, 2);
        this.this$0 = avatarOnDemandStickers;
        this.$qplInstanceKey = i;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4Gm r2 = (AnonymousClass4Gm) this.L$0;
            C27811eh r1 = this.this$0.A03;
            r1.A00 = new C381425w(r2, 1);
            r1.A01(AnonymousClass0x9.A0k(this.$qplInstanceKey));
            this.label = 1;
            if (C57732u7.A00(this, AnonymousClass410.A00, r2) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        AvatarOnDemandStickers$searchabilityFlow$1 avatarOnDemandStickers$searchabilityFlow$1 = new AvatarOnDemandStickers$searchabilityFlow$1(this.this$0, r5, this.$qplInstanceKey);
        avatarOnDemandStickers$searchabilityFlow$1.L$0 = obj;
        return avatarOnDemandStickers$searchabilityFlow$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
