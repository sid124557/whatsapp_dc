package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {210}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3mk  reason: invalid class name and case insensitive filesystem */
public final class C74793mk extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4C8 $this_debounceInternal;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74793mk(C84814Du r2, AnonymousClass4C8 r3) {
        super(r2, 2);
        this.$this_debounceInternal = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            Object obj2 = this.L$0;
            AnonymousClass4C8 r2 = this.$this_debounceInternal;
            C86054Iq r0 = new C86054Iq(obj2, 25);
            this.label = 1;
            if (r2.Az8(this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        C74793mk r0 = new C74793mk(r4, this.$this_debounceInternal);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
