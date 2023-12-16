package X;

import android.content.Context;

/* renamed from: X.9Sl  reason: invalid class name and case insensitive filesystem */
public class C194329Sl {
    public final Context A00;
    public final C69263Wi A01;
    public final C66543Lv A02;
    public final C40602Ha A03;
    public final C620933l A04;
    public final AnonymousClass9U5 A05;
    public final C197769dq A06;
    public final AnonymousClass9U4 A07;
    public final C194259Se A08;
    public final AnonymousClass4FS A09;

    public void A00(AnonymousClass4EY r16) {
        AnonymousClass9U5 r9 = this.A05;
        String A032 = r9.A07.A03();
        String A012 = this.A08.A01();
        C35351wj r4 = new C35351wj(A032, 28);
        C56052rL A013 = C56052rL.A01();
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "delete");
        if (A012 != null) {
            C1899593h.A1O(A0U, A012, true);
        }
        AnonymousClass36K A033 = C41032Ir.A03(A0U, A013, r4);
        C18270x1.A0l(C620933l.A00(this.A04), "is_payment_account_created", false);
        r9.A0F(new C203899oU(this.A00, this.A03, this.A01, this, r16, 14), A033, A032, C625635p.A0L);
    }

    public C194329Sl(Context context, C69263Wi r2, C66543Lv r3, C40602Ha r4, C620933l r5, AnonymousClass9U5 r6, C197769dq r7, AnonymousClass9U4 r8, C194259Se r9, AnonymousClass4FS r10) {
        this.A00 = context;
        this.A01 = r2;
        this.A09 = r10;
        this.A08 = r9;
        this.A07 = r8;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A03 = r4;
    }
}
