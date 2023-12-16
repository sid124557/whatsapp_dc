package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.List;

/* renamed from: X.7pZ  reason: invalid class name and case insensitive filesystem */
public class C161407pZ {
    public final C06290Wz A00 = new C06290Wz();
    public final C06290Wz A01 = new C06290Wz();

    public static C161407pZ A00(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return A02(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                return A02(C18300x5.A0s(loadAnimator));
            }
            return null;
        } catch (Exception e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1G("Can't load animation resource ID #0x", A0o, i);
            Log.w("MotionSpec", A0o.toString(), e);
            return null;
        }
    }

    public static C161407pZ A02(List list) {
        C161407pZ r5 = new C161407pZ();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                r5.A00.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C159917mg.A02;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C159917mg.A01;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C159917mg.A04;
                }
                C158807ka r6 = new C158807ka(interpolator, startDelay, duration);
                r6.A00 = objectAnimator.getRepeatCount();
                r6.A01 = objectAnimator.getRepeatMode();
                r5.A01.put(propertyName, r6);
                i++;
            } else {
                throw AnonymousClass000.A0E(animator, "Animator must be an ObjectAnimator: ", AnonymousClass001.A0o());
            }
        }
        return r5;
    }

    public C158807ka A03(String str) {
        C06290Wz r1 = this.A01;
        if (r1.get(str) != null) {
            return (C158807ka) r1.get(str);
        }
        throw AnonymousClass6CA.A0N();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C161407pZ)) {
            return false;
        }
        return this.A01.equals(((C161407pZ) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public static C161407pZ A01(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return A00(context, resourceId);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(10);
        A0o.append(AnonymousClass000.A0O(this));
        C18270x1.A18(this, A0o, '{');
        A0o.append(" timings: ");
        A0o.append(this.A01);
        return AnonymousClass000.A0X("}\n", A0o);
    }
}
