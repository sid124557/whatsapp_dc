package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.8D2  reason: invalid class name */
public class AnonymousClass8D2 implements C181438ml {
    public C835248t A00;
    public final String A01;

    public boolean BsI(AnonymousClass84O r5) {
        LinkedList linkedList = r5.A06;
        if (linkedList == null) {
            return false;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            AnonymousClass7MQ r2 = (AnonymousClass7MQ) it.next();
            String str = this.A01;
            String str2 = r2.A03;
            if (str2 != null && str2.equals(str)) {
                this.A00 = r2.A02;
                return true;
            }
        }
        return false;
    }

    public AnonymousClass8D2(String str) {
        this.A01 = str;
    }
}
