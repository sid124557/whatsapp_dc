package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.4N3  reason: invalid class name */
public class AnonymousClass4N3 extends URLSpan implements AnonymousClass8r4 {
    public int A00;
    public int A01;
    public boolean A02;

    public AnonymousClass4N3(Context context, String str) {
        super(str);
        int A04 = AnonymousClass0Y8.A04(context, C18290x4.A00(context));
        this.A01 = A04;
        this.A00 = AnonymousClass0YI.A06(A04, 72);
    }

    public void BeF(MotionEvent motionEvent, View view) {
        boolean z = true;
        if (motionEvent.getAction() == 1 && this.A02) {
            onClick(view);
        }
        if (motionEvent.getAction() != 0) {
            z = false;
        }
        this.A02 = z;
        view.invalidate();
    }

    public void updateDrawState(TextPaint textPaint) {
        int i;
        super.updateDrawState(textPaint);
        textPaint.setColor(this.A01);
        if (this.A02) {
            i = this.A00;
        } else {
            i = 0;
        }
        textPaint.bgColor = i;
        textPaint.setUnderlineText(false);
    }
}
