package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* renamed from: X.6JC  reason: invalid class name */
public class AnonymousClass6JC extends C10560i8 {
    public Animator A05(ViewGroup viewGroup, AnonymousClass0U7 r9, AnonymousClass0U7 r10) {
        float f;
        if (r9 == null || r10 == null || !(r9.A00 instanceof TextView)) {
            return null;
        }
        View view = r10.A00;
        if (!(view instanceof TextView)) {
            return null;
        }
        Map map = r9.A02;
        Map map2 = r10.A02;
        float f2 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            f = AnonymousClass001.A05(map.get("android:textscale:scale"));
        } else {
            f = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            f2 = AnonymousClass001.A05(map2.get("android:textscale:scale"));
        }
        if (f == f2) {
            return null;
        }
        float[] fArr = new float[2];
        AnonymousClass6C9.A1J(fArr, f, f2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.addUpdateListener(new AnonymousClass75F(view, 2, this));
        return ofFloat;
    }

    public void A0U(AnonymousClass0U7 r4) {
        View view = r4.A00;
        if (view instanceof TextView) {
            r4.A02.put("android:textscale:scale", Float.valueOf(view.getScaleX()));
        }
    }

    public void A0V(AnonymousClass0U7 r4) {
        View view = r4.A00;
        if (view instanceof TextView) {
            r4.A02.put("android:textscale:scale", Float.valueOf(view.getScaleX()));
        }
    }
}
