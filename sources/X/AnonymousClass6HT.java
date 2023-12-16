package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.6HT  reason: invalid class name */
public final class AnonymousClass6HT extends C011809m {
    public final C620733j A00;

    public int[] A07(View view, C06440Xs r8) {
        int right;
        int A02;
        char A1Y = AnonymousClass0x2.A1Y(r8, view);
        if (!r8.A17()) {
            return super.A07(view, r8);
        }
        int[] A1Z = C86664Kz.A1Z();
        C17600vq r2 = new C17600vq(r8, 0);
        if (this.A00.A0T()) {
            right = view.getLeft();
            A02 = r2.A04();
        } else {
            right = view.getRight();
            A02 = r2.A02();
        }
        A1Z[0] = right - A02;
        A1Z[A1Y] = 0;
        return A1Z;
    }

    public boolean A01(int i, int i2) {
        if (i < -3000) {
            i = -3000;
        } else if (i > 3000) {
            i = 3000;
        }
        return super.A01(i, i2);
    }

    public View A03(C06440Xs r10) {
        if (!(r10 instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r10;
        if (!linearLayoutManager.A17()) {
            return null;
        }
        C17600vq r8 = new C17600vq(r10, 0);
        C162457s7.A0K(r10, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int A1H = linearLayoutManager.A1H();
        boolean A1U = AnonymousClass000.A1U(linearLayoutManager.A1I(), linearLayoutManager.A09() - 1);
        if (A1H != -1 && !A1U) {
            View A0P = r10.A0P(A1H);
            int A06 = r8.A06(A0P);
            int A07 = r8.A07(A0P) / 2;
            if (this.A00.A0U()) {
                A06 = r8.A02.A03 - r8.A09(A0P);
            }
            if (A06 >= A07) {
                return A0P;
            }
            if (linearLayoutManager.A1G() != linearLayoutManager.A09() - 1) {
                return r10.A0P(A1H + 1);
            }
        }
        return null;
    }

    public AnonymousClass6HT(C620733j r1) {
        this.A00 = r1;
    }
}
