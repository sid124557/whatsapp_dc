package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5U4  reason: invalid class name */
public final class AnonymousClass5U4 {
    public List A00;
    public Map A01;
    public Map A02;
    public final C54292oU A03;
    public final Set A04;

    public final void A01() {
        Set set = this.A04;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : set) {
            if (((C1230366u) next).BJM()) {
                A0s.add(next);
            }
        }
        this.A00 = A0s;
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            ((List) C18310x6.A0h(((C1230366u) next2).BAV(), A0r)).add(next2);
        }
        this.A02 = A0r;
        List list = this.A00;
        if (list == null) {
            throw C18270x1.A0S("filteredSettings");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C57692u3.A01(list));
        for (Object next3 : list) {
            linkedHashMap.put(((C1230366u) next3).B8w(), next3);
        }
        this.A01 = linkedHashMap;
    }

    public final void A02(C1230366u r4) {
        String BAX;
        Map map = this.A01;
        if (map == null) {
            throw C18270x1.A0S("allSettingsMap");
        }
        C1230366u r0 = (C1230366u) map.get(r4.B8w());
        if (r0 != null && (BAX = r0.BAX()) != null && BAX.length() == 0) {
            Map map2 = this.A01;
            if (map2 == null) {
                throw C18270x1.A0S("allSettingsMap");
            }
            C1230366u r2 = (C1230366u) map2.get(r4.BAV());
            if (r2 != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(r4.BAX());
                r4.Bmq(AnonymousClass000.A0X(r2.BAX(), A0o));
                String BAX2 = r4.BAX();
                if (BAX2.length() > 0) {
                    r4.Bmq(AnonymousClass000.A0X(" > ", AnonymousClass000.A0l(BAX2)));
                }
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append(r4.BAX());
                r4.Bmq(AnonymousClass000.A0X(r2.BBg(), A0o2));
            }
        }
    }

    public final void A03(String str, String str2, List list) {
        Map map = this.A02;
        if (map == null) {
            throw C18270x1.A0S("groupedSettings");
        }
        List<C1230366u> list2 = (List) map.get(str2);
        if (list2 != null) {
            for (C1230366u r3 : list2) {
                A02(r3);
                if (!C175728Zm.A0S(r3.BBg(), str, true)) {
                    List B4E = r3.B4E();
                    if (!(B4E instanceof Collection) || !B4E.isEmpty()) {
                        Iterator it = B4E.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (C175728Zm.A0S(AnonymousClass001.A0m(it), str, true)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    A03(str, r3.B8w(), list);
                } else {
                    list.add(r3);
                    A04(r3.B8w(), list);
                }
            }
        }
    }

    public final void A04(String str, List list) {
        Map map = this.A02;
        if (map == null) {
            throw C18270x1.A0S("groupedSettings");
        }
        List<C1230366u> list2 = (List) map.get(str);
        if (list2 != null) {
            for (C1230366u r0 : list2) {
                A02(r0);
                list.add(r0);
                A04(r0.B8w(), list);
            }
        }
    }

    public AnonymousClass5U4(C54292oU r1, Set set) {
        C18260x0.A0Q(set, r1);
        this.A04 = set;
        this.A03 = r1;
    }

    public final C1230366u A00(C1230366u r3) {
        while (!C162457s7.A0P(r3.BAV(), "")) {
            Map map = this.A01;
            if (map != null) {
                C1230366u r0 = (C1230366u) map.get(r3.BAV());
                if (r0 == null) {
                    break;
                }
                r3 = r0;
            } else {
                throw C18270x1.A0S("allSettingsMap");
            }
        }
        return r3;
    }
}
