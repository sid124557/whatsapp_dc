package X;

import android.content.Context;

/* renamed from: X.9AT  reason: invalid class name */
public class AnonymousClass9AT extends C1908099x {
    public final C55682qk A00;
    public final AnonymousClass9RP A01;
    public final C192219Iq A02;

    public void A05(AnonymousClass36K r21) {
        try {
            AnonymousClass36K r13 = r21;
            AnonymousClass36K A022 = C41032Ir.A02(r13, this.A02);
            Class<String> cls = String.class;
            Long A0R = AnonymousClass0x2.A0R();
            Long A0S = AnonymousClass0x2.A0S();
            Class<String> cls2 = cls;
            Long l = A0R;
            Long l2 = A0S;
            C626836d.A06(r13, cls2, l, l2, C626836d.A06(A022, cls, A0R, A0S, (Object) null, new String[]{"account", "action"}, false), new String[]{"account", "action"}, true);
            Long A0U = AnonymousClass0x2.A0U();
            String str = (String) C626836d.A06(r13, cls2, A0U, AnonymousClass0x7.A0i(), (Object) null, new String[]{"account", "mandate-no"}, false);
            C626836d.A04(r13, new C205019qI(A022, 9), new String[0]);
            C205029qJ.A02(r13, new String[]{"account"}, 45);
            this.A01.A00((AnonymousClass34V) null, str, (String) C626836d.A06(r13, cls2, A0U, 1000L, (Object) null, new String[]{"account", "transaction-id"}, false));
        } catch (AnonymousClass24Y unused) {
            this.A01.A00(new AnonymousClass34V(500), (String) null, (String) null);
        }
    }

    public AnonymousClass9AT(Context context, C55682qk r8, C69263Wi r9, C40602Ha r10, C153607bd r11, AnonymousClass9RP r12, C192219Iq r13) {
        super(context, r9, r10, r11, "upi-create-mandate");
        this.A00 = r8;
        this.A02 = r13;
        this.A01 = r12;
    }

    public void A03(AnonymousClass34V r3) {
        super.A03(r3);
        this.A01.A00(r3, (String) null, (String) null);
    }

    public void A04(AnonymousClass34V r3) {
        super.A04(r3);
        this.A01.A00(r3, (String) null, (String) null);
    }
}
