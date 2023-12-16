package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.7RX  reason: invalid class name */
public final class AnonymousClass7RX {
    public C88694ab A00;

    public final void A00(View view, int i) {
        C162457s7.A0J(view, 0);
        int i2 = R.string.f11nameremoved;
        if (i == 2) {
            i2 = R.string.f11nameremoved;
        }
        String string = view.getResources().getString(i2);
        C162457s7.A0D(string);
        C88694ab r1 = this.A00;
        if (r1 != null) {
            r1.A08(3);
        }
        C88694ab A01 = C88694ab.A01(view, string, -1);
        A01.A0J.setElevation(1000.0f);
        A01.A0A(new AnonymousClass6ZJ(this));
        this.A00 = A01;
        A01.A05();
    }
}
