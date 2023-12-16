package com.whatsapp.registration.integritysignals;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass218;
import X.AnonymousClass2TA;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C57702u4;
import X.C59022wD;
import X.C63783Ar;
import X.C72463dl;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.wamsys.JniBridge;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.integritysignals.GpiaRegClient$getGpiaParameterAsync$2", f = "GpiaRegClient.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
public final class GpiaRegClient$getGpiaParameterAsync$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ int $errorCode;
    public final /* synthetic */ double $shaRetryDelay;
    public final /* synthetic */ String $token;
    public double D$0;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AnonymousClass2TA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GpiaRegClient$getGpiaParameterAsync$2(AnonymousClass2TA r2, String str, C84814Du r4, double d, int i) {
        super(r4, 2);
        this.this$0 = r2;
        this.$token = str;
        this.$errorCode = i;
        this.$shaRetryDelay = d;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass2TA r0 = this.this$0;
            String str = this.$token;
            int i2 = this.$errorCode;
            double d = this.$shaRetryDelay;
            this.L$0 = r0;
            this.L$1 = str;
            this.I$0 = i2;
            this.D$0 = d;
            this.label = 1;
            C72463dl A02 = C57702u4.A02(this);
            long j = (long) i2;
            JniBridge.jvidispatchIIDOOOO(j, d, str, r0.A01.A00, new C63783Ar(A02), AnonymousClass0x9.A0r(r0.A05));
            obj = A02.A00();
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        return new GpiaRegClient$getGpiaParameterAsync$2(this.this$0, this.$token, r9, this.$shaRetryDelay, this.$errorCode);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
