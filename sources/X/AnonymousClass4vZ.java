package X;

import android.view.MotionEvent;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.4vZ  reason: invalid class name */
public class AnonymousClass4vZ extends C109915fO {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ PhotoView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4vZ(AnonymousClass1VX r1, MediaViewFragment mediaViewFragment, PhotoView photoView, PhotoView photoView2, C30471mV r5) {
        super(r1, photoView, r5);
        this.A00 = mediaViewFragment;
        this.A01 = photoView2;
    }

    public void A01(InteractiveAnnotation interactiveAnnotation) {
        MediaViewFragment.A04(interactiveAnnotation, this.A00, this.A01);
    }

    public void A00(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            MediaViewFragment mediaViewFragment = this.A00;
            mediaViewFragment.A1W(true ^ mediaViewFragment.A0J, true);
        }
    }
}
