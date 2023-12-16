package X;

import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4j4  reason: invalid class name and case insensitive filesystem */
public final class C91184j4 extends AnonymousClass4Z7 {
    public AnonymousClass5MO A00;
    public final LinearLayout A01;
    public final CallGridViewModel A02;
    public final WDSButton A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91184j4(View view, AnonymousClass30B r10, CallGridViewModel callGridViewModel, AnonymousClass5UX r12, AnonymousClass5ZU r13) {
        super(view, r10, (AnonymousClass7D2) null, callGridViewModel, r12, r13);
        C18260x0.A0c(r10, view, r12, r13);
        this.A02 = callGridViewModel;
        this.A01 = (LinearLayout) C18280x3.A0E(view, R.id.container);
        this.A03 = C86614Ku.A0p(view, R.id.stop_btn);
    }

    public void A0G(C105175Tw r3) {
        C162457s7.A0J(r3, 0);
        this.A07 = r3;
        this.A01.setRotation((float) r3.A03);
        C109705f3.A00(this.A03, this, r3, 40);
    }

    public void A08() {
        if (A06()) {
            this.A07 = null;
            this.A03.setOnClickListener((View.OnClickListener) null);
        }
    }

    public void A0A(int i) {
    }
}
