package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7pO  reason: invalid class name and case insensitive filesystem */
public class C161297pO {
    public C141326vO A00;
    public C181498mr A01;
    public C151637Vo A02;
    public Boolean A03 = Boolean.FALSE;
    public String A04;

    public C161297pO(C151637Vo r2) {
        this.A02 = r2;
        this.A00 = C141326vO.PATH;
    }

    public static List A00(C158627kI r6, Class cls, List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = ((C161297pO) it.next()).A01.get();
            C187038wL r1 = r6.A01.A00;
            Class<String> cls2 = String.class;
            if (obj instanceof List) {
                for (Object next : r1.Bqo(obj)) {
                    if (next != null) {
                        if (!AnonymousClass6C9.A1N(cls, next)) {
                            if (cls == cls2) {
                                next = next.toString();
                            }
                        }
                        A0s.add(next);
                    }
                }
            } else if (obj != null) {
                if (AnonymousClass6C9.A1N(cls, obj)) {
                    A0s.add(obj);
                } else if (cls == cls2) {
                    AnonymousClass0x7.A1D(obj, A0s);
                }
            }
        }
        return A0s;
    }

    public C161297pO() {
    }

    public C161297pO(String str) {
        this.A04 = str;
        this.A00 = C141326vO.JSON;
    }
}
