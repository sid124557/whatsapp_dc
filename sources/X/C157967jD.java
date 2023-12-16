package X;

import java.util.List;

/* renamed from: X.7jD  reason: invalid class name and case insensitive filesystem */
public class C157967jD {
    public static final C157967jD A01 = new C157967jD(new C152057Xj().A00);
    public final List A00;

    public static Object A00(C157967jD r2, Object obj) {
        C162457s7.A0J(r2, 0);
        C162457s7.A0J(obj, 1);
        return r2.A04(0);
    }

    public static String A01(C157967jD r0, int i) {
        return (String) r0.A00.get(i);
    }

    public Object A03(int i) {
        return this.A00.get(i);
    }

    public Object A04(int i) {
        Object obj = this.A00.get(i);
        obj.getClass();
        return obj;
    }

    public C157967jD(List list) {
        this.A00 = list;
    }

    public static String A02(C157967jD r0, int i) {
        Object A04 = r0.A04(i);
        C162457s7.A0K(A04, "null cannot be cast to non-null type kotlin.String");
        return (String) A04;
    }
}
