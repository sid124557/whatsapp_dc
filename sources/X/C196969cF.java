package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9cF  reason: invalid class name and case insensitive filesystem */
public class C196969cF implements C203059n3 {
    public final /* synthetic */ C52792m3 A00;
    public final /* synthetic */ AnonymousClass9Bw A01;

    public C196969cF(C52792m3 r1, AnonymousClass9Bw r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BUy(AnonymousClass34V r4) {
        AnonymousClass9Bw.A0c(this.A00, (Map) null, r4.A00);
    }

    public void BUz(C195329Xi r5) {
        String str = r5.A02;
        if ("COMPLETED".equals(str)) {
            AnonymousClass9Bw r2 = this.A01;
            r2.A07.A09("kyc");
            r2.A09.A1Y("payments_onboarded_timestamp");
        }
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("kyc_status", str);
        this.A00.A01("on_success", A0t);
    }
}
