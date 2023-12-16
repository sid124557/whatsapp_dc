package X;

import java.util.ArrayList;

/* renamed from: X.9Hy  reason: invalid class name */
public final class AnonymousClass9Hy extends C41022Iq {
    public static final ArrayList A00 = C18260x0.A0C("0", "1");

    public AnonymousClass9Hy(AnonymousClass36K r18) {
        AnonymousClass36K r3 = r18;
        AnonymousClass36K.A0N(r3, "bank");
        Class<String> cls = String.class;
        C626836d.A0F(r3, cls, "BR", new String[]{"country"});
        Long A0U = AnonymousClass0x2.A0U();
        C626836d.A06(r3, Long.class, A0U, AnonymousClass0x7.A0i(), (Object) null, new String[]{"bank-code"}, false);
        AnonymousClass36K r10 = r3;
        Long l = A0U;
        C626836d.A06(r10, cls, l, 1000L, (Object) null, new String[]{"bank-name"}, false);
        C626836d.A06(r10, cls, l, 1000L, (Object) null, new String[]{"short-name"}, false);
        C626836d.A06(r10, cls, l, Long.valueOf(C625635p.A0L), (Object) null, new String[]{"image"}, false);
        AnonymousClass6C8.A13(r3, "accept-savings", A00);
        this.A00 = r3;
    }
}
