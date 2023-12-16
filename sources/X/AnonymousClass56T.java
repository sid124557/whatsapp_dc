package X;

import java.util.ArrayList;

/* renamed from: X.56T  reason: invalid class name */
public final class AnonymousClass56T extends C41022Iq {
    public static final ArrayList A04 = AnonymousClass0x2.A0i(new String[]{"APPROVED", "NO_REVIEW", "OUTDATED", "PENDING", "REJECTED"});
    public final C34801vq A00;
    public final C34801vq A01;
    public final C138906rC A02;
    public final String A03;

    public AnonymousClass56T(AnonymousClass36K r4) {
        AnonymousClass36K.A0N(r4, "status_info");
        this.A03 = C626836d.A0A(r4, A04, new String[]{"status", "#elementValue"});
        this.A02 = (C138906rC) C86614Ku.A0r(r4, new String[]{"can_appeal"}, 375);
        this.A01 = (C34801vq) C86614Ku.A0r(r4, new String[]{"reject_reason"}, 376);
        this.A00 = (C34801vq) C86614Ku.A0r(r4, new String[]{"commerce_url"}, 377);
        this.A00 = r4;
    }
}
