package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3ny  reason: invalid class name and case insensitive filesystem */
public final class C74883ny extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4C9 $collector;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C832746u this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74883ny(C84814Du r2, AnonymousClass4C9 r3, C832746u r4) {
        super(r2, 2);
        this.this$0 = r4;
        this.$collector = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r7 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C69903Yy r4 = new C69903Yy();
            C832746u r3 = this.this$0;
            AnonymousClass4C8 r2 = r3.A00;
            C72843eO r0 = new C72843eO(r4, (AnonymousClass4C6) this.L$0, this.$collector, r3);
            this.label = 1;
            if (r2.Az8(this, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        C74883ny r0 = new C74883ny(r5, this.$collector, this.this$0);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
