package X;

import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.5fL  reason: invalid class name and case insensitive filesystem */
public class C109885fL implements View.OnTouchListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public C109885fL(float f, float f2, float f3, float f4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ReducedAreaOnTouchListener/ignored_ratio -- left: ");
        A0o.append(f);
        A0o.append(", right: ");
        A0o.append(f3);
        A0o.append(", top: ");
        A0o.append(f2);
        A0o.append(", bottom: ");
        A0o.append(f4);
        C18280x3.A14(A0o);
        if (f < 0.0f || f > 1.0f || f3 < 0.0f || f3 > 1.0f || f2 < 0.0f || f2 > 1.0f || f4 < 0.0f || f4 > 1.0f) {
            throw new RuntimeException("invalid input parameters");
        }
        this.A01 = f;
        this.A02 = f3;
        this.A03 = f2;
        this.A00 = f4;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ReducedAreaOnTouchListener/onTouch ");
            A0o.append(motionEvent);
            A0o.append(", view width:");
            A0o.append(width);
            A0o.append(", view height:");
            A0o.append(height);
            A0o.append(", pointer count: ");
            C18260x0.A1G(A0o, motionEvent.getPointerCount());
        }
        if (motionEvent.getAction() != 0) {
            return false;
        }
        float f = (float) width;
        if (motionEvent.getX() >= this.A01 * f) {
            float f2 = (float) height;
            if (motionEvent.getY() >= this.A03 * f2 && motionEvent.getX() <= (1.0f - this.A02) * f && motionEvent.getY() <= (1.0f - this.A00) * f2) {
                return false;
            }
        }
        Log.i("ReducedAreaOnTouchListener/ignore this touch event");
        return true;
    }
}
