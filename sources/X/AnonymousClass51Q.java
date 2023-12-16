package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.settings.SettingsRowIconText;

/* renamed from: X.51Q  reason: invalid class name */
public final class AnonymousClass51Q extends AnonymousClass6J0 {
    public final AnonymousClass4GQ A00;

    public void A07(C104825Sm r5) {
        C162457s7.A0J(r5, 0);
        SettingsRowIconText settingsRowIconText = (SettingsRowIconText) C18290x4.A0M(this.A0H, R.id.settings_result_list_item);
        settingsRowIconText.setText((CharSequence) r5.A04);
        settingsRowIconText.setSubText(r5.A03);
        Drawable drawable = r5.A01;
        settingsRowIconText.setIcon(drawable);
        C634339f.A00(settingsRowIconText, r5, this, 49);
        int i = 216;
        if (drawable != null) {
            i = 0;
        }
        C86604Kt.A1D(settingsRowIconText, i, settingsRowIconText.getPaddingTop());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass51Q(View view, AnonymousClass4GQ r2) {
        super(view);
        C18260x0.A0Q(view, r2);
        this.A00 = r2;
    }
}
