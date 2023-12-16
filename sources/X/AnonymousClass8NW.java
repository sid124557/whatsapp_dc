package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.8NW  reason: invalid class name */
public final class AnonymousClass8NW implements Comparator, Serializable {
    public final float average;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        float f = ((C130956co) obj2).A00;
        float f2 = this.average;
        return Float.compare(AnonymousClass002.A00(f, f2), AnonymousClass002.A00(((C130956co) obj).A00, f2));
    }

    public AnonymousClass8NW(float f) {
        this.average = f;
    }
}
