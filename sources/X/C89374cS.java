package X;

import android.content.Context;
import com.whatsapp.RollingCounterView;

/* renamed from: X.4cS  reason: invalid class name and case insensitive filesystem */
public class C89374cS extends RollingCounterView implements AnonymousClass4GJ {
    public C620733j A00;
    public C116855qy A01;
    public boolean A02;

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public C89374cS(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C88864av.A02((C111685iW) generatedComponent());
        }
    }
}
