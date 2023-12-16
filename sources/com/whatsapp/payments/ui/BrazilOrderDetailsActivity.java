package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass11I;
import X.AnonymousClass1S4;
import X.AnonymousClass2z0;
import X.AnonymousClass32Y;
import X.AnonymousClass35F;
import X.AnonymousClass36F;
import X.AnonymousClass38V;
import X.AnonymousClass394;
import X.AnonymousClass399;
import X.AnonymousClass39L;
import X.AnonymousClass39Q;
import X.AnonymousClass39S;
import X.AnonymousClass39W;
import X.AnonymousClass3QO;
import X.AnonymousClass3SR;
import X.AnonymousClass4DV;
import X.AnonymousClass4FS;
import X.AnonymousClass5V0;
import X.AnonymousClass8EA;
import X.AnonymousClass97T;
import X.AnonymousClass99M;
import X.AnonymousClass9G5;
import X.AnonymousClass9QL;
import X.AnonymousClass9WE;
import X.AnonymousClass9XZ;
import X.AnonymousClass9b0;
import X.AnonymousClass9dG;
import X.C107695bk;
import X.C160757oG;
import X.C162457s7;
import X.C166587yw;
import X.C18280x3;
import X.C182838p4;
import X.C18290x4;
import X.C18300x5;
import X.C1899593h;
import X.C1899693i;
import X.C19340zH;
import X.C194049Rj;
import X.C194069Rl;
import X.C194229Sb;
import X.C195219Wq;
import X.C195319Xg;
import X.C195339Xj;
import X.C196539b2;
import X.C200229hz;
import X.C202799mb;
import X.C203159nD;
import X.C203479nl;
import X.C204019og;
import X.C204159ou;
import X.C204219p0;
import X.C29431io;
import X.C30791n7;
import X.C55502qS;
import X.C55942rA;
import X.C56422rx;
import X.C60952zR;
import X.C621033m;
import X.C624034w;
import X.C626936e;
import X.C627736r;
import X.C64333Db;
import X.C66433Lk;
import X.C66543Lv;
import X.C85184Fg;
import X.C86604Kt;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C88834as;
import X.C95814uZ;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.whatsapp.R;
import com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;
import com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrazilOrderDetailsActivity extends BrazilPaymentActivity implements C203479nl, C203159nD, C182838p4, C202799mb {
    public int A00;
    public long A01;
    public C621033m A02;
    public C56422rx A03;
    public C29431io A04;
    public AnonymousClass36F A05;
    public AnonymousClass8EA A06;
    public AnonymousClass9b0 A07;
    public AnonymousClass9G5 A08;
    public C194049Rj A09;
    public PaymentCheckoutOrderDetailsViewV2 A0A;
    public AnonymousClass11I A0B;
    public C194069Rl A0C;
    public AnonymousClass9QL A0D;
    public C194229Sb A0E;
    public AnonymousClass9WE A0F;
    public C195219Wq A0G;
    public AnonymousClass2z0 A0H;
    public C30791n7 A0I;
    public C55942rA A0J;
    public C66433Lk A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public List A0O;
    public boolean A0P;
    public boolean A0Q;
    public final Set A0R;
    public final Set A0S;

    public void BXP(C95814uZ r16, AnonymousClass4DV r17, String str) {
        AnonymousClass2z0 r11;
        AnonymousClass4DV r1 = r17;
        this.A0J.A02(r1, A7T(), (String) null, (List) null, 7, true, false, false);
        AnonymousClass39W B5s = r1.B5s();
        C626936e.A06(B5s);
        AnonymousClass39S r10 = B5s.A01;
        C194229Sb r8 = this.A0E;
        C626936e.A06(r10);
        if (!TextUtils.isEmpty(r10.A02)) {
            r11 = this.A0H;
        } else {
            r11 = null;
        }
        Intent A002 = r8.A00(this, r10, r11, (String) null, str, (String) null);
        if (A002 == null) {
            Log.e("Pay: BrazilOrderDetailsActivity/onOpenTransactionDetailClicked the transaction details intent is null");
        } else {
            startActivity(A002);
        }
    }

    public void A5r() {
        if (!this.A0P) {
            this.A0P = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r1 = A0I2.A4Z;
            C1899593h.A15(r1, this);
            C107695bk r2 = r1.A00;
            C1899593h.A0z(r1, r2, this, C1899593h.A0W(r1, r2, this));
            AnonymousClass97T.A0h(A0I2, r1, r2, this);
            AnonymousClass97T.A0i(A0I2, r1, r2, this, C1899693i.A0Y(r1));
            AnonymousClass97T.A0l(r1, r2, this);
            AnonymousClass97T.A0j(A0I2, r1, r2, this, AnonymousClass97T.A0a(r1, r2, this));
            this.A02 = (C621033m) r1.AZL.get();
            this.A06 = (AnonymousClass8EA) r1.ASG.get();
            this.A0E = (C194229Sb) r2.A8h.get();
            this.A0G = C1899693i.A0S(r1);
            this.A0K = C86604Kt.A0e(r1);
            this.A04 = C86634Kw.A0g(r1);
            this.A03 = C86644Kx.A0S(r1);
            this.A05 = C1899693i.A0A(r1);
            this.A07 = (AnonymousClass9b0) r1.APz.get();
            this.A0J = (C55942rA) r1.AOm.get();
        }
    }

    public void A7K(C195319Xg r13, AnonymousClass39Q r14, C166587yw r15, AnonymousClass3QO r16, String str, String str2, String str3, int i) {
        Integer num;
        this.A04.BkM(new C200229hz(this, str2));
        if (r13 != null) {
            num = Integer.valueOf(r13.A01);
        } else {
            num = null;
        }
        this.A0J.A02(this.A0I, num, "native", this.A0C.A00(), 19, false, false, true);
        super.A7K(r13, r14, r15, r16, str, str2, str3, i);
    }

    public final Integer A7T() {
        Integer num;
        AnonymousClass1S4 r0;
        C195319Xg A0D2;
        AnonymousClass9QL r2 = this.A0D;
        AnonymousClass9XZ r02 = r2.A09;
        if (r02 != null) {
            num = Integer.valueOf(r02.A00);
        } else {
            num = null;
        }
        C624034w r03 = r2.A07;
        if (r03 == null || (r0 = r03.A0A) == null || (A0D2 = r0.A0D()) == null) {
            return num;
        }
        return Integer.valueOf(A0D2.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        if ("chat".equals(r12) == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7U(X.AnonymousClass39L r8, X.C95814uZ r9, X.AnonymousClass3SR r10, java.lang.String r11, java.lang.String r12) {
        /*
            r7 = this;
            java.util.Set r1 = r7.A0S
            int r0 = r7.A00
            boolean r3 = X.C18300x5.A1X(r1, r0)
            X.1n7 r0 = r7.A0I
            X.39W r0 = r0.A00
            X.C626936e.A06(r0)
            X.C626936e.A06(r9)
            X.39S r0 = r0.A01
            X.C626936e.A06(r0)
            java.lang.String r6 = r0.A0E
            X.1VX r1 = r7.A0D
            r0 = 1345(0x541, float:1.885E-42)
            boolean r4 = r1.A0X(r0)
            if (r3 == 0) goto L_0x002c
            java.lang.String r0 = "chat"
            boolean r0 = r0.equals(r12)
            r1 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            java.lang.String r5 = "merchantJid"
            X.C18260x0.A0R(r11, r8)
            r0 = 7
            X.C162457s7.A0J(r10, r0)
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r0 = "total_amount"
            r2.putString(r0, r11)
            java.lang.String r0 = "referenceId"
            r2.putString(r0, r6)
            java.lang.String r0 = r9.getRawString()
            r2.putString(r5, r0)
            java.lang.String r0 = "payment_settings"
            r2.putParcelable(r0, r10)
            java.lang.String r0 = "total_amount_money_representation"
            r2.putParcelable(r0, r8)
            java.lang.String r0 = "referral_screen"
            r2.putString(r0, r12)
            java.lang.String r0 = "should_log_event"
            r2.putBoolean(r0, r4)
            java.lang.String r0 = "is_quick_launch_enabled"
            r2.putBoolean(r0, r3)
            java.lang.String r0 = "show_snackbar_on_copy_enabled"
            r2.putBoolean(r0, r1)
            com.whatsapp.payments.ui.BrazilPixBottomSheet r1 = new com.whatsapp.payments.ui.BrazilPixBottomSheet
            r1.<init>()
            r1.A0u(r2)
            X.9XA r0 = r1.A05
            r0.A00 = r7
            X.C86644Kx.A1C(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilOrderDetailsActivity.A7U(X.39L, X.4uZ, X.3SR, java.lang.String, java.lang.String):void");
    }

    public final void A7W(AnonymousClass4DV r11, int i) {
        C55942rA r1 = this.A0J;
        List A002 = this.A0C.A00();
        AnonymousClass4DV r2 = r11;
        r1.A02(r2, A7T(), C195219Wq.A06(i), A002, 5, true, true, true);
    }

    public void BOs(AnonymousClass39L r20, C95814uZ r21, AnonymousClass9XZ r22, C194069Rl r23, AnonymousClass4DV r24, String str, String str2, String str3, HashMap hashMap) {
        AnonymousClass394 r4;
        boolean z = true;
        try {
            C160757oG.A01("BrazilOrderDetailsActivity", "invalid merchant JID");
            C194069Rl r15 = r23;
            C626936e.A0E(AnonymousClass000.A1W(r15), C160757oG.A01("BrazilOrderDetailsActivity", "invalid payment method"));
            AnonymousClass4DV r3 = r24;
            if (r3.B5s() == null) {
                z = false;
            }
            C626936e.A0E(z, C160757oG.A01("BrazilOrderDetailsActivity", "invalid message content"));
            C194069Rl r5 = (C194069Rl) C18290x4.A0j(hashMap, 6);
            int i = r15.A01;
            AnonymousClass39L r11 = r20;
            C95814uZ r12 = r21;
            AnonymousClass9XZ r14 = r22;
            String str4 = str2;
            if (i != -1) {
                String str5 = str3;
                if (i == 0) {
                    A7V(r11, r14, r3, str5);
                } else if (i == 2) {
                    AnonymousClass399 r1 = r15.A02;
                    if (r1 == null) {
                        C1899593h.A1Q("BrazilOrderDetailsActivity", "invalid external payemnt configuration payload");
                        return;
                    }
                    C626936e.A06(r12);
                    String str6 = r1.A00;
                    C626936e.A06(str6);
                    C626936e.A06(r12);
                    C626936e.A06(str6);
                    PaymentCustomInstructionsBottomSheet A002 = PaymentCustomInstructionsBottomSheet.A00(r12, str6, str5, this.A0D.A0X(1345));
                    A002.A04.A00 = this;
                    C86644Kx.A1C(A002, this);
                } else if (i == 3) {
                    AnonymousClass39S A003 = AnonymousClass11I.A00(r3, (String) null, "confirm", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
                    AnonymousClass11I r13 = this.A0B;
                    C55502qS A004 = r13.A04.A00(AnonymousClass32Y.A05(r13.A09));
                    if (A004 == null || !A004.A02()) {
                        AnonymousClass11I r16 = this.A0B;
                        C626936e.A06(r12);
                        r16.A0H(r12, A003, r3);
                    } else {
                        this.A02.A0I(r12, getString(R.string.f11nameremoved));
                    }
                    this.A0V.A00(A003, r3);
                    this.A0J.A02(this.A0I, A7T(), "confirm", this.A0C.A00(), 19, false, false, true);
                    finish();
                } else if (i != 6) {
                    C1899593h.A1Q("BrazilOrderDetailsActivity", "onCheckoutCtaButtonClicked : the selected payment method is not supported");
                } else if (!(r5 == null || (r4 = r5.A03) == null)) {
                    String str7 = r4.A01;
                    if ("pix_static_code".equals(str7) || "pix_dynamic_code".equals(str7)) {
                        C85184Fg r2 = r4.A00;
                        if (r2 instanceof AnonymousClass3SR) {
                            C626936e.A06(r12);
                            C626936e.A06(str4);
                            C626936e.A06(r11);
                            A7U(r11, r12, (AnonymousClass3SR) r2, str4, str5);
                        }
                    }
                }
            } else {
                List list = r15.A04;
                C626936e.A06(list);
                String str8 = ((C195339Xj) list.get(0)).A0A;
                C626936e.A06(list);
                PaymentOptionsBottomSheet A005 = PaymentOptionsBottomSheet.A00(str8, "order_details", list, this.A0D.A0X(1345));
                A005.A04.A00 = this;
                A005.A06 = new AnonymousClass9dG(r11, r12, this, r14, r15, r5, r3, str4);
                C86644Kx.A1C(A005, this);
            }
            A7W(r3, i);
        } catch (IllegalArgumentException e) {
            Log.e((Throwable) e);
        }
    }

    public void BPf(C95814uZ r11) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        C30791n7 r3 = this.A0I;
        C162457s7.A0J(r3, 2);
        AnonymousClass39S A002 = AnonymousClass11I.A00(r3, (String) null, "payment_instruction", seconds);
        AnonymousClass11I r0 = this.A0B;
        C55502qS A003 = r0.A04.A00(AnonymousClass32Y.A05(r0.A09));
        if (A003 == null || !A003.A02()) {
            AnonymousClass11I r1 = this.A0B;
            C626936e.A06(r11);
            r1.A0H(r11, A002, this.A0I);
        } else {
            this.A02.A0I(r11, getString(R.string.f11nameremoved));
        }
        this.A0V.A00(A002, this.A0I);
        this.A0J.A02(this.A0I, A7T(), "cpi", this.A0C.A00(), 19, false, false, true);
        finish();
    }

    public void BPj(C95814uZ r11, int i) {
        AnonymousClass39S A0D2 = this.A0B.A0D(this.A0I, "pending", i);
        AnonymousClass11I r1 = this.A0B;
        C626936e.A06(r11);
        r1.A0H(r11, A0D2, this.A0I);
        C55942rA r12 = this.A0J;
        C30791n7 r2 = this.A0I;
        List A002 = this.A0C.A00();
        r12.A02(r2, A7T(), C195219Wq.A06(i), A002, 19, false, false, true);
        finish();
    }

    public void BQJ(AnonymousClass39L r5, C95814uZ r6, AnonymousClass3SR r7, String str, boolean z) {
        ClipboardManager A0C2 = this.A0B.A05.A0C();
        if (A0C2 != null) {
            try {
                A0C2.setPrimaryClip(ClipData.newPlainText("pix_code", str));
                this.A0B.A0D(this.A0I, "pending_buyer_confirmation", 6);
                if (z) {
                    boolean A0X = this.A0D.A0X(1345);
                    Bundle A082 = AnonymousClass002.A08();
                    A082.putString("referral_screen", "order_details");
                    A082.putBoolean("should_log_event", A0X);
                    BrazilContentCopiedBottomSheet brazilContentCopiedBottomSheet = new BrazilContentCopiedBottomSheet();
                    brazilContentCopiedBottomSheet.A0u(A082);
                    brazilContentCopiedBottomSheet.A00.A00 = this;
                    C86644Kx.A1C(brazilContentCopiedBottomSheet, this);
                    return;
                }
                return;
            } catch (NullPointerException | SecurityException e) {
                Log.e("serializeAndCopyPixCodeToClipboard/clipboard/", e);
            }
        }
        C1899593h.A1Q("BrazilOrderDetailActivity", "onCopyPixKeyCTAClicked failed");
    }

    public void BWT(C95814uZ r10, AnonymousClass4DV r11, long j) {
        this.A0J.A02(r11, A7T(), (String) null, (List) null, 8, false, false, false);
        Intent A1N = new C627736r().A1N(this, r10);
        A1N.putExtra("extra_quoted_message_row_id", j);
        startActivity(A1N);
    }

    public void Ba7(int i) {
        this.A0B.A0D(this.A0I, "unset", -1);
        C55942rA r1 = this.A0J;
        C30791n7 r2 = this.A0I;
        List A002 = this.A0C.A00();
        r1.A02(r2, A7T(), C195219Wq.A06(i), A002, 35, false, false, true);
    }

    public boolean BoU(int i) {
        if (i == 405 || i == 401 || i == 403 || i == 420) {
            return true;
        }
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C60952zR r3;
        AnonymousClass38V r1;
        AnonymousClass9WE r0 = this.A0F;
        if (!(r0 == null || (r3 = (C60952zR) r0.A01) == null)) {
            Bundle A082 = AnonymousClass002.A08();
            Boolean bool = r3.A05;
            if (bool != null) {
                A082.putBoolean("should_show_shimmer_key", bool.booleanValue());
            }
            A082.putParcelable("checkout_error_code_key", r3.A02);
            A082.putParcelable("merchant_jid_key", r3.A01);
            A082.putSerializable("merchant_status_key", r3.A03);
            C30791n7 r02 = r3.A04;
            if (r02 != null) {
                C624034w r03 = r02.A0P;
                if (r03 == null) {
                    r1 = null;
                } else {
                    r1 = new AnonymousClass38V(r03);
                }
                A082.putParcelable("payment_transaction_key", r1);
            }
            List list = r3.A06;
            if (list != null) {
                A082.putParcelableArrayList("installment_option_key", AnonymousClass002.A0J(list));
            }
            bundle.putBundle("save_order_detail_state_key", A082);
        }
        super.onSaveInstanceState(bundle);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A0Q && !C18300x5.A1X(this.A0S, this.A00)) {
            return super.onTouchEvent(motionEvent);
        }
        C86624Kv.A0f(this);
        return true;
    }

    public BrazilOrderDetailsActivity(int i) {
        this.A0P = false;
        C204019og.A00(this, 23);
    }

    public void A7O(AnonymousClass99M r2, int i) {
        super.A7O(r2, i);
        r2.A02 = A7F();
    }

    public final void A7V(AnonymousClass39L r14, AnonymousClass9XZ r15, AnonymousClass4DV r16, String str) {
        Bp9(R.string.f11nameremoved);
        AnonymousClass4FS r6 = this.A04;
        C66543Lv r1 = this.A08;
        AnonymousClass9b0 r3 = this.A07;
        AnonymousClass4DV r5 = r16;
        AnonymousClass35F.A02(this.A05, r1, this.A05, r3, new C196539b2(r14, this, r15, r5, str), r5, r6);
    }

    public void Boy(C624034w r10, C95814uZ r11, long j) {
        int i = R.string.f11nameremoved;
        int i2 = R.string.f11nameremoved;
        int i3 = r10.A02;
        if (i3 == 401 || i3 == 403 || i3 == 420) {
            i = R.string.f11nameremoved;
            i2 = R.string.f11nameremoved;
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0i(false);
        A002.A0h(getString(i));
        C19340zH.A01(this, A002, i2);
        C204219p0.A01(A002, this, 5, R.string.f11nameremoved);
        A002.A0W(new C204159ou(r11, this, 0, j), R.string.f11nameremoved);
        C18280x3.A0q(A002);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if ((this.A0Q || C18300x5.A1X(this.A0S, this.A00)) && i2 == 0) {
            C86624Kv.A0f(this);
        }
    }

    public void onStart() {
        super.onStart();
        if (this.A0Q || C18300x5.A1X(this.A0S, this.A00)) {
            overridePendingTransition(0, 0);
        }
    }

    public void BXN(String str) {
    }

    public void BXu(AnonymousClass39L r1, AnonymousClass4DV r2, String str, String str2, List list) {
    }

    public BrazilOrderDetailsActivity() {
        this(0);
        Integer[] numArr = new Integer[3];
        AnonymousClass000.A1P(numArr, -1, 0);
        numArr[1] = 6;
        AnonymousClass000.A1P(numArr, 0, 2);
        this.A0S = C18280x3.A0h(numArr);
        this.A0R = C18280x3.A0h(new String[]{"canceled", "completed"});
    }
}
