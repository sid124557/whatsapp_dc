package X;

import java.util.ArrayList;

/* renamed from: X.9I5  reason: invalid class name */
public final class AnonymousClass9I5 extends C41022Iq {
    public static final ArrayList A01 = C18260x0.A0C("0", "1");
    public static final ArrayList A02 = C18260x0.A0C("0", "1");
    public static final ArrayList A03 = C18260x0.A0C("0", "1");
    public static final ArrayList A04 = C18260x0.A0C("0", "1");
    public static final ArrayList A05 = C1899593h.A0e("DISABLED", "ENABLED", "REQUIRES_VERIFICATION");
    public static final ArrayList A06 = C1899593h.A0e("DISABLED", "ENABLED", "REQUIRES_VERIFICATION");
    public static final ArrayList A07 = C1899593h.A0e("DISABLED", "ENABLED", "REQUIRES_VERIFICATION");
    public static final ArrayList A08 = C1899593h.A0e("DISABLED", "ENABLED", "REQUIRES_VERIFICATION");
    public static final ArrayList A09 = C18260x0.A0C("0", "1");
    public final AnonymousClass36K A00;

    public AnonymousClass9I5(AnonymousClass36K r11) {
        AnonymousClass36K.A0N(r11, "card");
        AnonymousClass6C8.A12(r11, "capabilities", "editable", A04);
        AnonymousClass6C8.A12(r11, "capabilities", "verifiable", A09);
        AnonymousClass6C8.A12(r11, "capabilities", "default-eligible", A03);
        C626836d.A09(r11, A02, new String[]{"capabilities", "default-eligible-p2p"});
        C626836d.A09(r11, A01, new String[]{"capabilities", "default-eligible-p2m"});
        AnonymousClass6C8.A12(r11, "capabilities", "p2p-send", A08);
        AnonymousClass6C8.A12(r11, "capabilities", "p2p-receive", A07);
        AnonymousClass6C8.A12(r11, "capabilities", "p2m-send", A06);
        AnonymousClass6C8.A12(r11, "capabilities", "p2m-receive", A05);
        this.A00 = r11;
        this.A00 = (AnonymousClass36K) C18290x4.A0k(C626836d.A0B(r11, new C205029qJ(11), new String[]{"capabilities"}, 1, 1));
    }
}
