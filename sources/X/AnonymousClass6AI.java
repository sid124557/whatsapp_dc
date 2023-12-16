package X;

import java.util.List;

/* renamed from: X.6AI  reason: invalid class name */
public class AnonymousClass6AI implements AnonymousClass8s5 {
    public Object A00;
    public final int A01;

    public AnonymousClass6AI(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean BMG() {
        if (this.A01 != 0) {
            AnonymousClass5JR r1 = (AnonymousClass5JR) this.A00;
            C626936e.A01();
            if (r1.A01) {
                return true;
            }
            r1.A01 = true;
            List<C44952Yc> list = r1.A03;
            for (C44952Yc A002 : list) {
                A002.A00();
            }
            list.clear();
            return true;
        }
        ((C89684ei) this.A00).A5w();
        return true;
    }

    public /* synthetic */ void BNZ() {
    }
}
