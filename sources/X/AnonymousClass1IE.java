package X;

import android.graphics.Bitmap;

/* renamed from: X.1IE  reason: invalid class name */
public final class AnonymousClass1IE extends AnonymousClass251 {
    public final Bitmap A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1IE) && C162457s7.A0P(this.A00, ((AnonymousClass1IE) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass1IE(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DisplayBitmap(bitmap=");
        return C18260x0.A04(this.A00, A0o);
    }
}
