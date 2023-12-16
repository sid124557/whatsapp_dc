package X;

import android.view.View;

/* renamed from: X.0OC  reason: invalid class name */
public class AnonymousClass0OC {
    public final /* synthetic */ AnonymousClass00P A00;

    public AnonymousClass0OC(AnonymousClass00P r1) {
        this.A00 = r1;
    }

    public void A00(View view, int i) {
        int height;
        float f;
        int top = view.getTop();
        AnonymousClass00P r3 = this.A00;
        if (r3.A0E) {
            height = i;
        } else {
            height = view.getHeight();
        }
        boolean z = r3.A0A;
        if (!z || height == 0) {
            f = 1.0f;
        } else {
            f = ((float) (i - top)) / ((float) height);
        }
        r3.A00 = f;
        if (z) {
            r3.A02(f);
        }
    }
}
