package X;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.whatsapp.R;

/* renamed from: X.0eU  reason: invalid class name and case insensitive filesystem */
public final class C08440eU implements C15990sI {
    public static C08440eU A00;

    public /* bridge */ /* synthetic */ CharSequence Bhg(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(editTextPreference.A00)) {
            return editTextPreference.A05.getString(R.string.f11nameremoved);
        }
        return editTextPreference.A00;
    }
}
