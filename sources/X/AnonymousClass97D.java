package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.ListItemWithLeftIcon;

/* renamed from: X.97D  reason: invalid class name */
public abstract class AnonymousClass97D extends ListItemWithLeftIcon {
    public boolean A00;

    public void A03() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            AnonymousClass5YK.A02(this, C64333Db.A4B(A002));
            AnonymousClass5YK.A01(this, C64333Db.A2t(A002));
            AnonymousClass5YK.A00(this, C64333Db.A2o(A002));
        }
    }

    public AnonymousClass97D(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
    }
}
