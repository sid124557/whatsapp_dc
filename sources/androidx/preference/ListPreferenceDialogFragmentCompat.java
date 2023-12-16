package androidx.preference;

import X.AnonymousClass001;
import X.AnonymousClass0Uj;
import X.C15970sG;
import X.C17750wB;
import android.content.DialogInterface;
import android.os.Bundle;

public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public int A00;
    public CharSequence[] A01;
    public CharSequence[] A02;

    public void A1T(AnonymousClass0Uj r5) {
        r5.A0K(new C17750wB(this, 1), this.A01, this.A00);
        r5.A0I((DialogInterface.OnClickListener) null, (CharSequence) null);
    }

    public void A1U(boolean z) {
        int i;
        if (z && (i = this.A00) >= 0) {
            String charSequence = this.A02[i].toString();
            ListPreference listPreference = (ListPreference) A1R();
            C15970sG r0 = listPreference.A0A;
            if (r0 != null) {
                r0.BYd(listPreference, charSequence);
            }
            listPreference.A0W(charSequence);
        }
    }

    public void A0p(Bundle bundle) {
        CharSequence[] charSequenceArray;
        super.A0p(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) A1R();
            if (listPreference.A03 == null || listPreference.A04 == null) {
                throw AnonymousClass001.A0e("ListPreference requires an entries array and an entryValues array.");
            }
            this.A00 = listPreference.A0U(listPreference.A01);
            this.A01 = listPreference.A03;
            charSequenceArray = listPreference.A04;
        } else {
            this.A00 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.A01 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            charSequenceArray = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
        }
        this.A02 = charSequenceArray;
    }

    public void A0q(Bundle bundle) {
        super.A0q(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.A00);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.A01);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.A02);
    }
}
