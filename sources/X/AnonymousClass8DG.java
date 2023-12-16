package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.8DG  reason: invalid class name */
public class AnonymousClass8DG implements C835348u {
    public final C835348u A00;

    public Object B2m(C157967jD r10, C146787Bp r11, C151147Tp r12) {
        String str = r11.A00;
        int i = 0;
        switch (str.hashCode()) {
            case -1882328740:
                if (str.equals("bk.action.f32.Sqrt")) {
                    return C159427lo.A00(Math.sqrt(AnonymousClass6C9.A02(r10.A04(0))));
                }
                break;
            case -1666855539:
                if (str.equals("bk.action.string.ToUpperCase")) {
                    return C157967jD.A01(r10, 0).toUpperCase(Locale.ROOT);
                }
                break;
            case -1606945202:
                if (str.equals("bk.action.array.Reduce")) {
                    List list = r10.A00;
                    List list2 = (List) list.get(0);
                    C155787fV r4 = (C155787fV) r10.A04(1);
                    Object obj = list.get(2);
                    if (list2 != null) {
                        int i2 = 0;
                        while (i2 < list2.size()) {
                            C152057Xj r1 = new C152057Xj();
                            r1.A04(obj, 0);
                            r1.A04(list2.get(i2), 1);
                            try {
                                obj = C154167ci.A00(C152057Xj.A01(r1, Integer.valueOf(i2), 2), r4.A00, r12);
                                i2++;
                            } catch (C143296ye e) {
                                throw C18330xA.A09(e);
                            }
                        }
                    }
                    return obj;
                }
                break;
            case -1225336055:
                if (str.equals("bk.action.string.Contains")) {
                    return Boolean.valueOf(((String) r10.A04(0)).contains((String) r10.A04(1)));
                }
                break;
            case -965327084:
                if (str.equals("bk.action.string.Join")) {
                    List list3 = r10.A00;
                    String A0n = AnonymousClass001.A0n(list3, 0);
                    r10.A03(1);
                    List list4 = (List) list3.get(1);
                    if (A0n != null) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        while (i < list4.size()) {
                            String A0n2 = AnonymousClass001.A0n(list4, i);
                            if (A0n2 != null) {
                                A0o.append(A0n2);
                                if (i < AnonymousClass002.A04(list4, 1)) {
                                    A0o.append(A0n);
                                }
                                i++;
                            } else {
                                throw AnonymousClass001.A0c("element must not be null");
                            }
                        }
                        return A0o.toString();
                    }
                    throw AnonymousClass001.A0c("delimeter must not be null");
                }
                break;
            case -240276909:
                if (str.equals("bk.action.map.Merge")) {
                    HashMap A0t = AnonymousClass001.A0t();
                    while (true) {
                        List list5 = r10.A00;
                        if (i >= list5.size()) {
                            return A0t;
                        }
                        Map A0k = AnonymousClass6C9.A0k(list5, i);
                        if (A0k != null) {
                            A0t.putAll(A0k);
                        }
                        i++;
                    }
                }
                break;
            case 944474301:
                if (str.equals("bk.action.map.Filter")) {
                    C155787fV r7 = (C155787fV) r10.A04(1);
                    HashMap A0t2 = AnonymousClass001.A0t();
                    Iterator A0q = AnonymousClass000.A0q((Map) r10.A04(0));
                    while (A0q.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0q);
                        C152057Xj r13 = new C152057Xj();
                        r13.A05(A0w.getKey(), 0);
                        try {
                            if (C159427lo.A02(C154167ci.A00(C152057Xj.A00(r13, A0w.getValue(), 1), r7.A00, r12))) {
                                C18270x1.A1N(A0t2, A0w);
                            }
                        } catch (C143296ye e2) {
                            throw C18330xA.A09(e2);
                        }
                    }
                    return A0t2;
                }
                break;
            case 975567453:
                if (str.equals("bk.action.string.ValueOfNumberInBase")) {
                    long A0B = C18310x6.A0B(r10.A04(0));
                    long A0K = (long) AnonymousClass001.A0K(r10.A04(1));
                    if (A0K >= 2 && A0K <= 36) {
                        return Long.toString(A0B, (int) A0K);
                    }
                    throw AnonymousClass001.A0c("radix parameter of string.ValueOfNumberInBase must be between 2 and 36");
                }
                break;
            case 1377663097:
                if (str.equals("bk.action.map.Keys")) {
                    return AnonymousClass002.A0J(((Map) r10.A04(0)).keySet());
                }
                break;
            case 1395153511:
                if (str.equals("bk.action.map.Values")) {
                    return C18300x5.A0v((Map) r10.A04(0));
                }
                break;
            case 1740388232:
                if (str.equals("bk.action.f32.Log")) {
                    return C159427lo.A00(Math.log(AnonymousClass6C9.A02(r10.A04(0))));
                }
                break;
            case 1740392092:
                if (str.equals("bk.action.f32.Pow")) {
                    return C159427lo.A00(Math.pow(AnonymousClass6C9.A02(r10.A04(0)), AnonymousClass6C9.A02(r10.A04(1))));
                }
                break;
            case 1867263777:
                if (str.equals("bk.action.string.StartsWith")) {
                    List list6 = r10.A00;
                    return Boolean.valueOf(AnonymousClass001.A0n(list6, 0).startsWith(AnonymousClass001.A0n(list6, 1)));
                }
                break;
            case 1890080876:
                if (str.equals("bk.action.string.ToLowerCase")) {
                    return C157967jD.A01(r10, 0).toLowerCase(Locale.ROOT);
                }
                break;
        }
        C835348u r0 = this.A00;
        if (r0 != null) {
            return r0.B2m(r10, r11, r12);
        }
        throw new C173658Rb(AnonymousClass000.A0V("unknown function ", str, AnonymousClass001.A0o()));
    }

    public AnonymousClass8DG(C835348u r1) {
        this.A00 = r1;
    }
}
