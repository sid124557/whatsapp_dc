package X;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

/* renamed from: X.6Pi  reason: invalid class name and case insensitive filesystem */
public final class C126796Pi extends C150877So {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public C129586aY A08;
    public C129586aY A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final SparseArray A0G;
    public final SparseBooleanArray A0H;

    public C126806Pj A00() {
        int i = this.A05;
        int i2 = this.A04;
        int i3 = this.A03;
        int i4 = this.A02;
        boolean z = this.A0E;
        boolean z2 = this.A0B;
        int i5 = this.A07;
        int i6 = this.A06;
        boolean z3 = this.A0F;
        C129586aY r11 = this.A09;
        C129586aY r10 = this.A01;
        int i7 = this.A01;
        int i8 = this.A00;
        boolean z4 = this.A0C;
        C129586aY r6 = this.A08;
        C129586aY r5 = this.A02;
        int i9 = this.A00;
        boolean z5 = this.A0D;
        boolean z6 = this.A0A;
        SparseArray sparseArray = this.A0G;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        int i13 = i6;
        int i14 = i7;
        int i15 = i8;
        int i16 = i9;
        return new C126806Pj(sparseArray, this.A0H, r11, r10, r6, r5, i, i2, i10, i11, i12, i13, i14, i15, i16, z, z2, z3, z4, z5, z6);
    }

    public C126796Pi(Context context) {
        CaptioningManager captioningManager;
        Point point;
        UiModeManager uiModeManager;
        String str;
        String str2;
        int i = C162387ry.A01;
        if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.A00 = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.A02 = C129586aY.of(locale.toLanguageTag());
            }
        }
        A01();
        this.A0G = AnonymousClass6CA.A0I();
        this.A0H = new SparseBooleanArray();
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (i <= 29 && defaultDisplay.getDisplayId() == 0 && (uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode")) != null && uiModeManager.getCurrentModeType() == 4) {
            if (!"Sony".equals(C162387ry.A04) || !C162387ry.A05.startsWith("BRAVIA") || !context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                if (i < 28) {
                    str = "sys.display-size";
                } else {
                    str = "vendor.display-size";
                }
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    str2 = (String) AnonymousClass001.A0r(cls, String.class, "get", new Class[1], 0).invoke(cls, new Object[]{str});
                } catch (Exception e) {
                    C159307lc.A02("Util", AnonymousClass000.A0V("Failed to read system property ", str, AnonymousClass001.A0o()), e);
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        String[] A0j = AnonymousClass6CA.A0j(str2.trim(), "x");
                        if (A0j.length == 2) {
                            int A0F2 = AnonymousClass6CA.A0F(A0j, 0);
                            int A0F3 = AnonymousClass6CA.A0F(A0j, 1);
                            if (A0F2 > 0 && A0F3 > 0) {
                                point = new Point(A0F2, A0F3);
                                int i2 = point.x;
                                int i3 = point.y;
                                this.A07 = i2;
                                this.A06 = i3;
                                this.A0F = true;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                    Log.e("Util", AnonymousClass000.A0V("Invalid display size: ", str2, AnonymousClass001.A0o()));
                }
            } else {
                point = new Point(3840, 2160);
                int i22 = point.x;
                int i32 = point.y;
                this.A07 = i22;
                this.A06 = i32;
                this.A0F = true;
            }
        }
        point = new Point();
        if (i >= 23) {
            C162387ry.A09(point, defaultDisplay);
        } else {
            defaultDisplay.getRealSize(point);
        }
        int i222 = point.x;
        int i322 = point.y;
        this.A07 = i222;
        this.A06 = i322;
        this.A0F = true;
    }

    public final void A01() {
        this.A05 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A02 = Integer.MAX_VALUE;
        this.A0E = true;
        this.A0B = true;
        this.A07 = Integer.MAX_VALUE;
        this.A06 = Integer.MAX_VALUE;
        this.A0F = true;
        this.A09 = C129586aY.of();
        this.A01 = Integer.MAX_VALUE;
        this.A00 = Integer.MAX_VALUE;
        this.A0C = true;
        this.A08 = C129586aY.of();
        this.A0D = true;
        this.A0A = true;
    }

    @Deprecated
    public C126796Pi() {
        A01();
        this.A0G = AnonymousClass6CA.A0I();
        this.A0H = new SparseBooleanArray();
    }
}
