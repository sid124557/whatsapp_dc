package com.facebook.graphql.calls;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass6C7;
import X.AnonymousClass6L0;
import X.C126166Kz;
import X.C150727Ry;
import X.C18290x4;
import X.C18310x6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class GraphQlCallInput {
    public static final C150727Ry A02 = new C150727Ry();
    public AnonymousClass6L0 A00 = null;
    public C150727Ry A01 = A02;

    public AnonymousClass6L0 A00() {
        AnonymousClass6L0 r0 = this.A00;
        if (r0 == null) {
            C150727Ry r1 = this.A01;
            r0 = (AnonymousClass6L0) r1.A01.AwG();
            if (r0 == null) {
                r0 = new AnonymousClass6L0();
            }
            r0.A02(r1);
            this.A00 = r0;
        }
        return r0;
    }

    public final Object A01(Object obj) {
        String str;
        if (obj == null) {
            return null;
        }
        if (obj instanceof C126166Kz) {
            ArrayList arrayList = ((C126166Kz) obj).A00;
            if (arrayList.size() > 0 && (AnonymousClass0x9.A0t(arrayList) instanceof AnonymousClass6L0)) {
                ArrayList A0y = C18290x4.A0y(arrayList);
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) != null) {
                        A0y.add(A01(arrayList.get(i)));
                    }
                }
                return A0y;
            } else if (arrayList.size() <= 0 || !(AnonymousClass0x9.A0t(arrayList) instanceof C126166Kz)) {
                ArrayList A0y2 = C18290x4.A0y(arrayList);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Object obj2 = arrayList.get(i2);
                    if (obj2 == null) {
                        str = null;
                        A0y2.add(str);
                    } else if (obj2 instanceof Number) {
                        A0y2.add(obj2);
                    } else {
                        str = obj2.toString();
                        A0y2.add(str);
                    }
                }
                return A0y2;
            } else {
                ArrayList A0y3 = C18290x4.A0y(arrayList);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (arrayList.get(i3) != null) {
                        A0y3.add(A01(arrayList.get(i3)));
                    }
                }
                return A0y3;
            }
        } else if (!(obj instanceof AnonymousClass6L0)) {
            return obj;
        } else {
            TreeMap treeMap = new TreeMap();
            A04((AnonymousClass6L0) obj, treeMap);
            return treeMap;
        }
    }

    public void A02(C126166Kz r5, List list) {
        if (list != null && !list.isEmpty()) {
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof List) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            List list2 = (List) it.next();
                            C150727Ry r1 = r5.A01;
                            C126166Kz r0 = (C126166Kz) r1.A00.AwG();
                            if (r0 == null) {
                                r0 = new C126166Kz();
                            }
                            r0.A02(r1);
                            r5.A03(r0);
                            A02(r0, list2);
                        }
                        return;
                    } else if (next instanceof String) {
                        for (Object A04 : list) {
                            r5.A04(A04);
                        }
                        return;
                    } else if (next instanceof Boolean) {
                        for (Object A042 : list) {
                            r5.A04(A042);
                        }
                        return;
                    } else if (next instanceof Number) {
                        for (Object A043 : list) {
                            r5.A04(A043);
                        }
                        return;
                    } else if (next instanceof Enum) {
                        for (Object obj : list) {
                            r5.A04(obj.toString());
                        }
                        return;
                    } else if (next instanceof GraphQlCallInput) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            r5.A03(((GraphQlCallInput) it2.next()).A00());
                        }
                        return;
                    } else if (next instanceof Map) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            Map map = (Map) it3.next();
                            C150727Ry r12 = r5.A01;
                            AnonymousClass6L0 r02 = (AnonymousClass6L0) r12.A01.AwG();
                            if (r02 == null) {
                                r02 = new AnonymousClass6L0();
                            }
                            r02.A02(r12);
                            r5.A03(r02);
                            A03(r02, map);
                        }
                        return;
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        AnonymousClass6C7.A1O(A0o, "List value type is not supported: ", next);
                        throw C18310x6.A0d(A0o);
                    }
                }
            }
        }
    }

    public final void A04(AnonymousClass6L0 r5, Map map) {
        if (r5 != null) {
            int i = 0;
            while (true) {
                int i2 = r5.A00;
                if (i >= i2) {
                    return;
                }
                if (i >= 0 && i < i2) {
                    ArrayList arrayList = r5.A01;
                    Object obj = arrayList.get(i * 2);
                    if (i < r5.A00) {
                        map.put(obj, A01(arrayList.get((i * 2) + 1)));
                        i++;
                    } else {
                        throw new ArrayIndexOutOfBoundsException(i);
                    }
                }
            }
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public void A03(AnonymousClass6L0 r6, Map map) {
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            String A0q2 = C18310x6.A0q(A0w);
            String value = A0w.getValue();
            if (value != null) {
                if (value instanceof Boolean) {
                    value = AnonymousClass001.A1Z(value) ? "true" : "false";
                } else if (!(value instanceof Number) && !(value instanceof String)) {
                    if (value instanceof Enum) {
                        value = value.toString();
                    } else if (value instanceof GraphQlCallInput) {
                        r6.A03(((GraphQlCallInput) value).A00(), A0q2);
                    } else if (value instanceof List) {
                        C150727Ry r1 = r6.A01;
                        C126166Kz r0 = (C126166Kz) r1.A00.AwG();
                        if (r0 == null) {
                            r0 = new C126166Kz();
                        }
                        r0.A02(r1);
                        r6.A03(r0, A0q2);
                        A02(r0, (List) value);
                    } else if (value instanceof Map) {
                        C150727Ry r12 = r6.A01;
                        AnonymousClass6L0 r02 = (AnonymousClass6L0) r12.A01.AwG();
                        if (r02 == null) {
                            r02 = new AnonymousClass6L0();
                        }
                        r02.A02(r12);
                        r6.A03(r02, A0q2);
                        A03(r02, (Map) value);
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        AnonymousClass6C7.A1O(A0o, "Unexpected object value type ", value);
                        throw C18310x6.A0d(A0o);
                    }
                }
                r6.A05(A0q2, value);
            }
        }
    }

    public void A05(GraphQlCallInput graphQlCallInput, String str) {
        A00().A03(graphQlCallInput.A00(), str);
    }

    public void A06(String str, String str2) {
        A00().A05(str, str2);
    }

    public void A07(String str, List list) {
        AnonymousClass6L0 A002 = A00();
        C150727Ry r1 = A002.A01;
        C126166Kz r0 = (C126166Kz) r1.A00.AwG();
        if (r0 == null) {
            r0 = new C126166Kz();
        }
        r0.A02(r1);
        A002.A03(r0, str);
        A02(r0, list);
    }
}
