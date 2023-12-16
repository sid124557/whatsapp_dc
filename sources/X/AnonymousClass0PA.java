package X;

import java.util.List;

/* renamed from: X.0PA  reason: invalid class name */
public class AnonymousClass0PA {
    public List A00 = null;

    public void A00(AnonymousClass0NW r4) {
        if (this.A00 == null) {
            this.A00 = AnonymousClass001.A0s();
        }
        int i = 0;
        while (true) {
            int size = this.A00.size();
            List list = this.A00;
            if (i >= size) {
                list.add(r4);
                return;
            } else if (((AnonymousClass0NW) list.get(i)).A00.A00 > r4.A00.A00) {
                this.A00.add(i, r4);
                return;
            } else {
                i++;
            }
        }
    }

    public void A01(AnonymousClass0PA r3) {
        List list = r3.A00;
        if (list != null) {
            if (this.A00 == null) {
                this.A00 = AnonymousClass000.A0p(list);
            }
            for (AnonymousClass0NW A002 : r3.A00) {
                A00(A002);
            }
        }
    }

    public String toString() {
        List<Object> list = this.A00;
        if (list == null) {
            return "";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        for (Object A1B : list) {
            AnonymousClass000.A1B(A1B, A0o);
            A0o.append(10);
        }
        return A0o.toString();
    }
}
