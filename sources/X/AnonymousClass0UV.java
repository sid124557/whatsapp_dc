package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.0UV  reason: invalid class name */
public final class AnonymousClass0UV {
    public Map A00;
    public final Context A01;
    public final C55682qk A02;
    public final C06430Xr A03;
    public final C16400tD A04;
    public final C10240hc A05;
    public final C06260Ww A06;
    public final C04710Qi A07;
    public final AnonymousClass0Y7 A08;
    public final AnonymousClass310 A09;
    public final C56612sH A0A;
    public final AnonymousClass5ZR A0B;
    public final AnonymousClass33p A0C;
    public final C625835r A0D;
    public final C55272q5 A0E;
    public final AnonymousClass1VW A0F;
    public final C25911bH A0G;
    public final C623834u A0H;
    public final String A0I;
    public final String A0J;

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6 A[Catch:{ all -> 0x0172 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0101 A[Catch:{ all -> 0x0172 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x00d1=Splitter:B:60:0x00d1, B:56:0x00c2=Splitter:B:56:0x00c2, B:52:0x00b3=Splitter:B:52:0x00b3, B:40:0x0084=Splitter:B:40:0x0084, B:44:0x0094=Splitter:B:44:0x0094, B:48:0x00a4=Splitter:B:48:0x00a4, B:75:0x0115=Splitter:B:75:0x0115} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:77:0x0121=Splitter:B:77:0x0121, B:83:0x0173=Splitter:B:83:0x0173} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A02(X.AnonymousClass0F1 r13) {
        /*
            r12 = this;
            java.lang.String r11 = "restore>RestoreAction/total-requests-till-restore-messages/"
            X.2q5 r0 = r12.A0E
            boolean r0 = r0.A05()
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "restore>RestoreAction/media restore is pending, end message store download"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r13.A0d(r3)
            return r4
        L_0x0015:
            X.0hc r6 = r12.A05
            boolean r0 = r6.A0z(r3)
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "restore>RestoreAction/restore is already running"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r4
        L_0x0023:
            r5 = 0
            X.33p r2 = r12.A0C     // Catch:{ all -> 0x0177 }
            long r9 = r2.A0L()     // Catch:{ all -> 0x0177 }
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0033
            r2.A0y()     // Catch:{ all -> 0x0177 }
        L_0x0033:
            r13.A0F()     // Catch:{ all -> 0x0177 }
            r0 = 3
            r2.A17(r0)     // Catch:{ all -> 0x0177 }
            r7 = 11
            X.0Y7 r8 = r12.A08     // Catch:{ 0EW -> 0x0113, 0EX -> 0x00e9, 0EY -> 0x00cf, 0EP -> 0x00c0, 0EN -> 0x00b1, 0EV -> 0x00a2, 0ET -> 0x0092, 0EL -> 0x0082, all -> 0x007e }
            X.0Qi r0 = r12.A07     // Catch:{ 0EW -> 0x0113, 0EX -> 0x00e9, 0EY -> 0x00cf, 0EP -> 0x00c0, 0EN -> 0x00b1, 0EV -> 0x00a2, 0ET -> 0x0092, 0EL -> 0x0082, all -> 0x007e }
            boolean r0 = X.C06520Ya.A0C(r0, r8)     // Catch:{ 0EW -> 0x0113, 0EX -> 0x00e9, 0EY -> 0x00cf, 0EP -> 0x00c0, 0EN -> 0x00b1, 0EV -> 0x00a2, 0ET -> 0x0092, 0EL -> 0x0082, all -> 0x007e }
            if (r0 != 0) goto L_0x0057
            X.0Ww r0 = r12.A06     // Catch:{ 0EW -> 0x0113, 0EX -> 0x00e9, 0EY -> 0x00cf, 0EP -> 0x00c0, 0EN -> 0x00b1, 0EV -> 0x00a2, 0ET -> 0x0092, 0EL -> 0x0082, all -> 0x007e }
            r0.A0C(r7)     // Catch:{ 0EW -> 0x0113, 0EX -> 0x00e9, 0EY -> 0x00cf, 0EP -> 0x00c0, 0EN -> 0x00b1, 0EV -> 0x00a2, 0ET -> 0x0092, 0EL -> 0x0082, all -> 0x007e }
            r13.A0d(r5)     // Catch:{ all -> 0x0177 }
            r6.A0z(r5)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r11)
            goto L_0x015f
        L_0x0057:
            r12.A00 = r4     // Catch:{ 0EW -> 0x0113, 0EX -> 0x00e9, 0EY -> 0x00cf, 0EP -> 0x00c0, 0EN -> 0x00b1, 0EV -> 0x00a2, 0ET -> 0x0092, 0EL -> 0x0082, all -> 0x007e }
            boolean r4 = r12.A05(r13)     // Catch:{ 0EW -> 0x0113, 0EX -> 0x00e9, 0EY -> 0x00cf, 0EP -> 0x00c0, 0EN -> 0x00b1, 0EV -> 0x00a2, 0ET -> 0x0092, 0EL -> 0x0082, all -> 0x007e }
            if (r4 != 0) goto L_0x0064
            X.0Ww r1 = r12.A06     // Catch:{ 0EW -> 0x007b, 0EX -> 0x0079, 0EY -> 0x0077, 0EP -> 0x0075, 0EN -> 0x0073, 0EV -> 0x0071, 0ET -> 0x006f, 0EL -> 0x006d }
            r0 = 14
            goto L_0x0068
        L_0x0064:
            X.0Ww r1 = r12.A06     // Catch:{ 0EW -> 0x007b, 0EX -> 0x0079, 0EY -> 0x0077, 0EP -> 0x0075, 0EN -> 0x0073, 0EV -> 0x0071, 0ET -> 0x006f, 0EL -> 0x006d }
            r0 = 10
        L_0x0068:
            r1.A0C(r0)     // Catch:{ 0EW -> 0x007b, 0EX -> 0x0079, 0EY -> 0x0077, 0EP -> 0x0075, 0EN -> 0x0073, 0EV -> 0x0071, 0ET -> 0x006f, 0EL -> 0x006d }
            goto L_0x0121
        L_0x006d:
            r7 = move-exception
            goto L_0x0084
        L_0x006f:
            r7 = move-exception
            goto L_0x0094
        L_0x0071:
            r7 = move-exception
            goto L_0x00a4
        L_0x0073:
            r7 = move-exception
            goto L_0x00b3
        L_0x0075:
            r7 = move-exception
            goto L_0x00c2
        L_0x0077:
            r8 = move-exception
            goto L_0x00d1
        L_0x0079:
            r1 = move-exception
            goto L_0x00eb
        L_0x007b:
            r7 = move-exception
            goto L_0x0115
        L_0x007e:
            r0 = move-exception
            r4 = 0
            goto L_0x0173
        L_0x0082:
            r7 = move-exception
            r4 = 0
        L_0x0084:
            X.0Ww r1 = r12.A06     // Catch:{ all -> 0x0172 }
            r0 = 25
            r1.A0C(r0)     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "restore>RestoreAction/failure: google drive service is disabled"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x0172 }
            goto L_0x0121
        L_0x0092:
            r7 = move-exception
            r4 = 0
        L_0x0094:
            X.0Ww r1 = r12.A06     // Catch:{ all -> 0x0172 }
            r0 = 24
            r1.A0C(r0)     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "restore>RestoreAction/failure: backup generated by a newer version of the app"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x0172 }
            goto L_0x0121
        L_0x00a2:
            r7 = move-exception
            r4 = 0
        L_0x00a4:
            X.0Ww r1 = r12.A06     // Catch:{ all -> 0x0172 }
            r0 = 23
            r1.A0C(r0)     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "restore>RestoreAction/failure: access denied to external storage"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x0172 }
            goto L_0x0121
        L_0x00b1:
            r7 = move-exception
            r4 = 0
        L_0x00b3:
            X.0Ww r1 = r12.A06     // Catch:{ all -> 0x0172 }
            r0 = 19
            r1.A0C(r0)     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "restore>RestoreAction/failure: google servers' are not working"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x0172 }
            goto L_0x0121
        L_0x00c0:
            r7 = move-exception
            r4 = 0
        L_0x00c2:
            X.0Ww r1 = r12.A06     // Catch:{ all -> 0x0172 }
            r0 = 15
            r1.A0C(r0)     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "restore>RestoreAction/failure: local storage is full"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x0172 }
            goto L_0x0121
        L_0x00cf:
            r8 = move-exception
            r4 = 0
        L_0x00d1:
            X.0Ww r1 = r12.A06     // Catch:{ all -> 0x0172 }
            r0 = 17
            r1.A0C(r0)     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "restore>RestoreAction/failure: backup file not found"
            com.whatsapp.util.Log.e(r0, r8)     // Catch:{ all -> 0x0172 }
            X.2qk r7 = r12.A02     // Catch:{ all -> 0x0172 }
            java.lang.String r1 = "/google drive msgstore backup file not found "
            java.lang.String r0 = r8.getMessage()     // Catch:{ all -> 0x0172 }
            r7.A0A(r1, r3, r0)     // Catch:{ all -> 0x0172 }
            goto L_0x0121
        L_0x00e9:
            r1 = move-exception
            r4 = 0
        L_0x00eb:
            java.lang.String r0 = "restore>RestoreAction/failure: auth failed because accessing google account permission is missing"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0172 }
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ all -> 0x0172 }
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = "restore>RestoreAction/failure: auth-failed/unknown-cause"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0172 }
            X.0Ww r0 = r12.A06     // Catch:{ all -> 0x0172 }
            r0.A0C(r7)     // Catch:{ all -> 0x0172 }
            goto L_0x0121
        L_0x0101:
            boolean r0 = r0 instanceof X.C126936Px     // Catch:{ all -> 0x0172 }
            if (r0 == 0) goto L_0x010d
            X.0Ww r1 = r12.A06     // Catch:{ all -> 0x0172 }
            r0 = 21
            r1.A0C(r0)     // Catch:{ all -> 0x0172 }
            goto L_0x0121
        L_0x010d:
            X.0Ww r0 = r12.A06     // Catch:{ all -> 0x0172 }
            r0.A0C(r7)     // Catch:{ all -> 0x0172 }
            goto L_0x0121
        L_0x0113:
            r7 = move-exception
            r4 = 0
        L_0x0115:
            X.0Ww r1 = r12.A06     // Catch:{ all -> 0x0172 }
            r0 = 12
            r1.A0C(r0)     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "restore>RestoreAction/failure: account not present on device anymore"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x0172 }
        L_0x0121:
            r13.A0d(r4)     // Catch:{ all -> 0x0177 }
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0177 }
            java.lang.String r8 = "total wall time for message restore: %.1f seconds."
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0177 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0177 }
            long r2 = r2.A0L()     // Catch:{ all -> 0x0177 }
            long r0 = r0 - r2
            double r2 = (double) r0     // Catch:{ all -> 0x0177 }
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x0177 }
            r7[r5] = r0     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = java.lang.String.format(r9, r8, r7)     // Catch:{ all -> 0x0177 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0177 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0177 }
            java.lang.String r0 = "restore>RestoreAction/finished with success status: "
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r4)     // Catch:{ all -> 0x0177 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0177 }
            java.util.Map r4 = r12.A00     // Catch:{ all -> 0x0177 }
            r6.A0z(r5)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r11)
            X.0Y7 r8 = r12.A08
        L_0x015f:
            X.0nk r0 = r8.A08
            int r1 = r0.A00
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A0J
            int r0 = r0.get()
            int r1 = r1 + r0
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r4
        L_0x0172:
            r0 = move-exception
        L_0x0173:
            r13.A0d(r4)     // Catch:{ all -> 0x0177 }
            throw r0     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r4 = move-exception
            r6.A0z(r5)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0l(r11)
            X.0Y7 r2 = r12.A08
            X.0nk r0 = r2.A08
            int r1 = r0.A00
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0J
            int r0 = r0.get()
            int r1 = r1 + r0
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0UV.A02(X.0F1):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C05580Ub r9, java.util.Map r10) {
        /*
            r8 = this;
            X.33p r6 = r8.A0C
            java.lang.String r5 = r8.A0I
            r6.A1S(r5)
            long r0 = r9.A05
            r6.A1c(r5, r0)
            long r0 = r9.A04
            r6.A1d(r5, r0)
            java.lang.String r3 = "mediaSize"
            r1 = -1
            org.json.JSONObject r7 = r9.A0C
            if (r7 == 0) goto L_0x00e1
            boolean r0 = r7.has(r3)
            if (r0 == 0) goto L_0x00d5
            long r3 = r7.optLong(r3, r1)
        L_0x0023:
            r6.A1b(r5, r3)
            java.lang.String r3 = "videoSize"
            if (r7 == 0) goto L_0x00d1
            boolean r0 = r7.has(r3)
            if (r0 == 0) goto L_0x00c5
            long r0 = r7.optLong(r3, r1)
        L_0x0034:
            r6.A1e(r5, r0)
            r1 = 0
            if (r7 != 0) goto L_0x00bd
            r0 = 0
        L_0x003b:
            r6.A1l(r5, r0)
            java.lang.String r1 = "backupFrequency"
            r2 = -1
            if (r7 == 0) goto L_0x00bb
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x00b0
            int r0 = r7.optInt(r1, r2)
        L_0x004d:
            if (r0 < 0) goto L_0x00bb
            boolean r3 = r6.A2L(r0)
        L_0x0053:
            java.lang.String r1 = "backupNetworkSettings"
            if (r7 == 0) goto L_0x006a
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x00a5
            int r1 = r7.optInt(r1, r2)
        L_0x0061:
            if (r1 < 0) goto L_0x006a
            X.0hc r0 = r8.A05
            boolean r0 = r0.A0v(r1)
            r3 = r3 & r0
        L_0x006a:
            java.lang.String r2 = "includeVideosInBackup"
            r1 = 1
            if (r7 == 0) goto L_0x00a3
            boolean r0 = r7.has(r2)
            if (r0 == 0) goto L_0x0098
            boolean r0 = r7.optBoolean(r2, r1)
        L_0x0079:
            r6.A1r(r0)
            org.json.JSONObject r0 = r9.A04()
            if (r0 == 0) goto L_0x0092
            r6.A1m(r0)
        L_0x0085:
            boolean r0 = r8.A08(r10)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x0091
            java.lang.String r0 = "restore>RestoreAction/restore-user-settings/unable to save user settings from google drive to shared prefs"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0091:
            return
        L_0x0092:
            java.lang.String r0 = "restore>RestoreAction/restore-user-settings/local settings are empty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0085
        L_0x0098:
            org.json.JSONObject r0 = r9.A05()
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r0.optBoolean(r2, r1)
            goto L_0x0079
        L_0x00a3:
            r0 = 1
            goto L_0x0079
        L_0x00a5:
            org.json.JSONObject r0 = r9.A05()
            if (r0 == 0) goto L_0x006a
            int r1 = r0.optInt(r1, r2)
            goto L_0x0061
        L_0x00b0:
            org.json.JSONObject r0 = r9.A05()
            if (r0 == 0) goto L_0x00bb
            int r0 = r0.optInt(r1, r2)
            goto L_0x004d
        L_0x00bb:
            r3 = 1
            goto L_0x0053
        L_0x00bd:
            java.lang.String r0 = "encryptedBackupEnabled"
            boolean r0 = r7.optBoolean(r0, r1)
            goto L_0x003b
        L_0x00c5:
            org.json.JSONObject r0 = r9.A05()
            if (r0 == 0) goto L_0x00d1
            long r0 = r0.optLong(r3, r1)
            goto L_0x0034
        L_0x00d1:
            r0 = -1
            goto L_0x0034
        L_0x00d5:
            org.json.JSONObject r0 = r9.A05()
            if (r0 == 0) goto L_0x00e1
            long r3 = r0.optLong(r3, r1)
            goto L_0x0023
        L_0x00e1:
            r3 = -1
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0UV.A03(X.0Ub, java.util.Map):void");
    }

    public boolean A05(AnonymousClass0F1 r8) {
        String str;
        Log.i("restore>RestoreAction/restore-messages/stage: get backup from google");
        C05580Ub A012 = C06520Ya.A01(this.A07, this.A08, this.A0J, "gdrive-service/fetch-account-data-v2");
        if (A012 == null) {
            str = "restore>RestoreAction/restore-messages/backup doesn't exist(null), aborting restore.";
        } else if (A012.A01() > 1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("/restore-messages/backup version is newer than the app can support. Backup version: ");
            A0o.append(A012.A01());
            Log.e(AnonymousClass000.A0Y(", supported version: ", A0o, 1));
            throw new AnonymousClass0ET();
        } else if (!this.A03.A0D(A012.A03())) {
            this.A02.A0A("gdrive/restore/message backup is expired", false, (String) null);
            str = "restore>RestoreAction/restore-messages/backup is expired(not supported anymore).";
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("/restore-messages/version of app at time of backup was: ");
            JSONObject jSONObject = A012.A0C;
            String str2 = "unknown";
            if (jSONObject != null) {
                str2 = jSONObject.optString("versionOfAppWhenBackup", str2);
            }
            Log.i(AnonymousClass000.A0X(str2, A0o2));
            AnonymousClass33p r1 = this.A0C;
            if (r1.A0A() == 1) {
                str = "restore>RestoreAction/restore-messages/cannot start restore, backup in progress.";
            } else {
                Log.i("restore>RestoreAction/restore-messages/stage: load files from google");
                Map A052 = C06520Ya.A05(this.A05.A0L, A012);
                this.A00 = A052;
                if (A052 != null) {
                    if (r1.A25()) {
                        boolean A002 = AnonymousClass0S8.A00(this.A0F);
                        Map map = this.A00;
                        if (A002) {
                            return A06(r8, A012, map);
                        }
                        return A07(r8, A012, map);
                    }
                    Log.i("restore>RestoreAction/restore-messages/skipping google drive db download, we are using local");
                    return true;
                }
                return false;
            }
        }
        Log.e(str);
        return false;
    }

    public final boolean A07(AnonymousClass0F1 r12, C05580Ub r13, Map map) {
        String str;
        String str2;
        this.A0G.A09 = 1;
        C625835r r5 = this.A0D;
        File[] A0c = r5.A0c();
        int length = A0c.length;
        AnonymousClass0UI r4 = null;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            File file = A0c[i];
            String A062 = AnonymousClass0YV.A06(this.A01, this.A09, file);
            if (A062 != null) {
                r4 = (AnonymousClass0UI) map.get(A062);
                if (r4 != null) {
                    Log.i(AnonymousClass000.A0P(r4, "restore>RestoreAction/restore-messages/found backup file: ", AnonymousClass001.A0o()));
                    break;
                }
                i++;
            } else {
                throw AnonymousClass001.A0e("/restore-messages/upload title for database is null");
            }
        }
        C04710Qi r3 = this.A07;
        if (!r3.A06()) {
            return false;
        }
        Log.i("restore>RestoreAction/restore-messages/stage: restore user settings");
        A03(r13, map);
        if (r4 != null) {
            C55682qk r1 = this.A02;
            AnonymousClass310 r9 = this.A09;
            String str3 = r4.A06;
            String A042 = AnonymousClass0YV.A04(this.A01, r1, r9, str3);
            if (TextUtils.isEmpty(A042)) {
                Log.e(AnonymousClass000.A0V("restore>RestoreAction/restore-messages/no local path for message store backup ", str3, AnonymousClass001.A0o()));
                return false;
            }
            File A0B2 = AnonymousClass002.A0B(A042);
            if (A0B2.exists() && A0B2.length() > 0) {
                AnonymousClass0UF r0 = r4.A02;
                if (r0 != null) {
                    str2 = r0.A03;
                } else {
                    str2 = r4.A03;
                }
                if (str2.equals(AnonymousClass0YV.A07(r9, this.A0B, A0B2))) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("restore>RestoreAction/restore-messages/file ");
                    A0o.append(A0B2);
                    Log.i(AnonymousClass000.A0X(" is same as remote file, no need to download", A0o));
                    return true;
                }
                Log.i("restore>RestoreAction/restore-messages/rotate-current-backup-file-to-preserve-it");
                C06550Ye.A0L(A0B2);
            }
            Boolean bool = (Boolean) AnonymousClass0X8.A01(new AnonymousClass0Dz(r12, r4, this, A0B2), r3, "/restore-messages/download and save message store");
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("restore>RestoreAction/restore-messages/stage: restoring messages finished with ");
            if (bool == null || !bool.booleanValue()) {
                str = "failure";
            } else {
                str = "success";
            }
            Log.i(AnonymousClass000.A0X(str, A0o2));
            if (bool == null || !bool.booleanValue()) {
                return false;
            }
            return true;
        } else if (A04()) {
            throw new AnonymousClass0ET();
        } else {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("restore>RestoreAction/restore-messages/weird situation, no message backup file found for paths [");
            A0o3.append(TextUtils.join(", ", r5.A0c()));
            A0o3.append("] in backup for \"");
            A0o3.append(this.A0J);
            A0o3.append("\" (while looking in gdrive_file_map (size: ");
            C626936e.A06(map);
            A0o3.append(map.size());
            Log.e(AnonymousClass000.A0e(A0o3));
            StringBuilder A0o4 = AnonymousClass001.A0o();
            A0o4.append("no message backup file found for paths [");
            throw new AnonymousClass0EY(AnonymousClass000.A0W(TextUtils.join(", ", r5.A0c()), A0o4));
        }
    }

    public static final void A00(List list) {
        int A052 = AnonymousClass22O.A00().A05();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A012 = ((AnonymousClass0UI) it.next()).A01();
            if (C06550Ye.A01(A012, "msgstore.db") > A052) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("restore>RestoreAction/contains-newer-backup/true ");
                A0o.append(A012);
                Log.e(AnonymousClass000.A0Y(" is newer than the supported", A0o, A052));
                throw new AnonymousClass0ET();
            }
        }
    }

    public List A01(Map map) {
        String A042;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass310 r6 = this.A09;
        File A022 = r6.A02();
        Context context = this.A01;
        String A062 = AnonymousClass0YV.A06(context, r6, A022);
        if (A062 != null) {
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (((String) A0w.getKey()).startsWith(A062) && (A042 = AnonymousClass0YV.A04(context, this.A02, r6, (String) A0w.getKey())) != null) {
                    A0s.add(AnonymousClass002.A0B(A042));
                }
            }
        }
        A0s.addAll(AnonymousClass0YV.A0D(context));
        return A0s;
    }

    public final boolean A04() {
        int A052 = AnonymousClass22O.A00().A05();
        Map map = this.A00;
        C626936e.A06(map);
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            String A042 = AnonymousClass0YV.A04(this.A01, this.A02, this.A09, A0m);
            if (A042 != null && C06550Ye.A01(A042, "msgstore.db") > A052) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("restore>RestoreAction/contains-newer-backup/true ");
                A0o.append(A0m);
                Log.i(AnonymousClass000.A0Y(" is newer than ", A0o, A052));
                return true;
            }
        }
        return false;
    }

    public boolean A06(AnonymousClass0F1 r11, C05580Ub r12, Map map) {
        String str;
        long j;
        List<AnonymousClass0UI> A042 = C06520Ya.A04(map);
        int size = A042.size();
        boolean z = true;
        C25911bH r5 = this.A0G;
        if (size > 1) {
            r5.A09 = 2;
            r5.A0E = Long.valueOf(((long) A042.size()) - 1);
        } else {
            r5.A09 = 1;
        }
        C04710Qi r6 = this.A07;
        if (!r6.A06()) {
            return false;
        }
        Log.i("restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/stage: restore user settings");
        A03(r12, map);
        A00(A042);
        if (!A042.isEmpty()) {
            this.A0D.A0Y(false);
            long j2 = 0;
            for (AnonymousClass0UI r1 : A042) {
                AnonymousClass0UF r0 = r1.A02;
                if (r0 != null) {
                    j = r0.A00;
                } else {
                    j = r1.A00;
                }
                j2 += j;
            }
            C10200hY r7 = new C10200hY(r11, this, j2);
            for (AnonymousClass0UI r8 : A042) {
                C55682qk r4 = this.A02;
                AnonymousClass310 r13 = this.A09;
                String str2 = r8.A06;
                String A043 = AnonymousClass0YV.A04(this.A01, r4, r13, str2);
                if (TextUtils.isEmpty(A043)) {
                    Log.e(AnonymousClass000.A0V("restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/no local path for message store backup ", str2, AnonymousClass001.A0o()));
                    return false;
                }
                File A0B2 = AnonymousClass002.A0B(A043);
                try {
                    z &= C06520Ya.A0A(r7, r6, this.A08, r8, A0B2);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    AnonymousClass000.A10(A0B2, "restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/restore file succeeded ", A0o);
                    Log.i(AnonymousClass000.A0N(A0B2, " size: ", A0o));
                } catch (AnonymousClass0EY e) {
                    Log.e(AnonymousClass000.A0V("restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/file-not-found ", A043, AnonymousClass001.A0o()), e);
                    throw e;
                }
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/stage: restoring message store backup files finished with ");
            if (z) {
                str = "success";
            } else {
                str = "failure";
            }
            Log.i(AnonymousClass000.A0X(str, A0o2));
            return z;
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/weird situation, no message backup file found for \"");
        A0o3.append(this.A0J);
        A0o3.append("\" (while remote file list size is: ");
        C626936e.A06(map);
        A0o3.append(map.size());
        Log.e(AnonymousClass000.A0e(A0o3));
        throw new AnonymousClass0EY("no message backup file found in remote file list");
    }

    public boolean A08(Map map) {
        String str;
        String str2;
        boolean z = true;
        for (File file : A01(map)) {
            AnonymousClass310 r2 = this.A09;
            String A062 = AnonymousClass0YV.A06(this.A01, r2, file);
            if (A062 == null) {
                Log.i("restore>RestoreAction/restore-backups-dir/skipping/null-title");
                file.getAbsolutePath();
            } else {
                AnonymousClass0UI r3 = (AnonymousClass0UI) map.get(A062);
                if (r3 == null) {
                    str2 = "restore>RestoreAction/restore-backups-dir/skipping/google-drive-file-not-found";
                } else {
                    AnonymousClass0UF r0 = r3.A02;
                    if (r0 != null) {
                        str = r0.A03;
                    } else {
                        str = r3.A03;
                    }
                    if (str.equals(AnonymousClass0YV.A07(r2, this.A0B, file))) {
                        str2 = "restore>RestoreAction/restore-backups-dir/skipping/already-downloaded";
                    } else {
                        try {
                            z &= C06520Ya.A0A(this.A04, this.A07, this.A08, r3, file);
                            StringBuilder A0o = AnonymousClass001.A0o();
                            AnonymousClass000.A10(file, "restore>RestoreAction/restore-backups-dir/success ", A0o);
                            Log.i(AnonymousClass000.A0N(file, " size: ", A0o));
                        } catch (AnonymousClass0EY e) {
                            Log.e("restore>RestoreAction/restore-backups-dir/file-not-found", e);
                        }
                    }
                }
                Log.i(str2);
            }
        }
        this.A0H.A0C();
        return z;
    }

    public AnonymousClass0UV(Context context, C55682qk r3, C06430Xr r4, C16400tD r5, C10240hc r6, C06260Ww r7, C04710Qi r8, AnonymousClass0Y7 r9, AnonymousClass310 r10, C56612sH r11, AnonymousClass5ZR r12, AnonymousClass33p r13, C625835r r14, C55272q5 r15, AnonymousClass1VW r16, C25911bH r17, C623834u r18, String str) {
        this.A0J = str;
        this.A01 = context;
        this.A0A = r11;
        this.A02 = r3;
        this.A09 = r10;
        this.A0G = r17;
        this.A07 = r8;
        this.A0F = r16;
        this.A08 = r9;
        this.A0H = r18;
        this.A0D = r14;
        this.A03 = r4;
        this.A06 = r7;
        this.A0B = r12;
        this.A0C = r13;
        this.A04 = r5;
        this.A0E = r15;
        this.A05 = r6;
        this.A0I = r9.A0G;
    }
}
