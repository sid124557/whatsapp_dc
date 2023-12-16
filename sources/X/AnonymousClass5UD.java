package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.camera.CameraBottomSheetBehavior;
import com.whatsapp.camera.DragGalleryStripIndicator;
import com.whatsapp.camera.bottomsheet.CameraBottomSheetController$5;

/* renamed from: X.5UD  reason: invalid class name */
public class AnonymousClass5UD {
    public AnimatorSet A00;
    public View A01;
    public View A02;
    public DragGalleryStripIndicator A03;
    public AnonymousClass4X4 A04;
    public C53492nB A05;
    public AnonymousClass5ZM A06;
    public final Resources A07;
    public final View A08;
    public final View A09;
    public final RecyclerView A0A;
    public final CameraBottomSheetBehavior A0B;
    public final boolean A0C;
    public final boolean A0D;

    public void A00() {
        boolean A1U = AnonymousClass000.A1U(this.A0B.A0O, 4);
        RecyclerView recyclerView = this.A0A;
        if (!A1U) {
            recyclerView.setVisibility(4);
            recyclerView.setAlpha(0.0f);
            View view = this.A01;
            if (view != null) {
                view.setVisibility(4);
            }
            View view2 = this.A09;
            view2.setEnabled(true);
            view2.setVisibility(0);
            view2.setAlpha(1.0f);
            return;
        }
        recyclerView.setVisibility(0);
        recyclerView.setAlpha(1.0f);
        View view3 = this.A01;
        if (view3 != null) {
            view3.setVisibility(AnonymousClass001.A08(this.A0C ? 1 : 0));
        }
        View view4 = this.A09;
        view4.setEnabled(false);
        view4.setAlpha(0.0f);
    }

    public void A01() {
        View view = this.A08;
        if (view.getVisibility() != 4) {
            view.setVisibility(4);
            AnimationSet animationSet = new AnimationSet(true);
            new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            animationSet.addAnimation(AnonymousClass4L0.A0C(1.0f, 0.0f));
            C86604Kt.A1H(view, animationSet);
        }
    }

    public void A02(boolean z) {
        View view;
        int i;
        float f = 1.0f;
        if (z) {
            f = 0.0f;
        }
        float f2 = 1.0f - f;
        View view2 = this.A02;
        if (view2 != null && (view = this.A01) != null && this.A03 != null) {
            int measuredHeight = view2.getMeasuredHeight();
            int i2 = -measuredHeight;
            int translationY = (int) view.getTranslationY();
            if (z) {
                i = i2 + translationY;
            } else {
                i = translationY - i2;
            }
            C188668zI r2 = new C188668zI(this, 12);
            C188668zI r1 = new C188668zI(this, 13);
            float[] fArr = new float[2];
            fArr[0] = f;
            ValueAnimator A0P = C86664Kz.A0P(fArr, f2);
            C86644Kx.A0i(A0P);
            A0P.addUpdateListener(new C100365Aq(this, measuredHeight, 0));
            if (!z) {
                r2 = r1;
            }
            A0P.addListener(r2);
            int[] iArr = new int[2];
            iArr[0] = translationY;
            ValueAnimator A0Q = C86664Kz.A0Q(iArr, i);
            C86604Kt.A0w(A0Q, this, 18);
            AnimatorSet A0O = C86664Kz.A0O();
            A0O.setDuration(150);
            A0O.playTogether(C86664Kz.A1b(A0P, A0Q, 2, 0));
            this.A00 = A0O;
            A0O.start();
        }
    }

    public void A03(boolean z) {
        if (this.A0B.A0O != 4) {
            return;
        }
        if (!z || (this.A07.getConfiguration().orientation == 2 && !this.A0D)) {
            A01();
            return;
        }
        this.A08.setVisibility(0);
        A00();
    }

    public AnonymousClass5UD(View view, boolean z, boolean z2) {
        View A022 = C06560Yg.A02(view, R.id.bottom_sheet);
        this.A08 = A022;
        ((ViewGroup) A022).setClipChildren(true);
        this.A02 = C06560Yg.A02(view, R.id.gallery_strip_container);
        DragGalleryStripIndicator dragGalleryStripIndicator = (DragGalleryStripIndicator) C06560Yg.A02(view, R.id.drag_gallery_strip_indicator);
        this.A03 = dragGalleryStripIndicator;
        dragGalleryStripIndicator.setVisibility(0);
        this.A01 = C06560Yg.A02(view, R.id.drag_gallery_strip_layout);
        this.A0A = C86654Ky.A0P(view, R.id.recent_media);
        this.A09 = C06560Yg.A02(view, R.id.gallery_container);
        this.A07 = view.getResources();
        this.A0D = z;
        this.A0C = z2;
        View view2 = this.A02;
        this.A0B = new CameraBottomSheetController$5(view2 == null ? this.A0A : view2, this);
        View view3 = this.A09;
        view3.setEnabled(false);
        view3.setAlpha(0.0f);
        this.A0B.A0U(this.A07.getDimensionPixelSize(R.dimen.f6nameremoved), false);
        AnonymousClass001.A0W(this.A08).A01(this.A0B);
        View view4 = this.A01;
        if (view4 != null && this.A03 != null) {
            view4.measure(0, 0);
            view4.setTranslationY((float) (-view4.getMeasuredHeight()));
            view4.setVisibility(8);
        }
    }
}
