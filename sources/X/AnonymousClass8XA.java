package X;

import java.util.Map;

/* renamed from: X.8XA  reason: invalid class name */
public final class AnonymousClass8XA extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ Map $effectiveInput;
    public final /* synthetic */ Map $extraParams;
    public final /* synthetic */ String $fdsManagerId;
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ String $stateName;
    public final /* synthetic */ C160397nZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8XA(C160397nZ r2, String str, String str2, Map map, Map map2, int i) {
        super(0);
        this.this$0 = r2;
        this.$stateName = str;
        this.$instanceKey = i;
        this.$effectiveInput = map;
        this.$fdsManagerId = str2;
        this.$extraParams = map2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C160397nZ r0 = this.this$0;
        C185488tl r1 = r0.A00;
        String str = this.$stateName;
        int i = this.$instanceKey;
        this.this$0.A01.A01(new C197969eA(r1.B9o(str, r0.A02, this.$fdsManagerId, this.$effectiveInput, this.$extraParams, i), this.$stateName));
        return C59022wD.A00;
    }
}
