package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.whatsapp.ClearableEditText;
import com.whatsapp.R;
import com.whatsapp.RollingCounterView;
import com.whatsapp.calling.CallDetailsLayout;
import com.whatsapp.calling.callgrid.view.FocusViewContainer;
import com.whatsapp.calling.callgrid.view.PipViewContainer;
import com.whatsapp.camera.CameraBottomSheetBehavior;
import com.whatsapp.components.AnimatingArrowsLayout;
import com.whatsapp.components.CircularRevealView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.Objects;

/* renamed from: X.8zI  reason: invalid class name and case insensitive filesystem */
public class C188668zI extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public C188668zI(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A01) {
            case 8:
                super.onAnimationCancel(animator);
                CallDetailsLayout callDetailsLayout = (CallDetailsLayout) this.A00;
                callDetailsLayout.A00 = 0;
                callDetailsLayout.clearAnimation();
                return;
            case 9:
                super.onAnimationCancel(animator);
                FocusViewContainer.A00((FocusViewContainer) ((C1237469p) this.A00).A00);
                return;
            case 10:
                Log.i("PipViewContainer/animatePiPView onAnimationCancel");
                PipViewContainer pipViewContainer = (PipViewContainer) this.A00;
                pipViewContainer.A03();
                PipViewContainer.A00(pipViewContainer, false);
                return;
            case 15:
                ((CircularRevealView) this.A00).A09 = true;
                return;
            case 17:
            case 18:
            case 19:
                C93324oK r2 = (C93324oK) this.A00;
                if (r2.A06 == 2) {
                    r2.A06 = 0;
                    return;
                }
                return;
            case 24:
                super.onAnimationCancel(animator);
                SolidColorWallpaperPreview solidColorWallpaperPreview = ((C110105fh) ((AnonymousClass67M) this.A00).A00).A04;
                solidColorWallpaperPreview.A0C = false;
                solidColorWallpaperPreview.A09.setScrollEnabled(true);
                return;
            case 25:
                super.onAnimationCancel(animator);
                ((SolidColorWallpaperPreview) this.A00).finish();
                return;
            case 26:
                ((AnonymousClass4NZ) this.A00).A0e = false;
                return;
            case 28:
                super.onAnimationCancel(animator);
                ((VoipActivityV2) this.A00).A0q.A00();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public void onAnimationEnd(Animator animator) {
        CameraBottomSheetBehavior cameraBottomSheetBehavior;
        boolean z;
        switch (this.A01) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.A00).A06 = null;
                return;
            case 1:
                return;
            case 2:
                ((C159097l7) this.A00).A04();
                return;
            case 4:
                ((C153787c0) this.A00).A02.setEndIconVisible(false);
                return;
            case 5:
                AnonymousClass6ZR r2 = (AnonymousClass6ZR) this.A00;
                r2.A02.A05(false);
                r2.A01.start();
                return;
            case 6:
                ((ExpandableTransformationBehavior) this.A00).A00 = null;
                return;
            case 7:
                ((RollingCounterView) this.A00).A01();
                return;
            case 8:
                super.onAnimationEnd(animator);
                CallDetailsLayout callDetailsLayout = (CallDetailsLayout) this.A00;
                callDetailsLayout.A00 = 2;
                callDetailsLayout.A08.setVisibility(8);
                callDetailsLayout.clearAnimation();
                return;
            case 9:
                super.onAnimationEnd(animator);
                FocusViewContainer.A00((FocusViewContainer) ((C1237469p) this.A00).A00);
                return;
            case 10:
                Log.i("PipViewContainer/animatePiPView onAnimationEnd");
                PipViewContainer pipViewContainer = (PipViewContainer) this.A00;
                pipViewContainer.A03();
                PipViewContainer.A00(pipViewContainer, false);
                return;
            case 12:
                cameraBottomSheetBehavior = ((AnonymousClass5UD) this.A00).A0B;
                z = true;
                break;
            case 13:
                AnonymousClass5UD r22 = (AnonymousClass5UD) this.A00;
                r22.A0A.setVisibility(8);
                cameraBottomSheetBehavior = r22.A0B;
                z = false;
                break;
            case 14:
                AnimatingArrowsLayout animatingArrowsLayout = (AnimatingArrowsLayout) this.A00;
                AnimatorSet animatorSet = animatingArrowsLayout.A03;
                Objects.requireNonNull(animatorSet);
                animatingArrowsLayout.post(new C69963Zi(animatorSet, 41));
                return;
            case 15:
                ((CircularRevealView) this.A00).A09 = false;
                return;
            case 17:
            case 19:
                C93324oK r23 = (C93324oK) this.A00;
                if (r23.A06 == 2) {
                    r23.A06 = 0;
                    return;
                }
                return;
            case 20:
                AnonymousClass7XM r3 = (AnonymousClass7XM) this.A00;
                r3.A04.setVisibility(4);
                ClearableEditText clearableEditText = r3.A0A;
                clearableEditText.setVisibility(0);
                r3.A07.setImageResource(R.drawable.ic_shape_picker_search_active);
                clearableEditText.requestFocus();
                return;
            case 21:
                AnonymousClass7XM r24 = (AnonymousClass7XM) this.A00;
                r24.A04.setClickable(true);
                r24.A06.setVisibility(0);
                return;
            case 22:
                super.onAnimationEnd(animator);
                ValueAnimator valueAnimator = ((C105305Uj) this.A00).A0D;
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                return;
            case 23:
                View view = ((C105235Uc) this.A00).A0E;
                view.setVisibility(8);
                view.setAlpha(1.0f);
                return;
            case 24:
                super.onAnimationEnd(animator);
                SolidColorWallpaperPreview solidColorWallpaperPreview = ((C110105fh) ((AnonymousClass67M) this.A00).A00).A04;
                solidColorWallpaperPreview.A0C = false;
                solidColorWallpaperPreview.A09.setScrollEnabled(true);
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((SolidColorWallpaperPreview) this.A00).finish();
                return;
            case 26:
                ((AnonymousClass4NZ) this.A00).A0e = false;
                return;
            case 27:
                AnonymousClass4NZ r1 = (AnonymousClass4NZ) this.A00;
                r1.setVisibility(4);
                r1.setAlpha(1.0f);
                r1.A02();
                return;
            case 28:
                super.onAnimationEnd(animator);
                ((VoipActivityV2) this.A00).A0q.A00();
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
        cameraBottomSheetBehavior.A00 = z;
    }

    public void onAnimationRepeat(Animator animator) {
        switch (this.A01) {
            case 10:
                Log.i("PipViewContainer/animatePiPView onAnimationRepeat");
                return;
            case 11:
                super.onAnimationRepeat(animator);
                C91224j8 r1 = (C91224j8) this.A00;
                if (!r1.A07.A0E) {
                    r1.A0H();
                    return;
                }
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A01) {
            case 3:
                ((C153787c0) this.A00).A02.setEndIconVisible(true);
                return;
            case 7:
                ((View) this.A00).invalidate();
                return;
            case 10:
                Log.i("PipViewContainer/animatePiPView onAnimationStart");
                PipViewContainer.A00((PipViewContainer) this.A00, true);
                return;
            case 12:
                ((AnonymousClass5UD) this.A00).A0A.setVisibility(0);
                return;
            case 15:
                ((CircularRevealView) this.A00).A09 = true;
                return;
            case 16:
                ((RoundCornerProgressBar) this.A00).A06 = false;
                return;
            case 20:
                AnonymousClass7XM r2 = (AnonymousClass7XM) this.A00;
                r2.A04.setClickable(false);
                r2.A06.setVisibility(4);
                return;
            case 21:
                AnonymousClass7XM r3 = (AnonymousClass7XM) this.A00;
                ClearableEditText clearableEditText = r3.A0A;
                clearableEditText.clearFocus();
                r3.A07.setImageResource(R.drawable.ic_shape_picker_search);
                r3.A04.setVisibility(0);
                clearableEditText.setVisibility(4);
                return;
            case 26:
                ((AnonymousClass4NZ) this.A00).A0e = true;
                return;
            case 27:
                super.onAnimationStart(animator);
                ((AnonymousClass4NZ) this.A00).A0f = false;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
