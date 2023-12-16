package X;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.5RU  reason: invalid class name */
public final class AnonymousClass5RU {
    public final Set A00;

    public AnonymousClass5RU(Set set) {
        C162457s7.A0J(set, 1);
        this.A00 = set;
    }

    public final int A00(String str) {
        Object obj;
        C162457s7.A0J(str, 0);
        Iterator it = this.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C162457s7.A0P(((C1230366u) obj).B8w(), str)) {
                break;
            }
        }
        C1230366u r1 = (C1230366u) obj;
        if (r1 != null) {
            return r1.BDm();
        }
        return 22;
    }

    public final boolean A02(View view, String str, String str2) {
        C1230366u A01;
        View BEI;
        C162457s7.A0J(view, 0);
        if (str2 == null || (A01 = A01(str, str2)) == null || (BEI = A01.BEI(view)) == null) {
            return false;
        }
        BEI.getParent().requestChildFocus(BEI, BEI);
        if (A01.BIp()) {
            BEI.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass6BO((Object) BEI, 2, (Object) this));
        }
        if (A01.Bo5()) {
            BEI.callOnClick();
        }
        return true;
    }

    public final C1230366u A01(String str, String str2) {
        Object obj;
        Set set = this.A00;
        LinkedHashMap A0r = C18320x8.A0r();
        for (Object next : set) {
            ((List) C18310x6.A0h(((C1230366u) next).BAV(), A0r)).add(next);
        }
        List<C1230366u> list = (List) A0r.get(str);
        if (list == null) {
            return null;
        }
        for (C1230366u r6 : list) {
            if (r6.BIp()) {
                String B8w = r6.B8w();
                if (!C162457s7.A0P(B8w, str2)) {
                    r6 = A01(B8w, str2);
                    if (r6 != null) {
                        return r6;
                    }
                }
            }
            String B8w2 = r6.B8w();
            if (!C162457s7.A0P(B8w2, str2)) {
                String str3 = str2;
                while (true) {
                    Iterator it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (C162457s7.A0P(((C1230366u) obj).B8w(), str3)) {
                            break;
                        }
                    }
                    C1230366u r1 = (C1230366u) obj;
                    if (r1 == null || (str3 = r1.BAV()) == null) {
                        break;
                    } else if (str3.equals(B8w2)) {
                        return r6;
                    }
                }
            } else {
                return r6;
            }
        }
        return null;
    }
}
