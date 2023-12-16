package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3nx  reason: invalid class name and case insensitive filesystem */
public final class C74873nx extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4C9 $collector;
    public final /* synthetic */ Object $value;
    public int label;
    public final /* synthetic */ C832746u this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74873nx(Object obj, C84814Du r3, AnonymousClass4C9 r4, C832746u r5) {
        super(r3, 2);
        this.this$0 = r5;
        this.$collector = r4;
        this.$value = obj;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4GS r2 = this.this$0.A00;
            AnonymousClass4C9 r1 = this.$collector;
            Object obj2 = this.$value;
            this.label = 1;
            if (r2.BGj(r1, obj2, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        C832746u r3 = this.this$0;
        return new C74873nx(this.$value, r6, this.$collector, r3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
