package X;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;

/* renamed from: X.6RY  reason: invalid class name */
public final class AnonymousClass6RY extends C127196Ra {
    public final AnonymousClass7RQ A00;
    public final AnonymousClass7RQ A01;
    public final AnonymousClass7RQ A02;
    public final AnonymousClass7RQ A03;
    public final AnonymousClass7RQ A04;
    public final AnonymousClass7RQ A05;
    public final AnonymousClass7RQ A06;
    public final AnonymousClass7RQ A07;
    public final AnonymousClass7RQ A08;
    public final C161327pR A09;
    public final ExecutorService A0A;

    public final void A05(Bundle bundle, IBinder iBinder, int i, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", AnonymousClass000.A0Y("onPostInitHandler: statusCode ", AnonymousClass6CA.A0Y(41), i));
        }
        if (i == 0) {
            this.A00.A00(iBinder);
            this.A01.A00(iBinder);
            this.A02.A00(iBinder);
            this.A03.A00(iBinder);
            this.A04.A00(iBinder);
            this.A05.A00(iBinder);
            this.A06.A00(iBinder);
            this.A07.A00(iBinder);
            this.A08.A00(iBinder);
            i = 0;
        }
        super.A05(bundle, iBinder, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r2 < 8600000) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AzV(X.C180898lo r7) {
        /*
            r6 = this;
            java.lang.String r5 = "com.google.android.wearable.app.cn"
            boolean r0 = r6.Bjr()
            if (r0 != 0) goto L_0x00a5
            android.content.Context r4 = r6.A0F     // Catch:{ NameNotFoundException -> 0x008a }
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008a }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r5, r0)     // Catch:{ NameNotFoundException -> 0x008a }
            android.os.Bundle r1 = r0.metaData     // Catch:{ NameNotFoundException -> 0x008a }
            r3 = 0
            if (r1 == 0) goto L_0x0087
            java.lang.String r0 = "com.google.android.wearable.api.version"
            int r2 = r1.getInt(r0, r3)     // Catch:{ NameNotFoundException -> 0x008a }
            r0 = 8600000(0x8339c0, float:1.2051167E-38)
            if (r2 >= r0) goto L_0x00a5
        L_0x0024:
            r0 = 82
            java.lang.StringBuilder r1 = X.AnonymousClass6CA.A0Y(r0)     // Catch:{ NameNotFoundException -> 0x008a }
            java.lang.String r0 = "The Wear OS app is out of date. Requires API version 8600000 but found "
            r1.append(r0)     // Catch:{ NameNotFoundException -> 0x008a }
            r1.append(r2)     // Catch:{ NameNotFoundException -> 0x008a }
            java.lang.String r0 = "WearableClient"
            X.AnonymousClass6C7.A1A(r1, r0)     // Catch:{ NameNotFoundException -> 0x008a }
            java.lang.String r0 = "com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR"
            android.content.Intent r0 = X.AnonymousClass0x9.A09(r0)     // Catch:{ NameNotFoundException -> 0x008a }
            android.content.Intent r2 = r0.setPackage(r5)     // Catch:{ NameNotFoundException -> 0x008a }
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008a }
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r2, r0)     // Catch:{ NameNotFoundException -> 0x008a }
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "market://details"
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ NameNotFoundException -> 0x008a }
            android.net.Uri$Builder r1 = r0.buildUpon()     // Catch:{ NameNotFoundException -> 0x008a }
            java.lang.String r0 = "id"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r5)     // Catch:{ NameNotFoundException -> 0x008a }
            android.net.Uri r1 = r0.build()     // Catch:{ NameNotFoundException -> 0x008a }
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = new android.content.Intent     // Catch:{ NameNotFoundException -> 0x008a }
            r2.<init>(r0, r1)     // Catch:{ NameNotFoundException -> 0x008a }
        L_0x0068:
            int r0 = X.AnonymousClass771.A00     // Catch:{ NameNotFoundException -> 0x008a }
            android.app.PendingIntent r4 = android.app.PendingIntent.getActivity(r4, r3, r2, r0)     // Catch:{ NameNotFoundException -> 0x008a }
            r3 = 6
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            X.C162177rO.A03(r7, r0)     // Catch:{ NameNotFoundException -> 0x008a }
            r6.A08 = r7     // Catch:{ NameNotFoundException -> 0x008a }
            android.os.Handler r2 = r6.A0G     // Catch:{ NameNotFoundException -> 0x008a }
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0C     // Catch:{ NameNotFoundException -> 0x008a }
            int r1 = r0.get()     // Catch:{ NameNotFoundException -> 0x008a }
            r0 = 3
            android.os.Message r0 = r2.obtainMessage(r0, r1, r3, r4)     // Catch:{ NameNotFoundException -> 0x008a }
            r2.sendMessage(r0)     // Catch:{ NameNotFoundException -> 0x008a }
            goto L_0x0089
        L_0x0087:
            r2 = 0
            goto L_0x0024
        L_0x0089:
            return
        L_0x008a:
            r4 = 0
            r3 = 16
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            X.C162177rO.A03(r7, r0)
            r6.A08 = r7
            android.os.Handler r2 = r6.A0G
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0C
            int r1 = r0.get()
            r0 = 3
            android.os.Message r0 = r2.obtainMessage(r0, r1, r3, r4)
            r2.sendMessage(r0)
            return
        L_0x00a5:
            super.AzV(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6RY.AzV(X.8lo):void");
    }

    public final boolean Bjr() {
        return AnonymousClass000.A1T(this.A09.A01() ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6RY(android.content.Context r11, android.os.Looper r12, X.C187778xn r13, X.C187788xo r14, X.AnonymousClass7P4 r15) {
        /*
            r10 = this;
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r4 = r11
            X.C162177rO.A02(r11)
            java.lang.Class<X.7pR> r1 = X.C161327pR.class
            monitor-enter(r1)
            X.7pR r0 = X.C161327pR.A01     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x001a
            X.7pR r0 = new X.7pR     // Catch:{ all -> 0x006e }
            r0.<init>(r11)     // Catch:{ all -> 0x006e }
            X.C161327pR.A01 = r0     // Catch:{ all -> 0x006e }
        L_0x001a:
            monitor-exit(r1)     // Catch:{ all -> 0x006e }
            X.7pR r1 = X.C161327pR.A01
            r9 = 14
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.7RQ r0 = new X.7RQ
            r0.<init>()
            r10.A00 = r0
            X.7RQ r0 = new X.7RQ
            r0.<init>()
            r10.A01 = r0
            X.7RQ r0 = new X.7RQ
            r0.<init>()
            r10.A02 = r0
            X.7RQ r0 = new X.7RQ
            r0.<init>()
            r10.A03 = r0
            X.7RQ r0 = new X.7RQ
            r0.<init>()
            r10.A04 = r0
            X.7RQ r0 = new X.7RQ
            r0.<init>()
            r10.A05 = r0
            X.7RQ r0 = new X.7RQ
            r0.<init>()
            r10.A06 = r0
            X.7RQ r0 = new X.7RQ
            r0.<init>()
            r10.A07 = r0
            X.7RQ r0 = new X.7RQ
            r0.<init>()
            r10.A08 = r0
            X.C162177rO.A02(r2)
            r10.A0A = r2
            r10.A09 = r1
            return
        L_0x006e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6RY.<init>(android.content.Context, android.os.Looper, X.8xn, X.8xo, X.7P4):void");
    }

    public final int B9m() {
        return 8600000;
    }
}
