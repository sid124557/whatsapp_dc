package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.5sZ  reason: invalid class name and case insensitive filesystem */
public final class C117835sZ implements Comparator {
    public final C56972sr A00;
    public final AnonymousClass5ZU A01;
    public final Collator A02;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C102295Ih r9 = (C102295Ih) obj;
        C102295Ih r10 = (C102295Ih) obj2;
        C18270x1.A14(r9, r10);
        AnonymousClass3ZH r6 = r9.A00;
        AnonymousClass3ZH r4 = r10.A00;
        C56972sr r0 = this.A00;
        boolean A08 = C56972sr.A08(r0, r6);
        if (A08 == C56972sr.A08(r0, r4)) {
            C372821q r1 = r9.A02;
            C372821q r02 = C372821q.OWNER;
            A08 = AnonymousClass000.A1Y(r1, r02);
            C372821q r2 = r10.A02;
            if (A08 == AnonymousClass000.A1Y(r2, r02)) {
                C372821q r03 = C372821q.ADMIN;
                boolean A1Y = AnonymousClass000.A1Y(r1, r03);
                if (A1Y == AnonymousClass000.A1Y(r2, r03)) {
                    Collator collator = this.A02;
                    AnonymousClass5ZU r22 = this.A01;
                    return C117875sd.A00(r22.A0D(r6, 7, false, false), r22.A0D(r4, 7, false, false), collator);
                } else if (A1Y) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (A08) {
            return -1;
        }
        return 1;
    }

    public C117835sZ(C56972sr r3, AnonymousClass5ZU r4) {
        this.A00 = r3;
        this.A01 = r4;
        Collator A0w = C86614Ku.A0w(r4.A03);
        A0w.setDecomposition(1);
        this.A02 = A0w;
    }
}
