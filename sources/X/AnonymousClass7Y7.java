package X;

import android.graphics.Bitmap;

/* renamed from: X.7Y7  reason: invalid class name */
public final class AnonymousClass7Y7 {
    public final int A00;
    public final Bitmap A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7Y7) {
                AnonymousClass7Y7 r5 = (AnonymousClass7Y7) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass000.A07(this.A01);
    }

    public AnonymousClass7Y7(int i, Bitmap bitmap) {
        this.A00 = i;
        this.A01 = bitmap;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallFailedBackgroundState(visibility=");
        A0o.append(this.A00);
        A0o.append(", bitmap=");
        return C18260x0.A04(this.A01, A0o);
    }
}
