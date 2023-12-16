package com.whatsapp.data;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4F4;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C624134x;
import X.C66823Mx;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1", f = "FMessageCommentInfoLazyLoader.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
public final class FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C624134x $parentCommentMessage;
    public int label;
    public final /* synthetic */ C66823Mx this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1(C66823Mx r2, C624134x r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$parentCommentMessage = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4F4 r1 = this.this$0.A01;
            C624134x r0 = this.$parentCommentMessage;
            this.label = 1;
            if (r1.B2Z(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1(this.this$0, this.$parentCommentMessage, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
