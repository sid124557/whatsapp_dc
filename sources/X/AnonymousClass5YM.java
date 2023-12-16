package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5YM  reason: invalid class name */
public class AnonymousClass5YM implements C183248pj {
    public Object A00;
    public final int A01;

    public AnonymousClass5YM(C115905pQ r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final Object Ax9(Object obj, Object obj2, Object obj3) {
        Object valueOf;
        if (this.A01 != 0) {
            List list = (List) obj;
            int A0K = AnonymousClass001.A0K(obj2);
            int A0K2 = AnonymousClass001.A0K(obj3);
            List list2 = ((C115905pQ) this.A00).A09;
            list2.clear();
            int A07 = AnonymousClass001.A07((float) A0K, ((float) A0K2) / 4.0f);
            for (int i = A07; i < A07 + A0K2; i++) {
                if (i < 0 || i >= list.size()) {
                    valueOf = Float.valueOf(0.0f);
                } else {
                    valueOf = list.get(i);
                }
                list2.add(valueOf);
            }
            return list2;
        }
        int A0K3 = AnonymousClass001.A0K(obj2);
        int A072 = A0K3 + AnonymousClass001.A07(((float) A0K3) / 4.0f, ((float) AnonymousClass001.A0K(obj3)) / 150.0f);
        ArrayList A0I = AnonymousClass002.A0I(A072);
        C380325f.A00((List) obj, A0I, A072);
        return A0I;
    }
}
