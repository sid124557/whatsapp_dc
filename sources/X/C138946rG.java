package X;

import java.util.ArrayList;

/* renamed from: X.6rG  reason: invalid class name and case insensitive filesystem */
public final class C138946rG extends C41022Iq {
    public static final ArrayList A01 = C18260x0.A0C("0", "1");
    public static final ArrayList A02 = C18260x0.A0C("0", "1");
    public static final ArrayList A03 = C18260x0.A0C("0", "1");
    public static final ArrayList A04 = C18260x0.A0C("0", "1");
    public static final ArrayList A05 = AnonymousClass0x2.A0i(new String[]{"DISABLED", "ENABLED", "REQUIRES_VERIFICATION"});
    public static final ArrayList A06 = AnonymousClass0x2.A0i(new String[]{"DISABLED", "ENABLED", "REQUIRES_VERIFICATION"});
    public static final ArrayList A07 = AnonymousClass0x2.A0i(new String[]{"DISABLED", "ENABLED", "REQUIRES_VERIFICATION"});
    public static final ArrayList A08 = AnonymousClass0x2.A0i(new String[]{"DISABLED", "ENABLED", "REQUIRES_VERIFICATION"});
    public static final ArrayList A09 = C18260x0.A0C("0", "1");
    public final AnonymousClass36K A00;

    public C138946rG(AnonymousClass36K r4) {
        AnonymousClass36K.A0N(r4, "card");
        AnonymousClass6C8.A12(r4, "capabilities", "editable", A04);
        AnonymousClass6C8.A12(r4, "capabilities", "verifiable", A09);
        AnonymousClass6C8.A12(r4, "capabilities", "default-eligible", A03);
        C626836d.A09(r4, A02, new String[]{"capabilities", "default-eligible-p2p"});
        C626836d.A09(r4, A01, new String[]{"capabilities", "default-eligible-p2m"});
        AnonymousClass6C8.A12(r4, "capabilities", "p2p-send", A08);
        AnonymousClass6C8.A12(r4, "capabilities", "p2p-receive", A07);
        AnonymousClass6C8.A12(r4, "capabilities", "p2m-send", A06);
        AnonymousClass6C8.A12(r4, "capabilities", "p2m-receive", A05);
        this.A00 = r4;
        this.A00 = (AnonymousClass36K) C18290x4.A0k(C1896292a.A0N(r4, new String[]{"capabilities"}, 49));
    }
}
