package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines;
import java.util.Map;

/* renamed from: X.40I  reason: invalid class name */
public final class AnonymousClass40I extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C54052o6 $extensionsContextParams;
    public final /* synthetic */ AnonymousClass4B3 $flowReadyCallback;
    public final /* synthetic */ AnonymousClass4DQ $flowTerminationCallback;
    public final /* synthetic */ C51052jC $phoenixSessionConfig;
    public final /* synthetic */ String $pslData;
    public final /* synthetic */ Map $stateMachineInputParams;
    public final /* synthetic */ PhoenixExtensionFlowManagerWithCoroutines this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass40I(C54052o6 r2, PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines, AnonymousClass4B3 r4, AnonymousClass4DQ r5, C51052jC r6, String str, Map map) {
        super(0);
        this.this$0 = phoenixExtensionFlowManagerWithCoroutines;
        this.$phoenixSessionConfig = r6;
        this.$extensionsContextParams = r2;
        this.$pslData = str;
        this.$stateMachineInputParams = map;
        this.$flowReadyCallback = r4;
        this.$flowTerminationCallback = r5;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines = this.this$0;
        C51052jC r4 = this.$phoenixSessionConfig;
        phoenixExtensionFlowManagerWithCoroutines.A07(this.$extensionsContextParams, this.$flowReadyCallback, this.$flowTerminationCallback, r4, this.$pslData, this.$stateMachineInputParams, true);
        return C59022wD.A00;
    }
}
