package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediaview.PhotoView;
import java.util.Iterator;

/* renamed from: X.4kd  reason: invalid class name and case insensitive filesystem */
public class C91654kd extends C89084bS {
    public final /* synthetic */ MediaComposerActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91654kd(C08270df r1, MediaComposerActivity mediaComposerActivity) {
        super(r1);
        this.A00 = mediaComposerActivity;
    }

    public int A0C() {
        return AnonymousClass4SG.A2L(this.A00);
    }

    public /* bridge */ /* synthetic */ int A0G(Object obj) {
        int indexOf = AnonymousClass4SG.A31(this.A00).indexOf(((MediaComposerFragment) ((C08310eF) obj)).A00);
        if (indexOf < 0) {
            return -2;
        }
        return A0M(indexOf);
    }

    public void A0L(ViewGroup viewGroup, C08310eF r4, int i) {
        PhotoView photoView;
        if (r4 instanceof ImageComposerFragment) {
            ((ImageComposerFragment) r4).A06.A00();
        } else {
            View view = r4.A0B;
            if (!(view == null || (photoView = (PhotoView) view.findViewById(R.id.photo)) == null)) {
                photoView.A02();
            }
        }
        super.A0I(viewGroup, r4, i);
    }

    public final int A0M(int i) {
        MediaComposerActivity mediaComposerActivity = this.A00;
        if (!C620733j.A04(mediaComposerActivity.A0Z)) {
            return (AnonymousClass4SG.A2L(mediaComposerActivity) - i) - 1;
        }
        return i;
    }

    public void A09(ViewGroup viewGroup) {
        super.A09(viewGroup);
        MediaComposerActivity mediaComposerActivity = this.A00;
        if (C86604Kt.A05(mediaComposerActivity.A0t.A02) < 0 && !AnonymousClass4SG.A31(mediaComposerActivity).isEmpty()) {
            mediaComposerActivity.A7J(0);
        }
        Iterator A4M = C89654ea.A4M(mediaComposerActivity);
        while (A4M.hasNext()) {
            C08310eF A0D = AnonymousClass4L0.A0D(A4M);
            if (A0D instanceof MediaComposerFragment) {
                MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) A0D;
                mediaComposerFragment.A1P(mediaComposerActivity.A1k);
                if (mediaComposerActivity.A1V && mediaComposerFragment.A00.equals(mediaComposerActivity.B4X())) {
                    mediaComposerFragment.A1L();
                    mediaComposerFragment.A1K();
                }
            }
        }
    }
}
