package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.9dA  reason: invalid class name and case insensitive filesystem */
public class C197439dA implements C203509nr {
    public final /* synthetic */ AnonymousClass9Bs A00;
    public final /* synthetic */ PaymentMethodsListPickerFragment A01;

    public C197439dA(AnonymousClass9Bs r1, PaymentMethodsListPickerFragment paymentMethodsListPickerFragment) {
        this.A00 = r1;
        this.A01 = paymentMethodsListPickerFragment;
    }

    public View B4C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass9Bs r3 = this.A00;
        if (r3.A0i.size() == 0) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, (ViewGroup) null);
        C1899593h.A0m(inflate, R.id.check_balance_icon, AnonymousClass0Y8.A04(r3, R.color.f5nameremoved));
        return inflate;
    }

    public int B9g(C166587yw r4) {
        AnonymousClass9Bs r2 = this.A00;
        if (r2.A8E(r4, r2.A0Z) || !r4.equals(r2.A0B)) {
            return 0;
        }
        return R.drawable.countrypicker_checkmark;
    }

    public String B9i(C166587yw r3) {
        AnonymousClass9Bs r1 = this.A00;
        if (r1.A8E(r3, r1.A0Z)) {
            return r1.getString(R.string.f11nameremoved);
        }
        if (AnonymousClass9W6.A01(r1.A0i)) {
            return "";
        }
        return null;
    }

    public String B9j(C166587yw r3) {
        return this.A00.A0K.A02(r3, false);
    }

    public View BB1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass9Bs r0 = this.A00;
        r0.A0S.BKB(C18290x4.A0Z(), (Integer) null, "available_payment_methods_prompt", r0.A0f);
        return null;
    }

    public void BM8() {
        AnonymousClass9Bs r2 = this.A00;
        r2.A7M(57, "available_payment_methods_prompt");
        if (TextUtils.isEmpty(r2.A0Z) || !r2.A0O.A02.A0X(4638) || !AnonymousClass97T.A12(r2)) {
            r2.A8B((String) null);
            return;
        }
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A01.A0E;
        paymentBottomSheet.A1b(new IndiaUpiAccountTypeSelectionFragment(new C192729Li(this, 1, paymentBottomSheet)));
    }

    public void BMC() {
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A01.A0N();
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A1Y();
        }
        this.A00.A7r();
    }

    public void BNF() {
        this.A00.A7M(1, "available_payment_methods_prompt");
    }

    public boolean BoB(C166587yw r3) {
        AnonymousClass9Bs r1 = this.A00;
        return r1.A8E(r3, r1.A0Z);
    }

    public boolean BoP() {
        return AnonymousClass000.A1X(this.A00.A0U);
    }

    public View B7m(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return AnonymousClass001.A0R(layoutInflater, frameLayout, R.layout.f8nameremoved);
    }

    public /* synthetic */ void Boj(C166587yw r1, PaymentMethodRow paymentMethodRow) {
    }

    public /* synthetic */ boolean BoR() {
        return false;
    }

    public boolean BoY() {
        return false;
    }
}
