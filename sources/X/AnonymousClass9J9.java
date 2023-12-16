package X;

import com.whatsapp.payments.phoenix.webview.activity.FcsWebViewActivity;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;

/* renamed from: X.9J9  reason: invalid class name */
public abstract class AnonymousClass9J9 extends WaInAppBrowsingActivity {
    public boolean A00 = false;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            FcsWebViewActivity fcsWebViewActivity = (FcsWebViewActivity) this;
            C64333Db r2 = ((C88834as) AnonymousClass0x9.A0K(this)).A4Z;
            C1899593h.A15(r2, fcsWebViewActivity);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, fcsWebViewActivity, C1899593h.A0W(r2, r1, fcsWebViewActivity));
            C1899593h.A14(r2, r1, fcsWebViewActivity);
            fcsWebViewActivity.A02 = C1899593h.A0N(r2);
            fcsWebViewActivity.A04 = C1899693i.A0V(r2);
        }
    }

    public AnonymousClass9J9() {
        C204019og.A00(this, 16);
    }
}
