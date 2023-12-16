package X;

import com.whatsapp.jid.Jid;
import java.util.Comparator;

/* renamed from: X.3cj  reason: invalid class name and case insensitive filesystem */
public final class C71823cj implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C53782nf r6 = (C53782nf) obj;
        C53782nf r7 = (C53782nf) obj2;
        C18260x0.A0O(r6, r7);
        int i = (r6.A00 > r7.A00 ? 1 : (r6.A00 == r7.A00 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i != 0) {
            return 1;
        }
        int compareTo = r6.A02.compareTo((Jid) r7.A02);
        if (compareTo == 0) {
            return r6.A04.compareTo((Jid) r7.A04);
        }
        return compareTo;
    }
}
