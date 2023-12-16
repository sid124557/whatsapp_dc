package X;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.compliance.IndiaConfirmLegalNameBottomSheetFragment;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.9Ct  reason: invalid class name */
public abstract class AnonymousClass9Ct extends AnonymousClass9Cu {
    public long A00;
    public C136996nb A01;
    public AnonymousClass9AB A02;
    public C194309Sj A03;
    public AnonymousClass2z0 A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;
    public boolean A0A;

    public final Pair A8S() {
        Pair pair = new Pair((Object) null, (Object) null);
        List list = this.A09;
        if (list == null || list.isEmpty()) {
            return pair;
        }
        for (AnonymousClass394 r0 : this.A09) {
            C85184Fg r2 = r0.A00;
            if (r2 instanceof AnonymousClass3SO) {
                AnonymousClass3SO r22 = (AnonymousClass3SO) r2;
                return AnonymousClass0x9.A0C(r22.A01, r22.A02);
            }
        }
        return pair;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A06 = getIntent().getStringExtra("extra_order_id");
        this.A00 = getIntent().getLongExtra("extra_order_expiry_ts_in_sec", 0);
        this.A08 = getIntent().getStringExtra("extra_payment_type");
        this.A07 = getIntent().getStringExtra("extra_payment_config_id");
        this.A09 = getIntent().getParcelableArrayListExtra("extra_payment_settings");
        this.A0A = getIntent().getBooleanExtra("extra_checkout_lite_enabled", false);
        this.A0n = true;
        if (this.A0J != null || !AnonymousClass97T.A12(this)) {
            BjL();
        } else {
            AnonymousClass9GM r1 = new AnonymousClass9GM(this);
            this.A0J = r1;
            AnonymousClass0x7.A1B(r1, this.A04);
        }
        C56612sH r6 = this.A06;
        AnonymousClass1VX r8 = this.A0D;
        C69263Wi r5 = this.A05;
        AnonymousClass4FS r12 = this.A04;
        this.A02 = new AnonymousClass9AB(this, r5, r6, this.A00, r8, this.A0L, this.A0K, this.A0M, r12);
    }

    public static /* synthetic */ void A0C(AnonymousClass34V r9, C202749mW r10, AnonymousClass9Ct r11, PaymentBottomSheet paymentBottomSheet) {
        PaymentBottomSheet paymentBottomSheet2;
        if (r9.A00 == 10755) {
            AnonymousClass303 r6 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
            r6.A02("payments_error_code", r9.A00);
            r6.A03("payments_error_text", r9.A08);
            r11.A6W(new C195939a2(r6, r11), R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
            r11.BKD(r6, 0, (Integer) null, "sanction_check_error_dialog");
            return;
        }
        if (paymentBottomSheet != null) {
            paymentBottomSheet2 = paymentBottomSheet;
        } else {
            paymentBottomSheet2 = new PaymentBottomSheet();
        }
        if (r9.A00 == 10752) {
            String str = r11.A0f;
            String str2 = r11.A0i;
            String str3 = r11.A0h;
            IndiaConfirmLegalNameBottomSheetFragment indiaConfirmLegalNameBottomSheetFragment = new IndiaConfirmLegalNameBottomSheetFragment();
            Bundle A082 = AnonymousClass002.A08();
            A082.putString("extra_payment_config_id", str);
            A082.putString("extra_order_type", str2);
            A082.putString("extra_referral_screen", str3);
            indiaConfirmLegalNameBottomSheetFragment.A0u(A082);
            indiaConfirmLegalNameBottomSheetFragment.A0A = new C197479dE(r10, r11, paymentBottomSheet2, paymentBottomSheet);
            if (paymentBottomSheet != null) {
                C08270df A0T = paymentBottomSheet.A0T();
                int A072 = A0T.A07();
                for (int i = 0; i < A072; i++) {
                    A0T.A0M();
                }
                paymentBottomSheet.A1b(indiaConfirmLegalNameBottomSheetFragment);
            } else {
                paymentBottomSheet2.A02 = indiaConfirmLegalNameBottomSheetFragment;
                C86644Kx.A1C(paymentBottomSheet2, r11);
                r11.A7z(paymentBottomSheet2);
            }
            r11.BKD((AnonymousClass303) null, 0, (Integer) null, "enter_name");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r3 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A8T(X.AnonymousClass34V r3) {
        /*
            r2 = this;
            X.1VX r1 = r2.A0D
            r0 = 6712(0x1a38, float:9.406E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0017
            if (r3 == 0) goto L_0x002a
            X.9TZ r1 = r2.A0A
            int r0 = r3.A00
            java.lang.String r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0019
            return r0
        L_0x0017:
            if (r3 == 0) goto L_0x002a
        L_0x0019:
            int r0 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass9WM.A02(r0)
            if (r0 == 0) goto L_0x002a
            int r0 = r0.intValue()
        L_0x0025:
            java.lang.String r0 = r2.getString(r0)
            return r0
        L_0x002a:
            r0 = 2131891948(0x7f1216ec, float:1.941863E38)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Ct.A8T(X.34V):java.lang.String");
    }

    public void A8U() {
        IndiaUpiPinPrimerDialogFragment A0R = C1899693i.A0R(this.A0B, this);
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = A0R;
        Bon(paymentBottomSheet, "IndiaUpiPinPrimerDialogFragment");
        A7z(paymentBottomSheet);
        A8R(false);
    }

    public void A8V(AnonymousClass39L r4) {
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = A7n(r4.A02, (AnonymousClass39Q) null, paymentBottomSheet);
        Boo(paymentBottomSheet);
        A7z(paymentBottomSheet);
    }

    public void A8W(AnonymousClass39L r27, C202749mW r28, C202759mX r29, PaymentBottomSheet paymentBottomSheet, Runnable runnable, Runnable runnable2) {
        String str;
        Long l;
        if (!this.A0A) {
            C202759mX r8 = r29;
            Runnable runnable3 = runnable;
            if (this.A0O.A0L(this.A08, this.A09)) {
                C626936e.A06(this.A0E);
                C626936e.A06(this.A06);
                C626936e.A06(this.A07);
                Pair A8S = A8S();
                C136996nb r13 = this.A01;
                String str2 = this.A06;
                AnonymousClass2z0 r0 = this.A04;
                if (r0 != null) {
                    str = r0.A01;
                } else {
                    str = "";
                }
                UserJid userJid = this.A0E;
                String str3 = this.A07;
                long j = this.A00;
                if (j > 0) {
                    l = Long.valueOf(j);
                } else {
                    l = null;
                }
                String A0Y = C18280x3.A0Y();
                AnonymousClass9c8 r19 = new AnonymousClass9c8(r28, r8, this, paymentBottomSheet, runnable3, runnable2);
                C162457s7.A0J(str2, 0);
                AnonymousClass39L r10 = r27;
                C18260x0.A0V(str, userJid, r10);
                C162457s7.A0J(str3, 4);
                C162457s7.A0J(A0Y, 8);
                String str4 = str3;
                String str5 = str;
                r13.A06.BkM(new C201429k7(r10, userJid, r19, r13, l, str2, str5, str4, "UPI", A0Y, (String) A8S.first, (JSONObject) A8S.second));
                return;
            }
            AnonymousClass9AB r5 = this.A02;
            String str6 = this.A07;
            r5.A07.BkM(new C201239jk(this.A0E, r5, new AnonymousClass9RO(r8, this, runnable3), str6));
        }
    }

    public final void A8X(AnonymousClass39L r23, C202749mW r24, PaymentBottomSheet paymentBottomSheet, Runnable runnable, Runnable runnable2) {
        String str;
        Long l;
        C626936e.A06(this.A0E);
        C626936e.A06(this.A06);
        C626936e.A06(this.A07);
        Pair A8S = A8S();
        C136996nb r9 = this.A01;
        String str2 = this.A06;
        AnonymousClass2z0 r0 = this.A04;
        if (r0 != null) {
            str = r0.A01;
        } else {
            str = "";
        }
        UserJid userJid = this.A0E;
        String str3 = this.A07;
        long j = this.A00;
        if (j > 0) {
            l = Long.valueOf(j);
        } else {
            l = null;
        }
        String A0Y = C18280x3.A0Y();
        AnonymousClass9c7 r16 = new AnonymousClass9c7(r24, this, paymentBottomSheet, runnable, runnable2);
        C162457s7.A0J(str2, 0);
        AnonymousClass39L r6 = r23;
        C18260x0.A0V(str, userJid, r6);
        C162457s7.A0J(str3, 4);
        C162457s7.A0J(A0Y, 8);
        r9.A06.BkM(new C201429k7(r6, userJid, r16, r9, l, str2, str, str3, "HPP_PAYMENT_LINK", A0Y, (String) A8S.first, (JSONObject) A8S.second));
    }

    public boolean A8Y() {
        AnonymousClass99H r0 = (AnonymousClass99H) this.A0B.A08;
        if (r0 == null || !Boolean.FALSE.equals(r0.A05.A00)) {
            return false;
        }
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        int i4;
        if (i == 1008 || i == 1015) {
            A7s();
        } else if (i != 1024) {
            super.onActivityResult(i, i2, intent);
        } else {
            if (i2 == -1) {
                A8K();
                i3 = 1;
                i4 = 5;
            } else {
                i3 = 1;
                i4 = 3;
            }
            BKD((AnonymousClass303) null, i3, Integer.valueOf(i4), "in_app_browser_checkout");
        }
    }

    public void onResume() {
        super.onResume();
        if (AnonymousClass97T.A12(this) && !this.A05.A07.contains("upi-get-challenge") && this.A0M.A05().A00 == null) {
            this.A0f.A06("onResume getChallenge");
            Bp9(R.string.f11nameremoved);
            this.A05.A02("upi-get-challenge");
            A7Y();
        }
    }
}
