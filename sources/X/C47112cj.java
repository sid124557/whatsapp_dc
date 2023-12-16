package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2cj  reason: invalid class name and case insensitive filesystem */
public final class C47112cj {
    public long A00;
    public final C56612sH A01;
    public final C56982ss A02;
    public final AnonymousClass1VX A03;
    public final C384627q A04;
    public final C49122g1 A05;
    public final AnonymousClass2YW A06;
    public final List A07 = AnonymousClass001.A0s();

    public C47112cj(C56612sH r2, C56982ss r3, AnonymousClass1VX r4, C384627q r5, C49122g1 r6, AnonymousClass2YW r7) {
        C18260x0.A0f(r2, r4, r3, r7, r5);
        C162457s7.A0J(r6, 6);
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
    }

    public final List A00(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass31A A002 = C56982ss.A00(this.A02, ((AnonymousClass31A) it.next()).A05());
            if ((A002 instanceof AnonymousClass1RL) && A002 != null) {
                A0s.add(A002);
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (AnonymousClass000.A1Y(((AnonymousClass1RL) next).A07, C372821q.GUEST)) {
                A0s2.add(next);
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A19("RecommendedCache Returning ", A0o, A0s2);
        C18260x0.A1J(A0o, " items");
        return A0s2;
    }
}
