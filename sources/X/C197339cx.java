package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentTypePickerFragment;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.InstallmentBottomSheetFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentRailPickerFragment;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9cx  reason: invalid class name and case insensitive filesystem */
public class C197339cx implements C203489nm {
    public final /* synthetic */ AnonymousClass3XA A00;
    public final /* synthetic */ AnonymousClass39Q A01;
    public final /* synthetic */ AnonymousClass9VG A02;
    public final /* synthetic */ BrazilPaymentActivity A03;
    public final /* synthetic */ ConfirmPaymentFragment A04;
    public final /* synthetic */ PaymentBottomSheet A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public void BPe(View view, View view2, C195319Xg r14, C133676hl r15, C166587yw r16, PaymentBottomSheet paymentBottomSheet) {
        AnonymousClass3XA r4 = this.A00;
        C195319Xg r6 = r14;
        C133676hl r7 = r15;
        C166587yw r8 = r16;
        PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
        if (r4 != null) {
            BrazilPaymentActivity brazilPaymentActivity = this.A03;
            brazilPaymentActivity.Bp9(R.string.f11nameremoved);
            AnonymousClass9WW r2 = brazilPaymentActivity.A0W;
            r4.A04(new C204999qG(brazilPaymentActivity, new AnonymousClass9dJ(r6, r7, r8, this, paymentBottomSheet2), r2, 3), r2.A00.A08);
            return;
        }
        A00(r14, r15, r8, (AnonymousClass3QO) null, paymentBottomSheet2);
    }

    public C197339cx(AnonymousClass3XA r1, AnonymousClass39Q r2, AnonymousClass9VG r3, BrazilPaymentActivity brazilPaymentActivity, ConfirmPaymentFragment confirmPaymentFragment, PaymentBottomSheet paymentBottomSheet, String str, String str2) {
        this.A03 = brazilPaymentActivity;
        this.A00 = r1;
        this.A05 = paymentBottomSheet;
        this.A02 = r3;
        this.A01 = r2;
        this.A07 = str;
        this.A04 = confirmPaymentFragment;
        this.A06 = str2;
    }

    public final void A00(C195319Xg r19, C133676hl r20, C166587yw r21, AnonymousClass3QO r22, PaymentBottomSheet paymentBottomSheet) {
        BrazilPaymentActivity brazilPaymentActivity = this.A03;
        AnonymousClass9VG r4 = this.A02;
        AnonymousClass39Q r7 = this.A01;
        C203499no r8 = brazilPaymentActivity.A0L;
        String str = this.A07;
        AnonymousClass303 A012 = AnonymousClass9Wg.A01(brazilPaymentActivity.A06, r7, r4, brazilPaymentActivity.A0g);
        C626936e.A06(r8);
        C195319Xg r6 = r19;
        if (r19 != null) {
            A012.A02("num_installments", r6.A01);
            A012.A04("has_installments_fees", false);
        }
        r8.BKE(A012, 1, 47, "payment_confirm_prompt", str);
        C133676hl r42 = r20;
        C166587yw r82 = r21;
        if (r20 != null) {
            int A072 = r42.A07();
            if (BrazilPaymentActivity.A14(r82, A072)) {
                PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
                if (paymentBottomSheet != null) {
                    BXo(paymentBottomSheet2, A072);
                    return;
                }
                return;
            }
            brazilPaymentActivity.A04.BkM(new C200259i2(r42, this));
        }
        C133796hx r1 = r82.A08;
        C626936e.A06(r1);
        if (((C133786hw) r1).A0a) {
            AnonymousClass9U4.A00(brazilPaymentActivity.A0P).A03((C202439m1) null, r82);
            this.A05.A1K();
            AnonymousClass3QO r9 = r22;
            if (Build.VERSION.SDK_INT < 23 || !brazilPaymentActivity.A0P.A05() || brazilPaymentActivity.A0P.A01() != 1) {
                BrazilPaymentActivity.A13(r6, r7, r82, r9, brazilPaymentActivity, r7.toString(), brazilPaymentActivity.A0p);
                return;
            }
            brazilPaymentActivity.A7J(r6, r7, r82, r9, r7.toString(), brazilPaymentActivity.A0p);
            return;
        }
        boolean A0X = brazilPaymentActivity.A0D.A0X(1927);
        String str2 = r82.A0A;
        if (A0X) {
            brazilPaymentActivity.Bp9(R.string.f11nameremoved);
            brazilPaymentActivity.A7P(str2);
            brazilPaymentActivity.A0Y.A01(new AnonymousClass9UJ(brazilPaymentActivity, 0), new C205149qV(brazilPaymentActivity, 1), new C204609pd(brazilPaymentActivity, 1), str2, "payment_method_details").A03(new C204969qD(1, str2, brazilPaymentActivity));
            return;
        }
        brazilPaymentActivity.Bp9(R.string.f11nameremoved);
        brazilPaymentActivity.A7P(str2);
        C56612sH r83 = brazilPaymentActivity.A06;
        C69263Wi r62 = brazilPaymentActivity.A05;
        C56972sr r72 = brazilPaymentActivity.A01;
        AnonymousClass31C r10 = brazilPaymentActivity.A0H;
        C194259Se r0 = brazilPaymentActivity.A0Z;
        AnonymousClass9U4 r14 = brazilPaymentActivity.A0P;
        new AnonymousClass9S9(brazilPaymentActivity, r62, r72, r83, brazilPaymentActivity.A07, r10, brazilPaymentActivity.A0B, brazilPaymentActivity.A0K, brazilPaymentActivity.A0M, r14, brazilPaymentActivity.A0N, r0, str2).A00(new C196929by(brazilPaymentActivity, str2));
    }

    public void BUf(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
        String str = this.A07;
        int i3 = ((C632538n) list.get(i)).A00;
        AnonymousClass303 A0K = C1899593h.A0K();
        A0K.A02("num_installments", i3);
        AnonymousClass9Wg.A03(A0K, this.A03.A0L, "installments_selection_prompt", str);
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelableArrayList("arg_installment_list", (ArrayList) list);
        A08.putInt("arg_selected_position", i);
        A08.putString("arg_referral_screen", str);
        A08.putInt("arg_max_installment_count", i2);
        InstallmentBottomSheetFragment installmentBottomSheetFragment = new InstallmentBottomSheetFragment();
        installmentBottomSheetFragment.A0u(A08);
        installmentBottomSheetFragment.A10(this.A04, 0);
        paymentBottomSheet.A1b(installmentBottomSheetFragment);
    }

    public void BXo(PaymentBottomSheet paymentBottomSheet, int i) {
        BrazilPaymentActivity brazilPaymentActivity = this.A03;
        AnonymousClass9VG r3 = this.A02;
        AnonymousClass39Q r2 = this.A01;
        AnonymousClass9Wg.A02(AnonymousClass9Wg.A01(brazilPaymentActivity.A06, r2, r3, brazilPaymentActivity.A0g), brazilPaymentActivity.A0L, 84, "payment_confirm_prompt", (String) null, 1);
        brazilPaymentActivity.A04.A03(new C198029eG(this, this.A04, paymentBottomSheet, this.A06));
    }

    public void BXv(PaymentBottomSheet paymentBottomSheet, int i, int i2) {
        PaymentRailPickerFragment A002 = PaymentRailPickerFragment.A00(i, "p2p".equals(this.A03.A0p));
        A002.A10(this.A04, 0);
        paymentBottomSheet.A1b(A002);
    }

    public void BY0(int i) {
        String str;
        BrazilPaymentActivity brazilPaymentActivity = this.A03;
        if (i == 1) {
            str = "p2p";
        } else {
            str = "p2m";
        }
        brazilPaymentActivity.A0p = str;
    }

    public void BXz(PaymentBottomSheet paymentBottomSheet, int i) {
        String str;
        Bundle A08 = AnonymousClass002.A08();
        if (i != 0) {
            str = "friendsAndFamily";
        } else {
            str = "goodAndServices";
        }
        A08.putString("arg_type", str);
        BrazilPaymentTypePickerFragment brazilPaymentTypePickerFragment = new BrazilPaymentTypePickerFragment();
        brazilPaymentTypePickerFragment.A0u(A08);
        brazilPaymentTypePickerFragment.A10(this.A04, 0);
        paymentBottomSheet.A1b(brazilPaymentTypePickerFragment);
    }

    public void BXs(C166587yw r1, PaymentMethodRow paymentMethodRow) {
    }

    public void BeU(PaymentBottomSheet paymentBottomSheet) {
    }
}
