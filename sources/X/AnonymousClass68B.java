package X;

import android.view.animation.AlphaAnimation;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.68B  reason: invalid class name */
public class AnonymousClass68B extends AnonymousClass5UO {
    public Object A00;
    public final int A01 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass68B(ImageComposerFragment imageComposerFragment) {
        super(imageComposerFragment);
        this.A00 = imageComposerFragment;
    }

    public void A01() {
        if (this.A01 != 0) {
            super.A01();
            AlphaAnimation A0G = C86604Kt.A0G();
            A0G.setDuration(300);
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this.A00;
            videoComposerFragment.A0E.setVisibility(4);
            videoComposerFragment.A0E.startAnimation(A0G);
            return;
        }
        MediaComposerActivity A0Y = C86644Kx.A0Y((C08310eF) this.A00);
        A0Y.A0w.A02(A0Y.A0t.A06());
    }

    public void A02() {
        C114825nf r0;
        if (this.A01 != 0) {
            super.A02();
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this.A00;
            if (videoComposerFragment.A0E.getVisibility() != 0) {
                AlphaAnimation A0H = C86604Kt.A0H();
                A0H.setDuration(300);
                videoComposerFragment.A0E.setVisibility(0);
                videoComposerFragment.A0E.startAnimation(A0H);
                return;
            }
            return;
        }
        ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this.A00;
        C86664Kz.A1E(imageComposerFragment).BRS();
        C109255eK r02 = imageComposerFragment.A06.A04;
        if (r02.A00 <= r02.A02 && (r0 = imageComposerFragment.A0E) != null && r0.A0J.A05.getVisibility() != 0) {
            imageComposerFragment.A1X(true, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0.A0O != 3) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r5 = this;
            int r0 = r5.A01
            if (r0 == 0) goto L_0x0008
            super.A03()
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r4 = r5.A00
            com.whatsapp.mediacomposer.ImageComposerFragment r4 = (com.whatsapp.mediacomposer.ImageComposerFragment) r4
            X.5Y7 r3 = r4.A07
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A07
            if (r0 == 0) goto L_0x0018
            int r2 = r0.A0O
            r0 = 3
            r1 = 1
            if (r2 == r0) goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            boolean r0 = r3.A07()
            if (r1 == 0) goto L_0x0021
            if (r0 == 0) goto L_0x0027
        L_0x0021:
            r1 = r0 ^ 1
            r0 = 0
            r4.A1X(r0, r1)
        L_0x0027:
            X.8uh r2 = X.C86664Kz.A1E(r4)
            X.5Y7 r0 = r4.A07
            boolean r1 = r0.A0F
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x0007
            r2.A1Y = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass68B.A03():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass68B(VideoComposerFragment videoComposerFragment) {
        super(videoComposerFragment);
        this.A00 = videoComposerFragment;
    }
}
