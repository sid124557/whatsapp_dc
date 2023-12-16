package X;

import android.graphics.Matrix;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;

/* renamed from: X.5PQ  reason: invalid class name */
public class AnonymousClass5PQ {
    public final /* synthetic */ ImagePreviewContentLayout A00;

    public AnonymousClass5PQ(ImagePreviewContentLayout imagePreviewContentLayout) {
        this.A00 = imagePreviewContentLayout;
    }

    public void A00(Matrix matrix) {
        ImagePreviewContentLayout imagePreviewContentLayout = this.A00;
        C114825nf r1 = imagePreviewContentLayout.A02;
        r1.A0N.A0A.set(matrix);
        r1.A0M.invalidate();
        imagePreviewContentLayout.invalidate();
    }

    public void A01(boolean z) {
        boolean z2;
        boolean z3;
        C179458jB r0 = this.A00.A03;
        if (r0 != null) {
            ImageComposerFragment imageComposerFragment = ((C171428Ha) r0).A00;
            if (z) {
                z2 = true;
                z3 = false;
            } else {
                z2 = false;
                z3 = true;
            }
            imageComposerFragment.A1X(z2, z3);
        }
    }
}
