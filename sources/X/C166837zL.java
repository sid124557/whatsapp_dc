package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7zL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C166837zL implements View.OnHoverListener {
    public final /* synthetic */ C116505qO A00;

    public final boolean onHover(View view, MotionEvent motionEvent) {
        C116505qO r2 = this.A00;
        if (!C107295b4.A08(r2.A0S.A0P()) || motionEvent.getActionMasked() != 10) {
            return false;
        }
        r2.A08.requestFocus();
        r2.A08.performClick();
        return true;
    }

    public /* synthetic */ C166837zL(C116505qO r1) {
        this.A00 = r1;
    }
}
