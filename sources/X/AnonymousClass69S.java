package X;

import androidx.preference.Preference;
import com.whatsapp.R;
import com.whatsapp.WaPreferenceFragment;
import com.whatsapp.settings.SettingsChatHistoryFragment;

/* renamed from: X.69S  reason: invalid class name */
public class AnonymousClass69S implements C15980sH {
    public Object A00;
    public final int A01;

    public AnonymousClass69S(SettingsChatHistoryFragment settingsChatHistoryFragment, int i) {
        this.A01 = i;
        this.A00 = settingsChatHistoryFragment;
    }

    public final boolean BYe(Preference preference) {
        C89114bZ r1;
        int i;
        switch (this.A01) {
            case 0:
                SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) this.A00;
                if (settingsChatHistoryFragment.A07.A06()) {
                    boolean A012 = C61072zf.A01();
                    int i2 = R.string.f11nameremoved;
                    if (A012) {
                        i2 = R.string.f11nameremoved;
                    }
                    C89114bZ r0 = settingsChatHistoryFragment.A00;
                    if (r0 == null) {
                        return true;
                    }
                    r0.Bot(i2);
                    return true;
                }
                AnonymousClass5PH r12 = new AnonymousClass5PH(settingsChatHistoryFragment.A1D());
                r12.A08 = true;
                settingsChatHistoryFragment.startActivityForResult(AnonymousClass5PH.A01(r12), 10);
                return true;
            case 1:
                r1 = ((WaPreferenceFragment) this.A00).A00;
                i = 4;
                break;
            case 2:
                r1 = ((WaPreferenceFragment) this.A00).A00;
                i = 3;
                break;
            default:
                r1 = ((WaPreferenceFragment) this.A00).A00;
                i = 5;
                break;
        }
        C621433s.A01(r1, i);
        return true;
    }
}
