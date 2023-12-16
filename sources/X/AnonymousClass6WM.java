package X;

import android.os.Looper;

/* renamed from: X.6WM  reason: invalid class name */
public final class AnonymousClass6WM extends C124816Dz {
    public final /* synthetic */ C160847oP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6WM(Looper looper, C160847oP r2) {
        super(looper);
        this.A00 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02c5, code lost:
        if (r9 != null) goto L_0x0162;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r13) {
        /*
            r12 = this;
            X.7oP r2 = r12.A00
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0C
            int r1 = r0.get()
            int r0 = r13.arg1
            if (r1 == r0) goto L_0x001f
            int r2 = r13.what
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x0017
            if (r2 == r0) goto L_0x0017
            r0 = 7
            if (r2 != r0) goto L_0x001e
        L_0x0017:
            java.lang.Object r0 = r13.obj
            X.7Sq r0 = (X.C150897Sq) r0
            r0.A00()
        L_0x001e:
            return
        L_0x001f:
            int r1 = r13.what
            r7 = 4
            r6 = 1
            r8 = 5
            if (r1 == r6) goto L_0x002d
            r0 = 7
            if (r1 == r0) goto L_0x002d
            if (r1 == r7) goto L_0x002d
            if (r1 != r8) goto L_0x0033
        L_0x002d:
            boolean r0 = r2.BHI()
            if (r0 == 0) goto L_0x0017
        L_0x0033:
            int r1 = r13.what
            r5 = 8
            r3 = 3
            r4 = 0
            if (r1 != r7) goto L_0x0063
            int r1 = r13.arg2
            X.6Tp r0 = new X.6Tp
            r0.<init>(r1)
            r2.A07 = r0
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x0087
            java.lang.String r1 = r2.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0087
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0087
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0087 }
            boolean r0 = r2.A0D
            if (r0 != 0) goto L_0x0087
            r2.A06(r4, r3)
            return
        L_0x0063:
            if (r1 == r8) goto L_0x0087
            if (r1 != r3) goto L_0x0091
            java.lang.Object r1 = r13.obj
            boolean r0 = r1 instanceof android.app.PendingIntent
            if (r0 == 0) goto L_0x0070
            r4 = r1
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4
        L_0x0070:
            int r0 = r13.arg2
            X.6Tp r1 = new X.6Tp
            r1.<init>(r0, r4)
        L_0x0077:
            X.8lo r0 = r2.A08
            r0.Ba1(r1)
            int r0 = r1.A01
            r2.A01 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A05 = r0
            return
        L_0x0087:
            X.6Tp r1 = r2.A07
            if (r1 != 0) goto L_0x0077
            X.6Tp r1 = new X.6Tp
            r1.<init>(r5)
            goto L_0x0077
        L_0x0091:
            r0 = 6
            if (r1 != r0) goto L_0x00b2
            r2.A06(r4, r8)
            X.8hT r0 = r2.A0J
            if (r0 == 0) goto L_0x00a4
            int r1 = r13.arg2
            X.89i r0 = (X.C1694489i) r0
            X.8qr r0 = r0.A00
            r0.onConnectionSuspended(r1)
        L_0x00a4:
            int r0 = r13.arg2
            r2.A00 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A03 = r0
            X.C160847oP.A01(r4, r2, r8, r6)
            return
        L_0x00b2:
            r0 = 2
            if (r1 != r0) goto L_0x00bb
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x0017
        L_0x00bb:
            int r1 = r13.what
            r0 = 2
            if (r1 == r0) goto L_0x00e0
            if (r1 == r6) goto L_0x00e0
            r0 = 7
            if (r1 == r0) goto L_0x00e0
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Don't know how to handle message: "
            r3.append(r0)
            r3.append(r1)
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r1 = "GmsClient"
            java.lang.String r0 = r3.toString()
            android.util.Log.wtf(r1, r0, r2)
            return
        L_0x00e0:
            java.lang.Object r3 = r13.obj
            X.7Sq r3 = (X.C150897Sq) r3
            monitor-enter(r3)
            java.lang.Object r8 = r3.A00     // Catch:{ all -> 0x0322 }
            boolean r0 = r3.A01     // Catch:{ all -> 0x0322 }
            if (r0 == 0) goto L_0x0105
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0322 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0322 }
            java.lang.String r0 = "Callback proxy "
            r1.append(r0)     // Catch:{ all -> 0x0322 }
            r1.append(r2)     // Catch:{ all -> 0x0322 }
            java.lang.String r0 = " being reused. This is not safe."
            r1.append(r0)     // Catch:{ all -> 0x0322 }
            java.lang.String r0 = "GmsClient"
            X.AnonymousClass6C7.A1A(r1, r0)     // Catch:{ all -> 0x0322 }
        L_0x0105:
            monitor-exit(r3)     // Catch:{ all -> 0x0322 }
            if (r8 == 0) goto L_0x011f
            r8 = r3
            X.6UI r8 = (X.AnonymousClass6UI) r8
            int r2 = r8.A00
            r0 = 0
            if (r2 != 0) goto L_0x02c9
            boolean r0 = r8 instanceof X.AnonymousClass6UG
            if (r0 == 0) goto L_0x0122
            X.6UG r8 = (X.AnonymousClass6UG) r8
            X.7oP r0 = r8.A00
            X.8lo r1 = r0.A08
            X.6Tp r0 = X.C127866Tp.A04
            r1.Ba1(r0)
        L_0x011f:
            monitor-enter(r3)
            goto L_0x0318
        L_0x0122:
            r0 = r8
            X.6UH r0 = (X.AnonymousClass6UH) r0
            java.lang.String r10 = "GmsClient"
            android.os.IBinder r2 = r0.A00     // Catch:{ RemoteException -> 0x02e0 }
            X.C162177rO.A02(r2)     // Catch:{ RemoteException -> 0x02e0 }
            java.lang.String r11 = r2.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x02e0 }
            X.7oP r1 = r0.A01
            java.lang.String r9 = r1.A03()
            boolean r0 = r9.equals(r11)
            if (r0 != 0) goto L_0x014f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "service descriptor mismatch: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " vs. "
            X.AnonymousClass6C7.A1F(r0, r11, r10, r1)
            goto L_0x02e5
        L_0x014f:
            boolean r0 = r1 instanceof X.AnonymousClass6RY
            if (r0 == 0) goto L_0x017e
            java.lang.String r0 = "com.google.android.gms.wearable.internal.IWearableService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.AnonymousClass6YM
            if (r0 != 0) goto L_0x02c5
            X.6YM r9 = new X.6YM
            r9.<init>(r2)
        L_0x0162:
            r0 = 2
            boolean r0 = X.C160847oP.A01(r9, r1, r0, r7)
            if (r0 != 0) goto L_0x0170
            r0 = 3
            boolean r0 = X.C160847oP.A01(r9, r1, r0, r7)
            if (r0 == 0) goto L_0x02e5
        L_0x0170:
            r1.A07 = r4
            X.8hT r0 = r1.A0J
            if (r0 == 0) goto L_0x011f
            X.89i r0 = (X.C1694489i) r0
            X.8qr r0 = r0.A00
            r0.onConnected(r4)
            goto L_0x011f
        L_0x017e:
            boolean r0 = r1 instanceof X.AnonymousClass6RZ
            if (r0 == 0) goto L_0x0192
            java.lang.String r0 = "com.google.android.gms.signin.internal.ISignInService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.AnonymousClass6VQ
            if (r0 != 0) goto L_0x02c5
            X.6VQ r9 = new X.6VQ
            r9.<init>(r2)
            goto L_0x0162
        L_0x0192:
            boolean r0 = r1 instanceof X.AnonymousClass6RL
            if (r0 == 0) goto L_0x01a6
            java.lang.String r0 = "com.google.android.gms.safetynet.internal.ISafetyNetService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.AnonymousClass6XF
            if (r0 != 0) goto L_0x02c5
            X.6XF r9 = new X.6XF
            r9.<init>(r2)
            goto L_0x0162
        L_0x01a6:
            boolean r0 = r1 instanceof X.AnonymousClass6RX
            if (r0 == 0) goto L_0x01ba
            java.lang.String r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.C187248wq
            if (r0 != 0) goto L_0x02c5
            X.6Wj r9 = new X.6Wj
            r9.<init>(r2)
            goto L_0x0162
        L_0x01ba:
            boolean r0 = r1 instanceof X.AnonymousClass6RR
            if (r0 == 0) goto L_0x01ce
            java.lang.String r0 = "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.AnonymousClass6WN
            if (r0 != 0) goto L_0x02c5
            X.6WN r9 = new X.6WN
            r9.<init>(r2)
            goto L_0x0162
        L_0x01ce:
            boolean r0 = r1 instanceof X.AnonymousClass6RN
            if (r0 == 0) goto L_0x01e2
            java.lang.String r0 = "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.AnonymousClass6WO
            if (r0 != 0) goto L_0x02c5
            X.6WO r9 = new X.6WO
            r9.<init>(r2)
            goto L_0x0162
        L_0x01e2:
            boolean r0 = r1 instanceof X.AnonymousClass6RJ
            if (r0 == 0) goto L_0x01f7
            java.lang.String r0 = "com.google.android.gms.clearcut.internal.IClearcutLoggerService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.C187118wX
            if (r0 != 0) goto L_0x02c5
            X.7tR r9 = new X.7tR
            r9.<init>(r2)
            goto L_0x0162
        L_0x01f7:
            boolean r0 = r1 instanceof X.AnonymousClass6RQ
            if (r0 == 0) goto L_0x020c
            java.lang.String r0 = "com.google.android.gms.auth.blockstore.internal.IBlockstoreService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.AnonymousClass6VL
            if (r0 != 0) goto L_0x02c5
            X.6VL r9 = new X.6VL
            r9.<init>(r2)
            goto L_0x0162
        L_0x020c:
            boolean r0 = r1 instanceof X.AnonymousClass6RU
            if (r0 == 0) goto L_0x0221
            java.lang.String r0 = "com.google.android.gms.auth.account.data.IGoogleAuthService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.C128016Ul
            if (r0 != 0) goto L_0x02c5
            X.6Ul r9 = new X.6Ul
            r9.<init>(r2)
            goto L_0x0162
        L_0x0221:
            boolean r0 = r1 instanceof X.AnonymousClass6RT
            if (r0 == 0) goto L_0x0236
            java.lang.String r0 = "com.google.android.gms.auth.api.internal.IAuthService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.C128006Uk
            if (r0 != 0) goto L_0x02c5
            X.6Uk r9 = new X.6Uk
            r9.<init>(r2)
            goto L_0x0162
        L_0x0236:
            boolean r0 = r1 instanceof X.AnonymousClass6RP
            if (r0 == 0) goto L_0x024b
            java.lang.String r0 = "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.C127996Uj
            if (r0 != 0) goto L_0x02c5
            X.6Uj r9 = new X.6Uj
            r9.<init>(r2)
            goto L_0x0162
        L_0x024b:
            boolean r0 = r1 instanceof X.AnonymousClass6RW
            if (r0 == 0) goto L_0x0260
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.C127946Ue
            if (r0 != 0) goto L_0x02c5
            X.6Ue r9 = new X.6Ue
            r9.<init>(r2)
            goto L_0x0162
        L_0x0260:
            boolean r0 = r1 instanceof X.AnonymousClass6RK
            if (r0 == 0) goto L_0x0275
            java.lang.String r0 = "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.AnonymousClass6Ud
            if (r0 != 0) goto L_0x02c5
            X.6Ud r9 = new X.6Ud
            r9.<init>(r2)
            goto L_0x0162
        L_0x0275:
            boolean r0 = r1 instanceof X.AnonymousClass6RV
            if (r0 == 0) goto L_0x028a
            java.lang.String r0 = "com.google.android.gms.auth.api.identity.internal.ISignInService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.C127936Uc
            if (r0 != 0) goto L_0x02c5
            X.6Uc r9 = new X.6Uc
            r9.<init>(r2)
            goto L_0x0162
        L_0x028a:
            boolean r0 = r1 instanceof X.AnonymousClass6RM
            if (r0 == 0) goto L_0x029f
            java.lang.String r0 = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.AnonymousClass6UZ
            if (r0 != 0) goto L_0x02c5
            X.6UZ r9 = new X.6UZ
            r9.<init>(r2)
            goto L_0x0162
        L_0x029f:
            boolean r0 = r1 instanceof X.AnonymousClass6RS
            if (r0 == 0) goto L_0x02b4
            java.lang.String r0 = "com.google.android.gms.common.internal.service.IClientTelemetryService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.AnonymousClass6VP
            if (r0 != 0) goto L_0x02c5
            X.6VP r9 = new X.6VP
            r9.<init>(r2)
            goto L_0x0162
        L_0x02b4:
            java.lang.String r0 = "com.google.android.gms.auth.api.signin.internal.ISignInService"
            android.os.IInterface r9 = r2.queryLocalInterface(r0)
            boolean r0 = r9 instanceof X.AnonymousClass6Ub
            if (r0 != 0) goto L_0x02c5
            X.6Ub r9 = new X.6Ub
            r9.<init>(r2)
            goto L_0x0162
        L_0x02c5:
            if (r9 == 0) goto L_0x02e5
            goto L_0x0162
        L_0x02c9:
            X.7oP r1 = r8.A02
            r1.A06(r4, r6)
            android.os.Bundle r1 = r8.A01
            if (r1 == 0) goto L_0x02da
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
        L_0x02da:
            X.6Tp r1 = new X.6Tp
            r1.<init>(r2, r0)
            goto L_0x02ef
        L_0x02e0:
            java.lang.String r0 = "service probably died"
            android.util.Log.w(r10, r0)
        L_0x02e5:
            X.7oP r0 = r8.A02
            r0.A06(r4, r6)
            X.6Tp r1 = new X.6Tp
            r1.<init>(r5, r4)
        L_0x02ef:
            boolean r0 = r8 instanceof X.AnonymousClass6UG
            if (r0 == 0) goto L_0x0308
            X.6UG r8 = (X.AnonymousClass6UG) r8
            X.7oP r2 = r8.A00
            X.8lo r0 = r2.A08
            r0.Ba1(r1)
        L_0x02fc:
            int r0 = r1.A01
            r2.A01 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A05 = r0
            goto L_0x011f
        L_0x0308:
            X.6UH r8 = (X.AnonymousClass6UH) r8
            X.7oP r2 = r8.A01
            X.8hU r0 = r2.A0K
            if (r0 == 0) goto L_0x02fc
            X.89j r0 = (X.C1694589j) r0
            X.8ll r0 = r0.A00
            r0.onConnectionFailed(r1)
            goto L_0x02fc
        L_0x0318:
            r3.A01 = r6     // Catch:{ all -> 0x031f }
            monitor-exit(r3)     // Catch:{ all -> 0x031f }
            r3.A00()
            return
        L_0x031f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x031f }
            throw r0
        L_0x0322:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0322 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WM.handleMessage(android.os.Message):void");
    }
}
