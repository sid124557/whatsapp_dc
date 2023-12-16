package X;

import android.content.res.Resources;
import android.view.View;

/* renamed from: X.7T7  reason: invalid class name */
public class AnonymousClass7T7 {
    public final Resources A00;
    public final View A01;
    public final AnonymousClass7E2 A02;

    public void A00(float f) {
        C108145cU r3 = this.A02.A00;
        int i = (int) f;
        r3.A00 = i;
        int max = Math.max(i, r3.A02);
        r3.A0K.setPadding(0, 0, 0, max);
        r3.A0K.requestLayout();
        r3.A0G(max);
    }

    public AnonymousClass7T7(Resources resources, View view, AnonymousClass7E2 r3) {
        this.A00 = resources;
        this.A01 = view;
        this.A02 = r3;
    }
}
