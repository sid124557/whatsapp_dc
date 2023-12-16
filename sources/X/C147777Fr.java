package X;

import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Fr  reason: invalid class name and case insensitive filesystem */
public class C147777Fr {
    public HashMap A00 = AnonymousClass001.A0t();
    public List A01 = AnonymousClass001.A0s();

    public C147777Fr(SparseArray sparseArray) {
        long j;
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (sparseArray.valueAt(i) != null) {
                C153247av r0 = (C153247av) sparseArray.valueAt(i);
                j = TimeUnit.MICROSECONDS.convert(r0.A01, r0.A02);
            } else {
                j = -1;
            }
            this.A01.add(AnonymousClass0x9.A0C(Integer.valueOf(keyAt), Long.valueOf(j)));
        }
        AnonymousClass91R.A00(this, this.A01, 5);
        for (int i2 = 0; i2 < this.A01.size(); i2++) {
            AnonymousClass0x2.A1I(((Pair) this.A01.get(i2)).first, this.A00, i2);
        }
    }
}
