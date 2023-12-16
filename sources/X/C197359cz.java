package X;

import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;
import com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import java.util.List;
import java.util.Objects;

/* renamed from: X.9cz  reason: invalid class name and case insensitive filesystem */
public class C197359cz implements C186078ui {
    public final /* synthetic */ AnonymousClass39L A00;
    public final /* synthetic */ HybridPaymentMethodPickerFragment A01;
    public final /* synthetic */ AnonymousClass9Cu A02;
    public final /* synthetic */ PaymentBottomSheet A03;
    public final /* synthetic */ List A04;

    public C197359cz(AnonymousClass39L r1, HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment, AnonymousClass9Cu r3, PaymentBottomSheet paymentBottomSheet, List list) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = paymentBottomSheet;
        this.A01 = hybridPaymentMethodPickerFragment;
        this.A04 = list;
    }

    public void BM8() {
        AnonymousClass9Cu r3 = this.A02;
        PaymentBottomSheet paymentBottomSheet = this.A03;
        if (!r3.A0O.A02.A0X(4638) || !AnonymousClass97T.A12(r3)) {
            r3.A8B((String) null);
        } else {
            paymentBottomSheet.A1b(new IndiaUpiAccountTypeSelectionFragment(new C192729Li(r3, 0, paymentBottomSheet)));
        }
    }

    public void BOO() {
        AnonymousClass9Cu r4 = this.A02;
        r4.BKD((AnonymousClass303) null, AnonymousClass001.A0f(), C18290x4.A0a(), "payment_method_prompt");
        r4.A8J();
    }

    public void BQ4(C166587yw r6) {
        AnonymousClass9Cu r4 = this.A02;
        r4.A8N(r6, this.A00, this.A01, this.A03);
        AnonymousClass303 A06 = r4.A0S.A06(r6, (AnonymousClass303) null);
        A06.A03("available_payment_methods", TextUtils.join(",", this.A04));
        r4.BKD(A06, AnonymousClass001.A0f(), C18290x4.A0c(), "payment_method_prompt");
    }

    public void BXr(C166587yw r6) {
        AnonymousClass9Cu r4 = this.A02;
        r4.BKD(r4.A0S.A06(r6, (AnonymousClass303) null), AnonymousClass001.A0f(), 169, "payment_method_prompt");
    }

    public void BgJ() {
        AnonymousClass9Cu r4 = this.A02;
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = this.A01;
        if (r4 instanceof AnonymousClass9Ct) {
            AnonymousClass9Ct r5 = (AnonymousClass9Ct) r4;
            Objects.requireNonNull(r5.A09);
            C626936e.A0B(!r5.A09.isEmpty());
            AnonymousClass3SQ r0 = (AnonymousClass3SQ) ((AnonymousClass394) r5.A09.get(0)).A00;
            Objects.requireNonNull(r0);
            AnonymousClass3SP r1 = r0.A00;
            DialogFragment dialogFragment = (DialogFragment) hybridPaymentMethodPickerFragment.A0N();
            if (dialogFragment != null) {
                dialogFragment.A1K();
            }
            String str = r1.A02;
            r5.BpY(C192769Lm.A00(r5, r5.A0D, AnonymousClass32Y.A03(r5.A04.A00), str), 0);
        }
        AnonymousClass303 A0K = C1899593h.A0K();
        A0K.A03("available_payment_methods", TextUtils.join(",", this.A04));
        A0K.A03("payment_method", "payment_link");
        r4.BKD(A0K, AnonymousClass001.A0f(), C18290x4.A0c(), "payment_method_prompt");
    }

    public void Bpe() {
        AnonymousClass9Cu r3 = this.A02;
        AnonymousClass39L r5 = this.A00;
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = this.A01;
        if (r3 instanceof AnonymousClass9Ct) {
            AnonymousClass9Ct r4 = (AnonymousClass9Ct) r3;
            WaButtonWithLoader waButtonWithLoader = hybridPaymentMethodPickerFragment.A01;
            if (waButtonWithLoader != null) {
                waButtonWithLoader.A06 = true;
                waButtonWithLoader.A00();
            }
            C199289gL r8 = new C199289gL(hybridPaymentMethodPickerFragment);
            C199289gL r9 = new C199289gL(hybridPaymentMethodPickerFragment);
            r4.A8X(r5, new C204129or(r5, r4, 0), (PaymentBottomSheet) hybridPaymentMethodPickerFragment.A0N(), r8, r9);
        }
        AnonymousClass303 A0K = C1899593h.A0K();
        A0K.A03("available_payment_methods", TextUtils.join(",", this.A04));
        A0K.A03("payment_method", "hpp");
        r3.BKD(A0K, AnonymousClass001.A0f(), C18290x4.A0c(), "payment_method_prompt");
    }

    public void Bpj() {
        this.A02.A8P(this.A00);
    }
}
