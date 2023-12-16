package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Cw  reason: invalid class name and case insensitive filesystem */
public final class C170358Cw implements C183998r0 {
    public final List A00;

    public AnonymousClass84O Ax6(AnonymousClass84O r12) {
        List list;
        int i;
        ArrayList arrayList = null;
        int i2 = 0;
        AnonymousClass84O r5 = r12;
        while (true) {
            list = this.A00;
            if (i2 >= list.size()) {
                break;
            }
            Pair pair = (Pair) list.get(i2);
            if (((C181458mn) pair.first).Bqb(r5)) {
                if (arrayList == null) {
                    arrayList = AnonymousClass001.A0s();
                }
                arrayList.add(pair);
                AnonymousClass7Uu r1 = (AnonymousClass7Uu) pair.second;
                if (r1 instanceof C131256dI) {
                    C131256dI r13 = (C131256dI) r1;
                    int i3 = r13.A00;
                    Object obj = r13.A01;
                    Object A05 = AnonymousClass84O.A05(r5, i3);
                    if (A05 != obj) {
                        if (!(obj instanceof Number)) {
                            i = !AnonymousClass736.A00(A05, obj);
                        } else if (A05 instanceof Number) {
                            Number number = (Number) A05;
                            Number number2 = (Number) obj;
                            if (number.longValue() == number2.longValue()) {
                                i = (number.doubleValue() > number2.doubleValue() ? 1 : (number.doubleValue() == number2.doubleValue() ? 0 : -1));
                            }
                        }
                        if (i == 0) {
                        }
                    }
                }
                if (r5 == r12) {
                    r5 = new AnonymousClass84O(r12, (AnonymousClass84O) null, r12.A07, r12.A02);
                }
                ((AnonymousClass7Uu) pair.second).A00(r5);
            }
            i2++;
        }
        if (arrayList != null) {
            list.removeAll(arrayList);
        }
        return r5;
    }

    public void Bf1(AnonymousClass84O r1) {
    }

    public C170358Cw(List list) {
        this.A00 = AnonymousClass002.A0J(list);
    }
}
