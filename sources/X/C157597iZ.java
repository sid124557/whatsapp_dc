package X;

import android.location.LocationManager;

/* renamed from: X.7iZ  reason: invalid class name and case insensitive filesystem */
public class C157597iZ {
    public static final String[] A06 = {"gps", "network"};
    public AnonymousClass7V7 A00;
    public final LocationManager A01;
    public final C156187gB A02;
    public final C177828gW A03;
    public final AnonymousClass7S0 A04;
    public final C129426aI A05;

    /* JADX WARNING: Removed duplicated region for block: B:102:0x007f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass7V7 A00() {
        /*
            r17 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            boolean r16 = X.C18280x3.A1U(r1, r0)
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r8 = 0
            r5 = r17
            X.7gB r10 = r5.A02
            java.lang.String[] r9 = X.C156187gB.A02
            int r7 = r9.length
            r6 = 0
            r4 = 0
        L_0x001a:
            if (r4 >= r7) goto L_0x0082
            r3 = r9[r4]
            r3.getClass()     // Catch:{ SecurityException -> 0x0074 }
            android.location.LocationManager r1 = r10.A01     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException -> 0x0048 }
            android.location.LocationProvider r0 = r1.getProvider(r3)     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException -> 0x0048 }
            if (r0 == 0) goto L_0x0071
            r0.getPowerRequirement()     // Catch:{ SecurityException -> 0x0074 }
            r0.hasMonetaryCost()     // Catch:{ SecurityException -> 0x0074 }
            boolean r0 = r1.isProviderEnabled(r3)     // Catch:{ SecurityException -> 0x0074 }
            if (r0 != 0) goto L_0x0038
            X.6ud r1 = X.C140856ud.LOCATION_DISABLED     // Catch:{ SecurityException -> 0x0074 }
            goto L_0x0076
        L_0x0038:
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            android.content.Context r0 = r10.A00     // Catch:{ all -> 0x0045 }
            int r0 = r0.checkCallingOrSelfPermission(r1)     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0045
            X.6ud r1 = X.C140856ud.OKAY     // Catch:{ SecurityException -> 0x0074 }
            goto L_0x0076
        L_0x0045:
            X.6ud r1 = X.C140856ud.PERMISSION_DENIED     // Catch:{ SecurityException -> 0x0074 }
            goto L_0x0076
        L_0x0048:
            r11 = move-exception
            java.lang.Class<X.7gB> r2 = X.C156187gB.class
            java.lang.Object[] r12 = X.AnonymousClass002.A0L()     // Catch:{ SecurityException -> 0x0074 }
            r12[r8] = r3     // Catch:{ SecurityException -> 0x0074 }
            java.lang.String r1 = "Error when getting provider %s"
            X.8vJ r0 = X.C162477s9.A01     // Catch:{ SecurityException -> 0x0074 }
            r3 = 3
            boolean r0 = r0.BI0(r3)     // Catch:{ SecurityException -> 0x0074 }
            if (r0 == 0) goto L_0x0071
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ SecurityException -> 0x0074 }
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r1, (java.lang.Object[]) r12)     // Catch:{ SecurityException -> 0x0074 }
            X.8vJ r0 = X.C162477s9.A01     // Catch:{ SecurityException -> 0x0074 }
            boolean r0 = r0.BI0(r3)     // Catch:{ SecurityException -> 0x0074 }
            if (r0 == 0) goto L_0x0071
            X.8vJ r0 = X.C162477s9.A01     // Catch:{ SecurityException -> 0x0074 }
            r0.B1D(r2, r1, r11)     // Catch:{ SecurityException -> 0x0074 }
        L_0x0071:
            X.6ud r1 = X.C140856ud.LOCATION_UNSUPPORTED     // Catch:{ SecurityException -> 0x0074 }
            goto L_0x0076
        L_0x0074:
            X.6ud r1 = X.C140856ud.PERMISSION_DENIED
        L_0x0076:
            if (r6 == 0) goto L_0x007e
            int r0 = r6.compareTo(r1)
            if (r0 >= 0) goto L_0x007f
        L_0x007e:
            r6 = r1
        L_0x007f:
            int r4 = r4 + 1
            goto L_0x001a
        L_0x0082:
            if (r6 != 0) goto L_0x0086
            X.6ud r6 = X.C140856ud.LOCATION_UNSUPPORTED
        L_0x0086:
            X.6ud r0 = X.C140856ud.OKAY
            r7 = 0
            if (r6 != r0) goto L_0x0191
            X.7V7 r6 = r5.A00
            if (r16 == 0) goto L_0x009d
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            int r1 = r0.importance
            r0 = 100
            if (r1 != r0) goto L_0x015a
        L_0x009d:
            if (r6 == 0) goto L_0x00d6
            X.7S0 r0 = r5.A04
            long r1 = r0.A00(r6)
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x00d6
            android.location.Location r1 = r6.A00
            boolean r0 = r1.hasAccuracy()
            if (r0 == 0) goto L_0x00d6
            float r0 = r1.getAccuracy()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            if (r0 == 0) goto L_0x00d6
            boolean r0 = r1.hasAccuracy()
            if (r0 == 0) goto L_0x0154
            float r0 = r1.getAccuracy()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x00c9:
            float r0 = r0.floatValue()
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x00d6
            android.location.Location r7 = new android.location.Location
            r7.<init>(r1)
        L_0x00d6:
            java.lang.String[] r6 = A06
            int r4 = r6.length
        L_0x00d9:
            if (r8 >= r4) goto L_0x0157
            r1 = r6[r8]
            android.location.LocationManager r0 = r5.A01     // Catch:{ IllegalArgumentException | SecurityException -> 0x0147 }
            android.location.Location r11 = r0.getLastKnownLocation(r1)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0147 }
            if (r11 == 0) goto L_0x0147
            long r9 = r11.getTime()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0147 }
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0147
            double r1 = r11.getLatitude()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0147 }
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0101
            double r1 = r11.getLongitude()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0147 }
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0147
        L_0x0101:
            boolean r0 = r11.hasAccuracy()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0147 }
            if (r0 == 0) goto L_0x0147
            X.7S0 r3 = r5.A04
            long r9 = r11.getElapsedRealtimeNanos()
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x014a
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            if (r0 == 0) goto L_0x014a
            X.8qV r0 = r3.A01
            long r2 = r0.now()
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            long r2 = r2 - r9
            r0 = 500000(0x7a120, double:2.47033E-318)
            long r2 = r2 + r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r0
        L_0x012c:
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0147
            float r0 = r11.getAccuracy()
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0147
            if (r7 == 0) goto L_0x0146
            long r9 = r7.getTime()
            long r1 = r11.getTime()
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0147
        L_0x0146:
            r7 = r11
        L_0x0147:
            int r8 = r8 + 1
            goto L_0x00d9
        L_0x014a:
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r11.getTime()
            long r2 = r2 - r0
            goto L_0x012c
        L_0x0154:
            r0 = 0
            goto L_0x00c9
        L_0x0157:
            if (r7 != 0) goto L_0x015b
            r6 = 0
        L_0x015a:
            return r6
        L_0x015b:
            android.location.Location r0 = new android.location.Location
            r0.<init>(r7)
            X.7V7 r6 = new X.7V7
            r6.<init>(r0)
            X.7V7 r1 = r5.A00
            if (r1 == 0) goto L_0x0189
            java.lang.Long r0 = r1.A00()
            if (r0 == 0) goto L_0x0189
            java.lang.Long r0 = r6.A00()
            if (r0 == 0) goto L_0x018b
            java.lang.Long r0 = r6.A00()
            long r3 = r0.longValue()
            java.lang.Long r0 = r1.A00()
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x018b
        L_0x0189:
            r5.A00 = r6
        L_0x018b:
            X.7S0 r0 = r5.A04
            r0.A00(r6)
            return r6
        L_0x0191:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157597iZ.A00():X.7V7");
    }

    public C157597iZ(LocationManager locationManager, C156187gB r3, C177828gW r4, AnonymousClass7S0 r5) {
        this.A02 = r3;
        this.A01 = locationManager;
        this.A04 = r5;
        this.A03 = r4;
        if (r4 != null) {
            throw AnonymousClass001.A0g("getNmeaDataCollectionCacheQueueSize");
        }
        this.A05 = C129426aI.create(10);
    }
}
