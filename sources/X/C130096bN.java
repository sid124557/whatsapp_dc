package X;

import com.google.firebase.iid.Registrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.6bN  reason: invalid class name and case insensitive filesystem */
public class C130096bN extends C152817aA {
    public static final C181338mb A04 = AnonymousClass8CU.A00;
    public final AnonymousClass8CS A00;
    public final Map A01 = AnonymousClass001.A0t();
    public final Map A02 = AnonymousClass001.A0t();
    public final Map A03 = AnonymousClass001.A0t();

    public C130096bN(Iterable iterable, Executor executor, C157587iY... r14) {
        AnonymousClass8CS r5 = new AnonymousClass8CS(executor);
        this.A00 = r5;
        ArrayList A0s = AnonymousClass001.A0s();
        Class<AnonymousClass8CS> cls = AnonymousClass8CS.class;
        C152547Zh r2 = new C152547Zh(cls, cls, C178968iO.class);
        r2.A02 = new AnonymousClass90Y(r5, 0);
        A0s.add(r2.A00());
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A0s.addAll(((Registrar) it.next()).getComponents());
        }
        Collections.addAll(A0s, r14);
        HashMap hashMap = new HashMap(A0s.size());
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            C157587iY r8 = (C157587iY) it2.next();
            AnonymousClass7K3 r7 = new AnonymousClass7K3(r8);
            Iterator it3 = r8.A04.iterator();
            while (true) {
                if (it3.hasNext()) {
                    Class cls2 = (Class) it3.next();
                    C151577Vi r22 = new C151577Vi(cls2, !AnonymousClass000.A1T(r8.A01));
                    if (!hashMap.containsKey(r22)) {
                        hashMap.put(r22, AnonymousClass002.A0K());
                    }
                    Set set = (Set) hashMap.get(r22);
                    if (set.isEmpty() || r22.A01) {
                        set.add(r7);
                    } else {
                        throw AnonymousClass6C7.A0W("Multiple components provide %s.", AnonymousClass6C9.A1Z(cls2, 1));
                    }
                }
            }
        }
        Iterator A10 = C18290x4.A10(hashMap);
        while (A10.hasNext()) {
            for (AnonymousClass7K3 r4 : (Set) A10.next()) {
                for (C152197Xy r0 : r4.A00.A03) {
                    Set<AnonymousClass7K3> set2 = (Set) hashMap.get(new C151577Vi(r0.A01, AnonymousClass000.A1U(r0.A00, 2)));
                    if (set2 != null) {
                        for (AnonymousClass7K3 r1 : set2) {
                            r4.A01.add(r1);
                            r1.A02.add(r4);
                        }
                    }
                }
            }
        }
        HashSet A0K = AnonymousClass002.A0K();
        Iterator A102 = C18290x4.A10(hashMap);
        while (A102.hasNext()) {
            A0K.addAll((Collection) A102.next());
        }
        HashSet A0K2 = AnonymousClass002.A0K();
        Iterator it4 = A0K.iterator();
        while (it4.hasNext()) {
            AnonymousClass7K3 r12 = (AnonymousClass7K3) it4.next();
            if (r12.A02.isEmpty()) {
                A0K2.add(r12);
            }
        }
        int i = 0;
        while (!A0K2.isEmpty()) {
            AnonymousClass7K3 r3 = (AnonymousClass7K3) A0K2.iterator().next();
            A0K2.remove(r3);
            i++;
            for (AnonymousClass7K3 r13 : r3.A01) {
                Set set3 = r13.A02;
                set3.remove(r3);
                if (set3.isEmpty()) {
                    A0K2.add(r13);
                }
            }
        }
        if (i == A0s.size()) {
            Iterator it5 = A0s.iterator();
            while (it5.hasNext()) {
                Object next = it5.next();
                this.A01.put(next, new AnonymousClass8CV(new AnonymousClass933(next, 1, this)));
            }
            Map map = this.A01;
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                C157587iY r15 = (C157587iY) A0w.getKey();
                if (r15.A01 == 0) {
                    Object value = A0w.getValue();
                    for (Object put : r15.A04) {
                        this.A02.put(put, value);
                    }
                }
            }
            Iterator A0i = C18280x3.A0i(map);
            while (A0i.hasNext()) {
                C157587iY r52 = (C157587iY) A0i.next();
                Iterator it6 = r52.A03.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        C152197Xy r16 = (C152197Xy) it6.next();
                        if (r16.A00 == 1) {
                            Map map2 = this.A02;
                            Class cls3 = r16.A01;
                            if (!map2.containsKey(cls3)) {
                                Object[] A1a = C18310x6.A1a(r52);
                                A1a[1] = cls3;
                                throw new C130106bO(String.format("Unsatisfied dependency for component %s: %s", A1a));
                            }
                        }
                    }
                }
            }
            HashMap A0t = AnonymousClass001.A0t();
            Iterator A0q2 = AnonymousClass000.A0q(this.A01);
            while (A0q2.hasNext()) {
                Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
                C157587iY r17 = (C157587iY) A0w2.getKey();
                if (r17.A01 != 0) {
                    Object value2 = A0w2.getValue();
                    for (Object next2 : r17.A04) {
                        if (!A0t.containsKey(next2)) {
                            A0t.put(next2, AnonymousClass002.A0K());
                        }
                        ((Set) A0t.get(next2)).add(value2);
                    }
                }
            }
            Iterator A0u = AnonymousClass001.A0u(A0t);
            while (A0u.hasNext()) {
                Map.Entry A0w3 = AnonymousClass001.A0w(A0u);
                this.A03.put(A0w3.getKey(), new AnonymousClass8CV(new AnonymousClass8CT((Set) A0w3.getValue())));
            }
            return;
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it7 = A0K.iterator();
        while (it7.hasNext()) {
            AnonymousClass7K3 r18 = (AnonymousClass7K3) it7.next();
            if (!r18.A02.isEmpty() && !r18.A01.isEmpty()) {
                A0s2.add(r18.A00);
            }
        }
        throw new C130116bP(A0s2);
    }
}
