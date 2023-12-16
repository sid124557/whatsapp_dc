package X;

import java.util.ArrayList;

/* renamed from: X.6sa  reason: invalid class name and case insensitive filesystem */
public final class C139766sa extends C34771vn {
    public static final ArrayList A06 = C18260x0.A0C("HPP_PAYMENT_LINK", "UPI");
    public final AnonymousClass36K A00;
    public final C34841vu A01;
    public final C138756qw A02;
    public final C34811vr A03;
    public final C34981w8 A04;
    public final C34821vs A05;

    public C139766sa(AnonymousClass36K r12, C35681xG r13) {
        AnonymousClass36K r4 = r12;
        AnonymousClass36K A022 = C41032Ir.A02(r12, r13);
        Class<String> cls = String.class;
        C626836d.A0F(r12, cls, "upi-get-p2m-checkout-session", new String[]{"account", "action"});
        Long A0U = AnonymousClass0x2.A0U();
        Long A0i = AnonymousClass0x7.A0i();
        C626836d.A06(r4, cls, A0U, A0i, (Object) null, new String[]{"account", "order_id"}, false);
        C626836d.A06(r4, cls, A0U, A0i, (Object) null, new String[]{"account", "payment_provider"}, false);
        AnonymousClass6C8.A12(r12, "account", "payment_type", A06);
        this.A04 = (C34981w8) C626836d.A02(r12, new AnonymousClass92Z(A022, 78), 0);
        this.A01 = (C34841vu) C86614Ku.A0r(r12, new String[]{"account", "hpp_payment_link"}, 408);
        this.A02 = (C138756qw) C86614Ku.A0r(r12, new String[]{"account", "upi"}, 409);
        this.A05 = (C34821vs) C86614Ku.A0r(r12, new String[]{"account", "amount"}, 410);
        this.A03 = (C34811vr) C86614Ku.A0r(r12, new String[]{"account", "l2checkout"}, 411);
        this.A00 = r12;
        this.A00 = (AnonymousClass36K) C1896292a.A0N(r12, new String[]{"account"}, 412).get(0);
    }
}
