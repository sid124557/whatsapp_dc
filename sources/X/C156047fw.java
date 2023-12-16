package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.7fw  reason: invalid class name and case insensitive filesystem */
public class C156047fw {
    public final AnonymousClass7F0 A00;
    public final String A01;

    public C156047fw(AnonymousClass7F0 r2, Set set) {
        this.A01 = A00(set);
        this.A00 = r2;
    }

    public static String A00(Set set) {
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C130146bU r1 = (C130146bU) ((C1447872y) it.next());
            A0o.append(r1.A00);
            A0o.append('/');
            A0o.append(r1.A01);
            if (it.hasNext()) {
                A0o.append(' ');
            }
        }
        return A0o.toString();
    }
}
