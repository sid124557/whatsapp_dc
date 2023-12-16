package X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.5fi  reason: invalid class name and case insensitive filesystem */
public class C110115fi implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ C182718os A05;
    public final /* synthetic */ C96014vU A06;

    public C110115fi(View view, C182718os r2, C96014vU r3, int i, int i2, int i3, int i4) {
        this.A06 = r3;
        this.A04 = view;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A05 = r2;
    }

    public boolean onPreDraw() {
        View view = this.A04;
        AnonymousClass0x7.A16(view, this);
        int[] A1Z = C86664Kz.A1Z();
        view.getLocationOnScreen(A1Z);
        C96014vU r3 = this.A06;
        r3.A02 = this.A01 - A1Z[0];
        r3.A04 = this.A02 - A1Z[1];
        float f = (float) this.A03;
        r3.A01 = AnonymousClass001.A04(view, f);
        float f2 = (float) this.A00;
        float A022 = f2 / C86664Kz.A02(view);
        r3.A00 = A022;
        float f3 = r3.A01;
        if (f3 < A022) {
            r3.A01 = A022;
            r3.A02 = (int) (((float) r3.A02) - (((AnonymousClass4L0.A00(view) * r3.A01) - f) / 2.0f));
        } else {
            r3.A00 = f3;
            r3.A04 = (int) (((float) r3.A04) - (((C86664Kz.A02(view) * r3.A00) - f2) / 2.0f));
        }
        C182718os r6 = this.A05;
        MediaViewBaseFragment mediaViewBaseFragment = r3.A06;
        r3.A03 = C86604Kt.A0A(mediaViewBaseFragment).orientation;
        Drawable drawable = r3.A05;
        int[] A1Z2 = C86664Kz.A1Z();
        // fill-array-data instruction
        A1Z2[0] = 0;
        A1Z2[1] = 255;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(drawable, "alpha", A1Z2);
        ofInt.setDuration(220);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.start();
        C134346ir r10 = mediaViewBaseFragment.A09;
        r10.setPivotX(0.0f);
        r10.setPivotY(0.0f);
        r10.setScaleX(r3.A01);
        r10.setScaleY(r3.A00);
        r10.setTranslationX((float) r3.A02);
        r10.setTranslationY((float) r3.A04);
        View findViewWithTag = mediaViewBaseFragment.A09.findViewWithTag(mediaViewBaseFragment.A1K());
        if (findViewWithTag != null) {
            findViewWithTag.setAlpha(0.0f);
            findViewWithTag.animate().setDuration(110).alpha(1.0f).setInterpolator(new DecelerateInterpolator(2.0f));
        }
        C86634Kw.A0P(C86654Ky.A0I(r10, 220), 1.0f).translationX(0.0f).translationY(0.0f).setListener(new AnonymousClass67K(r3, 5, r6));
        return true;
    }
}
