package androidx.work.impl.background.systemjob;

import X.AnonymousClass001;
import X.AnonymousClass0PL;
import X.AnonymousClass0QD;
import X.C03440Kd;
import X.C06240Wu;
import X.C06310Xb;
import X.C09020fW;
import X.C16140sX;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.util.Log;
import java.util.Map;

public class SystemJobService extends JobService implements C16140sX {
    public static final String A03 = C06240Wu.A01("SystemJobService");
    public C06310Xb A00;
    public final AnonymousClass0QD A01 = new AnonymousClass0QD();
    public final Map A02 = AnonymousClass001.A0t();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r2 < 24) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r4 = new X.C03790Lo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (X.AnonymousClass0S2.A00(r9) == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        r4.A02 = java.util.Arrays.asList(X.AnonymousClass0S2.A00(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        if (X.AnonymousClass0S2.A01(r9) == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        r4.A01 = java.util.Arrays.asList(X.AnonymousClass0S2.A01(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r2 < 28) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        r4.A00 = X.C03120Ix.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        r3 = r8.A00;
        r3.A06.B2t(new X.C12720m1(r4, r8.A01.A01(r1), r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        r4 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            X.0Xb r0 = r8.A00
            r5 = 1
            r7 = 0
            if (r0 != 0) goto L_0x0015
            X.0Wu r2 = X.C06240Wu.A00()
            java.lang.String r1 = A03
            java.lang.String r0 = "WorkManager is not initialized; requesting retry."
            r2.A04(r1, r0)
            r8.jobFinished(r9, r5)
            return r7
        L_0x0015:
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r1 = r9.getExtras()     // Catch:{ NullPointerException -> 0x00ac }
            if (r1 == 0) goto L_0x00ac
            boolean r0 = r1.containsKey(r2)     // Catch:{ NullPointerException -> 0x00ac }
            if (r0 == 0) goto L_0x00ac
            java.lang.String r2 = r1.getString(r2)     // Catch:{ NullPointerException -> 0x00ac }
            java.lang.String r0 = "EXTRA_WORK_SPEC_GENERATION"
            int r0 = r1.getInt(r0)     // Catch:{ NullPointerException -> 0x00ac }
            X.0PL r1 = new X.0PL     // Catch:{ NullPointerException -> 0x00ac }
            r1.<init>(r2, r0)     // Catch:{ NullPointerException -> 0x00ac }
            java.util.Map r6 = r8.A02
            monitor-enter(r6)
            boolean r0 = r6.containsKey(r1)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x004c
            X.0Wu r4 = X.C06240Wu.A00()     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = A03     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "Job is already being executed by SystemJobService: "
            X.C06240Wu.A02(r4, r1, r0, r3, r2)     // Catch:{ all -> 0x00a9 }
            monitor-exit(r6)     // Catch:{ all -> 0x00a9 }
            return r7
        L_0x004c:
            X.0Wu r4 = X.C06240Wu.A00()     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = A03     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "onStartJob for "
            X.C06240Wu.A02(r4, r1, r0, r3, r2)     // Catch:{ all -> 0x00a9 }
            r6.put(r1, r9)     // Catch:{ all -> 0x00a9 }
            monitor-exit(r6)     // Catch:{ all -> 0x00a9 }
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r2 < r0) goto L_0x00a7
            X.0Lo r4 = new X.0Lo
            r4.<init>()
            android.net.Uri[] r0 = X.AnonymousClass0S2.A00(r9)
            if (r0 == 0) goto L_0x007a
            android.net.Uri[] r0 = X.AnonymousClass0S2.A00(r9)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4.A02 = r0
        L_0x007a:
            java.lang.String[] r0 = X.AnonymousClass0S2.A01(r9)
            if (r0 == 0) goto L_0x008a
            java.lang.String[] r0 = X.AnonymousClass0S2.A01(r9)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4.A01 = r0
        L_0x008a:
            r0 = 28
            if (r2 < r0) goto L_0x0094
            android.net.Network r0 = X.C03120Ix.A00(r9)
            r4.A00 = r0
        L_0x0094:
            X.0Xb r3 = r8.A00
            X.0QD r0 = r8.A01
            X.0Kd r2 = r0.A01(r1)
            X.0sb r1 = r3.A06
            X.0m1 r0 = new X.0m1
            r0.<init>(r4, r2, r3)
            r1.B2t(r0)
            return r5
        L_0x00a7:
            r4 = 0
            goto L_0x0094
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00a9 }
            throw r0
        L_0x00ac:
            X.C06240Wu.A00()
            java.lang.String r1 = A03
            java.lang.String r0 = "WorkSpec id not found!"
            android.util.Log.e(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.A00 == null) {
            C06240Wu.A00().A04(A03, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                AnonymousClass0PL r4 = new AnonymousClass0PL(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
                C06240Wu.A02(C06240Wu.A00(), r4, "onStopJob for ", A03, AnonymousClass001.A0o());
                Map map = this.A02;
                synchronized (map) {
                    map.remove(r4);
                }
                C03440Kd A002 = this.A01.A00(r4);
                if (A002 != null) {
                    this.A00.A09(A002);
                }
                C09020fW r0 = this.A00.A03;
                String str = r4.A01;
                synchronized (r0.A0A) {
                    contains = r0.A09.contains(str);
                }
                return !contains;
            }
        } catch (NullPointerException unused) {
        }
        C06240Wu.A00();
        Log.e(A03, "WorkSpec id not found!");
        return false;
    }

    public void BSX(AnonymousClass0PL r5, boolean z) {
        JobParameters jobParameters;
        C06240Wu A002 = C06240Wu.A00();
        String str = A03;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(r5.A01);
        C06240Wu.A03(A002, " executed on JobScheduler", str, A0o);
        Map map = this.A02;
        synchronized (map) {
            jobParameters = (JobParameters) map.remove(r5);
        }
        this.A01.A00(r5);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            C06310Xb A012 = C06310Xb.A01(getApplicationContext());
            this.A00 = A012;
            A012.A03.A02(this);
        } catch (IllegalStateException unused) {
            if (AnonymousClass001.A1a(getApplication(), Application.class)) {
                C06240Wu.A00();
                Log.w(A03, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw AnonymousClass001.A0e("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C06310Xb r0 = this.A00;
        if (r0 != null) {
            r0.A03.A03(this);
        }
    }
}
