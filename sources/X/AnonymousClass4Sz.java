package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.settings.SettingsRowBanner;

/* renamed from: X.4Sz  reason: invalid class name */
public abstract class AnonymousClass4Sz extends ConstraintLayout implements AnonymousClass4GJ {
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

    public AnonymousClass4Sz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((SettingsRowBanner) this).A00 = C88864av.A02((C111685iW) generatedComponent());
        }
    }
}
