package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* renamed from: X.6FZ  reason: invalid class name */
public abstract class AnonymousClass6FZ extends HorizontalScrollView implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
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

    public AnonymousClass6FZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }
}
