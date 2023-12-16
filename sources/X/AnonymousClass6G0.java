package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaImageButton;

/* renamed from: X.6G0  reason: invalid class name */
public abstract class AnonymousClass6G0 extends AnonymousClass03Q implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            ((WaImageButton) this).A00 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass6G0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public AnonymousClass6G0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public AnonymousClass6G0(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }
}
