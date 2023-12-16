package X;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7nX  reason: invalid class name and case insensitive filesystem */
public class C160377nX {
    public static final C183608qJ A02 = new AnonymousClass74G(5);
    public static final C183608qJ A03 = new AnonymousClass74G(4);
    public static final C183608qJ A04 = new AnonymousClass74G(2);
    public static final C183608qJ A05 = new AnonymousClass74G(3);
    public static final C183608qJ A06 = new AnonymousClass74G(6);
    public static final C183608qJ A07 = new AnonymousClass74G(1);
    public static final C183608qJ A08 = new AnonymousClass74G(0);
    public static final C183608qJ A09 = new C173318Pd();
    public static final C183608qJ A0A = new C173328Pe();
    public static final C183608qJ A0B = new AnonymousClass74G(7);
    public LinkedList A00 = AnonymousClass0x9.A18();
    public ConcurrentHashMap A01 = AnonymousClass0x9.A1D();

    public void A01(C183608qJ r5, Class... clsArr) {
        for (Class put : clsArr) {
            this.A01.put(put, r5);
        }
    }

    public void A00(Class cls, C183608qJ r4) {
        this.A00.addLast(new C148397If(cls, r4));
    }

    public C160377nX() {
        A01(new AnonymousClass74I(this, 9), String.class);
        A01(new AnonymousClass74I(this, 0), Double.class);
        A01(new AnonymousClass74I(this, 1), Date.class);
        A01(new AnonymousClass74I(this, 2), Float.class);
        C183608qJ r2 = A0B;
        A01(r2, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        A01(r2, Boolean.class);
        A01(new AnonymousClass74I(this, 3), int[].class);
        A01(new AnonymousClass74I(this, 4), short[].class);
        A01(new AnonymousClass74I(this, 5), long[].class);
        A01(new AnonymousClass74I(this, 6), float[].class);
        A01(new AnonymousClass74I(this, 7), double[].class);
        A01(new AnonymousClass74I(this, 8), boolean[].class);
        A00(C188548z4.class, A07);
        A00(C183578qG.class, A08);
        A00(C188538z3.class, A04);
        A00(C183568qF.class, A05);
        A00(Map.class, A06);
        A00(Iterable.class, A03);
        A00(Enum.class, A02);
        A00(Number.class, r2);
    }
}
