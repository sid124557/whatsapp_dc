package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.7sg  reason: invalid class name and case insensitive filesystem */
public final class C162747sg implements ServiceConnection {
    public AnonymousClass6DO A00;
    public boolean A01 = false;
    public final Context A02;
    public final Intent A03;
    public final Queue A04 = AnonymousClass6CA.A0a();
    public final ScheduledExecutorService A05;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3) == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        android.util.Log.d("FirebaseInstanceId", X.AnonymousClass000.A0b("binder is dead. start connection? ", X.AnonymousClass6CA.A0Y(39), X.AnonymousClass000.A1T(r11.A01 ? 1 : 0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        if (r11.A01 != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        r11.A01 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r5 = X.C160517nn.A00();
        r6 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        if (r5.A02(r6, r11.A03, r8, X.AnonymousClass000.A0O(r6), 65) != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        android.util.Log.e("FirebaseInstanceId", "binding to the service failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00af, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        android.util.Log.e("FirebaseInstanceId", "Exception while binding the service", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00() {
        /*
            r11 = this;
            r8 = r11
            monitor-enter(r8)
            java.lang.String r4 = "FirebaseInstanceId"
            r5 = 3
            boolean r0 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "flush queue called"
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x00c9 }
        L_0x0010:
            java.util.Queue r2 = r11.A04     // Catch:{ all -> 0x00c9 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x00c7
            boolean r0 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "found intent to be delivered"
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x00c9 }
        L_0x0023:
            X.6DO r0 = r11.A00     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0072
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0072
            boolean r0 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "binder is alive, sending the intent."
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x00c9 }
        L_0x0038:
            java.lang.Object r3 = r2.poll()     // Catch:{ all -> 0x00c9 }
            X.7TR r3 = (X.AnonymousClass7TR) r3     // Catch:{ all -> 0x00c9 }
            X.6DO r2 = r11.A00     // Catch:{ all -> 0x00c9 }
            int r1 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x00c9 }
            int r0 = android.os.Process.myUid()     // Catch:{ all -> 0x00c9 }
            if (r1 != r0) goto L_0x006a
            boolean r0 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "service received new intent via bind strategy"
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x00c9 }
        L_0x0055:
            X.7Bf r0 = r2.A00     // Catch:{ all -> 0x00c9 }
            android.content.Intent r1 = r3.A02     // Catch:{ all -> 0x00c9 }
            X.6CV r0 = r0.A00     // Catch:{ all -> 0x00c9 }
            com.google.android.gms.tasks.Task r2 = r0.A00(r1)     // Catch:{ all -> 0x00c9 }
            java.util.concurrent.Executor r1 = X.AnonymousClass779.A00     // Catch:{ all -> 0x00c9 }
            X.8BL r0 = new X.8BL     // Catch:{ all -> 0x00c9 }
            r0.<init>(r3)     // Catch:{ all -> 0x00c9 }
            r2.addOnCompleteListener(r1, r0)     // Catch:{ all -> 0x00c9 }
            goto L_0x0010
        L_0x006a:
            java.lang.String r1 = "Binding only allowed within app"
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ all -> 0x00c9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c9 }
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x0072:
            boolean r0 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x00c9 }
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L_0x008f
            boolean r0 = r11.A01     // Catch:{ all -> 0x00c9 }
            boolean r5 = X.AnonymousClass000.A1T(r0)
            r0 = 39
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "binder is dead. start connection? "
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r5)     // Catch:{ all -> 0x00c9 }
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x00c9 }
        L_0x008f:
            boolean r0 = r11.A01     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x00c7
            r11.A01 = r6     // Catch:{ all -> 0x00c9 }
            X.7nn r5 = X.C160517nn.A00()     // Catch:{ SecurityException -> 0x00af }
            android.content.Context r6 = r11.A02     // Catch:{ SecurityException -> 0x00af }
            android.content.Intent r7 = r11.A03     // Catch:{ SecurityException -> 0x00af }
            r10 = 65
            java.lang.String r9 = X.AnonymousClass000.A0O(r6)     // Catch:{ SecurityException -> 0x00af }
            boolean r0 = r5.A02(r6, r7, r8, r9, r10)     // Catch:{ SecurityException -> 0x00af }
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = "binding to the service failed"
            android.util.Log.e(r4, r0)     // Catch:{ SecurityException -> 0x00af }
            goto L_0x00b5
        L_0x00af:
            r1 = move-exception
            java.lang.String r0 = "Exception while binding the service"
            android.util.Log.e(r4, r0, r1)     // Catch:{ all -> 0x00c9 }
        L_0x00b5:
            r11.A01 = r3     // Catch:{ all -> 0x00c9 }
        L_0x00b7:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x00c7
            java.lang.Object r0 = r2.poll()     // Catch:{ all -> 0x00c9 }
            X.7TR r0 = (X.AnonymousClass7TR) r0     // Catch:{ all -> 0x00c9 }
            r0.A00()     // Catch:{ all -> 0x00c9 }
            goto L_0x00b7
        L_0x00c7:
            monitor-exit(r8)
            return
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162747sg.A00():void");
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (AnonymousClass6C9.A1Q("FirebaseInstanceId")) {
            String valueOf = String.valueOf(componentName);
            AnonymousClass6C7.A1G("onServiceConnected: ", valueOf, "FirebaseInstanceId", AnonymousClass6CA.A0Y(valueOf.length() + 20));
        }
        this.A01 = false;
        if (!(iBinder instanceof AnonymousClass6DO)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder A0Y = AnonymousClass6CA.A0Y(valueOf2.length() + 28);
            A0Y.append("Invalid service connection: ");
            AnonymousClass000.A1D(valueOf2, "FirebaseInstanceId", A0Y);
            while (true) {
                Queue queue = this.A04;
                if (queue.isEmpty()) {
                    break;
                }
                ((AnonymousClass7TR) queue.poll()).A00();
            }
        } else {
            this.A00 = (AnonymousClass6DO) iBinder;
            A00();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            AnonymousClass6C7.A1G("onServiceDisconnected: ", valueOf, "FirebaseInstanceId", AnonymousClass6CA.A0Y(valueOf.length() + 23));
        }
        A00();
    }

    public C162747sg(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new C173208Os("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.A02 = applicationContext;
        this.A03 = AnonymousClass0x9.A09("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.A05 = scheduledThreadPoolExecutor;
    }
}
