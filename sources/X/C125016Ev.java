package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.6Ev  reason: invalid class name and case insensitive filesystem */
public class C125016Ev extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass84O A01;

    public void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.A00);
        Drawable background = view.getBackground();
        if (background != null) {
            background.getOutline(outline);
            outline.setAlpha(this.A01.A0B(65, 1.0f));
        }
    }

    public C125016Ev(AnonymousClass84O r1, float f) {
        this.A00 = f;
        this.A01 = r1;
    }
}
