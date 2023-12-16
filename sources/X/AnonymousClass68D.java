package X;

import android.view.MotionEvent;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.68D  reason: invalid class name */
public class AnonymousClass68D extends C109915fO {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass68D(AnonymousClass1VX r1, MediaViewFragment mediaViewFragment, PhotoView photoView, PhotoView photoView2, C30471mV r5, AnonymousClass561 r6, int i) {
        super(r1, photoView, r5);
        this.A03 = i;
        this.A00 = mediaViewFragment;
        this.A02 = photoView2;
        this.A01 = r6;
    }

    public void A01(InteractiveAnnotation interactiveAnnotation) {
        MediaViewFragment.A04(interactiveAnnotation, (MediaViewFragment) this.A00, (PhotoView) this.A02);
    }

    public void A00(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            AnonymousClass561 r1 = (AnonymousClass561) this.A01;
            if (C86604Kt.A1Y(r1.A0E)) {
                r1.A04();
                return;
            }
            r1.A05();
            r1.A0E(3000);
        }
    }
}
