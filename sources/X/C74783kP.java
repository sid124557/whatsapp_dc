package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3kP  reason: invalid class name and case insensitive filesystem */
public final class C74783kP extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;

    public C74783kP(C84814Du r2) {
        super(r2, 2);
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            return Boolean.valueOf(C18300x5.A1W(this.L$0, C369820m.START));
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r3) {
        C74783kP r0 = new C74783kP(r3);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C74783kP r0 = new C74783kP((C84814Du) obj2);
        r0.L$0 = obj;
        return C59022wD.A01(r0);
    }
}
