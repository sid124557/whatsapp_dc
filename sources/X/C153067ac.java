package X;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.7ac  reason: invalid class name and case insensitive filesystem */
public abstract class C153067ac {
    public Object A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final Context A03;
    public final Object A04 = AnonymousClass002.A0D();
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: X.7rU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00() {
        /*
            r9 = this;
            java.lang.Object r3 = r9.A04
            monitor-enter(r3)
            java.lang.Object r0 = r9.A00     // Catch:{ all -> 0x016d }
            if (r0 != 0) goto L_0x015c
            r4 = 1
            android.content.Context r2 = r9.A03     // Catch:{ 6zH -> 0x0013 }
            X.8lr r1 = X.C162227rU.A09     // Catch:{ 6zH -> 0x0013 }
            java.lang.String r0 = r9.A06     // Catch:{ 6zH -> 0x0013 }
            X.7rU r6 = X.C162227rU.A04(r2, r1, r0)     // Catch:{ 6zH -> 0x0013 }
            goto L_0x0084
        L_0x0013:
            java.lang.String r2 = "%s.%s"
            java.lang.Object[] r1 = X.AnonymousClass002.A0M()     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "com.google.android.gms.vision"
            r8 = 0
            r1[r8] = r0     // Catch:{ all -> 0x016d }
            java.lang.String r5 = r9.A07     // Catch:{ all -> 0x016d }
            r1[r4] = r5     // Catch:{ all -> 0x016d }
            java.lang.String r7 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x016d }
            java.lang.String r2 = "Cannot load thick client module, fall back to load optional module %s"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x016d }
            r1[r8] = r7     // Catch:{ all -> 0x016d }
            r0 = 3
            java.lang.String r6 = "Vision"
            boolean r0 = android.util.Log.isLoggable(r6, r0)     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x016d }
            android.util.Log.d(r6, r0)     // Catch:{ all -> 0x016d }
        L_0x003c:
            android.content.Context r1 = r9.A03     // Catch:{ 6zH -> 0x0045 }
            X.8lr r0 = X.C162227rU.A0A     // Catch:{ 6zH -> 0x0045 }
            X.7rU r6 = X.C162227rU.A04(r1, r0, r7)     // Catch:{ 6zH -> 0x0045 }
            goto L_0x0084
        L_0x0045:
            r2 = move-exception
            java.lang.String r1 = "Error loading optional module %s"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x016d }
            r0[r8] = r7     // Catch:{ all -> 0x016d }
            X.C1445872d.A00(r1, r2, r0)     // Catch:{ all -> 0x016d }
            boolean r0 = r9.A01     // Catch:{ all -> 0x016d }
            if (r0 != 0) goto L_0x0083
            java.lang.String r2 = "Broadcasting download intent for dependency %s"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x016d }
            r1[r8] = r5     // Catch:{ all -> 0x016d }
            boolean r0 = X.AnonymousClass6C9.A1Q(r6)     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x016d }
            android.util.Log.d(r6, r0)     // Catch:{ all -> 0x016d }
        L_0x0066:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x016d }
            r2.<init>()     // Catch:{ all -> 0x016d }
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r0 = "com.google.android.gms.vision.DependencyBroadcastReceiverProxy"
            r2.setClassName(r1, r0)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "com.google.android.gms.vision.DEPENDENCIES"
            r2.putExtra(r0, r5)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "com.google.android.gms.vision.DEPENDENCY"
            r2.setAction(r0)     // Catch:{ all -> 0x016d }
            android.content.Context r0 = r9.A03     // Catch:{ all -> 0x016d }
            r0.sendBroadcast(r2)     // Catch:{ all -> 0x016d }
            r9.A01 = r4     // Catch:{ all -> 0x016d }
        L_0x0083:
            r6 = 0
        L_0x0084:
            if (r6 == 0) goto L_0x0149
            android.content.Context r7 = r9.A03     // Catch:{ 6zH | RemoteException -> 0x0141 }
            r2 = r9
            boolean r0 = r9 instanceof X.AnonymousClass6YK     // Catch:{ 6zH | RemoteException -> 0x0141 }
            if (r0 == 0) goto L_0x00df
            X.6YK r2 = (X.AnonymousClass6YK) r2     // Catch:{ 6zH | RemoteException -> 0x0141 }
            java.lang.String r0 = "com.google.android.gms.vision.dynamite.face"
            int r5 = X.C162227rU.A00(r7, r0)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            java.lang.String r1 = "com.google.android.gms.vision.dynamite"
            r0 = 0
            int r0 = X.C162227rU.A01(r7, r1, r0)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            if (r5 <= r0) goto L_0x00b5
            java.lang.String r0 = "com.google.android.gms.vision.face.NativeFaceDetectorV2Creator"
        L_0x00a0:
            android.os.IBinder r1 = r6.A09(r0)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            if (r1 == 0) goto L_0x00dd
            java.lang.String r0 = "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator"
            android.os.IInterface r5 = r1.queryLocalInterface(r0)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            boolean r0 = r5 instanceof X.C187218wm     // Catch:{ 6zH | RemoteException -> 0x0141 }
            if (r0 == 0) goto L_0x00b8
            X.8wm r5 = (X.C187218wm) r5     // Catch:{ 6zH | RemoteException -> 0x0141 }
            if (r5 != 0) goto L_0x00bd
            goto L_0x00dd
        L_0x00b5:
            java.lang.String r0 = "com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"
            goto L_0x00a0
        L_0x00b8:
            X.6XP r5 = new X.6XP     // Catch:{ 6zH | RemoteException -> 0x0141 }
            r5.<init>(r1)     // Catch:{ 6zH | RemoteException -> 0x0141 }
        L_0x00bd:
            X.6UT r0 = new X.6UT     // Catch:{ 6zH | RemoteException -> 0x0141 }
            r0.<init>(r7)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            X.6Ta r2 = r2.A00     // Catch:{ 6zH | RemoteException -> 0x0141 }
            X.C162177rO.A02(r2)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            X.7tN r5 = (X.C163167tN) r5     // Catch:{ 6zH | RemoteException -> 0x0141 }
            android.os.Parcel r1 = X.AnonymousClass6DX.A00(r0, r5)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            r0 = 0
            X.AnonymousClass001.A15(r1, r2, r0)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            android.os.Parcel r2 = r5.A00(r1)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            android.os.IBinder r1 = r2.readStrongBinder()     // Catch:{ 6zH | RemoteException -> 0x0141 }
            if (r1 != 0) goto L_0x012c
            r6 = 0
            goto L_0x013b
        L_0x00dd:
            r6 = 0
            goto L_0x013e
        L_0x00df:
            X.6YJ r2 = (X.AnonymousClass6YJ) r2     // Catch:{ 6zH | RemoteException -> 0x0141 }
            java.lang.String r0 = "com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"
            android.os.IBinder r1 = r6.A09(r0)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            r6 = 0
            if (r1 == 0) goto L_0x013e
            java.lang.String r0 = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator"
            android.os.IInterface r5 = r1.queryLocalInterface(r0)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            boolean r0 = r5 instanceof X.C187168wc     // Catch:{ 6zH | RemoteException -> 0x0141 }
            if (r0 == 0) goto L_0x00f9
            X.8wc r5 = (X.C187168wc) r5     // Catch:{ 6zH | RemoteException -> 0x0141 }
            if (r5 != 0) goto L_0x00fe
            goto L_0x013e
        L_0x00f9:
            X.6XN r5 = new X.6XN     // Catch:{ 6zH | RemoteException -> 0x0141 }
            r5.<init>(r1)     // Catch:{ 6zH | RemoteException -> 0x0141 }
        L_0x00fe:
            X.6UT r0 = new X.6UT     // Catch:{ 6zH | RemoteException -> 0x0141 }
            r0.<init>(r7)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            X.6TM r2 = r2.A00     // Catch:{ 6zH | RemoteException -> 0x0141 }
            X.C162177rO.A02(r2)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            X.7tN r5 = (X.C163167tN) r5     // Catch:{ 6zH | RemoteException -> 0x0141 }
            android.os.Parcel r1 = X.AnonymousClass6DX.A00(r0, r5)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            r0 = 0
            X.AnonymousClass001.A15(r1, r2, r0)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            android.os.Parcel r2 = r5.A00(r1)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            android.os.IBinder r1 = r2.readStrongBinder()     // Catch:{ 6zH | RemoteException -> 0x0141 }
            if (r1 == 0) goto L_0x013b
            java.lang.String r0 = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector"
            android.os.IInterface r6 = r1.queryLocalInterface(r0)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            boolean r0 = r6 instanceof X.C187158wb     // Catch:{ 6zH | RemoteException -> 0x0141 }
            if (r0 != 0) goto L_0x013b
            X.6XM r6 = new X.6XM     // Catch:{ 6zH | RemoteException -> 0x0141 }
            r6.<init>(r1)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            goto L_0x013b
        L_0x012c:
            java.lang.String r0 = "com.google.android.gms.vision.face.internal.client.INativeFaceDetector"
            android.os.IInterface r6 = r1.queryLocalInterface(r0)     // Catch:{ 6zH | RemoteException -> 0x0141 }
            boolean r0 = r6 instanceof X.C187208wl     // Catch:{ 6zH | RemoteException -> 0x0141 }
            if (r0 != 0) goto L_0x013b
            X.6XO r6 = new X.6XO     // Catch:{ 6zH | RemoteException -> 0x0141 }
            r6.<init>(r1)     // Catch:{ 6zH | RemoteException -> 0x0141 }
        L_0x013b:
            r2.recycle()     // Catch:{ 6zH | RemoteException -> 0x0141 }
        L_0x013e:
            r9.A00 = r6     // Catch:{ 6zH | RemoteException -> 0x0141 }
            goto L_0x0149
        L_0x0141:
            r2 = move-exception
            java.lang.String r1 = r9.A05     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "Error creating remote native handle"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x016d }
        L_0x0149:
            boolean r1 = r9.A02     // Catch:{ all -> 0x016d }
            if (r1 != 0) goto L_0x015e
            java.lang.Object r0 = r9.A00     // Catch:{ all -> 0x016d }
            if (r0 != 0) goto L_0x015e
            java.lang.String r1 = r9.A05     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "Native handle not yet available. Reverting to no-op handle."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x016d }
            r9.A02 = r4     // Catch:{ all -> 0x016d }
        L_0x015a:
            java.lang.Object r0 = r9.A00     // Catch:{ all -> 0x016d }
        L_0x015c:
            monitor-exit(r3)     // Catch:{ all -> 0x016d }
            goto L_0x016c
        L_0x015e:
            if (r1 == 0) goto L_0x015a
            java.lang.Object r0 = r9.A00     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x015a
            java.lang.String r1 = r9.A05     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "Native handle is now available."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x016d }
            goto L_0x015a
        L_0x016c:
            return r0
        L_0x016d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x016d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153067ac.A00():java.lang.Object");
    }

    public final void A01() {
        Object obj;
        Parcel obtain;
        Parcel obtain2;
        synchronized (this.A04) {
            if (this.A00 != null) {
                try {
                    if (this instanceof AnonymousClass6YK) {
                        Object A002 = A00();
                        C162177rO.A02(A002);
                        obj = (C187208wl) A002;
                    } else if (A00() != null) {
                        Object A003 = A00();
                        C162177rO.A02(A003);
                        obj = (C187158wb) A003;
                    }
                    C163167tN r4 = (C163167tN) obj;
                    obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(r4.A01);
                    obtain2 = Parcel.obtain();
                    AnonymousClass000.A0w(r4.A00, obtain, obtain2, 3);
                    obtain.recycle();
                    obtain2.recycle();
                } catch (RemoteException e) {
                    Log.e(this.A05, "Could not finalize native handle", e);
                } catch (Throwable th) {
                    obtain.recycle();
                    obtain2.recycle();
                    throw th;
                }
            }
        }
    }

    public C153067ac(Context context, String str, String str2) {
        String str3;
        this.A03 = context;
        this.A05 = str;
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str3 = "com.google.android.gms.vision.dynamite.".concat(valueOf);
        } else {
            str3 = new String("com.google.android.gms.vision.dynamite.");
        }
        this.A06 = str3;
        this.A07 = str2;
    }
}
