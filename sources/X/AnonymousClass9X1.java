package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.9X1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9X1 implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ C150957Sw A00;

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        C150957Sw r4 = this.A00;
        Calendar instance = Calendar.getInstance();
        instance.set(1, i);
        instance.set(2, i2);
        instance.set(5, i3);
        Date time = instance.getTime();
        r4.A00(new SimpleDateFormat("dd/MM/yyyy", Locale.US).format(time), i, i2, i3, time.getTime());
    }

    public /* synthetic */ AnonymousClass9X1(C150957Sw r1) {
        this.A00 = r1;
    }
}
