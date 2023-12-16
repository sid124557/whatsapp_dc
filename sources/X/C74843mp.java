package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3mp  reason: invalid class name and case insensitive filesystem */
public final class C74843mp extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4C9 $downstream;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74843mp(C84814Du r2, AnonymousClass4C9 r3) {
        super(r2, 2);
        this.$downstream = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            Object obj2 = this.L$0;
            AnonymousClass4C9 r0 = this.$downstream;
            this.label = 1;
            if (r0.B2K(obj2, this) == r3) {
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
        C74843mp r0 = new C74843mp(r4, this.$downstream);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
