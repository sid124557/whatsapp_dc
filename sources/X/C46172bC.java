package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.2bC  reason: invalid class name and case insensitive filesystem */
public class C46172bC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C69183Wa A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public C46172bC(C69183Wa r1, List list, int i, boolean z) {
        this.A01 = r1;
        this.A03 = z;
        this.A00 = i;
        this.A02 = list;
    }

    public void A00(int i) {
        C69183Wa r5 = this.A01;
        List list = this.A02;
        if (i != -1) {
            if (i == 0 || i == 400) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it);
                    C52032km r2 = r5.A08;
                    r2.A01(A0m, 3);
                    r2.A02(A0m, System.currentTimeMillis());
                }
            } else if (i == 500) {
                C60902zM r6 = r5.A09;
                Long A012 = r6.A01();
                if (A012 != null) {
                    r5.A0B.Bkn(r5.A0C, "ToSGatingRepository/requestRefresh", A012.longValue());
                    return;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    r5.A08.A02(AnonymousClass001.A0m(it2), System.currentTimeMillis());
                }
                r6.A02();
                return;
            } else {
                return;
            }
        }
        r5.A09.A02();
    }
}
