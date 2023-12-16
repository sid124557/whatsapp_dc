package X;

import java.util.List;

/* renamed from: X.3EC  reason: invalid class name */
public class AnonymousClass3EC implements AnonymousClass49G {
    public final /* synthetic */ C131266dJ A00;
    public final /* synthetic */ AnonymousClass84O A01;
    public final /* synthetic */ AnonymousClass8DJ A02;

    public AnonymousClass3EC(C131266dJ r1, AnonymousClass84O r2, AnonymousClass8DJ r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String A00() {
        AnonymousClass84O r3 = this.A01;
        if (r3 == null) {
            return null;
        }
        C835248t A0L = r3.A0L(135);
        if (A0L != null) {
            Object A002 = C157157hp.A00(this.A00, C157967jD.A01, A0L);
            if (A002 instanceof List) {
                List list = (List) A002;
                if (list.size() >= 2) {
                    return C18290x4.A0s(list);
                }
            }
        }
        return r3.A0O(36);
    }

    public AnonymousClass84O B3p() {
        return this.A01;
    }
}
