package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.R;

/* renamed from: X.0AO  reason: invalid class name */
public class AnonymousClass0AO extends AnonymousClass0AP {
    public static final TimeInterpolator A01 = new AccelerateInterpolator();
    public static final TimeInterpolator A02 = new DecelerateInterpolator();
    public static final C16700tp A03 = new C17650vv(1);
    public static final C16700tp A04 = new C17640vu(0);
    public static final C16700tp A05 = new C17640vu(1);
    public static final C16700tp A06 = new C17650vv(0);
    public C16700tp A00 = A03;

    public Animator A0Z(View view, ViewGroup viewGroup, AnonymousClass0U7 r14, AnonymousClass0U7 r15) {
        int[] iArr = (int[]) r15.A02.get("android:slide:screenPosition");
        View view2 = view;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float B7w = this.A00.B7w(view, viewGroup);
        float B7x = this.A00.B7x(view, viewGroup);
        int i = iArr[0];
        int i2 = iArr[1];
        return A00(A02, view2, this, r15, B7w, B7x, translationX, translationY, i, i2);
    }

    public Animator A0a(View view, ViewGroup viewGroup, AnonymousClass0U7 r14, AnonymousClass0U7 r15) {
        int[] iArr = (int[]) r14.A02.get("android:slide:screenPosition");
        View view2 = view;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float B7w = this.A00.B7w(view, viewGroup);
        float B7x = this.A00.B7x(view, viewGroup);
        int i = iArr[0];
        int i2 = iArr[1];
        return A00(A01, view2, this, r14, translationX, translationY, B7w, B7x, i, i2);
    }

    public void A0b(int i) {
        C16700tp r0;
        if (i == 3) {
            r0 = A04;
        } else if (i == 5) {
            r0 = A05;
        } else if (i == 48) {
            r0 = A06;
        } else if (i != 80) {
            throw AnonymousClass001.A0c("Invalid slide direction");
        } else {
            r0 = A03;
        }
        this.A00 = r0;
        AnonymousClass0AG r02 = new AnonymousClass0AG();
        r02.A01 = i;
        A0S(r02);
    }

    public AnonymousClass0AO(int i) {
        A0b(i);
    }

    public void A0U(AnonymousClass0U7 r4) {
        AnonymousClass0AP.A02(r4);
        int[] iArr = new int[2];
        r4.A00.getLocationOnScreen(iArr);
        r4.A02.put("android:slide:screenPosition", iArr);
    }

    public void A0V(AnonymousClass0U7 r4) {
        AnonymousClass0AP.A02(r4);
        int[] iArr = new int[2];
        r4.A00.getLocationOnScreen(iArr);
        r4.A02.put("android:slide:screenPosition", iArr);
    }

    public static Animator A00(TimeInterpolator timeInterpolator, View view, C10560i8 r16, AnonymousClass0U7 r17, float f, float f2, float f3, float f4, int i, int i2) {
        View view2 = view;
        float f5 = f2;
        float f6 = f;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        View view3 = r17.A00;
        int[] iArr = (int[]) view3.getTag(R.id.transition_position);
        if (iArr != null) {
            f6 = ((float) (iArr[0] - i)) + translationX;
            f5 = ((float) (iArr[1] - i2)) + translationY;
        }
        int round = i + Math.round(f6 - translationX);
        int round2 = i2 + Math.round(f5 - translationY);
        view.setTranslationX(f6);
        view.setTranslationY(f5);
        if (f6 == f3 && f5 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f6, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f5, f4})});
        AnonymousClass00E r7 = new AnonymousClass00E(view2, view3, translationX, translationY, round, round2);
        r16.A0B(r7);
        ofPropertyValuesHolder.addListener(r7);
        ofPropertyValuesHolder.addPauseListener(r7);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    public AnonymousClass0AO() {
        A0b(80);
    }
}
