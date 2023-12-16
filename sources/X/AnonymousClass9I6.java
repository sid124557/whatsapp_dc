package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9I6  reason: invalid class name */
public final class AnonymousClass9I6 extends C41022Iq {
    public static final ArrayList A02 = AnonymousClass0x2.A0i(new String[]{"ACCOUNT_PENDING_LINKING", "ACTIVE", "EXTERNALLY_DISABLED", "HARD_BLOCKED", "INACTIVE", "INITED", "INTEGRITY_BLOCKED", "PENDING", "SOFT_BLOCKED"});
    public final AnonymousClass9I3 A00;
    public final List A01;

    public AnonymousClass9I6(AnonymousClass36K r10) {
        AnonymousClass36K r2 = r10;
        AnonymousClass36K.A0N(r10, "merchant");
        Class<String> cls = String.class;
        Long A0U = AnonymousClass0x2.A0U();
        C626836d.A05(r2, cls, A0U, 200L, (Object) null, new String[]{"gateway-name"}, false);
        C626836d.A05(r2, cls, A0U, 3000L, (Object) null, new String[]{"dashboard-url"}, false);
        C626836d.A05(r2, cls, A0U, 3000L, (Object) null, new String[]{"logo-uri"}, false);
        C626836d.A05(r2, Long.class, AnonymousClass0x2.A0T(), 50L, (Object) null, new String[]{"max_installment_count"}, false);
        AnonymousClass6C8.A13(r10, "display-state", A02);
        this.A00 = (AnonymousClass9I3) C205029qJ.A00(r10, 4);
        this.A01 = C626836d.A0B(r2, new C205029qJ(5), new String[]{"payout"}, 0, Long.MAX_VALUE);
        this.A00 = r10;
    }
}
