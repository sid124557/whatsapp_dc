package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentDescriptionRow;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.9cq  reason: invalid class name and case insensitive filesystem */
public class C197269cq implements C203519ns {
    public final /* synthetic */ C85204Fi A00;
    public final /* synthetic */ IndiaUpiSendPaymentActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;

    public C197269cq(C85204Fi r1, IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, PaymentBottomSheet paymentBottomSheet) {
        this.A01 = indiaUpiSendPaymentActivity;
        this.A02 = paymentBottomSheet;
        this.A00 = r1;
    }

    public void AxR(ViewGroup viewGroup) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        C18300x5.A0G(C86664Kz.A0h(indiaUpiSendPaymentActivity.getLayoutInflater(), viewGroup, R.layout.f8nameremoved), R.id.amount).setText(this.A00.B3V(indiaUpiSendPaymentActivity.A01, indiaUpiSendPaymentActivity.A09));
    }

    public String B5n(C166587yw r4, int i) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        boolean A06 = indiaUpiSendPaymentActivity.A0N.A06(r4);
        int i2 = R.string.f11nameremoved;
        if (A06) {
            i2 = R.string.f11nameremoved;
        }
        return indiaUpiSendPaymentActivity.getString(i2);
    }

    public boolean BIJ() {
        C133676hl r0 = this.A01.A0A;
        if (r0 == null || !r0.A0D()) {
            return false;
        }
        return true;
    }

    public void BMh(ViewGroup viewGroup) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        boolean A7T = indiaUpiSendPaymentActivity.A7T();
        int i = 0;
        boolean A1W = AnonymousClass000.A1W(indiaUpiSendPaymentActivity.A0X);
        if (!A7T || A1W) {
            i = 8;
        }
        viewGroup.setVisibility(i);
        PaymentDescriptionRow paymentDescriptionRow = (PaymentDescriptionRow) C06560Yg.A02(viewGroup, R.id.payment_description_row);
        indiaUpiSendPaymentActivity.A0M = paymentDescriptionRow;
        paymentDescriptionRow.A01(indiaUpiSendPaymentActivity.A0R);
    }

    public void BMi(ViewGroup viewGroup) {
        View A0h = C86664Kz.A0h(this.A01.getLayoutInflater(), viewGroup, R.layout.f8nameremoved);
        C18300x5.A0G(A0h, R.id.text).setText(R.string.f11nameremoved);
        ImageView A0E = AnonymousClass0x9.A0E(A0h, R.id.icon);
        A0E.setImageResource(R.drawable.ic_close);
        C204249p3.A02(A0E, this.A02, 97);
    }

    public void BMk(ViewGroup viewGroup) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        View inflate = indiaUpiSendPaymentActivity.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup, true);
        ImageView A0E = AnonymousClass0x9.A0E(inflate, R.id.payment_recipient_profile_pic);
        TextView A0G = C18300x5.A0G(inflate, R.id.payment_recipient_direction_label);
        TextView A0G2 = C18300x5.A0G(inflate, R.id.payment_recipient_name);
        TextView A0G3 = C18300x5.A0G(inflate, R.id.payment_recipient_vpa);
        C86604Kt.A1B(inflate, R.id.expand_receiver_details_button);
        A0G.setText(R.string.f11nameremoved);
        indiaUpiSendPaymentActivity.A01.A06(A0E, R.drawable.avatar_contact);
        A0G2.setText((CharSequence) C1899593h.A0X(indiaUpiSendPaymentActivity.A0G));
        Object obj = indiaUpiSendPaymentActivity.A0I.A00;
        C626936e.A06(obj);
        AnonymousClass001.A0y(indiaUpiSendPaymentActivity, A0G3, new Object[]{obj}, R.string.f11nameremoved);
    }

    public void BTi(ViewGroup viewGroup, C166587yw r7) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        AnonymousClass0x9.A0E(C86664Kz.A0h(indiaUpiSendPaymentActivity.getLayoutInflater(), viewGroup, R.layout.f8nameremoved), R.id.psp_logo).setImageResource(indiaUpiSendPaymentActivity.A0O.A00(indiaUpiSendPaymentActivity.A0M.A07(), indiaUpiSendPaymentActivity.A0a).A00);
    }

    public boolean Bo9() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        return indiaUpiSendPaymentActivity.A0N.A06(indiaUpiSendPaymentActivity.A0B);
    }

    public /* synthetic */ int B7G(C166587yw r2, int i) {
        return 0;
    }

    public /* synthetic */ void Boj(C166587yw r1, PaymentMethodRow paymentMethodRow) {
    }

    public /* synthetic */ int B6h() {
        return 0;
    }

    public /* synthetic */ String B9h() {
        return null;
    }

    public /* synthetic */ String BDp() {
        return null;
    }

    public /* synthetic */ boolean BoR() {
        return false;
    }

    public boolean Bp0() {
        return false;
    }

    public /* synthetic */ int B5m(C166587yw r2) {
        return 0;
    }

    public /* synthetic */ String B6i(C166587yw r2) {
        return null;
    }

    public /* synthetic */ boolean BoQ(C166587yw r2) {
        return false;
    }

    public /* synthetic */ boolean BoC(C166587yw r2, String str, int i) {
        return false;
    }
}
