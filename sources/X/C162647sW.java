package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.DateFormat;
import java.util.Calendar;

/* renamed from: X.7sW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C162647sW implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ IndiaUpiInternationalActivationActivity A01;
    public final /* synthetic */ DateFormat A02;

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        String str;
        IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity = this.A01;
        EditText editText = this.A00;
        DateFormat dateFormat = this.A02;
        C162457s7.A0J(datePicker, 3);
        editText.setText(dateFormat.format(Long.valueOf(IndiaUpiInternationalActivationActivity.A0C(datePicker))));
        WDSButton wDSButton = indiaUpiInternationalActivationActivity.A09;
        if (wDSButton == null) {
            throw C18270x1.A0S("buttonView");
        }
        TextInputLayout textInputLayout = indiaUpiInternationalActivationActivity.A03;
        if (textInputLayout == null) {
            throw C18270x1.A0S("endDateInputLayout");
        }
        long j = indiaUpiInternationalActivationActivity.A00;
        DatePicker datePicker2 = indiaUpiInternationalActivationActivity.A01;
        if (datePicker2 == null) {
            throw C18270x1.A0S("endDatePicker");
        }
        long A0C = IndiaUpiInternationalActivationActivity.A0C(datePicker2);
        if (C107175ap.A00(A0C, j) <= 0) {
            str = indiaUpiInternationalActivationActivity.getString(R.string.f11nameremoved);
        } else if (C107175ap.A00(A0C, j) > 90) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            DateFormat dateInstance = DateFormat.getDateInstance(2, C620733j.A02(indiaUpiInternationalActivationActivity.A01));
            instance.add(5, 91);
            long timeInMillis = instance.getTimeInMillis();
            str = AnonymousClass002.A0F(indiaUpiInternationalActivationActivity, dateInstance.format(Long.valueOf(timeInMillis)), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
        } else {
            str = null;
        }
        textInputLayout.setError(str);
        TextInputLayout textInputLayout2 = indiaUpiInternationalActivationActivity.A04;
        if (textInputLayout2 == null) {
            throw C18270x1.A0S("startDateInputLayout");
        }
        CharSequence error = textInputLayout2.getError();
        boolean z = false;
        if (error == null || error.length() == 0) {
            TextInputLayout textInputLayout3 = indiaUpiInternationalActivationActivity.A03;
            if (textInputLayout3 == null) {
                throw C18270x1.A0S("endDateInputLayout");
            }
            CharSequence error2 = textInputLayout3.getError();
            if (error2 == null || error2.length() == 0) {
                z = true;
            }
        }
        wDSButton.setEnabled(z);
    }

    public /* synthetic */ C162647sW(EditText editText, IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity, DateFormat dateFormat) {
        this.A01 = indiaUpiInternationalActivationActivity;
        this.A00 = editText;
        this.A02 = dateFormat;
    }
}
