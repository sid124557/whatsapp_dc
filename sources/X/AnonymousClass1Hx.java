package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.PowerManager;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import com.whatsapp.workers.ntp.NtpSyncWorker;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Hx  reason: invalid class name */
public class AnonymousClass1Hx extends C105185Tx {
    public final C620633i A00;
    public final C56612sH A01;
    public final C54292oU A02;
    public final C64733Es A03;
    public final AnonymousClass1VX A04;
    public final C103525Nh A05;

    public void A01() {
        long j;
        if (this.A04.A0Y(C58422vE.A02, 170)) {
            Log.i("NtpAction; cancelling ntp sync using alarm manager.");
            PendingIntent A002 = A00("com.whatsapp.action.UPDATE_NTP", 536870912);
            if (A002 != null) {
                AlarmManager A07 = this.A00.A07();
                if (A07 != null) {
                    A07.cancel(A002);
                }
                A002.cancel();
            }
            Log.i("NtpAction; setting ntp sync using work manager.");
            C103525Nh r3 = this.A05;
            Log.d("NtpSyncScheduler/schedulePeriodicWork");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C01450Ax r1 = new C01450Ax(NtpSyncWorker.class, timeUnit, timeUnit);
            r1.A06("tag.whatsapp.time.ntp");
            AnonymousClass0NS A003 = r1.A00();
            C34171uL r4 = r3.A02;
            new AnonymousClass0XO(C02320Fs.KEEP, C72333dY.A01(r4), "name.whatsapp.time.ntp", Collections.singletonList(A003), (List) null).A02();
            SharedPreferences.Editor A004 = C60152y5.A00(r3.A01, "ntp-scheduler");
            synchronized (r4) {
                j = r4.A00;
            }
            C18270x1.A0i(A004, "/ntp/work_manager_init", j);
        } else {
            Log.i("NtpAction; cancelling ntp sync using work manager.");
            C34171uL r2 = this.A05.A02;
            C72333dY.A01(r2).A0B("name.whatsapp.time.ntp");
            C72333dY.A01(r2).A0A("tag.whatsapp.time.ntp");
            Log.i("NtpAction; setting up ntp sync using alarm manager.");
            PendingIntent A005 = A00("com.whatsapp.action.UPDATE_NTP", 134217728);
            AlarmManager A072 = this.A00.A07();
            if (A072 != null) {
                A072.setInexactRepeating(3, 43200000 + SystemClock.elapsedRealtime(), 43200000, A005);
            } else {
                Log.w("NtpAction/setupUpdateNtpAlarm AlarmManager is null");
            }
        }
        A05((Intent) null);
    }

    public boolean A04(Intent intent) {
        return C18280x3.A1V(intent, "com.whatsapp.action.UPDATE_NTP");
    }

    public AnonymousClass1Hx(Context context, C620633i r2, C56612sH r3, C54292oU r4, C64733Es r5, AnonymousClass1VX r6, C103525Nh r7) {
        super(context);
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
        this.A05 = r7;
    }

    public final void A05(Intent intent) {
        PowerManager.WakeLock wakeLock;
        C18260x0.A1R(AnonymousClass001.A0o(), "NtpAction#updateNtp; intent=", intent);
        PowerManager A0J = this.A00.A0J();
        if (A0J == null) {
            Log.w("NtpAction/updateNtp pm=null");
            wakeLock = null;
        } else {
            wakeLock = AnonymousClass75K.A00(A0J, "NtpAction#updateNtp", 1);
            wakeLock.setReferenceCounted(false);
            wakeLock.acquire(300000);
        }
        try {
            NtpSyncWorker.A00(this.A02.A00, this.A01, this.A03, this.A04, this.A05);
        } finally {
            if (wakeLock != null) {
                wakeLock.release();
            }
        }
    }

    public void A02(Intent intent) {
        A05(intent);
    }
}
