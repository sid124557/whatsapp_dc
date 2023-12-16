package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;

/* renamed from: X.8YU  reason: invalid class name */
public final class AnonymousClass8YU extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ IndiaUpiInternationalActivationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YU(IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity) {
        super(1);
        this.this$0 = indiaUpiInternationalActivationActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1452874x r6 = (C1452874x) obj;
        if (r6 instanceof AnonymousClass6o9) {
            IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity = this.this$0;
            Intent putExtra = new Intent().putExtra("INTERNATIONAL_ACTIVATION_RESPONSE", "INTERNATIONAL_ACTIVATION_SUCCESS");
            C166467yj r4 = ((AnonymousClass6o9) r6).A00;
            indiaUpiInternationalActivationActivity.setResult(-1, putExtra.putExtra("INTERNATIONAL_ACTIVATION_RESULT_STATE", r4).putExtra("INTERNATIONAL_QR_SOURCE", this.this$0.getIntent().getStringExtra("INTERNATIONAL_QR_SOURCE")).putExtra("INTERNATIONAL_QR_PAYLOAD", this.this$0.getIntent().getParcelableExtra("INTERNATIONAL_QR_PAYLOAD")));
            String str = r4.A01;
            int length = str.length();
            IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity2 = this.this$0;
            if (length > 0) {
                C19340zH A00 = AnonymousClass5V0.A00(indiaUpiInternationalActivationActivity2);
                A00.A0i(false);
                A00.A0h(this.this$0.getString(R.string.f11nameremoved));
                A00.A0g(str);
                A00.A0Y(new C1891190b(this.this$0, 51), R.string.f11nameremoved);
                C18280x3.A0q(A00);
            } else {
                indiaUpiInternationalActivationActivity2.finish();
            }
        }
        return C59022wD.A00;
    }
}
