package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3hk  reason: invalid class name and case insensitive filesystem */
public final class C74753hk extends C75003pT implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4C9 $downstream;
    public final /* synthetic */ C69903Yy $lastValue;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74753hk(C84814Du r2, C69903Yy r3, AnonymousClass4C9 r4) {
        super(r2, 1);
        this.$downstream = r4;
        this.$lastValue = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C9 r2 = this.$downstream;
            AnonymousClass2XH r1 = AnonymousClass2C3.A01;
            Object obj2 = this.$lastValue.element;
            if (obj2 == r1) {
                obj2 = null;
            }
            this.label = 1;
            if (r2.B2K(obj2, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        this.$lastValue.element = null;
        return C59022wD.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return C59022wD.A01(new C74753hk((C84814Du) obj, this.$lastValue, this.$downstream));
    }
}
