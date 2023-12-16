package androidx.work;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4C6;
import X.AnonymousClass4GR;
import X.AnonymousClass8P9;
import X.C10070hL;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
public final class CoroutineWorker$getForegroundInfoAsync$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ C10070hL $jobFuture;
    public Object L$0;
    public int label;
    public final /* synthetic */ CoroutineWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker$getForegroundInfoAsync$1(CoroutineWorker coroutineWorker, C10070hL r3, C84814Du r4) {
        super(r4, 2);
        this.$jobFuture = r3;
        this.this$0 = coroutineWorker;
    }

    public final Object A09(Object obj) {
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C10070hL r1 = this.$jobFuture;
            CoroutineWorker coroutineWorker = this.this$0;
            this.L$0 = r1;
            this.label = 1;
            coroutineWorker.A0C(this);
            throw AnonymousClass000.A0L();
        } else if (i == 1) {
            C57682u2.A01(obj);
            ((C10070hL) this.L$0).A01(obj);
            return C59022wD.A00;
        } else {
            throw AnonymousClass001.A0d();
        }
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.this$0, this.$jobFuture, r5);
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, AnonymousClass4C6 r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
