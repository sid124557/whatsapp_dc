package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.CheckFirstTransaction;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiAccountTypeSelectionFragment;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiInterOpHybridActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentMethodSelectionActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.IndiaUpiPinSetUpCompletedActivity;
import com.whatsapp.payments.ui.IndiaUpiQuickBuyActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.payments.ui.widget.PaymentDescriptionRow;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Bs  reason: invalid class name */
public abstract class AnonymousClass9Bs extends AnonymousClass9Cz implements C203049n2, C203349nY, C203149nC, C202129lQ, C202149lS {
    public int A00;
    public AnonymousClass5UX A01;
    public C105365Uq A02;
    public C114015mM A03;
    public AnonymousClass5ZR A04;
    public C85204Fi A05;
    public AnonymousClass39Q A06;
    public C617332a A07;
    public AnonymousClass3QO A08;
    public CheckFirstTransaction A09;
    public C29251iW A0A;
    public AnonymousClass9WM A0B;
    public C197769dq A0C;
    public AnonymousClass9AN A0D;
    public AnonymousClass9AI A0E;
    public C193559Pc A0F;
    public AnonymousClass9VC A0G;
    public C158757kV A0H;
    public AnonymousClass9RI A0I;
    public AnonymousClass9GM A0J;
    public C158777kX A0K;
    public AnonymousClass9SZ A0L;
    public PaymentDescriptionRow A0M;
    public PaymentView A0N;
    public AnonymousClass9V1 A0O;
    public AnonymousClass9VY A0P;
    public String A0Q;
    public String A0R = "";
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W = null;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final C43942Ub A0e = new C203879oS(this, 3);
    public final C160757oG A0f = C160757oG.A00("IndiaUpiPaymentActivity", "payment", "IN");
    public final String[] A0g = {"payments_camera", "payments_camera_gallery"};

    public void A78(Bundle bundle) {
        this.A0I = null;
        this.A0h = null;
        super.A78(bundle);
    }

    public C59942xk A7m(AnonymousClass39Q r5, int i) {
        C194869Uu r2;
        if (i == 0 && (r2 = this.A0T.A00().A01) != null) {
            if (r5.A00.compareTo(r2.A09.A00.A02.A00) >= 0) {
                return r2.A08;
            }
        }
        return null;
    }

    public void A83(AnonymousClass99D r8, AnonymousClass99D r9, AnonymousClass34V r10, String str, String str2, boolean z) {
        String str3;
        boolean z2;
        int i;
        boolean z3 = true;
        boolean A1W = AnonymousClass000.A1W(r8);
        boolean A1W2 = AnonymousClass000.A1W(r9);
        C134246ig A032 = this.A0S.A03(r10, 21);
        if (r10 == null) {
            if (A1W) {
                i = 3;
            } else if (A1W2) {
                i = 4;
            }
            A032.A0D = Integer.valueOf(i);
        }
        C133796hx r0 = this.A0B.A08;
        if (r0 != null) {
            str3 = ((AnonymousClass99H) r0).A0C;
        } else {
            str3 = "";
        }
        A032.A0O = str3;
        C160757oG r2 = this.A0f;
        C1899593h.A1H(r2, A032, "PaymentWamEvent checkpin event:", AnonymousClass001.A0o());
        A032.A0b = "precheck";
        AnonymousClass97T.A0t(A032, this);
        if (r10 == null && r8 == null && r9 == null && str != null) {
            r2.A06("onPrecheck success, sending payment");
            this.A0o = str;
            this.A0W = str2;
            if (A8D()) {
                this.A0a = true;
                if (this.A0Y) {
                    Intent A7k = A7k();
                    finish();
                    startActivity(A7k);
                    return;
                }
                return;
            }
            this.A09.A00.A03(new C204979qE(0, this, z));
            return;
        }
        BjL();
        this.A0b = false;
        if (r10 == null) {
            if (r9 != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("onPrecheck received receiver vpa update: jid: ");
                A0o.append(r9.A05);
                A0o.append("vpa: ");
                A0o.append(r9.A02);
                A0o.append("vpaId: ");
                C1899593h.A1J(r2, r9.A03, A0o);
                this.A0G = r9.A05;
                this.A0I = r9.A02;
                this.A0h = r9.A03;
                z2 = !A8F(r9);
            } else {
                z2 = false;
            }
            if (r8 != null) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("onPrecheck received sender vpa update: jid");
                A0o2.append(r8.A05);
                A0o2.append("vpa: ");
                A0o2.append(r8.A02);
                A0o2.append("vpaId: ");
                C1899593h.A1J(r2, r8.A03, A0o2);
            } else if (z2) {
                z3 = false;
            } else {
                return;
            }
            BjL();
            C19340zH A002 = AnonymousClass5V0.A00(this);
            int i2 = R.string.f11nameremoved;
            if (z3) {
                i2 = R.string.f11nameremoved;
            }
            A002.A0T(i2);
            C204219p0.A01(A002, this, 32, R.string.f11nameremoved);
            C204219p0.A00(A002, this, 33, R.string.f11nameremoved);
            A002.A0S();
            return;
        }
        int i3 = r10.A00;
        if (i3 == 2896004 || i3 == 2896003) {
            AnonymousClass9Wg.A03(AnonymousClass9Wg.A00(this.A06, (AnonymousClass39Q) null, this.A0U, (String) null, false), this.A0S, "incentive_unavailable", "payment_confirm_prompt");
            this.A01 = 7;
            A7E((String) null);
            this.A0H = false;
            this.A0B.A05(this, (DialogInterface.OnDismissListener) null, new C204629pf(this, 16), (DialogInterface.OnDismissListener) null, (String) null, r10.A00).show();
            return;
        }
        AnonymousClass9VC r4 = this.A0G;
        AnonymousClass9S4 r22 = new AnonymousClass9S4("pay-precheck");
        UserJid userJid = this.A0E;
        r22.A05 = true;
        r22.A01 = userJid;
        r22.A06 = true;
        r22.A02 = (String) C1899593h.A0X(this.A0G);
        r4.A01(this, r10, r22.A00(), "pay-precheck");
    }

    private void A13() {
        if (!this.A04.A0F()) {
            this.A0V.BKh("request_phone_number_permission", this.A00);
            RequestPermissionActivity.A0a(this);
            return;
        }
        int A012 = this.A0P.A01();
        if (A012 == 1) {
            A6W(new C204339pC(this, 1), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
        } else if (A012 != 2) {
            AnonymousClass99H r0 = (AnonymousClass99H) this.A0B.A08;
            if (r0 == null || !"OD_UNSECURED".equals(r0.A0B) || this.A0n) {
                this.A05.A01("pay-entry-ui");
                Bp9(R.string.f11nameremoved);
                this.A0H = true;
                if (A8D()) {
                    A7v();
                    A89(A7m(this.A09, this.A01), false);
                    this.A0b = true;
                }
                AnonymousClass97T.A10(this);
                return;
            }
            Bot(R.string.f11nameremoved);
        } else {
            C19340zH A002 = AnonymousClass5V0.A00(this);
            A002.A0U(R.string.f11nameremoved);
            A002.A0T(R.string.f11nameremoved);
            C204219p0.A01(A002, this, 30, R.string.f11nameremoved);
            C204219p0.A00(A002, this, 31, R.string.f11nameremoved);
            A002.A0i(false);
            A002.A0S();
        }
    }

    public static void A14(C166587yw r3, AnonymousClass9Bs r4) {
        String str;
        C166587yw r1 = r4.A0B;
        if (r1 != r3) {
            if (AnonymousClass9W6.A00(r1, r4.A0p)) {
                str = "add_credential_prompt";
            } else {
                str = "available_payment_methods_prompt";
            }
            r4.A7M(63, str);
        }
        r4.A0B = r3;
        PaymentView paymentView = r4.A0N;
        if (paymentView != null) {
            paymentView.setBankLogo(r3.A09());
            r4.A0N.setPaymentMethodText(r4.A0K.A02(r4.A0B, true));
        }
    }

    public final Dialog A7j(Bundle bundle) {
        this.A0S.A0A(0, 51, "payment_confirm_prompt", this.A0f, this.A0i, this.A0h, AnonymousClass9DC.A17(this));
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0U(R.string.f11nameremoved);
        C204219p0.A01(A002, this, 47, R.string.f11nameremoved);
        A002.A0i(false);
        if (bundle != null) {
            A002.A0Q(this.A0A.A01(bundle, getString(R.string.f11nameremoved)));
        }
        return A002.create();
    }

    public final Intent A7k() {
        Intent A082 = AnonymousClass0x9.A08(this, IndiaUpiPaymentSettingsActivity.class);
        this.A0O.A0K = C1899693i.A0b(this);
        AnonymousClass99L r1 = this.A0O;
        r1.A0U = this.A0W;
        A082.putExtra("extra_country_transaction_data", r1);
        A082.putExtra("extra_transaction_send_amount", this.A09);
        A082.putExtra("extra_payment_method", this.A0B);
        A082.putExtra("extra_open_transaction_confirmation_fragment", true);
        A082.putExtra("extra_encrypted_interop_description", this.A0S);
        A082.putExtra("referral_screen", this.A0f);
        A082.putExtra("extra_receiver_vpa", this.A0I);
        A082.putExtra("extra_payment_upi_number", this.A0H);
        A7O(A082);
        return A082;
    }

    public final AnonymousClass303 A7l(AnonymousClass39Q r4, AnonymousClass9VG r5) {
        if (C161527pr.A02(this.A0F) || !this.A0W.A0t(this.A0G)) {
            return AnonymousClass9Wg.A00(this.A06, r4, r5, (String) null, true);
        }
        return C190889Af.A00();
    }

    public ConfirmPaymentFragment A7n(AnonymousClass39Q r22, AnonymousClass39Q r23, PaymentBottomSheet paymentBottomSheet) {
        AnonymousClass39M r15;
        AnonymousClass39R r11;
        C624134x r14;
        Integer num;
        AnonymousClass3XA A012;
        PaymentIncentiveViewModel paymentIncentiveViewModel;
        PaymentView paymentView = this.A0N;
        if (paymentView != null) {
            r15 = paymentView.getStickerIfSelected();
        } else {
            r15 = null;
        }
        if (paymentView != null) {
            r11 = paymentView.getPaymentBackground();
        } else {
            r11 = null;
        }
        if (r15 == null && r11 == null) {
            A012 = null;
        } else {
            AnonymousClass9VS r10 = this.A0S;
            C95814uZ r12 = this.A0E;
            C626936e.A06(r12);
            UserJid userJid = this.A0G;
            long j = this.A02;
            if (j != 0) {
                r14 = this.A0e.A02.A01(j);
            } else {
                r14 = null;
            }
            PaymentView paymentView2 = this.A0N;
            if (paymentView2 != null) {
                num = paymentView2.getStickerSendOrigin();
            } else {
                num = null;
            }
            A012 = r10.A01(r11, r12, userJid, r14, r15, num);
        }
        this.A08 = null;
        this.A0U = null;
        C85204Fi A013 = this.A07.A01("INR");
        AnonymousClass9VG r7 = null;
        ConfirmPaymentFragment A002 = ConfirmPaymentFragment.A00(this.A0B, (UserJid) null, (AnonymousClass9XZ) null, this.A0p, this.A0Z, !this.A0n ? 1 : 0);
        AnonymousClass39Q r6 = r23;
        if (!(r23 != null || (paymentIncentiveViewModel = this.A0Y) == null || paymentIncentiveViewModel.A02.A07() == null)) {
            r7 = (AnonymousClass9VG) ((AnonymousClass9WE) this.A0Y.A02.A07()).A01;
        }
        AnonymousClass39Q r5 = r22;
        A002.A0N = new C197289cs(A013, r5, r6, r7, A002, this, paymentBottomSheet);
        A002.A0O = new C197329cw(A012, r5, r7, A002, this);
        return A002;
    }

    public C30481mW A7o() {
        String str;
        List list;
        if (this instanceof IndiaUpiSendPaymentActivity) {
            PaymentView paymentView = this.A0N;
            if (paymentView != null) {
                str = paymentView.getPaymentNote();
            } else {
                str = "";
            }
            PaymentView paymentView2 = this.A0N;
            if (paymentView2 != null) {
                list = paymentView2.getMentionedJids();
            } else {
                list = null;
            }
            return A75(str, list);
        }
        AnonymousClass9Cu r3 = (AnonymousClass9Cu) this;
        if (!(r3 instanceof IndiaUpiCheckOrderDetailsActivity)) {
            return null;
        }
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) r3;
        C66543Lv r2 = indiaUpiCheckOrderDetailsActivity.A08;
        return indiaUpiCheckOrderDetailsActivity.A0b.A00(indiaUpiCheckOrderDetailsActivity.A0E, r2.A2D.A05(indiaUpiCheckOrderDetailsActivity.A07.A09), new AnonymousClass3YM(), "", (List) null, 0);
    }

    public final String A7p() {
        C166557yt r0;
        if (!C161527pr.A02(this.A0G)) {
            r0 = this.A0G;
        } else if (this.A08 != null && !A7T()) {
            return this.A06.A0M(this.A08);
        } else {
            r0 = this.A0I;
        }
        return (String) C1899593h.A0X(r0);
    }

    public final String A7q() {
        if (!TextUtils.isEmpty(this.A0X)) {
            C160757oG r2 = this.A0f;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("getSeqNum/incomingPayRequestId");
            C1899593h.A1J(r2, this.A0X, A0o);
            return this.A0X;
        } else if (!TextUtils.isEmpty(this.A0o)) {
            C160757oG r22 = this.A0f;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("getSeqNum/transactionId");
            C1899593h.A1J(r22, this.A0o, A0o2);
            return this.A0o;
        } else {
            String A0c2 = AnonymousClass97T.A0c(this);
            C160757oG r23 = this.A0f;
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("getSeqNum/seqNum generated:");
            C1899593h.A1J(r23, C195009Vm.A00(A0c2), A0o3);
            return A0c2;
        }
    }

    public void A7r() {
        int size = this.A0i.size();
        List list = this.A0i;
        if (size == 1) {
            AnonymousClass99H r0 = (AnonymousClass99H) C1899693i.A0D(list, 0).A08;
            if (r0 == null || AnonymousClass99H.A00(r0)) {
                C52622lm r4 = new C52622lm("upi_p2p_check_balance", (String) null, (Map) null);
                HashMap A0t = AnonymousClass001.A0t();
                A0t.put("credential_id", C1899693i.A0D(this.A0i, 0).A0A);
                this.A05.A0G(0, R.string.f11nameremoved);
                ((AnonymousClass2YZ) this.A0j.get()).A00(new C205149qV(this, 5), new AnonymousClass9UK(this, 1), r4, "available_payment_methods_prompt", A0t);
            } else {
                C621433s.A01(this, 29);
                return;
            }
        } else {
            Intent A082 = AnonymousClass0x9.A08(this, IndiaUpiPaymentMethodSelectionActivity.class);
            A082.putExtra("bank_accounts", (Serializable) list);
            startActivityForResult(A082, 1015);
        }
        A7M(62, "available_payment_methods_prompt");
    }

    public void A7s() {
        if (this instanceof IndiaUpiSendPaymentActivity) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this;
            if (indiaUpiSendPaymentActivity.A8O()) {
                AnonymousClass39Q r2 = indiaUpiSendPaymentActivity.A09;
                indiaUpiSendPaymentActivity.Bp9(R.string.f11nameremoved);
                indiaUpiSendPaymentActivity.A04.BkM(new C200429iJ(r2, indiaUpiSendPaymentActivity));
                return;
            }
            indiaUpiSendPaymentActivity.A0N.BXn();
        } else if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this;
            if (indiaUpiCheckOrderDetailsActivity.A0D.A0X(1916) && !AnonymousClass9DC.A17(indiaUpiCheckOrderDetailsActivity)) {
                C166557yt r1 = indiaUpiCheckOrderDetailsActivity.A0I;
                if (!C161527pr.A03(r1)) {
                    indiaUpiCheckOrderDetailsActivity.A8Z(indiaUpiCheckOrderDetailsActivity.A09, (String) r1.A00);
                }
            }
        }
    }

    public void A7t() {
        C197109ca r4;
        int i;
        int i2;
        String str;
        AnonymousClass303 A002 = AnonymousClass9Wg.A00(this.A06, (AnonymousClass39Q) null, this.A0U, (String) null, true);
        if (this.A0X) {
            if (A002 == null) {
                A002 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
            }
            A002.A02("is_alias_resolved", 1);
            if (!TextUtils.isEmpty(this.A0Q)) {
                A002.A03("receiver_platform", this.A0Q);
            }
        }
        if (this.A0F != null) {
            if (TextUtils.isEmpty(this.A0f)) {
                this.A0f = "chat";
            }
            str = "new_payment";
            r4 = this.A0S;
            i = 1;
            i2 = 53;
        } else {
            r4 = this.A0S;
            i = 0;
            i2 = null;
            if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
                str = "order_details";
            } else {
                str = "new_payment";
            }
        }
        r4.BKE(A002, i, i2, str, this.A0f);
    }

    public void A7u() {
        UserJid A032;
        AnonymousClass3ZH A012;
        AnonymousClass3ZH r0;
        if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this;
            UserJid A033 = AnonymousClass32Y.A03(indiaUpiCheckOrderDetailsActivity.A07.A09.A00);
            indiaUpiCheckOrderDetailsActivity.A0E = A033;
            if (A033 == null || indiaUpiCheckOrderDetailsActivity.A7T()) {
                r0 = null;
            } else {
                r0 = indiaUpiCheckOrderDetailsActivity.A07.A01(indiaUpiCheckOrderDetailsActivity.A0E);
            }
            indiaUpiCheckOrderDetailsActivity.A08 = r0;
            return;
        }
        if (this.A0E == null) {
            this.A0E = C95814uZ.A00.A05(getIntent().getStringExtra("extra_jid"));
            this.A0G = AnonymousClass32Y.A08(getIntent().getStringExtra("extra_receiver_jid"));
        }
        C95814uZ r1 = this.A0E;
        if (C627336j.A0K(r1)) {
            A032 = this.A0G;
        } else {
            A032 = AnonymousClass32Y.A03(r1);
        }
        this.A0E = A032;
        if (A7T()) {
            A012 = null;
        } else {
            A012 = this.A07.A01(this.A0E);
        }
        this.A08 = A012;
        PaymentView paymentView = this.A0N;
        if (paymentView == null) {
            return;
        }
        if (A012 != null) {
            String BBy = BBy();
            boolean A8C = A8C();
            paymentView.A1H = BBy;
            paymentView.A0H.setText(BBy);
            paymentView.A06.setVisibility(AnonymousClass001.A08(A8C ? 1 : 0));
            paymentView.A0Z.A08(paymentView.A0X, A012);
            return;
        }
        Object[] A0L2 = AnonymousClass002.A0L();
        Object obj = this.A0I.A00;
        C626936e.A06(obj);
        String A0s = C86614Ku.A0s(this, obj, A0L2, R.string.f11nameremoved);
        PaymentView paymentView2 = this.A0N;
        String str = (String) C1899593h.A0X(this.A0G);
        boolean A8C2 = A8C();
        if (!TextUtils.isEmpty(str)) {
            paymentView2.A1H = str;
            paymentView2.A0I.setText(A0s);
        } else {
            paymentView2.A1H = A0s;
        }
        paymentView2.A0H.setText(paymentView2.A03(paymentView2.A1H, R.string.f11nameremoved));
        paymentView2.A06.setVisibility(AnonymousClass001.A08(A8C2 ? 1 : 0));
        paymentView2.A0Y.A06(paymentView2.A0X, R.drawable.avatar_contact);
    }

    public final void A7v() {
        C133796hx r1 = this.A0B.A08;
        C160757oG r2 = this.A0f;
        AnonymousClass99H A0I2 = C1899693i.A0I(r2, r1, "onListKeys: Cannot get IndiaUpiMethodData");
        this.A0O.A0S = A7q();
        AnonymousClass99L r12 = this.A0O;
        r12.A0J = this.A0F;
        r12.A0Q = C196629bS.A00(this.A0M);
        this.A0O.A0R = this.A0M.A0C();
        C166557yt r0 = this.A0I;
        if (r0 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("vpa is null, while fetching list-keys, vpaId: ");
            C1899593h.A1J(r2, this.A0h, A0o);
        } else {
            this.A0O.A0O = C166557yt.A00(r0);
        }
        AnonymousClass99L r22 = this.A0O;
        r22.A0M = this.A0Z;
        r22.A0N = this.A0c;
        r22.A0P = this.A0h;
        r22.A05 = this.A06.A0H();
        this.A0O.A0C = A0I2.A06;
    }

    public void A7w(Context context) {
        if (!this.A0O.A02.A0X(4638) || !AnonymousClass97T.A12(this)) {
            A7x(context, (String) null, false);
            return;
        }
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = new IndiaUpiAccountTypeSelectionFragment(new C197379d1(context, this, paymentBottomSheet));
        Bon(paymentBottomSheet, "IndiaUpiAccountTypeSelectionFragment");
    }

    public void A7x(Context context, String str, boolean z) {
        Intent A082 = AnonymousClass0x9.A08(context, IndiaUpiPaymentsAccountSetupActivity.class);
        A082.putExtra("extra_setup_mode", 1);
        if (context instanceof IndiaUpiCheckOrderDetailsActivity) {
            A082.putExtra("extra_payments_entry_type", 11);
            A082.putExtra("extra_order_type", this.A0i);
            A082.putExtra("extra_payment_config_id", this.A0h);
        } else if (context instanceof IndiaUpiInterOpHybridActivity) {
            A7O(A082);
            A082.putExtra("extra_is_interop_add_payment_method", true);
            A082.putExtra("extra_skip_value_props_display", z);
        } else {
            A082.putExtra("extra_payments_entry_type", 6);
        }
        A082.putExtra("extra_is_first_payment_method", !AnonymousClass97T.A12(this));
        A082.putExtra("extra_skip_value_props_display", z);
        C166557yt r1 = this.A0F;
        if (r1 != null) {
            A082.putExtra("extra_order_formatted_discount_amount", r1);
        }
        UserJid userJid = this.A0G;
        if (userJid != null) {
            AnonymousClass0x2.A0u(A082, userJid, "extra_receiver_jid");
        }
        A082.putExtra("referral_screen", this.A0f);
        if (this.A0N.A08(str)) {
            A082.putExtra("extra_payment_method_type", "CREDIT");
            A082.putExtra("extra_referral_screen", "add_credit_card");
        }
        AnonymousClass5VI.A00(A082, "payViewAddPayment");
        startActivityForResult(A082, 1008);
    }

    public /* synthetic */ void A7y(C08310eF r2) {
        if ((this instanceof IndiaUpiQuickBuyActivity) && (r2 instanceof PaymentBottomSheet)) {
            ((PaymentBottomSheet) r2).A01 = null;
        }
    }

    public /* synthetic */ void A7z(C08310eF r4) {
        if (this instanceof IndiaUpiQuickBuyActivity) {
            AnonymousClass9Ct r2 = (AnonymousClass9Ct) this;
            if (r4 instanceof PaymentBottomSheet) {
                PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) r4;
                if (!AnonymousClass9DC.A17(r2) || r2.A0A) {
                    r2.A8R(false);
                    paymentBottomSheet.A01 = new C204629pf(r2, 21);
                    return;
                }
                paymentBottomSheet.A01 = new C204629pf(r2, 20);
                paymentBottomSheet.A00 = new C204279p6(r2, 9);
            }
        }
    }

    public void A80(AnonymousClass39Q r16) {
        int i;
        this.A0V.BKh("confirm_payment", this.A00);
        AnonymousClass39Q r1 = r16;
        this.A09 = r1;
        AnonymousClass303 A7l = A7l(r1, this.A0U);
        if ("p2m".equals(this.A0p)) {
            A7l = this.A0S.A06(this.A0B, A7l);
            i = 4;
        } else {
            i = 47;
        }
        if (this.A0X) {
            if (A7l == null) {
                A7l = C1899593h.A0K();
            }
            A7l.A02("is_alias_resolved", 1);
            if (!TextUtils.isEmpty(this.A0Q)) {
                A7l.A03("receiver_platform", this.A0Q);
            }
        }
        this.A0S.BKF(A7l, 1, Integer.valueOf(i), "payment_confirm_prompt", this.A0f, this.A0i, this.A0h, false, "p2m".equals(this.A0p));
        AnonymousClass99H r6 = (AnonymousClass99H) this.A0B.A08;
        String[] split = this.A0P.A07().split(";");
        int length = split.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (split[i2].equalsIgnoreCase(this.A0B.A0A)) {
                this.A0Z = true;
                break;
            } else {
                i2++;
            }
        }
        if (r6 == null || !Boolean.TRUE.equals(r6.A05.A00) || this.A0Z) {
            A13();
            return;
        }
        C166587yw r2 = this.A0B;
        Bundle A082 = AnonymousClass002.A08();
        A082.putParcelable("extra_bank_account", r2);
        IndiaUpiForgotPinDialogFragment indiaUpiForgotPinDialogFragment = new IndiaUpiForgotPinDialogFragment();
        indiaUpiForgotPinDialogFragment.A0u(A082);
        indiaUpiForgotPinDialogFragment.A07 = this;
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = indiaUpiForgotPinDialogFragment;
        Bon(paymentBottomSheet, "IndiaUpiForgotPinDialogFragment");
        A7z(paymentBottomSheet);
    }

    public final void A82(C624034w r5, boolean z) {
        String str;
        Intent A082 = AnonymousClass0x9.A08(this, IndiaUpiPaymentTransactionDetailsActivity.class);
        C107395bF.A00(A082, C1899593h.A0R(r5));
        A082.putExtra("extra_transaction_id", r5.A0K);
        A082.putExtra("extra_transaction_ref", this.A0g);
        A082.putExtra("extra_mapper_alias_resolved", this.A0X);
        A082.putExtra("extra_receiver_platform", this.A0Q);
        if (this.A0c) {
            A082.setFlags(33554432);
            A082.putExtra("extra_return_after_completion", true);
            str = "external_app";
        } else {
            str = this.A0f;
        }
        A082.putExtra("referral_screen", str);
        A082.putExtra("extra_payment_flow_entry_point", this.A01);
        if (z) {
            A082.setFlags(67108864);
        }
        A082.putExtra("extra_action_bar_display_close", true);
        A6T(A082, true);
        BjL();
        A7H();
    }

    public void A85(AnonymousClass34V r7) {
        PaymentView paymentView;
        this.A0V.A03(this.A00, "network_op_error_code", (long) this.A05.A00);
        AnonymousClass9B3 r5 = this.A0V;
        int i = this.A00;
        r5.A03(i, "error_code", (long) r7.A00);
        r5.A04(i, 3);
        BjL();
        AnonymousClass9VW A042 = this.A02.A04(this.A05, 0);
        if (A042.A00 == R.string.f11nameremoved && (paymentView = this.A0N) != null && paymentView.A00 == 1) {
            A042.A00 = R.string.f11nameremoved;
        }
        A8A(A042, String.valueOf(r7.A00), new Object[0]);
    }

    public void A87(AnonymousClass303 r11, String str, int i) {
        AnonymousClass303 r1 = r11;
        String str2 = str;
        this.A0S.BKF(r1, AnonymousClass001.A0f(), Integer.valueOf(i), str2, this.A0f, this.A0i, this.A0h, false, AnonymousClass9DC.A17(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r4.A00(X.C56612sH.A00(r3.A06)) != 1) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r4 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A88(X.AnonymousClass9VG r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x002e
            boolean r0 = r3.A7T()
            if (r0 != 0) goto L_0x0018
            int r2 = r4.A00
        L_0x000a:
            r3.A01 = r2
            r3.A0U = r4
        L_0x000e:
            X.9Uu r0 = r4.A01
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.A0F
        L_0x0014:
            r3.A7E(r0)
            return
        L_0x0018:
            java.lang.String r0 = r3.A0X
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002e
            X.2sH r0 = r3.A06
            long r0 = X.C56612sH.A00(r0)
            int r1 = r4.A00(r0)
            r0 = 1
            r2 = 2
            if (r1 == r0) goto L_0x000a
        L_0x002e:
            r0 = 6
            r3.A01 = r0
            if (r4 == 0) goto L_0x0034
            goto L_0x000e
        L_0x0034:
            r0 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Bs.A88(X.9VG):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (android.text.TextUtils.isEmpty(r0.A0X) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A89(X.C59942xk r40, boolean r41) {
        /*
            r39 = this;
            r0 = r39
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity
            r16 = r40
            if (r1 == 0) goto L_0x008f
            boolean r1 = r0.A7T()
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = r0.A0X
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r31 = 1
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r31 = 0
        L_0x001a:
            java.lang.String r2 = r0.A0R
            X.9Pc r1 = r0.A0F
            java.lang.String r1 = X.C192649La.A00(r1, r2)
            r0.A0S = r1
            if (r41 != 0) goto L_0x004d
            if (r40 != 0) goto L_0x004d
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r4 = r0.A0Y
            if (r4 == 0) goto L_0x004d
            X.9Vi r1 = r4.A06
            X.9Uu r3 = r1.A02()
            X.9Ur r2 = r1.A03()
            X.9Tz r1 = r4.A04
            boolean r1 = r1.A02(r3, r2)
            if (r1 == 0) goto L_0x004d
            com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r3 = r0.A0Y
            com.whatsapp.jid.UserJid r2 = r0.A0E
            X.4FS r1 = r3.A07
            X.9ih r0 = new X.9ih
            r0.<init>(r2, r3)
            r1.BkM(r0)
            return
        L_0x004d:
            X.7yJ r1 = r0.A0U
            if (r1 == 0) goto L_0x008d
            java.lang.String r3 = r1.A00
        L_0x0053:
            X.9RI r10 = r0.A0I
            X.7yw r12 = r0.A0B
            com.whatsapp.jid.UserJid r13 = r0.A0E
            X.39Q r11 = r0.A09
            java.lang.String r6 = r0.A0p
            java.lang.String r5 = r0.A0q
            boolean r4 = r0.A0t
            boolean r2 = r0.A0v
            X.99L r15 = r0.A0O
            r19 = 0
            r27 = 0
            X.7yt r14 = r0.A0G
            java.lang.String r1 = r0.A0S
            X.9W6 r0 = r0.A0N
            boolean r32 = r0.A06(r12)
            r21 = r19
            r22 = r19
            r23 = r19
            r26 = r19
            r20 = r19
            r25 = r3
            r29 = r4
            r30 = r2
            r24 = r1
            r17 = r6
            r18 = r5
            r10.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32)
            return
        L_0x008d:
            r3 = 0
            goto L_0x0053
        L_0x008f:
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r0
            X.7yJ r1 = r0.A0U
            r10 = 0
            if (r1 == 0) goto L_0x0134
            java.lang.String r1 = r1.A00
            r18 = r1
        L_0x009a:
            X.99n r3 = r0.A0O
            java.lang.String r2 = r0.A08
            java.util.List r1 = r0.A09
            boolean r1 = r3.A0L(r2, r1)
            if (r1 == 0) goto L_0x00bf
            X.99L r1 = r0.A0O
            X.39U r1 = r1.A02
            X.C626936e.A06(r1)
            X.99L r6 = r0.A0O
            java.lang.String r5 = r0.A05
            X.C626936e.A06(r5)
            java.lang.String r4 = r1.A02
            long r2 = r1.A00
            X.39U r1 = new X.39U
            r1.<init>(r2, r5, r4)
            r6.A02 = r1
        L_0x00bf:
            X.9RI r1 = r0.A0I
            r17 = r1
            X.7yw r15 = r0.A0B
            com.whatsapp.jid.UserJid r14 = r0.A0E
            X.39Q r13 = r0.A09
            java.lang.String r12 = r0.A0p
            r24 = 0
            r35 = 1
            X.99L r9 = r0.A0O
            X.99n r3 = r0.A0O
            java.lang.String r2 = r0.A08
            java.util.List r1 = r0.A09
            boolean r1 = r3.A0L(r2, r1)
            if (r1 == 0) goto L_0x012f
            java.lang.String r8 = r0.A05
        L_0x00df:
            X.99n r3 = r0.A0O
            java.lang.String r2 = r0.A08
            java.util.List r1 = r0.A09
            boolean r1 = r3.A0L(r2, r1)
            if (r1 == 0) goto L_0x00ef
            X.9d8 r1 = r0.A07
            java.lang.String r10 = r1.A0D
        L_0x00ef:
            X.9d8 r3 = r0.A07
            java.lang.String r7 = r3.A0B
            long r1 = r3.A00
            java.lang.String r6 = r0.A0i
            java.lang.String r5 = r3.A0E
            java.util.List r4 = r0.A0C
            X.7yt r3 = r0.A0G
            r37 = 0
            X.9W6 r11 = r0.A0N
            X.7yw r0 = r0.A0B
            boolean r38 = r11.A06(r0)
            r22 = r16
            r23 = r12
            r25 = r8
            r26 = r10
            r27 = r7
            r28 = r6
            r29 = r5
            r30 = r24
            r31 = r18
            r32 = r4
            r33 = r1
            r36 = r35
            r19 = r14
            r20 = r3
            r21 = r9
            r16 = r17
            r17 = r13
            r18 = r15
            r16.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38)
            return
        L_0x012f:
            X.9d8 r1 = r0.A07
            java.lang.String r8 = r1.A0D
            goto L_0x00df
        L_0x0134:
            r18 = r10
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Bs.A89(X.2xk, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r1 == 1) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A8E(X.C166587yw r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = r3.A0p
            boolean r0 = X.AnonymousClass9W6.A00(r4, r0)
            if (r0 != 0) goto L_0x001a
            X.9W6 r2 = r3.A0N
            com.whatsapp.payments.ui.widget.PaymentView r0 = r3.A0N
            if (r0 == 0) goto L_0x001c
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x001c
        L_0x0013:
            boolean r1 = r2.A07(r4, r5, r0)
            r0 = 0
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            return r0
        L_0x001c:
            r0 = 0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Bs.A8E(X.7yw, java.lang.String):boolean");
    }

    public boolean A8F(AnonymousClass99D r14) {
        if (!r14.A04 || r14.A05) {
            return false;
        }
        BjL();
        if (!r14.A06) {
            C621433s.A01(this, 15);
            return true;
        } else if (!AnonymousClass97T.A12(this)) {
            Intent A082 = AnonymousClass0x9.A08(this, IndiaUpiPaymentsAccountSetupActivity.class);
            A082.putExtra("extra_setup_mode", 1);
            Jid jid = this.A0E;
            if (jid == null && (jid = r14.A05) == null) {
                Log.e("showNodalDisallowAlert, jid and contactData.jid is null");
            } else {
                AnonymousClass0x2.A0u(A082, jid, "extra_jid");
            }
            int i = 3;
            if ("payment_composer_icon".equals(this.A0f)) {
                i = 10;
            }
            A082.putExtra("extra_payments_entry_type", i);
            A082.putExtra("extra_is_first_payment_method", true);
            A082.putExtra("extra_skip_value_props_display", false);
            A082.putExtra("extra_receiver_jid", C627336j.A07(this.A0E));
            AnonymousClass5VI.A00(A082, "composer");
            A6T(A082, true);
            return true;
        } else {
            AnonymousClass9TK r4 = new AnonymousClass9TK(this, this, this.A05, this.A0P, (C1901794j) new AnonymousClass0XL(this).A01(C1901794j.class), (Runnable) null, new C199309gN(this), true);
            if (TextUtils.isEmpty(this.A0f)) {
                this.A0f = "chat";
            }
            r4.A00(this.A0E, (C203179nF) null, this.A0f);
            return true;
        }
    }

    public void BPI() {
        A6c("IndiaUpiPinPrimerDialogFragment");
    }

    public void BTm() {
        A6c("IndiaUpiForgotPinDialogFragment");
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BVC(X.AnonymousClass34V r17, java.lang.String r18) {
        /*
            r16 = this;
            r4 = r16
            X.9ca r2 = r4.A0S
            r1 = 1
            X.7yw r0 = r4.A0B
            r3 = r17
            r2.A07(r0, r3, r1)
            r7 = r18
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r14 = 0
            if (r0 != 0) goto L_0x0075
            X.7oG r2 = r4.A0f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "starting sendPaymentToVpa for jid: "
            r1.append(r0)
            X.4uZ r0 = r4.A0E
            r1.append(r0)
            java.lang.String r0 = " vpa: "
            r1.append(r0)
            X.7yt r0 = r4.A0I
            X.C1899593h.A1I(r2, r0, r1)
            X.7yw r0 = r4.A0B
            X.6hx r1 = r0.A08
            java.lang.String r0 = "onListKeys: Cannot get IndiaUpiMethodData"
            X.99H r2 = X.C1899693i.A0I(r2, r1, r0)
            r4.A7v()
            X.7bd r1 = r4.A05
            java.lang.String r0 = "upi-get-credential"
            r1.A02(r0)
            X.7yw r0 = r4.A0B
            java.lang.String r8 = r0.A0B
            X.7yt r6 = r2.A08
            X.99L r1 = r4.A0O
            X.39Q r5 = r4.A09
            X.7yt r0 = r0.A09
            java.lang.Object r12 = X.C1899593h.A0X(r0)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = r4.A7p()
            X.3ZH r0 = r4.A08
            if (r0 == 0) goto L_0x0061
            java.lang.String r14 = X.AnonymousClass36P.A02(r0)
        L_0x0061:
            java.lang.String r0 = r4.A0X
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r15 = 6
            if (r0 != 0) goto L_0x006b
            r15 = 5
        L_0x006b:
            java.lang.String r9 = r1.A0Q
            java.lang.String r10 = r1.A0O
            java.lang.String r11 = r1.A0S
            r4.A7f(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0074:
            return
        L_0x0075:
            if (r17 == 0) goto L_0x0074
            int r2 = r3.A00
            r0 = 0
            java.lang.String r1 = "upi-list-keys"
            boolean r0 = X.C196719bd.A02(r4, r1, r2, r0)
            if (r0 != 0) goto L_0x0074
            X.7bd r0 = r4.A05
            boolean r0 = r0.A06(r1)
            if (r0 == 0) goto L_0x0091
            X.AnonymousClass97T.A0y(r4)
            X.AnonymousClass97T.A10(r4)
            return
        L_0x0091:
            X.7oG r2 = r4.A0f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "onListKeys: "
            r1.append(r0)
            if (r18 == 0) goto L_0x00a6
            int r0 = r7.length()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
        L_0x00a6:
            r1.append(r14)
            java.lang.String r0 = " failed; ; showErrorAndFinish"
            X.C1899593h.A1J(r2, r0, r1)
            r4.A85(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Bs.BVC(X.34V, java.lang.String):void");
    }

    public void BbO(AnonymousClass34V r3) {
        throw AnonymousClass002.A0G(this.A0f.A02("onSetPin unsupported"));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 155) {
            if (i == 1000) {
                HashMap hashMap = this.A0L.A08;
                if (i2 != -1 || hashMap == null) {
                    this.A0f.A0A("REQUEST_TOS_UPDATED but found null credentialBlobs", (Throwable) null);
                } else {
                    BjL();
                    Bp9(R.string.f11nameremoved);
                    A89(A7m(this.A09, this.A01), false);
                    return;
                }
            } else if (i != 1001) {
                switch (i) {
                    case 1016:
                        if (i2 == -1 && intent != null) {
                            C166587yw r0 = (C166587yw) intent.getParcelableExtra("extra_bank_account");
                            if (r0 != null) {
                                this.A0B = r0;
                            }
                            C620933l r2 = this.A0P;
                            StringBuilder A0c2 = C1899593h.A0c(r2);
                            A0c2.append(";");
                            r2.A0K(AnonymousClass000.A0X(this.A0B.A0A, A0c2));
                            C166587yw r22 = this.A0B;
                            Intent A082 = AnonymousClass0x9.A08(this, IndiaUpiPinSetUpCompletedActivity.class);
                            A082.putExtra("extra_bank_account", r22);
                            A082.putExtra("on_settings_page", false);
                            startActivity(A082);
                            return;
                        }
                        return;
                    case 1017:
                        if (i2 == -1) {
                            C620933l r23 = this.A0P;
                            StringBuilder A0c3 = C1899593h.A0c(r23);
                            A0c3.append(";");
                            r23.A0K(AnonymousClass000.A0X(this.A0B.A0A, A0c3));
                            Intent A062 = C1899593h.A06(this, this.A0B, IndiaUpiPinSetUpCompletedActivity.class);
                            A062.putExtra("on_settings_page", false);
                            startActivityForResult(A062, 1018);
                            return;
                        }
                        return;
                    case 1018:
                        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
                        paymentBottomSheet.A02 = A7n(this.A09, this.A06, paymentBottomSheet);
                        Bon(paymentBottomSheet, String.valueOf(30));
                        return;
                    default:
                        super.onActivityResult(i, i2, intent);
                        return;
                }
            } else if (i2 == -1) {
                this.A0G = AnonymousClass32Y.A08(intent.getStringExtra("extra_receiver_jid"));
                return;
            } else if (!(i2 == 0 && this.A0G == null)) {
                return;
            }
            A7H();
            finish();
        } else if (i2 == -1) {
            A13();
        }
    }

    public void onBackPressed() {
        String str;
        PaymentView paymentView = this.A0N;
        if (paymentView != null && paymentView.A0G()) {
            return;
        }
        if (!C627336j.A0K(this.A0E) || this.A00 != 0) {
            A7H();
            finish();
            if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
                str = "order_details";
            } else {
                str = "new_payment";
            }
            A87(AnonymousClass9Wg.A00(this.A06, (AnonymousClass39Q) null, this.A0U, (String) null, true), str, 1);
            return;
        }
        this.A0G = null;
        A78((Bundle) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass6C7.A0y(this);
        this.A0A.A06(this.A0e);
        this.A02 = this.A03.A06(this, "india-upi-payment-activity");
        this.A0c = getIntent().getBooleanExtra("return-after-pay", false);
        this.A05 = this.A07.A01("INR");
        AnonymousClass5UX r1 = this.A01;
        AnonymousClass5ZU r9 = this.A06;
        C620733j r8 = this.A01;
        this.A0L = new AnonymousClass9SZ(r1, r9, r8);
        AnonymousClass1VX r13 = this.A0D;
        C69263Wi r12 = this.A05;
        AnonymousClass31C r14 = this.A0H;
        C194259Se r11 = this.A0E;
        AnonymousClass9U1 r10 = this.A0L;
        AnonymousClass9U5 r26 = this.A0M;
        C40602Ha r142 = this.A0K;
        this.A0D = new AnonymousClass9AN(this, r12, r13, r14, r10, r142, r26, r11);
        C56612sH r7 = this.A06;
        C56972sr r5 = this.A01;
        AnonymousClass4FS r25 = this.A04;
        AnonymousClass9U4 r15 = this.A0P;
        C617332a r4 = this.A07;
        C194969Vi r2 = this.A0T;
        C194259Se r24 = r11;
        AnonymousClass9U4 r21 = r15;
        C617332a r152 = r4;
        AnonymousClass1VX r16 = r13;
        C56972sr r132 = r5;
        C56612sH r143 = r7;
        this.A0I = new AnonymousClass9RI(new AnonymousClass9AD(this, r12, r132, r143, r152, r16, r10, this.A0M, r142, r26, r21, r2, this.A0V, r24, r25), new AnonymousClass9NS(this), new C199319gO(this));
        C160757oG r72 = this.A0f;
        C153087ae r52 = this.A0N;
        C194389Sr r42 = this.A07;
        AnonymousClass9TZ r3 = this.A0A;
        AnonymousClass36F r22 = this.A07;
        this.A0G = new AnonymousClass9VC(r9, r8, this.A07, r22, r26, r52, r42, r3, r72, this, new AnonymousClass9NT(this), r25);
        this.A0f = C1899593h.A0Z(this);
        AnonymousClass4FS r43 = this.A04;
        AnonymousClass9U4 r32 = this.A0P;
        CheckFirstTransaction checkFirstTransaction = new CheckFirstTransaction(this.A0I, this.A0P, r32, r43);
        this.A09 = checkFirstTransaction;
        this.A06.A00(checkFirstTransaction);
    }

    public Dialog onCreateDialog(int i, Bundle bundle) {
        if (i == 33) {
            return A7j(bundle);
        }
        return super.onCreateDialog(i, bundle);
    }

    public void A6O(int i) {
        if (i != R.string.f11nameremoved && i != R.string.f11nameremoved) {
            A7H();
            finish();
        }
    }

    public void A84(AnonymousClass34V r6) {
        BjL();
        if (r6 == null) {
            A7H();
            this.A04.BkM(new C199299gM(this));
            return;
        }
        AnonymousClass9VC r4 = this.A0G;
        AnonymousClass9S4 r2 = new AnonymousClass9S4("upi-accept-collect");
        String str = this.A0o;
        r2.A08 = true;
        r2.A03 = str;
        AnonymousClass39Q r0 = this.A09;
        r2.A07 = true;
        r2.A00 = r0;
        r2.A09 = true;
        r2.A04 = (String) this.A0I.A00;
        r4.A01(this, r6, r2.A00(), "upi-accept-collect");
    }

    public final void A86(AnonymousClass34V r4, boolean z) {
        BjL();
        if (r4 == null) {
            A7H();
            this.A04.BkM(new C200379iE(this, z));
        } else if (!C196719bd.A02(this, "upi-send-to-vpa", r4.A00, false)) {
            A85(r4);
        }
    }

    public void A8A(AnonymousClass9VW r9, String str, Object... objArr) {
        String str2;
        BjL();
        AnonymousClass303 A002 = AnonymousClass9Wg.A00(this.A06, (AnonymousClass39Q) null, this.A0U, (String) null, true);
        if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
            str2 = "order_details";
        } else {
            str2 = "new_payment";
        }
        AnonymousClass9Wg.A02(A002, this.A0S, 51, str2, this.A0f, 4);
        C134246ig A052 = this.A0S.A05(4, 51, str2, this.A0f);
        A052.A0S = str;
        AnonymousClass97T.A0t(A052, this);
        this.A0H = false;
        int i = r9.A00;
        if (i == 0) {
            i = R.string.f11nameremoved;
            r9.A00 = R.string.f11nameremoved;
        } else if (i == R.string.f11nameremoved || i == R.string.f11nameremoved || i == R.string.f11nameremoved || i == R.string.f11nameremoved || i == R.string.f11nameremoved) {
            objArr = new Object[]{BBy()};
        }
        Box(objArr, 0, i);
    }

    public void A8B(String str) {
        Intent A0X2 = AnonymousClass97T.A0X(this);
        if ("CREDIT".equals(str)) {
            A0X2.putExtra("extra_referral_screen", "add_credit_card");
            A0X2.putExtra("extra_payment_method_type", str);
        }
        startActivityForResult(A0X2, 1008);
    }

    public boolean A8C() {
        PaymentView paymentView;
        if (!AnonymousClass97T.A12(this) || (paymentView = this.A0N) == null || paymentView.A00 == 1) {
            return false;
        }
        return true;
    }

    public final boolean A8D() {
        if (!Arrays.asList(this.A0g).contains(C1899593h.A0Z(this)) || !this.A0D.A0X(2820)) {
            return false;
        }
        return true;
    }

    public void BQ3() {
        A7y(getSupportFragmentManager().A0D("IndiaUpiPinPrimerDialogFragment"));
        A6c("IndiaUpiPinPrimerDialogFragment");
        Intent A082 = AnonymousClass0x9.A08(this, IndiaUpiDebitCardVerificationActivity.class);
        A082.putExtra("extra_bank_account", this.A0B);
        A7O(A082);
        A082.putExtra("extra_previous_screen", "setup_pin_prompt");
        startActivityForResult(A082, 1016);
    }

    public void BQ9() {
        A7y(getSupportFragmentManager().A0D("IndiaUpiForgotPinDialogFragment"));
        A6c("IndiaUpiForgotPinDialogFragment");
        C620933l r2 = this.A0P;
        StringBuilder A0c2 = C1899593h.A0c(r2);
        A0c2.append(";");
        r2.A0K(AnonymousClass000.A0X(this.A0B.A0A, A0c2));
        this.A0Z = true;
        A13();
    }

    public void BTl() {
        A7y(getSupportFragmentManager().A0D("IndiaUpiForgotPinDialogFragment"));
        A6c("IndiaUpiForgotPinDialogFragment");
        Intent A0C2 = IndiaUpiPinPrimerFullSheetActivity.A0C(this, (C133686hm) this.A0B, this.A0a, true);
        A7O(A0C2);
        startActivityForResult(A0C2, 1017);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass9GM r1 = this.A0J;
        if (r1 != null) {
            r1.A0D(true);
        }
        this.A02.A00();
        this.A0A.A07(this.A0e);
        C160757oG r2 = this.A0f;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("onDestroy states: ");
        C1899593h.A1I(r2, this.A05, A0o);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.A0f.A06("action bar home");
        if (!C627336j.A0K(this.A0E) || this.A00 != 0) {
            A7H();
            finish();
            if (this instanceof IndiaUpiCheckOrderDetailsActivity) {
                str = "order_details";
            } else {
                str = "new_payment";
            }
            A7M(1, str);
            return true;
        }
        this.A0G = null;
        A78((Bundle) null);
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0B = (C166587yw) bundle.getParcelable("paymentMethodSavedInst");
        String string = bundle.getString("extra_jid");
        AnonymousClass32Y r1 = UserJid.Companion;
        this.A0E = r1.A0E(string);
        this.A0G = r1.A0E(bundle.getString("extra_receiver_jid"));
        this.A0H = bundle.getBoolean("sending_payment");
        this.A0X = bundle.getString("extra_incoming_pay_request_id");
        this.A01 = bundle.getInt("extra_offer_eligibility_state");
        if (this.A0B != null) {
            this.A0B.A08 = (C133796hx) bundle.getParcelable("countryDataSavedInst");
        }
        AnonymousClass99L r0 = (AnonymousClass99L) bundle.getParcelable("countryTransDataSavedInst");
        if (r0 != null) {
            this.A0O = r0;
        }
        String string2 = bundle.getString("sendAmountSavedInst");
        if (string2 != null) {
            this.A09 = C1899693i.A0B(this.A05, string2);
        }
        AnonymousClass39Q r02 = (AnonymousClass39Q) bundle.getParcelable("ExchangeAmountSavedInst");
        if (r02 != null) {
            this.A06 = r02;
        }
        this.A02 = bundle.getLong("quotedMessageRowIdSavedInst");
        this.A0j = bundle.getString("paymentNoteSavedInst");
        this.A0r = C624435a.A03(bundle.getString("paymentNoteMentionsSavedInst"));
        this.A0I = (C166557yt) bundle.getParcelable("receiverVpaSavedInst");
        this.A0h = bundle.getString("receiverVpaIdSavedInst");
        this.A0U = bundle.getString("paymentStickerMediaJobIdSavedInst");
        PaymentView paymentView = this.A0N;
        if (paymentView != null) {
            paymentView.A1L = bundle.getString("extra_payment_preset_amount");
        } else {
            this.A0V = bundle.getString("restoredPaymentAmount");
        }
        this.A00 = bundle.getInt("flowInstanceKey");
    }

    public void onResume() {
        super.onResume();
        C160757oG r2 = this.A0f;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("onResume states: ");
        C1899593h.A1I(r2, this.A05, A0o);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C133796hx r1;
        super.onSaveInstanceState(bundle);
        bundle.putString("extra_jid", C627336j.A07(this.A0E));
        bundle.putString("extra_receiver_jid", C627336j.A07(this.A0G));
        bundle.putBoolean("sending_payment", this.A0H);
        bundle.putString("extra_incoming_pay_request_id", this.A0X);
        bundle.putString("extra_request_message_key", this.A0n);
        bundle.putInt("extra_offer_eligibility_state", this.A01);
        C166587yw r12 = this.A0B;
        if (r12 != null) {
            bundle.putParcelable("paymentMethodSavedInst", r12);
        }
        C166587yw r0 = this.A0B;
        if (!(r0 == null || (r1 = r0.A08) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        AnonymousClass99L r13 = this.A0O;
        if (r13 != null) {
            bundle.putParcelable("countryTransDataSavedInst", r13);
        }
        AnonymousClass39Q r02 = this.A09;
        if (r02 != null) {
            bundle.putString("sendAmountSavedInst", r02.A00.toString());
        }
        AnonymousClass39Q r14 = this.A06;
        if (r14 != null) {
            bundle.putParcelable("ExchangeAmountSavedInst", r14);
        }
        long j = this.A02;
        if (j != 0) {
            bundle.putLong("quotedMessageRowIdSavedInst", j);
        }
        C166557yt r15 = this.A0I;
        if (!C161527pr.A03(r15)) {
            bundle.putParcelable("receiverVpaSavedInst", r15);
        }
        String str = this.A0h;
        if (str != null) {
            bundle.putString("receiverVpaIdSavedInst", str);
        }
        String str2 = this.A0U;
        if (str2 != null) {
            bundle.putString("paymentStickerMediaJobIdSavedInst", str2);
        }
        PaymentView paymentView = this.A0N;
        if (paymentView != null) {
            String A0m = C18290x4.A0m(paymentView.A0y);
            paymentView.A1L = A0m;
            paymentView.A1I = A0m;
            bundle.putString("extra_payment_preset_amount", A0m);
            bundle.putString("paymentNoteSavedInst", this.A0N.getPaymentNote());
            bundle.putString("paymentNoteMentionsSavedInst", C624435a.A01(this.A0N.getMentionedJids()));
            bundle.putString("restoredPaymentAmount", this.A0N.getPaymentAmountString());
        }
        bundle.putInt("flowInstanceKey", this.A00);
    }

    public void A81(C166587yw r1, AnonymousClass39L r2, PaymentBottomSheet paymentBottomSheet) {
    }

    public Dialog onCreateDialog(int i) {
        C19340zH r4;
        int i2;
        C19340zH A002;
        int i3;
        int i4;
        if (i != 15) {
            if (i == 22) {
                r4 = AnonymousClass5V0.A00(this);
                C86624Kv.A0i(this, r4, new Object[]{getString(R.string.f11nameremoved)}, R.string.f11nameremoved);
                i3 = R.string.f11nameremoved;
                i4 = 39;
            } else if (i == 26) {
                BigDecimal bigDecimal = new BigDecimal(this.A06.A03(C66663Mh.A1i));
                r4 = AnonymousClass5V0.A00(this);
                C86624Kv.A0i(this, r4, new Object[]{AnonymousClass1S3.A05.B3W(this.A01, bigDecimal)}, R.string.f11nameremoved);
                i3 = R.string.f11nameremoved;
                i4 = 35;
            } else if (i == 33) {
                return A7j((Bundle) null);
            } else {
                if (i != 34) {
                    switch (i) {
                        case 10:
                            A002 = AnonymousClass5V0.A00(this);
                            A002.A0T(R.string.f11nameremoved);
                            A002.A0X(new C204219p0(this, 34), R.string.f11nameremoved);
                            C204219p0.A00(A002, this, 41, R.string.f11nameremoved);
                            C204219p0.A01(A002, this, 42, R.string.f11nameremoved);
                            A002.A0i(true);
                            i2 = 5;
                            break;
                        case 11:
                            A002 = AnonymousClass5V0.A00(this);
                            A002.A0T(R.string.f11nameremoved);
                            C204219p0.A01(A002, this, 43, R.string.f11nameremoved);
                            C204219p0.A00(A002, this, 44, R.string.f11nameremoved);
                            A002.A0i(true);
                            i2 = 6;
                            break;
                        case 12:
                            A002 = AnonymousClass5V0.A00(this);
                            A002.A0T(R.string.f11nameremoved);
                            C204219p0.A01(A002, this, 45, R.string.f11nameremoved);
                            C204219p0.A00(A002, this, 46, R.string.f11nameremoved);
                            A002.A0i(true);
                            i2 = 7;
                            break;
                        case 13:
                            this.A0M.A0E();
                            A002 = AnonymousClass5V0.A00(this);
                            A002.A0T(R.string.f11nameremoved);
                            C204219p0.A01(A002, this, 36, R.string.f11nameremoved);
                            C204219p0.A00(A002, this, 37, R.string.f11nameremoved);
                            A002.A0i(true);
                            i2 = 3;
                            break;
                        default:
                            return super.onCreateDialog(i);
                    }
                } else {
                    r4 = AnonymousClass5V0.A00(this);
                    r4.A0T(R.string.f11nameremoved);
                    C204219p0.A01(r4, this, 40, R.string.f11nameremoved);
                    r4.A0i(true);
                    return r4.create();
                }
            }
            C204219p0.A01(r4, this, i4, i3);
            r4.A0i(false);
            return r4.create();
        }
        A002 = AnonymousClass5V0.A00(this);
        C86624Kv.A0i(this, A002, new Object[]{this.A06.A0M(this.A08)}, R.string.f11nameremoved);
        C204219p0.A01(A002, this, 38, R.string.f11nameremoved);
        A002.A0i(false);
        i2 = 4;
        r4.A0V(new C204279p6(this, i2));
        return r4.create();
    }
}
