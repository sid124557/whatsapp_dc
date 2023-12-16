package com.whatsapp.productinfra.avatar.editor.events;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2QP;
import X.AnonymousClass4GR;
import X.AnonymousClass4Gm;
import X.C57682u2;
import X.C57732u7;
import X.C59022wD;
import X.C75003pT;
import X.C81073zI;
import X.C84814Du;
import X.C86004Il;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.editor.events.AvatarEventFlow$flow$1", f = "AvatarEventFlow.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarEventFlow$flow$1 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass2QP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarEventFlow$flow$1(AnonymousClass2QP r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4Gm r3 = (AnonymousClass4Gm) this.L$0;
            C86004Il r2 = new C86004Il(r3, 0);
            this.this$0.A00.A06(r2);
            C81073zI r0 = new C81073zI(r2, this.this$0);
            this.label = 1;
            if (C57732u7.A00(this, r0, r3) == r5) {
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
        AvatarEventFlow$flow$1 avatarEventFlow$flow$1 = new AvatarEventFlow$flow$1(this.this$0, r4);
        avatarEventFlow$flow$1.L$0 = obj;
        return avatarEventFlow$flow$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
