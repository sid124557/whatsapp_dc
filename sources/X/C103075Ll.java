package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.5Ll  reason: invalid class name and case insensitive filesystem */
public final class C103075Ll {
    public final C158497k4 A00(Context context, WindowManager windowManager) {
        int i;
        int i2;
        C18260x0.A0O(context, windowManager);
        if (C107385bE.A08()) {
            Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
            C162457s7.A0D(bounds);
            i = bounds.width();
            if (i % 2 != 0) {
                i--;
            }
            i2 = bounds.height();
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point A07 = AnonymousClass4L0.A07();
            defaultDisplay.getRealSize(A07);
            int i3 = A07.x;
            if (i3 % 2 != 0) {
                i3--;
            }
            i2 = A07.y;
        }
        if (i2 % 2 != 0) {
            i2--;
        }
        return new C158497k4(i, i2, AnonymousClass000.A0B(context).densityDpi);
    }
}
