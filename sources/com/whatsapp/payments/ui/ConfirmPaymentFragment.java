package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass32Y;
import X.AnonymousClass9U4;
import X.AnonymousClass9XZ;
import X.C06560Yg;
import X.C08310eF;
import X.C133676hl;
import X.C133696hn;
import X.C133786hw;
import X.C133796hx;
import X.C158777kX;
import X.C166587yw;
import X.C182868p7;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C1907099n;
import X.C195169Wk;
import X.C202729mU;
import X.C203489nm;
import X.C203519ns;
import X.C204409pJ;
import X.C620733j;
import X.C626936e;
import X.C86604Kt;
import X.C86644Kx;
import X.C86654Ky;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public class ConfirmPaymentFragment extends Hilt_ConfirmPaymentFragment implements C202729mU, C182868p7 {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public ViewGroup A06;
    public FrameLayout A07;
    public FrameLayout A08;
    public ProgressBar A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public WaImageView A0D;
    public WaTextView A0E;
    public WaTextView A0F;
    public WaTextView A0G;
    public C620733j A0H;
    public C133676hl A0I;
    public C166587yw A0J;
    public AnonymousClass1VX A0K;
    public C1907099n A0L;
    public AnonymousClass9U4 A0M;
    public C203519ns A0N;
    public C203489nm A0O;
    public C158777kX A0P;
    public AnonymousClass9XZ A0Q;
    public PaymentMethodRow A0R;
    public WDSButton A0S;
    public Integer A0T;
    public String A0U;
    public String A0V;
    public List A0W;

    public static ConfirmPaymentFragment A00(C166587yw r4, UserJid userJid, AnonymousClass9XZ r6, String str, String str2, int i) {
        ConfirmPaymentFragment confirmPaymentFragment = new ConfirmPaymentFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putParcelable("arg_payment_method", r4);
        if (userJid != null) {
            A082.putString("arg_jid", userJid.getRawString());
        }
        A082.putInt("arg_payment_type", i);
        A082.putString("arg_transaction_type", str);
        A082.putParcelable("arg_order_payment_installment_content", r6);
        A082.putString("arg_merchant_code", str2);
        confirmPaymentFragment.A0u(A082);
        return confirmPaymentFragment;
    }

    public void A1J(int i) {
        String str;
        this.A01 = i;
        this.A04.setVisibility(0);
        TextView textView = this.A0C;
        if (i == 0) {
            textView.setText(R.string.f11nameremoved);
            this.A0D.setImageResource(R.drawable.cart);
            str = "p2m";
        } else {
            textView.setText(R.string.f11nameremoved);
            this.A0D.setImageResource(R.drawable.ic_contacts_storage_usage);
            str = "p2p";
        }
        this.A0V = str;
        C203489nm r0 = this.A0O;
        if (r0 != null) {
            r0.BY0(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1K(X.C166587yw r9, X.AnonymousClass9XZ r10, java.lang.Integer r11) {
        /*
            r8 = this;
            android.view.ViewGroup r0 = r8.A06
            r1 = 8
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r8.A05
            r0.setVisibility(r1)
            X.9ns r1 = r8.A0N
            if (r1 == 0) goto L_0x011e
            int r0 = r8.A01
            java.lang.String r1 = r1.B5n(r9, r0)
            X.9ns r0 = r8.A0N
            int r2 = r0.B5m(r9)
        L_0x001c:
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0S
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r1 = r8.A0S
            X.9ns r0 = r8.A0N
            boolean r0 = r0.Bo9()
            r0 = r0 ^ 1
            r1.setEnabled(r0)
            if (r2 == 0) goto L_0x0035
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0S
            r0.setIcon((int) r2)
        L_0x0035:
            if (r10 == 0) goto L_0x0117
            if (r11 == 0) goto L_0x0117
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0117
            int r1 = r9.A08()
            r0 = 4
            if (r1 == r0) goto L_0x004b
            r0 = 6
            if (r1 != r0) goto L_0x0117
            int r0 = r8.A00
            if (r0 != 0) goto L_0x0117
        L_0x004b:
            boolean r0 = r9 instanceof X.C133736hr
            if (r0 == 0) goto L_0x0117
            X.1VX r1 = r8.A0K
            r0 = 4443(0x115b, float:6.226E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0117
            X.6hr r9 = (X.C133736hr) r9
            int r0 = r9.A01
            java.lang.String r4 = X.C133736hr.A02(r0)
            java.util.List r1 = r10.A01
            if (r1 == 0) goto L_0x011b
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x011b
            java.util.Iterator r3 = r1.iterator()
        L_0x0071:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x011b
            java.lang.Object r2 = r3.next()
            X.38o r2 = (X.C632638o) r2
            java.lang.String r1 = r2.A00
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
            X.C162457s7.A0D(r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0071
            java.util.List r7 = r2.A02
        L_0x0090:
            r8.A0W = r7
            if (r7 == 0) goto L_0x0117
            int r6 = r11.intValue()
            X.33j r5 = r8.A0H
            r0 = 2
            X.C162457s7.A0J(r5, r0)
            int r3 = r7.size()
            r2 = 0
        L_0x00a3:
            r4 = 0
            if (r2 >= r3) goto L_0x00c3
            if (r2 != r6) goto L_0x0118
            java.lang.Object r0 = r7.get(r2)
            X.38n r0 = (X.C632538n) r0
            X.39L r0 = r0.A01
            if (r0 == 0) goto L_0x0118
            X.39Q r0 = r0.A02
            if (r0 == 0) goto L_0x0118
            java.math.BigDecimal r1 = r0.A00
            if (r1 == 0) goto L_0x0118
            X.4Fi r0 = X.AnonymousClass1S3.A04
            X.C626936e.A06(r0)
            java.lang.String r4 = r0.B3W(r5, r1)
        L_0x00c3:
            java.util.List r0 = r8.A0W
            java.lang.Object r0 = r0.get(r6)
            X.38n r0 = (X.C632538n) r0
            int r0 = r0.A00
            if (r4 == 0) goto L_0x0117
            android.content.res.Resources r5 = X.C08310eF.A09(r8)
            r3 = 2131888082(0x7f1207d2, float:1.941079E38)
            java.lang.Object[] r1 = X.AnonymousClass002.A0M()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2 = 0
            X.C18280x3.A19(r0, r4, r1)
            java.lang.String r1 = r5.getString(r3, r1)
            com.whatsapp.WaTextView r0 = r8.A0F
            r0.setText(r1)
            android.view.ViewGroup r0 = r8.A06
            r0.setVisibility(r2)
            android.view.ViewGroup r0 = r8.A05
            r0.setVisibility(r2)
            X.9ns r0 = r8.A0N
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = r0.BDp()
            if (r0 == 0) goto L_0x010a
            X.9ns r0 = r8.A0N
            java.lang.String r1 = r0.BDp()
            com.whatsapp.WaTextView r0 = r8.A0G
            r0.setText(r1)
        L_0x010a:
            com.whatsapp.WaTextView r0 = r8.A0E
            r0.setText(r4)
            com.whatsapp.wds.components.button.WDSButton r1 = r8.A0S
            r0 = 2131890207(0x7f12101f, float:1.94151E38)
            r1.setText(r0)
        L_0x0117:
            return
        L_0x0118:
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x011b:
            r7 = 0
            goto L_0x0090
        L_0x011e:
            java.lang.String r1 = ""
            r2 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.ConfirmPaymentFragment.A1K(X.7yw, X.9XZ, java.lang.Integer):void");
    }

    public void BXr(C166587yw r6) {
        boolean z;
        String str;
        int B6h;
        C133786hw r0;
        this.A0J = r6;
        C204409pJ.A00(this.A0S, r6, this, 7);
        if (r6.A08() == 6 && (r0 = (C133786hw) r6.A08) != null) {
            this.A00 = r0.A03;
        }
        C203519ns r02 = this.A0N;
        if (r02 != null) {
            z = r02.BoQ(r6);
            if (z && (B6h = r02.B6h()) != 0) {
                this.A0R.A03.setText(B6h);
            }
        } else {
            z = false;
        }
        this.A0R.A03.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        C203519ns r03 = this.A0N;
        String str2 = null;
        if (r03 != null) {
            str = r03.B6i(r6);
        } else {
            str = null;
        }
        PaymentMethodRow paymentMethodRow = this.A0R;
        if (TextUtils.isEmpty(str)) {
            str = this.A0P.A02(r6, true);
        }
        paymentMethodRow.A06(str);
        C203519ns r04 = this.A0N;
        if ((r04 == null || (str2 = r04.B9h()) == null) && !(r6 instanceof C133696hn)) {
            C133796hx r05 = r6.A08;
            C626936e.A06(r05);
            if (!r05.A0B()) {
                str2 = C08310eF.A09(this).getString(R.string.f11nameremoved);
            }
        }
        this.A0R.A05(str2);
        C203519ns r1 = this.A0N;
        if (r1 == null || !r1.BoR()) {
            C195169Wk.A07(r6, this.A0R);
        } else {
            r1.Boj(r6, this.A0R);
        }
        C203519ns r2 = this.A0N;
        if (r2 != null) {
            boolean BoC = r2.BoC(r6, this.A0U, this.A01);
            PaymentMethodRow paymentMethodRow2 = this.A0R;
            if (BoC) {
                paymentMethodRow2.A07(false);
                this.A0R.A05(C08310eF.A09(this).getString(R.string.f11nameremoved));
            } else {
                paymentMethodRow2.A07(true);
            }
        }
        A1K(r6, this.A0Q, this.A0T);
        C203519ns r12 = this.A0N;
        if (r12 != null) {
            r12.BMi(this.A08);
            FrameLayout frameLayout = this.A07;
            if (frameLayout != null) {
                this.A0N.BTi(frameLayout, r6);
            }
            int B7G = this.A0N.B7G(r6, this.A01);
            TextView textView = this.A0A;
            if (B7G != 0) {
                textView.setText(B7G);
            } else {
                textView.setVisibility(8);
                this.A02.setVisibility(8);
            }
            this.A0S.setEnabled(!this.A0N.Bo9());
        }
        C203489nm r13 = this.A0O;
        if (r13 != null) {
            r13.BXs(r6, this.A0R);
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        this.A08 = C86654Ky.A0L(inflate, R.id.title_view);
        this.A0R = (PaymentMethodRow) C06560Yg.A02(inflate, R.id.payment_method_row);
        ViewGroup A0I2 = C86644Kx.A0I(inflate, R.id.transaction_description_container);
        this.A0S = C86654Ky.A0f(inflate, R.id.confirm_payment);
        this.A07 = C86654Ky.A0L(inflate, R.id.footer_view);
        this.A0A = C18300x5.A0G(inflate, R.id.education);
        this.A09 = (ProgressBar) C06560Yg.A02(inflate, R.id.confirm_payment_progressbar);
        this.A02 = C06560Yg.A02(inflate, R.id.education_divider);
        inflate.findViewById(R.id.account_number_divider).setVisibility(8);
        C86604Kt.A1F(inflate, R.id.payment_method_account_id, 8);
        this.A06 = C86644Kx.A0I(inflate, R.id.installment_container);
        this.A0F = AnonymousClass0x7.A0L(inflate, R.id.installment_content);
        this.A05 = C86644Kx.A0I(inflate, R.id.amount_container);
        this.A0G = AnonymousClass0x7.A0L(inflate, R.id.total_amount_value_text);
        this.A0E = AnonymousClass0x7.A0L(inflate, R.id.due_today_value_text);
        C166587yw r6 = this.A0J;
        C133796hx r4 = r6.A08;
        if ((r4 instanceof C133786hw) && r6.A08() == 6 && "p2p".equals(this.A0V)) {
            ((C133786hw) r4).A03 = 1;
        }
        BXr(r6);
        this.A04 = C06560Yg.A02(inflate, R.id.payment_to_merchant_options_container);
        this.A0C = C18300x5.A0G(inflate, R.id.payment_to_merchant_options);
        this.A0D = AnonymousClass0x9.A0L(inflate, R.id.payment_to_merchant_options_icon);
        this.A03 = C06560Yg.A02(inflate, R.id.payment_rails_container);
        this.A0B = C18300x5.A0G(inflate, R.id.payment_rails_label);
        C08310eF r62 = this.A0E;
        C204409pJ.A00(inflate.findViewById(R.id.payment_method_container), r62, this, 2);
        C204409pJ.A00(A0I2, r62, this, 3);
        C204409pJ.A00(inflate.findViewById(R.id.payment_to_merchant_options_container), r62, this, 4);
        C204409pJ.A00(inflate.findViewById(R.id.payment_rails_container), r62, this, 5);
        C204409pJ.A00(inflate.findViewById(R.id.installment_container), r62, this, 6);
        if (this.A0N != null) {
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.contact_info_view);
            if (viewGroup2 != null) {
                this.A0N.BMk(viewGroup2);
            }
            this.A0N.BMh(A0I2);
            View findViewById = inflate.findViewById(R.id.payment_method_container);
            if (findViewById != null) {
                if (!this.A0N.Bp0()) {
                    i = 8;
                }
                findViewById.setVisibility(i);
            }
            ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.extra_info_view);
            if (viewGroup3 != null) {
                this.A0N.AxR(viewGroup3);
            }
        }
        return inflate;
    }

    public void A0c() {
        super.A0c();
        this.A07 = null;
    }

    public void A0f() {
        C133676hl r0;
        C203519ns r02;
        super.A0f();
        UserJid A082 = AnonymousClass32Y.A08(A0H().getString("arg_jid"));
        if (A082 != null) {
            r0 = AnonymousClass9U4.A03(this.A0M).A05(A082);
        } else {
            r0 = null;
        }
        this.A0I = r0;
        int A083 = this.A0J.A08();
        View view = this.A03;
        if (A083 == 6) {
            view.setVisibility(0);
            if (this.A0J.A08 != null) {
                int i = this.A00;
                TextView textView = this.A0B;
                int i2 = R.string.f11nameremoved;
                if (i == 0) {
                    i2 = R.string.f11nameremoved;
                }
                textView.setText(i2);
            }
        } else {
            view.setVisibility(8);
        }
        if ((this.A0L.A0F() || this.A0L.A0A()) && (r02 = this.A0N) != null && r02.BIJ()) {
            A1J(this.A01);
            this.A04.setVisibility(8);
            FrameLayout frameLayout = this.A07;
            if (frameLayout != null) {
                this.A0N.BTi(frameLayout, this.A0J);
            }
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        Parcelable parcelable = A0H().getParcelable("arg_payment_method");
        C626936e.A06(parcelable);
        this.A0J = (C166587yw) parcelable;
        int i = A0H().getInt("arg_payment_type");
        C626936e.A06(Integer.valueOf(i));
        this.A01 = i;
        this.A0V = C18310x6.A0k(A0H(), "arg_transaction_type");
        this.A0Q = (AnonymousClass9XZ) A0H().getParcelable("arg_order_payment_installment_content");
        this.A0U = A0H().getString("arg_merchant_code");
        Integer num = null;
        if (this.A0Q != null) {
            num = C18290x4.A0Z();
        }
        this.A0T = num;
    }

    public void BUg(int i) {
        Integer valueOf = Integer.valueOf(i);
        this.A0T = valueOf;
        A1K(this.A0J, this.A0Q, valueOf);
    }
}
