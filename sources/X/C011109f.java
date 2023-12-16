package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.09f  reason: invalid class name and case insensitive filesystem */
public class C011109f extends AnonymousClass0O5 {
    public int A00 = -1;
    public boolean A01;
    public final AnonymousClass09Z A02;
    public final C153427bI A03;
    public final AnonymousClass84O A04;

    public void A05(RecyclerView recyclerView, int i) {
        C06440Xs layoutManager;
        View A032;
        boolean z = true;
        if (i != 1) {
            if (i == 0 && (layoutManager = recyclerView.getLayoutManager()) != null && (A032 = this.A02.A03(layoutManager)) != null) {
                int A002 = RecyclerView.A00(A032);
                if (A002 != this.A00 || this.A01) {
                    A01(this.A03, this.A04, A002, this.A01);
                    this.A00 = A002;
                    z = false;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C011109f r5 = (C011109f) obj;
            return this.A02 == r5.A02 && this.A04.A0C() == r5.A04.A0C();
        }
        return false;
    }

    public static void A01(C153427bI r5, AnonymousClass84O r6, int i, boolean z) {
        C152057Xj r1;
        C835248t A0L = r6.A0L(97);
        if (A0L != null) {
            r1 = new C152057Xj();
            r1.A04(Integer.valueOf(i), 0);
            r1.A04(Boolean.valueOf(z), 1);
            r1.A04(r5, 2);
        } else {
            A0L = r6.A0L(51);
            if (A0L != null) {
                r1 = new C152057Xj();
                r1.A04(Integer.valueOf(i), 0);
                r1.A04(r5, 1);
            } else {
                return;
            }
        }
        C159377lj.A01(r5, r6, r1.A03(), A0L);
    }

    public static boolean A02(AnonymousClass84O r3) {
        C835248t A0L = r3.A0L(51);
        C835248t A0L2 = r3.A0L(97);
        if (A0L == null && A0L2 == null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A02.hashCode() * 31) + this.A04.A0C();
    }

    public C011109f(AnonymousClass09Z r2, C153427bI r3, AnonymousClass84O r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
    }
}
