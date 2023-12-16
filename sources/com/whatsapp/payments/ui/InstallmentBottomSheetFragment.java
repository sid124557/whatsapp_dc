package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass303;
import X.AnonymousClass6C9;
import X.AnonymousClass7I7;
import X.AnonymousClass7LE;
import X.C08310eF;
import X.C125236Ha;
import X.C162457s7;
import X.C18270x1;
import X.C182868p7;
import X.C182898pA;
import X.C18310x6;
import X.C1891290c;
import X.C203499no;
import X.C54292oU;
import X.C620733j;
import X.C626936e;
import X.C632538n;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

public final class InstallmentBottomSheetFragment extends Hilt_InstallmentBottomSheetFragment implements C182898pA {
    public C54292oU A00;
    public C620733j A01;
    public C203499no A02;
    public AnonymousClass7LE A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public List A07 = AnonymousClass001.A0s();

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ArrayList arrayList;
        Integer num;
        String str;
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        Bundle bundle2 = this.A06;
        Integer num2 = null;
        if (bundle2 != null) {
            arrayList = bundle2.getParcelableArrayList("arg_installment_list");
        } else {
            arrayList = null;
        }
        this.A07 = arrayList;
        Bundle bundle3 = this.A06;
        if (bundle3 != null) {
            num = Integer.valueOf(bundle3.getInt("arg_selected_position"));
        } else {
            num = null;
        }
        this.A05 = num;
        Bundle bundle4 = this.A06;
        if (bundle4 != null) {
            str = bundle4.getString("arg_referral_screen");
        } else {
            str = null;
        }
        this.A06 = str;
        Bundle bundle5 = this.A06;
        if (bundle5 != null) {
            num2 = Integer.valueOf(bundle5.getInt("arg_max_installment_count"));
        }
        this.A04 = num2;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.installment_recycler_view);
        C620733j r1 = this.A01;
        if (r1 != null) {
            C54292oU r0 = this.A00;
            if (r0 != null) {
                C125236Ha r9 = new C125236Ha(r0, r1);
                List list = this.A07;
                C626936e.A06(list);
                C162457s7.A0D(list);
                Integer num3 = this.A05;
                C626936e.A06(num3);
                C162457s7.A0D(num3);
                int intValue = num3.intValue();
                r9.A00 = intValue;
                AnonymousClass7I7 r5 = new AnonymousClass7I7(this, r9);
                if (C18310x6.A1X(list)) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        r9.A03.add(new AnonymousClass7LE(r5, (C632538n) list.get(i), AnonymousClass000.A1U(intValue, i)));
                    }
                }
                recyclerView.setAdapter(r9);
                C1891290c.A00(inflate.findViewById(R.id.back), this, 15);
                C1891290c.A00(inflate.findViewById(R.id.select_button), this, 16);
                return inflate;
            }
            throw C18270x1.A0S("waContext");
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public final void A1J() {
        A1K(4);
        C08310eF A0P = A0P(true);
        C08310eF r2 = this.A0E;
        C162457s7.A0K(r2, "null cannot be cast to non-null type com.whatsapp.payments.ui.PaymentBottomSheet");
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) r2;
        if (A0P instanceof C182868p7) {
            Integer num = this.A05;
            C626936e.A06(num);
            C162457s7.A0D(num);
            ((C182868p7) A0P).BUg(num.intValue());
            paymentBottomSheet.A1b(A0P);
        }
    }

    public void Bry(AnonymousClass7LE r2, int i) {
        C162457s7.A0J(r2, 0);
        this.A05 = Integer.valueOf(i);
        this.A03 = r2;
    }

    public final void A1K(int i) {
        List list;
        AnonymousClass303 A0W = AnonymousClass6C9.A0W();
        Integer num = this.A05;
        if (!(num == null || (list = this.A07) == null)) {
            C626936e.A06(num);
            C632538n r0 = (C632538n) list.get(num.intValue());
            if (r0 != null) {
                int i2 = r0.A00;
                if (Integer.valueOf(i2) != null) {
                    A0W.A02("num_installments", i2);
                }
            }
        }
        Integer num2 = this.A04;
        if (num2 != null) {
            C626936e.A06(num2);
            A0W.A02("max_num_installments", num2.intValue());
        }
        C203499no r1 = this.A02;
        if (r1 != null) {
            r1.BKE(A0W, AnonymousClass001.A0f(), Integer.valueOf(i), "installments_selection_prompt", this.A06);
            return;
        }
        throw C18270x1.A0S("paymentUiEventLogger");
    }
}
