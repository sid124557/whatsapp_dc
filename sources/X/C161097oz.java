package X;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7oz  reason: invalid class name and case insensitive filesystem */
public class C161097oz {
    public static AtomicReference A00 = new AtomicReference();

    public static Calendar A01(Calendar calendar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.setTimeInMillis(calendar.getTimeInMillis());
        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance2.clear();
        instance2.set(instance.get(1), instance.get(2), instance.get(5));
        return instance2;
    }

    public static Calendar A00() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instance;
    }
}
