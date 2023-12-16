package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* renamed from: X.88q  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1692688q implements C180798le {
    public final /* synthetic */ C186498vS A00;
    public final /* synthetic */ C1685685x A01;

    public final void BGo(AnonymousClass7VD r7, Object obj) {
        boolean z;
        C126916Pv r72 = (C126916Pv) r7;
        SparseArray sparseArray = this.A01.A03;
        SparseArray sparseArray2 = r72.A00;
        sparseArray2.clear();
        int i = 0;
        while (true) {
            SparseBooleanArray sparseBooleanArray = r72.A00;
            if (i < sparseBooleanArray.size()) {
                if (i >= 0) {
                    z = true;
                    if (i < sparseBooleanArray.size()) {
                        C161487pm.A03(z);
                        int keyAt = sparseBooleanArray.keyAt(i);
                        Object obj2 = sparseArray.get(keyAt);
                        obj2.getClass();
                        sparseArray2.append(keyAt, obj2);
                        i++;
                    }
                }
                z = false;
                C161487pm.A03(z);
                int keyAt2 = sparseBooleanArray.keyAt(i);
                Object obj22 = sparseArray.get(keyAt2);
                obj22.getClass();
                sparseArray2.append(keyAt2, obj22);
                i++;
            } else {
                throw AnonymousClass001.A0g("onEvents");
            }
        }
    }

    public /* synthetic */ C1692688q(C186498vS r1, C1685685x r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
