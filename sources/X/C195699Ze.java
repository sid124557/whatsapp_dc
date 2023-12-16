package X;

import android.util.SparseArray;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.9Ze  reason: invalid class name and case insensitive filesystem */
public class C195699Ze implements C203589nz {
    public static final Map A01 = Collections.emptyMap();
    public final SparseArray A00;

    public C195699Ze(C195119Wa r4, AnonymousClass9QR r5, C192459Jv r6, C192459Jv r7) {
        SparseArray sparseArray = new SparseArray();
        this.A00 = sparseArray;
        sparseArray.put(19, r6);
        sparseArray.put(20, r7);
        sparseArray.put(21, r4);
        sparseArray.put(22, r5);
        sparseArray.put(1, false);
        sparseArray.put(5, false);
        sparseArray.put(4, false);
        sparseArray.put(9, false);
    }

    public Object B3x(AnonymousClass9Mv r4) {
        SparseArray sparseArray = this.A00;
        int i = r4.A00;
        Object obj = sparseArray.get(i);
        if (obj != null) {
            return obj;
        }
        if (i == 0) {
            return Boolean.TRUE;
        }
        if (!(i == 3 || i == 26 || i == 33 || i == 6 || i == 7 || i == 8)) {
            int i2 = 0;
            if (i != 23) {
                i2 = -1;
                if (i != 24) {
                    if (!(i == 30 || i == 31)) {
                        switch (i) {
                            case 10:
                            case 11:
                            case 13:
                            case 14:
                                break;
                            case 12:
                                return A01;
                            default:
                                switch (i) {
                                    case 16:
                                    case 17:
                                    case 18:
                                        break;
                                    default:
                                        throw C1899593h.A0Y("Invalid Settings key: ", AnonymousClass001.A0o(), i);
                                }
                        }
                    }
                }
            }
            return Integer.valueOf(i2);
        }
        return Boolean.FALSE;
    }
}
