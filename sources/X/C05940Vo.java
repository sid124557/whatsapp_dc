package X;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: X.0Vo  reason: invalid class name and case insensitive filesystem */
public class C05940Vo {
    public static final String A01 = C06240Wu.A01("SystemJobInfoConverter");
    public final ComponentName A00;

    public static JobInfo.TriggerContentUri A00(AnonymousClass0OP r3) {
        return new JobInfo.TriggerContentUri(r3.A00, r3.A01 ? 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0082, code lost:
        if (r6 >= 24) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (r6 >= 26) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.job.JobInfo A01(X.C06250Wv r12, int r13) {
        /*
            r11 = this;
            X.0XS r8 = r12.A0A
            android.os.PersistableBundle r3 = new android.os.PersistableBundle
            r3.<init>()
            java.lang.String r1 = "EXTRA_WORK_SPEC_ID"
            java.lang.String r0 = r12.A0J
            r3.putString(r1, r0)
            java.lang.String r1 = "EXTRA_WORK_SPEC_GENERATION"
            int r0 = r12.A0I
            r3.putInt(r1, r0)
            java.lang.String r6 = "EXTRA_IS_PERIODIC"
            long r1 = r12.A05
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r3.putBoolean(r6, r0)
            android.content.ComponentName r0 = r11.A00
            android.app.job.JobInfo$Builder r1 = new android.app.job.JobInfo$Builder
            r1.<init>(r13, r0)
            boolean r0 = r8.A05
            android.app.job.JobInfo$Builder r0 = r1.setRequiresCharging(r0)
            boolean r4 = r8.A06
            android.app.job.JobInfo$Builder r0 = r0.setRequiresDeviceIdle(r4)
            android.app.job.JobInfo$Builder r7 = r0.setExtras(r3)
            X.0Fy r5 = r8.A02
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r6 < r0) goto L_0x00b6
            X.0Fy r0 = X.C02380Fy.TEMPORARILY_UNMETERED
            if (r5 != r0) goto L_0x00b6
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder
            r1.<init>()
            r0 = 25
            android.net.NetworkRequest$Builder r0 = r1.addCapability(r0)
            android.net.NetworkRequest r0 = r0.build()
            r7.setRequiredNetwork(r0)
        L_0x0059:
            r9 = 0
            r10 = 1
            if (r4 != 0) goto L_0x006a
            X.0FN r1 = r12.A09
            X.0FN r0 = X.AnonymousClass0FN.LINEAR
            r2 = 1
            if (r1 != r0) goto L_0x0065
            r2 = 0
        L_0x0065:
            long r0 = r12.A02
            r7.setBackoffCriteria(r0, r2)
        L_0x006a:
            long r0 = r12.A02()
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r4 = 0
            long r2 = java.lang.Math.max(r0, r4)
            r0 = 28
            if (r6 > r0) goto L_0x00a6
            r7.setMinimumLatency(r2)
            r0 = 24
            if (r6 < r0) goto L_0x00f3
        L_0x0084:
            java.util.Set r1 = r8.A03
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00f3
            java.util.Iterator r1 = r1.iterator()
        L_0x0092:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r0 = r1.next()
            X.0OP r0 = (X.AnonymousClass0OP) r0
            android.app.job.JobInfo$TriggerContentUri r0 = A00(r0)
            r7.addTriggerContentUri(r0)
            goto L_0x0092
        L_0x00a6:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ae
            r7.setMinimumLatency(r2)
            goto L_0x0084
        L_0x00ae:
            boolean r0 = r12.A0H
            if (r0 != 0) goto L_0x0084
            r7.setImportantWhileForeground(r10)
            goto L_0x0084
        L_0x00b6:
            int r3 = r5.ordinal()
            r2 = 1
            r0 = 0
            r1 = 0
            if (r3 == r0) goto L_0x00ce
            r1 = 2
            if (r3 == r2) goto L_0x00e7
            r0 = 3
            if (r3 == r1) goto L_0x00ce
            r1 = 4
            if (r3 == r0) goto L_0x00d2
            if (r3 != r1) goto L_0x00d8
            r0 = 26
            if (r6 < r0) goto L_0x00d8
        L_0x00ce:
            r7.setRequiredNetworkType(r1)
            goto L_0x0059
        L_0x00d2:
            r0 = 24
            if (r6 < r0) goto L_0x00d8
            r1 = 3
            goto L_0x00ce
        L_0x00d8:
            X.0Wu r3 = X.C06240Wu.A00()
            java.lang.String r2 = A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "API version too low. Cannot convert network type value "
            X.C06240Wu.A02(r3, r5, r0, r2, r1)
        L_0x00e7:
            r1 = 1
            goto L_0x00ce
        L_0x00e9:
            long r0 = r8.A01
            r7.setTriggerContentUpdateDelay(r0)
            long r0 = r8.A00
            r7.setTriggerContentMaxDelay(r0)
        L_0x00f3:
            r7.setPersisted(r9)
            r0 = 26
            if (r6 < r0) goto L_0x0104
            boolean r0 = r8.A04
            r7.setRequiresBatteryNotLow(r0)
            boolean r0 = r8.A07
            r7.setRequiresStorageNotLow(r0)
        L_0x0104:
            int r0 = r12.A01
            boolean r1 = X.AnonymousClass001.A1W(r0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x010f
            r9 = 1
        L_0x010f:
            r0 = 31
            if (r6 < r0) goto L_0x011e
            boolean r0 = r12.A0H
            if (r0 == 0) goto L_0x011e
            if (r1 != 0) goto L_0x011e
            if (r9 != 0) goto L_0x011e
            r7.setExpedited(r10)
        L_0x011e:
            android.app.job.JobInfo r0 = r7.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05940Vo.A01(X.0Wv, int):android.app.job.JobInfo");
    }

    public C05940Vo(Context context) {
        this.A00 = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
