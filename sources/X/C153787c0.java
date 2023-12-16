package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;

/* renamed from: X.7c0  reason: invalid class name and case insensitive filesystem */
public abstract class C153787c0 {
    public final Context A00;
    public final CheckableImageButton A01;
    public final AnonymousClass6Ff A02;
    public final TextInputLayout A03;

    public int A00() {
        if (!(this instanceof AnonymousClass6ZR) && !(this instanceof AnonymousClass6ZQ)) {
            return 0;
        }
        return R.string.f11nameremoved;
    }

    public int A01() {
        if (this instanceof AnonymousClass6ZR) {
            return R.drawable.mtrl_dropdown_arrow;
        }
        if (this instanceof AnonymousClass6ZQ) {
            return R.drawable.mtrl_ic_cancel;
        }
        return 0;
    }

    public View.OnClickListener A02() {
        if (this instanceof AnonymousClass6ZR) {
            return ((AnonymousClass6ZR) this).A0B;
        }
        if (this instanceof AnonymousClass6ZQ) {
            return ((AnonymousClass6ZQ) this).A07;
        }
        return null;
    }

    public void A03() {
        if (this instanceof AnonymousClass6ZR) {
            AnonymousClass6ZR r5 = (AnonymousClass6ZR) this;
            int i = r5.A08;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            TimeInterpolator timeInterpolator = r5.A0A;
            ofFloat.setInterpolator(timeInterpolator);
            ofFloat.setDuration((long) i);
            C86604Kt.A0w(ofFloat, r5, 10);
            r5.A01 = ofFloat;
            int i2 = r5.A09;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat2.setInterpolator(timeInterpolator);
            ofFloat2.setDuration((long) i2);
            C86604Kt.A0w(ofFloat2, r5, 10);
            r5.A02 = ofFloat2;
            C86614Ku.A0z(ofFloat2, r5, 5);
            r5.A03 = (AccessibilityManager) r5.A00.getSystemService("accessibility");
        } else if (this instanceof AnonymousClass6ZP) {
            this.A02.setEndIconOnLongClickListener((View.OnLongClickListener) null);
        } else if (this instanceof AnonymousClass6ZQ) {
            AnonymousClass6ZQ r7 = (AnonymousClass6ZQ) this;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
            ofFloat3.setInterpolator(r7.A06);
            ofFloat3.setDuration((long) r7.A04);
            C86604Kt.A0w(ofFloat3, r7, 8);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            TimeInterpolator timeInterpolator2 = r7.A05;
            ofFloat4.setInterpolator(timeInterpolator2);
            long j = (long) r7.A03;
            ofFloat4.setDuration(j);
            C86604Kt.A0w(ofFloat4, r7, 9);
            AnimatorSet animatorSet = new AnimatorSet();
            r7.A00 = animatorSet;
            Animator[] animatorArr = new Animator[2];
            AnonymousClass000.A16(ofFloat3, ofFloat4, animatorArr);
            animatorSet.playTogether(animatorArr);
            C86614Ku.A0z(r7.A00, r7, 3);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat5.setInterpolator(timeInterpolator2);
            ofFloat5.setDuration(j);
            C86604Kt.A0w(ofFloat5, r7, 9);
            r7.A01 = ofFloat5;
            C86614Ku.A0z(ofFloat5, r7, 4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r3 = (X.AnonymousClass6ZQ) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.AnonymousClass6ZR
            if (r0 == 0) goto L_0x0015
            r2 = r4
            X.6ZR r2 = (X.AnonymousClass6ZR) r2
            android.widget.AutoCompleteTextView r0 = r2.A04
            if (r0 == 0) goto L_0x0014
            r1 = 0
            r0.setOnTouchListener(r1)
            android.widget.AutoCompleteTextView r0 = r2.A04
            r0.setOnDismissListener(r1)
        L_0x0014:
            return
        L_0x0015:
            boolean r0 = r4 instanceof X.AnonymousClass6ZQ
            if (r0 == 0) goto L_0x0014
            r3 = r4
            X.6ZQ r3 = (X.AnonymousClass6ZQ) r3
            android.widget.EditText r2 = r3.A02
            if (r2 == 0) goto L_0x0014
            r1 = 39
            X.8Mf r0 = new X.8Mf
            r0.<init>(r3, r1)
            r2.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153787c0.A04():void");
    }

    public void A05(EditText editText) {
        if (this instanceof AnonymousClass6ZR) {
            AnonymousClass6ZR r4 = (AnonymousClass6ZR) this;
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                r4.A04 = autoCompleteTextView;
                C86654Ky.A19(autoCompleteTextView, r4, 1);
                r4.A04.setOnDismissListener(new C167097zl(r4));
                r4.A04.setThreshold(0);
                TextInputLayout textInputLayout = r4.A03;
                textInputLayout.setErrorIconDrawable((Drawable) null);
                if (editText.getInputType() == 0 && r4.A03.isTouchExplorationEnabled()) {
                    AnonymousClass0YY.A06(r4.A01, 2);
                }
                textInputLayout.setEndIconVisible(true);
                return;
            }
            throw AnonymousClass002.A0E("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        } else if (this instanceof AnonymousClass6ZQ) {
            AnonymousClass6ZQ r0 = (AnonymousClass6ZQ) this;
            r0.A02 = editText;
            r0.A03.setEndIconVisible(r0.A0A());
        }
    }

    public boolean A07() {
        if (this instanceof AnonymousClass6ZR) {
            return true;
        }
        return false;
    }

    public boolean A08() {
        if (this instanceof AnonymousClass6ZR) {
            return ((AnonymousClass6ZR) this).A07;
        }
        return false;
    }

    public C153787c0(AnonymousClass6Ff r2) {
        this.A03 = r2.A0L;
        this.A02 = r2;
        this.A00 = r2.getContext();
        this.A01 = r2.A0H;
    }

    public void A06(CharSequence charSequence, int i, int i2, int i3) {
    }
}
