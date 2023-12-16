package X;

import java.util.List;

/* renamed from: X.443  reason: invalid class name */
public final class AnonymousClass443 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass3ZF $callLog;
    public final /* synthetic */ C30401mO $fMessage;
    public final /* synthetic */ C22691Pe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass443(C30401mO r2, C22691Pe r3, AnonymousClass3ZF r4) {
        super(1);
        this.this$0 = r3;
        this.$fMessage = r2;
        this.$callLog = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3ZH r6 = (AnonymousClass3ZH) obj;
        C162457s7.A0J(r6, 0);
        C1230066r callsManager = this.this$0.getCallsManager();
        C22691Pe r0 = this.this$0;
        List A03 = AnonymousClass36T.A03(r0.A0Z, r0.A0t, r0.A1L, r6);
        return Boolean.valueOf(callsManager.BKz(this.this$0.getContext(), this.$callLog.A05, A03, C22691Pe.A00(this.$fMessage)));
    }
}
