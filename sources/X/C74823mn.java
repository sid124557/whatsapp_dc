package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3mn  reason: invalid class name and case insensitive filesystem */
public final class C74823mn extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C832946w this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74823mn(C84814Du r2, C832946w r3) {
        super(r2, 2);
        this.this$0 = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C832946w r0 = this.this$0;
            this.label = 1;
            if (r0.A02(this, (AnonymousClass4C9) this.L$0) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        C74823mn r0 = new C74823mn(r4, this.this$0);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
