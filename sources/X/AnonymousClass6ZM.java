package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.6ZM  reason: invalid class name */
public class AnonymousClass6ZM extends AnonymousClass5WN {
    public void A01(Drawable drawable, View view, View view2, TabLayout tabLayout, float f) {
        float A00;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i >= 0) {
            view = view2;
        }
        RectF A002 = AnonymousClass5WN.A00(view, tabLayout);
        if (i < 0) {
            A00 = C159917mg.A00(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            A00 = C159917mg.A00(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) A002.left, drawable.getBounds().top, (int) A002.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (A00 * 255.0f));
    }
}
