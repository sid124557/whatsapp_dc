package X;

import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: X.29J  reason: invalid class name */
public final class AnonymousClass29J {
    public static final Long A00(WindowManager windowManager, AnonymousClass1VX r5) {
        C18260x0.A0O(r5, windowManager);
        C58422vE r3 = C58422vE.A02;
        if (!r5.A0Y(r3, 4539)) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        long max = (long) (((float) (Math.max(r5.A0O(r3, 4538), 921600) * 4)) * displayMetrics.density);
        C18260x0.A12("MediaBitmapUtils/maxPixelsAllowed = ", AnonymousClass001.A0o(), max);
        return Long.valueOf(max);
    }
}
