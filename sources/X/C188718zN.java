package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.qrcode.QrScannerViewV2;

/* renamed from: X.8zN  reason: invalid class name and case insensitive filesystem */
public class C188718zN extends GestureDetector.SimpleOnGestureListener {
    public Object A00;
    public final int A01;

    public C188718zN(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.A01 != 0) {
            return super.onDoubleTap(motionEvent);
        }
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        if (4 - this.A01 != 0) {
            super.onLongPress(motionEvent);
            return;
        }
        View view = (View) this.A00;
        if (view.isLongClickable()) {
            view.performLongClick();
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (3 - this.A01 != 0) {
            return super.onSingleTapConfirmed(motionEvent);
        }
        ((QrScannerViewV2) this.A00).A01.B3Q(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.A01) {
            case 1:
                StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) this.A00;
                return ((C185858uM) ((C88004Wy) stickyHeadersRecyclerView.A0N).A00).Bck(motionEvent, stickyHeadersRecyclerView.A08, stickyHeadersRecyclerView.A02);
            case 2:
                return ((AnonymousClass5Y7) this.A00).A07();
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
