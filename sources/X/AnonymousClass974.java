package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.payments.ui.widget.PayToolbar;

/* renamed from: X.974  reason: invalid class name */
public abstract class AnonymousClass974 extends C89094bU {
    public boolean A00;

    public void A0K() {
        if (!this.A00) {
            this.A00 = true;
            PayToolbar payToolbar = (PayToolbar) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            AnonymousClass73Q.A00(payToolbar, (AnonymousClass5GB) r1.A00.A0t.get());
            payToolbar.A04 = C64333Db.A2t(r1);
            payToolbar.A05 = C64333Db.A4B(r1);
        }
    }

    public AnonymousClass974(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0K();
    }

    public AnonymousClass974(Context context) {
        super(context);
        A0K();
    }

    public AnonymousClass974(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0K();
    }
}
