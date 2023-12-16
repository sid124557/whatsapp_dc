package X;

/* renamed from: X.7py  reason: invalid class name and case insensitive filesystem */
public class C161577py {
    public static C186438vJ A00 = AnonymousClass82J.A00;

    public static void A00(Class cls, Object obj, Object obj2, Object obj3, String str) {
        if (A00.BI0(2)) {
            Object[] A1X = AnonymousClass0x9.A1X();
            C18260x0.A0j(obj, obj2, obj3, A1X);
            String A0T = AnonymousClass6CA.A0T(str, A1X);
            C186438vJ r1 = A00;
            if (r1.BI0(2)) {
                r1.BsD(cls.getSimpleName(), A0T);
            }
        }
    }

    public static void A01(Class cls, Object obj, Object obj2, String str) {
        C186438vJ r3 = A00;
        if (r3.BI0(2)) {
            String simpleName = cls.getSimpleName();
            Object[] objArr = new Object[2];
            AnonymousClass000.A16(obj, obj2, objArr);
            r3.BsD(simpleName, AnonymousClass6CA.A0T(str, objArr));
        }
    }

    public static void A02(Class cls, Object obj, String str) {
        C186438vJ r2 = A00;
        if (r2.BI0(2)) {
            r2.BsD(cls.getSimpleName(), AnonymousClass6CA.A0T(str, AnonymousClass000.A1b(obj)));
        }
    }

    public static void A04(String str, String str2, Object... objArr) {
        C186438vJ r1 = A00;
        if (r1.BI0(5)) {
            r1.BsJ(str, AnonymousClass6CA.A0T(str2, objArr));
        }
    }

    public static void A03(Class cls, Object obj, String str, int i) {
        A01(cls, Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(i), str);
    }
}
