package X;

import android.os.Build;
import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.whatsapp.R;
import com.whatsapp.settings.SettingsJidNotificationFragment;

/* renamed from: X.69H  reason: invalid class name */
public class AnonymousClass69H implements C15970sG {
    public Object A00;
    public final int A01;

    public static void A00(Preference preference, Object obj) {
        ListPreference listPreference = (ListPreference) preference;
        preference.A0L(listPreference.A03[listPreference.A0U((String) obj)].toString());
    }

    public AnonymousClass69H(SettingsJidNotificationFragment settingsJidNotificationFragment, int i) {
        this.A01 = i;
        this.A00 = settingsJidNotificationFragment;
    }

    public final boolean BYd(Preference preference, Object obj) {
        AnonymousClass1R1 r3;
        C56802sa r2;
        C89114bZ r0;
        switch (this.A01) {
            case 0:
                SettingsJidNotificationFragment settingsJidNotificationFragment = (SettingsJidNotificationFragment) this.A00;
                A00(preference, obj);
                AnonymousClass1R1 r22 = settingsJidNotificationFragment.A06;
                C95814uZ r02 = settingsJidNotificationFragment.A05;
                r22.A0e(r02.getRawString(), obj.toString());
                return true;
            case 1:
                SettingsJidNotificationFragment settingsJidNotificationFragment2 = (SettingsJidNotificationFragment) this.A00;
                A00(preference, obj);
                AnonymousClass1R1 r23 = settingsJidNotificationFragment2.A06;
                C95814uZ r03 = settingsJidNotificationFragment2.A05;
                r23.A0c(r03.getRawString(), obj.toString());
                return true;
            case 2:
                SettingsJidNotificationFragment settingsJidNotificationFragment3 = (SettingsJidNotificationFragment) this.A00;
                String str = Build.MODEL;
                if ((str.contains("Desire") || str.contains("Wildfire")) && !obj.toString().equals("00FF00") && (r0 = settingsJidNotificationFragment3.A00) != null) {
                    r0.Bot(R.string.f11nameremoved);
                }
                A00(preference, obj);
                AnonymousClass1R1 r24 = settingsJidNotificationFragment3.A06;
                C95814uZ r04 = settingsJidNotificationFragment3.A05;
                r24.A0b(r04.getRawString(), obj.toString());
                return true;
            case 3:
                SettingsJidNotificationFragment settingsJidNotificationFragment4 = (SettingsJidNotificationFragment) this.A00;
                r3 = settingsJidNotificationFragment4.A06;
                C95814uZ r25 = settingsJidNotificationFragment4.A05;
                boolean equals = Boolean.FALSE.equals(obj);
                r2 = AnonymousClass1R1.A00(r25, r3);
                if (equals != r2.A0F) {
                    r2.A0F = equals;
                    break;
                } else {
                    return true;
                }
            case 4:
                SettingsJidNotificationFragment settingsJidNotificationFragment5 = (SettingsJidNotificationFragment) this.A00;
                A00(preference, obj);
                r3 = settingsJidNotificationFragment5.A06;
                C95814uZ r05 = settingsJidNotificationFragment5.A05;
                String obj2 = obj.toString();
                r2 = AnonymousClass1R1.A00(r05, r3);
                if (!TextUtils.equals(obj2, r2.A09)) {
                    r2.A09 = obj2;
                    break;
                } else {
                    return true;
                }
            default:
                SettingsJidNotificationFragment settingsJidNotificationFragment6 = (SettingsJidNotificationFragment) this.A00;
                boolean z = AnonymousClass1R1.A00(settingsJidNotificationFragment6.A05, settingsJidNotificationFragment6.A06).A0K;
                boolean equals2 = Boolean.TRUE.equals(obj);
                AnonymousClass1R1 r26 = settingsJidNotificationFragment6.A06;
                C56802sa A002 = AnonymousClass1R1.A00(settingsJidNotificationFragment6.A05, r26);
                if (equals2 != A002.A0K) {
                    if (equals2) {
                        A002.A0F = A002.A0A();
                    }
                    A002.A0K = equals2;
                    r26.A0a(A002);
                }
                if (z != equals2) {
                    C95814uZ r1 = settingsJidNotificationFragment6.A05;
                    AnonymousClass3DP r32 = settingsJidNotificationFragment6.A01;
                    if (equals2) {
                        AnonymousClass3ZH A07 = settingsJidNotificationFragment6.A02.A07(r1);
                        if (A07 != null) {
                            r32.A04(settingsJidNotificationFragment6.A0G(), A07, (String) null);
                        }
                    } else {
                        r32.A07(r1);
                    }
                }
                settingsJidNotificationFragment6.A1M();
                return true;
        }
        r3.A0a(r2);
        return true;
    }
}
