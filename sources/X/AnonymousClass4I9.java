package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;
import com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.Format;
import java.util.GregorianCalendar;

/* renamed from: X.4I9  reason: invalid class name */
public class AnonymousClass4I9 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4I9(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        Object obj;
        DialogFragment dialogFragment;
        switch (this.A02) {
            case 0:
                IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = (IndiaUpiDobPickerBottomSheet) this.A00;
                DatePicker datePicker = (DatePicker) this.A01;
                long time = new GregorianCalendar(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth()).getTime().getTime();
                String A0e = C18300x5.A0e(indiaUpiDobPickerBottomSheet.A0G(), ((Format) C18300x5.A0d(indiaUpiDobPickerBottomSheet.A03)).format(Long.valueOf(time)), new Object[1], 0, R.string.f11nameremoved);
                C19340zH A0K = C18280x3.A0K(indiaUpiDobPickerBottomSheet);
                A0K.A0g(A0e);
                A0K.A0i(false);
                A0K.A0Y(new C628336x(indiaUpiDobPickerBottomSheet, time), R.string.f11nameremoved);
                A0K.A0W(new AnonymousClass4I1(11), R.string.f11nameremoved);
                A0K.A0S();
                return;
            case 1:
                ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment = (ConfirmDateOfBirthBottomSheetFragment) this.A00;
                dialogFragment = (DialogFragment) this.A01;
                ProgressBar progressBar = confirmDateOfBirthBottomSheetFragment.A00;
                if (progressBar != null) {
                    boolean A1T = AnonymousClass000.A1T(progressBar.getVisibility());
                    Integer A0a = C18290x4.A0a();
                    if (A1T) {
                        confirmDateOfBirthBottomSheetFragment.A1J(A0a, "confirm_dob_in_progress_prompt", "enter_dob", 1);
                    } else {
                        confirmDateOfBirthBottomSheetFragment.A1J(A0a, "enter_dob", "confirm_legal_name_in_progress_prompt", 1);
                    }
                    if (dialogFragment == null) {
                        return;
                    }
                } else {
                    throw C18270x1.A0S("progressBar");
                }
                break;
            case 2:
                ConfirmLegalNameBottomSheetFragment confirmLegalNameBottomSheetFragment = (ConfirmLegalNameBottomSheetFragment) this.A00;
                PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A01;
                boolean A1W = C18290x4.A1W(paymentBottomSheet);
                C003203q A0Q = confirmLegalNameBottomSheetFragment.A0Q();
                if (A0Q != null) {
                    obj = A0Q.getSystemService("input_method");
                } else {
                    obj = null;
                }
                InputMethodManager inputMethodManager = (InputMethodManager) obj;
                if (inputMethodManager != null) {
                    WDSButton wDSButton = confirmLegalNameBottomSheetFragment.A0E;
                    if (wDSButton != null) {
                        inputMethodManager.hideSoftInputFromWindow(wDSButton.getWindowToken(), A1W);
                    } else {
                        throw C18270x1.A0S("continueButton");
                    }
                }
                confirmLegalNameBottomSheetFragment.A1K((Integer) null, "confirm_legal_name_in_progress_prompt", "enter_name", A1W ? 1 : 0);
                confirmLegalNameBottomSheetFragment.A1L(A1W);
                LinearLayout linearLayout = confirmLegalNameBottomSheetFragment.A01;
                if (linearLayout != null) {
                    linearLayout.setVisibility(4);
                    ProgressBar progressBar2 = confirmLegalNameBottomSheetFragment.A02;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(A1W);
                        AnonymousClass4DN r1 = confirmLegalNameBottomSheetFragment.A0A;
                        if (r1 != null) {
                            WaEditText waEditText = confirmLegalNameBottomSheetFragment.A05;
                            if (waEditText != null) {
                                r1.BQ2(paymentBottomSheet, String.valueOf(waEditText.getText()));
                                return;
                            }
                            throw C18270x1.A0S("nameEditText");
                        }
                        return;
                    }
                    throw C18270x1.A0S("progressBar");
                }
                throw C18270x1.A0S("inputContainer");
            default:
                ConfirmLegalNameBottomSheetFragment confirmLegalNameBottomSheetFragment2 = (ConfirmLegalNameBottomSheetFragment) this.A00;
                dialogFragment = (DialogFragment) this.A01;
                C162457s7.A0J(dialogFragment, 1);
                ProgressBar progressBar3 = confirmLegalNameBottomSheetFragment2.A02;
                if (progressBar3 != null) {
                    boolean A1T2 = AnonymousClass000.A1T(progressBar3.getVisibility());
                    Integer A0a2 = C18290x4.A0a();
                    if (A1T2) {
                        confirmLegalNameBottomSheetFragment2.A1K(A0a2, "confirm_legal_name_in_progress_prompt", "enter_name", 1);
                    } else {
                        confirmLegalNameBottomSheetFragment2.A1K(A0a2, "enter_name", "order_details", 1);
                    }
                    AnonymousClass4DN r0 = confirmLegalNameBottomSheetFragment2.A0A;
                    if (r0 != null) {
                        r0.BOO();
                        break;
                    }
                } else {
                    throw C18270x1.A0S("progressBar");
                }
                break;
        }
        dialogFragment.A1K();
    }
}
