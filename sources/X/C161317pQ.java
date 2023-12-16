package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7pQ  reason: invalid class name and case insensitive filesystem */
public final class C161317pQ {
    public static final C161317pQ A00 = new C161317pQ();
    public static final Map A01 = AnonymousClass001.A0t();
    public static final Set A02 = AnonymousClass0x9.A17();
    public static final AtomicInteger A03 = AnonymousClass6CA.A0d();
    public static final AtomicReference A04 = new AtomicReference(C141226vE.DEBUG);

    public final synchronized Set A02() {
        return A02;
    }

    public static final void A00() {
        C161317pQ r1 = A00;
        if (C18310x6.A1X(r1.A02())) {
            Set A022 = r1.A02();
            if (!(A022 instanceof Collection) || !A022.isEmpty()) {
                Iterator it = A022.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0g("getEvents");
                }
            }
        }
    }

    public static final void A01(AnonymousClass4GP r7, AnonymousClass4GQ r8) {
        long currentTimeMillis = System.currentTimeMillis();
        C141226vE r1 = C141226vE.DEBUG;
        Object obj = A04.get();
        C162457s7.A0D(obj);
        if (r1.compareTo((C141226vE) obj) >= 0) {
            C161317pQ r12 = A00;
            if (!r12.A02().isEmpty()) {
                Set A022 = r12.A02();
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it = A022.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0g("getEvents");
                } else if (!A0s.isEmpty()) {
                    LinkedHashMap A0r = C18320x8.A0r();
                    r8.invoke(A0r);
                    Object invoke = r7.invoke();
                    C162457s7.A0D(Thread.currentThread().getName());
                    C162457s7.A0J(invoke, 3);
                    AnonymousClass8OR r2 = new AnonymousClass8OR();
                    r2.put("timestamp", Long.valueOf(currentTimeMillis));
                    r2.putAll(A0r);
                    AnonymousClass8UG.A0K(r2);
                    Iterator it2 = A0s.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw AnonymousClass001.A0g("onEvent");
                    }
                }
            }
        }
    }
}
