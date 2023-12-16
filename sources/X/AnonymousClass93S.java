package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.contact.picker.BidiContactListView;
import com.whatsapp.location.LiveLocationPrivacyActivity;

/* renamed from: X.93S  reason: invalid class name */
public class AnonymousClass93S implements AbsListView.OnScrollListener {
    public int A00;
    public Object A01;
    public final int A02 = 0;

    public AnonymousClass93S(LiveLocationPrivacyActivity liveLocationPrivacyActivity, int i) {
        this.A01 = liveLocationPrivacyActivity;
        this.A00 = i;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View view;
        float f;
        if (this.A02 != 0) {
            if (i + i2 == i3) {
                int bottom = absListView.getChildAt(i2 - 1).getBottom();
                LiveLocationPrivacyActivity liveLocationPrivacyActivity = (LiveLocationPrivacyActivity) this.A01;
                int bottom2 = liveLocationPrivacyActivity.A03.getBottom() - liveLocationPrivacyActivity.A03.getPaddingBottom();
                view = liveLocationPrivacyActivity.A00;
                if (bottom == bottom2) {
                    f = 0.0f;
                }
                f = (float) this.A00;
            } else {
                view = ((LiveLocationPrivacyActivity) this.A01).A00;
                f = (float) this.A00;
            }
            view.setElevation(f);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.A02 == 0) {
            int i2 = this.A00;
            if (i2 == 0 && i != i2) {
                ((BidiContactListView) this.A01).A01.A02(absListView);
            }
            this.A00 = i;
        }
    }

    public AnonymousClass93S(BidiContactListView bidiContactListView) {
        this.A01 = bidiContactListView;
        this.A00 = 0;
    }
}
