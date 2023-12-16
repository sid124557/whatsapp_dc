package X;

import com.google.android.exoplayer2.drm.ExoMediaCrypto;

/* renamed from: X.86I  reason: invalid class name */
public final class AnonymousClass86I implements ExoMediaCrypto {
    public static final boolean A00;

    static {
        boolean z;
        if ("Amazon".equals(C162387ry.A04)) {
            String str = C162387ry.A05;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                A00 = z;
            }
        }
        z = false;
        A00 = z;
    }
}
