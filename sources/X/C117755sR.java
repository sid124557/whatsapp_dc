package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.5sR  reason: invalid class name and case insensitive filesystem */
public class C117755sR implements Comparator {
    public final Collator A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.A00.compare(((C106705a1) obj).A03(), ((C106705a1) obj2).A03());
    }

    public C117755sR(C620733j r3) {
        Collator A0w = C86614Ku.A0w(r3);
        this.A00 = A0w;
        A0w.setDecomposition(1);
    }
}
