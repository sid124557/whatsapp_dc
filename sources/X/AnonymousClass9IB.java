package X;

import java.util.ArrayList;

/* renamed from: X.9IB  reason: invalid class name */
public final class AnonymousClass9IB extends C41022Iq implements C202219lZ {
    public static final ArrayList A01 = C1899593h.A0e("FAILED", "PENDING", "VERIFIED");
    public final C192049Hz A00;

    public AnonymousClass9IB(AnonymousClass36K r10) {
        AnonymousClass36K r2 = r10;
        Class<String> cls = String.class;
        C626836d.A0F(r10, cls, "bank", AnonymousClass36K.A0Z(r10, "payout"));
        Long A0U = AnonymousClass0x2.A0U();
        Long A0i = AnonymousClass0x7.A0i();
        C626836d.A05(r2, cls, A0U, A0i, (Object) null, new String[]{"account-number"}, false);
        C626836d.A06(r2, cls, A0U, A0i, (Object) null, new String[]{"bank-name"}, false);
        C626836d.A05(r2, cls, A0U, A0i, (Object) null, new String[]{"code"}, false);
        AnonymousClass6C8.A13(r10, "verification-status", A01);
        this.A00 = (C192049Hz) C205029qJ.A00(r10, 35);
        this.A00 = r10;
    }
}
