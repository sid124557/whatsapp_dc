package X;

import android.text.TextUtils;
import androidx.preference.Preference;

/* renamed from: X.0OR  reason: invalid class name */
public class AnonymousClass0OR {
    public int A00;
    public int A01;
    public String A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0OR)) {
            return false;
        }
        AnonymousClass0OR r4 = (AnonymousClass0OR) obj;
        if (this.A00 == r4.A00 && this.A01 == r4.A01 && TextUtils.equals(this.A02, r4.A02)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.A00) * 31) + this.A01) * 31) + this.A02.hashCode();
    }

    public AnonymousClass0OR(Preference preference) {
        this.A02 = AnonymousClass000.A0O(preference);
        this.A00 = preference.A01;
        this.A01 = preference.A03;
    }
}
