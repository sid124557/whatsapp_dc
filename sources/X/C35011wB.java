package X;

import java.util.ArrayList;

/* renamed from: X.1wB  reason: invalid class name and case insensitive filesystem */
public final class C35011wB extends C41022Iq {
    public static final ArrayList A02 = C18260x0.A0C("block", "unblock");
    public static final ArrayList A03 = C18260x0.A0C("calls", "marketing_messages");
    public final C84254Bq A00;
    public final String A01;

    public C35011wB(AnonymousClass36K r11) {
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        AnonymousClass36K r3 = r11;
        this.A01 = (String) C626836d.A05(r3, cls, A0R, A0S, (Object) null, new String[]{"action"}, false);
        C626836d.A05(r3, cls, A0R, A0S, (Object) null, new String[]{"category"}, false);
        this.A00 = (C84254Bq) C626836d.A07(r11, "BizOptOutBrandID|BizOptOutJid", AnonymousClass0x2.A0i(new AnonymousClass4B7[]{C86304Jp.A00(4), C86304Jp.A00(5)}), new String[0]);
        this.A00 = r11;
    }
}
