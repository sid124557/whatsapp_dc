package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5WC  reason: invalid class name */
public class AnonymousClass5WC {
    public AnonymousClass5T3 A00;
    public List A01 = AnonymousClass001.A0s();
    public final C105705Wb A02;
    public final C105355Up A03;
    public final List A04 = AnonymousClass001.A0s();

    public AnonymousClass5WC(C105705Wb r2, C105355Up r3) {
        this.A03 = r3;
        this.A02 = r2;
    }

    public static final List A00(List list, Map map) {
        AnonymousClass7ZB r0;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C109065e1 A0K = AnonymousClass4L0.A0K(it);
            if (!(A0K.A01 == 1 || (r0 = (AnonymousClass7ZB) map.get(A0K.A0F)) == null)) {
                List list2 = r0.A02;
                List list3 = r0.A03;
                String str = r0.A01;
                A0K = C109065e1.A01(A0K);
                A0K.A06 = list2;
                A0K.A05 = list3;
                A0K.A04 = str;
                A0K.A01 = 1;
            }
            A0s.add(A0K);
        }
        return A0s;
    }
}
