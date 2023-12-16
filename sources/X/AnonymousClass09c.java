package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.09c  reason: invalid class name */
public class AnonymousClass09c extends AnonymousClass0O5 {
    public final C153427bI A00;
    public final AnonymousClass84O A01;
    public final C835248t A02;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass09c)) {
            return false;
        }
        AnonymousClass09c r6 = (AnonymousClass09c) obj;
        return r6.A02 == this.A02 && r6.A01.A0E(53, 0) == this.A01.A0E(53, 0);
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        String str;
        AnonymousClass84O r3 = this.A01;
        int A0E = r3.A0E(53, 0);
        if (A0E != 0) {
            if (recyclerView.canScrollVertically(A0E)) {
                str = "can_scroll";
            } else {
                str = "cannot_scroll";
            }
            C152057Xj r1 = new C152057Xj();
            r1.A05(str, 0);
            C153427bI r2 = this.A00;
            r1.A05(r2, 1);
            C159377lj.A01(r2, r3, r1.A03(), this.A02);
        }
    }

    public AnonymousClass09c(C153427bI r1, AnonymousClass84O r2, C835248t r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
