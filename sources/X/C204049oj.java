package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.9oj  reason: invalid class name and case insensitive filesystem */
public class C204049oj implements C202549mC {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204049oj(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BU0(AnonymousClass34V r9, List list) {
        JSONArray A002;
        if (this.A02 != 0) {
            C1902194o r7 = (C1902194o) this.A00;
            C133776hv r6 = (C133776hv) this.A01;
            AnonymousClass4UC A003 = C1902194o.A00(r7);
            if (r9 == null) {
                JSONArray A004 = C195089Vv.A00(list);
                AnonymousClass9Q9 r4 = new AnonymousClass9Q9(4);
                HashMap A0t = AnonymousClass001.A0t();
                r4.A07 = A0t;
                A0t.put("update", "1");
                HashMap hashMap = r4.A07;
                C626936e.A06(A004);
                hashMap.put("banks", A004.toString());
                String str = r6.A03;
                if (TextUtils.isEmpty(str)) {
                    str = r7.A0B.A0D.A03();
                }
                r4.A07.put("business_name", str);
                r4.A06 = "brpay_m_payout_info";
                A003.A0H(r4);
                return;
            }
            AnonymousClass9Q9 r0 = new AnonymousClass9Q9(7);
            r0.A04 = r9;
            A003.A0H(r0);
            return;
        }
        C52792m3 r3 = (C52792m3) this.A01;
        if (r9 != null || (A002 = C195089Vv.A00(list)) == null) {
            r3.A00("on_failure");
            return;
        }
        HashMap A0t2 = AnonymousClass001.A0t();
        A0t2.put("banks", A002.toString());
        r3.A01("on_success", A0t2);
    }
}
