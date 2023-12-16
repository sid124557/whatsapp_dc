package X;

import android.app.Activity;
import android.text.TextUtils;
import com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9qF  reason: invalid class name and case insensitive filesystem */
public class C204989qF implements C84134Bd {
    public Object A00;
    public final int A01;

    public C204989qF(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ void AwB(Object obj) {
        switch (this.A01) {
            case 0:
                C162457s7.A0J(obj, 0);
                ((C84814Du) this.A00).BkD(obj);
                return;
            case 1:
                C18270x1.A0l(C620933l.A00((C620933l) this.A00), "payment_is_first_send", AnonymousClass001.A1Z(obj));
                return;
            case 2:
                IndiaUpiPaymentInvitePickerActivity indiaUpiPaymentInvitePickerActivity = (IndiaUpiPaymentInvitePickerActivity) this.A00;
                List list = (List) obj;
                C193109Ne r4 = indiaUpiPaymentInvitePickerActivity.A05;
                ArrayList A0s = AnonymousClass001.A0s();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AnonymousClass3ZH A0R = C18310x6.A0R(it);
                        if (!C86604Kt.A1a(r4.A00, A0R)) {
                            A0s.add(A0R);
                        }
                    }
                }
                Collections.sort(A0s, new C91844lE(indiaUpiPaymentInvitePickerActivity.A0D, indiaUpiPaymentInvitePickerActivity.A0N));
                indiaUpiPaymentInvitePickerActivity.A7Y(A0s);
                indiaUpiPaymentInvitePickerActivity.A07 = false;
                return;
            case 3:
                IndiaUpiPaymentInvitePickerActivity indiaUpiPaymentInvitePickerActivity2 = (IndiaUpiPaymentInvitePickerActivity) this.A00;
                AnonymousClass34V r12 = (AnonymousClass34V) obj;
                indiaUpiPaymentInvitePickerActivity2.A07 = false;
                if (!indiaUpiPaymentInvitePickerActivity2.isFinishing()) {
                    AnonymousClass9WM r42 = indiaUpiPaymentInvitePickerActivity2.A01;
                    int i = r12.A00;
                    C204629pf r6 = new C204629pf(indiaUpiPaymentInvitePickerActivity2, 1);
                    r42.A05(indiaUpiPaymentInvitePickerActivity2, r6, r6, r6, (String) null, i).show();
                    C134246ig A05 = indiaUpiPaymentInvitePickerActivity2.A04.A05(4, 51, "payment_home", C1899593h.A0Z(indiaUpiPaymentInvitePickerActivity2));
                    A05.A0S = String.valueOf(r12.A00);
                    indiaUpiPaymentInvitePickerActivity2.A04.BKA(A05);
                    return;
                }
                return;
            case 4:
                AnonymousClass9VE r3 = (AnonymousClass9VE) this.A00;
                C166587yw r122 = (C166587yw) obj;
                AnonymousClass99I r2 = (AnonymousClass99I) r122.A08;
                if (r2 != null && "VISA".equals(r2.A03) && TextUtils.isEmpty(r2.A06)) {
                    new C194099Ro(r3.A00, r3.A01, r3.A0B, r3.A0C, new AnonymousClass9cE(r122, r3, r2)).A00(r3.A0R);
                    return;
                }
                return;
            case 5:
                ((Activity) this.A00).finish();
                return;
            case 6:
                BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = (BrazilPaymentCardDetailsActivity) this.A00;
                if (AnonymousClass001.A1Z(obj)) {
                    brazilPaymentCardDetailsActivity.A0I.BkM(new C199059fv(brazilPaymentCardDetailsActivity));
                    return;
                }
                return;
            case 7:
                AnonymousClass9Bs r1 = (AnonymousClass9Bs) this.A00;
                r1.A0O.A0I = (Boolean) obj;
                r1.A84((AnonymousClass34V) null);
                return;
            case 8:
                ((AnonymousClass9C3) this.A00).A76((C166587yw) obj, true);
                return;
            default:
                AnonymousClass948 r0 = ((PaymentMethodsListPickerFragment) ((C203879oS) this.A00).A00).A06;
                r0.A00 = (List) obj;
                r0.notifyDataSetChanged();
                return;
        }
    }
}
