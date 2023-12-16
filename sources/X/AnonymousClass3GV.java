package X;

import android.content.Context;
import android.os.ConditionVariable;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.3GV  reason: invalid class name */
public class AnonymousClass3GV implements AnonymousClass4EB {
    public final ConditionVariable A00;
    public final C24971Zl A01;
    public final /* synthetic */ AnonymousClass3DW A02;

    public AnonymousClass3GV(ConditionVariable conditionVariable, AnonymousClass3DW r2, C24971Zl r3) {
        this.A02 = r2;
        this.A00 = conditionVariable;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012b, code lost:
        if (r1 != 0) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r14.A05() != 0) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BMF(int r23) {
        /*
            r22 = this;
            r5 = r22
            X.3DW r4 = r5.A02
            r4.A01(r5)
            boolean r1 = r4.A01
            r7 = r23
            if (r23 != 0) goto L_0x01f9
            X.2oU r0 = r4.A0F
            android.content.Context r6 = r0.A00
            boolean r0 = X.AnonymousClass0YV.A0F(r6)
            if (r0 == 0) goto L_0x01f9
            X.2sr r0 = r4.A03
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x01f9
            if (r1 == 0) goto L_0x01ae
            X.33p r14 = r4.A0G
            int r0 = r14.A05()
            if (r0 == 0) goto L_0x01f9
        L_0x0029:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0194
            r2 = 1
        L_0x002f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "local/backup/gdrive/random-wait-time-in-secs/"
            X.C18260x0.A12(r0, r1, r2)
            X.1VX r1 = r4.A0K
            boolean r0 = X.C06540Yd.A0Q(r1)
            if (r0 == 0) goto L_0x0157
            X.1uL r0 = r4.A0P
            X.0Xb r6 = X.C72333dY.A01(r0)
            X.0Fs r9 = X.C02320Fs.REPLACE
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "google-backup-worker/createWorkRequest with delay: "
            X.C18260x0.A12(r0, r8, r2)
            X.0Q9 r11 = new X.0Q9
            r11.<init>()
            r0 = 0
            int r8 = X.C06540Yd.A00(r14, r0)
            java.lang.String r0 = "KEY_BACKUP_SCHEDULE"
            r11.A01(r0, r8)
            java.lang.String r10 = "KEY_MAX_NUMBER_OF_RETRIES"
            int r13 = r14.A05()
            r8 = 1
            r12 = 671(0x29f, float:9.4E-43)
            if (r13 == r8) goto L_0x014f
            r0 = 2
            r12 = 672(0x2a0, float:9.42E-43)
            if (r13 == r0) goto L_0x014f
            r0 = 3
            r12 = 673(0x2a1, float:9.43E-43)
            if (r13 == r0) goto L_0x014f
            r0 = 0
        L_0x0076:
            r11.A01(r10, r0)
            int r10 = r14.A06()
            java.lang.String r0 = "KEY_BACKUP_NETWORK_SETTING"
            r11.A01(r0, r10)
            X.0Xq r12 = r11.A00()
            X.0Pq r11 = new X.0Pq
            r11.<init>()
            r11.A02 = r8
            int r0 = r14.A06()
            if (r0 != 0) goto L_0x014b
            X.0Fy r0 = X.C02380Fy.UNMETERED
        L_0x0095:
            r11.A02(r0)
            java.lang.Class<com.whatsapp.backup.google.workers.GoogleBackupWorker> r0 = com.whatsapp.backup.google.workers.GoogleBackupWorker.class
            X.0Aw r10 = new X.0Aw
            r10.<init>(r0)
            X.0Wv r0 = r10.A00
            r0.A0B = r12
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r10.A02(r2, r0)
            X.0XS r0 = r11.A00()
            r10.A04(r0)
            X.0FN r3 = X.AnonymousClass0FN.LINEAR
            r0 = 901(0x385, float:1.263E-42)
            long r0 = X.C56952sp.A06(r1, r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r10.A03(r3, r2, r0)
            X.0Ay r1 = X.AnonymousClass0x9.A0I(r10)
            java.lang.String r0 = "com.whatsapp.backup.google.google-backup-worker"
            X.0XO r2 = r6.A03(r9, r1, r0)
            X.0WN r0 = r4.A06
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = r14.A0X()
            int r0 = r14.A0G(r0)
            if (r0 != r8) goto L_0x00ec
            java.lang.String r0 = "local/backup/gdrive/backupWithWorkManager add media re-encryption worker"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "com.whatsapp.backup.google.google-encrypted-re-upload-worker"
            r6.A0B(r0)
            r0 = 0
            X.0Ay r0 = com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker.A00(r14, r0)
            X.0XO r2 = r2.A03(r0)
        L_0x00ec:
            java.lang.String r0 = "local/backup/gdrive/backupWithWorkManager enqueue work"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A02()
            r3 = 1
        L_0x00f5:
            r0 = 0
            r4.A01 = r0
            X.3Wi r0 = r4.A02
            r0.A0D()
            r0 = 3
            if (r7 != r0) goto L_0x0144
            X.2oU r0 = r4.A0F
            android.content.Context r0 = r0.A00
            X.C06550Ye.A0C(r0)
        L_0x0107:
            android.os.ConditionVariable r0 = r5.A00
            if (r0 == 0) goto L_0x010e
            r0.open()
        L_0x010e:
            X.1Zl r2 = r5.A01
            int r0 = r4.A0R
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            int r0 = X.C06550Ye.A00(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            java.lang.Integer r0 = r2.A04
            if (r0 == 0) goto L_0x012d
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == 0) goto L_0x012e
        L_0x012d:
            r0 = 0
        L_0x012e:
            int r0 = X.C06540Yd.A00(r14, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.A00 = r0
            X.4FV r0 = r4.A0L
            r0.BhD(r2)
            return
        L_0x0144:
            r0 = 4
            if (r7 != r0) goto L_0x0107
            r0 = 1
            r4.A00 = r0
            goto L_0x0107
        L_0x014b:
            X.0Fy r0 = X.C02380Fy.NOT_ROAMING
            goto L_0x0095
        L_0x014f:
            X.2vE r0 = X.C58422vE.A02
            int r0 = r1.A0O(r0, r12)
            goto L_0x0076
        L_0x0157:
            java.lang.String r0 = "action_backup"
            android.content.Intent r9 = X.C627736r.A0t(r6, r0)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0191
            java.lang.String r1 = "user_initiated"
        L_0x0164:
            java.lang.String r0 = "backup_mode"
            r9.putExtra(r0, r1)
            int r8 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r0 = 0
            if (r8 < r1) goto L_0x018c
            android.app.PendingIntent r10 = X.C624735e.A02(r6, r9)
        L_0x0174:
            X.2it r6 = r4.A0B
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r8
            long r0 = r0 + r2
            r2 = 2
            boolean r3 = r6.A01(r10, r2, r0)
            if (r3 != 0) goto L_0x00f5
            java.lang.String r0 = "LocalBackupManager/runLocalBackup/onAfterBackup AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00f5
        L_0x018c:
            android.app.PendingIntent r10 = X.C624735e.A05(r6, r9, r0)
            goto L_0x0174
        L_0x0191:
            java.lang.String r1 = "automated"
            goto L_0x0164
        L_0x0194:
            java.util.Random r3 = X.AnonymousClass0x9.A1C()
            X.1VX r1 = r4.A0K
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 956(0x3bc, float:1.34E-42)
            long r0 = X.C56952sp.A06(r1, r0)
            long r0 = r2.toSeconds(r0)
            int r2 = (int) r0
            int r0 = r3.nextInt(r2)
            long r2 = (long) r0
            goto L_0x002f
        L_0x01ae:
            X.1VX r15 = r4.A0K
            X.33p r14 = r4.A0G
            long r0 = java.lang.System.currentTimeMillis()
            int r9 = r14.A05()
            java.lang.String r2 = r14.A0X()
            long r2 = r14.A0R(r2)
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x01d9
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            java.lang.String r8 = "gdrive-util/should-backup/last-backup-timestamp-is-in-future/"
            r10.append(r8)
            r10.append(r2)
            java.lang.String r2 = " , ignoring it"
            X.C18260x0.A1L(r10, r2)
            r2 = -1
        L_0x01d9:
            r8 = 0
            if (r9 == 0) goto L_0x0239
            r10 = 1
            if (r9 == r10) goto L_0x0029
            r11 = 2
            if (r9 == r11) goto L_0x0229
            r11 = 3
            if (r9 == r11) goto L_0x0207
            r0 = 4
            if (r9 == r0) goto L_0x023c
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "gdrive-util/should-backup frequency has unexpected value: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", no auto backups will be performed."
            X.C18260x0.A1K(r1, r0)
        L_0x01f9:
            X.1VX r2 = r4.A0K
            X.1uL r1 = r4.A0P
            X.33p r14 = r4.A0G
            X.0U8 r0 = r4.A05
            com.whatsapp.backup.google.workers.BackupGpbSignalWorker.A04(r0, r14, r2, r1)
            r3 = 0
            goto L_0x00f5
        L_0x0207:
            r20 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            r16 = r0
            r18 = r2
            boolean r9 = X.C06540Yd.A0N(r14, r15, r16, r18, r20)
            if (r9 != 0) goto L_0x0029
            java.util.Locale r9 = java.util.Locale.ENGLISH
            java.lang.Object[] r6 = new java.lang.Object[r10]
            long r0 = r0 - r2
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 / r2
            X.AnonymousClass000.A1Q(r6, r8, r0)
            java.lang.String r0 = "gdrive-util/should-backup/frequency/monthly its only %d days since the last successful backup."
            java.lang.String r0 = java.lang.String.format(r9, r0, r6)
            goto L_0x023e
        L_0x0229:
            r20 = 604800000(0x240c8400, double:2.988109026E-315)
            r16 = r0
            r18 = r2
            boolean r0 = X.C06540Yd.A0N(r14, r15, r16, r18, r20)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "gdrive-util/should-backup/frequency/weekly its not 7 days since the last successful backup."
            goto L_0x023e
        L_0x0239:
            java.lang.String r0 = "gdrive-util/should-backup/frequency/none"
            goto L_0x023e
        L_0x023c:
            java.lang.String r0 = "gdrive-util/should-backup/frequency/manual"
        L_0x023e:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x01f9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3GV.BMF(int):void");
    }

    public void BNX() {
        AnonymousClass3DW r4 = this.A02;
        r4.A00 = false;
        C69263Wi r7 = r4.A02;
        r7.A0G(R.string.f11nameremoved, R.string.f11nameremoved);
        Calendar instance = Calendar.getInstance();
        C18280x3.A1N(instance, 0);
        instance.set(11, 2);
        long timeInMillis = instance.getTimeInMillis();
        C620733j r6 = r4.A0H;
        r7.A0U(C107145am.A01(r6, AnonymousClass002.A0F(r4.A0F.A00, C107145am.A00(r6, timeInMillis), AnonymousClass002.A0L(), 0, R.string.f11nameremoved), timeInMillis));
    }

    public void BZ2(int i) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        char A1Y = C18300x5.A1Y(objArr, i);
        String format = String.format(locale, "app/backup/progress/%d%%", objArr);
        if (i % 10 == 0) {
            Log.i(format);
        }
        Calendar instance = Calendar.getInstance();
        C18280x3.A1N(instance, A1Y);
        instance.set(11, 2);
        long timeInMillis = instance.getTimeInMillis();
        AnonymousClass3DW r0 = this.A02;
        C69263Wi r7 = r0.A02;
        C620733j r6 = r0.A0H;
        Context context = r0.A0F.A00;
        Object[] objArr2 = new Object[2];
        objArr2[A1Y] = AnonymousClass001.A0l(r6.A0N(), i);
        r7.A0U(C107145am.A01(r6, AnonymousClass002.A0F(context, C107145am.A00(r6, timeInMillis), objArr2, 1, R.string.f11nameremoved), timeInMillis));
    }
}
