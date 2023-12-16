package X;

import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPixKeySettingActivity;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.8YT  reason: invalid class name */
public final class AnonymousClass8YT extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BrazilPixKeySettingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YT(BrazilPixKeySettingActivity brazilPixKeySettingActivity) {
        super(1);
        this.this$0 = brazilPixKeySettingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5SE r8 = (AnonymousClass5SE) obj;
        BrazilPixKeySettingActivity brazilPixKeySettingActivity = this.this$0;
        if (r8 != null) {
            PaymentMethodRow paymentMethodRow = brazilPixKeySettingActivity.A04;
            if (paymentMethodRow == null) {
                throw C18270x1.A0S("paymentMethodRow");
            }
            paymentMethodRow.A06(brazilPixKeySettingActivity.getString(R.string.f11nameremoved));
            PaymentMethodRow paymentMethodRow2 = brazilPixKeySettingActivity.A04;
            if (paymentMethodRow2 == null) {
                throw C18270x1.A0S("paymentMethodRow");
            }
            paymentMethodRow2.setAccountId(r8.A02);
            PaymentMethodRow paymentMethodRow3 = brazilPixKeySettingActivity.A04;
            if (paymentMethodRow3 == null) {
                throw C18270x1.A0S("paymentMethodRow");
            }
            paymentMethodRow3.A05(r8.A00);
            PaymentMethodRow paymentMethodRow4 = brazilPixKeySettingActivity.A04;
            if (paymentMethodRow4 == null) {
                throw C18270x1.A0S("paymentMethodRow");
            }
            paymentMethodRow4.A09(false);
            if (brazilPixKeySettingActivity.A76()) {
                PaymentMethodRow paymentMethodRow5 = brazilPixKeySettingActivity.A04;
                if (paymentMethodRow5 == null) {
                    throw C18270x1.A0S("paymentMethodRow");
                }
                paymentMethodRow5.A03(R.drawable.ic_action_delete);
                int A04 = AnonymousClass0Y8.A04(brazilPixKeySettingActivity, R.color.f5nameremoved);
                int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, AnonymousClass000.A0B(brazilPixKeySettingActivity));
                PaymentMethodRow paymentMethodRow6 = brazilPixKeySettingActivity.A04;
                if (paymentMethodRow6 == null) {
                    throw C18270x1.A0S("paymentMethodRow");
                }
                ImageView imageView = (ImageView) paymentMethodRow6.findViewById(R.id.payment_method_decorate_icon);
                C86624Kv.A0w(imageView, applyDimension);
                imageView.getLayoutParams().width = applyDimension;
                C107335b8.A0E(imageView, A04);
            }
            View findViewById = brazilPixKeySettingActivity.findViewById(R.id.delete_payments_account_action);
            C107335b8.A0E((ImageView) findViewById.findViewById(R.id.delete_payments_account_icon), AnonymousClass0Y8.A04(brazilPixKeySettingActivity, R.color.f5nameremoved));
            AnonymousClass002.A09(findViewById, R.id.delete_payments_account_label).setText(R.string.f11nameremoved);
            brazilPixKeySettingActivity.A05.A0L(brazilPixKeySettingActivity);
            C1891290c.A00(findViewById, brazilPixKeySettingActivity, 4);
            if (brazilPixKeySettingActivity.A76()) {
                findViewById.setVisibility(8);
                PaymentMethodRow paymentMethodRow7 = brazilPixKeySettingActivity.A04;
                if (paymentMethodRow7 == null) {
                    throw C18270x1.A0S("paymentMethodRow");
                }
                C1891290c.A00(paymentMethodRow7.findViewById(R.id.payment_method_decorate_icon), brazilPixKeySettingActivity, 5);
            }
            BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = brazilPixKeySettingActivity.A03;
            if (brazilPixKeySettingViewModel == null) {
                throw C18270x1.A0S("brazilPixKeySettingViewModel");
            }
            C86604Kt.A1N(brazilPixKeySettingActivity, brazilPixKeySettingViewModel.A01, new AnonymousClass8YS(brazilPixKeySettingActivity), 303);
            PaymentMethodRow paymentMethodRow8 = (PaymentMethodRow) brazilPixKeySettingActivity.findViewById(R.id.step_up_row_container);
            if (!brazilPixKeySettingActivity.A76()) {
                paymentMethodRow8.setVisibility(8);
            } else {
                paymentMethodRow8.A06(AnonymousClass002.A0F(brazilPixKeySettingActivity, brazilPixKeySettingActivity.A06, new Object[1], 0, R.string.f11nameremoved));
                paymentMethodRow8.A05(brazilPixKeySettingActivity.getString(R.string.f11nameremoved));
                int applyDimension2 = (int) TypedValue.applyDimension(1, 40.0f, AnonymousClass000.A0B(brazilPixKeySettingActivity));
                ImageView imageView2 = (ImageView) paymentMethodRow8.findViewById(R.id.payment_method_provider_icon);
                C86624Kv.A0w(imageView2, applyDimension2);
                imageView2.getLayoutParams().width = applyDimension2;
                imageView2.setImageResource(R.drawable.vec_plus_icon);
                paymentMethodRow8.A08(false);
                brazilPixKeySettingActivity.A05.A0L(brazilPixKeySettingActivity);
                C1891290c.A00(paymentMethodRow8, brazilPixKeySettingActivity, 3);
            }
        }
        return C59022wD.A00;
    }
}
