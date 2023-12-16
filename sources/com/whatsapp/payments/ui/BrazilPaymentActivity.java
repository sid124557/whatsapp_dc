package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1S3;
import X.AnonymousClass1VX;
import X.AnonymousClass33O;
import X.AnonymousClass39L;
import X.AnonymousClass39M;
import X.AnonymousClass39Q;
import X.AnonymousClass39U;
import X.AnonymousClass3QO;
import X.AnonymousClass3XA;
import X.AnonymousClass3ZH;
import X.AnonymousClass4DI;
import X.AnonymousClass4FS;
import X.AnonymousClass5V0;
import X.AnonymousClass5XO;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZU;
import X.AnonymousClass97S;
import X.AnonymousClass97T;
import X.AnonymousClass987;
import X.AnonymousClass99M;
import X.AnonymousClass9B2;
import X.AnonymousClass9BE;
import X.AnonymousClass9DC;
import X.AnonymousClass9NL;
import X.AnonymousClass9OY;
import X.AnonymousClass9OZ;
import X.AnonymousClass9PQ;
import X.AnonymousClass9QF;
import X.AnonymousClass9QH;
import X.AnonymousClass9RU;
import X.AnonymousClass9RV;
import X.AnonymousClass9SD;
import X.AnonymousClass9SH;
import X.AnonymousClass9TJ;
import X.AnonymousClass9TR;
import X.AnonymousClass9TZ;
import X.AnonymousClass9U4;
import X.AnonymousClass9U5;
import X.AnonymousClass9UF;
import X.AnonymousClass9VE;
import X.AnonymousClass9VG;
import X.AnonymousClass9VU;
import X.AnonymousClass9W1;
import X.AnonymousClass9W3;
import X.AnonymousClass9Wg;
import X.AnonymousClass9XZ;
import X.AnonymousClass9bR;
import X.C009707r;
import X.C106715a2;
import X.C133786hw;
import X.C133796hx;
import X.C158777kX;
import X.C166587yw;
import X.C18270x1;
import X.C185418tc;
import X.C1899693i;
import X.C191889Gv;
import X.C193099Nd;
import X.C193319Oa;
import X.C193329Ob;
import X.C19340zH;
import X.C193599Pg;
import X.C194029Rh;
import X.C194089Rn;
import X.C194219Sa;
import X.C194259Se;
import X.C194399Ss;
import X.C194569Tl;
import X.C194589Tn;
import X.C194649Ty;
import X.C194869Uu;
import X.C194929Vc;
import X.C194969Vi;
import X.C195089Vv;
import X.C195169Wk;
import X.C195319Xg;
import X.C196379ak;
import X.C196409an;
import X.C196709bc;
import X.C196999cI;
import X.C197239cn;
import X.C197529dM;
import X.C197549dU;
import X.C198019eF;
import X.C198049eI;
import X.C198059eJ;
import X.C199919hU;
import X.C202459m3;
import X.C202829me;
import X.C203409ne;
import X.C203499no;
import X.C203769oH;
import X.C203879oS;
import X.C204379pG;
import X.C204629pf;
import X.C205009qH;
import X.C29251iW;
import X.C29271iY;
import X.C30481mW;
import X.C40602Ha;
import X.C43942Ub;
import X.C56612sH;
import X.C56972sr;
import X.C59942xk;
import X.C60042xu;
import X.C60152y5;
import X.C617332a;
import X.C620633i;
import X.C620733j;
import X.C620933l;
import X.C626936e;
import X.C627336j;
import X.C69263Wi;
import X.C85204Fi;
import X.C86614Ku;
import X.C95814uZ;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.jid.UserJid;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.CheckFirstTransaction;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.payments.ui.widget.PaymentView$$ExternalSyntheticLambda4;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class BrazilPaymentActivity extends AnonymousClass9BE implements C203409ne, C203769oH, C202829me, C202459m3 {
    public int A00;
    public int A01 = 0;
    public Context A02;
    public BottomSheetBehavior A03;
    public AnonymousClass3XA A04;
    public AnonymousClass5ZU A05;
    public C620733j A06;
    public C617332a A07;
    public AnonymousClass9bR A08;
    public C195089Vv A09;
    public C196709bc A0A;
    public C194929Vc A0B;
    public CheckFirstTransaction A0C;
    public C29251iW A0D;
    public C620933l A0E;
    public C29271iY A0F;
    public AnonymousClass9RU A0G;
    public AnonymousClass9RV A0H;
    public C194589Tn A0I;
    public AnonymousClass9VU A0J;
    public AnonymousClass9TZ A0K;
    public C203499no A0L;
    public AnonymousClass9SD A0M;
    public C194029Rh A0N;
    public AnonymousClass9B2 A0O;
    public AnonymousClass9W3 A0P;
    public AnonymousClass9TR A0Q;
    public AnonymousClass9TJ A0R;
    public C194649Ty A0S;
    public ConfirmPaymentFragment A0T;
    public C158777kX A0U;
    public C194399Ss A0V;
    public PaymentView A0W;
    public AnonymousClass9W1 A0X;
    public C194219Sa A0Y;
    public C194259Se A0Z;
    public C60152y5 A0a;
    public C106715a2 A0b;
    public AnonymousClass5XO A0c;
    public String A0d;
    public String A0e;
    public boolean A0f;
    public boolean A0g = false;
    public boolean A0h = false;
    public final C43942Ub A0i = new C203879oS(this, 0);
    public final AnonymousClass4DI A0j = new AnonymousClass9UF(this, 1);

    public C59942xk A7H(AnonymousClass39Q r5, int i) {
        C194869Uu r2;
        if (i == 0 && (r2 = this.A0T.A00().A01) != null) {
            if (r5.A00.compareTo(r2.A09.A00.A02.A00) >= 0) {
                return r2.A08;
            }
        }
        return null;
    }

    public void A7K(C195319Xg r12, AnonymousClass39Q r13, C166587yw r14, AnonymousClass3QO r15, String str, String str2, String str3, int i) {
        String paymentNote;
        List mentionedJids;
        PaymentView paymentView = this.A0W;
        if (paymentView == null) {
            mentionedJids = AnonymousClass001.A0s();
            paymentNote = "";
        } else {
            paymentNote = paymentView.getPaymentNote();
            mentionedJids = this.A0W.getMentionedJids();
        }
        C30481mW A75 = A75(paymentNote, mentionedJids);
        AnonymousClass99M r6 = new AnonymousClass99M();
        r6.A03 = str;
        r6.A05 = A75.A1J.A01;
        r6.A04 = this.A0Z.A01();
        A7O(r6, i);
        r6.A01 = r12;
        CheckFirstTransaction checkFirstTransaction = this.A0C;
        AnonymousClass39Q r3 = r13;
        C166587yw r4 = r14;
        AnonymousClass3QO r5 = r15;
        String str4 = str2;
        String str5 = str3;
        if (checkFirstTransaction != null) {
            checkFirstTransaction.A00.A03(new C198059eJ(r3, r4, r5, r6, this, A75, str4, str5));
            return;
        }
        C85204Fi A012 = this.A07.A01("BRL");
        C18270x1.A0w(new C191889Gv(A012, r3, r4, r5, r6, this, A75, str4, str5), this.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r15.A0O.A02.A0X(2928) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7M(X.AnonymousClass39Q r16, X.AnonymousClass9XZ r17, java.lang.String r18, java.lang.String r19) {
        /*
            r15 = this;
            r5 = r15
            X.9Ty r4 = r15.A0S
            java.lang.String r0 = "p2m_context"
            r7 = r18
            boolean r0 = r0.equals(r7)
            java.lang.String r3 = "p2p_context"
            if (r0 == 0) goto L_0x001c
            X.99n r0 = r15.A0O
            X.1VX r1 = r0.A02
            r0 = 2928(0xb70, float:4.103E-42)
            boolean r0 = r1.A0X(r0)
            r1 = r7
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            r2 = 0
            java.lang.String r0 = "merchant_account_linking_context"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0049
            java.lang.String r1 = r4.A02()
        L_0x002a:
            r8 = r19
            if (r1 != 0) goto L_0x0059
            boolean r0 = r15.A7S()
            r4 = r16
            r6 = r17
            if (r0 == 0) goto L_0x004e
            boolean r0 = r3.equals(r7)
            if (r0 == 0) goto L_0x004e
            X.9dN r3 = new X.9dN
            r3.<init>(r4, r5, r6, r7, r8)
            X.9no r0 = r15.A0L
            X.AnonymousClass97T.A0r(r15, r0, r3, r8)
            return
        L_0x0049:
            java.lang.String r1 = r4.A03(r1, r2)
            goto L_0x002a
        L_0x004e:
            boolean r14 = r15.A0g
            r9 = r15
            r10 = r4
            r11 = r6
            r12 = r7
            r13 = r8
            r9.A7N(r10, r11, r12, r13, r14)
            return
        L_0x0059:
            java.lang.String r0 = "brpay_p_account_recovery_eligibility_screen"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0067
            X.9W1 r0 = r15.A0X
            r0.A02(r15, r7, r8)
            return
        L_0x0067:
            r15.A7Q(r1, r7, r2, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPaymentActivity.A7M(X.39Q, X.9XZ, java.lang.String, java.lang.String):void");
    }

    public void A7N(AnonymousClass39Q r10, AnonymousClass9XZ r11, String str, String str2, boolean z) {
        this.A04.A02();
        AnonymousClass3XA A022 = AnonymousClass9U4.A00(this.A0P).A02();
        this.A04 = A022;
        A022.A04(new C198049eI(r10, this, r11, str, str2, z), this.A05.A08);
    }

    public void A7O(AnonymousClass99M r2, int i) {
        if (i == 1) {
            A7A(r2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        this.A04.A02();
        AnonymousClass3XA A022 = AnonymousClass9U4.A00(this.A0P).A02();
        this.A04 = A022;
        if (i2 == -1) {
            A022.A04(new C205009qH(intent, 6, this), this.A05.A08);
        }
    }

    public static boolean A14(C166587yw r3, int i) {
        String str;
        C133786hw r1 = (C133786hw) r3.A08;
        if (r1 != null && C195169Wk.A08(r3)) {
            if (i == 1) {
                String str2 = r1.A0N;
                if (str2 == null || !(!"DISABLED".equals(str2))) {
                    return true;
                }
            } else if (i != 0 || ((str = r1.A0L) != null && (!"DISABLED".equals(str)))) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass39U A7F() {
        String str;
        if (!(this instanceof BrazilOrderDetailsActivity)) {
            return null;
        }
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = (BrazilOrderDetailsActivity) this;
        String str2 = brazilOrderDetailsActivity.A0L;
        C626936e.A06(str2);
        String str3 = brazilOrderDetailsActivity.A0H.A01;
        long j = brazilOrderDetailsActivity.A01;
        if (brazilOrderDetailsActivity.A0O.A02.A0X(2178)) {
            str = brazilOrderDetailsActivity.A0M;
        } else {
            str = null;
        }
        return new AnonymousClass39U(str2, str3, str, brazilOrderDetailsActivity.A0i, brazilOrderDetailsActivity.A0O, j);
    }

    public AnonymousClass9VE A7G(C195319Xg r44, C166587yw r45, AnonymousClass39L r46, String str, String str2, String str3) {
        String str4;
        C133796hx r12;
        C56612sH r42 = this.A06;
        AnonymousClass1VX r21 = this.A0D;
        C69263Wi r41 = this.A05;
        C56972sr r40 = this.A01;
        AnonymousClass4FS r16 = this.A04;
        C194089Rn r14 = this.A0Q;
        AnonymousClass9U4 r10 = this.A0P;
        C194259Se r9 = this.A0Z;
        AnonymousClass9SD r8 = this.A0M;
        AnonymousClass9TR r7 = this.A0Q;
        AnonymousClass9U5 r6 = this.A0M;
        C194969Vi r5 = this.A0T;
        C40602Ha r4 = this.A0K;
        AnonymousClass9W3 r3 = this.A0P;
        AnonymousClass9VU r2 = this.A0J;
        C166587yw r15 = r45;
        String str5 = r15.A0A;
        UserJid userJid = this.A0G;
        C626936e.A06(userJid);
        if (r15.A08() != 6 || (r12 = r15.A08) == null) {
            str4 = null;
        } else if (((C133786hw) r12).A03 == 1) {
            str4 = "debit";
        } else {
            str4 = "credit";
        }
        AnonymousClass39L r152 = r46;
        AnonymousClass39L r18 = r152;
        AnonymousClass4FS r34 = r16;
        AnonymousClass39L r19 = r152;
        C194089Rn r26 = r14;
        return new AnonymousClass9VE(this, r41, r40, r42, r44, r18, r19, A7F(), r21, userJid, r4, r6, r10, r26, r2, r8, r5, A7H(r152.A02, this.A01), r3, r7, r9, r34, str5, str3, str4, str, str2);
    }

    public final void A7I() {
        if (this.A01 == 0) {
            AnonymousClass9Wg.A03(AnonymousClass9Wg.A01(this.A06, (AnonymousClass39Q) null, this.A0U, this.A0g), this.A0L, "new_payment", this.A0d);
        }
    }

    public final void A7P(String str) {
        if (this.A0O.A02.A0X(2984)) {
            BjL();
            C166587yw A022 = AnonymousClass9U4.A02(this.A0P, str);
            C626936e.A06(A022);
            C133786hw r2 = (C133786hw) A022.A08;
            if (r2 != null) {
                String str2 = r2.A0F;
                if (str2.equals("NEEDS_RETOKENIZATION") || str2.equals("NEEDS_RETOKENIZATION_DELETED")) {
                    BpY(AnonymousClass97S.A0C(this, r2, str), 1);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (r0 != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A7Q(java.lang.String r13, java.lang.String r14, boolean r15, java.lang.String r16) {
        /*
            r12 = this;
            X.9dC r6 = new X.9dC
            r7 = r12
            r9 = r13
            r8 = r14
            r11 = r15
            r10 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            X.9Ty r0 = r12.A0S
            boolean r0 = r0.A09(r14)
            if (r0 == 0) goto L_0x0029
            com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet r5 = X.AnonymousClass9UL.A00(r10)
            r1 = 1
            X.9pn r0 = new X.9pn
            r0.<init>(r12, r1)
            r5.A02 = r0
        L_0x001f:
            X.9XA r0 = r5.A03
            r0.A00 = r12
            r5.A01 = r6
        L_0x0025:
            r12.Boo(r5)
            return
        L_0x0029:
            X.1VX r1 = r12.A0D
            r0 = 3013(0xbc5, float:4.222E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "p2p_context"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0040
            com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet r5 = X.AnonymousClass9UL.A01(r10)
            goto L_0x001f
        L_0x0040:
            if (r15 == 0) goto L_0x0066
            r4 = 2131886343(0x7f120107, float:1.9407262E38)
            r3 = 2131886342(0x7f120106, float:1.940726E38)
            r2 = 2131886341(0x7f120105, float:1.9407258E38)
            com.whatsapp.payments.ui.AddPaymentMethodBottomSheet r5 = new com.whatsapp.payments.ui.AddPaymentMethodBottomSheet
            r5.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "referral_screen"
            r1.putString(r0, r10)
            r5.A0u(r1)
            X.9P2 r0 = new X.9P2
            r0.<init>(r4, r3, r2)
            r5.A03 = r0
        L_0x0063:
            r5.A04 = r6
            goto L_0x0025
        L_0x0066:
            X.99n r0 = r12.A0O
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0077
            boolean r0 = X.AnonymousClass9DC.A17(r12)
            r3 = 2131886106(0x7f12001a, float:1.9406781E38)
            if (r0 == 0) goto L_0x007a
        L_0x0077:
            r3 = 2131893518(0x7f121d0e, float:1.9421815E38)
        L_0x007a:
            r2 = 0
            com.whatsapp.payments.ui.AddPaymentMethodBottomSheet r5 = new com.whatsapp.payments.ui.AddPaymentMethodBottomSheet
            r5.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "referral_screen"
            r1.putString(r0, r10)
            r5.A0u(r1)
            X.9P2 r0 = new X.9P2
            r0.<init>(r2, r3, r2)
            r5.A03 = r0
            X.9XA r0 = r5.A05
            r0.A00 = r12
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPaymentActivity.A7Q(java.lang.String, java.lang.String, boolean, java.lang.String):void");
    }

    public boolean A7S() {
        if (this.A0D.A0X(6819)) {
            String string = this.A0E.A03().getString("pref_income_verification_state", "not_required");
            long A0A2 = AnonymousClass0x2.A0A(AnonymousClass0x2.A0F(this.A09), "payments_onboarded_timestamp");
            if (!TextUtils.equals(string, "collected")) {
                if (!TextUtils.equals(string, "pending")) {
                    if (A0A2 <= 0 || this.A09.A2P("payments_onboarded_timestamp", TimeUnit.DAYS.toMillis(29))) {
                        this.A0E.A0L("pending");
                    } else {
                        this.A0E.A0L("not_required");
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean BIL() {
        return TextUtils.isEmpty(this.A0n);
    }

    public void BSF(String str) {
        AnonymousClass9B2 r5 = this.A0O;
        int i = this.A00;
        r5.A03.A02(Integer.valueOf(i), AnonymousClass000.A0Y("p2p_flow_tag", AnonymousClass001.A0o(), i), "error_message", str);
        AnonymousClass9Wg.A02(AnonymousClass9Wg.A01(this.A06, (AnonymousClass39Q) null, this.A0U, this.A0g), this.A0L, 51, "new_payment", this.A0d, 4);
    }

    public void BU6() {
        AnonymousClass9VG r3 = this.A0U;
        if (r3 != null && r3.A01 != null) {
            C203499no r2 = this.A0L;
            Bundle A082 = AnonymousClass002.A08();
            PaymentIncentiveViewFragment paymentIncentiveViewFragment = new PaymentIncentiveViewFragment(r2, r3);
            paymentIncentiveViewFragment.A0u(A082);
            Objects.requireNonNull(paymentIncentiveViewFragment);
            paymentIncentiveViewFragment.A04 = new AnonymousClass9NL(paymentIncentiveViewFragment);
            Boo(paymentIncentiveViewFragment);
        }
    }

    public void BXm() {
        C95814uZ r0 = this.A0E;
        C626936e.A06(r0);
        if (C627336j.A0K(r0) && this.A00 == 0) {
            A78(C86614Ku.A0D(this));
        }
    }

    public void Ba5(AnonymousClass39Q r6, String str) {
        String A032 = this.A0S.A03("p2p_context", false);
        C194569Tl A002 = AnonymousClass9U4.A00(this.A0P);
        AnonymousClass3XA r2 = new AnonymousClass3XA();
        A002.A03.BkM(new C199919hU(r2, A002));
        r2.A03(new C198019eF(r6, this, A032));
    }

    public void BbG(AnonymousClass39Q r4) {
        String str;
        if (this.A0g) {
            str = "p2m_context";
        } else {
            str = "p2p_context";
        }
        A7M(r4, (AnonymousClass9XZ) null, str, this.A0d);
    }

    public void BbH() {
        A7D(this.A0L, this.A0U);
    }

    public void Bdw(boolean z) {
        AnonymousClass9VG r2 = this.A0U;
        C203499no r1 = this.A0L;
        if (z) {
            AnonymousClass9DC.A16(this, r1, r2, 49);
        } else {
            AnonymousClass9DC.A16(this, r1, r2, 48);
        }
    }

    public /* bridge */ /* synthetic */ Object Bhf() {
        C85204Fi A012 = this.A07.A01("BRL");
        C95814uZ r35 = this.A0E;
        String str = this.A0j;
        AnonymousClass39M r15 = this.A0c;
        Integer num = this.A0f;
        String str2 = this.A0o;
        int i = 2;
        if (this.A0u) {
            i = 0;
        }
        C193329Ob r4 = new C193329Ob(i, 0);
        C193099Nd r2 = new C193099Nd(false);
        AnonymousClass9OZ r1 = new AnonymousClass9OZ(NumberEntryKeyboard.A00(this.A06), this.A0r);
        String str3 = this.A0n;
        String str4 = this.A0k;
        String str5 = this.A0m;
        AnonymousClass9OY r0 = new AnonymousClass9OY(A012, 0);
        C620733j r12 = this.A06;
        AnonymousClass1S3 r10 = (AnonymousClass1S3) A012;
        AnonymousClass39Q r11 = r10.A00;
        AnonymousClass9QF r21 = new AnonymousClass9QF(AnonymousClass0x9.A0C(Integer.valueOf(R.style.f12nameremoved), new int[]{0, 0, 0, 0}), AnonymousClass0x9.A0C(Integer.valueOf(R.style.f12nameremoved), new int[]{0, 0, 0, 0}), (C185418tc) null, r0, new C197549dU(this, r12, A012, r11, r10.A01, r11, (C193599Pg) null), str3, str4, str5, R.style.f12nameremoved, true, true, true);
        AnonymousClass1VX r122 = this.A0D;
        AnonymousClass5Y0 r112 = this.A0C;
        C620633i r102 = this.A08;
        C620733j r8 = this.A06;
        AnonymousClass33O r7 = this.A0d;
        C60152y5 r6 = this.A0a;
        C196409an r22 = new C196409an(this, r102, r8, this.A0B, r112, r122, new C196379ak(), r6, r7);
        C193319Oa r103 = new C193319Oa(this, r122.A0X(811));
        C194589Tn r82 = this.A0I;
        return new AnonymousClass9QH(r35, r22, this, this, r21, new AnonymousClass9PQ(this.A0B, this.A0H, r82, false), r1, r2, r103, r4, r15, num, str, str2, false);
    }

    public void onBackPressed() {
        PaymentView paymentView = this.A0W;
        if (paymentView == null || !paymentView.A0G()) {
            C95814uZ r0 = this.A0E;
            C626936e.A06(r0);
            if (!C627336j.A0K(r0) || this.A00 != 0) {
                AnonymousClass9Wg.A02(AnonymousClass9Wg.A01(this.A06, (AnonymousClass39Q) null, this.A0U, this.A0g), this.A0L, 1, "new_payment", (String) null, 1);
                finish();
                return;
            }
            this.A0G = null;
            A78(C86614Ku.A0D(this));
        }
    }

    public Dialog onCreateDialog(int i) {
        Dialog A002 = this.A0V.A00((Bundle) null, this, i);
        if (A002 == null) {
            return super.onCreateDialog(i);
        }
        return A002;
    }

    public static /* synthetic */ void A0C(BottomSheetDialogFragment bottomSheetDialogFragment, BrazilPaymentActivity brazilPaymentActivity) {
        C19340zH A002 = AnonymousClass5V0.A00(brazilPaymentActivity);
        C19340zH.A01(brazilPaymentActivity.A02, A002, R.string.f11nameremoved);
        String string = brazilPaymentActivity.A02.getString(R.string.f11nameremoved);
        A002.A00.A0I(new C204379pG(bottomSheetDialogFragment, 7, brazilPaymentActivity), string);
        AnonymousClass043 create = A002.create();
        create.setOnDismissListener(new C204629pf(bottomSheetDialogFragment, 3));
        create.show();
    }

    public static /* synthetic */ void A13(C195319Xg r7, AnonymousClass39Q r8, C166587yw r9, AnonymousClass3QO r10, BrazilPaymentActivity brazilPaymentActivity, String str, String str2) {
        PinBottomSheetDialogFragment A002 = AnonymousClass9SH.A00();
        A002.A0E.A00 = brazilPaymentActivity;
        A002.A0B = new C197239cn(r7, r8, r9, r10, A002, brazilPaymentActivity, str2, str);
        brazilPaymentActivity.A0O.BKh("enter_pin", brazilPaymentActivity.A00);
        brazilPaymentActivity.Boo(A002);
    }

    public final void A7J(C195319Xg r20, AnonymousClass39Q r21, C166587yw r22, AnonymousClass3QO r23, String str, String str2) {
        FingerprintBottomSheet A072 = C1899693i.A07();
        AnonymousClass39Q r6 = r21;
        int intValue = r6.A00.scaleByPowerOfTen(3).intValue();
        C85204Fi r3 = AnonymousClass1S3.A04;
        C60042xu r2 = new C60042xu();
        r2.A01 = (long) intValue;
        r2.A00 = 1000;
        r2.A02 = r3;
        C195319Xg r5 = r20;
        C166587yw r7 = r22;
        String str3 = str2;
        AnonymousClass9VE A7G = A7G(r5, r7, r2.A01(), str3, "fingerprint", this.A0e);
        A072.A05 = new AnonymousClass987(this, A072, this.A06, A7G, this.A0Q, new C196999cI(A072, r5, r6, r7, r23, this, str, str3));
        this.A0O.BKh("enter_fingerprint", this.A00);
        Boo(A072);
    }

    public void A7L(AnonymousClass39Q r4) {
        if (A7S()) {
            AnonymousClass97T.A0r(this, this.A0L, new C197529dM(r4, this), this.A0d);
            return;
        }
        A79(r4);
    }

    public final void A7R(boolean z) {
        PaymentView paymentView = (PaymentView) findViewById(R.id.payment_view);
        this.A0W = paymentView;
        paymentView.setPaymentTabsVisibility(8);
        PaymentView paymentView2 = this.A0W;
        paymentView2.A0x = this;
        getLifecycle().A00(new PaymentView$$ExternalSyntheticLambda4(paymentView2));
        PaymentView paymentView3 = this.A0W;
        if (z) {
            paymentView3.setPaymentTabsVisibility(8);
        } else {
            paymentView3.setPaymentTabsVisibility(0);
        }
        PaymentView paymentView4 = this.A0W;
        AnonymousClass3ZH r2 = this.A09;
        String A0H2 = this.A05.A0H(r2);
        paymentView4.A1H = A0H2;
        paymentView4.A0H.setText(A0H2);
        paymentView4.A06.setVisibility(8);
        paymentView4.A0Z.A08(paymentView4.A0X, r2);
        A7I();
    }

    public void BTg(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && !z) {
            A7C(this.A0L, this.A0U);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            X.1VX r0 = r5.A0D
            boolean r0 = X.C154437dA.A00(r0)
            r5.A0f = r0
            X.2oU r0 = r5.A06
            android.content.Context r0 = r0.A00
            r5.A02 = r0
            X.9U4 r0 = r5.A0P
            X.9Tl r0 = X.AnonymousClass9U4.A00(r0)
            X.3XA r0 = r0.A02()
            r5.A04 = r0
            X.1iW r1 = r5.A0D
            X.2Ub r0 = r5.A0i
            r1.A06(r0)
            com.whatsapp.jid.UserJid r0 = r5.A0G
            if (r0 != 0) goto L_0x0043
            X.4uZ r0 = r5.A0E
            X.C626936e.A06(r0)
            boolean r0 = X.C627336j.A0K(r0)
            if (r0 == 0) goto L_0x003b
            android.os.Bundle r0 = X.C86614Ku.A0D(r5)
            r5.A78(r0)
        L_0x003a:
            return
        L_0x003b:
            X.4uZ r0 = r5.A0E
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r0)
            r5.A0G = r0
        L_0x0043:
            r5.A77(r6)
            if (r6 != 0) goto L_0x00f3
            X.9B2 r2 = r5.A0O
            r1 = 185470254(0xb0e0d2e, float:2.735812E-32)
            java.lang.String r0 = r5.A0d
            java.lang.Integer r0 = r2.A01(r0, r1)
            if (r0 == 0) goto L_0x005b
            int r0 = r0.intValue()
        L_0x0059:
            r5.A00 = r0
        L_0x005b:
            android.content.Intent r0 = r5.getIntent()
            if (r0 == 0) goto L_0x007a
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "extra_request_id"
            java.lang.String r0 = r1.getStringExtra(r0)
            r5.A0e = r0
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r1 = "extra_should_open_transaction_detail_after_send_override"
            r0 = 0
            boolean r0 = r2.getBooleanExtra(r1, r0)
            r5.A0w = r0
        L_0x007a:
            X.1VX r1 = r5.A0D
            r0 = 1482(0x5ca, float:2.077E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0098
            X.4FS r4 = r5.A04
            X.9U4 r3 = r5.A0P
            X.33l r2 = r5.A0E
            X.99l r0 = r5.A0I
            com.whatsapp.payments.CheckFirstTransaction r1 = new com.whatsapp.payments.CheckFirstTransaction
            r1.<init>(r0, r2, r3, r4)
            r5.A0C = r1
            X.08A r0 = r5.A06
            r0.A00(r1)
        L_0x0098:
            X.9Ty r0 = r5.A0S
            X.9TR r0 = r0.A05
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x00bc
            X.33l r2 = r5.A0E
            android.content.SharedPreferences r1 = r2.A03()
            java.lang.String r0 = "payment_account_recoverable"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00e3
            android.content.SharedPreferences r1 = r2.A03()
            java.lang.String r0 = "payment_account_recoverable_time_ms"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00e3
        L_0x00bc:
            boolean r0 = r5 instanceof com.whatsapp.payments.ui.BrazilOrderDetailsActivity
            if (r0 != 0) goto L_0x003a
            boolean r0 = r5.A0f
            if (r0 == 0) goto L_0x003a
            android.view.View r1 = r5.A00
            r0 = 2131433545(0x7f0b1849, float:1.8488879E38)
            android.view.View r3 = X.C06560Yg.A02(r1, r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior
            r2.<init>()
            r5.A03 = r2
            X.5XO r1 = r5.A0c
            X.5Wv r0 = r5.A0B
            r1.A02(r3, r2, r5, r0)
            X.0R8 r0 = r5.getSupportActionBar()
            X.AnonymousClass5XO.A00(r5, r0)
            return
        L_0x00e3:
            X.1VX r1 = r5.A0D
            r0 = 2000(0x7d0, float:2.803E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00bc
            X.9RU r0 = r5.A0G
            r0.A00(r5)
            goto L_0x00bc
        L_0x00f3:
            java.lang.String r0 = "flow_instance_key"
            int r0 = r6.getInt(r0)
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPaymentActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.A0h) {
            this.A0O.A04(this.A00, 4);
            this.A0F.A07(this.A0j);
        }
        this.A0L.reset();
        this.A0D.A07(this.A0i);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        C95814uZ r0 = this.A0E;
        C626936e.A06(r0);
        if (!C627336j.A0K(r0) || this.A00 != 0) {
            finish();
            return true;
        }
        this.A0G = null;
        A78(C86614Ku.A0D(this));
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("flow_instance_key", this.A00);
    }

    public void onStart() {
        super.onStart();
        if (!(this instanceof BrazilOrderDetailsActivity) && this.A0f) {
            this.A0c.A03(this.A03, this);
        }
    }

    public C009707r B48() {
        return this;
    }

    public String BAu() {
        return null;
    }

    public boolean BIt() {
        return false;
    }

    public void BM9() {
    }

    public void BXn() {
    }

    public /* synthetic */ void BXt() {
    }

    public void BbJ() {
    }

    public void BMO(String str) {
    }

    public void Bok(DialogFragment dialogFragment) {
        Boo(dialogFragment);
    }
}
