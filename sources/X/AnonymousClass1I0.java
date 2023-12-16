package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.1I0  reason: invalid class name */
public class AnonymousClass1I0 extends C105185Tx {
    public final Context A00;
    public final C46272bM A01;
    public final AnonymousClass2ZI A02;
    public final AnonymousClass5PA A03;
    public final C50862it A04;
    public final C620633i A05;
    public final AnonymousClass33p A06;
    public final AnonymousClass2KH A07;
    public final AnonymousClass1VX A08;
    public final C58392vB A09;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ba, code lost:
        r2 = r11.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.content.Intent r21) {
        /*
            r20 = this;
            r4 = 0
            r5 = r20
            X.5PA r7 = r5.A03     // Catch:{ all -> 0x0183 }
            r2 = 1
            r7.A00(r4, r2)     // Catch:{ all -> 0x0183 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "DailyCronAction/dailyCron intent="
            r3 = r21
            X.C18260x0.A1R(r1, r0, r3)     // Catch:{ all -> 0x0183 }
            X.33i r0 = r5.A05     // Catch:{ all -> 0x0183 }
            android.os.PowerManager r1 = r0.A0J()     // Catch:{ all -> 0x0183 }
            if (r1 != 0) goto L_0x0023
            java.lang.String r0 = "DailyCronAction/dailyCron pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0183 }
            r6 = 0
            goto L_0x0032
        L_0x0023:
            java.lang.String r0 = "DailyCronAction#dailyCron"
            android.os.PowerManager$WakeLock r6 = X.AnonymousClass75K.A00(r1, r0, r2)     // Catch:{ all -> 0x0183 }
            r6.setReferenceCounted(r4)     // Catch:{ all -> 0x0183 }
            r0 = 600000(0x927c0, double:2.964394E-318)
            r6.acquire(r0)     // Catch:{ all -> 0x0183 }
        L_0x0032:
            r5.A06()     // Catch:{ all -> 0x0179 }
            boolean r0 = r5.A07()     // Catch:{ all -> 0x0179 }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "DailyCronAction/dailyCron; too frequent, skipping..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0179 }
            goto L_0x0168
        L_0x0042:
            X.2vB r0 = r5.A09     // Catch:{ all -> 0x0179 }
            java.lang.String r2 = "daily-cron"
            r1 = 0
            X.4FV r0 = r0.A00     // Catch:{ all -> 0x0179 }
            X.2bk r8 = new X.2bk     // Catch:{ all -> 0x0179 }
            r8.<init>(r0, r1, r2)     // Catch:{ all -> 0x0179 }
            java.lang.String r0 = "DailyCronAction/dailyCron: executing daily work."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0174 }
            boolean r0 = com.whatsapp.util.Log.rotate()     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = "DailyCronAction/dailyCron rotated logs"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0174 }
            com.whatsapp.util.Log.compress()     // Catch:{ all -> 0x0174 }
        L_0x0061:
            r14 = 3
            java.io.File r3 = com.whatsapp.util.Log.logFile     // Catch:{ all -> 0x0174 }
            java.lang.String r2 = ".gz"
            r3.getAbsolutePath()     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r13 = X.AnonymousClass0x7.A0u(r0)     // Catch:{ all -> 0x0174 }
            java.util.Date r19 = new java.util.Date     // Catch:{ all -> 0x0174 }
            r19.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r18 = r13.toPattern()     // Catch:{ all -> 0x0174 }
            java.lang.String r1 = r3.getName()     // Catch:{ all -> 0x0174 }
            r0 = 46
            int r0 = r1.indexOf(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r1.substring(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r12 = X.AnonymousClass000.A0T(r0, r2)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r3.getName()     // Catch:{ all -> 0x0174 }
            java.lang.String r11 = X.AnonymousClass342.A01(r0)     // Catch:{ all -> 0x0174 }
            r10 = 0
            java.io.File r0 = r3.getParentFile()     // Catch:{ all -> 0x0174 }
            java.io.File[] r9 = r0.listFiles()     // Catch:{ all -> 0x0174 }
            if (r9 == 0) goto L_0x00f6
            int r3 = r9.length     // Catch:{ all -> 0x0174 }
            goto L_0x00a6
        L_0x00a0:
            java.lang.String r0 = "DailyCronAction/dailyCron failed to rotate logs"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0174 }
            goto L_0x0061
        L_0x00a6:
            if (r10 >= r3) goto L_0x00f6
            r17 = r9[r10]     // Catch:{ all -> 0x0174 }
            java.lang.String r15 = r17.getName()     // Catch:{ all -> 0x0174 }
            boolean r0 = r15.startsWith(r11)     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r15.endsWith(r12)     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x00f3
            int r2 = r11.length()     // Catch:{ all -> 0x0174 }
            int r0 = r18.length()     // Catch:{ all -> 0x0174 }
            int r1 = r2 + r0
            int r0 = r15.length()     // Catch:{ all -> 0x0174 }
            if (r1 > r0) goto L_0x00f3
            java.lang.String r0 = r15.substring(r2, r1)     // Catch:{ all -> 0x0174 }
            java.util.Date r0 = r13.parse(r0)     // Catch:{ SecurityException | ParseException -> 0x00f3 }
            long r15 = r19.getTime()     // Catch:{ SecurityException | ParseException -> 0x00f3 }
            long r0 = r0.getTime()     // Catch:{ SecurityException | ParseException -> 0x00f3 }
            long r15 = r15 - r0
            long r0 = X.AnonymousClass0x7.A0B()     // Catch:{ SecurityException | ParseException -> 0x00f3 }
            long r15 = r15 / r0
            long r15 = java.lang.Math.abs(r15)     // Catch:{ SecurityException | ParseException -> 0x00f3 }
            long r0 = (long) r14     // Catch:{ SecurityException | ParseException -> 0x00f3 }
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ed
            r17.getAbsolutePath()     // Catch:{ SecurityException | ParseException -> 0x00f3 }
            goto L_0x00f3
        L_0x00ed:
            r17.getAbsolutePath()     // Catch:{ SecurityException | ParseException -> 0x00f3 }
            r17.delete()     // Catch:{ SecurityException | ParseException -> 0x00f3 }
        L_0x00f3:
            int r10 = r10 + 1
            goto L_0x00a6
        L_0x00f6:
            X.2bM r12 = r5.A01     // Catch:{ all -> 0x0174 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            X.33p r11 = r12.A01     // Catch:{ all -> 0x0174 }
            java.lang.String r3 = "phoneid_last_sync_timestamp"
            boolean r0 = r11.A2P(r3, r0)     // Catch:{ all -> 0x0174 }
            if (r0 != 0) goto L_0x0116
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0174 }
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r11)     // Catch:{ all -> 0x0174 }
            long r1 = X.AnonymousClass0x2.A0A(r0, r3)     // Catch:{ all -> 0x0174 }
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x011c
        L_0x0116:
            r12.A00()     // Catch:{ all -> 0x0174 }
            r11.A1Y(r3)     // Catch:{ all -> 0x0174 }
        L_0x011c:
            X.2KH r1 = r5.A07     // Catch:{ all -> 0x0174 }
            X.3dV r0 = r1.A00     // Catch:{ all -> 0x0174 }
            boolean r9 = X.C72303dV.A00(r0)     // Catch:{ all -> 0x0174 }
            if (r9 != 0) goto L_0x012b
            java.lang.String r0 = "DailyCronExecutor/executeDailyCron: messageStore not ready, skipping crons that need it."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0174 }
        L_0x012b:
            X.8qC r0 = r1.A01     // Catch:{ all -> 0x0174 }
            java.util.Iterator r3 = X.AnonymousClass0x2.A0j(r0)     // Catch:{ all -> 0x0174 }
        L_0x0131:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x0156
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0174 }
            X.4E8 r2 = (X.AnonymousClass4E8) r2     // Catch:{ all -> 0x0174 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = "DailyCronExecutor/executeDailyCron: "
            r1.append(r0)     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r2.BDW()     // Catch:{ all -> 0x0174 }
            X.C18260x0.A1J(r1, r0)     // Catch:{ all -> 0x0174 }
            r2.BQW()     // Catch:{ all -> 0x0174 }
            if (r9 == 0) goto L_0x0131
            r2.BQX()     // Catch:{ all -> 0x0174 }
            goto L_0x0131
        L_0x0156:
            r8.A00()     // Catch:{ all -> 0x0179 }
            X.33p r0 = r5.A06     // Catch:{ all -> 0x0179 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0179 }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)     // Catch:{ all -> 0x0179 }
            java.lang.String r0 = "last_daily_cron"
            X.C18270x1.A0i(r1, r0, r2)     // Catch:{ all -> 0x0179 }
        L_0x0168:
            r5.A05()     // Catch:{ all -> 0x0183 }
            if (r6 == 0) goto L_0x0170
            r6.release()     // Catch:{ all -> 0x0183 }
        L_0x0170:
            r7.A00(r4, r4)
            return
        L_0x0174:
            r0 = move-exception
            r8.A00()     // Catch:{ all -> 0x0179 }
            throw r0     // Catch:{ all -> 0x0179 }
        L_0x0179:
            r0 = move-exception
            r5.A05()     // Catch:{ all -> 0x0183 }
            if (r6 == 0) goto L_0x0182
            r6.release()     // Catch:{ all -> 0x0183 }
        L_0x0182:
            throw r0     // Catch:{ all -> 0x0183 }
        L_0x0183:
            r1 = move-exception
            X.5PA r0 = r5.A03
            r0.A00(r4, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I0.A02(android.content.Intent):void");
    }

    public final void A05() {
        StringBuilder A0o;
        String str;
        AlarmManager A072 = this.A05.A07();
        if (A072 == null) {
            Log.w("DailyCronAction/dailyCatchupCron; AlarmManager is null");
            return;
        }
        PendingIntent A002 = A00("com.whatsapp.action.DAILY_CATCHUP_CRON", 536870912);
        if (A07()) {
            Log.d("DailyCronAction/dailyCatchupCron; daily catchup alarm is not needed.");
            if (A002 != null) {
                A072.cancel(A002);
                A002.cancel();
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass33p r9 = this.A06;
        C183538qC r7 = r9.A01;
        long j = C18300x5.A0B(r7).getLong("next_daily_cron_catchup", 0);
        long j2 = j - currentTimeMillis;
        if (A002 == null || j2 <= 0 || j2 >= 900000) {
            long j3 = currentTimeMillis + 900000;
            this.A04.A02(A00("com.whatsapp.action.DAILY_CATCHUP_CRON", 0), 1, j3);
            C18260x0.A0M(r9, "next_daily_cron_catchup", j3);
            A0o = AnonymousClass001.A0o();
            A0o.append(AnonymousClass0x9.A11("DailyCronAction/dailyCatchupCron; scheduled for ", A0o, j3));
            A0o.append(" (last run at: ");
            A0o.append(C107175ap.A03(AnonymousClass0x2.A0B(C18300x5.A0B(r7), "last_daily_cron")));
            str = ")";
        } else {
            A0o = AnonymousClass001.A0o();
            str = AnonymousClass0x9.A11("DailyCronAction/dailyCatchupCron; already scheduled: ", A0o, j);
        }
        C18260x0.A1J(A0o, str);
    }

    public final boolean A07() {
        long j = AnonymousClass0x2.A0F(this.A06).getLong("last_daily_cron", 0);
        Calendar instance = Calendar.getInstance();
        C18280x3.A1N(instance, 0);
        instance.set(11, 0);
        long timeInMillis = instance.getTimeInMillis();
        long j2 = 86400000 + timeInMillis;
        if (j >= timeInMillis && j < j2) {
            return true;
        }
        long A052 = AnonymousClass0x9.A05(j);
        if (A052 <= 0 || A052 >= 21600000) {
            return false;
        }
        return true;
    }

    public AnonymousClass1I0(Context context, C46272bM r2, AnonymousClass2ZI r3, AnonymousClass5PA r4, C50862it r5, C620633i r6, AnonymousClass33p r7, AnonymousClass2KH r8, AnonymousClass1VX r9, C58392vB r10) {
        super(context);
        this.A00 = context;
        this.A08 = r9;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A09 = r10;
        this.A07 = r8;
        this.A06 = r7;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void A01() {
        A06();
        A05();
    }

    public boolean A04(Intent intent) {
        String action = intent.getAction();
        if ("com.whatsapp.action.DAILY_CRON".equals(action) || "com.whatsapp.action.DAILY_CATCHUP_CRON".equals(action)) {
            return true;
        }
        return false;
    }

    public final void A06() {
        Calendar instance = Calendar.getInstance();
        instance.add(5, 1);
        C18280x3.A1N(instance, 0);
        instance.set(11, 0);
        long timeInMillis = instance.getTimeInMillis() + this.A02.A00(5528, 5529);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DailyCronAction/setupDailyCronAlarm; alarmTimeMillis=");
        C18260x0.A0o(new Date(timeInMillis), A0o);
        if (!this.A04.A02(A00("com.whatsapp.action.DAILY_CRON", 134217728), 0, timeInMillis)) {
            Log.w("DailyCronAction/setupDailyCronAlarm AlarmManager is null");
        }
    }
}
