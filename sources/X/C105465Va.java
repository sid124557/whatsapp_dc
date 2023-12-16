package X;

import android.app.Activity;
import android.transition.Slide;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;

/* renamed from: X.5Va  reason: invalid class name and case insensitive filesystem */
public class C105465Va {
    public static final boolean A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2 == 23) goto L_0x000b;
     */
    static {
        /*
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r2 < r0) goto L_0x000b
            r1 = 23
            r0 = 1
            if (r2 != r1) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105465Va.<clinit>():void");
    }

    public static void A00(Activity activity) {
        if (A00) {
            Window window = activity.getWindow();
            window.requestFeature(13);
            Slide slide = new Slide(5);
            C86634Kw.A19(slide);
            slide.setInterpolator(new DecelerateInterpolator());
            window.setEnterTransition(slide);
            window.setReturnTransition(slide);
        }
    }
}
