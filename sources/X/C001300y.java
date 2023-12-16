package X;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: X.00y  reason: invalid class name and case insensitive filesystem */
public class C001300y extends Drawable.ConstantState {
    public AnimatorSet A00;
    public AnonymousClass05C A01;
    public AnonymousClass0AQ A02;
    public ArrayList A03;

    public int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable(Resources resources) {
        throw AnonymousClass001.A0e("No constant state support for SDK < 24.");
    }

    public Drawable newDrawable() {
        throw AnonymousClass001.A0e("No constant state support for SDK < 24.");
    }
}
