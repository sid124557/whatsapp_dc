package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilSmbPaymentActivity;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.9DC  reason: invalid class name */
public abstract class AnonymousClass9DC extends AnonymousClass97T implements C203779oI {
    public int A00;
    public int A01 = 6;
    public long A02;
    public Bundle A03;
    public AnonymousClass99P A04;
    public C64223Cq A05;
    public C54292oU A06;
    public C66473Lo A07;
    public C66543Lv A08;
    public AnonymousClass3ZH A09;
    public C133676hl A0A;
    public AnonymousClass39R A0B;
    public AnonymousClass30K A0C;
    public C95814uZ A0D;
    public C95814uZ A0E;
    public UserJid A0F;
    public UserJid A0G;
    public AnonymousClass31C A0H;
    public C1906899l A0I;
    public AnonymousClass9GK A0J;
    public C40602Ha A0K;
    public C85134Fb A0L;
    public AnonymousClass9U5 A0M;
    public C153087ae A0N;
    public C1907099n A0O;
    public AnonymousClass9U4 A0P;
    public C194089Rn A0Q;
    public C49892hG A0R;
    public AnonymousClass9VS A0S;
    public C194969Vi A0T;
    public AnonymousClass9VG A0U;
    public C46782cC A0V;
    public AnonymousClass9WW A0W;
    public C194119Rq A0X;
    public PaymentIncentiveViewModel A0Y;
    public C44562Wn A0Z;
    public C115975pX A0a;
    public C45022Yj A0b;
    public AnonymousClass39M A0c;
    public AnonymousClass33O A0d;
    public C55832qz A0e;
    public Integer A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public List A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;

    public static void A16(C89644eZ r6, C203499no r7, AnonymousClass9VG r8, int i) {
        AnonymousClass9Wg.A02(AnonymousClass9Wg.A00(r6.A06, (AnonymousClass39Q) null, r8, (String) null, true), r7, Integer.valueOf(i), "new_payment", (String) null, 1);
    }

    public static boolean A17(AnonymousClass9DC r2) {
        return "p2m".equals(r2.A0p);
    }

    public PaymentView A74() {
        if (!(this instanceof AnonymousClass9DA)) {
            return ((BrazilPaymentActivity) this).A0W;
        }
        AnonymousClass9DA r1 = (AnonymousClass9DA) this;
        if (r1 instanceof AnonymousClass9Bs) {
            return ((AnonymousClass9Bs) r1).A0N;
        }
        return null;
    }

    public C30481mW A75(String str, List list) {
        C624134x r5;
        UserJid userJid;
        C45022Yj r3 = this.A0b;
        C95814uZ r4 = this.A0E;
        C626936e.A06(r4);
        AnonymousClass3YM r6 = new AnonymousClass3YM();
        long j = this.A02;
        if (j != 0) {
            r5 = this.A0e.A02.A01(j);
        } else {
            r5 = null;
        }
        C30481mW A002 = r3.A00(r4, r5, r6, str, list, 0);
        if (C627336j.A0K(this.A0E) && (userJid = this.A0G) != null) {
            A002.A1J(userJid);
        }
        return A002;
    }

    public void A76(int i) {
        Intent A1L;
        boolean z = this instanceof BrazilSmbPaymentActivity;
        C95814uZ r1 = this.A0E;
        if (z) {
            if (r1 != null) {
                A1L = new C627736r().A1L(this, this.A07.A01(r1));
                AnonymousClass5VI.A00(A1L, "BrazilSmbPaymentActivity");
                A1L.putExtra("show_keyboard", false);
                A1L.putExtra("start_t", SystemClock.uptimeMillis());
                if (i == 1) {
                    A1L.putExtra("extra_merchant_upsell_enabled", true);
                }
            }
            finish();
        }
        if (r1 != null) {
            A1L = new C627736r().A1L(this, this.A07.A01(r1));
            AnonymousClass5VI.A00(A1L, "BasePaymentsActivity");
            A1L.putExtra("show_keyboard", false);
            A1L.putExtra("start_t", SystemClock.uptimeMillis());
        }
        finish();
        this.A0Z.A00();
        A6T(A1L, false);
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0107, code lost:
        if (r0.A0R.contains(r0.A0N) != false) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A77(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = r0 instanceof X.AnonymousClass9DA
            if (r1 != 0) goto L_0x013b
            com.whatsapp.payments.ui.BrazilPaymentActivity r0 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r0
            boolean r1 = r0 instanceof com.whatsapp.payments.ui.BrazilOrderDetailsActivity
            if (r1 == 0) goto L_0x015d
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r0 = (com.whatsapp.payments.ui.BrazilOrderDetailsActivity) r0
            java.lang.String r1 = X.C1899593h.A0Z(r0)
            r0.A0d = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "extra_is_quick_buy"
            r4 = 0
            boolean r1 = r2.getBooleanExtra(r1, r4)
            r0.A0Q = r1
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "extra_quick_launch_option"
            r1 = -2
            int r1 = r3.getIntExtra(r2, r1)
            r0.A00 = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "extra_quick_launch_action"
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.A0N = r1
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
            r2 = 2131624353(0x7f0e01a1, float:1.8875883E38)
            r1 = 0
            android.view.View r1 = r3.inflate(r2, r1, r4)
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r1 = (com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2) r1
            r0.A0A = r1
            X.0R8 r4 = r0.getSupportActionBar()
            boolean r1 = r0.A0Q
            r3 = 1
            if (r1 != 0) goto L_0x0150
            java.util.Set r2 = r0.A0S
            int r1 = r0.A00
            boolean r1 = X.C18300x5.A1X(r2, r1)
            if (r1 != 0) goto L_0x0150
            java.util.Set r2 = r0.A0R
            java.lang.String r1 = r0.A0N
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L_0x0150
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r1 = r0.A0A
            r0.setContentView((android.view.View) r1)
            if (r4 == 0) goto L_0x0071
            r4.A0N(r3)
        L_0x0071:
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "extra_order_id"
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.A0L = r1
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "extra_payment_config_id"
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.A0M = r1
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r3 = "extra_order_expiry_ts_in_sec"
            r1 = 0
            long r1 = r4.getLongExtra(r3, r1)
            r0.A01 = r1
            android.content.Intent r1 = r0.getIntent()
            X.2z0 r1 = X.C107395bF.A02(r1)
            X.C626936e.A06(r1)
            r0.A0H = r1
            X.2sH r4 = r0.A06
            X.1VX r7 = r0.A0D
            X.5a2 r12 = r0.A0b
            android.content.res.Resources r2 = r0.getResources()
            X.9Wq r10 = r0.A0G
            X.3Lk r11 = r0.A0K
            X.33j r5 = r0.A06
            X.9U4 r9 = r0.A0P
            X.2rx r3 = r0.A03
            X.99n r8 = r0.A0O
            X.3Lo r6 = r0.A07
            X.9G5 r1 = new X.9G5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.A08 = r1
            r1.A00 = r0
            X.4FS r2 = r0.A04
            X.36F r1 = r0.A05
            X.9Rj r3 = new X.9Rj
            r3.<init>(r1, r0, r2)
            r0.A09 = r3
            X.08A r2 = r0.A06
            com.whatsapp.payments.ui.PaymentCheckoutOrderDetailsPresenter$$ExternalSyntheticLambda0 r1 = new com.whatsapp.payments.ui.PaymentCheckoutOrderDetailsPresenter$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r2.A00(r1)
            X.2sH r5 = r0.A06
            X.1VX r7 = r0.A0D
            X.4FS r14 = r0.A04
            X.33i r4 = r0.A08
            X.1io r6 = r0.A04
            X.2rx r3 = r0.A03
            X.1iY r9 = r0.A0F
            X.2cC r11 = r0.A0V
            com.whatsapp.jid.UserJid r8 = r0.A0G
            X.2z0 r13 = r0.A0H
            r15 = 1
            boolean r1 = r0.A0Q
            if (r1 != 0) goto L_0x0109
            java.util.Set r2 = r0.A0S
            int r1 = r0.A00
            boolean r1 = X.C18300x5.A1X(r2, r1)
            if (r1 != 0) goto L_0x0109
            java.util.Set r2 = r0.A0R
            java.lang.String r1 = r0.A0N
            boolean r1 = r2.contains(r1)
            r16 = 0
            if (r1 == 0) goto L_0x010b
        L_0x0109:
            r16 = 1
        L_0x010b:
            X.9Wq r12 = r0.A0G
            X.9U4 r10 = r0.A0P
            X.3Ai r2 = new X.3Ai
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.0XL r2 = X.AnonymousClass4L0.A0F(r2, r0)
            java.lang.Class<X.11I> r1 = X.AnonymousClass11I.class
            X.0Ty r1 = r2.A01(r1)
            X.11I r1 = (X.AnonymousClass11I) r1
            r0.A0B = r1
            r2 = r18
            if (r18 == 0) goto L_0x013c
            java.lang.String r1 = "save_order_detail_state_key"
            android.os.Bundle r1 = r2.getBundle(r1)
            if (r1 == 0) goto L_0x013c
            X.11I r1 = r0.A0B
            r1.A0E(r2)
        L_0x0133:
            X.11I r1 = r0.A0B
            X.0Wx r2 = r1.A02
            r1 = 6
            X.C205049qL.A02(r0, r2, r1)
        L_0x013b:
            return
        L_0x013c:
            X.9Wq r4 = r0.A0G
            com.whatsapp.jid.PhoneUserJid r3 = X.AnonymousClass4SG.A2m(r0)
            com.whatsapp.jid.UserJid r2 = r0.A0G
            java.lang.String r1 = "55"
            boolean r2 = r4.A0w(r3, r2, r1)
            X.11I r1 = r0.A0B
            r1.A0I(r2)
            goto L_0x0133
        L_0x0150:
            if (r4 == 0) goto L_0x0071
            r4.A06()
            r1 = 2131892992(0x7f121b00, float:1.9420748E38)
            r0.Bp9(r1)
            goto L_0x0071
        L_0x015d:
            r1 = 2131626010(0x7f0e081a, float:1.8879244E38)
            r0.setContentView((int) r1)
            boolean r1 = r0.A0f
            if (r1 == 0) goto L_0x016e
            androidx.appcompat.widget.Toolbar r1 = X.C1899593h.A07(r0)
            r0.setSupportActionBar(r1)
        L_0x016e:
            X.0R8 r4 = r0.getSupportActionBar()
            r7 = 1
            if (r4 == 0) goto L_0x0193
            android.content.Context r3 = r0.A02
            boolean r2 = r0.A0u
            r1 = 2131890966(0x7f121316, float:1.9416639E38)
            if (r2 == 0) goto L_0x0181
            r1 = 2131892092(0x7f12177c, float:1.9418923E38)
        L_0x0181:
            java.lang.String r1 = r3.getString(r1)
            r4.A0J(r1)
            r4.A0N(r7)
            boolean r1 = r0.A0u
            if (r1 != 0) goto L_0x0193
            r1 = 0
            r4.A08(r1)
        L_0x0193:
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "referral_screen"
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.A0d = r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01ad
            java.lang.String r1 = "extra_referral_screen"
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.A0d = r1
        L_0x01ad:
            java.lang.String r1 = r0.A0d
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01b9
            java.lang.String r1 = "new_payment"
            r0.A0d = r1
        L_0x01b9:
            X.3Lo r2 = r0.A07
            com.whatsapp.jid.UserJid r1 = r0.A0G
            X.C626936e.A06(r1)
            X.3ZH r1 = r2.A01(r1)
            r0.A09 = r1
            X.9U4 r1 = r0.A0P
            X.8EA r2 = X.AnonymousClass9U4.A03(r1)
            com.whatsapp.jid.UserJid r1 = r0.A0G
            X.6hl r1 = r2.A05(r1)
            r0.A0A = r1
            if (r1 == 0) goto L_0x01da
            com.whatsapp.jid.UserJid r1 = r1.A05
            if (r1 != 0) goto L_0x01e4
        L_0x01da:
            X.4FS r2 = r0.A04
            X.9fu r1 = new X.9fu
            r1.<init>(r0)
            r2.BkM(r1)
        L_0x01e4:
            X.99n r1 = r0.A0O
            boolean r1 = r1.A0F()
            if (r1 == 0) goto L_0x0225
            com.whatsapp.jid.UserJid r6 = r0.A0G
            X.99n r1 = r0.A0O
            boolean r1 = r1.A0E()
            if (r1 == 0) goto L_0x0225
            X.9U4 r1 = r0.A0P
            X.8EA r1 = X.AnonymousClass9U4.A03(r1)
            X.6hl r1 = r1.A05(r6)
            if (r1 == 0) goto L_0x0225
            long r4 = r1.A01
            X.2sH r1 = r0.A06
            long r2 = r1.A0H()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0225
            X.9GK r1 = r0.A0J
            if (r1 == 0) goto L_0x0215
            r1.A0D(r7)
        L_0x0215:
            X.9U4 r3 = r0.A0P
            X.3Cq r1 = r0.A05
            X.9GK r2 = new X.9GK
            r2.<init>(r1, r6, r3)
            r0.A0J = r2
            X.4FS r1 = r0.A04
            X.C18270x1.A0w(r2, r1)
        L_0x0225:
            X.1VX r1 = r0.A0D
            boolean r1 = X.C1899693i.A0w(r1)
            if (r1 == 0) goto L_0x0242
            X.1VX r2 = r0.A0D
            r1 = 979(0x3d3, float:1.372E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 != 0) goto L_0x0242
            int r1 = r0.A01
            r1 = r1 | 1
            r0.A01 = r1
            com.whatsapp.jid.UserJid r1 = r0.A0G
            r0.A7B(r1)
        L_0x0242:
            X.99n r1 = r0.A0O
            boolean r1 = r1.A0A()
            if (r1 == 0) goto L_0x027d
            X.3ZH r1 = r0.A09
            if (r1 == 0) goto L_0x027d
            boolean r1 = r1.A0R()
            if (r1 == 0) goto L_0x027d
            int r1 = r0.A01
            r1 = r1 | 2
            r0.A01 = r1
            r1 = 2131892992(0x7f121b00, float:1.9420748E38)
            r0.Bp9(r1)
            X.2cC r2 = r0.A0V
            com.whatsapp.jid.UserJid r4 = r0.A0G
            r3 = 0
            X.9cD r5 = new X.9cD
            r5.<init>(r0)
            r8 = 0
            X.C162457s7.A0J(r4, r8)
            X.1VX r1 = r2.A03
            r0 = 4443(0x115b, float:6.226E-42)
            r1.A0X(r0)
            X.2hG r2 = r2.A04
            r6 = r3
            r9 = r7
            r2.A01(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x027d:
            r1 = 0
            r0.A7R(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9DC.A77(android.os.Bundle):void");
    }

    public void A78(Bundle bundle) {
        Intent A082 = AnonymousClass0x9.A08(this, PaymentGroupParticipantPickerActivity.class);
        C95814uZ r0 = this.A0E;
        C626936e.A06(r0);
        A082.putExtra("extra_jid", r0.getRawString());
        if (bundle != null) {
            A082.putExtras(bundle);
        }
        startActivity(A082);
        finish();
    }

    public void A7A(AnonymousClass1S4 r4) {
        PaymentIncentiveViewModel paymentIncentiveViewModel;
        AnonymousClass9WE r0;
        AnonymousClass9VG r02;
        C194869Uu r03;
        if (C1899693i.A0w(this.A0D) && (paymentIncentiveViewModel = this.A0Y) != null && (r0 = (AnonymousClass9WE) paymentIncentiveViewModel.A02.A07()) != null && (r02 = (AnonymousClass9VG) r0.A01) != null && (r03 = r02.A01) != null) {
            r4.A00 = new AnonymousClass39O(String.valueOf(r03.A08.A01), (String) null, (String) null, (String) null);
        }
    }

    public void A7B(UserJid userJid) {
        if (this.A0Y == null) {
            PaymentIncentiveViewModel A0P2 = C1899593h.A0P(this);
            this.A0Y = A0P2;
            if (A0P2 != null) {
                C205049qL.A02(this, A0P2.A00, 2);
                C205049qL.A02(this, this.A0Y.A02, 3);
            }
        }
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A0Y;
        if (paymentIncentiveViewModel != null) {
            paymentIncentiveViewModel.A07.BkM(new C200649if(paymentIncentiveViewModel, false));
            PaymentIncentiveViewModel paymentIncentiveViewModel2 = this.A0Y;
            paymentIncentiveViewModel2.A07.BkM(new C200659ig(userJid, paymentIncentiveViewModel2));
        }
    }

    public void A7C(C203499no r9, AnonymousClass9VG r10) {
        C203499no r3 = r9;
        if (this instanceof BrazilPaymentActivity) {
            BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this;
            AnonymousClass9Wg.A02(AnonymousClass9Wg.A01(brazilPaymentActivity.A06, (AnonymousClass39Q) null, r10, brazilPaymentActivity.A0g), r3, 50, "new_payment", (String) null, 2);
            return;
        }
        AnonymousClass9Wg.A02(AnonymousClass9Wg.A00(this.A06, (AnonymousClass39Q) null, r10, (String) null, true), r3, 50, "new_payment", (String) null, 2);
    }

    public void A7D(C203499no r9, AnonymousClass9VG r10) {
        C203499no r3 = r9;
        if (this instanceof BrazilPaymentActivity) {
            BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this;
            AnonymousClass9Wg.A02(AnonymousClass9Wg.A01(brazilPaymentActivity.A06, (AnonymousClass39Q) null, r10, brazilPaymentActivity.A0g), r3, 47, "new_payment", (String) null, 1);
            return;
        }
        A16(this, r9, r10, 47);
    }

    public void BY7(PickerSearchDialogFragment pickerSearchDialogFragment) {
        this.A0a.A02(pickerSearchDialogFragment);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A0G = AnonymousClass32Y.A08(intent.getStringExtra("extra_receiver_jid"));
            A77(this.A03);
        } else if (i2 == 0 && this.A0G == null) {
            finish();
        }
    }

    public void A79(AnonymousClass39Q r14) {
        C624134x r10;
        PaymentView A74 = A74();
        if (A74 != null) {
            PaymentView A742 = A74();
            if (A742 == null || A742.getStickerIfSelected() == null) {
                this.A04.BkM(new C200949jH(r14, this, A74));
                A76(1);
                return;
            }
            Bp9(R.string.f11nameremoved);
            AnonymousClass9VS r6 = this.A0S;
            C626936e.A04(A74);
            AnonymousClass39M stickerIfSelected = A74.getStickerIfSelected();
            C626936e.A06(stickerIfSelected);
            C95814uZ r8 = this.A0E;
            C626936e.A06(r8);
            UserJid userJid = this.A0G;
            long j = this.A02;
            if (j != 0) {
                r10 = this.A0e.A02.A01(j);
            } else {
                r10 = null;
            }
            r6.A01(A74.getPaymentBackground(), r8, userJid, r10, stickerIfSelected, A74.getStickerSendOrigin()).A04(new C204999qG(A74, r14, this, 2), this.A05.A08);
        }
    }

    public void A7E(String str) {
        int i;
        PaymentView A74 = A74();
        if (A74 != null) {
            TextView A092 = AnonymousClass002.A09(A74, R.id.gift_tool_tip);
            if (C18280x3.A1W(A74.A0u.A03(), "payment_incentive_tooltip_viewed") || A092 == null || str == null) {
                i = 8;
            } else {
                A092.setText(str);
                i = 0;
            }
            A092.setVisibility(i);
            int i2 = this.A01;
            A74.A01 = i2;
            FrameLayout frameLayout = A74.A05;
            if (i2 != 0) {
                frameLayout.setVisibility(8);
                return;
            }
            frameLayout.setVisibility(0);
            C18270x1.A0l(C620933l.A00(A74.A0u), "payment_incentive_tooltip_viewed", true);
        }
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass9SU r1;
        C203719oC A012;
        Integer num;
        super.onCreate(bundle);
        this.A03 = bundle;
        if (getIntent() != null) {
            this.A00 = getIntent().getIntExtra("extra_conversation_message_type", 0);
            String stringExtra = getIntent().getStringExtra("extra_jid");
            C106405Yw r3 = C95814uZ.A00;
            this.A0E = r3.A05(stringExtra);
            this.A0D = r3.A05(getIntent().getStringExtra("extra_chat_jid"));
            String stringExtra2 = getIntent().getStringExtra("extra_receiver_jid");
            AnonymousClass32Y r4 = UserJid.Companion;
            this.A0G = r4.A0E(stringExtra2);
            getIntent().getStringExtra("extra_tpp_transaction_request_id");
            this.A02 = getIntent().getLongExtra("extra_quoted_msg_row_id", 0);
            this.A0k = getIntent().getStringExtra("extra_payment_preset_amount");
            this.A0o = getIntent().getStringExtra("extra_transaction_id");
            this.A0m = getIntent().getStringExtra("extra_payment_preset_min_amount");
            this.A0l = getIntent().getStringExtra("extra_payment_preset_max_amount");
            this.A0n = getIntent().getStringExtra("extra_request_message_key");
            this.A0u = getIntent().getBooleanExtra("extra_is_pay_money_only", true);
            this.A0j = getIntent().getStringExtra("extra_payment_note");
            this.A0B = (AnonymousClass39R) getIntent().getParcelableExtra("extra_payment_background");
            this.A0c = (AnonymousClass39M) getIntent().getParcelableExtra("extra_payment_sticker");
            int intExtra = getIntent().getIntExtra("extra_payment_sticker_send_origin", -1);
            if (intExtra != -1) {
                num = Integer.valueOf(intExtra);
            } else {
                num = null;
            }
            this.A0f = num;
            this.A0r = C624435a.A03(getIntent().getStringExtra("extra_mentioned_jids"));
            this.A0F = r4.A0E(getIntent().getStringExtra("extra_inviter_jid"));
            String stringExtra3 = getIntent().getStringExtra("extra_transaction_type");
            if (stringExtra3 == null) {
                stringExtra3 = "p2p";
            }
            this.A0p = stringExtra3;
            this.A0q = getIntent().getStringExtra("extra_transaction_token");
            this.A0t = getIntent().getBooleanExtra("extra_transaction_is_merchant", false);
            this.A0v = getIntent().getBooleanExtra("extra_transaction_is_valid_merchant", false);
            this.A0i = getIntent().getStringExtra("extra_order_type");
            this.A0h = getIntent().getStringExtra("extra_payment_config_id");
            this.A0g = getIntent().getStringExtra("extra_external_payment_source");
            this.A0s = getIntent().getBooleanExtra("extra_is_interop_add_payment_method", false);
        }
        String str = null;
        if (this.A0N.A02() != null) {
            r1 = this.A0P.A0F(this.A0N.A02().A03);
        } else {
            r1 = null;
        }
        C85204Fi A013 = this.A0N.A01();
        if (A013 != null) {
            str = ((AnonymousClass3H6) A013).A04;
        }
        if (r1 != null && (A012 = r1.A01(str)) != null && A012.BoD()) {
            AnonymousClass99P r32 = this.A04;
            Log.d("Bloks: BloksPayloadUtil: shouldConnectIgServer = false");
            if (!r32.A0G() || !r32.A0H()) {
                r32.A0F((C85034Er) null, "payment_view", true);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass9GK r1 = this.A0J;
        if (r1 != null) {
            r1.A0D(true);
            this.A0J = null;
        }
    }

    public void Bom(DialogFragment dialogFragment) {
        Boo(dialogFragment);
    }
}
