package X;

import com.whatsapp.settings.SettingsDataUsageActivity;
import java.util.TimerTask;

/* renamed from: X.5tZ  reason: invalid class name and case insensitive filesystem */
public class C118455tZ extends TimerTask {
    public final /* synthetic */ SettingsDataUsageActivity A00;

    public C118455tZ(SettingsDataUsageActivity settingsDataUsageActivity) {
        this.A00 = settingsDataUsageActivity;
    }

    public void run() {
        SettingsDataUsageActivity settingsDataUsageActivity = this.A00;
        settingsDataUsageActivity.A07.post(new C71283br((Object) settingsDataUsageActivity, 49));
    }
}
