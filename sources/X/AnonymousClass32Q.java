package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.32Q  reason: invalid class name */
public final class AnonymousClass32Q {
    public static final C44002Uh A07 = new C44002Uh();
    public final C69263Wi A00;
    public final C106685Zz A01;
    public final C49312gK A02;
    public final C29161iN A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final C183538qC A06;

    public static final /* synthetic */ void A00(C108895dj r4, C52732lx r5, AnonymousClass32Q r6, List list) {
        List A002 = A07.A00(r4, r6.A02, list);
        C129586aY r0 = r5.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (A002.contains(C624134x.A0A((C624134x) next))) {
                A0s.add(next);
            }
        }
        ArrayList A0c = C73783g4.A0c(A0s);
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            C624134x.A0Z(A0c, it2);
        }
        AnonymousClass36X.A06(r6.A00, r6.A03, r6.A05, A0c, 3);
    }

    public AnonymousClass32Q(C69263Wi r1, C106685Zz r2, C49312gK r3, C29161iN r4, C183538qC r5, C183538qC r6, C183538qC r7) {
        C18260x0.A0d(r1, r2, r4, r5);
        C18260x0.A0U(r6, r7);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
    }
}
