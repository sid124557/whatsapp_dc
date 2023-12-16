package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C108985dt;
import X.C54052o6;
import X.C57682u2;
import X.C59022wD;
import X.C620433g;
import X.C75003pT;
import X.C84814Du;
import X.C86344Jt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2", f = "PhoenixExtensionFlowManagerWithCoroutines.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixExtensionFlowManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C54052o6 $extensionsContextParams;
    public int label;
    public final /* synthetic */ PhoenixExtensionFlowManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixExtensionFlowManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2(C54052o6 r2, PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines, C84814Du r4) {
        super(r4, 2);
        this.this$0 = phoenixExtensionFlowManagerWithCoroutines;
        this.$extensionsContextParams = r2;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C108985dt A02 = this.this$0.A03.A02(this.$extensionsContextParams.A02);
            if (A02 == null || !A02.A0Z) {
                PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines = this.this$0;
                C620433g r4 = phoenixExtensionFlowManagerWithCoroutines.A03;
                C54052o6 r3 = this.$extensionsContextParams;
                r4.A08(new C86344Jt(phoenixExtensionFlowManagerWithCoroutines, 1, r3), r3.A02, (String) null);
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new PhoenixExtensionFlowManagerWithCoroutines$fetchBusinessProfileInBackgroundIfNeeded$2(this.$extensionsContextParams, this.this$0, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
