package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0vv  reason: invalid class name and case insensitive filesystem */
public class C17650vv extends C08740ez {
    public final int A00;

    public C17650vv(int i) {
        this.A00 = i;
    }

    public float B7x(View view, ViewGroup viewGroup) {
        int i = this.A00;
        float translationY = view.getTranslationY();
        float height = (float) viewGroup.getHeight();
        if (i != 0) {
            return translationY + height;
        }
        return translationY - height;
    }
}
