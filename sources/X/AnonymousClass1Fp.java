package X;

import com.whatsapp.webview.ui.WaInAppBrowsingActivity;

/* renamed from: X.1Fp  reason: invalid class name */
public abstract class AnonymousClass1Fp extends C89644eZ {
    public boolean A00 = false;

    public static void A0C(C64333Db r1, C107695bk r2, WaInAppBrowsingActivity waInAppBrowsingActivity) {
        waInAppBrowsingActivity.A04 = (C85244Fm) r1.AJ2.get();
        waInAppBrowsingActivity.A06 = r2.APo();
        waInAppBrowsingActivity.A05 = (AnonymousClass36Y) r1.A7u.get();
        waInAppBrowsingActivity.A07 = (AnonymousClass306) r1.A9s.get();
    }

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            WaInAppBrowsingActivity waInAppBrowsingActivity = (WaInAppBrowsingActivity) this;
            C64333Db r1 = ((C88834as) AnonymousClass0x9.A0K(this)).A4Z;
            AnonymousClass1Hf.A2G(r1, waInAppBrowsingActivity);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, waInAppBrowsingActivity);
            AnonymousClass1Ha.A24(r1, waInAppBrowsingActivity);
            A0C(r1, r0, waInAppBrowsingActivity);
        }
    }

    public AnonymousClass1Fp() {
        AnonymousClass4HY.A00(this, 131);
    }
}
