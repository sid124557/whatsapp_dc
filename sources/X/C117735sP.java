package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.5sP  reason: invalid class name and case insensitive filesystem */
public class C117735sP implements Comparator {
    public final Collator A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = ((C104215Qc) obj).A06;
        String str2 = ((C104215Qc) obj2).A06;
        if (str == null) {
            if (str2 == null) {
                return 0;
            }
            return 1;
        } else if (str2 == null) {
            return -1;
        } else {
            return this.A00.compare(str, str2);
        }
    }

    public C117735sP(C620733j r3) {
        Collator A0w = C86614Ku.A0w(r3);
        this.A00 = A0w;
        A0w.setDecomposition(1);
    }
}
