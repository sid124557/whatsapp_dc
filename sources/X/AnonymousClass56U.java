package X;

import java.util.ArrayList;

/* renamed from: X.56U  reason: invalid class name */
public final class AnonymousClass56U extends C41022Iq {
    public static final ArrayList A05 = AnonymousClass0x2.A0i(new String[]{"APPROVED", "NO_REVIEW", "OUTDATED", "PENDING", "REJECTED"});
    public final AnonymousClass36K A00;
    public final C34801vq A01;
    public final C34801vq A02;
    public final C138886rA A03;
    public final String A04;

    public AnonymousClass56U(AnonymousClass36K r12) {
        this.A04 = C626836d.A0A(r12, A05, new String[]{"status_info", "status", "#elementValue"});
        this.A03 = (C138886rA) C86614Ku.A0r(r12, new String[]{"status_info", "can_appeal"}, 353);
        this.A02 = (C34801vq) C86614Ku.A0r(r12, new String[]{"status_info", "reject_reason"}, 354);
        this.A01 = (C34801vq) C86614Ku.A0r(r12, new String[]{"status_info", "commerce_url"}, 355);
        this.A00 = r12;
        this.A00 = (AnonymousClass36K) C18290x4.A0k(C626836d.A0B(r12, new C1896292a(356), new String[]{"status_info"}, 1, 1));
    }
}
