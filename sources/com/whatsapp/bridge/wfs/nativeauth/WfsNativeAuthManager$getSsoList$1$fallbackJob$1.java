package com.whatsapp.bridge.wfs.nativeauth;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C72023d3;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import X.C85504Gn;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1$fallbackJob$1", f = "WfsNativeAuthManager.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
public final class WfsNativeAuthManager$getSsoList$1$fallbackJob$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C85474Gj $fbJob;
    public final /* synthetic */ C85474Gj $igJob;
    public final /* synthetic */ C85504Gn $resultChannel;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsNativeAuthManager$getSsoList$1$fallbackJob$1(C84814Du r2, C85474Gj r3, C85474Gj r4, C85504Gn r5) {
        super(r2, 2);
        this.$fbJob = r3;
        this.$igJob = r4;
        this.$resultChannel = r5;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            while (true) {
                if (!this.$fbJob.BGz() && !this.$igJob.BGz()) {
                    break;
                }
            }
            if (this.$fbJob.BHF() && this.$igJob.BHF()) {
                C85504Gn r1 = this.$resultChannel;
                C72023d3 r0 = C72023d3.A00;
                this.label = 1;
                if (r1.BlD(r0, this) == r3) {
                    return r3;
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new WfsNativeAuthManager$getSsoList$1$fallbackJob$1(r6, this.$fbJob, this.$igJob, this.$resultChannel);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
