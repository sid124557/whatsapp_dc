package X;

import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.97b  reason: invalid class name and case insensitive filesystem */
public abstract class C1904997b extends C89644eZ {
    public boolean A00 = false;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            WaBloksActivity waBloksActivity = (WaBloksActivity) this;
            C88834as r4 = (C88834as) AnonymousClass0x9.A0K(this);
            C64333Db r2 = r4.A4Z;
            C1899593h.A15(r2, waBloksActivity);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, waBloksActivity, C1899593h.A0W(r2, r1, waBloksActivity));
            A0L(r4, r2, r1, waBloksActivity);
        }
    }

    public C1904997b() {
        C204019og.A00(this, 125);
    }

    public static void A0L(C88834as r1, C64333Db r2, C107695bk r3, WaBloksActivity waBloksActivity) {
        waBloksActivity.A08 = C72343dZ.A00(r2.A2X);
        waBloksActivity.A04 = (C55742qq) r2.A2W.get();
        waBloksActivity.A0B = r3.AQW();
        waBloksActivity.A00 = (C44122Ut) r1.A4Q.get();
        waBloksActivity.A07 = C72343dZ.A00(r2.AS9);
        waBloksActivity.A03 = (C40142Er) r2.A2h.get();
        waBloksActivity.A0A = r1.ADP();
        waBloksActivity.A02 = r2.Ahl();
    }
}
