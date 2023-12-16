package X;

import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import java.util.Map;

/* renamed from: X.357  reason: invalid class name */
public class AnonymousClass357 implements AnonymousClass4DQ {
    public Object A00;
    public final int A01;

    public AnonymousClass357(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BSv(C60752z6 r2, Map map) {
        if (this.A01 == 0) {
            ((C47062ce) this.A00).A01.A0D();
        }
    }

    public void BdH(Map map) {
        Object obj;
        Object obj2;
        String str;
        Object obj3;
        C52632ln r4;
        if (this.A01 != 0) {
            P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = (P2mLiteOrderDetailsActivity) this.A00;
            p2mLiteOrderDetailsActivity.BjL();
            C54522or r0 = p2mLiteOrderDetailsActivity.A0Q;
            if (r0 != null) {
                r0.A03(p2mLiteOrderDetailsActivity);
            }
            p2mLiteOrderDetailsActivity.A0Q = null;
            C30791n7 A1o = AnonymousClass1Ha.A1o(p2mLiteOrderDetailsActivity);
            String str2 = null;
            if (map != null) {
                obj = map.get(AnonymousClass21V.A02.key);
            } else {
                obj = null;
            }
            if (!(obj instanceof C52632ln) || (r4 = (C52632ln) obj) == null) {
                if (map != null) {
                    obj2 = map.get("result");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                if (map != null) {
                    obj3 = map.get("payment_transaction_id");
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof String) {
                    str2 = (String) obj3;
                }
                if (("COMPLETED".equals(str) || "DISMISSED".equals(str) || "SUCCESS".equals(str)) && str2 != null) {
                    p2mLiteOrderDetailsActivity.A04.BkP(new C70433aU(p2mLiteOrderDetailsActivity, A1o, str2, str));
                }
                if ("BLOCKED".equals(str)) {
                    p2mLiteOrderDetailsActivity.A78(A1o, "enter_dob");
                    return;
                }
                return;
            }
            AnonymousClass303 A002 = C57062t0.A00();
            A002.A04("success_redirect", false);
            A002.A04("unsuccessful_redirect", true);
            p2mLiteOrderDetailsActivity.A76(A002, A1o, (Integer) null, "api_event", "in_app_browser_checkout", 3);
            p2mLiteOrderDetailsActivity.A0W.A00(r4.A00);
            return;
        }
        ((C47062ce) this.A00).A01.A0D();
    }
}
