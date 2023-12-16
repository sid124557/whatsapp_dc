package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.WaViewPager;

/* renamed from: X.4ZW  reason: invalid class name */
public abstract class AnonymousClass4ZW extends ViewPager implements AnonymousClass4GJ {
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

    public AnonymousClass4ZW(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            ((WaViewPager) this).A00 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public AnonymousClass4ZW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((WaViewPager) this).A00 = C88864av.A02((C111685iW) generatedComponent());
        }
    }
}
