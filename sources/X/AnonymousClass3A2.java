package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: X.3A2  reason: invalid class name */
public class AnonymousClass3A2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ViewGroup A00;

    public void onGlobalLayout() {
        ViewGroup viewGroup = this.A00;
        viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        Drawable background = viewGroup.getBackground();
        if (background instanceof AnonymousClass4M8) {
            AnonymousClass4M8.A00(((AnonymousClass4M8) background).A01, viewGroup);
        }
    }

    public AnonymousClass3A2(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }
}
