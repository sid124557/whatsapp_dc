package X;

import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1Hw  reason: invalid class name */
public class AnonymousClass1Hw extends C105185Tx {
    public static volatile long A02;
    public final C620633i A00;
    public final AnonymousClass5GC A01;

    public void A01() {
        Log.i("HourlyCronAction; setting hourly cron using alarms");
        if (A00("com.whatsapp.action.HOURLY_CRON", 536870912) == null) {
            AlarmManager A07 = this.A00.A07();
            if (A07 != null) {
                A07.setInexactRepeating(3, 3600000 + SystemClock.elapsedRealtime(), 3600000, A00("com.whatsapp.action.HOURLY_CRON", 0));
                return;
            }
            Log.w("HourlyCronAction; setup skipped, AlarmManager is null");
            return;
        }
        Log.d("HourlyCronAction; setup skip");
    }

    public boolean A04(Intent intent) {
        return C18280x3.A1V(intent, "com.whatsapp.action.HOURLY_CRON");
    }

    public AnonymousClass1Hw(Context context, C620633i r2, AnonymousClass5GC r3) {
        super(context);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void A02(Intent intent) {
        if (SystemClock.elapsedRealtime() - A02 < 1800000) {
            Log.i("HourlyCronAction; too soon, skipping...");
            return;
        }
        Log.i("HourlyCronAction; executing hourly cron");
        for (AnonymousClass65A BUN : this.A01.A00) {
            BUN.BUN();
        }
        A02 = SystemClock.elapsedRealtime();
    }
}
