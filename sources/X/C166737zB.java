package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.7zB  reason: invalid class name and case insensitive filesystem */
public class C166737zB implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ VideoComposerFragment A00;

    public C166737zB(VideoComposerFragment videoComposerFragment) {
        this.A00 = videoComposerFragment;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.A00.A1X();
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }
}
