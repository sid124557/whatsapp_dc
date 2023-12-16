package X;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.IBinder;

/* renamed from: X.00a  reason: invalid class name and case insensitive filesystem */
public final class C000000a extends JobServiceEngine implements C16530tY {
    public JobParameters A00;
    public final AnonymousClass00W A01;
    public final Object A02 = AnonymousClass002.A0D();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        r2.getIntent().setExtrasClassLoader(r4.A01.getClassLoader());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return new X.C07840cu(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        if (r2 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16540tZ B1X() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A02
            monitor-enter(r3)
            android.app.job.JobParameters r1 = r4.A00     // Catch:{ all -> 0x0024 }
            r0 = 0
            if (r1 != 0) goto L_0x000a
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            return r0
        L_0x000a:
            android.app.job.JobWorkItem r2 = r1.dequeueWork()     // Catch:{ all -> 0x0024 }
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0023
            android.content.Intent r1 = r2.getIntent()
            X.00W r0 = r4.A01
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1.setExtrasClassLoader(r0)
            X.0cu r0 = new X.0cu
            r0.<init>(r2, r4)
        L_0x0023:
            return r0
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C000000a.B1X():X.0tZ");
    }

    public boolean onStartJob(JobParameters jobParameters) {
        this.A00 = jobParameters;
        this.A01.A06(false);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        AnonymousClass00W r2 = this.A01;
        AnonymousClass01S r1 = r2.A00;
        if (r1 != null) {
            r1.cancel(false);
        }
        boolean A07 = r2.A07();
        synchronized (this.A02) {
            this.A00 = null;
        }
        return A07;
    }

    public C000000a(AnonymousClass00W r2) {
        super(r2);
        this.A01 = r2;
    }

    public IBinder AzE() {
        return getBinder();
    }
}
