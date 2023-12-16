package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.8Ch  reason: invalid class name and case insensitive filesystem */
public abstract class C170208Ch implements C181378mf, Cloneable {
    public /* bridge */ /* synthetic */ Object clone() {
        throw null;
    }

    public static void A05(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof C188208yW) {
            List BE2 = ((C188208yW) iterable).BE2();
            C188208yW r4 = (C188208yW) list;
            int size = list.size();
            for (Object next : BE2) {
                if (next == null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Element at index ");
                    A0o.append(AnonymousClass002.A04(r4, size));
                    String A0X = AnonymousClass000.A0X(" is null.", A0o);
                    int size2 = r4.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            r4.remove(size2);
                        } else {
                            throw AnonymousClass001.A0g(A0X);
                        }
                    }
                } else if (next instanceof C172548Lq) {
                    r4.AwJ((C172548Lq) next);
                } else {
                    r4.add(next);
                }
            }
        } else if (iterable instanceof C178988iQ) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("Element at index ");
                    A0o2.append(AnonymousClass002.A04(list, size3));
                    String A0X2 = AnonymousClass000.A0X(" is null.", A0o2);
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            list.remove(size4);
                        } else {
                            throw AnonymousClass001.A0g(A0X2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        }
    }
}
