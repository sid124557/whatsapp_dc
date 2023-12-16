package X;

import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.mediacomposer.VideoTimelineView;

/* renamed from: X.5nX  reason: invalid class name and case insensitive filesystem */
public class C114745nX implements C182588of {
    public final /* synthetic */ VideoComposerFragment A00;

    public C114745nX(VideoComposerFragment videoComposerFragment) {
        this.A00 = videoComposerFragment;
    }

    public void Be7(VideoTimelineView videoTimelineView, int i, long j, long j2) {
        long j3 = j2;
        VideoComposerFragment videoComposerFragment = this.A00;
        AnonymousClass5YG.A04(videoComposerFragment);
        long j4 = j;
        videoComposerFragment.A07 = j4;
        videoComposerFragment.A08 = j3;
        long j5 = 0;
        if (j - 200 <= 0 && j2 + 200 >= videoComposerFragment.A0V.A04) {
            j3 = 0;
        } else if (j2 - j < 1000) {
            j3 = Math.min(j + 1000, videoComposerFragment.A0V.A04);
            j5 = Math.max(0, j3 - 1000);
        } else {
            j5 = j4;
        }
        C86664Kz.A1E(videoComposerFragment).Bng(videoComposerFragment.A00, j5, j3);
        videoComposerFragment.A0W.A0P((int) j4);
        videoComposerFragment.A1N();
        videoComposerFragment.A1W();
        videoComposerFragment.A1V();
        if (videoComposerFragment.A0a) {
            videoComposerFragment.A1U();
        }
    }
}
