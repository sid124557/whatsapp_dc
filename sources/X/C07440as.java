package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.0as  reason: invalid class name and case insensitive filesystem */
public class C07440as implements TextView.OnEditorActionListener {
    public final /* synthetic */ C153427bI A00;
    public final /* synthetic */ AnonymousClass84O A01;
    public final /* synthetic */ C835248t A02;

    public C07440as(C153427bI r1, AnonymousClass84O r2, C835248t r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C835248t r5 = this.A02;
        if (r5 == null) {
            return false;
        }
        C152057Xj r0 = new C152057Xj();
        AnonymousClass84O r2 = this.A01;
        r0.A05(r2, 0);
        C153427bI r1 = this.A00;
        r0.A05(r1, 1);
        C159377lj.A01(r1, r2, r0.A03(), r5);
        return true;
    }
}
