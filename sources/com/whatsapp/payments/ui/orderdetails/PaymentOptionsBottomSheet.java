package com.whatsapp.payments.ui.orderdetails;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass303;
import X.AnonymousClass5Vo;
import X.AnonymousClass958;
import X.AnonymousClass9NX;
import X.AnonymousClass9OS;
import X.AnonymousClass9Wg;
import X.AnonymousClass9XA;
import X.C06560Yg;
import X.C1899593h;
import X.C193619Pi;
import X.C195339Xj;
import X.C202809mc;
import X.C203499no;
import X.C204249p3;
import X.C53762nc;
import X.C620633i;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

public class PaymentOptionsBottomSheet extends Hilt_PaymentOptionsBottomSheet {
    public RecyclerView A00;
    public C53762nc A01;
    public C620633i A02;
    public AnonymousClass1VX A03;
    public AnonymousClass9XA A04 = new AnonymousClass9XA();
    public C203499no A05;
    public C202809mc A06;
    public String A07;
    public String A08;
    public List A09;
    public boolean A0A;

    public void A1W(AnonymousClass5Vo r3) {
        r3.A00.A06 = false;
    }

    public void A0w(Bundle bundle, View view) {
        C193619Pi r14;
        Bundle bundle2 = bundle;
        View view2 = view;
        super.A0w(bundle2, view2);
        if (bundle == null) {
            this.A08 = A0H().getString("selected_payment_method", "WhatsappPay");
            this.A09 = A0H().getParcelableArrayList("payment_method_list");
            this.A07 = A0H().getString("referral_screen");
            bundle2 = A0H();
        } else {
            this.A08 = bundle2.getString("selected_payment_method", "WhatsappPay");
            this.A09 = bundle2.getParcelableArrayList("payment_method_list");
            this.A07 = bundle2.getString("referral_screen");
        }
        this.A0A = bundle2.getBoolean("should_log_event");
        C204249p3.A02(C06560Yg.A02(view2, R.id.close), this, 126);
        AnonymousClass958 r4 = new AnonymousClass958(this.A02, this.A03);
        String str = this.A08;
        List<C195339Xj> list = this.A09;
        AnonymousClass9NX r0 = new AnonymousClass9NX(this);
        C53762nc r15 = this.A01;
        r4.A00 = str;
        List list2 = r4.A03;
        list2.clear();
        AnonymousClass9OS r12 = new AnonymousClass9OS(r0, r4);
        for (C195339Xj r11 : list) {
            String str2 = r11.A0A;
            if ("WhatsappPay".equals(str2)) {
                r14 = new C193619Pi((C53762nc) null, r11, r12, 0, "WhatsappPay".equals(str));
            } else {
                r14 = new C193619Pi(r15, r11, r12, 1, str.equals(str2));
            }
            list2.add(r14);
        }
        RecyclerView recyclerView = (RecyclerView) C06560Yg.A02(view2, R.id.payment_option_recycler_view);
        this.A00 = recyclerView;
        recyclerView.setAdapter(r4);
        C204249p3.A02(C06560Yg.A02(view2, R.id.continue_button), this, 127);
        A1Y((Integer) null, this.A08, 0);
    }

    public final void A1Y(Integer num, String str, int i) {
        String str2;
        if (this.A0A) {
            AnonymousClass303 A0K = C1899593h.A0K();
            A0K.A03("transaction_type", "purchase");
            if ("WhatsappPay".equals(str)) {
                str2 = "native";
            } else if ("CustomPaymentInstructions".equals(str)) {
                str2 = "cpi";
            } else {
                if ("pix".equals(str)) {
                    A0K.A03("payment_type", "pix");
                }
                AnonymousClass9Wg.A02(A0K, this.A05, num, "payment_options_prompt", this.A07, i);
            }
            A0K.A03("payment_type", str2);
            AnonymousClass9Wg.A02(A0K, this.A05, num, "payment_options_prompt", this.A07, i);
        }
    }

    public static PaymentOptionsBottomSheet A00(String str, String str2, List list, boolean z) {
        Bundle A082 = AnonymousClass002.A08();
        A082.putString("selected_payment_method", str);
        A082.putParcelableArrayList("payment_method_list", AnonymousClass002.A0J(list));
        A082.putString("referral_screen", str2);
        A082.putBoolean("should_log_event", z);
        PaymentOptionsBottomSheet paymentOptionsBottomSheet = new PaymentOptionsBottomSheet();
        paymentOptionsBottomSheet.A0u(A082);
        return paymentOptionsBottomSheet;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0c() {
        super.A0c();
        this.A06 = null;
    }

    public void A0q(Bundle bundle) {
        super.A0q(bundle);
        bundle.putString("selected_payment_method", this.A08);
        bundle.putParcelableArrayList("payment_method_list", AnonymousClass002.A0J(this.A09));
        bundle.putString("referral_screen", this.A07);
        bundle.putBoolean("should_log_event", this.A0A);
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        AnonymousClass9XA r0 = this.A04;
        if (r0 != null) {
            r0.onDismiss(dialogInterface);
        }
    }
}
