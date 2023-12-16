package X;

import android.view.View;
import com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet;
import java.util.List;

/* renamed from: X.9pJ  reason: invalid class name and case insensitive filesystem */
public class C204409pJ implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204409pJ(AnonymousClass9OP r1, AnonymousClass9W0 r2, int i) {
        this.A02 = i;
        switch (i) {
            case 32:
            case 33:
                this.A00 = r1;
                this.A01 = r2;
                return;
            default:
                this.A00 = r2;
                this.A01 = r1;
                return;
        }
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C204409pJ(obj, i, obj2));
    }

    public static final void A01(C204409pJ r6) {
        List list;
        AnonymousClass9OS r0 = ((C193619Pi) r6.A01).A04;
        int A012 = ((C05570Ua) r6.A00).A01();
        AnonymousClass958 r3 = r0.A01;
        AnonymousClass9NX r2 = r0.A00;
        int i = 0;
        while (true) {
            list = r3.A03;
            if (i < list.size()) {
                if (((C193619Pi) list.get(i)).A03.A0A.equals(r3.A00)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        ((C193619Pi) list.get(i)).A00 = false;
        r3.A06(i);
        r3.A00 = ((C193619Pi) list.get(A012)).A03.A0A;
        ((C193619Pi) list.get(A012)).A00 = true;
        r3.A06(A012);
        String str = r3.A00;
        PaymentOptionsBottomSheet paymentOptionsBottomSheet = r2.A00;
        paymentOptionsBottomSheet.A08 = str;
        paymentOptionsBottomSheet.A1Y(84, str, 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: X.9Q9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: X.9Q9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: X.9Fq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: X.9QJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: X.9Q9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: X.9Fq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: X.9Fq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: X.9Q9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: X.9Fq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: X.9Q9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: X.9Q9} */
    /* JADX WARNING: type inference failed for: r3v30, types: [X.9QJ, X.9Fq] */
    /* JADX WARNING: type inference failed for: r3v35, types: [X.9QJ] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d5, code lost:
        r3 = new X.C191619Fq(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00da, code lost:
        r3.A05 = r1;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0108, code lost:
        r0 = r2.A08;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0244, code lost:
        r0.A0H(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0247, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r3 = r19
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x0309;
                case 1: goto L_0x0658;
                case 2: goto L_0x02f5;
                case 3: goto L_0x02e3;
                case 4: goto L_0x02cf;
                case 5: goto L_0x02b9;
                case 6: goto L_0x0290;
                case 7: goto L_0x0248;
                case 8: goto L_0x0646;
                case 9: goto L_0x0618;
                case 10: goto L_0x0594;
                case 11: goto L_0x0584;
                case 12: goto L_0x04f3;
                case 13: goto L_0x04cd;
                case 14: goto L_0x04b8;
                case 15: goto L_0x04a4;
                case 16: goto L_0x0400;
                case 17: goto L_0x03f1;
                case 18: goto L_0x03e5;
                case 19: goto L_0x035b;
                case 20: goto L_0x033d;
                case 21: goto L_0x0339;
                case 22: goto L_0x0007;
                case 23: goto L_0x0007;
                case 24: goto L_0x0220;
                case 25: goto L_0x00f5;
                case 26: goto L_0x00dd;
                case 27: goto L_0x00cb;
                case 28: goto L_0x00c0;
                case 29: goto L_0x0049;
                case 30: goto L_0x0037;
                case 31: goto L_0x0027;
                case 32: goto L_0x01bc;
                case 33: goto L_0x0185;
                case 34: goto L_0x0179;
                case 35: goto L_0x0120;
                case 36: goto L_0x010c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r3.A00
            X.94o r4 = (X.C1902194o) r4
            java.lang.Object r3 = r3.A01
            X.99J r3 = (X.AnonymousClass99J) r3
            X.9VU r9 = r4.A0R
            java.lang.String r10 = "KYC"
            java.lang.String r2 = "FB"
            X.3Rl r0 = r9.A01(r2, r10)
            if (r0 == 0) goto L_0x0320
            java.lang.String r1 = r0.A05
            boolean r0 = r1.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0320
            r4.A0D(r3, r1)
        L_0x0026:
            return
        L_0x0027:
            java.lang.Object r2 = r3.A00
            X.94y r2 = (X.AnonymousClass94y) r2
            java.lang.Object r1 = r3.A01
            X.34w r1 = (X.C624034w) r1
            r0 = 23
            X.9QJ r3 = X.AnonymousClass9QJ.A00(r0)
            goto L_0x00da
        L_0x0037:
            java.lang.Object r2 = r3.A00
            X.94y r2 = (X.AnonymousClass94y) r2
            java.lang.Object r1 = r3.A01
            X.7yw r1 = (X.C166587yw) r1
            r0 = 9
            X.9QJ r3 = X.AnonymousClass9QJ.A00(r0)
            r3.A04 = r1
            goto L_0x0108
        L_0x0049:
            java.lang.Object r4 = r3.A00
            X.94y r4 = (X.AnonymousClass94y) r4
            java.lang.Object r1 = r3.A01
            X.99L r1 = (X.AnonymousClass99L) r1
            r0 = 113(0x71, float:1.58E-43)
            X.9Fq r3 = new X.9Fq
            r3.<init>(r0)
            X.9W2 r0 = r1.A0G
            X.9V3[] r8 = r0.A0P
            if (r8 == 0) goto L_0x00bc
            int r7 = r8.length
            if (r7 == 0) goto L_0x00bc
            java.lang.String[] r6 = new java.lang.String[r7]
            r5 = 0
            r2 = 0
        L_0x0065:
            r0 = r8[r5]
            int r1 = r2 + 1
            X.7yt r0 = r0.A00
            java.lang.Object r0 = r0.A00
            r6[r2] = r0
            int r5 = r5 + 1
            r2 = r1
            if (r5 < r7) goto L_0x0065
            java.lang.String[] r5 = new java.lang.String[r7]
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            r1 = 0
        L_0x007b:
            java.lang.String r0 = "id=?"
            r2.append(r0)
            int r0 = r7 + -1
            if (r1 == r0) goto L_0x0089
            java.lang.String r0 = " OR "
            r2.append(r0)
        L_0x0089:
            r0 = r6[r1]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5[r1] = r0
            int r1 = r1 + 1
            if (r1 < r7) goto L_0x007b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ")"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            android.util.Pair r0 = android.util.Pair.create(r5, r0)
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.first
            java.lang.String[] r1 = (java.lang.String[]) r1
            X.38i r0 = new X.38i
            r0.<init>(r2, r1)
            r3.A01 = r0
        L_0x00bc:
            X.4UC r0 = r4.A08
            goto L_0x0244
        L_0x00c0:
            java.lang.Object r2 = r3.A00
            X.94y r2 = (X.AnonymousClass94y) r2
            java.lang.Object r1 = r3.A01
            X.34w r1 = (X.C624034w) r1
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x00d5
        L_0x00cb:
            java.lang.Object r2 = r3.A00
            X.94y r2 = (X.AnonymousClass94y) r2
            java.lang.Object r1 = r3.A01
            X.34w r1 = (X.C624034w) r1
            r0 = 112(0x70, float:1.57E-43)
        L_0x00d5:
            X.9Fq r3 = new X.9Fq
            r3.<init>(r0)
        L_0x00da:
            r3.A05 = r1
            goto L_0x0108
        L_0x00dd:
            java.lang.Object r4 = r3.A00
            X.94y r4 = (X.AnonymousClass94y) r4
            java.lang.Object r2 = r3.A01
            X.34w r2 = (X.C624034w) r2
            r1 = 0
            r0 = 103(0x67, float:1.44E-43)
            X.9Fq r3 = new X.9Fq
            r3.<init>(r0)
            r3.A05 = r2
            r3.A0I = r1
            X.4UC r0 = r4.A08
            goto L_0x0244
        L_0x00f5:
            java.lang.Object r2 = r3.A00
            X.94y r2 = (X.AnonymousClass94y) r2
            java.lang.Object r1 = r3.A01
            X.99L r1 = (X.AnonymousClass99L) r1
            r0 = 102(0x66, float:1.43E-43)
            X.9Fq r3 = new X.9Fq
            r3.<init>(r0)
            java.lang.String r0 = r1.A0V
            r3.A07 = r0
        L_0x0108:
            X.4UC r0 = r2.A08
            goto L_0x0244
        L_0x010c:
            java.lang.Object r1 = r3.A00
            X.49I r1 = (X.AnonymousClass49I) r1
            java.lang.Object r0 = r3.A01
            android.app.Activity r0 = (android.app.Activity) r0
            if (r1 == 0) goto L_0x0026
            X.4Dj r0 = (X.C84704Dj) r0
            X.2dA r0 = r0.BEP()
            X.AnonymousClass8DJ.A0B(r0, r1)
            return
        L_0x0120:
            java.lang.Object r2 = r3.A00
            com.whatsapp.payments.ui.widget.PaymentView r2 = (com.whatsapp.payments.ui.widget.PaymentView) r2
            java.lang.Object r3 = r3.A01
            X.4CE r3 = (X.AnonymousClass4CE) r3
            X.9Su r0 = r2.A14
            r0.A00()
            X.4qx r1 = r2.A0n
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r1.A0F
            if (r0 == 0) goto L_0x0137
            r1.A04()
            return
        L_0x0137:
            android.widget.LinearLayout r0 = r2.A0F
            int r1 = r0.getHeight()
            android.widget.LinearLayout r0 = r2.A0C
            int r0 = r0.getHeight()
            int r1 = r1 + r0
            com.google.android.material.tabs.TabLayout r0 = r2.A0S
            int r0 = r0.getHeight()
            int r1 = r1 + r0
            X.9an r0 = r2.A0z
            android.view.View r0 = r0.A01
            int r0 = r0.getHeight()
            int r1 = r1 + r0
            X.4qx r0 = r2.A0n
            r0.A0A(r1)
            X.4qx r1 = r2.A0n
            r1.A08 = r3
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r1.A0F
            if (r0 == 0) goto L_0x0165
            r0.A03 = r3
            r0.A0I = r2
        L_0x0165:
            X.9b5 r0 = new X.9b5
            r0.<init>(r2)
            r1.A0D = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r2.A0O
            if (r1 == 0) goto L_0x0026
            X.9h8 r0 = new X.9h8
            r0.<init>(r2)
            r1.post(r0)
            return
        L_0x0179:
            java.lang.Object r0 = r3.A00
            X.9W0 r0 = (X.AnonymousClass9W0) r0
            X.9nJ r0 = r0.A09
            if (r0 == 0) goto L_0x0026
            r0.BPG()
            return
        L_0x0185:
            java.lang.Object r1 = r3.A00
            X.9OP r1 = (X.AnonymousClass9OP) r1
            java.lang.Object r0 = r3.A01
            X.9W0 r0 = (X.AnonymousClass9W0) r0
            int r0 = r0.A01
            if (r0 != 0) goto L_0x0668
            com.whatsapp.payments.ui.PaymentSettingsFragment r2 = r1.A00
            r2.A1X()
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment
            if (r0 == 0) goto L_0x0026
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r2 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r2
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r0 = r2.A0T
            X.C626936e.A06(r0)
            int r1 = r0.A0O()
            r0 = 9
            if (r1 != r0) goto L_0x0026
            com.whatsapp.languageselector.LanguageSelectorBottomSheet r1 = com.whatsapp.languageselector.LanguageSelectorBottomSheet.A00()
            X.9bB r0 = new X.9bB
            r0.<init>(r1, r2)
            r1.A04 = r0
            X.0df r0 = r2.A0T()
            X.AnonymousClass344.A00(r1, r0)
            return
        L_0x01bc:
            java.lang.Object r2 = r3.A00
            X.9OP r2 = (X.AnonymousClass9OP) r2
            java.lang.Object r3 = r3.A01
            X.9W0 r3 = (X.AnonymousClass9W0) r3
            int r1 = r3.A01
            r0 = 1
            if (r1 != r0) goto L_0x0216
            com.whatsapp.payments.ui.PaymentSettingsFragment r4 = r2.A00
            X.9U4 r0 = r4.A0n
            X.9Tz r2 = X.AnonymousClass9U4.A05(r0)
            if (r2 == 0) goto L_0x01f0
            X.1VX r1 = r2.A07
            r0 = 979(0x3d3, float:1.372E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x01f0
            X.03q r0 = r4.A0R()
            X.043 r0 = r2.A01(r0)
            r0.show()
        L_0x01e8:
            X.9nJ r0 = r3.A09
            if (r0 == 0) goto L_0x0026
            r0.BQT()
            return
        L_0x01f0:
            X.94t r0 = r4.A0x
            java.lang.String r1 = "incentive_banner"
            if (r0 == 0) goto L_0x0200
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0200
            r4.A1f(r1)
            goto L_0x01e8
        L_0x0200:
            X.2Xk r0 = r4.A0Q
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0212
            r1 = 2131892353(0x7f121881, float:1.9419452E38)
            r0 = 2131892352(0x7f121880, float:1.941945E38)
            com.whatsapp.RequestPermissionActivity.A0j(r4, r1, r0)
            goto L_0x01e8
        L_0x0212:
            r4.A1g(r1)
            goto L_0x01e8
        L_0x0216:
            com.whatsapp.payments.ui.PaymentSettingsFragment r1 = r2.A00
            java.lang.String r0 = r1.A1X()
            r1.A1f(r0)
            goto L_0x01e8
        L_0x0220:
            java.lang.Object r4 = r3.A00
            X.94o r4 = (X.C1902194o) r4
            java.lang.Object r1 = r3.A01
            X.6hv r1 = (X.C133776hv) r1
            java.lang.String r0 = r1.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0026
            r0 = 3
            X.9Q9 r3 = new X.9Q9
            r3.<init>(r0)
            java.lang.String r2 = r1.A0C
            java.lang.String r1 = "[^\\d]"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.replaceAll(r1, r0)
            r3.A05 = r0
            X.4UC r0 = r4.A03
        L_0x0244:
            r0.A0H(r3)
            return
        L_0x0248:
            java.lang.Object r5 = r3.A00
            com.whatsapp.payments.ui.ConfirmPaymentFragment r5 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r5
            java.lang.Object r11 = r3.A01
            X.7yw r11 = (X.C166587yw) r11
            X.9nm r6 = r5.A0O
            if (r6 == 0) goto L_0x0026
            X.6hl r10 = r5.A0I
            if (r10 == 0) goto L_0x025d
            int r0 = r5.A01
            r10.A0A(r0)
        L_0x025d:
            android.widget.ProgressBar r8 = r5.A09
            java.lang.Integer r2 = r5.A0T
            if (r2 == 0) goto L_0x028e
            java.util.List r1 = r5.A0W
            if (r1 == 0) goto L_0x028e
            X.9XZ r0 = r5.A0Q
            if (r0 == 0) goto L_0x028e
            int r0 = r2.intValue()
            java.lang.Object r4 = r1.get(r0)
            X.38n r4 = (X.C632538n) r4
            X.9XZ r0 = r5.A0Q
            int r3 = r0.A00
            int r2 = r4.A00
            X.39L r1 = r4.A01
            X.39L r0 = r4.A02
            X.9Xg r9 = new X.9Xg
            r9.<init>(r1, r0, r3, r2)
        L_0x0284:
            X.0eF r12 = r5.A0E
            com.whatsapp.payments.ui.PaymentBottomSheet r12 = (com.whatsapp.payments.ui.PaymentBottomSheet) r12
            r7 = r20
            r6.BPe(r7, r8, r9, r10, r11, r12)
            return
        L_0x028e:
            r9 = 0
            goto L_0x0284
        L_0x0290:
            java.lang.Object r5 = r3.A00
            com.whatsapp.payments.ui.ConfirmPaymentFragment r5 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r5
            java.lang.Object r4 = r3.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = (com.whatsapp.payments.ui.PaymentBottomSheet) r4
            if (r4 == 0) goto L_0x0026
            X.9nm r3 = r5.A0O
            if (r3 == 0) goto L_0x0026
            java.lang.Integer r0 = r5.A0T
            if (r0 == 0) goto L_0x0026
            X.9XZ r0 = r5.A0Q
            if (r0 == 0) goto L_0x0026
            java.util.List r2 = r5.A0W
            X.C626936e.A06(r2)
            java.lang.Integer r0 = r5.A0T
            int r1 = r0.intValue()
            X.9XZ r0 = r5.A0Q
            int r0 = r0.A00
            r3.BUf(r4, r2, r1, r0)
            return
        L_0x02b9:
            java.lang.Object r0 = r3.A00
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r3 = r3.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r3 = (com.whatsapp.payments.ui.PaymentBottomSheet) r3
            if (r3 == 0) goto L_0x0026
            X.9nm r2 = r0.A0O
            if (r2 == 0) goto L_0x0026
            int r1 = r0.A00
            int r0 = r0.A01
            r2.BXv(r3, r1, r0)
            return
        L_0x02cf:
            java.lang.Object r0 = r3.A00
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r2 = r3.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r2 = (com.whatsapp.payments.ui.PaymentBottomSheet) r2
            if (r2 == 0) goto L_0x0026
            X.9nm r1 = r0.A0O
            if (r1 == 0) goto L_0x0026
            int r0 = r0.A01
            r1.BXz(r2, r0)
            return
        L_0x02e3:
            java.lang.Object r0 = r3.A00
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r1 = r3.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = (com.whatsapp.payments.ui.PaymentBottomSheet) r1
            if (r1 == 0) goto L_0x0026
            X.9nm r0 = r0.A0O
            if (r0 == 0) goto L_0x0026
            r0.BeU(r1)
            return
        L_0x02f5:
            java.lang.Object r0 = r3.A00
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r2 = r3.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r2 = (com.whatsapp.payments.ui.PaymentBottomSheet) r2
            if (r2 == 0) goto L_0x0026
            X.9nm r1 = r0.A0O
            if (r1 == 0) goto L_0x0026
            int r0 = r0.A01
            r1.BXo(r2, r0)
            return
        L_0x0309:
            java.lang.Object r2 = r3.A00
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r3.A01
            com.whatsapp.videoplayback.VideoSurfaceView r1 = (com.whatsapp.videoplayback.VideoSurfaceView) r1
            r0 = 8
            r2.setVisibility(r0)
            boolean r0 = r1.isPlaying()
            if (r0 != 0) goto L_0x0026
            r1.start()
            return
        L_0x0320:
            r0 = 3
            X.9q2 r1 = new X.9q2
            r1.<init>(r3, r0, r4)
            X.2oU r0 = r4.A0D
            android.content.Context r5 = r0.A00
            X.3Wi r6 = r4.A0A
            X.9U5 r8 = r4.A0N
            X.2Ha r7 = r4.A0K
            X.9Rt r4 = new X.9Rt
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r4.A00(r1, r2)
            return
        L_0x0339:
            A01(r3)
            return
        L_0x033d:
            java.lang.Object r1 = r3.A00
            X.9am r1 = (X.C196399am) r1
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            com.whatsapp.payments.ui.invites.PaymentInviteFragment r2 = r1.A0B
            r0.size()
            X.94j r1 = r2.A02
            r0 = 3
            r1.A0D(r0)
            java.util.List r0 = r2.A05
            int r1 = r0.size()
            r0 = 0
            r2.A1J(r1, r0)
            return
        L_0x035b:
            java.lang.Object r0 = r3.A00
            X.95G r0 = (X.AnonymousClass95G) r0
            java.lang.Object r3 = r3.A01
            X.34w r3 = (X.C624034w) r3
            X.9NM r0 = r0.A00
            com.whatsapp.payments.ui.BrazilPaymentCareTransactionSelectorActivity r2 = r0.A00
            boolean r0 = X.AnonymousClass9V7.A00(r3)
            if (r0 == 0) goto L_0x03db
            X.9Tf r1 = new X.9Tf
            r1.<init>()
            java.lang.String r0 = "wa_payment_hub_support"
            r1.A04 = r0
            r1.A02 = r3
            X.9Wq r0 = r2.A0I
            r1.A03 = r0
            X.3Ex r0 = r2.A02
            r1.A00 = r0
            X.33j r0 = r2.A04
            r1.A01 = r0
            r1.A01(r2)
        L_0x0387:
            r0 = 0
            X.303[] r0 = new X.AnonymousClass303[r0]
            r8 = 0
            X.303 r4 = new X.303
            r4.<init>(r8, r0)
            boolean r0 = X.AnonymousClass9V7.A00(r3)
            if (r0 == 0) goto L_0x03d8
            java.lang.String r1 = "p2m"
        L_0x0398:
            java.lang.String r0 = "product_flow"
            r4.A03(r0, r1)
            java.lang.String r1 = r3.A0K
            java.lang.String r0 = "transaction_id"
            r4.A03(r0, r1)
            X.C1899693i.A0q(r3, r4)
            X.33j r1 = r2.A04
            X.9Wq r0 = r2.A0I
            int r0 = r0.A0B(r3)
            java.lang.String r1 = r1.A0C(r0)
            java.lang.String r0 = "transaction_status_name"
            r4.A03(r0, r1)
            java.lang.String r1 = "hc_entrypoint"
            java.lang.String r0 = "wa_payment_hub_support"
            r4.A03(r1, r0)
            java.lang.String r1 = "app_type"
            java.lang.String r0 = "consumer"
            r4.A03(r1, r0)
            X.9no r3 = r2.A05
            java.lang.Integer r5 = X.AnonymousClass001.A0f()
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = "payment_home"
            r3.BKE(r4, r5, r6, r7, r8)
            return
        L_0x03d8:
            java.lang.String r1 = "p2p"
            goto L_0x0398
        L_0x03db:
            X.4FS r1 = r2.A04
            X.9H2 r0 = r2.A79()
            X.C18270x1.A0w(r0, r1)
            goto L_0x0387
        L_0x03e5:
            java.lang.Object r1 = r3.A00
            com.whatsapp.payments.ui.IndiaUpiSimPickerDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiSimPickerDialogFragment) r1
            java.lang.Object r0 = r3.A01
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            com.whatsapp.payments.ui.IndiaUpiSimPickerDialogFragment.A00(r0, r1)
            return
        L_0x03f1:
            java.lang.Object r1 = r3.A00
            X.0eF r1 = (X.C08310eF) r1
            java.lang.Object r0 = r3.A01
            X.9Ba r0 = (X.AnonymousClass9Ba) r0
            r0.A7X()
            X.C18300x5.A1A(r1)
            return
        L_0x0400:
            java.lang.Object r9 = r3.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity r9 = (com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity) r9
            java.lang.Object r4 = r3.A01
            android.view.View r4 = (android.view.View) r4
            X.1VX r3 = r9.A0D
            X.4FV r2 = r9.A0C
            X.8vZ r1 = r9.A03
            java.lang.String r0 = "onboarding"
            boolean r0 = X.AnonymousClass9UE.A00(r3, r2, r1, r0)
            r12 = 0
            if (r0 == 0) goto L_0x0423
            r2 = 2131893265(0x7f121c11, float:1.9421302E38)
            r1 = 2131893264(0x7f121c10, float:1.94213E38)
        L_0x041d:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r9.Box(r0, r2, r1)
            return
        L_0x0423:
            boolean r0 = X.AnonymousClass280.A00()
            if (r0 == 0) goto L_0x043e
            X.9ca r4 = r9.A0S
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            java.lang.String r2 = "upi_payments_unavailable_on_legacy_android_dialog"
            java.lang.String r1 = "tos_page"
            r0 = 0
            r4.BKB(r3, r0, r2, r1)
            r2 = 2131894687(0x7f12219f, float:1.9424186E38)
            r1 = 2131894686(0x7f12219e, float:1.9424184E38)
            goto L_0x041d
        L_0x043e:
            X.9ER r0 = r9.A03
            java.lang.String r1 = "tosAccepted"
            X.316 r0 = r0.A00
            r0.A0B(r1)
            X.9ca r0 = r9.A0S
            r0.Bq0()
            X.9TD r0 = r9.A02
            r0.A02()
            r0 = 8
            r4.setVisibility(r0)
            r0 = 2131432721(0x7f0b1511, float:1.8487207E38)
            X.C18280x3.A0r(r9, r0, r12)
            X.9U5 r10 = r9.A0M
            r2 = 1
            r0 = 2
            X.31C r4 = r10.A07
            java.lang.String r3 = r4.A03()
            long r0 = (long) r0
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            X.1wj r5 = new X.1wj
            r5.<init>((java.lang.String) r3, (int) r2)
            r1 = 3
            X.1wj r0 = new X.1wj
            r0.<init>((X.C35351wj) r5, (int) r1)
            X.9Ir r11 = new X.9Ir
            r11.<init>(r0, r6)
            X.36K r1 = r11.A00
            X.2oU r0 = r10.A04
            android.content.Context r6 = r0.A00
            X.3Wi r8 = r10.A00
            X.2Ha r7 = r10.A0A
            X.9oV r5 = new X.9oV
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.C1899593h.A1C(r4, r5, r1, r3)
            X.6ig r1 = r9.A08
            java.lang.Integer r0 = X.C18290x4.A0c()
            r1.A07 = r0
            X.C1899593h.A1B(r1, r2)
            java.lang.String r0 = r9.A0b
            r1.A0Y = r0
            java.lang.String r0 = r9.A0e
            r1.A0a = r0
            X.AnonymousClass97T.A0t(r1, r9)
            return
        L_0x04a4:
            java.lang.Object r1 = r3.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r1 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r1
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            X.5hX r2 = r1.A04
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/about-payments-data"
            X.C18310x6.A0y(r1, r2, r0)
            return
        L_0x04b8:
            java.lang.Object r0 = r3.A00
            X.9cs r0 = (X.C197289cs) r0
            java.lang.Object r4 = r3.A01
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = (com.whatsapp.payments.ui.PaymentBottomSheet) r4
            X.9Bs r3 = r0.A05
            java.lang.String r2 = "add_credential_prompt"
            r1 = 0
            r0 = 3
            r3.A87(r1, r2, r0)
            r4.A1Y()
            return
        L_0x04cd:
            java.lang.Object r4 = r3.A00
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r4 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r4
            java.lang.Object r2 = r3.A01
            android.content.DialogInterface r2 = (android.content.DialogInterface) r2
            r1 = r2
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0 = 0
            r1.setOnDismissListener(r0)
            r2.dismiss()
            X.94n r3 = r4.A03
            X.08M r2 = r3.A01
            X.2oU r0 = r3.A04
            android.content.Context r1 = r0.A00
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            X.AnonymousClass9OX.A00(r1, r2, r0)
            X.9AL r0 = r3.A0J
            r0.A00()
            return
        L_0x04f3:
            java.lang.Object r0 = r3.A00
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r0 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r0
            java.lang.Object r3 = r3.A01
            android.content.DialogInterface r3 = (android.content.DialogInterface) r3
            r2 = r3
            android.app.Dialog r2 = (android.app.Dialog) r2
            r1 = 0
            r2.setOnDismissListener(r1)
            r3.dismiss()
            X.94n r4 = r0.A03
            X.3Wi r3 = r4.A0B
            r2 = 0
            r1 = 2131892992(0x7f121b00, float:1.9420748E38)
            r3.A0G(r2, r1)
            X.34w r7 = r4.A07
            X.1S4 r2 = r7.A0A
            boolean r1 = r2 instanceof X.AnonymousClass99L
            if (r1 == 0) goto L_0x0582
            X.99L r2 = (X.AnonymousClass99L) r2
            X.9W2 r1 = r2.A0G
            if (r1 == 0) goto L_0x0582
            X.9Vz r6 = r1.A0C
            if (r6 == 0) goto L_0x0582
        L_0x0522:
            X.9AO r11 = r4.A08
            r12 = 1
            X.9qW r8 = new X.9qW
            r8.<init>(r4, r12)
            java.lang.String r1 = "PAY: rejectPayeeMandate called"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.lang.String r1 = "action"
            java.lang.String r4 = "upi-reject-mandate-request"
            X.AnonymousClass39V.A03(r1, r4, r5)
            r11.A02(r7, r5)
            r3 = 0
            X.1S4 r2 = r7.A0A
            X.99L r2 = (X.AnonymousClass99L) r2
            r1 = 0
            X.AnonymousClass9AO.A00(r6, r2, r3, r5, r1)
            X.7bd r10 = X.AnonymousClass9OC.A02(r11, r4)
            X.36K[] r3 = r11.A03(r7)
            X.9U5 r13 = r11.A01
            java.lang.String r16 = "set"
            X.39V[] r2 = X.C18300x5.A1Z(r5, r1)
            java.lang.String r1 = "account"
            X.36K r15 = new X.36K
            r15.<init>((java.lang.String) r1, (X.AnonymousClass39V[]) r2, (X.AnonymousClass36K[]) r3)
            android.content.Context r6 = r11.A00
            X.3Wi r7 = r11.A02
            X.2Ha r9 = r11.A06
            X.9oX r5 = new X.9oX
            r5.<init>((android.content.Context) r6, (X.C69263Wi) r7, (X.C202489m6) r8, (X.C40602Ha) r9, (X.C153607bd) r10, (X.AnonymousClass9AO) r11)
            r17 = 0
            r14 = r5
            r13.A0G(r14, r15, r16, r17)
            X.9ca r7 = r0.A0S
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r1 = 105(0x69, float:1.47E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.String r10 = "decline_mandate_dialogue"
            java.lang.String r11 = r0.A04
            r7.BKC(r8, r9, r10, r11, r12)
            return
        L_0x0582:
            r6 = 0
            goto L_0x0522
        L_0x0584:
            java.lang.Object r1 = r3.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r3.A01
            X.9Tz r0 = (X.C194659Tz) r0
            X.043 r0 = r0.A01(r1)
            r0.show()
            return
        L_0x0594:
            java.lang.Object r4 = r3.A00
            com.whatsapp.payments.ui.ConfirmReceivePaymentFragment r4 = (com.whatsapp.payments.ui.ConfirmReceivePaymentFragment) r4
            java.lang.Object r0 = r3.A01
            X.7yw r0 = (X.C166587yw) r0
            X.0eF r3 = r4.A0E
            com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment r4 = (com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment) r4
            java.lang.String r2 = r0.A0A
            X.3Wi r5 = r4.A00
            r1 = 0
            r0 = 2131891726(0x7f12160e, float:1.941818E38)
            r5.A0G(r1, r0)
            X.99n r0 = r4.A0C
            X.1VX r1 = r0.A02
            r0 = 2984(0xba8, float:4.181E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x05e9
            X.3Wi r0 = r4.A00
            r0.A0D()
            X.9U4 r0 = r4.A04
            X.7yw r0 = X.AnonymousClass9U4.A02(r0, r2)
            X.C626936e.A06(r0)
            X.6hx r5 = r0.A08
            X.6hw r5 = (X.C133786hw) r5
            if (r5 == 0) goto L_0x05e9
            java.lang.String r1 = r5.A0F
            java.lang.String r0 = "NEEDS_RETOKENIZATION"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x05dd
            java.lang.String r0 = "NEEDS_RETOKENIZATION_DELETED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05e9
        L_0x05dd:
            android.content.Context r0 = r4.A1D()
            android.content.Intent r0 = X.AnonymousClass97S.A0C(r0, r5, r2)
            r4.A0m(r0)
            return
        L_0x05e9:
            X.2sH r9 = r4.A02
            android.content.Context r6 = r4.A1D()
            X.3Wi r7 = r4.A00
            X.2sr r8 = r4.A01
            X.31C r11 = r4.A06
            X.9Se r1 = r4.A0I
            X.9U4 r15 = r4.A04
            X.9U5 r14 = r4.A0B
            X.9Rh r0 = r4.A0E
            X.32a r10 = r4.A04
            X.9Vc r12 = r4.A09
            X.2Ha r13 = r4.A0A
            X.9S9 r5 = new X.9S9
            r17 = r1
            r18 = r2
            r16 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = 0
            X.9qB r0 = new X.9qB
            r0.<init>(r3, r4, r2, r1)
            r5.A00(r0)
            return
        L_0x0618:
            java.lang.Object r4 = r3.A00
            X.0eF r4 = (X.C08310eF) r4
            java.lang.Object r3 = r3.A01
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            X.03q r0 = r4.A0Q()
            android.content.Intent r2 = X.C1899693i.A03(r0)
            java.lang.String r1 = "screen_name"
            java.lang.String r0 = "brpay_p_add_card"
            r2.putExtra(r1, r0)
            java.util.HashMap r1 = X.AnonymousClass001.A0t()
            java.lang.String r0 = "screen_params"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "onboarding_context"
            java.lang.String r0 = "p2p_context"
            X.AnonymousClass98s.A0a(r2, r1, r0)
            r4.A0m(r2)
            r3.A1K()
            return
        L_0x0646:
            java.lang.Object r4 = r3.A00
            com.whatsapp.payments.ui.ConfirmReceivePaymentFragment r4 = (com.whatsapp.payments.ui.ConfirmReceivePaymentFragment) r4
            java.lang.Object r3 = r3.A01
            X.3XA r2 = r4.A01
            r1 = 4
            X.9qH r0 = new X.9qH
            r0.<init>(r3, r1, r4)
            r2.A03(r0)
            return
        L_0x0658:
            java.lang.Object r1 = r3.A00
            X.9T5 r1 = (X.AnonymousClass9T5) r1
            java.lang.Object r0 = r3.A01
            X.9T5 r0 = (X.AnonymousClass9T5) r0
            X.9mr r1 = r1.A01
            X.3ZO r0 = r0.A02
            r1.BP2(r0)
            return
        L_0x0668:
            java.lang.String r0 = "PAY: banner configuration not supported"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204409pJ.onClick(android.view.View):void");
    }

    public C204409pJ(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }
}
