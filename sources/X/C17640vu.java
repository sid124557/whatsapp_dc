package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0vu  reason: invalid class name and case insensitive filesystem */
public class C17640vu extends C08730ey {
    public final int A00;

    public C17640vu(int i) {
        this.A00 = i;
    }

    public float B7w(View view, ViewGroup viewGroup) {
        int i = this.A00;
        float translationX = view.getTranslationX();
        float width = (float) viewGroup.getWidth();
        if (i != 0) {
            return translationX + width;
        }
        return translationX - width;
    }
}
