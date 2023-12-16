package X;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.whatsapp.R;

/* renamed from: X.0eV  reason: invalid class name and case insensitive filesystem */
public final class C08450eV implements C15990sI {
    public static C08450eV A00;

    public /* bridge */ /* synthetic */ CharSequence Bhg(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.A0V())) {
            return listPreference.A05.getString(R.string.f11nameremoved);
        }
        return listPreference.A0V();
    }
}
