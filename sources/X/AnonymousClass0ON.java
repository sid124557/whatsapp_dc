package X;

import android.util.SparseArray;

/* renamed from: X.0ON  reason: invalid class name */
public class AnonymousClass0ON {
    public int A00 = 0;
    public SparseArray A01 = new SparseArray();

    public void A01() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A01;
            if (i < sparseArray.size()) {
                ((AnonymousClass0M7) sparseArray.valueAt(i)).A03.clear();
                i++;
            } else {
                return;
            }
        }
    }

    public final AnonymousClass0M7 A00(int i) {
        SparseArray sparseArray = this.A01;
        AnonymousClass0M7 r0 = (AnonymousClass0M7) sparseArray.get(i);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0M7 r02 = new AnonymousClass0M7();
        sparseArray.put(i, r02);
        return r02;
    }
}
