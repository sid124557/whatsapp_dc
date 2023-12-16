package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: X.4W1  reason: invalid class name */
public final class AnonymousClass4W1 extends C011209g {
    public final C620733j A00;

    public float A06(DisplayMetrics displayMetrics) {
        if (displayMetrics != null) {
            return 75.0f / ((float) displayMetrics.densityDpi);
        }
        throw AnonymousClass001.A0g("densityDpi");
    }

    public int A07() {
        if (C102805Ki.A00(this.A00)) {
            return 1;
        }
        return -1;
    }

    public int A08() {
        if (C102805Ki.A00(this.A00)) {
            return 1;
        }
        return -1;
    }

    public AnonymousClass4W1(Context context, C620733j r2) {
        super(context);
        this.A00 = r2;
    }
}
