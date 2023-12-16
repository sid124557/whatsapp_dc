package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.4So  reason: invalid class name */
public abstract class AnonymousClass4So extends Toolbar implements AnonymousClass4GJ {
    public C116855qy A00;

    public void A0K() {
        if (this instanceof C88884ax) {
            C88884ax r1 = (C88884ax) this;
            if (!r1.A00) {
                r1.A00 = true;
                r1.A00 = (AnonymousClass5GB) C88864av.A00(r1.generatedComponent()).A00.A0t.get();
                return;
            }
            return;
        }
        C88894ay r12 = (C88894ay) this;
        if (!r12.A00) {
            r12.A00 = true;
            r12.A00 = (AnonymousClass5GB) C88864av.A00(r12.generatedComponent()).A00.A0t.get();
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

    public AnonymousClass4So(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0K();
    }

    public AnonymousClass4So(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0K();
    }

    public AnonymousClass4So(Context context) {
        super(context, (AttributeSet) null);
        A0K();
    }
}
