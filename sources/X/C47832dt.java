package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2dt  reason: invalid class name and case insensitive filesystem */
public class C47832dt {
    public final List A00 = new CopyOnWriteArrayList();

    public void A00() {
        C47282d0 r0;
        for (AnonymousClass496 r02 : this.A00) {
            C86014Im r03 = (C86014Im) r02;
            int i = r03.A01;
            Object obj = r03.A00;
            switch (i) {
                case 0:
                    r0 = ((C72993el) obj).A00;
                    break;
                case 1:
                    r0 = ((C73003em) obj).A00;
                    break;
                default:
                    r0 = ((C73013en) obj).A00;
                    break;
            }
            if (r0 != null) {
                r0.A00();
            }
        }
    }

    public void A01(AnonymousClass496 r3) {
        C626936e.A06(r3);
        List list = this.A00;
        if (!list.contains(r3)) {
            list.add(r3);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Observer ");
        A0o.append(r3);
        throw AnonymousClass000.A0I(" is already registered.", A0o);
    }
}
