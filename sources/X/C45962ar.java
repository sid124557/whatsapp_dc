package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2ar  reason: invalid class name and case insensitive filesystem */
public final class C45962ar {
    public final AnonymousClass1VX A00;
    public final C54872pQ A01;
    public final C55862r2 A02;
    public final AnonymousClass2QQ A03;

    public final List A00(List list, int i) {
        if (i != 5 || this.A00.A0Y(C58422vE.A02, 6383)) {
            return list;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            AnonymousClass39M r1 = (AnonymousClass39M) next;
            if (!r1.A0H && !r1.A0J) {
                A0s.add(next);
            }
        }
        return A0s;
    }

    public C45962ar(AnonymousClass1VX r1, C54872pQ r2, C55862r2 r3, AnonymousClass2QQ r4) {
        C18260x0.A0V(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
