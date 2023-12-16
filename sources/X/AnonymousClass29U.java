package X;

import android.provider.Settings;
import com.whatsapp.util.Log;

/* renamed from: X.29U  reason: invalid class name */
public class AnonymousClass29U {
    public static void A00(C620633i r2) {
        try {
            if (Settings.System.getInt(r2.A0R().A00, "haptic_feedback_enabled") != 0) {
                C620633i.A05(r2);
            }
        } catch (Settings.SettingNotFoundException e) {
            Log.e("voicerecorderutils/vibrate", e);
        }
    }
}
