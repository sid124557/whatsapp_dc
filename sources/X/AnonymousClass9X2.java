package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.EditText;
import com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import java.text.DateFormat;

/* renamed from: X.9X2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9X2 implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ IndiaUpiPauseMandateActivity A01;
    public final /* synthetic */ DateFormat A02;

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        IndiaUpiPauseMandateActivity indiaUpiPauseMandateActivity = this.A01;
        this.A00.setText(this.A02.format(Long.valueOf(IndiaUpiPauseMandateActivity.A0C(datePicker))));
        indiaUpiPauseMandateActivity.A7r();
    }

    public /* synthetic */ AnonymousClass9X2(EditText editText, IndiaUpiPauseMandateActivity indiaUpiPauseMandateActivity, DateFormat dateFormat) {
        this.A01 = indiaUpiPauseMandateActivity;
        this.A00 = editText;
        this.A02 = dateFormat;
    }
}
