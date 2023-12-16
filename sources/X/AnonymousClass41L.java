package X;

import java.util.AbstractCollection;

/* renamed from: X.41L  reason: invalid class name */
public final class AnonymousClass41L extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C624134x $message;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass41L(C624134x r2) {
        super(1);
        this.$message = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        C162457s7.A0J(abstractCollection, 0);
        abstractCollection.add(this.$message);
        return abstractCollection;
    }
}
