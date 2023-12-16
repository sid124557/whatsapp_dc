package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment;
import com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentIncentiveViewFragment;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9dS  reason: invalid class name */
public class AnonymousClass9dS implements C203769oH {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public AnonymousClass9dS(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public void BM9() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A7M(57, "available_payment_methods_prompt");
        if (TextUtils.isEmpty(indiaUpiSendPaymentActivity.A0Z) || !indiaUpiSendPaymentActivity.A0O.A02.A0X(4638) || !AnonymousClass97T.A12(indiaUpiSendPaymentActivity)) {
            indiaUpiSendPaymentActivity.A7x(indiaUpiSendPaymentActivity, (String) null, false);
            return;
        }
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = new IndiaUpiAccountTypeSelectionFragment(new C192729Li(this, 2, paymentBottomSheet));
        indiaUpiSendPaymentActivity.Bon(paymentBottomSheet, "IndiaUpiAccountTypeSelectionFragment");
    }

    public void BMO(String str) {
        C196369aj r3;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        AnonymousClass9G8 r2 = indiaUpiSendPaymentActivity.A0D;
        boolean z = !str.isEmpty();
        r2.A00.setEnabled(z);
        r2.A00.setClickable(z);
        if (indiaUpiSendPaymentActivity.A0U != null && (r3 = indiaUpiSendPaymentActivity.A0C) != null) {
            r3.Axq(new AnonymousClass7HR(2, new C194469Sz(C86614Ku.A0s(indiaUpiSendPaymentActivity, indiaUpiSendPaymentActivity.A8G(str), new Object[1], R.string.f11nameremoved))));
        }
    }

    public void BSF(String str) {
        String str2;
        String str3;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0S.BKB(C18290x4.A0Z(), 51, "max_amount_shake", indiaUpiSendPaymentActivity.A0f);
        if (indiaUpiSendPaymentActivity.A0D.A0X(1933)) {
            if (indiaUpiSendPaymentActivity.A0E.A00.A00.compareTo(new BigDecimal(indiaUpiSendPaymentActivity.A06.A03(C66663Mh.A1k))) == 0) {
                str2 = "-10022";
                str3 = "MAX_AMOUNT_2K_INLINE";
            } else {
                str2 = "-10020";
                str3 = "MAX_AMOUNT_100K";
            }
            indiaUpiSendPaymentActivity.A8L(str2, str3);
        }
    }

    public void BU6() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        AnonymousClass9VG r0 = indiaUpiSendPaymentActivity.A0U;
        if (r0 != null && r0.A01 != null) {
            indiaUpiSendPaymentActivity.overridePendingTransition(0, 0);
            AnonymousClass9VG r3 = indiaUpiSendPaymentActivity.A0U;
            C197109ca r2 = indiaUpiSendPaymentActivity.A0S;
            Bundle A08 = AnonymousClass002.A08();
            PaymentIncentiveViewFragment paymentIncentiveViewFragment = new PaymentIncentiveViewFragment(r2, r3);
            paymentIncentiveViewFragment.A0u(A08);
            Objects.requireNonNull(paymentIncentiveViewFragment);
            paymentIncentiveViewFragment.A04 = new AnonymousClass9NL(paymentIncentiveViewFragment);
            indiaUpiSendPaymentActivity.Boo(paymentIncentiveViewFragment);
        }
    }

    public void BXm() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        if (C627336j.A0K(indiaUpiSendPaymentActivity.A0E) && indiaUpiSendPaymentActivity.A00 == 0) {
            indiaUpiSendPaymentActivity.A78((Bundle) null);
        } else if (!indiaUpiSendPaymentActivity.A8C()) {
        } else {
            if (!indiaUpiSendPaymentActivity.A7T()) {
                indiaUpiSendPaymentActivity.startActivity(AnonymousClass0x9.A08(indiaUpiSendPaymentActivity, IndiaUpiInteropSendToUpiActivity.class));
            } else {
                C621433s.A01(indiaUpiSendPaymentActivity, 34);
            }
        }
    }

    public void BXn() {
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        PaymentMethodsListPickerFragment A002 = PaymentMethodsListPickerFragment.A00(indiaUpiSendPaymentActivity.A0i);
        A002.A07 = new C197439dA(indiaUpiSendPaymentActivity, A002);
        A002.A04 = new C197369d0(indiaUpiSendPaymentActivity);
        paymentBottomSheet.A02 = A002;
        indiaUpiSendPaymentActivity.Bon(paymentBottomSheet, String.valueOf(18));
    }

    public void BXt() {
        this.A00.A7M(64, "enter_user_payment_id");
    }

    public void Ba5(AnonymousClass39Q r14, String str) {
        String str2;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0V.BKh("request_payment", indiaUpiSendPaymentActivity.A00);
        if (indiaUpiSendPaymentActivity.A0B == null || indiaUpiSendPaymentActivity.A0M.A0Q()) {
            BM9();
            return;
        }
        indiaUpiSendPaymentActivity.A09 = r14;
        if (indiaUpiSendPaymentActivity.A7T()) {
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            ConfirmPaymentFragment A002 = ConfirmPaymentFragment.A00(indiaUpiSendPaymentActivity.A0B, (UserJid) null, (AnonymousClass9XZ) null, indiaUpiSendPaymentActivity.A0p, indiaUpiSendPaymentActivity.A0Z, indiaUpiSendPaymentActivity.A0n ^ true ? 1 : 0);
            A002.A0N = new C197269cq(indiaUpiSendPaymentActivity.A07.A01("INR"), indiaUpiSendPaymentActivity, paymentBottomSheet);
            A002.A0O = new C197309cu(indiaUpiSendPaymentActivity);
            paymentBottomSheet.A02 = A002;
            indiaUpiSendPaymentActivity.Boo(paymentBottomSheet);
            return;
        }
        C160757oG r6 = indiaUpiSendPaymentActivity.A0f;
        AnonymousClass7I3[] r4 = new AnonymousClass7I3[1];
        UserJid userJid = indiaUpiSendPaymentActivity.A0G;
        if (userJid != null) {
            str2 = userJid.toString();
        } else {
            str2 = "";
        }
        r4[0] = new AnonymousClass7I3("receiver_jid", str2);
        C624134x r10 = null;
        r6.A09((String) null, "requesting payment ", r4);
        PaymentView A74 = indiaUpiSendPaymentActivity.A74();
        if (A74 == null || A74.getStickerIfSelected() == null) {
            indiaUpiSendPaymentActivity.A04.BkM(new C199449gb(this));
            indiaUpiSendPaymentActivity.BjL();
            indiaUpiSendPaymentActivity.A7H();
            indiaUpiSendPaymentActivity.A76(1);
            return;
        }
        indiaUpiSendPaymentActivity.Bp9(R.string.f11nameremoved);
        AnonymousClass9VS r62 = indiaUpiSendPaymentActivity.A0S;
        PaymentView paymentView = indiaUpiSendPaymentActivity.A0N;
        C626936e.A04(paymentView);
        AnonymousClass39M stickerIfSelected = paymentView.getStickerIfSelected();
        C626936e.A06(stickerIfSelected);
        C95814uZ r8 = indiaUpiSendPaymentActivity.A0E;
        C626936e.A06(r8);
        UserJid userJid2 = indiaUpiSendPaymentActivity.A0G;
        long j = indiaUpiSendPaymentActivity.A02;
        if (j != 0) {
            r10 = indiaUpiSendPaymentActivity.A0e.A02.A01(j);
        }
        PaymentView paymentView2 = indiaUpiSendPaymentActivity.A0N;
        r62.A01(paymentView2.getPaymentBackground(), r8, userJid2, r10, stickerIfSelected, paymentView2.getStickerSendOrigin()).A04(new C205009qH(r14, 7, this), indiaUpiSendPaymentActivity.A05.A08);
    }

    public void BbG(AnonymousClass39Q r11) {
        AnonymousClass39Q r4;
        AnonymousClass303 r2;
        BigDecimal bigDecimal;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        if (indiaUpiSendPaymentActivity.A0U != null) {
            BigDecimal bigDecimal2 = r11.A00;
            r4 = AnonymousClass39Q.A00(indiaUpiSendPaymentActivity.A8G(bigDecimal2.toEngineeringString()), 2);
            Objects.requireNonNull(r4);
            C166207yJ r5 = indiaUpiSendPaymentActivity.A0U;
            String A0y = AnonymousClass0x9.A0y(bigDecimal2.toEngineeringString(), "fxBaseAmt", AnonymousClass0x9.A1H(r5.A00));
            C162457s7.A0D(A0y);
            r5.A00 = A0y;
        } else {
            r4 = r11;
        }
        indiaUpiSendPaymentActivity.A0V.BKh("send_payment", indiaUpiSendPaymentActivity.A00);
        boolean z = false;
        if (indiaUpiSendPaymentActivity.A0X) {
            r2 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
            r2.A02("is_alias_resolved", 1);
            if (!TextUtils.isEmpty(indiaUpiSendPaymentActivity.A0Q)) {
                r2.A03("receiver_platform", indiaUpiSendPaymentActivity.A0Q);
            }
        } else {
            r2 = null;
        }
        indiaUpiSendPaymentActivity.A87(r2, "new_payment", 5);
        if (indiaUpiSendPaymentActivity.A0B == null || indiaUpiSendPaymentActivity.A0M.A0Q()) {
            BM9();
            return;
        }
        if (indiaUpiSendPaymentActivity.A0L) {
            if (indiaUpiSendPaymentActivity.A00 != 5) {
                indiaUpiSendPaymentActivity.A0K = true;
                indiaUpiSendPaymentActivity.A8H();
                return;
            } else if (indiaUpiSendPaymentActivity.A0U != null) {
                AnonymousClass1VX r1 = indiaUpiSendPaymentActivity.A0D;
                C162457s7.A0J(r1, 0);
                int A0N = r1.A0N(3327);
                if (A0N == 0) {
                    A0N = SearchActionVerificationClientService.NOTIFICATION_ID;
                }
                if (new BigDecimal(indiaUpiSendPaymentActivity.A8G(indiaUpiSendPaymentActivity.A0U.A08)).compareTo(new BigDecimal(Integer.toString(A0N))) > 0) {
                    C621433s.A01(indiaUpiSendPaymentActivity, 39);
                }
            } else {
                String A0d = AnonymousClass97T.A0d(indiaUpiSendPaymentActivity);
                if (!C107575bX.A0F(A0d) && r4.A00.compareTo(new BigDecimal(A0d)) > 0) {
                    int i = 41;
                    if (indiaUpiSendPaymentActivity.A0n) {
                        i = 40;
                    }
                    C621433s.A01(indiaUpiSendPaymentActivity, i);
                    return;
                } else if (!indiaUpiSendPaymentActivity.A0n && (bigDecimal = indiaUpiSendPaymentActivity.A0I) != null && r4.A00.compareTo(bigDecimal) > 0) {
                    C621433s.A01(indiaUpiSendPaymentActivity, 39);
                    return;
                }
            }
        }
        C166587yw r12 = indiaUpiSendPaymentActivity.A0B;
        AnonymousClass99H r0 = (AnonymousClass99H) r12.A08;
        if (r0 == null || AnonymousClass99H.A00(r0)) {
            if (indiaUpiSendPaymentActivity.A0P.A03().getBoolean("payments_upi_pin_primer_dialog_shown", false)) {
                C18270x1.A0l(C620933l.A00(indiaUpiSendPaymentActivity.A0P), "payments_upi_pin_primer_dialog_shown", false);
            } else {
                int A0N2 = indiaUpiSendPaymentActivity.A0D.A0N(1124);
                String[] split = indiaUpiSendPaymentActivity.A0P.A07().split(";");
                int length = split.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (split[i2].equalsIgnoreCase(indiaUpiSendPaymentActivity.A0B.A0A)) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!(!indiaUpiSendPaymentActivity.A0G.A01().isEmpty()) && z && A0N2 > 0 && indiaUpiSendPaymentActivity.A0P.A03().getInt("payments_two_factor_nudge_count", 0) < A0N2) {
                    C620933l r13 = indiaUpiSendPaymentActivity.A0P;
                    if (r13.A01.A0H() - AnonymousClass0x2.A0B(r13.A03(), "payments_last_two_factor_nudge_time") > TimeUnit.HOURS.toMillis(24)) {
                        IndiaUpiPaymentTwoFactorNudgeFragment indiaUpiPaymentTwoFactorNudgeFragment = new IndiaUpiPaymentTwoFactorNudgeFragment();
                        indiaUpiPaymentTwoFactorNudgeFragment.A02 = indiaUpiSendPaymentActivity;
                        indiaUpiSendPaymentActivity.Boo(indiaUpiPaymentTwoFactorNudgeFragment);
                        return;
                    }
                }
            }
            if (indiaUpiSendPaymentActivity.A8O()) {
                indiaUpiSendPaymentActivity.A09 = r4;
                indiaUpiSendPaymentActivity.A06 = r11;
                indiaUpiSendPaymentActivity.Bp9(R.string.f11nameremoved);
                indiaUpiSendPaymentActivity.A04.BkM(new C200429iJ(r4, indiaUpiSendPaymentActivity));
                return;
            }
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            paymentBottomSheet.A02 = indiaUpiSendPaymentActivity.A7n(r4, r11, paymentBottomSheet);
            indiaUpiSendPaymentActivity.Boo(paymentBottomSheet);
            return;
        }
        IndiaUpiPinPrimerDialogFragment A0R = C1899693i.A0R(r12, indiaUpiSendPaymentActivity);
        PaymentBottomSheet paymentBottomSheet2 = new PaymentBottomSheet();
        paymentBottomSheet2.A02 = A0R;
        indiaUpiSendPaymentActivity.Bon(paymentBottomSheet2, "IndiaUpiPinPrimerDialogFragment");
        C18270x1.A0l(C620933l.A00(indiaUpiSendPaymentActivity.A0P), "payments_upi_pin_primer_dialog_shown", true);
    }

    public void BbH() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A7D(indiaUpiSendPaymentActivity.A0S, indiaUpiSendPaymentActivity.A0U);
    }

    public void BbJ() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = indiaUpiSendPaymentActivity.A06.A0M(indiaUpiSendPaymentActivity.A08);
        indiaUpiSendPaymentActivity.Box(A0L, 0, R.string.f11nameremoved);
    }

    public void Bdw(boolean z) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        AnonymousClass9VG r2 = indiaUpiSendPaymentActivity.A0U;
        C197109ca r1 = indiaUpiSendPaymentActivity.A0S;
        if (z) {
            AnonymousClass9DC.A16(indiaUpiSendPaymentActivity, r1, r2, 49);
        } else {
            AnonymousClass9DC.A16(indiaUpiSendPaymentActivity, r1, r2, 48);
        }
        indiaUpiSendPaymentActivity.A7u();
    }

    public void Bok(DialogFragment dialogFragment) {
        this.A00.Boo(dialogFragment);
    }

    public void BTg(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && !z) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
            indiaUpiSendPaymentActivity.A7C(indiaUpiSendPaymentActivity.A0S, indiaUpiSendPaymentActivity.A0U);
        }
    }
}
