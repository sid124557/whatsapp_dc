package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.settings.SettingsRowIconText;

/* renamed from: X.4YT  reason: invalid class name */
public class AnonymousClass4YT extends C05570Ua {
    public final WaTextView A00;
    public final SettingsRowIconText A01;
    public final String A02;

    public AnonymousClass4YT(View view, String str) {
        super(view);
        this.A01 = (SettingsRowIconText) C06560Yg.A02(view, R.id.storage_usage_save_space_row);
        this.A00 = AnonymousClass0x7.A0L(view, R.id.settings_row_subtext);
        this.A02 = str;
    }
}
