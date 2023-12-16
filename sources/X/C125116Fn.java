package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: X.6Fn  reason: invalid class name and case insensitive filesystem */
public abstract class C125116Fn extends LinearLayout implements AnonymousClass4GJ {
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

    public C125116Fn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public C125116Fn(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
    }

    public C125116Fn(Context context) {
        super(context);
        A01();
    }

    public C125116Fn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
