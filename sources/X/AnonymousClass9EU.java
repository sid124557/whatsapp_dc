package X;

import com.whatsapp.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: X.9EU  reason: invalid class name */
public class AnonymousClass9EU extends C201719kc {
    public String toString() {
        long timeInMillis = getTimeInMillis();
        int i = (timeInMillis > 0 ? 1 : (timeInMillis == 0 ? 0 : -1));
        C620733j r1 = this.whatsAppLocale;
        if (i <= 0) {
            return r1.A0B(R.string.f11nameremoved);
        }
        return C86624Kv.A0c(new SimpleDateFormat(r1.A0A(178), r1.A0O()), timeInMillis);
    }

    public AnonymousClass9EU(C620733j r1, Calendar calendar, int i) {
        super(r1, calendar, i);
    }
}
