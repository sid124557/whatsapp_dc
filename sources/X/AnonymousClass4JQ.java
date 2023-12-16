package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.ScrollView;
import com.whatsapp.R;

/* renamed from: X.4JQ  reason: invalid class name */
public class AnonymousClass4JQ implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4JQ(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void onGlobalLayout() {
        if (2 - this.A03 != 0) {
            View view = (View) this.A02;
            view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setDuration(200);
            view.startAnimation(translateAnimation);
            ((View) this.A01).startAnimation(translateAnimation);
            return;
        }
        ScrollView scrollView = (ScrollView) this.A01;
        int i = 0;
        if (C57652tz.A01(scrollView)) {
            i = R.drawable.smb_soft_enforcement_acknowledgement_background;
        }
        ((View) this.A02).setBackgroundResource(i);
        scrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
