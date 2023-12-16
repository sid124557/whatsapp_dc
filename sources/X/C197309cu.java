package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.9cu  reason: invalid class name and case insensitive filesystem */
public class C197309cu implements C203489nm {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public C197309cu(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public void BPe(View view, View view2, C195319Xg r38, C133676hl r39, C166587yw r40, PaymentBottomSheet paymentBottomSheet) {
        String A0c;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.Bp9(R.string.f11nameremoved);
        AnonymousClass99L r1 = new AnonymousClass99L();
        indiaUpiSendPaymentActivity.A0O = r1;
        r1.A0K = C1899693i.A0b(indiaUpiSendPaymentActivity);
        AnonymousClass99L r12 = indiaUpiSendPaymentActivity.A0O;
        if (!TextUtils.isEmpty(indiaUpiSendPaymentActivity.A0o)) {
            A0c = indiaUpiSendPaymentActivity.A0o;
        } else {
            A0c = AnonymousClass97T.A0c(indiaUpiSendPaymentActivity);
        }
        r12.A0S = A0c;
        AnonymousClass99H A0I = C1899693i.A0I(indiaUpiSendPaymentActivity.A0f, indiaUpiSendPaymentActivity.A0B.A08, "IndiaUpiPaymentActivity onRequestPayment: Cannot get IndiaUpiMethodData");
        indiaUpiSendPaymentActivity.A0O.A0C = A0I.A06;
        indiaUpiSendPaymentActivity.A0S = C192649La.A00(indiaUpiSendPaymentActivity.A0F, indiaUpiSendPaymentActivity.A0R);
        AnonymousClass9AN r0 = indiaUpiSendPaymentActivity.A0D;
        C166557yt r7 = indiaUpiSendPaymentActivity.A0I;
        String str = indiaUpiSendPaymentActivity.A0h;
        C166557yt A04 = indiaUpiSendPaymentActivity.A0M.A04();
        String A0C = indiaUpiSendPaymentActivity.A0M.A0C();
        C166557yt r3 = A0I.A06;
        AnonymousClass39Q r8 = indiaUpiSendPaymentActivity.A09;
        AnonymousClass99L r4 = indiaUpiSendPaymentActivity.A0O;
        String str2 = r4.A0S;
        String str3 = r4.A0K;
        String str4 = indiaUpiSendPaymentActivity.A0B.A0A;
        String str5 = indiaUpiSendPaymentActivity.A0S;
        C166557yt r6 = indiaUpiSendPaymentActivity.A0H;
        C193879Ql r15 = new C193879Ql(indiaUpiSendPaymentActivity);
        Log.i("PAY: collectFromVpa called");
        AnonymousClass31C r31 = r0.A03;
        String A03 = r31.A03();
        String A002 = C166557yt.A00(r7);
        String str6 = (String) C1899593h.A0X(r6);
        String str7 = (String) A04.A00;
        String str8 = (String) C1899593h.A0X(r3);
        String A01 = r0.A06.A01();
        AnonymousClass39L A003 = r0.A01.A00(AnonymousClass1S3.A05, r8);
        String valueOf = String.valueOf(A003.A00());
        String valueOf2 = String.valueOf(A003.A00);
        String str9 = ((AnonymousClass3H6) A003.A01).A04;
        C56052rL A042 = C56052rL.A04("smax:any");
        C56052rL A043 = C56052rL.A04("money");
        if (C626836d.A0M(valueOf, 1, 100, false)) {
            C56052rL.A0D(A043, "value", valueOf);
        }
        if (C626836d.A0M(valueOf2, 1, 100, false)) {
            C56052rL.A0D(A043, "offset", valueOf2);
        }
        if (C626836d.A0M(str9, 1, 100, false)) {
            C56052rL.A0D(A043, "currency", str9);
        }
        C56052rL.A07(A043, A042);
        AnonymousClass36K A0F = A042.A0F();
        C56052rL A044 = C56052rL.A04("amount");
        A044.A0I(A0F);
        AnonymousClass36K A0F2 = A044.A0F();
        AnonymousClass9IP r5 = new AnonymousClass9IP(A03);
        C56052rL A012 = C56052rL.A01();
        C1899593h.A1M(A012);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-collect-from-vpa");
        if (C626836d.A0M(A002, 1, 100, false)) {
            C56052rL.A0D(A0U, "sender-vpa", A002);
        }
        if (str != null && C626836d.A0M(str, 1, 100, true)) {
            C56052rL.A0D(A0U, "sender-vpa-id", str);
        }
        if (str6 != null && C626836d.A0M(str6, 8, 15, true)) {
            C56052rL.A0D(A0U, "sender-upi-number", str6);
        }
        if (C626836d.A0M(str7, 1, 100, false)) {
            C56052rL.A0D(A0U, "receiver-vpa", str7);
        }
        if (A0C != null && C626836d.A0M(A0C, 1, 100, true)) {
            C56052rL.A0D(A0U, "receiver-vpa-id", A0C);
        }
        if (C1899693i.A10(str8, 1, false)) {
            C56052rL.A0D(A0U, "upi-bank-info", str8);
        }
        if (C626836d.A0M(str2, 0, 35, false)) {
            C56052rL.A0D(A0U, "seq-no", str2);
        }
        if (C626836d.A0M(str4, 1, 100, false)) {
            C56052rL.A0D(A0U, "credential-id", str4);
        }
        if (str5 != null && C1899693i.A10(str5, 0, true)) {
            C56052rL.A0D(A0U, "note", str5);
        }
        if (C626836d.A0M(str3, 1, 100, false)) {
            C56052rL.A0D(A0U, "message-id", str3);
        }
        C1899593h.A1O(A0U, A01, false);
        A0U.A0H(A0F2);
        AnonymousClass31C r82 = r31;
        r82.A0D(new C203929oX(r0.A00, r0.A01, r0.A05, AnonymousClass9OC.A02(r0, "upi-collect-from-vpa"), r0, r15), C1899593h.A0S(A0U, A012, r5), A03, 204, 0);
    }

    public void BY0(int i) {
        String str;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        if (i == 1) {
            str = "p2p";
        } else {
            str = "p2m";
        }
        indiaUpiSendPaymentActivity.A0p = str;
    }

    public void BeU(PaymentBottomSheet paymentBottomSheet) {
        String str = this.A00.A0R;
        IndiaUpiEditTransactionDescriptionFragment indiaUpiEditTransactionDescriptionFragment = new IndiaUpiEditTransactionDescriptionFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("arg_payment_description", str);
        indiaUpiEditTransactionDescriptionFragment.A0u(A08);
        indiaUpiEditTransactionDescriptionFragment.A08 = new C204639pg(this, 1);
        paymentBottomSheet.A1b(indiaUpiEditTransactionDescriptionFragment);
    }

    public /* synthetic */ void BXo(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public /* synthetic */ void BXs(C166587yw r1, PaymentMethodRow paymentMethodRow) {
    }

    public /* synthetic */ void BXz(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public /* synthetic */ void BXv(PaymentBottomSheet paymentBottomSheet, int i, int i2) {
    }

    public /* synthetic */ void BUf(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
    }
}
