package X;

import android.content.Context;

/* renamed from: X.9AR  reason: invalid class name */
public class AnonymousClass9AR extends C1908099x {
    public final /* synthetic */ AnonymousClass9AJ A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9AR(Context context, C69263Wi r13, C40602Ha r14, C153607bd r15, AnonymousClass9AJ r16, C197109ca r17, AnonymousClass9B3 r18, String str, boolean z, boolean z2) {
        super(context, r13, r14, r15, r17, r18, "upi-get-banks", str, 4);
        this.A00 = r16;
        this.A02 = z;
        this.A01 = z2;
    }

    public void A03(AnonymousClass34V r5) {
        super.A03(r5);
        C203029n0 r3 = this.A00.A00;
        if (r3 != null) {
            r3.BNU(r5, true, false, this.A02);
        }
    }

    public void A04(AnonymousClass34V r4) {
        super.A04(r4);
        C203029n0 r2 = this.A00.A00;
        if (r2 != null) {
            r2.BNU(r4, false, false, this.A02);
        }
    }

    public void A05(AnonymousClass36K r9) {
        super.A05(r9);
        AnonymousClass9AJ r3 = this.A00;
        C202529mA BAY = AnonymousClass9U4.A07(r3.A08).BAY();
        C626936e.A06(BAY);
        C193509Ox A022 = r3.A06.A02(r3.A00, BAY.BgU(r3.A03, r9));
        C203029n0 r1 = r3.A00;
        if (r1 != null) {
            r1.BNV(A022.A00, A022.A01, A022.A02, false, this.A01, this.A02);
        }
    }
}
