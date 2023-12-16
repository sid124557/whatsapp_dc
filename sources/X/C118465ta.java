package X;

import com.whatsapp.settings.SettingsNetworkUsage;
import java.util.TimerTask;

/* renamed from: X.5ta  reason: invalid class name and case insensitive filesystem */
public class C118465ta extends TimerTask {
    public final /* synthetic */ SettingsNetworkUsage A00;

    public C118465ta(SettingsNetworkUsage settingsNetworkUsage) {
        this.A00 = settingsNetworkUsage;
    }

    public void run() {
        SettingsNetworkUsage settingsNetworkUsage = this.A00;
        settingsNetworkUsage.A00.post(new C71293bs((Object) settingsNetworkUsage, 1));
    }
}
