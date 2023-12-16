package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass8P9;
import X.C08320eG;
import X.C57682u2;
import X.C59022wD;
import X.C73883gE;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
public final class LiveDataScopeImpl$emit$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Object $value;
    public int label;
    public final /* synthetic */ C08320eG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emit$2(C08320eG r2, Object obj, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$value = obj;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new LiveDataScopeImpl$emit$2(this.this$0, this.$value, r5);
    }

    public final Object A09(Object obj) {
        Object A05 = C73883gE.A05();
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            CoroutineLiveData coroutineLiveData = this.this$0.A00;
            this.label = 1;
            if (coroutineLiveData.A0K(this) == A05) {
                return A05;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        this.this$0.A00.A0H(this.$value);
        return C59022wD.A00;
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, AnonymousClass4C6 r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
