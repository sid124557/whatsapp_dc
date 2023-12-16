package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.util.List;
import java.util.Objects;

/* renamed from: X.4P1  reason: invalid class name */
public abstract class AnonymousClass4P1 extends FrameLayout {
    public static int[] getViewIdsToIgnoreScaling() {
        return new int[]{R.id.logo_button, R.id.play_pause_fullscreen, R.id.loading};
    }

    public void A00() {
        AnonymousClass563 r2 = (AnonymousClass563) this;
        AnonymousClass5YG r0 = r2.A0I;
        if (r0 != null) {
            if (r0.A0a()) {
                C150197Pr r02 = r2.A10;
                if (r02 != null) {
                    C104965Ta r1 = r02.A09;
                    if (r1.A02) {
                        r1.A00();
                    }
                }
                r2.A0I.A0C();
            }
            if (!r2.A06()) {
                r2.A03();
            }
            r2.removeCallbacks(r2.A14);
            r2.A0E();
            r2.A04(500);
        }
    }

    public void A01() {
        AnonymousClass563 r2 = (AnonymousClass563) this;
        AnonymousClass7IV r1 = r2.A0D;
        if (r1 != null) {
            r1.A00 = true;
            r2.A0D = null;
        }
        r2.A0S = false;
        r2.A0W.removeCallbacksAndMessages(0);
    }

    public abstract void A02();

    public abstract void A03();

    public void A04(int i) {
        AnonymousClass563 r3 = (AnonymousClass563) this;
        C18260x0.A0w("InlineVideoPlaybackControlView delayControlsSync delay=", AnonymousClass001.A0o(), i);
        r3.A01();
        AnonymousClass7IV r1 = new AnonymousClass7IV(r3);
        r3.A0D = r1;
        Objects.requireNonNull(r1);
        r3.postDelayed(new C117095rN(r1, 38), (long) i);
    }

    public void A05(int i, int i2) {
        AnonymousClass563 r3 = (AnonymousClass563) this;
        AnonymousClass5YG r0 = r3.A0I;
        if (r0 != null && r0.A09() != null) {
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            Object[] A0M = AnonymousClass002.A0M();
            C18270x1.A1Q(A0M, i);
            AnonymousClass000.A1P(A0M, i2, 1);
            ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, A0M);
            ofObject.setDuration(150);
            C86604Kt.A0w(ofObject, r3, 33);
            ofObject.start();
        }
    }

    public boolean A06() {
        View view;
        AnonymousClass563 r1 = (AnonymousClass563) this;
        if (r1.A0N) {
            view = r1.A0s;
        } else {
            view = r1.A0t;
        }
        return C86654Ky.A1U(view);
    }

    public abstract List getFullscreenControls();

    public abstract List getInlineControls();

    public abstract void setCloseButtonListener(C1227165l r1);

    public abstract void setFullscreenButtonClickListener(C1227165l r1);

    public abstract void setMusicAttributionClickListener(C1227165l r1);

    public abstract void setPlayer(AnonymousClass5YG r1);

    public abstract void setPlayerElevation(int i);

    public abstract void setWatchMoreVideosText(String str);

    public AnonymousClass4P1(Context context) {
        super(context);
    }
}
