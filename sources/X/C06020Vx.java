package X;

import android.view.WindowInsetsAnimation;

/* renamed from: X.0Vx  reason: invalid class name and case insensitive filesystem */
public final class C06020Vx {
    public final AnonymousClass0XU A00;
    public final AnonymousClass0XU A01;

    public static C06020Vx A00(WindowInsetsAnimation.Bounds bounds) {
        return new C06020Vx(bounds);
    }

    public C06020Vx(AnonymousClass0XU r1, AnonymousClass0XU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public WindowInsetsAnimation.Bounds A01() {
        return AnonymousClass068.A00(this);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Bounds{lower=");
        A0o.append(this.A00);
        A0o.append(" upper=");
        A0o.append(this.A01);
        return AnonymousClass000.A0g(A0o);
    }

    public C06020Vx(WindowInsetsAnimation.Bounds bounds) {
        this.A00 = AnonymousClass068.A02(bounds);
        this.A01 = AnonymousClass068.A01(bounds);
    }
}
