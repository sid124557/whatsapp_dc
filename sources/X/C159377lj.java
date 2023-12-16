package X;

import android.app.Application;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.7lj  reason: invalid class name and case insensitive filesystem */
public class C159377lj {
    public static Object A01(C153427bI r2, AnonymousClass84O r3, C157967jD r4, C835248t r5) {
        return C157157hp.A00(C131266dJ.A00(r2, ((AnonymousClass8DF) r5).A01, r3.A07), r4, r5);
    }

    public static void A02(Context context, C150917Ss r5, C157967jD r6, C47382dA r7, Map map) {
        C160817oM r3 = new C160817oM(new AnonymousClass7r0(r5.A00, new AnonymousClass84O(-1), (String) null), C155007e8.A00, AnonymousClass8DC.A00);
        if (context instanceof Application) {
            C159737mN.A01("BloksInterpreterHelper", "Creating BloksContext with Application Context. This may break the ability to execute navigation actions correctly");
        }
        C153427bI A01 = C162377rs.A01(context, AnonymousClass6CA.A0I(), r3, r7, r5.A02);
        r3.A02(A01, new C170298Cq(), Collections.emptyMap());
        C157157hp.A00(A00(r5, A01, map), r6, r5.A01);
    }

    public static C131266dJ A00(C150917Ss r6, C153427bI r7, Map map) {
        C156947hT r5 = r6.A00;
        C156077fz r2 = null;
        C162377rs.A02(r7).A07(new AnonymousClass7r0(r5, new AnonymousClass84O(-1), (String) null), AnonymousClass7r0.A04(r5.A02, map));
        C835248t r1 = r6.A01;
        if (r1 != null) {
            r2 = ((AnonymousClass8DF) r1).A01;
        }
        return C131266dJ.A00(r7, r2, (List) null);
    }
}
