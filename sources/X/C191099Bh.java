package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.9Bh  reason: invalid class name and case insensitive filesystem */
public abstract class C191099Bh extends AnonymousClass9CH implements C203029n0 {
    public C617332a A00;
    public C196719bd A01;
    public AnonymousClass34V A02;
    public C153607bd A03;
    public AnonymousClass9AJ A04;
    public AnonymousClass9ER A05;
    public AnonymousClass9V1 A06;
    public boolean A07 = false;
    public final C160757oG A08 = C160757oG.A00("IndiaUpiPaymentBankSetupActivity", "onboarding", "IN");

    public static boolean A0C(AnonymousClass99E r3, C196629bS r4, ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return ((AnonymousClass99H) arrayList.get(0)).A00 <= 1 || !TextUtils.isEmpty(r4.A07()) || !(arrayList2 == null || arrayList2.size() <= 0 || r3 == null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A03 = this.A0L.A04;
        this.A0Y = C1899593h.A0P(this);
        AnonymousClass1VX r4 = this.A0D;
        C69263Wi r2 = this.A05;
        AnonymousClass31C r5 = this.A0H;
        AnonymousClass9U4 r9 = this.A0P;
        this.A04 = new AnonymousClass9AJ(this, r2, this.A00, r4, r5, this.A0L, this.A0K, this.A0M, r9, this, this.A0S, this.A0V);
        onConfigurationChanged(AnonymousClass001.A0M(this));
    }

    public final void A7V() {
        ArrayList arrayList;
        boolean A0X = this.A0D.A0X(2746);
        boolean z = false;
        C196629bS r3 = this.A0M;
        if (!A0X) {
            AnonymousClass9U1 r0 = this.A0L;
            if (!A0C(r0.A03, r3, r0.A05, r0.A07)) {
                return;
            }
            arrayList = this.A0L.A05;
        } else if (r3.A0O() || this.A0I.A0E()) {
            C196629bS r32 = this.A0M;
            AnonymousClass9U1 r02 = this.A0L;
            if (!A0C(r02.A03, r32, r02.A05, r02.A07)) {
                C196629bS r33 = this.A0M;
                AnonymousClass9U1 r03 = this.A0L;
                if (A0C(r03.A03, r33, r03.A06, r03.A07)) {
                    arrayList = this.A0L.A06;
                    z = true;
                } else {
                    return;
                }
            }
            arrayList = this.A0L.A05;
        } else {
            return;
        }
        A7Y(arrayList, z);
    }

    public final void A7W(AnonymousClass34V r7, boolean z) {
        String str;
        int i;
        if (z) {
            str = "upi-batch";
        } else {
            str = "upi-get-banks";
        }
        if (!C196719bd.A02(this, str, r7.A00, false)) {
            C160757oG r4 = this.A08;
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(" failed with error: ");
            A0l.append(r7);
            C1899593h.A1J(r4, "; showErrorAndFinish", A0l);
            int i2 = r7.A00;
            if (i2 == 21129) {
                C199329gP r5 = new C199329gP(this);
                C19340zH A002 = AnonymousClass5V0.A00(this);
                A002.A0U(R.string.f11nameremoved);
                A002.A0T(R.string.f11nameremoved);
                A002.A0Y(new C204379pG(r5, 10, this), R.string.f11nameremoved);
                A002.A0i(false);
                A002.A0S();
                return;
            }
            AnonymousClass9VW A042 = this.A01.A04(this.A03, i2);
            this.A05.A00.A0E(3);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("showErrorAndFinish: ");
            C1899593h.A1K(r4, A0o, A042.A00);
            A7I();
            if (A042.A00 == 0) {
                A042.A00 = R.string.f11nameremoved;
                String str2 = this.A03.A04;
                if ("upi-batch".equalsIgnoreCase(str2)) {
                    i = R.string.f11nameremoved;
                } else if ("upi-get-banks".equalsIgnoreCase(str2)) {
                    i = R.string.f11nameremoved;
                }
                A042.A00 = i;
            }
            if (this.A0k) {
                A7H();
                Intent A0L = AnonymousClass97T.A0L(this, A042);
                A0L.putExtra("error", A042.A00);
                A7O(A0L);
                A0L.putExtra("extra_skip_value_props_display", false);
                A6T(A0L, true);
                return;
            }
            C18270x1.A0t(AnonymousClass9VW.A00(this, A042), this);
        }
    }

    public final void A7X(AnonymousClass34V r5, boolean z) {
        C197109ca r1 = this.A0S;
        int i = 4;
        if (z) {
            i = 3;
        }
        C134246ig A032 = r1.A03(r5, i);
        A032.A0Y = this.A0b;
        A032.A0b = "nav_bank_select";
        A032.A0a = this.A0e;
        AnonymousClass97T.A0t(A032, this);
        C1899593h.A1H(this.A08, A032, "logBanksList: ", AnonymousClass001.A0o());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7Y(java.util.List r12, boolean r13) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld
            if (r0 == 0) goto L_0x00ce
            r2 = r11
            com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld r2 = (com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld) r2
            boolean r0 = r12.isEmpty()
            r3 = 0
            r1 = 8
            if (r0 != 0) goto L_0x0116
            if (r13 != 0) goto L_0x0116
            android.view.View r0 = r2.A00
            r0.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A03
            r0.setVisibility(r3)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A05
            r0.setVisibility(r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A04
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.A02
            r0.setVisibility(r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A05
            r0.A03()
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A04
            r0.A03()
            android.widget.LinearLayout r0 = r2.A01
            r0.removeAllViews()
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r12.iterator()
        L_0x0042:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r1 = r4.next()
            X.99H r1 = (X.AnonymousClass99H) r1
            boolean r0 = r1.A0K
            if (r0 == 0) goto L_0x0042
            r8.add(r1)
            goto L_0x0042
        L_0x0056:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r6 = r12.iterator()
            r5 = 0
        L_0x005f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r4 = r6.next()
            X.6hu r4 = (X.C133766hu) r4
            java.lang.String r0 = r4.A0C()
            X.C626936e.A05(r0)
            char r1 = r0.charAt(r3)
            if (r5 == 0) goto L_0x007e
            char r0 = r5.charValue()
            if (r0 == r1) goto L_0x0089
        L_0x007e:
            java.lang.Character r5 = java.lang.Character.valueOf(r1)
            java.lang.String r0 = r5.toString()
            r7.add(r0)
        L_0x0089:
            r7.add(r4)
            goto L_0x005f
        L_0x008d:
            X.0PJ r1 = X.AnonymousClass0x9.A0G(r8, r7)
            java.lang.Object r0 = r1.A00
            java.util.List r0 = (java.util.List) r0
            r2.A0E = r0
            java.lang.Object r1 = r1.A01
            java.util.List r1 = (java.util.List) r1
            r2.A0F = r1
            X.956 r0 = r2.A08
            r0.A00 = r1
            r0.A05()
            X.956 r0 = r2.A07
            java.util.List r0 = r0.A00
            int r1 = r0.size()
            java.util.List r0 = r2.A0E
            int r0 = r0.size()
            if (r1 == r0) goto L_0x00bd
            X.956 r1 = r2.A07
            java.util.List r0 = r2.A0E
            r1.A00 = r0
            r1.A05()
        L_0x00bd:
            android.view.View r1 = r2.A00
            java.util.List r0 = r2.A0E
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00c9
            r3 = 8
        L_0x00c9:
            r1.setVisibility(r3)
            goto L_0x0202
        L_0x00ce:
            r2 = r11
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r2 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r2
            if (r13 != 0) goto L_0x015d
            boolean r0 = r12.isEmpty()
            r6 = 0
            r5 = 8
            if (r0 == 0) goto L_0x0169
            r8 = 0
        L_0x00dd:
            r1 = 2131625161(0x7f0e04c9, float:1.8877522E38)
            r0 = 0
            android.view.View r7 = android.view.View.inflate(r2, r1, r0)
            android.widget.LinearLayout r4 = r2.A00
            r3 = -1
            r1 = -2
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r3, r1)
            r4.addView(r7, r0)
            int r8 = r8 + 1
            r0 = 25
            if (r8 < r0) goto L_0x00dd
            android.widget.TextView r0 = r2.A01
            r0.setVisibility(r5)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A02
            r0.setVisibility(r5)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A03
            r0.setVisibility(r6)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A03
            r0.A02()
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A04
            r0.setVisibility(r6)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A04
        L_0x0112:
            r0.A02()
            return
        L_0x0116:
            r8 = 0
        L_0x0117:
            r4 = 2131625161(0x7f0e04c9, float:1.8877522E38)
            r0 = 0
            android.view.View r7 = android.view.View.inflate(r2, r4, r0)
            android.widget.LinearLayout r6 = r2.A01
            r5 = -1
            r4 = -2
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r5, r4)
            r6.addView(r7, r0)
            int r8 = r8 + 1
            r0 = 25
            if (r8 < r0) goto L_0x0117
            android.widget.TextView r0 = r2.A02
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A03
            r0.setVisibility(r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A04
            r0.setVisibility(r3)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A04
            r0.A02()
            android.view.View r0 = r2.A00
            if (r13 == 0) goto L_0x015e
            r0.setVisibility(r3)
            X.956 r0 = r2.A07
            r0.A00 = r12
            r0.A05()
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A05
            r0.setVisibility(r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A05
            r0.A00()
        L_0x015d:
            return
        L_0x015e:
            r0.setVisibility(r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A05
            r0.setVisibility(r3)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A05
            goto L_0x0112
        L_0x0169:
            androidx.recyclerview.widget.RecyclerView r0 = r2.A02
            r0.setVisibility(r6)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A04
            r0.setVisibility(r5)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A03
            r0.setVisibility(r5)
            android.widget.TextView r0 = r2.A01
            r0.setVisibility(r5)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A04
            r0.A03()
            com.facebook.shimmer.ShimmerFrameLayout r0 = r2.A03
            r0.A03()
            android.widget.LinearLayout r0 = r2.A00
            r0.removeAllViews()
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r10 = r12.iterator()
            r9 = 0
            r8 = 0
        L_0x019a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01f1
            java.lang.Object r7 = r10.next()
            X.99H r7 = (X.AnonymousClass99H) r7
            boolean r0 = r7.A0K
            if (r0 == 0) goto L_0x01c2
            if (r8 != 0) goto L_0x01b7
            r3 = 2
            r1 = 0
            X.9SY r0 = new X.9SY
            r0.<init>(r1, r1, r3)
            r4.add(r0)
            r8 = 1
        L_0x01b7:
            r3 = 1
            r1 = 0
            X.9SY r0 = new X.9SY
            r0.<init>(r7, r1, r3)
            r4.add(r0)
            goto L_0x019a
        L_0x01c2:
            java.lang.String r0 = r7.A0C()
            X.C626936e.A05(r0)
            char r1 = r0.charAt(r6)
            if (r9 == 0) goto L_0x01d5
            char r0 = r9.charValue()
            if (r0 == r1) goto L_0x01e6
        L_0x01d5:
            java.lang.Character r9 = java.lang.Character.valueOf(r1)
            java.lang.String r3 = r9.toString()
            r1 = 0
            X.9SY r0 = new X.9SY
            r0.<init>(r1, r3, r6)
            r5.add(r0)
        L_0x01e6:
            r3 = 3
            r1 = 0
            X.9SY r0 = new X.9SY
            r0.<init>(r7, r1, r3)
            r5.add(r0)
            goto L_0x019a
        L_0x01f1:
            r4.addAll(r5)
            r2.A0C = r4
            X.95D r3 = r2.A06
            java.util.List r1 = r3.A04
            X.950 r0 = new X.950
            r0.<init>(r1, r4)
            X.C18280x3.A0s(r0, r3, r4, r1)
        L_0x0202:
            X.9ER r0 = r2.A05
            java.lang.String r1 = "bankPickerShown"
            X.316 r0 = r0.A00
            r0.A0B(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191099Bh.A7Y(java.util.List, boolean):void");
    }

    public void BNU(AnonymousClass34V r3, boolean z, boolean z2, boolean z3) {
        if (this.A0D.A0X(2746)) {
            if (z2) {
                z2 = true;
            } else if (z3) {
                return;
            } else {
                if (this.A02 == null) {
                    this.A02 = r3;
                    this.A07 = false;
                    return;
                }
                if (!z) {
                    this.A0M.A0N(false);
                }
                A7X(r3, false);
                if (!this.A0m) {
                    A7W(r3, false);
                    return;
                }
                this.A07 = false;
                this.A02 = r3;
            }
        }
        if (!z && !z2) {
            this.A0M.A0N(false);
        }
        A7X(r3, z2);
        if (!this.A0m) {
            A7W(r3, z2);
            return;
        }
        this.A07 = z2;
        this.A02 = r3;
    }

    public void BNV(AnonymousClass99E r5, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, boolean z3) {
        AnonymousClass9U1 r3;
        ArrayList arrayList3;
        if (this.A0D.A0X(2746)) {
            if (z) {
                this.A0M.A0N(true);
                PaymentIncentiveViewModel paymentIncentiveViewModel = this.A0Y;
                if (paymentIncentiveViewModel != null) {
                    paymentIncentiveViewModel.A07.BkM(new AnonymousClass9h5(paymentIncentiveViewModel));
                }
            }
            if (A0C(r5, this.A0M, arrayList, arrayList2)) {
                r3 = this.A0L;
                arrayList3 = AnonymousClass002.A0J(arrayList);
                Collections.sort(arrayList3, new C204579pa(1));
                if (z2) {
                    r3.A06 = arrayList3;
                }
                r3.A05 = arrayList3;
            }
            this.A08.A05("Invalid Banks Data, throwing error");
            BNU(C1899693i.A0M(), false, z, z3);
            return;
        }
        if (z) {
            this.A0M.A0N(true);
            PaymentIncentiveViewModel paymentIncentiveViewModel2 = this.A0Y;
            if (paymentIncentiveViewModel2 != null) {
                paymentIncentiveViewModel2.A07.BkM(new AnonymousClass9h5(paymentIncentiveViewModel2));
            }
        }
        if (A0C(r5, this.A0M, arrayList, arrayList2)) {
            r3 = this.A0L;
            arrayList3 = AnonymousClass002.A0J(arrayList);
            Collections.sort(arrayList3, new C204579pa(1));
            r3.A05 = arrayList3;
        }
        this.A08.A05("Invalid Banks Data, throwing error");
        BNU(C1899693i.A0M(), false, z, z3);
        return;
        AnonymousClass9U1 r0 = this.A0L;
        r0.A07 = arrayList2;
        r0.A03 = r5;
        C18260x0.A1R(AnonymousClass001.A0o(), "PAY: IndiaUpiPaymentSetup setPspAndBanksList pspConfig: ", arrayList2);
        C18260x0.A1R(AnonymousClass001.A0o(), "PAY: IndiaUpiPaymentSetup setPspAndBanksList pspRouting: ", r5);
        C160757oG r2 = this.A08;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("banks returned: ");
        C1899593h.A1K(r2, A0o, arrayList.size());
        A7X((AnonymousClass34V) null, z);
        if (!this.A0m) {
            A7V();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C160757oG r2 = this.A08;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("onActivityResult: request: ");
        A0o.append(i);
        r2.A0A(AnonymousClass000.A0Y(" result: ", A0o, i2), (Throwable) null);
        if (i != 1000) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            A7H();
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A04.A00 = null;
    }

    public void onResume() {
        super.onResume();
        if (!isFinishing()) {
            C160757oG r2 = this.A08;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("bank setup onResume states: ");
            C1899593h.A1I(r2, this.A03, A0o);
            String A0b = AnonymousClass97T.A0b(this);
            String str = this.A06.A00((String) null, this.A0a).A01;
            if (!this.A0D.A0X(2746)) {
                ArrayList arrayList = this.A0L.A05;
                if (arrayList == null) {
                    if (!this.A0M.A0O() && !this.A0I.A0E()) {
                        this.A04.A01(AnonymousClass97T.A0b(this), false, str);
                    }
                    this.A04.A00(A0b, str, false, false);
                } else {
                    A7Y(arrayList, false);
                    return;
                }
            } else if (this.A0M.A0O() || this.A0I.A0E()) {
                AnonymousClass9U1 r1 = this.A0L;
                ArrayList arrayList2 = r1.A05;
                if (arrayList2 != null) {
                    A7Y(arrayList2, false);
                } else {
                    ArrayList arrayList3 = r1.A06;
                    if (arrayList3 != null) {
                        A7Y(arrayList3, true);
                    } else if (!this.A0N.A08(this.A0a)) {
                        this.A04.A00(A0b, str, true, false);
                    }
                    this.A04.A00(A0b, str, false, false);
                }
            } else {
                this.A04.A01(AnonymousClass97T.A0b(this), true, str);
                if (this.A0L.A05 == null) {
                    this.A04.A00(A0b, str, false, true);
                }
            }
            this.A0S.Bq0();
        }
    }
}
