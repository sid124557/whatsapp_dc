package X;

import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.128  reason: invalid class name */
public class AnonymousClass128 extends AnonymousClass0O5 {
    public final Resources A00;
    public final GridLayoutManager A01;
    public final boolean A02;

    public void A04(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        C162457s7.A0J(recyclerView, 0);
        GridLayoutManager gridLayoutManager = this.A01;
        int A1H = gridLayoutManager.A1H();
        int A1J = gridLayoutManager.A1J();
        int A1G = gridLayoutManager.A1G();
        int A1I = gridLayoutManager.A1I();
        int i3 = gridLayoutManager.A00;
        boolean A1U = AnonymousClass000.A1U(this.A00.getConfiguration().orientation, 1);
        int A08 = gridLayoutManager.A08();
        int i4 = 0;
        while (i4 < A08) {
            View A0Q = gridLayoutManager.A0Q(i4);
            if (A0Q != null) {
                int A03 = C06440Xs.A03(A0Q);
                if (recyclerView.A0H(A0Q) instanceof AnonymousClass1U0) {
                    C05570Ua A0H = recyclerView.A0H(A0Q);
                    C162457s7.A0K(A0H, "null cannot be cast to non-null type com.whatsapp.expressionstray.stickergrid.viewholder.StickerViewHolder");
                    AnonymousClass1U0 r1 = (AnonymousClass1U0) A0H;
                    if (!this.A02 || !A1U ? A1H > A03 || A03 > A1J : A1J != A1I ? A03 < A1G || A03 >= A1G + i3 : A1G > A03 || A03 > A1I) {
                        z = false;
                    } else {
                        z = true;
                    }
                    r1.A07(z);
                }
                i4++;
            } else {
                return;
            }
        }
    }

    public AnonymousClass128(Resources resources, GridLayoutManager gridLayoutManager, AnonymousClass1VX r5) {
        C18260x0.A0V(r5, resources, gridLayoutManager);
        this.A00 = resources;
        this.A01 = gridLayoutManager;
        this.A02 = r5.A0Y(C58422vE.A02, 272);
    }
}
