package X;

import android.util.Log;

/* renamed from: X.6YX  reason: invalid class name */
public final class AnonymousClass6YX extends C152027Xg {
    public boolean A00 = true;
    public final AnonymousClass6YK A01;
    public final C156277gM A02 = new C156277gM();
    public final Object A03 = AnonymousClass002.A0D();

    public final void finalize() {
        try {
            synchronized (this.A03) {
                if (this.A00) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    A01();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public AnonymousClass6YX(AnonymousClass6YK r2) {
        this.A01 = r2;
    }

    public final void A01() {
        super.A01();
        synchronized (this.A03) {
            if (this.A00) {
                this.A01.A01();
                this.A00 = false;
            }
        }
    }

    public AnonymousClass6YX() {
        throw AnonymousClass001.A0e("Default constructor called");
    }
}
