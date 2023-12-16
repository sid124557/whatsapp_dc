package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;
import com.whatsapp.util.Log;

/* renamed from: X.37I  reason: invalid class name */
public class AnonymousClass37I implements ServiceConnection {
    public IInterface A00;
    public AnonymousClass216 A01;
    public AnonymousClass2I5 A02;
    public final Context A03;
    public final C55682qk A04;
    public final AnonymousClass2I4 A05;
    public final Object A06 = AnonymousClass002.A0D();

    public void onBindingDied(ComponentName componentName) {
        A00("binder-died");
    }

    public void onNullBinding(ComponentName componentName) {
        A00("binder-null");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        IInterface r1;
        if (iBinder != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("svc-connection/attach-binder; service=");
            String A0X = AnonymousClass000.A0X("GoogleMigrateClient", A0o);
            Log.i(A0X);
            Object obj = this.A06;
            synchronized (obj) {
                AnonymousClass216 r2 = this.A01;
                z = false;
                if (r2 == AnonymousClass216.CONNECTING) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof IAppDataReaderService)) {
                        r1 = new C10050hB(iBinder);
                    } else {
                        r1 = (IAppDataReaderService) queryLocalInterface;
                    }
                    this.A00 = r1;
                    this.A01 = AnonymousClass216.CONNECTED;
                    obj.notifyAll();
                    StringBuilder A0l = AnonymousClass000.A0l(A0X);
                    A0l.append(" -> state=");
                    C18260x0.A0o(this.A01, A0l);
                } else {
                    C18260x0.A1Q(AnonymousClass000.A0l(A0X), ", attached while in a wrong state=", r2);
                    C55682qk r3 = this.A04;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("unexpected state=");
                    r3.A0A("svc-connection-attach-binder-failure", false, AnonymousClass000.A0R(this.A01, A0o2));
                    z = true;
                }
            }
            if (z) {
                A01(true);
                return;
            }
            return;
        }
        A00("binder-null-on-connect");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        A00("disconnected");
    }

    public AnonymousClass37I(Context context, C55682qk r3, AnonymousClass2I4 r4, AnonymousClass2I5 r5) {
        this.A03 = context;
        this.A04 = r3;
        this.A05 = r4;
        this.A02 = r5;
        this.A01 = AnonymousClass216.NEW;
    }

    public void A00(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("svc-connection/detach-binder; service=");
        String A0X = AnonymousClass000.A0X("GoogleMigrateClient", A0o);
        C18260x0.A0s(", reason=", str, AnonymousClass000.A0l(A0X));
        synchronized (this.A06) {
            AnonymousClass216 r2 = this.A01;
            if (!(r2 == AnonymousClass216.CONNECTING || r2 == AnonymousClass216.CONNECTED)) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                AnonymousClass001.A1K(A0X, ", reason=", str, A0o2);
                C18260x0.A1Q(A0o2, ", detached while in wrong state=", r2);
                C55682qk r3 = this.A04;
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("reason=");
                A0o3.append(str);
                A0o3.append(", unexpected state=");
                r3.A0A("svc-connection-detach-binder-failure", false, AnonymousClass000.A0R(this.A01, A0o3));
            }
        }
        A01(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r7 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        r4 = r2.A00;
        X.C18260x0.A0q("svc-client/onConnectionClosed; service=", "GoogleMigrateClient", X.AnonymousClass001.A0o());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r4.A01 == r6) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        r4.A05.A0A("svc-client-close-unexpected-connection", false, X.AnonymousClass000.A0V("name=", "GoogleMigrateClient", X.AnonymousClass001.A0o()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        r4.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        r6.A03.unbindService(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(boolean r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "svc-connection/close; service="
            r1.append(r0)
            java.lang.String r5 = "GoogleMigrateClient"
            java.lang.String r4 = X.AnonymousClass000.A0X(r5, r1)
            com.whatsapp.util.Log.i((java.lang.String) r4)
            java.lang.Object r3 = r6.A06
            monitor-enter(r3)
            X.216 r0 = r6.A01     // Catch:{ all -> 0x0070 }
            X.216 r1 = X.AnonymousClass216.CLOSED     // Catch:{ all -> 0x0070 }
            if (r0 != r1) goto L_0x001e
            monitor-exit(r3)     // Catch:{ all -> 0x0070 }
            return
        L_0x001e:
            X.2I5 r2 = r6.A02     // Catch:{ all -> 0x0070 }
            r0 = 0
            r6.A02 = r0     // Catch:{ all -> 0x0070 }
            r6.A01 = r1     // Catch:{ all -> 0x0070 }
            r3.notifyAll()     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r4)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = " -> state="
            r1.append(r0)     // Catch:{ all -> 0x0070 }
            X.216 r0 = r6.A01     // Catch:{ all -> 0x0070 }
            X.C18260x0.A0o(r0, r1)     // Catch:{ all -> 0x0070 }
            monitor-exit(r3)     // Catch:{ all -> 0x0070 }
            android.content.Context r0 = r6.A03
            r0.unbindService(r6)
            if (r7 == 0) goto L_0x006f
            if (r2 == 0) goto L_0x006f
            X.2r6 r4 = r2.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "svc-client/onConnectionClosed; service="
            X.C18260x0.A0q(r0, r5, r1)
            monitor-enter(r4)
            X.37I r0 = r4.A01     // Catch:{ all -> 0x006c }
            if (r0 == r6) goto L_0x0067
            X.2qk r3 = r4.A05     // Catch:{ all -> 0x006c }
            java.lang.String r2 = "svc-client-close-unexpected-connection"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "name="
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r5, r1)     // Catch:{ all -> 0x006c }
            r0 = 0
            r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x006c }
        L_0x0065:
            monitor-exit(r4)     // Catch:{ all -> 0x006c }
            goto L_0x006b
        L_0x0067:
            r0 = 0
            r4.A01 = r0     // Catch:{ all -> 0x006c }
            goto L_0x0065
        L_0x006b:
            return
        L_0x006c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006c }
            throw r0
        L_0x006f:
            return
        L_0x0070:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0070 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37I.A01(boolean):void");
    }
}
