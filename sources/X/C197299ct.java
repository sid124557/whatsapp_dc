package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;

/* renamed from: X.9ct  reason: invalid class name and case insensitive filesystem */
public class C197299ct implements C203519ns {
    public final C105365Uq A00;
    public final AnonymousClass3ZH A01;
    public final C133696hn A02;
    public final AnonymousClass39L A03;
    public final C166557yt A04;
    public final C197109ca A05;
    public final C202719mT A06;
    public final AnonymousClass9SZ A07;
    public final WeakReference A08;
    public final WeakReference A09;

    public void AxR(ViewGroup viewGroup) {
        Object obj = this.A08.get();
        AnonymousClass39L r2 = this.A03;
        AnonymousClass39Q r4 = r2.A02;
        if (r4.A00.compareTo(BigDecimal.ZERO) > 0) {
            AnonymousClass9SZ r3 = this.A07;
            C626936e.A06(obj);
            C18300x5.A0G(C86664Kz.A0h(((Activity) obj).getLayoutInflater(), viewGroup, R.layout.f8nameremoved), R.id.amount).setText(r2.A01.B3V(r3.A02, r4));
        }
    }

    public int B5m(C166587yw r3) {
        if ("other".equals(((C133696hn) r3).A00.A00)) {
            return 0;
        }
        return R.drawable.ic_link_action;
    }

    public String B5n(C166587yw r5, int i) {
        Context context = (Context) this.A08.get();
        if (context == null) {
            return "";
        }
        C133696hn r52 = (C133696hn) r5;
        if ("other".equals(r52.A00.A00)) {
            return context.getString(R.string.f11nameremoved);
        }
        Object[] A0L = AnonymousClass002.A0L();
        C166557yt r0 = r52.A09;
        C626936e.A06(r0);
        return C86614Ku.A0s(context, r0.A00, A0L, R.string.f11nameremoved);
    }

    public void BMi(ViewGroup viewGroup) {
        Activity activity = (Activity) this.A08.get();
        C08310eF r6 = (C08310eF) this.A09.get();
        if (activity != null && r6 != null) {
            View inflate = activity.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup, true);
            C18300x5.A0G(inflate, R.id.text).setText(R.string.f11nameremoved);
            ImageView A0E = AnonymousClass0x9.A0E(inflate, R.id.icon);
            int A072 = r6.A0T().A07();
            int i = R.drawable.ic_back;
            if (A072 <= 1) {
                i = R.drawable.ic_close;
            }
            A0E.setImageResource(i);
            AnonymousClass303 A062 = this.A05.A06(this.A02, (AnonymousClass303) null);
            A0E.setOnClickListener(new C204209oz(A062, this, r6, 3));
            this.A06.BKD(A062, 0, (Integer) null, "payment_confirm_prompt");
        }
    }

    public void BMk(ViewGroup viewGroup) {
        Activity activity = (Activity) this.A08.get();
        if (activity != null) {
            ViewGroup viewGroup2 = viewGroup;
            this.A07.A00(activity, (View.OnClickListener) null, viewGroup2, this.A00, this.A01, (C166557yt) null, this.A04, false);
        }
    }

    public void BTi(ViewGroup viewGroup, C166587yw r5) {
        Activity activity = (Activity) this.A08.get();
        if (activity != null) {
            activity.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup, true);
        }
    }

    public C197299ct(Activity activity, C105365Uq r3, AnonymousClass3ZH r4, C133696hn r5, AnonymousClass39L r6, C166557yt r7, C197109ca r8, C202719mT r9, PaymentBottomSheet paymentBottomSheet, AnonymousClass9SZ r11) {
        this.A05 = r8;
        this.A07 = r11;
        this.A08 = AnonymousClass0x9.A14(activity);
        this.A09 = AnonymousClass0x9.A14(paymentBottomSheet);
        this.A01 = r4;
        this.A00 = r3;
        this.A04 = r7;
        this.A03 = r6;
        this.A02 = r5;
        this.A06 = r9;
    }

    public /* synthetic */ int B7G(C166587yw r2, int i) {
        return 0;
    }

    public /* synthetic */ void Boj(C166587yw r1, PaymentMethodRow paymentMethodRow) {
    }

    public int B6h() {
        return R.string.f11nameremoved;
    }

    public /* synthetic */ String B9h() {
        return null;
    }

    public /* synthetic */ String BDp() {
        return null;
    }

    public /* synthetic */ boolean BIJ() {
        return false;
    }

    public /* synthetic */ boolean Bo9() {
        return false;
    }

    public /* synthetic */ boolean BoR() {
        return false;
    }

    public /* synthetic */ boolean Bp0() {
        return true;
    }

    public /* synthetic */ String B6i(C166587yw r2) {
        return null;
    }

    public /* synthetic */ void BMh(ViewGroup viewGroup) {
    }

    public boolean BoQ(C166587yw r2) {
        return true;
    }

    public /* synthetic */ boolean BoC(C166587yw r2, String str, int i) {
        return false;
    }
}
