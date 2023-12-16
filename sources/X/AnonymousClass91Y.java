package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.timepicker.ClockFaceView;

/* renamed from: X.91Y  reason: invalid class name */
public class AnonymousClass91Y implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public final int A01;

    public AnonymousClass91Y(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean onPreDraw() {
        switch (this.A01) {
            case 0:
                ClockFaceView clockFaceView = (ClockFaceView) this.A00;
                if (!clockFaceView.isShown()) {
                    return true;
                }
                AnonymousClass0x7.A16(clockFaceView, this);
                clockFaceView.setRadius(((clockFaceView.getHeight() / 2) - clockFaceView.A0C.A07) - clockFaceView.A02);
                return true;
            case 1:
                ((C113245l7) this.A00).A5X.A07();
                return true;
            case 2:
                C111445i6 r1 = (C111445i6) this.A00;
                if (r1.A0M.getHeight() <= 0 || !r1.A1R.isEmpty()) {
                    return true;
                }
                AnonymousClass0x7.A16(r1.A0M, this);
                View view = r1.A0M;
                view.setTranslationY(C86664Kz.A02(view));
                return true;
            default:
                C108145cU r2 = (C108145cU) this.A00;
                AnonymousClass0x7.A16(r2.A0J, this);
                r2.A0F(r2.A0J.getHeight());
                r2.A0T(false);
                r2.A0O((Float) null, false);
                return true;
        }
    }
}
