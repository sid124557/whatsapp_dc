package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.4XS  reason: invalid class name */
public class AnonymousClass4XS extends C04580Ov {
    public void A03(Rect rect, View view, AnonymousClass0Q1 r7, RecyclerView recyclerView) {
        super.A03(rect, view, r7, recyclerView);
        int A00 = RecyclerView.A00(view);
        AnonymousClass0R6 r0 = recyclerView.A0N;
        if (r0 != null) {
            int itemViewType = r0.getItemViewType(A00);
            if (A00 == 0 && itemViewType == 0) {
                AnonymousClass0YH.A07(view, AnonymousClass0YH.A03(view), AnonymousClass4L0.A01(view.getResources(), R.dimen.f6nameremoved), AnonymousClass0YH.A02(view), view.getPaddingBottom());
            }
        }
    }
}
