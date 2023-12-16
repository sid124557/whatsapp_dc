package X;

import com.whatsapp.calling.fragment.CallConfirmationFragment;

/* renamed from: X.444  reason: invalid class name */
public final class AnonymousClass444 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass3ZF $callLog;
    public final /* synthetic */ C30401mO $fMessage;
    public final /* synthetic */ C22691Pe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass444(C30401mO r2, C22691Pe r3, AnonymousClass3ZF r4) {
        super(1);
        this.this$0 = r3;
        this.$callLog = r4;
        this.$fMessage = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3ZH r4 = (AnonymousClass3ZH) obj;
        C162457s7.A0J(r4, 0);
        C89654ea r2 = (C89654ea) C621633u.A01(this.this$0.getContext(), C89654ea.class);
        if (r2 == null) {
            return null;
        }
        AnonymousClass3ZF r1 = this.$callLog;
        C30401mO r0 = this.$fMessage;
        return Boolean.valueOf(CallConfirmationFragment.A03(r2, r4, Integer.valueOf(C22691Pe.A00(r0)), r1.A0L));
    }
}
