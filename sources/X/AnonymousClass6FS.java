package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: X.6FS  reason: invalid class name */
public abstract class AnonymousClass6FS extends FrameLayout implements AnonymousClass4GJ {
    public C116855qy A00;

    public abstract void A02();

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass6FS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
    }
}
