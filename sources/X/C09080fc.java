package X;

import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.0fc  reason: invalid class name and case insensitive filesystem */
public final class C09080fc implements C16750tu, C15370rE {
    public final C16740tt A00;
    public final Object A01 = AnonymousClass002.A0D();
    public final C09060fa[] A02;

    public C09080fc(C16740tt r5, AnonymousClass0TH r6) {
        AnonymousClass0UM r2 = r6.A02;
        C09060fa[] r3 = {new AnonymousClass0BA(r6.A01), new AnonymousClass0BB(r6.A00), new AnonymousClass0BC(r6.A03), new AnonymousClass0BD(r2), new AnonymousClass0BE(r2), new AnonymousClass0BG(r2), new AnonymousClass0BF(r2)};
        this.A00 = r5;
        this.A02 = r3;
    }

    public void BjY(Iterable iterable) {
        C162457s7.A0J(iterable, 0);
        synchronized (this.A01) {
            C09060fa[] r6 = this.A02;
            for (C09060fa r2 : r6) {
                if (r2.A00 != null) {
                    r2.A00 = null;
                    r2.A04.isEmpty();
                }
            }
            for (C09060fa r8 : r6) {
                List<C06250Wv> list = r8.A04;
                list.clear();
                List list2 = r8.A03;
                list2.clear();
                for (Object next : iterable) {
                    if (r8.A02((C06250Wv) next)) {
                        list.add(next);
                    }
                }
                for (C06250Wv r0 : list) {
                    list2.add(r0.A0J);
                }
                boolean isEmpty = list.isEmpty();
                AnonymousClass0UM r11 = r8.A02;
                if (isEmpty) {
                    r11.A01(r8);
                } else {
                    synchronized (r11.A03) {
                        LinkedHashSet linkedHashSet = r11.A04;
                        if (linkedHashSet.add(r8)) {
                            if (linkedHashSet.size() == 1) {
                                r11.A00 = r11.A03();
                                C06240Wu A002 = C06240Wu.A00();
                                String str = C03230Ji.A00;
                                StringBuilder A0o = AnonymousClass001.A0o();
                                AnonymousClass000.A1A(r11, A0o);
                                A0o.append(": initial state = ");
                                A002.A04(str, AnonymousClass000.A0R(r11.A00, A0o));
                                r11.A04();
                            }
                            Object obj = r11.A00;
                            r8.A01 = obj;
                            r8.A01(r8.A00, obj);
                        }
                    }
                }
                r8.A01(r8.A00, r8.A01);
            }
            for (C09060fa r1 : r6) {
                if (r1.A00 != this) {
                    r1.A00 = this;
                    r1.A01(this, r1.A01);
                }
            }
        }
    }

    public final boolean A00(String str) {
        boolean z;
        synchronized (this.A01) {
            C09060fa[] r3 = this.A02;
            int length = r3.length;
            z = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    C09060fa r4 = r3[i];
                    Object obj = r4.A01;
                    if (obj != null && r4.A03(obj) && r4.A03.contains(str)) {
                        C06240Wu A002 = C06240Wu.A00();
                        String str2 = C03190Je.A00;
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Work ");
                        A0o.append(str);
                        A0o.append(" constrained by ");
                        C06240Wu.A03(A002, r4.getClass().getSimpleName(), str2, A0o);
                        break;
                    }
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public void reset() {
        synchronized (this.A01) {
            for (C09060fa r2 : this.A02) {
                List list = r2.A04;
                if (!list.isEmpty()) {
                    list.clear();
                    r2.A02.A01(r2);
                }
            }
        }
    }
}
