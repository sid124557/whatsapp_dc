package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.0Wf  reason: invalid class name and case insensitive filesystem */
public class C06090Wf {
    public static final String A00 = C06240Wu.A01("Alarms");

    public static void A01(Context context, AnonymousClass0PL r7, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        C08990fT.A00(intent, r7);
        int i2 = 536870912;
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 603979776;
        }
        PendingIntent service = PendingIntent.getService(context, i, intent, i2);
        if (service != null && alarmManager != null) {
            C06240Wu A002 = C06240Wu.A00();
            String str = A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Cancelling existing alarm with (workSpecId, systemId) (");
            A0o.append(r7);
            AnonymousClass001.A1M(A0o);
            A0o.append(i);
            C06240Wu.A03(A002, ")", str, A0o);
            alarmManager.cancel(service);
        }
    }

    public static void A02(Context context, AnonymousClass0PL r5, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = 134217728;
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 201326592;
        }
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        C08990fT.A00(intent, r5);
        PendingIntent service = PendingIntent.getService(context, i, intent, i2);
        if (alarmManager != null) {
            C03110Iw.A00(alarmManager, service, 0, j);
        }
    }

    public static void A00(Context context, WorkDatabase workDatabase, AnonymousClass0PL r7, long j) {
        C16770tw A0G = workDatabase.A0G();
        AnonymousClass0PX BDR = A0G.BDR(r7);
        if (BDR != null) {
            int i = BDR.A01;
            A01(context, r7, i);
            A02(context, r7, i, j);
            return;
        }
        int A002 = new AnonymousClass0OB(workDatabase).A00();
        A0G.BGf(new AnonymousClass0PX(r7.A01, r7.A00, A002));
        A02(context, r7, A002, j);
    }
}
