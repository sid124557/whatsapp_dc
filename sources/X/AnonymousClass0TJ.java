package X;

import android.util.SparseBooleanArray;
import java.util.List;
import java.util.Map;

/* renamed from: X.0TJ  reason: invalid class name */
public final class AnonymousClass0TJ {
    public static final C15140qq A05 = new C08420eS();
    public final SparseBooleanArray A00 = new SparseBooleanArray();
    public final AnonymousClass0QX A01;
    public final List A02;
    public final List A03;
    public final Map A04 = new AnonymousClass05C();

    public AnonymousClass0TJ(List list, List list2) {
        this.A02 = list;
        this.A03 = list2;
        List list3 = this.A02;
        int size = list3.size();
        int i = Integer.MIN_VALUE;
        AnonymousClass0QX r3 = null;
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass0QX r1 = (AnonymousClass0QX) list3.get(i2);
            if (r1.A06 > i) {
                i = r1.A06;
                r3 = r1;
            }
        }
        this.A01 = r3;
    }
}
