package X;

import com.whatsapp.R;
import com.whatsapp.instrumentation.ui.InstrumentationAuthActivity;

/* renamed from: X.4HZ  reason: invalid class name */
public class AnonymousClass4HZ implements AnonymousClass65C {
    public Object A00;
    public final int A01;

    public AnonymousClass4HZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BMz(int i) {
        if (this.A01 != 0) {
            InstrumentationAuthActivity instrumentationAuthActivity = (InstrumentationAuthActivity) this.A00;
            if (i == -1 || i == 4) {
                C08240dc A0J = AnonymousClass0x2.A0J(instrumentationAuthActivity);
                A0J.A0A(instrumentationAuthActivity.A05, R.id.fragment_container);
                A0J.A0I((String) null);
                A0J.A01();
                return;
            }
            return;
        }
        ((C50492iG) this.A00).A01(i);
    }
}
