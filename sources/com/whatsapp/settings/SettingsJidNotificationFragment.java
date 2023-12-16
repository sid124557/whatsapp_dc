package com.whatsapp.settings;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1R1;
import X.AnonymousClass3DP;
import X.AnonymousClass5Y0;
import X.AnonymousClass69H;
import X.C011409i;
import X.C106405Yw;
import X.C107405bG;
import X.C111095hX;
import X.C1235768y;
import X.C15970sG;
import X.C18260x0;
import X.C18290x4;
import X.C18320x8;
import X.C56802sa;
import X.C620733j;
import X.C621433s;
import X.C626936e;
import X.C627336j;
import X.C64773Ex;
import X.C66433Lk;
import X.C66553Lw;
import X.C89114bZ;
import X.C95814uZ;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import com.whatsapp.R;
import com.whatsapp.preference.WaRingtonePreference;
import com.whatsapp.util.Log;

public class SettingsJidNotificationFragment extends Hilt_SettingsJidNotificationFragment {
    public C111095hX A00;
    public AnonymousClass3DP A01;
    public C64773Ex A02;
    public C620733j A03;
    public AnonymousClass5Y0 A04;
    public C95814uZ A05;
    public AnonymousClass1R1 A06;
    public C66433Lk A07;

    public void A0k(int i, int i2, Intent intent) {
        Object obj = "";
        if (i == 1) {
            if (intent != null) {
                Object parcelableExtra = intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                C18260x0.A1P(AnonymousClass001.A0o(), "SettingsJidNotificationActivity/onActivityResult/ringtone: ", parcelableExtra);
                Preference B3I = B3I("jid_message_tone");
                C15970sG r0 = B3I.A0A;
                if (parcelableExtra != null) {
                    obj = parcelableExtra;
                }
                r0.BYd(B3I, obj);
                return;
            }
        } else if (i == 2 && intent != null) {
            Object parcelableExtra2 = intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            C18260x0.A1P(AnonymousClass001.A0o(), "SettingsJidNotificationActivity/onActivityResult/ringtone: ", parcelableExtra2);
            Preference B3I2 = B3I("jid_call_ringtone");
            C15970sG r02 = B3I2.A0A;
            if (parcelableExtra2 != null) {
                obj = parcelableExtra2;
            }
            r02.BYd(B3I2, obj);
            return;
        }
        super.A0k(i, i2, intent);
    }

    public final void A1L() {
        C56802sa A002 = AnonymousClass1R1.A00(this.A05, this.A06);
        A1K(R.xml.f13nameremoved);
        WaRingtonePreference waRingtonePreference = (WaRingtonePreference) B3I("jid_message_tone");
        String A072 = A002.A07();
        waRingtonePreference.A00 = 7;
        waRingtonePreference.A02 = true;
        waRingtonePreference.A03 = true;
        waRingtonePreference.A01 = A072;
        waRingtonePreference.A0L(C66553Lw.A07(this.A00, A072));
        waRingtonePreference.A0A = new C1235768y(waRingtonePreference, this, 0);
        ListPreference listPreference = (ListPreference) B3I("jid_message_vibrate");
        listPreference.A0W(A002.A08());
        listPreference.A0L(listPreference.A0V());
        listPreference.A0A = new AnonymousClass69H(this, 0);
        ListPreference listPreference2 = (ListPreference) B3I("jid_message_popup");
        if (Build.VERSION.SDK_INT >= 29) {
            final int A003 = C107405bG.A00(this.A00, R.attr.f3nameremoved, R.color.f5nameremoved);
            PreferenceGroup preferenceGroup = (PreferenceGroup) B3I("notification");
            preferenceGroup.A0X(listPreference2);
            preferenceGroup.A07();
            AnonymousClass1 r2 = new ListPreference(this.A00) {
                public void A09() {
                    C621433s.A01(this.A00, 0);
                }

                public void A0T(C011409i r4) {
                    super.A0T(r4);
                    View view = r4.A0H;
                    TextView A09 = AnonymousClass002.A09(view, 16908310);
                    TextView A092 = AnonymousClass002.A09(view, 16908304);
                    int i = A003;
                    A09.setTextColor(i);
                    A092.setTextColor(i);
                    r4.A00 = true;
                    r4.A01 = true;
                }
            };
            String str = listPreference2.A0L;
            r2.A0L = str;
            if (r2.A0Y && !C18320x8.A1U(str)) {
                if (!TextUtils.isEmpty(r2.A0L)) {
                    r2.A0Y = true;
                } else {
                    throw AnonymousClass001.A0e("Preference does not have a key assigned.");
                }
            }
            r2.A0X = listPreference2.A0X;
            r2.A0I = listPreference2.A01;
            r2.A0X(listPreference2.A03);
            r2.A04 = listPreference2.A04;
            r2.A0L(listPreference2.A04());
            CharSequence charSequence = listPreference2.A0H;
            CharSequence charSequence2 = r2.A0H;
            if (charSequence != null ? !charSequence.equals(charSequence2) : charSequence2 != null) {
                r2.A0H = charSequence;
                r2.A06();
            }
            int i = listPreference2.A02;
            if (i != r2.A02) {
                r2.A02 = i;
                r2.A07();
            }
            boolean z = listPreference2.A0V;
            if (r2.A0V != z) {
                r2.A0V = z;
                r2.A06();
            }
            preferenceGroup.A0W(r2);
            r2.A0W(listPreference2.A01);
            r2.A0L(r2.A05.getString(R.string.f11nameremoved));
        } else {
            listPreference2.A0W(A002.A06());
            listPreference2.A0L(listPreference2.A0V());
            listPreference2.A0A = new AnonymousClass69H(this, 1);
        }
        ListPreference listPreference3 = (ListPreference) B3I("jid_message_light");
        listPreference3.A0X(this.A03.A0V(SettingsNotifications.A0r));
        listPreference3.A0W(A002.A05());
        listPreference3.A0L(listPreference3.A0V());
        listPreference3.A0A = new AnonymousClass69H(this, 2);
        TwoStatePreference twoStatePreference = (TwoStatePreference) B3I("jid_use_high_priority_notifications");
        twoStatePreference.A0V(!A002.A0A());
        twoStatePreference.A0A = new AnonymousClass69H(this, 3);
        if (C627336j.A0K(this.A05)) {
            Preference B3I = B3I("jid_call");
            if (B3I != null) {
                PreferenceScreen preferenceScreen = this.A02.A07;
                preferenceScreen.A0X(B3I);
                preferenceScreen.A07();
            }
        } else {
            WaRingtonePreference waRingtonePreference2 = (WaRingtonePreference) B3I("jid_call_ringtone");
            String A032 = A002.A03();
            waRingtonePreference2.A00 = 1;
            waRingtonePreference2.A02 = true;
            waRingtonePreference2.A03 = true;
            waRingtonePreference2.A01 = A032;
            waRingtonePreference2.A0L(C66553Lw.A07(this.A00, A032));
            waRingtonePreference2.A0A = new C1235768y(waRingtonePreference2, this, 1);
            ListPreference listPreference4 = (ListPreference) B3I("jid_call_vibrate");
            listPreference4.A0W(A002.A04());
            listPreference4.A0L(listPreference4.A0V());
            listPreference4.A0A = new AnonymousClass69H(this, 4);
        }
        TwoStatePreference twoStatePreference2 = (TwoStatePreference) B3I("jid_use_custom");
        twoStatePreference2.A0V(A002.A0K);
        twoStatePreference2.A0A = new AnonymousClass69H(this, 5);
        A1M();
    }

    public final void A1M() {
        boolean z = AnonymousClass1R1.A00(this.A05, this.A06).A0K;
        B3I("jid_message_tone").A0P(z);
        B3I("jid_message_vibrate").A0P(z);
        B3I("jid_message_popup").A0P(z);
        B3I("jid_message_light").A0P(z);
        B3I("jid_use_high_priority_notifications").A0P(z);
        if (!C627336j.A0K(this.A05)) {
            B3I("jid_call_ringtone").A0P(z);
            B3I("jid_call_vibrate").A0P(z);
        }
    }

    public boolean BYf(Preference preference) {
        String str = preference.A0L;
        if (str.equals("jid_message_tone")) {
            startActivityForResult(((WaRingtonePreference) preference).A0U(), 1);
            return true;
        } else if (!str.equals("jid_call_ringtone")) {
            return super.BYf(preference);
        } else {
            startActivityForResult(((WaRingtonePreference) preference).A0U(), 2);
            return true;
        }
    }

    public void A0g() {
        super.A0g();
        if (this.A06.A0n(this.A05.getRawString())) {
            Log.i("settings-jid-notifications/onStart settings-store updated, refreshing ui");
            this.A02.A07.A0V();
            A1L();
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A13(true);
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        C18290x4.A1E(menu, R.id.menuitem_reset_notification_settings, R.string.f11nameremoved);
    }

    public boolean A1B(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_reset_notification_settings) {
            return false;
        }
        AnonymousClass1R1 r3 = this.A06;
        C56802sa A002 = AnonymousClass1R1.A00(this.A05, r3);
        C56802sa A022 = A002.A02();
        A002.A0C = A022.A07();
        A002.A0D = A022.A08();
        A002.A0B = A022.A06();
        A002.A0A = A022.A05();
        A002.A08 = A022.A03();
        A002.A09 = A022.A04();
        A002.A0K = false;
        A002.A0F = false;
        r3.A0a(A002);
        this.A02.A07.A0V();
        A1L();
        return true;
    }

    public void A1H(String str, Bundle bundle) {
        C95814uZ A002 = C106405Yw.A00(A0Q());
        C626936e.A06(A002);
        this.A05 = A002;
        String string = A0R().getString(R.string.f11nameremoved);
        C89114bZ r0 = this.A00;
        if (r0 != null) {
            r0.setTitle(string);
        }
        A1L();
    }
}
