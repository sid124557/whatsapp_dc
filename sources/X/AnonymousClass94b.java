package X;

import android.view.View;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiMyQrFragment;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment;

/* renamed from: X.94b  reason: invalid class name */
public class AnonymousClass94b extends AnonymousClass0AZ implements C181598n1 {
    public C102095Hl[] A00;
    public final /* synthetic */ IndiaUpiQrTabActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass94b(C08270df r2, IndiaUpiQrTabActivity indiaUpiQrTabActivity, int i) {
        super(r2, 0);
        this.A01 = indiaUpiQrTabActivity;
        this.A00 = new C102095Hl[i];
    }

    public CharSequence A04(int i) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A01;
        int i2 = R.string.f11nameremoved;
        if (i != 0) {
            if (i != 1) {
                throw AnonymousClass001.A0c("The item position is not defined");
            }
            i2 = R.string.f11nameremoved;
        }
        return indiaUpiQrTabActivity.getString(i2);
    }

    public int A0C() {
        return this.A00.length;
    }

    public C08310eF A0H(int i) {
        if (i == 0) {
            return new IndiaUpiScanQrCodeFragment();
        }
        if (i == 1) {
            return IndiaUpiMyQrFragment.A00(IndiaUpiQrTabActivity.A0H);
        }
        throw AnonymousClass001.A0c("The item position is not defined");
    }

    public View BAT(int i) {
        C102095Hl[] r3 = this.A00;
        if (r3[i] == null) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A01.A01;
            C102095Hl r2 = new C102095Hl(AnonymousClass001.A0R(C18280x3.A0D(pagerSlidingTabStrip), pagerSlidingTabStrip, R.layout.f8nameremoved));
            CharSequence A04 = A04(i);
            C626936e.A06(A04);
            r2.A01.setText(A04);
            r3[i] = r2;
        }
        return r3[i].A00;
    }
}
