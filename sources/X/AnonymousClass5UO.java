package X;

import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;

/* renamed from: X.5UO  reason: invalid class name */
public class AnonymousClass5UO {
    public final /* synthetic */ MediaComposerFragment A00;

    public AnonymousClass5UO(MediaComposerFragment mediaComposerFragment) {
        this.A00 = mediaComposerFragment;
    }

    public void A00() {
        if (this instanceof AnonymousClass68B) {
            AnonymousClass68B r1 = (AnonymousClass68B) this;
            if (r1.A01 == 0) {
                ImageComposerFragment imageComposerFragment = (ImageComposerFragment) r1.A00;
                C109255eK r0 = imageComposerFragment.A06.A04;
                if (r0.A00 <= r0.A02) {
                    imageComposerFragment.A1X(true, false);
                }
            }
        }
    }

    public void A01() {
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) C86664Kz.A1E(this.A00);
        mediaComposerActivity.A0w.A02(mediaComposerActivity.A0t.A06());
    }

    public void A02() {
        C86664Kz.A1E(this.A00).BRS();
    }

    public void A03() {
        MediaComposerFragment mediaComposerFragment = this.A00;
        C003203q A0Q = mediaComposerFragment.A0Q();
        if (A0Q != null && !A0Q.isFinishing()) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) C86664Kz.A1E(mediaComposerFragment);
            if (!mediaComposerActivity.isFinishing()) {
                mediaComposerActivity.A1Y = false;
            }
        }
    }
}
