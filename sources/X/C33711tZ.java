package X;

import com.whatsapp.R;
import com.whatsapp.settings.SettingsDataUsageActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1tZ  reason: invalid class name and case insensitive filesystem */
public class C33711tZ extends AnonymousClass5ZM {
    public final AtomicBoolean A00 = C18280x3.A0l();
    public final /* synthetic */ SettingsDataUsageActivity A01;

    public C33711tZ(SettingsDataUsageActivity settingsDataUsageActivity) {
        this.A01 = settingsDataUsageActivity;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Number number = (Number) obj;
        Log.i("settings-data-usage-activity/load storage size task/fetch completed");
        if (number != null) {
            SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
            long longValue = number.longValue();
            settingsDataUsageActivity.A06 = longValue;
            settingsDataUsageActivity.A0G.setText(AnonymousClass35V.A05(settingsDataUsageActivity.A00, longValue));
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Log.i("settings-data-usage-activity/load storage size task/background");
        if (this.A00.get()) {
            return null;
        }
        SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
        return Long.valueOf(AnonymousClass35X.A00(settingsDataUsageActivity.A04, settingsDataUsageActivity.A0Y));
    }

    public void A0A() {
        Log.i("settings-data-usage-activity/load storage size task/started");
        SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
        if (settingsDataUsageActivity.A06 == -1) {
            settingsDataUsageActivity.A0G.setText(R.string.f11nameremoved);
        }
    }
}
