package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: X.6G2  reason: invalid class name */
public abstract class AnonymousClass6G2 extends AppCompatImageView implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public AnonymousClass6G2(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }

    public void A00() {
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
}
