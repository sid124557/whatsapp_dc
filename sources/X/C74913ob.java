package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3ob  reason: invalid class name and case insensitive filesystem */
public final class C74913ob extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Object $initialValue;
    public final /* synthetic */ C85534Gq $shared;
    public final /* synthetic */ AnonymousClass4C8 $upstream;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74913ob(Object obj, C84814Du r3, AnonymousClass4C8 r4, C85534Gq r5) {
        super(r3, 2);
        this.$upstream = r4;
        this.$shared = r5;
        this.$initialValue = obj;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            int ordinal = ((C369820m) this.L$0).ordinal();
            if (ordinal == 0) {
                AnonymousClass4C8 r1 = this.$upstream;
                C85534Gq r0 = this.$shared;
                this.label = 1;
                if (r1.Az8(this, r0) == r4) {
                    return r4;
                }
            } else if (ordinal == 2) {
                Object obj2 = this.$initialValue;
                AnonymousClass2XH r12 = C39222Bd.A00;
                C85534Gq r02 = this.$shared;
                if (obj2 == r12) {
                    r02.Bjz();
                } else {
                    r02.BrA(obj2);
                }
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        C74913ob r0 = new C74913ob(this.$initialValue, r6, this.$upstream, this.$shared);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
