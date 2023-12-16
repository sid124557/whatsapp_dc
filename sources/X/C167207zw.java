package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.7zw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C167207zw implements TextView.OnEditorActionListener {
    public final /* synthetic */ C185458ti A00;
    public final /* synthetic */ C102855Kn A01;
    public final /* synthetic */ boolean A02;

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C102855Kn r4 = this.A01;
        boolean z = this.A02;
        C185458ti r2 = this.A00;
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        if (z) {
            r2.BOV();
            return true;
        }
        r4.A06.A05();
        return true;
    }

    public /* synthetic */ C167207zw(C185458ti r1, C102855Kn r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }
}
