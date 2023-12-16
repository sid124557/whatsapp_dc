package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: X.3fy  reason: invalid class name and case insensitive filesystem */
public final class C73723fy extends C73733fz {
    public static final Object A00(Iterable iterable) {
        C162457s7.A0J(iterable, 0);
        if (iterable instanceof List) {
            return A03((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object A01(Iterable iterable) {
        C162457s7.A0J(iterable, 0);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(0);
            }
        } else {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                return it.next();
            }
        }
        return null;
    }

    public static final Object A02(Iterable iterable) {
        Object next;
        C162457s7.A0J(iterable, 0);
        if (iterable instanceof List) {
            return A05((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final Object A03(List list) {
        C162457s7.A0J(list, 0);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object A04(List list) {
        C162457s7.A0J(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object A05(List list) {
        C162457s7.A0J(list, 0);
        if (!list.isEmpty()) {
            return C18300x5.A0c(list);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object A06(List list, int i) {
        C162457s7.A0J(list, 0);
        if (i < 0 || i > AnonymousClass002.A03(list)) {
            return null;
        }
        return list.get(i);
    }

    public static final String A07(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Iterable iterable, AnonymousClass4GQ r6, int i) {
        C162457s7.A0J(iterable, 0);
        C18260x0.A0V(charSequence, charSequence2, charSequence3);
        StringBuilder A0g = C18280x3.A0g(charSequence4, 5);
        A0S(A0g, charSequence, charSequence2, charSequence3, charSequence4, iterable, r6, i);
        return C18290x4.A0o(A0g);
    }

    public static /* synthetic */ String A08(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Iterable iterable, int i) {
        CharSequence charSequence4 = charSequence2;
        CharSequence charSequence5 = charSequence;
        String str = null;
        if ((i & 1) != 0) {
            charSequence5 = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i & 2) != 0) {
            charSequence4 = charSequence6;
        }
        if ((i & 4) == 0) {
            charSequence6 = charSequence3;
        }
        int i2 = 0;
        if ((i & 8) != 0) {
            i2 = -1;
        }
        if ((i & 16) != 0) {
            str = "...";
        }
        return A07(charSequence5, charSequence4, charSequence6, str, iterable, (AnonymousClass4GQ) null, i2);
    }

    public static String A09(CharSequence charSequence, Iterable iterable) {
        return A07(charSequence, "", "", "...", iterable, (AnonymousClass4GQ) null, -1);
    }

    public static final List A0D(Iterable iterable) {
        C162457s7.A0J(iterable, 0);
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return A0F(iterable);
        }
        List A0G = A0G(iterable);
        C162457s7.A0J(A0G, 0);
        Collections.reverse(A0G);
        return A0G;
    }

    public static final List A0E(Iterable iterable) {
        C162457s7.A0J(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return A0F(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C162457s7.A0J(array, 0);
            if (array.length > 1) {
                Arrays.sort(array);
            }
            List asList = Arrays.asList(array);
            C162457s7.A0D(asList);
            return asList;
        }
        List A0G = A0G(iterable);
        C162457s7.A0J(A0G, 0);
        if (A0G.size() <= 1) {
            return A0G;
        }
        Collections.sort(A0G);
        return A0G;
    }

    public static final List A0F(Iterable iterable) {
        Object obj;
        C162457s7.A0J(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return AnonymousClass002.A0J(collection);
                }
                if (iterable instanceof List) {
                    obj = ((List) iterable).get(0);
                } else {
                    obj = iterable.iterator().next();
                }
            }
            return C72023d3.A00;
        }
        List A0G = A0G(iterable);
        C162457s7.A0J(A0G, 0);
        int size2 = A0G.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return A0G;
            }
            obj = A0G.get(0);
        }
        return C72023d3.A00;
        return C18290x4.A12(obj);
    }

    public static final List A0J(Iterable iterable, int i) {
        Object obj;
        C162457s7.A0J(iterable, 0);
        int i2 = 0;
        if (i >= 0) {
            if (i != 0) {
                if (iterable instanceof Collection) {
                    if (i >= ((Collection) iterable).size()) {
                        return A0F(iterable);
                    }
                    if (i == 1) {
                        obj = A00(iterable);
                        return C18290x4.A12(obj);
                    }
                }
                ArrayList A0I = AnonymousClass002.A0I(i);
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    C18310x6.A1R(A0I, it);
                    i2++;
                    if (i2 == i) {
                        break;
                    }
                }
                int size = A0I.size();
                if (size != 0) {
                    if (size != 1) {
                        return A0I;
                    }
                    obj = A0I.get(0);
                    return C18290x4.A12(obj);
                }
            }
            return C72023d3.A00;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Requested element count ");
        A0o.append(i);
        throw AnonymousClass000.A0F(" is less than zero.", A0o);
    }

    public static final List A0L(Iterable iterable, Comparator comparator) {
        C162457s7.A0J(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return A0F(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C162457s7.A0J(array, 0);
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            List asList = Arrays.asList(array);
            C162457s7.A0D(asList);
            return asList;
        }
        List A0G = A0G(iterable);
        C73753g1.A0a(A0G, comparator);
        return A0G;
    }

    public static final List A0M(Object obj, Collection collection) {
        C162457s7.A0J(collection, 0);
        ArrayList A0I = AnonymousClass002.A0I(collection.size() + 1);
        A0I.addAll(collection);
        A0I.add(obj);
        return A0I;
    }

    public static final List A0N(List list, int i) {
        int size = list.size();
        if (i >= size) {
            return A0F(list);
        }
        if (i == 1) {
            return C18290x4.A12(A05(list));
        }
        ArrayList A0I = AnonymousClass002.A0I(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                A0I.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                C18310x6.A1R(A0I, listIterator);
            }
        }
        return A0I;
    }

    public static final Set A0P(Iterable iterable) {
        Object obj;
        Iterator it;
        C162457s7.A0J(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(AnonymousClass8UG.A0I(collection.size()));
                    A0T(iterable, linkedHashSet);
                    return linkedHashSet;
                } else if (iterable instanceof List) {
                    obj = ((List) iterable).get(0);
                    return C18290x4.A13(obj);
                } else {
                    it = iterable.iterator();
                }
            }
            return C72063d7.A00;
        }
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        A0T(iterable, A17);
        int size2 = A17.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return A17;
            }
            it = A17.iterator();
        }
        return C72063d7.A00;
        obj = it.next();
        return C18290x4.A13(obj);
    }

    public static final Set A0Q(Iterable iterable, Iterable iterable2) {
        C18270x1.A14(iterable, iterable2);
        Set A0O = A0O(iterable);
        C162457s7.A0J(A0O, 0);
        if (!(iterable2 instanceof Collection)) {
            iterable2 = A0F(iterable2);
        }
        A0O.removeAll((Collection) iterable2);
        return A0O;
    }

    public static final AnonymousClass4C5 A0R(Iterable iterable) {
        C162457s7.A0J(iterable, 0);
        return new C626335w(iterable, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r1 <= r11) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        r4.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r11 >= 0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0S(java.lang.Appendable r4, java.lang.CharSequence r5, java.lang.CharSequence r6, java.lang.CharSequence r7, java.lang.CharSequence r8, java.lang.Iterable r9, X.AnonymousClass4GQ r10, int r11) {
        /*
            r3 = 1
            r0 = 2
            X.C18260x0.A0a(r5, r6, r7, r0)
            r0 = 6
            X.C162457s7.A0J(r8, r0)
            r4.append(r6)
            java.util.Iterator r2 = r9.iterator()
            r1 = 0
        L_0x0011:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r2.next()
            int r1 = r1 + 1
            if (r1 <= r3) goto L_0x0022
            r4.append(r5)
        L_0x0022:
            if (r11 < 0) goto L_0x0026
            if (r1 > r11) goto L_0x002c
        L_0x0026:
            X.AnonymousClass2AB.A03(r4, r0, r10)
            goto L_0x0011
        L_0x002a:
            if (r11 < 0) goto L_0x0031
        L_0x002c:
            if (r1 <= r11) goto L_0x0031
            r4.append(r8)
        L_0x0031:
            r4.append(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73723fy.A0S(java.lang.Appendable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, java.lang.Iterable, X.4GQ, int):void");
    }

    public static final boolean A0U(Iterable iterable, Object obj) {
        C162457s7.A0J(iterable, 0);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            int i = 0;
            for (Object next : iterable) {
                if (i < 0) {
                    throw C18280x3.A0X();
                } else if (C162457s7.A0P(obj, next)) {
                    return true;
                } else {
                    i++;
                }
            }
            return false;
        } else if (((List) iterable).indexOf(obj) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static final int[] A0V(Collection collection) {
        C162457s7.A0J(collection, 0);
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = C18280x3.A05(it);
            i++;
        }
        return iArr;
    }

    public static String A0A(CharSequence charSequence, Iterable iterable, AnonymousClass4GQ r9) {
        return A07(charSequence, "", "", "...", iterable, r9, -1);
    }

    public static final HashSet A0B(Iterable iterable) {
        HashSet hashSet = new HashSet(AnonymousClass8UG.A0I(C73783g4.A0b(iterable, 12)));
        A0T(iterable, hashSet);
        return hashSet;
    }

    public static final List A0G(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            C162457s7.A0J(collection, 0);
            return AnonymousClass002.A0J(collection);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        A0T(iterable, A0s);
        return A0s;
    }

    public static List A0H(Iterable iterable, int i) {
        return A0L(iterable, new AnonymousClass4IU(i));
    }

    public static final List A0I(Iterable iterable, int i) {
        ArrayList arrayList;
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i2 = size / i;
            int i3 = 1;
            if (size % i == 0) {
                i3 = 0;
            }
            arrayList = AnonymousClass002.A0I(i2 + i3);
            int i4 = 0;
            while (i4 < size) {
                int i5 = size - i4;
                int i6 = i;
                if (i > i5) {
                    i6 = i5;
                }
                ArrayList A0I = AnonymousClass002.A0I(i6);
                for (int i7 = 0; i7 < i6; i7++) {
                    A0I.add(list.get(i7 + i4));
                }
                arrayList.add(A0I);
                i4 += i;
                if (i4 < 0) {
                    break;
                }
            }
        } else {
            arrayList = AnonymousClass001.A0s();
            Iterator A00 = AnonymousClass2A5.A00(iterable.iterator(), i, i);
            while (A00.hasNext()) {
                C18310x6.A1R(arrayList, A00);
            }
        }
        return arrayList;
    }

    public static final Set A0O(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        A0T(iterable, A17);
        return A17;
    }

    public static final List A0C(Iterable iterable) {
        ArrayList A0r = C18300x5.A0r(iterable);
        for (Object next : iterable) {
            if (next != null) {
                A0r.add(next);
            }
        }
        return A0r;
    }

    public static final List A0K(Iterable iterable, Collection collection) {
        C18260x0.A0O(collection, iterable);
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList A0I = AnonymousClass002.A0I(collection.size() + collection2.size());
            A0I.addAll(collection);
            A0I.addAll(collection2);
            return A0I;
        }
        ArrayList A0J = AnonymousClass002.A0J(collection);
        C73743g0.A0W(iterable, A0J);
        return A0J;
    }

    public static final void A0T(Iterable iterable, Collection collection) {
        for (Object add : iterable) {
            collection.add(add);
        }
    }
}
