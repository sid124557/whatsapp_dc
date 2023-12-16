package X;

import android.util.SparseIntArray;

/* renamed from: X.4Vu  reason: invalid class name */
public class AnonymousClass4Vu extends AnonymousClass0QO {
    public final C118295tJ A00;
    public final C118295tJ A01;
    public final String A02;
    public final String A03;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        Object obj;
        Object obj2;
        C156137g5 r4 = (C156137g5) this.A01.get(i);
        C156137g5 r3 = (C156137g5) this.A00.get(i2);
        int i3 = r3.A00;
        if (i3 == 1 || i3 == 12 || i3 == 4 || i3 == 6 || i3 == 3 || i3 == 2 || i3 == 38 || C156137g5.A01(i3)) {
            int i4 = r4.A00;
            if (C156137g5.A01(i4) || C156137g5.A01(i3)) {
                obj = Integer.valueOf(i4);
                obj2 = Integer.valueOf(i3);
            } else if (i4 == 4 && i3 == 4) {
                SparseIntArray sparseIntArray = (SparseIntArray) r4.A01;
                SparseIntArray sparseIntArray2 = (SparseIntArray) r3.A01;
                if (sparseIntArray.size() != sparseIntArray2.size()) {
                    return false;
                }
                for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                    if (sparseIntArray.keyAt(i5) != sparseIntArray2.keyAt(i5) || sparseIntArray.valueAt(i5) != sparseIntArray2.valueAt(i5)) {
                        return false;
                    }
                }
                return true;
            } else {
                obj = r4.A01;
                obj2 = r3.A01;
            }
            return AnonymousClass75J.A00(obj, obj2);
        } else if (!AnonymousClass75J.A00(Integer.valueOf(r4.A00), Integer.valueOf(i3)) || !AnonymousClass75J.A00(this.A03, this.A02)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean A04(int i, int i2) {
        Object obj;
        Object obj2;
        C156137g5 r5 = (C156137g5) this.A01.get(i);
        C156137g5 r4 = (C156137g5) this.A00.get(i2);
        int i3 = r5.A00;
        if (!C156137g5.A01(i3)) {
            int i4 = r4.A00;
            if (!C156137g5.A01(i4)) {
                if (i3 == 4) {
                    return AnonymousClass000.A1U(i4, 4);
                }
                if (!this.A03.equals(this.A02)) {
                    obj = Integer.valueOf(i3);
                    obj2 = Integer.valueOf(i4);
                    return AnonymousClass75J.A00(obj, obj2);
                }
            }
        }
        obj = r5.A01;
        obj2 = r4.A01;
        return AnonymousClass75J.A00(obj, obj2);
    }

    public AnonymousClass4Vu(C118295tJ r1, C118295tJ r2, String str, String str2) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = str;
        this.A02 = str2;
    }
}
