package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.R;
import com.whatsapp.greenalert.GreenAlertActivity;
import com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.92L  reason: invalid class name */
public class AnonymousClass92L implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass92L(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static final void A00(AnonymousClass92L r5) {
        C96764wt r0 = (C96764wt) r5.A00;
        View view = (View) r5.A01;
        C06440Xs r4 = r0.A01;
        if (!r0.A05.A02()) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) r4;
            Resources resources = view.getResources();
            int floor = (int) Math.floor((double) (((float) (resources.getDisplayMetrics().widthPixels - (AnonymousClass0YH.A03(view) + AnonymousClass0YH.A02(view)))) / C86664Kz.A01(resources, R.dimen.f6nameremoved)));
            if (floor != gridLayoutManager.A00) {
                gridLayoutManager.A1o(floor);
            }
        }
    }

    public final void onGlobalLayout() {
        switch (this.A02) {
            case 0:
                A00(this);
                return;
            case 1:
                C86604Kt.A1G(((AnonymousClass5KV) this.A01).A02, this);
                ((ViewTreeObserver.OnGlobalLayoutListener) this.A00).onGlobalLayout();
                return;
            case 2:
                C86604Kt.A1G((View) this.A01, this);
                GreenAlertActivity greenAlertActivity = (GreenAlertActivity) this.A00;
                greenAlertActivity.A77(greenAlertActivity.A06.getCurrentLogicalItem());
                return;
            case 3:
                ScrollView scrollView = (ScrollView) this.A01;
                if (((View) this.A00).hasFocus()) {
                    scrollView.smoothScrollBy(0, scrollView.getMaxScrollAmount());
                    return;
                }
                return;
            default:
                C86604Kt.A1G((View) this.A01, this);
                UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = (UserNoticeBottomSheetDialogFragment) this.A00;
                userNoticeBottomSheetDialogFragment.A07.setVisibility(4);
                userNoticeBottomSheetDialogFragment.A06.setVisibility(8);
                userNoticeBottomSheetDialogFragment.A1a();
                return;
        }
    }
}
