package X;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: X.0vg  reason: invalid class name and case insensitive filesystem */
public class C17500vg extends Transition.EpicenterCallback {
    public Object A00;
    public Object A01;
    public final int A02;

    public C17500vg(Rect rect, C010007y r2, int i) {
        this.A02 = i;
        this.A00 = r2;
        this.A01 = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        int i = this.A02;
        Rect rect = (Rect) this.A01;
        if (i == 0 || !rect.isEmpty()) {
            return rect;
        }
        return null;
    }
}
