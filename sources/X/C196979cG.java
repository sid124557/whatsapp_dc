package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9cG  reason: invalid class name and case insensitive filesystem */
public class C196979cG implements C203059n3 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C52792m3 A01;
    public final /* synthetic */ BrazilPayBloksActivity A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C196979cG(C52792m3 r1, BrazilPayBloksActivity brazilPayBloksActivity, String str, String str2, Map map, int i) {
        this.A02 = brazilPayBloksActivity;
        this.A04 = str;
        this.A01 = r1;
        this.A03 = str2;
        this.A00 = i;
        this.A05 = map;
    }

    public void BUy(AnonymousClass34V r6) {
        int i;
        int i2 = r6.A00;
        if (i2 != 1448 || (i = this.A00) >= 1) {
            AnonymousClass9Bw.A0c(this.A01, (Map) null, i2);
            return;
        }
        this.A02.A7G(this.A01, this.A05, i + 1);
    }

    public void BUz(C195329Xi r7) {
        String str;
        boolean equals = "COMPLETED".equals(r7.A02);
        if (equals) {
            BrazilPayBloksActivity brazilPayBloksActivity = this.A02;
            brazilPayBloksActivity.A0F.A0C("p2p_context").A09("kyc");
            brazilPayBloksActivity.A0F.A0C("p2m_context").A09("kyc");
            brazilPayBloksActivity.A09.A1Y("payments_onboarded_timestamp");
        }
        BrazilPayBloksActivity brazilPayBloksActivity2 = this.A02;
        if (brazilPayBloksActivity2.A0D.A0X(2928) && "p2m_context".equals(this.A04)) {
            HashMap A0t = AnonymousClass001.A0t();
            A0t.put("kyc_status", "COMPLETED");
            brazilPayBloksActivity2.A79(this.A01);
            AbstractMap A0d = C1899593h.A0d(brazilPayBloksActivity2);
            if (A0d != null) {
                str = C18320x8.A0e("fds_resource_id", A0d);
            } else {
                str = null;
            }
            brazilPayBloksActivity2.A7B(str, this.A03, A0t);
        } else if (equals) {
            this.A01.A00("on_success");
        }
    }
}
