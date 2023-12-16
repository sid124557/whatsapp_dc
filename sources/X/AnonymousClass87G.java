package X;

import android.util.SparseArray;

/* renamed from: X.87G  reason: invalid class name */
public class AnonymousClass87G implements C183868qn {
    public final C160807oL A00 = new C160807oL(new byte[4], 4);
    public final /* synthetic */ AnonymousClass86W A01;

    public AnonymousClass87G(AnonymousClass86W r4) {
        this.A01 = r4;
    }

    public void AzY(C161467pi r10) {
        if (r10.A0C() == 0 && (r10.A0C() & 128) != 0) {
            r10.A0T(6);
            int A002 = C161467pi.A00(r10) / 4;
            for (int i = 0; i < A002; i++) {
                C160807oL r2 = this.A00;
                r10.A0V(r2.A03, 0, 4);
                r2.A08(0);
                int A04 = r2.A04(16);
                r2.A09(3);
                if (A04 == 0) {
                    r2.A09(13);
                } else {
                    int A042 = r2.A04(13);
                    AnonymousClass86W r3 = this.A01;
                    SparseArray sparseArray = r3.A08;
                    if (sparseArray.get(A042) == null) {
                        sparseArray.put(A042, new AnonymousClass87K(new AnonymousClass87I(r3, A042)));
                        r3.A02++;
                    }
                }
            }
            this.A01.A08.remove(0);
        }
    }

    public void BFv(C187028wK r1, C151897Ws r2, C153267ax r3) {
    }
}
