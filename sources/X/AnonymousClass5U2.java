package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5U2  reason: invalid class name */
public class AnonymousClass5U2 {
    public long A00;
    public String A01;
    public List A02;
    public List A03;

    /* renamed from: A00 */
    public AnonymousClass5U2 clone() {
        AnonymousClass5U2 r2 = new AnonymousClass5U2();
        r2.A01 = this.A01;
        r2.A00 = this.A00;
        List list = this.A03;
        if (list != null && !list.isEmpty()) {
            r2.A03 = AnonymousClass002.A0J(this.A03);
        }
        List list2 = this.A02;
        if (list2 != null && !list2.isEmpty()) {
            r2.A02 = AnonymousClass002.A0J(this.A02);
        }
        return r2;
    }

    public List A01() {
        List list = this.A03;
        if (list != null) {
            return list;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        this.A03 = A0s;
        return A0s;
    }

    public void A02(String str) {
        List list = this.A03;
        if (list == null) {
            this.A03 = AnonymousClass001.A0s();
        } else {
            list.clear();
        }
        this.A03.add(str);
    }

    public boolean A03() {
        List list = this.A03;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        List list2 = this.A02;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        return true;
    }
}
