package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: X.4Uf  reason: invalid class name and case insensitive filesystem */
public final class C87664Uf extends C05550Ty {
    public int A00 = -1;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass107 A02 = AnonymousClass4L0.A0O(C72023d3.A00);
    public final AnonymousClass4UC A03 = AnonymousClass0x9.A0b();

    public final void A0D(AnonymousClass5RO r10, C104555Rk r11, Collection collection) {
        int i;
        C162457s7.A0J(r10, 1);
        Set keySet = ((Map) r11.A00.getValue()).keySet();
        C162457s7.A0J(keySet, 0);
        List A002 = AnonymousClass6A5.A00(keySet, new C1222163n(r10), 3);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            C1229266j A003 = r11.A00(C18280x3.A05(it));
            if (A003 != null) {
                A0s.add(A003);
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((C1229266j) next).BoM(collection)) {
                A0s2.add(next);
            }
        }
        AnonymousClass107 r6 = this.A02;
        ArrayList A0s3 = AnonymousClass001.A0s();
        C103965Pc r7 = null;
        for (C1229266j r4 : AnonymousClass6A5.A00(A0s2, r10, 4)) {
            boolean z = false;
            if (r7 != null) {
                i = r7.A00.size();
            } else {
                i = 0;
            }
            if (A0s3.size() == 1 && i > 0 && r10.A01(r4.getId()) == C997257y.OVERFLOW) {
                z = true;
            }
            if (r7 == null || i == 5 || z) {
                r7 = new C103965Pc(this);
                A0s3.add(r7);
            }
            C162457s7.A0J(r4, 0);
            boolean A004 = r7.A00();
            LinkedList linkedList = r7.A00;
            int A0M = C86664Kz.A0M(linkedList);
            if (A004) {
                A0M = Math.max(0, A0M - 1);
            }
            linkedList.add(A0M, r4);
        }
        if (!A0s3.isEmpty() && A0s3.size() <= 2) {
            C103965Pc r72 = (C103965Pc) C73723fy.A03(A0s3);
            if (A0s3.size() == 1) {
                if (r72.A00() && r72.A00()) {
                    r72.A00.removeLast();
                }
            } else if (A0s3.size() == 2) {
                C103965Pc r1 = (C103965Pc) A0s3.get(1);
                if (r1.A00()) {
                    LinkedList linkedList2 = r1.A00;
                    if (linkedList2.size() <= 2 && !(C73723fy.A03(linkedList2) instanceof C113185l1)) {
                        if (r72.A00()) {
                            r72.A00.removeLast();
                        }
                        Object A032 = C73723fy.A03(linkedList2);
                        C162457s7.A0J(A032, 0);
                        boolean A005 = r72.A00();
                        LinkedList linkedList3 = r72.A00;
                        int A0M2 = C86664Kz.A0M(linkedList3);
                        if (A005) {
                            A0M2 = Math.max(0, A0M2 - 1);
                        }
                        linkedList3.add(A0M2, A032);
                        if (!A0s3.isEmpty()) {
                            A0s3.remove(C86664Kz.A0M(A0s3));
                        } else {
                            throw new NoSuchElementException("List is empty.");
                        }
                    }
                }
            }
        }
        r6.A0H(A0s3);
        this.A00 = 0;
        this.A01.A0H(C86634Kw.A0w(r6, 0));
    }
}
