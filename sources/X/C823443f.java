package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.43f  reason: invalid class name and case insensitive filesystem */
public final class C823443f extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ Collection $messages;
    public final /* synthetic */ C60332yN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C823443f(C60332yN r2, Collection collection) {
        super(1);
        this.this$0 = r2;
        this.$messages = collection;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        C162457s7.A0J(abstractCollection, 0);
        C60332yN r4 = this.this$0;
        List A0C = C73723fy.A0C(this.$messages);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : A0C) {
            if (r4.A00((C624134x) next)) {
                A0s.add(next);
            }
        }
        abstractCollection.removeAll(C73723fy.A0P(A0s));
        return abstractCollection;
    }
}
