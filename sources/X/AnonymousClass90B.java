package X;

import android.text.Editable;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity;

/* renamed from: X.90B  reason: invalid class name */
public class AnonymousClass90B extends C166677z5 {
    public Object A00;
    public final int A01;

    public AnonymousClass90B(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        if (this.A01 != 0) {
            C162457s7.A0J(editable, 0);
            boolean A0Y = C175738Zn.A0Y(editable.toString(), "0", false);
            IndiaUpiCreateCustomNumberActivity indiaUpiCreateCustomNumberActivity = (IndiaUpiCreateCustomNumberActivity) this.A00;
            if (A0Y) {
                LinearLayout linearLayout = indiaUpiCreateCustomNumberActivity.A00;
                if (linearLayout == null) {
                    throw C18270x1.A0S("customNumberBulletRulesContainer");
                }
                linearLayout.setVisibility(8);
                TextInputLayout textInputLayout = indiaUpiCreateCustomNumberActivity.A01;
                if (textInputLayout == null) {
                    throw C18270x1.A0S("enterCustomNumberTextInputLayout");
                }
                textInputLayout.setError(indiaUpiCreateCustomNumberActivity.getString(R.string.f11nameremoved));
                WaEditText waEditText = indiaUpiCreateCustomNumberActivity.A03;
                if (waEditText == null) {
                    throw C18270x1.A0S("customNumberEditText");
                }
                waEditText.requestFocus();
                return;
            }
            TextInputLayout textInputLayout2 = indiaUpiCreateCustomNumberActivity.A01;
            if (textInputLayout2 == null) {
                throw C18270x1.A0S("enterCustomNumberTextInputLayout");
            }
            textInputLayout2.setErrorEnabled(false);
            LinearLayout linearLayout2 = indiaUpiCreateCustomNumberActivity.A00;
            if (linearLayout2 == null) {
                throw C18270x1.A0S("customNumberBulletRulesContainer");
            }
            linearLayout2.setVisibility(0);
            return;
        }
        ((C113245l7) this.A00).A2E(editable.toString());
    }
}
