package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentMethodSelectionActivity;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.9Lj  reason: invalid class name and case insensitive filesystem */
public class C192739Lj implements C203509nr {
    public Object A00;
    public final int A01;

    public C192739Lj(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* synthetic */ View B4C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.A01 == 0) {
            return null;
        }
        AnonymousClass9D7 r1 = (AnonymousClass9D7) this.A00;
        if (r1.A0G.size() == 0) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, (ViewGroup) null);
        C1899593h.A0m(inflate, R.id.check_balance_icon, AnonymousClass0Y8.A04(r1, R.color.f5nameremoved));
        return inflate;
    }

    public /* synthetic */ View B7m(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        if (this.A01 != 0) {
            return AnonymousClass001.A0R(layoutInflater, frameLayout, R.layout.f8nameremoved);
        }
        return null;
    }

    public /* synthetic */ int B9g(C166587yw r3) {
        if (this.A01 == 0 || !r3.equals(((AnonymousClass9D7) this.A00).A03)) {
            return 0;
        }
        return R.drawable.countrypicker_checkmark;
    }

    public /* synthetic */ String B9j(C166587yw r3) {
        if (this.A01 != 0) {
            return ((AnonymousClass9D7) this.A00).A0A.A02(r3, false);
        }
        return null;
    }

    public void BM8() {
        if (this.A01 != 0) {
            AnonymousClass9DC r2 = (AnonymousClass9DC) this.A00;
            r2.A6T(AnonymousClass97T.A0X(r2), false);
            return;
        }
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this.A00;
        String A03 = brazilConfirmReceivePaymentFragment.A0G.A03("p2p_context", false);
        Intent A032 = C1899693i.A03(brazilConfirmReceivePaymentFragment.A0Q());
        if (A03 == null) {
            A03 = "brpay_p_add_card";
        }
        A032.putExtra("screen_name", A03);
        AnonymousClass98s.A0a(A032, "onboarding_context", "p2p_context");
        brazilConfirmReceivePaymentFragment.A0m(A032);
    }

    public /* synthetic */ void BMC() {
        Intent intent;
        if (this.A01 != 0) {
            AnonymousClass9D7 r3 = (AnonymousClass9D7) this.A00;
            if (r3.A0G.size() == 1) {
                AnonymousClass99H r0 = (AnonymousClass99H) C1899693i.A0D(r3.A0G, 0).A08;
                if (r0 == null || AnonymousClass99H.A00(r0)) {
                    intent = C1899593h.A06(r3, C1899693i.A0D(r3.A0G, 0), IndiaUpiCheckBalanceActivity.class);
                } else {
                    r3.A7p(r3.A09, "ConfirmPaymentFragment");
                    C19340zH A08 = C1899693i.A08(r3);
                    C204219p0.A01(A08, r3, 22, R.string.f11nameremoved);
                    A08.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
                    A08.A00.A0L(new C204629pf(r3, 8));
                    C18280x3.A0q(A08);
                    return;
                }
            } else {
                List list = r3.A0G;
                intent = AnonymousClass0x9.A08(r3, IndiaUpiPaymentMethodSelectionActivity.class);
                intent.putExtra("bank_accounts", (Serializable) list);
            }
            r3.BpY(intent, 1015);
        }
    }

    public boolean BoR() {
        if (this.A01 != 0) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean BoY() {
        if (this.A01 != 0) {
            return false;
        }
        return true;
    }

    public void Boj(C166587yw r2, PaymentMethodRow paymentMethodRow) {
        if (this.A01 == 0 && C195169Wk.A08(r2)) {
            ((BrazilConfirmReceivePaymentFragment) this.A00).A0F.A02(r2, paymentMethodRow);
        }
    }

    public /* synthetic */ View BB1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public /* synthetic */ void BNF() {
    }

    public /* synthetic */ boolean BoP() {
        return true;
    }

    public /* synthetic */ String B9i(C166587yw r2) {
        return null;
    }

    public /* synthetic */ boolean BoB(C166587yw r2) {
        return false;
    }
}
