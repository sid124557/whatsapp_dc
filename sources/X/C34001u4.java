package X;

import android.content.Context;
import java.util.Iterator;

/* renamed from: X.1u4  reason: invalid class name and case insensitive filesystem */
public class C34001u4 extends AnonymousClass5ZM {
    public final int A00;
    public final long A01;
    public final Context A02;
    public final AnonymousClass0XM A03;
    public final AnonymousClass5PA A04;
    public final C44382Vv A05;
    public final C620633i A06;
    public final C56612sH A07;
    public final AnonymousClass3DW A08;
    public final C28671ha A09;
    public final C625835r A0A;
    public final C48772fR A0B;
    public final C183538qC A0C;

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r14) {
        /*
            r13 = this;
            X.3DW r5 = r13.A08
            int r4 = r13.A00
            X.1VX r8 = r5.A0K
            boolean r0 = X.AnonymousClass0S8.A01(r8)
            r3 = 1
            if (r0 == 0) goto L_0x00eb
            if (r4 == 0) goto L_0x00eb
            X.0WN r6 = r5.A06
            boolean r0 = r6.A0G()
            if (r0 == 0) goto L_0x003d
            X.22O r7 = X.AnonymousClass22O.CRYPT15
        L_0x0019:
            X.35r r11 = r5.A0J
            java.util.List r2 = r11.A0S(r3)
            boolean r1 = r2.isEmpty()
            r0 = 0
            if (r1 != 0) goto L_0x00eb
            java.lang.Object r2 = r2.get(r0)
            java.io.File r2 = (java.io.File) r2
            java.lang.String r0 = r2.getName()
            X.22O r0 = X.C57202tG.A00(r0)
            if (r0 == 0) goto L_0x00eb
            int r0 = r0.version
            int r1 = r7.version
            if (r0 != r1) goto L_0x00eb
            goto L_0x0040
        L_0x003d:
            X.22O r7 = X.AnonymousClass22O.CRYPT14
            goto L_0x0019
        L_0x0040:
            X.22O r0 = X.AnonymousClass22O.CRYPT14     // Catch:{ SecurityException -> 0x00eb }
            int r0 = r0.version     // Catch:{ SecurityException -> 0x00eb }
            if (r1 > r0) goto L_0x005f
            X.2oU r0 = r5.A0F     // Catch:{ SecurityException -> 0x00eb }
            java.io.File r1 = X.C54292oU.A03(r0)     // Catch:{ SecurityException -> 0x00eb }
            java.lang.String r0 = "key"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ SecurityException -> 0x00eb }
            long r6 = r0.lastModified()     // Catch:{ SecurityException -> 0x00eb }
        L_0x0056:
            long r1 = r2.lastModified()     // Catch:{ SecurityException -> 0x00eb }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x00eb
            goto L_0x006a
        L_0x005f:
            X.0Qy r0 = r6.A01     // Catch:{ SecurityException -> 0x00eb }
            java.io.File r0 = r0.A04()     // Catch:{ SecurityException -> 0x00eb }
            long r6 = r0.lastModified()     // Catch:{ SecurityException -> 0x00eb }
            goto L_0x0056
        L_0x006a:
            r0 = 3190(0xc76, float:4.47E-42)
            X.2vE r2 = X.C58422vE.A02
            int r0 = r8.A0O(r2, r0)
            long r9 = X.AnonymousClass0x7.A0D(r0)
            r0 = 5005(0x138d, float:7.013E-42)
            long r6 = X.C56952sp.A06(r8, r0)
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r6 = r6 * r0
            long r9 = r9 + r6
            java.util.List r1 = r11.A0S(r3)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00eb
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = X.C18290x4.A0k(r1)
            java.io.File r0 = (java.io.File) r0
            long r0 = r0.lastModified()
            long r6 = r6 - r0
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00eb
            r0 = 3189(0xc75, float:4.469E-42)
            int r8 = r8.A0O(r2, r0)
            X.34k r0 = r5.A07
            X.3dV r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f3 }
            X.4GK r9 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f3 }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00e1 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = "SELECT count(*) as count FROM backup_changes"
            java.lang.String r0 = "BackupChangesStore/COUNT_MODIFICATIONS"
            android.database.Cursor r2 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x00e1 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00cc
            java.lang.String r0 = "count"
            long r6 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x00d5 }
            r2.close()     // Catch:{ all -> 0x00e1 }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f3 }
            goto L_0x00fa
        L_0x00cc:
            r2.close()     // Catch:{ all -> 0x00e1 }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f3 }
            r6 = -1
            goto L_0x00fa
        L_0x00d5:
            r1 = move-exception
            if (r2 == 0) goto L_0x00e0
            r2.close()     // Catch:{ all -> 0x00dc }
            goto L_0x00e0
        L_0x00dc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00e1 }
        L_0x00e0:
            throw r1     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00e6 }
            goto L_0x00ea
        L_0x00e6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f3 }
        L_0x00ea:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f3 }
        L_0x00eb:
            r5.A0R = r3
            goto L_0x00f1
        L_0x00ee:
            r0 = 3
            r5.A0R = r0
        L_0x00f1:
            r8 = 1
            goto L_0x010b
        L_0x00f3:
            java.lang.String r0 = "BackupChangesStore/corrupt db"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6 = -1
        L_0x00fa:
            long r1 = (long) r8
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00ee
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00ee
            r8 = 0
            if (r0 == 0) goto L_0x010b
            r8 = 2
            r5.A0R = r8
        L_0x010b:
            if (r8 != 0) goto L_0x0112
            java.lang.Integer r0 = X.C18290x4.A0c()
            return r0
        L_0x0112:
            X.33i r0 = r13.A06
            android.os.PowerManager r1 = r0.A0J()
            r6 = 1
            if (r1 != 0) goto L_0x0128
            java.lang.String r0 = "BackupAsyncTask/backup PowerManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r7 = 0
        L_0x0121:
            java.lang.String r12 = "BackupAsyncTask/backup/local/wl/release"
            java.lang.String r5 = "BackupAsyncTask/backup/local/wl/releasing "
            if (r7 == 0) goto L_0x0132
            goto L_0x012f
        L_0x0128:
            java.lang.String r0 = "backupdb"
            android.os.PowerManager$WakeLock r7 = X.AnonymousClass75K.A00(r1, r0, r3)
            goto L_0x0121
        L_0x012f:
            r7.acquire()     // Catch:{ Exception -> 0x01a8 }
        L_0x0132:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r0 = "BackupAsyncTask/backup/local/wl/acquire "
            X.C18260x0.A1R(r1, r0, r7)     // Catch:{ Exception -> 0x01a8 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01a8 }
            android.content.Context r2 = r13.A02     // Catch:{ Exception -> 0x01a8 }
            X.0XM r1 = r13.A03     // Catch:{ Exception -> 0x01a8 }
            X.2fR r0 = r13.A0B     // Catch:{ Exception -> 0x01a8 }
            X.C06550Ye.A0D(r2, r1, r0)     // Catch:{ Exception -> 0x01a8 }
            X.35r r2 = r13.A0A     // Catch:{ Exception -> 0x01a8 }
            r1 = 0
            X.27L r0 = new X.27L     // Catch:{ Exception -> 0x01a8 }
            r0.<init>(r13, r1)     // Catch:{ Exception -> 0x01a8 }
            int r6 = r2.A0C(r0, r8, r4)     // Catch:{ Exception -> 0x01a8 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r0 = "BackupAsyncTask/backup/local/msgstore/result/"
            X.C18260x0.A0y(r0, r1, r6)     // Catch:{ Exception -> 0x01a8 }
            X.8qC r0 = r13.A0C     // Catch:{ Exception -> 0x01a8 }
            java.util.Iterator r4 = X.AnonymousClass0x2.A0j(r0)     // Catch:{ Exception -> 0x01a8 }
        L_0x0163:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x01a8 }
            if (r0 == 0) goto L_0x0190
            java.lang.Object r3 = r4.next()     // Catch:{ Exception -> 0x01a8 }
            X.2sX r3 = (X.C56772sX) r3     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r2 = r3.A08()     // Catch:{ Exception -> 0x01a8 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r0 = "BackupAsyncTask/backup/local/"
            X.C18260x0.A0s(r0, r2, r1)     // Catch:{ Exception -> 0x01a8 }
            X.2zK r0 = r3.A05()     // Catch:{ Exception -> 0x01a8 }
            if (r0 == 0) goto L_0x0163
            boolean r0 = r0.A04     // Catch:{ Exception -> 0x01a8 }
            if (r0 != 0) goto L_0x0163
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01a8 }
            java.lang.String r0 = "BackupAsyncTask/backup/local/failed-to-generate-backup "
            X.C18260x0.A0r(r0, r2, r1)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x0163
        L_0x0190:
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01a8 }
            long r3 = r13.A01     // Catch:{ Exception -> 0x01a8 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ae
            long r8 = r8 - r10
            long r3 = r3 - r8
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ae
            if (r6 != 0) goto L_0x01ae
            android.os.SystemClock.sleep(r3)     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01ae
        L_0x01a8:
            r1 = move-exception
            java.lang.String r0 = "BackupAsyncTask/backup/local/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01cb }
        L_0x01ae:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A1R(r0, r5, r7)
            if (r7 == 0) goto L_0x01bd
            r7.release()
            com.whatsapp.util.Log.i((java.lang.String) r12)
        L_0x01bd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BackupAsyncTask/backup/local/result = "
            X.C18260x0.A0y(r0, r1, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            return r0
        L_0x01cb:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A1R(r0, r5, r7)
            if (r7 == 0) goto L_0x01db
            r7.release()
            com.whatsapp.util.Log.i((java.lang.String) r12)
        L_0x01db:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34001u4.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A0A() {
        Iterator A032 = C61102zi.A03(this.A09);
        while (A032.hasNext()) {
            ((AnonymousClass4EB) A032.next()).BNX();
        }
        this.A04.A00(1, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r1.isFinishing() == false) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f A[LOOP:0: B:8:0x0029->B:10:0x002f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BackupAsyncTask/backup/done "
            X.C18260x0.A1R(r1, r0, r5)
            X.2Vv r0 = r4.A05
            X.2fl r1 = r0.A00()
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x003b
            X.4FC r1 = r1.A00()
        L_0x0019:
            r1.BQh()
        L_0x001c:
            X.1ha r0 = r4.A09
            r3 = 1
            if (r5 == 0) goto L_0x0039
            int r2 = r5.intValue()
        L_0x0025:
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0029:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r1.next()
            X.4EB r0 = (X.AnonymousClass4EB) r0
            r0.BMF(r2)
            goto L_0x0029
        L_0x0039:
            r2 = 1
            goto L_0x0025
        L_0x003b:
            X.4FC r1 = r1.A00
            if (r1 == 0) goto L_0x001c
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x001c
            goto L_0x0019
        L_0x0046:
            X.5PA r1 = r4.A04
            r0 = 0
            r1.A00(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34001u4.A0C(java.lang.Object):void");
    }

    public /* bridge */ /* synthetic */ void A0E(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        if (numArr != null) {
            C28671ha r1 = this.A09;
            int intValue = numArr[0].intValue();
            Iterator A032 = C61102zi.A03(r1);
            while (A032.hasNext()) {
                ((AnonymousClass4EB) A032.next()).BZ2(intValue);
            }
        }
    }

    public C34001u4(Context context, AnonymousClass0XM r2, AnonymousClass5PA r3, C44382Vv r4, C620633i r5, C56612sH r6, AnonymousClass3DW r7, C28671ha r8, C625835r r9, C48772fR r10, C183538qC r11, int i, long j) {
        this.A08 = r7;
        this.A00 = i;
        this.A07 = r6;
        this.A02 = context;
        this.A01 = j;
        this.A0C = r11;
        this.A04 = r3;
        this.A06 = r5;
        this.A03 = r2;
        this.A0A = r9;
        this.A09 = r8;
        this.A0B = r10;
        this.A05 = r4;
    }
}
