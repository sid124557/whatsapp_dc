package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5AJ  reason: invalid class name */
public final class AnonymousClass5AJ {
    public static final int A00(Map map) {
        C162457s7.A0J(map, 0);
        Set entrySet = map.entrySet();
        int i = 0;
        if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                if (((C102995Lb) AnonymousClass0x2.A0W(it)).A02 == 1 && (i = i + 1) < 0) {
                    AnonymousClass8UF.A0q();
                    throw AnonymousClass000.A0L();
                }
            }
        }
        return i;
    }
}
