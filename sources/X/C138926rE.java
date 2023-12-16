package X;

import java.util.ArrayList;

/* renamed from: X.6rE  reason: invalid class name and case insensitive filesystem */
public final class C138926rE extends C41022Iq {
    public static final ArrayList A01 = C18260x0.A0C("0", "1");
    public static final ArrayList A02 = C18260x0.A0C("0", "1");
    public static final ArrayList A03 = C18260x0.A0C("0", "1");
    public final C34931w3 A00;

    public C138926rE(AnonymousClass36K r10) {
        AnonymousClass36K r2 = r10;
        AnonymousClass36K.A0N(r10, "merchant");
        Class<String> cls = String.class;
        Long A0U = AnonymousClass0x2.A0U();
        C626836d.A06(r2, cls, A0U, AnonymousClass0x7.A0i(), (Object) null, new String[]{"merchant-id"}, false);
        C626836d.A05(r2, cls, A0U, 200L, (Object) null, new String[]{"business-name"}, false);
        C626836d.A05(r2, cls, A0U, AnonymousClass6C9.A0Y(), (Object) null, new String[]{"support-phone-number"}, false);
        AnonymousClass6C8.A13(r10, "can-sell", A03);
        AnonymousClass6C8.A13(r10, "can-payout", A02);
        AnonymousClass6C8.A13(r10, "can-add-payout", A01);
        this.A00 = (C34931w3) C1896292a.A0L(r10, 91, 0);
        this.A00 = r10;
    }
}
