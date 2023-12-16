package X;

import android.graphics.Bitmap;

/* renamed from: X.2yU  reason: invalid class name and case insensitive filesystem */
public final class C60392yU {
    public final Bitmap A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C60392yU) && C162457s7.A0P(this.A00, ((C60392yU) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A00);
    }

    public C60392yU(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UiState(bitmap=");
        return C18260x0.A04(this.A00, A0o);
    }

    public C60392yU() {
        this((Bitmap) null);
    }
}
