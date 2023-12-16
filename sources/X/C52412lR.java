package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Point;

/* renamed from: X.2lR  reason: invalid class name and case insensitive filesystem */
public final class C52412lR {
    public final Context A00;
    public final PackageManager A01;
    public final AnonymousClass33p A02;

    public C52412lR(Context context, AnonymousClass33p r3) {
        C162457s7.A0J(r3, 2);
        this.A00 = context;
        this.A02 = r3;
        this.A01 = context.getPackageManager();
    }

    public final boolean A02() {
        return C18280x3.A1U(AnonymousClass5YQ.A00(this.A00), 600);
    }

    public final boolean A00() {
        if (!A01() || A02()) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        int i;
        boolean z = false;
        if ((C107385bE.A08() && this.A01.hasSystemFeature("android.hardware.sensor.hinge_angle")) || AnonymousClass0x2.A0F(this.A02).getBoolean("detect_device_foldable", false)) {
            z = true;
            Point A012 = AnonymousClass5YQ.A01(this.A00);
            if (A012 != null) {
                int i2 = A012.x;
                int i3 = A012.y;
                int i4 = i2;
                if (i2 > i3) {
                    i4 = i3;
                }
                if (i2 < i3) {
                    i2 = i3;
                }
                AnonymousClass33p r11 = this.A02;
                Point point = new Point();
                C183538qC r6 = r11.A01;
                point.x = C18300x5.A0B(r6).getInt("foldable_max_display_width", Integer.MIN_VALUE);
                point.y = C18300x5.A0B(r6).getInt("foldable_max_display_height", Integer.MIN_VALUE);
                Point point2 = new Point();
                point2.x = C18300x5.A0B(r6).getInt("foldable_min_display_width", Integer.MAX_VALUE);
                point2.y = C18300x5.A0B(r6).getInt("foldable_min_display_height", Integer.MAX_VALUE);
                int i5 = point2.x;
                boolean A1X = AnonymousClass001.A1X(i5, Integer.MIN_VALUE);
                int i6 = point.x;
                if (i6 < i4) {
                    i6 = i4;
                }
                int i7 = point.y;
                if (i7 < i2) {
                    i7 = i2;
                }
                if (i5 > i4) {
                    i5 = i4;
                }
                int i8 = point2.y;
                if (i8 > i2) {
                    i8 = i2;
                }
                int i9 = i;
                if (A1X) {
                    int i10 = i6;
                    if (i6 < i5) {
                        i10 = i5;
                    }
                    i6 = i10;
                    if (i10 > i5) {
                        i10 = i5;
                    }
                    i5 = i10;
                    i = i7;
                    if (i7 < i9) {
                        i = i9;
                    }
                    i7 = i;
                    if (i > i9) {
                        i = i9;
                    }
                }
                SharedPreferences.Editor A03 = C18270x1.A03(r11);
                A03.putInt("foldable_max_display_width", i6);
                A03.putInt("foldable_max_display_height", i7);
                A03.apply();
                SharedPreferences.Editor A032 = C18270x1.A03(r11);
                A032.putInt("foldable_min_display_width", i5);
                A032.putInt("foldable_min_display_height", i);
                A032.apply();
            }
        }
        return z;
    }
}
