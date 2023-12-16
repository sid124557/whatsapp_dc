package X;

import android.content.Context;
import android.location.Location;
import android.os.Build;

/* renamed from: X.7ic  reason: invalid class name and case insensitive filesystem */
public class C157627ic {
    public Location A00;
    public AnonymousClass7AA A01;
    public C157627ic A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final C185258tL A06;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r1 <= 200) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.location.Location r7, android.location.Location r8) {
        /*
            r6 = 0
            if (r7 == 0) goto L_0x0055
            r5 = 1
            if (r8 == 0) goto L_0x004f
            long r3 = r7.getTime()
            long r0 = r8.getTime()
            long r3 = r3 - r0
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004f
            r1 = -120000(0xfffffffffffe2b40, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0055
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r4 = X.AnonymousClass001.A1W(r0)
            float r1 = r7.getAccuracy()
            float r0 = r8.getAccuracy()
            float r1 = r1 - r0
            int r1 = (int) r1
            r3 = 1
            if (r1 <= 0) goto L_0x0038
            r3 = 0
            r0 = 200(0xc8, float:2.8E-43)
            r2 = 1
            if (r1 > r0) goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            java.lang.String r1 = r7.getProvider()
            java.lang.String r0 = r8.getProvider()
            if (r1 != 0) goto L_0x0050
            boolean r0 = X.AnonymousClass000.A1X(r0)
        L_0x0047:
            if (r3 != 0) goto L_0x004f
            if (r4 == 0) goto L_0x0055
            if (r2 != 0) goto L_0x0055
            if (r0 == 0) goto L_0x0055
        L_0x004f:
            return r5
        L_0x0050:
            boolean r0 = r1.equals(r0)
            goto L_0x0047
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157627ic.A00(android.location.Location, android.location.Location):boolean");
    }

    public void A01(boolean z) {
        if (this.A02 == null) {
            this.A02 = this;
        }
        this.A04 = z;
        if (z && Build.VERSION.SDK_INT >= 23) {
            Context context = this.A05;
            if (!(context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 && context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0)) {
                synchronized (C158827kc.A0I) {
                }
                return;
            }
        }
        boolean z2 = this.A04;
        C157627ic r5 = this.A02;
        if (!z2) {
            r5.A03 = false;
            r5.A06.BrO();
        } else if (!r5.A03) {
            r5.A03 = true;
            Location location = r5.A00;
            C185258tL r6 = r5.A06;
            Location B6T = r6.B6T();
            if (A00(B6T, location)) {
                location = B6T;
            }
            if (location == null || System.currentTimeMillis() - location.getTime() >= -1389934592) {
                r5.A00 = null;
            } else {
                r5.A00 = location;
                AnonymousClass7AA r0 = r5.A01;
                if (r0 != null) {
                    r0.A00.A0R.invalidate();
                }
            }
            r6.Bif(r5, C157627ic.class.getName());
        }
    }

    public C157627ic(Context context) {
        C185258tL r1;
        this.A05 = context;
        try {
            AnonymousClass76J.A00(context);
            r1 = AnonymousClass76J.A00.Azl();
        } catch (AnonymousClass8RB unused) {
            C158827kc.A07.A01();
            r1 = new AnonymousClass828(this);
            this.A04 = false;
            this.A03 = false;
        }
        this.A06 = r1;
    }
}
