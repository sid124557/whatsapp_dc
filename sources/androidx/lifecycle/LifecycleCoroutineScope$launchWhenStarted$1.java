package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass0GC;
import X.AnonymousClass0O9;
import X.AnonymousClass34M;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass8P9;
import X.C13770ni;
import X.C57682u2;
import X.C57722u6;
import X.C59022wD;
import X.C73883gE;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
public final class LifecycleCoroutineScope$launchWhenStarted$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GR $block;
    public int label;
    public final /* synthetic */ C13770ni this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScope$launchWhenStarted$1(C13770ni r2, C84814Du r3, AnonymousClass4GR r4) {
        super(r3, 2);
        this.this$0 = r2;
        this.$block = r4;
    }

    public static final Object A01(AnonymousClass0O9 r1, C84814Du r2, AnonymousClass4GR r3) {
        return A00(AnonymousClass0GC.STARTED, r1, r2, r3);
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new LifecycleCoroutineScope$launchWhenStarted$1(this.this$0, r5, this.$block);
    }

    public static final Object A00(AnonymousClass0GC r3, AnonymousClass0O9 r4, C84814Du r5, AnonymousClass4GR r6) {
        return C57722u6.A00(r5, AnonymousClass34M.A01().A04(), new PausingDispatcherKt$whenStateAtLeast$2(r3, r4, (C84814Du) null, r6));
    }

    public final Object A09(Object obj) {
        Object A05 = C73883gE.A05();
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass0O9 A00 = this.this$0.A00();
            AnonymousClass4GR r0 = this.$block;
            this.label = 1;
            if (A01(A00, this, r0) == A05) {
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
