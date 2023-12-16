package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.8NV  reason: invalid class name */
public final class AnonymousClass8NV implements Comparator, Serializable {
    public final float average;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C130956co r4 = (C130956co) obj;
        C130956co r5 = (C130956co) obj2;
        int compare = Integer.compare(r5.A01, r4.A01);
        if (compare != 0) {
            return compare;
        }
        float f = r4.A00;
        float f2 = this.average;
        return Float.compare(AnonymousClass002.A00(f, f2), AnonymousClass002.A00(r5.A00, f2));
    }

    public AnonymousClass8NV(float f) {
        this.average = f;
    }
}
