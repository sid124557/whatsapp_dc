package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.9Xp  reason: invalid class name and case insensitive filesystem */
public class C195389Xp implements TextWatcher {
    public final int A00;
    public final EditText A01;
    public final /* synthetic */ IndiaUpiDebitCardVerificationActivity A02;

    public C195389Xp(EditText editText, IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity, int i) {
        this.A02 = indiaUpiDebitCardVerificationActivity;
        this.A00 = i;
        this.A01 = editText;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int parseInt;
        if (i3 != 0) {
            this.A02.A02.setVisibility(4);
        }
        IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity = this.A02;
        int A7o = indiaUpiDebitCardVerificationActivity.A7o();
        WDSButton wDSButton = indiaUpiDebitCardVerificationActivity.A08;
        if (A7o == 0) {
            wDSButton.setEnabled(true);
        } else {
            wDSButton.setEnabled(false);
        }
        if (charSequence.length() >= this.A00) {
            EditText editText = this.A01;
            if (editText != null) {
                editText.requestFocus();
                if (editText == indiaUpiDebitCardVerificationActivity.A06) {
                    WaEditText waEditText = indiaUpiDebitCardVerificationActivity.A05;
                    if (!TextUtils.isEmpty(C86604Kt.A0o(waEditText)) && (parseInt = Integer.parseInt(C86604Kt.A0o(waEditText))) != -1) {
                        if (parseInt < 1 || parseInt > 12) {
                            indiaUpiDebitCardVerificationActivity.A02.setText(R.string.f11nameremoved);
                            indiaUpiDebitCardVerificationActivity.A7p();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            indiaUpiDebitCardVerificationActivity.A7r(indiaUpiDebitCardVerificationActivity.A00, indiaUpiDebitCardVerificationActivity.A01, false);
        }
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
