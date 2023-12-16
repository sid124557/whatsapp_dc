package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentDescriptionRow;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.wds.components.button.WDSButton;
import java.math.BigDecimal;
import java.text.NumberFormat;

/* renamed from: X.9cs  reason: invalid class name and case insensitive filesystem */
public class C197289cs implements C203519ns {
    public final /* synthetic */ C85204Fi A00;
    public final /* synthetic */ AnonymousClass39Q A01;
    public final /* synthetic */ AnonymousClass39Q A02;
    public final /* synthetic */ AnonymousClass9VG A03;
    public final /* synthetic */ ConfirmPaymentFragment A04;
    public final /* synthetic */ AnonymousClass9Bs A05;
    public final /* synthetic */ PaymentBottomSheet A06;

    public C197289cs(C85204Fi r1, AnonymousClass39Q r2, AnonymousClass39Q r3, AnonymousClass9VG r4, ConfirmPaymentFragment confirmPaymentFragment, AnonymousClass9Bs r6, PaymentBottomSheet paymentBottomSheet) {
        this.A05 = r6;
        this.A06 = paymentBottomSheet;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = confirmPaymentFragment;
        this.A00 = r1;
    }

    public void AxR(ViewGroup viewGroup) {
        C194869Uu r15;
        AnonymousClass39Q r0;
        AnonymousClass9Bs r12 = this.A05;
        if (!r12.A8E(r12.A0B, r12.A0Z)) {
            ViewGroup viewGroup2 = viewGroup;
            if (r12.A0U == null || (r0 = this.A02) == null) {
                AnonymousClass9SZ r8 = r12.A0L;
                C85204Fi r7 = this.A00;
                AnonymousClass39Q r14 = this.A01;
                C18300x5.A0G(r12.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup2, true), R.id.amount).setText(r7.B3V(r8.A02, r14));
                if (!TextUtils.isEmpty(r12.A0X) && r12.A7T()) {
                    TextView textView = (TextView) r12.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup2, false);
                    C107335b8.A0F(textView, r12.getResources().getColor(R.color.f5nameremoved));
                    viewGroup2.addView(textView);
                }
                AnonymousClass9VG r02 = this.A03;
                if (r02 != null && (r15 = r02.A01) != null) {
                    AnonymousClass94M r11 = new AnonymousClass94M(r12, r12.A01, r14, r15, r12.A01, false);
                    int i = r12.A01;
                    if (i != 0) {
                        if (i != 1) {
                            if (!(i == 2 || i == 3)) {
                                if (i != 4) {
                                    if (!(i == 5 || i == 7)) {
                                        return;
                                    }
                                } else if (r15.A01 == 0) {
                                    viewGroup2.addView(r11);
                                    r12.A0T.A05(-1, 1);
                                    return;
                                } else {
                                    return;
                                }
                            }
                        } else if (r15.A00 == 0) {
                            viewGroup2.addView(r11);
                            r12.A0T.A05(1, -1);
                            return;
                        } else {
                            return;
                        }
                    }
                    viewGroup2.addView(r11);
                    return;
                }
                return;
            }
            View inflate = r12.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup2, true);
            TextView A0G = C18300x5.A0G(inflate, R.id.sending_value);
            C620733j r13 = r12.A01;
            AnonymousClass3H6 r3 = (AnonymousClass3H6) r12.A05;
            String str = r3.A04;
            String str2 = r3.A05;
            BigDecimal bigDecimal = this.A01.A00;
            A0G.setText(AnonymousClass359.A00(r13, str, str2, bigDecimal, bigDecimal.scale(), false));
            TextView A0G2 = C18300x5.A0G(inflate, R.id.exchange_rate);
            C166207yJ r82 = r12.A0U;
            AnonymousClass001.A0y(r12, A0G2, new Object[]{r82.A01, r82.A03}, R.string.f11nameremoved);
            NumberFormat A0N = r12.A01.A0N();
            A0N.setMaximumFractionDigits(2);
            C18300x5.A0G(inflate, R.id.fees_rate).setText(A0N.format(new BigDecimal(r12.A0U.A05).divide(new BigDecimal(100))));
            C85204Fi A012 = r12.A07.A01(r12.A0U.A01);
            TextView A0G3 = C18300x5.A0G(inflate, R.id.total_value);
            C620733j r6 = r12.A01;
            AnonymousClass3H6 r5 = (AnonymousClass3H6) A012;
            String str3 = r5.A04;
            String str4 = r5.A05;
            BigDecimal bigDecimal2 = r0.A00;
            A0G3.setText(AnonymousClass359.A00(r6, str3, str4, bigDecimal2, bigDecimal2.scale(), false));
            CompoundButton compoundButton = (CompoundButton) C06560Yg.A02(inflate, R.id.send_payment_agreement_checkbox);
            if (r12.A0U != null) {
                ConfirmPaymentFragment confirmPaymentFragment = this.A04;
                boolean isChecked = compoundButton.isChecked();
                WDSButton wDSButton = confirmPaymentFragment.A0S;
                if (wDSButton != null) {
                    wDSButton.setEnabled(isChecked);
                }
            }
            compoundButton.setOnCheckedChangeListener(new C204199oy(compoundButton, 0, this));
        }
    }

    public String B5n(C166587yw r4, int i) {
        AnonymousClass9Bs r2 = this.A05;
        boolean A8E = r2.A8E(r4, r2.A0Z);
        int i2 = R.string.f11nameremoved;
        if (A8E) {
            i2 = R.string.f11nameremoved;
        }
        return r2.getString(i2);
    }

    public String B6i(C166587yw r3) {
        return this.A05.A0K.A02(r3, false);
    }

    public int B7G(C166587yw r3, int i) {
        if (AnonymousClass9W6.A00(r3, this.A05.A0p)) {
            return R.string.f11nameremoved;
        }
        return 0;
    }

    public String B9h() {
        AnonymousClass9Bs r3 = this.A05;
        String A002 = C196629bS.A00(r3.A0M);
        if (!TextUtils.isEmpty(A002)) {
            return C86604Kt.A0m(r3, A002, R.string.f11nameremoved);
        }
        return null;
    }

    public boolean BIJ() {
        C133676hl r0 = this.A05.A0A;
        if (r0 == null || !r0.A0D()) {
            return false;
        }
        return true;
    }

    public void BMh(ViewGroup viewGroup) {
        AnonymousClass9Bs r3 = this.A05;
        boolean A7T = r3.A7T();
        int i = 0;
        boolean A1W = AnonymousClass000.A1W(r3.A0X);
        if (!A7T || A1W || AnonymousClass9W6.A00(r3.A0B, r3.A0p)) {
            i = 8;
        }
        viewGroup.setVisibility(i);
        PaymentDescriptionRow paymentDescriptionRow = (PaymentDescriptionRow) viewGroup.findViewById(R.id.payment_description_row);
        r3.A0M = paymentDescriptionRow;
        paymentDescriptionRow.A01(r3.A0R);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (r0.A0O.A0I(r0.A0D, r0.A0Z, r0.A0g) != false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BMi(android.view.ViewGroup r18) {
        /*
            r17 = this;
            r7 = r17
            X.9Bs r0 = r7.A05
            X.7yw r2 = r0.A0B
            java.lang.String r1 = r0.A0Z
            boolean r1 = r0.A8E(r2, r1)
            java.lang.Integer r9 = X.C18290x4.A0Z()
            r5 = 1
            r6 = r18
            if (r1 == 0) goto L_0x0056
            android.view.LayoutInflater r2 = r0.getLayoutInflater()
            r1 = 2131626226(0x7f0e08f2, float:1.8879682E38)
            android.view.View r3 = r2.inflate(r1, r6, r5)
            r1 = 2131434200(0x7f0b1ad8, float:1.8490207E38)
            android.widget.TextView r2 = X.C18300x5.A0G(r3, r1)
            r1 = 2131891565(0x7f12156d, float:1.9417854E38)
            r2.setText(r1)
            r1 = 2131430651(0x7f0b0cfb, float:1.848301E38)
            android.widget.ImageView r3 = X.AnonymousClass0x9.A0E(r3, r1)
            r1 = 2131232112(0x7f080570, float:1.8080324E38)
            r3.setImageResource(r1)
            com.whatsapp.payments.ui.PaymentBottomSheet r2 = r7.A06
            r1 = 14
            X.C204409pJ.A00(r3, r2, r7, r1)
            X.9ca r7 = r0.A0S
            r8 = 0
            java.lang.String r11 = "add_credential_prompt"
            java.lang.String r12 = r0.A0f
            r15 = 0
            boolean r16 = X.AnonymousClass9DC.A17(r0)
            java.lang.String r13 = r0.A0i
            java.lang.String r14 = r0.A0h
            r10 = r8
            r7.BKF(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0056:
            boolean r1 = X.AnonymousClass9DC.A17(r0)
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = r0.A0h
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0073
        L_0x0064:
            X.99n r4 = r0.A0O
            X.4uZ r3 = r0.A0D
            java.lang.String r2 = r0.A0Z
            java.lang.String r1 = r0.A0g
            boolean r1 = r4.A0I(r3, r2, r1)
            r8 = 0
            if (r1 == 0) goto L_0x0074
        L_0x0073:
            r8 = 1
        L_0x0074:
            android.view.LayoutInflater r2 = r0.getLayoutInflater()
            r1 = 2131624410(0x7f0e01da, float:1.8875999E38)
            if (r8 == 0) goto L_0x0080
            r1 = 2131626226(0x7f0e08f2, float:1.8879682E38)
        L_0x0080:
            android.view.View r3 = r2.inflate(r1, r6, r5)
            r1 = 2131434200(0x7f0b1ad8, float:1.8490207E38)
            android.widget.TextView r2 = X.C18300x5.A0G(r3, r1)
            r1 = 2131888081(0x7f1207d1, float:1.9410787E38)
            r2.setText(r1)
            r1 = 2131430651(0x7f0b0cfb, float:1.848301E38)
            android.widget.ImageView r6 = X.AnonymousClass0x9.A0E(r3, r1)
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = r7.A06
            X.0df r1 = r4.A0T()
            int r2 = r1.A07()
            r1 = 2131231896(0x7f080498, float:1.8079886E38)
            if (r2 > r5) goto L_0x00aa
            r1 = 2131232112(0x7f080570, float:1.8080324E38)
        L_0x00aa:
            r6.setImageResource(r1)
            if (r8 == 0) goto L_0x00fa
            X.9ca r3 = r0.A0S
            X.39Q r2 = r7.A01
            X.9VG r1 = r7.A03
            X.303 r2 = r0.A7l(r2, r1)
            X.7yw r1 = r0.A0B
            X.303 r8 = r3.A06(r1, r2)
        L_0x00bf:
            r2 = 4
            X.9oz r1 = new X.9oz
            r1.<init>(r8, r7, r4, r2)
            r6.setOnClickListener(r1)
            boolean r1 = r0.A0X
            if (r1 == 0) goto L_0x00e6
            if (r8 != 0) goto L_0x00d2
            X.303 r8 = X.C1899593h.A0K()
        L_0x00d2:
            java.lang.String r1 = "is_alias_resolved"
            r8.A02(r1, r5)
            java.lang.String r1 = r0.A0Q
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00e6
            java.lang.String r2 = "receiver_platform"
            java.lang.String r1 = r0.A0Q
            r8.A03(r2, r1)
        L_0x00e6:
            X.9ca r7 = r0.A0S
            r10 = 0
            java.lang.String r11 = "payment_confirm_prompt"
            java.lang.String r12 = r0.A0f
            r15 = 0
            boolean r16 = X.AnonymousClass9DC.A17(r0)
            java.lang.String r13 = r0.A0i
            java.lang.String r14 = r0.A0h
            r7.BKF(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x00fa:
            X.39Q r2 = r7.A01
            X.9VG r1 = r7.A03
            X.303 r8 = r0.A7l(r2, r1)
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197289cs.BMi(android.view.ViewGroup):void");
    }

    public void BMk(ViewGroup viewGroup) {
        C204249p3 r3;
        boolean z;
        AnonymousClass9Bs r2 = this.A05;
        if (!r2.A8E(r2.A0B, r2.A0Z)) {
            boolean A8C = r2.A8C();
            if (A8C) {
                if (r2 instanceof AnonymousClass9Ct) {
                    z = false;
                } else {
                    z = !r2.A7T();
                }
                int i = 64;
                if (z) {
                    i = 63;
                }
                r3 = C204249p3.A00(this, i);
            } else {
                r3 = null;
            }
            r2.A0L.A00(r2, r3, viewGroup, r2.A02, r2.A08, r2.A0G, r2.A0I, A8C);
        }
    }

    public void BTi(ViewGroup viewGroup, C166587yw r7) {
        AnonymousClass9Bs r4 = this.A05;
        AnonymousClass0x9.A0E(C86664Kz.A0h(r4.getLayoutInflater(), viewGroup, R.layout.f8nameremoved), R.id.psp_logo).setImageResource(r4.A0O.A00(r4.A0M.A07(), r4.A0a).A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0.A00 != 1) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bo9() {
        /*
            r6 = this;
            X.9Bs r5 = r6.A05
            X.9W6 r4 = r5.A0N
            X.7yw r3 = r5.A0B
            com.whatsapp.payments.ui.widget.PaymentView r0 = r5.A0N
            if (r0 == 0) goto L_0x0010
            int r2 = r0.A00
            r0 = 1
            r1 = 1
            if (r2 == r0) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            java.lang.String r0 = r5.A0Z
            boolean r0 = r4.A07(r3, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197289cs.Bo9():boolean");
    }

    public boolean BoC(C166587yw r2, String str, int i) {
        return this.A05.A8E(r2, str);
    }

    public boolean BoQ(C166587yw r2) {
        return !AnonymousClass9W6.A00(r2, this.A05.A0p);
    }

    public /* synthetic */ void Boj(C166587yw r1, PaymentMethodRow paymentMethodRow) {
    }

    public int B6h() {
        return R.string.f11nameremoved;
    }

    public /* synthetic */ String BDp() {
        return null;
    }

    public /* synthetic */ boolean BoR() {
        return false;
    }

    public boolean Bp0() {
        return true;
    }

    public /* synthetic */ int B5m(C166587yw r2) {
        return 0;
    }
}
