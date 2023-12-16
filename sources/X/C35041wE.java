package X;

import java.util.ArrayList;

/* renamed from: X.1wE  reason: invalid class name and case insensitive filesystem */
public final class C35041wE extends C41022Iq {
    public static final ArrayList A04 = C18260x0.A0C("ACTIVE", "INACTIVE");
    public final AnonymousClass36K A00;
    public final C138626qj A01;
    public final C34951w5 A02;
    public final String A03;

    public C35041wE(AnonymousClass36K r4) {
        Object obj;
        Object obj2;
        AnonymousClass36K.A0N(r4, "account");
        this.A03 = C626836d.A09(r4, A04, new String[]{"merchant", "status"});
        try {
            obj = C626836d.A04(r4, C86304Jp.A00(24), new String[]{"merchant"});
        } catch (AnonymousClass24Y unused) {
            obj = null;
        }
        this.A01 = (C138626qj) obj;
        try {
            obj2 = C626836d.A04(r4, C86304Jp.A00(25), new String[]{"merchant"});
        } catch (AnonymousClass24Y unused2) {
            obj2 = null;
        }
        this.A02 = (C34951w5) obj2;
        this.A00 = r4;
        this.A00 = (AnonymousClass36K) C18290x4.A0k(C626836d.A0C(r4, new String[]{"merchant"}, 26));
    }
}
