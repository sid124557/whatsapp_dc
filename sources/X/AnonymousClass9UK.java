package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import java.util.Map;

/* renamed from: X.9UK  reason: invalid class name */
public class AnonymousClass9UK implements AnonymousClass4DQ {
    public Object A00;
    public final int A01;

    public AnonymousClass9UK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BSv(C60752z6 r2, Map map) {
        C69263Wi r0;
        switch (this.A01) {
            case 0:
                r0 = ((AnonymousClass9C3) this.A00).A04;
                break;
            case 3:
                return;
            default:
                r0 = ((C89654ea) this.A00).A05;
                break;
        }
        r0.A0D();
    }

    public void BdH(Map map) {
        char c;
        Number number;
        C69263Wi r0;
        switch (this.A01) {
            case 0:
                r0 = ((AnonymousClass9C3) this.A00).A04;
                break;
            case 1:
                AnonymousClass9Bs r1 = (AnonymousClass9Bs) this.A00;
                r1.A05.A0D();
                r1.A7s();
                return;
            case 3:
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A00;
                if (map != null) {
                    String A0o = C18310x6.A0o("action", map);
                    if (A0o != null) {
                        String A0o2 = C18310x6.A0o("credential_id", map);
                        switch (A0o.hashCode()) {
                            case -1240788020:
                                if (A0o.equals("accept_success")) {
                                    c = 0;
                                    break;
                                } else {
                                    return;
                                }
                            case -716333109:
                                if (A0o.equals("create_new_account")) {
                                    c = 1;
                                    break;
                                } else {
                                    return;
                                }
                            case -460192429:
                                if (A0o.equals("accept_failure")) {
                                    c = 2;
                                    break;
                                } else {
                                    return;
                                }
                            case 74085029:
                                if (A0o.equals("check_balance")) {
                                    indiaUpiSendPaymentActivity.BpY(C1899593h.A06(indiaUpiSendPaymentActivity, indiaUpiSendPaymentActivity.A0B, IndiaUpiCheckBalanceActivity.class), 1015);
                                    return;
                                }
                                return;
                            case 1476662760:
                                if (A0o.equals("forgot_upi_pin")) {
                                    indiaUpiSendPaymentActivity.A8M(A0o2, true);
                                    return;
                                }
                                return;
                            case 1558549715:
                                if (A0o.equals("setup_pin")) {
                                    indiaUpiSendPaymentActivity.A8M(A0o2, false);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                        AnonymousClass34V r5 = null;
                        switch (c) {
                            case 0:
                                AnonymousClass9W6 r02 = indiaUpiSendPaymentActivity.A0N;
                                if (A0o2 != null) {
                                    C620933l r2 = r02.A03;
                                    r2.A0K(AnonymousClass000.A0V(";", A0o2, C1899593h.A0c(r2)));
                                }
                                indiaUpiSendPaymentActivity.A0Z = true;
                                indiaUpiSendPaymentActivity.A0S.A08((AnonymousClass34V) null, 31, 2);
                                indiaUpiSendPaymentActivity.A09.A00.A03(new C204989qF(indiaUpiSendPaymentActivity, 7));
                                return;
                            case 1:
                                indiaUpiSendPaymentActivity.A8B((String) null);
                                return;
                            default:
                                AnonymousClass9W6 r03 = indiaUpiSendPaymentActivity.A0N;
                                if (A0o2 != null) {
                                    C620933l r22 = r03.A03;
                                    r22.A0K(AnonymousClass000.A0V(";", A0o2, C1899593h.A0c(r22)));
                                }
                                indiaUpiSendPaymentActivity.A0Z = true;
                                Map map2 = (Map) map.get("error");
                                if (!(map2 == null || (number = (Number) map2.get("code")) == null)) {
                                    r5 = new AnonymousClass34V(number.intValue());
                                }
                                indiaUpiSendPaymentActivity.A0S.A08(r5, 31, 1);
                                if (r5 != null) {
                                    indiaUpiSendPaymentActivity.A84(r5);
                                    return;
                                }
                                break;
                        }
                    }
                    indiaUpiSendPaymentActivity.A05.A0D();
                    indiaUpiSendPaymentActivity.A8A(new AnonymousClass9VW(R.string.f11nameremoved), (String) null, new Object[0]);
                    return;
                }
                return;
            default:
                r0 = ((C89654ea) this.A00).A05;
                break;
        }
        r0.A0D();
    }
}
