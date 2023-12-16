package X;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: X.0Iw  reason: invalid class name and case insensitive filesystem */
public class C03110Iw {
    public static void A00(AlarmManager alarmManager, PendingIntent pendingIntent, int i, long j) {
        alarmManager.setExact(i, j, pendingIntent);
    }
}
