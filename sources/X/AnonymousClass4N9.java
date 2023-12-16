package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.whatsapp.WaEditText;

/* renamed from: X.4N9  reason: invalid class name */
public class AnonymousClass4N9 extends GestureDetector.SimpleOnGestureListener {
    public int A00 = -1;
    public final /* synthetic */ ScrollView A01;
    public final /* synthetic */ WaEditText A02;

    public AnonymousClass4N9(ScrollView scrollView, WaEditText waEditText) {
        this.A02 = waEditText;
        this.A01 = scrollView;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.A01.requestDisallowInterceptTouchEvent(true);
        return super.onDown(motionEvent);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        WaEditText waEditText = this.A02;
        if (C86634Kw.A1X(waEditText)) {
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
        int i = this.A00;
        this.A00 = waEditText.getScrollY();
        waEditText.scrollBy((int) (f + 0.5f), (int) (0.5f + f2));
        if ((f2 >= 0.0f || waEditText.getScrollY() > 0) && (f2 <= 0.0f || i != this.A00)) {
            return true;
        }
        this.A01.requestDisallowInterceptTouchEvent(false);
        this.A00 = -1;
        return true;
    }
}
