package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2Wb  reason: invalid class name and case insensitive filesystem */
public class C44442Wb {
    public final Map A00 = AnonymousClass001.A0t();

    public static int A00(C44442Wb r2, String str) {
        AtomicInteger atomicInteger;
        synchronized (r2) {
            Map map = r2.A00;
            atomicInteger = (AtomicInteger) map.get(str);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                map.put(str, atomicInteger);
            }
        }
        return atomicInteger.get();
    }

    public static void A01(C44442Wb r2, String str) {
        AtomicInteger atomicInteger;
        synchronized (r2) {
            Map map = r2.A00;
            atomicInteger = (AtomicInteger) map.get(str);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                map.put(str, atomicInteger);
            }
        }
        atomicInteger.incrementAndGet();
    }
}
