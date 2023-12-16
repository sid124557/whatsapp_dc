package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;

/* renamed from: X.9cv  reason: invalid class name and case insensitive filesystem */
public class C197319cv implements C203489nm {
    public final /* synthetic */ C133696hn A00;
    public final /* synthetic */ AnonymousClass39L A01;
    public final /* synthetic */ AnonymousClass9Cu A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    public C197319cv(C133696hn r1, AnonymousClass39L r2, AnonymousClass9Cu r3, PaymentBottomSheet paymentBottomSheet) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = paymentBottomSheet;
    }

    public void BPe(View view, View view2, C195319Xg r9, C133676hl r10, C166587yw r11, PaymentBottomSheet paymentBottomSheet) {
        String str;
        C620933l r0;
        AnonymousClass9Cu r5 = this.A02;
        r5.BKD(r5.A0S.A06(r11, (AnonymousClass303) null), AnonymousClass001.A0f(), 4, "payment_confirm_prompt");
        this.A03.A1K();
        AnonymousClass39L r02 = this.A01;
        C133696hn r112 = (C133696hn) r11;
        r5.A01 = r112;
        Intent A08 = C18300x5.A08(r5.A8I(r02));
        Object obj = r112.A00.A00;
        if ("other".equals(obj)) {
            A08 = Intent.createChooser(A08, r5.getString(R.string.f11nameremoved));
            r0 = r5.A0P;
            str = null;
        } else {
            str = (String) obj;
            A08.setPackage(str);
            r0 = r5.A0P;
        }
        C18270x1.A0j(C620933l.A00(r0), "pref_p2m_hybrid_last_used_payment_option", str);
        r5.startActivityForResult(A08, 1022);
    }

    public void BXo(PaymentBottomSheet paymentBottomSheet, int i) {
        AnonymousClass9Cu r5 = this.A02;
        C197109ca r1 = r5.A0S;
        C133696hn r4 = this.A00;
        r5.BKD(r1.A06(r4, (AnonymousClass303) null), AnonymousClass001.A0f(), 84, "payment_confirm_prompt");
        r5.A81(r4, this.A01, this.A03);
    }

    public /* synthetic */ void BXs(C166587yw r1, PaymentMethodRow paymentMethodRow) {
    }

    public /* synthetic */ void BXz(PaymentBottomSheet paymentBottomSheet, int i) {
    }

    public /* synthetic */ void BY0(int i) {
    }

    public /* synthetic */ void BeU(PaymentBottomSheet paymentBottomSheet) {
    }

    public /* synthetic */ void BXv(PaymentBottomSheet paymentBottomSheet, int i, int i2) {
    }

    public /* synthetic */ void BUf(PaymentBottomSheet paymentBottomSheet, List list, int i, int i2) {
    }
}
