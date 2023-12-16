package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0XL;
import X.AnonymousClass1S3;
import X.AnonymousClass303;
import X.AnonymousClass39Q;
import X.AnonymousClass5YI;
import X.AnonymousClass7I9;
import X.AnonymousClass8UF;
import X.AnonymousClass8s3;
import X.AnonymousClass9Wg;
import X.C08310eF;
import X.C162457s7;
import X.C167187zu;
import X.C18270x1;
import X.C18280x3;
import X.C1891090a;
import X.C1891290c;
import X.C195219Wq;
import X.C203499no;
import X.C625635p;
import X.C626936e;
import X.C85204Fi;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel;
import java.math.BigDecimal;
import java.util.ArrayList;

public final class BrazilPaymentIncomeCollectionBottomSheet extends Hilt_BrazilPaymentIncomeCollectionBottomSheet {
    public static final ArrayList A05 = AnonymousClass8UF.A0m(new AnonymousClass7I9(0, 15000), new AnonymousClass7I9(15000, C625635p.A0L), new AnonymousClass7I9(C625635p.A0L, 45000), new AnonymousClass7I9(45000, 60000), new AnonymousClass7I9(60000, Long.MAX_VALUE));
    public C203499no A00;
    public AnonymousClass8s3 A01;
    public BrazilIncomeCollectionViewModel A02;
    public C195219Wq A03;
    public String A04;

    public void A0w(Bundle bundle, View view) {
        String A0X;
        View view2 = view;
        C162457s7.A0J(view2, 0);
        super.A0w(bundle, view2);
        RadioGroup radioGroup = (RadioGroup) C18280x3.A0E(view2, R.id.income_collection_slabs_radio_group);
        ArrayList arrayList = A05;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RadioButton radioButton = new RadioButton(view2.getContext());
            radioButton.setId(i);
            Object obj = arrayList.get(i);
            C162457s7.A0D(obj);
            AnonymousClass7I9 r0 = (AnonymousClass7I9) obj;
            C162457s7.A0J(r0, 0);
            long j = r0.A00;
            if (j == Long.MAX_VALUE) {
                Object[] A0L = AnonymousClass002.A0L();
                C195219Wq r12 = this.A03;
                if (r12 != null) {
                    A0L[0] = r12.A0N(AnonymousClass1S3.A04, new AnonymousClass39Q(new BigDecimal(r0.A01), 0));
                    A0X = C08310eF.A09(this).getString(R.string.f11nameremoved, A0L);
                    C162457s7.A0D(A0X);
                } else {
                    throw C18270x1.A0S("paymentsUtils");
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                C195219Wq r14 = this.A03;
                if (r14 != null) {
                    C85204Fi r122 = AnonymousClass1S3.A04;
                    A0o.append(r14.A0N(r122, new AnonymousClass39Q(new BigDecimal(r0.A01), 0)));
                    A0o.append(" - ");
                    C195219Wq r13 = this.A03;
                    if (r13 != null) {
                        A0X = AnonymousClass000.A0X(r13.A0N(r122, new AnonymousClass39Q(new BigDecimal(j), 0)), A0o);
                    } else {
                        throw C18270x1.A0S("paymentsUtils");
                    }
                } else {
                    throw C18270x1.A0S("paymentsUtils");
                }
            }
            radioButton.setText(A0X);
            radioButton.setTextSize(16.0f);
            radioButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            radioButton.setLayoutDirection(1);
            radioButton.setPadding(0, AnonymousClass5YI.A04(view2.getContext(), 12.0f), 0, AnonymousClass5YI.A04(view2.getContext(), 12.0f));
            radioButton.setGravity(16);
            radioGroup.addView(radioButton);
        }
        String str = this.A04;
        C203499no r2 = this.A00;
        if (r2 == null) {
            throw C18270x1.A0S("paymentFieldStatsLogger");
        }
        AnonymousClass9Wg.A03((AnonymousClass303) null, r2, "income_collection_prompt", str);
        WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) C18280x3.A0E(view2, R.id.income_collection_continue_button);
        waButtonWithLoader.setButtonText((int) R.string.f11nameremoved);
        waButtonWithLoader.setEnabled(false);
        radioGroup.setOnCheckedChangeListener(new C167187zu(waButtonWithLoader));
        waButtonWithLoader.A00 = new C1891090a((Object) this, (Object) radioGroup, (Object) waButtonWithLoader, 4);
        C1891290c.A00(C18280x3.A0E(view2, R.id.br_bottom_sheet_slab_container_close_button), this, 1);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        String str = this.A04;
        C203499no r1 = this.A00;
        if (r1 == null) {
            throw C18270x1.A0S("paymentFieldStatsLogger");
        }
        C626936e.A06(r1);
        r1.BKB(1, 128, "income_collection_prompt", str);
        super.onDismiss(dialogInterface);
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A04 = A0H().getString("referral_screen");
        this.A02 = (BrazilIncomeCollectionViewModel) new AnonymousClass0XL(this).A01(BrazilIncomeCollectionViewModel.class);
    }

    public int A1S() {
        return R.layout.f8nameremoved;
    }
}
