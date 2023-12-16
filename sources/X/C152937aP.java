package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.7aP  reason: invalid class name and case insensitive filesystem */
public abstract class C152937aP {
    public final C166637z1 A00;
    public final AnonymousClass7Z3 A01;
    public final String A02;
    public final List A03;

    public C152937aP(C166637z1 r10, C150787Sf r11, String str, List list) {
        AnonymousClass7Z3 r3;
        this.A00 = r10;
        this.A02 = str;
        this.A03 = Collections.unmodifiableList(list);
        boolean z = r11 instanceof AnonymousClass6KA;
        AnonymousClass6KA r112 = r11;
        if (z) {
            AnonymousClass6KA r113 = (AnonymousClass6KA) r11;
            AnonymousClass7TI r1 = r113.A01;
            r112 = r113;
            if (r1 != null) {
                C166637z1 r0 = this.A00;
                r3 = new AnonymousClass7Z3(0, r1.A00(r0.A0Q, r0.A04, 0, 0), -1);
                this.A01 = r3;
            }
        }
        r3 = r112.A02;
        this.A01 = r3;
    }
}
