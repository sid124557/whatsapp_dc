package X;

import java.util.List;

/* renamed from: X.9Hx  reason: invalid class name and case insensitive filesystem */
public final class C192039Hx extends C41022Iq {
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public C192039Hx(AnonymousClass36K r17, AnonymousClass36K r18) {
        AnonymousClass36K r9 = r17;
        AnonymousClass36K.A0N(r9, "account");
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        Class<String> cls2 = cls;
        Long l = A0R;
        Long l2 = A0S;
        C626836d.A06(r9, cls2, l, l2, C626836d.A06(r18, cls, A0R, A0S, (Object) null, new String[]{"account", "action"}, false), new String[]{"action"}, true);
        C626836d.A05(r9, Long.class, AnonymousClass0x2.A0T(), l2, (Object) null, new String[]{"version"}, false);
        AnonymousClass36K r2 = r9;
        C626836d.A05(r2, cls, 18L, 18, (Object) null, new String[]{"instance-id"}, false);
        C626836d.A05(r2, cls, AnonymousClass0x2.A0U(), AnonymousClass6C9.A0Y(), (Object) null, new String[]{"wa-support-phone-number"}, false);
        this.A02 = C626836d.A0B(r9, new C205029qJ(25), new String[]{"card"}, 0, Long.MAX_VALUE);
        this.A01 = C626836d.A0B(r9, new C205029qJ(26), new String[]{"bank"}, 0, Long.MAX_VALUE);
        this.A04 = C626836d.A0B(r9, new C205029qJ(27), new String[]{"merchant"}, 0, Long.MAX_VALUE);
        this.A00 = C626836d.A0B(r9, new C205029qJ(28), new String[]{"alias"}, 0, 100);
        this.A03 = C626836d.A0B(r9, new C205029qJ(29), new String[]{"custom_payment_method"}, 0, 5);
        this.A00 = r9;
    }
}
