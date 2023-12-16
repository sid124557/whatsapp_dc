package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.components.RoundCornerProgressBar;

/* renamed from: X.6Em  reason: invalid class name and case insensitive filesystem */
public abstract class C124936Em extends View implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            ((RoundCornerProgressBar) this).A05 = C88864av.A02((C111685iW) generatedComponent());
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

    public C124936Em(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
