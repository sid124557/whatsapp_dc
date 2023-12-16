package X;

import java.util.ArrayList;

/* renamed from: X.1wD  reason: invalid class name and case insensitive filesystem */
public final class C35031wD extends C41022Iq {
    public static final ArrayList A04 = C18260x0.A0C("dark", "light");
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C35031wD(AnonymousClass36K r11) {
        AnonymousClass36K r3 = r11;
        AnonymousClass36K.A0N(r11, "theme");
        Class<String> cls = String.class;
        Long A0U = AnonymousClass0x2.A0U();
        this.A00 = (String) C626836d.A06(r3, cls, A0U, 10L, (Object) null, new String[]{"background", "#elementValue"}, false);
        this.A02 = (String) C626836d.A06(r3, cls, A0U, 10L, (Object) null, new String[]{"primary_text", "#elementValue"}, false);
        this.A03 = (String) C626836d.A06(r3, cls, A0U, 10L, (Object) null, new String[]{"secondary_text", "#elementValue"}, false);
        this.A01 = C626836d.A0A(r11, A04, new String[]{"mode"});
        this.A00 = r11;
    }
}
