package X;

import android.graphics.Bitmap;

/* renamed from: X.2kd  reason: invalid class name and case insensitive filesystem */
public final class C51942kd {
    public final Bitmap A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51942kd) {
                C51942kd r5 = (C51942kd) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A00) + C18270x1.A00(this.A01);
    }

    public C51942kd(Bitmap bitmap, String str) {
        this.A00 = bitmap;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarProfilePhotoPoseViewData(bitmapPose=");
        A0o.append(this.A00);
        A0o.append(", emojis=");
        return C18260x0.A07(this.A01, A0o);
    }
}
