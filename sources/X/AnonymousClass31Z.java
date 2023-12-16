package X;

import java.util.List;

/* renamed from: X.31Z  reason: invalid class name */
public final class AnonymousClass31Z {
    public static final void A00(Object obj, Object obj2, String str, List list, boolean z, boolean z2) {
        StringBuilder A0l;
        String str2;
        if (!z) {
            if (z2) {
                A0l = AnonymousClass000.A0l(str);
                str2 = " (old!=new, old=null, new=present)";
            } else {
                return;
            }
        } else if (!z2) {
            A0l = AnonymousClass000.A0l(str);
            str2 = " (old!=new, old=present, new=null)";
        } else if (C162457s7.A0P(obj, obj2)) {
            return;
        } else {
            if (!(obj instanceof C130786cX) || !(obj2 instanceof C130786cX)) {
                A0l = AnonymousClass000.A0l(str);
                str2 = " (old!=new)";
            } else {
                int length = ((C170198Cg) obj2).A0F().length - ((C170198Cg) obj).A0F().length;
                A0l = AnonymousClass000.A0l(str);
                A0l.append(" (old!=new, size_delta=");
                A0l.append(length);
                A0l.append(')');
                list.add(A0l.toString());
            }
        }
        A0l.append(str2);
        list.add(A0l.toString());
    }

    public static final void A01(String str, List list, List list2, List list3) {
        if (!list.equals(list2)) {
            int size = list.size();
            int size2 = list2.size();
            StringBuilder A0l = AnonymousClass000.A0l(str);
            if (size != size2) {
                AnonymousClass000.A1H(" (old!=value, old_size=", A0l, list);
                AnonymousClass000.A1H(", new_size=", A0l, list2);
                A0l.append(')');
            } else {
                A0l.append(" (old!=value)");
            }
            list3.add(A0l.toString());
        }
    }
}
