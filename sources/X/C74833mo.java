package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3mo  reason: invalid class name and case insensitive filesystem */
public final class C74833mo extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C72813eK $collector;
    public final /* synthetic */ AnonymousClass4C8 $flow;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74833mo(C84814Du r2, AnonymousClass4C8 r3, C72813eK r4) {
        super(r2, 2);
        this.$flow = r3;
        this.$collector = r4;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C8 r1 = this.$flow;
            C72813eK r0 = this.$collector;
            this.label = 1;
            if (r1.Az8(this, r0) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new C74833mo(r5, this.$flow, this.$collector);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
