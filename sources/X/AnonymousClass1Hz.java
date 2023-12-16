package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.1Hz  reason: invalid class name */
public class AnonymousClass1Hz extends C105185Tx {
    public final Context A00;
    public final C29171iO A01;
    public final C55682qk A02;
    public final C64393Dh A03;
    public final C56972sr A04;
    public final AnonymousClass2ZI A05;
    public final C29401il A06;
    public final C50862it A07;
    public final C56512s6 A08;
    public final C620633i A09;
    public final C56612sH A0A;
    public final AnonymousClass33p A0B;
    public final C61072zf A0C;
    public final C621133n A0D;
    public final C48972fm A0E;
    public final AnonymousClass3DW A0F;
    public final C72303dV A0G;
    public final AnonymousClass30D A0H;
    public final AnonymousClass1VX A0I;
    public final AnonymousClass4FV A0J;
    public final AnonymousClass4FS A0K;
    public final C183538qC A0L;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x010c A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.content.Intent r16) {
        /*
            r15 = this;
            java.lang.String r0 = "backupMessages"
            X.33M r14 = X.AnonymousClass33M.A01(r0)
            X.1Zl r4 = new X.1Zl
            r4.<init>()
            r11 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r4.A04 = r0
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A05 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BackupMessagesAction/backupMessages; intent="
            r2 = r16
            X.C18260x0.A1R(r1, r0, r2)
            X.33i r0 = r15.A09
            android.os.PowerManager r12 = r0.A0J()
            r9 = 0
            r2 = 600000(0x927c0, double:2.964394E-318)
            r10 = 0
            if (r12 != 0) goto L_0x0045
            java.lang.String r0 = "BackupMessagesAction/backupMessages pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r7 = r9
        L_0x003a:
            android.os.ConditionVariable r8 = new android.os.ConditionVariable
            r8.<init>(r11)
            android.os.ConditionVariable r6 = new android.os.ConditionVariable
            r6.<init>(r11)
            goto L_0x0052
        L_0x0045:
            java.lang.String r0 = "BackupMessagesAction#backupMessages"
            android.os.PowerManager$WakeLock r7 = X.AnonymousClass75K.A00(r12, r0, r11)
            r7.setReferenceCounted(r10)
            r7.acquire(r2)
            goto L_0x003a
        L_0x0052:
            X.2sr r5 = r15.A04     // Catch:{ all -> 0x015b }
            com.whatsapp.Me r0 = X.C56972sr.A00(r5)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "BackupMessagesAction/backupMessages skipping message backup due to not yet registered"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015b }
            r1 = 2
            goto L_0x00ec
        L_0x0062:
            X.3dV r0 = r15.A0G     // Catch:{ all -> 0x015b }
            boolean r0 = X.C72303dV.A00(r0)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0071
            java.lang.String r0 = "BackupMessagesAction/backupMessages skipping message backup due message store is not ready"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015b }
            r1 = 6
            goto L_0x00ec
        L_0x0071:
            X.2s6 r13 = r15.A08     // Catch:{ all -> 0x015b }
            boolean r0 = r13.A06()     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x008e
            java.lang.String r0 = "BackupMessagesAction/backupMessages skipping message backup due to missing external writable media"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015b }
            X.3DW r1 = r15.A0F     // Catch:{ all -> 0x015b }
            X.8qC r0 = r13.A06     // Catch:{ all -> 0x015b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x015b }
            X.2NX r0 = (X.AnonymousClass2NX) r0     // Catch:{ all -> 0x015b }
            boolean r0 = r0.A00     // Catch:{ all -> 0x015b }
            r1.A00 = r0     // Catch:{ all -> 0x015b }
            r1 = 3
            goto L_0x00ec
        L_0x008e:
            X.1il r0 = r15.A06     // Catch:{ all -> 0x015b }
            X.30O r0 = r0.A00     // Catch:{ all -> 0x015b }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "BackupMessagesAction/backupMessages skipping message backup due to not plugged in and low battery"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015b }
            X.3DW r0 = r15.A0F     // Catch:{ all -> 0x015b }
            r0.A00 = r11     // Catch:{ all -> 0x015b }
            r1 = 4
            goto L_0x00ec
        L_0x00a3:
            X.1iO r0 = r15.A01     // Catch:{ all -> 0x015b }
            boolean r0 = r0.A00     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "BackupMessagesAction/backupMessages skipping message backup since app is in foreground"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015b }
            X.3DW r0 = r15.A0F     // Catch:{ all -> 0x015b }
            r0.A00 = r11     // Catch:{ all -> 0x015b }
            r1 = 5
            goto L_0x00ec
        L_0x00b4:
            java.lang.String r0 = "BackupMessagesAction/backupMessages starting message backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x015b }
            X.3DW r1 = r15.A0F     // Catch:{ all -> 0x015b }
            r1.A00 = r10     // Catch:{ all -> 0x015b }
            r8.close()     // Catch:{ all -> 0x015b }
            X.3GV r0 = new X.3GV     // Catch:{ all -> 0x015b }
            r0.<init>(r8, r1, r4)     // Catch:{ all -> 0x015b }
            r1.A02(r0, r11)     // Catch:{ all -> 0x015b }
            if (r12 != 0) goto L_0x00d0
            java.lang.String r0 = "BackupMessagesAction/backupMessages/media-cleanup pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x015b }
            goto L_0x00df
        L_0x00d0:
            java.lang.String r0 = "BackupMessagesAction#backupMessages#mediaCleanup"
            android.os.PowerManager$WakeLock r9 = X.AnonymousClass75K.A00(r12, r0, r11)     // Catch:{ all -> 0x015b }
            r9.setReferenceCounted(r10)     // Catch:{ all -> 0x015b }
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r9.acquire(r0)     // Catch:{ all -> 0x015b }
        L_0x00df:
            X.4FS r4 = r15.A0K     // Catch:{ all -> 0x015b }
            r1 = 21
            X.5rU r0 = new X.5rU     // Catch:{ all -> 0x015b }
            r0.<init>(r15, r1, r9)     // Catch:{ all -> 0x015b }
            r4.BkM(r0)     // Catch:{ all -> 0x015b }
            goto L_0x0107
        L_0x00ec:
            X.33p r0 = r15.A0B     // Catch:{ all -> 0x015b }
            int r0 = X.C06540Yd.A00(r0, r10)     // Catch:{ all -> 0x015b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x015b }
            r4.A01 = r0     // Catch:{ all -> 0x015b }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015b }
            r4.A00 = r0     // Catch:{ all -> 0x015b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x015b }
            r4.A03 = r0     // Catch:{ all -> 0x015b }
            X.4FV r0 = r15.A0J     // Catch:{ all -> 0x015b }
            r0.BhD(r4)     // Catch:{ all -> 0x015b }
        L_0x0107:
            r15.A05()     // Catch:{ all -> 0x015b }
            if (r7 == 0) goto L_0x010f
            r7.release()
        L_0x010f:
            r8.block(r2)
            java.lang.String r0 = "BackupMessagesAction/backupMessages/database-backup done"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.Me r0 = X.C56972sr.A00(r5)
            if (r0 == 0) goto L_0x0152
            X.3dV r0 = r15.A0G
            boolean r0 = X.C72303dV.A00(r0)
            if (r0 == 0) goto L_0x0152
            java.lang.String r0 = "backupMessages/db-migration"
            X.33M r5 = X.AnonymousClass33M.A01(r0)
            r6.close()
            X.4FS r4 = r15.A0K
            X.1VX r3 = r15.A0I
            X.30D r2 = r15.A0H
            X.8qC r0 = r15.A0L
            java.lang.Object r1 = r0.get()
            X.2U4 r1 = (X.AnonymousClass2U4) r1
            X.3cM r0 = new X.3cM
            r0.<init>(r6, r1, r2, r3)
            r4.BkM(r0)
            r0 = 1800000(0x1b7740, double:8.89318E-318)
            r6.block(r0)
            java.lang.String r0 = "BackupMessagesAction/backupMessages/db-migration done"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r5.A07()
        L_0x0152:
            java.lang.String r0 = "BackupMessagesAction/backupMessages done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r14.A07()
            return
        L_0x015b:
            r0 = move-exception
            if (r7 == 0) goto L_0x0161
            r7.release()
        L_0x0161:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Hz.A02(android.content.Intent):void");
    }

    public boolean A04(Intent intent) {
        return C18280x3.A1V(intent, "com.whatsapp.action.BACKUP_MESSAGES");
    }

    public final void A05() {
        if (this.A04.A0Y()) {
            Log.i("BackupMessagesAction/setupBackupMessagesAlarmIfNeeded skipping due to companion mode");
            return;
        }
        Calendar instance = Calendar.getInstance();
        if (instance.get(11) >= 2) {
            instance.add(5, 1);
        }
        C18280x3.A1N(instance, 0);
        instance.set(11, 2);
        long timeInMillis = instance.getTimeInMillis() + this.A05.A00(6225, 6226);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BackupMessagesAction/setupBackupMessagesAlarmIfNeeded; alarmTimeMillis=");
        C18260x0.A0o(new Date(timeInMillis), A0o);
        if (!this.A07.A02(super.A00("com.whatsapp.action.BACKUP_MESSAGES", 134217728), 0, timeInMillis)) {
            Log.w("BackupMessagesAction/setupBackupMessagesAlarmIfNeeded AlarmManager is null");
        }
    }

    public AnonymousClass1Hz(Context context, C29171iO r3, C55682qk r4, C64393Dh r5, C56972sr r6, AnonymousClass2ZI r7, C29401il r8, C50862it r9, C56512s6 r10, C620633i r11, C56612sH r12, AnonymousClass33p r13, C61072zf r14, C621133n r15, C48972fm r16, AnonymousClass3DW r17, C72303dV r18, AnonymousClass30D r19, AnonymousClass1VX r20, AnonymousClass4FV r21, AnonymousClass4FS r22, C183538qC r23) {
        super(context);
        this.A00 = context;
        this.A0A = r12;
        this.A0I = r20;
        this.A07 = r9;
        this.A02 = r4;
        this.A04 = r6;
        this.A0K = r22;
        this.A03 = r5;
        this.A0J = r21;
        this.A0C = r14;
        this.A0E = r16;
        this.A09 = r11;
        this.A05 = r7;
        this.A0D = r15;
        this.A08 = r10;
        this.A0F = r17;
        this.A0G = r18;
        this.A0B = r13;
        this.A06 = r8;
        this.A0H = r19;
        this.A01 = r3;
        this.A0L = r23;
    }

    public void A01() {
        A05();
    }

    public boolean A03() {
        return false;
    }
}
