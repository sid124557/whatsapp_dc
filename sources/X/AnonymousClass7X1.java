package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;

/* renamed from: X.7X1  reason: invalid class name */
public final class AnonymousClass7X1 {
    public static int A06;
    public static PendingIntent A07;
    public Messenger A00;
    public Messenger A01;
    public C165917xq A02;
    public final Context A03;
    public final C06290Wz A04 = new C06290Wz();
    public final C160637o2 A05;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final android.os.Bundle A00(android.os.Bundle r13) {
        /*
            r12 = this;
            java.lang.Class<X.7X1> r6 = X.AnonymousClass7X1.class
            monitor-enter(r6)
            int r1 = A06     // Catch:{ all -> 0x0110 }
            int r0 = r1 + 1
            A06 = r0     // Catch:{ all -> 0x0110 }
            java.lang.String r5 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0110 }
            monitor-exit(r6)
            X.7Xf r8 = new X.7Xf
            r8.<init>()
            X.0Wz r4 = r12.A04
            monitor-enter(r4)
            r4.put(r5, r8)     // Catch:{ all -> 0x010d }
            monitor-exit(r4)     // Catch:{ all -> 0x010d }
            X.7o2 r9 = r12.A05
            int r0 = r9.A02()
            if (r0 == 0) goto L_0x0106
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r0 = "com.google.android.gms"
            r7.setPackage(r0)
            int r0 = r9.A02()
            r3 = 2
            if (r0 != r3) goto L_0x003f
            java.lang.String r0 = "com.google.iid.TOKEN_REQUEST"
        L_0x0035:
            r7.setAction(r0)
            r7.putExtras(r13)
            android.content.Context r2 = r12.A03
            monitor-enter(r6)
            goto L_0x0042
        L_0x003f:
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            goto L_0x0035
        L_0x0042:
            android.app.PendingIntent r1 = A07     // Catch:{ all -> 0x0110 }
            if (r1 != 0) goto L_0x0057
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0110 }
            r1.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "com.google.example.invalidpackage"
            r1.setPackage(r0)     // Catch:{ all -> 0x0110 }
            r0 = 0
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r2, r0, r1, r0)     // Catch:{ all -> 0x0110 }
            A07 = r1     // Catch:{ all -> 0x0110 }
        L_0x0057:
            java.lang.String r0 = "app"
            r7.putExtra(r0, r1)     // Catch:{ all -> 0x0110 }
            monitor-exit(r6)
            java.lang.String r6 = "kid"
            int r0 = X.AnonymousClass6C7.A06(r5)
            int r0 = r0 + 5
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "|ID|"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "|"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r7.putExtra(r6, r0)
            java.lang.String r6 = "FirebaseInstanceId"
            r10 = 3
            boolean r0 = android.util.Log.isLoggable(r6, r10)
            if (r0 == 0) goto L_0x009a
            android.os.Bundle r0 = r7.getExtras()
            java.lang.String r11 = java.lang.String.valueOf(r0)
            int r0 = r11.length()
            int r0 = r0 + 8
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)
            java.lang.String r0 = "Sending "
            X.AnonymousClass6C7.A1G(r0, r11, r6, r1)
        L_0x009a:
            java.lang.String r1 = "google.messenger"
            android.os.Messenger r0 = r12.A00
            r7.putExtra(r1, r0)
            android.os.Messenger r0 = r12.A01
            if (r0 != 0) goto L_0x00a9
            X.7xq r0 = r12.A02
            if (r0 == 0) goto L_0x00c6
        L_0x00a9:
            android.os.Message r1 = android.os.Message.obtain()
            r1.obj = r7
            android.os.Messenger r0 = r12.A01     // Catch:{ RemoteException -> 0x00bb }
            if (r0 != 0) goto L_0x00b7
            X.7xq r0 = r12.A02     // Catch:{ RemoteException -> 0x00bb }
            android.os.Messenger r0 = r0.A00     // Catch:{ RemoteException -> 0x00bb }
        L_0x00b7:
            r0.send(r1)     // Catch:{ RemoteException -> 0x00bb }
            goto L_0x00d3
        L_0x00bb:
            boolean r0 = android.util.Log.isLoggable(r6, r10)
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = "Messenger failed, fallback to startService"
            android.util.Log.d(r6, r0)
        L_0x00c6:
            int r0 = r9.A02()
            if (r0 != r3) goto L_0x00d0
            r2.sendBroadcast(r7)
            goto L_0x00d3
        L_0x00d0:
            r2.startService(r7)
        L_0x00d3:
            X.6YV r3 = r8.A00     // Catch:{ InterruptedException | TimeoutException -> 0x00ea, ExecutionException -> 0x00e8 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00ea, ExecutionException -> 0x00e8 }
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r3, r0, r2)     // Catch:{ InterruptedException | TimeoutException -> 0x00ea, ExecutionException -> 0x00e8 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ InterruptedException | TimeoutException -> 0x00ea, ExecutionException -> 0x00e8 }
            monitor-enter(r4)
            r4.remove(r5)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r4)     // Catch:{ all -> 0x00e5 }
            return r0
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e5 }
            throw r0
        L_0x00e8:
            r1 = move-exception
            goto L_0x00f6
        L_0x00ea:
            java.lang.String r0 = "No response"
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "TIMEOUT"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x00fc }
            goto L_0x00fb
        L_0x00f6:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00fc }
            r0.<init>(r1)     // Catch:{ all -> 0x00fc }
        L_0x00fb:
            throw r0     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r0 = move-exception
            monitor-enter(r4)
            r4.remove(r5)     // Catch:{ all -> 0x0103 }
        L_0x0101:
            monitor-exit(r4)     // Catch:{ all -> 0x0103 }
            goto L_0x0105
        L_0x0103:
            r0 = move-exception
            goto L_0x0101
        L_0x0105:
            throw r0
        L_0x0106:
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x010d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x010d }
            throw r0
        L_0x0110:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7X1.A00(android.os.Bundle):android.os.Bundle");
    }

    public final void A01(String str, Bundle bundle) {
        C06290Wz r2 = this.A04;
        synchronized (r2) {
            C152017Xf r0 = (C152017Xf) r2.remove(str);
            if (r0 == null) {
                Log.w("FirebaseInstanceId", AnonymousClass6C7.A0j("Missing callback for ", str));
            } else {
                r0.A00(bundle);
            }
        }
    }

    public AnonymousClass7X1(Context context, C160637o2 r4) {
        this.A03 = context;
        this.A05 = r4;
        this.A00 = new Messenger(new C128456Wd(Looper.getMainLooper(), this));
    }
}
