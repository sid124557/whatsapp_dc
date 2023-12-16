package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.63Y  reason: invalid class name */
public final class AnonymousClass63Y extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass7H6 $businessDirectoryResultsPage;
    public final /* synthetic */ AnonymousClass5ZI $directoryQplLogger;
    public final /* synthetic */ C150967Sx $filters;
    public final /* synthetic */ String $query;
    public final /* synthetic */ String $queryId;
    public final /* synthetic */ AnonymousClass5ZO $searchLocation;
    public final /* synthetic */ int $searchQueryBusinessType;
    public final /* synthetic */ String $searchSessionId;
    public final /* synthetic */ AnonymousClass5OG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63Y(AnonymousClass7H6 r2, C150967Sx r3, AnonymousClass5ZO r4, AnonymousClass5OG r5, AnonymousClass5ZI r6, String str, String str2, String str3, int i) {
        super(1);
        this.$query = str;
        this.this$0 = r5;
        this.$searchLocation = r4;
        this.$searchQueryBusinessType = i;
        this.$businessDirectoryResultsPage = r2;
        this.$filters = r3;
        this.$queryId = str2;
        this.$searchSessionId = str3;
        this.$directoryQplLogger = r6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass7Y3 r2 = (AnonymousClass7Y3) obj;
        C162457s7.A0J(r2, 0);
        C104755Sf r7 = new C104755Sf(r2, this.$query, 22);
        AnonymousClass5OG r5 = this.this$0;
        String str = this.$query;
        C105725Wd r10 = r5.A04;
        C162457s7.A0J(str, 0);
        LinkedList linkedList = r10.A02;
        C162457s7.A0J(linkedList, 0);
        ArrayList A0J = AnonymousClass002.A0J(linkedList);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : A0J) {
            String str2 = ((C166447yh) next).A01;
            C162457s7.A0C(str2);
            if (AnonymousClass5A7.A00(r10.A00, str2, str)) {
                A0s.add(next);
            }
        }
        LinkedList linkedList2 = r10.A01;
        C162457s7.A0J(linkedList2, 0);
        ArrayList A0J2 = AnonymousClass002.A0J(linkedList2);
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (Object next2 : A0J2) {
            String str3 = ((C109065e1) next2).A0I;
            C162457s7.A0C(str3);
            if (AnonymousClass5A7.A00(r10.A00, str3, str)) {
                A0s2.add(next2);
            }
        }
        LinkedList linkedList3 = r10.A03;
        C162457s7.A0J(linkedList3, 0);
        ArrayList A0J3 = AnonymousClass002.A0J(linkedList3);
        ArrayList A0s3 = AnonymousClass001.A0s();
        for (Object next3 : A0J3) {
            String str4 = ((C109065e1) next3).A0I;
            C162457s7.A0C(str4);
            if (AnonymousClass5A7.A00(r10.A00, str4, str)) {
                A0s3.add(next3);
            }
        }
        ArrayList A0s4 = AnonymousClass001.A0s();
        Iterator it = A0s2.iterator();
        while (it.hasNext()) {
            Object next4 = it.next();
            C86624Kv.A1Q(next4, A0s4, AnonymousClass5V4.A01(r7.A01, (C109065e1) next4) ? 1 : 0);
        }
        AnonymousClass7QA r12 = r7.A02;
        List list = r12.A09;
        list.addAll(A0s4.subList(0, Math.min(A0s4.size(), 1 - list.size())));
        ArrayList A0s5 = AnonymousClass001.A0s();
        Iterator it2 = A0s3.iterator();
        while (it2.hasNext()) {
            Object next5 = it2.next();
            C86624Kv.A1Q(next5, A0s5, AnonymousClass5V4.A01(r7.A01, (C109065e1) next5) ? 1 : 0);
        }
        List list2 = r12.A0C;
        C86634Kw.A1U(A0s5, list2);
        ArrayList A0s6 = AnonymousClass001.A0s();
        Iterator it3 = A0s.iterator();
        while (it3.hasNext()) {
            Object next6 = it3.next();
            C86624Kv.A1Q(next6, A0s6, AnonymousClass5V4.A00(r7.A01, (C166447yh) next6) ? 1 : 0);
        }
        List list3 = r12.A0A;
        C86634Kw.A1U(A0s6, list3);
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = r5.A00;
        if (businessDirectoryContextualSearchViewModel != null) {
            C158377js r4 = r12.A01;
            String str5 = r12.A05;
            String str6 = r12.A08;
            businessDirectoryContextualSearchViewModel.A0R(r7.A01, r4, str, str5, str6, list3, list2, list, true);
        }
        AnonymousClass5OG r6 = this.this$0;
        String str7 = this.$query;
        AnonymousClass5ZO r15 = this.$searchLocation;
        int i = this.$searchQueryBusinessType;
        AnonymousClass7H6 r13 = this.$businessDirectoryResultsPage;
        C150967Sx r14 = this.$filters;
        String str8 = this.$queryId;
        String str9 = this.$searchSessionId;
        AnonymousClass5ZI r3 = this.$directoryQplLogger;
        AnonymousClass5HL r0 = r6.A03;
        String A0k = C86604Kt.A0k();
        AnonymousClass63C r9 = new AnonymousClass63C(r6, r7, r3);
        boolean A1Y = AnonymousClass0x2.A1Y(str7, r15);
        if (r3 != null) {
            r3.A09("text_search_category_request_start");
        }
        AnonymousClass64W r122 = r0.A00;
        C59722xN r1 = r0.A01.A00;
        boolean z = A1Y;
        AnonymousClass93B r16 = new AnonymousClass93B(r3, r9, A1Y ? 1 : 0);
        C59722xN r17 = r1;
        r122.B0F(r13, r14, r15, r16, r17, (AnonymousClass5ZI) null, str7, str8, A0k, str9, z ? 1 : 0, A1Y, false).A08();
        r6.A00(r13, r14, r15, r7, r3, str7, str8, C86604Kt.A0k(), str9, i, z);
        return C59022wD.A00;
    }
}
