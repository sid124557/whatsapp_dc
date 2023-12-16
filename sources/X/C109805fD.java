package X;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.5fD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C109805fD implements View.OnKeyListener {
    public final /* synthetic */ C102855Kn A00;
    public final /* synthetic */ boolean A01;

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C102855Kn r2 = this.A00;
        if (!this.A01 || keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 66 || !keyEvent.isCtrlPressed()) {
            return false;
        }
        C86624Kv.A1A(r2.A06);
        return true;
    }

    public /* synthetic */ C109805fD(C102855Kn r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }
}
