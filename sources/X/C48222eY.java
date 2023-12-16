package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.2eY  reason: invalid class name and case insensitive filesystem */
public final class C48222eY {
    public final C89654ea A00;

    public final void A01(AnonymousClass4GP r5, int i) {
        C89654ea r2 = this.A00;
        if (!C621433s.A03(r2)) {
            View inflate = View.inflate(r2, R.layout.f8nameremoved, (ViewGroup) null);
            AnonymousClass002.A09(inflate, R.id.passkey_success_dialog_message).setText(i);
            C19340zH A002 = AnonymousClass5V0.A00(r2);
            A002.A0a(inflate);
            AnonymousClass043 A0H = C18300x5.A0H(A002);
            A0H.show();
            r2.A05.A0T(new C70143a1(A0H, 1, r5), 1000);
        }
    }

    public C48222eY(C89654ea r1) {
        this.A00 = r1;
    }

    public final void A00() {
        this.A00.A6a(new C1236469f(0), new C111325hu(this), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
    }
}
