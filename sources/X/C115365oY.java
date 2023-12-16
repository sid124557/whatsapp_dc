package X;

import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;

/* renamed from: X.5oY  reason: invalid class name and case insensitive filesystem */
public final class C115365oY implements C185508tn {
    public int A00 = 1;
    public int A01;
    public final FrameLayout A02;
    public final LottieAnimationView A03;
    public final LottieAnimationView A04;

    public C115365oY(FrameLayout frameLayout) {
        this.A02 = frameLayout;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(frameLayout.getContext());
        A00(lottieAnimationView, R.raw.voice_to_video_icon_animation);
        frameLayout.addView(lottieAnimationView);
        this.A04 = lottieAnimationView;
        LottieAnimationView lottieAnimationView2 = new LottieAnimationView(frameLayout.getContext());
        A00(lottieAnimationView2, R.raw.video_to_voice_icon_animation);
        frameLayout.addView(lottieAnimationView2);
        this.A03 = lottieAnimationView2;
        this.A01 = R.color.f5nameremoved;
        BJU(1);
    }

    public final void A00(LottieAnimationView lottieAnimationView, int i) {
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        lottieAnimationView.setAnimation(i);
        C110795h3 r1 = new C110795h3(lottieAnimationView, this);
        AnonymousClass0QL r0 = lottieAnimationView.A03;
        if (r0 != null) {
            r1.BPb(r0);
        }
        lottieAnimationView.A0I.add(r1);
    }

    public void BJU(int i) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        this.A00 = i;
        if (i == 1) {
            lottieAnimationView = this.A03;
        } else {
            lottieAnimationView = this.A04;
            if (i != 1) {
                lottieAnimationView2 = this.A03;
                lottieAnimationView2.setVisibility(8);
                lottieAnimationView2.A00();
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.setProgress(1.0f);
            }
        }
        lottieAnimationView2 = this.A04;
        lottieAnimationView2.setVisibility(8);
        lottieAnimationView2.A00();
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setProgress(1.0f);
    }

    public void Bgt(int i) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        if (i != this.A00) {
            this.A00 = i;
            if (i == 1) {
                lottieAnimationView = this.A03;
            } else {
                lottieAnimationView = this.A04;
                if (i != 1) {
                    lottieAnimationView2 = this.A03;
                    lottieAnimationView2.setVisibility(8);
                    lottieAnimationView2.A00();
                    lottieAnimationView.setVisibility(0);
                    lottieAnimationView.A01();
                }
            }
            lottieAnimationView2 = this.A04;
            lottieAnimationView2.setVisibility(8);
            lottieAnimationView2.A00();
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.A01();
        }
    }

    public int getTint() {
        return this.A01;
    }

    public void setTint(int i) {
        this.A01 = i;
    }
}
