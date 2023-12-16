package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.63M  reason: invalid class name */
public final class AnonymousClass63M extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ Set $fulfilledRequest;
    public final /* synthetic */ AnonymousClass4GQ $onResult;
    public final /* synthetic */ C69903Yy $searchQueryResponse;
    public final /* synthetic */ AnonymousClass5J2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63M(AnonymousClass5J2 r2, Set set, AnonymousClass4GQ r4, C69903Yy r5) {
        super(1);
        this.this$0 = r2;
        this.$fulfilledRequest = set;
        this.$searchQueryResponse = r5;
        this.$onResult = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = (C1450473y) obj;
        C162457s7.A0J(obj2, 0);
        Set set = this.$fulfilledRequest;
        C69903Yy r4 = this.$searchQueryResponse;
        AnonymousClass4GQ r3 = this.$onResult;
        Integer A0b = C18290x4.A0b();
        set.add(A0b);
        if (obj2 instanceof C132596fd) {
            List list = ((AnonymousClass7QA) r4.element).A09;
            List list2 = ((C132596fd) obj2).A00.A09;
            C162457s7.A0C(list2);
            list.addAll(list2);
            if (set.contains(A0b) && C18300x5.A1X(set, 2)) {
                obj2 = new C132596fd((AnonymousClass7QA) r4.element);
            }
            return C59022wD.A00;
        }
        r3.invoke(obj2);
        return C59022wD.A00;
    }
}
