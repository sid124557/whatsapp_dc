package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.6Qz  reason: invalid class name and case insensitive filesystem */
public abstract class C127186Qz extends BasePendingResult implements C180848lj {
    public final AnonymousClass72H A00;
    public final C148727Jm A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127186Qz(C148727Jm r2, C159087l6 r3) {
        super(r3);
        C162177rO.A03(r3, "GoogleApiClient must not be null");
        C162177rO.A03(r2, "Api must not be null");
        this.A00 = r2.A01;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r8v5, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r2v29, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r2v36 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:20|(4:22|23|24|(1:32))|33|34|(1:36)|37) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00bc */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd A[Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C178348hO r21) {
        /*
            r20 = this;
            r5 = r21
            r0 = r20
            boolean r1 = r0 instanceof X.C128976Ye     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            if (r1 == 0) goto L_0x0024
            X.7oP r5 = (X.C160847oP) r5     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.IInterface r7 = r5.A02()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.7tJ r7 = (X.C163127tJ) r7     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.6Ya r2 = new X.6Ya     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r2.<init>(r0)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r1 = r7.A01     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r5.writeInterfaceToken(r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r5.writeStrongBinder(r2)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r2 = 15
            goto L_0x0055
        L_0x0024:
            boolean r1 = r0 instanceof X.C128986Yf     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            if (r1 == 0) goto L_0x0060
            r1 = r0
            X.6Yf r1 = (X.C128986Yf) r1     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.7oP r5 = (X.C160847oP) r5     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r6 = r1.A00     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r4 = "/altLinkingPrefillResponse"
            byte[] r3 = r1.A01     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.IInterface r7 = r5.A02()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.7tJ r7 = (X.C163127tJ) r7     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.6Yb r2 = new X.6Yb     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r2.<init>(r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r1 = r7.A01     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r5.writeInterfaceToken(r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r5.writeStrongBinder(r2)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r5.writeString(r6)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r5.writeString(r4)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r5.writeByteArray(r3)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r2 = 12
        L_0x0055:
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.IBinder r1 = r7.A00     // Catch:{ all -> 0x00e3 }
            X.AnonymousClass000.A0w(r1, r5, r4, r2)     // Catch:{ all -> 0x00e3 }
            goto L_0x0238
        L_0x0060:
            boolean r1 = r0 instanceof X.AnonymousClass6XJ     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            if (r1 == 0) goto L_0x0082
            r1 = r0
            X.6XJ r1 = (X.AnonymousClass6XJ) r1     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.7oP r5 = (X.C160847oP) r5     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.8wu r2 = r1.A00     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.IInterface r3 = r5.A02()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.7tF r3 = (X.C163087tF) r3     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r1 = "com.google.android.gms.safetynet.internal.ISafetyNetService"
            r5.writeInterfaceToken(r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            if (r2 != 0) goto L_0x007d
            r2 = 0
        L_0x007d:
            r5.writeStrongBinder(r2)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r2 = 5
            goto L_0x00d8
        L_0x0082:
            boolean r1 = r0 instanceof X.AnonymousClass6XK     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            if (r1 == 0) goto L_0x00ec
            r1 = r0
            X.6XK r1 = (X.AnonymousClass6XK) r1     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.6RL r5 = (X.AnonymousClass6RL) r5     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.8wu r8 = r1.A00     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            byte[] r7 = r1.A02     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r6 = r1.A01     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            if (r1 == 0) goto L_0x00bc
            java.lang.String r4 = "com.google.android.safetynet.ATTEST_API_KEY"
            java.lang.String r6 = ""
            android.content.Context r1 = r5.A00     // Catch:{ NameNotFoundException -> 0x00bc }
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00bc }
            if (r3 == 0) goto L_0x00bc
            java.lang.String r2 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x00bc }
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x00bc }
            if (r1 == 0) goto L_0x00bc
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x00bc }
            if (r1 == 0) goto L_0x00bc
            java.lang.Object r1 = r1.get(r4)     // Catch:{ NameNotFoundException -> 0x00bc }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NameNotFoundException -> 0x00bc }
            if (r1 == 0) goto L_0x00bc
            r6 = r1
        L_0x00bc:
            android.os.IInterface r3 = r5.A02()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.7tF r3 = (X.C163087tF) r3     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r1 = "com.google.android.gms.safetynet.internal.ISafetyNetService"
            r5.writeInterfaceToken(r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            if (r8 != 0) goto L_0x00ce
            r8 = 0
        L_0x00ce:
            r5.writeStrongBinder(r8)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r5.writeByteArray(r7)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r5.writeString(r6)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r2 = 7
        L_0x00d8:
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.IBinder r1 = r3.A00     // Catch:{ all -> 0x00e3 }
            X.AnonymousClass000.A0w(r1, r5, r4, r2)     // Catch:{ all -> 0x00e3 }
            goto L_0x0238
        L_0x00e3:
            r1 = move-exception
            r5.recycle()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r4.recycle()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            goto L_0x0243
        L_0x00ec:
            boolean r1 = r0 instanceof X.C128606Wt     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            if (r1 == 0) goto L_0x0150
            r6 = r0
            X.6Wt r6 = (X.C128606Wt) r6     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.6RX r5 = (X.AnonymousClass6RX) r5     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.8hu r3 = r6.A00     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.Class<X.8hu> r1 = X.C178668hu.class
            java.lang.String r2 = r1.getSimpleName()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r1 = "Listener must not be null"
            X.C162177rO.A03(r3, r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r1 = "Listener type must not be null"
            X.C162177rO.A03(r2, r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r1 = "Listener type must not be empty"
            X.C162177rO.A07(r2, r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.7Vg r4 = new X.7Vg     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r4.<init>(r3, r2)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.6Wm r7 = new X.6Wm     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r7.<init>(r6)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.7Ng r2 = r5.A00     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.8hn r1 = r2.A01     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.8Ae r1 = (X.C169668Ae) r1     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.6RX r3 = r1.A00     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r3.A04()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.util.Map r2 = r2.A02     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            monitor-enter(r2)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.Object r5 = r2.remove(r4)     // Catch:{ all -> 0x014c }
            X.6Ws r5 = (X.C128596Ws) r5     // Catch:{ all -> 0x014c }
            if (r5 == 0) goto L_0x014a
            monitor-enter(r5)     // Catch:{ all -> 0x014c }
            X.7Jn r1 = r5.A00     // Catch:{ all -> 0x0135 }
            r4 = 0
            r1.A02 = r4     // Catch:{ all -> 0x0135 }
            r1.A01 = r4     // Catch:{ all -> 0x0135 }
            goto L_0x0138
        L_0x0135:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x014c }
            throw r1     // Catch:{ all -> 0x014c }
        L_0x0138:
            monitor-exit(r5)     // Catch:{ all -> 0x014c }
            android.os.IInterface r1 = r3.A02()     // Catch:{ all -> 0x014c }
            X.8wq r1 = (X.C187248wq) r1     // Catch:{ all -> 0x014c }
            r9 = 2
            X.6SR r3 = new X.6SR     // Catch:{ all -> 0x014c }
            r8 = r4
            r6 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x014c }
            r1.BuH(r3)     // Catch:{ all -> 0x014c }
        L_0x014a:
            monitor-exit(r2)     // Catch:{ all -> 0x014c }
            return
        L_0x014c:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x014c }
            goto L_0x0243
        L_0x0150:
            boolean r1 = r0 instanceof X.C128616Wu     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            if (r1 == 0) goto L_0x01e5
            r1 = r0
            X.6Wu r1 = (X.C128616Wu) r1     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.6RX r5 = (X.AnonymousClass6RX) r5     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.6Wm r6 = new X.6Wm     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r6.<init>(r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            com.google.android.gms.location.LocationRequest r8 = r1.A01     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.8hu r4 = r1.A00     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            boolean r2 = X.AnonymousClass000.A1W(r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r1 = "Can't create handler inside thread that has not called Looper.prepare()"
            X.C162177rO.A04(r1, r2)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.Looper r3 = android.os.Looper.myLooper()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.Class<X.8hu> r1 = X.C178668hu.class
            java.lang.String r2 = r1.getSimpleName()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r1 = "Listener must not be null"
            X.C162177rO.A03(r4, r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r1 = "Looper must not be null"
            X.C162177rO.A03(r3, r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r1 = "Listener type must not be null"
            X.C162177rO.A03(r2, r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.7Jn r7 = new X.7Jn     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r7.<init>(r3, r4, r2)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.7Ng r4 = r5.A00     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            monitor-enter(r4)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.8hn r1 = r4.A01     // Catch:{ all -> 0x01e2 }
            X.8Ae r1 = (X.C169668Ae) r1     // Catch:{ all -> 0x01e2 }
            X.6RX r5 = r1.A00     // Catch:{ all -> 0x01e2 }
            r5.A04()     // Catch:{ all -> 0x01e2 }
            X.7Vg r1 = r7.A01     // Catch:{ all -> 0x01e2 }
            r9 = 0
            if (r1 == 0) goto L_0x01e0
            java.util.Map r2 = r4.A02     // Catch:{ all -> 0x01e2 }
            monitor-enter(r2)     // Catch:{ all -> 0x01e2 }
            java.lang.Object r3 = r2.get(r1)     // Catch:{ all -> 0x01b3 }
            X.6Ws r3 = (X.C128596Ws) r3     // Catch:{ all -> 0x01b3 }
            if (r3 != 0) goto L_0x01ae
            X.6Ws r3 = new X.6Ws     // Catch:{ all -> 0x01b3 }
            r3.<init>(r7)     // Catch:{ all -> 0x01b3 }
        L_0x01ae:
            r2.put(r1, r3)     // Catch:{ all -> 0x01b3 }
            monitor-exit(r2)     // Catch:{ all -> 0x01b3 }
            goto L_0x01b6
        L_0x01b3:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01b3 }
            throw r1     // Catch:{ all -> 0x01e2 }
        L_0x01b6:
            android.os.IInterface r2 = r5.A02()     // Catch:{ all -> 0x01e2 }
            X.8wq r2 = (X.C187248wq) r2     // Catch:{ all -> 0x01e2 }
            java.util.List r12 = X.AnonymousClass6TG.A0B     // Catch:{ all -> 0x01e2 }
            r15 = 0
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.6TG r7 = new X.6TG     // Catch:{ all -> 0x01e2 }
            r11 = r9
            r17 = r15
            r18 = r15
            r19 = r15
            r10 = r9
            r16 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01e2 }
            r14 = 1
            X.6SR r1 = new X.6SR     // Catch:{ all -> 0x01e2 }
            r8 = r1
            r10 = r3
            r12 = r6
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01e2 }
            r2.BuH(r1)     // Catch:{ all -> 0x01e2 }
        L_0x01e0:
            monitor-exit(r4)     // Catch:{ all -> 0x01e2 }
            return
        L_0x01e2:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01e2 }
            goto L_0x0243
        L_0x01e5:
            boolean r1 = r0 instanceof X.C127166Qw     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            if (r1 == 0) goto L_0x0277
            r4 = r0
            X.6Qw r4 = (X.C127166Qw) r4     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.7oP r5 = (X.C160847oP) r5     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.6WE r8 = new X.6WE     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r8.<init>(r4)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.6Tk r7 = r4.A00     // Catch:{ RuntimeException -> 0x0262 }
            X.6WC r6 = r7.A08     // Catch:{ RuntimeException -> 0x0262 }
            int r3 = r6.A02()     // Catch:{ RuntimeException -> 0x0262 }
            r6.A00 = r3     // Catch:{ RuntimeException -> 0x0262 }
            byte[] r2 = new byte[r3]     // Catch:{ RuntimeException -> 0x0262 }
            X.7qQ r1 = new X.7qQ     // Catch:{ IOException -> 0x025a }
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x025a }
            r6.A04(r1)     // Catch:{ IOException -> 0x025a }
            java.nio.ByteBuffer r3 = r1.A02     // Catch:{ IOException -> 0x025a }
            int r1 = r3.remaining()     // Catch:{ IOException -> 0x025a }
            if (r1 != 0) goto L_0x0244
            r7.A02 = r2     // Catch:{ RuntimeException -> 0x0262 }
            android.os.IInterface r2 = r5.A02()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.8wX r2 = (X.C187118wX) r2     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.7tR r2 = (X.C163207tR) r2     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            java.lang.String r1 = "com.google.android.gms.clearcut.internal.IClearcutLoggerService"
            r4.writeInterfaceToken(r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.IBinder r1 = r8.asBinder()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r4.writeStrongBinder(r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r1 = 0
            r3 = 1
            r4.writeInt(r3)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r7.writeToParcel(r4, r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.IBinder r2 = r2.A00     // Catch:{ all -> 0x023f }
            r1 = 0
            r2.transact(r3, r4, r1, r3)     // Catch:{ all -> 0x023f }
            goto L_0x023b
        L_0x0238:
            r5.recycle()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
        L_0x023b:
            r4.recycle()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            return
        L_0x023f:
            r1 = move-exception
            r4.recycle()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
        L_0x0243:
            throw r1     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
        L_0x0244:
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()     // Catch:{ IOException -> 0x025a }
            int r1 = r3.remaining()     // Catch:{ IOException -> 0x025a }
            X.AnonymousClass000.A1L(r2, r1)     // Catch:{ IOException -> 0x025a }
            java.lang.String r1 = "Did not write as much data as expected, %s bytes remaining."
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ IOException -> 0x025a }
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r1)     // Catch:{ IOException -> 0x025a }
            throw r1     // Catch:{ IOException -> 0x025a }
        L_0x025a:
            r2 = move-exception
            java.lang.String r1 = "Serializing to a byte array threw an IOException (should never happen)."
            java.lang.RuntimeException r1 = X.AnonymousClass6CA.A0Q(r1, r2)     // Catch:{ RuntimeException -> 0x0262 }
            throw r1     // Catch:{ RuntimeException -> 0x0262 }
        L_0x0262:
            r3 = move-exception
            java.lang.String r2 = "ClearcutLoggerApiImpl"
            java.lang.String r1 = "derived ClearcutLogger.MessageProducer "
            android.util.Log.e(r2, r1, r3)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r3 = 10
            java.lang.String r2 = "MessageProducer"
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r1.<init>(r3, r2)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r4.A09(r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            return
        L_0x0277:
            boolean r1 = r0 instanceof X.AnonymousClass6Q6     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            if (r1 == 0) goto L_0x0297
            r1 = r0
            X.6Q6 r1 = (X.AnonymousClass6Q6) r1     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.6RO r5 = (X.AnonymousClass6RO) r5     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.IInterface r3 = r5.A02()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.7tG r3 = (X.C163097tG) r3     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.6Q4 r2 = new X.6Q4     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r2.<init>(r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r5.A00     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.Parcel r2 = X.AnonymousClass6DT.A00(r1, r3, r2)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r1 = 103(0x67, float:1.44E-43)
        L_0x0293:
            r3.A00(r1, r2)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            goto L_0x02b0
        L_0x0297:
            r1 = r0
            X.6Q5 r1 = (X.AnonymousClass6Q5) r1     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.6RO r5 = (X.AnonymousClass6RO) r5     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.IInterface r3 = r5.A02()     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.7tG r3 = (X.C163097tG) r3     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            X.6Q3 r2 = new X.6Q3     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r2.<init>(r1)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r5.A00     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            android.os.Parcel r2 = X.AnonymousClass6DT.A00(r1, r3, r2)     // Catch:{ DeadObjectException -> 0x02c4, RemoteException -> 0x02b1 }
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x0293
        L_0x02b0:
            return
        L_0x02b1:
            r1 = move-exception
            java.lang.String r4 = r1.getLocalizedMessage()
            r2 = 0
            r6 = 8
            r5 = 1
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A09(r1)
            return
        L_0x02c4:
            r1 = move-exception
            java.lang.String r5 = r1.getLocalizedMessage()
            r3 = 0
            r7 = 8
            r6 = 1
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r4 = r3
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A09(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127186Qz.A08(X.8hO):void");
    }

    public final void A09(Status status) {
        if (!AnonymousClass0x7.A1P(status.A01)) {
            A05(A02(status));
            return;
        }
        throw AnonymousClass6C7.A0U("Failed result must not be success");
    }

    public /* bridge */ /* synthetic */ void BnG(Object obj) {
        A05((C180828lh) obj);
    }
}
