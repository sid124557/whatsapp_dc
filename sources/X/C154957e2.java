package X;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.7e2  reason: invalid class name and case insensitive filesystem */
public class C154957e2 {
    public static final int[] A00;

    static {
        int[] A0E = C18330xA.A0E();
        A0E[0] = 16843848;
        A00 = A0E;
    }

    public static void A00(View view, float f) {
        int integer = view.getResources().getInteger(R.integer.f7nameremoved);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842910, R.attr.f3nameremoved, -R.attr.f3nameremoved}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
