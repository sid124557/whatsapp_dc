package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.8Ar  reason: invalid class name and case insensitive filesystem */
public abstract class C169798Ar implements C187848xu {
    public int zza = 0;

    public static void A09(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof C188198yV) {
            List Btv = ((C188198yV) iterable).Btv();
            C188198yV r6 = (C188198yV) list;
            int size = list.size();
            for (Object next : Btv) {
                if (next == null) {
                    int A04 = AnonymousClass002.A04(r6, size);
                    StringBuilder A0Y = AnonymousClass6CA.A0Y(37);
                    C18270x1.A19("Element at index ", " is null.", A0Y, A04);
                    String obj = A0Y.toString();
                    int size2 = r6.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            r6.remove(size2);
                        } else {
                            throw AnonymousClass001.A0g(obj);
                        }
                    }
                } else if (next instanceof C172538Lp) {
                    r6.BtL((C172538Lp) next);
                } else {
                    r6.add(next);
                }
            }
        } else if (iterable instanceof C178638hr) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int A042 = AnonymousClass002.A04(list, size3);
                    StringBuilder A0Y2 = AnonymousClass6CA.A0Y(37);
                    C18270x1.A19("Element at index ", " is null.", A0Y2, A042);
                    String obj2 = A0Y2.toString();
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            list.remove(size4);
                        } else {
                            throw AnonymousClass001.A0g(obj2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        }
    }
}
