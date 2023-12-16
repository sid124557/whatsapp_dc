package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import android.view.Surface;

public final class SurfaceContainer {
    public final int mDpi = 0;
    public final int mHeight = 0;
    public final Surface mSurface = null;
    public final int mWidth = 0;

    public String toString() {
        StringBuilder A0p = AnonymousClass001.A0p();
        A0p.append(this.mSurface);
        AnonymousClass001.A1M(A0p);
        A0p.append(this.mWidth);
        A0p.append("x");
        A0p.append(this.mHeight);
        A0p.append(", dpi: ");
        A0p.append(this.mDpi);
        return AnonymousClass000.A0f(A0p);
    }
}
