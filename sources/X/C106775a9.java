package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import com.whatsapp.calling.schedulecall.ScheduleCallFragment;
import java.util.Calendar;

/* renamed from: X.5a9  reason: invalid class name and case insensitive filesystem */
public class C106775a9 implements TimePickerDialog.OnTimeSetListener {
    public Object A00;
    public final int A01;

    public C106775a9(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onTimeSet(TimePicker timePicker, int i, int i2) {
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            AnonymousClass1QL r3 = (AnonymousClass1QL) obj;
            Calendar calendar = r3.A01;
            if (calendar == null) {
                throw C18270x1.A0S("reminderDateTime");
            }
            calendar.set(11, i);
            Calendar calendar2 = r3.A01;
            if (calendar2 == null) {
                throw C18270x1.A0S("reminderDateTime");
            }
            calendar2.set(12, i2);
            return;
        }
        ScheduleCallFragment scheduleCallFragment = (ScheduleCallFragment) obj;
        scheduleCallFragment.A0F.set(11, i);
        scheduleCallFragment.A0F.set(12, i2);
        scheduleCallFragment.A04.setText(C107145am.A03(scheduleCallFragment.A0B, scheduleCallFragment.A0F));
    }
}
