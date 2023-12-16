package X;

import android.view.View;
import android.view.animation.Animation;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.8zp  reason: invalid class name and case insensitive filesystem */
public class C188998zp extends C167047zg {
    public Object A00;
    public final int A01;

    public C188998zp(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onAnimationEnd(Animation animation) {
        View view;
        switch (this.A01) {
            case 1:
            case 3:
                view = (View) this.A00;
                break;
            case 2:
                view = ((ContactPickerFragment) this.A00).A0G;
                break;
            case 5:
                AnonymousClass4ZC r1 = (AnonymousClass4ZC) ((C1893691a) this.A00).A00;
                r1.clearAnimation();
                r1.A0E = false;
                r1.setEnabled(true);
                C18310x6.A15(r1);
                return;
            case 6:
                view = ((C111445i6) this.A00).A0T;
                break;
            case 7:
                AnonymousClass7T7 r2 = (AnonymousClass7T7) this.A00;
                r2.A01.setVisibility(8);
                r2.A00(0.0f);
                return;
            case 8:
                C108145cU r22 = (C108145cU) this.A00;
                r22.A0J.setVisibility(8);
                r22.A0F(0);
                return;
            case 9:
                C108145cU r0 = (C108145cU) this.A00;
                r0.A0J(r0.A02(), (String) null, r0.A00(), false, true);
                return;
            case 10:
                C108145cU r23 = (C108145cU) this.A00;
                r23.A0F(r23.A0J.getHeight());
                r23.A0O((Float) null, true);
                return;
            case 11:
                ((View) this.A00).setAlpha(0.0f);
                return;
            case 12:
                AnonymousClass561 r12 = (AnonymousClass561) this.A00;
                r12.setAlpha(1.0f);
                r12.removeCallbacks(r12.A0N);
                r12.removeCallbacks(r12.A0M);
                r12.A00 = null;
                return;
            default:
                super.onAnimationEnd(animation);
                return;
        }
        view.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation) {
        switch (this.A01) {
            case 0:
                onAnimationStart(animation);
                return;
            case 4:
                animation.setStartOffset(300);
                return;
            default:
                super.onAnimationRepeat(animation);
                return;
        }
    }

    public void onAnimationStart(Animation animation) {
        switch (this.A01) {
            case 0:
                C91324jN r3 = (C91324jN) this.A00;
                C91324jN.A00(r3.A01, 0.2f, 0.5f);
                C91324jN.A00(r3.A02, 0.25f, 0.75f);
                return;
            case 5:
                C1893691a r2 = (C1893691a) this.A00;
                ((View) r2.A00).setEnabled(false);
                ((Runnable) r2.A01).run();
                return;
            case 9:
                C108145cU r4 = (C108145cU) this.A00;
                r4.A0I(r4.A06, Float.valueOf(-0.5f), r4.A0A.getHeight(), true);
                return;
            case 10:
                C108145cU r1 = (C108145cU) this.A00;
                r1.A0G(r1.A0J.getHeight());
                r1.A0T(true);
                return;
            case 11:
                ((View) this.A00).setAlpha(1.0f);
                return;
            default:
                super.onAnimationStart(animation);
                return;
        }
    }
}
