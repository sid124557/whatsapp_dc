package X;

import com.whatsapp.R;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.9kc  reason: invalid class name and case insensitive filesystem */
public class C201719kc extends GregorianCalendar {
    public int count;
    public int id;
    public C620733j whatsAppLocale;

    public C201719kc(C620733j r2, Calendar calendar, int i) {
        this.whatsAppLocale = r2;
        this.id = i;
        setTime(calendar.getTime());
    }

    public String toString() {
        DateFormat A09;
        long timeInMillis = getTimeInMillis();
        if (timeInMillis <= 0) {
            return this.whatsAppLocale.A0B(R.string.f11nameremoved);
        }
        C620733j r4 = this.whatsAppLocale;
        Locale A0O = r4.A0O();
        Calendar instance = Calendar.getInstance(A0O);
        instance.setTimeInMillis(timeInMillis);
        if (instance.get(1) == Calendar.getInstance(A0O).get(1)) {
            A09 = C107505bQ.A08(r4);
        } else {
            A09 = C107505bQ.A09(r4, 0);
        }
        return A09.format(instance.getTime());
    }
}
