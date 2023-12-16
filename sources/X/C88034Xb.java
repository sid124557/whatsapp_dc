package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4Xb  reason: invalid class name and case insensitive filesystem */
public class C88034Xb extends AnonymousClass0O5 {
    public int A00 = 0;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C105115Tq A02;

    public C88034Xb(C105115Tq r2, int i) {
        this.A02 = r2;
        this.A01 = i;
    }

    public void A05(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.A02.A00();
        } else if (i == 1 && this.A00 == 0) {
            this.A02.A01(this.A01);
        }
        this.A00 = i;
    }
}
