package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix;

import X.AnonymousClass001;
import X.AnonymousClass40I;
import X.AnonymousClass40J;
import X.AnonymousClass4B3;
import X.AnonymousClass4DQ;
import X.AnonymousClass4GR;
import X.C51052jC;
import X.C54052o6;
import X.C54292oU;
import X.C54522or;
import X.C57682u2;
import X.C59022wD;
import X.C69373Wt;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.R;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines$startExtensionsFlow$2$1", f = "PhoenixExtensionFlowManagerWithCoroutines.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixExtensionFlowManagerWithCoroutines$startExtensionsFlow$2$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C54052o6 $extensionsContextParams;
    public final /* synthetic */ AnonymousClass4B3 $flowReadyCallback;
    public final /* synthetic */ AnonymousClass4DQ $flowTerminationCallback;
    public final /* synthetic */ String $it;
    public final /* synthetic */ C51052jC $phoenixSessionConfig;
    public final /* synthetic */ String $pslData;
    public final /* synthetic */ Map $stateMachineInputParams;
    public int label;
    public final /* synthetic */ PhoenixExtensionFlowManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixExtensionFlowManagerWithCoroutines$startExtensionsFlow$2$1(C54052o6 r2, PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines, AnonymousClass4B3 r4, AnonymousClass4DQ r5, C51052jC r6, String str, String str2, Map map, C84814Du r10) {
        super(r10, 2);
        this.this$0 = phoenixExtensionFlowManagerWithCoroutines;
        this.$it = str;
        this.$phoenixSessionConfig = r6;
        this.$extensionsContextParams = r2;
        this.$pslData = str2;
        this.$stateMachineInputParams = map;
        this.$flowReadyCallback = r4;
        this.$flowTerminationCallback = r5;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            C54522or A02 = this.this$0.A0R.A02(this.$it);
            String A04 = C54292oU.A04(this.this$0.A0B, R.string.f11nameremoved);
            String A042 = C54292oU.A04(this.this$0.A0B, R.string.f11nameremoved);
            String A043 = C54292oU.A04(this.this$0.A0B, R.string.f11nameremoved);
            PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines = this.this$0;
            C51052jC r8 = this.$phoenixSessionConfig;
            C54052o6 r4 = this.$extensionsContextParams;
            String str = this.$pslData;
            Map map = this.$stateMachineInputParams;
            AnonymousClass4B3 r6 = this.$flowReadyCallback;
            AnonymousClass4DQ r7 = this.$flowTerminationCallback;
            A02.A01(new C69373Wt(A04, A042, A043, new AnonymousClass40I(r4, phoenixExtensionFlowManagerWithCoroutines, r6, r7, r8, str, map), new AnonymousClass40J(r4, phoenixExtensionFlowManagerWithCoroutines, r6, r7, r8, str, map)));
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r12) {
        PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines = this.this$0;
        String str = this.$it;
        C51052jC r5 = this.$phoenixSessionConfig;
        return new PhoenixExtensionFlowManagerWithCoroutines$startExtensionsFlow$2$1(this.$extensionsContextParams, phoenixExtensionFlowManagerWithCoroutines, this.$flowReadyCallback, this.$flowTerminationCallback, r5, str, this.$pslData, this.$stateMachineInputParams, r12);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
