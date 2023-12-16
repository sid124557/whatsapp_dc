package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.6HU  reason: invalid class name */
public class AnonymousClass6HU extends C011809m {
    public C05590Uc A00;
    public final double A01 = 0.8d;
    public final boolean A02 = true;

    public int A02(C06440Xs r6, int i, int i2) {
        int A09;
        View A03;
        int A032;
        if (!(r6 instanceof C16040sN) || (A09 = r6.A09()) == 0 || (A03 = A03(r6)) == null || (A032 = C06440Xs.A03(A03)) == -1 || ((C16040sN) r6).AzL(A09 - 1) == null) {
            return -1;
        }
        int A022 = super.A02(r6, i, i2);
        if (A022 != -1 || i == 0) {
            return A022;
        }
        return A032 + (Math.abs(i) / i);
    }

    public View A03(C06440Xs r13) {
        if ((r13 instanceof LinearLayoutManager) && r13.A17()) {
            C05590Uc r10 = this.A00;
            if (r10 == null) {
                r10 = new C17600vq(r13, 0);
                this.A00 = r10;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r13;
            int A1H = linearLayoutManager.A1H();
            boolean A1U = AnonymousClass000.A1U(linearLayoutManager.A1I(), r13.A09() - 1);
            if (!this.A02 || linearLayoutManager.A1G() == 0 || A1U) {
                if (A1H == -1 || A1U) {
                    return null;
                }
                View A0P = r13.A0P(A1H);
                if (((double) r10.A06(A0P)) >= ((double) r10.A07(A0P)) * this.A01 && r10.A06(A0P) > 0) {
                    return A0P;
                }
                if (linearLayoutManager.A1I() != r13.A09() - 1) {
                    return r13.A0P(A1H + 1);
                }
                return null;
            }
        }
        return super.A03(r13);
    }

    public int[] A07(View view, C06440Xs r7) {
        if (this.A02) {
            int A03 = C06440Xs.A03(view);
            boolean A1T = AnonymousClass000.A1T(A03);
            boolean A1U = AnonymousClass000.A1U(A03, r7.A09() - 1);
            if (!A1T && !A1U) {
                return super.A07(view, r7);
            }
        }
        int[] A1Z = C86664Kz.A1Z();
        C05590Uc r0 = this.A00;
        if (r0 == null) {
            r0 = new C17600vq(r7, 0);
            this.A00 = r0;
        }
        A1Z[0] = r0.A09(view) - r0.A04();
        A1Z[1] = 0;
        return A1Z;
    }
}
