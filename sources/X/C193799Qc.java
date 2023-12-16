package X;

import android.util.SparseArray;

/* renamed from: X.9Qc  reason: invalid class name and case insensitive filesystem */
public class C193799Qc {
    public final SparseArray A00 = new SparseArray();

    public final void A00(C185568tt r5, C1680083t r6) {
        SparseArray sparseArray = this.A00;
        Object obj = sparseArray.get(0);
        if (obj instanceof C185288tO) {
            r5.B1d((C185288tO) obj);
        }
        if (r6 instanceof C185288tO) {
            r5.AxO(r6);
        }
        if (r6 == null) {
            sparseArray.remove(0);
        } else {
            sparseArray.put(0, r6);
        }
    }
}
