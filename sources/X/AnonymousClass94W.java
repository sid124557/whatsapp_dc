package X;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import com.whatsapp.R;
import java.util.Calendar;

/* renamed from: X.94W  reason: invalid class name */
public class AnonymousClass94W extends AnonymousClass043 implements DialogInterface.OnClickListener, DatePicker.OnDateChangedListener {
    public DatePickerDialog.OnDateSetListener A00;
    public final DatePicker A01;

    public AnonymousClass94W(Context context) {
        this((DatePickerDialog.OnDateSetListener) null, context, Calendar.getInstance(), 0, -1, -1, -1);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            cancel();
        } else if (i == -1 && this.A00 != null) {
            DatePicker datePicker = this.A01;
            datePicker.clearFocus();
            this.A00.onDateSet(datePicker, datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
        }
    }

    public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        this.A01.init(i, i2, i3, this);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A01.init(bundle.getInt("year"), bundle.getInt("month"), bundle.getInt("day"), this);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        DatePicker datePicker = this.A01;
        onSaveInstanceState.putInt("year", datePicker.getYear());
        onSaveInstanceState.putInt("month", datePicker.getMonth());
        onSaveInstanceState.putInt("day", datePicker.getDayOfMonth());
        return onSaveInstanceState;
    }

    public DatePicker A04() {
        return this.A01;
    }

    public void A05(DatePickerDialog.OnDateSetListener onDateSetListener) {
        this.A00 = onDateSetListener;
    }

    public AnonymousClass94W(DatePickerDialog.OnDateSetListener onDateSetListener, Context context, Calendar calendar, int i, int i2, int i3, int i4) {
        super(context, i);
        DatePicker datePicker = new DatePicker(getContext());
        this.A01 = datePicker;
        C06200Wq r1 = this.A00;
        r1.A0D = datePicker;
        r1.A06 = 0;
        A03(-1, context.getString(R.string.f11nameremoved), this);
        A03(-2, context.getString(R.string.f11nameremoved), this);
        if (calendar != null) {
            i2 = calendar.get(1);
            i3 = calendar.get(2);
            i4 = calendar.get(5);
        }
        datePicker.init(i2, i3, i4, this);
        this.A00 = onDateSetListener;
    }

    public AnonymousClass94W(DatePickerDialog.OnDateSetListener onDateSetListener, Context context, int i, int i2, int i3) {
        this(onDateSetListener, context, (Calendar) null, R.style.f12nameremoved, i, i2, i3);
    }

    public AnonymousClass94W(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        this(onDateSetListener, context, (Calendar) null, 0, i, i2, i3);
    }
}
