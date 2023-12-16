package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.09b  reason: invalid class name */
public class AnonymousClass09b extends AnonymousClass0O5 {
    public final C153427bI A00;
    public final AnonymousClass84O A01;
    public final C835248t A02;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass09b)) {
            return false;
        }
        AnonymousClass09b r4 = (AnonymousClass09b) obj;
        return r4.A02 == this.A02 && r4.A01 == this.A01;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            AnonymousClass84O r3 = this.A01;
            C835248t r2 = this.A02;
            C152057Xj r1 = new C152057Xj();
            r1.A05(r3, 0);
            C159377lj.A01(this.A00, r3, r1.A03(), r2);
        }
    }

    public AnonymousClass09b(C153427bI r1, AnonymousClass84O r2, C835248t r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
