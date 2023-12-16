package X;

import com.whatsapp.util.Log;

/* renamed from: X.5Vi  reason: invalid class name and case insensitive filesystem */
public class C105525Vi {
    public static long A00 = -1;
    public static boolean A01;

    public static synchronized void A00(AnonymousClass5XU r4, AnonymousClass33p r5) {
        synchronized (C105525Vi.class) {
            A01 = true;
            if (r4.A03()) {
                Log.w("profilephotoreminder/savelastremindertimestamp/clock is wrong, not saving last profile photo reminder time");
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                A00 = currentTimeMillis;
                C18260x0.A0M(r5, "wa_last_reminder_timestamp", currentTimeMillis);
            }
        }
    }
}
