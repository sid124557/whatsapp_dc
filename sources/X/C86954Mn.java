package X;

import android.os.Handler;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: X.4Mn  reason: invalid class name and case insensitive filesystem */
public final class C86954Mn extends LinkMovementMethod {
    public boolean A00;
    public final Handler A01 = AnonymousClass000.A0A();

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        TextView textView2 = textView;
        C162457s7.A0J(textView, 0);
        MotionEvent motionEvent2 = motionEvent;
        C18270x1.A10(spannable, 1, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3) {
            this.A01.removeCallbacksAndMessages((Object) null);
        } else if (action == 0 || action == 1) {
            float x = (motionEvent.getX() - ((float) textView.getTotalPaddingLeft())) + ((float) textView.getScrollX());
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((motionEvent.getY() - ((float) textView.getTotalPaddingTop())) + ((float) textView.getScrollY()))), x);
            AnonymousClass4CF[] r8 = (AnonymousClass4CF[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, AnonymousClass4CF.class);
            if (!(r8 == null || r8.length == 0)) {
                if (action == 1) {
                    this.A01.removeCallbacksAndMessages((Object) null);
                    if (!this.A00) {
                        r8[0].BP4(motionEvent, textView);
                    }
                    this.A00 = false;
                    return true;
                }
                this.A01.postDelayed(new C71593cM((Object) this, (Object) r8, (Object) textView2, (Object) motionEvent2, 8), 500);
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
