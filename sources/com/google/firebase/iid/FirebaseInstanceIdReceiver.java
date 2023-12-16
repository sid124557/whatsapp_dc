package com.google.firebase.iid;

import X.AnonymousClass6C9;
import X.AnonymousClass7TR;
import X.C000300e;
import X.C162747sg;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;

public final class FirebaseInstanceIdReceiver extends C000300e {
    public static C162747sg A00;

    public static int A00(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        C162747sg r4;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        synchronized (FirebaseInstanceIdReceiver.class) {
            r4 = A00;
            if (r4 == null) {
                r4 = new C162747sg(context);
                A00 = r4;
            }
        }
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver.goAsync();
        synchronized (r4) {
            if (AnonymousClass6C9.A1Q("FirebaseInstanceId")) {
                Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
            }
            r4.A04.add(new AnonymousClass7TR(goAsync, intent, r4.A05));
            r4.A00();
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0266, code lost:
        if (r1 == null) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00da, code lost:
        if (r11.getApplicationInfo().targetSdkVersion < 26) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r20, android.content.Intent r21) {
        /*
            r19 = this;
            r0 = 0
            r10 = r21
            r10.setComponent(r0)
            r11 = r20
            java.lang.String r0 = r11.getPackageName()
            r10.setPackage(r0)
            java.lang.String r0 = "from"
            java.lang.String r1 = r10.getStringExtra(r0)
            java.lang.String r0 = "google.com/iid"
            boolean r0 = r0.equals(r1)
            r12 = r19
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "CMD"
            java.lang.String r3 = r10.getStringExtra(r0)
            if (r3 == 0) goto L_0x02a9
            r0 = 3
            java.lang.String r4 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r4, r0)
            if (r0 == 0) goto L_0x004f
            android.os.Bundle r0 = r10.getExtras()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = r3.length()
            int r0 = r0 + 21
            java.lang.StringBuilder r1 = X.AnonymousClass6C7.A0o(r0, r2)
            java.lang.String r0 = "Received command: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " - "
            X.AnonymousClass6C7.A1G(r0, r2, r4, r1)
        L_0x004f:
            java.lang.String r0 = "RST"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "RST_FULL"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "SYNC"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x02a9
            X.7qO r0 = X.C161757qO.A00()
            com.google.firebase.iid.FirebaseInstanceId r6 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)
            X.7nI r5 = com.google.firebase.iid.FirebaseInstanceId.A08
            java.lang.String r0 = ""
            monitor-enter(r5)
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "|T|"
            java.lang.String r4 = r1.concat(r0)     // Catch:{ all -> 0x00a5 }
            android.content.SharedPreferences r0 = r5.A01     // Catch:{ all -> 0x00a5 }
            android.content.SharedPreferences$Editor r3 = r0.edit()     // Catch:{ all -> 0x00a5 }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r2 = X.C18280x3.A0i(r0)     // Catch:{ all -> 0x00a5 }
        L_0x008c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)     // Catch:{ all -> 0x00a5 }
            boolean r0 = r1.startsWith(r4)     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x008c
            r3.remove(r1)     // Catch:{ all -> 0x00a5 }
            goto L_0x008c
        L_0x00a0:
            r3.commit()     // Catch:{ all -> 0x00a5 }
            goto L_0x02a5
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x00a8:
            X.7qO r0 = X.C161757qO.A00()
            com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)
            r0.A07()
            goto L_0x02a9
        L_0x00b5:
            java.lang.String r2 = "gcm.rawData64"
            java.lang.String r1 = r10.getStringExtra(r2)
            if (r1 == 0) goto L_0x00ca
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r0 = "rawData"
            r10.putExtra(r0, r1)
            r10.removeExtra(r2)
        L_0x00ca:
            boolean r0 = X.C154017cR.A00()
            r3 = 1
            if (r0 == 0) goto L_0x00dc
            android.content.pm.ApplicationInfo r0 = r11.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 26
            r2 = 1
            if (r1 >= r0) goto L_0x00dd
        L_0x00dc:
            r2 = 0
        L_0x00dd:
            int r1 = r10.getFlags()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 != 0) goto L_0x00e7
            r3 = 0
        L_0x00e7:
            if (r2 == 0) goto L_0x00f1
            if (r3 != 0) goto L_0x00f1
            int r1 = A00(r12, r11, r10)
            goto L_0x02aa
        L_0x00f1:
            X.2xA r2 = X.C59592xA.A00()
            r0 = 3
            java.lang.String r9 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r9, r0)
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = "Starting service"
            android.util.Log.d(r9, r0)
        L_0x0103:
            java.util.Queue r0 = r2.A03
            r0.offer(r10)
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            android.content.Intent r4 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r0 = r11.getPackageName()
            r4.setPackage(r0)
            monitor-enter(r2)
            java.lang.String r3 = r2.A02     // Catch:{ all -> 0x02b4 }
            if (r3 != 0) goto L_0x0175
            android.content.pm.PackageManager r1 = r11.getPackageManager()     // Catch:{ all -> 0x02b4 }
            r0 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r4, r0)     // Catch:{ all -> 0x02b4 }
            r3 = 0
            if (r0 == 0) goto L_0x0155
            android.content.pm.ServiceInfo r5 = r0.serviceInfo     // Catch:{ all -> 0x02b4 }
            if (r5 == 0) goto L_0x0155
            java.lang.String r0 = r11.getPackageName()     // Catch:{ all -> 0x02b4 }
            java.lang.String r6 = r5.packageName     // Catch:{ all -> 0x02b4 }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x02b4 }
            if (r0 == 0) goto L_0x0158
            java.lang.String r1 = r5.name     // Catch:{ all -> 0x02b4 }
            if (r1 == 0) goto L_0x0158
            java.lang.String r0 = "."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x02b4 }
            if (r0 == 0) goto L_0x0150
            java.lang.String r0 = r11.getPackageName()     // Catch:{ all -> 0x02b4 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02b4 }
            java.lang.String r0 = r5.name     // Catch:{ all -> 0x02b4 }
            java.lang.String r1 = X.AnonymousClass6C7.A0j(r1, r0)     // Catch:{ all -> 0x02b4 }
        L_0x0150:
            r2.A02 = r1     // Catch:{ all -> 0x02b4 }
            monitor-exit(r2)
            r3 = r1
            goto L_0x0176
        L_0x0155:
            java.lang.String r0 = "Failed to resolve target intent service, skipping classname enforcement"
            goto L_0x0172
        L_0x0158:
            java.lang.String r5 = r5.name     // Catch:{ all -> 0x02b4 }
            int r0 = X.AnonymousClass6C7.A06(r6)     // Catch:{ all -> 0x02b4 }
            int r0 = r0 + 94
            java.lang.StringBuilder r1 = X.AnonymousClass6C7.A0q(r5, r0)     // Catch:{ all -> 0x02b4 }
            java.lang.String r0 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r1.append(r0)     // Catch:{ all -> 0x02b4 }
            r1.append(r6)     // Catch:{ all -> 0x02b4 }
            java.lang.String r0 = "/"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)     // Catch:{ all -> 0x02b4 }
        L_0x0172:
            android.util.Log.e(r9, r0)     // Catch:{ all -> 0x02b4 }
        L_0x0175:
            monitor-exit(r2)
        L_0x0176:
            if (r3 == 0) goto L_0x0192
            boolean r0 = X.AnonymousClass6C9.A1Q(r9)
            if (r0 == 0) goto L_0x018b
            int r1 = r3.length()
            java.lang.String r0 = "Restricting intent to a specific service: "
            java.lang.String r0 = X.AnonymousClass6C7.A0k(r0, r3, r1)
            android.util.Log.d(r9, r0)
        L_0x018b:
            java.lang.String r0 = r11.getPackageName()
            r4.setClassName(r0, r3)
        L_0x0192:
            boolean r0 = r2.A01(r11)     // Catch:{ SecurityException -> 0x028a, IllegalStateException -> 0x0270 }
            if (r0 == 0) goto L_0x025d
            java.lang.Object r18 = X.AnonymousClass796.A02     // Catch:{ SecurityException -> 0x028a, IllegalStateException -> 0x0270 }
            monitor-enter(r18)     // Catch:{ SecurityException -> 0x028a, IllegalStateException -> 0x0270 }
            X.7je r0 = X.AnonymousClass796.A00     // Catch:{ all -> 0x025a }
            r3 = 1
            if (r0 != 0) goto L_0x01b0
            X.7je r0 = new X.7je     // Catch:{ all -> 0x025a }
            r0.<init>(r11)     // Catch:{ all -> 0x025a }
            X.AnonymousClass796.A00 = r0     // Catch:{ all -> 0x025a }
            java.lang.Object r1 = r0.A0A     // Catch:{ all -> 0x025a }
            monitor-enter(r1)     // Catch:{ all -> 0x025a }
            monitor-exit(r1)     // Catch:{ all -> 0x01ac }
            goto L_0x01b0
        L_0x01ac:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ac }
            goto L_0x0257
        L_0x01b0:
            java.lang.String r2 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r0 = 0
            boolean r1 = r4.getBooleanExtra(r2, r0)     // Catch:{ all -> 0x025a }
            r4.putExtra(r2, r3)     // Catch:{ all -> 0x025a }
            android.content.ComponentName r0 = r11.startService(r4)     // Catch:{ all -> 0x025a }
            if (r0 != 0) goto L_0x01c3
            monitor-exit(r18)     // Catch:{ all -> 0x025a }
            goto L_0x0268
        L_0x01c3:
            if (r1 != 0) goto L_0x0258
            X.7je r8 = X.AnonymousClass796.A00     // Catch:{ all -> 0x025a }
            long r6 = X.AnonymousClass796.A01     // Catch:{ all -> 0x025a }
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A07     // Catch:{ all -> 0x025a }
            r0.incrementAndGet()     // Catch:{ all -> 0x025a }
            long r0 = X.C158237je.A0F     // Catch:{ all -> 0x025a }
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = java.lang.Math.min(r4, r0)     // Catch:{ all -> 0x025a }
            r0 = 1
            long r2 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x025a }
            r13 = 0
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e9
            long r2 = java.lang.Math.min(r6, r2)     // Catch:{ all -> 0x025a }
        L_0x01e9:
            java.lang.Object r6 = r8.A0A     // Catch:{ all -> 0x025a }
            monitor-enter(r6)     // Catch:{ all -> 0x025a }
            boolean r0 = r8.A01()     // Catch:{ all -> 0x0255 }
            r13 = 0
            r7 = 0
            if (r0 != 0) goto L_0x0200
            X.8KY r0 = X.AnonymousClass8KY.A00     // Catch:{ all -> 0x0255 }
            r8.A05 = r0     // Catch:{ all -> 0x0255 }
            android.os.PowerManager$WakeLock r0 = r8.A09     // Catch:{ all -> 0x0255 }
            r0.acquire()     // Catch:{ all -> 0x0255 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0255 }
        L_0x0200:
            int r0 = r8.A00     // Catch:{ all -> 0x0255 }
            int r0 = r0 + 1
            r8.A00 = r0     // Catch:{ all -> 0x0255 }
            int r0 = r8.A01     // Catch:{ all -> 0x0255 }
            int r0 = r0 + 1
            r8.A01 = r0     // Catch:{ all -> 0x0255 }
            android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0255 }
            java.util.Map r0 = r8.A0C     // Catch:{ all -> 0x0255 }
            java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x0255 }
            X.7fS r1 = (X.C155757fS) r1     // Catch:{ all -> 0x0255 }
            if (r1 != 0) goto L_0x0221
            X.7fS r1 = new X.7fS     // Catch:{ all -> 0x0255 }
            r1.<init>(r7)     // Catch:{ all -> 0x0255 }
            r0.put(r7, r1)     // Catch:{ all -> 0x0255 }
        L_0x0221:
            int r0 = r1.A00     // Catch:{ all -> 0x0255 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x0255 }
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0255 }
            long r14 = r4 - r16
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0233
            long r4 = r16 + r2
        L_0x0233:
            long r0 = r8.A02     // Catch:{ all -> 0x0255 }
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0253
            r8.A02 = r4     // Catch:{ all -> 0x0255 }
            java.util.concurrent.Future r0 = r8.A06     // Catch:{ all -> 0x0255 }
            if (r0 == 0) goto L_0x0242
            r0.cancel(r13)     // Catch:{ all -> 0x0255 }
        L_0x0242:
            java.util.concurrent.ScheduledExecutorService r4 = r8.A0E     // Catch:{ all -> 0x0255 }
            r0 = 31
            X.8Mf r1 = new X.8Mf     // Catch:{ all -> 0x0255 }
            r1.<init>(r8, r0)     // Catch:{ all -> 0x0255 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0255 }
            java.util.concurrent.ScheduledFuture r0 = r4.schedule(r1, r2, r0)     // Catch:{ all -> 0x0255 }
            r8.A06 = r0     // Catch:{ all -> 0x0255 }
        L_0x0253:
            monitor-exit(r6)     // Catch:{ all -> 0x0255 }
            goto L_0x0258
        L_0x0255:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0255 }
        L_0x0257:
            throw r0     // Catch:{ all -> 0x025a }
        L_0x0258:
            monitor-exit(r18)     // Catch:{ all -> 0x025a }
            goto L_0x026e
        L_0x025a:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x025a }
            throw r0     // Catch:{ SecurityException -> 0x028a, IllegalStateException -> 0x0270 }
        L_0x025d:
            android.content.ComponentName r1 = r11.startService(r4)     // Catch:{ SecurityException -> 0x028a, IllegalStateException -> 0x0270 }
            java.lang.String r0 = "Missing wake lock permission, service start may be delayed"
            android.util.Log.d(r9, r0)     // Catch:{ SecurityException -> 0x028a, IllegalStateException -> 0x0270 }
            if (r1 != 0) goto L_0x026e
        L_0x0268:
            java.lang.String r0 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r9, r0)     // Catch:{ SecurityException -> 0x028a, IllegalStateException -> 0x0270 }
            goto L_0x0293
        L_0x026e:
            r1 = -1
            goto L_0x0295
        L_0x0270:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = r2.length()
            int r0 = r0 + 45
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "Failed to start service while in background: "
            r1.append(r0)
            X.AnonymousClass000.A1D(r2, r9, r1)
            r1 = 402(0x192, float:5.63E-43)
            goto L_0x0295
        L_0x028a:
            r1 = move-exception
            java.lang.String r0 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r9, r0, r1)
            r1 = 401(0x191, float:5.62E-43)
            goto L_0x0295
        L_0x0293:
            r1 = 404(0x194, float:5.66E-43)
        L_0x0295:
            boolean r0 = X.C154017cR.A00()
            if (r0 == 0) goto L_0x02aa
            r0 = 402(0x192, float:5.63E-43)
            if (r1 != r0) goto L_0x02aa
            A00(r12, r11, r10)
            r1 = 403(0x193, float:5.65E-43)
            goto L_0x02aa
        L_0x02a5:
            monitor-exit(r5)
            r6.A08()
        L_0x02a9:
            r1 = -1
        L_0x02aa:
            boolean r0 = r12.isOrderedBroadcast()
            if (r0 == 0) goto L_0x02b3
            r12.setResultCode(r1)
        L_0x02b3:
            return
        L_0x02b4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.A01(android.content.Context, android.content.Intent):void");
    }

    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (!(parcelableExtra instanceof Intent) || (intent2 = (Intent) parcelableExtra) == null) {
                A01(context, intent);
            } else {
                A01(context, intent2);
            }
        }
    }
}
