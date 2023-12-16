package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.4XR  reason: invalid class name */
public class AnonymousClass4XR extends C04580Ov {
    public void A03(Rect rect, View view, AnonymousClass0Q1 r7, RecyclerView recyclerView) {
        super.A03(rect, view, r7, recyclerView);
        int A00 = RecyclerView.A00(view);
        if (recyclerView.A0N != null && A00 == 0) {
            AnonymousClass0YH.A07(view, AnonymousClass0YH.A03(view), AnonymousClass4L0.A01(view.getResources(), R.dimen.f6nameremoved), AnonymousClass0YH.A02(view), view.getPaddingBottom());
        }
    }
}
