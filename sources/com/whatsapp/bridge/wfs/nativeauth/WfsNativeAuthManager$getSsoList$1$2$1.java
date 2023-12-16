package com.whatsapp.bridge.wfs.nativeauth;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C69903Yy;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$1$2$1", f = "WfsNativeAuthManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WfsNativeAuthManager$getSsoList$1$2$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C69903Yy $results;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsNativeAuthManager$getSsoList$1$2$1(C84814Du r2, C69903Yy r3) {
        super(r2, 2);
        this.$results = r3;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            this.$results.element = this.L$0;
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        WfsNativeAuthManager$getSsoList$1$2$1 wfsNativeAuthManager$getSsoList$1$2$1 = new WfsNativeAuthManager$getSsoList$1$2$1(r4, this.$results);
        wfsNativeAuthManager$getSsoList$1$2$1.L$0 = obj;
        return wfsNativeAuthManager$getSsoList$1$2$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
