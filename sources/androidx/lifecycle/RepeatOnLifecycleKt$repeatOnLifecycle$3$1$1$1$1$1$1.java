package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass8P9;
import X.C57682u2;
import X.C59022wD;
import X.C73883gE;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GR $block;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(C84814Du r2, AnonymousClass4GR r3) {
        super(r2, 2);
        this.$block = r3;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(r4, this.$block);
        repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1;
    }

    public final Object A09(Object obj) {
        Object A05 = C73883gE.A05();
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            Object obj2 = this.L$0;
            AnonymousClass4GR r0 = this.$block;
            this.label = 1;
            if (r0.invoke(obj2, this) == A05) {
                return A05;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, AnonymousClass4C6 r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
