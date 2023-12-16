package X;

import android.util.SparseArray;
import android.view.View;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.6d9  reason: invalid class name and case insensitive filesystem */
public final class C131166d9 extends C161897qn {
    public final SparseArray A00 = AnonymousClass6CA.A0I();

    public void A03(C153427bI r5, AnonymousClass84O r6, AnonymousClass84O r7, Object obj) {
        View view = (View) obj;
        int i = r6.A03;
        SparseArray sparseArray = this.A00;
        if (sparseArray.indexOfKey(i) >= 0) {
            ((C152077Xl) sparseArray.get(i)).A01(view, r5, r6, r7);
        }
        super.A03(r5, r6, r7, obj);
    }

    public void A04(C153427bI r5, AnonymousClass84O r6, AnonymousClass84O r7, Object obj) {
        View view = (View) obj;
        int i = r6.A03;
        SparseArray sparseArray = this.A00;
        if (sparseArray.indexOfKey(i) >= 0) {
            ((C152077Xl) sparseArray.get(i)).A02(view, r5, r6, r7);
        }
        super.A04(r5, r6, r7, obj);
    }

    public Object A02(C153427bI r4, AnonymousClass84O r5) {
        int i = r5.A03;
        SparseArray sparseArray = this.A00;
        if (sparseArray.indexOfKey(i) >= 0) {
            return ((C152077Xl) sparseArray.get(i)).A00(r4, r5);
        }
        return super.A02(r4, r5);
    }

    public C131166d9(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C152077Xl r2 = (C152077Xl) it.next();
            this.A00.put(r2.A00, r2);
        }
    }
}
