package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import com.whatsapp.WaEditText;
import com.whatsapp.events.EventCreationFragment;

/* renamed from: X.36u  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C628036u implements TimePickerDialog.OnTimeSetListener {
    public final /* synthetic */ EventCreationFragment A00;

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        EventCreationFragment eventCreationFragment = this.A00;
        eventCreationFragment.A1K().set(11, i);
        eventCreationFragment.A1K().set(12, i2);
        WaEditText waEditText = eventCreationFragment.A04;
        if (waEditText != null) {
            waEditText.setText(C107145am.A03(eventCreationFragment.A1J(), eventCreationFragment.A1K()));
        }
    }

    public /* synthetic */ C628036u(EventCreationFragment eventCreationFragment) {
        this.A00 = eventCreationFragment;
    }
}
