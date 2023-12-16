package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2bJ  reason: invalid class name and case insensitive filesystem */
public final class C46242bJ {
    public final /* synthetic */ C84984Em A00;
    public final /* synthetic */ C47152cn A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public C46242bJ(C84984Em r1, C47152cn r2, String str, List list) {
        this.A01 = r2;
        this.A03 = list;
        this.A00 = r1;
        this.A02 = str;
    }

    public void A00(int i, Integer num) {
        C106245Ye.A02(AnonymousClass000.A0Y("XFamilyCrosspostEligibilityManager/generateEligibilityGraphqlCallback unknown error with code: ", AnonymousClass001.A0o(), i), (Throwable) null);
        List list = this.A03;
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x.A0Z(A0c, it);
        }
        C47152cn r0 = this.A01;
        AnonymousClass36X.A06(r0.A01, r0.A02, r0.A06, A0c, 4);
        this.A00.BRz(i, num);
    }
}
