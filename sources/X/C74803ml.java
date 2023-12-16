package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3ml  reason: invalid class name and case insensitive filesystem */
public final class C74803ml extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C85564Gt $subscriptionCount;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74803ml(C84814Du r2, C85564Gt r3) {
        super(r2, 2);
        this.$subscriptionCount = r3;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            Object obj2 = this.L$0;
            C69873Yv r3 = new C69873Yv();
            C85564Gt r2 = this.$subscriptionCount;
            C86074Is r0 = new C86074Is(obj2, 13, (Object) r3);
            this.label = 1;
            if (r2.Az8(this, r0) == r6) {
                return r6;
            }
        } else if (i != 1) {
            throw AnonymousClass001.A0d();
        } else {
            C57682u2.A01(obj);
        }
        throw new C73143f0();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        C74803ml r0 = new C74803ml(r4, this.$subscriptionCount);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
