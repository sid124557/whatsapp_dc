package X;

import android.app.Activity;
import android.content.Context;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.whatsapp.ConversationFragment;

/* renamed from: X.31N  reason: invalid class name */
public class AnonymousClass31N {
    public static Animation A00(boolean z, boolean z2, boolean z3) {
        AlphaAnimation alphaAnimation;
        AnimationSet animationSet = new AnimationSet(true);
        float f = 1.0f;
        if (z3) {
            if (!z2) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            alphaAnimation.setDuration(100);
            animationSet.addAnimation(alphaAnimation);
        }
        if (!z) {
            f = -1.0f;
        }
        float f2 = 0.0f;
        if (z2) {
            f2 = f;
            f = 0.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, f2, 1, f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(100);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(100);
        return animationSet;
    }

    @Deprecated
    public static AnonymousClass67A A01(Context context) {
        Activity A00 = C621633u.A00(context);
        if (A00 != null) {
            if (A00 instanceof AnonymousClass67A) {
                return (AnonymousClass67A) A00;
            }
            if (A00 instanceof C89644eZ) {
                C08310eF A0D = ((C003203q) A00).getSupportFragmentManager().A0D("com.whatsapp.HomeActivity.ConversationFragment");
                if (A0D instanceof ConversationFragment) {
                    return ((ConversationFragment) A0D).A02;
                }
            }
        }
        return null;
    }
}
