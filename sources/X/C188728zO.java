package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.8zO  reason: invalid class name and case insensitive filesystem */
public class C188728zO extends View {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C188728zO(Context context, Object obj, int i) {
        super(context);
        this.A01 = i;
        this.A00 = obj;
    }

    public void onDraw(Canvas canvas) {
        if (this.A01 != 0) {
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
        AnonymousClass5UA r0 = (AnonymousClass5UA) this.A00;
        Path A012 = r0.A01();
        if (A012 != null) {
            canvas.drawPath(A012, r0.A02);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (1 - this.A01 != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }
}
