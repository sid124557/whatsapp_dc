package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.5sO  reason: invalid class name and case insensitive filesystem */
public class C117725sO implements Comparator {
    public final Collator A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        Integer A01 = AnonymousClass5V6.A01(str, str2);
        if (A01 == null) {
            return this.A00.compare(str, str2);
        }
        return A01.intValue();
    }

    public C117725sO(C620733j r3) {
        Collator A0w = C86614Ku.A0w(r3);
        this.A00 = A0w;
        A0w.setDecomposition(1);
    }
}
