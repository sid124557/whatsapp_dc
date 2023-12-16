package X;

/* renamed from: X.9Gd  reason: invalid class name */
public class AnonymousClass9Gd extends AnonymousClass5ZM {
    public final /* synthetic */ C194049Rj A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;

    public AnonymousClass9Gd(C194049Rj r1, Runnable runnable, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = runnable;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A02.A0G(this.A02);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C624034w r6 = (C624034w) obj;
        if (r6 != null) {
            C194049Rj r4 = this.A00;
            C203159nD r3 = r4.A03;
            if (r3.BoU(r6.A02)) {
                C626936e.A06(r4.A00);
                r3.Boy(r6, r4.A00.A1J.A00, r4.A00.A1L);
                this.A00.A01 = null;
            }
        }
        this.A01.run();
        this.A00.A01 = null;
    }
}
