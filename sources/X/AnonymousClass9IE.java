package X;

import java.util.ArrayList;

/* renamed from: X.9IE  reason: invalid class name */
public final class AnonymousClass9IE extends C41022Iq implements C202229la {
    public static final ArrayList A02 = C18260x0.A0C("0", "1");
    public static final ArrayList A03 = C18260x0.A0C("NONE", "VISA");
    public static final ArrayList A04 = C18260x0.A0C("0", "1");
    public static final ArrayList A05 = AnonymousClass0x2.A0i(new String[]{"ACTIVE", "DELETED", "INACTIVE", "NEEDS_RETOKENIZATION", "NEEDS_RETOKENIZATION_DELETED", "SUSPENDED"});
    public final AnonymousClass9I9 A00;
    public final AnonymousClass9I1 A01;

    public AnonymousClass9IE(AnonymousClass36K r10) {
        Object obj;
        AnonymousClass36K r2 = r10;
        AnonymousClass36K.A0N(r10, "card");
        Class<String> cls = String.class;
        Long A0U = AnonymousClass0x2.A0U();
        C626836d.A06(r2, cls, A0U, 1000L, (Object) null, new String[]{"image-content-id"}, false);
        C626836d.A05(r2, cls, A0U, AnonymousClass0x7.A0i(), (Object) null, new String[]{"bank-name"}, false);
        C626836d.A05(r2, cls, A0U, AnonymousClass6C9.A0Y(), (Object) null, new String[]{"bank-phone-number"}, false);
        C626836d.A0F(r10, cls, (Object) null, new String[]{"binding-type"});
        AnonymousClass6C8.A13(r10, "needs-device-binding", A04);
        C41022Iq.A01(r10, "state", A05);
        C41022Iq.A01(r10, "automatic-binding", A02);
        this.A00 = (AnonymousClass9I9) C205029qJ.A00(r10, 2);
        try {
            obj = C626836d.A04(r10, new C205029qJ(3), new String[0]);
        } catch (AnonymousClass24Y unused) {
            obj = null;
        }
        this.A01 = (AnonymousClass9I1) obj;
        this.A00 = r10;
    }
}
