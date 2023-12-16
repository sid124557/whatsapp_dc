package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.ScrollView;
import com.whatsapp.R;

/* renamed from: X.4JT  reason: invalid class name */
public class AnonymousClass4JT implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4JT(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onGlobalLayout() {
        float f;
        switch (this.A02) {
            case 0:
                View view = (View) this.A01;
                view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setDuration(200);
                view.startAnimation(translateAnimation);
                return;
            case 1:
                ScrollView scrollView = (ScrollView) this.A00;
                boolean A012 = C57652tz.A01(scrollView);
                View view2 = (View) this.A01;
                if (A012) {
                    f = view2.getResources().getDimension(R.dimen.f6nameremoved);
                } else {
                    f = 0.0f;
                }
                view2.setElevation(f);
                scrollView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                return;
            default:
                ((View) this.A01).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ((AnonymousClass4GP) this.A00).invoke();
                return;
        }
    }
}
