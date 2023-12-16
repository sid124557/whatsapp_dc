package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2id  reason: invalid class name and case insensitive filesystem */
public abstract class C50702id {
    public abstract AnonymousClass4DR A00();

    public abstract Object A01(C58672vd r1, Object obj, Map map);

    public final Map A02(C58672vd r13, AnonymousClass4DR r14, Object obj, Map map) {
        C58672vd[] r5;
        C58672vd r0;
        C58672vd r02;
        LinkedHashMap A0r = C18320x8.A0r();
        if (!(r13 == null || (r5 = r13.A02) == null)) {
            for (C58672vd r9 : r5) {
                Enum[] enumArr = (Enum[]) r14.B3E().getEnumConstants();
                if (enumArr != null) {
                    int length = enumArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Enum enumR = enumArr[i];
                        String B7a = ((AnonymousClass4B4) enumR).B7a();
                        String str = r9.A00;
                        if (!C162457s7.A0P(B7a, str)) {
                            i++;
                        } else if (enumR != null) {
                            Map map2 = map;
                            Object Bk2 = r14.Bk2(enumR, obj, map2);
                            if (Bk2 instanceof List) {
                                Bk2 = ((Collection) Bk2).toArray(new Object[0]);
                            }
                            if (Bk2 instanceof Object[]) {
                                ArrayList A0s = AnonymousClass001.A0s();
                                for (Object obj2 : (Object[]) Bk2) {
                                    C162457s7.A0J(str, 0);
                                    Map map3 = r13.A01;
                                    if (map3 != null) {
                                        r02 = (C58672vd) map3.get(str);
                                    } else {
                                        r02 = null;
                                    }
                                    A0s.add(A01(r02, obj2, map2));
                                }
                                A0r.put(str, A0s);
                            } else {
                                C162457s7.A0J(str, 0);
                                Map map4 = r13.A01;
                                if (map4 != null) {
                                    r0 = (C58672vd) map4.get(str);
                                } else {
                                    r0 = null;
                                }
                                A0r.put(str, A01(r0, Bk2, map2));
                            }
                        }
                    }
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Field not supported: ");
                String str2 = r9.A00;
                C18260x0.A1K(A0o, str2);
                A0r.put(str2, (Object) null);
            }
        }
        return A0r;
    }
}
