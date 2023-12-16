package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.9cr  reason: invalid class name and case insensitive filesystem */
public class C197279cr implements C203519ns {
    public final /* synthetic */ C85204Fi A00;
    public final /* synthetic */ AnonymousClass39Q A01;
    public final /* synthetic */ C166587yw A02;
    public final /* synthetic */ AnonymousClass9VG A03;
    public final /* synthetic */ BrazilPaymentActivity A04;
    public final /* synthetic */ ConfirmPaymentFragment A05;

    public C197279cr(C85204Fi r1, AnonymousClass39Q r2, C166587yw r3, AnonymousClass9VG r4, BrazilPaymentActivity brazilPaymentActivity, ConfirmPaymentFragment confirmPaymentFragment) {
        this.A04 = brazilPaymentActivity;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = confirmPaymentFragment;
    }

    public void AxR(ViewGroup viewGroup) {
        C194869Uu r7;
        AnonymousClass9VG r0 = this.A03;
        if (r0 != null && (r7 = r0.A01) != null) {
            BrazilPaymentActivity brazilPaymentActivity = this.A04;
            int i = brazilPaymentActivity.A01;
            AnonymousClass94M r3 = new AnonymousClass94M(brazilPaymentActivity, brazilPaymentActivity.A06, this.A01, r7, i, true);
            int i2 = brazilPaymentActivity.A01;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (!(i2 == 2 || i2 == 3)) {
                        if (i2 != 4) {
                            if (!(i2 == 5 || i2 == 7)) {
                                return;
                            }
                        } else if (r7.A01 == 0) {
                            viewGroup.addView(r3);
                            brazilPaymentActivity.A0T.A05(-1, 1);
                            return;
                        } else {
                            return;
                        }
                    }
                } else if (r7.A00 == 0) {
                    viewGroup.addView(r3);
                    brazilPaymentActivity.A0T.A05(1, -1);
                    return;
                } else {
                    return;
                }
            }
            viewGroup.addView(r3);
        }
    }

    public int B7G(C166587yw r4, int i) {
        C133786hw r2 = (C133786hw) r4.A08;
        if (r2 == null) {
            return 0;
        }
        if (BrazilPaymentActivity.A14(r4, i)) {
            if (!"ACTIVE".equals(r2.A0I)) {
                return R.string.f11nameremoved;
            }
            BrazilPaymentActivity brazilPaymentActivity = this.A04;
            if (brazilPaymentActivity.A0O.A0F() || brazilPaymentActivity.A0O.A0C()) {
                return R.string.f11nameremoved;
            }
            return R.string.f11nameremoved;
        } else if (r2.A0a) {
            return 0;
        } else {
            return R.string.f11nameremoved;
        }
    }

    public String BDp() {
        return this.A00.B3V(this.A04.A06, this.A01);
    }

    public boolean BIJ() {
        return this.A04.A0g;
    }

    public void BMi(ViewGroup viewGroup) {
        String str;
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        TextView A09 = AnonymousClass002.A09(brazilPaymentActivity.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup, true), R.id.text);
        AnonymousClass001.A0y(brazilPaymentActivity.A02, A09, new Object[]{brazilPaymentActivity.A05.A0H(brazilPaymentActivity.A07.A01(brazilPaymentActivity.A0G))}, R.string.f11nameremoved);
        if (brazilPaymentActivity instanceof BrazilOrderDetailsActivity) {
            str = "order_details";
        } else {
            str = "new_payment";
        }
        AnonymousClass9Wg.A03(AnonymousClass9Wg.A01(brazilPaymentActivity.A06, this.A01, this.A03, brazilPaymentActivity.A0g), brazilPaymentActivity.A0L, "payment_confirm_prompt", str);
    }

    public void BTi(ViewGroup viewGroup, C166587yw r17) {
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        View inflate = brazilPaymentActivity.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup, true);
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(inflate, R.id.footer_text);
        boolean equals = "p2m".equals(brazilPaymentActivity.A0p);
        int i = R.string.f11nameremoved;
        if (equals) {
            i = R.string.f11nameremoved;
        }
        Context context = brazilPaymentActivity.A02;
        SpannableString spannableString = new SpannableString(AnonymousClass002.A0F(context, context.getString(i), new Object[1], 0, R.string.f11nameremoved));
        AnonymousClass5UY A0M = AnonymousClass0x2.A0M(inflate, R.id.hidden_additional_tos);
        if ("p2m".equals(brazilPaymentActivity.A0p)) {
            A0M.A06(0);
            C106715a2 r9 = brazilPaymentActivity.A0b;
            Context context2 = brazilPaymentActivity.A02;
            String[] strArr = {brazilPaymentActivity.A0D.A0Q(2671), brazilPaymentActivity.A0D.A0Q(2670), "https://faq.whatsapp.com/1445437352532377"};
            SpannableString A042 = r9.A04(context2, context2.getString(R.string.f11nameremoved), new Runnable[]{new C198189eW(), new C198199eX(), new C198209eY()}, new String[]{"meta-terms-privacy", "wa-terms-privacy", "wa-brazil-p2m-learn-more"}, strArr);
            AnonymousClass0x2.A14(brazilPaymentActivity.A0D, (TextEmojiLabel) A0M.A04());
            ((TextView) A0M.A04()).setText(A042);
        }
        AnonymousClass0x2.A12(A0K, brazilPaymentActivity.A08);
        AnonymousClass0x2.A14(brazilPaymentActivity.A0D, A0K);
        A0K.setText(spannableString);
    }

    public String B5n(C166587yw r7, int i) {
        int i2;
        Context context;
        if (BrazilPaymentActivity.A14(r7, i)) {
            Context context2 = this.A04.A02;
            i2 = R.string.f11nameremoved;
            context = context2;
        } else {
            C133796hx r0 = this.A02.A08;
            C626936e.A06(r0);
            boolean A0B = r0.A0B();
            BrazilPaymentActivity brazilPaymentActivity = this.A04;
            i2 = R.string.f11nameremoved;
            context = brazilPaymentActivity;
            if (A0B) {
                return C86614Ku.A0s(brazilPaymentActivity, this.A00.B3V(brazilPaymentActivity.A06, this.A01), AnonymousClass002.A0L(), R.string.f11nameremoved);
            }
        }
        return context.getString(i2);
    }

    public boolean BoC(C166587yw r2, String str, int i) {
        return BrazilPaymentActivity.A14(r2, i);
    }

    public void Boj(C166587yw r2, PaymentMethodRow paymentMethodRow) {
        if (C195169Wk.A08(r2) && !this.A05.A0Z) {
            this.A04.A0R.A02(r2, paymentMethodRow);
        }
    }

    public int B6h() {
        return R.string.f11nameremoved;
    }

    public /* synthetic */ String B9h() {
        return null;
    }

    public /* synthetic */ boolean Bo9() {
        return false;
    }

    public boolean BoR() {
        return true;
    }

    public boolean Bp0() {
        return true;
    }

    public /* synthetic */ int B5m(C166587yw r2) {
        return 0;
    }

    public /* synthetic */ String B6i(C166587yw r2) {
        return null;
    }

    public /* synthetic */ void BMh(ViewGroup viewGroup) {
    }

    public /* synthetic */ void BMk(ViewGroup viewGroup) {
    }

    public boolean BoQ(C166587yw r2) {
        return true;
    }
}
