package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: X.6F7  reason: invalid class name */
public class AnonymousClass6F7 extends WebView {
    public final /* synthetic */ AnonymousClass6FL A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6F7(Context context, AnonymousClass6FL r3) {
        super(context, (AttributeSet) null);
        this.A00 = r3;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    public boolean performClick() {
        super.performClick();
        return false;
    }
}
