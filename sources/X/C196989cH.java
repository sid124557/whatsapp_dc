package X;

import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.9cH  reason: invalid class name and case insensitive filesystem */
public class C196989cH implements C203729oD {
    public final /* synthetic */ C197239cn A00;

    public C196989cH(C197239cn r1) {
        this.A00 = r1;
    }

    public void BJz(AnonymousClass34V r3, Integer num) {
        this.A00.A05.A0O.A05(r3, num, "pay-precheck");
        BS7(r3, num);
    }

    public Integer BK3() {
        return this.A00.A05.A0O.A00("pay-precheck");
    }

    public void BKG(AnonymousClass34V r3, Integer num) {
        this.A00.A05.A0O.A05(r3, num, "get-provider-key");
    }

    public void BKH(Integer num) {
        this.A00.A05.A0O.A07(num, "get-provider-key");
    }

    public void BS7(AnonymousClass34V r13, Integer num) {
        C165897xo A002;
        C196709bc r5;
        int i;
        String str;
        DialogInterface.OnDismissListener r8;
        C204619pe r7;
        C204629pf r9;
        C197239cn r0 = this.A00;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = r0.A04;
        pinBottomSheetDialogFragment.A1a();
        BrazilPaymentActivity brazilPaymentActivity = r0.A05;
        brazilPaymentActivity.A0O.A03(brazilPaymentActivity.A00, "error_code", (long) r13.A00);
        int i2 = r13.A00;
        switch (i2) {
            case 454:
                AnonymousClass36K r02 = r13.A05;
                if (!(r02 == null || (A002 = C154407d7.A00(r02)) == null)) {
                    brazilPaymentActivity.A0C.A04(C192779Ln.A00(brazilPaymentActivity.A06, A002));
                }
                BrazilPaymentActivity.A0C(pinBottomSheetDialogFragment, brazilPaymentActivity);
                return;
            case 1440:
                pinBottomSheetDialogFragment.A1c(r13.A01, R.plurals.f9nameremoved);
                return;
            case 1441:
                C1899693i.A0u(pinBottomSheetDialogFragment, r13.A02);
                return;
            case 2826048:
                C204379pG r52 = new C204379pG(pinBottomSheetDialogFragment, 8, this);
                C204629pf r4 = new C204629pf(pinBottomSheetDialogFragment, 5);
                String string = brazilPaymentActivity.getString(R.string.f11nameremoved);
                String string2 = brazilPaymentActivity.getString(R.string.f11nameremoved);
                C19340zH A003 = AnonymousClass5V0.A00(brazilPaymentActivity);
                A003.A0Y(r52, R.string.f11nameremoved);
                A003.A0L(r4);
                if (string2 == null) {
                    A003.A0Q(string);
                } else {
                    A003.setTitle(string);
                    A003.A0Q(string2);
                }
                C18280x3.A0q(A003);
                String string3 = brazilPaymentActivity.A02.getString(R.string.f11nameremoved);
                C203499no r42 = brazilPaymentActivity.A0L;
                AnonymousClass303 A0K = C1899593h.A0K();
                A0K.A03("product_flow", "p2m");
                A0K.A03("dialog_text", string3);
                AnonymousClass9Wg.A02(A0K, r42, (Integer) null, "payment_disabled_alert", (String) null, 0);
                return;
            case 2896003:
            case 2896004:
                AnonymousClass9Wg.A03(AnonymousClass9Wg.A00(brazilPaymentActivity.A06, (AnonymousClass39Q) null, brazilPaymentActivity.A0U, (String) null, false), brazilPaymentActivity.A0L, "incentive_unavailable", "payment_confirm_prompt");
                r5 = brazilPaymentActivity.A0A;
                i = r13.A00;
                str = null;
                r8 = new C204619pe(pinBottomSheetDialogFragment, 3, this);
                r7 = null;
                r9 = null;
                break;
            default:
                if (i2 == 444 || i2 == 478) {
                    brazilPaymentActivity.A0J.A01.A02("FB", "PIN");
                }
                r5 = brazilPaymentActivity.A0A;
                i = r13.A00;
                str = brazilPaymentActivity.A05.A0H(brazilPaymentActivity.A07.A01(brazilPaymentActivity.A0G));
                r7 = new C204619pe(pinBottomSheetDialogFragment, 4, this);
                r8 = new C204629pf(pinBottomSheetDialogFragment, 6);
                r9 = new C204629pf(pinBottomSheetDialogFragment, 7);
                break;
        }
        r5.A00(brazilPaymentActivity, r7, r8, r9, str, i).show();
    }

    public void BaQ(String str, Integer num) {
        C197239cn r2 = this.A00;
        r2.A04.A1a();
        BrazilPaymentActivity brazilPaymentActivity = r2.A05;
        brazilPaymentActivity.A0O.A07(num, "pay-precheck");
        String str2 = r2.A06;
        AnonymousClass39Q r5 = r2.A01;
        C166587yw r6 = r2.A02;
        String str3 = r2.A07;
        int i = 1;
        if (brazilPaymentActivity.A7H(r5, brazilPaymentActivity.A01) == null) {
            i = 0;
        }
        brazilPaymentActivity.A7K(r2.A00, r5, r6, r2.A03, str2, str, str3, i);
    }
}
