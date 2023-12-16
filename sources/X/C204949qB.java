package X;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.ConfirmReceivePaymentFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: X.9qB  reason: invalid class name and case insensitive filesystem */
public class C204949qB implements C203009my {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C204949qB(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = str;
    }

    public void BOZ(C133736hr r5) {
        C194569Tl A002;
        C202439m1 r2;
        if (this.A03 != 0) {
            Log.i("PAY: BrazilPayBloksActivity BrazilGetVerificationMethods - onCardVerified");
            A002 = AnonymousClass9U4.A00(((AnonymousClass9Bw) this.A00).A0F);
            r2 = new AnonymousClass9WS(this.A01, 15, this);
        } else {
            Log.i("PAY: BrazilConfirmReceivePayment BrazilGetVerificationMethods - onCardVerified");
            A002 = AnonymousClass9U4.A00(((ConfirmReceivePaymentFragment) this.A00).A04);
            r2 = new AnonymousClass9Wj(r5, this, this.A01, 2);
        }
        A002.A03(r2, r5);
    }

    public void BaU(AnonymousClass34V r9, List list) {
        C198179eV r5;
        int i;
        if (this.A03 != 0) {
            C198179eV r4 = null;
            if (r9 != null) {
                i = r9.A00;
            } else if (list != null && !list.isEmpty()) {
                BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A00;
                if (C195089Vv.A01(list)) {
                    i = -233;
                } else {
                    int A022 = C1899593h.A02(brazilPayBloksActivity, list);
                    JSONArray A023 = brazilPayBloksActivity.A07.A02(list);
                    int A0d = BrazilPayBloksActivity.A0d(list);
                    if (brazilPayBloksActivity.A0D.A0X(A022) && A0d != -1) {
                        r4 = (C198179eV) list.get(A0d);
                    }
                    C133736hr r3 = (C133736hr) brazilPayBloksActivity.A05.A08(this.A02);
                    if (A023 != null) {
                        ((C52792m3) this.A01).A01("on_success", brazilPayBloksActivity.A0L.A04(r3, r4, A023.toString(), A0d));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            AnonymousClass9Bw.A0c((C52792m3) this.A01, (Map) null, i);
            return;
        }
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this.A00;
        brazilConfirmReceivePaymentFragment.A00.A0D();
        if (r9 == null && list != null && !list.isEmpty()) {
            if (brazilConfirmReceivePaymentFragment.A05.A0X(2443)) {
                Collections.sort(list);
            }
            JSONArray A024 = brazilConfirmReceivePaymentFragment.A07.A02(list);
            int A0d2 = BrazilPayBloksActivity.A0d(list);
            if (A024 != null && !C195089Vv.A01(list)) {
                if (!brazilConfirmReceivePaymentFragment.A05.A0X(2443) || A0d2 == -1) {
                    r5 = null;
                } else {
                    r5 = (C198179eV) list.get(A0d2);
                }
                String str = this.A02;
                String obj = A024.toString();
                C133736hr r42 = (C133736hr) AnonymousClass9U4.A02(brazilConfirmReceivePaymentFragment.A04, str);
                if (r42 != null) {
                    Intent A012 = brazilConfirmReceivePaymentFragment.A0G.A01(brazilConfirmReceivePaymentFragment.A0Q(), r42, r5, obj, A0d2);
                    AnonymousClass98s.A0a(A012, "onboarding_context", "p2p_context");
                    brazilConfirmReceivePaymentFragment.A0m(A012);
                }
                DialogFragment dialogFragment = (DialogFragment) this.A01;
                if (dialogFragment != null) {
                    dialogFragment.A1K();
                    return;
                }
                return;
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: BrazilConfirmReceivePayment GetVerificationMethods Error: ");
        A0o.append(0);
        C18280x3.A14(A0o);
        brazilConfirmReceivePaymentFragment.A08.A01(brazilConfirmReceivePaymentFragment.A1D(), brazilConfirmReceivePaymentFragment.A05, brazilConfirmReceivePaymentFragment.A0D, 0, R.string.f11nameremoved).show();
    }
}
