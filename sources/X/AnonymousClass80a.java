package X;

/* renamed from: X.80a  reason: invalid class name */
public class AnonymousClass80a implements C16270sk {
    public final /* synthetic */ C05990Vt A00;
    public final /* synthetic */ AnonymousClass33p A01;

    public AnonymousClass80a(C05990Vt r1, AnonymousClass33p r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad A[Catch:{ RemoteException -> 0x0151, all -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c9 A[Catch:{ RemoteException -> 0x0151, all -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0 A[Catch:{ RemoteException -> 0x0151, all -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BUe(int r13) {
        /*
            r12 = this;
            X.0Vt r4 = r12.A00     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            int r1 = r4.A00     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            r0 = 2
            if (r1 != r0) goto L_0x014a
            com.google.android.finsky.externalreferrer.IGetInstallReferrerService r0 = r4.A02     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r0 == 0) goto L_0x014a
            android.content.ServiceConnection r0 = r4.A01     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r0 == 0) goto L_0x014a
            android.os.Bundle r2 = X.AnonymousClass002.A08()     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            android.content.Context r0 = r4.A03     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            java.lang.String r0 = "package_name"
            r2.putString(r0, r1)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            com.google.android.finsky.externalreferrer.IGetInstallReferrerService r6 = r4.A02     // Catch:{ RemoteException -> 0x0137 }
            X.6O7 r6 = (X.AnonymousClass6O7) r6     // Catch:{ RemoteException -> 0x0137 }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0137 }
            java.lang.String r0 = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"
            r5.writeInterfaceToken(r0)     // Catch:{ RemoteException -> 0x0137 }
            r3 = 1
            r5.writeInt(r3)     // Catch:{ RemoteException -> 0x0137 }
            r1 = 0
            r2.writeToParcel(r5, r1)     // Catch:{ RemoteException -> 0x0137 }
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0137 }
            android.os.IBinder r0 = r6.A00     // Catch:{ RuntimeException -> 0x012d }
            r0.transact(r3, r5, r2, r1)     // Catch:{ RuntimeException -> 0x012d }
            r2.readException()     // Catch:{ RuntimeException -> 0x012d }
            r5.recycle()     // Catch:{ RemoteException -> 0x0137 }
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR     // Catch:{ RemoteException -> 0x0137 }
            int r0 = r2.readInt()     // Catch:{ RemoteException -> 0x0137 }
            if (r0 != 0) goto L_0x004c
            r1 = 0
            goto L_0x0052
        L_0x004c:
            java.lang.Object r1 = r1.createFromParcel(r2)     // Catch:{ RemoteException -> 0x0137 }
            android.os.Parcelable r1 = (android.os.Parcelable) r1     // Catch:{ RemoteException -> 0x0137 }
        L_0x0052:
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ RemoteException -> 0x0137 }
            r2.recycle()     // Catch:{ RemoteException -> 0x0137 }
            X.0Kg r0 = new X.0Kg     // Catch:{ RemoteException -> 0x0137 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0137 }
            android.os.Bundle r7 = r0.A00     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            java.lang.String r6 = "install_referrer"
            java.lang.String r3 = r7.getString(r6)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = "1on1_invite_code="
            int r0 = r3.indexOf(r0)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r0 != 0) goto L_0x00c2
            r0 = 17
            java.lang.String r10 = r3.substring(r0)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
        L_0x0078:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = "app=messenger"
            boolean r0 = r3.contains(r0)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r0 == 0) goto L_0x00a7
            java.lang.String r1 = "utm_source="
            boolean r0 = r3.contains(r1)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = ""
            java.lang.String r2 = r3.replaceAll(r1, r0)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r2 == 0) goto L_0x00a7
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r0 != 0) goto L_0x00a7
            X.33p r0 = r12.A01     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            java.lang.String r0 = "pref_wa_me_messenger_referrer_link"
            X.C18270x1.A0j(r1, r0, r2)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
        L_0x00a7:
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r0 == 0) goto L_0x00c9
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r0 != 0) goto L_0x00c6
            java.lang.String r0 = "invite_code="
            int r0 = r3.indexOf(r0)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r0 != 0) goto L_0x00c6
            r0 = 12
            java.lang.String r10 = r3.substring(r0)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            goto L_0x00c7
        L_0x00c2:
            r10 = 0
            if (r3 == 0) goto L_0x00a7
            goto L_0x0078
        L_0x00c6:
            r10 = 0
        L_0x00c7:
            r11 = 0
            goto L_0x00ca
        L_0x00c9:
            r11 = 1
        L_0x00ca:
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r0 != 0) goto L_0x0118
            X.33p r9 = r12.A01     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            X.8qC r1 = r9.A01     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r1)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            java.lang.String r8 = "invite_code_from_referrer"
            java.lang.String r0 = X.C18280x3.A0Z(r0, r8)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r0 == 0) goto L_0x00f9
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r1)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            java.lang.String r0 = "referrer_clicked_time"
            long r4 = X.AnonymousClass0x2.A0B(r1, r0)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            java.lang.String r3 = "referrer_click_timestamp_seconds"
            long r1 = r7.getLong(r3)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0118
            long r2 = r7.getLong(r3)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            goto L_0x00ff
        L_0x00f9:
            java.lang.String r0 = "referrer_click_timestamp_seconds"
            long r2 = r7.getLong(r0)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
        L_0x00ff:
            if (r11 == 0) goto L_0x0108
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r9)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            java.lang.String r8 = "1on1_invite_code_from_referrer"
            goto L_0x010c
        L_0x0108:
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r9)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
        L_0x010c:
            X.C18270x1.A0j(r0, r8, r10)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r9)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            java.lang.String r0 = "referrer_clicked_time"
            X.C18270x1.A0i(r1, r0, r2)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
        L_0x0118:
            X.33p r1 = r12.A01     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            java.lang.String r0 = r7.getString(r6)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            android.text.TextUtils.isEmpty(r0)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            java.lang.String r2 = "unknown|unknown"
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r1)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            java.lang.String r0 = "smb_app_install_source"
            X.C18270x1.A0j(r1, r0, r2)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            goto L_0x0151
        L_0x012d:
            r0 = move-exception
            r2.recycle()     // Catch:{ all -> 0x0132 }
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r0 = move-exception
            r5.recycle()     // Catch:{ RemoteException -> 0x0137 }
            throw r0     // Catch:{ RemoteException -> 0x0137 }
        L_0x0137:
            r3 = move-exception
            java.lang.String r2 = "RemoteException getting install referrer information"
            java.lang.String r1 = "InstallReferrerClient"
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            if (r0 == 0) goto L_0x0146
            android.util.Log.w(r1, r2)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
        L_0x0146:
            r0 = 0
            r4.A00 = r0     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            throw r3     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
        L_0x014a:
            java.lang.String r0 = "Service not connected. Please start a connection before using the service."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
            throw r0     // Catch:{ RemoteException -> 0x0151, all -> 0x016c }
        L_0x0151:
            X.0Vt r3 = r12.A00
            r0 = 3
            r3.A00 = r0
            android.content.ServiceConnection r0 = r3.A01
            r2 = 0
            if (r0 == 0) goto L_0x0169
            java.lang.String r0 = "Unbinding from service."
            X.AnonymousClass0S4.A00(r0)
            android.content.Context r1 = r3.A03
            android.content.ServiceConnection r0 = r3.A01
            r1.unbindService(r0)
            r3.A01 = r2
        L_0x0169:
            r3.A02 = r2
            return
        L_0x016c:
            r4 = move-exception
            X.0Vt r3 = r12.A00
            r0 = 3
            r3.A00 = r0
            android.content.ServiceConnection r0 = r3.A01
            r2 = 0
            if (r0 == 0) goto L_0x0185
            java.lang.String r0 = "Unbinding from service."
            X.AnonymousClass0S4.A00(r0)
            android.content.Context r1 = r3.A03
            android.content.ServiceConnection r0 = r3.A01
            r1.unbindService(r0)
            r3.A01 = r2
        L_0x0185:
            r3.A02 = r2
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass80a.BUe(int):void");
    }
}
