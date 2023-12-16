package X;

import java.util.Map;

/* renamed from: X.44A  reason: invalid class name */
public final class AnonymousClass44A extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ Map $initialStateMachineInput;
    public final /* synthetic */ AnonymousClass4DK $resourceResultCallback;
    public final /* synthetic */ AnonymousClass1jG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass44A(AnonymousClass4DK r2, AnonymousClass1jG r3, Map map) {
        super(1);
        this.this$0 = r3;
        this.$resourceResultCallback = r2;
        this.$initialStateMachineInput = map;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C162457s7.A0J(th, 0);
        AnonymousClass1jG r2 = this.this$0;
        Map A00 = C59582x9.A00(r2.A0J.A01(), this.this$0.A01);
        AnonymousClass4DK r3 = this.$resourceResultCallback;
        String message = th.getMessage();
        if (message == null) {
            message = "extensions-data-exchange-graphql-response-error";
        }
        r2.A0A(r3, message, th.getMessage(), A00, this.$initialStateMachineInput, false);
        return C59022wD.A00;
    }
}
