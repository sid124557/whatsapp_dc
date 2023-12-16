package X;

import android.content.Context;

/* renamed from: X.9S9  reason: invalid class name */
public class AnonymousClass9S9 {
    public final Context A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final C56612sH A03;
    public final C617332a A04;
    public final AnonymousClass31C A05;
    public final C194929Vc A06;
    public final C40602Ha A07;
    public final AnonymousClass9U5 A08;
    public final AnonymousClass9U4 A09;
    public final C194029Rh A0A;
    public final C194259Se A0B;
    public final String A0C;

    public void A00(C203009my r23) {
        AnonymousClass9U4 r11 = this.A09;
        AnonymousClass8EA A032 = AnonymousClass9U4.A03(r11);
        String str = this.A0C;
        C166587yw A082 = A032.A08(str);
        C626936e.A06(A082);
        C133736hr r0 = (C133736hr) A082;
        AnonymousClass99I r2 = (AnonymousClass99I) r0.A08;
        C203009my r15 = r23;
        if (r2 != null) {
            if (r2.A08) {
                C56612sH r5 = this.A03;
                new C194359So(this.A00, this.A01, this.A02, r5, this.A04, this.A05, this.A06, this.A07, this.A08, r11, new C196909bw(r0, r15, this), this.A0A).A00(r0);
                return;
            } else if (r2.A0a) {
                r15.BOZ(r0);
                return;
            }
        }
        AnonymousClass31C r3 = this.A05;
        String A033 = r3.A03();
        String A012 = this.A0B.A01();
        AnonymousClass9IL r6 = new AnonymousClass9IL(A033);
        C56052rL A013 = C56052rL.A01();
        C1899593h.A1M(A013);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "br-get-verification-methods");
        if (C1899593h.A1b(str, false)) {
            C56052rL.A0D(A0U, "credential-id", str);
        }
        C1899593h.A1O(A0U, A012, false);
        AnonymousClass36K A0S = C1899593h.A0S(A0U, A013, r6);
        r3.A0D(new C203899oU(this.A00, this.A07, this.A01, this, r15, 9), A0S, A033, 204, 0);
    }

    public AnonymousClass9S9(Context context, C69263Wi r2, C56972sr r3, C56612sH r4, C617332a r5, AnonymousClass31C r6, C194929Vc r7, C40602Ha r8, AnonymousClass9U5 r9, AnonymousClass9U4 r10, C194029Rh r11, C194259Se r12, String str) {
        this.A03 = r4;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A0B = r12;
        this.A09 = r10;
        this.A08 = r9;
        this.A0A = r11;
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A0C = str;
    }
}
