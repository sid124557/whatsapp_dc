package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.3kO  reason: invalid class name and case insensitive filesystem */
public final class C74773kO extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ int I$0;
    public int label;

    public C74773kO(C84814Du r2) {
        super(r2, 2);
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            return Boolean.valueOf(AnonymousClass001.A1W(this.I$0));
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        C74773kO r1 = new C74773kO(r4);
        r1.I$0 = AnonymousClass001.A0K(obj);
        return r1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01((AnonymousClass8P9) A0A(Integer.valueOf(AnonymousClass001.A0K(obj)), (C84814Du) obj2));
    }
}
