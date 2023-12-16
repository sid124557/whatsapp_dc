package com.whatsapp.location;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass29R;
import X.AnonymousClass33T;
import X.AnonymousClass33p;
import X.AnonymousClass37R;
import X.AnonymousClass3YV;
import X.AnonymousClass4GJ;
import X.AnonymousClass5ZR;
import X.C05610Ue;
import X.C159027ky;
import X.C179408j6;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C18400xH;
import X.C29401il;
import X.C44882Xv;
import X.C56612sH;
import X.C620633i;
import X.C621233o;
import X.C624735e;
import X.C66553Lw;
import X.C71533cG;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class LocationSharingService extends C18400xH implements C179408j6, AnonymousClass4GJ {
    public static volatile boolean A0I;
    public long A00;
    public C159027ky A01;
    public C29401il A02;
    public C44882Xv A03;
    public C620633i A04;
    public C56612sH A05;
    public AnonymousClass5ZR A06;
    public AnonymousClass33p A07;
    public C621233o A08;
    public AnonymousClass37R A09;
    public boolean A0A;
    public final Handler A0B;
    public final Object A0C;
    public final Runnable A0D;
    public final Runnable A0E;
    public volatile AnonymousClass3YV A0F;
    public volatile boolean A0G;
    public volatile boolean A0H;

    public static void A02(Context context) {
        Log.d("LocationSharingService/stop-location-reporting");
        AnonymousClass29R.A00(context, AnonymousClass0x9.A08(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.STOP_LOCATION_REPORTING"));
    }

    public static void A04(Context context, C621233o r3) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        if (r3.A0b()) {
            Log.d("LocationSharingService/start-location-updates persistent");
            A03(context, AnonymousClass0x9.A08(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.START_PERSISTENT_LOCATION_REPORTING"));
        } else if (A0I) {
            A02(context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (r3.A08.A0b() == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r3 = this;
            boolean r0 = r3.A0G
            if (r0 != 0) goto L_0x0016
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x0016
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0046
            X.33o r0 = r3.A08
            boolean r0 = r0.A0b()
            if (r0 == 0) goto L_0x0046
        L_0x0016:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationSharingService/stopSelfIfNeeded/service not stopped: "
            r2.append(r0)
            boolean r0 = r3.A0G
            r2.append(r0)
            java.lang.String r1 = "|"
            r2.append(r1)
            boolean r0 = r3.A0H
            r2.append(r0)
            r2.append(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0041
            X.33o r0 = r3.A08
            boolean r1 = r0.A0b()
            r0 = 1
            if (r1 != 0) goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            X.C18260x0.A1V(r2, r0)
            return
        L_0x0046:
            r3.stopSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.LocationSharingService.A05():void");
    }

    public final Object generatedComponent() {
        if (this.A0F == null) {
            synchronized (this.A0C) {
                if (this.A0F == null) {
                    this.A0F = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A0F.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0093, code lost:
        if (r0 != null) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r21 = this;
            java.lang.String r0 = "LocationSharingService/onCreate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = r21
            boolean r0 = r5.A0A
            if (r0 != 0) goto L_0x0058
            r0 = 1
            r5.A0A = r0
            java.lang.Object r0 = r5.generatedComponent()
            X.3Da r0 = (X.C64323Da) r0
            X.1Ec r0 = (X.C22031Ec) r0
            X.3Db r1 = r0.A06
            X.2sH r0 = X.C64333Db.A2p(r1)
            r5.A05 = r0
            X.33i r0 = X.C64333Db.A2o(r1)
            r5.A04 = r0
            X.33p r0 = X.C64333Db.A2s(r1)
            r5.A07 = r0
            X.5ZR r0 = X.C64333Db.A2r(r1)
            r5.A06 = r0
            X.4C1 r0 = r1.A26
            java.lang.Object r0 = r0.get()
            X.1il r0 = (X.C29401il) r0
            r5.A02 = r0
            X.4C1 r0 = r1.AFv
            java.lang.Object r0 = r0.get()
            X.7ky r0 = (X.C159027ky) r0
            r5.A01 = r0
            X.4C1 r0 = r1.AJA
            java.lang.Object r0 = r0.get()
            X.33o r0 = (X.C621233o) r0
            r5.A08 = r0
            X.4C1 r0 = r1.AR2
            java.lang.Object r0 = r0.get()
            X.2Xv r0 = (X.C44882Xv) r0
            r5.A03 = r0
        L_0x0058:
            super.onCreate()
            X.2sH r3 = r5.A05
            X.33i r2 = r5.A04
            X.33p r1 = r5.A07
            X.1il r15 = r5.A02
            X.7ky r14 = r5.A01
            X.2Xv r0 = r5.A03
            X.37R r13 = new X.37R
            r17 = r2
            r18 = r3
            r19 = r1
            r20 = r5
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r5.A09 = r13
            X.33i r0 = r13.A08     // Catch:{ RuntimeException -> 0x00a3 }
            android.os.PowerManager r2 = r0.A0J()     // Catch:{ RuntimeException -> 0x00a3 }
            if (r2 != 0) goto L_0x0086
            java.lang.String r0 = "MyLocationUpdater/onCreate pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x00a3 }
            goto L_0x00a9
        L_0x0086:
            android.os.PowerManager$WakeLock r0 = r13.A03     // Catch:{ RuntimeException -> 0x00a3 }
            if (r0 != 0) goto L_0x0095
            java.lang.String r1 = "ShareLocationService"
            r0 = 1
            android.os.PowerManager$WakeLock r0 = X.AnonymousClass75K.A00(r2, r1, r0)     // Catch:{ RuntimeException -> 0x00a3 }
            r13.A03 = r0     // Catch:{ RuntimeException -> 0x00a3 }
            if (r0 == 0) goto L_0x00a9
        L_0x0095:
            boolean r0 = r0.isHeld()     // Catch:{ RuntimeException -> 0x00a3 }
            if (r0 != 0) goto L_0x00a9
            android.os.PowerManager$WakeLock r2 = r13.A03     // Catch:{ RuntimeException -> 0x00a3 }
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.acquire(r0)     // Catch:{ RuntimeException -> 0x00a3 }
            goto L_0x00a9
        L_0x00a3:
            r1 = move-exception
            java.lang.String r0 = "MyLocationUpdater/onCreate/PowerManager exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00a9:
            X.33p r0 = r13.A0A
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "location_shared_duration"
            java.lang.String r1 = X.AnonymousClass0x9.A0v(r1, r0)
            long r11 = java.lang.System.currentTimeMillis()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00f5
            java.lang.String r0 = ";"
            java.lang.String[] r8 = r1.split(r0)
            int r7 = r8.length
            r10 = 0
            r6 = 0
        L_0x00c8:
            if (r6 >= r7) goto L_0x00f5
            r0 = r8[r6]
            java.lang.String[] r9 = X.C18320x8.A1b(r0)
            int r1 = r9.length
            r0 = 2
            if (r1 != r0) goto L_0x00f2
            r0 = r9[r10]
            int r4 = java.lang.Integer.parseInt(r0)
            long r2 = X.C18290x4.A0A(r4)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 + r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00f2
            r0 = 1
            r0 = r9[r0]
            int r1 = java.lang.Integer.parseInt(r0)
            android.util.SparseIntArray r0 = r13.A04
            r0.put(r4, r1)
        L_0x00f2:
            int r6 = r6 + 1
            goto L_0x00c8
        L_0x00f5:
            android.os.Handler r3 = r5.A0B
            java.lang.Runnable r2 = r5.A0D
            r0 = 42000(0xa410, double:2.0751E-319)
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.LocationSharingService.onCreate():void");
    }

    public void onDestroy() {
        Log.i("LocationSharingService/onDestroy");
        C621233o r0 = this.A08;
        synchronized (r0.A0P) {
            r0.A00 = 0;
        }
        stopForeground(true);
        A0I = false;
        this.A01.A08 = false;
        Handler handler = this.A0B;
        handler.removeCallbacks(this.A0D);
        handler.removeCallbacks(this.A0E);
        AnonymousClass37R r1 = this.A09;
        r1.A05.A04(r1);
        r1.A00();
        PowerManager.WakeLock wakeLock = r1.A03;
        if (wakeLock != null && wakeLock.isHeld()) {
            r1.A03.release();
            r1.A03 = null;
        }
    }

    public LocationSharingService(int i) {
        this.A0C = AnonymousClass002.A0D();
        this.A0A = false;
    }

    public static void A03(Context context, Intent intent) {
        if (!AnonymousClass29R.A00(context, intent)) {
            C05610Ue A002 = C66553Lw.A00(context);
            C18300x5.A14(context, A002, R.string.f11nameremoved);
            C18320x8.A0z(context, A002, R.string.f11nameremoved);
            Intent A072 = C18320x8.A07();
            A072.setClassName(context.getPackageName(), "com.whatsapp.location.LiveLocationPrivacyActivity");
            A002.A09 = C624735e.A00(context, 0, A072, 0);
            A002.A03 = C18290x4.A17();
            AnonymousClass33T.A02(A002, R.drawable.notifybar);
            ((NotificationManager) context.getSystemService("notification")).notify(12, A002.A01());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        if (X.C18280x3.A1V(r7, "com.whatsapp.ShareLocationService.STOP_LOCATION_REPORTING") != false) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c8 A[LOOP:1: B:60:0x01c2->B:62:0x01c8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01be A[EDGE_INSN: B:92:0x01be->B:59:0x01be ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r20, int r21, int r22) {
        /*
            r19 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationSharingService/onStartCommand intent="
            r1.append(r0)
            r7 = r20
            r1.append(r7)
            java.lang.String r0 = " permission="
            r1.append(r0)
            r6 = r19
            X.5ZR r0 = r6.A06
            boolean r0 = r0.A05()
            X.C18260x0.A1V(r1, r0)
            boolean r0 = X.C107385bE.A0B()
            java.lang.String r4 = "com.whatsapp.ShareLocationService.STOP_LOCATION_REPORTING"
            r5 = 1
            if (r0 == 0) goto L_0x0036
            if (r20 == 0) goto L_0x0036
            boolean r0 = X.C18280x3.A1V(r7, r4)
            if (r0 == 0) goto L_0x0036
        L_0x002f:
            r0 = 0
            r6.A0G = r0
        L_0x0032:
            r6.A05()
            return r5
        L_0x0036:
            X.0Ue r1 = X.C66553Lw.A00(r6)
            r2 = 2131891338(0x7f12148a, float:1.9417393E38)
            java.lang.String r0 = r6.getString(r2)
            r1.A0C(r0)
            X.C18300x5.A14(r6, r1, r2)
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.location.LiveLocationPrivacyActivity"
            r3.setClassName(r2, r0)
            r2 = 0
            android.app.PendingIntent r0 = X.C624735e.A00(r6, r2, r3, r2)
            r1.A09 = r0
            short r0 = X.C18290x4.A17()
            r1.A03 = r0
            X.5ZR r0 = r6.A06
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x00a1
            r0 = 2131891333(0x7f121485, float:1.9417383E38)
            X.C18320x8.A0z(r6, r1, r0)
            r0 = 2131233327(0x7f080a2f, float:1.8082788E38)
        L_0x0072:
            X.AnonymousClass33T.A02(r1, r0)
            boolean r0 = X.C107385bE.A0B()
            r3 = 12
            android.app.Notification r1 = r1.A01()
            if (r0 == 0) goto L_0x009d
            r0 = 8
            r6.startForeground(r3, r1, r0)
        L_0x0086:
            A0I = r5
            X.7ky r0 = r6.A01
            r0.A08 = r5
            if (r20 == 0) goto L_0x00ab
            java.lang.String r0 = "com.whatsapp.ShareLocationService.ACTION_SEND_LOCATION_WEB_RESPONSE"
            boolean r0 = X.C18280x3.A1V(r7, r0)
            if (r0 != 0) goto L_0x0032
            boolean r0 = X.C18280x3.A1V(r7, r4)
            if (r0 == 0) goto L_0x00ab
            goto L_0x002f
        L_0x009d:
            r6.startForeground(r3, r1)
            goto L_0x0086
        L_0x00a1:
            r0 = 2131890513(0x7f121151, float:1.941572E38)
            X.C18320x8.A0z(r6, r1, r0)
            r0 = 2131233342(0x7f080a3e, float:1.8082819E38)
            goto L_0x0072
        L_0x00ab:
            java.lang.String r1 = "duration"
            r3 = 42000(0xa410, double:2.0751E-319)
            if (r20 == 0) goto L_0x018d
            java.lang.String r0 = "com.whatsapp.ShareLocationService.ACTION_START_LOCATION_UPDATES_FOR_WEB"
            boolean r0 = X.C18280x3.A1V(r7, r0)
            if (r0 == 0) goto L_0x0178
            long r2 = r7.getLongExtra(r1, r3)
            android.os.Handler r1 = r6.A0B
            java.lang.Runnable r0 = r6.A0E
            r1.removeCallbacks(r0)
            r1.postDelayed(r0, r2)
            r6.A0H = r5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationSharingService/onStartCommand/start location updates; duration="
            X.C18260x0.A12(r0, r1, r2)
            X.37R r7 = r6.A09
            java.lang.String r6 = "web-client-updates"
        L_0x00d8:
            android.location.Location r0 = r7.A02
            r16 = 7200000(0x6ddd00, double:3.5572727E-317)
            if (r0 == 0) goto L_0x00ef
            long r3 = r0.getTime()
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            long r3 = r3 + r0
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x012a
        L_0x00ef:
            X.7ky r0 = r7.A05
            android.location.Location r8 = r0.A01(r6)
            r6 = 0
            if (r8 == 0) goto L_0x0107
            long r3 = r8.getTime()
            long r3 = r3 + r16
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0107
            r8 = r6
        L_0x0107:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MyLocationUpdater/onStartCommand/start; "
            r2.append(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            if (r8 != 0) goto L_0x016b
            java.lang.String r0 = "location="
            r1.append(r0)
            r1.append(r6)
        L_0x011e:
            java.lang.String r0 = r1.toString()
            X.C18260x0.A1L(r2, r0)
            if (r8 == 0) goto L_0x012a
            r7.A01(r8)
        L_0x012a:
            long r3 = r7.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0135
            r7.A00()
        L_0x0135:
            long r3 = java.lang.System.currentTimeMillis()
            r7.A00 = r3
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            r3 = 0
            r12 = 0
        L_0x0142:
            android.util.SparseIntArray r8 = r7.A04
            int r0 = r8.size()
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r12 >= r0) goto L_0x01be
            int r14 = r8.keyAt(r12)
            int r6 = r8.get(r14)
            long r8 = (long) r14
            long r8 = r8 * r10
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 + r10
            long r10 = java.lang.System.currentTimeMillis()
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0167
            long r8 = (long) r6
            long r3 = r3 + r8
        L_0x0164:
            int r12 = r12 + 1
            goto L_0x0142
        L_0x0167:
            X.C18270x1.A1K(r13, r14)
            goto L_0x0164
        L_0x016b:
            java.lang.String r0 = "location.provider="
            r1.append(r0)
            java.lang.String r0 = r8.getProvider()
            r1.append(r0)
            goto L_0x011e
        L_0x0178:
            java.lang.String r0 = "com.whatsapp.ShareLocationService.ACTION_STOP_LOCATION_UPDATES_FOR_WEB"
            boolean r0 = X.C18280x3.A1V(r7, r0)
            if (r0 == 0) goto L_0x0189
            java.lang.String r0 = "LocationSharingService/onStartCommand/stop location updates"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A0H = r2
            goto L_0x0032
        L_0x0189:
            long r3 = r7.getLongExtra(r1, r3)
        L_0x018d:
            android.os.Handler r1 = r6.A0B
            java.lang.Runnable r0 = r6.A0D
            r1.removeCallbacks(r0)
            r1.postDelayed(r0, r3)
            X.2sH r0 = r6.A05
            long r0 = r0.A0H()
            long r0 = r0 + r3
            r6.A00 = r0
            r6.A0G = r5
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationSharingService/onStartCommand/start; duration="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = "; maxEndTime="
            r2.append(r0)
            long r0 = r6.A00
            X.C18260x0.A1I(r2, r0)
            X.37R r7 = r6.A09
            java.lang.String r6 = "location-sharing-service"
            goto L_0x00d8
        L_0x01be:
            java.util.Iterator r6 = r13.iterator()
        L_0x01c2:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01d0
            int r0 = X.C18280x3.A05(r6)
            r8.delete(r0)
            goto L_0x01c2
        L_0x01d0:
            X.2Xv r0 = r7.A07
            boolean r9 = r0.A00()
            X.1il r0 = r7.A06
            X.30O r0 = r0.A00
            boolean r6 = r0.A01()
            double r14 = r0.A00()
            boolean r0 = java.lang.Double.isNaN(r14)
            if (r0 == 0) goto L_0x01ea
            r14 = 4636737291354636288(0x4059000000000000, double:100.0)
        L_0x01ea:
            if (r9 != 0) goto L_0x020d
            r12 = 4629137466983448576(0x403e000000000000, double:30.0)
            if (r6 == 0) goto L_0x0201
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0201
            r7.A00 = r1
        L_0x01f6:
            r17 = 1000(0x3e8, double:4.94E-321)
            r0 = 5000(0x1388, double:2.4703E-320)
            r6 = 3
        L_0x01fb:
            X.7ky r10 = r7.A05
            r10.A04(r7)
            goto L_0x0228
        L_0x0201:
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x020d
            if (r6 != 0) goto L_0x0215
            r10 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0215
        L_0x020d:
            r7.A00 = r1
            r0 = 30000(0x7530, double:1.4822E-319)
            r17 = 10000(0x2710, double:4.9407E-320)
            r6 = 0
            goto L_0x01fb
        L_0x0215:
            r1 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0222
            if (r6 != 0) goto L_0x01f6
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x01f6
        L_0x0222:
            r0 = 10000(0x2710, double:4.9407E-320)
            r17 = 5000(0x1388, double:2.4703E-320)
            r6 = 2
            goto L_0x01fb
        L_0x0228:
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ IllegalArgumentException -> 0x0253 }
            java.lang.String r2 = "MyLocationUpdater/onStartCommand/request location updates; powerSaveMode="
            r8.append(r2)     // Catch:{ IllegalArgumentException -> 0x0253 }
            r8.append(r9)     // Catch:{ IllegalArgumentException -> 0x0253 }
            java.lang.String r2 = "; duration="
            r8.append(r2)     // Catch:{ IllegalArgumentException -> 0x0253 }
            r8.append(r3)     // Catch:{ IllegalArgumentException -> 0x0253 }
            java.lang.String r2 = "; locationProviders="
            r8.append(r2)     // Catch:{ IllegalArgumentException -> 0x0253 }
            r8.append(r6)     // Catch:{ IllegalArgumentException -> 0x0253 }
            java.lang.String r2 = "; updateInterval="
            X.C18260x0.A12(r2, r8, r0)     // Catch:{ IllegalArgumentException -> 0x0253 }
            r13 = 0
            java.lang.String r12 = "location-updater"
            r11 = r7
            r14 = r6
            r15 = r0
            r10.A05(r11, r12, r13, r14, r15, r17)     // Catch:{ IllegalArgumentException -> 0x0253 }
            return r5
        L_0x0253:
            r1 = move-exception
            java.lang.String r0 = "MyLocationUpdater/onCreate/GPS error "
            com.whatsapp.util.Log.w(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.LocationSharingService.onStartCommand(android.content.Intent, int, int):int");
    }

    public LocationSharingService() {
        this(0);
        this.A0B = AnonymousClass000.A0A();
        this.A0D = new C71533cG((Object) this, 20);
        this.A0E = new C71533cG((Object) this, 21);
    }
}
