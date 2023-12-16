package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.0A9  reason: invalid class name */
public class AnonymousClass0A9 extends C10560i8 {
    public static final String[] A00 = {"android:clipBounds:clip"};

    public Animator A05(ViewGroup viewGroup, AnonymousClass0U7 r12, AnonymousClass0U7 r13) {
        ObjectAnimator objectAnimator = null;
        if (!(r12 == null || r13 == null)) {
            Map map = r12.A02;
            if (map.containsKey("android:clipBounds:clip")) {
                Map map2 = r13.A02;
                if (map2.containsKey("android:clipBounds:clip")) {
                    Rect rect = (Rect) map.get("android:clipBounds:clip");
                    Object obj = map2.get("android:clipBounds:clip");
                    boolean A1X = AnonymousClass000.A1X(obj);
                    if (!(rect == null && obj == null)) {
                        if (rect == null) {
                            rect = (Rect) map.get("android:clipBounds:bounds");
                        } else if (obj == null) {
                            obj = map2.get("android:clipBounds:bounds");
                        }
                        if (!rect.equals(obj)) {
                            View view = r13.A00;
                            C04910Rd.A01(view, rect);
                            C06640Yp r2 = new C06640Yp(AnonymousClass001.A0N());
                            objectAnimator = ObjectAnimator.ofObject(view, AnonymousClass0VZ.A00, r2, new Rect[]{rect, obj});
                            if (A1X) {
                                objectAnimator.addListener(new C17450vb(view, 0, this));
                                return objectAnimator;
                            }
                        }
                    }
                }
            }
        }
        return objectAnimator;
    }

    public static final void A00(AnonymousClass0U7 r4) {
        View view = r4.A00;
        if (view.getVisibility() != 8) {
            Rect A002 = C04910Rd.A00(view);
            Map map = r4.A02;
            map.put("android:clipBounds:clip", A002);
            if (A002 == null) {
                map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    public String[] A0Y() {
        return A00;
    }

    public void A0U(AnonymousClass0U7 r1) {
        A00(r1);
    }

    public void A0V(AnonymousClass0U7 r1) {
        A00(r1);
    }
}
