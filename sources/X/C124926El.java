package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.6El  reason: invalid class name and case insensitive filesystem */
public abstract class C124926El extends View implements AnonymousClass4GJ {
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

    public C124926El(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
