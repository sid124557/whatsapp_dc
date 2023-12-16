package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

/* renamed from: X.72h  reason: invalid class name and case insensitive filesystem */
public class C1446272h {
    public static void A00(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        int[] A1Z = C86664Kz.A1Z();
        // fill-array-data instruction
        A1Z[0] = 0;
        A1Z[1] = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(A1Z);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
