package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0eY  reason: invalid class name and case insensitive filesystem */
public class C08480eY implements C16010sK {
    public final /* synthetic */ RecyclerView A00;

    public C08480eY(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void BV3(View view) {
        C05570Ua A02 = RecyclerView.A02(view);
        if (A02 != null) {
            RecyclerView recyclerView = this.A00;
            int i = A02.A07;
            if (recyclerView.A09 > 0) {
                A02.A04 = i;
                recyclerView.A15.add(A02);
            } else {
                AnonymousClass0YY.A06(A02.A0H, i);
            }
            A02.A07 = 0;
        }
    }
}
