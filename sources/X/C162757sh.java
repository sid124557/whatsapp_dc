package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.Queue;

/* renamed from: X.7sh  reason: invalid class name and case insensitive filesystem */
public final class C162757sh implements ServiceConnection {
    public int A00 = 0;
    public AnonymousClass7GU A01;
    public final Messenger A02 = new Messenger(new AnonymousClass6E0(Looper.getMainLooper(), new C162967t3(this)));
    public final SparseArray A03 = AnonymousClass6CA.A0I();
    public final Queue A04 = AnonymousClass6CA.A0a();
    public final /* synthetic */ C157527iS A05;

    public final synchronized void A00() {
        if (this.A00 == 2 && this.A04.isEmpty() && this.A03.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.A00 = 3;
            C160517nn.A00().A01(this.A05.A02, this);
        }
    }

    public final synchronized void A01(int i, String str) {
        SparseArray sparseArray;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", AnonymousClass6C7.A0j("Disconnected: ", str));
        }
        int i2 = this.A00;
        if (i2 == 0) {
            throw AnonymousClass6CA.A0O();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.A00 = 4;
            C160517nn.A00().A01(this.A05.A02, this);
            C143496yy r3 = new C143496yy(i, str);
            Queue<C153277ay> queue = this.A04;
            for (C153277ay A012 : queue) {
                A012.A01(r3);
            }
            queue.clear();
            int i3 = 0;
            while (true) {
                sparseArray = this.A03;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                ((C153277ay) sparseArray.valueAt(i3)).A01(r3);
                i3++;
            }
            sparseArray.clear();
        } else if (i2 == 3) {
            this.A00 = 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A03(X.C153277ay r10) {
        /*
            r9 = this;
            r6 = r9
            monitor-enter(r6)
            int r0 = r9.A00     // Catch:{ all -> 0x0079 }
            r3 = 2
            r2 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 == r8) goto L_0x0021
            if (r0 == r3) goto L_0x000f
            monitor-exit(r6)
            return r2
        L_0x000f:
            java.util.Queue r0 = r9.A04     // Catch:{ all -> 0x0079 }
            r0.add(r10)     // Catch:{ all -> 0x0079 }
            X.7iS r0 = r9.A05     // Catch:{ all -> 0x0079 }
            java.util.concurrent.ScheduledExecutorService r1 = r0.A03     // Catch:{ all -> 0x0079 }
            X.8Lx r0 = new X.8Lx     // Catch:{ all -> 0x0079 }
            r0.<init>(r9)     // Catch:{ all -> 0x0079 }
            r1.execute(r0)     // Catch:{ all -> 0x0079 }
            goto L_0x0072
        L_0x0021:
            java.util.Queue r0 = r9.A04     // Catch:{ all -> 0x0079 }
            r0.add(r10)     // Catch:{ all -> 0x0079 }
            goto L_0x0072
        L_0x0027:
            java.util.Queue r0 = r9.A04     // Catch:{ all -> 0x0079 }
            r0.add(r10)     // Catch:{ all -> 0x0079 }
            int r0 = r9.A00     // Catch:{ all -> 0x0079 }
            if (r0 != 0) goto L_0x0074
            java.lang.String r1 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r1, r3)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0079 }
        L_0x003d:
            r9.A00 = r8     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            android.content.Intent r5 = X.AnonymousClass0x9.A09(r0)     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "com.google.android.gms"
            r5.setPackage(r0)     // Catch:{ all -> 0x0079 }
            X.7nn r3 = X.C160517nn.A00()     // Catch:{ all -> 0x0079 }
            X.7iS r1 = r9.A05     // Catch:{ all -> 0x0079 }
            android.content.Context r4 = r1.A02     // Catch:{ all -> 0x0079 }
            java.lang.String r7 = X.AnonymousClass000.A0O(r4)     // Catch:{ all -> 0x0079 }
            boolean r0 = r3.A02(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0079 }
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "Unable to bind to service"
            r9.A01(r2, r0)     // Catch:{ all -> 0x0079 }
            goto L_0x0072
        L_0x0062:
            java.util.concurrent.ScheduledExecutorService r4 = r1.A03     // Catch:{ all -> 0x0079 }
            r0 = 47
            X.8Mf r3 = new X.8Mf     // Catch:{ all -> 0x0079 }
            r3.<init>(r9, r0)     // Catch:{ all -> 0x0079 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0079 }
            r0 = 30
            r4.schedule(r3, r0, r2)     // Catch:{ all -> 0x0079 }
        L_0x0072:
            monitor-exit(r6)
            return r8
        L_0x0074:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()     // Catch:{ all -> 0x0079 }
            throw r0     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162757sh.A03(X.7ay):boolean");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.A05.A03.execute(new C70173a4(iBinder, 6, this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.A05.A03.execute(new C172668Mf(this, 45));
    }

    public C162757sh(C157527iS r4) {
        this.A05 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r2 = r7.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r2.getBoolean("unsupported", false) == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r4.A01(new X.C143496yy(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        r4.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(android.os.Message r7) {
        /*
            r6 = this;
            int r5 = r7.arg1
            java.lang.String r2 = "MessengerIpcClient"
            boolean r0 = X.AnonymousClass6C9.A1Q(r2)
            if (r0 == 0) goto L_0x0019
            r0 = 41
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "Received response to request: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r5)
            android.util.Log.d(r2, r0)
        L_0x0019:
            monitor-enter(r6)
            android.util.SparseArray r0 = r6.A03     // Catch:{ all -> 0x0056 }
            java.lang.Object r4 = r0.get(r5)     // Catch:{ all -> 0x0056 }
            X.7ay r4 = (X.C153277ay) r4     // Catch:{ all -> 0x0056 }
            r3 = 1
            if (r4 != 0) goto L_0x0032
            r0 = 50
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "Received response for unknown request: "
            X.AnonymousClass6C7.A1I(r0, r2, r1, r5)     // Catch:{ all -> 0x0056 }
            monitor-exit(r6)     // Catch:{ all -> 0x0056 }
            return r3
        L_0x0032:
            r0.remove(r5)     // Catch:{ all -> 0x0056 }
            r6.A00()     // Catch:{ all -> 0x0056 }
            monitor-exit(r6)     // Catch:{ all -> 0x0056 }
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "unsupported"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x0052
            r2 = 4
            java.lang.String r1 = "Not supported by GmsCore"
            X.6yy r0 = new X.6yy
            r0.<init>(r2, r1)
            r4.A01(r0)
            return r3
        L_0x0052:
            r4.A00(r2)
            return r3
        L_0x0056:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0056 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162757sh.A02(android.os.Message):boolean");
    }
}
