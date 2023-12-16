package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.4JK  reason: invalid class name */
public class AnonymousClass4JK implements C83874Ad {
    public Object A00;
    public final int A01;

    public AnonymousClass4JK(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BkK(Jid jid, int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            C33611tP r0 = (C33611tP) obj;
            r0.A02 = (C27991fJ) jid;
            r0.A01 = i;
            return;
        }
        ((C33561tK) obj).A01 = (C27991fJ) jid;
    }
}
