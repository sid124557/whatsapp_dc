package X;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;

/* renamed from: X.5NK  reason: invalid class name */
public final class AnonymousClass5NK {
    public final WfalManager A00;
    public final AnonymousClass5Q7 A01;

    public final void A00(View view, AnonymousClass223 r8, int i, int i2) {
        int i3;
        WfalManager wfalManager = this.A00;
        if (wfalManager.A02()) {
            int ordinal = r8.ordinal();
            int i4 = R.id.status_privacy_fb_row;
            if (ordinal != 0) {
                i4 = R.id.status_privacy_ig_row;
            }
            View A02 = C06560Yg.A02(view, i4);
            C162457s7.A0H(A02);
            ImageView A0F = AnonymousClass0x9.A0F(A02, R.id.default_status_privacy_crossposting_setting_icon);
            TextView A09 = AnonymousClass002.A09(A02, R.id.default_status_privacy_crossposting_setting_title);
            TextView A092 = AnonymousClass002.A09(A02, R.id.default_status_privacy_crossposting_setting_subtitle);
            A0F.setImageResource(i);
            A09.setText(i2);
            if (wfalManager.A01(r8) != null) {
                C989753y.A00(A02, this, 42);
                A0F.setColorFilter(new PorterDuffColorFilter(A02.getResources().getColor(R.color.f5nameremoved), PorterDuff.Mode.SRC_ATOP));
                i3 = R.string.f11nameremoved;
            } else {
                AnonymousClass547.A00(A02, this, r8, view, 27);
                A0F.setColorFilter(new PorterDuffColorFilter(A02.getResources().getColor(R.color.f5nameremoved), PorterDuff.Mode.SRC_ATOP));
                i3 = R.string.f11nameremoved;
            }
            A092.setText(i3);
        }
    }

    public AnonymousClass5NK(WfalManager wfalManager, AnonymousClass5Q7 r2) {
        C18260x0.A0Q(wfalManager, r2);
        this.A00 = wfalManager;
        this.A01 = r2;
    }
}
