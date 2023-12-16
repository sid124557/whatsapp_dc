package X;

import java.util.Map;

/* renamed from: X.40H  reason: invalid class name */
public final class AnonymousClass40H extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C54052o6 $extensionsContextParams;
    public final /* synthetic */ AnonymousClass4B3 $flowReadyCallback = null;
    public final /* synthetic */ AnonymousClass4DQ $flowTerminationCallback;
    public final /* synthetic */ C51052jC $phoenixSessionConfig;
    public final /* synthetic */ String $pslData;
    public final /* synthetic */ Map $stateMachineInputParams;
    public final /* synthetic */ C613530j this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass40H(C613530j r2, C54052o6 r3, AnonymousClass4DQ r4, C51052jC r5, String str, Map map) {
        super(0);
        this.this$0 = r2;
        this.$phoenixSessionConfig = r5;
        this.$extensionsContextParams = r3;
        this.$pslData = str;
        this.$stateMachineInputParams = map;
        this.$flowTerminationCallback = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.this$0.A0R.A01(this.$phoenixSessionConfig.A00);
        C613530j r0 = this.this$0;
        C51052jC r4 = this.$phoenixSessionConfig;
        r0.A04(this.$extensionsContextParams, this.$flowReadyCallback, this.$flowTerminationCallback, r4, this.$pslData, this.$stateMachineInputParams, true);
        return C59022wD.A00;
    }
}
