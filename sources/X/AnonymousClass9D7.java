package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.IndiaUpiPinSetUpCompletedActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9D7  reason: invalid class name */
public abstract class AnonymousClass9D7 extends AnonymousClass9D8 implements C203519ns, C203489nm, AnonymousClass49C, C203349nY, C202729mU, C203149nC {
    public AnonymousClass5UX A00;
    public AnonymousClass5ZR A01;
    public C617332a A02;
    public C166587yw A03;
    public AnonymousClass8EA A04;
    public C624034w A05;
    public C29251iW A06;
    public C193999Re A07;
    public C197769dq A08;
    public PaymentBottomSheet A09 = new PaymentBottomSheet();
    public C158777kX A0A;
    public AnonymousClass9WN A0B;
    public AnonymousClass9V1 A0C;
    public AnonymousClass9VY A0D;
    public String A0E;
    public String A0F;
    public List A0G;
    public boolean A0H;
    public boolean A0I;
    public final C43942Ub A0J = new C203879oS(this, 2);
    public final C160757oG A0K = C160757oG.A00("IndiaUpiBaseRequestPaymentActivity", "payment-settings", "IN");

    public void BY0(int i) {
        String str;
        if (i == 1) {
            str = "p2p";
        } else {
            str = "p2m";
        }
        this.A0p = str;
    }

    public void A7j() {
        if (!this.A01.A0F()) {
            RequestPermissionActivity.A0a(this);
            return;
        }
        int A012 = this.A0D.A01();
        if (A012 == 1) {
            A6W(new C204339pC(this, 0), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
        } else if (A012 != 2) {
            AnonymousClass99H r0 = (AnonymousClass99H) this.A03.A08;
            if (r0 == null || !"OD_UNSECURED".equals(r0.A0B) || this.A0I) {
                AnonymousClass97T.A10(this);
            } else {
                Bot(R.string.f11nameremoved);
            }
        } else {
            C19340zH A002 = AnonymousClass5V0.A00(this);
            A002.A0U(R.string.f11nameremoved);
            A002.A0T(R.string.f11nameremoved);
            C204219p0.A01(A002, this, 24, R.string.f11nameremoved);
            C204219p0.A00(A002, this, 23, R.string.f11nameremoved);
            A002.A0i(false);
            A002.A0S();
        }
    }

    public void A7k(C166587yw r25, HashMap hashMap) {
        C166587yw r8 = r25;
        IndiaUpiPauseMandateActivity indiaUpiPauseMandateActivity = (IndiaUpiPauseMandateActivity) this;
        AnonymousClass9U1 r7 = indiaUpiPauseMandateActivity.A0L;
        C69263Wi r15 = indiaUpiPauseMandateActivity.A05;
        C55682qk r14 = indiaUpiPauseMandateActivity.A03;
        C153607bd r6 = indiaUpiPauseMandateActivity.A05;
        AnonymousClass31C r5 = indiaUpiPauseMandateActivity.A0H;
        C194259Se r4 = indiaUpiPauseMandateActivity.A0E;
        AnonymousClass9U5 r3 = indiaUpiPauseMandateActivity.A0M;
        AnonymousClass9AG r2 = indiaUpiPauseMandateActivity.A08;
        C40602Ha r1 = indiaUpiPauseMandateActivity.A0K;
        AnonymousClass9AO r12 = new AnonymousClass9AO(indiaUpiPauseMandateActivity, r14, r15, r5, r7, indiaUpiPauseMandateActivity.A0M, r1, r6, r3, r2, r4);
        indiaUpiPauseMandateActivity.Bp9(R.string.f11nameremoved);
        IndiaUpiPauseMandateViewModel indiaUpiPauseMandateViewModel = indiaUpiPauseMandateActivity.A06;
        long A0C2 = IndiaUpiPauseMandateActivity.A0C(indiaUpiPauseMandateActivity.A02);
        long A0C3 = IndiaUpiPauseMandateActivity.A0C(indiaUpiPauseMandateActivity.A01);
        String str = indiaUpiPauseMandateActivity.A07;
        if (r25 == null) {
            r8 = indiaUpiPauseMandateViewModel.A00;
        }
        C624034w r10 = indiaUpiPauseMandateViewModel.A01;
        AnonymousClass9cC r142 = new AnonymousClass9cC(indiaUpiPauseMandateViewModel, A0C2, A0C3);
        Log.i("PAY: pausePayeeMandate called");
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03("action", "upi-pause-mandate", A0s);
        r12.A02(r10, A0s);
        AnonymousClass99L r9 = (AnonymousClass99L) r10.A0A;
        C626936e.A06(r9);
        AnonymousClass9AO.A00((C195109Vz) null, r9, str, A0s, true);
        r12.A01(r8, "upi-pause-mandate", hashMap, A0s);
        AnonymousClass36K[] A032 = r12.A03(r10);
        A0s.add(new AnonymousClass39V("pause-start-ts", A0C2 / 1000));
        A0s.add(new AnonymousClass39V("pause-end-ts", A0C3 / 1000));
        AnonymousClass39V.A03("receiver-name", C166557yt.A00(r9.A0A), A0s);
        AnonymousClass9AG r13 = r12.A07;
        if (r13 != null) {
            r13.A00("U66", A0s);
        }
        C153607bd A022 = AnonymousClass9OC.A02(r12, "upi-pause-mandate");
        r12.A01.A0G(new C203929oX(r12.A00, r12.A02, r12.A06, A022, (C202589mG) r142, r12, 9), new AnonymousClass36K("account", C18300x5.A1Z(A0s, 0), A032), "set", 0);
    }

    public void A7m(PaymentBottomSheet paymentBottomSheet) {
        ConfirmPaymentFragment A002 = ConfirmPaymentFragment.A00(this.A03, (UserJid) null, (AnonymousClass9XZ) null, this.A0p, this.A0Z, this.A0I ^ true ? 1 : 0);
        A002.A0N = this;
        A002.A0O = this;
        paymentBottomSheet.A02 = A002;
        Bon(paymentBottomSheet, "ConfirmPaymentFragment");
    }

    public void A7n(PaymentBottomSheet paymentBottomSheet) {
        C166587yw r2 = this.A03;
        Bundle A082 = AnonymousClass002.A08();
        A082.putParcelable("extra_bank_account", r2);
        IndiaUpiForgotPinDialogFragment indiaUpiForgotPinDialogFragment = new IndiaUpiForgotPinDialogFragment();
        indiaUpiForgotPinDialogFragment.A0u(A082);
        indiaUpiForgotPinDialogFragment.A07 = this;
        paymentBottomSheet.A02 = indiaUpiForgotPinDialogFragment;
        Bon(paymentBottomSheet, "IndiaUpiForgotPinDialogFragment");
    }

    public void A7o(PaymentBottomSheet paymentBottomSheet) {
        paymentBottomSheet.A02 = C1899693i.A0R(this.A03, this);
        Bon(paymentBottomSheet, "IndiaUpiPinPrimerDialogFragment");
    }

    public void A7p(PaymentBottomSheet paymentBottomSheet, String str) {
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            paymentBottomSheet.A01 = null;
        }
        A6c(str);
    }

    public void AxR(ViewGroup viewGroup) {
        AnonymousClass9W2 r4;
        String A042;
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = (IndiaUpiMandatePaymentActivity) this;
            View A0h = C86664Kz.A0h(indiaUpiMandatePaymentActivity.getLayoutInflater(), viewGroup, R.layout.f8nameremoved);
            View A022 = C06560Yg.A02(A0h, R.id.start_date_label);
            TextView A0G2 = C18300x5.A0G(A0h, R.id.start_date_value);
            TextView A0G3 = C18300x5.A0G(A0h, R.id.end_date_label);
            TextView A0G4 = C18300x5.A0G(A0h, R.id.end_date_value);
            TextView A0G5 = C18300x5.A0G(A0h, R.id.frequency_value);
            TextView A0G6 = C18300x5.A0G(A0h, R.id.total_value);
            C624034w r5 = indiaUpiMandatePaymentActivity.A03.A07;
            AnonymousClass1S4 r1 = r5.A0A;
            if ((r1 instanceof AnonymousClass99L) && (r4 = ((AnonymousClass99L) r1).A0G) != null) {
                if (AnonymousClass9WN.A02(r4.A0E)) {
                    A022.setVisibility(0);
                    A0G2.setVisibility(0);
                    AnonymousClass9WN r2 = indiaUpiMandatePaymentActivity.A0B;
                    A0G2.setText(C107505bQ.A06(r2.A03, r4.A02));
                    A0G3.setText(R.string.f11nameremoved);
                    AnonymousClass9WN r22 = indiaUpiMandatePaymentActivity.A0B;
                    A042 = C107505bQ.A06(r22.A03, r4.A01);
                } else {
                    C86624Kv.A12(A022, A0G2);
                    A0G3.setText(R.string.f11nameremoved);
                    A042 = indiaUpiMandatePaymentActivity.A0B.A04(r4.A01);
                }
                A0G4.setText(A042);
                A0G5.setText(indiaUpiMandatePaymentActivity.A0B.A06(r4.A0E));
                A0G6.setText(indiaUpiMandatePaymentActivity.A0B.A05(r5.A08, r4.A0G));
                return;
            }
            return;
        }
        View A0h2 = C86664Kz.A0h(getLayoutInflater(), viewGroup, R.layout.f8nameremoved);
        if (this.A05 != null) {
            C18300x5.A0G(A0h2, R.id.amount).setText(this.A02.A01("INR").B3V(this.A01, this.A05.A08));
        }
    }

    public String B5n(C166587yw r2, int i) {
        int i2;
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            i2 = R.string.f11nameremoved;
        } else {
            i2 = R.string.f11nameremoved;
        }
        return getString(i2);
    }

    public String B6i(C166587yw r3) {
        return this.A0A.A02(r3, false);
    }

    public String B9h() {
        C166557yt A042 = this.A0M.A04();
        if (C161527pr.A02(A042)) {
            return null;
        }
        Object[] A0L = AnonymousClass002.A0L();
        C626936e.A06(A042);
        Object obj = A042.A00;
        C626936e.A06(obj);
        return AnonymousClass002.A0F(this, obj, A0L, 0, R.string.f11nameremoved);
    }

    public boolean BIJ() {
        C133676hl r0 = this.A0A;
        if (r0 == null || !r0.A0D()) {
            return false;
        }
        return true;
    }

    public void BPI() {
        this.A09.A1Y();
    }

    public void BPe(View view, View view2, C195319Xg r8, C133676hl r9, C166587yw r10, PaymentBottomSheet paymentBottomSheet) {
        A7p(this.A09, "ConfirmPaymentFragment");
        String[] split = this.A0P.A07().split(";");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (split[i].equalsIgnoreCase(this.A03.A0A)) {
                this.A0H = true;
                break;
            } else {
                i++;
            }
        }
        AnonymousClass99H r0 = (AnonymousClass99H) this.A03.A08;
        if (r0 == null || !AnonymousClass99H.A00(r0) || this.A0H) {
            A7j();
            return;
        }
        PaymentBottomSheet paymentBottomSheet2 = new PaymentBottomSheet();
        this.A09 = paymentBottomSheet2;
        A7n(paymentBottomSheet2);
    }

    public void BQ3() {
        Intent A082 = AnonymousClass0x9.A08(this, IndiaUpiDebitCardVerificationActivity.class);
        A082.putExtra("extra_bank_account", this.A03);
        A7O(A082);
        A082.putExtra("extra_previous_screen", "setup_pin_prompt");
        BpY(A082, 1016);
    }

    public void BQ9() {
        A7p(this.A09, "IndiaUpiForgotPinDialogFragment");
        C620933l r2 = this.A0P;
        StringBuilder A0c = C1899593h.A0c(r2);
        A0c.append(";");
        r2.A0K(AnonymousClass000.A0X(this.A03.A0A, A0c));
        this.A0H = true;
        A7j();
    }

    public void BTl() {
        Intent A0C2 = IndiaUpiPinPrimerFullSheetActivity.A0C(this, (C133686hm) this.A03, this.A0a, true);
        A7O(A0C2);
        BpY(A0C2, 1017);
    }

    public void BTm() {
        this.A09.A1Y();
    }

    public void BXo(PaymentBottomSheet paymentBottomSheet, int i) {
        PaymentMethodsListPickerFragment A002 = PaymentMethodsListPickerFragment.A00(this.A0G);
        A002.A07 = new C192739Lj(this, 1);
        A002.A04 = this;
        A002.A10(paymentBottomSheet.A02, 0);
        paymentBottomSheet.A1b(A002);
    }

    public void BXs(C166587yw r2, PaymentMethodRow paymentMethodRow) {
        if (this instanceof IndiaUpiMandatePaymentActivity) {
            this.A03 = r2;
        }
    }

    public void BaR(boolean z) {
        if (z) {
            A7m(this.A09);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        PaymentBottomSheet paymentBottomSheet;
        String str;
        if (i != 155) {
            switch (i) {
                case 1015:
                    return;
                case 1016:
                    if (i2 == -1 && intent != null) {
                        C166587yw r0 = (C166587yw) intent.getParcelableExtra("extra_bank_account");
                        if (r0 != null) {
                            this.A03 = r0;
                        }
                        C620933l r2 = this.A0P;
                        StringBuilder A0c = C1899593h.A0c(r2);
                        A0c.append(";");
                        r2.A0K(AnonymousClass000.A0X(this.A03.A0A, A0c));
                        paymentBottomSheet = this.A09;
                        str = "IndiaUpiPinPrimerDialogFragment";
                        break;
                    } else {
                        return;
                    }
                    break;
                case 1017:
                    if (i2 == -1) {
                        C620933l r22 = this.A0P;
                        StringBuilder A0c2 = C1899593h.A0c(r22);
                        A0c2.append(";");
                        r22.A0K(AnonymousClass000.A0X(this.A03.A0A, A0c2));
                        paymentBottomSheet = this.A09;
                        str = "IndiaUpiForgotPinDialogFragment";
                        break;
                    } else {
                        return;
                    }
                case 1018:
                    if (TextUtils.isEmpty(this.A0E)) {
                        Bp9(R.string.f11nameremoved);
                        A7l(this.A05);
                        return;
                    }
                    A7m(this.A09);
                    return;
                default:
                    super.onActivityResult(i, i2, intent);
                    return;
            }
            A7p(paymentBottomSheet, str);
            Intent A062 = C1899593h.A06(this, this.A03, IndiaUpiPinSetUpCompletedActivity.class);
            A062.putExtra("on_settings_page", false);
            BpY(A062, 1018);
        } else if (i2 == -1) {
            A7j();
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i != 34) {
            return super.onCreateDialog(i);
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0T(R.string.f11nameremoved);
        C19340zH.A06(A002);
        A002.A00.A0L(new C204629pf(this, 9));
        return A002.create();
    }

    public final void A7l(C624034w r5) {
        AnonymousClass99L A0K2 = C1899693i.A0K(r5);
        String str = A0K2.A0O;
        if (!this.A0D.A0X(2700) || A0K2.A0G == null) {
            AnonymousClass9U4.A07(this.A0P).BAl().BsF(C1899593h.A0B(str), new AnonymousClass9bU(this, str));
            return;
        }
        this.A0K.A06("skipping verifyReceiver for mandates");
        this.A0F = str;
        this.A0E = (String) C1899593h.A0X(A0K2.A0A);
        A7m(this.A09);
    }

    public void BMi(ViewGroup viewGroup) {
        View A0h = C86664Kz.A0h(getLayoutInflater(), viewGroup, R.layout.f8nameremoved);
        C18300x5.A0G(A0h, R.id.text).setText(R.string.f11nameremoved);
        ImageView A0E2 = AnonymousClass0x9.A0E(A0h, R.id.icon);
        A0E2.setImageResource(R.drawable.ic_close);
        C204249p3.A02(A0E2, this, 41);
    }

    public void BMk(ViewGroup viewGroup) {
        View inflate = getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup, true);
        ImageView A0E2 = AnonymousClass0x9.A0E(inflate, R.id.payment_recipient_profile_pic);
        TextView A0G2 = C18300x5.A0G(inflate, R.id.payment_recipient_name);
        TextView A0G3 = C18300x5.A0G(inflate, R.id.payment_recipient_vpa);
        C06560Yg.A02(inflate, R.id.expand_receiver_details_button).setVisibility(0);
        C204249p3.A02(inflate, this, 40);
        this.A00.A06(A0E2, R.drawable.avatar_contact);
        A0G2.setText(this.A0E);
        AnonymousClass001.A0y(this, A0G3, new Object[]{this.A0F}, R.string.f11nameremoved);
    }

    public void BTi(ViewGroup viewGroup, C166587yw r6) {
        AnonymousClass0x9.A0E(C86664Kz.A0h(getLayoutInflater(), viewGroup, R.layout.f8nameremoved), R.id.psp_logo).setImageResource(this.A0C.A00(this.A0M.A07(), (String) null).A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ef, code lost:
        if (r2.A02 == null) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BVC(X.AnonymousClass34V r8, java.lang.String r9) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x005a
            X.7oG r1 = r7.A0K
            java.lang.String r0 = "onListKeys contains non empty keys"
            r1.A06(r0)
            X.7bd r1 = r7.A05
            java.lang.String r0 = "upi-get-credential"
            r1.A02(r0)
            X.7yw r6 = r7.A03
            r1 = r7
            boolean r0 = r7 instanceof com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity
            if (r0 == 0) goto L_0x0076
            com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity r1 = (com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity) r1
            com.whatsapp.payments.ui.viewmodel.IndiaUpiPauseMandateViewModel r4 = r1.A06
            if (r6 != 0) goto L_0x0023
            X.7yw r6 = r4.A00
        L_0x0023:
            X.34w r0 = r4.A01
            X.1S4 r3 = r0.A0A
            X.99L r3 = (X.AnonymousClass99L) r3
            X.6hx r2 = r6.A08
            X.C626936e.A06(r2)
            X.99H r2 = (X.AnonymousClass99H) r2
            r0 = 0
            X.9QA r1 = new X.9QA
            r1.<init>(r0)
            r1.A06 = r9
            java.lang.String r0 = r6.A0B
            r1.A05 = r0
            X.7yt r0 = r2.A08
            r1.A02 = r0
            r1.A03 = r3
            X.7yt r0 = r6.A09
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r1.A08 = r0
            java.lang.String r0 = r3.A0O
            r1.A07 = r0
            X.34w r0 = r4.A01
            X.39Q r0 = r0.A08
            r1.A01 = r0
            X.4UC r0 = r4.A02
            r0.A0H(r1)
        L_0x0059:
            return
        L_0x005a:
            if (r8 == 0) goto L_0x0059
            int r2 = r8.A00
            r0 = 0
            java.lang.String r1 = "upi-list-keys"
            boolean r0 = X.C196719bd.A02(r7, r1, r2, r0)
            if (r0 != 0) goto L_0x0059
            X.7bd r0 = r7.A05
            boolean r0 = r0.A06(r1)
            if (r0 == 0) goto L_0x00f2
            X.AnonymousClass97T.A0y(r7)
            X.AnonymousClass97T.A10(r7)
            return
        L_0x0076:
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r1
            X.94n r3 = r1.A03
            if (r6 != 0) goto L_0x007e
            X.7yw r6 = r3.A05
        L_0x007e:
            X.34w r4 = r3.A07
            X.1S4 r5 = r4.A0A
            X.99L r5 = (X.AnonymousClass99L) r5
            X.6hx r2 = r6.A08
            X.7oG r1 = r3.A0L
            java.lang.String r0 = "onListKeys: Cannot get IndiaUpiMethodData"
            X.99H r1 = X.C1899693i.A0I(r1, r2, r0)
            r0 = 0
            X.9QE r2 = new X.9QE
            r2.<init>(r0)
            r2.A0A = r9
            java.lang.String r0 = r6.A0B
            r2.A09 = r0
            X.7yt r0 = r1.A08
            r2.A04 = r0
            r2.A05 = r5
            X.7yt r0 = r6.A09
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r2.A0C = r0
            java.lang.String r0 = r5.A0O
            r2.A0B = r0
            int r1 = r3.A00
            r0 = 8
            if (r0 == r1) goto L_0x00d3
            r0 = 1
            if (r0 == r1) goto L_0x00d3
            r0 = 4
            if (r0 == r1) goto L_0x00d3
            r0 = 9
            if (r0 == r1) goto L_0x00d3
            r0 = 7
            if (r0 == r1) goto L_0x00d3
            r0 = 3
            if (r0 == r1) goto L_0x00c5
            r0 = 6
            if (r0 != r1) goto L_0x00cd
        L_0x00c5:
            java.lang.String r0 = r3.A0A
            r5.A0S = r0
        L_0x00c9:
            X.39Q r0 = r4.A08
            r2.A02 = r0
        L_0x00cd:
            X.4UC r0 = r3.A09
            r0.A0H(r2)
            return
        L_0x00d3:
            X.9W2 r0 = r5.A0G
            if (r0 == 0) goto L_0x00ed
            X.9Vz r1 = r0.A0C
            if (r1 == 0) goto L_0x00ed
            X.7yt r0 = r1.A04
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r5.A0S = r0
            X.7yt r0 = r1.A03
            if (r0 == 0) goto L_0x00ed
            X.39Q r0 = r1.A00()
            r2.A02 = r0
        L_0x00ed:
            X.39Q r0 = r2.A02
            if (r0 != 0) goto L_0x00cd
            goto L_0x00c9
        L_0x00f2:
            X.7oG r2 = r7.A0K
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "onListKeys: "
            r1.append(r0)
            if (r9 == 0) goto L_0x0113
            int r0 = r9.length()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0107:
            r1.append(r0)
            java.lang.String r0 = " failed; ; showErrorAndFinish"
            X.C1899593h.A1J(r2, r0, r1)
            r7.A7b()
            return
        L_0x0113:
            r0 = 0
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9D7.BVC(X.34V, java.lang.String):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A06.A06(this.A0J);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.A07(this.A0J);
    }

    public int B7G(C166587yw r2, int i) {
        return 0;
    }

    public void BXz(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public /* synthetic */ void Boj(C166587yw r1, PaymentMethodRow paymentMethodRow) {
    }

    public int B6h() {
        return R.string.f11nameremoved;
    }

    public /* synthetic */ String BDp() {
        return null;
    }

    public /* synthetic */ boolean Bo9() {
        return false;
    }

    public /* synthetic */ boolean BoR() {
        return false;
    }

    public /* synthetic */ boolean Bp0() {
        return true;
    }

    public /* synthetic */ int B5m(C166587yw r2) {
        return 0;
    }

    public void BMh(ViewGroup viewGroup) {
    }

    public void BXr(C166587yw r1) {
        this.A03 = r1;
    }

    public void BeU(PaymentBottomSheet paymentBottomSheet) {
    }

    public boolean BoQ(C166587yw r2) {
        return true;
    }

    public void BXv(PaymentBottomSheet paymentBottomSheet, int i, int i2) {
    }

    public /* synthetic */ boolean BoC(C166587yw r2, String str, int i) {
        return false;
    }

    public void BUf(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
    }
}
