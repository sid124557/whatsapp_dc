package X;

import android.view.animation.AlphaAnimation;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.mediacomposer.VideoTimelineView;

/* renamed from: X.69R  reason: invalid class name */
public class AnonymousClass69R implements C183318pq {
    public Object A00;
    public final int A01;

    public AnonymousClass69R(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final void A00(AnonymousClass69R r4) {
        VideoComposerFragment videoComposerFragment = (VideoComposerFragment) r4.A00;
        videoComposerFragment.A05 = videoComposerFragment.A0V.A04;
        VideoTimelineView videoTimelineView = videoComposerFragment.A0R;
        if (videoTimelineView != null) {
            videoTimelineView.invalidate();
        }
        AlphaAnimation A0H = C86604Kt.A0H();
        A0H.setDuration(200);
        videoComposerFragment.A0C.startAnimation(A0H);
        videoComposerFragment.A0C.setVisibility(0);
        if (videoComposerFragment.A0d) {
            AnonymousClass5YG.A04(videoComposerFragment);
            videoComposerFragment.A0W.A0P((int) videoComposerFragment.A07);
            videoComposerFragment.A1M();
        }
    }

    public final void BPX(AnonymousClass5YG r7) {
        int i;
        switch (this.A01) {
            case 0:
                A00(this);
                return;
            case 1:
                C985451h r3 = (C985451h) this.A00;
                if (r7.A05() != 0) {
                    r3.A04++;
                }
                r3.A01++;
                if (r3.A03 == 0) {
                    AnonymousClass5YG r0 = r3.A02;
                    if (r0 != null) {
                        i = r0.A06();
                    } else {
                        i = 0;
                    }
                    r3.A03 = i;
                    if (i > 1) {
                        r3.A02 = r3.A0L((long) i);
                    } else {
                        r3.A03 = 0;
                    }
                }
                int i2 = r3.A04;
                int i3 = r3.A02;
                if (i2 >= i3 || r3.A01 >= i3 * 4) {
                    r3.A05.A00();
                    return;
                }
                r3.A00 = 0.0f;
                r7.A0P(0);
                r7.A0F();
                return;
            default:
                AnonymousClass563 r5 = (AnonymousClass563) this.A00;
                r5.A01();
                r7.A0C();
                if (r7 instanceof C34231uR) {
                    r5.A0Q = true;
                    r5.A0o.setImageResource(R.drawable.ic_pip_replay);
                    r5.A0p.setImageResource(R.drawable.ic_video_restart);
                } else {
                    r7.A0P(0);
                    r5.A0E();
                }
                r5.A0t.setProgress(0);
                r5.A0u.setProgress(0);
                r5.A0w.setText(AnonymousClass5VT.A01(r5.A15, r5.A16, 0));
                r5.A04(500);
                if (!r5.A06()) {
                    r5.A03();
                }
                C150197Pr r2 = r5.A10;
                if (r2 != null) {
                    C104965Ta r1 = r2.A09;
                    if (r1.A02) {
                        r1.A00();
                    }
                    r2.A03 = true;
                    return;
                }
                return;
        }
    }
}
