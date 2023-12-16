package X;

import java.util.Set;

/* renamed from: X.90S  reason: invalid class name */
public class AnonymousClass90S implements C181758nH {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass90S(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BMg(AnonymousClass8EI r3) {
        C181758nH r1;
        Set set;
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            r1 = (C181758nH) this.A01;
            set = ((C153127ai) obj).A0B;
        } else {
            r1 = (C181758nH) this.A01;
            set = ((C152967aS) obj).A03;
        }
        set.add(r3);
        if (r1 != null) {
            r1.BMg(r3);
        }
    }
}
