package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.whatsapp.WaEditText;
import com.whatsapp.events.EventCreationFragment;
import com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: X.26D  reason: invalid class name */
public class AnonymousClass26D implements DatePickerDialog.OnDateSetListener {
    public Object A00;
    public final int A01;

    public AnonymousClass26D(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        if (this.A01 != 0) {
            ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment = (ConfirmDateOfBirthBottomSheetFragment) this.A00;
            Calendar calendar = confirmDateOfBirthBottomSheetFragment.A0A;
            calendar.set(1, i);
            calendar.set(2, i2);
            calendar.set(5, i3);
            C620733j r0 = confirmDateOfBirthBottomSheetFragment.A05;
            if (r0 != null) {
                confirmDateOfBirthBottomSheetFragment.A1I().setText(new SimpleDateFormat("dd/MM/yyyy", C620733j.A02(r0)).format(calendar.getTime()));
                return;
            }
            throw C18270x1.A0S("whatsAppLocale");
        }
        EventCreationFragment eventCreationFragment = (EventCreationFragment) this.A00;
        eventCreationFragment.A1K().set(i, i2, i3);
        String format = DateFormat.getDateInstance(2, C620733j.A02(eventCreationFragment.A1J())).format(eventCreationFragment.A1K().getTime());
        WaEditText waEditText = eventCreationFragment.A02;
        if (waEditText != null) {
            waEditText.setText(format);
        }
    }
}
