package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet;
import com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment;
import com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel;

/* renamed from: X.90a  reason: invalid class name and case insensitive filesystem */
public class C1891090a implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C1891090a(C93254oD r1, C203719oC r2, C624134x r3, int i) {
        this.A03 = i;
        this.A00 = r1;
        switch (i) {
            case 0:
            case 1:
                this.A01 = r2;
                this.A02 = r3;
                return;
            default:
                this.A01 = r3;
                this.A02 = r2;
                return;
        }
    }

    public final void onClick(View view) {
        switch (this.A03) {
            case 0:
                ((C203719oC) this.A01).BLt(((C93254oD) this.A00).getContext(), C86634Kw.A0b((C93254oD) this.A00), ((C624134x) this.A02).A0P);
                return;
            case 1:
                C93254oD.A03((C93254oD) this.A00, (C203719oC) this.A01, (C624134x) this.A02);
                return;
            case 2:
                C93254oD.A02((C93254oD) this.A00, (C203719oC) this.A02, (C624134x) this.A01);
                return;
            case 3:
                C93254oD.A00((C93254oD) this.A00, (C203719oC) this.A02, (C624134x) this.A01);
                return;
            case 4:
                WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) this.A00;
                BrazilPaymentIncomeCollectionBottomSheet brazilPaymentIncomeCollectionBottomSheet = (BrazilPaymentIncomeCollectionBottomSheet) this.A01;
                RadioGroup radioGroup = (RadioGroup) this.A02;
                waButtonWithLoader.A06 = true;
                waButtonWithLoader.A00();
                Integer A0c = C18290x4.A0c();
                String str = brazilPaymentIncomeCollectionBottomSheet.A04;
                C203499no r1 = brazilPaymentIncomeCollectionBottomSheet.A00;
                if (r1 == null) {
                    throw C18270x1.A0S("paymentFieldStatsLogger");
                }
                C626936e.A06(r1);
                r1.BKB(1, A0c, "income_collection_prompt", str);
                BrazilIncomeCollectionViewModel brazilIncomeCollectionViewModel = brazilPaymentIncomeCollectionBottomSheet.A02;
                if (brazilIncomeCollectionViewModel == null) {
                    throw C18270x1.A0S("brazilIncomeCollectionViewModel");
                }
                Context A0F = C18290x4.A0F(view);
                Object obj = BrazilPaymentIncomeCollectionBottomSheet.A05.get(radioGroup.getCheckedRadioButtonId());
                C162457s7.A0D(obj);
                brazilIncomeCollectionViewModel.A0D(A0F, new AnonymousClass8J0(waButtonWithLoader, brazilPaymentIncomeCollectionBottomSheet), (AnonymousClass7I9) obj);
                return;
            case 5:
                IndiaUpiAccountTypeSelectionFragment indiaUpiAccountTypeSelectionFragment = (IndiaUpiAccountTypeSelectionFragment) this.A00;
                CompoundButton compoundButton = (CompoundButton) this.A01;
                CompoundButton compoundButton2 = (CompoundButton) this.A02;
                indiaUpiAccountTypeSelectionFragment.A02 = false;
                C197109ca r5 = indiaUpiAccountTypeSelectionFragment.A00;
                if (r5 != null) {
                    r5.BKB(1, 169, "available_payment_methods_prompt", indiaUpiAccountTypeSelectionFragment.A01);
                    compoundButton.setChecked(true);
                    compoundButton2.setChecked(false);
                    return;
                }
                throw C18270x1.A0S("indiaUpiFieldStatsLogger");
            default:
                IndiaUpiAccountTypeSelectionFragment indiaUpiAccountTypeSelectionFragment2 = (IndiaUpiAccountTypeSelectionFragment) this.A00;
                CompoundButton compoundButton3 = (CompoundButton) this.A01;
                CompoundButton compoundButton4 = (CompoundButton) this.A02;
                indiaUpiAccountTypeSelectionFragment2.A02 = true;
                AnonymousClass303 r8 = new AnonymousClass303(new AnonymousClass303[0]);
                r8.A03("chosen_method", "credit_card");
                C197109ca r7 = indiaUpiAccountTypeSelectionFragment2.A00;
                if (r7 != null) {
                    r7.A09(r8, 1, 169, (String) null, "available_payment_methods_prompt", indiaUpiAccountTypeSelectionFragment2.A01);
                    compoundButton3.setChecked(false);
                    compoundButton4.setChecked(true);
                    return;
                }
                throw C18270x1.A0S("indiaUpiFieldStatsLogger");
        }
    }

    public C1891090a(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
