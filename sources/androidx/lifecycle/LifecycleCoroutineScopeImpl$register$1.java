package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass08A;
import X.AnonymousClass0GC;
import X.AnonymousClass2AI;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass8P9;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LifecycleCoroutineScopeImpl$register$1 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ LifecycleCoroutineScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, C84814Du r3) {
        super(r3, 2);
        this.this$0 = lifecycleCoroutineScopeImpl;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C6 r2 = (AnonymousClass4C6) this.L$0;
            if (((AnonymousClass08A) this.this$0.A00()).A02.compareTo(AnonymousClass0GC.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.this$0;
                lifecycleCoroutineScopeImpl.A00().A00(lifecycleCoroutineScopeImpl);
            } else {
                AnonymousClass2AI.A00(r2.B61());
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.this$0, r4);
        lifecycleCoroutineScopeImpl$register$1.L$0 = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, AnonymousClass4C6 r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
