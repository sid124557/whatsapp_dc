package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3fG  reason: invalid class name and case insensitive filesystem */
public class C73293fG extends ArrayList<C50612iT> {
    public C73293fG(List list, List list2) {
        super(list.size() + list2.size());
        C71843cl r0 = new C71843cl();
        addAll(list);
        addAll(list2);
        Collections.sort(this, r0);
    }
}
