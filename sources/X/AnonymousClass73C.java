package X;

import android.util.SparseArray;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.73C  reason: invalid class name */
public class AnonymousClass73C {
    public static AnonymousClass84O A00(C151267Ub r10, AnonymousClass84O r11, AnonymousClass84O r12, Object obj, List list, Map map) {
        AnonymousClass7Z8 r13;
        AnonymousClass84O r2;
        SparseArray sparseArray;
        AnonymousClass84O r1;
        if (obj != null) {
            if (obj instanceof List) {
                List list2 = (List) obj;
                r13 = new AnonymousClass7Z8(C18290x4.A0k(list2), AnonymousClass001.A0n(list2, 2), list, AnonymousClass6C9.A0k(list2, 1));
            } else if (obj instanceof AnonymousClass7Z8) {
                r13 = (AnonymousClass7Z8) obj;
            }
            Object obj2 = r13.A00;
            if (obj2 instanceof Number) {
                int A0K = AnonymousClass001.A0K(obj2);
                List<AnonymousClass84O> A0R = r11.A0R(143);
                if (A0K < 0 || A0K >= A0R.size()) {
                    String str = r13.A01;
                    StringBuilder A0A = C18330xA.A0A("[");
                    for (AnonymousClass84O r0 : A0R) {
                        A0A.append(r0.A03);
                        AnonymousClass001.A1M(A0A);
                    }
                    StringBuilder A0w = C18290x4.A0w("]", A0A);
                    A0w.append("BloksCrash: children-binding index ");
                    A0w.append(A0K);
                    A0w.append(" scopeKey: ");
                    A0w.append(str);
                    AnonymousClass000.A1H(" out of bounds for array of size ", A0w, A0R);
                    C18270x1.A1H(A0w, " ", A0A);
                    throw new IndexOutOfBoundsException(A0w.toString());
                }
                r2 = AnonymousClass6C9.A0V(A0R, A0K);
            } else if (obj2 instanceof String) {
                r2 = (AnonymousClass84O) r10.A02.A04.get(obj2);
                if (r2 == null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Unable to find template ID ");
                    A0o.append((String) obj2);
                    throw AnonymousClass0x2.A0V(" in tree resources.", A0o);
                }
            }
            int A00 = r10.A03.A00(r11, r2, r13.A01);
            LinkedList linkedList = new LinkedList(r13.A02);
            C18270x1.A1K(linkedList, A00);
            String A002 = C154087ca.A00(C141306vM.EXPANDED_VARIABLE, linkedList);
            Iterator A0q = AnonymousClass000.A0q(r13.A03);
            while (A0q.hasNext()) {
                Map.Entry A0w2 = AnonymousClass001.A0w(A0q);
                String A0q2 = C18310x6.A0q(A0w2);
                if (A002 != null && !A002.equals("")) {
                    A0q2 = AnonymousClass000.A0V("#", A002, AnonymousClass000.A0l(A0q2));
                }
                Object value = A0w2.getValue();
                r10.A0B.put(A0q2, value);
                Set set = r10.A0D;
                if (set != null && !AnonymousClass736.A00(r10.A0C.get(A0q2), value)) {
                    set.add(A0q2);
                }
                map.put(A0q2, A0w2.getValue());
            }
            AnonymousClass7K6 r02 = r10.A05;
            if (r12 == null || (sparseArray = (SparseArray) r02.A01.get(r12.A02)) == null || (r1 = (AnonymousClass84O) sparseArray.get(A00)) == null || r1.A05 != r2) {
                return AnonymousClass73D.A00(new AnonymousClass8D0(r10, r13, r11, linkedList), r2);
            }
            return r1;
        }
        return null;
    }
}
