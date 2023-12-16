package com.whatsapp.registration.integritysignals;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2TA;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.integritysignals.GpiaRegClient$calculateGpiaParameter$1", f = "GpiaRegClient.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
public final class GpiaRegClient$calculateGpiaParameter$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $errorCode;
    public final /* synthetic */ String $token;
    public int label;
    public final /* synthetic */ AnonymousClass2TA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GpiaRegClient$calculateGpiaParameter$1(AnonymousClass2TA r2, String str, C84814Du r4, int i) {
        super(r4, 2);
        this.this$0 = r2;
        this.$token = str;
        this.$errorCode = i;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass2TA r4 = this.this$0;
            String str = this.$token;
            int i2 = this.$errorCode;
            this.label = 1;
            obj = C616131n.A00(this, r4.A06, new GpiaRegClient$getGpiaParameterAsync$2(r4, str, (C84814Du) null, 1.0d, i2));
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new GpiaRegClient$calculateGpiaParameter$1(this.this$0, this.$token, r6, this.$errorCode);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
