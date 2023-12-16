package com.whatsapp.integritysignals.gpia;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.integritysignals.gpia.GpiaRegClientAsyncInit$onAsyncInitAnyUserState$1", f = "GpiaRegClientAsyncInit.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
public final class GpiaRegClientAsyncInit$onAsyncInitAnyUserState$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ GpiaRegClientAsyncInit this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GpiaRegClientAsyncInit$onAsyncInitAnyUserState$1(GpiaRegClientAsyncInit gpiaRegClientAsyncInit, C84814Du r3) {
        super(r3, 2);
        this.this$0 = gpiaRegClientAsyncInit;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            GpiaRegClientAsyncInit gpiaRegClientAsyncInit = this.this$0;
            this.label = 1;
            if (gpiaRegClientAsyncInit.A00(this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new GpiaRegClientAsyncInit$onAsyncInitAnyUserState$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new GpiaRegClientAsyncInit$onAsyncInitAnyUserState$1(this.this$0, (C84814Du) obj2));
    }
}
