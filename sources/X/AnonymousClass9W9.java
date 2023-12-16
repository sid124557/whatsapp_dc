package X;

import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.Map;

/* renamed from: X.9W9  reason: invalid class name */
public class AnonymousClass9W9 implements AnonymousClass4DQ {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass9W9(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void BdH(Map map) {
        AnonymousClass3XA r1;
        Boolean bool;
        if (this.A02 == 0) {
            C195069Vt r5 = (C195069Vt) this.A00;
            r5.A09.A01.A0P.remove("BRMerchantData");
            if (map == null) {
                C1899593h.A1Q("BrazilPaymentMerchantHelper", "triggerMerchantOnboarding :: terminalParams is null");
                r1 = (AnonymousClass3XA) this.A01;
                bool = Boolean.FALSE;
            } else {
                Object obj = map.get(AnonymousClass21V.A02.key);
                if (obj instanceof C52632ln) {
                    if (489 == ((C52632ln) obj).A00) {
                        r5.A05.A08(new C204539pW(this, 0));
                    } else {
                        ((AnonymousClass3XA) this.A01).A05(Boolean.FALSE);
                    }
                }
                r1 = (AnonymousClass3XA) this.A01;
                bool = Boolean.TRUE;
            }
            r1.A05(bool);
        } else if (map != null) {
            String A0o = C18310x6.A0o("credential_id", map);
            Object obj2 = map.get("action");
            if (A0o != null) {
                ((C89704el) this.A00).A04.BkP(new C200989jL(this, (AnonymousClass39Q) this.A01, A0o));
                return;
            }
            AnonymousClass9Bs r2 = (AnonymousClass9Bs) this.A00;
            if ("create_new_account".equals(obj2)) {
                r2.A8B((String) null);
            } else if ("check_balance".equals(obj2)) {
                r2.startActivityForResult(C1899593h.A06(r2, r2.A0B, IndiaUpiCheckBalanceActivity.class), 1015);
            }
        } else {
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this.A00;
            if (indiaUpiCheckOrderDetailsActivity.BIW()) {
                indiaUpiCheckOrderDetailsActivity.finish();
            }
        }
    }

    public void BSv(C60752z6 r1, Map map) {
    }
}
