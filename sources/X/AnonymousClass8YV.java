package X;

import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.8YV  reason: invalid class name */
public final class AnonymousClass8YV extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ IndiaUpiInternationalActivationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YV(IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity) {
        super(1);
        this.this$0 = indiaUpiInternationalActivationActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C158457k0 r7 = (C158457k0) obj;
        boolean z = r7.A02;
        ProgressBar progressBar = this.this$0.A02;
        if (z) {
            if (progressBar == null) {
                throw C18270x1.A0S("buttonSpinnerView");
            }
            progressBar.setVisibility(0);
            WDSButton wDSButton = this.this$0.A09;
            if (wDSButton == null) {
                throw C18270x1.A0S("buttonView");
            }
            wDSButton.setText("");
        } else if (progressBar == null) {
            throw C18270x1.A0S("buttonSpinnerView");
        } else {
            progressBar.setVisibility(8);
            WDSButton wDSButton2 = this.this$0.A09;
            if (wDSButton2 == null) {
                throw C18270x1.A0S("buttonView");
            }
            wDSButton2.setText(R.string.f11nameremoved);
        }
        C152397Ys r1 = r7.A00;
        if (r1 != null) {
            C19340zH A00 = AnonymousClass5V0.A00(this.this$0);
            A00.A0i(false);
            A00.A0h(r1.A02);
            A00.A0g(r1.A01);
            A00.A0W(new C1891190b(this.this$0, 52), R.string.f11nameremoved);
            C18280x3.A0q(A00);
        }
        return C59022wD.A00;
    }
}
