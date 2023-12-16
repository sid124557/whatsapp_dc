package X;

import android.animation.Animator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4N7  reason: invalid class name */
public final class AnonymousClass4N7 extends Transition {
    public int A00;
    public int A01;
    public final Context A02;
    public final Rect A03 = AnonymousClass001.A0N();
    public final AnonymousClass5MG A04;
    public final boolean A05;
    public final int[] A06 = C86664Kz.A1Z();

    public void captureEndValues(TransitionValues transitionValues) {
        View view;
        String str;
        if (transitionValues != null && (view = transitionValues.view) != null && !this.A05) {
            AnonymousClass5MG r3 = this.A04;
            String str2 = null;
            if (r3 != null) {
                str = r3.A03(R.string.f11nameremoved);
            } else {
                str = null;
            }
            if (C162457s7.A0P(str, AnonymousClass0YZ.A06(view))) {
                int[] iArr = this.A06;
                view.getLocationOnScreen(iArr);
                this.A01 = iArr[1];
            }
            if (r3 != null) {
                str2 = r3.A03(R.string.f11nameremoved);
            }
            if (C162457s7.A0P(str2, AnonymousClass0YZ.A06(view))) {
                int[] iArr2 = this.A06;
                view.getLocationOnScreen(iArr2);
                this.A00 = C86634Kw.A09(view, iArr2);
            }
        }
    }

    public void captureStartValues(TransitionValues transitionValues) {
        View view;
        String str;
        if (transitionValues != null && (view = transitionValues.view) != null && this.A05) {
            AnonymousClass5MG r3 = this.A04;
            String str2 = null;
            if (r3 != null) {
                str = r3.A03(R.string.f11nameremoved);
            } else {
                str = null;
            }
            if (C162457s7.A0P(str, AnonymousClass0YZ.A06(view))) {
                int[] iArr = this.A06;
                view.getLocationOnScreen(iArr);
                this.A01 = iArr[1];
            }
            if (r3 != null) {
                str2 = r3.A03(R.string.f11nameremoved);
            }
            if (C162457s7.A0P(str2, AnonymousClass0YZ.A06(view))) {
                int[] iArr2 = this.A06;
                view.getLocationOnScreen(iArr2);
                this.A00 = C86634Kw.A09(view, iArr2);
            }
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        FloatEvaluator floatEvaluator = new FloatEvaluator();
        Object[] A0M = AnonymousClass002.A0M();
        C86624Kv.A1V(A0M, 0);
        C86624Kv.A1V(A0M, 1);
        ValueAnimator ofObject = ValueAnimator.ofObject(floatEvaluator, A0M);
        ofObject.addUpdateListener(new C100255Ae(this, 2, transitionValues2));
        return ofObject;
    }

    public AnonymousClass4N7(Context context, AnonymousClass5MG r3, boolean z) {
        this.A04 = r3;
        this.A05 = z;
        this.A02 = context;
    }
}
