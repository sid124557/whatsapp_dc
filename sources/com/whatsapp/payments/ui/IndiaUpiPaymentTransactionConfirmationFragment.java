package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0XL;
import X.AnonymousClass1S3;
import X.AnonymousClass1VX;
import X.AnonymousClass303;
import X.AnonymousClass39Q;
import X.AnonymousClass3H6;
import X.AnonymousClass99H;
import X.AnonymousClass99L;
import X.AnonymousClass9Kr;
import X.AnonymousClass9R6;
import X.C06560Yg;
import X.C107575bX;
import X.C133796hx;
import X.C134246ig;
import X.C166557yt;
import X.C166587yw;
import X.C18300x5;
import X.C1899593h;
import X.C197109ca;
import X.C204249p3;
import X.C205049qL;
import X.C54292oU;
import X.C56612sH;
import X.C60312yL;
import X.C620733j;
import X.C626936e;
import X.C85204Fi;
import X.C86654Ky;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;

public class IndiaUpiPaymentTransactionConfirmationFragment extends Hilt_IndiaUpiPaymentTransactionConfirmationFragment {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public LottieAnimationView A03;
    public C56612sH A04;
    public C54292oU A05;
    public C620733j A06;
    public AnonymousClass1VX A07;
    public C166557yt A08;
    public C197109ca A09;
    public AnonymousClass9R6 A0A;
    public IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel A0B;
    public C60312yL A0C;
    public WDSButton A0D;
    public WDSButton A0E;
    public String A0F;
    public String A0G;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel indiaUpiPaymentTransactionConfirmationBottomSheetViewModel = (IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel) new AnonymousClass0XL(this).A01(IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel.class);
        this.A0B = indiaUpiPaymentTransactionConfirmationBottomSheetViewModel;
        C205049qL.A03(A0V(), indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0F.A00, this, 36);
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        AnonymousClass99H r9;
        Bundle bundle2 = this.A06;
        View view2 = view;
        this.A03 = (LottieAnimationView) C06560Yg.A02(view2, R.id.lottie_animation);
        TextView A0G2 = C18300x5.A0G(view2, R.id.amount);
        this.A02 = C18300x5.A0G(view2, R.id.status);
        this.A01 = C18300x5.A0G(view2, R.id.name);
        this.A0E = C86654Ky.A0f(view2, R.id.view_details_button);
        this.A0D = C86654Ky.A0f(view2, R.id.done_button);
        this.A00 = C18300x5.A0G(view2, R.id.date);
        if (bundle2 != null) {
            C85204Fi r8 = AnonymousClass1S3.A05;
            AnonymousClass99L r5 = (AnonymousClass99L) bundle2.getParcelable("extra_country_transaction_data");
            AnonymousClass39Q r14 = (AnonymousClass39Q) bundle2.getParcelable("extra_transaction_send_amount");
            C166587yw r6 = (C166587yw) bundle2.getParcelable("extra_payment_method");
            String string = bundle2.getString("extra_encrypted_interop_description");
            this.A08 = (C166557yt) bundle2.getParcelable("extra_payee_name");
            C166557yt r2 = (C166557yt) bundle2.getParcelable("extra_receiver_vpa");
            C166557yt r4 = (C166557yt) bundle2.getParcelable("extra_payment_upi_number");
            String string2 = bundle2.getString("extra_merchant_code");
            String string3 = bundle2.getString("extra_transaction_ref");
            String string4 = bundle2.getString("extra_transaction_ref_url");
            String string5 = bundle2.getString("extra_purpose_code");
            String string6 = bundle2.getString("extra_initiation_mode");
            this.A0G = bundle2.getString("extra_transaction_id");
            String string7 = bundle2.getString("extra_transaction_type");
            this.A0F = bundle2.getString("referral_screen");
            if (r6 != null) {
                C133796hx r92 = r6.A08;
                C626936e.A06(r92);
                r9 = (AnonymousClass99H) r92;
            } else {
                r9 = null;
            }
            C204249p3.A02(this.A0E, this, 72);
            C204249p3.A02(this.A0D, this, 73);
            C204249p3.A02(C06560Yg.A02(view2, R.id.close), this, 74);
            if (r14 != null && r9 != null && r6 != null) {
                this.A03.setAnimation("transaction_confirmation_lottie_animation.json");
                A0G2.setText(r8.B3V(this.A06, r14));
                IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel indiaUpiPaymentTransactionConfirmationBottomSheetViewModel = this.A0B;
                C166557yt r15 = r9.A06;
                String str = r6.A0A;
                String str2 = ((AnonymousClass3H6) r8).A04;
                C166557yt r62 = this.A08;
                boolean equals = "p2m".equals(string7);
                String str3 = this.A0G;
                indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A06 = r5;
                indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A03 = r14;
                indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A09 = string;
                indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A04 = r62;
                indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A05 = r2;
                HashMap hashMap = indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0C.A08;
                if (hashMap != null) {
                    C166557yt r17 = r4;
                    C166557yt r16 = r62;
                    indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0E.A00(r14, r15, r16, r17, r5, indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0D, new AnonymousClass9Kr(indiaUpiPaymentTransactionConfirmationBottomSheetViewModel, 1), str, str2, string3, string2, string4, string5, string6, str3, string, (String) null, hashMap, equals);
                }
            }
        }
    }

    public final void A1J(int i, int i2, String str) {
        C134246ig B0d = this.A09.B0d();
        C1899593h.A1B(B0d, i);
        B0d.A0Y = "payment_confirm_prompt";
        B0d.A0b = "payments_transaction_confirmation";
        B0d.A0a = this.A0F;
        if (!C107575bX.A0F(str)) {
            AnonymousClass303 A0K = C1899593h.A0K();
            A0K.A03("transaction_status", str);
            B0d.A0Z = A0K.toString();
        }
        if (i == 1) {
            B0d.A07 = Integer.valueOf(i2);
        }
        this.A09.BKA(B0d);
    }

    public void A0d() {
        super.A0d();
        this.A0A = null;
    }
}
