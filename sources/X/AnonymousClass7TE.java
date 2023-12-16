package X;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7TE  reason: invalid class name */
public class AnonymousClass7TE {
    public C153467bN A00;
    public C153467bN A01 = new C175968aA(this);
    public final ConcurrentHashMap A02;

    public C153467bN A00(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.A02;
        C153467bN r0 = (C153467bN) concurrentHashMap.get(cls);
        if (r0 != null) {
            return r0;
        }
        if (cls != null && (Map.class.isAssignableFrom(cls) || List.class.isAssignableFrom(cls))) {
            C175978aB r02 = new C175978aB(cls, this);
            concurrentHashMap.put(cls, r02);
            return r02;
        } else if (cls.isArray()) {
            C175818Zv r03 = new C175818Zv(cls, this);
            concurrentHashMap.putIfAbsent(cls, r03);
            return r03;
        } else if (List.class.isAssignableFrom(cls)) {
            new C175938a7(cls, this);
            throw AnonymousClass000.A0L();
        } else if (Map.class.isAssignableFrom(cls)) {
            new C175948a8(cls, this);
            throw AnonymousClass000.A0L();
        } else {
            new C175928a6(cls, this);
            throw AnonymousClass000.A0L();
        }
    }

    public AnonymousClass7TE() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(100);
        this.A02 = concurrentHashMap;
        concurrentHashMap.put(Date.class, C175828Zw.A00);
        C153467bN r3 = C175988aC.A0C;
        concurrentHashMap.put(int[].class, r3);
        C153467bN r1 = C175988aC.A05;
        concurrentHashMap.put(Integer[].class, r1);
        concurrentHashMap.put(short[].class, r3);
        concurrentHashMap.put(Short[].class, r1);
        concurrentHashMap.put(long[].class, C175988aC.A0D);
        concurrentHashMap.put(Long[].class, C175988aC.A06);
        concurrentHashMap.put(byte[].class, C175988aC.A08);
        concurrentHashMap.put(Byte[].class, C175988aC.A01);
        concurrentHashMap.put(char[].class, C175988aC.A09);
        concurrentHashMap.put(Character[].class, C175988aC.A02);
        concurrentHashMap.put(float[].class, C175988aC.A0B);
        concurrentHashMap.put(Float[].class, C175988aC.A04);
        concurrentHashMap.put(double[].class, C175988aC.A0A);
        concurrentHashMap.put(Double[].class, C175988aC.A03);
        concurrentHashMap.put(boolean[].class, C175988aC.A07);
        concurrentHashMap.put(Boolean[].class, C175988aC.A00);
        C175958a9 r12 = new C175958a9(this);
        this.A00 = r12;
        concurrentHashMap.put(C188538z3.class, r12);
        concurrentHashMap.put(C183568qF.class, this.A00);
        concurrentHashMap.put(AnonymousClass8TO.class, this.A00);
        concurrentHashMap.put(AnonymousClass8TX.class, this.A00);
    }
}
