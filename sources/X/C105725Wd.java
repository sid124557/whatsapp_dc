package X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: X.5Wd  reason: invalid class name and case insensitive filesystem */
public final class C105725Wd {
    public final C620733j A00;
    public final LinkedList A01 = AnonymousClass0x9.A18();
    public final LinkedList A02 = AnonymousClass0x9.A18();
    public final LinkedList A03 = AnonymousClass0x9.A18();

    public C105725Wd(C620733j r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final void A01(AnonymousClass7QA r6) {
        List list = r6.A09;
        C162457s7.A0C(list);
        A00(this.A01, list);
        List list2 = r6.A0C;
        C162457s7.A0C(list2);
        A00(this.A03, list2);
        List list3 = r6.A0A;
        C162457s7.A0C(list3);
        for (Object next : list3) {
            LinkedList linkedList = this.A02;
            if (!linkedList.contains(next)) {
                if (linkedList.size() >= 100) {
                    linkedList.removeLast();
                }
                linkedList.addFirst(next);
            }
        }
    }

    public static final void A00(LinkedList linkedList, List list) {
        for (Object next : list) {
            if (linkedList.contains(next)) {
                linkedList.remove(next);
            }
            if (linkedList.size() >= 100) {
                linkedList.removeLast();
            }
            linkedList.addFirst(next);
        }
    }
}
