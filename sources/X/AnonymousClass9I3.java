package X;

import java.util.ArrayList;

/* renamed from: X.9I3  reason: invalid class name */
public final class AnonymousClass9I3 extends C41022Iq {
    public static final ArrayList A01 = C18260x0.A0C("0", "1");
    public static final ArrayList A02 = C18260x0.A0C("0", "1");
    public static final ArrayList A03 = C18260x0.A0C("0", "1");
    public static final ArrayList A04 = C1899593h.A0e("0", "1", "2");
    public final C192049Hz A00;

    public AnonymousClass9I3(AnonymousClass36K r19) {
        AnonymousClass36K r4 = r19;
        AnonymousClass36K.A0N(r4, "merchant");
        Class<String> cls = String.class;
        Long A0U = AnonymousClass0x2.A0U();
        Long A0i = AnonymousClass0x7.A0i();
        C626836d.A06(r4, cls, A0U, A0i, (Object) null, new String[]{"merchant-id"}, false);
        AnonymousClass36K r11 = r4;
        Class<String> cls2 = cls;
        Long l = A0U;
        C626836d.A05(r11, cls2, l, 200L, (Object) null, new String[]{"business-name"}, false);
        C626836d.A05(r11, cls2, l, AnonymousClass6C9.A0Y(), (Object) null, new String[]{"support-phone-number"}, false);
        C626836d.A05(r4, cls, A0U, A0i, (Object) null, new String[]{"provider-type"}, false);
        AnonymousClass6C8.A13(r4, "can-sell", A03);
        AnonymousClass6C8.A13(r4, "can-payout", A02);
        AnonymousClass6C8.A13(r4, "can-add-payout", A01);
        C41022Iq.A01(r4, "pix-onboarding-state", A04);
        this.A00 = (C192049Hz) C205029qJ.A00(r4, 23);
        this.A00 = r4;
    }
}
