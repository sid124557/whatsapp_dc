package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;

/* renamed from: X.4PP  reason: invalid class name */
public final class AnonymousClass4PP extends FrameLayout implements AnonymousClass4GJ {
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

    public AnonymousClass4PP(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        View.inflate(context, R.layout.f8nameremoved, this);
    }
}
