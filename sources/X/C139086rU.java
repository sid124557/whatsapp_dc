package X;

import java.util.ArrayList;

/* renamed from: X.6rU  reason: invalid class name and case insensitive filesystem */
public final class C139086rU extends C41022Iq implements C179908ju {
    public static final ArrayList A01 = AnonymousClass0x2.A0i(new String[]{"FAILED", "PENDING", "VERIFIED"});
    public final C34931w3 A00;

    public C139086rU(AnonymousClass36K r10) {
        AnonymousClass36K r2 = r10;
        Class<String> cls = String.class;
        C626836d.A0F(r10, cls, "bank", AnonymousClass36K.A0Z(r10, "payout"));
        Long A0U = AnonymousClass0x2.A0U();
        Long A0i = AnonymousClass0x7.A0i();
        C626836d.A05(r2, cls, A0U, A0i, (Object) null, new String[]{"account-number"}, false);
        C626836d.A06(r2, cls, A0U, A0i, (Object) null, new String[]{"bank-name"}, false);
        C626836d.A05(r2, cls, A0U, A0i, (Object) null, AnonymousClass6C9.A1a(), false);
        AnonymousClass6C8.A13(r10, "verification-status", A01);
        this.A00 = (C34931w3) C1896292a.A0L(r10, 92, 0);
        this.A00 = r10;
    }
}
