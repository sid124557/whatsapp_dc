package X;

import java.math.BigInteger;

/* renamed from: X.0ob  reason: invalid class name and case insensitive filesystem */
public final class C14080ob extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C10600iC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14080ob(C10600iC r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return BigInteger.valueOf((long) this.this$0.A00).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.A01)).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.A02));
    }
}
