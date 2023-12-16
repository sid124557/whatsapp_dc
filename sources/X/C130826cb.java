package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6cb  reason: invalid class name and case insensitive filesystem */
public class C130826cb extends AnonymousClass8TC<FieldDescriptorType, Object> {
    public void A04() {
        Iterable entrySet;
        if (!this.A03) {
            for (int i = 0; i < this.A00.size(); i++) {
                ((Map.Entry) this.A00.get(i)).getKey();
            }
            if (this.A01.isEmpty()) {
                entrySet = C1460378i.A00;
            } else {
                entrySet = this.A01.entrySet();
            }
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                AnonymousClass001.A0w(it).getKey();
            }
        }
        super.A04();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.A02((Comparable) obj, obj2);
    }

    public C130826cb(int i) {
        super(i);
    }
}
