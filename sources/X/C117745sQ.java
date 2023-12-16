package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.5sQ  reason: invalid class name and case insensitive filesystem */
public class C117745sQ implements Comparator {
    public final Collator A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.A00.compare(((C112795kJ) obj).A00, ((C112795kJ) obj2).A00);
    }

    public C117745sQ(C620733j r3) {
        Collator A0w = C86614Ku.A0w(r3);
        this.A00 = A0w;
        A0w.setDecomposition(1);
    }
}
