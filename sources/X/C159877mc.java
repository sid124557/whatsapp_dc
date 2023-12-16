package X;

import java.util.Iterator;

/* renamed from: X.7mc  reason: invalid class name and case insensitive filesystem */
public class C159877mc {
    public static C160267nL A00 = C160267nL.A06;
    public static final C160377nX A01 = new C160377nX();
    public static final AnonymousClass7TE A02 = new AnonymousClass7TE();

    public static void A00(Appendable appendable, Object obj, C160267nL r7) {
        if (obj == null) {
            appendable.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        C160377nX r3 = A01;
        C183608qJ r2 = (C183608qJ) r3.A01.get(cls);
        if (r2 == null) {
            if (!cls.isArray()) {
                Iterator it = r3.A00.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        r2 = C160377nX.A0A;
                        break;
                    }
                    C148397If r1 = (C148397If) it.next();
                    if (r1.A00.isAssignableFrom(cls)) {
                        r2 = r1.A01;
                        break;
                    }
                }
            } else {
                r2 = C160377nX.A09;
            }
            r3.A01(r2, cls);
        }
        r2.Bsi(appendable, obj, r7);
    }
}
