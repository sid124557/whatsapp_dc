package X;

import android.view.View;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.5K5  reason: invalid class name */
public final class AnonymousClass5K5 {
    public final CheckBox A00;
    public final ConstraintLayout A01;
    public final WaImageView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final WaTextView A05;

    public AnonymousClass5K5(View view) {
        C162457s7.A0J(view, 1);
        this.A01 = (ConstraintLayout) C18290x4.A0M(view, R.id.account_switching_item);
        this.A04 = (WaTextView) C18290x4.A0M(view, R.id.account_item_name_textview);
        this.A05 = (WaTextView) C18290x4.A0M(view, R.id.account_item_number_textview);
        this.A00 = (CheckBox) C18290x4.A0M(view, R.id.account_item_status);
        this.A02 = (WaImageView) C18290x4.A0M(view, R.id.account_item_profile_imageview);
        this.A03 = (WaTextView) C18290x4.A0M(view, R.id.account_badge_count);
    }
}
