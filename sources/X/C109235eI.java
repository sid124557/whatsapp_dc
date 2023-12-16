package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: X.5eI  reason: invalid class name and case insensitive filesystem */
public class C109235eI implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00 = 1.0f;
    public boolean A01;
    public final ScaleGestureDetector A02;
    public final AnonymousClass0N1 A03;
    public final C186148up A04;

    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.A04.BRT(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A01) {
            return false;
        }
        if (Math.abs(f) > Math.abs(f2)) {
            this.A04.BUM(f);
            return true;
        }
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        C186148up r0 = this.A04;
        if (i < 0) {
            r0.BTc();
            return true;
        }
        r0.BTb();
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A01) {
            return false;
        }
        if (f2 < 0.0f) {
            this.A04.BTb();
        }
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.A04.Bbi(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public C109235eI(Context context, C186148up r3, boolean z) {
        this.A03 = new AnonymousClass0N1(context, this);
        this.A02 = new ScaleGestureDetector(context, this);
        this.A01 = z;
        this.A04 = r3;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f = this.A00 * scaleFactor * scaleFactor;
        this.A00 = f;
        if (f < 1.0f) {
            this.A00 = 1.0f;
            f = 1.0f;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("cameraview/on-scale ");
        A0o.append(f);
        AnonymousClass0x2.A18(A0o);
        this.A04.Bft(this.A00);
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("cameraview/on-scale-begin ");
        A0o.append(this.A00);
        AnonymousClass0x2.A18(A0o);
        this.A04.Bfu(this.A00);
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("cameraview/on-scale-end ");
        A0o.append(this.A00);
        AnonymousClass0x2.A18(A0o);
        this.A04.Bfv(this.A00);
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
