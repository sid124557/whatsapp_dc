package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.63C  reason: invalid class name */
public final class AnonymousClass63C extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass5ZI $directoryQplLogger;
    public final /* synthetic */ C104755Sf $searchQueryResult;
    public final /* synthetic */ AnonymousClass5OG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63C(AnonymousClass5OG r2, C104755Sf r3, AnonymousClass5ZI r4) {
        super(1);
        this.this$0 = r2;
        this.$searchQueryResult = r3;
        this.$directoryQplLogger = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1450473y r1 = (C1450473y) obj;
        C162457s7.A0J(r1, 0);
        AnonymousClass5OG r8 = this.this$0;
        C104755Sf r6 = this.$searchQueryResult;
        AnonymousClass5ZI r5 = this.$directoryQplLogger;
        Set set = r6.A04;
        C86654Ky.A1R(set, 1);
        if (r1 instanceof C132596fd) {
            C105725Wd r0 = r8.A04;
            AnonymousClass7QA r3 = ((C132596fd) r1).A00;
            r0.A01(r3);
            List list = r3.A0A;
            C162457s7.A0C(list);
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : list) {
                C166447yh r12 = (C166447yh) next;
                AnonymousClass7Y3 r02 = r6.A01;
                C162457s7.A0H(r12);
                C86624Kv.A1Q(next, A0s, AnonymousClass5V4.A00(r02, r12) ? 1 : 0);
            }
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                C86624Kv.A1Q(next2, A0s2, r6.A02.A0A.contains(next2) ? 1 : 0);
            }
            AnonymousClass7QA r03 = r6.A02;
            List list2 = r03.A0A;
            C86634Kw.A1U(A0s2, list2);
            BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = r8.A00;
            if (businessDirectoryContextualSearchViewModel != null) {
                String str = r6.A03;
                List list3 = r03.A0C;
                List list4 = r03.A09;
                C158377js r9 = r03.A01;
                String str2 = r03.A05;
                String str3 = r03.A08;
                AnonymousClass7Y3 r82 = r6.A01;
                boolean z = !C18300x5.A1X(set, 2);
                r3.A0C.size();
                List list5 = r3.A09;
                list5.size();
                list5.size();
                businessDirectoryContextualSearchViewModel.A0R(r82, r9, str, str2, str3, list2, list3, list4, z);
            }
            if (r5 != null && C18300x5.A1X(set, 2)) {
                r5.A04();
            }
        } else if (r1 instanceof C132586fc) {
            int i = ((C132586fc) r1).A00;
            r6.A00 = i;
            BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel2 = r8.A00;
            if (businessDirectoryContextualSearchViewModel2 != null) {
                businessDirectoryContextualSearchViewModel2.A0K.A0S(new C117205rY(businessDirectoryContextualSearchViewModel2, r6.A03, i, 1));
            }
            if (r5 != null) {
                r5.A03();
            }
        }
        return C59022wD.A00;
    }
}
