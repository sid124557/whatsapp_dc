package X;

import android.content.Context;

/* renamed from: X.9AU  reason: invalid class name */
public class AnonymousClass9AU extends C1908099x {
    public final /* synthetic */ C202619mJ A00;
    public final /* synthetic */ AnonymousClass9AM A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9AU(Context context, C69263Wi r8, C40602Ha r9, C153607bd r10, C202619mJ r11, AnonymousClass9AM r12, String str) {
        super(context, r8, r9, r10, "register-alias");
        this.A01 = r12;
        this.A02 = str;
        this.A00 = r11;
    }

    public void A03(AnonymousClass34V r3) {
        AnonymousClass9AM.A00(r3, this.A01, this.A02);
        super.A03(r3);
        this.A00.BZg((C166157yE) null, r3);
    }

    public void A04(AnonymousClass34V r3) {
        AnonymousClass9AM.A00(r3, this.A01, this.A02);
        super.A04(r3);
        this.A00.BZg((C166157yE) null, r3);
    }

    public void A05(AnonymousClass36K r6) {
        AnonymousClass36K A0l;
        AnonymousClass9AM r4 = this.A01;
        AnonymousClass9AM.A00((AnonymousClass34V) null, r4, this.A02);
        super.A05(r6);
        AnonymousClass36K A0T = C1899693i.A0T(r6);
        if (A0T != null && (A0l = A0T.A0l("alias")) != null) {
            C202619mJ r2 = this.A00;
            try {
                r2.BZg(C1908099x.A00(A0l), (AnonymousClass34V) null);
            } catch (AnonymousClass24Y unused) {
                r4.A04.A05("onRegisterVpaAlias/onResponseSuccess/corrupt stream exception");
                r2.BZg((C166157yE) null, new AnonymousClass34V(500));
            }
        }
    }
}
