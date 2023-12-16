package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
/* renamed from: X.8UM  reason: invalid class name */
public final class AnonymousClass8UM extends C75013pU {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AnonymousClass8PR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8UM(C84814Du r1, AnonymousClass8PR r2) {
        super(r1);
        this.this$0 = r2;
    }

    public final Object A09(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A00 = AnonymousClass8PR.A00(this, this.this$0);
        if (A00 != AnonymousClass218.COROUTINE_SUSPENDED) {
            return new C60472yc(A00);
        }
        return A00;
    }
}
