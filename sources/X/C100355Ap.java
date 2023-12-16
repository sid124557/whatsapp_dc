package X;

/* renamed from: X.5Ap  reason: invalid class name and case insensitive filesystem */
public class C100355Ap {
    public static C624134x A00(C87234On r5, C624134x r6) {
        C624134x r4 = null;
        if (r5.getCursor() != null) {
            int count = r5.getCount();
            int A03 = r5.A03(r6);
            if (A03 >= 0) {
                int i = A03 + 1;
                r4 = r5.getItem(i);
                while (i <= count && r4 != null && (r4.A1J.A00 == null || r4.A1I == 10)) {
                    r4 = r5.getItem(i);
                    i++;
                }
            }
        }
        return r4;
    }
}
