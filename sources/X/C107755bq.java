package X;

import android.animation.ValueAnimator;
import android.widget.ListView;
import com.whatsapp.contact.picker.SelectedListContactPickerFragment;

/* renamed from: X.5bq  reason: invalid class name and case insensitive filesystem */
public final class C107755bq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ SelectedListContactPickerFragment A00;

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C162457s7.A0J(valueAnimator, 0);
        SelectedListContactPickerFragment selectedListContactPickerFragment = this.A00;
        ListView listView = selectedListContactPickerFragment.A0L;
        if (listView != null) {
            selectedListContactPickerFragment.A2M(listView, C86614Ku.A02(valueAnimator));
        }
    }

    public C107755bq(SelectedListContactPickerFragment selectedListContactPickerFragment) {
        this.A00 = selectedListContactPickerFragment;
    }
}
