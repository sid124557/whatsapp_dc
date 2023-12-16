package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.0XY  reason: invalid class name */
public class AnonymousClass0XY {
    public static final AnonymousClass0XY A01;
    public final C05640Uh A00;

    static {
        AnonymousClass0XY r0;
        if (Build.VERSION.SDK_INT >= 30) {
            r0 = AnonymousClass06D.A00;
        } else {
            r0 = C05640Uh.A01;
        }
        A01 = r0;
    }

    public static AnonymousClass0XU A00(AnonymousClass0XU r5, int i, int i2, int i3, int i4) {
        int max = Math.max(0, r5.A01 - i);
        int A0C = AnonymousClass001.A0C(r5.A03, i2, 0);
        int A0C2 = AnonymousClass001.A0C(r5.A02, i3, 0);
        int A0C3 = AnonymousClass001.A0C(r5.A00, i4, 0);
        if (max == i && A0C == i2 && A0C2 == i3 && A0C3 == i4) {
            return r5;
        }
        return AnonymousClass0XU.A00(max, A0C, A0C2, A0C3);
    }

    @Deprecated
    public int A02() {
        return this.A00.A0B().A00;
    }

    @Deprecated
    public int A03() {
        return this.A00.A0B().A01;
    }

    @Deprecated
    public int A04() {
        return this.A00.A0B().A02;
    }

    @Deprecated
    public int A05() {
        return this.A00.A0B().A03;
    }

    public WindowInsets A06() {
        C05640Uh r1 = this.A00;
        if (r1 instanceof AnonymousClass06H) {
            return ((AnonymousClass06H) r1).A04;
        }
        return null;
    }

    @Deprecated
    public AnonymousClass0XY A07(int i, int i2, int i3, int i4) {
        C05290St r0 = new C05290St(this);
        AnonymousClass0XU A002 = AnonymousClass0XU.A00(i, i2, i3, i4);
        AnonymousClass0UT r02 = r0.A00;
        r02.A06(A002);
        return r02.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0XY)) {
            return false;
        }
        return C04880Ra.A01(this.A00, ((AnonymousClass0XY) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A00);
    }

    public AnonymousClass0XY(WindowInsets windowInsets) {
        C05640Uh r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r0 = new AnonymousClass06D(this, windowInsets);
        } else if (i >= 29) {
            r0 = new AnonymousClass06E(this, windowInsets);
        } else if (i >= 28) {
            r0 = new AnonymousClass06F(this, windowInsets);
        } else {
            r0 = new AnonymousClass06G(this, windowInsets);
        }
        this.A00 = r0;
    }

    public static AnonymousClass0XY A01(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        AnonymousClass0XY r2 = new AnonymousClass0XY(windowInsets);
        if (view != null && C06360Xi.A04(view)) {
            AnonymousClass0XY A06 = C06560Yg.A06(view);
            C05640Uh r1 = r2.A00;
            r1.A0G(A06);
            r1.A0F(view.getRootView());
        }
        return r2;
    }

    public AnonymousClass0XY() {
        this.A00 = new C05640Uh(this);
    }
}
