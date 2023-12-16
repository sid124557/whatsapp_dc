package X;

import android.text.TextUtils;
import androidx.preference.Preference;
import com.whatsapp.preference.WaRingtonePreference;
import com.whatsapp.settings.SettingsJidNotificationFragment;

/* renamed from: X.68y  reason: invalid class name and case insensitive filesystem */
public class C1235768y implements C15970sG {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1235768y(WaRingtonePreference waRingtonePreference, SettingsJidNotificationFragment settingsJidNotificationFragment, int i) {
        this.A02 = i;
        this.A00 = settingsJidNotificationFragment;
        this.A01 = waRingtonePreference;
    }

    public final boolean BYd(Preference preference, Object obj) {
        if (this.A02 != 0) {
            SettingsJidNotificationFragment settingsJidNotificationFragment = (SettingsJidNotificationFragment) this.A00;
            WaRingtonePreference waRingtonePreference = (WaRingtonePreference) this.A01;
            String obj2 = obj.toString();
            waRingtonePreference.A01 = obj2;
            waRingtonePreference.A0L(C66553Lw.A07(preference.A05, obj2));
            AnonymousClass1R1 r2 = settingsJidNotificationFragment.A06;
            C56802sa A002 = AnonymousClass1R1.A00(settingsJidNotificationFragment.A05, r2);
            if (TextUtils.equals(obj2, A002.A08)) {
                return true;
            }
            A002.A08 = obj2;
            r2.A0a(A002);
            return true;
        }
        SettingsJidNotificationFragment settingsJidNotificationFragment2 = (SettingsJidNotificationFragment) this.A00;
        WaRingtonePreference waRingtonePreference2 = (WaRingtonePreference) this.A01;
        String obj3 = obj.toString();
        waRingtonePreference2.A01 = obj3;
        waRingtonePreference2.A0L(C66553Lw.A07(preference.A05, obj3));
        settingsJidNotificationFragment2.A06.A0d(settingsJidNotificationFragment2.A05.getRawString(), obj3);
        return true;
    }
}
