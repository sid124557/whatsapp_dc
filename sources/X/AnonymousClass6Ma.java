package X;

import android.graphics.Bitmap;

/* renamed from: X.6Ma  reason: invalid class name */
public class AnonymousClass6Ma extends C1679783n implements C188088yI {
    public C172258Kh A00;
    public final C157847iz A01;
    public volatile Bitmap A02;

    public void close() {
        C172258Kh r1;
        synchronized (this) {
            r1 = this.A00;
            this.A00 = null;
            this.A02 = null;
        }
        if (r1 != null) {
            r1.close();
        }
    }

    public int getSizeInBytes() {
        Bitmap bitmap = this.A02;
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    public AnonymousClass6Ma(C172258Kh r2, C157847iz r3) {
        C172258Kh A022 = r2.A02();
        A022.getClass();
        this.A00 = A022;
        this.A02 = C172258Kh.A00(A022);
        this.A01 = r3;
    }
}
