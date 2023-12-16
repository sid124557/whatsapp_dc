package X;

import android.os.Build;
import android.view.DisplayCutout;

/* renamed from: X.0UQ  reason: invalid class name */
public final class AnonymousClass0UQ {
    public final DisplayCutout A00;

    public static AnonymousClass0UQ A00(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new AnonymousClass0UQ(displayCutout);
    }

    public int A01() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C06050Wa.A00(this.A00);
        }
        return 0;
    }

    public int A02() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C06050Wa.A01(this.A00);
        }
        return 0;
    }

    public int A03() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C06050Wa.A02(this.A00);
        }
        return 0;
    }

    public int A04() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C06050Wa.A03(this.A00);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0UQ.class != obj.getClass()) {
            return false;
        }
        return C04880Ra.A01(this.A00, ((AnonymousClass0UQ) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass0UQ(DisplayCutout displayCutout) {
        this.A00 = displayCutout;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DisplayCutoutCompat{");
        A0o.append(this.A00);
        return AnonymousClass000.A0g(A0o);
    }
}
