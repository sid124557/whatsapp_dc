package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.5tK  reason: invalid class name and case insensitive filesystem */
public class C118305tK extends GregorianCalendar implements C179328iy {
    public final Context context;
    public int count;
    public final int id;
    public final C620733j whatsAppLocale;

    public String toString() {
        C620733j r2;
        Locale locale;
        int i;
        int i2 = this.id;
        if (i2 == 1) {
            return this.context.getString(R.string.f11nameremoved);
        }
        if (i2 == 2) {
            r2 = this.whatsAppLocale;
            locale = C620733j.A02(r2);
            i = 233;
        } else if (i2 != 3) {
            C620733j r4 = this.whatsAppLocale;
            long timeInMillis = getTimeInMillis();
            if (i2 != 4) {
                return C86614Ku.A0v(r4, 177, timeInMillis);
            }
            Calendar instance = Calendar.getInstance(C620733j.A02(r4));
            instance.setTimeInMillis(timeInMillis);
            return C159777mR.A00(r4)[instance.get(2)];
        } else {
            r2 = this.whatsAppLocale;
            locale = C620733j.A02(r2);
            i = 232;
        }
        return C107505bQ.A07(locale, r2.A0A(i));
    }

    public C118305tK(Context context2, C620733j r3, C118305tK r4) {
        this.id = r4.id;
        this.context = context2;
        this.count = r4.count;
        setTime(r4.getTime());
        this.whatsAppLocale = r3;
    }

    public /* bridge */ /* synthetic */ C179328iy A00() {
        super.clone();
        return new C118305tK(this.context, this.whatsAppLocale, this);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        super.clone();
        return new C118305tK(this.context, this.whatsAppLocale, this);
    }

    public C118305tK(Context context2, C620733j r3, Calendar calendar, int i) {
        this.id = i;
        this.context = context2;
        setTime(calendar.getTime());
        this.whatsAppLocale = r3;
    }
}
