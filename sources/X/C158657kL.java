package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* renamed from: X.7kL  reason: invalid class name and case insensitive filesystem */
public final class C158657kL {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public Surface A0B;
    public boolean A0C;
    public final WindowManager A0D;
    public final C149637Nf A0E = new C149637Nf();
    public final C162867st A0F;
    public final C163027t9 A0G;

    public static void A00(Surface surface, float f) {
        try {
            surface.setFrameRate(f, AnonymousClass6C9.A1L((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))) ? 1 : 0);
        } catch (IllegalStateException e) {
            C159307lc.A02("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public final void A01() {
        long j;
        WindowManager windowManager = this.A0D;
        windowManager.getClass();
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.A09 = refreshRate;
            j = (refreshRate * 80) / 100;
        } else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
            this.A09 = -9223372036854775807L;
        }
        this.A0A = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r4.A06 < 5000000000L) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r11 = this;
            int r0 = X.C162387ry.A01
            r8 = 30
            if (r0 < r8) goto L_0x0057
            android.view.Surface r0 = r11.A0B
            if (r0 == 0) goto L_0x0057
            X.7Nf r9 = r11.A0E
            X.7Zs r4 = r9.A03
            boolean r10 = r4.A02()
            if (r10 == 0) goto L_0x005d
            long r2 = r4.A05
            r0 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x001f
            long r0 = r4.A06
            long r0 = r0 / r2
        L_0x001f:
            double r2 = (double) r0
            r0 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r0 = r0 / r2
            float r6 = (float) r0
        L_0x0027:
            float r7 = r11.A02
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0057
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0058
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0052
            if (r10 == 0) goto L_0x0048
            long r3 = r4.A06
            r1 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            if (r0 >= 0) goto L_0x004a
        L_0x0048:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x004a:
            float r0 = X.AnonymousClass002.A00(r6, r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0057
        L_0x0052:
            r11.A02 = r6
            r11.A03(r5)
        L_0x0057:
            return
        L_0x0058:
            int r0 = r9.A00
            if (r0 < r8) goto L_0x0057
            goto L_0x0052
        L_0x005d:
            float r6 = r11.A00
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158657kL.A02():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(boolean r4) {
        /*
            r3 = this;
            int r1 = X.C162387ry.A01
            r0 = 30
            if (r1 < r0) goto L_0x0021
            android.view.Surface r2 = r3.A0B
            if (r2 == 0) goto L_0x0021
            boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x0022
            float r1 = r3.A02
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0022
            float r0 = r3.A01
            float r1 = r1 * r0
        L_0x0019:
            if (r4 != 0) goto L_0x0024
            float r0 = r3.A03
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0024
        L_0x0021:
            return
        L_0x0022:
            r1 = 0
            goto L_0x0019
        L_0x0024:
            r3.A03 = r1
            A00(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158657kL.A03(boolean):void");
    }

    public C158657kL(Context context) {
        C162867st r0;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
            this.A0D = windowManager;
            if (windowManager != null) {
                DisplayManager displayManager = (DisplayManager) applicationContext.getSystemService("display");
                if (displayManager == null) {
                    r0 = null;
                } else {
                    r0 = new C162867st(displayManager, this);
                }
                this.A0F = r0;
                this.A0G = C163027t9.A05;
            }
        }
        this.A09 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
    }
}
