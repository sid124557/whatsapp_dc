package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass0XN;
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

@DebugMetadata(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
public final class BlockRunner$maybeRun$1 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass0XN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockRunner$maybeRun$1(AnonymousClass0XN r2, C84814Du r3) {
        super(r3, 2);
        this.this$0 = r2;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new BlockRunner$maybeRun$1(this.this$0, r4);
        blockRunner$maybeRun$1.L$0 = obj;
        return blockRunner$maybeRun$1;
    }

    public final Object A09(Object obj) {
        Object A05 = C73883gE.A05();
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C08320eG r1 = new C08320eG(this.this$0.A02, ((AnonymousClass4C6) this.L$0).B61());
            AnonymousClass4GR A01 = this.this$0.A04;
            this.label = 1;
            if (A01.invoke(r1, this) == A05) {
                return A05;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        this.this$0.A03.invoke();
        return C59022wD.A00;
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, AnonymousClass4C6 r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
