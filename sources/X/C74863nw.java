package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3nw  reason: invalid class name and case insensitive filesystem */
public final class C74863nw extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4C9 $collector;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C72933eX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74863nw(C84814Du r2, AnonymousClass4C9 r3, C72933eX r4) {
        super(r2, 2);
        this.$collector = r3;
        this.this$0 = r4;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C9 r1 = this.$collector;
            AnonymousClass4FH A01 = this.this$0.A01((AnonymousClass4C6) this.L$0);
            this.label = 1;
            if (C154567dN.A00(this, A01, r1, true) == r4 || C59022wD.A00 == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        C74863nw r0 = new C74863nw(r5, this.$collector, this.this$0);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
