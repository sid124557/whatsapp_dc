package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.63U  reason: invalid class name */
public final class AnonymousClass63U extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ Set $fulfilledRequest;
    public final /* synthetic */ AnonymousClass4GQ $onResult;
    public final /* synthetic */ int $searchQueryBusinessType;
    public final /* synthetic */ C69903Yy $searchQueryResponse;
    public final /* synthetic */ AnonymousClass5J2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63U(AnonymousClass5J2 r2, Set set, AnonymousClass4GQ r4, C69903Yy r5, int i) {
        super(1);
        this.this$0 = r2;
        this.$fulfilledRequest = set;
        this.$searchQueryResponse = r5;
        this.$searchQueryBusinessType = i;
        this.$onResult = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = (C1450473y) obj;
        C162457s7.A0J(obj2, 0);
        Set set = this.$fulfilledRequest;
        C69903Yy r8 = this.$searchQueryResponse;
        int i = this.$searchQueryBusinessType;
        AnonymousClass4GQ r6 = this.$onResult;
        Integer A0S = C18280x3.A0S();
        set.add(A0S);
        if (obj2 instanceof C132596fd) {
            AnonymousClass7QA r13 = ((C132596fd) obj2).A00;
            List list = r13.A09;
            List list2 = ((AnonymousClass7QA) r8.element).A09;
            C162457s7.A0C(list2);
            list.addAll(list2);
            List list3 = r13.A0A;
            List list4 = r13.A0C;
            C158377js r15 = r13.A01;
            String str = r13.A04;
            String str2 = r13.A05;
            String str3 = r13.A08;
            String str4 = r13.A07;
            int i2 = r13.A00;
            Double d = r13.A02;
            List list5 = list3;
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            C158377js r14 = r15;
            Double d2 = d;
            r8.element = new AnonymousClass7QA(r14, d2, str5, str6, str7, str4, r13.A06, r13.A03, list5, list, list4, r13.A0B, i2);
            if ((C18300x5.A1X(set, 4) && set.contains(A0S)) || i == 1) {
                obj2 = new C132596fd((AnonymousClass7QA) r8.element);
            }
            return C59022wD.A00;
        }
        r6.invoke(obj2);
        return C59022wD.A00;
    }
}
