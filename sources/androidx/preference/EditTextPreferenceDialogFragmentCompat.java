package androidx.preference;

import X.AnonymousClass001;
import X.C15970sG;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public EditText A00;
    public CharSequence A01;

    public void A1U(boolean z) {
        if (z) {
            String obj = this.A00.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) A1R();
            C15970sG r0 = editTextPreference.A0A;
            if (r0 != null) {
                r0.BYd(editTextPreference, obj);
            }
            editTextPreference.A0U(obj);
        }
    }

    public boolean A1V() {
        return true;
    }

    public void A0p(Bundle bundle) {
        CharSequence charSequence;
        super.A0p(bundle);
        if (bundle == null) {
            charSequence = ((EditTextPreference) A1R()).A00;
        } else {
            charSequence = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
        this.A01 = charSequence;
    }

    public void A0q(Bundle bundle) {
        super.A0q(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.A01);
    }

    public void A1S(View view) {
        super.A1S(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.A00 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.A00.setText(this.A01);
            EditText editText2 = this.A00;
            editText2.setSelection(editText2.getText().length());
            A1R();
            return;
        }
        throw AnonymousClass001.A0e("Dialog view must contain an EditText with id @android:id/edit");
    }
}
