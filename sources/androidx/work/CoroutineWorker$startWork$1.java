package androidx.work;

import X.AnonymousClass001;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass8P9;
import X.C03070Is;
import X.C57682u2;
import X.C59022wD;
import X.C73883gE;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
public final class CoroutineWorker$startWork$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ CoroutineWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$startWork$1(CoroutineWorker coroutineWorker, C84814Du r3) {
        super(r3, 2);
        this.this$0 = coroutineWorker;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new CoroutineWorker$startWork$1(this.this$0, r4);
    }

    public final Object A09(Object obj) {
        Object A05 = C73883gE.A05();
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            try {
                CoroutineWorker coroutineWorker = this.this$0;
                this.label = 1;
                obj = coroutineWorker.A0D(this);
                if (obj == A05) {
                    return A05;
                }
            } catch (Throwable th) {
                this.this$0.A0B().A0A(th);
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        this.this$0.A0B().A09((C03070Is) obj);
        return C59022wD.A00;
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, AnonymousClass4C6 r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
