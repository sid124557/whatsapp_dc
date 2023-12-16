package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.7WH  reason: invalid class name */
public class AnonymousClass7WH {
    public AnonymousClass5Z2 A00 = AnonymousClass5Z2.A03;
    public List A01 = null;
    public final String A02;

    public AnonymousClass5Z2 A00() {
        String str = this.A02;
        List list = this.A01;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new AnonymousClass5Z2(this.A00, str, list);
    }

    public void A01(C03840Lt r2) {
        List list = this.A01;
        if (list == null) {
            list = AnonymousClass001.A0s();
            this.A01 = list;
        }
        list.add(r2);
    }

    public AnonymousClass7WH(String str) {
        this.A02 = str;
    }
}
