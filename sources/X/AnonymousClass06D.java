package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.06D  reason: invalid class name */
public class AnonymousClass06D extends AnonymousClass06E {
    public static final AnonymousClass0XY A00 = AnonymousClass001.A0X(WindowInsets.CONSUMED);

    public AnonymousClass0XU A0C(int i) {
        return AnonymousClass0XU.A01(this.A04.getInsets(AnonymousClass0IE.A00(i)));
    }

    public AnonymousClass0XU A0D(int i) {
        return AnonymousClass0XU.A01(this.A04.getInsetsIgnoringVisibility(AnonymousClass0IE.A00(i)));
    }

    public AnonymousClass06D(AnonymousClass0XY r1, WindowInsets windowInsets) {
        super(r1, windowInsets);
    }

    public final void A0F(View view) {
    }
}
