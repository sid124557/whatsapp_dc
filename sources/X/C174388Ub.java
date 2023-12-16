package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3056}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
/* renamed from: X.8Ub  reason: invalid class name and case insensitive filesystem */
public final class C174388Ub extends C75013pU {
    public int I$0;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AnonymousClass8PR this$0;

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A05 = this.this$0.A05(this, (C175768Zq) null, 0, 0);
        if (A05 != AnonymousClass218.COROUTINE_SUSPENDED) {
            return new C60472yc(A05);
        }
        return A05;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174388Ub(C84814Du r1, AnonymousClass8PR r2) {
        super(r1);
        this.this$0 = r2;
    }
}
