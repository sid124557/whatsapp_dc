package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.93J  reason: invalid class name */
public class AnonymousClass93J implements C183118pW {
    public Object A00;
    public final int A01;

    public AnonymousClass93J(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bcb(List list) {
        List list2;
        List list3;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            C137896pR r3 = (C137896pR) obj;
            if (r3.A08 && (list3 = r3.A03) != null && !list3.isEmpty()) {
                Iterator it = r3.A03.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if ("loading-hash".equals(AnonymousClass0x7.A0b(it).A0D)) {
                        List list4 = r3.A03;
                        if (list4 != null) {
                            r3.A06(list4);
                            return;
                        }
                    }
                }
            }
            r3.A06(list);
            return;
        }
        C137916pT r32 = (C137916pT) obj;
        if (r32.A0E && (list2 = r32.A06) != null && !list2.isEmpty()) {
            Iterator it2 = r32.A06.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if ("loading-hash".equals(AnonymousClass0x7.A0b(it2).A0D)) {
                    List list5 = r32.A06;
                    if (list5 != null) {
                        r32.A06(list5);
                        return;
                    }
                }
            }
        }
        r32.A06(list);
    }
}
