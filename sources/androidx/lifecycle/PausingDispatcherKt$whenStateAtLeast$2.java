package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass0GC;
import X.AnonymousClass0O9;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass8P9;
import X.C05980Vs;
import X.C14440ph;
import X.C57682u2;
import X.C57722u6;
import X.C59022wD;
import X.C73883gE;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {162}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
public final class PausingDispatcherKt$whenStateAtLeast$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4GR $block;
    public final /* synthetic */ AnonymousClass0GC $minState;
    public final /* synthetic */ AnonymousClass0O9 $this_whenStateAtLeast;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(AnonymousClass0GC r2, AnonymousClass0O9 r3, C84814Du r4, AnonymousClass4GR r5) {
        super(r4, 2);
        this.$this_whenStateAtLeast = r3;
        this.$minState = r2;
        this.$block = r5;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$minState, this.$this_whenStateAtLeast, r6, this.$block);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    public final Object A09(Object obj) {
        C05980Vs r5;
        Object A05 = C73883gE.A05();
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C85474Gj r4 = (C85474Gj) ((AnonymousClass4C6) this.L$0).B61().get(C85474Gj.A00);
            if (r4 != null) {
                C14440ph r3 = new C14440ph();
                AnonymousClass0O9 r2 = this.$this_whenStateAtLeast;
                r5 = new C05980Vs(r3.A00, this.$minState, r2, r4);
                AnonymousClass4GR r0 = this.$block;
                this.L$0 = r5;
                this.label = 1;
                obj = C57722u6.A00(this, r3, r0);
                if (obj == A05) {
                    return A05;
                }
            } else {
                throw AnonymousClass001.A0e("when[State] methods should have a parent job");
            }
        } else if (i == 1) {
            r5 = (C05980Vs) this.L$0;
            try {
                C57682u2.A01(obj);
            } catch (Throwable th) {
                r5.A02();
                throw th;
            }
        } else {
            throw AnonymousClass001.A0d();
        }
        r5.A02();
        return obj;
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, AnonymousClass4C6 r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
