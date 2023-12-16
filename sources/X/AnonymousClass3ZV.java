package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3ZV  reason: invalid class name */
public class AnonymousClass3ZV implements Iterable {
    public boolean A00 = false;
    public final ArrayList A01 = AnonymousClass001.A0s();
    public final Comparator A02 = new AnonymousClass4IU(8);
    public final HashMap A03 = AnonymousClass001.A0t();

    public final int A00(C95814uZ r4) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A01;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((C51482jt) arrayList.get(i)).A01.equals(r4)) {
                return i;
            }
            i++;
        }
    }

    public Iterator iterator() {
        return this.A01.iterator();
    }
}
