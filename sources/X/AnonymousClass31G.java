package X;

/* renamed from: X.31G  reason: invalid class name */
public class AnonymousClass31G {
    public static void A01(C56152rV r6, AnonymousClass3LP r7, AnonymousClass4FV r8, C95814uZ r9, AnonymousClass4FS r10, Integer num, Integer num2, int i) {
        C95814uZ r5 = r9;
        if (C57362tW.A00(r7, r9)) {
            Integer num3 = num;
            r10.BkM(new C71473cA(num3, r8, r6, num2, r5, i, 0));
        }
    }

    public static String A00(C624134x r3) {
        String str = r3.A1J.A01;
        if (!C107575bX.A0F(str)) {
            String[] split = str.split("-");
            if (split.length >= 2) {
                return split[0];
            }
        }
        return null;
    }

    public static void A02(AnonymousClass3LP r3, AnonymousClass4FV r4, C624134x r5, int i) {
        if (r5 != null) {
            AnonymousClass2z0 r2 = r5.A1J;
            if (C57362tW.A00(r3, r2.A00)) {
                C24811Yv r1 = new C24811Yv();
                r1.A03 = r2.A01;
                r1.A02 = A00(r5);
                r1.A00 = Integer.valueOf(C624134x.A05(r5));
                r1.A01 = Integer.valueOf(i);
                r4.BhD(r1);
            }
        }
    }
}
