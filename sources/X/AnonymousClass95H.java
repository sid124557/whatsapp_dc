package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.95H  reason: invalid class name */
public class AnonymousClass95H extends C04580Ov {
    public void A03(Rect rect, View view, AnonymousClass0Q1 r7, RecyclerView recyclerView) {
        super.A03(rect, view, r7, recyclerView);
        int A00 = RecyclerView.A00(view);
        AnonymousClass0R6 r0 = recyclerView.A0N;
        if (r0 == null) {
            return;
        }
        if (A00 == 0 || A00 == r0.A0G() - 1) {
            AnonymousClass0YH.A07(view, AnonymousClass0YH.A03(view), (int) view.getResources().getDimension(R.dimen.f6nameremoved), AnonymousClass0YH.A02(view), view.getPaddingBottom());
        }
    }
}
