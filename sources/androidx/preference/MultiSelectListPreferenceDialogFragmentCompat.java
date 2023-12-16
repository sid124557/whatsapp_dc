package androidx.preference;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Uj;
import X.AnonymousClass0Z2;
import X.C15970sG;
import android.os.Bundle;
import java.util.Set;

public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public Set A00 = AnonymousClass002.A0K();
    public boolean A01;
    public CharSequence[] A02;
    public CharSequence[] A03;

    public void A1T(AnonymousClass0Uj r6) {
        int length = this.A03.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.A00.contains(this.A03[i].toString());
        }
        r6.A0N(new AnonymousClass0Z2(this), this.A02, zArr);
    }

    public void A1U(boolean z) {
        if (z && this.A01) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A1R();
            Set set = this.A00;
            C15970sG r0 = multiSelectListPreference.A0A;
            if (r0 != null) {
                r0.BYd(multiSelectListPreference, set);
            }
            multiSelectListPreference.A0U(set);
        }
        this.A01 = false;
    }

    public void A0p(Bundle bundle) {
        CharSequence[] charSequenceArray;
        super.A0p(bundle);
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A1R();
            CharSequence[] charSequenceArr = multiSelectListPreference.A01;
            if (charSequenceArr == null || (charSequenceArray = multiSelectListPreference.A02) == null) {
                throw AnonymousClass001.A0e("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            Set set = this.A00;
            set.clear();
            set.addAll(multiSelectListPreference.A00);
            this.A01 = false;
            this.A02 = charSequenceArr;
        } else {
            Set set2 = this.A00;
            set2.clear();
            set2.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.A01 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.A02 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            charSequenceArray = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
        }
        this.A03 = charSequenceArray;
    }

    public void A0q(Bundle bundle) {
        super.A0q(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", AnonymousClass002.A0J(this.A00));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.A01);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.A02);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.A03);
    }
}
