package X;

import android.widget.ImageView;

/* renamed from: X.2lU  reason: invalid class name and case insensitive filesystem */
public final class C52442lU {
    public final ImageView A00;
    public final C50892iw A01;
    public final C105425Uw A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52442lU) {
                C52442lU r5 = (C52442lU) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A00, C18300x5.A04(this.A02)));
    }

    public C52442lU(ImageView imageView, C50892iw r2, C105425Uw r3) {
        this.A02 = r3;
        this.A00 = imageView;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ShapeLoadingTask(shape=");
        A0o.append(this.A02);
        A0o.append(", imageView=");
        A0o.append(this.A00);
        A0o.append(", tag=");
        return C18260x0.A04(this.A01, A0o);
    }
}
