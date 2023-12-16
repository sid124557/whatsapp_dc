package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.6dV  reason: invalid class name and case insensitive filesystem */
public class C131386dV extends AnonymousClass8DK {
    public List A00;
    public final C142786xm A01;

    public C131386dV(AnonymousClass8DK r3, C142786xm r4) {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A00 = A0s;
        A0s.add(r3);
        A0s.add((Object) null);
        this.A01 = r4;
    }

    public boolean AxC(AnonymousClass7MS r6) {
        C142786xm r4 = this.A01;
        if (r4 == C142786xm.OR) {
            for (AnonymousClass8DK AxC : this.A00) {
                if (AxC.AxC(r6)) {
                }
            }
            return false;
        }
        C142786xm r1 = C142786xm.AND;
        List<AnonymousClass8DK> list = this.A00;
        if (r4 != r1) {
            return !((AnonymousClass8DK) list.get(0)).AxC(r6);
        }
        for (AnonymousClass8DK AxC2 : list) {
            if (!AxC2.AxC(r6)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0w = C18290x4.A0w("(", A0o);
        A0w.append(" ");
        A0o.append(C160947oi.A00(this.A00, AnonymousClass000.A0V(this.A01.operatorString, " ", A0w), ""));
        return AnonymousClass000.A0e(A0o);
    }

    public C131386dV(C142786xm r2, Collection collection) {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A00 = A0s;
        A0s.addAll(collection);
        this.A01 = r2;
    }
}
