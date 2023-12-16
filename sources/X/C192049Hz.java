package X;

import java.util.ArrayList;

/* renamed from: X.9Hz  reason: invalid class name and case insensitive filesystem */
public final class C192049Hz extends C41022Iq {
    public static final ArrayList A00 = C18260x0.A0C("0", "1");
    public static final ArrayList A01 = C18260x0.A0C("0", "1");

    public C192049Hz(AnonymousClass36K r10) {
        Class<String> cls = String.class;
        Long A0U = AnonymousClass0x2.A0U();
        AnonymousClass36K r2 = r10;
        C626836d.A06(r2, cls, A0U, 1000L, (Object) null, new String[]{"credential-id"}, false);
        C626836d.A05(r2, cls, A0U, 10L, (Object) null, new String[]{"country"}, false);
        C626836d.A05(r2, cls, A0U, AnonymousClass0x7.A0i(), (Object) null, new String[]{"created"}, false);
        C41022Iq.A01(r10, "p2p-eligible", A01);
        C41022Iq.A01(r10, "p2m-eligible", A00);
        this.A00 = r10;
    }
}
