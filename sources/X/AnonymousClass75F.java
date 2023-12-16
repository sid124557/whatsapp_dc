package X;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* renamed from: X.75F  reason: invalid class name */
public class AnonymousClass75F implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass75F(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A02) {
            case 0:
                AnonymousClass6D7 r3 = (AnonymousClass6D7) this.A01;
                int A03 = (int) AnonymousClass001.A03(valueAnimator);
                r3.setAlpha(A03);
                Iterator it = ((AppBarLayout) this.A00).A0N.iterator();
                while (it.hasNext()) {
                    it.next();
                    ColorStateList colorStateList = r3.A03.A0B;
                    if (colorStateList != null) {
                        colorStateList.withAlpha(A03).getDefaultColor();
                        throw AnonymousClass001.A0g("onUpdate");
                    }
                }
                return;
            case 1:
                AppBarLayout appBarLayout = (AppBarLayout) this.A00;
                float A032 = AnonymousClass001.A03(valueAnimator);
                ((AnonymousClass6D7) this.A01).A04(A032);
                Drawable drawable = appBarLayout.A08;
                if (drawable instanceof AnonymousClass6D7) {
                    ((AnonymousClass6D7) drawable).A04(A032);
                }
                Iterator it2 = appBarLayout.A0N.iterator();
                if (it2.hasNext()) {
                    it2.next();
                    throw AnonymousClass001.A0g("onUpdate");
                }
                return;
            default:
                float A033 = AnonymousClass001.A03(valueAnimator);
                View view = (View) this.A01;
                view.setScaleX(A033);
                view.setScaleY(A033);
                return;
        }
    }
}
