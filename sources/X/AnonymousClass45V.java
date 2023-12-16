package X;

import java.util.Map;

/* renamed from: X.45V  reason: invalid class name */
public final class AnonymousClass45V extends C829045j implements AnonymousClass4GR {
    public final /* synthetic */ C54052o6 $extensionsContextParams;
    public final /* synthetic */ AnonymousClass4B3 $flowReadyCallback = null;
    public final /* synthetic */ AnonymousClass4DQ $flowTerminationCallback;
    public final /* synthetic */ boolean $isDraft;
    public final /* synthetic */ C51052jC $phoenixSessionConfig;
    public final /* synthetic */ String $pslData;
    public final /* synthetic */ Map $stateMachineInputParams;
    public final /* synthetic */ C613530j this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass45V(C613530j r2, C54052o6 r3, AnonymousClass4DQ r4, C51052jC r5, String str, Map map, boolean z) {
        super(2);
        this.this$0 = r2;
        this.$phoenixSessionConfig = r5;
        this.$extensionsContextParams = r3;
        this.$pslData = str;
        this.$isDraft = z;
        this.$stateMachineInputParams = map;
        this.$flowTerminationCallback = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj2;
        if (AnonymousClass001.A1Z(obj)) {
            C613530j r0 = this.this$0;
            C51052jC r4 = this.$phoenixSessionConfig;
            C54052o6 r1 = this.$extensionsContextParams;
            String str2 = this.$pslData;
            boolean z = this.$isDraft;
            r0.A04(r1, this.$flowReadyCallback, this.$flowTerminationCallback, r4, str2, this.$stateMachineInputParams, z);
        } else {
            C613530j r2 = this.this$0;
            AnonymousClass4DQ r12 = this.$flowTerminationCallback;
            if (str == null) {
                str = "UNKNOWN";
            }
            r2.A06(r12, str, this.$extensionsContextParams.A05);
        }
        return C59022wD.A00;
    }
}
