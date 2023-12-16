package X;

import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2xd  reason: invalid class name and case insensitive filesystem */
public class C59872xd {
    public final List A00;

    public final Pair A01() {
        List list = this.A00;
        double A002 = A00(list);
        double A003 = A00(list);
        Iterator it = list.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            double A05 = ((double) C18280x3.A05(it)) - A003;
            d += A05 * A05;
        }
        double sqrt = Math.sqrt(d / ((double) list.size()));
        return C18290x4.A0K(Integer.valueOf((int) (A002 - (2.0d * sqrt))), (int) (A002 + (sqrt * 1.0d)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(int r7) {
        /*
            r6 = this;
            java.util.List r5 = r6.A00
            int r1 = r5.size()
            r0 = 10
            if (r1 < r0) goto L_0x003a
            android.util.Pair r2 = r6.A01()
            java.lang.Object r1 = r2.first
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            if (r7 < r0) goto L_0x0036
            java.lang.Object r1 = r2.second
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            if (r7 > r0) goto L_0x0036
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r5.add(r0)
        L_0x0029:
            int r1 = r5.size()
            r0 = 20
            if (r1 <= r0) goto L_0x0035
            r0 = 0
            r5.remove(r0)
        L_0x0035:
            return
        L_0x0036:
            r5.add(r1)
            goto L_0x0029
        L_0x003a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r5.add(r0)
            int r1 = r5.size()
            r0 = 10
            if (r1 < r0) goto L_0x0035
            android.util.Pair r4 = r6.A01()
            r3 = 0
        L_0x004e:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x0035
            int r2 = X.AnonymousClass000.A09(r5, r3)
            java.lang.Object r1 = r4.first
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            if (r2 < r0) goto L_0x006c
            java.lang.Object r1 = r4.second
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            if (r2 <= r0) goto L_0x006f
        L_0x006c:
            r5.set(r3, r1)
        L_0x006f:
            int r3 = r3 + 1
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59872xd.A02(int):void");
    }

    public C59872xd(List list) {
        this.A00 = list;
    }

    public static double A00(List list) {
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += (long) C18280x3.A05(it);
        }
        return ((double) j) / ((double) list.size());
    }
}
