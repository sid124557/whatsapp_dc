package androidx.work;

import X.AnonymousClass001;
import X.AnonymousClass0Q9;
import X.AnonymousClass0TT;
import X.AnonymousClass0Xq;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class OverwritingInputMerger extends AnonymousClass0TT {
    public AnonymousClass0Xq A03(List list) {
        AnonymousClass0Q9 r3 = new AnonymousClass0Q9();
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0t.putAll(Collections.unmodifiableMap(((AnonymousClass0Xq) it.next()).A00));
        }
        r3.A03(A0t);
        return r3.A00();
    }
}
