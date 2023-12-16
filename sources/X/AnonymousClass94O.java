package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.payments.ui.widget.ContactMerchantView;

/* renamed from: X.94O  reason: invalid class name */
public abstract class AnonymousClass94O extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass94O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ContactMerchantView contactMerchantView = (ContactMerchantView) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            contactMerchantView.A02 = C64333Db.A4B(r1);
            contactMerchantView.A03 = C1899593h.A0V(r1.A00);
            contactMerchantView.A00 = C64333Db.A26(r1);
            contactMerchantView.A01 = C64333Db.A2o(r1);
        }
    }
}
