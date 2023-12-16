package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2hY  reason: invalid class name and case insensitive filesystem */
public final class C50052hY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C84954Ej A01;
    public final /* synthetic */ C47272cz A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;

    public C50052hY(C84954Ej r1, C47272cz r2, String str, List list, List list2, int i) {
        this.A02 = r2;
        this.A05 = list;
        this.A04 = list2;
        this.A01 = r1;
        this.A03 = str;
        this.A00 = i;
    }

    public void A00() {
        AnonymousClass356.A02("EligibilityManager/generateEligibilityGraphqlCallback delivery failure");
        C48612fB r4 = (C48612fB) this.A02.A08.get();
        String str = this.A03;
        List list = this.A05;
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x.A0Z(A0c, it);
        }
        r4.A01(str, A0c, this.A04);
        this.A01.BQp();
    }

    public void A01(C34621vS r8) {
        AnonymousClass356.A02(AnonymousClass000.A0P(r8, "EligibilityManager/generateEligibilityGraphqlCallback unknown error with exception: ", AnonymousClass001.A0o()));
        List list = this.A05;
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x.A0Z(A0c, it);
        }
        List list2 = this.A04;
        C47272cz r0 = this.A02;
        C626736a.A06(r0.A01, r0.A03, r0.A07, A0c, list2, 4);
        this.A01.BSA(r8);
    }
}
