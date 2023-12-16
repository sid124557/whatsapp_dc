package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.whatsapp.calling.schedulecall.ScheduleCallFragment;
import java.text.DateFormat;

/* renamed from: X.5aK  reason: invalid class name and case insensitive filesystem */
public class C106885aK implements DatePickerDialog.OnDateSetListener {
    public Object A00;
    public final int A01;

    public C106885aK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        int i4 = this.A01;
        Object obj = this.A00;
        if (i4 != 0) {
            C113245l7 r2 = (C113245l7) obj;
            r2.A5i.BkM(new C117235rb(r2, i, i2, i3));
            return;
        }
        ScheduleCallFragment scheduleCallFragment = (ScheduleCallFragment) obj;
        scheduleCallFragment.A0F.set(i, i2, i3);
        scheduleCallFragment.A03.setText(DateFormat.getDateInstance(2, C620733j.A02(scheduleCallFragment.A0B)).format(scheduleCallFragment.A0F.getTime()));
    }
}
