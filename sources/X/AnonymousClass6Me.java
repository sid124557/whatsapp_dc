package X;

import android.util.SparseIntArray;

/* renamed from: X.6Me  reason: invalid class name */
public abstract class AnonymousClass6Me extends AnonymousClass82L {
    public final int[] A00;

    public AnonymousClass6Me(C177728gM r5, C156557gp r6, C186618vf r7) {
        super(r5, r6, r7);
        SparseIntArray sparseIntArray = r6.A03;
        this.A00 = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.A00;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                return;
            }
        }
    }
}
