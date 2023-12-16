package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.EditText;
import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.Format;
import java.util.GregorianCalendar;

/* renamed from: X.36t  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C627936t implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ IndiaUpiDobPickerBottomSheet A01;

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = this.A01;
        EditText editText = this.A00;
        boolean A1V = C18320x8.A1V(datePicker);
        editText.setText(((Format) C18300x5.A0d(indiaUpiDobPickerBottomSheet.A03)).format(Long.valueOf(new GregorianCalendar(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth()).getTime().getTime())));
        WDSButton wDSButton = indiaUpiDobPickerBottomSheet.A02;
        if (wDSButton != null) {
            wDSButton.setEnabled(A1V);
        }
    }

    public /* synthetic */ C627936t(EditText editText, IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet) {
        this.A01 = indiaUpiDobPickerBottomSheet;
        this.A00 = editText;
    }
}
