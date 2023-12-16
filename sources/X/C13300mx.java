package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0mx  reason: invalid class name and case insensitive filesystem */
public class C13300mx implements Runnable {
    public static final long A04 = TimeUnit.DAYS.toMillis(3650);
    public static final String A05 = C06240Wu.A01("ForceStopRunnable");
    public int A00 = 0;
    public final Context A01;
    public final C06310Xb A02;
    public final C03450Ke A03;

    public static void A00(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = 134217728;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + A04;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (r3 == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01af, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r1 = r14.A00 + 1;
        r14.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b7, code lost:
        if (r1 >= 3) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ba, code lost:
        r3 = X.C06240Wu.A00();
        r2 = X.AnonymousClass000.A0Z("Retrying after ", X.AnonymousClass001.A0o(), ((long) r1) * 300);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01cf, code lost:
        if (r3.A00 <= 3) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d1, code lost:
        android.util.Log.d(r6, r2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        java.lang.Thread.sleep(((long) r14.A00) * 300);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ec, code lost:
        X.C06240Wu.A00();
        android.util.Log.e(r6, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", r7);
        r2 = new java.lang.IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", r7);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0036 */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01af A[ExcHandler: SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException (r7v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:12:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036 A[LOOP:0: B:8:0x0036->B:102:0x0036, LOOP_START, SYNTHETIC, Splitter:B:8:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            X.0Xb r9 = r14.A02     // Catch:{ all -> 0x01fa }
            X.0Nt r8 = r9.A02     // Catch:{ all -> 0x01fa }
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x0017
            X.0Wu r1 = X.C06240Wu.A00()     // Catch:{ all -> 0x01fa }
            java.lang.String r6 = A05     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = "The default process name was not specified."
            r1.A04(r6, r0)     // Catch:{ all -> 0x01fa }
            goto L_0x0036
        L_0x0017:
            android.content.Context r0 = r14.A01     // Catch:{ all -> 0x01fa }
            boolean r3 = X.AnonymousClass0VL.A01(r0, r8)     // Catch:{ all -> 0x01fa }
            X.0Wu r2 = X.C06240Wu.A00()     // Catch:{ all -> 0x01fa }
            java.lang.String r6 = A05     // Catch:{ all -> 0x01fa }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = "Is default app process = "
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r3)     // Catch:{ all -> 0x01fa }
            r2.A04(r6, r0)     // Catch:{ all -> 0x01fa }
            if (r3 != 0) goto L_0x0036
        L_0x0032:
            r9.A05()
            return
        L_0x0036:
            android.content.Context r4 = r14.A01     // Catch:{ SQLiteException -> 0x01dd }
            X.AnonymousClass0XE.A02(r4)     // Catch:{ SQLiteException -> 0x01dd }
            X.0Wu r1 = X.C06240Wu.A00()     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = "Performing cleanup operations."
            r1.A04(r6, r0)     // Catch:{ all -> 0x01fa }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r0 = 23
            r13 = 0
            if (r1 < r0) goto L_0x005d
            boolean r12 = X.C09040fY.A04(r4, r9)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
        L_0x004f:
            androidx.work.impl.WorkDatabase r3 = r9.A04     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            X.0uV r11 = r3.A0J()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            X.0rI r10 = r3.A0I()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r3.A0A()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            goto L_0x005f
        L_0x005d:
            r12 = 0
            goto L_0x004f
        L_0x005f:
            java.util.List r1 = r11.BCO()     // Catch:{ all -> 0x01aa }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x01aa }
            r7 = 0
            if (r0 != 0) goto L_0x0088
            r7 = 1
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x01aa }
        L_0x006f:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x01aa }
            X.0Wv r1 = (X.C06250Wv) r1     // Catch:{ all -> 0x01aa }
            X.0GD r0 = X.AnonymousClass0GD.ENQUEUED     // Catch:{ all -> 0x01aa }
            java.lang.String r2 = r1.A0J     // Catch:{ all -> 0x01aa }
            r11.BnQ(r0, r2)     // Catch:{ all -> 0x01aa }
            r0 = -1
            r11.BKZ(r2, r0)     // Catch:{ all -> 0x01aa }
            goto L_0x006f
        L_0x0088:
            X.0fh r10 = (X.C09130fh) r10     // Catch:{ all -> 0x01aa }
            X.0R5 r5 = r10.A01     // Catch:{ all -> 0x01aa }
            r5.A09()     // Catch:{ all -> 0x01aa }
            X.0QE r2 = r10.A03     // Catch:{ all -> 0x01aa }
            X.0vK r1 = r2.A01()     // Catch:{ all -> 0x01aa }
            r5.A0A()     // Catch:{ all -> 0x01aa }
            X.AnonymousClass0A6.A00(r5, r1)     // Catch:{ all -> 0x01a2 }
            r5.A0C()     // Catch:{ all -> 0x01aa }
            r2.A04(r1)     // Catch:{ all -> 0x01aa }
            r3.A0B()     // Catch:{ all -> 0x01aa }
            r3.A0C()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            if (r7 != 0) goto L_0x00ab
            if (r12 == 0) goto L_0x00ac
        L_0x00ab:
            r13 = 1
        L_0x00ac:
            X.0Ke r0 = r9.A05     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            androidx.work.impl.WorkDatabase r7 = r0.A00     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            X.0tv r0 = r7.A0F()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            java.lang.String r5 = "reschedule_needed"
            java.lang.Long r0 = r0.B9F(r5)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            if (r0 == 0) goto L_0x00e6
            long r10 = r0.longValue()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r1 = 1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00e6
            X.0Wu r1 = X.C06240Wu.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            java.lang.String r0 = "Rescheduling Workers."
            r1.A04(r6, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r9.A06()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            X.0PK r2 = new X.0PK     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r2.<init>(r5, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
        L_0x00dd:
            X.0tv r0 = r7.A0F()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r0.BGe(r2)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            goto L_0x0032
        L_0x00e6:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r0 = 31
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            if (r7 < r0) goto L_0x00f0
            r5 = 570425344(0x22000000, float:1.7347235E-18)
        L_0x00f0:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r2.<init>()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            java.lang.Class<androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver> r1 = androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver.class
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r0.<init>(r4, r1)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r2.setComponent(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            java.lang.String r0 = "ACTION_FORCE_STOP_RESCHEDULE"
            r2.setAction(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r0 = -1
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r4, r0, r2, r5)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r0 = 30
            r2 = 0
            if (r7 < r0) goto L_0x0160
            if (r1 == 0) goto L_0x0113
            r1.cancel()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
        L_0x0113:
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r4.getSystemService(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r0 = 0
            java.util.List r5 = r1.getHistoricalProcessExitReasons(r0, r2, r2)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            if (r5 == 0) goto L_0x0190
            boolean r0 = r5.isEmpty()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            if (r0 != 0) goto L_0x0190
            X.0Ke r0 = r14.A03     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            androidx.work.impl.WorkDatabase r0 = r0.A00     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            X.0tv r1 = r0.A0F()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            java.lang.String r0 = "last_force_stop_ms"
            java.lang.Long r0 = r1.B9F(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            if (r0 == 0) goto L_0x013d
            long r10 = r0.longValue()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            goto L_0x013f
        L_0x013d:
            r10 = 0
        L_0x013f:
            r4 = 0
        L_0x0140:
            int r0 = r5.size()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            if (r4 >= r0) goto L_0x0190
            java.lang.Object r2 = r5.get(r4)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            android.app.ApplicationExitInfo r2 = (android.app.ApplicationExitInfo) r2     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            int r1 = r2.getReason()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r0 = 10
            if (r1 != r0) goto L_0x015d
            long r1 = r2.getTimestamp()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x015d
            goto L_0x016f
        L_0x015d:
            int r4 = r4 + 1
            goto L_0x0140
        L_0x0160:
            if (r1 != 0) goto L_0x0190
            A00(r4)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0166, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            goto L_0x016f
        L_0x0166:
            r1 = move-exception
            X.C06240Wu.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            java.lang.String r0 = "Ignoring exception"
            android.util.Log.w(r6, r0, r1)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
        L_0x016f:
            X.0Wu r1 = X.C06240Wu.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            java.lang.String r0 = "Application was force-stopped, rescheduling."
            r1.A04(r6, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r9.A06()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            X.0Ke r4 = r14.A03     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            java.lang.String r1 = "last_force_stop_ms"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            X.0PK r2 = new X.0PK     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            r2.<init>(r1, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            androidx.work.impl.WorkDatabase r7 = r4.A00     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            goto L_0x00dd
        L_0x0190:
            if (r13 == 0) goto L_0x0032
            X.0Wu r1 = X.C06240Wu.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            java.lang.String r0 = "Found unfinished work, scheduling it."
            r1.A04(r6, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            java.util.List r0 = r9.A07     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            X.AnonymousClass0VJ.A01(r8, r3, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            goto L_0x0032
        L_0x01a2:
            r0 = move-exception
            r5.A0C()     // Catch:{ all -> 0x01aa }
            r2.A04(r1)     // Catch:{ all -> 0x01aa }
            throw r0     // Catch:{ all -> 0x01aa }
        L_0x01aa:
            r0 = move-exception
            r3.A0C()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
            throw r0     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x01af }
        L_0x01af:
            r7 = move-exception
            int r0 = r14.A00     // Catch:{ all -> 0x01fa }
            int r1 = r0 + 1
            r14.A00 = r1     // Catch:{ all -> 0x01fa }
            r0 = 3
            if (r1 < r0) goto L_0x01ba
            goto L_0x01ec
        L_0x01ba:
            long r4 = (long) r1     // Catch:{ all -> 0x01fa }
            r10 = 300(0x12c, double:1.48E-321)
            long r4 = r4 * r10
            X.0Wu r3 = X.C06240Wu.A00()     // Catch:{ all -> 0x01fa }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = "Retrying after "
            java.lang.String r2 = X.AnonymousClass000.A0Z(r0, r1, r4)     // Catch:{ all -> 0x01fa }
            int r1 = r3.A00     // Catch:{ all -> 0x01fa }
            r0 = 3
            if (r1 > r0) goto L_0x01d4
            android.util.Log.d(r6, r2, r7)     // Catch:{ all -> 0x01fa }
        L_0x01d4:
            int r0 = r14.A00     // Catch:{ all -> 0x01fa }
            long r0 = (long) r0     // Catch:{ all -> 0x01fa }
            long r0 = r0 * r10
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0036 }
            goto L_0x0036
        L_0x01dd:
            r1 = move-exception
            java.lang.String r0 = "Unexpected SQLite exception during migrations"
            X.C06240Wu.A00()     // Catch:{ all -> 0x01fa }
            android.util.Log.e(r6, r0)     // Catch:{ all -> 0x01fa }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01fa }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x01fa }
            goto L_0x01f9
        L_0x01ec:
            java.lang.String r0 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
            X.C06240Wu.A00()     // Catch:{ all -> 0x01fa }
            android.util.Log.e(r6, r0, r7)     // Catch:{ all -> 0x01fa }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01fa }
            r2.<init>(r0, r7)     // Catch:{ all -> 0x01fa }
        L_0x01f9:
            throw r2     // Catch:{ all -> 0x01fa }
        L_0x01fa:
            r1 = move-exception
            X.0Xb r0 = r14.A02
            r0.A05()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13300mx.run():void");
    }

    public C13300mx(Context context, C06310Xb r3) {
        this.A01 = context.getApplicationContext();
        this.A02 = r3;
        this.A03 = r3.A05;
    }
}
