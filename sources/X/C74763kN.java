package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3kN  reason: invalid class name and case insensitive filesystem */
public final class C74763kN extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4C8 $this_launchIn;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74763kN(C84814Du r2, AnonymousClass4C8 r3) {
        super(r2, 2);
        this.$this_launchIn = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r2 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C8 r1 = this.$this_launchIn;
            this.label = 1;
            if (r1.Az8(this, C72863eQ.A00) == r2 || C59022wD.A00 == r2) {
                return r2;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new C74763kN(r4, this.$this_launchIn);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new C74763kN((C84814Du) obj2, this.$this_launchIn));
    }
}
