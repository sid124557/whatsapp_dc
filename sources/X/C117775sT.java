package X;

import java.util.Comparator;

/* renamed from: X.5sT  reason: invalid class name and case insensitive filesystem */
public class C117775sT implements Comparator {
    public C64773Ex A00;
    public C117875sd A01;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C54942pX r5 = (C54942pX) obj2;
        C64773Ex r1 = this.A00;
        AnonymousClass3ZH A07 = r1.A07(((C54942pX) obj).A06);
        if (A07 == null) {
            return 1;
        }
        AnonymousClass3ZH A072 = r1.A07(r5.A06);
        if (A072 == null) {
            return -1;
        }
        return this.A01.compare(A07, A072);
    }

    public C117775sT(C56972sr r3, C64773Ex r4, AnonymousClass5ZU r5) {
        this.A00 = r4;
        this.A01 = new C117875sd(r3, r5, 1);
    }
}
