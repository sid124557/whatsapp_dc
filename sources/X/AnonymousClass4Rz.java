package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.whatsapp.KeyboardPopupLayout;

/* renamed from: X.4Rz  reason: invalid class name */
public abstract class AnonymousClass4Rz extends RelativeLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public static Rect A00(KeyboardPopupLayout keyboardPopupLayout) {
        keyboardPopupLayout.A07 = false;
        keyboardPopupLayout.A02 = -1;
        keyboardPopupLayout.A01 = -1;
        return new Rect();
    }

    public void A02() {
        if (!this.A01) {
            this.A01 = true;
            ((KeyboardPopupLayout) this).A05 = C86644Kx.A0b(((C88864av) ((C111685iW) generatedComponent())).A0K);
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

    public AnonymousClass4Rz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
    }

    public AnonymousClass4Rz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
    }

    public AnonymousClass4Rz(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A02();
    }

    public AnonymousClass4Rz(Context context) {
        super(context);
        A02();
    }
}
