package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.68C  reason: invalid class name */
public class AnonymousClass68C extends PhotoView {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass68C(Context context, Object obj, int i) {
        super(context);
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        MediaViewBaseFragment mediaViewBaseFragment;
        switch (this.A01) {
            case 0:
                mediaViewBaseFragment = ((C114855ni) this.A00).A00;
                break;
            case 1:
                mediaViewBaseFragment = ((C114865nj) this.A00).A00;
                break;
            default:
                mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
                break;
        }
        mediaViewBaseFragment.A1W(AnonymousClass000.A1S((this.A00 > this.A04 ? 1 : (this.A00 == this.A04 ? 0 : -1))), true);
        return super.onDoubleTap(motionEvent);
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        MediaViewBaseFragment mediaViewBaseFragment;
        switch (this.A01) {
            case 0:
                mediaViewBaseFragment = ((C114855ni) this.A00).A00;
                break;
            case 1:
                mediaViewBaseFragment = ((C114865nj) this.A00).A00;
                break;
            default:
                mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
                break;
        }
        mediaViewBaseFragment.A1W(false, true);
        return super.onScaleBegin(scaleGestureDetector);
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        MediaViewBaseFragment mediaViewBaseFragment;
        int i = this.A01;
        super.onScaleEnd(scaleGestureDetector);
        switch (i) {
            case 0:
                mediaViewBaseFragment = ((C114855ni) this.A00).A00;
                break;
            case 1:
                mediaViewBaseFragment = ((C114865nj) this.A00).A00;
                break;
            default:
                mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
                break;
        }
        mediaViewBaseFragment.A1W(AnonymousClass0x7.A1P((this.A00 > this.A04 ? 1 : (this.A00 == this.A04 ? 0 : -1))), true);
    }
}
