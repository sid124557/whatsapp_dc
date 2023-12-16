package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.09a  reason: invalid class name and case insensitive filesystem */
public class C010909a extends AnonymousClass0O5 {
    public boolean A00 = false;
    public final /* synthetic */ AnonymousClass09Z A01;

    public C010909a(AnonymousClass09Z r2) {
        this.A01 = r2;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.A00 = true;
        }
    }

    public void A05(RecyclerView recyclerView, int i) {
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A05();
        }
    }
}
