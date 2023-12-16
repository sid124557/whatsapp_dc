package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.9AQ  reason: invalid class name */
public class AnonymousClass9AQ extends C1908099x {
    public final /* synthetic */ AnonymousClass9AJ A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9AQ(Context context, C69263Wi r13, C40602Ha r14, C153607bd r15, AnonymousClass9AJ r16, C197109ca r17, AnonymousClass9B3 r18, String str, boolean z) {
        super(context, r13, r14, r15, r17, r18, "upi-batch", str, 3);
        this.A00 = r16;
        this.A01 = z;
    }

    public void A03(AnonymousClass34V r4) {
        super.A03(r4);
        C203029n0 r2 = this.A00.A00;
        if (r2 != null) {
            r2.BNU(r4, true, true, false);
        }
    }

    public void A04(AnonymousClass34V r4) {
        super.A04(r4);
        C203029n0 r2 = this.A00.A00;
        if (r2 != null) {
            r2.BNU(r4, false, true, false);
        }
    }

    public void A05(AnonymousClass36K r13) {
        super.A05(r13);
        AnonymousClass9AJ r2 = this.A00;
        C202529mA BAY = AnonymousClass9U4.A07(r2.A08).BAY();
        C626936e.A06(BAY);
        ArrayList BgU = BAY.BgU(r2.A03, r13);
        AnonymousClass9U1 r0 = r2.A06;
        C153607bd r4 = r2.A00;
        C193509Ox A02 = r0.A02(r4, BgU);
        C203029n0 r5 = r2.A00;
        if (r5 != null) {
            r5.BNV(A02.A00, A02.A01, A02.A02, true, this.A01, false);
        }
        r4.A04("upi-batch");
        ArrayList arrayList = r4.A05;
        if (!arrayList.contains("upi-list-keys")) {
            r4.A05("upi-list-keys", 500);
        }
        if (!arrayList.contains("upi-get-banks")) {
            r4.A05("upi-get-banks", 500);
        }
    }
}
