package X;

import java.util.List;

/* renamed from: X.7Xj  reason: invalid class name and case insensitive filesystem */
public class C152057Xj {
    public final List A00 = AnonymousClass001.A0s();

    public static C157967jD A02(Object obj) {
        C152057Xj r1 = new C152057Xj();
        r1.A05(obj, 0);
        return new C157967jD(r1.A00);
    }

    public C157967jD A03() {
        return new C157967jD(this.A00);
    }

    public void A04(Object obj, int i) {
        List list = this.A00;
        if (list.size() <= i) {
            list.add(i, obj);
            return;
        }
        throw AnonymousClass001.A0c("Arguments must be continuous");
    }

    @Deprecated
    public void A05(Object obj, int i) {
        List list = this.A00;
        if (list.size() <= i) {
            list.add(i, obj);
            return;
        }
        throw AnonymousClass001.A0c("Arguments must be continuous");
    }

    public static C157967jD A00(C152057Xj r0, Object obj, int i) {
        r0.A05(obj, i);
        return new C157967jD(r0.A00);
    }

    public static C157967jD A01(C152057Xj r0, Object obj, int i) {
        r0.A04(obj, i);
        return new C157967jD(r0.A00);
    }
}
