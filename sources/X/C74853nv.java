package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3nv  reason: invalid class name and case insensitive filesystem */
public final class C74853nv extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Object $element;
    public final /* synthetic */ AnonymousClass4FB $this_trySendBlocking;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74853nv(Object obj, C84814Du r3, AnonymousClass4FB r4) {
        super(r3, 2);
        this.$this_trySendBlocking = r4;
        this.$element = obj;
    }

    public final Object A09(Object obj) {
        Object obj2;
        Object r1;
        AnonymousClass218 r3 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4FB r12 = this.$this_trySendBlocking;
            Object obj3 = this.$element;
            try {
                this.label = 1;
                if (r12.BlD(obj3, this) == r3) {
                    return r3;
                }
            } catch (Throwable th) {
                obj2 = AnonymousClass3Z0.A01(th);
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        obj2 = C59022wD.A00;
        if (!(obj2 instanceof AnonymousClass3Z0)) {
            r1 = C59022wD.A00;
        } else {
            r1 = new C831746k(AnonymousClass3Z9.A00(obj2));
        }
        return new C60472yc(r1);
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        C74853nv r0 = new C74853nv(this.$element, r5, this.$this_trySendBlocking);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
