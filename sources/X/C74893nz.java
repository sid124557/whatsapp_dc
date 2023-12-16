package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3nz  reason: invalid class name and case insensitive filesystem */
public final class C74893nz extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GS $block;
    public final /* synthetic */ AnonymousClass4C9 $this_unsafeFlow;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74893nz(C84814Du r2, AnonymousClass4GS r3, AnonymousClass4C9 r4) {
        super(r2, 2);
        this.$block = r3;
        this.$this_unsafeFlow = r4;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            Object obj2 = this.L$0;
            AnonymousClass4GS r1 = this.$block;
            AnonymousClass4C9 r0 = this.$this_unsafeFlow;
            this.label = 1;
            if (r1.BGj(obj2, r0, this) == r4) {
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
        C74893nz r0 = new C74893nz(r5, this.$block, this.$this_unsafeFlow);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
