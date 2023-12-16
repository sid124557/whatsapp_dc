package X;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.widget.DatePicker;
import java.util.Calendar;

/* renamed from: X.5c6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107905c6 implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ TimePickerDialog.OnTimeSetListener A01;
    public final /* synthetic */ AnonymousClass1QL A02;

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        AnonymousClass1QL r3 = this.A02;
        Activity activity = this.A00;
        TimePickerDialog.OnTimeSetListener onTimeSetListener = this.A01;
        Calendar calendar = r3.A01;
        if (calendar == null) {
            throw C18270x1.A0S("reminderDateTime");
        }
        calendar.set(1, i);
        Calendar calendar2 = r3.A01;
        if (calendar2 == null) {
            throw C18270x1.A0S("reminderDateTime");
        }
        calendar2.set(2, i2);
        Calendar calendar3 = r3.A01;
        if (calendar3 == null) {
            throw C18270x1.A0S("reminderDateTime");
        }
        calendar3.set(5, i3);
        Calendar calendar4 = r3.A01;
        if (calendar4 == null) {
            throw C18270x1.A0S("reminderDateTime");
        }
        int i4 = calendar4.get(11);
        Calendar calendar5 = r3.A01;
        if (calendar5 == null) {
            throw C18270x1.A0S("reminderDateTime");
        }
        new TimePickerDialog(activity, onTimeSetListener, i4, calendar5.get(12), false).show();
    }

    public /* synthetic */ C107905c6(Activity activity, TimePickerDialog.OnTimeSetListener onTimeSetListener, AnonymousClass1QL r3) {
        this.A02 = r3;
        this.A00 = activity;
        this.A01 = onTimeSetListener;
    }
}
